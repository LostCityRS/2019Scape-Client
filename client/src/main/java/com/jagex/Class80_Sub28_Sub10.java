package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arp")
public final class Class80_Sub28_Sub10 extends Class80_Sub28 {

	@OriginalMember(owner = "client!arp", name = "u", descriptor = "Ljava/lang/String;")
	String aString100;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arp", name = "this$0", descriptor = "Lclient!kt;")
	final Class387 aClass387_10;

	@OriginalMember(owner = "client!arp", name = "<init>", descriptor = "(Lclient!kt;)V")
	Class80_Sub28_Sub10(@OriginalArg(0) Class387 arg0) {
		this.aClass387_10 = arg0;
	}

	@OriginalMember(owner = "client!arp", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	void method22226(@OriginalArg(0) Packet arg0) {
		this.aString100 = arg0.gjstr();
		arg0.g4();
	}

	@OriginalMember(owner = "client!arp", name = "e", descriptor = "(Lclient!ald;)V")
	@Override
	void method22225(@OriginalArg(0) Packet arg0) {
		this.aString100 = arg0.gjstr();
		arg0.g4();
	}

	@OriginalMember(owner = "client!arp", name = "f", descriptor = "(Lclient!kf;I)V")
	@Override
	void method22222(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		arg0.aString203 = this.aString100;
	}

	@OriginalMember(owner = "client!arp", name = "t", descriptor = "(Lclient!ald;B)V")
	@Override
	void method22223(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.aString100 = arg0.gjstr();
		arg0.g4();
	}

	@OriginalMember(owner = "client!arp", name = "l", descriptor = "(Lclient!ald;)V")
	@Override
	void method22224(@OriginalArg(0) Packet arg0) {
		this.aString100 = arg0.gjstr();
		arg0.g4();
	}

	@OriginalMember(owner = "client!arp", name = "g", descriptor = "(Lclient!kf;)V")
	@Override
	void method22227(@OriginalArg(0) Class378 arg0) {
		arg0.aString203 = this.aString100;
	}
}
