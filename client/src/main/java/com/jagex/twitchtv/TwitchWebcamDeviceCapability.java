package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDeviceCapability")
public class TwitchWebcamDeviceCapability {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "e", descriptor = "I")
	public int e;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "n", descriptor = "I")
	public int n;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "m", descriptor = "I")
	public int m;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "k", descriptor = "I")
	public int k;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "f", descriptor = "I")
	public int f;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "<init>", descriptor = "(IIIII)V", line = 15)
	public TwitchWebcamDeviceCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.e = arg0 * 1496593123;
		this.n = arg1 * -1058293877;
		this.m = arg2 * -1186833351;
		this.k = arg3 * 144686421;
		this.f = arg4 * 1491588659;
	}
}
