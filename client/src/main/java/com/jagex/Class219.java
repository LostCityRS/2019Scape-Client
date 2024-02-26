package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cy")
public final class Class219 {

	@OriginalMember(owner = "client!cy", name = "o", descriptor = "[[Lclient!bk;")
	Class187[][] aClass187ArrayArray1;

	@OriginalMember(owner = "client!cy", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_47;

	@OriginalMember(owner = "client!cy", name = "f", descriptor = "Lclient!aez;")
	final Class100_Sub3 aClass100_Sub3_3;

	@OriginalMember(owner = "client!cy", name = "e", descriptor = "I")
	final int anInt3613;

	@OriginalMember(owner = "client!cy", name = "u", descriptor = "I")
	final int anInt3614;

	@OriginalMember(owner = "client!cy", name = "l", descriptor = "[B")
	final byte[] aByteArray67;

	@OriginalMember(owner = "client!cy", name = "m", descriptor = "I")
	final int anInt3617;

	@OriginalMember(owner = "client!cy", name = "g", descriptor = "I")
	final int anInt3615;

	@OriginalMember(owner = "client!cy", name = "i", descriptor = "I")
	final int anInt3616;

	@OriginalMember(owner = "client!cy", name = "m", descriptor = "([B[BIIIIII)V")
	static void method25882(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cy", name = "w", descriptor = "([B[BIIIIII)V")
	static void method25883(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cy", name = "i", descriptor = "([B[BIIIIII)V")
	static void method25886(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cy", name = "o", descriptor = "([BIIIII)Z")
	static boolean method25887(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!cy", name = "x", descriptor = "([B[BIIIIII)V")
	static void method25892(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cy", name = "r", descriptor = "([B[BIIIIII)V")
	static void method25894(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cy", name = "<init>", descriptor = "(Lclient!afm;Lclient!aez;)V")
	Class219(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class100_Sub3 arg1) {
		this.aClass102_Sub3_47 = arg0;
		this.aClass100_Sub3_3 = arg1;
		this.anInt3613 = (this.aClass100_Sub3_3.anInt448 * -1548585779 * this.aClass100_Sub3_3.anInt447 * -1174710433 >> this.aClass102_Sub3_47.anInt772) + 2;
		this.anInt3614 = (this.aClass100_Sub3_3.anInt446 * -1356799781 * this.aClass100_Sub3_3.anInt447 * -1174710433 >> this.aClass102_Sub3_47.anInt772) + 2;
		this.aByteArray67 = new byte[this.anInt3613 * this.anInt3614];
		this.anInt3617 = this.aClass102_Sub3_47.anInt772 + 7 - this.aClass100_Sub3_3.anInt445 * -615169581;
		this.anInt3615 = this.aClass100_Sub3_3.anInt448 * -1548585779 >> this.anInt3617;
		this.anInt3616 = this.aClass100_Sub3_3.anInt446 * -1356799781 >> this.anInt3617;
	}

	@OriginalMember(owner = "client!cy", name = "l", descriptor = "(Lclient!arx;II)Z")
	boolean method25879(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(26) int local26 = local2.anInt3207;
		@Pc(29) int local29 = local2.anInt3209;
		@Pc(34) int local34 = this.anInt3613 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3614) {
			local40 = arg2 + local26 + 1 - this.anInt3614;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3613) {
			local40 = arg1 + local29 + 1 - this.anInt3613;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3613;
			return method25887(this.aByteArray67, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cy", name = "t", descriptor = "()V")
	void method25880() {
		this.aClass187ArrayArray1 = new Class187[this.anInt3615][this.anInt3616];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3616; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3615; local14++) {
				this.aClass187ArrayArray1[local14][local8] = new Class187(this.aClass102_Sub3_47, this, this.aClass100_Sub3_3, local14, local8, this.anInt3617, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cy", name = "g", descriptor = "(IIII)V")
	void method25881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass187ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class187[] local45 = this.aClass187ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean676 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cy", name = "s", descriptor = "(Lclient!arx;II)V")
	void method25884(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3207;
		@Pc(31) int local31 = local2.anInt3209;
		@Pc(36) int local36 = this.anInt3613 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3614) {
			local44 = arg2 + local28 + 1 - this.anInt3614;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3613) {
			local44 = arg1 + local31 + 1 - this.anInt3613;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method25886(this.aByteArray67, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method25881(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cy", name = "e", descriptor = "(Lclient!arx;II)V")
	void method25885(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3207;
		@Pc(31) int local31 = local2.anInt3209;
		@Pc(36) int local36 = this.anInt3613 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3614) {
			local44 = arg2 + local28 + 1 - this.anInt3614;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3613) {
			local44 = arg1 + local31 + 1 - this.anInt3613;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method25886(this.aByteArray67, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method25881(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cy", name = "j", descriptor = "()V")
	void method25888() {
		this.aClass187ArrayArray1 = new Class187[this.anInt3615][this.anInt3616];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3616; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3615; local14++) {
				this.aClass187ArrayArray1[local14][local8] = new Class187(this.aClass102_Sub3_47, this, this.aClass100_Sub3_3, local14, local8, this.anInt3617, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cy", name = "a", descriptor = "(Lclient!arx;II)V")
	void method25889(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3207;
		@Pc(31) int local31 = local2.anInt3209;
		@Pc(36) int local36 = this.anInt3613 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3614) {
			local44 = arg2 + local28 + 1 - this.anInt3614;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3613) {
			local44 = arg1 + local31 + 1 - this.anInt3613;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method25886(this.aByteArray67, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method25881(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cy", name = "f", descriptor = "(III[[ZZ)V")
	void method25890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_47.method6429(false);
		this.aClass102_Sub3_47.method6545(false);
		this.aClass102_Sub3_47.method6384(-2);
		this.aClass102_Sub3_47.method6543(1);
		this.aClass102_Sub3_47.method6370(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass102_Sub3_47.anInt771 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3616; local32++) {
				local41 = local32 << this.anInt3617;
				local48 = local32 + 1 << this.anInt3617;
				label128: for (local50 = 0; local50 < this.anInt3615; local50++) {
					local59 = local50 << this.anInt3617;
					local66 = local50 + 1 << this.anInt3617;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass187ArrayArray1[local50][local32].method24810();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3616; local32++) {
				local41 = local32 << this.anInt3617;
				local48 = local32 + 1 << this.anInt3617;
				for (local50 = 0; local50 < this.anInt3615; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3617;
					local68 = local50 + 1 << this.anInt3617;
					@Pc(192) Class80_Sub36_Sub2 local192 = this.aClass102_Sub3_47.aClass80_Sub36_Sub2_1;
					local192.anInt3152 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass100_Sub3_3.anInt448 * -1548585779 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass100_Sub3_3.aShortArrayArray3[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass102_Sub3_47.aBoolean129) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method23155(local257[local265] & 0xFFFF, (byte) -3);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method23385(local257[local265] & 0xFFFF, 1060557734);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass187ArrayArray1[local50][local32].method24811(local192.aByteArray61, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cy", name = "k", descriptor = "(Lclient!arx;II)V")
	void method25891(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3207;
		@Pc(31) int local31 = local2.anInt3209;
		@Pc(36) int local36 = this.anInt3613 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3614) {
			local44 = arg2 + local28 + 1 - this.anInt3614;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3613) {
			local44 = arg1 + local31 + 1 - this.anInt3613;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method25882(this.aByteArray67, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method25881(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cy", name = "u", descriptor = "(Lclient!arx;II)V")
	void method25893(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub1_Sub10_Sub1 local2 = (Class80_Sub1_Sub10_Sub1) arg0;
		arg1 += local2.anInt3205 + 1;
		arg2 += local2.anInt3208 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3613;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3207;
		@Pc(31) int local31 = local2.anInt3209;
		@Pc(36) int local36 = this.anInt3613 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3613;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3614) {
			local44 = arg2 + local28 + 1 - this.anInt3614;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3613) {
			local44 = arg1 + local31 + 1 - this.anInt3613;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method25882(this.aByteArray67, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method25881(arg1, arg2, local31, local28);
		}
	}
}
