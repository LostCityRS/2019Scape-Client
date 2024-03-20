package com.jagex.math;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("oe")
public class ScaleRotTrans {

	@ObfuscatedName("oe.p")
	public Quaternion rot;

	@ObfuscatedName("oe.d")
	public Vector3 trans;

	@ObfuscatedName("oe.c")
	public Vector3 scale;

	public ScaleRotTrans(Packet arg0, boolean arg1) {
		this.decode(arg0, arg1);
	}

	public ScaleRotTrans() {
		this.rot = new Quaternion();
		this.trans = new Vector3();
		this.scale = new Vector3(1.0F, 1.0F, 1.0F);
	}

	public ScaleRotTrans(ScaleRotTrans arg0) {
		this();
		this.setTo(arg0);
	}

	@ObfuscatedName("oe.e(Lalw;Z)V")
	public void decode(Packet arg0, boolean arg1) {
		if (arg1) {
			this.decode(arg0);
		} else {
			this.rot = new Quaternion(arg0);
			this.trans = new Vector3(arg0);
			this.scale = new Vector3(arg0);
		}
	}

	@ObfuscatedName("oe.n(Lalw;)V")
	public void decode(Packet arg0) {
		int var2 = arg0.g1();
		float var3 = 0.0F;
		float var4 = 0.0F;
		float var5 = 0.0F;
		float var6 = 1.0F;
		if ((var2 & 0x1) != 0) {
			var3 = (float) arg0.g2s() / 32768.0F;
			var4 = (float) arg0.g2s() / 32768.0F;
			var5 = (float) arg0.g2s() / 32768.0F;
			var6 = (float) arg0.g2s() / 32768.0F;
		}
		this.rot = new Quaternion(var3, var4, var5, var6);
		float var7 = 0.0F;
		float var8 = 0.0F;
		float var9 = 0.0F;
		if ((var2 & 0x2) != 0) {
			var7 = arg0.g2s();
		}
		if ((var2 & 0x4) != 0) {
			var8 = arg0.g2s();
		}
		if ((var2 & 0x8) != 0) {
			var9 = arg0.g2s();
		}
		this.trans = new Vector3(var7, var8, var9);
		float var10 = 1.0F;
		float var11 = 1.0F;
		float var12 = 1.0F;
		if ((var2 & 0x10) == 0) {
			if ((var2 & 0x20) != 0) {
				var10 = (float) arg0.g2s() / 128.0F;
			}
			if ((var2 & 0x40) != 0) {
				var11 = (float) arg0.g2s() / 128.0F;
			}
			if ((var2 & 0x80) != 0) {
				var12 = (float) arg0.g2s() / 128.0F;
			}
		} else {
			float var13 = (float) arg0.g2s() / 128.0F;
			var12 = var13;
			var11 = var13;
			var10 = var13;
		}
		this.scale = new Vector3(var10, var11, var12);
	}

	@ObfuscatedName("oe.m(Loe;)V")
	public void setTo(ScaleRotTrans arg0) {
		this.rot.setTo(arg0.rot);
		this.trans.setTo(arg0.trans);
		this.scale.setTo(arg0.scale);
	}

	@ObfuscatedName("oe.k()V")
	public final void invert() {
		this.rot.opposite();
		this.trans.negate();
		this.trans.rotate(this.rot);
		this.scale.x = 1.0F / this.scale.x;
		this.scale.y = 1.0F / this.scale.y;
		this.scale.z = 1.0F / this.scale.z;
	}

	@ObfuscatedName("oe.f(Loe;)V")
	public final void multiply(ScaleRotTrans arg0) {
		this.rot.multiply(arg0.rot);
		this.trans.rotate(arg0.rot);
		this.trans.add(arg0.trans);
		this.scale.multiply(arg0.scale);
	}

	public String toString() {
		return "[" + this.rot.toString() + "|" + this.trans.toString() + "|" + this.scale.toString() + "]";
	}

	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof ScaleRotTrans) {
			ScaleRotTrans var2 = (ScaleRotTrans) arg0;
			return this.rot.equals(var2.rot) && this.trans.isEqualTo(var2.trans) && this.scale.isEqualTo(var2.scale);
		} else {
			return false;
		}
	}
}
