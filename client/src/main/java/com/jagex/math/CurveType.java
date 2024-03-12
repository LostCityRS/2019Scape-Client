package com.jagex.math;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("cy")
public class CurveType implements SerializableEnum {

	@ObfuscatedName("cy.e")
	public static final CurveType field1251 = new CurveType(0, 0);

	@ObfuscatedName("cy.n")
	public static final CurveType field1250 = new CurveType(1, 1);

	@ObfuscatedName("cy.m")
	public static final CurveType field1245 = new CurveType(2, 2);

	@ObfuscatedName("cy.k")
	public static final CurveType field1247 = new CurveType(3, 3);

	@ObfuscatedName("cy.f")
	public static final CurveType field1249 = new CurveType(4, 4);

	@ObfuscatedName("cy.w")
	public static final CurveType field1246 = new CurveType(5, 5);

	@ObfuscatedName("cy.l")
	public static final CurveType field1248 = new CurveType(6, 6);

	@ObfuscatedName("cy.u")
	public static final CurveType field1252 = new CurveType(7, 7);

	@ObfuscatedName("cy.z")
	public static final CurveType field1253 = new CurveType(8, 8);

	@ObfuscatedName("cy.p")
	public final int field1254;

	@ObfuscatedName("cy.d")
	public final int field1255;

	@ObfuscatedName("dh.e(B)[Lcy;")
	public static CurveType[] method2582() {
		return new CurveType[] { field1251, field1250, field1245, field1247, field1249, field1246, field1248, field1252, field1253 };
	}

	public CurveType(int arg0, int arg1) {
		this.field1254 = arg0;
		this.field1255 = arg1;
	}

	@ObfuscatedName("cy.n()I")
	public int getId() {
		return this.field1255;
	}

	@ObfuscatedName("fg.m(II)Lcy;")
	public static CurveType method2995(int arg0) {
		CurveType var1 = (CurveType) SerializableEnums.decode(method2582(), arg0);
		if (var1 == null) {
			var1 = field1253;
		}
		return var1;
	}
}
