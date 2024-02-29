package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventResult")
public class TwitchEventResult extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "result", descriptor = "I")
	public int result;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "<init>", descriptor = "(II)V", line = 15)
	public TwitchEventResult(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.result = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void e(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void u(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void z(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void d(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "n", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 n() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "m", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 m() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "k", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 k() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "f", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 f() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "w", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 w() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "l", descriptor = "()Lclient!ud;", line = 25)
	@Override
	public Class591 l() {
		return Class591.aClass591_1;
	}
}
