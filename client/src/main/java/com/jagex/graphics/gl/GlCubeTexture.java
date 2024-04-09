package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.GraphicsDeletable;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("adq")
public class GlCubeTexture extends GlTexture {

	@ObfuscatedName("adq.a")
	public final int field9279;

	public GlCubeTexture(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.field9279 = arg3;
		this.field1006.method15777(this);
		for (int var5 = 0; var5 < 6; var5++) {
			OpenGL.glTexImage2Dub(var5 + 34069, 0, GlToolkit.method15799(this.field1002, this.field1010), arg3, arg3, 0, GlToolkit.method15899(this.field1002), 5121, null, 0);
		}
		this.method1082(true);
	}

	public GlCubeTexture(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, boolean arg4, int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.field9279 = arg3;
		this.field1006.method15777(this);
		if (arg4) {
			for (int var7 = 0; var7 < 6; var7++) {
				method1109(var7 + 34069, GlToolkit.method15799(this.field1002, this.field1010), arg3, arg3, 32993, this.field1006.field9862, arg5[var7]);
			}
		} else {
			for (int var8 = 0; var8 < 6; var8++) {
				OpenGL.glTexImage2Di(var8 + 34069, 0, GlToolkit.method15799(this.field1002, this.field1010), arg3, arg3, 0, 32993, this.field1006.field9862, arg5[var8], 0);
			}
		}
		this.method1082(true);
	}

	public GlCubeTexture(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, boolean arg4, byte[][] arg5, TextureFormat arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.field9279 = arg3;
		this.field1006.method15777(this);
		for (int var8 = 0; var8 < 6; var8++) {
			OpenGL.glTexImage2Dub(var8 + 34069, 0, GlToolkit.method15799(this.field1002, this.field1010), arg3, arg3, 0, GlToolkit.method15899(arg6), 5121, arg5[var8], 0);
		}
		this.method1082(true);
	}

	@ObfuscatedName("adq.ar(II)Ldp;")
	public GraphicsDeletable method15332(int arg0, int arg1) {
		return new GlCubeTextureRelated(this, arg0, arg1);
	}
}
