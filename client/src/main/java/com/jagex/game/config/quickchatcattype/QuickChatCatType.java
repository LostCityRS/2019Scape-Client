package com.jagex.game.config.quickchatcattype;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import deob.ObfuscatedName;

@ObfuscatedName("asd")
public class QuickChatCatType extends SecondaryNode {

	@ObfuscatedName("asd.l")
	public String description;

	@ObfuscatedName("asd.u")
	public int[] subCategories;

	@ObfuscatedName("asd.z")
	public char[] subCategoriesShortcuts;

	@ObfuscatedName("asd.p")
	public int[] phrases;

	@ObfuscatedName("asd.d")
	public char[] phrasesShortcuts;

	@ObfuscatedName("asd.e(Lalw;I)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("asd.n(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.description = buf.gjstr();
		} else if (code == 2) {
			int length = buf.g1();
			this.subCategories = new int[length];
			this.subCategoriesShortcuts = new char[length];
			for (int index = 0; index < length; index++) {
				this.subCategories[index] = buf.g2();
				byte var5 = buf.g1b();
				this.subCategoriesShortcuts[index] = var5 == 0 ? 0 : Cp1252.byteToCp1252Char(var5);
			}
		} else if (code == 3) {
			int length = buf.g1();
			this.phrases = new int[length];
			this.phrasesShortcuts = new char[length];
			for (int index = 0; index < length; index++) {
				this.phrases[index] = buf.g2();
				byte var8 = buf.g1b();
				this.phrasesShortcuts[index] = var8 == 0 ? 0 : Cp1252.byteToCp1252Char(var8);
			}
		} else if (code == 4) {
		}
	}

	@ObfuscatedName("asd.m(CI)I")
	public int getSubCategoryByShortcut(char shortcut) {
		if (this.subCategories == null) {
			return -1;
		}
		for (int index = 0; index < this.subCategories.length; index++) {
			if (this.subCategoriesShortcuts[index] == shortcut) {
				return this.subCategories[index];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.k(CI)I")
	public int getPhraseByShortcut(char shortcut) {
		if (this.phrases == null) {
			return -1;
		}
		for (int index = 0; index < this.phrases.length; index++) {
			if (this.phrasesShortcuts[index] == shortcut) {
				return this.phrases[index];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.f(I)V")
	public void postDecode() {
		if (this.phrases != null) {
			for (int index = 0; index < this.phrases.length; index++) {
				this.phrases[index] |= 0x8000;
			}
		}
		if (this.subCategories != null) {
			for (int index = 0; index < this.subCategories.length; index++) {
				this.subCategories[index] |= 0x8000;
			}
		}
	}
}
