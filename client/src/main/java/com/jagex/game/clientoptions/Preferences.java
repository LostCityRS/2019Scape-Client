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
import deob.Statics;
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

	public Preferences() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pd.e(I)Lali;")
	public static ClientOptions method6822() {
		FileOnDisk var0 = null;
		ClientOptions var1 = new ClientOptions(Client.field10768, 0);
		try {
			var0 = GameShell.openPrefs("", Client.field10768.field8333, false);
			byte[] var2 = new byte[(int) var0.method14821()];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.method14812(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}
			var1 = new ClientOptions(new Packet(var2), Client.field10768, 0);
		} catch (Exception var8) {
		}
		try {
			if (var0 != null) {
				var0.method14818();
			}
		} catch (Exception var7) {
		}
		return var1;
	}

	@ObfuscatedName("afd.n(I)V")
	public static void method16391() {
		FileOnDisk var0 = null;
		try {
			var0 = GameShell.openPrefs("", Client.field10768.field8333, true);
			Packet var1 = Statics.field688.method18156();
			var0.method14808(var1.data, 0, var1.pos);
		} catch (Exception var5) {
		}
		try {
			if (var0 != null) {
				var0.method14818();
			}
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("hj.m(I)I")
	public static int method4288() {
		ClientAutoSetupResult var0 = method4063();
		GraphicsPacketQueue.method4995(var0);
		return var0.method14996();
	}

	@ObfuscatedName("hp.k(B)Lalq;")
	public static ClientAutoSetupResult method4063() {
		ClientAutoSetupResult var0 = new ClientAutoSetupResult();
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4;
		boolean var5;
		if (Statics.osName.startsWith("win")) {
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
			method18306(var0);
			return var0;
		}
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (var2) {
			try {
				Statics.field688.method18157(Statics.field688.unknown6, 3);
				method16391();
				var7 = Client.method15172(3, 1000);
				if (Statics.field688.displayMode2.method18545() == 3) {
					var0.method18313(4);
					RendererInfo var9 = Statics.field8198.method2272();
					long var10 = var9.field1265 & 0xFFFFFFFFFFFFL;
					switch(var9.field1261) {
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
				Statics.field688.method18157(Statics.field688.unknown6, 5);
				method16391();
				var8 = Client.method15172(5, 1000);
				if (Statics.field688.displayMode2.method18545() == 5) {
					var0.method18313(8192);
				}
			} catch (Exception var19) {
				var0.method18313(32768);
			}
		}
		if (var4) {
			try {
				Statics.field688.method18157(Statics.field688.unknown6, 4);
				method16391();
				var6 = Client.method15172(1, 1000);
				if (Statics.field688.displayMode2.method18545() == 1) {
					var0.method18313(2);
				}
			} catch (Exception var18) {
				var0.method18313(2048);
			}
		}
		Statics.field688.method18157(Statics.field688.unknown6, 0);
		if (var6 == -1 && var7 == -1) {
			method18306(var0);
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
	public static void method18306(ClientAutoSetupResult arg0) {
		arg0.method18314(0);
		byte var2;
		if (GameShell.maxmemory >= 96) {
			int var1 = CpuProfiling.method270();
			if (var1 <= 100) {
				method9619();
				var2 = 4;
			} else if (var1 <= 500) {
				method8479();
				var2 = 3;
			} else if (var1 <= 1003) {
				method3056();
				var2 = 2;
			} else {
				method131(true);
				var2 = 1;
			}
			arg0.method18318(0, var1);
		} else {
			method131(true);
			var2 = 1;
			arg0.method18313(64);
		}
		if (Statics.field688.displayMode2.method18545() == 0) {
			Statics.field688.method18177(Statics.field688.displayMode2, true);
		} else {
			Statics.field688.method18157(Statics.field688.displayMode, 0);
			Client.method486(0, false);
		}
		method16391();
		arg0.method18312(var2);
	}

	@ObfuscatedName("et.w(Lalq;IIB)V")
	public static void method2859(ClientAutoSetupResult arg0, int arg1, int arg2) {
		arg0.method18314(arg1);
		byte var3;
		if (arg2 > 100000) {
			method9619();
			var3 = 4;
		} else if (arg2 > 50000) {
			method8479();
			var3 = 3;
		} else if (arg2 > 10000) {
			method3056();
			var3 = 2;
		} else {
			method131(true);
			var3 = 1;
		}
		if (Statics.field688.displayMode2.method18545() == arg1) {
			Statics.field688.method18177(Statics.field688.displayMode2, true);
		} else {
			Statics.field688.method18157(Statics.field688.displayMode, arg1);
			Client.method486(arg1, false);
		}
		method16391();
		arg0.method18312(var3);
	}

	@ObfuscatedName("wo.l(B)V")
	public static void method9619() {
		Statics.field688.method18157(Statics.field688.removeRoofs, 2);
		Statics.field688.method18157(Statics.field688.removeRoofs2, 2);
		Statics.field688.method18157(Statics.field688.groundDecoration, 1);
		Statics.field688.method18157(Statics.field688.groundBlending, 1);
		Statics.field688.method18157(Statics.field688.idleAnimations, 1);
		Statics.field688.method18157(Statics.field688.flickeringEffects, 1);
		Statics.field688.method18157(Statics.field688.characterShadows, 1);
		Statics.field688.method18157(Statics.field688.textures, 1);
		Statics.field688.method18157(Statics.field688.sceneryShadows, 2);
		Statics.field688.method18157(Statics.field688.lightingDetail, 1);
		Statics.field688.method18157(Statics.field688.waterDetail, 2);
		Statics.field688.method18157(Statics.field688.fog, 1);
		Statics.field688.method18157(Statics.field688.unknown1, 0);
		Statics.field688.method18157(Statics.field688.unknown2, 0);
		Statics.field688.method18157(Statics.field688.particles, 2);
		Statics.field688.method18157(Statics.field688.buildArea, BuildAreaSize.field2663.field2664);
		Statics.field688.method18157(Statics.field688.bloom, 0);
		if (Statics.field8198 != null && Statics.field8198.method2266() && Statics.field8198.method2242()) {
			Statics.field8198.method2273();
		}
		Statics.field688.method18157(Statics.field688.skyboxes, 1);
		Statics.field688.method18157(Statics.field688.unknown, 1);
		Statics.method5326();
		Statics.field688.method18157(Statics.field688.screenSize, 0);
		Statics.field688.method18157(Statics.field688.preset, 4);
		Client.method9516();
		Client.world.method7816().method10019();
		Client.field10836 = true;
	}

	@ObfuscatedName("ty.u(B)V")
	public static void method8479() {
		Statics.field688.method18157(Statics.field688.removeRoofs, 2);
		Statics.field688.method18157(Statics.field688.removeRoofs2, 2);
		Statics.field688.method18157(Statics.field688.groundDecoration, 1);
		Statics.field688.method18157(Statics.field688.groundBlending, 1);
		Statics.field688.method18157(Statics.field688.idleAnimations, 1);
		Statics.field688.method18157(Statics.field688.flickeringEffects, 1);
		Statics.field688.method18157(Statics.field688.characterShadows, 1);
		Statics.field688.method18157(Statics.field688.textures, 1);
		Statics.field688.method18157(Statics.field688.sceneryShadows, 1);
		Statics.field688.method18157(Statics.field688.lightingDetail, 1);
		Statics.field688.method18157(Statics.field688.waterDetail, 0);
		Statics.field688.method18157(Statics.field688.fog, 1);
		Statics.field688.method18157(Statics.field688.unknown1, 0);
		Statics.field688.method18157(Statics.field688.unknown2, 0);
		Statics.field688.method18157(Statics.field688.particles, 1);
		Statics.field688.method18157(Statics.field688.buildArea, BuildAreaSize.field2663.field2664);
		Statics.field688.method18157(Statics.field688.bloom, 0);
		if (Statics.field8198 != null && Statics.field8198.method2266() && Statics.field8198.method2242()) {
			Statics.field8198.method2273();
		}
		Statics.field688.method18157(Statics.field688.skyboxes, 1);
		Statics.field688.method18157(Statics.field688.unknown, 1);
		Statics.method5326();
		Statics.field688.method18157(Statics.field688.screenSize, 1);
		Statics.field688.method18157(Statics.field688.preset, 3);
		Client.method9516();
		Client.world.method7816().method10019();
		Client.field10836 = true;
	}

	@ObfuscatedName("fd.z(I)V")
	public static void method3056() {
		Statics.field688.method18157(Statics.field688.removeRoofs, 1);
		Statics.field688.method18157(Statics.field688.removeRoofs2, 1);
		Statics.field688.method18157(Statics.field688.groundDecoration, 1);
		Statics.field688.method18157(Statics.field688.groundBlending, 1);
		Statics.field688.method18157(Statics.field688.idleAnimations, 0);
		Statics.field688.method18157(Statics.field688.flickeringEffects, 0);
		Statics.field688.method18157(Statics.field688.characterShadows, 0);
		Statics.field688.method18157(Statics.field688.sceneryShadows, 0);
		Statics.field688.method18157(Statics.field688.textures, 0);
		Statics.field688.method18157(Statics.field688.lightingDetail, 0);
		Statics.field688.method18157(Statics.field688.waterDetail, 0);
		Statics.field688.method18157(Statics.field688.fog, 0);
		Statics.field688.method18157(Statics.field688.unknown1, 0);
		Statics.field688.method18157(Statics.field688.unknown2, 0);
		Statics.field688.method18157(Statics.field688.particles, 0);
		Statics.field688.method18157(Statics.field688.buildArea, BuildAreaSize.field2663.field2664);
		Statics.field688.method18157(Statics.field688.bloom, 0);
		if (Statics.field8198 != null && Statics.field8198.method2266() && Statics.field8198.method2242()) {
			Statics.field8198.method2273();
		}
		Statics.field688.method18157(Statics.field688.skyboxes, 0);
		Statics.field688.method18157(Statics.field688.unknown, 0);
		Statics.method5326();
		Statics.field688.method18157(Statics.field688.screenSize, 2);
		Statics.field688.method18157(Statics.field688.preset, 2);
		Client.method9516();
		Client.world.method7816().method10019();
		Client.field10836 = true;
	}

	@ObfuscatedName("e.p(ZI)V")
	public static void method131(boolean arg0) {
		Statics.field688.method18157(Statics.field688.removeRoofs, 1);
		Statics.field688.method18157(Statics.field688.removeRoofs2, 1);
		Statics.field688.method18157(Statics.field688.groundDecoration, 0);
		Statics.field688.method18157(Statics.field688.fog, 0);
		Statics.field688.method18157(Statics.field688.groundBlending, 0);
		Statics.field688.method18157(Statics.field688.idleAnimations, 0);
		Statics.field688.method18157(Statics.field688.flickeringEffects, 0);
		Statics.field688.method18157(Statics.field688.characterShadows, 0);
		Statics.field688.method18157(Statics.field688.sceneryShadows, 0);
		Statics.field688.method18157(Statics.field688.textures, 0);
		Statics.field688.method18157(Statics.field688.lightingDetail, 0);
		Statics.field688.method18157(Statics.field688.waterDetail, 0);
		Statics.field688.method18157(Statics.field688.unknown1, 0);
		Statics.field688.method18157(Statics.field688.unknown2, 0);
		Statics.field688.method18157(Statics.field688.particles, 0);
		Statics.field688.method18157(Statics.field688.buildArea, BuildAreaSize.field2663.field2664);
		Statics.field688.method18157(Statics.field688.bloom, 0);
		if (Statics.field8198 != null && Statics.field8198.method2266() && Statics.field8198.method2242()) {
			Statics.field8198.method2273();
		}
		Statics.field688.method18157(Statics.field688.skyboxes, 0);
		Statics.field688.method18157(Statics.field688.unknown, 0);
		Statics.method5326();
		Statics.field688.method18157(Statics.field688.screenSize, 2);
		Statics.field688.method18157(Statics.field688.preset, 1);
		Client.method9516();
		Client.world.method7816().method10019();
		Client.field10836 = true;
	}
}
