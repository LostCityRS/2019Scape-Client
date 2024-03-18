package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.StringTools;
import com.jagex.game.shared.framework.chat.QuickChatDynamicCommand;
import deob.ObfuscatedName;

@ObfuscatedName("asq")
public class QuickChatPhraseType extends SecondaryNode {

	@ObfuscatedName("asq.l")
	public QuickChatPhraseTypeList field12380;

	@ObfuscatedName("asq.u")
	public String[] field12379;

	@ObfuscatedName("asq.z")
	public int[] commands;

	@ObfuscatedName("asq.p")
	public int[][] field12378;

	@ObfuscatedName("asq.d")
	public int[] autoResponses;

	@ObfuscatedName("asq.c")
	public boolean field12382 = true;

	@ObfuscatedName("asq.e(Lalw;I)V")
	public void method19526(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method19521(arg0, var2);
		}
	}

	@ObfuscatedName("asq.n(Lalw;IB)V")
	public void method19521(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field12379 = StringTools.method17361(arg0.gjstr(), '<');
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.autoResponses = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.autoResponses[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.g1();
			this.commands = new int[var5];
			this.field12378 = new int[var5][];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				QuickChatDynamicCommand var8 = QuickChatDynamicCommand.method8897(var7);
				if (var8 != null) {
					this.commands[var6] = var7;
					this.field12378[var6] = new int[var8.field7923];
					for (int var9 = 0; var9 < var8.field7923; var9++) {
						this.field12378[var6][var9] = arg0.g2();
					}
				}
			}
		} else if (arg1 == 4) {
			this.field12382 = false;
		}
	}

	@ObfuscatedName("asq.m(Lalw;[II)V")
	public void method19508(Packet arg0, int[] arg1) {
		if (this.commands == null) {
			return;
		}
		for (int var3 = 0; var3 < this.commands.length && var3 < arg1.length; var3++) {
			int var4 = this.getDynamicCommand(var3).field7939;
			if (var4 > 0) {
				arg0.pVarLong((long) arg1[var3], var4);
			}
		}
	}

	@ObfuscatedName("asq.k(Lalw;B)Ljava/lang/String;")
	public String method19507(Packet arg0) {
		StringBuilder var2 = new StringBuilder(80);
		if (this.commands != null) {
			for (int var3 = 0; var3 < this.commands.length; var3++) {
				var2.append(this.field12379[var3]);
				var2.append(this.field12380.method14978(this.getDynamicCommand(var3), this.field12378[var3], arg0.gVarLong(QuickChatDynamicCommand.method8897(this.commands[var3]).field7940)));
			}
		}
		var2.append(this.field12379[this.field12379.length - 1]);
		return var2.toString();
	}

	@ObfuscatedName("asq.f(I)Ljava/lang/String;")
	public String getText() {
		StringBuilder var1 = new StringBuilder(80);
		if (this.field12379 == null) {
			return "";
		}
		var1.append(this.field12379[0]);
		for (int var2 = 1; var2 < this.field12379.length; var2++) {
			for (int var3 = 0; var3 < 3; var3++) {
				var1.append('.');
			}
			var1.append(this.field12379[var2]);
		}
		return var1.toString();
	}

	@ObfuscatedName("asq.w(I)I")
	public int length() {
		return this.commands == null ? 0 : this.commands.length;
	}

	@ObfuscatedName("asq.l(IB)Lxs;")
	public QuickChatDynamicCommand getDynamicCommand(int arg0) {
		return this.commands == null || arg0 < 0 || arg0 > this.commands.length ? null : QuickChatDynamicCommand.method8897(this.commands[arg0]);
	}

	@ObfuscatedName("asq.u(III)I")
	public int method19506(int arg0, int arg1) {
		if (this.commands == null || arg0 < 0 || arg0 > this.commands.length) {
			return -1;
		} else if (this.field12378[arg0] == null || arg1 < 0 || arg1 > this.field12378[arg0].length) {
			return -1;
		} else {
			return this.field12378[arg0][arg1];
		}
	}

	@ObfuscatedName("asq.z(B)V")
	public void method19511() {
		if (this.autoResponses != null) {
			for (int var1 = 0; var1 < this.autoResponses.length; var1++) {
				this.autoResponses[var1] |= 0x8000;
			}
		}
	}
}
