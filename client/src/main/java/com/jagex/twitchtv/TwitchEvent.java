package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;
import deob.ObfuscatedName;

public abstract class TwitchEvent {

	public int eventType;

	public TwitchEvent(int arg0) {
		this.eventType = arg0;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEvent.e([I[J[Ljava/lang/Object;)V")
	public abstract void method12(int[] arg0, long[] arg1, Object[] arg2);

	@ObfuscatedName("com/jagex/twitchtv/TwitchEvent.n()Lud;")
	public abstract TwitchEventSubject method11();
}
