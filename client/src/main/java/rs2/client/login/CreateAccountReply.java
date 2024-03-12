package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zb")
public class CreateAccountReply implements SerializableEnum {

	@ObfuscatedName("zb.e")
	public static final CreateAccountReply field8390 = new CreateAccountReply(-2);

	@ObfuscatedName("zb.n")
	public static final CreateAccountReply field8388 = new CreateAccountReply(-3);

	@ObfuscatedName("zb.m")
	public static final CreateAccountReply field8373 = new CreateAccountReply(2);

	@ObfuscatedName("zb.k")
	public static final CreateAccountReply field8378 = new CreateAccountReply(3);

	@ObfuscatedName("zb.f")
	public static final CreateAccountReply field8375 = new CreateAccountReply(4);

	@ObfuscatedName("zb.w")
	public static final CreateAccountReply field8376 = new CreateAccountReply(5);

	@ObfuscatedName("zb.l")
	public static final CreateAccountReply field8377 = new CreateAccountReply(6);

	@ObfuscatedName("zb.u")
	public static final CreateAccountReply field8379 = new CreateAccountReply(7);

	@ObfuscatedName("zb.z")
	public static final CreateAccountReply field8372 = new CreateAccountReply(8);

	@ObfuscatedName("zb.p")
	public static final CreateAccountReply field8380 = new CreateAccountReply(9);

	@ObfuscatedName("zb.d")
	public static final CreateAccountReply field8381 = new CreateAccountReply(10);

	@ObfuscatedName("zb.c")
	public static final CreateAccountReply field8382 = new CreateAccountReply(20);

	@ObfuscatedName("zb.r")
	public static final CreateAccountReply field8383 = new CreateAccountReply(21);

	@ObfuscatedName("zb.v")
	public static final CreateAccountReply field8384 = new CreateAccountReply(30);

	@ObfuscatedName("zb.o")
	public static final CreateAccountReply field8385 = new CreateAccountReply(31);

	@ObfuscatedName("zb.s")
	public static final CreateAccountReply field8386 = new CreateAccountReply(32);

	@ObfuscatedName("zb.y")
	public static final CreateAccountReply field8374 = new CreateAccountReply(33);

	@ObfuscatedName("zb.q")
	public static final CreateAccountReply field8371 = new CreateAccountReply(34);

	@ObfuscatedName("zb.x")
	public static final CreateAccountReply field8389 = new CreateAccountReply(38);

	@ObfuscatedName("zb.b")
	public final int field8387;

	@ObfuscatedName("iz.e(I)[Lzb;")
	public static CreateAccountReply[] method4614() {
		return new CreateAccountReply[] { field8385, field8388, field8372, field8386, field8377, field8375, field8379, field8380, field8382, field8384, field8389, field8378, field8390, field8381, field8376, field8373, field8374, field8371, field8383 };
	}

	public CreateAccountReply(int arg0) {
		this.field8387 = arg0;
	}

	@ObfuscatedName("zb.n()I")
	public int getId() {
		return this.field8387;
	}
}
