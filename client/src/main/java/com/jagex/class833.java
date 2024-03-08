package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aea")
public class class833 extends class103 {

	@ObfuscatedName("aea.e")
	public final class1113 field9416;

	public class833(class849 arg0, int arg1, int arg2, byte[] arg3) {
		this.field9416 = class1113.method18932(arg0, class109.field1270, class135.field1645, arg1, arg2, false, arg3, class109.field1270);
		this.field9416.method15312(false, false);
	}

	@ObfuscatedName("aea.e(Lafa;II[I[I)Laea;")
	public static class833 method15384(class849 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		byte[] var5 = new byte[arg1 * arg2];
		for (int var6 = 0; var6 < arg2; var6++) {
			int var7 = arg1 * var6 + arg3[var6];
			for (int var8 = 0; var8 < arg4[var6]; var8++) {
				var5[var7++] = -1;
			}
		}
		return new class833(arg0, arg1, arg2, var5);
	}
}
