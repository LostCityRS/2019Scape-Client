package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("acg")
public class LoadableResource {

	@ObfuscatedName("acg.e")
	public static final LoadableResource JS5_DEFAULTS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.n")
	public static final LoadableResource DLL_JACLIB = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.m")
	public static final LoadableResource DLL_JAGGL = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.k")
	public static final LoadableResource DLL_JAGDX = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.f")
	public static final LoadableResource DLL_SW3D = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.w")
	public static final LoadableResource DLL_SETUP_EXE = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.l")
	public static final LoadableResource DLL_HW3D = new LoadableResource(LoadableResourceType.DLL);

	@ObfuscatedName("acg.u")
	public static final LoadableResource JS5_SHADERS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.z")
	public static final LoadableResource JS5_MATERIALS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.p")
	public static final LoadableResource JS5_CONFIG = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.d")
	public static final LoadableResource JS5_CONFIG_LOC = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.c")
	public static final LoadableResource JS5_CONFIG_ENUM = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.r")
	public static final LoadableResource JS5_CONFIG_NPC = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.v")
	public static final LoadableResource JS5_CONFIG_OBJ = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.o")
	public static final LoadableResource JS5_CONFIG_SEQ = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.s")
	public static final LoadableResource JS5_CONFIG_SPOT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.y")
	public static final LoadableResource JS5_CONFIG_STRUCT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.q")
	public static final LoadableResource JS5_DBTABLE_INDEX = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.x")
	public static final LoadableResource JS5_QUICK_CHAT = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.b")
	public static final LoadableResource JS5_QUICK_CHAT_GLOBAL = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.h")
	public static final LoadableResource JS5_CONFIG_PARTICLE = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.a")
	public static final LoadableResource JS5_CONFIG_BILLBOARD = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.g")
	public static final LoadableResource JS5_BINARY_HUFFMAN = new LoadableResource(LoadableResourceType.JS5_FILE);

	@ObfuscatedName("acg.i")
	public static final LoadableResource JS5_INTERFACES = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.j")
	public static final LoadableResource JS5_CLIENTSCRIPTS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.t")
	public static final LoadableResource JS5_FONT_METRICS = new LoadableResource(LoadableResourceType.JS5_ARCHIVE);

	@ObfuscatedName("acg.ae")
	public static final LoadableResource JS5_WORLD_MAP_DATA = new LoadableResource(LoadableResourceType.JS5_GROUP);

	@ObfuscatedName("acg.ag")
	public final LoadableResourceType resourceType;

	@ObfuscatedName("acg.ah")
	public int length;

	@ObfuscatedName("acg.al")
	public ResourceLoader resourceLoader;

	@ObfuscatedName("acg.e(B)[Lacg;")
	public static LoadableResource[] values() {
		return new LoadableResource[] {JS5_DEFAULTS, DLL_JACLIB, DLL_JAGGL, DLL_JAGDX, DLL_SW3D, DLL_SETUP_EXE, DLL_HW3D, JS5_SHADERS, JS5_MATERIALS, JS5_CONFIG, JS5_CONFIG_LOC, JS5_CONFIG_ENUM, JS5_CONFIG_NPC, JS5_CONFIG_OBJ, JS5_CONFIG_SEQ, JS5_CONFIG_SPOT, JS5_CONFIG_STRUCT, JS5_DBTABLE_INDEX, JS5_QUICK_CHAT, JS5_QUICK_CHAT_GLOBAL, JS5_CONFIG_PARTICLE, JS5_CONFIG_BILLBOARD, JS5_BINARY_HUFFMAN, JS5_INTERFACES, JS5_CLIENTSCRIPTS, JS5_FONT_METRICS, JS5_WORLD_MAP_DATA};
	}

	public LoadableResource(LoadableResourceType resourceType) {
		this.resourceType = resourceType;
		this.length = 1;
	}

	@ObfuscatedName("acg.n(I)I")
	public int getLength() {
		return this.length;
	}

	@ObfuscatedName("acg.m(IS)V")
	public void setLength(int length) {
		this.length = length;
	}

	@ObfuscatedName("acg.k(I)Lacu;")
	public ResourceLoader getResourceLoader() {
		return this.resourceLoader;
	}

	@ObfuscatedName("acg.f(Lacu;I)V")
	public void setResourceLoader(ResourceLoader resourceLoader) {
		if (resourceLoader.getLoadableResourceType() != this.resourceType) {
			throw new IllegalArgumentException();
		}
		this.resourceLoader = resourceLoader;
	}
}
