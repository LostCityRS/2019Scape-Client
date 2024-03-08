package com.jagex.playergroup;

import com.jagex.*;
import deob.ObfuscatedName;

@ObfuscatedName("gc")
public class DeleteMember implements PlayerGroupDeltaEntry {

	// $FF: synthetic field
	public final PlayerGroupDelta this$0;

	@ObfuscatedName("gc.e")
	public final VarValue field1939;

	public DeleteMember(PlayerGroupDelta arg0, Packet arg1) {
		this.this$0 = arg0;
		if (arg1.g2() == 65535) {
			this.field1939 = null;
		} else {
			arg1.pos -= 2;
			this.field1939 = arg0.field1943.method291().method15284(arg1);
		}
	}

	@ObfuscatedName("gc.e(Lgq;B)V")
	public void method3371(PlayerGroup arg0) {
		if (this.field1939 != null) {
			arg0.method3394().method2802((class149) this.this$0.field1943.method291().get(this.field1939.field4240), this.field1939.field4239);
		}
	}
}
