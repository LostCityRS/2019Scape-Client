package com.jagex;

import com.jagex.game.runetek5.config.seqtype.SeqType;
import com.jagex.game.runetek5.config.seqtype.SeqTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("aao")
public class KeyFrameSetLoader {

	@ObfuscatedName("aao.e")
	public int field8525;

	@ObfuscatedName("aao.n")
	public KeyFrameSet field8523;

	@ObfuscatedName("aao.m")
	public boolean field8524 = false;

	@ObfuscatedName("aao.e(Laos;Lfg;B)Z")
	public final boolean method14443(SeqTypeList arg0, SeqType arg1) {
		if (!this.field8524) {
			this.field8523 = arg0.method18865(arg1.field1784);
			if (this.field8523 != null) {
				if (arg1.field1786) {
					this.field8525 |= 0x200;
				}
				if (this.field8523.method19406()) {
					this.field8525 |= 0x80;
				}
				if (this.field8523.method19387()) {
					this.field8525 |= 0x100;
				}
				if (this.field8523.method19407()) {
					this.field8525 |= 0x400;
				}
				this.field8525 |= 0x20;
				this.field8524 = true;
			}
		}
		return this.field8524;
	}

	@ObfuscatedName("aao.n(I)V")
	public final void method14442() {
		this.field8524 = false;
		this.field8525 = 0;
		this.field8523 = null;
	}
}
