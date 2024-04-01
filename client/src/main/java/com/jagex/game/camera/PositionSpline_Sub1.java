package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import deob.ObfuscatedName;

@ObfuscatedName("aqx")
public class PositionSpline_Sub1 extends PositionSpline {

	public PositionSpline_Sub1(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqx.ag(FFFB)F")
	public float method16722(float arg0, float arg1, float arg2) {
		float var4 = arg0 - this.field10563;
		if (this.camera.getPositionAcceleration().x == Float.POSITIVE_INFINITY) {
			arg1 = this.camera.getPositionMaxSpeed().length();
		} else {
			float var5 = arg1 / this.camera.getPositionAcceleration().length();
			float var6 = arg1 / 2.0F * var5;
			if (var6 > var4) {
				arg1 -= this.camera.getPositionAcceleration().length() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.camera.getPositionMaxSpeed().length()) {
				arg1 += this.camera.getPositionAcceleration().length() * arg2;
				if (arg1 > this.camera.getPositionMaxSpeed().length()) {
					arg1 = this.camera.getPositionMaxSpeed().length();
				}
			}
		}
		return arg1;
	}

	@ObfuscatedName("aqx.ah(I)V")
	public void method16723() {
	}

	@ObfuscatedName("aqx.ac(Lalw;IS)V")
	public void method16724(Packet arg0, int arg1) {
	}
}
