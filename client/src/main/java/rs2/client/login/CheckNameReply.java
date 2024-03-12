package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zr")
public class CheckNameReply implements SerializableEnum {

	@ObfuscatedName("zr.e")
	public static final CheckNameReply field8407 = new CheckNameReply(-2);

	@ObfuscatedName("zr.n")
	public static final CheckNameReply field8405 = new CheckNameReply(-3);

	@ObfuscatedName("zr.m")
	public static final CheckNameReply field8406 = new CheckNameReply(2);

	@ObfuscatedName("zr.k")
	public static final CheckNameReply field8404 = new CheckNameReply(3);

	@ObfuscatedName("zr.f")
	public static final CheckNameReply field8408 = new CheckNameReply(4);

	@ObfuscatedName("zr.w")
	public static final CheckNameReply field8409 = new CheckNameReply(5);

	@ObfuscatedName("zr.l")
	public static final CheckNameReply field8412 = new CheckNameReply(6);

	@ObfuscatedName("zr.u")
	public static final CheckNameReply field8411 = new CheckNameReply(7);

	@ObfuscatedName("zr.z")
	public static final CheckNameReply field8410 = new CheckNameReply(8);

	@ObfuscatedName("zr.p")
	public final int field8413;

	@ObfuscatedName("nw.e(I)[Lzr;")
	public static CheckNameReply[] method6019() {
		return new CheckNameReply[] { field8408, field8407, field8404, field8405, field8409, field8412, field8406, field8411, field8410 };
	}

	public CheckNameReply(int arg0) {
		this.field8413 = arg0;
	}

	@ObfuscatedName("zr.n()I")
	public int getId() {
		return this.field8413;
	}
}
