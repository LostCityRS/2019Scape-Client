package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqs")
public class Class140_Sub1_Sub2 extends Class140_Sub1 {

	@OriginalMember(owner = "client!aqs", name = "h", descriptor = "[B")
	byte[] aByteArray53;

	@OriginalMember(owner = "client!aqs", name = "<init>", descriptor = "()V", line = 105)
	Class140_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aqs", name = "aw", descriptor = "(III)[B", line = 109)
	byte[] method20323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "ac", descriptor = "(III)[B", line = 109)
	byte[] method20324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "ai", descriptor = "(III)[B", line = 109)
	byte[] method20325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "as", descriptor = "(III)[B", line = 109)
	byte[] method20326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "j", descriptor = "(IB)V", line = 115)
	@Override
	void method20319(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "t", descriptor = "(IB)V", line = 115)
	@Override
	void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ag", descriptor = "(IB)V", line = 115)
	@Override
	void method20321(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ah", descriptor = "(IB)V", line = 115)
	@Override
	void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "al", descriptor = "(IB)V", line = 115)
	@Override
	void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ae", descriptor = "(IB)V", line = 115)
	@Override
	void method20320(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}
}
