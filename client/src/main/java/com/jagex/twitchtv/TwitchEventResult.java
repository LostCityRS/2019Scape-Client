package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventResult")
public final class TwitchEventResult extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "result", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "<init>", descriptor = "(II)V")
	public TwitchEventResult(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.anInt3606 = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg0[1] = this.anInt3606;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "n", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25474() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "m", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25475() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "k", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25476() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "f", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25477() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "w", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25478() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "l", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25479() {
		return Class591.aClass591_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg0[1] = this.anInt3606;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg0[1] = this.anInt3606;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg0[1] = this.anInt3606;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.anInt3605;
		arg0[1] = this.anInt3606;
	}
}
