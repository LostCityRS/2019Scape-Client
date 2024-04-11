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
	public PathingEntity pathingEntity;

	public PathingEntityVarDomain(PathingEntity pathingEntity) {
		this.pathingEntity = pathingEntity;
	}

	@ObfuscatedName("sd.u(Lec;I)I")
	public int getVarValueInt(VarType varType) {
		return this.pathingEntity.vars.getVarValueInt(varType.id);
	}

	@ObfuscatedName("sd.n(Lec;I)J")
	public long getVarValueLong(VarType varType) {
		return this.pathingEntity.vars.getVarValueLong(varType.id);
	}

	@ObfuscatedName("sd.k(Lec;B)Ljava/lang/Object;")
	public Object getVarValue(VarType varType) {
		return this.pathingEntity.vars.getVarValue(varType.id);
	}

	@ObfuscatedName("sd.z(Lkh;I)I")
	public int getVarBitValue(VarBitType varBitType) {
		return varBitType.getVarbitValue(this.getVarValueInt(varBitType.baseVar));
	}

	@ObfuscatedName("sd.e(Lec;II)V")
	public void setVarValueInt(VarType varType, int arg1) {
		this.pathingEntity.vars.setVarValueInt(varType.id, arg1);
	}

	@ObfuscatedName("sd.m(Lec;J)V")
	public void setVarValueLong(VarType varType, long arg1) {
		this.pathingEntity.vars.setVarValueLong(varType.id, arg1);
	}

	@ObfuscatedName("sd.f(Lec;Ljava/lang/Object;I)V")
	public void setVarValue(VarType varType, Object arg1) {
		this.pathingEntity.vars.setVarValue(varType.id, arg1);
	}

	@ObfuscatedName("sd.w(Lkh;II)V")
	public void setVarbitValue(VarBitType varBitType, int arg1) throws VarBitOverflowException {
		this.setVarValueInt(varBitType.baseVar, varBitType.setVarbitValue(this.getVarValueInt(varBitType.baseVar), arg1));
	}
}
