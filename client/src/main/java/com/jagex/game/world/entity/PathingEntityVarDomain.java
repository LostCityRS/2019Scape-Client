package com.jagex.game.world.entity;

import com.jagex.game.config.vartype.VarDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("sd")
public class PathingEntityVarDomain implements VarDomain {

	@ObfuscatedName("sd.e")
	public PathingEntity field6687;

	public PathingEntityVarDomain(PathingEntity arg0) {
		this.field6687 = arg0;
	}

	@ObfuscatedName("sd.u(Lec;I)I")
	public int getVarValueInt(VarType arg0) {
		return this.field6687.field10460.method14728(arg0.id);
	}

	@ObfuscatedName("sd.n(Lec;I)J")
	public long getVarValueLong(VarType arg0) {
		return this.field6687.field10460.method14730(arg0.id);
	}

	@ObfuscatedName("sd.k(Lec;B)Ljava/lang/Object;")
	public Object getVarValue(VarType arg0) {
		return this.field6687.field10460.method14738(arg0.id);
	}

	@ObfuscatedName("sd.z(Lkh;I)I")
	public int getVarBitValue(VarBitType arg0) {
		return arg0.getVarbitValue(this.getVarValueInt(arg0.baseVar));
	}

	@ObfuscatedName("sd.e(Lec;II)V")
	public void setVarValueInt(VarType arg0, int arg1) {
		this.field6687.field10460.method14729(arg0.id, arg1);
	}

	@ObfuscatedName("sd.m(Lec;J)V")
	public void setVarValueLong(VarType arg0, long arg1) {
		this.field6687.field10460.method14742(arg0.id, arg1);
	}

	@ObfuscatedName("sd.f(Lec;Ljava/lang/Object;I)V")
	public void setVarValue(VarType arg0, Object arg1) {
		this.field6687.field10460.method14735(arg0.id, arg1);
	}

	@ObfuscatedName("sd.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) throws VarBitOverflowException {
		this.setVarValueInt(arg0.baseVar, arg0.setVarbitValue(this.getVarValueInt(arg0.baseVar), arg1));
	}
}
