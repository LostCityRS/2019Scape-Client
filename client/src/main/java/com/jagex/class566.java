package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uk")
public class class566 implements class53 {

	@ObfuscatedName("uk.e")
	public final class567 field7226;

	@ObfuscatedName("uk.m")
	public int field7223 = 255;

	@ObfuscatedName("uk.k")
	public int field7218 = 255;

	@ObfuscatedName("uk.f")
	public int field7219 = -1;

	@ObfuscatedName("uk.w")
	public int field7220 = 1;

	@ObfuscatedName("uk.l")
	public int field7227 = 70;

	@ObfuscatedName("uk.u")
	public int field7217 = -1;

	@ObfuscatedName("uk.z")
	public int field7215 = -1;

	@ObfuscatedName("uk.p")
	public int field7224 = -1;

	@ObfuscatedName("uk.d")
	public int field7225 = -1;

	@ObfuscatedName("uk.c")
	public int field7222 = -1;

	@ObfuscatedName("uk.r")
	public int field7221 = -1;

	public class566(int arg0, class567 arg1) {
		this.field7226 = arg1;
	}

	@ObfuscatedName("uk.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method9149(arg0, var2);
		}
	}

	@ObfuscatedName("uk.u(Lalw;II)V")
	public void method9149(class997 arg0, int arg1) {
		if (arg1 == 1) {
			arg0.method17906();
		} else if (arg1 == 2) {
			this.field7223 = arg0.method17904();
		} else if (arg1 == 3) {
			this.field7218 = arg0.method17904();
		} else if (arg1 == 4) {
			this.field7219 = 0;
		} else if (arg1 == 5) {
			this.field7227 = arg0.method17906();
		} else if (arg1 == 6) {
			arg0.method17904();
		} else if (arg1 == 7) {
			this.field7217 = arg0.method17927();
		} else if (arg1 == 8) {
			this.field7215 = arg0.method17927();
		} else if (arg1 == 9) {
			this.field7224 = arg0.method17927();
		} else if (arg1 == 10) {
			this.field7225 = arg0.method17927();
		} else if (arg1 == 11) {
			this.field7219 = arg0.method17906();
		} else if (arg1 == 12) {
			this.field7222 = arg0.method17927();
		} else if (arg1 == 13) {
			this.field7221 = arg0.method17927();
		}
	}

	@ObfuscatedName("uk.z(Ldh;IB)Lcm;")
	public class101 method9150(class133 arg0, int arg1) {
		if (arg1 < 0) {
			return null;
		}
		class101 var3 = (class101) this.field7226.field7230.method2930((long) arg1);
		if (var3 == null) {
			this.method9152(arg0);
			var3 = (class101) this.field7226.field7230.method2930((long) arg1);
		}
		return var3;
	}

	@ObfuscatedName("uk.p(Ldh;II)V")
	public void method9151(class133 arg0, int arg1) {
		class442 var3 = this.field7226.field7229;
		if (arg1 >= 0 && this.field7226.field7230.method2930((long) arg1) == null && var3.method6889(arg1)) {
			class136 var4 = class111.method1607(var3, arg1);
			this.field7226.field7230.method2921(arg0.method2200(var4, true), (long) arg1);
		}
	}

	@ObfuscatedName("uk.d(Ldh;I)V")
	public void method9152(class133 arg0) {
		this.method9151(arg0, this.field7217);
		this.method9151(arg0, this.field7215);
		this.method9151(arg0, this.field7224);
		this.method9151(arg0, this.field7225);
		this.method9151(arg0, this.field7222);
		this.method9151(arg0, this.field7221);
	}

	@ObfuscatedName("uk.n(I)V")
	public void method975() {
	}
}
