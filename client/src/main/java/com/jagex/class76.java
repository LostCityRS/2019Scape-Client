package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("bw")
public class class76 {

	@ObfuscatedName("bw.e")
	public class74[] field1030;

	@ObfuscatedName("bw.n")
	public int field1027 = 0;

	@ObfuscatedName("bw.m")
	public int field1028 = 0;

	@ObfuscatedName("bw.k")
	public int field1026 = 0;

	@ObfuscatedName("bw.f")
	public final class849 field1029;

	@ObfuscatedName("bw.w")
	public final class78 field1031;

	@ObfuscatedName("bw.l")
	public final class821 field1032;

	public class76(class849 arg0) {
		this.field1029 = arg0;
		this.field1031 = new class78(arg0);
		this.field1030 = new class74[16];
		this.field1030[1] = new class822(arg0);
		this.field1030[2] = new class815(arg0, this.field1031);
		this.field1030[4] = new class819(arg0, this.field1031);
		this.field1030[5] = new class817(arg0, this.field1031);
		this.field1030[6] = new class818(arg0);
		this.field1030[7] = new class816(arg0);
		this.field1030[3] = this.field1032 = new class821(arg0);
		this.field1030[8] = new class823(arg0, this.field1031);
		this.field1030[9] = new class820(arg0, this.field1031);
		if (!this.field1030[8].method1252()) {
			this.field1030[8] = this.field1030[4];
		}
		if (!this.field1030[9].method1252()) {
			this.field1030[9] = this.field1030[8];
		}
	}

	@ObfuscatedName("bw.e(I)Z")
	public boolean method1277(int arg0) {
		return this.field1030[arg0].method1252();
	}

	@ObfuscatedName("bw.n(IIIZZ)V")
	public void method1278(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		boolean var6 = arg4 & this.field1029.method15730();
		if (!var6 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.field1026 != arg0) {
			if (this.field1026 != 0) {
				this.field1030[this.field1026 & Integer.MAX_VALUE].method1255();
			}
			if (arg0 != 0) {
				this.field1030[arg0 & Integer.MAX_VALUE].method1263(arg3);
				this.field1030[arg0 & Integer.MAX_VALUE].method1254(arg3);
				this.field1030[arg0 & Integer.MAX_VALUE].method1256(arg1, arg2);
			}
			this.field1026 = arg0;
			this.field1027 = arg1;
			this.field1028 = arg2;
		} else if (this.field1026 != 0) {
			this.field1030[this.field1026 & Integer.MAX_VALUE].method1254(arg3);
			if (this.field1027 != arg1 || this.field1028 != arg2) {
				this.field1030[this.field1026 & Integer.MAX_VALUE].method1256(arg1, arg2);
				this.field1027 = arg1;
				this.field1028 = arg2;
			}
		}
	}

	@ObfuscatedName("bw.m(Lbq;I)Z")
	public boolean method1276(class70 arg0, int arg1) {
		if (this.field1026 == 0) {
			return false;
		} else {
			this.field1030[this.field1026 & Integer.MAX_VALUE].method1251(arg0, arg1);
			return true;
		}
	}
}
