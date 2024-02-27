package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventLiveStreams")
public final class TwitchEventLiveStreams extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "streamCount", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "channelUrls", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray23;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "previewUrlTemplates", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray24;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "streamTitles", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray25;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "channelDisplayNames", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray26;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "viewerCounts", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "<init>", descriptor = "(II)V")
	public TwitchEventLiveStreams(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.anInt3603 = arg1;
		if (this.anInt3603 > 0) {
			this.aStringArray23 = new String[this.anInt3603];
			this.aStringArray24 = new String[this.anInt3603];
			this.aStringArray25 = new String[this.anInt3603];
			this.aStringArray26 = new String[this.anInt3603];
			this.anIntArray333 = new int[this.anInt3603];
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "SetStream", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method25461(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg0 >= this.anInt3603) {
			return;
		}
		this.aStringArray23[arg0] = arg1;
		this.aStringArray24[arg0] = arg2;
		this.aStringArray25[arg0] = arg3;
		this.aStringArray26[arg0] = arg4;
		this.anIntArray333[arg0] = arg5;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "n", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25474() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "m", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25475() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "k", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25476() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "f", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25477() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "w", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25478() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "l", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25479() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}
}
