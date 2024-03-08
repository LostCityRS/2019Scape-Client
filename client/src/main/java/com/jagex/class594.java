package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ve")
public class class594 {

	@ObfuscatedName("ve.e")
	public int field7428;

	@ObfuscatedName("ve.n")
	public int field7426;

	@ObfuscatedName("ve.m")
	public int field7427;

	public class594() {
		this.field7428 = -1;
	}

	public class594(int arg0, int arg1, int arg2) {
		this.field7428 = arg0;
		this.field7426 = arg1;
		this.field7427 = arg2;
	}

	public class594(int arg0) {
		if (arg0 == -1) {
			this.field7428 = -1;
		} else {
			this.field7428 = arg0 >> 28 & 0x3;
			this.field7426 = arg0 >> 14 & 0x3FFF;
			this.field7427 = arg0 & 0x3FFF;
		}
	}

	@ObfuscatedName("ve.e(Lakt;B)V")
	public void method9434(class994 arg0) {
		this.field7428 = arg0.field11477;
		this.field7426 = arg0.field11478 >> 9;
		this.field7427 = arg0.field11480 >> 9;
	}

	@ObfuscatedName("ve.n(S)I")
	public int method9433() {
		return this.field7428 << 28 | this.field7426 << 14 | this.field7427;
	}

	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof class594) {
			return this.method9436((class594) arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ve.m(Lve;I)Z")
	public boolean method9436(class594 arg0) {
		return this.method9450(arg0.field7428, arg0.field7426, arg0.field7427);
	}

	@ObfuscatedName("ve.k(IIII)Z")
	public boolean method9450(int arg0, int arg1, int arg2) {
		if (this.field7428 != arg0) {
			return false;
		} else if (this.field7426 == arg1) {
			return this.field7427 == arg2;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.method9433();
	}

	public String toString() {
		return this.method9437(",");
	}

	@ObfuscatedName("ve.f(Ljava/lang/String;I)Ljava/lang/String;")
	public String method9437(String arg0) {
		return this.field7428 + arg0 + (this.field7426 >> 6) + arg0 + (this.field7427 >> 6) + arg0 + (this.field7426 & 0x3F) + arg0 + (this.field7427 & 0x3F);
	}
}
