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
			this.text = StringTools.split(buf.gjstr(), '<');
		} else if (code == 2) {
			int length = buf.g1();
			this.autoResponses = new int[length];
			for (int index = 0; index < length; index++) {
				this.autoResponses[index] = buf.g2();
			}
		} else if (code == 3) {
			int length = buf.g1();
			this.dynamicCommands = new int[length];
			this.dynamicCommandParameters = new int[length][];
			for (int index = 0; index < length; index++) {
				int var7 = buf.g2();
				QuickChatDynamicCommand dynamicCommand = QuickChatDynamicCommand.getByID(var7);
				if (dynamicCommand != null) {
					this.dynamicCommands[index] = var7;
					this.dynamicCommandParameters[index] = new int[dynamicCommand.field7923];
					for (int var9 = 0; var9 < dynamicCommand.field7923; var9++) {
						this.dynamicCommandParameters[index][var9] = buf.g2();
					}
				}
			}
		} else if (code == 4) {
			this.searchable = false;
		}
	}

	@ObfuscatedName("asq.m(Lalw;[II)V")
	public void packTransmitValues(Packet buf, int[] dynamics) {
		if (this.dynamicCommands == null) {
			return;
		}
		for (int index = 0; index < this.dynamicCommands.length && index < dynamics.length; index++) {
			int var4 = this.getDynamicCommand(index).field7939;
			if (var4 > 0) {
				buf.pVarLong((long) dynamics[index], var4);
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
