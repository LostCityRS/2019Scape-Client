package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("cr")
public class TransformComponentType implements SerializableEnum {

	@ObfuscatedName("cr.e")
	public static final TransformComponentType field1215 = new TransformComponentType(0, 0, null, -1, -1);

	@ObfuscatedName("cr.n")
	public static final TransformComponentType field1209 = new TransformComponentType(1, 1, null, 0, 2);

	@ObfuscatedName("cr.m")
	public static final TransformComponentType field1206 = new TransformComponentType(2, 2, null, 1, 2);

	@ObfuscatedName("cr.k")
	public static final TransformComponentType field1207 = new TransformComponentType(3, 3, null, 2, 2);

	@ObfuscatedName("cr.f")
	public static final TransformComponentType field1208 = new TransformComponentType(4, 4, null, 0, 1);

	@ObfuscatedName("cr.w")
	public static final TransformComponentType field1213 = new TransformComponentType(5, 5, null, 1, 1);

	@ObfuscatedName("cr.l")
	public static final TransformComponentType field1204 = new TransformComponentType(6, 6, null, 2, 1);

	@ObfuscatedName("cr.u")
	public static final TransformComponentType field1211 = new TransformComponentType(7, 7, null, 0, 3);

	@ObfuscatedName("cr.z")
	public static final TransformComponentType field1212 = new TransformComponentType(8, 8, null, 1, 3);

	@ObfuscatedName("cr.p")
	public static final TransformComponentType field1218 = new TransformComponentType(9, 9, null, 2, 3);

	@ObfuscatedName("cr.d")
	public static final TransformComponentType field1210 = new TransformComponentType(10, 10, null, 0, 7);

	@ObfuscatedName("cr.c")
	public static final TransformComponentType field1214 = new TransformComponentType(11, 11, null, 1, 7);

	@ObfuscatedName("cr.r")
	public static final TransformComponentType field1216 = new TransformComponentType(12, 12, null, 2, 7);

	@ObfuscatedName("cr.v")
	public static final TransformComponentType field1217 = new TransformComponentType(13, 13, null, 3, 7);

	@ObfuscatedName("cr.o")
	public static final TransformComponentType field1205 = new TransformComponentType(14, 14, null, 4, 7);

	@ObfuscatedName("cr.s")
	public static final TransformComponentType field1219 = new TransformComponentType(15, 15, null, 5, 7);

	@ObfuscatedName("cr.y")
	public static final TransformComponentType field1220 = new TransformComponentType(16, 16, null, 0, 5);

	@ObfuscatedName("cr.q")
	public final int field1221;

	@ObfuscatedName("cr.x")
	public final int field1222;

	@ObfuscatedName("cr.b")
	public final int field1223;

	@ObfuscatedName("n.e(I)[Lcr;")
	public static TransformComponentType[] method142() {
		return new TransformComponentType[] { field1215, field1209, field1206, field1207, field1208, field1213, field1204, field1211, field1212, field1218, field1210, field1214, field1216, field1217, field1205, field1219, field1220 };
	}

	public TransformComponentType(int arg0, int arg1, String arg2, int arg3, int arg4) {
		this.field1221 = arg0;
		this.field1222 = arg1;
		this.field1223 = arg3;
	}

	@ObfuscatedName("cr.n()I")
	public int getId() {
		return this.field1222;
	}

	@ObfuscatedName("cr.m(I)I")
	public int method1421() {
		return this.field1223;
	}

	@ObfuscatedName("tt.f(II)Lcr;")
	public static TransformComponentType method8644(int arg0) {
		TransformComponentType var1 = (TransformComponentType) SerializableEnums.decode(method142(), arg0);
		if (var1 == null) {
			var1 = field1215;
		}
		return var1;
	}
}
