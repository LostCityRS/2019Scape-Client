package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ns")
public class class394 {

	@ObfuscatedName("ns.e")
	public static final class394 field4036 = new class394(3);

	@ObfuscatedName("ns.n")
	public static final class394 field4024 = new class394(7);

	@ObfuscatedName("ns.m")
	public static final class394 field4023 = new class394(9);

	@ObfuscatedName("ns.k")
	public static final class394 field4028 = new class394(11);

	@ObfuscatedName("ns.f")
	public static final class394 field4027 = new class394(1);

	@ObfuscatedName("ns.w")
	public static final class394 field4026 = new class394(6);

	@ObfuscatedName("ns.l")
	public static final class394 field4029 = new class394(5);

	@ObfuscatedName("ns.u")
	public static final class394 field4030 = new class394(2);

	@ObfuscatedName("ns.z")
	public static final class394 field4031 = new class394(4);

	@ObfuscatedName("ns.p")
	public static final class394 field4032 = new class394(8);

	@ObfuscatedName("ns.d")
	public static final class394 field4033 = new class394(13);

	@ObfuscatedName("ns.c")
	public static final class394 field4034 = new class394(10);

	@ObfuscatedName("ns.r")
	public static final class394 field4035 = new class394(12);

	@ObfuscatedName("ns.v")
	public final int field4025;

	public class394(int arg0) {
		this.field4025 = arg0;
	}

	@ObfuscatedName("ns.e(B)Ljava/lang/String;")
	public String method6087() {
		return "_" + this.field4025;
	}

	@ObfuscatedName("ns.n([Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method6097(Object[] arg0) throws Throwable {
		return class766.method14960(Statics.field11885, this.method6087(), arg0);
	}

	@ObfuscatedName("ns.m(S)Ljava/lang/Object;")
	public Object method6088() throws Throwable {
		return class766.method14969(Statics.field11885, this.method6087());
	}

	@ObfuscatedName("ns.k([Ljava/lang/Object;I)V")
	public void method6089(Object[] arg0) {
		try {
			this.method6097(arg0);
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("ns.f(I)V")
	public void method6090() {
		try {
			this.method6088();
		} catch (Throwable var2) {
		}
	}
}
