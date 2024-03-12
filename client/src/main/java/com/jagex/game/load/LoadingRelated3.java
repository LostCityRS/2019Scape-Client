package com.jagex.game.load;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("adg")
public class LoadingRelated3 {

	@ObfuscatedName("adg.n")
	public final Js5 field9207;

	@ObfuscatedName("adg.m")
	public final LoadingRelated2[] field9208;

	@ObfuscatedName("adg.k")
	public final int field9209;

	public LoadingRelated3(ModeGame arg0, Language arg1, Js5 arg2) {
		this.field9207 = arg2;
		Packet var4 = new Packet(this.field9207.getfile(0, 0));
		int var5 = var4.data == null || var4.data.length < 1 ? -1 : var4.g1();
		if (var5 < 4) {
			this.field9208 = new LoadingRelated2[0];
			this.field9209 = -1;
		} else {
			int var6 = var4.g1();
			LoadingScreenElementType[] var7 = LoadingScreenElementType.method4482();
			boolean var8 = true;
			if (var7.length == var6) {
				for (int var9 = 0; var9 < var7.length; var9++) {
					int var10 = var4.g1();
					if (var7[var9].field3198 != var10) {
						var8 = false;
						break;
					}
				}
			} else {
				var8 = false;
			}
			if (var8) {
				int var11 = var4.g1();
				int var12 = var4.g1();
				int var13;
				int var14;
				if (var5 > 2) {
					this.field9209 = var4.g2s();
					var13 = var4.g3();
					var14 = var4.g2();
				} else {
					this.field9209 = -1;
					var13 = 0;
					var14 = 0;
				}
				this.field9208 = new LoadingRelated2[var12 + 1];
				for (int var15 = 0; var15 < var11; var15++) {
					int var16 = var4.g1();
					boolean var17 = var4.g1() == 1;
					int var18 = var4.g2();
					LoadingRelated1[] var19;
					if (this.field9209 == -1) {
						var19 = new LoadingRelated1[var18];
						for (int var20 = 0; var20 < var18; var20++) {
							int var21 = var4.g2();
							int var22 = var4.g3();
							int var23 = var4.g2();
							var19[var20] = new LoadingRelated1(var21, var22, var23);
						}
						this.field9208[var16] = new LoadingRelated2(var17, var19);
					} else {
						var19 = new LoadingRelated1[var18 + 1];
						var19[0] = new LoadingRelated1(this.field9209, var13, var14);
						for (int var24 = 0; var24 < var18; var24++) {
							int var25 = var4.g2();
							int var26 = var4.g3();
							int var27 = var4.g2();
							var19[var24 + 1] = new LoadingRelated1(var25, var26, var27);
						}
					}
					this.field9208[var16] = new LoadingRelated2(var17, var19);
				}
				for (int var28 = 0; var28 < var12 + 1; var28++) {
					if (this.field9208[var28] == null) {
						this.field9208[var28] = this.method15216(var13, var14);
					}
				}
			} else {
				this.field9208 = new LoadingRelated2[0];
				this.field9209 = -1;
			}
		}
	}

	@ObfuscatedName("adg.e(III)Lads;")
	public LoadingRelated2 method15216(int arg0, int arg1) {
		if (this.field9209 == -1) {
			return new LoadingRelated2(false, new LoadingRelated1[0]);
		} else {
			LoadingRelated1 var3 = new LoadingRelated1(this.field9209, arg0, arg1);
			return new LoadingRelated2(false, new LoadingRelated1[] { var3 });
		}
	}

	@ObfuscatedName("adg.n(II)Ladn;")
	public LoadingScreenType method15217(int arg0) {
		byte[] var2 = this.field9207.getfile(arg0, 0);
		LoadingScreenType var3 = new LoadingScreenType();
		var3.method15230(new Packet(var2));
		return var3;
	}

	@ObfuscatedName("adg.m(II)[Ladk;")
	public LoadingRelated1[] method15218(int arg0) {
		if (arg0 < 0 || arg0 >= this.field9208.length) {
			return this.method15216(0, 0).field9205;
		}
		LoadingRelated2 var2 = this.field9208[arg0];
		if (!var2.field9204 || var2.field9205.length <= 1) {
			return var2.field9205;
		}
		int var3 = this.field9209 == -1 ? 0 : 1;
		Random var4 = new Random();
		LoadingRelated1[] var5 = new LoadingRelated1[var2.field9205.length];
		System.arraycopy(var2.field9205, 0, var5, 0, var5.length);
		for (int var6 = var3; var6 < var5.length; var6++) {
			int var7 = IntMath.method14985(var4, var5.length - var3) + var3;
			LoadingRelated1 var8 = var2.field9205[var6];
			var5[var6] = var5[var7];
			var5[var7] = var8;
		}
		return var5;
	}

	@ObfuscatedName("adg.k(I)Z")
	public boolean method15223() {
		return this.field9209 != -1;
	}
}
