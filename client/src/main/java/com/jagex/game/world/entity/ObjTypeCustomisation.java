package com.jagex.game.world.entity;

import com.jagex.core.io.Packet;
import com.jagex.game.config.objtype.ObjType;
import deob.ObfuscatedName;

@ObfuscatedName("abw")
public class ObjTypeCustomisation {

	@ObfuscatedName("abw.w")
	public int[] field8710 = new int[3];

	@ObfuscatedName("abw.l")
	public int[] field8708 = new int[3];

	@ObfuscatedName("abw.u")
	public int[] field8709 = new int[2];

	@ObfuscatedName("abw.z")
	public int[] field8713 = new int[2];

	@ObfuscatedName("abw.p")
	public short[] field8714;

	@ObfuscatedName("abw.d")
	public short[] field8715;

	public ObjTypeCustomisation(ObjType arg0) {
		this.field8710[0] = arg0.manwear;
		this.field8710[1] = arg0.manwear2;
		this.field8710[2] = arg0.manwear3;
		this.field8708[0] = arg0.womanwear;
		this.field8708[1] = arg0.womanwear2;
		this.field8708[2] = arg0.womanwear3;
		this.field8709[0] = arg0.manhead;
		this.field8709[1] = arg0.manhead2;
		this.field8713[0] = arg0.womanhead;
		this.field8713[1] = arg0.womanhead2;
		if (arg0.recol_d != null) {
			this.field8714 = new short[arg0.recol_d.length];
			System.arraycopy(arg0.recol_d, 0, this.field8714, 0, this.field8714.length);
		}
		if (arg0.retex_d != null) {
			this.field8715 = new short[arg0.retex_d.length];
			System.arraycopy(arg0.retex_d, 0, this.field8715, 0, this.field8715.length);
		}
	}

	@ObfuscatedName("bc.e(Labv;Lalw;I)Labw;")
	public static ObjTypeCustomisation method1061(ObjType arg0, Packet arg1) {
		return method4273(arg0, arg1, 2);
	}

	@ObfuscatedName("ho.n(Labv;Lalw;II)Labw;")
	public static ObjTypeCustomisation method4273(ObjType arg0, Packet arg1, int arg2) {
		ObjTypeCustomisation var3 = new ObjTypeCustomisation(arg0);
		int var4 = arg1.g1();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		boolean var7 = (var4 & 0x4) != 0;
		boolean var8 = (var4 & 0x8) != 0;
		if (var5) {
			if (arg2 <= 1) {
				var3.field8710[0] = arg1.g2();
				var3.field8708[0] = arg1.g2();
			} else {
				var3.field8710[0] = arg1.gSmart2or4null();
				var3.field8708[0] = arg1.gSmart2or4null();
			}
			if (arg0.manwear2 != -1 || arg0.womanwear2 != -1) {
				if (arg2 <= 1) {
					var3.field8710[1] = arg1.g2();
					var3.field8708[1] = arg1.g2();
				} else {
					var3.field8710[1] = arg1.gSmart2or4null();
					var3.field8708[1] = arg1.gSmart2or4null();
				}
			}
			if (arg0.manwear3 != -1 || arg0.womanwear3 != -1) {
				if (arg2 <= 1) {
					var3.field8710[2] = arg1.g2();
					var3.field8708[2] = arg1.g2();
				} else {
					var3.field8710[2] = arg1.gSmart2or4null();
					var3.field8708[2] = arg1.gSmart2or4null();
				}
			}
		}
		if (var6) {
			if (arg2 <= 1) {
				var3.field8709[0] = arg1.g2();
				var3.field8713[0] = arg1.g2();
			} else {
				var3.field8709[0] = arg1.gSmart2or4null();
				var3.field8713[0] = arg1.gSmart2or4null();
			}
			if (arg0.manhead2 != -1 || arg0.womanhead2 != -1) {
				if (arg2 <= 1) {
					var3.field8709[1] = arg1.g2();
					var3.field8713[1] = arg1.g2();
				} else {
					var3.field8709[1] = arg1.gSmart2or4null();
					var3.field8713[1] = arg1.gSmart2or4null();
				}
			}
		}
		if (var7) {
			int var9 = arg1.g2();
			int[] var10 = new int[] { var9 & 0xF, var9 >> 4 & 0xF, var9 >> 8 & 0xF, var9 >> 12 & 0xF };
			for (int var11 = 0; var11 < 4; var11++) {
				if (var10[var11] != 15) {
					var3.field8714[var10[var11]] = (short) arg1.g2();
				}
			}
		}
		if (var8) {
			int var12 = arg1.g1();
			int[] var13 = new int[] { var12 & 0xF, var12 >> 4 & 0xF };
			for (int var14 = 0; var14 < 2; var14++) {
				if (var13[var14] != 15) {
					var3.field8715[var13[var14]] = (short) arg1.g2();
				}
			}
		}
		return var3;
	}
}
