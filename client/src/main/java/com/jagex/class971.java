package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ako")
public class class971 extends class532 {

	@ObfuscatedName("ako.o")
	public int field11312;

	@ObfuscatedName("ako.s")
	public int field11313;

	@ObfuscatedName("ako.y")
	public int[] field11314;

	@ObfuscatedName("ako.q")
	public int[][] field11307;

	@ObfuscatedName("ako.x")
	public boolean[] field11311;

	@ObfuscatedName("ako.b")
	public int[] field11317;

	@ObfuscatedName("ako.h")
	public int[] field11302;

	@ObfuscatedName("ako.a")
	public class105[] field11319;

	public class971(int arg0, byte[] arg1) {
		this.field11312 = arg0;
		class997 var3 = new class997(arg1);
		this.field11313 = var3.method17906();
		this.field11314 = new int[this.field11313];
		this.field11307 = new int[this.field11313][];
		this.field11311 = new boolean[this.field11313];
		this.field11317 = new int[this.field11313];
		for (int var4 = 0; var4 < this.field11313; var4++) {
			this.field11314[var4] = var3.method17904();
			if (this.field11314[var4] == 6) {
				this.field11314[var4] = 2;
			}
		}
		for (int var5 = 0; var5 < this.field11313; var5++) {
			this.field11311[var5] = var3.method17904() == 1;
		}
		for (int var6 = 0; var6 < this.field11313; var6++) {
			this.field11317[var6] = var3.method17906();
		}
		for (int var7 = 0; var7 < this.field11313; var7++) {
			this.field11307[var7] = new int[var3.method18123()];
		}
		for (int var8 = 0; var8 < this.field11313; var8++) {
			for (int var9 = 0; var9 < this.field11307[var8].length; var9++) {
				this.field11307[var8][var9] = var3.method18123();
			}
		}
		int var10 = var3.method17906();
		this.field11319 = new class105[var10];
		int var11 = var3.method17904();
		for (int var12 = 0; var12 < var10; var12++) {
			this.field11319[var12] = new class105(var11, var3, false);
		}
		int var13 = var3.method17973();
		this.field11302 = new int[var13];
		for (int var14 = 0; var14 < this.field11302.length; var14++) {
			this.field11302[var14] = var3.method17973();
		}
		this.method17599();
	}

	@ObfuscatedName("ako.e(I)V")
	public void method17599() {
		class105[] var1 = this.field11319;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class105 var3 = var1[var2];
			if (var3.field1242 >= 0) {
				var3.field1239 = this.field11319[var3.field1242];
			}
		}
	}
}
