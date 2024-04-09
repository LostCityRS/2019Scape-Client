package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("apf")
public class GlEnvironmentSampler_Sub1 extends GlEnvironmentSampler {

	@ObfuscatedName("apf.e")
	public final GlToolkit field11944;

	@ObfuscatedName("apf.n")
	public GlCubeTexture field11941;

	@ObfuscatedName("apf.m")
	public static final int[] field11943 = new int[4];

	@ObfuscatedName("apf.k")
	public static final int[] field11942 = new int[4];

	public GlEnvironmentSampler_Sub1(GlToolkit arg0, int arg1) {
		this.field11944 = arg0;
		this.field11941 = new GlCubeTexture(arg0, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg1);
	}

	@ObfuscatedName("apf.m()I")
	public int method18982() {
		return this.field11941.field9279;
	}

	@ObfuscatedName("apf.e()Ladq;")
	public GlCubeTexture method15649() {
		return this.field11941;
	}

	@ObfuscatedName("apf.k(Ladq;Ladq;F)Z")
	public boolean method18984(GlCubeTexture arg0, GlCubeTexture arg1, float arg2) {
		boolean var4 = true;
		GlFrameBuffer var5 = this.field11944.field9877;
		this.field11944.method2171(field11943);
		this.field11944.resetClip();
		this.field11944.method2326(field11942);
		this.field11944.method15748();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.field11941.field9279, this.field11941.field9279);
		this.field11944.method15738(false);
		this.field11944.method15764(false);
		this.field11944.method15788(false);
		this.field11944.method15789(false);
		this.field11944.method15774(-2);
		this.field11944.method15776(1);
		this.field11944.method15783(0.0F, 0.0F, 0.0F, arg2);
		this.field11944.method15810(34165, 34165);
		this.field11944.method15777(arg1);
		this.field11944.method15776(0);
		this.field11944.method15778(1);
		this.field11944.method15777(arg0);
		this.field11944.method2142(var5);
		for (int var6 = 0; var6 < 6; var6++) {
			int var7 = var6 + 34069;
			var5.method15439(0, this.field11941.method15332(var7, 0));
			var5.method18966(0);
			if (!var5.method15446()) {
				var4 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(var7) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		var5.method15439(0, null);
		this.field11944.method2143(var5);
		this.field11944.method15776(1);
		this.field11944.method15777(null);
		this.field11944.method15810(8448, 8448);
		this.field11944.method15776(0);
		this.field11944.method15777(null);
		this.field11944.resetBounds(field11943[0], field11943[1], field11943[2], field11943[3]);
		this.field11944.method2164(field11942[0], field11942[1], field11942[2], field11942[3]);
		if (var4 && !this.field11944.isAmd) {
			this.field11941.method1084();
		}
		return var4;
	}
}
