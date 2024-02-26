package com.jagex.twitchtv;

import com.jagex.Class601;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatMessage")
public final class TwitchEventChatMessage extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "name", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "message", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "nameColourARGB", descriptor = "I")
	public int nameColourARGB;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "modes", descriptor = "I")
	public int modes;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "subscriptions", descriptor = "I")
	public int subscriptions;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "isAction", descriptor = "Z")
	public boolean isAction;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIZ)V")
	public TwitchEventChatMessage(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0);
		this.name = arg1;
		this.message = arg2;
		this.nameColourARGB = arg3;
		this.modes = arg4;
		this.subscriptions = arg5;
		this.isAction = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "f", descriptor = "()Lclient!ut;")
	@Override
	public Class601 f() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "e", descriptor = "()Lclient!ut;")
	@Override
	public Class601 e() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "u", descriptor = "()Lclient!ut;")
	@Override
	public Class601 u() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "l", descriptor = "()Lclient!ut;")
	@Override
	public Class601 l() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "g", descriptor = "()Lclient!ut;")
	@Override
	public Class601 g() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "i", descriptor = "()Lclient!ut;")
	@Override
	public Class601 i() {
		return Class601.aClass601_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "m", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "o", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void o(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}
}
