package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aew")
public class GlUnderwaterTexture extends GlTexture {

	@ObfuscatedName("aew.s")
	public final int field9280;

	public GlUnderwaterTexture(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, byte[] arg4, TextureFormat arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.field9280 = arg3;
		this.field1006.method15777(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.field1009, 0, GlToolkit.method15799(this.field1002, this.field1010), this.field9280, 0, GlToolkit.method15899(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method1082(true);
	}

	@ObfuscatedName("aew.ar(Z)V")
	public void method15334(boolean arg0) {
		this.field1006.method15777(this);
		OpenGL.glTexParameteri(this.field1009, 10242, arg0 ? 10497 : 33071);
	}
}
