package com.jagex.graphics.gl;

import com.jagex.core.io.Packet;
import com.jagex.game.client.DataType;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;

@ObfuscatedName("bt")
public class GlFloorModelRelated4 {

	@ObfuscatedName("bt.m")
	public final GlToolkit field990;

	@ObfuscatedName("bt.k")
	public final GlFloorModelRelated3 field995;

	@ObfuscatedName("bt.f")
	public final int field991;

	@ObfuscatedName("bt.w")
	public final int field992;

	@ObfuscatedName("bt.l")
	public boolean field988 = true;

	@ObfuscatedName("bt.u")
	public int field994 = -1;

	@ObfuscatedName("bt.z")
	public final int field996;

	@ObfuscatedName("bt.p")
	public GlBinding field997;

	@ObfuscatedName("bt.d")
	public GlFloorModelRelated2_Sub1 field998;

	@ObfuscatedName("bt.c")
	public GlTexture_Sub1 field999;

	public GlFloorModelRelated4(GlToolkit arg0, GlFloorModelRelated3 arg1, GlFloorModel arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field990 = arg0;
		this.field995 = arg1;
		this.field991 = arg6;
		this.field992 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		for (int var13 = 0; var13 < var9; var13++) {
			int var14 = arg2.field1235 * (var12 + var13) + var11;
			for (int var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.field9460[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		this.field996 = var10;
		if (var10 > 0) {
			Packet var17 = new Packet(var10 * 2);
			if (this.field990.field10017) {
				for (int var18 = 0; var18 < var9; var18++) {
					int var19 = arg2.field1235 * (var12 + var18) + var11;
					for (int var20 = 0; var20 < var9; var20++) {
						short[] var21 = arg2.field9460[var19++];
						if (var21 != null) {
							for (int var22 = 0; var22 < var21.length; var22++) {
								var17.p2(var21[var22] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (int var23 = 0; var23 < var9; var23++) {
					int var24 = arg2.field1235 * (var12 + var23) + var11;
					for (int var25 = 0; var25 < var9; var25++) {
						short[] var26 = arg2.field9460[var24++];
						if (var26 != null) {
							for (int var27 = 0; var27 < var26.length; var27++) {
								var17.ip2(var26[var27] & 0xFFFF);
							}
						}
					}
				}
			}
			this.field997 = this.field990.method15766(5123, var17.data, var17.pos, false);
			this.field998 = new GlFloorModelRelated2_Sub1(this.field990, 5123, null, 1);
		} else {
			this.field999 = null;
		}
	}

	@ObfuscatedName("bt.e()V")
	public void method1067() {
		this.method1073(this.field997, this.field996);
	}

	@ObfuscatedName("bt.n([BI)V")
	public void method1079(byte[] arg0, int arg1) {
		this.field998.method1410(5123, arg0, arg1 * 2);
		this.method1073(this.field998, arg1);
	}

	@ObfuscatedName("bt.m(Lcf;I)V")
	public void method1073(GlBinding arg0, int arg1) {
		if (arg1 != 0) {
			this.method1069();
			this.field990.method15777(this.field999);
			this.field990.method15921(arg0, 4, 0, arg1);
		}
	}

	@ObfuscatedName("bt.k()V")
	public void method1069() {
		if (!this.field988) {
			return;
		}
		this.field988 = false;
		byte[] var1 = this.field995.field1154;
		byte[] var2 = this.field990.field10020;
		int var3 = 0;
		int var4 = this.field995.field1152;
		int var5 = this.field995.field1152 * this.field992 + this.field991;
		for (int var6 = -128; var6 < 0; var6++) {
			var3 = (var3 << 8) - var3;
			for (int var7 = -128; var7 < 0; var7++) {
				if (var1[var5++] != 0) {
					var3++;
				}
			}
			var5 += var4 - 128;
		}
		if (this.field999 != null && this.field994 == var3) {
			this.field988 = false;
			return;
		}
		this.field994 = var3;
		int var8 = 0;
		int var9 = this.field992 * var4 + this.field991;
		for (int var10 = -128; var10 < 0; var10++) {
			for (int var11 = -128; var11 < 0; var11++) {
				if (var1[var9] == 0) {
					int var12 = 0;
					if (var1[var9 - 1] != 0) {
						var12++;
					}
					if (var1[var9 + 1] != 0) {
						var12++;
					}
					if (var1[var9 - var4] != 0) {
						var12++;
					}
					if (var1[var4 + var9] != 0) {
						var12++;
					}
					var2[var8++] = (byte) (var12 * 17);
				} else {
					var2[var8++] = 68;
				}
				var9++;
			}
			var9 += this.field995.field1152 - 128;
		}
		if (this.field999 == null) {
			this.field999 = new GlTexture_Sub1(this.field990, 3553, TextureFormat.ALPHA, DataType.UNSIGNED_INT_8, 128, 128, false, this.field990.field10020, TextureFormat.ALPHA, false);
			this.field999.method15312(false, false);
			this.field999.method1082(true);
		} else {
			this.field999.method15331(0, 0, 128, 128, this.field990.field10020, TextureFormat.ALPHA, 0, 0, false);
		}
	}
}
