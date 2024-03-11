package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ComponentHook;
import com.jagex.game.client.CoordFine;
import com.jagex.game.config.vartype.*;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("qa")
public class BaseVarType implements SerializableEnum {

	@ObfuscatedName("qa.e")
	public static final BaseVarType INTEGER = new BaseVarType(2, 0, Integer.class, new BaseVarTypeInteger());

	@ObfuscatedName("qa.n")
	public static final BaseVarType field4837 = new BaseVarType(4, 1, Long.class, new BaseVarTypeLong());

	@ObfuscatedName("qa.m")
	public static final BaseVarType field4836 = new BaseVarType(1, 2, String.class, new BaseVarTypeString());

	@ObfuscatedName("qa.k")
	public static final BaseVarType field4839 = new BaseVarType(0, 3, CoordFine.class, new BaseVarTypeCoordFine());

	@ObfuscatedName("qa.f")
	public static final BaseVarType field4838 = new BaseVarType(3, 4, ComponentHook.class, new BaseVarTypeComponentHook());

	@ObfuscatedName("qa.w")
	public final int id;

	@ObfuscatedName("qa.l")
	public final int field4842;

	@ObfuscatedName("qa.u")
	public final Class javaClass;

	@ObfuscatedName("qa.z")
	public final BaseVarTypeCodec field4844;

	public BaseVarType(int arg0, int arg1, Class arg2, BaseVarTypeCodec arg3) {
		this.id = arg0;
		this.field4842 = arg1;
		this.javaClass = arg2;
		this.field4844 = arg3;
	}

	@ObfuscatedName("qa.m(Ljava/lang/Class;I)Lqa;")
	public static BaseVarType method7337(Class arg0) {
		BaseVarType[] var1 = Statics.method7338();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BaseVarType var3 = var1[var2];
			if (var3.javaClass == arg0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("qa.f(Ljava/lang/Class;I)Lade;")
	public static BaseVarTypeCodec method7336(Class arg0) {
		BaseVarType var1 = method7337(arg0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		}
		return var1.field4844;
	}

	@ObfuscatedName("qa.n()I")
	public int getId() {
		return this.field4842;
	}

	@ObfuscatedName("qa.w(Lalw;B)Ljava/lang/Object;")
	public Object method7335(Packet arg0) {
		return this.field4844.decode(arg0);
	}
}
