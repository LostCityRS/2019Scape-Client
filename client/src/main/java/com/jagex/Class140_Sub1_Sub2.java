package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqs")
public final class Class140_Sub1_Sub2 extends Class140_Sub1 {

	@OriginalMember(owner = "client!aqs", name = "h", descriptor = "[B")
	byte[] aByteArray53;

	@OriginalMember(owner = "client!aqs", name = "<init>", descriptor = "()V")
	Class140_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aqs", name = "aw", descriptor = "(III)[B")
	byte[] method20335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "j", descriptor = "(IB)V")
	@Override
	void method20331(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "t", descriptor = "(IB)V")
	@Override
	void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ag", descriptor = "(IB)V")
	@Override
	void method20333(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ac", descriptor = "(III)[B")
	byte[] method20336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "ah", descriptor = "(IB)V")
	@Override
	void method20329(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "al", descriptor = "(IB)V")
	@Override
	void method20334(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ae", descriptor = "(IB)V")
	@Override
	void method20332(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray53[local10] = -1;
		this.aByteArray53[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqs", name = "ai", descriptor = "(III)[B")
	byte[] method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!aqs", name = "as", descriptor = "(III)[B")
	byte[] method20338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray53;
	}
}
