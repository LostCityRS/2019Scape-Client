package com.jagex.game.script;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ge")
public class CommunityPartnerType implements SerializableEnum {

	@ObfuscatedName("ge.e")
	public static final CommunityPartnerType field1950 = new CommunityPartnerType(1, 0);

	@ObfuscatedName("ge.n")
	public static final CommunityPartnerType field1947 = new CommunityPartnerType(0, 1);

	@ObfuscatedName("ge.m")
	public static final CommunityPartnerType field1948 = new CommunityPartnerType(2, 2);

	@ObfuscatedName("ge.k")
	public final int field1949;

	@ObfuscatedName("ge.f")
	public final int field1946;

	@ObfuscatedName("ge.e(B)[Lge;")
	public static CommunityPartnerType[] method3559() {
		return new CommunityPartnerType[] { field1947, field1950, field1948 };
	}

	public CommunityPartnerType(int arg0, int arg1) {
		this.field1949 = arg0;
		this.field1946 = arg1;
	}

	@ObfuscatedName("ge.n()I")
	public int getId() {
		return this.field1946;
	}
}
