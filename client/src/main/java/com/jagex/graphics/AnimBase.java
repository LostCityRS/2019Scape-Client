package com.jagex.graphics;

import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ako")
public class AnimBase extends Node {

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
	public Joint[] field11319;

	public AnimBase(int arg0, byte[] arg1) {
		this.field11312 = arg0;
		Packet var3 = new Packet(arg1);
		this.field11313 = var3.g2();
		this.field11314 = new int[this.field11313];
		this.field11307 = new int[this.field11313][];
		this.field11311 = new boolean[this.field11313];
		this.field11317 = new int[this.field11313];
		for (int var4 = 0; var4 < this.field11313; var4++) {
			this.field11314[var4] = var3.g1();
			if (this.field11314[var4] == 6) {
				this.field11314[var4] = 2;
			}
		}
		for (int var5 = 0; var5 < this.field11313; var5++) {
			this.field11311[var5] = var3.g1() == 1;
		}
		for (int var6 = 0; var6 < this.field11313; var6++) {
			this.field11317[var6] = var3.g2();
		}
		for (int var7 = 0; var7 < this.field11313; var7++) {
			this.field11307[var7] = new int[var3.gSmart1or2()];
		}
		for (int var8 = 0; var8 < this.field11313; var8++) {
			for (int var9 = 0; var9 < this.field11307[var8].length; var9++) {
				this.field11307[var8][var9] = var3.gSmart1or2();
			}
		}
		int var10 = var3.g2();
		this.field11319 = new Joint[var10];
		int var11 = var3.g1();
		for (int var12 = 0; var12 < var10; var12++) {
			this.field11319[var12] = new Joint(var11, var3, false);
		}
		int var13 = var3.g2s();
		this.field11302 = new int[var13];
		for (int var14 = 0; var14 < this.field11302.length; var14++) {
			this.field11302[var14] = var3.g2s();
		}
		this.method17599();
	}

	@ObfuscatedName("ako.e(I)V")
	public void method17599() {
		Joint[] var1 = this.field11319;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Joint var3 = var1[var2];
			if (var3.field1242 >= 0) {
				var3.field1239 = this.field11319[var3.field1242];
			}
		}
	}
}
