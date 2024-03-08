package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("adu")
public class class811 extends class70 {

	@ObfuscatedName("adu.s")
	public final int field9269;

	@ObfuscatedName("adu.y")
	public final int field9268;

	@ObfuscatedName("adu.q")
	public final int field9270;

	public class811(class849 arg0, class109 arg1, class135 arg2, int arg3, int arg4, int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.field9269 = arg3;
		this.field9268 = arg4;
		this.field9270 = arg5;
		this.field1006.method15777(this);
		OpenGL.glTexImage3Dub(this.field1009, 0, class849.method15799(this.field1002, this.field1010), this.field9269, this.field9268, this.field9270, 0, class849.method15899(this.field1002), 5121, null, 0);
		this.method1082(true);
	}

	public class811(class849 arg0, class109 arg1, class135 arg2, int arg3, int arg4, int arg5, byte[] arg6, class109 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.field9269 = arg3;
		this.field9268 = arg4;
		this.field9270 = arg5;
		this.field1006.method15777(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.field1009, 0, class849.method15799(this.field1002, this.field1010), this.field9269, this.field9268, this.field9270, 0, class849.method15899(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method1082(true);
	}

	@ObfuscatedName("adu.ar(IIIIIII)V")
	public void method15310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field1006.method15777(this);
		OpenGL.glCopyTexSubImage3D(this.field1009, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}
}
