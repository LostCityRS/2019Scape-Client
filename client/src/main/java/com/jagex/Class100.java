package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public abstract class Class100 implements Interface2 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 9)
	Class100() {
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)V", line = 23)
	public final void method18161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method18198(arg0, arg1, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "(IIII)V", line = 30)
	public final void method18162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18201(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "bb", descriptor = "(IIII)V", line = 30)
	public final void method18163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18201(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "bm", descriptor = "(IIII)V", line = 30)
	public final void method18164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18201(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "be", descriptor = "(IIII)V", line = 30)
	public final void method18165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18201(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "(IIIIIII)V", line = 34)
	public final void method18166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
	}

	@OriginalMember(owner = "client!cm", name = "by", descriptor = "(IIII)V", line = 40)
	public final void method18167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18202(arg0, arg1, arg2, arg3, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "(IIII)V", line = 40)
	public final void method18168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18202(arg0, arg1, arg2, arg3, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(FFFFII)V", line = 46)
	public final void method18169(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method18175(arg0, arg1, arg2, arg3, arg4, arg5, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(FFII)V", line = 50)
	public final void method18170(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18175(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "bu", descriptor = "(FFII)V", line = 50)
	public final void method18171(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method18175(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, 1, -1, 1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(FFIIIII)V", line = 54)
	public final void method18172(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18175(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cm", name = "bw", descriptor = "(FFIIIII)V", line = 54)
	public final void method18173(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18175(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "(FFFFIIIIII)V", line = 58)
	public final void method18174(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == 0 || arg5 == 0) {
			return;
		}
		@Pc(11) double local11 = (double) (arg6 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(18) float local18 = (float) Math.sin(local11) * (float) arg5;
		@Pc(25) float local25 = (float) Math.cos(local11) * (float) arg5;
		@Pc(32) float local32 = (float) Math.sin(local11) * (float) arg4;
		@Pc(39) float local39 = (float) Math.cos(local11) * (float) arg4;
		@Pc(53) float local53 = (-arg2 * local39 + -arg3 * local18) / 4096.0F + arg0;
		@Pc(68) float local68 = (--arg2 * local32 + -arg3 * local25) / 4096.0F + arg1;
		@Pc(85) float local85 = (((float) this.method18160() - arg2) * local39 + -arg3 * local18) / 4096.0F + arg0;
		@Pc(103) float local103 = (-((float) this.method18160() - arg2) * local32 + -arg3 * local25) / 4096.0F + arg1;
		@Pc(120) float local120 = (-arg2 * local39 + ((float) this.method18193() - arg3) * local18) / 4096.0F + arg0;
		@Pc(138) float local138 = (--arg2 * local32 + ((float) this.method18193() - arg3) * local25) / 4096.0F + arg1;
		this.method18186(local53, local68, local85, local103, local120, local138, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "(FFFFIIIII)V", line = 74)
	public final void method18175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18186(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "bz", descriptor = "(FFFFIIIII)V", line = 74)
	public final void method18176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18186(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "bo", descriptor = "(FFFFIIIII)V", line = 74)
	public final void method18177(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18186(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "(FFIILclient!ch;II)V", line = 88)
	public final void method18178(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18181(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cm", name = "bv", descriptor = "(FFIILclient!ch;II)V", line = 88)
	public final void method18179(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18181(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cm", name = "br", descriptor = "(FFIILclient!ch;II)V", line = 88)
	public final void method18180(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method18181(arg0, arg1, (float) this.method18160() / 2.0F, (float) this.method18193() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "(FFFFIILclient!ch;II)V", line = 92)
	public final void method18181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18188(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "bj", descriptor = "(FFFFIILclient!ch;II)V", line = 92)
	public final void method18182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18188(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "bg", descriptor = "(FFFFIILclient!ch;II)V", line = 92)
	public final void method18183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18188(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "ba", descriptor = "(FFFFIILclient!ch;II)V", line = 92)
	public final void method18184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18188(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "bp", descriptor = "(FFFFIILclient!ch;II)V", line = 92)
	public final void method18185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == 0) {
			return;
		}
		@Pc(9) double local9 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(16) float local16 = (float) Math.sin(local9) * (float) arg4;
		@Pc(23) float local23 = (float) Math.cos(local9) * (float) arg4;
		@Pc(37) float local37 = (-arg2 * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(52) float local52 = (--arg2 * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(69) float local69 = (((float) this.method18160() - arg2) * local23 + -arg3 * local16) / 4096.0F + arg0;
		@Pc(87) float local87 = (-((float) this.method18160() - arg2) * local16 + -arg3 * local23) / 4096.0F + arg1;
		@Pc(104) float local104 = (-arg2 * local23 + ((float) this.method18193() - arg3) * local16) / 4096.0F + arg0;
		@Pc(122) float local122 = (--arg2 * local16 + ((float) this.method18193() - arg3) * local23) / 4096.0F + arg1;
		this.method18188(local37, local52, local69, local87, local104, local122, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "ae", descriptor = "(FFFFFFIII)V", line = 106)
	public final void method18186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method18191(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
	}

	@OriginalMember(owner = "client!cm", name = "bs", descriptor = "(FFFFFFIII)V", line = 106)
	public final void method18187(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method18191(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
	}

	@OriginalMember(owner = "client!cm", name = "ah", descriptor = "(FFFFFFLclient!ch;II)V", line = 112)
	final void method18188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method18203(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(IIII)V")
	public abstract void method18189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "([I)V")
	public abstract void method18190(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!cm", name = "ag", descriptor = "(FFFFFFIIII)V")
	abstract void method18191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "()I")
	public abstract int method18160();

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "()I")
	public abstract int method18192();

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "()I")
	public abstract int method18193();

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "()Lclient!dp;")
	public abstract Interface18 method18194();

	@OriginalMember(owner = "client!cm", name = "ad", descriptor = "(III)V")
	public abstract void method18195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "(IIIIII)V")
	public abstract void method18196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(III)V")
	public abstract void method18197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "(IIIII)V")
	public abstract void method18198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "(IILclient!ch;II)V")
	public abstract void method18199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cm", name = "bq", descriptor = "(FFFFFFILclient!ch;II)V")
	abstract void method18200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "(IIIIIIII)V")
	abstract void method18201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "(IIIIIII)V")
	public abstract void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cm", name = "al", descriptor = "(FFFFFFILclient!ch;II)V")
	abstract void method18203(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "at", descriptor = "(IIIIII)V")
	public abstract void method18204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "()I")
	public abstract int method18205();

	@OriginalMember(owner = "client!cm", name = "aa", descriptor = "(IIII)V")
	public abstract void method18206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cm", name = "an", descriptor = "()I")
	public abstract int method18207();

	@OriginalMember(owner = "client!cm", name = "ai", descriptor = "(IIII[I[III)V")
	public abstract void method18208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "aw", descriptor = "(IIII[I[III)V")
	public abstract void method18209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "ac", descriptor = "(IIII[III)V")
	public abstract void method18210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cm", name = "as", descriptor = "(IIIIII)V")
	public abstract void method18211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cm", name = "am", descriptor = "(III)V")
	public abstract void method18212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cm", name = "au", descriptor = "(III)V")
	public abstract void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "(IIII[III)V")
	public abstract void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cm", name = "ap", descriptor = "()Lclient!dp;")
	public abstract Interface18 method18215();

	@OriginalMember(owner = "client!cm", name = "bh", descriptor = "()I")
	public abstract int method18159();

	@OriginalMember(owner = "client!cm", name = "ax", descriptor = "(IIIII)V")
	public abstract void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cm", name = "av", descriptor = "(IILclient!ch;II)V")
	public abstract void method18217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cm", name = "aj", descriptor = "(IIIIIIII)V")
	abstract void method18218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "(IIII[I[III)V")
	public abstract void method18219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "ab", descriptor = "(IIIIIIII)V")
	abstract void method18220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "az", descriptor = "(IIII)V")
	public abstract void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cm", name = "af", descriptor = "([I)V")
	public abstract void method18222(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!cm", name = "ak", descriptor = "([I)V")
	public abstract void method18223(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!cm", name = "ay", descriptor = "(IIIIIIII)V")
	abstract void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!cm", name = "bf", descriptor = "()I")
	public abstract int method18225();

	@OriginalMember(owner = "client!cm", name = "bl", descriptor = "()I")
	public abstract int method18226();

	@OriginalMember(owner = "client!cm", name = "bk", descriptor = "()I")
	public abstract int method18227();

	@OriginalMember(owner = "client!cm", name = "bx", descriptor = "()I")
	public abstract int method18228();

	@OriginalMember(owner = "client!cm", name = "bd", descriptor = "(IIIIIII)V")
	public abstract void method18229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cm", name = "bc", descriptor = "(IIIIIII)V")
	public abstract void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cm", name = "bn", descriptor = "(FFFFFFIIII)V")
	abstract void method18231(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "bt", descriptor = "(FFFFFFIIII)V")
	abstract void method18232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "bi", descriptor = "(FFFFFFIIII)V")
	abstract void method18233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!cm", name = "ar", descriptor = "()Lclient!dp;")
	public abstract Interface18 method18234();

	@OriginalMember(owner = "client!cm", name = "ao", descriptor = "(IILclient!ch;II)V")
	public abstract void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cm", name = "aq", descriptor = "(IIIII)V")
	public abstract void method18236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
