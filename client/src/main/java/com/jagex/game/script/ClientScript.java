package com.jagex.game.script;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
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

	public ClientScript(Packet buf, VariableTypeProvider varTypeProvider) {
		this.varTypeProvider = varTypeProvider;
		int size = this.decodeScript(buf);
		int instr = 0;
		ClientScriptCommand[] commands = ClientScriptCommand.values();
		while (buf.pos < size) {
			ClientScriptCommand command = this.decodeAtPos(buf, commands);
			this.decodeOperands(buf, instr, command);
			instr++;
		}
	}

	@ObfuscatedName("asc.e(Lalw;[Lss;I)Lss;")
	public ClientScriptCommand decodeAtPos(Packet buf, ClientScriptCommand[] commands) {
		int pos = buf.g2();
		if (pos < 0 || pos >= commands.length) {
			throw new RuntimeException("");
		}
		return commands[pos];
	}

	@ObfuscatedName("asc.n(Lalw;I)I")
	public int decodeScript(Packet buf) {
		buf.pos = (buf.data.length - 2);
		int trailerLen = buf.g2();
		int trailerPos = buf.data.length - 2 - trailerLen - 16;
		buf.pos = trailerPos;
		int instructions = buf.g4s();
		this.intLocalCount = buf.g2();
		this.objectLocalCount = buf.g2();
		this.longLocalCount = buf.g2();
		this.intArgCount = buf.g2();
		this.objectArgCount = buf.g2();
		this.longArgCount = buf.g2();
		int switches = buf.g1();
		if (switches > 0) {
			this.switchTables = new HashTable[switches];
			for (int index = 0; index < switches; index++) {
				int count = buf.g2();
				HashTable var8 = new HashTable(count > 0 ? IntMath.bitceil(count) : 1);
				this.switchTables[index] = var8;
				while (count-- > 0) {
					int key = buf.g4s();
					int offset = buf.g4s();
					var8.put(new IntNode(offset), (long) key);
				}
			}
		}
		buf.pos = 0;
		this.scriptName = buf.fastgstr();
		this.instructions = new ClientScriptCommand[instructions];
		return trailerPos;
	}

	@ObfuscatedName("asc.m(Lalw;ILss;I)V")
	public void decodeOperands(Packet buf, int instr, ClientScriptCommand command) {
		int length = this.instructions.length;
		if (ClientScriptCommand.PUSH_VAR == command || ClientScriptCommand.POP_VAR == command) {
			VarDomainType varDomainType = (VarDomainType) SerializableEnums.decode(VarDomainType.values(), buf.g1());
			int varId = buf.g2();
			if (this.objectOperands == null) {
				this.objectOperands = new Object[length];
			}
			this.objectOperands[instr] = this.varTypeProvider.getVarType(varDomainType, varId);
			if (this.intOperands == null) {
				this.intOperands = new int[length];
			}
			this.intOperands[instr] = buf.g1();
		} else if (ClientScriptCommand.PUSH_CONSTANT_STRING == command) {
			BaseVarType baseVarType = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), buf.g1());
			switch(baseVarType.index) {
				case 1:
					if (this.objectOperands == null) {
						this.objectOperands = new Object[length];
					}
					this.objectOperands[instr] = buf.gjstr().intern();
					break;
				case 2:
					if (this.intOperands == null) {
						this.intOperands = new int[length];
					}
					command = ClientScriptCommand.PUSH_CONSTANT_INT;
					this.intOperands[instr] = buf.g4s();
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.objectOperands == null) {
						this.objectOperands = new Object[length];
					}
					command = ClientScriptCommand.PUSH_LONG_CONSTANT;
					this.objectOperands[instr] = buf.g8();
			}
		} else if (ClientScriptCommand.PUSH_VARBIT == command || ClientScriptCommand.POP_VARBIT == command) {
			int varbitId = buf.g2();
			if (this.objectOperands == null) {
				this.objectOperands = new Object[length];
			}
			this.objectOperands[instr] = this.varTypeProvider.getVarBitType(varbitId);
			if (this.intOperands == null) {
				this.intOperands = new int[length];
			}
			this.intOperands[instr] = buf.g1();
		} else {
			if (this.intOperands == null) {
				this.intOperands = new int[length];
			}
			if (command != null && command.isLargeOperand) {
				this.intOperands[instr] = buf.g4s();
			} else {
				this.intOperands[instr] = buf.g1();
			}
		}
		this.instructions[instr] = command;
	}
}
