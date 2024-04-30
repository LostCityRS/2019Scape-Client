package com.jagex.game.config.vartype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.config.vartype.constants.VarLifetime;
import com.jagex.game.config.vartype.constants.VarTransmitLevel;
import deob.ObfuscatedName;

import java.util.HashSet;
import java.util.Set;

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
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			VarTypeEncodingKey var3 = (VarTypeEncodingKey) SerializableEnums.decode(VarTypeEncodingKey.values(), var2);
			if (var3 == null) {
				this.decode(buf, var2);
			} else {
				switch(var3.index) {
					case 0:
						this.field1703 = false;
						break;
					case 1:
						int var4 = buf.g1();
						this.dataType = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), var4);
						if (this.dataType != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						buf.gjstr2();
						break;
					case 3:
						SerializableEnums.decode(VarTransmitLevel.values(), buf.g1());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.lifeTime = (VarLifetime) SerializableEnums.decode(VarLifetime.values(), buf.g1());
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
