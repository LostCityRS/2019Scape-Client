package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqq")
public class Class140_Sub1_Sub1 extends Class140_Sub1 {

	@OriginalMember(owner = "client!aqq", name = "h", descriptor = "[B")
	byte[] aByteArray49;

	@OriginalMember(owner = "client!aqq", name = "<init>", descriptor = "()V", line = 81)
	Class140_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aqq", name = "ac", descriptor = "(III)[B", line = 85)
	byte[] method20259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "as", descriptor = "(III)[B", line = 85)
	byte[] method20260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "aw", descriptor = "(III)[B", line = 85)
	byte[] method20261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "ai", descriptor = "(III)[B", line = 85)
	byte[] method20262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "ad", descriptor = "(III)[B", line = 85)
	byte[] method20263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "at", descriptor = "(III)[B", line = 85)
	byte[] method20264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "ah", descriptor = "(IB)V", line = 91)
	@Override
	void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "j", descriptor = "(IB)V", line = 91)
	@Override
	void method20319(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ag", descriptor = "(IB)V", line = 91)
	@Override
	void method20321(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "t", descriptor = "(IB)V", line = 91)
	@Override
	void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ae", descriptor = "(IB)V", line = 91)
	@Override
	void method20320(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "al", descriptor = "(IB)V", line = 91)
	@Override
	void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}
}
