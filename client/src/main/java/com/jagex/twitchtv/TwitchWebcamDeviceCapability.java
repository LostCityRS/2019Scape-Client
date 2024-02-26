package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDeviceCapability")
public final class TwitchWebcamDeviceCapability {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "t", descriptor = "I")
	public int t;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "f", descriptor = "I")
	public int f;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "e", descriptor = "I")
	public int e;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "u", descriptor = "I")
	public int u;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "l", descriptor = "I")
	public int l;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "<init>", descriptor = "(IIIII)V")
	public TwitchWebcamDeviceCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.t = arg0 * 1435417191;
		this.f = arg1 * -1506431959;
		this.e = arg2 * 1767039399;
		this.u = arg3 * -93871235;
		this.l = arg4 * 133179495;
	}
}
