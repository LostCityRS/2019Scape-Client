package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vf")
public class FacetMode implements SerializableEnum {

	@ObfuscatedName("vf.e")
	public static final FacetMode field7581 = new FacetMode(0);

	@ObfuscatedName("vf.n")
	public static final FacetMode field7582 = new FacetMode(1);

	@ObfuscatedName("vf.m")
	public static final FacetMode field7580 = new FacetMode(2);

	@ObfuscatedName("vf.k")
	public static final FacetMode field7579 = new FacetMode(3);

	@ObfuscatedName("vf.f")
	public static final FacetMode field7583 = new FacetMode(4);

	@ObfuscatedName("vf.w")
	public static final FacetMode field7578 = new FacetMode(5);

	@ObfuscatedName("vf.l")
	public final int field7584;

	@ObfuscatedName("ih.e(I)[Lvf;")
	public static FacetMode[] method4590() {
		return new FacetMode[] { field7578, field7582, field7583, field7579, field7580, field7581 };
	}

	public FacetMode(int arg0) {
		this.field7584 = arg0;
	}

	@ObfuscatedName("vf.n()I")
	public int getId() {
		return this.field7584;
	}
}
