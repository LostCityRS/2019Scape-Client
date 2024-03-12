package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zl")
public class ConnectReply implements SerializableEnum {

	@ObfuscatedName("zl.e")
	public static final ConnectReply field8367 = new ConnectReply(-1);

	@ObfuscatedName("zl.n")
	public static final ConnectReply field8361 = new ConnectReply(-2);

	@ObfuscatedName("zl.m")
	public static final ConnectReply field8368 = new ConnectReply(-3);

	@ObfuscatedName("zl.k")
	public static final ConnectReply field8360 = new ConnectReply(-4);

	@ObfuscatedName("zl.f")
	public static final ConnectReply field8363 = new ConnectReply(-5);

	@ObfuscatedName("zl.w")
	public static final ConnectReply field8364 = new ConnectReply(2);

	@ObfuscatedName("zl.l")
	public static final ConnectReply field8365 = new ConnectReply(3);

	@ObfuscatedName("zl.u")
	public static final ConnectReply field8366 = new ConnectReply(7);

	@ObfuscatedName("zl.z")
	public static final ConnectReply field8359 = new ConnectReply(9);

	@ObfuscatedName("zl.p")
	public static final ConnectReply field8362 = new ConnectReply(37);

	@ObfuscatedName("zl.d")
	public final int field8369;

	@ObfuscatedName("ahn.e(I)[Lzl;")
	public static ConnectReply[] method16743() {
		return new ConnectReply[] { field8365, field8359, field8360, field8366, field8368, field8361, field8367, field8362, field8363, field8364 };
	}

	public ConnectReply(int arg0) {
		this.field8369 = arg0;
	}

	@ObfuscatedName("zl.n()I")
	public int getId() {
		return this.field8369;
	}
}
