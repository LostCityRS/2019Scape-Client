package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aed")
public class class834 extends class103 {

	@ObfuscatedName("aed.e")
	public final class341 field9417;

	public class834(class850 arg0, int arg1, int arg2, byte[] arg3) {
		this.field9417 = arg0.method16028(class109.field1270, arg1, arg2, false, arg3);
		this.field9417.method5700(false, false);
	}

	public class834(class850 arg0, int arg1, int arg2, int[] arg3) {
		this.field9417 = arg0.method16204(arg1, arg2, false, arg3);
		this.field9417.method5700(false, false);
	}

	@ObfuscatedName("aed.e(Lafc;II[I[I)Laed;")
	public static class834 method15388(class850 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		if (!arg0.method16026(class109.field1270, class135.field1645)) {
			int[] var9 = new int[arg1 * arg2];
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = arg1 * var10 + arg3[var10];
				for (int var12 = 0; var12 < arg4[var10]; var12++) {
					var9[var11++] = -16777216;
				}
			}
			return new class834(arg0, arg1, arg2, var9);
		}
		byte[] var5 = new byte[arg1 * arg2];
		for (int var6 = 0; var6 < arg2; var6++) {
			int var7 = arg1 * var6 + arg3[var6];
			for (int var8 = 0; var8 < arg4[var6]; var8++) {
				var5[var7++] = -1;
			}
		}
		return new class834(arg0, arg1, arg2, var5);
	}
}
