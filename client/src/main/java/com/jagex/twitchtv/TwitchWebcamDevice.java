package com.jagex.twitchtv;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!com/jagex/twitchtv/TwitchWebcamDevice")
public final class TwitchWebcamDevice {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "Ljava/util/LinkedList;")
	private LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "m", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "k", descriptor = "I")
	public int anInt3625;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "n", descriptor = "Ljava/lang/String;")
	public String aString154;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public TwitchWebcamDevice(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.anInt3624 = arg0 * 849061987;
		this.anInt3625 = arg1 * -1720800279;
		this.aString153 = arg2;
		this.aString154 = arg3;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "AddCapability", descriptor = "(IIIII)V")
	public void method25484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aLinkedList1.add(new TwitchWebcamDeviceCapability(arg0, arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "e", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25485(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.aLinkedList1.size() ? (TwitchWebcamDeviceCapability) this.aLinkedList1.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "n", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25486(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aLinkedList1.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1)).anInt3627 * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "m", descriptor = "()I")
	public int method25487() {
		return this.aLinkedList1.size();
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "k", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25488(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.aLinkedList1.size() ? (TwitchWebcamDeviceCapability) this.aLinkedList1.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "f", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25489(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.aLinkedList1.size() ? (TwitchWebcamDeviceCapability) this.aLinkedList1.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "w", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25490(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.aLinkedList1.size() ? (TwitchWebcamDeviceCapability) this.aLinkedList1.get(arg0) : null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "l", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25491(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aLinkedList1.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1)).anInt3627 * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchWebcamDevice", name = "u", descriptor = "(I)Lclient!com/jagex/twitchtv/TwitchWebcamDeviceCapability;")
	public TwitchWebcamDeviceCapability method25492(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aLinkedList1.size(); local1++) {
			if (((TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1)).anInt3627 * -959530973 == arg0) {
				return (TwitchWebcamDeviceCapability) this.aLinkedList1.get(local1);
			}
		}
		return null;
	}
}
