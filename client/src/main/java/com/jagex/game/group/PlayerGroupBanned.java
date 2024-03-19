package com.jagex.game.group;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ga")
public class PlayerGroupBanned {

	@ObfuscatedName("ga.e")
	public String displayName;

	public PlayerGroupBanned(Packet buf, boolean hasUid, boolean hasDisplayName) {
		if (hasUid) {
			buf.g8();
		}
		if (hasDisplayName) {
			this.displayName = buf.fastgstr();
		} else {
			this.displayName = null;
		}
	}

	@ObfuscatedName("ga.e(B)Ljava/lang/String;")
	public String getDisplayName() {
		return this.displayName;
	}
}
