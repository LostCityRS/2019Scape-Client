package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventReport")
public final class TwitchEventReport extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "message", descriptor = "Ljava/lang/String;")
	public String aString152;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "<init>", descriptor = "(ILjava/lang/String;)V")
	public TwitchEventReport(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		super(arg0);
		this.aString152 = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg2[0] = this.aString152;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "n", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25474() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "m", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25475() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "k", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25476() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "f", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25477() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "w", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25478() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "l", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25479() {
		return Class591.aClass591_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg2[0] = this.aString152;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg2[0] = this.aString152;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg2[0] = this.aString152;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg2[0] = this.aString152;
	}
}
