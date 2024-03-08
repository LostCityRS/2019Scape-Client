package com.jagex.playergroup;

import com.jagex.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("gn")
public class SetGameLoading implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gn.e")
	public final int field1937;

	@ObfuscatedName("gn.n")
	public final int field1938;

	public SetGameLoading(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1937 = arg1.g2();
		this.field1938 = arg1.g1();
	}

	@ObfuscatedName("gn.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3399(this.field1937, this.field1938);
		arg0.method3392(this.field1937).method3499();
	}
}
