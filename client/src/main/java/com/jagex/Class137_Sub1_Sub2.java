package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqu")
public final class Class137_Sub1_Sub2 extends Class137_Sub1 {

	@OriginalMember(owner = "client!aqu", name = "r", descriptor = "[B")
	byte[] aByteArray57;

	@OriginalMember(owner = "client!aqu", name = "<init>", descriptor = "()V")
	Class137_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!aqu", name = "ai", descriptor = "(IB)V")
	@Override
	void method20622(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray57[local15] = local12;
		this.aByteArray57[local16] = local12;
	}

	@OriginalMember(owner = "client!aqu", name = "ao", descriptor = "(III)[B")
	byte[] method20623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray57 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20619(arg0, arg1, arg2);
		return this.aByteArray57;
	}

	@OriginalMember(owner = "client!aqu", name = "aq", descriptor = "(IB)V")
	@Override
	void method20621(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray57[local15] = local12;
		this.aByteArray57[local16] = local12;
	}
}
