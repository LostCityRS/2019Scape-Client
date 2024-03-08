package com.jagex.twitchtv;

import com.jagex.class571;
import deob.ObfuscatedName;

public class TwitchEventChatUserInfo extends TwitchEvent {

	public int userState;

	public String displayName;

	public int nameColourARGB;

	public boolean ignore;

	public int modes;

	public int subscriptions;

	public TwitchEventChatUserInfo(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6) {
		super(arg0);
		this.userState = arg1;
		this.displayName = arg2;
		this.nameColourARGB = arg3;
		this.ignore = arg4;
		this.modes = arg5;
		this.subscriptions = arg6;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventChatUserInfo.n()Lud;")
	public class571 method11() {
		return null;
	}

	@ObfuscatedName("com/jagex/twitchtv/TwitchEventChatUserInfo.e([I[J[Ljava/lang/Object;)V")
	public void method12(int[] arg0, long[] arg1, Object[] arg2) {
	}
}
