package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;
import deob.ObfuscatedName;

public class TwitchEventResult extends TwitchEvent {

	public int result;

	public TwitchEventResult(int arg0, int arg1) {
		super(arg0);
		this.result = arg1;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventResult.e([I[J[Ljava/lang/Object;)V")
	public void method12(int[] arg0, long[] arg1, Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventResult.n()Lud;")
	public TwitchEventSubject method11() {
		return TwitchEventSubject.RESULT;
	}
}
