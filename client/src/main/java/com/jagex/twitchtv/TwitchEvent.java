package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEvent")
public abstract class TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "eventType", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "<init>", descriptor = "(I)V")
	public TwitchEvent(@OriginalArg(0) int arg0) {
		this.anInt3605 = arg0;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "n", descriptor = "()Lclient!ud;")
	public abstract Class591 method25474();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "m", descriptor = "()Lclient!ud;")
	public abstract Class591 method25475();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "k", descriptor = "()Lclient!ud;")
	public abstract Class591 method25476();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "f", descriptor = "()Lclient!ud;")
	public abstract Class591 method25477();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "w", descriptor = "()Lclient!ud;")
	public abstract Class591 method25478();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "l", descriptor = "()Lclient!ud;")
	public abstract Class591 method25479();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);
}
