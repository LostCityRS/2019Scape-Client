package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ComponentHook;
import com.jagex.game.config.vartype.*;
import com.jagex.game.shared.movement.CoordFine;
import deob.ObfuscatedName;

@ObfuscatedName("qa")
public class BaseVarType implements SerializableEnum {

	@ObfuscatedName("qa.e")
	public static final BaseVarType INTEGER = new BaseVarType(2, 0, Integer.class, new BaseVarTypeInteger());

	@ObfuscatedName("qa.n")
	public static final BaseVarType LONG = new BaseVarType(4, 1, Long.class, new BaseVarTypeLong());

	@ObfuscatedName("qa.m")
	public static final BaseVarType STRING = new BaseVarType(1, 2, String.class, new BaseVarTypeString());

	@ObfuscatedName("qa.k")
	public static final BaseVarType COORDFINE = new BaseVarType(0, 3, CoordFine.class, new BaseVarTypeCoordFine());

	@ObfuscatedName("qa.f")
	public static final BaseVarType CCHOOK = new BaseVarType(3, 4, ComponentHook.class, new BaseVarTypeComponentHook());

	@ObfuscatedName("qa.w")
	public final int index;

	@ObfuscatedName("qa.l")
	public final int serialID;

	@ObfuscatedName("qa.u")
	public final Class javaClass;

	@ObfuscatedName("qa.z")
	public final BaseVarTypeCodec codec;

	public BaseVarType(int index, int serialID, Class javaClass, BaseVarTypeCodec codec) {
		this.index = index;
		this.serialID = serialID;
		this.javaClass = javaClass;
		this.codec = codec;
	}

	@ObfuscatedName("qa.e(I)[Lqa;")
	public static BaseVarType[] values() {
		return new BaseVarType[] {COORDFINE, CCHOOK, STRING, INTEGER, LONG};
	}

	@ObfuscatedName("qa.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("qa.m(Ljava/lang/Class;I)Lqa;")
	public static BaseVarType getType(Class arg0) {
		BaseVarType[] var1 = values();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BaseVarType var3 = var1[var2];
			if (var3.javaClass == arg0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("qa.f(Ljava/lang/Class;I)Lade;")
	public static BaseVarTypeCodec getCodec(Class arg0) {
		BaseVarType var1 = getType(arg0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		}
		return var1.codec;
	}

	@ObfuscatedName("qa.w(Lalw;B)Ljava/lang/Object;")
	public Object dbDecode(Packet buf) {
		return this.codec.decode(buf);
	}
}
