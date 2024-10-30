package com.jagex.game.world.entity;

import com.jagex.core.io.Packet;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;

@ObfuscatedName("vz")
public class LocPositionAdjustment {

	@ObfuscatedName("vz.e")
	public int angle;

	@ObfuscatedName("vz.n")
	public int shape;

	@ObfuscatedName("vz.m")
	public ScaleRotTrans field7539;

	public LocPositionAdjustment(Packet arg0) {
		this(arg0, false);
	}

	public LocPositionAdjustment(Packet arg0, boolean arg1) {
		this(arg0, arg1, true);
	}

	public LocPositionAdjustment(Packet arg0, int arg1, boolean arg2) {
		this(arg0, arg1, arg2, true);
	}

	public LocPositionAdjustment(Packet arg0, boolean arg1, boolean arg2) {
		this(arg0, arg0.g1(), arg1, arg2);
	}

	public LocPositionAdjustment(Packet arg0, int arg1, boolean arg2, boolean arg3) {
		boolean var5 = (arg1 & 0x80) != 0;
		if (arg2) {
			int var6 = arg0.g1();
			this.shape = arg1 & 0x7F;
			this.angle = var6;
		} else {
			this.shape = arg1 >> 2 & 0x1F;
			this.angle = arg1 & 0x3;
		}
		this.field7539 = null;
		if (var5) {
			this.field7539 = new ScaleRotTrans(arg0, arg3);
		}
	}
}
