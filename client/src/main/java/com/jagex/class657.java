package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xt")
public class class657 {

	@ObfuscatedName("xt.e")
	public static class366 field8056 = null;

	public class657() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sh.e(Lxf;I)V")
	public static void method8200(class656 arg0) {
		if (class363.field3413 == arg0.field8052) {
			field8056 = new class932(arg0);
		} else if (class363.field3414 == arg0.field8052) {
			field8056 = new class931(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("rs.n(I)V")
	public static void method7606() {
		if (field8056 != null) {
			field8056.method5868();
			field8056 = null;
		}
	}

	@ObfuscatedName("d.m(B)V")
	public static void method306() {
		if (field8056 != null) {
			field8056.method5874();
		}
	}

	@ObfuscatedName("nq.k(Lpy;ILwj;ZLeb;I)Lwr;")
	public static class614 method6064(class442 arg0, int arg1, class612 arg2, boolean arg3, class162 arg4) {
		if (field8056 == null) {
			return null;
		} else {
			return (class614) (arg3 ? new class616(arg0, arg1, field8056, arg2) : new class613(arg0, arg1, field8056, arg2, arg4));
		}
	}

	@ObfuscatedName("afj.f(IIFLma;I)V")
	public static void method16432(int arg0, int arg1, float arg2, class368 arg3) {
		if (field8056 != null) {
			field8056.method5880().method5848(arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("lv.w(II)Lmj;")
	public static class369 method5401(int arg0) {
		return field8056 == null ? null : field8056.method5880().method5851(arg0);
	}
}
