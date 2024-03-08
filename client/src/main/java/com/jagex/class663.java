package com.jagex;

import com.jagex.deob.ObfuscatedName;

@ObfuscatedName("yn")
public class class663 implements class53, class757 {

	@ObfuscatedName("yn.n")
	public int field8152;

	@ObfuscatedName("yn.m")
	public int field8154 = 0 * 592157171;

	@ObfuscatedName("yn.k")
	public int field8155 = -1685253883 * -462296013;

	@ObfuscatedName("yn.f")
	public boolean field8157 = true;

	@ObfuscatedName("yn.w")
	public int field8156 = -690404605 * 1773420629;

	@ObfuscatedName("yn.l")
	public int field8163 = 183582208 * -2047499425;

	@ObfuscatedName("yn.u")
	public boolean field8162 = true;

	@ObfuscatedName("yn.z")
	public int field8160 = 1907344776 * -205172655;

	@ObfuscatedName("yn.p")
	public boolean field8161 = false;

	@ObfuscatedName("yn.d")
	public int field8158 = 1233755641 * 1502845029;

	@ObfuscatedName("yn.c")
	public int field8159 = 2059861312;

	@ObfuscatedName("yn.r")
	public int field8164 = -1677496433 * -503537775;

	@ObfuscatedName("yn.v")
	public int field8165 = -535383117 * -129782971;

	@ObfuscatedName("yn.o")
	public int field8166 = 0 * -703195503;

	@ObfuscatedName("yn.s")
	public int field8167 = -1934904128 * 1714018651;

	@ObfuscatedName("yn.e(Lalw;B)V")
	public void method976(class997 arg0) {
		while (true) {
			int var2 = arg0.method17904();
			if (var2 == 0) {
				return;
			}
			this.method10483(arg0, var2);
		}
	}

	@ObfuscatedName("yn.u(Lalw;II)V")
	public void method10483(class997 arg0, int arg1) {
		if (arg1 == 1) {
			this.field8154 = method9160(arg0.method17908());
		} else if (arg1 == 2) {
			this.field8155 = arg0.method17904();
		} else if (arg1 == 3) {
			this.field8155 = arg0.method17906();
			if (this.field8155 == 65535) {
				this.field8155 = -1;
			}
		} else if (arg1 == 5) {
			this.field8157 = false;
		} else if (arg1 == 7) {
			this.field8156 = method9160(arg0.method17908());
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.field8163 = arg0.method17906() << 2;
			} else if (arg1 == 10) {
				this.field8162 = false;
			} else if (arg1 == 11) {
				this.field8160 = arg0.method17904();
			} else if (arg1 == 12) {
				this.field8161 = true;
			} else if (arg1 == 13) {
				this.field8158 = arg0.method17908();
			} else if (arg1 == 14) {
				this.field8159 = (arg0.method17904() << 2) * -2115298315;
			} else if (arg1 == 16) {
				this.field8164 = arg0.method17904();
			} else if (arg1 == 20) {
				this.field8165 = arg0.method17906();
			} else if (arg1 == 21) {
				this.field8166 = arg0.method17904();
			} else if (arg1 == 22) {
				this.field8167 = arg0.method17906();
			}
		}
	}

	@ObfuscatedName("yn.n(I)V")
	public void method975() {
		this.field8160 = this.field8160 << 8 | this.field8152;
	}

	@ObfuscatedName("uk.p(II)I")
	public static int method9160(int arg0) {
		return arg0 == 16711935 ? -1 : class662.method10521(arg0);
	}

	@ObfuscatedName("yn.z(IB)V")
	public void method2998(int arg0) {
		this.field8152 = arg0;
	}
}
