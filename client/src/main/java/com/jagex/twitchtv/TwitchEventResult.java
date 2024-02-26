package com.jagex.twitchtv;

import com.jagex.Class601;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventResult")
public final class TwitchEventResult extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "result", descriptor = "I")
	public int result;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "<init>", descriptor = "(II)V")
	public TwitchEventResult(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.result = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "f", descriptor = "()Lclient!ut;")
	@Override
	public Class601 f() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "e", descriptor = "()Lclient!ut;")
	@Override
	public Class601 e() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "u", descriptor = "()Lclient!ut;")
	@Override
	public Class601 u() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "l", descriptor = "()Lclient!ut;")
	@Override
	public Class601 l() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "g", descriptor = "()Lclient!ut;")
	@Override
	public Class601 g() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "i", descriptor = "()Lclient!ut;")
	@Override
	public Class601 i() {
		return Class601.aClass601_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "m", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "o", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void o(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}
}
