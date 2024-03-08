package com.jagex.playergroup;

import com.jagex.Packet;
import com.jagex.PlayerGroupBanned;
import com.jagex.class188;
import deob.ObfuscatedName;

@ObfuscatedName("go")
public class SetMemberOffline implements class188 {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("go.e")
	public final PlayerGroupBanned field1917;

	public SetMemberOffline(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		boolean var3 = arg1.g1() != 255;
		if (var3) {
			arg1.pos -= 1;
		}
		this.field1917 = new PlayerGroupBanned(arg1, var3, true);
	}

	@ObfuscatedName("go.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		arg0.method3451(this.field1917);
	}
}
