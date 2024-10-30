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
	public String[] text;

	@ObfuscatedName("asq.z")
	public int[] dynamicCommands;

	@ObfuscatedName("asq.p")
	public int[][] dynamicCommandParameters;

	@ObfuscatedName("asq.d")
	public int[] autoResponses;

	@ObfuscatedName("asq.c")
	public boolean searchable = true;

	@ObfuscatedName("asq.e(Lalw;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("asq.n(Lalw;IB)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.text = StringTools.split(arg0.gjstr(), '<');
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.autoResponses = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.autoResponses[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.g1();
			this.dynamicCommands = new int[var5];
			this.dynamicCommandParameters = new int[var5][];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				QuickChatDynamicCommand var8 = QuickChatDynamicCommand.getByID(var7);
				if (var8 != null) {
					this.dynamicCommands[var6] = var7;
					this.dynamicCommandParameters[var6] = new int[var8.field7923];
					for (int var9 = 0; var9 < var8.field7923; var9++) {
						this.dynamicCommandParameters[var6][var9] = arg0.g2();
					}
				}
			}
		} else if (arg1 == 4) {
			this.searchable = false;
		}
	}

	@ObfuscatedName("asq.m(Lalw;[II)V")
	public void packTransmitValues(Packet arg0, int[] arg1) {
		if (this.dynamicCommands == null) {
			return;
		}
		for (int var3 = 0; var3 < this.dynamicCommands.length && var3 < arg1.length; var3++) {
			int var4 = this.getDynamicCommand(var3).field7939;
			if (var4 > 0) {
				arg0.pVarLong((long) arg1[var3], var4);
			}
		}
	}

	@ObfuscatedName("asq.k(Lalw;B)Ljava/lang/String;")
	public String getText(Packet arg0) {
		StringBuilder var2 = new StringBuilder(80);
		if (this.dynamicCommands != null) {
			for (int var3 = 0; var3 < this.dynamicCommands.length; var3++) {
				var2.append(this.text[var3]);
				var2.append(this.phrases.getDynamicText(this.getDynamicCommand(var3), this.dynamicCommandParameters[var3], arg0.gVarLong(QuickChatDynamicCommand.getByID(this.dynamicCommands[var3]).field7940)));
			}
		}
		var2.append(this.text[this.text.length - 1]);
		return var2.toString();
	}

	@ObfuscatedName("asq.f(I)Ljava/lang/String;")
	public String getTextDisplay() {
		StringBuilder var1 = new StringBuilder(80);
		if (this.text == null) {
			return "";
		}
		var1.append(this.text[0]);
		for (int var2 = 1; var2 < this.text.length; var2++) {
			for (int var3 = 0; var3 < 3; var3++) {
				var1.append('.');
			}
			var1.append(this.text[var2]);
		}
		return var1.toString();
	}

	@ObfuscatedName("asq.w(I)I")
	public int length() {
		return this.dynamicCommands == null ? 0 : this.dynamicCommands.length;
	}

	@ObfuscatedName("asq.l(IB)Lxs;")
	public QuickChatDynamicCommand getDynamicCommand(int arg0) {
		return this.dynamicCommands == null || arg0 < 0 || arg0 > this.dynamicCommands.length ? null : QuickChatDynamicCommand.getByID(this.dynamicCommands[arg0]);
	}

	@ObfuscatedName("asq.u(III)I")
	public int method19506(int arg0, int arg1) {
		if (this.dynamicCommands == null || arg0 < 0 || arg0 > this.dynamicCommands.length) {
			return -1;
		} else if (this.dynamicCommandParameters[arg0] == null || arg1 < 0 || arg1 > this.dynamicCommandParameters[arg0].length) {
			return -1;
		} else {
			return this.dynamicCommandParameters[arg0][arg1];
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
