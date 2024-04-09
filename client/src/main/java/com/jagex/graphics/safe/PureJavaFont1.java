package com.jagex.graphics.safe;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("afh")
public class PureJavaFont1 extends Font {

	@ObfuscatedName("afh.o")
	public PureJavaToolkit field10229;

	@ObfuscatedName("afh.s")
	public Sprite[] field10230;

	@ObfuscatedName("afh.y")
	public Sprite[] field10231;

	public PureJavaFont1(PureJavaToolkit arg0, FontMetrics arg1, FullSpriteData arg2) {
		super(arg0, arg1);
		this.field10229 = arg0;
		this.field10229 = arg0;
		int[] var4 = arg2.method2604(false);
		int[] var5 = (int[]) var4.clone();
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			byte var8 = (byte) ((var7 & 0xFF) + (var7 >> 16 & 0xFF) * 3 + (var7 >> 8 & 0xFF) * 4 >> 3);
			var5[var6] = var5[var6] & 0xFF000000 | var8 << 16 | var8 << 8 | var8;
		}
		this.field10230 = new Sprite[256];
		this.field10231 = new Sprite[256];
		for (int var9 = 0; var9 < 256; var9++) {
			int var10 = this.fontMetrics.method14558(var9);
			int var11 = this.fontMetrics.method14529(var9);
			short[] var12 = this.fontMetrics.method14561(var9);
			short var13 = var12[0];
			short var14 = var12[1];
			int[] var15 = new int[var10 * var11];
			for (int var16 = 0; var16 < var11; var16++) {
				for (int var17 = 0; var17 < var10; var17++) {
					var15[var10 * var16 + var17] = var4[this.fontMetrics.field8570 * var17 + this.fontMetrics.field8571 * (this.fontMetrics.field8570 * var16 + var14) + var13];
				}
			}
			int[] var18 = new int[var10 * var11];
			for (int var19 = 0; var19 < var11; var19++) {
				for (int var20 = 0; var20 < var10; var20++) {
					var18[var10 * var19 + var20] = var5[this.fontMetrics.field8570 * var20 + this.fontMetrics.field8571 * (this.fontMetrics.field8570 * var19 + var14) + var13];
				}
			}
			this.field10230[var9] = this.field10229.createSprite(var15, 0, var10, var10, var11, false);
			this.field10231[var9] = this.field10229.createSprite(var18, 0, var10, var10, var11, false);
		}
	}

	@ObfuscatedName("afh.s(CIIIZ)V")
	public void drawChar(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field10229.colour == null) {
			return;
		}
		int var6 = arg2 + this.fontMetrics.method14560(arg0);
		if (arg4) {
			this.field10231[arg0].drawSprite(arg1, var6, 1, arg3, 1);
		} else {
			this.field10230[arg0].drawSprite(arg1, var6, 1, arg3, 1);
		}
	}

	@ObfuscatedName("afh.y(CIIIZLch;II)V")
	public void drawChar2(char arg0, int arg1, int arg2, int arg3, boolean arg4, SpriteRelated arg5, int arg6, int arg7) {
	}
}
