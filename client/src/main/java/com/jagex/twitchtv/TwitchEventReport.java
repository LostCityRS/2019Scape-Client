package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventReport")
public class TwitchEventReport extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "message", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 15)
	public TwitchEventReport(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		super(arg0);
		this.message = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void e(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void u(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void z(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void d(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "n", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 n() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "m", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 m() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "k", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 k() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "f", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 f() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "w", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 w() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "l", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 l() {
		return Class591.aClass591_2;
	}
}
