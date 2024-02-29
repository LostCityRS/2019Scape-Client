package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aep")
public class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!aep", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_16;

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "Lclient!bq;")
	Class88 aClass88_1;

	@OriginalMember(owner = "client!aep", name = "<init>", descriptor = "(Lclient!afa;[I)V", line = 10)
	Class102_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass104_Sub1_16 = arg0;
		if (this.aClass104_Sub1_16.aBoolean75) {
			@Pc(12) byte[] local12 = this.method2582(arg1);
			this.aClass88_1 = new Class88_Sub3(this.aClass104_Sub1_16, Class206.aClass206_22, Class226.aClass226_22, 16, 16, 16, local12, Class206.aClass206_22);
		} else {
			this.aClass88_1 = new Class88_Sub2(this.aClass104_Sub1_16, 3553, 256, 16, false, arg1, 256, 0, false);
		}
	}

	@OriginalMember(owner = "client!aep", name = "m", descriptor = "()Lclient!bq;", line = 20)
	Class88 method2580() {
		return this.aClass88_1;
	}

	@OriginalMember(owner = "client!aep", name = "e", descriptor = "()Lclient!bq;", line = 20)
	Class88 method2581() {
		return this.aClass88_1;
	}

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "([I)[B", line = 24)
	byte[] method2582(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!aep", name = "l", descriptor = "([I)[B", line = 24)
	byte[] method2583(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!aep", name = "k", descriptor = "([I)[B", line = 24)
	byte[] method2584(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!aep", name = "f", descriptor = "([I)[B", line = 24)
	byte[] method2585(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!aep", name = "w", descriptor = "([I)[B", line = 24)
	byte[] method2586(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}
}
