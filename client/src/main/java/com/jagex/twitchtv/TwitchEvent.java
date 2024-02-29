package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEvent")
public abstract class TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "eventType", descriptor = "I")
	public int eventType;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "<init>", descriptor = "(I)V", line = 14)
	public TwitchEvent(@OriginalArg(0) int arg0) {
		this.eventType = arg0;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void e(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "n", descriptor = "()Lclient!ud;")
	public abstract Class591 n();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "m", descriptor = "()Lclient!ud;")
	public abstract Class591 m();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "k", descriptor = "()Lclient!ud;")
	public abstract Class591 k();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "f", descriptor = "()Lclient!ud;")
	public abstract Class591 f();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "w", descriptor = "()Lclient!ud;")
	public abstract Class591 w();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "l", descriptor = "()Lclient!ud;")
	public abstract Class591 l();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void u(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void z(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void d(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);
}
