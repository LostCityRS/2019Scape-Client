package com.jagex.twitchtv;

import com.jagex.Class601;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventReport")
public final class TwitchEventReport extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "message", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "<init>", descriptor = "(ILjava/lang/String;)V")
	public TwitchEventReport(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		super(arg0);
		this.message = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "f", descriptor = "()Lclient!ut;")
	@Override
	public Class601 f() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "e", descriptor = "()Lclient!ut;")
	@Override
	public Class601 e() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "u", descriptor = "()Lclient!ut;")
	@Override
	public Class601 u() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "l", descriptor = "()Lclient!ut;")
	@Override
	public Class601 l() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "g", descriptor = "()Lclient!ut;")
	@Override
	public Class601 g() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "i", descriptor = "()Lclient!ut;")
	@Override
	public Class601 i() {
		return Class601.aClass601_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "m", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "o", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void o(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}
}
