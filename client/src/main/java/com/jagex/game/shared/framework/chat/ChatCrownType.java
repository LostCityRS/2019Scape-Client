package com.jagex.game.shared.framework.chat;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("nn")
public class ChatCrownType implements SerializableEnum {

	@ObfuscatedName("nn.e")
	public static final ChatCrownType NONE = new ChatCrownType(0, -1, true, false, true);

	@ObfuscatedName("nn.n")
	public static final ChatCrownType PLAYER_MOD = new ChatCrownType(1, 0, true, true, true);

	@ObfuscatedName("nn.m")
	public static final ChatCrownType STAFF_MOD = new ChatCrownType(2, 1, true, true, false);

	@ObfuscatedName("nn.k")
	public static final ChatCrownType LOCAL_MOD = new ChatCrownType(3, 8, false, true, true);

	@ObfuscatedName("nn.f")
	public static final ChatCrownType PREMIER_CLUB = new ChatCrownType(4, 9, false, false, true);

	@ObfuscatedName("nn.w")
	public static final ChatCrownType PREMIER_CLUB_PLAYER_MOD = new ChatCrownType(5, 10, false, true, true);

	@ObfuscatedName("nn.l")
	public static final ChatCrownType IRONMAN = new ChatCrownType(6, 11, false, false, true);

	@ObfuscatedName("nn.u")
	public static final ChatCrownType HARDCORE = new ChatCrownType(7, 12, false, false, true);

	@ObfuscatedName("nn.z")
	public static final ChatCrownType HARDCORE_IRONMAN = new ChatCrownType(8, 13, false, false, true);

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
		return new ChatCrownType[] {HARDCORE, STAFF_MOD, PREMIER_CLUB_PLAYER_MOD, LOCAL_MOD, IRONMAN, HARDCORE_IRONMAN, PLAYER_MOD, NONE, PREMIER_CLUB};
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
