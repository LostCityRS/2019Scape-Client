package com.jagex.twitchtv;

import com.jagex.Class601;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEvent")
public abstract class TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "eventType", descriptor = "I")
	public int eventType;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "<init>", descriptor = "(I)V")
	public TwitchEvent(@OriginalArg(0) int arg0) {
		this.eventType = arg0;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "f", descriptor = "()Lclient!ut;")
	public abstract Class601 f();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "e", descriptor = "()Lclient!ut;")
	public abstract Class601 e();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "u", descriptor = "()Lclient!ut;")
	public abstract Class601 u();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "l", descriptor = "()Lclient!ut;")
	public abstract Class601 l();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "g", descriptor = "()Lclient!ut;")
	public abstract Class601 g();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "i", descriptor = "()Lclient!ut;")
	public abstract Class601 i();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "m", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void m(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "o", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void o(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);
}
