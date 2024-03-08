package com.jagex.playergroup;

import com.jagex.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("gf")
public class DeleteBanned implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gf.e")
	public final int field1941;

	public DeleteBanned(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1941 = arg1.g2();
	}

	@ObfuscatedName("gf.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3401(this.field1941);
		arg0.method3392(this.field1941);
	}
}
