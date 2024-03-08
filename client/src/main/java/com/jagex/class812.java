package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("adt")
public class class812 extends class70 {

	@ObfuscatedName("adt.s")
	public final int field9272;

	@ObfuscatedName("adt.y")
	public final int field9271;

	public class812(class849 arg0, int arg1, class109 arg2, class135 arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.field9272 = arg4;
		this.field9271 = arg5;
		this.field1006.method15777(this);
		OpenGL.glTexImage2Dub(this.field1009, 0, class849.method15799(this.field1002, this.field1010), arg4, arg5, 0, class849.method15899(this.field1002), 5121, null, 0);
		this.method1082(true);
	}

	public class812(class849 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, class109.field1271, class135.field1645, arg4 * arg5, false);
		this.field9272 = arg4;
		this.field9271 = arg5;
		this.field1006.method15777(this);
		class113 var7 = this.field1006.method2135();
		if (var7 != null) {
			int var8 = var7.method1628() - (arg3 + arg5);
			int var9 = class849.method15799(this.field1002, this.field1010);
			OpenGL.glCopyTexImage2D(this.field1009, 0, var9, arg2, var8, arg4, arg5, 0);
		}
		this.method1082(true);
	}

	public class812(class849 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, boolean arg8) {
		super(arg0, arg1, class109.field1273, class135.field1645, arg2 * arg3, arg4);
		this.field9272 = arg2;
		this.field9271 = arg3;
		if (arg8) {
			int[] var10 = new int[arg5.length];
			for (int var11 = 0; var11 < arg3; var11++) {
				int var12 = arg2 * var11;
				int var13 = (arg3 - var11 - 1) * arg2;
				for (int var14 = 0; var14 < arg2; var14++) {
					var10[var12++] = arg5[var13++];
				}
			}
			arg5 = var10;
		}
		this.field1006.method15777(this);
		if (this.field1009 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method1109(this.field1009, class849.method15799(this.field1002, this.field1010), this.field9272, this.field9271, 32993, this.field1006.field9862, arg5);
			this.method1118(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.field1009, 0, class849.method15799(this.field1002, this.field1010), this.field9272, this.field9271, 0, 32993, this.field1006.field9862, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method1118(false);
		}
		this.method1082(true);
	}

	public class812(class849 arg0, int arg1, class109 arg2, class135 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class109 arg8, boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.field9272 = arg4;
		this.field9271 = arg5;
		if (arg9) {
			byte[] var11 = new byte[arg7.length];
			for (int var12 = 0; var12 < arg5; var12++) {
				int var13 = arg4 * var12;
				int var14 = (arg5 - var12 - 1) * arg4;
				for (int var15 = 0; var15 < arg4; var15++) {
					var11[var13++] = arg7[var14++];
				}
			}
			arg7 = var11;
		}
		this.field1006.method15777(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.field1009 != 34037) {
			method1107(arg1, class849.method15799(this.field1002, this.field1010), arg4, arg5, arg8, arg7);
			this.method1118(true);
		} else {
			OpenGL.glTexImage2Dub(this.field1009, 0, class849.method15799(this.field1002, this.field1010), this.field9272, this.field9271, 0, class849.method15899(arg8), 5121, arg7, 0);
			this.method1118(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method1082(true);
	}

	public class812(class849 arg0, int arg1, class109 arg2, class135 arg3, int arg4, int arg5, boolean arg6, float[] arg7, class109 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.field9272 = arg4;
		this.field9271 = arg5;
		this.field1006.method15777(this);
		if (arg6 && this.field1009 != 34037) {
			method1091(arg1, class849.method15799(this.field1002, this.field1010), arg4, arg5, arg8, arg7);
			this.method1118(true);
		} else {
			OpenGL.glTexImage2Df(this.field1009, 0, class849.method15799(this.field1002, this.field1010), this.field9272, this.field9271, 0, class849.method15899(arg8), 5126, arg7, 0);
			this.method1118(false);
		}
		this.method1082(true);
	}

	@ObfuscatedName("adt.ar(ZZ)V")
	public void method15312(boolean arg0, boolean arg1) {
		if (this.field1009 == 3553) {
			this.field1006.method15777(this);
			OpenGL.glTexParameteri(this.field1009, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.field1009, 10243, arg1 ? 10497 : 33071);
		}
	}

	@ObfuscatedName("adt.ap(IIII[BLck;IIZ)V")
	public void method15331(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class109 arg5, int arg6, int arg7, boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			int var10 = arg5.field1279;
			int var11 = arg2 * var10;
			int var12 = arg7 * var10;
			byte[] var13 = new byte[arg3 * var11];
			for (int var14 = 0; var14 < arg3; var14++) {
				int var15 = var11 * var14;
				int var16 = (arg3 - var14 - 1) * var12 + arg6;
				for (int var17 = 0; var17 < var11; var17++) {
					var13[var15++] = arg4[var16++];
				}
			}
			arg4 = var13;
		}
		this.field1006.method15777(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg7) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.field1009, 0, arg0, this.field9271 - arg1 - arg3, arg2, arg3, class849.method15899(arg5), 5121, arg4, arg6);
		if (arg2 != arg7) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@ObfuscatedName("adt.aq(IIII[IIIZ)V")
	public void method15313(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			int[] var9 = new int[arg2 * arg3];
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg2 * var10;
				int var12 = (arg3 - var10 - 1) * arg6 + arg5;
				for (int var13 = 0; var13 < arg2; var13++) {
					var9[var11++] = arg4[var12++];
				}
			}
			arg4 = var9;
		}
		this.field1006.method15777(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.field1009, 0, arg0, this.field9271 - arg1 - arg3, arg2, arg3, 32993, this.field1006.field9862, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@ObfuscatedName("adt.ax(IIII[I[II)V")
	public void method15314(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		int[] var8 = arg5 == null ? new int[this.field9272 * this.field9271] : arg5;
		this.field1006.method15777(this);
		OpenGL.glGetTexImagei(this.field1009, 0, 32993, 5121, var8, 0);
		for (int var9 = 0; var9 < arg3; var9++) {
			System.arraycopy(var8, (arg3 - 1 + arg1 - var9) * this.field9272, arg4, arg2 * var9 + arg6, arg2);
		}
	}

	@ObfuscatedName("adt.av(IIIIII)V")
	public void method15315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class113 var7 = this.field1006.method2135();
		if (var7 != null) {
			int var8 = var7.method1628() - (arg3 + arg5);
			this.field1006.method15777(this);
			OpenGL.glCopyTexSubImage2D(this.field1009, 0, arg0, this.field9271 - (arg1 + arg3), arg4, var8, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@ObfuscatedName("adt.ao(I)Ldw;")
	public class126 method15320(int arg0) {
		return new class97(this, arg0);
	}

	@ObfuscatedName("adt.aj(I)Ldp;")
	public class130 method15317(int arg0) {
		return new class97(this, arg0);
	}
}
