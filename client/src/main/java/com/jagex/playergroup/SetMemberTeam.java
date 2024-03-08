package com.jagex.playergroup;

import com.jagex.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("gh")
public class SetMemberTeam implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gh.e")
	public final int field1969;

	@ObfuscatedName("gh.n")
	public final int field1968;

	public SetMemberTeam(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		this.field1969 = arg1.g2();
		this.field1968 = arg1.g2();
	}

	@ObfuscatedName("gh.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3400(this.field1969, this.field1968);
		arg0.method3392(this.field1969).method3499();
	}
}
