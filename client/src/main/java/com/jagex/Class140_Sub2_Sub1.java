package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqr")
public class Class140_Sub2_Sub1 extends Class140_Sub2 {

	@OriginalMember(owner = "client!aqr", name = "s", descriptor = "[B")
	byte[] aByteArray51;

	@OriginalMember(owner = "client!aqr", name = "<init>", descriptor = "()V", line = 102)
	Class140_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!aqr", name = "ae", descriptor = "(III)[B", line = 106)
	byte[] method20291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray51 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray51;
	}

	@OriginalMember(owner = "client!aqr", name = "ag", descriptor = "(III)[B", line = 106)
	byte[] method20292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray51 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20383(arg0, arg1, arg2);
		return this.aByteArray51;
	}

	@OriginalMember(owner = "client!aqr", name = "j", descriptor = "(IB)V", line = 112)
	@Override
	void method20407(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray51[local15] = local12;
		this.aByteArray51[local16] = local12;
	}

	@OriginalMember(owner = "client!aqr", name = "t", descriptor = "(IB)V", line = 112)
	@Override
	void method20408(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray51[local15] = local12;
		this.aByteArray51[local16] = local12;
	}
}
