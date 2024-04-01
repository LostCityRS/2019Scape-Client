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

	public LocPositionAdjustment(Packet buf) {
		this(buf, false);
	}

	public LocPositionAdjustment(Packet buf, boolean arg1) {
		this(buf, arg1, true);
	}

	public LocPositionAdjustment(Packet buf, int arg1, boolean arg2) {
		this(buf, arg1, arg2, true);
	}

	public LocPositionAdjustment(Packet buf, boolean arg1, boolean arg2) {
		this(buf, buf.g1(), arg1, arg2);
	}

	public LocPositionAdjustment(Packet buf, int info, boolean arg2, boolean arg3) {
		boolean var5 = (info & 0x80) != 0;
		if (arg2) {
			int var6 = buf.g1();
			this.shape = info & 0x7F;
			this.angle = var6;
		} else {
			this.shape = info >> 2 & 0x1F;
			this.angle = info & 0x3;
		}
		this.field7539 = null;
		if (var5) {
			this.field7539 = new ScaleRotTrans(buf, arg3);
		}
	}
}
