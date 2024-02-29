package com.jagex.twitchtv;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDevice")
public class TwitchWebcamDevice {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "Ljava/util/LinkedList;")
	private LinkedList f = new LinkedList();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "m", descriptor = "I")
	public int m;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "k", descriptor = "I")
	public int k;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "Ljava/lang/String;")
	public String e;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "n", descriptor = "Ljava/lang/String;")
	public String n;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 17)
	public TwitchWebcamDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.m = arg0 * 849061987;
		this.k = arg1 * -1720800279;
		this.e = arg2;
		this.n = arg3;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "AddCapability", descriptor = "(IIIII)V", line = 26)
	public void AddCapability(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.f.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability e(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.f.size() ? (TwitchWebcamDeviceCapability) this.f.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "k", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability k(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.f.size() ? (TwitchWebcamDeviceCapability) this.f.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability f(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.f.size() ? (TwitchWebcamDeviceCapability) this.f.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "w", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 30)
	public TwitchWebcamDeviceCapability w(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.f.size() ? (TwitchWebcamDeviceCapability) this.f.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "n", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability n(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.f.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.f.get(local1)).n * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.f.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability l(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.f.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.f.get(local1)).n * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.f.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "u", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;", line = 35)
	public TwitchWebcamDeviceCapability u(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.f.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.f.get(local1)).n * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.f.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "m", descriptor = "()I", line = 44)
	public int m() {
		return this.f.size();
	}
}
