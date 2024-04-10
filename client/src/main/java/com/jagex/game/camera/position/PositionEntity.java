package com.jagex.game.camera.position;

import com.jagex.core.datastruct.SceneLevelTileFlags;
import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.graphics.camera.CameraHelpers;
import com.jagex.graphics.camera.CameraTrackable;
import com.jagex.graphics.camera.CameraTrackableType;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("ahd")
public class PositionEntity extends Position {

	@ObfuscatedName("ahd.n")
	public CameraTrackable field10552;

	@ObfuscatedName("ahd.m")
	public final Vector3 field10553 = new Vector3();

	@ObfuscatedName("ahd.k")
	public final Quaternion field10554 = new Quaternion();

	@ObfuscatedName("ahd.f")
	public boolean field10556;

	@ObfuscatedName("ahd.w")
	public int field10561 = 200;

	@ObfuscatedName("ahd.l")
	public int field10557;

	@ObfuscatedName("ahd.u")
	public final Vector3 field10558 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahd.z")
	public final Vector3 field10559 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("ahd.p")
	public final Vector3 field10560 = new Vector3();

	@ObfuscatedName("ahd.d")
	public final Quaternion field10555 = new Quaternion();

	public PositionEntity(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahd.t(Ljn;Lox;Lov;ZI[[[ILqx;III)V")
	public void method16683(CameraTrackable arg0, Vector3 arg1, Quaternion arg2, boolean arg3, int arg4, int[][][] arg5, SceneLevelTileFlags arg6, int arg7, int arg8) {
		this.field10552 = arg0;
		this.field10553.setTo(arg1);
		this.field10554.setTo(arg2);
		this.field10556 = arg3;
		this.field10561 = arg4;
		this.field10557 = this.field10552.getTrackableCoord().level;
		this.method16686(arg5, arg6, arg7, arg8);
	}

	@ObfuscatedName("ahd.ae(B)V")
	public void method16684() {
		if (this.field10552 != null) {
			this.field10552 = this.camera.method4697().getCameraTrackable(this.field10552.getCameraTrackableType(), this.field10552.getIndex());
		}
	}

	@ObfuscatedName("ahd.e(F[[[ILqx;IIB)V")
	public void method5238(float arg0, int[][][] arg1, SceneLevelTileFlags arg2, int arg3, int arg4) {
		if (this.field10552 == null) {
			return;
		}
		this.method16686(arg1, arg2, arg3, arg4);
		Quaternion var6 = this.method16685();
		this.field10555.method6428(var6, this.camera.getPositionAngularInterpolation());
		if (Float.isNaN(this.field10555.w)) {
			this.field10555.setTo(var6);
		}
		var6.release();
		this.field10559.setTo(this.field10552.getTrackableCoord().method17853());
		this.camera.method4807(true, arg0, this.field10558, this.camera.method4721(), this.field10559, this.field10560);
	}

	@ObfuscatedName("ahd.ag(B)Lov;")
	public Quaternion method16685() {
		Quaternion var1 = Quaternion.create(this.field10554);
		if (this.field10556) {
			Vector3 var2 = this.field10552.createVector3();
			if (var2.length() < (float) this.field10561) {
				var2 = Vector3.create(0.0F, 0.0F, 1.0F);
				Quaternion var3 = this.field10552.method4668();
				var2.rotate(var3);
			}
			var2.y = 0.0F;
			float var4 = (float) Math.atan2((double) var2.x, (double) var2.z);
			var2.release();
			Quaternion var5 = new Quaternion();
			var5.setToRotation(0.0F, 1.0F, 0.0F, var4);
			var1.multiply(var5);
		}
		return var1;
	}

	@ObfuscatedName("ahd.ah([[[ILqx;IIB)V")
	public void method16686(int[][][] arg0, SceneLevelTileFlags arg1, int arg2, int arg3) {
		if (!this.method5218() || !this.camera.method4730() && !this.camera.method4731()) {
			return;
		}
		CoordFine var5 = this.field10552.getTrackableCoord();
		this.field10557 = var5.level;
		int var6 = this.field10557;
		boolean var7 = true;
		if (this.field10557 == 3) {
			var7 = false;
		} else if (arg1 != null && arg1.isLinkBelow(var5.x - arg2 >> 9, var5.z - arg3 >> 9)) {
			var6 = this.field10557 + 1;
			var7 = false;
		}
		if (!this.camera.method4731() || arg0 == null) {
			return;
		}
		float var8 = this.method16687(arg0, arg1, arg2, arg3, var6, var7);
		if (Float.isNaN(var8)) {
			return;
		}
		if (var8 <= 0.0F) {
			return;
		}
		float var9 = 3.1415927F;
		Vector3 var10 = Vector3.create(0.0F, 0.0F, 1.0F);
		var10.rotate(this.field10554);
		Vector3 var11 = Vector3.create(var10.x, 0.0F, var10.z);
		var11.normalise();
		float var12 = Vector3.dot(var10, var11);
		for (int var13 = 0; var13 < 10; var13++) {
			float var14 = (var9 + var12) / 2.0F - var12;
			float var15 = var14;
			if (var8 > 0.0F) {
				var15 = var14 * -1.0F;
			}
			Vector3 var16 = Vector3.create(1.0F, 0.0F, 0.0F);
			var16.rotate(this.field10554);
			Quaternion var17 = Quaternion.create();
			var17.setToRotation(var16, var15);
			this.field10554.multiply(var17);
			this.field10554.inverse();
			var16.release();
			var17.release();
			var8 = this.method16687(arg0, arg1, arg2, arg3, var6, var7);
			if (Float.isNaN(var8)) {
				return;
			}
			if (var8 > 0.0F) {
				var12 += var14;
			} else {
				var9 -= var14;
			}
		}
	}

	@ObfuscatedName("ahd.al([[[ILqx;IIIZI)F")
	public float method16687(int[][][] arg0, SceneLevelTileFlags arg1, int arg2, int arg3, int arg4, boolean arg5) {
		Quaternion var7 = this.method16685();
		Vector3 var8 = this.method16696(var7);
		var7.release();
		int var9 = (int) var8.x - arg2 >> 9;
		int var10 = (int) var8.z - arg3 >> 9;
		if (var9 < 0 || var10 < 0 || var9 + 1 >= arg0[0].length || var10 + 1 >= arg0[0][0].length) {
			var8.release();
			return Float.NaN;
		}
		int var11 = arg4;
		if (arg5 && arg1.isLinkBelow(var9, var10)) {
			var11 = arg4 + 1;
		}
		long var12 = (long) var8.x % 512L;
		long var14 = (long) var8.z % 512L;
		long var16 = (512L - var12) * (long) arg0[var11][var9][var10] * (512L - var14);
		long var18 = (long) arg0[var11][var9 + 1][var10] * var12 * (512L - var14) + var16;
		long var20 = (512L - var12) * (long) arg0[var11][var9][var10 + 1] * var14 + var18;
		long var22 = (long) arg0[var11][var9 + 1][var10 + 1] * var12 * var14 + var20;
		long var24 = var22 / 262144L;
		long var26 = var24 - 1024L;
		float var28 = (float) -var26 - var8.y;
		var8.release();
		return var28;
	}

	@ObfuscatedName("ahd.ac(Lov;I)Lox;")
	public Vector3 method16696(Quaternion arg0) {
		Vector3 var2 = Vector3.create(this.field10553);
		var2.rotate(arg0);
		Vector3 var3 = Vector3.add(this.field10559, var2);
		var2.release();
		return var3;
	}

	@ObfuscatedName("ahd.n(I)Z")
	public boolean method5218() {
		return !Float.isNaN(this.field10558.x);
	}

	@ObfuscatedName("ahd.m(B)Lox;")
	public Vector3 method5219() {
		Vector3 var1 = Vector3.create(this.field10553);
		var1.rotate(this.field10555);
		Vector3 var2 = Vector3.add(this.field10558, var1);
		var1.release();
		return var2;
	}

	@ObfuscatedName("ahd.k(I)[D")
	public double[] method5230() {
		double[] var1 = new double[3];
		Vector3 var2 = this.method5219();
		var1[0] = var2.x;
		var1[1] = var2.y;
		var1[2] = var2.z;
		return var1;
	}

	@ObfuscatedName("ahd.f(B)Lakt;")
	public CoordFine method5221() {
		Vector3 var1 = this.method5219();
		CoordFine var2 = new CoordFine(this.field10557, (int) var1.x, (int) var1.y, (int) var1.z);
		var1.release();
		return var2;
	}

	@ObfuscatedName("ahd.ai(I)Lox;")
	public Vector3 method16691() {
		return this.field10558;
	}

	@ObfuscatedName("ahd.aw(I)Lox;")
	public Vector3 method16692() {
		return this.field10553;
	}

	@ObfuscatedName("ahd.as(B)F")
	public float method16693() {
		return CameraHelpers.method16445(this.field10554);
	}

	@ObfuscatedName("ahd.at(I)F")
	public float method16694() {
		return CameraHelpers.method4498(this.field10554);
	}

	@ObfuscatedName("ahd.w(I)F")
	public float method5222() {
		return 0.0F;
	}

	@ObfuscatedName("ahd.l(Lju;IIB)V")
	public void method5223(Vector3i arg0, int arg1, int arg2) {
		Vector3 var4 = this.method5219();
		arg0.field2835 = (int) var4.x - arg1;
		arg0.field2836 = (int) -var4.y;
		arg0.field2837 = (int) var4.z - arg2;
		var4.release();
	}

	@ObfuscatedName("ahd.u(Lalw;I)V")
	public void method5224(Packet arg0) {
		CameraTrackableType var2 = CameraTrackableType.of(arg0.g1());
		int var3 = arg0.g2();
		this.field10553.decode(arg0);
		this.field10554.decode(arg0);
		if (arg0.g1() == 1) {
			this.field10556 = true;
		} else {
			this.field10556 = false;
		}
		this.field10561 = arg0.g2();
		this.field10552 = this.camera.method4697().getCameraTrackable(var2, var3);
	}
}
