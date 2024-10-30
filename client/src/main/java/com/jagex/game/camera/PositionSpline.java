package com.jagex.game.camera;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.camera.position.Position;
import com.jagex.game.client.GameShell;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Spline;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("ahn")
public abstract class PositionSpline extends Position {

	@ObfuscatedName("ahn.n")
	public Spline[] field10565;

	@ObfuscatedName("ahn.m")
	public float[] field10562;

	@ObfuscatedName("ahn.k")
	public int field10564 = 0;

	@ObfuscatedName("ahn.f")
	public float field10563 = 0.0F;

	@ObfuscatedName("ahn.w")
	public float field10566 = 0.0F;

	@ObfuscatedName("ahn.l")
	public int[] field10567;

	public PositionSpline(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahn.t(Lpe;IFI)V")
	public void method16720(Spline arg0, int arg1, float arg2) {
		if (this.field10565 == null) {
			this.field10565 = new Spline[] { arg0 };
			this.field10562 = new float[] { arg2 };
			this.field10567 = new int[] { arg1 };
			return;
		}
		Spline[] var4 = new Spline[this.field10565.length + 1];
		float[] var5 = new float[this.field10565.length + 1];
		int[] var6 = new int[this.field10565.length + 1];
		System.arraycopy(this.field10565, 0, var4, 0, this.field10565.length);
		System.arraycopy(this.field10562, 0, var5, 0, this.field10565.length);
		System.arraycopy(this.field10567, 0, var6, 0, this.field10565.length);
		this.field10565 = var4;
		this.field10562 = var5;
		this.field10567 = var6;
		this.field10565[this.field10565.length - 1] = arg0;
		this.field10562[this.field10562.length - 1] = arg2;
		this.field10567[this.field10567.length - 1] = arg1;
	}

	@ObfuscatedName("ahn.e(F[[[ILqx;IIB)V")
	public void method5238(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4) {
		Spline var6 = this.field10565[this.field10564];
		if (this.field10562[this.field10564] > 0.0F) {
			if (this.field10562[this.field10564] >= arg0) {
				this.field10562[this.field10564] -= arg0;
				return;
			}
			arg0 -= this.field10562[this.field10564];
			this.field10562[this.field10564] = 0.0F;
		}
		float var7 = 1.0F / (float) GameShell.getLogicRate();
		while (arg0 > 0.0F) {
			float var8 = var6.method6764();
			if (this.field10563 >= var8) {
				if (this.field10564 + 1 == this.field10565.length) {
					return;
				}
				if (this.field10562[this.field10564 + 1] >= arg0) {
					this.field10562[this.field10564 + 1] -= arg0;
					return;
				}
				this.field10564++;
				arg0 -= this.field10562[this.field10564];
				this.field10562[this.field10564] = 0.0F;
				this.method16723();
				this.field10563 = 0.0F;
				this.field10566 = 0.0F;
				var6 = this.field10565[this.field10564];
				var8 = var6.method6764();
			}
			while (arg0 > 0.0F && this.field10563 < var8) {
				this.field10566 = this.method16722(var8, this.field10566, Math.min(arg0, var7));
				arg0 -= var7;
				this.method16721(this.field10566, var8);
			}
		}
	}

	@ObfuscatedName("ahn.ae(FFI)V")
	public void method16721(float arg0, float arg1) {
		this.field10563 += arg0;
		if (this.field10563 > arg1) {
			this.field10563 = arg1;
		}
	}

	@ObfuscatedName("ahn.n(I)Z")
	public boolean method5218() {
		return this.field10565 != null;
	}

	@ObfuscatedName("ahn.m(B)Lox;")
	public Vector3 method5219() {
		Vector3 var1 = Vector3.create();
		double[] var2 = this.field10565[this.field10564].method6765(this.field10563);
		var1.x = (float) var2[0];
		var1.y = (float) var2[1];
		var1.z = (float) var2[2];
		return var1;
	}

	@ObfuscatedName("ahn.k(I)[D")
	public double[] method5230() {
		return this.field10565[this.field10564].method6765(this.field10563);
	}

	@ObfuscatedName("ahn.f(B)Lakt;")
	public CoordFine method5221() {
		Vector3 var1 = this.method5219();
		return new CoordFine(0, (int) var1.x, (int) var1.y, (int) var1.z);
	}

	@ObfuscatedName("ahn.al(I)F")
	public float method16733() {
		return this.field10565[this.field10564].method6771(this.field10563);
	}

	@ObfuscatedName("ahn.w(I)F")
	public float method5222() {
		return this.field10565[this.field10564].method6762(this.field10563);
	}

	@ObfuscatedName("ahn.l(Lju;IIB)V")
	public void method5223(Vector3i arg0, int arg1, int arg2) {
		Vector3 var4 = this.method5219();
		arg0.field2835 = (int) var4.x - arg1;
		arg0.field2836 = (int) -var4.y;
		arg0.field2837 = (int) var4.z - arg2;
	}

	@ObfuscatedName("ahn.u(Lalw;I)V")
	public void method5224(Packet arg0) {
		this.field10563 = 0.0F;
		this.field10566 = 0.0F;
		this.field10564 = 0;
		int var2 = arg0.g1();
		this.field10565 = new Spline[var2];
		this.field10562 = new float[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field10565[var3] = new Spline(arg0);
			this.field10562[var3] = arg0.gFloat();
		}
		this.method16724(arg0, var2);
	}

	@ObfuscatedName("ahn.ag(FFFB)F")
	public abstract float method16722(float arg0, float arg1, float arg2);

	@ObfuscatedName("ahn.ah(I)V")
	public abstract void method16723();

	@ObfuscatedName("ahn.ac(Lalw;IS)V")
	public abstract void method16724(Packet arg0, int arg1);
}
