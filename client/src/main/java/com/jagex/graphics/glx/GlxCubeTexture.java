package com.jagex.graphics.glx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GpuCubeTexture;
import com.jagex.graphics.GpuTextureRelated;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ail")
public class GlxCubeTexture extends GlxBaseTexture implements GpuCubeTexture {

	public GlxCubeTexture(GlxToolkit arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, 34067, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg1 * arg1 * 6, arg2);
		for (int var5 = 0; var5 < 6; var5++) {
			for (int var6 = 0; var6 < arg3[var5].length; var6++) {
				int var7 = arg3[var5][var6];
				arg3[var5][var6] = var7 & 0xFF00FF00 | (var7 & 0xFF) << 16 | var7 >> 16 & 0xFF;
			}
		}
		this.field4980.setTexture(this);
		if (arg2) {
			for (int var8 = 0; var8 < 6; var8++) {
				this.method7638(var8 + 34069, arg1, arg1, arg3[var8]);
			}
		} else {
			for (int var9 = 0; var9 < 6; var9++) {
				OpenGL.glTexImage2Di(var9 + 34069, 0, GlxToolkit.method19077(this.field4973, this.field4977), arg1, arg1, 0, GlxToolkit.method19085(this.field4973), this.field4980.field12027, arg3[var9], 0);
			}
		}
	}

	@ObfuscatedName("ail.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("ail.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("ail.m()V")
	public void delete() {
		super.delete();
	}
}
