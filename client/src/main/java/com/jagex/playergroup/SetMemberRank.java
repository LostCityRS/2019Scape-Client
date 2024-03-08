package com.jagex.playergroup;

import com.jagex.Packet;
import com.jagex.PlayerGroupMember;
import deob.ObfuscatedName;

@ObfuscatedName("fk")
public class SetMemberRank implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("fk.e")
	public final int field1894;

	public SetMemberRank(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1894 = arg1.g2();
	}

	@ObfuscatedName("fk.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		PlayerGroupMember var2 = arg0.method3392(this.field1894);
		var2.method3499();
		var2.method3488();
		arg0.method3430(this.field1894);
	}
}
