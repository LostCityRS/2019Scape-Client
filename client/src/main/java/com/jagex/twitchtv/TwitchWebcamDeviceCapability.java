package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDeviceCapability")
public final class TwitchWebcamDeviceCapability {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "e", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "n", descriptor = "I")
	public int anInt3627;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "m", descriptor = "I")
	public int anInt3628;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "k", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "f", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDeviceCapability", name = "<init>", descriptor = "(IIIII)V")
	public TwitchWebcamDeviceCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3626 = arg0 * 1496593123;
		this.anInt3627 = arg1 * -1058293877;
		this.anInt3628 = arg2 * -1186833351;
		this.anInt3629 = arg3 * 144686421;
		this.anInt3630 = arg4 * 1491588659;
	}
}
