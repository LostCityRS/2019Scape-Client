package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class187 {

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	static final int anInt3327 = 128;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	static final int anInt3332 = 7;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Z")
	boolean aBoolean676 = true;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	int anInt3330 = -1;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_41;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "Lclient!cy;")
	final Class219 aClass219_2;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	final int anInt3328;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	final int anInt3329;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	final int anInt3331;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!ca;")
	Interface15 anInterface15_4;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!aeh;")
	Class94_Sub2 aClass94_Sub2_2;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_5;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!afm;Lclient!cy;Lclient!aez;IIIII)V")
	Class187(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class100_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass102_Sub3_41 = arg0;
		this.aClass219_2 = arg1;
		this.anInt3328 = arg6;
		this.anInt3329 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt448 * -1548585779 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray3[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		this.anInt3331 = local25;
		if (local25 > 0) {
			@Pc(83) Class80_Sub36 local83 = new Class80_Sub36(local25 * 2);
			@Pc(114) short[] local114;
			@Pc(118) int local118;
			@Pc(105) int local105;
			if (this.aClass102_Sub3_41.aBoolean129) {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt448 * -1548585779 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray3[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method23155(local114[local118] & 0xFFFF, (byte) -14);
							}
						}
					}
				}
			} else {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt448 * -1548585779 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray3[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method23385(local114[local118] & 0xFFFF, 1060557734);
							}
						}
					}
				}
			}
			this.anInterface15_4 = this.aClass102_Sub3_41.method6445(5123, local83.aByteArray61, local83.anInt3152 * -1380987821, false);
			this.aClass94_Sub2_2 = new Class94_Sub2(this.aClass102_Sub3_41, 5123, null, 1);
		} else {
			this.aClass84_Sub1_5 = null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "()V")
	void method24809() {
		if (!this.aBoolean676) {
			return;
		}
		this.aBoolean676 = false;
		@Pc(10) byte[] local10 = this.aClass219_2.aByteArray67;
		@Pc(14) byte[] local14 = this.aClass102_Sub3_41.aByteArray22;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass219_2.anInt3613;
		@Pc(30) int local30 = this.anInt3328 + this.anInt3329 * this.aClass219_2.anInt3613;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass84_Sub1_5 != null && this.anInt3330 == local16) {
			this.aBoolean676 = false;
			return;
		}
		this.anInt3330 = local16;
		local32 = 0;
		local30 = this.anInt3328 + this.anInt3329 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass219_2.anInt3613 - 128;
		}
		if (this.aClass84_Sub1_5 == null) {
			this.aClass84_Sub1_5 = new Class84_Sub1(this.aClass102_Sub3_41, 3553, Class210.aClass210_17, Class236.aClass236_21, 128, 128, false, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, false);
			this.aClass84_Sub1_5.method18355(false, false);
			this.aClass84_Sub1_5.method18340(true);
		} else {
			this.aClass84_Sub1_5.method18356(0, 0, 128, 128, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "()V")
	void method24810() {
		this.method24812(this.anInterface15_4, this.anInt3331);
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "([BI)V")
	void method24811(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(Lclient!ca;I)V")
	void method24812(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24813();
			this.aClass102_Sub3_41.method6339(this.aClass84_Sub1_5);
			this.aClass102_Sub3_41.method6379(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "()V")
	void method24813() {
		if (!this.aBoolean676) {
			return;
		}
		this.aBoolean676 = false;
		@Pc(10) byte[] local10 = this.aClass219_2.aByteArray67;
		@Pc(14) byte[] local14 = this.aClass102_Sub3_41.aByteArray22;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass219_2.anInt3613;
		@Pc(30) int local30 = this.anInt3328 + this.anInt3329 * this.aClass219_2.anInt3613;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass84_Sub1_5 != null && this.anInt3330 == local16) {
			this.aBoolean676 = false;
			return;
		}
		this.anInt3330 = local16;
		local32 = 0;
		local30 = this.anInt3328 + this.anInt3329 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass219_2.anInt3613 - 128;
		}
		if (this.aClass84_Sub1_5 == null) {
			this.aClass84_Sub1_5 = new Class84_Sub1(this.aClass102_Sub3_41, 3553, Class210.aClass210_17, Class236.aClass236_21, 128, 128, false, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, false);
			this.aClass84_Sub1_5.method18355(false, false);
			this.aClass84_Sub1_5.method18340(true);
		} else {
			this.aClass84_Sub1_5.method18356(0, 0, 128, 128, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "(Lclient!ca;I)V")
	void method24814(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24813();
			this.aClass102_Sub3_41.method6339(this.aClass84_Sub1_5);
			this.aClass102_Sub3_41.method6379(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "([BI)V")
	void method24815(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "([BI)V")
	void method24816(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "([BI)V")
	void method24817(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "([BI)V")
	void method24818(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "([BI)V")
	void method24819(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass94_Sub2_2.method2089(5123, arg0, arg1 * 2);
		this.method24812(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "()V")
	void method24820() {
		if (!this.aBoolean676) {
			return;
		}
		this.aBoolean676 = false;
		@Pc(10) byte[] local10 = this.aClass219_2.aByteArray67;
		@Pc(14) byte[] local14 = this.aClass102_Sub3_41.aByteArray22;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass219_2.anInt3613;
		@Pc(30) int local30 = this.anInt3328 + this.anInt3329 * this.aClass219_2.anInt3613;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass84_Sub1_5 != null && this.anInt3330 == local16) {
			this.aBoolean676 = false;
			return;
		}
		this.anInt3330 = local16;
		local32 = 0;
		local30 = this.anInt3328 + this.anInt3329 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass219_2.anInt3613 - 128;
		}
		if (this.aClass84_Sub1_5 == null) {
			this.aClass84_Sub1_5 = new Class84_Sub1(this.aClass102_Sub3_41, 3553, Class210.aClass210_17, Class236.aClass236_21, 128, 128, false, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, false);
			this.aClass84_Sub1_5.method18355(false, false);
			this.aClass84_Sub1_5.method18340(true);
		} else {
			this.aClass84_Sub1_5.method18356(0, 0, 128, 128, this.aClass102_Sub3_41.aByteArray22, Class210.aClass210_17, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "(Lclient!ca;I)V")
	void method24821(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24813();
			this.aClass102_Sub3_41.method6339(this.aClass84_Sub1_5);
			this.aClass102_Sub3_41.method6379(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ca;I)V")
	void method24822(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24813();
			this.aClass102_Sub3_41.method6339(this.aClass84_Sub1_5);
			this.aClass102_Sub3_41.method6379(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "(Lclient!ca;I)V")
	void method24823(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method24813();
			this.aClass102_Sub3_41.method6339(this.aClass84_Sub1_5);
			this.aClass102_Sub3_41.method6379(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "()V")
	void method24824() {
		this.method24812(this.anInterface15_4, this.anInt3331);
	}
}
