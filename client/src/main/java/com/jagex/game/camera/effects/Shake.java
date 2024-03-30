package com.jagex.game.camera.effects;

import com.jagex.core.io.Packet;
import com.jagex.game.camera.CameraEffect;
import com.jagex.graphics.camera.ShakeMode;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("atd")
public class Shake extends CameraEffect {

	@ObfuscatedName("atd.u")
	public ShakeMode mode;

	@ObfuscatedName("atd.z")
	public float field12555;

	@ObfuscatedName("atd.p")
	public float field12554;

	@ObfuscatedName("atd.d")
	public float field12552;

	public Shake(int arg0, ShakeMode arg1, float arg2, float arg3) {
		super(arg0);
		this.mode = arg1;
		this.field12555 = arg2;
		this.field12554 = arg3;
	}

	public Shake(int id, Packet buf) {
		super(id);
		this.mode = ShakeMode.of(buf.g1());
		this.field12555 = buf.gFloat();
		this.field12554 = buf.gFloat();
	}

	@ObfuscatedName("atd.n(FI)V")
	public void method19431(float arg0) {
		this.field12552 += this.field12554 * arg0;
	}

	@ObfuscatedName("atd.m(Lju;Lou;Lpq;I)V")
	public void method19440(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2) {
		float var4 = (float) Math.sin((double) this.field12552);
		float var5 = this.field12555 * var4;
		if (ShakeMode.field2625 == this.mode) {
			arg0.field2835 = (int) ((float) arg0.field2835 + var5);
			arg1.translate(var5, 0.0F, 0.0F);
		} else if (ShakeMode.field2620 == this.mode) {
			arg0.field2836 = (int) ((float) arg0.field2836 + var5);
			arg1.translate(0.0F, var5, 0.0F);
		} else if (ShakeMode.field2619 == this.mode) {
			arg0.field2837 = (int) ((float) arg0.field2837 + var5);
			arg1.translate(0.0F, 0.0F, var5);
		} else if (ShakeMode.field2622 == this.mode) {
			arg1.rotateAroundAxis(1.0F, 0.0F, 0.0F, var5);
		} else if (ShakeMode.field2623 == this.mode) {
			arg1.rotateAroundAxis(0.0F, 1.0F, 0.0F, var5);
		} else if (ShakeMode.field2624 == this.mode) {
			arg1.rotateAroundAxis(0.0F, 0.0F, 1.0F, var5);
		}
	}

	@ObfuscatedName("atd.k(Lalw;I)V")
	public void decode(Packet buf) {
		this.mode = ShakeMode.of(buf.g1());
		this.field12555 = buf.gFloat();
		this.field12554 = buf.gFloat();
	}
}
