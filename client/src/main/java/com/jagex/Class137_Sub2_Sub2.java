package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqs")
public final class Class137_Sub2_Sub2 extends Class137_Sub2 {

	@OriginalMember(owner = "client!aqs", name = "p", descriptor = "[B")
	byte[] aByteArray55;

	@OriginalMember(owner = "client!aqs", name = "<init>", descriptor = "()V")
	Class137_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aqs", name = "aq", descriptor = "(IB)V")
	@Override
	void method20579(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray55[local10] = -1;
		this.aByteArray55[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ao", descriptor = "(III)[B")
	byte[] method20581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20619(arg0, arg1, arg2);
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!aqs", name = "ai", descriptor = "(IB)V")
	@Override
	void method20580(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray55[local10] = -1;
		this.aByteArray55[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "aj", descriptor = "(III)[B")
	byte[] method20582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20619(arg0, arg1, arg2);
		return this.aByteArray55;
	}
}
