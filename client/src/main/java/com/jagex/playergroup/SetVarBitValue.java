package com.jagex.playergroup;

import com.jagex.Packet;
import com.jagex.class188;
import com.jagex.PlayerGroupMember;
import deob.ObfuscatedName;

@ObfuscatedName("gt")
public class SetVarBitValue implements class188 {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gt.e")
	public final PlayerGroupMember field1967;

	public SetVarBitValue(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		boolean var3 = arg1.g1() != 255;
		if (var3) {
			arg1.pos -= 1;
		}
		this.field1967 = new PlayerGroupMember(arg1, var3, true, arg0.field1943);
	}

	@ObfuscatedName("gt.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3395(this.field1967);
	}
}
