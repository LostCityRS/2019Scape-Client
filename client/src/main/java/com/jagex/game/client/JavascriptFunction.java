package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("ns")
public class JavascriptFunction {

	@ObfuscatedName("ns.e")
	public static final JavascriptFunction field4036 = new JavascriptFunction(3);

	@ObfuscatedName("ns.n")
	public static final JavascriptFunction field4024 = new JavascriptFunction(7);

	@ObfuscatedName("ns.m")
	public static final JavascriptFunction ACCOUNT_CREATED = new JavascriptFunction(9);

	@ObfuscatedName("ns.k")
	public static final JavascriptFunction ACCOUNT_CREATE_STARTED = new JavascriptFunction(11);

	@ObfuscatedName("ns.f")
	public static final JavascriptFunction field4027 = new JavascriptFunction(1);

	@ObfuscatedName("ns.w")
	public static final JavascriptFunction ADVERT_PLAY = new JavascriptFunction(6);

	@ObfuscatedName("ns.l")
	public static final JavascriptFunction ADVERT_FORCE_REMOVE = new JavascriptFunction(5);

	@ObfuscatedName("ns.u")
	public static final JavascriptFunction ADVERT_ALLOW_SKIP = new JavascriptFunction(2);

	@ObfuscatedName("ns.z")
	public static final JavascriptFunction ADVERT_FINISHED = new JavascriptFunction(4);

	@ObfuscatedName("ns.p")
	public static final JavascriptFunction field4032 = new JavascriptFunction(8);

	@ObfuscatedName("ns.d")
	public static final JavascriptFunction field4033 = new JavascriptFunction(13);

	@ObfuscatedName("ns.c")
	public static final JavascriptFunction field4034 = new JavascriptFunction(10);

	@ObfuscatedName("ns.r")
	public static final JavascriptFunction field4035 = new JavascriptFunction(12);

	@ObfuscatedName("ns.v")
	public final int field4025;

	public JavascriptFunction(int arg0) {
		this.field4025 = arg0;
	}

	@ObfuscatedName("ns.e(B)Ljava/lang/String;")
	public String method6087() {
		return "_" + this.field4025;
	}

	@ObfuscatedName("ns.n([Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method6097(Object[] arg0) throws Throwable {
		return BrowserControl.call(GameShell.field11885, this.method6087(), arg0);
	}

	@ObfuscatedName("ns.m(S)Ljava/lang/Object;")
	public Object method6088() throws Throwable {
		return BrowserControl.call(GameShell.field11885, this.method6087());
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
