package com.jagex.twitchtv;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.LinkedList;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDevice")
public final class TwitchWebcamDevice {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "Ljava/util/LinkedList;")
	private LinkedList l = new LinkedList();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "I")
	public int e;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "u", descriptor = "I")
	public int u;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "t", descriptor = "Ljava/lang/String;")
	public String t;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "Ljava/lang/String;")
	public String f;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public TwitchWebcamDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.e = arg0 * -1415902951;
		this.u = arg1 * 532038735;
		this.t = arg2;
		this.f = arg3;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "AddCapability", descriptor = "(IIIII)V")
	public void AddCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.l.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "t", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability t(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.l.size() ? (TwitchWebcamDeviceCapability) this.l.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability f(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.l.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.l.get(local1)).f * -671698919 == arg0) {
				return (TwitchWebcamDeviceCapability) this.l.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "()I")
	public int e() {
		return this.l.size();
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "u", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability u(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.l.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.l.get(local1)).f * -671698919 == arg0) {
				return (TwitchWebcamDeviceCapability) this.l.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "()I")
	public int l() {
		return this.l.size();
	}
}
