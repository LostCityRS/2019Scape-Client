package com.jagex.playergroup;

import com.jagex.Packet;
import com.jagex.PlayerGroupBanned;
import deob.ObfuscatedName;

@ObfuscatedName("fr")
public class StartGame implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("fr.e")
	public final int field1896;

	public StartGame(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1896 = arg1.g2();
	}

	@ObfuscatedName("fr.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		PlayerGroupBanned var2 = (PlayerGroupBanned) arg0.method3429().get(this.field1896);
		arg0.method3398(this.field1896);
		var2.method3540();
	}
}
