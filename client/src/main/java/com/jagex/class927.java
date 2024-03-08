package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aig")
public class class927 extends class485 implements class359 {

	@ObfuscatedName("aig.v")
	public final int field10671;

	@ObfuscatedName("aig.o")
	public final int field10672;

	@ObfuscatedName("aig.s")
	public final float field10673;

	@ObfuscatedName("aig.y")
	public final float field10674;

	public class927(class1127 arg0, class109 arg1, class135 arg2, int arg3, int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.field4980.field12022) {
			this.field10671 = arg3;
			this.field10672 = arg4;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = class783.method16657(arg3);
			this.field10672 = class783.method16657(arg4);
			this.field10673 = (float) arg3 / (float) this.field10671;
			this.field10674 = (float) arg4 / (float) this.field10672;
		}
		this.field4980.method16092(this);
		OpenGL.glTexImage2Dub(this.field4979, 0, class1127.method19077(this.field4973, this.field4977), arg3, arg4, 0, class1127.method19085(this.field4973), class1127.method19076(this.field4977), null, 0);
	}

	public class927(class1127 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, 3553, class109.field1273, class135.field1645, arg1 * arg2, arg3);
		if (this.field4980.field12022) {
			this.field10671 = arg1;
			this.field10672 = arg2;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = class783.method16657(arg1);
			this.field10672 = class783.method16657(arg2);
			this.field10673 = (float) arg1 / (float) this.field10671;
			this.field10674 = (float) arg2 / (float) this.field10672;
			if (this.field10671 != arg1 || this.field10672 != arg2) {
				arg4 = this.field4980.method2250(arg1, arg2, this.field10671, this.field10672, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.field10671;
			}
		}
		this.field4980.method16092(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method7638(this.field4979, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.field4979, 0, 6408, this.field10671, this.field10672, 0, 32993, this.field4980.field12027, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public class927(class1127 arg0, class109 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, class135.field1645, arg2 * arg3, arg4);
		if (this.field4980.field12022) {
			this.field10671 = arg2;
			this.field10672 = arg3;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = class783.method16657(arg2);
			this.field10672 = class783.method16657(arg3);
			this.field10673 = (float) arg2 / (float) this.field10671;
			this.field10674 = (float) arg3 / (float) this.field10672;
			if (this.field10671 != arg2 || this.field10672 != arg3) {
				arg5 = this.field4980.method2256(arg2, arg3, this.field10671, this.field10672, arg5, arg6, arg7, arg1.field1279);
				arg6 = 0;
				arg7 = this.field10671;
			}
		}
		this.field4980.method16092(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method7634(this.field4979, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (class109.field1276 == this.field4973) {
				OpenGL.glCompressedTexImage2Dub(this.field4979, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (class109.field1277 == this.field4973) {
				OpenGL.glCompressedTexImage2Dub(this.field4979, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.field4979, 0, class1127.method19077(this.field4973, this.field4977), arg2, arg3, 0, class1127.method19085(this.field4973), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public class927(class1127 arg0, class109 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, class135.field1642, arg2 * arg3, arg4);
		if (this.field4980.field12022) {
			this.field10671 = arg2;
			this.field10672 = arg3;
			this.field10673 = 1.0F;
			this.field10674 = 1.0F;
		} else {
			this.field10671 = class783.method16657(arg2);
			this.field10672 = class783.method16657(arg3);
			this.field10673 = (float) arg2 / (float) this.field10671;
			this.field10674 = (float) arg3 / (float) this.field10672;
			if (this.field10671 != arg2 || this.field10672 != arg3) {
				arg5 = this.field4980.method2230(arg2, arg3, this.field10671, this.field10672, arg5, arg6, arg7, arg1.field1279);
				arg6 = 0;
				arg7 = this.field10671;
			}
		}
		this.field4980.method16092(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method7635(this.field4979, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.field4979, 0, class1127.method19077(this.field4973, this.field4977), arg2, arg3, 0, class1127.method19085(this.field4973), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@ObfuscatedName("aig.e()I")
	public int method5718() {
		return this.field10671;
	}

	@ObfuscatedName("aig.n()I")
	public int method5696() {
		return this.field10672;
	}

	@ObfuscatedName("aig.k(F)F")
	public float method5697(float arg0) {
		return arg0 / (float) this.field10671;
	}

	@ObfuscatedName("aig.f(F)F")
	public float method5698(float arg0) {
		return arg0 / (float) this.field10672;
	}

	@ObfuscatedName("aig.v()F")
	public float method5734() {
		return this.field10673;
	}

	@ObfuscatedName("aig.o()F")
	public float method5707() {
		return this.field10674;
	}

	@ObfuscatedName("aig.w()Z")
	public boolean method5732() {
		return true;
	}

	@ObfuscatedName("aig.l(ZZ)V")
	public void method5700(boolean arg0, boolean arg1) {
		this.field4980.method16092(this);
		OpenGL.glTexParameteri(this.field4979, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.field4979, 10243, arg1 ? 10497 : 33071);
	}

	@ObfuscatedName("aig.z(IIII[III)V")
	public void method5701(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field4980.method16092(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.field4979, 0, arg0, arg1, arg2, arg3, 32993, this.field4980.field12027, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@ObfuscatedName("aig.p(IIII[BLck;II)V")
	public void method5712(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class109 arg5, int arg6, int arg7) {
		this.field4980.method16092(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.field4979, 0, arg0, arg1, arg2, arg3, class1127.method19085(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@ObfuscatedName("aig.d(IIII[II)V")
	public void method5703(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		this.method5704(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@ObfuscatedName("aig.c(IIII[I[II)V")
	public void method5704(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
		int[] var8 = arg5 == null ? new int[this.field10672 * this.field10671] : arg5;
		this.field4980.method16092(this);
		OpenGL.glGetTexImagei(this.field4979, 0, 32993, 5121, var8, 0);
		for (int var9 = 0; var9 < arg3; var9++) {
			System.arraycopy(var8, this.field10671 * var9, arg4, arg2 * var9 + arg6, arg2);
		}
	}

	@ObfuscatedName("aig.r(IIIIII)V")
	public void method5719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field4980.method16092(this);
		class113 var7 = this.field4980.method2135();
		if (var7 != null) {
			int var8 = var7.method1628() - (arg3 + arg5);
			int var9 = class1127.method19077(this.field4973, this.field4977);
			OpenGL.glCopyTexImage2D(this.field4979, 0, var9, arg4, var8, arg2, arg3, 0);
		}
	}

	@ObfuscatedName("aig.ak(I)Ldp;")
	public class130 method5828(int arg0) {
		return new class484(this, arg0);
	}

	@ObfuscatedName("aig.s()Z")
	public boolean method5708() {
		return super.method5708();
	}

	@ObfuscatedName("aig.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("aig.ay(Llt;)V")
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("aig.m()V")
	public void method1010() {
		super.method1010();
	}
}
