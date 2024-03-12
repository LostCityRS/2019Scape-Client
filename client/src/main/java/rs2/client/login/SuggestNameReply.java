package rs2.client.login;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zg")
public class SuggestNameReply implements SerializableEnum {

	@ObfuscatedName("zg.e")
	public static final SuggestNameReply field8394 = new SuggestNameReply(-2);

	@ObfuscatedName("zg.n")
	public static final SuggestNameReply field8392 = new SuggestNameReply(-3);

	@ObfuscatedName("zg.m")
	public static final SuggestNameReply field8391 = new SuggestNameReply(2);

	@ObfuscatedName("zg.k")
	public static final SuggestNameReply field8393 = new SuggestNameReply(3);

	@ObfuscatedName("zg.f")
	public static final SuggestNameReply field8395 = new SuggestNameReply(4);

	@ObfuscatedName("zg.w")
	public final int field8396;

	@ObfuscatedName("wc.e(B)[Lzg;")
	public static SuggestNameReply[] method9840() {
		return new SuggestNameReply[] { field8391, field8395, field8394, field8393, field8392 };
	}

	public SuggestNameReply(int arg0) {
		this.field8396 = arg0;
	}

	@ObfuscatedName("zg.n()I")
	public int getId() {
		return this.field8396;
	}
}
