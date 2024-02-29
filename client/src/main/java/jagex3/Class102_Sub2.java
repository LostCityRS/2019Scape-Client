package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeq")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!aeq", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_3;

	@OriginalMember(owner = "client!aeq", name = "n", descriptor = "Lclient!mq;")
	Interface43 anInterface43_1;

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "(Lclient!afc;[I)V")
	Class102_Sub2(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass104_Sub2_3 = arg0;
		if (this.aClass104_Sub2_3.aBoolean472) {
			@Pc(12) byte[] local12 = this.method2595(arg1);
			this.anInterface43_1 = this.aClass104_Sub2_3.method21138(Class206.aClass206_22, 16, 16, 16, false, local12);
		} else {
			this.anInterface43_1 = this.aClass104_Sub2_3.method21145(256, 16, false, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "e", descriptor = "()Lclient!mq;")
	public Interface43 method2593() {
		return this.anInterface43_1;
	}

	@OriginalMember(owner = "client!aeq", name = "k", descriptor = "()Lclient!mq;")
	public Interface43 method2594() {
		return this.anInterface43_1;
	}

	@OriginalMember(owner = "client!aeq", name = "n", descriptor = "([I)[B")
	byte[] method2595(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass104_Sub2_3.anInt2953 == 0) {
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

	@OriginalMember(owner = "client!aeq", name = "m", descriptor = "()Lclient!mq;")
	public Interface43 method2596() {
		return this.anInterface43_1;
	}

	@OriginalMember(owner = "client!aeq", name = "f", descriptor = "([I)[B")
	byte[] method2597(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass104_Sub2_3.anInt2953 == 0) {
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

	@OriginalMember(owner = "client!aeq", name = "w", descriptor = "([I)[B")
	byte[] method2598(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass104_Sub2_3.anInt2953 == 0) {
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
}
