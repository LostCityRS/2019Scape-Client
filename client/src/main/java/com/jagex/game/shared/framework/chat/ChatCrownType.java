package com.jagex.game.shared.framework.chat;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("nn")
public class ChatCrownType implements SerializableEnum {

	@ObfuscatedName("nn.e")
	public static final ChatCrownType field3610 = new ChatCrownType(0, -1, true, false, true);

	@ObfuscatedName("nn.n")
	public static final ChatCrownType field3608 = new ChatCrownType(1, 0, true, true, true);

	@ObfuscatedName("nn.m")
	public static final ChatCrownType field3600 = new ChatCrownType(2, 1, true, true, false);

	@ObfuscatedName("nn.k")
	public static final ChatCrownType field3601 = new ChatCrownType(3, 8, false, true, true);

	@ObfuscatedName("nn.f")
	public static final ChatCrownType field3598 = new ChatCrownType(4, 9, false, false, true);

	@ObfuscatedName("nn.w")
	public static final ChatCrownType field3603 = new ChatCrownType(5, 10, false, true, true);

	@ObfuscatedName("nn.l")
	public static final ChatCrownType field3604 = new ChatCrownType(6, 11, false, false, true);

	@ObfuscatedName("nn.u")
	public static final ChatCrownType field3605 = new ChatCrownType(7, 12, false, false, true);

	@ObfuscatedName("nn.z")
	public static final ChatCrownType field3606 = new ChatCrownType(8, 13, false, false, true);

	@ObfuscatedName("nn.p")
	public final int field3607;

	@ObfuscatedName("nn.d")
	public final int img;

	@ObfuscatedName("nn.c")
	public final boolean field3609;

	@ObfuscatedName("nn.r")
	public final boolean ignorable;

	@ObfuscatedName("nn.e(I)[Lnn;")
	public static ChatCrownType[] method6043() {
		return new ChatCrownType[] { field3605, field3600, field3603, field3601, field3604, field3606, field3608, field3610, field3598 };
	}

	public ChatCrownType(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.field3607 = arg0;
		this.img = arg1;
		this.field3609 = arg3;
		this.ignorable = arg4;
	}

	@ObfuscatedName("nn.n()I")
	public int getId() {
		return this.field3607;
	}
}
