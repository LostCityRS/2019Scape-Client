package com.jagex.playergroup;

import com.jagex.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("gm")
public class UpdateMemberBase implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gm.e")
	public final int field1974;

	@ObfuscatedName("gm.n")
	public final int field1973;

	public UpdateMemberBase(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1974 = arg1.g2();
		this.field1973 = arg1.g1();
	}

	@ObfuscatedName("gm.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3381(this.field1974, this.field1973);
		arg0.method3392(this.field1974).method3499();
	}
}
