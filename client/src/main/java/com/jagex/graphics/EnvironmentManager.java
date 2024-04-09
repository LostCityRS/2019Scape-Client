package com.jagex.graphics;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.skyboxtype.SkyBoxType;
import com.jagex.game.scene.World;
import com.jagex.js5.Js5;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("xu")
public class EnvironmentManager {

	@ObfuscatedName("xu.e")
	public static int samplerMaterial = -1;

	@ObfuscatedName("xu.n")
	public static EnvironmentSampler sampler;

	@ObfuscatedName("xu.m")
	public static SkyBox skybox;

	@ObfuscatedName("xu.k")
	public static int field7835 = 5047;

	@ObfuscatedName("xu.f")
	public final Toolkit toolkit;

	@ObfuscatedName("xu.w")
	public final Environment[][] environmentMap;

	@ObfuscatedName("xu.l")
	public int field7837 = 0;

	@ObfuscatedName("xu.u")
	public int field7838 = -1;

	@ObfuscatedName("xu.z")
	public long field7839 = 0L;

	@ObfuscatedName("xu.p")
	public boolean resetFade = false;

	@ObfuscatedName("xu.d")
	public final Environment defaultEnv;

	@ObfuscatedName("xu.c")
	public final Environment currentEnv;

	@ObfuscatedName("xu.r")
	public final Environment fadeEnvA;

	@ObfuscatedName("xu.v")
	public final Environment fadeEnvB;

	@ObfuscatedName("xu.o")
	public Environment overrideEnv;

	@ObfuscatedName("xu.s")
	public EnvironmentOverride override;

	@ObfuscatedName("xu.y")
	public final Vector3 sunDirection = new Vector3(-50.0F, -60.0F, -50.0F);

	@ObfuscatedName("xu.q")
	public final SoftLruHashTable samplerCache = new SoftLruHashTable(8);

	@ObfuscatedName("xu.x")
	public final SoftLruHashTable skyboxCache = new SoftLruHashTable(8);

	@ObfuscatedName("xu.b")
	public final SoftLruHashTable colourRemappingCache = new SoftLruHashTable(8);

	@ObfuscatedName("xu.h")
	public final Js5 spriteArchive;

	@ObfuscatedName("xu.a")
	public boolean overrideColourRemapping = false;

	@ObfuscatedName("xu.g")
	public int[] overrideColourRemappingMap = new int[] { -1, -1, -1 };

	@ObfuscatedName("xu.i")
	public float[] overrideColourRemappingWeight = new float[] { 0.0F, 0.0F, 0.0F };

	@ObfuscatedName("xu.j")
	public boolean overrideLevels = false;

	@ObfuscatedName("xu.t")
	public float overrideLevelsGamma;

	@ObfuscatedName("xu.ae")
	public float overrideLevelsInputMin;

	@ObfuscatedName("xu.ag")
	public float overrideLevelsInputMax;

	@ObfuscatedName("xu.ah")
	public float overrideLevelsOutputMin;

	@ObfuscatedName("xu.al")
	public float field7860;

	public EnvironmentManager(Toolkit arg0, Js5 arg1, int arg2, int arg3) {
		this.toolkit = arg0;
		this.spriteArchive = arg1;
		this.environmentMap = new Environment[arg2][arg3];
		if (samplerMaterial != -1) {
			sampler = this.createEnvironmentSampler(samplerMaterial);
		}
		skybox = null;
		this.defaultEnv = new Environment();
		this.currentEnv = new Environment();
		this.fadeEnvA = new Environment();
		this.fadeEnvB = new Environment();
		this.resetFade();
		this.resetOverrideColourRemapping();
		this.resetOverrideLevels();
	}

	@ObfuscatedName("xu.e(Lrl;B)V")
	public void updatePartial(World arg0) {
		Environment var2 = this.computeTargetEnvironment(arg0);
		if (this.override == null) {
			this.fadeEnvironment(var2, field7835);
		} else {
			this.overrideEnv.setTo(var2);
			this.overrideEnv.applyOverride(this, this.override);
			this.fadeEnvironment(this.overrideEnv, this.override.getFadeDuration());
		}
		this.updateFade();
		this.updateSun();
		this.updateFog();
	}

