package com.jagex.graphics.gl;

import com.jagex.core.datastruct.Node;
import com.jagex.graphics.GpuPacket;
import com.jagex.graphics.Material;
import com.jagex.graphics.WaterFogData;
import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("akn")
public class GlFloorModelRelated1 extends Node {

	@ObfuscatedName("akn.k")
	public final GlToolkit field11291;

	@ObfuscatedName("akn.f")
	public final GlFloorModel field11300;

	@ObfuscatedName("akn.w")
	public final int field11296;

	@ObfuscatedName("akn.l")
	public final float field11294;

	@ObfuscatedName("akn.u")
	public final WaterFogData field11295;

	@ObfuscatedName("akn.z")
	public GlRelated3 field11298;

	@ObfuscatedName("akn.p")
	public GlFloorModelRelated2_Sub1 field11297;

	@ObfuscatedName("akn.d")
	public int[] field11292;

	@ObfuscatedName("akn.c")
	public NativeHeapBuffer field11299;

	@ObfuscatedName("akn.r")
	public Stream field11293;

	public GlFloorModelRelated1(GlFloorModel arg0, int arg1, int arg2, WaterFogData arg3) {
		this.field11300 = arg0;
		this.field11291 = this.field11300.field9453;
		this.field11296 = arg1;
		this.field11294 = arg2;
		this.field11295 = arg3;
		this.field11292 = new int[this.field11300.field1235 * this.field11300.field1234];
		this.field11297 = new GlFloorModelRelated2_Sub1(this.field11291, 5123, null, 1);
	}

	@ObfuscatedName("akn.e(I)V")
	public void method17578(int arg0) {
		this.field11299 = this.field11291.field9876.method92(arg0 * 4, true);
		this.field11293 = new Stream(this.field11299);
	}

	@ObfuscatedName("akn.n(I)V")
	public void method17581(int arg0) {
		this.field11293.method56(arg0 * 4 + 3);
		this.field11293.method57(-1);
	}

	@ObfuscatedName("akn.m(III)V")
	public void method17580(int arg0, int arg1, int arg2) {
		this.field11292[this.field11300.field1235 * arg1 + arg0] |= 0x1 << arg2;
	}

	@ObfuscatedName("akn.k(IIIF)V")
	public void method17582(int arg0, int arg1, int arg2, float arg3) {
		if (this.field11296 != -1) {
			Material var5 = this.field11291.materialList.get(this.field11296);
			int var6 = var5.field1364 & 0xFF;
			if (var6 != 0 && var5.effect != 4) {
				int var7;
				if (arg2 < 0) {
					var7 = 0;
				} else if (arg2 > 127) {
					var7 = 16777215;
				} else {
					var7 = arg2 * 131586;
				}
				if (var6 == 256) {
					arg1 = var7;
				} else {
					int var9 = 256 - var6;
					arg1 = ((arg1 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) + ((arg1 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
				}
			}
			int var10 = var5.field1363 & 0xFF;
			if (var10 != 0) {
				var10 += 256;
				int var11 = (arg1 >> 16 & 0xFF) * var10;
				if (var11 > 65535) {
					var11 = 65535;
				}
				int var12 = (arg1 >> 8 & 0xFF) * var10;
				if (var12 > 65535) {
					var12 = 65535;
				}
				int var13 = (arg1 & 0xFF) * var10;
				if (var13 > 65535) {
					var13 = 65535;
				}
				arg1 = (var13 >> 8) + ((var11 & 0xFF00) << 8) + (var12 & 0xFF00);
			}
		}
		if (arg3 != 1.0F) {
			int var14 = arg1 >> 16 & 0xFF;
			int var15 = arg1 >> 8 & 0xFF;
			int var16 = arg1 & 0xFF;
			int var17 = (int) ((float) var14 * arg3);
			if (var17 < 0) {
				var17 = 0;
			} else if (var17 > 255) {
				var17 = 255;
			}
			int var18 = (int) ((float) var15 * arg3);
			if (var18 < 0) {
				var18 = 0;
			} else if (var18 > 255) {
				var18 = 255;
			}
			int var19 = (int) ((float) var16 * arg3);
			if (var19 < 0) {
				var19 = 0;
			} else if (var19 > 255) {
				var19 = 255;
			}
			arg1 = var17 << 16 | var18 << 8 | var19;
		}
		this.field11293.method56(arg0 * 4);
		this.field11293.method57((byte) (arg1 >> 16));
		this.field11293.method57((byte) (arg1 >> 8));
		this.field11293.method57((byte) arg1);
	}

	@ObfuscatedName("akn.f(I)V")
	public void method17597(int arg0) {
		this.field11293.method60();
		GlInterfaceRelated var2 = this.field11291.method15804(4, this.field11299, arg0 * 4, false);
		if (var2 instanceof GlBufferRelated_Sub2) {
			this.field11299.method81();
		}
		this.field11298 = new GlRelated3(var2, 5121, 4, 0);
		this.field11299 = null;
		this.field11293 = null;
	}

	@ObfuscatedName("akn.w([II)V")
	public void method17583(int[] arg0, int arg1) {
		int var3 = 0;
		GpuPacket var4 = this.field11291.field10016;
		var4.pos = 0;
		if (this.field11291.field10017) {
			for (int var5 = 0; var5 < arg1; var5++) {
				int var6 = arg0[var5];
				short[] var7 = this.field11300.field9460[var6];
				int var8 = this.field11292[var6];
				if (var8 != 0 && var7 != null) {
					int var9 = 0;
					int var10 = 0;
					while (var10 < var7.length) {
						if ((var8 & 0x1 << var9++) == 0) {
							var10 += 3;
						} else {
							var4.p2(var7[var10++] & 0xFFFF);
							var3++;
							var4.p2(var7[var10++] & 0xFFFF);
							var3++;
							var4.p2(var7[var10++] & 0xFFFF);
							var3++;
						}
					}
				}
			}
		} else {
			for (int var11 = 0; var11 < arg1; var11++) {
				int var12 = arg0[var11];
				short[] var13 = this.field11300.field9460[var12];
				int var14 = this.field11292[var12];
				if (var14 != 0 && var13 != null) {
					int var15 = 0;
					int var16 = 0;
					while (var16 < var13.length) {
						if ((var14 & 0x1 << var15++) == 0) {
							var16 += 3;
						} else {
							var4.ip2(var13[var16++] & 0xFFFF);
							var3++;
							var4.ip2(var13[var16++] & 0xFFFF);
							var3++;
							var4.ip2(var13[var16++] & 0xFFFF);
							var3++;
						}
					}
				}
			}
		}
		if (var3 <= 0) {
			return;
		}
		this.field11297.method1410(5123, var4.data, var4.pos);
		this.field11291.method15809(this.field11300.field9456, this.field11300.field9480, this.field11298, this.field11300.field9476);
		this.field11291.method15795(this.field11296, (this.field11300.field9457 & 0x7) != 0, (this.field11300.field9457 & 0x8) != 0);
		if (this.field11291.field9840) {
			this.field11291.setWaterFog(Integer.MAX_VALUE, this.field11295);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.field11294, 1.0F / this.field11294, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.field11291.method15809(this.field11300.field9456, this.field11300.field9480, this.field11298, this.field11300.field9476);
		this.field11291.method15921(this.field11297, 4, 0, var3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
