package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Algorithms;
import com.jagex.core.utils.ColourUtils;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("xv")
public class Environment {

	@ObfuscatedName("xv.e")
	public int sunColour;

	@ObfuscatedName("xv.n")
	public float sunAmbientIntensity;

	@ObfuscatedName("xv.m")
	public float sunDiffuseIntensity;

	@ObfuscatedName("xv.k")
	public float sunShadowIntensity;

	@ObfuscatedName("xv.f")
	public Vector3 sunDirection;

	@ObfuscatedName("xv.w")
	public int fogColour;

	@ObfuscatedName("xv.l")
	public int fogDepth;

	@ObfuscatedName("xv.u")
	public EnvironmentSampler sampler;

	@ObfuscatedName("xv.z")
	public float bloomWhitePointSq;

	@ObfuscatedName("xv.p")
	public float bloomIntensity;

	@ObfuscatedName("xv.d")
	public float bloomThreshold;

	@ObfuscatedName("xv.c")
	public SkyBox skybox;

	@ObfuscatedName("xv.r")
	public float levelsGamma = 1.0F;

	@ObfuscatedName("xv.v")
	public float levelsInputMin = 0.0F;

	@ObfuscatedName("xv.o")
	public float levelsInputMax = 1.0F;

	@ObfuscatedName("xv.s")
	public float levelsOutputMin = 0.0F;

	@ObfuscatedName("xv.y")
	public float levelsOutputMax = 1.0F;

	@ObfuscatedName("xv.q")
	public int[] colourRemappingMap = new int[] { -1, -1, -1 };

	@ObfuscatedName("xv.x")
	public float[] colourRemappingWeight = new float[] { 0.0F, 0.0F, 0.0F };

	public Environment() {
		this.method10077();
	}

	public Environment(Packet arg0, EnvironmentManager arg1) {
		this.decode(arg0, arg1);
	}

	@ObfuscatedName("xv.e(B)V")
	public void method10077() {
		this.sunColour = 0xffffff;
		this.sunDirection = Vector3.create(-50.0F, -60.0F, -50.0F);
		this.sunAmbientIntensity = 1.1523438F;
		this.sunDiffuseIntensity = 0.69921875F;
		this.sunShadowIntensity = 1.2F;
		this.fogColour = 0xc8c0a8;
		this.fogDepth = 0;
		this.sampler = EnvironmentManager.sampler;
		this.bloomWhitePointSq = 1.0F;
		this.bloomIntensity = 0.25F;
		this.bloomThreshold = 1.0F;
		this.skybox = EnvironmentManager.skybox;
		this.levelsGamma = 1.0F;
		this.levelsInputMin = 0.0F;
		this.levelsInputMax = 1.0F;
		this.levelsOutputMin = 0.0F;
		this.levelsOutputMax = 1.0F;

		int[] var1 = this.colourRemappingMap;
		int[] var2 = this.colourRemappingMap;
		this.colourRemappingMap[2] = -1;
		var2[1] = -1;
		var1[0] = -1;

		float[] var3 = this.colourRemappingWeight;
		float[] var4 = this.colourRemappingWeight;
		this.colourRemappingWeight[2] = 0.0F;
		var4[1] = 0.0F;
		var3[0] = 0.0F;
	}

	@ObfuscatedName("xv.n(Lxv;B)V")
	public void setTo(Environment env) {
		this.sunColour = env.sunColour;
		this.sunAmbientIntensity = env.sunAmbientIntensity;
		this.sunDiffuseIntensity = env.sunDiffuseIntensity;
		this.sunShadowIntensity = env.sunShadowIntensity;
		this.sunDirection.setTo(env.sunDirection);
		this.fogColour = env.fogColour;
		this.fogDepth = env.fogDepth;
		this.sampler = env.sampler;
		this.bloomWhitePointSq = env.bloomWhitePointSq;
		this.bloomIntensity = env.bloomIntensity;
		this.bloomThreshold = env.bloomThreshold;
		this.skybox = env.skybox;
		this.levelsGamma = env.levelsGamma;
		this.levelsInputMin = env.levelsInputMin;
		this.levelsInputMax = env.levelsInputMax;
		this.levelsOutputMin = env.levelsOutputMin;
		this.levelsOutputMax = env.levelsOutputMax;
		this.colourRemappingMap[0] = env.colourRemappingMap[0];
		this.colourRemappingMap[1] = env.colourRemappingMap[1];
		this.colourRemappingMap[2] = env.colourRemappingMap[2];
		this.colourRemappingWeight[0] = env.colourRemappingWeight[0];
		this.colourRemappingWeight[1] = env.colourRemappingWeight[1];
		this.colourRemappingWeight[2] = env.colourRemappingWeight[2];
	}

