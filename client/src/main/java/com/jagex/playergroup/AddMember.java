package com.jagex.playergroup;

import com.jagex.Packet;
import com.jagex.PlayerGroupMember;
import deob.ObfuscatedName;

@ObfuscatedName("gp")
public class AddMember implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gp.e")
	public final int field1918;

	@ObfuscatedName("gp.n")
	public final PlayerGroupMember field1919;

	public AddMember(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1918 = arg1.g2();
		this.field1919 = new PlayerGroupMember(arg1, false, false, arg0.field1943);
	}

	@ObfuscatedName("gp.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3403(this.field1918, this.field1919);
	}
}
