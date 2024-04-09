package com.jagex.graphics.safe;

import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("az")
public class PureJavaToolkitContext {

	@ObfuscatedName("az.e")
	public PureJavaToolkit field833;

	@ObfuscatedName("az.n")
	public Runnable field824;

	@ObfuscatedName("az.k")
	public boolean field826;

	@ObfuscatedName("az.f")
	public float field865 = 0.85F;

	@ObfuscatedName("az.w")
	public float field855 = 1.0F - this.field865;

	@ObfuscatedName("az.l")
	public int fadeColour = 0;

	@ObfuscatedName("az.u")
	public int field823 = 0;

	@ObfuscatedName("az.z")
	public boolean field867 = false;

	@ObfuscatedName("az.p")
	public int field832 = 0;

	@ObfuscatedName("az.d")
	public int field861 = 0;

	@ObfuscatedName("az.c")
	public boolean field834 = true;

	@ObfuscatedName("az.r")
	public Matrix4x4 field829 = new Matrix4x4();

	@ObfuscatedName("az.v")
	public Matrix4x3 field836 = new Matrix4x3();

	@ObfuscatedName("az.o")
	public PureJavaRasteriser rasteriser;

	@ObfuscatedName("az.s")
	public Matrix4x3 field838 = new Matrix4x3();

	@ObfuscatedName("az.y")
	public Matrix4x4 field828 = new Matrix4x4();

	@ObfuscatedName("az.q")
	public Matrix4x4 field868 = new Matrix4x4();

	@ObfuscatedName("az.x")
	public int[] field841 = new int[PureJavaModel.field9547];

	@ObfuscatedName("az.b")
	public float[] field842 = new float[PureJavaModel.field9547];

	@ObfuscatedName("az.h")
	public float[] field843 = new float[PureJavaModel.field9547];

	@ObfuscatedName("az.a")
	public float[] field844 = new float[PureJavaModel.field9547];

	@ObfuscatedName("az.g")
	public float[] field864 = new float[PureJavaModel.field9547];

	@ObfuscatedName("az.i")
	public int[] field846 = new int[8];

	@ObfuscatedName("az.j")
	public int[] field847 = new int[8];

	@ObfuscatedName("az.t")
	public int[] field848 = new int[8];

	@ObfuscatedName("az.ae")
	public int[] field849 = new int[10000];

	@ObfuscatedName("az.ag")
	public int[] field850 = new int[10000];

	@ObfuscatedName("az.ah")
	public int[] field851;

	@ObfuscatedName("az.al")
	public float field840;

	@ObfuscatedName("az.ac")
	public float field853;

	@ObfuscatedName("az.ai")
	public float field854;

	@ObfuscatedName("az.aw")
	public float field857;

	@ObfuscatedName("az.as")
	public float field856 = 1.0F;

	@ObfuscatedName("az.at")
	public float field839 = 0.0F;

	@ObfuscatedName("az.ad")
	public float field852 = 1.0F;

	@ObfuscatedName("az.am")
	public int field835;

	@ObfuscatedName("az.au")
	public float[] field860 = new float[2];

	@ObfuscatedName("az.ar")
	public PureJavaModel[] field830 = new PureJavaModel[8];

	@ObfuscatedName("az.ap")
	public PureJavaModel[] field862 = new PureJavaModel[8];

	@ObfuscatedName("az.aq")
	public float[] field863 = new float[64];

	@ObfuscatedName("az.ax")
	public float[] field827 = new float[64];

	@ObfuscatedName("az.av")
	public float[] field831 = new float[64];

	@ObfuscatedName("az.ao")
	public float[] field866 = new float[64];

	@ObfuscatedName("az.aj")
	public float[] field859 = new float[64];

	@ObfuscatedName("az.ay")
	public float[] field845 = new float[3];

	public PureJavaToolkitContext(PureJavaToolkit arg0) {
		this.field833 = arg0;
		this.rasteriser = new PureJavaRasteriser(arg0, this);
		for (int var2 = 0; var2 < 8; var2++) {
			this.field830[var2] = new PureJavaModel(this.field833);
			this.field862[var2] = new PureJavaModel(this.field833);
		}
		this.field851 = new int[PureJavaModel.field9564];
		for (int var3 = 0; var3 < PureJavaModel.field9564; var3++) {
			this.field851[var3] = -1;
		}
	}

	@ObfuscatedName("az.e(I)V")
	public void method999() {
		this.rasteriser = new PureJavaRasteriser(this.field833, this);
	}

	@ObfuscatedName("az.n(Ljava/lang/Runnable;I)V")
	public void setThread(Runnable arg0) {
		this.field824 = arg0;
	}
}
