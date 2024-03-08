package com.jagex;

import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("afx")
public class class858 extends class140 {

	@ObfuscatedName("afx.o")
	public final GpuRenderer field10244;

	@ObfuscatedName("afx.s")
	public final GpuTexture field10247;

	@ObfuscatedName("afx.y")
	public final VertexBuffer field10246;

	@ObfuscatedName("afx.q")
	public float[][] field10245;

	public class858(GpuRenderer arg0, class733 arg1, class136 arg2, boolean arg3) {
		super(arg0, arg1);
		this.field10244 = arg0;
		int[] var5 = new int[this.field1667.field8572 * this.field1667.field8571];
		if (arg3) {
			Object var6 = null;
			byte[] var8;
			if (arg2.method2587()) {
				class852 var7 = (class852) arg2;
				var8 = var7.method2644() ? var7.field10228 : var7.field10227;
				if (!var7.method2644()) {
					for (int var9 = 0; var9 < var8.length; var9++) {
						var8[var9] = (byte) (var8[var9] == 0 ? 0 : -1);
					}
				}
			} else {
				class851 var10 = (class851) arg2;
				int[] var11 = var10.method2604(false);
				var8 = new byte[var11.length];
				if (var10.method2644()) {
					for (int var15 = 0; var15 < var8.length; var15++) {
						var8[var15] = (byte) (var5[var15] >> 24 & 0xFF);
					}
				} else {
					for (int var12 = 0; var12 < var8.length; var12++) {
						int var13 = var11[var12];
						byte var14 = (byte) ((var13 & 0xFF) + (var13 >> 16 & 0xFF) * 3 + (var13 >> 8 & 0xFF) * 4 >> 3);
						var8[var12] = var14;
					}
				}
			}
			for (int var16 = 0; var16 < var8.length; var16++) {
				var5[var16] = var8[var16] << 24 | 0xFFFFFF;
			}
		} else if (arg2.method2587()) {
			class852 var17 = (class852) arg2;
			int[] var18 = var17.field10226;
			byte[] var19 = var17.field10228;
			byte[] var20 = var17.field10227;
			if (var19 == null) {
				for (int var22 = 0; var22 < var20.length; var22++) {
					byte var23;
					if ((var23 = var20[var22]) != 0) {
						var5[var22] = var18[var23 & 0xFF] | 0xFF000000;
					}
				}
			} else {
				for (int var21 = 0; var21 < var19.length; var21++) {
					var5[var21] = var19[var21] << 24 | var18[var20[var21] & 0xFF];
				}
			}
		} else {
			class851 var24 = (class851) arg2;
			int[] var25 = var24.method2604(false);
			if (var24.method2644()) {
				for (int var28 = 0; var28 < var5.length; var28++) {
					var5[var28] = var25[var28];
				}
			} else {
				for (int var26 = 0; var26 < var5.length; var26++) {
					int var27 = var25[var26] & 0xFFFFFF;
					var5[var26] = (var27 == 0 ? 0 : 255) << 24 | var27;
				}
			}
		}
		this.field10247 = arg0.method16204(this.field1667.field8571, this.field1667.field8572, false, var5);
		this.field10247.method5824(this.field1667.field8570 == 1 ? class343.field3322 : class343.field3323);
		this.field10246 = arg0.method16085(false);
		this.field10246.method5553(20480, 20);
		ByteBuffer var29 = this.field10244.field10071;
		var29.clear();
		this.field10245 = new float[256][4];
		float var30 = 1.0F / (float) this.field1667.field8571;
		float var31 = 1.0F / (float) this.field1667.field8572;
		for (int var32 = 0; var32 < 256; var32++) {
			short[] var33 = this.field1667.method14561(var32);
			this.field10245[var32][0] = (float) var33[0] * var30;
			this.field10245[var32][1] = (float) var33[1] * var31;
			this.field10245[var32][2] = (float) (var33[0] + var33[2]) * var30;
			this.field10245[var32][3] = (float) (var33[1] + var33[3]) * var31;
			int var34 = this.field1667.method14558(var32);
			int var35 = this.field1667.method14529(var32);
			var29.putFloat(0.0F);
			var29.putFloat(0.0F);
			var29.putFloat(0.0F);
			var29.putFloat(this.field10245[var32][0]);
			var29.putFloat(this.field10245[var32][1]);
			var29.putFloat(0.0F);
			var29.putFloat((float) var35);
			var29.putFloat(0.0F);
			var29.putFloat(this.field10245[var32][0]);
			var29.putFloat(this.field10245[var32][3]);
			var29.putFloat((float) var34);
			var29.putFloat((float) var35);
			var29.putFloat(0.0F);
			var29.putFloat(this.field10245[var32][2]);
			var29.putFloat(this.field10245[var32][3]);
			var29.putFloat((float) var34);
			var29.putFloat(0.0F);
			var29.putFloat(0.0F);
			var29.putFloat(this.field10245[var32][2]);
			var29.putFloat(this.field10245[var32][1]);
		}
		this.field10246.method5738(0, var29.position(), this.field10244.field10046);
	}

	@ObfuscatedName("afx.s(CIIIZ)V")
	public void method2690(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field10244.method16337() != class326.field3236) {
			int var6 = arg2 + this.field1667.method14560(arg0);
			float var7 = (float) this.field1667.method14558(arg0);
			float var8 = (float) this.field1667.method14529(arg0);
			this.field10244.field10146.method5797((float) arg1, (float) var6, (float) arg1 + var7, (float) var6 + var8, this.field10245[arg0][0], this.field10245[arg0][1], this.field10245[arg0][2], this.field10245[arg0][3], this.field10247, arg3);
			return;
		}
		this.field10244.method15981();
		this.field10244.method16054(1);
		class288 var9 = this.field10244.field10149;
		var9.field2997 = this.field10247;
		var9.method5050(0, arg3);
		float var10 = (float) this.field10244.method2135().method1627();
		float var11 = (float) this.field10244.method2135().method1628();
		var9.field2995.method6612(2.0F / var10, 2.0F / var11, 1.0F, 1.0F);
		var9.field2995.field4315[12] = ((float) arg1 + this.field10244.method15954()) * 2.0F / var10 - 1.0F;
		var9.field2995.field4315[13] = ((float) arg2 + this.field10244.method15954()) * 2.0F / var11 - 1.0F;
		var9.field2995.field4315[14] = -1.0F;
		var9.field2998.method6603();
		var9.field3000 = this.field10246;
		var9.field3001 = arg0 * 4;
		var9.field2994 = this.field10244.field10203;
		var9.method5051();
	}

	@ObfuscatedName("afx.y(CIIIZLch;II)V")
	public void method2697(char arg0, int arg1, int arg2, int arg3, boolean arg4, class103 arg5, int arg6, int arg7) {
	}
}
