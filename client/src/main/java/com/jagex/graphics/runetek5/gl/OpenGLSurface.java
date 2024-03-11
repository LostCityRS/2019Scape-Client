package com.jagex.graphics.runetek5.gl;

import com.jagex.graphics.runetek5.GpuSurface;
import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("atx")
public class OpenGLSurface extends GpuSurface {

	@ObfuscatedName("atx.n")
	public final Canvas field12519;

	@ObfuscatedName("atx.m")
	public final OpenGL field12518;

	@ObfuscatedName("atx.k")
	public long field12516;

	@ObfuscatedName("atx.f")
	public int field12517;

	@ObfuscatedName("atx.w")
	public int field12520;

	@ObfuscatedName("atx.l")
	public boolean field12521;

	public OpenGLSurface(OpenGLRenderer arg0, Canvas arg1) {
		this(arg0, arg1, arg0.field12020.prepareSurface(arg1));
	}

	public OpenGLSurface(OpenGLRenderer arg0, Canvas arg1, long arg2) {
		super(arg0);
		this.field12521 = false;
		this.field12519 = arg1;
		this.field12518 = arg0.field12020;
		this.field12516 = arg2;
		this.method19660();
	}

	@ObfuscatedName("atx.e()I")
	public int method1627() {
		return this.field12517;
	}

	@ObfuscatedName("atx.n()I")
	public int method1628() {
		return this.field12520;
	}

	@ObfuscatedName("atx.i(II)V")
	public void method15453(int arg0, int arg1) {
		if (this.field12516 == 0L) {
			throw new IllegalStateException("");
		}
		this.field12518.surfaceResized(this.field12516);
		this.method19660();
		super.method15453(arg0, arg1);
	}

	@ObfuscatedName("atx.x()V")
	public void method19660() {
		Dimension var1 = this.field12519.getSize();
		this.field12520 = var1.height;
		this.field12517 = var1.width;
	}

	@ObfuscatedName("atx.a()I")
	public int method15451() {
		if (this.field12516 == 0L) {
			throw new IllegalStateException("");
		}
		this.field12518.swapBuffers(this.field12516);
		return 0;
	}

	@ObfuscatedName("atx.g(II)I")
	public int method15450(int arg0, int arg1) {
		return 0;
	}

	@ObfuscatedName("atx.k()Z")
	public boolean method1630() {
		if (this.field12516 == 0L) {
			throw new IllegalStateException("");
		}
		boolean var1 = true;
		if (!this.field12521) {
			var1 = this.field12518.setSurface(this.field12516);
			this.field12521 = true;
		}
		return var1 && super.method1630();
	}

	@ObfuscatedName("atx.f()Z")
	public boolean method1631() {
		return true;
	}

	@ObfuscatedName("atx.m()V")
	public void method1629() {
		if (this.field12516 != 0L) {
			this.field12518.releaseSurface(this.field12519, this.field12516);
			this.field12516 = 0L;
		}
	}
}
