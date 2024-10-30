package com.jagex.game.group;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ga")
public class PlayerGroupBanned {

	@ObfuscatedName("ga.e")
	public String displayName;

	public PlayerGroupBanned(Packet arg0, boolean arg1, boolean arg2) {
		if (arg1) {
			arg0.g8();
		}
		if (arg2) {
			this.displayName = arg0.fastgstr();
		} else {
			this.displayName = null;
		}
	}

	@ObfuscatedName("ga.e(B)Ljava/lang/String;")
	public String getDisplayName() {
		return this.displayName;
	}
}