	@ObfuscatedName("xu.n(Lrl;B)V")
	public void updateFull(World arg0) {
		Environment var2 = this.computeTargetEnvironment(arg0);
		if (this.override == null) {
			this.fadeEnvironment(var2, field7835);
		} else {
			this.overrideEnv.setTo(var2);
			this.overrideEnv.applyOverride(this, this.override);
			this.fadeEnvironment(this.overrideEnv, this.override.getFadeDuration());
		}
		this.updateFade();
		this.updateBloom();
		this.updateLevels();
		this.updateColourRemapping();
	}

	@ObfuscatedName("xu.m(Lrl;Lyj;II)V")
	public void setOverride(World arg0, EnvironmentOverride arg1, int arg2) {
		this.override = arg1;
		Environment var4 = this.computeTargetEnvironment(arg0);
		if (this.override == null) {
			this.fadeEnvironment(var4, arg2);
			this.overrideEnv = null;
			return;
		}
		if (this.overrideEnv == null) {
			this.overrideEnv = new Environment();
		}
		this.overrideEnv.setTo(var4);
		this.overrideEnv.applyOverride(this, this.override);
		this.fadeEnvironment(this.overrideEnv, arg2);
	}

	@ObfuscatedName("xu.k(I)Lyj;")
	public EnvironmentOverride getOverride() {
		return this.override;
	}

	@ObfuscatedName("xu.f(I)Lxv;")
	public Environment getCurrentEnv() {
		return this.currentEnv;
	}

	@ObfuscatedName("xu.w(Lxu;I)V")
	public void method9992(EnvironmentManager arg0) {
		this.currentEnv.setTo(arg0.currentEnv);
		this.fadeEnvA.setTo(arg0.fadeEnvA);
		this.fadeEnvB.setTo(arg0.fadeEnvB);
		this.field7839 = arg0.field7839;
		this.field7837 = arg0.field7837;
		this.field7838 = arg0.field7838;
	}

	@ObfuscatedName("xu.l(I)V")
	public void cacheReset() {
		this.samplerCache.reset();
		this.skyboxCache.reset();
		this.colourRemappingCache.reset();
	}

