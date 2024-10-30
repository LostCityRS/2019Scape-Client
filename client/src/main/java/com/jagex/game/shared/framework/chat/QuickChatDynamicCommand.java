package com.jagex.game.shared.framework.chat;

import com.jagex.game.script.ClientScriptState;
import deob.ObfuscatedName;

@ObfuscatedName("xs")
public class QuickChatDynamicCommand {

	@ObfuscatedName("xs.e")
	public static final QuickChatDynamicCommand LISTDIALOG = new QuickChatDynamicCommand(0, 2, 2, 1);

	@ObfuscatedName("xs.n")
	public static final QuickChatDynamicCommand OBJDIALOG = new QuickChatDynamicCommand(1, 2, 2, 0);

	@ObfuscatedName("xs.m")
	public static final QuickChatDynamicCommand COUNTDIALOG = new QuickChatDynamicCommand(2, 4, 4, 0);

	@ObfuscatedName("xs.k")
	public static final QuickChatDynamicCommand STAT_BASE = new QuickChatDynamicCommand(4, 1, 1, 1);

	@ObfuscatedName("xs.f")
	public static final QuickChatDynamicCommand ENUM_STRING = new QuickChatDynamicCommand(6, 0, 4, 2);

	@ObfuscatedName("xs.w")
	public static final QuickChatDynamicCommand ENUM_STRING_CLAN = new QuickChatDynamicCommand(7, 0, 1, 1);

	@ObfuscatedName("xs.l")
	public static final QuickChatDynamicCommand TOSTRING_VARP = new QuickChatDynamicCommand(8, 0, 4, 1);

	@ObfuscatedName("xs.u")
	public static final QuickChatDynamicCommand TOSTRING_VARBIT = new QuickChatDynamicCommand(9, 0, 4, 1);

	@ObfuscatedName("xs.z")
	public static final QuickChatDynamicCommand OBJTRADEDIALOG = new QuickChatDynamicCommand(10, 2, 2, 0);

	@ObfuscatedName("xs.p")
	public static final QuickChatDynamicCommand ENUM_STRING_STATBASE = new QuickChatDynamicCommand(11, 0, 1, 2);

	@ObfuscatedName("xs.d")
	public static final QuickChatDynamicCommand ACC_GETCOUNT_WORLD = new QuickChatDynamicCommand(12, 0, 1, 0);

	@ObfuscatedName("xs.c")
	public static final QuickChatDynamicCommand ACC_GETMEANCOMBATLEVEL = new QuickChatDynamicCommand(13, 0, 1, 0);

	@ObfuscatedName("xs.r")
	public static final QuickChatDynamicCommand TOSTRING_SHARED = new QuickChatDynamicCommand(14, 0, 4, 1);

	@ObfuscatedName("xs.v")
	public static final QuickChatDynamicCommand ACTIVECOMBATLEVEL = new QuickChatDynamicCommand(15, 0, 1, 0);

	@ObfuscatedName("xs.o")
	public static final QuickChatDynamicCommand ENUM_STRING_VARBIT = new QuickChatDynamicCommand(16, 0, 4, 2);

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
		return new QuickChatDynamicCommand[] { ACTIVECOMBATLEVEL, ENUM_STRING, ENUM_STRING_VARBIT, OBJDIALOG, OBJTRADEDIALOG, ACC_GETMEANCOMBATLEVEL, LISTDIALOG, COUNTDIALOG, TOSTRING_VARBIT, STAT_BASE, TOSTRING_VARP, ENUM_STRING_STATBASE, ACC_GETCOUNT_WORLD, ENUM_STRING_CLAN, TOSTRING_SHARED };
	}

	public QuickChatDynamicCommand(int arg0, int arg1, int arg2, int arg3) {
		this.id = arg0;
		this.field7939 = arg1;
		this.field7940 = arg2;
		this.field7923 = arg3;
	}

	@ObfuscatedName("tl.n(II)Lxs;")
	public static QuickChatDynamicCommand getByID(int arg0) {
		QuickChatDynamicCommand[] var1 = method9288();
		for (int var2 = 0; var2 < var1.length; var2++) {
			if (var1[var2].id == arg0) {
				return var1[var2];
			}
		}
		return null;
	}

	public static final void add(ClientScriptState arg0, short arg1) {
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var2 - var3;
	}
}
