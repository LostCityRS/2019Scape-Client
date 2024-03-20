package com.jagex.graphics;

import com.jagex.core.io.Packet;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("cs")
public class Joint {

	@ObfuscatedName("cs.e")
	public final int field1242;

	@ObfuscatedName("cs.n")
	public Joint field1239;

	@ObfuscatedName("cs.m")
	public float[][] field1241;

	@ObfuscatedName("cs.k")
	public final Matrix4x4[] field1243;

	@ObfuscatedName("cs.f")
	public Matrix4x4[] field1244;

	@ObfuscatedName("cs.w")
	public Matrix4x4[] field1240;

	public Joint(int arg0, Packet arg1, boolean arg2) {
		this.field1242 = arg1.g2s();
		this.field1243 = new Matrix4x4[arg0];
		this.field1244 = new Matrix4x4[this.field1243.length];
		this.field1240 = new Matrix4x4[this.field1243.length];
		this.field1241 = new float[this.field1243.length][3];
		for (int var4 = 0; var4 < this.field1243.length; var4++) {
			this.field1243[var4] = new Matrix4x4(arg1, arg2);
			this.field1241[var4][0] = arg1.gFloat();
			this.field1241[var4][1] = arg1.gFloat();
			this.field1241[var4][2] = arg1.gFloat();
		}
	}

	@ObfuscatedName("cs.e(IB)Lpq;")
	public Matrix4x4 method1570(int arg0) {
		return this.field1243[arg0];
	}

	@ObfuscatedName("cs.n(IB)Lpq;")
	public Matrix4x4 method1564(int arg0) {
		if (this.field1244[arg0] == null) {
			this.field1244[arg0] = new Matrix4x4(this.method1570(arg0));
			this.field1244[arg0].method6611();
		}
		return this.field1244[arg0];
	}

	@ObfuscatedName("cs.m(II)Lpq;")
	public Matrix4x4 method1565(int arg0) {
		if (this.field1240[arg0] == null) {
			this.field1240[arg0] = new Matrix4x4(this.method1570(arg0));
			if (this.field1239 == null) {
				this.field1240[arg0].multiply(Matrix4x4.IDENTITY);
			} else {
				this.field1240[arg0].multiply(this.field1239.method1565(arg0));
			}
		}
		return this.field1240[arg0];
	}
}
