package com.jagex.game.clientoptions;

import com.jagex.core.constants.BuildAreaSize;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ClientAutoSetupResult;
import com.jagex.game.client.CpuProfiling;
import com.jagex.game.client.FileOnDisk;
import com.jagex.game.client.GameShell;
import com.jagex.graphics.GraphicsPacketQueue;
import com.jagex.graphics.RendererInfo;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.IOException;

@ObfuscatedName("aq")
public class Preferences {

	@ObfuscatedName("aq.p")
	public static boolean field786 = false;

	@ObfuscatedName("aq.d")
	public static boolean field788 = false;

	@ObfuscatedName("aq.c")
	public static boolean field777 = false;

	@ObfuscatedName("aml.r")
	public static int field11775;

	public Preferences() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pd.e(I)Lali;")
	public static ClientOptions method6822() {
		FileOnDisk var0 = null;
		ClientOptions var1 = new ClientOptions(Client.modegame, 0);
		try {
			var0 = GameShell.openPrefs("", Client.modegame.titleURL, false);
			byte[] var2 = new byte[(int) var0.length()];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}
			var1 = new ClientOptions(new Packet(var2), Client.modegame, 0);
		} catch (Exception var8) {
		}
		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var7) {
		}
		return var1;
	}

	@ObfuscatedName("afd.n(I)V")
	public static void save() {
		FileOnDisk var0 = null;
		try {
			var0 = GameShell.openPrefs("", Client.modegame.titleURL, true);
			Packet var1 = Client.preferences.createPreferencesBlock();
			var0.write(var1.data, 0, var1.pos);
		} catch (Exception var5) {
		}
		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("hj.m(I)I")
	public static int getAutoSetupResult() {
		ClientAutoSetupResult var0 = autosetup();
		GraphicsPacketQueue.method4995(var0);
		return var0.getResult();
	}

	@ObfuscatedName("hp.k(B)Lalq;")
	public static ClientAutoSetupResult autosetup() {
		ClientAutoSetupResult var0 = new ClientAutoSetupResult();
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4;
		boolean var5;
		if (GameShell.osName.startsWith("win")) {
			var2 = true;
			var4 = true;
			var5 = true;
		} else {
			var4 = true;
			var5 = true;
		}
		if (field786) {
			var0.method18313(16);
			var4 = false;
		}
		if (field788) {
			var0.method18313(32);
			var2 = false;
		}
		if (field777) {
			var0.method18313(16384);
			var5 = false;
		}
		if (!var4 && !var2) {
			setAutosetup(var0);
			return var0;
		}
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (var2) {
			try {
				Client.preferences.setPreference(Client.preferences.safeMode, 3);
				save();
				var7 = Client.getPerformanceMetric(3, 1000);
				if (Client.preferences.displayMode.getValue() == 3) {
					var0.method18313(4);
					RendererInfo var9 = Client.toolkit.getRendererInfo();
					long var10 = var9.driverVersion & 0xFFFFFFFFFFFFL;
					switch(var9.toolkitId) {
						case 4098:
							boolean var13 = var10 >= 60129613779L;
							var4 &= var13;
							if (!var13) {
								var0.method18313(512);
							}
							break;
						case 4318:
							boolean var12 = var10 >= 64425238954L;
							var4 &= var12;
							if (!var12) {
								var0.method18313(256);
							}
					}
				}
			} catch (Exception var20) {
				var0.method18313(4096);
			}
		}
		if (var5) {
			try {
				Client.preferences.setPreference(Client.preferences.safeMode, 5);
				save();
				var8 = Client.getPerformanceMetric(5, 1000);
				if (Client.preferences.displayMode.getValue() == 5) {
					var0.method18313(8192);
				}
			} catch (Exception var19) {
				var0.method18313(32768);
			}
		}
		if (var4) {
			try {
				Client.preferences.setPreference(Client.preferences.safeMode, 4);
				save();
				var6 = Client.getPerformanceMetric(1, 1000);
				if (Client.preferences.displayMode.getValue() == 1) {
					var0.method18313(2);
				}
			} catch (Exception var18) {
				var0.method18313(2048);
			}
		}
		Client.preferences.setPreference(Client.preferences.safeMode, 0);
		if (var6 == -1 && var7 == -1) {
			setAutosetup(var0);
			return var0;
		}
		var0.method18318(3, var7);
		var0.method18318(1, var6);
		var0.method18318(5, var8);
		int var17 = (int) ((float) var7 * 1.3F);
		if ((var17 <= 100000 || var6 <= 100000) && var17 <= var6) {
			method2859(var0, 1, var17 == -1 ? var6 : var17);
		} else {
			method2859(var0, 3, var6 == -1 ? var17 : var6);
		}
		return var0;
	}

	@ObfuscatedName("alz.f(Lalq;I)V")
	public static void setAutosetup(ClientAutoSetupResult autoSetupResult) {
		autoSetupResult.method18314(0);
		byte resultId;
		if (GameShell.maxmemory >= 96) {
			int profileTime = CpuProfiling.profile();
			if (profileTime <= 100) {
				setHigh();
				resultId = 4;
			} else if (profileTime <= 500) {
				setMedium();
				resultId = 3;
			} else if (profileTime <= 1003) {
				setLow();
				resultId = 2;
			} else {
				setMin(true);
				resultId = 1;
			}
			autoSetupResult.method18318(0, profileTime);
		} else {
			setMin(true);
			resultId = 1;
			autoSetupResult.method18313(64);
		}
		if (Client.preferences.displayMode.getValue() == 0) {
			Client.preferences.setPreferencesDisplayMode(Client.preferences.displayMode, true);
		} else {
			Client.preferences.setPreference(Client.preferences.toolkit, 0);
			Client.setToolkit(0, false);
		}
		save();
		autoSetupResult.setResultId(resultId);
	}

	@ObfuscatedName("et.w(Lalq;IIB)V")
	public static void method2859(ClientAutoSetupResult arg0, int arg1, int arg2) {
		arg0.method18314(arg1);
		byte var3;
		if (arg2 > 100000) {
			setHigh();
			var3 = 4;
		} else if (arg2 > 50000) {
			setMedium();
			var3 = 3;
		} else if (arg2 > 10000) {
			setLow();
			var3 = 2;
		} else {
			setMin(true);
			var3 = 1;
		}
		if (Client.preferences.displayMode.getValue() == arg1) {
			Client.preferences.setPreferencesDisplayMode(Client.preferences.displayMode, true);
		} else {
			Client.preferences.setPreference(Client.preferences.toolkit, arg1);
			Client.setToolkit(arg1, false);
		}
		save();
		arg0.setResultId(var3);
	}

	@ObfuscatedName("wo.l(B)V")
	public static void setHigh() {
		Client.preferences.setPreference(Client.preferences.removeRoofs, 2);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, 2);
		Client.preferences.setPreference(Client.preferences.groundDecoration, 1);
		Client.preferences.setPreference(Client.preferences.groundBlending, 1);
		Client.preferences.setPreference(Client.preferences.idleAnimations, 1);
		Client.preferences.setPreference(Client.preferences.flickeringEffects, 1);
		Client.preferences.setPreference(Client.preferences.characterShadows, 1);
		Client.preferences.setPreference(Client.preferences.textures, 1);
		Client.preferences.setPreference(Client.preferences.sceneryShadows, 2);
		Client.preferences.setPreference(Client.preferences.lightingDetail, 1);
		Client.preferences.setPreference(Client.preferences.waterDetail, 2);
		Client.preferences.setPreference(Client.preferences.fog, 1);
		Client.preferences.setPreference(Client.preferences.antiAliasing, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing2, 0);
		Client.preferences.setPreference(Client.preferences.particles, 2);
		Client.preferences.setPreference(Client.preferences.buildArea, BuildAreaSize.STANDARD.id);
		Client.preferences.setPreference(Client.preferences.bloom, 0);
		if (Client.toolkit != null && Client.toolkit.isBloomSupported() && Client.toolkit.isBloomEnabled()) {
			Client.toolkit.disableBloom();
		}
		Client.preferences.setPreference(Client.preferences.skyboxes, 1);
		Client.preferences.setPreference(Client.preferences.animDetail, 1);
		setCpuUsagePreference();
		Client.preferences.setPreference(Client.preferences.screenSize, 0);
		Client.preferences.setPreference(Client.preferences.preset, 4);
		Client.resetModelCaches();
		Client.world.getEnvironmentManager().resetFade();
		Client.field10836 = true;
	}

	@ObfuscatedName("ty.u(B)V")
	public static void setMedium() {
		Client.preferences.setPreference(Client.preferences.removeRoofs, 2);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, 2);
		Client.preferences.setPreference(Client.preferences.groundDecoration, 1);
		Client.preferences.setPreference(Client.preferences.groundBlending, 1);
		Client.preferences.setPreference(Client.preferences.idleAnimations, 1);
		Client.preferences.setPreference(Client.preferences.flickeringEffects, 1);
		Client.preferences.setPreference(Client.preferences.characterShadows, 1);
		Client.preferences.setPreference(Client.preferences.textures, 1);
		Client.preferences.setPreference(Client.preferences.sceneryShadows, 1);
		Client.preferences.setPreference(Client.preferences.lightingDetail, 1);
		Client.preferences.setPreference(Client.preferences.waterDetail, 0);
		Client.preferences.setPreference(Client.preferences.fog, 1);
		Client.preferences.setPreference(Client.preferences.antiAliasing, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing2, 0);
		Client.preferences.setPreference(Client.preferences.particles, 1);
		Client.preferences.setPreference(Client.preferences.buildArea, BuildAreaSize.STANDARD.id);
		Client.preferences.setPreference(Client.preferences.bloom, 0);
		if (Client.toolkit != null && Client.toolkit.isBloomSupported() && Client.toolkit.isBloomEnabled()) {
			Client.toolkit.disableBloom();
		}
		Client.preferences.setPreference(Client.preferences.skyboxes, 1);
		Client.preferences.setPreference(Client.preferences.animDetail, 1);
		setCpuUsagePreference();
		Client.preferences.setPreference(Client.preferences.screenSize, 1);
		Client.preferences.setPreference(Client.preferences.preset, 3);
		Client.resetModelCaches();
		Client.world.getEnvironmentManager().resetFade();
		Client.field10836 = true;
	}

	@ObfuscatedName("fd.z(I)V")
	public static void setLow() {
		Client.preferences.setPreference(Client.preferences.removeRoofs, 1);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, 1);
		Client.preferences.setPreference(Client.preferences.groundDecoration, 1);
		Client.preferences.setPreference(Client.preferences.groundBlending, 1);
		Client.preferences.setPreference(Client.preferences.idleAnimations, 0);
		Client.preferences.setPreference(Client.preferences.flickeringEffects, 0);
		Client.preferences.setPreference(Client.preferences.characterShadows, 0);
		Client.preferences.setPreference(Client.preferences.sceneryShadows, 0);
		Client.preferences.setPreference(Client.preferences.textures, 0);
		Client.preferences.setPreference(Client.preferences.lightingDetail, 0);
		Client.preferences.setPreference(Client.preferences.waterDetail, 0);
		Client.preferences.setPreference(Client.preferences.fog, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing2, 0);
		Client.preferences.setPreference(Client.preferences.particles, 0);
		Client.preferences.setPreference(Client.preferences.buildArea, BuildAreaSize.STANDARD.id);
		Client.preferences.setPreference(Client.preferences.bloom, 0);
		if (Client.toolkit != null && Client.toolkit.isBloomSupported() && Client.toolkit.isBloomEnabled()) {
			Client.toolkit.disableBloom();
		}
		Client.preferences.setPreference(Client.preferences.skyboxes, 0);
		Client.preferences.setPreference(Client.preferences.animDetail, 0);
		setCpuUsagePreference();
		Client.preferences.setPreference(Client.preferences.screenSize, 2);
		Client.preferences.setPreference(Client.preferences.preset, 2);
		Client.resetModelCaches();
		Client.world.getEnvironmentManager().resetFade();
		Client.field10836 = true;
	}

	@ObfuscatedName("e.p(ZI)V")
	public static void setMin(boolean arg0) {
		Client.preferences.setPreference(Client.preferences.removeRoofs, 1);
		Client.preferences.setPreference(Client.preferences.removeRoofs2, 1);
		Client.preferences.setPreference(Client.preferences.groundDecoration, 0);
		Client.preferences.setPreference(Client.preferences.fog, 0);
		Client.preferences.setPreference(Client.preferences.groundBlending, 0);
		Client.preferences.setPreference(Client.preferences.idleAnimations, 0);
		Client.preferences.setPreference(Client.preferences.flickeringEffects, 0);
		Client.preferences.setPreference(Client.preferences.characterShadows, 0);
		Client.preferences.setPreference(Client.preferences.sceneryShadows, 0);
		Client.preferences.setPreference(Client.preferences.textures, 0);
		Client.preferences.setPreference(Client.preferences.lightingDetail, 0);
		Client.preferences.setPreference(Client.preferences.waterDetail, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing, 0);
		Client.preferences.setPreference(Client.preferences.antiAliasing2, 0);
		Client.preferences.setPreference(Client.preferences.particles, 0);
		Client.preferences.setPreference(Client.preferences.buildArea, BuildAreaSize.STANDARD.id);
		Client.preferences.setPreference(Client.preferences.bloom, 0);
		if (Client.toolkit != null && Client.toolkit.isBloomSupported() && Client.toolkit.isBloomEnabled()) {
			Client.toolkit.disableBloom();
		}
		Client.preferences.setPreference(Client.preferences.skyboxes, 0);
		Client.preferences.setPreference(Client.preferences.animDetail, 0);
		setCpuUsagePreference();
		Client.preferences.setPreference(Client.preferences.screenSize, 2);
		Client.preferences.setPreference(Client.preferences.preset, 1);
		Client.resetModelCaches();
		Client.world.getEnvironmentManager().resetFade();
		Client.field10836 = true;
	}

	@ObfuscatedName("kr.d(B)V")
	public static void setCpuUsagePreference() {
		if (GameShell.cpucount > 1) {
			Client.preferences.setPreference(Client.preferences.cpuUsage, 4);
		} else {
			Client.preferences.setPreference(Client.preferences.cpuUsage, 2);
		}
	}
}
