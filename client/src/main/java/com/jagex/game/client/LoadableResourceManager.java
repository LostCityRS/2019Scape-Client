package com.jagex.game.client;

import com.jagex.game.load.Loading;
import com.jagex.graphics.ClientWatch;
import com.jagex.graphics.GraphicsPacketQueue;
import com.jagex.js5.Js5ArchiveResourceLoader;
import com.jagex.js5.Js5FileResourceLoader;
import com.jagex.js5.Js5GroupResourceLoader;
import deob.ObfuscatedName;
import jaclib.ping.Ping;
import rs2.client.Client;

@ObfuscatedName("pm")
public class LoadableResourceManager {

	@ObfuscatedName("pm.e")
	public static LoadableResource[] field4334;

	@ObfuscatedName("pm.n")
	public static int field4332 = 0;

	@ObfuscatedName("pm.m")
	public static int field4333 = 0;

	public LoadableResourceManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("kg.e(I)I")
	public static int method5140() {
		if (field4332 == 0) {
			LoadableResource.field8919.method15011(new DllResourceLoader("jaclib"));
			if (LoadableResource.field8919.method15010().method6782() != 100) {
				return 1;
			}
			if (!((DllResourceLoader) LoadableResource.field8919.method15010()).method6812() && !Loading.method6040()) {
				try {
					Client.field8301.method8050();
					ClientWatch.method1427();
					Ping.init();
				} catch (NativeLibraryException var21) {
					GraphicsPacketQueue.method18474(NativeLibraryFailureType.field8908, var21.field11894, var21.field11895, var21.getCause());
				} catch (Throwable var22) {
				}
			}
			field4332 = 1;
		}
		if (field4332 == 1) {
			field4334 = LoadableResource.method15007();
			LoadableResource.field8944.method15011(new Js5ArchiveResourceLoader(Client.defaultsJs5));
			LoadableResource.field8934.method15011(new DllResourceLoader("jaggl"));
			DllResourceLoader var2 = new DllResourceLoader("jagdx");
			if (!GameShell.osName.startsWith("win")) {
				var2.method6813();
			}
			LoadableResource.field8938.method15011(var2);
			LoadableResource.field8920.method15011(new DllResourceLoader("sw3d"));
			LoadableResource.field8922.method15011(new DllResourceLoader("hw3d"));
			LoadableResource.field8921.method15011(new DllResourceLoader("RuneScape-Setup.exe", true));
			LoadableResource.field8945.method15011(new Js5ArchiveResourceLoader(Client.shadersJs5));
			LoadableResource.field8924.method15011(new Js5ArchiveResourceLoader(Client.materialsJs5));
			LoadableResource.field8925.method15011(new Js5ArchiveResourceLoader(Client.configJs5));
			LoadableResource.field8926.method15011(new Js5ArchiveResourceLoader(Client.configLocJs5));
			LoadableResource.field8927.method15011(new Js5ArchiveResourceLoader(Client.configEnumJs5));
			LoadableResource.field8928.method15011(new Js5ArchiveResourceLoader(Client.configNpcJs5));
			LoadableResource.field8942.method15011(new Js5ArchiveResourceLoader(Client.configObjJs5));
			LoadableResource.field8930.method15011(new Js5ArchiveResourceLoader(Client.configSeqJs5));
			LoadableResource.field8941.method15011(new Js5ArchiveResourceLoader(Client.configSpotJs5));
			LoadableResource.field8932.method15011(new Js5ArchiveResourceLoader(Client.configStructJs5));
			LoadableResource.field8933.method15011(new Js5ArchiveResourceLoader(Client.dbtableIndexJs5));
			LoadableResource.field8918.method15011(new Js5ArchiveResourceLoader(Client.quickchatJs5));
			LoadableResource.field8935.method15011(new Js5ArchiveResourceLoader(Client.quickchatGlobalJs5));
			LoadableResource.field8936.method15011(new Js5ArchiveResourceLoader(Client.configParticleJs5));
			LoadableResource.field8937.method15011(new Js5ArchiveResourceLoader(Client.configBillboardJs5));
			LoadableResource.field8943.method15011(new Js5FileResourceLoader(Client.binaryJs5, "huffman"));
			LoadableResource.field8939.method15011(new Js5ArchiveResourceLoader(Client.interfacesJs5));
			LoadableResource.field8940.method15011(new Js5ArchiveResourceLoader(Client.clientscriptsJs5));
			LoadableResource.field8916.method15011(new Js5ArchiveResourceLoader(Client.fontmetricsJs5));
			LoadableResource.field8931.method15011(new Js5GroupResourceLoader(Client.worldmapJs5, 0));
			for (int var3 = 0; var3 < field4334.length; var3++) {
				if (field4334[var3].method15010() == null) {
					throw new RuntimeException();
				}
			}
			int var4 = 0;
			LoadableResource[] var5 = field4334;
			for (int var6 = 0; var6 < var5.length; var6++) {
				LoadableResource var7 = var5[var6];
				int var8 = var7.method15008();
				int var9 = var7.method15010().method6782();
				var4 += var8 * var9 / 100;
			}
			field4333 = var4;
			field4332 = 2;
		}
		if (field4334 == null) {
			return 100;
		}
		int var10 = 0;
		int var11 = 0;
		boolean var12 = true;
		LoadableResource[] var13 = field4334;
		for (int var14 = 0; var14 < var13.length; var14++) {
			LoadableResource var15 = var13[var14];
			int var16 = var15.method15008();
			int var17 = var15.method15010().method6782();
			if (var17 < 100) {
				var12 = false;
			}
			var10 += var16;
			var11 += var16 * var17 / 100;
		}
		if (var12) {
			field4334 = null;
		}
		int var18 = var11 - field4333;
		int var19 = var10 - field4333;
		int var20 = var19 > 0 ? var18 * 100 / var19 : 100;
		if (!var12 && var20 > 99) {
			var20 = 99;
		}
		return var20;
	}

	@ObfuscatedName("gb.n(B)V")
	public static void method3670() {
		field4332 = 0;
		field4333 = 0;
	}
}
