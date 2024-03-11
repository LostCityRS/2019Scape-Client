package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("acg")
public class LoadableResource {

	@ObfuscatedName("acg.e")
	public static final LoadableResource field8944 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.n")
	public static final LoadableResource field8919 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.m")
	public static final LoadableResource field8934 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.k")
	public static final LoadableResource field8938 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.f")
	public static final LoadableResource field8920 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.w")
	public static final LoadableResource field8921 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.l")
	public static final LoadableResource field8922 = new LoadableResource(LoadableResourceType.field8915);

	@ObfuscatedName("acg.u")
	public static final LoadableResource field8945 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.z")
	public static final LoadableResource field8924 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.p")
	public static final LoadableResource field8925 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.d")
	public static final LoadableResource field8926 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.c")
	public static final LoadableResource field8927 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.r")
	public static final LoadableResource field8928 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.v")
	public static final LoadableResource field8942 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.o")
	public static final LoadableResource field8930 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.s")
	public static final LoadableResource field8941 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.y")
	public static final LoadableResource field8932 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.q")
	public static final LoadableResource field8933 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.x")
	public static final LoadableResource field8918 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.b")
	public static final LoadableResource field8935 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.h")
	public static final LoadableResource field8936 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.a")
	public static final LoadableResource field8937 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.g")
	public static final LoadableResource field8943 = new LoadableResource(LoadableResourceType.field8913);

	@ObfuscatedName("acg.i")
	public static final LoadableResource field8939 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.j")
	public static final LoadableResource field8940 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.t")
	public static final LoadableResource field8916 = new LoadableResource(LoadableResourceType.field8914);

	@ObfuscatedName("acg.ae")
	public static final LoadableResource field8931 = new LoadableResource(LoadableResourceType.field8912);

	@ObfuscatedName("acg.ag")
	public final LoadableResourceType field8929;

	@ObfuscatedName("acg.ah")
	public int field8917;

	@ObfuscatedName("acg.al")
	public ResourceLoader field8923;

	@ObfuscatedName("acg.e(B)[Lacg;")
	public static LoadableResource[] method15007() {
		return new LoadableResource[] { field8944, field8919, field8934, field8938, field8920, field8921, field8922, field8945, field8924, field8925, field8926, field8927, field8928, field8942, field8930, field8941, field8932, field8933, field8918, field8935, field8936, field8937, field8943, field8939, field8940, field8916, field8931 };
	}

	public LoadableResource(LoadableResourceType arg0) {
		this.field8929 = arg0;
		this.field8917 = 1;
	}

	@ObfuscatedName("acg.n(I)I")
	public int method15008() {
		return this.field8917;
	}

	@ObfuscatedName("acg.m(IS)V")
	public void method15009(int arg0) {
		this.field8917 = arg0;
	}

	@ObfuscatedName("acg.k(I)Lacu;")
	public ResourceLoader method15010() {
		return this.field8923;
	}

	@ObfuscatedName("acg.f(Lacu;I)V")
	public void method15011(ResourceLoader arg0) {
		if (arg0.method6781() != this.field8929) {
			throw new IllegalArgumentException();
		}
		this.field8923 = arg0;
	}
}