	@ObfuscatedName("xv.m(Ldh;Lxv;Lxv;FI)V")
	public void setToInterpolation(Toolkit arg0, Environment arg1, Environment arg2, float arg3) {
		this.sunColour = ColourUtils.interpolateColours(arg1.sunColour, arg2.sunColour, arg3 * 255.0F);
		this.sunDiffuseIntensity = (arg2.sunDiffuseIntensity - arg1.sunDiffuseIntensity) * arg3 + arg1.sunDiffuseIntensity;
		this.sunShadowIntensity = (arg2.sunShadowIntensity - arg1.sunShadowIntensity) * arg3 + arg1.sunShadowIntensity;
		this.sunAmbientIntensity = (arg2.sunAmbientIntensity - arg1.sunAmbientIntensity) * arg3 + arg1.sunAmbientIntensity;
		this.bloomThreshold = (arg2.bloomThreshold - arg1.bloomThreshold) * arg3 + arg1.bloomThreshold;
		this.bloomWhitePointSq = (arg2.bloomWhitePointSq - arg1.bloomWhitePointSq) * arg3 + arg1.bloomWhitePointSq;
		this.bloomIntensity = (arg2.bloomIntensity - arg1.bloomIntensity) * arg3 + arg1.bloomIntensity;
		this.fogColour = ColourUtils.interpolateColours(arg1.fogColour, arg2.fogColour, arg3 * 255.0F);
		this.fogDepth = (int) ((float) (arg2.fogDepth - arg1.fogDepth) * arg3 + (float) arg1.fogDepth);
		if (arg1.sampler != arg2.sampler) {
			this.sampler = arg0.method2435(arg1.sampler, arg2.sampler, arg3, this.sampler);
		}
		if (arg1.skybox != arg2.skybox) {
			if (arg1.skybox == null) {
				this.skybox = arg2.skybox;
				if (this.skybox != null) {
					this.skybox.method7941((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.skybox = arg1.skybox;
				if (this.skybox != null) {
					this.skybox.method7941((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.levelsGamma = (arg2.levelsGamma - arg1.levelsGamma) * arg3 + arg1.levelsGamma;
		this.levelsInputMin = (arg2.levelsInputMin - arg1.levelsInputMin) * arg3 + arg1.levelsInputMin;
		this.levelsInputMax = (arg2.levelsInputMax - arg1.levelsInputMax) * arg3 + arg1.levelsInputMax;
		this.levelsOutputMin = (arg2.levelsOutputMin - arg1.levelsOutputMin) * arg3 + arg1.levelsOutputMin;
		this.levelsOutputMax = (arg2.levelsOutputMax - arg1.levelsOutputMax) * arg3 + arg1.levelsOutputMax;
		float var5 = arg1.colourRemappingWeight[1] + arg1.colourRemappingWeight[0] + arg1.colourRemappingWeight[2];
		float var6 = arg2.colourRemappingWeight[0] + arg2.colourRemappingWeight[1] + arg2.colourRemappingWeight[2];
		float var7 = (var6 - var5) * arg3 + var5;
		if (var7 == 0.0F) {
			int[] var8 = this.colourRemappingMap;
			int[] var9 = this.colourRemappingMap;
			this.colourRemappingMap[2] = -1;
			var9[1] = -1;
			var8[0] = -1;

			float[] var10 = this.colourRemappingWeight;
			float[] var11 = this.colourRemappingWeight;
			this.colourRemappingWeight[2] = 0.0F;
			var11[1] = 0.0F;
			var10[0] = 0.0F;
		} else if (arg1.colourRemappingMap[0] == -1 && arg1.colourRemappingMap[1] == -1 && arg1.colourRemappingMap[2] == -1) {
			for (int var12 = 0; var12 < 3; var12++) {
				this.colourRemappingMap[var12] = arg2.colourRemappingMap[var12];
				if (this.colourRemappingMap[var12] == -1) {
					this.colourRemappingWeight[var12] = 0.0F;
				} else {
					this.colourRemappingWeight[var12] = arg2.colourRemappingWeight[var12] * arg3;
				}
			}
		} else if (arg2.colourRemappingMap[0] == -1 && arg2.colourRemappingMap[1] == -1 && arg2.colourRemappingMap[2] == -1) {
			for (int var13 = 0; var13 < 3; var13++) {
				this.colourRemappingMap[var13] = arg1.colourRemappingMap[var13];
				if (this.colourRemappingMap[var13] == -1) {
					this.colourRemappingWeight[var13] = 0.0F;
				} else {
					this.colourRemappingWeight[var13] = (1.0F - arg3) * arg1.colourRemappingWeight[var13];
				}
			}
		} else {
			float var14 = 1.0F - arg3;
			int var15 = 0;
			int[] var16 = new int[] { -1, -1, -1, -1, -1, -1 };
			float[] var17 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int var18 = 0; var18 < 3; var18++) {
				if (arg1.colourRemappingMap[var18] > -1) {
					var16[var15] = arg1.colourRemappingMap[var18];
					var17[var15++] = arg1.colourRemappingWeight[var18] * var14;
				}
			}
			int var19 = var15;
			for (int var20 = 0; var20 < 3; var20++) {
				if (arg2.colourRemappingMap[var20] > -1) {
					float var21 = arg2.colourRemappingWeight[var20] * arg3;
					for (int var22 = 0; var22 < var19; var22++) {
						if (arg2.colourRemappingMap[var20] == var16[var22]) {
							var17[var22] += var21;
							break;
						}
						if (var19 - 1 == var22) {
							var16[var15] = arg2.colourRemappingMap[var20];
							var17[var15++] = var21;
						}
					}
				}
			}
			if (var15 > 3) {
				float var23 = 0.0F;
				float var24 = 0.0F;
				for (int var25 = 0; var25 < var15; var25++) {
					var23 += var17[var25];
				}
				Algorithms.method228(var17, var16, 0, var15 - 1);
				for (int var26 = 0; var26 < 3; var26++) {
					var24 += var17[var26];
				}
				float var27 = var23 / var24;
				for (int var28 = 0; var28 < 3; var28++) {
					var17[var28] *= var27;
				}
			}
			for (int var29 = 0; var29 < 3; var29++) {
				this.colourRemappingMap[var29] = var16[var29];
				this.colourRemappingWeight[var29] = var17[var29];
			}
		}
	}

	@ObfuscatedName("xv.k(Lalw;Lxu;B)V")
	public void decode(Packet buf, EnvironmentManager manager) {
		int var3 = buf.g1();
		if (Client.preferences.lightingDetail.getValue() == 1 && Client.toolkit.getMaxLights() > 0) {
			if ((var3 & EnvironmentProperty.field8143.field8144) == 0) {
				this.sunColour = 16777215;
			} else {
				this.sunColour = buf.g4s();
			}
			if ((var3 & EnvironmentProperty.field8139.field8144) == 0) {
				this.sunAmbientIntensity = 1.1523438F;
			} else {
				this.sunAmbientIntensity = (float) buf.g2() / 256.0F;
			}
			if ((var3 & EnvironmentProperty.field8138.field8144) == 0) {
				this.sunDiffuseIntensity = 0.69921875F;
			} else {
				this.sunDiffuseIntensity = (float) buf.g2() / 256.0F;
			}
			if ((var3 & EnvironmentProperty.field8137.field8144) == 0) {
				this.sunShadowIntensity = 1.2F;
			} else {
				this.sunShadowIntensity = (float) buf.g2() / 256.0F;
			}
		} else {
			if ((var3 & EnvironmentProperty.field8143.field8144) != 0) {
				buf.g4s();
			}
			if ((var3 & EnvironmentProperty.field8139.field8144) != 0) {
				buf.g2();
			}
			if ((var3 & EnvironmentProperty.field8138.field8144) != 0) {
				buf.g2();
			}
			if ((var3 & EnvironmentProperty.field8137.field8144) != 0) {
				buf.g2();
			}
			this.sunColour = 16777215;
			this.sunShadowIntensity = 1.2F;
			this.sunDiffuseIntensity = 0.69921875F;
			this.sunAmbientIntensity = 1.1523438F;
		}
		if ((var3 & EnvironmentProperty.field8140.field8144) == 0) {
			this.sunDirection = Vector3.create(-50.0F, -60.0F, -50.0F);
		} else {
			this.sunDirection = Vector3.create((float) buf.g2s(), (float) buf.g2s(), (float) buf.g2s());
		}
		if ((var3 & EnvironmentProperty.field8141.field8144) == 0) {
			this.fogColour = 13156520;
		} else {
			this.fogColour = buf.g4s();
		}
		if ((var3 & EnvironmentProperty.field8142.field8144) == 0) {
			this.fogDepth = 0;
		} else {
			this.fogDepth = buf.g2();
		}
		if ((var3 & EnvironmentProperty.field8136.field8144) == 0) {
			this.sampler = EnvironmentManager.sampler;
		} else {
			int var4 = buf.g2();
			this.sampler = manager.createEnvironmentSampler(var4);
		}
	}

	@ObfuscatedName("xv.f(Lalw;I)V")
	public void decodeBloom(Packet buf) {
		this.bloomWhitePointSq = buf.gFloat();
		this.bloomIntensity = buf.gFloat();
		this.bloomThreshold = buf.gFloat();
	}

	@ObfuscatedName("xv.w(Lalw;I)V")
	public void decodeColourRemapping(Packet buf) {
		this.decodeColourRemapping(buf, 0);
	}

	@ObfuscatedName("xv.l(Lalw;II)V")
	public void decodeColourRemapping(Packet buf, int arg1) {
		this.colourRemappingMap[arg1] = buf.g2();
		this.colourRemappingWeight[arg1] = buf.gFloat();
	}

	@ObfuscatedName("xv.u(Lalw;Lxu;I)V")
	public void decodeSkybox(Packet buf, EnvironmentManager manager) {
		int var3 = buf.g2();
		int var4 = buf.g2s();
		int var5 = buf.g2s();
		int var6 = buf.g2s();
		int var7 = buf.g2();
		Client.field3023 = var7;
		this.skybox = manager.createSkybox(var3, var4, var5, var6);
	}

	@ObfuscatedName("xv.z(Lxv;I)Z")
	public boolean equal(Environment env) {
		return this.sunColour == env.sunColour && this.sunAmbientIntensity == env.sunAmbientIntensity && this.sunDiffuseIntensity == env.sunDiffuseIntensity && this.sunShadowIntensity == env.sunShadowIntensity && this.bloomIntensity == env.bloomIntensity && this.bloomWhitePointSq == env.bloomWhitePointSq && this.bloomThreshold == env.bloomThreshold && this.fogColour == env.fogColour && this.fogDepth == env.fogDepth && this.sampler == env.sampler && this.skybox == env.skybox && this.levelsGamma == env.levelsGamma && this.levelsInputMin == env.levelsInputMin && this.levelsInputMax == env.levelsInputMax && this.levelsOutputMin == env.levelsOutputMin && this.levelsOutputMax == env.levelsOutputMax && this.colourRemappingMap[0] == env.colourRemappingMap[0] && this.colourRemappingMap[1] == env.colourRemappingMap[1] && this.colourRemappingMap[2] == env.colourRemappingMap[2] && this.colourRemappingWeight[0] == env.colourRemappingWeight[0] && this.colourRemappingWeight[1] == env.colourRemappingWeight[1] && this.colourRemappingWeight[2] == env.colourRemappingWeight[2];
	}

	@ObfuscatedName("xv.p(Lxu;Lyj;I)V")
	public void applyOverride(EnvironmentManager manager, EnvironmentOverride override) {
		if (Client.preferences.lightingDetail.getValue() == 1 && Client.toolkit.getMaxLights() > 0) {
			if (override.getSunColour() != -1) {
				this.sunColour = override.getSunColour();
			}
			if (override.getSunAmbientIntensity() != -1.0F) {
				this.sunAmbientIntensity = override.getSunAmbientIntensity();
			}
			if (override.getSunDiffiseIntensity() != -1.0F) {
				this.sunDiffuseIntensity = override.getSunDiffiseIntensity();
			}
			if (override.getSunShadowIntensity() != -1.0F) {
				this.sunShadowIntensity = override.getSunShadowIntensity();
			}
		}
		if (override.getSunDirection() != null) {
			this.sunDirection.setTo(override.getSunDirection());
		}
		if (override.getFogColour() != -1) {
			this.fogColour = override.getFogColour();
		}
		if (override.getFogDepth() != -1) {
			this.fogDepth = override.getFogDepth();
		}
		if (override.getBloomItensity() != -1.0F) {
			this.bloomIntensity = override.getBloomItensity();
		}
		if (override.getBloomThreshold() != -1.0F) {
			this.bloomThreshold = override.getBloomThreshold();
		}
		if (override.getBloomWhitePointSq() != -1.0F) {
			this.bloomWhitePointSq = override.getBloomWhitePointSq();
		}
		if (override.getSampler() != -1) {
			this.sampler = manager.createEnvironmentSampler(override.getSampler());
		}
		if (override.method10390() != -1) {
			int var3 = override.method10390();
			int var4 = override.method10391();
			int var5 = override.method10430();
			int var6 = override.method10393();
			int var7 = override.method10394();
			Client.field3023 = var7;
			this.skybox = manager.createSkybox(var3, var4, var5, var6);
		}
		if (override.getColourRemappingMap(0) != -1) {
			this.colourRemappingMap[0] = override.getColourRemappingMap(0);
			this.colourRemappingWeight[0] = override.method10378(0);
		}
		if (override.getColourRemappingMap(1) != -1) {
			this.colourRemappingMap[1] = override.getColourRemappingMap(1);
			this.colourRemappingWeight[1] = override.method10378(1);
		}
		if (override.getColourRemappingMap(2) != -1) {
			this.colourRemappingMap[2] = override.getColourRemappingMap(2);
			this.colourRemappingWeight[2] = override.method10378(2);
		}
	}

	@ObfuscatedName("xv.d(S)I")
	public int getFogColour() {
		return this.fogColour;
	}

	@ObfuscatedName("xv.c(I)Lsv;")
	public SkyBox getSkybox() {
		return this.skybox;
	}
}
