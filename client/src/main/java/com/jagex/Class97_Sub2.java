package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aej")
public final class Class97_Sub2 extends Class97 {

	@OriginalMember(owner = "client!aej", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_16;

	@OriginalMember(owner = "client!aej", name = "f", descriptor = "Lclient!bz;")
	Class84 aClass84_1;

	@OriginalMember(owner = "client!aej", name = "<init>", descriptor = "(Lclient!afm;[I)V")
	Class97_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass102_Sub3_16 = arg0;
		if (this.aClass102_Sub3_16.aBoolean138) {
			@Pc(12) byte[] local12 = this.method2121(arg1);
			this.aClass84_1 = new Class84_Sub3(this.aClass102_Sub3_16, Class210.aClass210_24, Class236.aClass236_21, 16, 16, 16, local12, Class210.aClass210_24);
		} else {
			this.aClass84_1 = new Class84_Sub1(this.aClass102_Sub3_16, 3553, 256, 16, false, arg1, 256, 0, false);
		}
	}

	@OriginalMember(owner = "client!aej", name = "e", descriptor = "()Lclient!bz;")
	Class84 method2119() {
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "()Lclient!bz;")
	Class84 method2120() {
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!aej", name = "f", descriptor = "([I)[B")
	byte[] method2121(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aej", name = "t", descriptor = "()Lclient!bz;")
	Class84 method2122() {
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!aej", name = "u", descriptor = "()Lclient!bz;")
	Class84 method2123() {
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!aej", name = "g", descriptor = "([I)[B")
	byte[] method2124(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aej", name = "i", descriptor = "([I)[B")
	byte[] method2125(@OriginalArg(0) int[] arg0) {
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