	@ObfuscatedName("xu.u(II)Ldz;")
	public EnvironmentSampler createEnvironmentSampler(int arg0) {
		EnvironmentSampler var2 = (EnvironmentSampler) this.samplerCache.get((long) arg0);
		if (var2 == null) {
			EnvironmentSampler var3 = this.toolkit.createEnvironmentSampler(arg0);
			this.samplerCache.put(var3, (long) arg0);
			return var3;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("xu.z(IIIII)Lsv;")
	public SkyBox createSkybox(int arg0, int arg1, int arg2, int arg3) {
		long var5 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		SkyBox var7 = (SkyBox) this.skyboxCache.get(var5);
		if (var7 == null) {
			var7 = SkyBoxType.method305(arg0, arg1, arg2, arg3, Client.skyBoxTypeList, Client.skyDecorTypeList);
			this.skyboxCache.put(var7, var5);
		}
		return var7;
	}

	@ObfuscatedName("xu.p(IB)Lcj;")
	public ColourRemapper createColourRemapper(int arg0) {
		ColourRemapper var2 = (ColourRemapper) this.colourRemappingCache.get((long) arg0);
		if (var2 != null) {
			return var2;
		}
		SpriteData var3 = SpriteDataProvider.get(this.spriteArchive, arg0);
		if (var3 != null && var3.getWidth() == 256 && var3.getHeight() == 16) {
			int[] var4 = var3.method2604(false);
			var2 = this.toolkit.createColourRemapper(var4);
			if (var2 != null) {
				this.colourRemappingCache.put(var2, (long) arg0);
			}
		}
		return var2;
	}

	@ObfuscatedName("xu.d(IILxv;I)V")
	public void setEnvironmentMap(int arg0, int arg1, Environment arg2) {
		this.environmentMap[arg0][arg1] = arg2;
	}

	@ObfuscatedName("xu.c(B)V")
	public void clearEnvironmentMap() {
		for (int var1 = 0; var1 < this.environmentMap.length; var1++) {
			for (int var2 = 0; var2 < this.environmentMap[var1].length; var2++) {
				this.environmentMap[var1][var2] = this.defaultEnv;
			}
		}
	}

	@ObfuscatedName("xu.r(III)V")
	public void method9991(int arg0, int arg1) {
		Environment var3 = this.environmentMap[arg0][arg1];
		if (var3 != null) {
			this.sunDirection.setTo(var3.sunDirection);
		}
		this.updateSun();
	}

	@ObfuscatedName("xu.v(Lrl;I)Lxv;")
	public Environment computeTargetEnvironment(World arg0) {
		Object var2 = null;
		int var3 = -1;
		int var4 = -1;
		if (Client.isStateTitle(Client.state) || Client.isStateLobby(Client.state)) {
			var3 = Client.cameraX >> 12;
			var4 = Client.cameraZ >> 12;
		} else {
			if (Client.localPlayerEntity != null) {
				var3 = Client.localPlayerEntity.routeWaypointX[0] >> 3;
				var4 = Client.localPlayerEntity.routeWaypointZ[0] >> 3;
			}
			if (var3 < 0 || var3 >= arg0.getSizeX() >> 3 || var4 < 0 || var4 >= arg0.getSizeZ() >> 3) {
				var3 = arg0.getSizeX() >> 4;
				var4 = arg0.getSizeZ() >> 4;
			}
		}
		Environment var5 = this.environmentMap[var3][var4];
		if (var5 == null) {
			var5 = this.defaultEnv;
		}
		return var5;
	}

	@ObfuscatedName("xu.o(Lxv;II)V")
	public void fadeEnvironment(Environment arg0, int arg1) {
		if (this.resetFade) {
			this.resetFade = false;
			arg1 = 0;
		}
		if (this.fadeEnvB.equal(arg0)) {
			return;
		}
		this.fadeEnvB.setTo(arg0);
		this.field7839 = MonotonicTime.get();
		this.field7837 = this.field7838 = arg1;
		if (this.field7837 == 0) {
			return;
		}
		this.fadeEnvA.setTo(this.currentEnv);
		if (this.currentEnv.skybox == null) {
			return;
		}
		if (this.currentEnv.skybox.method7960()) {
			this.currentEnv.skybox = this.fadeEnvA.skybox = this.currentEnv.skybox.method7942();
		}
		if (this.currentEnv.skybox != null && this.fadeEnvB.skybox != this.currentEnv.skybox) {
			this.currentEnv.skybox.method7962(this.fadeEnvB.skybox);
		}
	}

	@ObfuscatedName("xu.s(I)V")
	public void updateFade() {
		if (this.field7838 < 0) {
			return;
		}
		long var1 = MonotonicTime.get();
		this.field7838 = (int) ((long) (this.field7838) - (var1 - this.field7839));
		if (this.field7838 > 0) {
			this.currentEnv.setToInterpolation(this.toolkit, this.fadeEnvA, this.fadeEnvB, (float) (this.field7837 - this.field7838) / (float) this.field7837);
		} else {
			this.currentEnv.setTo(this.fadeEnvB);
			if (this.currentEnv.skybox != null) {
				this.currentEnv.skybox.method7958();
			}
			this.field7838 = -1;
		}
		this.field7839 = var1;
	}

	@ObfuscatedName("xu.y(I)V")
	public void resetFade() {
		this.resetFade = true;
	}

	@ObfuscatedName("xu.q(I)V")
	public void updateSun() {
		this.toolkit.setSunAmbientIntensity(((float) Client.preferences.brightness.getValue() * 0.1F + 0.7F + Client.world.getAntiMacroBrightnessAdjustment()) * this.currentEnv.sunAmbientIntensity);
		this.toolkit.setSun(this.currentEnv.sunColour, this.currentEnv.sunDiffuseIntensity, this.currentEnv.sunShadowIntensity, (float) ((int) this.sunDirection.x << 2), (float) ((int) this.sunDirection.y << 2), (float) ((int) this.sunDirection.z << 2));
		this.toolkit.setEnvironmentSampler(this.currentEnv.sampler);
	}

	@ObfuscatedName("xu.x(FFFIIIIII)V")
	public void setLighting(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.toolkit.setSunAmbientIntensity(((float) Client.preferences.brightness.getValue() * 0.1F + 0.7F + Client.world.getAntiMacroBrightnessAdjustment()) * arg0);
		this.toolkit.setSun(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.toolkit.setEnvironmentSampler(this.createEnvironmentSampler(arg7));
	}

	@ObfuscatedName("xu.b(I)V")
	public void updateFog() {
		byte var1 = 0;
		int var2 = (this.currentEnv.fogDepth + 256 << 2) + var1;
		this.toolkit.setFog(this.currentEnv.fogColour, Client.preferences.fog.getValue() == 1 ? var2 : -1, 0);
	}

	@ObfuscatedName("xu.h(I)V")
	public void updateBloom() {
		this.toolkit.setBloom(this.currentEnv.bloomThreshold, this.currentEnv.bloomWhitePointSq, this.currentEnv.bloomIntensity);
	}

	@ObfuscatedName("xu.a(I)V")
	public void updateLevels() {
		if (!this.toolkit.isLevelsEnabled()) {
			return;
		}
		if (this.overrideLevels) {
			this.toolkit.setLevels(this.overrideLevelsGamma, this.overrideLevelsInputMin, this.overrideLevelsInputMax, this.overrideLevelsOutputMin, this.field7860);
		} else {
			this.toolkit.setLevels(this.currentEnv.levelsGamma, this.currentEnv.levelsInputMin, this.currentEnv.levelsInputMax, this.currentEnv.levelsOutputMin, this.currentEnv.levelsOutputMax);
		}
	}

	@ObfuscatedName("xu.g(B)V")
	public void resetOverrideLevels() {
		this.overrideLevels = false;
		this.overrideLevelsGamma = 1.0F;
		this.overrideLevelsInputMin = 0.0F;
		this.overrideLevelsInputMax = 1.0F;
		this.overrideLevelsOutputMin = 0.0F;
		this.field7860 = 1.0F;
	}

	@ObfuscatedName("xu.i(B)V")
	public void updateColourRemapping() {
		if (!this.toolkit.method2238()) {
			return;
		}
		ColourRemapper var1 = null;
		ColourRemapper var2 = null;
		ColourRemapper var3 = null;
		if (!this.overrideColourRemapping) {
			if (this.currentEnv.colourRemappingMap[0] > -1) {
				var1 = this.createColourRemapper(this.currentEnv.colourRemappingMap[0]);
			}
			if (this.currentEnv.colourRemappingMap[1] > -1) {
				var2 = this.createColourRemapper(this.currentEnv.colourRemappingMap[1]);
			}
			if (this.currentEnv.colourRemappingMap[2] > -1) {
				var3 = this.createColourRemapper(this.currentEnv.colourRemappingMap[2]);
			}
			this.toolkit.setColourRemapping(var1, this.currentEnv.colourRemappingWeight[0], var2, this.currentEnv.colourRemappingWeight[1], var3, this.currentEnv.colourRemappingWeight[2]);
			return;
		}
		if (this.overrideColourRemappingMap[0] > -1) {
			var1 = this.createColourRemapper(this.overrideColourRemappingMap[0]);
		}
		if (this.overrideColourRemappingMap[1] > -1) {
			var2 = this.createColourRemapper(this.overrideColourRemappingMap[1]);
		}
		if (this.overrideColourRemappingMap[2] > -1) {
			var3 = this.createColourRemapper(this.overrideColourRemappingMap[2]);
		}
		this.toolkit.setColourRemapping(var1, this.overrideColourRemappingWeight[0], var2, this.overrideColourRemappingWeight[1], var3, this.overrideColourRemappingWeight[2]);
	}

	@ObfuscatedName("xu.j(I)V")
	public void resetOverrideColourRemapping() {
		this.overrideColourRemapping = false;
		int[] var1 = this.overrideColourRemappingMap;
		int[] var2 = this.overrideColourRemappingMap;
		this.overrideColourRemappingMap[2] = -1;
		var2[1] = -1;
		var1[0] = -1;
		float[] var3 = this.overrideColourRemappingWeight;
		float[] var4 = this.overrideColourRemappingWeight;
		this.overrideColourRemappingWeight[2] = 0.0F;
		var4[1] = 0.0F;
		var3[0] = 0.0F;
	}

	@ObfuscatedName("xu.t(I)V")
	public void setLightingInterface() {
		this.toolkit.setSunAmbientIntensity(((float) Client.preferences.brightness.getValue() * 0.1F + 0.7F + Client.world.getAntiMacroBrightnessAdjustment()) * 1.1523438F);
		this.toolkit.setSun(0xffffff, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.toolkit.setFog(0xc8c0a8, -1, 0);
		this.toolkit.setEnvironmentSampler(sampler);
	}
}
