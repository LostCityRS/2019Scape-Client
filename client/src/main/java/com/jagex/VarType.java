package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ec")
public abstract class VarType implements VarConfigType {

	@ObfuscatedName("ec.e")
	public final VarDomainType domain;

	@ObfuscatedName("ec.n")
	public int id;

	@ObfuscatedName("ec.m")
	public ScriptVarType dataType;

	@ObfuscatedName("ec.k")
	public VarLifetime lifeTime = VarLifetime.TEMPORARY;

	@ObfuscatedName("ec.f")
	public boolean field1703 = true;

	public VarType(VarDomainType arg0, int arg1) {
		this.domain = arg0;
		this.id = arg1;
	}

	@ObfuscatedName("ec.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			VarTypeEncodingKey var3 = (VarTypeEncodingKey) class686.method1897(VarTypeEncodingKey.method15457(), var2);
			if (var3 == null) {
				this.decode(arg0, var2);
			} else {
				switch(var3.field1694) {
					case 0:
						this.field1703 = false;
						break;
					case 1:
						int var4 = arg0.g1();
						this.dataType = (ScriptVarType) class686.method1897(ScriptVarType.method7293(), var4);
						if (this.dataType != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2();
						break;
					case 3:
						class686.method1897(class456.method5925(), arg0.g1());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.lifeTime = (VarLifetime) class686.method1897(VarLifetime.method748(), arg0.g1());
				}
			}
		}
	}

	@ObfuscatedName("ec.z(B)Z")
	public boolean isValidDefinition() {
		return this.domain != null && this.dataType != null;
	}

	@ObfuscatedName("ec.p(B)Ljava/lang/Object;")
	public Object getDefaultValue() {
		return this.domain.method7211(this);
	}

	@ObfuscatedName("ec.u(Lalw;IS)V")
	public abstract void decode(Packet arg0, int arg1);
}
