package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arj")
public final class Class93_Sub26_Sub7 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arj", name = "l", descriptor = "B")
	byte aByte81;

	@OriginalMember(owner = "client!arj", name = "w", descriptor = "B")
	byte aByte82;

	@OriginalMember(owner = "client!arj", name = "f", descriptor = "B")
	byte aByte83;

	@OriginalMember(owner = "client!arj", name = "u", descriptor = "B")
	byte aByte84;

	@OriginalMember(owner = "client!arj", name = "k", descriptor = "Z")
	boolean aBoolean503;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arj", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_7;

	@OriginalMember(owner = "client!arj", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub7(@OriginalArg(0) Class375 arg0) {
		this.aClass375_7 = arg0;
	}

	@OriginalMember(owner = "client!arj", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean503 = arg0.method22425((short) 16384) == 1;
		this.aByte83 = arg0.method22426(1136407478);
		this.aByte82 = arg0.method22426(1589838347);
		this.aByte81 = arg0.method22426(617762121);
		this.aByte84 = arg0.method22426(759975519);
	}

	@OriginalMember(owner = "client!arj", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean752 = this.aBoolean503;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aBoolean503 = arg0.method22425((short) 16384) == 1;
		this.aByte83 = arg0.method22426(1609033030);
		this.aByte82 = arg0.method22426(622198817);
		this.aByte81 = arg0.method22426(761761363);
		this.aByte84 = arg0.method22426(1491619550);
	}

	@OriginalMember(owner = "client!arj", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean752 = this.aBoolean503;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.aBoolean752 = this.aBoolean503;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean752 = this.aBoolean503;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}
}
