package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("bb")
public class class72 {

	public class72() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bb.e(II)Z")
	public static final boolean method1124(int arg0, int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@ObfuscatedName("bb.n(II)Z")
	public static final boolean method1125(int arg0, int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@ObfuscatedName("bb.m(II)Z")
	public static final boolean method1126(int arg0, int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@ObfuscatedName("bb.k(II)Z")
	public static final boolean method1127(int arg0, int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@ObfuscatedName("bb.f(II)Z")
	public static final boolean method1128(int arg0, int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@ObfuscatedName("bb.w(II)Z")
	public static final boolean method1129(int arg0, int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@ObfuscatedName("bb.l(II)Z")
	public static final boolean method1200(int arg0, int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@ObfuscatedName("bb.u(II)Z")
	public static final boolean method1131(int arg0, int arg1) {
		return false;
	}

	@ObfuscatedName("bb.z(II)Z")
	public static final boolean method1132(int arg0, int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@ObfuscatedName("bb.p(II)Z")
	public static final boolean method1137(int arg0, int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@ObfuscatedName("bb.d(II)Z")
	public static final boolean method1134(int arg0, int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@ObfuscatedName("bb.c(II)Z")
	public static final boolean method1135(int arg0, int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@ObfuscatedName("bb.r(II)Z")
	public static final boolean method1178(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("bb.v(II)Z")
	public static final boolean method1146(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@ObfuscatedName("bb.o(II)Z")
	public static final boolean method1123(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("bb.s(II)Z")
	public static final boolean method1191(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("bb.y(II)Z")
	public static final boolean method1139(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("bb.q(II)Z")
	public static final boolean method1140(int arg0, int arg1) {
		return (method1124(arg0, arg1) | method1125(arg0, arg1) | method1126(arg0, arg1)) & method1178(arg0, arg1);
	}

	@ObfuscatedName("bb.x(II)Z")
	public static final boolean method1171(int arg0, int arg1) {
		return ((arg0 & 0x2000) != 0 | method1128(arg0, arg1) | method1135(arg0, arg1)) & method1146(arg0, arg1);
	}

	@ObfuscatedName("bb.b(II)Z")
	public static final boolean method1142(int arg0, int arg1) {
		if (method1123(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method1129(arg0, arg1) | method1200(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method1128(arg0, arg1) | method1135(arg0, arg1));
		} else {
			return false;
		}
	}

	@ObfuscatedName("bb.h(II)Z")
	public static final boolean method1226(int arg0, int arg1) {
		return method1131(arg0, arg1) & method1191(arg0, arg1);
	}

	@ObfuscatedName("bb.a(II)Z")
	public static final boolean method1144(int arg0, int arg1) {
		return method1132(arg0, arg1) & method1139(arg0, arg1);
	}

	@ObfuscatedName("bb.g(II)Z")
	public static final boolean method1206(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method1124(arg0, arg1) || method1140(arg0, arg1);
	}

	@ObfuscatedName("bb.i(II)Z")
	public static final boolean method1141(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method1125(arg0, arg1) || method1140(arg0, arg1);
	}

	@ObfuscatedName("bb.j(II)Z")
	public static final boolean method1147(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 | method1126(arg0, arg1) || method1140(arg0, arg1);
	}

	@ObfuscatedName("bb.t(II)Z")
	public static final boolean method1148(int arg0, int arg1) {
		if ((arg0 & 0x10000) != 0 | method1128(arg0, arg1) || method1171(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method1142(arg0, arg1);
		}
	}

	@ObfuscatedName("bb.ae(II)Z")
	public static final boolean method1149(int arg0, int arg1) {
		return method1129(arg0, arg1) || method1142(arg0, arg1);
	}

	@ObfuscatedName("bb.ag(II)Z")
	public static final boolean method1150(int arg0, int arg1) {
		return (arg0 & 0x40000) != 0 | method1200(arg0, arg1) || method1142(arg0, arg1);
	}

	@ObfuscatedName("bb.ah(II)Z")
	public static final boolean method1151(int arg0, int arg1) {
		return method1131(arg0, arg1) || method1226(arg0, arg1);
	}

	@ObfuscatedName("bb.al(II)Z")
	public static final boolean method1152(int arg0, int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@ObfuscatedName("bb.ac(II)Z")
	public static final boolean method1153(int arg0, int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@ObfuscatedName("bb.ai(II)Z")
	public static final boolean method1154(int arg0, int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@ObfuscatedName("bb.aw(II)Z")
	public static final boolean method1215(int arg0, int arg1) {
		return (arg0 & 0x60000) != 0 | method1132(arg0, arg1) || method1142(arg0, arg1) || method1144(arg0, arg1);
	}

	@ObfuscatedName("bb.as(II)Z")
	public static final boolean method1156(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 | method1137(arg0, arg1) || method1142(arg0, arg1);
	}
}
