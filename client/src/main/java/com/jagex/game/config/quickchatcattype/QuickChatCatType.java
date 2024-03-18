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
	public void method19449(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method19467(arg0, var2);
		}
	}

	@ObfuscatedName("asd.n(Lalw;II)V")
	public void method19467(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.description = arg0.gjstr();
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.subCategories = new int[var3];
			this.subCategoriesShortcuts = new char[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.subCategories[var4] = arg0.g2();
				byte var5 = arg0.g1b();
				this.subCategoriesShortcuts[var4] = var5 == 0 ? 0 : Cp1252.byteToCp1252Char(var5);
			}
		} else if (arg1 == 3) {
			int var6 = arg0.g1();
			this.phrases = new int[var6];
			this.phrasesShortcuts = new char[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.phrases[var7] = arg0.g2();
				byte var8 = arg0.g1b();
				this.phrasesShortcuts[var7] = var8 == 0 ? 0 : Cp1252.byteToCp1252Char(var8);
			}
		} else if (arg1 == 4) {
		}
	}

	@ObfuscatedName("asd.m(CI)I")
	public int getSubCategoryByShortcut(char arg0) {
		if (this.subCategories == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.subCategories.length; var2++) {
			if (this.subCategoriesShortcuts[var2] == arg0) {
				return this.subCategories[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.k(CI)I")
	public int getPhraseByShortcut(char arg0) {
		if (this.phrases == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.phrases.length; var2++) {
			if (this.phrasesShortcuts[var2] == arg0) {
				return this.phrases[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("asd.f(I)V")
	public void method19452() {
		if (this.phrases != null) {
			for (int var1 = 0; var1 < this.phrases.length; var1++) {
				this.phrases[var1] |= 0x8000;
			}
		}
		if (this.subCategories != null) {
			for (int var2 = 0; var2 < this.subCategories.length; var2++) {
				this.subCategories[var2] |= 0x8000;
			}
		}
	}
}
