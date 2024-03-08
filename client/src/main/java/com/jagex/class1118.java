package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("app")
public class class1118 extends class840 {

	@ObfuscatedName("app.m")
	public final class849 field11915;

	@ObfuscatedName("app.k")
	public int field11916;

	@ObfuscatedName("app.f")
	public int field11918;

	@ObfuscatedName("app.w")
	public int field11914;

	@ObfuscatedName("app.l")
	public int field11919;

	@ObfuscatedName("app.u")
	public int field11917;

	@ObfuscatedName("app.z")
	public class88 field11920;

	@ObfuscatedName("app.p")
	public final class88[] field11922 = new class88[4];

	public class1118(class849 arg0) {
		if (!arg0.field9985) {
			throw new IllegalStateException("");
		}
		this.field11915 = arg0;
		int[] var2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.field11916 = var2[0];
	}

	@ObfuscatedName("app.e()I")
	public int method1627() {
		return this.field11918;
	}

	@ObfuscatedName("app.n()I")
	public int method1628() {
		return this.field11914;
	}

	@ObfuscatedName("app.b(ILdp;)V")
	public void method15439(int arg0, class130 arg1) {
		int var3 = 0x1 << arg0;
		class88 var4 = (class88) arg1;
		if (arg1 == null) {
			this.field11919 &= ~var3;
			this.field11922[arg0] = null;
			if (this.field11919 == 0) {
				this.field11914 = 0;
				this.field11918 = 0;
			}
		} else {
			if ((this.field11919 | var3) == var3) {
				this.field11914 = var4.method1009();
				this.field11918 = var4.method1015();
				if (this.field11915.method2135() == this) {
					this.field11915.method15757();
				}
			} else if (this.field11918 != var4.method1015() || this.field11914 != var4.method1009()) {
				throw new RuntimeException();
			}
			this.field11919 |= var3;
			this.field11922[arg0] = var4;
		}
		if (this.field11915.method2135() == this) {
			this.method18962(arg0);
		} else {
			this.field11917 |= var3;
		}
	}

	@ObfuscatedName("app.x(Ldw;)V")
	public void method15441(class126 arg0) {
		class88 var2 = (class88) arg0;
		if (arg0 == null) {
			this.field11919 &= 0xFFFFFFEF;
			this.field11920 = null;
			if (this.field11919 == 0) {
				this.field11914 = 0;
				this.field11918 = 0;
			}
		} else {
			if ((this.field11919 | 0x10) == 16) {
				this.field11914 = var2.method1009();
				this.field11918 = var2.method1015();
				if (this.field11915.method2135() == this) {
					this.field11915.method15757();
				}
			} else if (this.field11918 != var2.method1015() || this.field11914 != var2.method1009()) {
				throw new RuntimeException();
			}
			this.field11919 |= 0x10;
			this.field11920 = var2;
		}
		if (this.field11915.method2135() == this) {
			this.method18965();
		} else {
			this.field11917 |= 0x10;
		}
	}

	@ObfuscatedName("app.ac(I)V")
	public void method18962(int arg0) {
		class88 var2 = this.field11922[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method1318(arg0 + 36064);
		}
	}

	@ObfuscatedName("app.ai()V")
	public void method18965() {
		if (this.field11920 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.field11920.method1318(36096);
		}
	}

	@ObfuscatedName("app.h()Z")
	public boolean method15446() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	@ObfuscatedName("app.k()Z")
	public boolean method1630() {
		OpenGL.glBindFramebufferEXT(36160, this.field11916);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.field11917 & 0x1 << var1) != 0) {
				this.method18962(var1);
			}
		}
		if ((this.field11917 & 0x10) != 0) {
			this.method18965();
		}
		this.field11917 = 0;
		this.field11915.method15883();
		return true;
	}

	@ObfuscatedName("app.f()Z")
	public boolean method1631() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@ObfuscatedName("app.aw(I)V")
	public void method18966(int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@ObfuscatedName("app.a(IIIIIIZZ)V")
	public void method15440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.field11914;
		int var10 = this.field11915.method2135().method1628();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.field11916);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@ObfuscatedName("app.m()V")
	public void method1629() {
		if (this.field11916 != 0) {
			this.field11915.method15802(this.field11916);
			this.field11916 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		this.method1629();
	}
}
