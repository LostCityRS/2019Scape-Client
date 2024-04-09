package com.jagex.graphics.gl;

import com.jagex.graphics.Surface;
import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("apt")
public class GlSurface extends Surface {

	@ObfuscatedName("apt.e")
	public final GlToolkit field11934;

	@ObfuscatedName("apt.n")
	public final Canvas field11938;

	@ObfuscatedName("apt.m")
	public final OpenGL field11933;

	@ObfuscatedName("apt.k")
	public final long field11935;

	@ObfuscatedName("apt.f")
	public int field11936;

	@ObfuscatedName("apt.w")
	public int field11937;

	@ObfuscatedName("apt.l")
	public boolean field11932;

	@ObfuscatedName("apt.u")
	public boolean field11939;

	public GlSurface(GlToolkit arg0, Canvas arg1) {
		this(arg0, arg1, arg0.field10022.prepareSurface(arg1));
	}

	public GlSurface(GlToolkit arg0, Canvas arg1, long arg2) {
		this.field11932 = false;
		this.field11939 = false;
		this.field11934 = arg0;
		this.field11938 = arg1;
		this.field11933 = arg0.field10022;
		this.field11935 = arg2;
		this.method18976();
	}

	@ObfuscatedName("apt.e()I")
	public int getWidth() {
		return this.field11936;
	}

	@ObfuscatedName("apt.n()I")
	public int getHeight() {
		return this.field11937;
	}

	@ObfuscatedName("apt.i(II)V")
	public void onResize(int arg0, int arg1) {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.surfaceResized(this.field11935);
		this.method18976();
		if (this.field11934.getRenderTarget() == this) {
			this.field11934.method15757();
		}
	}

	@ObfuscatedName("apt.x()V")
	public void method18976() {
		Dimension var1 = this.field11938.getSize();
		this.field11937 = var1.height;
		this.field11936 = var1.width;
	}

	@ObfuscatedName("apt.a()I")
	public int method15451() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.swapBuffers(this.field11935);
		return 0;
	}

	@ObfuscatedName("apt.g(II)I")
	public int method15450(int arg0, int arg1) {
		return 0;
	}

	@ObfuscatedName("apt.k()Z")
	public boolean method1630() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		if (!this.field11939) {
			this.field11933.setSurface(this.field11935);
			this.field11939 = true;
		}
		this.field11934.method15883();
		return true;
	}

	@ObfuscatedName("apt.f()Z")
	public boolean method1631() {
		return true;
	}

	@ObfuscatedName("apt.m()V")
	public void method1629() {
		if (this.field11932) {
			throw new IllegalStateException();
		}
		this.field11933.releaseSurface(this.field11938, this.field11935);
		this.field11932 = true;
		this.field11939 = false;
	}
}
