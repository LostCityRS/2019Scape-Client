package com.jagex.game.config.vartype;

import com.jagex.*;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("ek")
public class SparseVarDomain implements VarDomain {

	@ObfuscatedName("ek.e")
	public final VarContainer field1708;

	public SparseVarDomain(VarTypeList arg0) {
		this(arg0, new VarContainerSparse(arg0));
	}

	public SparseVarDomain(VarTypeList arg0, VarContainerSparse arg1) {
		this(arg0.field9260, arg1);
	}

	public SparseVarDomain(VarDomainType arg0, VarContainerSparse arg1) {
		this.field1708 = arg1;
	}

	@ObfuscatedName("ek.u(Lec;I)I")
	public int method679(VarType arg0) {
		return this.field1708.method14728(arg0.id);
	}

	@ObfuscatedName("ek.e(Lec;II)V")
	public void method2798(VarType arg0, int arg1) {
		this.field1708.method14729(arg0.id, arg1);
	}

	@ObfuscatedName("ek.n(Lec;I)J")
	public long method2799(VarType arg0) {
		return this.field1708.method14730(arg0.id);
	}

	@ObfuscatedName("ek.m(Lec;J)V")
	public void method2800(VarType arg0, long arg1) {
		this.field1708.method14742(arg0.id, arg1);
	}

	@ObfuscatedName("ek.k(Lec;B)Ljava/lang/Object;")
	public Object method2801(VarType arg0) {
		return this.field1708.method14738(arg0.id);
	}

	@ObfuscatedName("ek.f(Lec;Ljava/lang/Object;I)V")
	public void method2802(VarType arg0, Object arg1) {
		this.field1708.method14735(arg0.id, arg1);
	}

	@ObfuscatedName("ek.z(Lkh;I)I")
	public int method678(VarBitType arg0) {
		return arg0.getVarbitValue(this.method679(arg0.baseVar));
	}

	@ObfuscatedName("ek.w(Lkh;II)V")
	public void method2804(VarBitType arg0, int arg1) throws VarBitOverflowException {
		this.method2798(arg0.baseVar, arg0.setVarbitValue(this.method679(arg0.baseVar), arg1));
	}
}
