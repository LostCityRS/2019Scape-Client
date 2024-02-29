package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arj")
public class Class93_Sub26_Sub7 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arj", name = "l", descriptor = "B")
	byte aByte81;

	@OriginalMember(owner = "client!arj", name = "w", descriptor = "B")
	byte aByte82;

	@OriginalMember(owner = "client!arj", name = "f", descriptor = "B")
	byte aByte83;

	@OriginalMember(owner = "client!arj", name = "u", descriptor = "B")
	byte aByte84;

	@OriginalMember(owner = "client!arj", name = "k", descriptor = "Z")
	boolean aBoolean502;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arj", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arj", name = "<init>", descriptor = "(Lclient!kd;)V", line = 232)
	Class93_Sub26_Sub7(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!arj", name = "e", descriptor = "(Lclient!alw;B)V", line = 235)
	@Override
	void method21992(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean502 = arg0.method22465((short) 16384) == 1;
		this.aByte83 = arg0.method22468(1136407478);
		this.aByte82 = arg0.method22468(1589838347);
		this.aByte81 = arg0.method22468(617762121);
		this.aByte84 = arg0.method22468(759975519);
	}

	@OriginalMember(owner = "client!arj", name = "m", descriptor = "(Lclient!alw;)V", line = 235)
	@Override
	void method21994(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aBoolean502 = arg0.method22465((short) 16384) == 1;
		this.aByte83 = arg0.method22468(1609033030);
		this.aByte82 = arg0.method22468(622198817);
		this.aByte81 = arg0.method22468(761761363);
		this.aByte84 = arg0.method22468(1491619550);
	}

	@OriginalMember(owner = "client!arj", name = "k", descriptor = "(Lclient!kr;)V", line = 243)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean743 = this.aBoolean502;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "f", descriptor = "(Lclient!kr;)V", line = 243)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean743 = this.aBoolean502;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "n", descriptor = "(Lclient!kr;I)V", line = 243)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.aBoolean743 = this.aBoolean502;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}

	@OriginalMember(owner = "client!arj", name = "w", descriptor = "(Lclient!kr;)V", line = 243)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.aBoolean743 = this.aBoolean502;
		arg0.aByte152 = this.aByte83;
		arg0.aByte151 = this.aByte82;
		arg0.aByte154 = this.aByte81;
		arg0.aByte158 = this.aByte84;
	}
}
