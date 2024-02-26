package com.jagex.twitchtv;

import com.jagex.Class601;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatUserInfo")
public final class TwitchEventChatUserInfo extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "userState", descriptor = "I")
	public int userState;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "displayName", descriptor = "Ljava/lang/String;")
	public String displayName;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "nameColourARGB", descriptor = "I")
	public int nameColourARGB;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "ignore", descriptor = "Z")
	public boolean ignore;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "modes", descriptor = "I")
	public int modes;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "subscriptions", descriptor = "I")
	public int subscriptions;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "<init>", descriptor = "(IILjava/lang/String;IZII)V")
	public TwitchEventChatUserInfo(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.userState = arg1;
		this.displayName = arg2;
		this.nameColourARGB = arg3;
		this.ignore = arg4;
		this.modes = arg5;
		this.subscriptions = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "f", descriptor = "()Lclient!ut;")
	@Override
	public Class601 f() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "e", descriptor = "()Lclient!ut;")
	@Override
	public Class601 e() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "u", descriptor = "()Lclient!ut;")
	@Override
	public Class601 u() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "l", descriptor = "()Lclient!ut;")
	@Override
	public Class601 l() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "g", descriptor = "()Lclient!ut;")
	@Override
	public Class601 g() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "i", descriptor = "()Lclient!ut;")
	@Override
	public Class601 i() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "m", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "o", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void o(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}
}
