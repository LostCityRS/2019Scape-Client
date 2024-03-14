package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("db")
public class TransformInfinityType implements SerializableEnum {

	@ObfuscatedName("db.e")
	public static final TransformInfinityType field1581 = new TransformInfinityType(0, 0);

	@ObfuscatedName("db.n")
	public static final TransformInfinityType field1585 = new TransformInfinityType(1, 1);

	@ObfuscatedName("db.m")
	public static final TransformInfinityType field1582 = new TransformInfinityType(2, 2);

	@ObfuscatedName("db.k")
	public static final TransformInfinityType field1583 = new TransformInfinityType(3, 3);

	@ObfuscatedName("db.f")
	public static final TransformInfinityType field1580 = new TransformInfinityType(4, 4);

	@ObfuscatedName("db.w")
	public final int field1584;

	@ObfuscatedName("db.l")
	public final int field1586;

	@ObfuscatedName("uk.e(B)[Ldb;")
	public static TransformInfinityType[] method9164() {
		return new TransformInfinityType[] { field1581, field1585, field1582, field1583, field1580 };
	}

	public TransformInfinityType(int arg0, int arg1) {
		this.field1584 = arg0;
		this.field1586 = arg1;
	}

	@ObfuscatedName("db.n()I")
	public int getId() {
		return this.field1586;
	}

	@ObfuscatedName("al.m(IB)Ldb;")
	public static TransformInfinityType method713(int arg0) {
		TransformInfinityType var1 = (TransformInfinityType) SerializableEnums.decode(method9164(), arg0);
		if (var1 == null) {
			var1 = field1581;
		}
		return var1;
	}
}
