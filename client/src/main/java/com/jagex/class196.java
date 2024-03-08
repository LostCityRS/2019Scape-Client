package com.jagex;

import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class196 {

	@ObfuscatedName("gy.m")
	public final long field1924;

	@ObfuscatedName("gy.k")
	public final class642[] field1927;

	@ObfuscatedName("gy.f")
	public final class747 field1926;

	@ObfuscatedName("gy.w")
	public boolean field1930;

	@ObfuscatedName("gy.l")
	public String field1928;

	@ObfuscatedName("gy.u")
	public int field1922;

	@ObfuscatedName("gy.z")
	public boolean field1929;

	@ObfuscatedName("gy.p")
	public int field1925;

	@ObfuscatedName("gy.d")
	public class209 field1932;

	@ObfuscatedName("gy.c")
	public int field1933;

	@ObfuscatedName("gy.r")
	public class747 field1934;

	public class196(class997 arg0, boolean arg1, boolean arg2, class190 arg3) {
		if (arg1) {
			this.field1924 = arg0.method17914();
		} else {
			this.field1924 = -1L;
		}
		if (arg2) {
			this.field1928 = arg0.method17917();
		}
		int var5 = arg0.method17904();
		this.field1930 = (var5 & 0x1) != 0;
		this.field1929 = (var5 & 0x2) != 0;
		this.field1927 = new class642[arg3.method295().method9784()];
		int var6 = arg0.method17904();
		if (var6 > this.field1927.length) {
			throw new IllegalStateException("");
		}
		for (int var7 = 0; var7 < this.field1927.length; var7++) {
			class642 var8 = this.field1927[var7] = new class642(arg3.method295().method9778(var7), true);
			if (var7 < var6) {
				var8.method10160(arg0.method17910());
			} else {
				var8.method10160(0);
			}
			var8.method10164(var8.method10161());
		}
		int var9 = arg0.method17906();
		this.field1926 = new class747(arg3.method293());
		for (int var10 = 0; var10 < var9; var10++) {
			class413 var11 = arg3.method293().method15284(arg0);
			this.field1926.method14735(var11.field4240, var11.field4239);
		}
		this.field1922 = arg0.method17906();
		if (this.field1922 == 65535) {
			this.field1922 = -1;
		}
		this.field1925 = arg0.method17904();
		this.field1932 = (class209) class686.method1897(class209.method3603(), arg0.method17904());
		this.field1933 = arg0.method17904();
	}

	@ObfuscatedName("gy.e(I)Ljava/lang/String;")
	public String method3488() {
		return this.field1928;
	}

	@ObfuscatedName("gy.n(S)I")
	public int method3493() {
		return this.field1925;
	}

	@ObfuscatedName("gy.m(IB)V")
	public void method3489(int arg0) {
		this.field1925 = arg0;
	}

	@ObfuscatedName("gy.k(B)I")
	public int method3491() {
		return this.field1922;
	}

	@ObfuscatedName("gy.f(II)V")
	public void method3535(int arg0) {
		this.field1922 = arg0;
	}

	@ObfuscatedName("gy.w(B)Z")
	public boolean method3529() {
		return this.field1929;
	}

	@ObfuscatedName("gy.l(ZB)V")
	public void method3507(boolean arg0) {
		this.field1929 = arg0;
	}

	@ObfuscatedName("gy.u(S)Lgv;")
	public class209 method3495() {
		return this.field1932;
	}

	@ObfuscatedName("gy.z(Lgv;I)V")
	public void method3496(class209 arg0) {
		this.field1932 = arg0;
	}

	@ObfuscatedName("gy.p(B)I")
	public int method3497() {
		return this.field1933;
	}

	@ObfuscatedName("gy.d(II)V")
	public void method3498(int arg0) {
		this.field1933 = arg0;
	}

	@ObfuscatedName("gy.c(I)J")
	public long method3499() {
		return this.field1924;
	}

	@ObfuscatedName("gy.r(I)Z")
	public boolean method3500() {
		return this.field1930;
	}

	@ObfuscatedName("gy.v(IB)Lxz;")
	public class642 method3501(int arg0) {
		return this.field1927[arg0];
	}

	@ObfuscatedName("gy.o(Lgy;I)V")
	public void method3502(class196 arg0) {
		for (int var2 = 0; var2 < this.field1927.length; var2++) {
			this.field1927[var2].method10160(arg0.field1927[var2].method10175());
			this.field1927[var2].method10164(this.field1927[var2].method10161());
		}
		this.field1926.method14749();
		Iterator var3 = arg0.field1926.iterator();
		while (var3.hasNext()) {
			class413 var4 = (class413) var3.next();
			this.field1926.method14735(var4.field4240, var4.field4239);
		}
		this.field1930 = arg0.field1930;
	}

	@ObfuscatedName("gy.s(Lgu;B)V")
	public void method3503(class190 arg0) {
		if (this.field1934 == null) {
			this.field1934 = new class747(arg0.method293());
		} else {
			this.field1934.method14749();
		}
	}

	@ObfuscatedName("gy.y(I)Labn;")
	public class747 method3504() {
		return this.field1934;
	}
}
