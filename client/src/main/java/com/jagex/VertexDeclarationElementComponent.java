package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lj")
public class VertexDeclarationElementComponent {

	@ObfuscatedName("lj.e")
	public static final VertexDeclarationElementComponent field3310 = new VertexDeclarationElementComponent(4, 0, 3, DataType.FLOAT_32);

	@ObfuscatedName("lj.n")
	public static final VertexDeclarationElementComponent field3301 = new VertexDeclarationElementComponent(11, 1, 3, DataType.FLOAT_32);

	@ObfuscatedName("lj.m")
	public static final VertexDeclarationElementComponent field3311 = new VertexDeclarationElementComponent(2, 2, 4, DataType.UNSIGNED_INT_8);

	@ObfuscatedName("lj.k")
	public static final VertexDeclarationElementComponent field3303 = new VertexDeclarationElementComponent(7, 3, 1, DataType.FLOAT_32);

	@ObfuscatedName("lj.f")
	public static final VertexDeclarationElementComponent field3300 = new VertexDeclarationElementComponent(5, 4, 2, DataType.FLOAT_32);

	@ObfuscatedName("lj.w")
	public static final VertexDeclarationElementComponent field3305 = new VertexDeclarationElementComponent(3, 5, 3, DataType.FLOAT_32);

	@ObfuscatedName("lj.l")
	public static final VertexDeclarationElementComponent field3306 = new VertexDeclarationElementComponent(9, 6, 4, DataType.FLOAT_32);

	@ObfuscatedName("lj.u")
	public static final VertexDeclarationElementComponent field3307 = new VertexDeclarationElementComponent(10, 7, 4, DataType.FLOAT_32);

	@ObfuscatedName("lj.z")
	public static final VertexDeclarationElementComponent field3308 = new VertexDeclarationElementComponent(1, 8, 4, DataType.FLOAT_32);

	@ObfuscatedName("lj.p")
	public static final VertexDeclarationElementComponent field3309 = new VertexDeclarationElementComponent(0, 9, 4, DataType.FLOAT_32);

	@ObfuscatedName("lj.d")
	public static final VertexDeclarationElementComponent field3314 = new VertexDeclarationElementComponent(8, 10, 3, DataType.FLOAT_32);

	@ObfuscatedName("lj.c")
	public static final VertexDeclarationElementComponent field3315 = new VertexDeclarationElementComponent(6, 11, 3, DataType.FLOAT_32);

	@ObfuscatedName("lj.r")
	public final int field3312;

	@ObfuscatedName("lj.o")
	public static final int field3302 = IntMath.method8327(16);

	@ObfuscatedName("lj.s")
	public final int field3316;

	@ObfuscatedName("lj.y")
	public final int field3313;

	@ObfuscatedName("lj.q")
	public final int field3317;

	@ObfuscatedName("lj.x")
	public final DataType field3318;

	public VertexDeclarationElementComponent(int arg0, int arg1, int arg2, DataType arg3) {
		this.field3312 = arg0;
		this.field3316 = arg1;
		this.field3317 = arg2;
		this.field3318 = arg3;
		this.field3313 = this.field3318.field1652 * this.field3317;
		if (this.field3316 >= 16) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("lj.e(I)Llj;")
	public static VertexDeclarationElementComponent method5692(int arg0) {
		switch(arg0) {
			case 0:
				return field3310;
			case 1:
				return field3301;
			case 2:
				return field3311;
			case 3:
				return field3303;
			case 4:
				return field3300;
			case 5:
				return field3305;
			case 6:
				return field3306;
			default:
				return null;
		}
	}
}
