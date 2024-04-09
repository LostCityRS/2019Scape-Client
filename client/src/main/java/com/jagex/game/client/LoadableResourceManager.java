package com.jagex.game.client;

import com.jagex.game.load.Loading;
import com.jagex.game.ClientWatch;
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
	public static LoadableResource[] loadableResources;

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
			LoadableResource.DLL_JACLIB.setResourceLoader(new Js5DllResourceLoader("jaclib"));
			if (LoadableResource.DLL_JACLIB.getResourceLoader().getPercentageComplete() != 100) {
				return 1;
			}
			if (!((Js5DllResourceLoader) LoadableResource.DLL_JACLIB.getResourceLoader()).method6812() && !Loading.method6040()) {
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
			loadableResources = LoadableResource.values();
			LoadableResource.JS5_DEFAULTS.setResourceLoader(new Js5ArchiveResourceLoader(Client.defaultsJs5));
			LoadableResource.DLL_JAGGL.setResourceLoader(new Js5DllResourceLoader("jaggl"));
			Js5DllResourceLoader var2 = new Js5DllResourceLoader("jagdx");
			if (!GameShell.osName.startsWith("win")) {
				var2.method6813();
			}
			LoadableResource.DLL_JAGDX.setResourceLoader(var2);
			LoadableResource.DLL_SW3D.setResourceLoader(new Js5DllResourceLoader("sw3d"));
			LoadableResource.DLL_HW3D.setResourceLoader(new Js5DllResourceLoader("hw3d"));
			LoadableResource.DLL_SETUP_EXE.setResourceLoader(new Js5DllResourceLoader("RuneScape-Setup.exe", true));
			LoadableResource.JS5_SHADERS.setResourceLoader(new Js5ArchiveResourceLoader(Client.shadersJs5));
			LoadableResource.JS5_MATERIALS.setResourceLoader(new Js5ArchiveResourceLoader(Client.materialsJs5));
			LoadableResource.JS5_CONFIG.setResourceLoader(new Js5ArchiveResourceLoader(Client.configJs5));
			LoadableResource.JS5_CONFIG_LOC.setResourceLoader(new Js5ArchiveResourceLoader(Client.configLocJs5));
			LoadableResource.JS5_CONFIG_ENUM.setResourceLoader(new Js5ArchiveResourceLoader(Client.configEnumJs5));
			LoadableResource.JS5_CONFIG_NPC.setResourceLoader(new Js5ArchiveResourceLoader(Client.configNpcJs5));
			LoadableResource.JS5_CONFIG_OBJ.setResourceLoader(new Js5ArchiveResourceLoader(Client.configObjJs5));
			LoadableResource.JS5_CONFIG_SEQ.setResourceLoader(new Js5ArchiveResourceLoader(Client.configSeqJs5));
			LoadableResource.JS5_CONFIG_SPOT.setResourceLoader(new Js5ArchiveResourceLoader(Client.configSpotJs5));
			LoadableResource.JS5_CONFIG_STRUCT.setResourceLoader(new Js5ArchiveResourceLoader(Client.configStructJs5));
			LoadableResource.JS5_DBTABLE_INDEX.setResourceLoader(new Js5ArchiveResourceLoader(Client.dbtableIndexJs5));
			LoadableResource.JS5_QUICK_CHAT.setResourceLoader(new Js5ArchiveResourceLoader(Client.quickchatJs5));
			LoadableResource.JS5_QUICK_CHAT_GLOBAL.setResourceLoader(new Js5ArchiveResourceLoader(Client.quickchatGlobalJs5));
			LoadableResource.JS5_CONFIG_PARTICLE.setResourceLoader(new Js5ArchiveResourceLoader(Client.configParticleJs5));
			LoadableResource.JS5_CONFIG_BILLBOARD.setResourceLoader(new Js5ArchiveResourceLoader(Client.configBillboardJs5));
			LoadableResource.JS5_BINARY_HUFFMAN.setResourceLoader(new Js5FileResourceLoader(Client.binaryJs5, "huffman"));
			LoadableResource.JS5_INTERFACES.setResourceLoader(new Js5ArchiveResourceLoader(Client.interfacesJs5));
			LoadableResource.JS5_CLIENTSCRIPTS.setResourceLoader(new Js5ArchiveResourceLoader(Client.clientscriptsJs5));
			LoadableResource.JS5_FONT_METRICS.setResourceLoader(new Js5ArchiveResourceLoader(Client.fontmetricsJs5));
			LoadableResource.JS5_WORLD_MAP_DATA.setResourceLoader(new Js5GroupResourceLoader(Client.worldmapJs5, 0));
			for (int index = 0; index < loadableResources.length; index++) {
				if (loadableResources[index].getResourceLoader() == null) {
					throw new RuntimeException();
				}
			}
			int var4 = 0;
			LoadableResource[] resources = loadableResources;
			for (int index = 0; index < resources.length; index++) {
				LoadableResource resource = resources[index];
				int var8 = resource.getLength();
				int var9 = resource.getResourceLoader().getPercentageComplete();
				var4 += var8 * var9 / 100;
			}
			field4333 = var4;
			field4332 = 2;
		}
		if (loadableResources == null) {
			return 100;
		}
		int var10 = 0;
		int var11 = 0;
		boolean var12 = true;
		LoadableResource[] var13 = loadableResources;
		for (int var14 = 0; var14 < var13.length; var14++) {
			LoadableResource var15 = var13[var14];
			int var16 = var15.getLength();
			int var17 = var15.getResourceLoader().getPercentageComplete();
			if (var17 < 100) {
				var12 = false;
			}
			var10 += var16;
			var11 += var16 * var17 / 100;
		}
		if (var12) {
			loadableResources = null;
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
