package com.jagex.game.script;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("asc")
public class ClientScript extends SecondaryNode {

	@ObfuscatedName("asc.l")
	public ClientTriggerType field12373;

	@ObfuscatedName("asc.u")
	public String scriptName;

	@ObfuscatedName("asc.z")
	public ClientScriptCommand[] instructions;

	@ObfuscatedName("asc.p")
	public int[] intOperands;

	@ObfuscatedName("asc.d")
	public Object[] objectOperands;

	@ObfuscatedName("asc.c")
	public int intLocalCount;

	@ObfuscatedName("asc.r")
	public int objectLocalCount;

	@ObfuscatedName("asc.v")
	public int longLocalCount;

	@ObfuscatedName("asc.o")
	public int intArgCount;

	@ObfuscatedName("asc.s")
	public int objectArgCount;

	@ObfuscatedName("asc.y")
	public int longArgCount;

	@ObfuscatedName("asc.q")
	public HashTable[] switchTables;

	@ObfuscatedName("asc.x")
	public final VariableTypeProvider varTypeProvider;

	public ClientScript(Packet arg0, VariableTypeProvider arg1) {
		this.varTypeProvider = arg1;
		int var3 = this.decodeScript(arg0);
		int var4 = 0;
		ClientScriptCommand[] var5 = ClientScriptCommand.values();
		while (arg0.pos < var3) {
			ClientScriptCommand var6 = this.decodeAtPos(arg0, var5);
			this.decodeOperands(arg0, var4, var6);
			var4++;
		}
	}

	@ObfuscatedName("asc.e(Lalw;[Lss;I)Lss;")
	public ClientScriptCommand decodeAtPos(Packet arg0, ClientScriptCommand[] arg1) {
		int var3 = arg0.g2();
		if (var3 < 0 || var3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[var3];
	}

	@ObfuscatedName("asc.n(Lalw;I)I")
	public int decodeScript(Packet arg0) {
		arg0.pos = arg0.data.length - 2;
		int var2 = arg0.g2();
		int var3 = arg0.data.length - 2 - var2 - 16;
		arg0.pos = var3;
		int var4 = arg0.g4s();
		this.intLocalCount = arg0.g2();
		this.objectLocalCount = arg0.g2();
		this.longLocalCount = arg0.g2();
		this.intArgCount = arg0.g2();
		this.objectArgCount = arg0.g2();
		this.longArgCount = arg0.g2();
		int var5 = arg0.g1();
		if (var5 > 0) {
			this.switchTables = new HashTable[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				HashTable var8 = new HashTable(var7 > 0 ? IntMath.bitceil(var7) : 1);
				this.switchTables[var6] = var8;
				while (var7-- > 0) {
					int var9 = arg0.g4s();
					int var10 = arg0.g4s();
					var8.put(new IntNode(var10), (long) var9);
				}
			}
		}
		arg0.pos = 0;
		this.scriptName = arg0.fastgstr();
		this.instructions = new ClientScriptCommand[var4];
		return var3;
	}

	@ObfuscatedName("asc.m(Lalw;ILss;I)V")
	public void decodeOperands(Packet arg0, int arg1, ClientScriptCommand arg2) {
		int var4 = this.instructions.length;
		if (ClientScriptCommand.PUSH_VAR == arg2 || ClientScriptCommand.POP_VAR == arg2) {
			VarDomainType var7 = (VarDomainType) SerializableEnums.decode((SerializableEnum[]) VarDomainType.values(), arg0.g1());
			int var8 = arg0.g2();
			if (this.objectOperands == null) {
				this.objectOperands = new Object[var4];
			}
			this.objectOperands[arg1] = this.varTypeProvider.getVarType(var7, var8);
			if (this.intOperands == null) {
				this.intOperands = new int[var4];
			}
			this.intOperands[arg1] = arg0.g1();
		} else if (ClientScriptCommand.PUSH_CONSTANT_STRING == arg2) {
			BaseVarType var5 = (BaseVarType) SerializableEnums.decode((SerializableEnum[]) BaseVarType.values(), arg0.g1());
			switch(var5.index) {
				case 1:
					if (this.objectOperands == null) {
						this.objectOperands = new Object[var4];
					}
					this.objectOperands[arg1] = arg0.gjstr().intern();
					break;
				case 2:
					if (this.intOperands == null) {
						this.intOperands = new int[var4];
					}
					arg2 = ClientScriptCommand.PUSH_CONSTANT_INT;
					this.intOperands[arg1] = arg0.g4s();
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.objectOperands == null) {
						this.objectOperands = new Object[var4];
					}
					arg2 = ClientScriptCommand.PUSH_LONG_CONSTANT;
					this.objectOperands[arg1] = arg0.g8();
			}
		} else if (ClientScriptCommand.PUSH_VARBIT == arg2 || ClientScriptCommand.POP_VARBIT == arg2) {
			int var6 = arg0.g2();
			if (this.objectOperands == null) {
				this.objectOperands = new Object[var4];
			}
			this.objectOperands[arg1] = this.varTypeProvider.getVarBitType(var6);
			if (this.intOperands == null) {
				this.intOperands = new int[var4];
			}
			this.intOperands[arg1] = arg0.g1();
		} else {
			if (this.intOperands == null) {
				this.intOperands = new int[var4];
			}
			if (arg2 != null && arg2.isLargeOperand) {
				this.intOperands[arg1] = arg0.g4s();
			} else {
				this.intOperands[arg1] = arg0.g1();
			}
		}
		this.instructions[arg1] = arg2;
	}
}
