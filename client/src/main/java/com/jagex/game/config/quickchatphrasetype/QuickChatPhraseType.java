package com.jagex.game.config.quickchatphrasetype;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.StringTools;
import com.jagex.game.shared.framework.chat.QuickChatDynamicCommand;
import deob.ObfuscatedName;

@ObfuscatedName("asq")
public class QuickChatPhraseType extends SecondaryNode {

	@ObfuscatedName("asq.l")
	public QuickChatPhraseTypeList phrases;

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
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("asq.n(Lalw;IB)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.field12379 = StringTools.split(buf.gjstr(), '<');
		} else if (code == 2) {
			int length = buf.g1();
			this.autoResponses = new int[length];
			for (int index = 0; index < length; index++) {
				this.autoResponses[index] = buf.g2();
			}
		} else if (code == 3) {
			int length = buf.g1();
			this.commands = new int[length];
			this.field12378 = new int[length][];
			for (int index = 0; index < length; index++) {
				int var7 = buf.g2();
				QuickChatDynamicCommand dynamicCommand = QuickChatDynamicCommand.getDynamicCommand(var7);
				if (dynamicCommand != null) {
					this.commands[index] = var7;
					this.field12378[index] = new int[dynamicCommand.field7923];
					for (int var9 = 0; var9 < dynamicCommand.field7923; var9++) {
						this.field12378[index][var9] = buf.g2();
					}
				}
			}
		} else if (code == 4) {
			this.field12382 = false;
		}
	}

	@ObfuscatedName("asq.m(Lalw;[II)V")
	public void putDynamics(Packet buf, int[] dynamics) {
		if (this.commands == null) {
			return;
		}
		for (int index = 0; index < this.commands.length && index < dynamics.length; index++) {
			int var4 = this.getDynamicCommand(index).field7939;
			if (var4 > 0) {
				buf.pVarLong((long) dynamics[index], var4);
			}
		}
	}

	@ObfuscatedName("asq.k(Lalw;B)Ljava/lang/String;")
	public String method19507(Packet arg0) {
		StringBuilder var2 = new StringBuilder(80);
		if (this.commands != null) {
			for (int var3 = 0; var3 < this.commands.length; var3++) {
				var2.append(this.field12379[var3]);
				var2.append(this.phrases.method14978(this.getDynamicCommand(var3), this.field12378[var3], arg0.gVarLong(QuickChatDynamicCommand.getDynamicCommand(this.commands[var3]).field7940)));
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
		return this.commands == null || arg0 < 0 || arg0 > this.commands.length ? null : QuickChatDynamicCommand.getDynamicCommand(this.commands[arg0]);
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
	public void postDecode() {
		if (this.autoResponses != null) {
			for (int var1 = 0; var1 < this.autoResponses.length; var1++) {
				this.autoResponses[var1] |= 0x8000;
			}
		}
	}
}
