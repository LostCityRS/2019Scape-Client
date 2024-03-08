package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("id")
public class class258 {

	@ObfuscatedName("id.e")
	public int[] field2682;

	@ObfuscatedName("id.n")
	public short[] field2681;

	public class258(int[] arg0, short[] arg1) {
		this.field2682 = arg0;
		this.field2681 = arg1;
	}

	public class258(class260 arg0) {
		this.field2682 = new int[8];
		this.field2681 = new short[8];
		int var2 = 0;
		if (arg0.field2738 != null && arg0.field2728 != null) {
			var2 = arg0.field2738.length;
			System.arraycopy(arg0.field2738, 0, this.field2682, 0, var2);
			System.arraycopy(arg0.field2728, 0, this.field2681, 0, var2);
		}
		for (int var3 = var2; var3 < 8; var3++) {
			this.field2682[var3] = -1;
			this.field2681[var3] = -1;
		}
	}
}
