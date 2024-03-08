package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alh")
public abstract class class1019 extends class665 {

	@ObfuscatedName("alh.c")
	public class550 field11716;

	@ObfuscatedName("alh.r")
	public class1019 field11712;

	@ObfuscatedName("alh.v")
	public byte field11717;

	@ObfuscatedName("alh.o")
	public byte field11714;

	@ObfuscatedName("alh.s")
	public int field11715;

	@ObfuscatedName("alh.y")
	public class141[] field11713;

	@ObfuscatedName("alh.q")
	public class420 field11711;

	public class1019(class550 arg0) {
		this(arg0, (class420) null);
	}

	public class1019(class550 arg0, class420 arg1) {
		this.field11716 = arg0;
		this.field11711 = arg1;
	}

	@ObfuscatedName("alh.gp(I)I")
	public int method18371() {
		return 0;
	}

	@ObfuscatedName("alh.gc(I)Z")
	public boolean method18359() {
		return true;
	}

	@ObfuscatedName("alh.gf(II[Lakf;I)I")
	public int method18362(int arg0, int arg1, class973[] arg2) {
		long var4 = this.field11716.field6954[this.field11717][arg0][arg1];
		long var6 = 0L;
		int var8 = 0;
		while (var6 <= 48L) {
			int var9 = (int) (var4 >> (int) var6 & 0xFFFFL);
			if (var9 <= 0) {
				break;
			}
			arg2[var8++] = this.field11716.field6926[var9 - 1].field7003;
			var6 += 16L;
		}
		for (int var10 = var8; var10 < 4; var10++) {
			arg2[var10] = null;
		}
		return var8;
	}

	@ObfuscatedName("acl.gx(IIILdo;I)Luq;")
	public static class556 method15111(int arg0, int arg1, int arg2, class116 arg3) {
		return arg3 == null ? null : new class556(arg0, arg1, arg2, arg3.method1727(), arg3.method1729(), arg3.method1730(), arg3.method1748(), arg3.method1695(), arg3.method1733(), arg3.method1794());
	}

	@ObfuscatedName("sl.ge(Luq;IIILdo;I)V")
	public static void method8229(class556 arg0, int arg1, int arg2, int arg3, class116 arg4) {
		if (arg4 != null) {
			arg0.method8967(arg1, arg2, arg3, arg4.method1727(), arg4.method1729(), arg4.method1730(), arg4.method1748(), arg4.method1695(), arg4.method1733(), arg4.method1794());
		}
	}

	@ObfuscatedName("alh.bo(I)I")
	public int method16501() {
		return -this.method16523();
	}

	@ObfuscatedName("alh.gg(II)V")
	public void method18363(int arg0) {
		this.field11713 = new class141[arg0];
		for (int var2 = 0; var2 < this.field11713.length; var2++) {
			this.field11713[var2] = new class141();
		}
	}

	@ObfuscatedName("alh.fa(Ldh;IIB)Z")
	public abstract boolean method17375(class133 arg0, int arg1, int arg2);

	@ObfuscatedName("alh.fp(I)Z")
	public abstract boolean method17379();

	@ObfuscatedName("alh.bu(B)Z")
	public abstract boolean method16488();

	@ObfuscatedName("alh.bw(S)Z")
	public abstract boolean method16489();

	@ObfuscatedName("alh.ff(B)V")
	public abstract void method17378();

	@ObfuscatedName("alh.fw(Ldh;I)V")
	public abstract void method17373(class133 arg0);

	@ObfuscatedName("alh.fq(Ldh;Lalh;IIIZB)V")
	public abstract void method17377(class133 arg0, class1019 arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("alh.ga(Ldh;S)Z")
	public abstract boolean method18360(class133 arg0);

	@ObfuscatedName("alh.fc(Ldh;I)Ltl;")
	public abstract class552 method17372(class133 arg0);

	@ObfuscatedName("alh.gn(I)Z")
	public abstract boolean method18361();

	@ObfuscatedName("alh.by(B)I")
	public abstract int method16523();

	@ObfuscatedName("alh.fv(Ldh;B)Luq;")
	public abstract class556 method17371(class133 arg0);

	@ObfuscatedName("alh.gy([Lakf;S)I")
	public abstract int method18375(class973[] arg0);
}
