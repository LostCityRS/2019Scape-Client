package com.jagex;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zx")
public class CheckEmailReply implements SerializableEnum {

	@ObfuscatedName("zx.e")
	public static final CheckEmailReply field8397 = new CheckEmailReply(-2);

	@ObfuscatedName("zx.n")
	public static final CheckEmailReply field8400 = new CheckEmailReply(-3);

	@ObfuscatedName("zx.m")
	public static final CheckEmailReply field8399 = new CheckEmailReply(2);

	@ObfuscatedName("zx.k")
	public static final CheckEmailReply field8402 = new CheckEmailReply(3);

	@ObfuscatedName("zx.f")
	public static final CheckEmailReply field8401 = new CheckEmailReply(21);

	@ObfuscatedName("zx.w")
	public static final CheckEmailReply field8398 = new CheckEmailReply(20);

	@ObfuscatedName("zx.l")
	public final int field8403;

	public CheckEmailReply(int arg0) {
		this.field8403 = arg0;
	}

	@ObfuscatedName("zx.n()I")
	public int getId() {
		return this.field8403;
	}
}
