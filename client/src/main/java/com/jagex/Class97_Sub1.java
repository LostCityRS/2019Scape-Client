package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aee")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_1;

	@OriginalMember(owner = "client!aee", name = "f", descriptor = "Lclient!mf;")
	Interface39 anInterface39_1;

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!afa;[I)V")
	Class97_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass102_Sub1_1 = arg0;
		if (this.aClass102_Sub1_1.aBoolean532) {
			@Pc(12) byte[] local12 = this.method2041(arg1);
			this.anInterface39_1 = this.aClass102_Sub1_1.method21510(Class210.aClass210_24, 16, 16, 16, false, local12);
		} else {
			this.anInterface39_1 = this.aClass102_Sub1_1.method21206(256, 16, false, arg1);
		}
	}

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "()Lclient!mf;")
	public Interface39 method2039() {
		return this.anInterface39_1;
	}

	@OriginalMember(owner = "client!aee", name = "e", descriptor = "()Lclient!mf;")
	public Interface39 method2040() {
		return this.anInterface39_1;
	}

	@OriginalMember(owner = "client!aee", name = "f", descriptor = "([I)[B")
	byte[] method2041(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass102_Sub1_1.anInt2973 == 0) {
						local2[local41] = (byte) (local29 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 3] = -1;
					} else {
						local2[local41] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 & 0xFF);
						local2[local41 + 3] = -1;
					}
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!aee", name = "u", descriptor = "()Lclient!mf;")
	public Interface39 method2042() {
		return this.anInterface39_1;
	}
}
