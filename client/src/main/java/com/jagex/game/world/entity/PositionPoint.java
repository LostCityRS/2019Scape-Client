package com.jagex.game.world.entity;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.camera.position.Position;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("ahh")
public class PositionPoint extends Position {

	@ObfuscatedName("ahh.n")
	public int field10551;

	@ObfuscatedName("ahh.m")
	public final Vector3 field10548 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahh.k")
	public final Vector3 field10549 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahh.f")
	public final Vector3 field10547 = new Vector3();

	@ObfuscatedName("ahh.w")
	public boolean collision = false;

	public PositionPoint(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahh.t(Lakt;I)V")
	public void method16671(CoordFine arg0) {
		this.field10549.x = arg0.x;
		this.field10549.y = arg0.y;
		this.field10549.z = arg0.z;
		if (Float.isNaN(this.field10548.x)) {
			this.field10548.setTo(this.field10549);
			this.field10547.reset();
		}
		this.field10551 = arg0.level;
	}

	@ObfuscatedName("ahh.e(F[[[ILqx;IIB)V")
	public void method5238(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4) {
		if (this.collision) {
			this.method16681(arg1, arg2, arg3, arg4);
		}
		this.camera.method4807(true, arg0, this.field10548, this.camera.method4721(), this.field10549, this.field10547);
	}

	@ObfuscatedName("ahh.n(I)Z")
	public boolean method5218() {
		return !Float.isNaN(this.field10548.x);
	}

	@ObfuscatedName("ahh.m(B)Lox;")
	public Vector3 method5219() {
		return Vector3.create(this.field10548);
	}

	@ObfuscatedName("ahh.k(I)[D")
	public double[] method5230() {
		double[] var1 = new double[3];
		Vector3 var2 = this.method5219();
		var1[0] = var2.x;
		var1[1] = var2.y;
		var1[2] = var2.z;
		return var1;
	}

	@ObfuscatedName("ahh.f(B)Lakt;")
	public CoordFine method5221() {
		return new CoordFine(this.field10551, (int) this.field10548.x, (int) this.field10548.y, (int) this.field10548.z);
	}

	@ObfuscatedName("ahh.w(I)F")
	public float method5222() {
		return 0.0F;
	}

	@ObfuscatedName("ahh.l(Lju;IIB)V")
	public void method5223(Vector3i arg0, int arg1, int arg2) {
		arg0.field2835 = (int) this.field10548.x - arg1;
		arg0.field2836 = (int) -this.field10548.y;
		arg0.field2837 = (int) this.field10548.z - arg2;
	}

	@ObfuscatedName("ahh.u(Lalw;I)V")
	public void method5224(Packet arg0) {
		this.field10549.decode(arg0);
	}

	@ObfuscatedName("ahh.ae(ZI)V")
	public void setCollision(boolean arg0) {
		this.collision = arg0;
	}

	@ObfuscatedName("ahh.ag([[[ILqx;III)V")
	public void method16681(int[][][] arg0, SceneLevelTileFlags arg1, int arg2, int arg3) {
		if (!this.method5218() || !this.camera.method4730() && !this.camera.method4731() || !this.camera.method4731() || arg0 == null) {
			return;
		}
		int var5 = (int) this.field10549.x - arg2 >> 9;
		int var6 = (int) this.field10549.z - arg3 >> 9;
		if (var5 < 0 || var6 < 0 || var5 + 1 >= arg0[0].length || var6 + 1 >= arg0[0][0].length) {
			return;
		}
		int var7 = this.field10551;
		if (arg1.isLinkBelow(var5, var6)) {
			var7 = this.field10551 + 1;
		}
		long var8 = (long) this.field10549.x % 512L;
		long var10 = (long) this.field10549.z % 512L;
		long var12 = (512L - var8) * (long) arg0[var7][var5][var6] * (512L - var10);
		long var14 = (long) arg0[var7][var5 + 1][var6] * var8 * (512L - var10) + var12;
		long var16 = (512L - var8) * (long) arg0[var7][var5][var6 + 1] * var10 + var14;
		long var18 = (long) arg0[var7][var5 + 1][var6 + 1] * var8 * var10 + var16;
		long var20 = var18 / 262144L;
		long var22 = var20 - 512L;
		float var24 = (float) -var22 - this.field10549.y;
		if (var24 > 0.0F) {
			this.field10549.y = -var22;
		}
	}
}
