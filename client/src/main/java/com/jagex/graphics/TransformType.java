package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("dt")
public class TransformType implements SerializableEnum {

	@ObfuscatedName("dt.e")
	public static final TransformType field1296 = new TransformType(0, 0, null, 0);

	@ObfuscatedName("dt.n")
	public static final TransformType field1292 = new TransformType(1, 1, null, 3);

	@ObfuscatedName("dt.m")
	public static final TransformType field1297 = new TransformType(2, 2, null, 3);

	@ObfuscatedName("dt.k")
	public static final TransformType field1291 = new TransformType(3, 3, null, 6);

	@ObfuscatedName("dt.f")
	public static final TransformType field1294 = new TransformType(4, 4, null, 1);

	@ObfuscatedName("dt.w")
	public final int field1295;

	@ObfuscatedName("dt.l")
	public final int field1293;

	@ObfuscatedName("dt.u")
	public final int field1290;

	@ObfuscatedName("pj.e(I)[Ldt;")
	public static TransformType[] method6986() {
		return new TransformType[] { field1296, field1292, field1297, field1291, field1294 };
	}

	public TransformType(int arg0, int arg1, String arg2, int arg3) {
		this.field1295 = arg0;
		this.field1293 = arg1;
		this.field1290 = arg3;
	}

	@ObfuscatedName("aqz.m(IS)Ldt;")
	public static TransformType method19197(int arg0) {
		TransformType var1 = (TransformType) SerializableEnums.decode(method6986(), arg0);
		if (var1 == null) {
			var1 = field1296;
		}
		return var1;
	}

	@ObfuscatedName("dt.f(I)I")
	public int method1674() {
		return this.field1290;
	}

	@ObfuscatedName("dt.n()I")
	public int getId() {
		return this.field1293;
	}
}
