package com.jagex.graphics.safe;

import com.jagex.graphics.Surface;
import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("aph")
public abstract class PureJavaSurface extends Surface {

	@ObfuscatedName("aph.e")
	public final PureJavaToolkit field11930;

	@ObfuscatedName("aph.n")
	public final Canvas field11926;

	@ObfuscatedName("aph.m")
	public int field11925;

	@ObfuscatedName("aph.k")
	public int field11927;

	@ObfuscatedName("aph.f")
	public int[] field11928;

	@ObfuscatedName("aph.w")
	public float[] field11929;

	@ObfuscatedName("aph.l")
	public boolean field11924;

	@ObfuscatedName("aoh.x(Lafg;Ljava/awt/Canvas;III)Laph;")
	public static PureJavaSurface method18912(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
		return new DefaultPureJavaSurface(arg0, arg1, arg2, arg3);
	}

	public PureJavaSurface(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
		this.field11926 = arg1;
		this.field11930 = arg0;
		this.field11925 = arg2;
		this.field11927 = arg3;
	}

	@ObfuscatedName("aph.b(I)V")
	public void method18971() {
		this.field11928 = new int[this.field11927 * this.field11925];
		this.field11929 = new float[this.field11927 * this.field11925];
		if (this.field11924) {
			this.field11930.method15662(this.field11925, this.field11927, this.field11928, this.field11929);
		}
	}

	@ObfuscatedName("aph.i(II)V")
	public final void onResize(int arg0, int arg1) {
		if (this.field11925 != arg0 || this.field11927 != arg1) {
			this.field11925 = arg0;
			this.field11927 = arg1;
			this.method18971();
		}
	}

	@ObfuscatedName("aph.e()I")
	public int getWidth() {
		return this.field11925;
	}

	@ObfuscatedName("aph.n()I")
	public int getHeight() {
		return this.field11927;
	}

	@ObfuscatedName("aph.k()Z")
	public final boolean method1630() {
		this.field11930.method15662(this.field11925, this.field11927, this.field11928, this.field11929);
		this.field11924 = true;
		return true;
	}

	@ObfuscatedName("aph.f()Z")
	public final boolean method1631() {
		this.field11924 = false;
		return true;
	}
}
