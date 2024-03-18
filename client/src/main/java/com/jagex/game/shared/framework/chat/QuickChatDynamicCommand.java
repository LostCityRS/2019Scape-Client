package com.jagex.game.shared.framework.chat;

import deob.ObfuscatedName;

@ObfuscatedName("xs")
public class QuickChatDynamicCommand {

	@ObfuscatedName("xs.e")
	public static final QuickChatDynamicCommand field7941 = new QuickChatDynamicCommand(0, 2, 2, 1);

	@ObfuscatedName("xs.n")
	public static final QuickChatDynamicCommand field7924 = new QuickChatDynamicCommand(1, 2, 2, 0);

	@ObfuscatedName("xs.m")
	public static final QuickChatDynamicCommand field7934 = new QuickChatDynamicCommand(2, 4, 4, 0);

	@ObfuscatedName("xs.k")
	public static final QuickChatDynamicCommand field7931 = new QuickChatDynamicCommand(4, 1, 1, 1);

	@ObfuscatedName("xs.f")
	public static final QuickChatDynamicCommand field7927 = new QuickChatDynamicCommand(6, 0, 4, 2);

	@ObfuscatedName("xs.w")
	public static final QuickChatDynamicCommand field7928 = new QuickChatDynamicCommand(7, 0, 1, 1);

	@ObfuscatedName("xs.l")
	public static final QuickChatDynamicCommand field7929 = new QuickChatDynamicCommand(8, 0, 4, 1);

	@ObfuscatedName("xs.u")
	public static final QuickChatDynamicCommand field7926 = new QuickChatDynamicCommand(9, 0, 4, 1);

	@ObfuscatedName("xs.z")
	public static final QuickChatDynamicCommand field7937 = new QuickChatDynamicCommand(10, 2, 2, 0);

	@ObfuscatedName("xs.p")
	public static final QuickChatDynamicCommand field7932 = new QuickChatDynamicCommand(11, 0, 1, 2);

	@ObfuscatedName("xs.d")
	public static final QuickChatDynamicCommand field7933 = new QuickChatDynamicCommand(12, 0, 1, 0);

	@ObfuscatedName("xs.c")
	public static final QuickChatDynamicCommand field7930 = new QuickChatDynamicCommand(13, 0, 1, 0);

	@ObfuscatedName("xs.r")
	public static final QuickChatDynamicCommand field7935 = new QuickChatDynamicCommand(14, 0, 4, 1);

	@ObfuscatedName("xs.v")
	public static final QuickChatDynamicCommand field7936 = new QuickChatDynamicCommand(15, 0, 1, 0);

	@ObfuscatedName("xs.o")
	public static final QuickChatDynamicCommand field7925 = new QuickChatDynamicCommand(16, 0, 4, 2);

	@ObfuscatedName("xs.s")
	public int id;

	@ObfuscatedName("xs.y")
	public int field7939;

	@ObfuscatedName("xs.q")
	public int field7940;

	@ObfuscatedName("xs.x")
	public int field7923;

	@ObfuscatedName("vl.e(I)[Lxs;")
	public static QuickChatDynamicCommand[] method9288() {
		return new QuickChatDynamicCommand[] { field7936, field7927, field7925, field7924, field7937, field7930, field7941, field7934, field7926, field7931, field7929, field7932, field7933, field7928, field7935 };
	}

	public QuickChatDynamicCommand(int arg0, int arg1, int arg2, int arg3) {
		this.id = arg0;
		this.field7939 = arg1;
		this.field7940 = arg2;
		this.field7923 = arg3;
	}

	@ObfuscatedName("tl.n(II)Lxs;")
	public static QuickChatDynamicCommand getDynamicCommand(int arg0) {
		QuickChatDynamicCommand[] var1 = method9288();
		for (int var2 = 0; var2 < var1.length; var2++) {
			if (var1[var2].id == arg0) {
				return var1[var2];
			}
		}
		return null;
	}

}
