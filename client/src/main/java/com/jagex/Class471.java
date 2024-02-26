package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class471 {

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "Lclient!ov;")
	public static final Class471 aClass471_53 = new Class471();

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "F")
	float aFloat302;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "F")
	float aFloat303;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "F")
	float aFloat304;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "F")
	float aFloat305;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "F")
	float aFloat306;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "F")
	float aFloat307;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "F")
	float aFloat308;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "F")
	float aFloat309;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "F")
	float aFloat310;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "F")
	float aFloat311;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "F")
	float aFloat312;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "F")
	float aFloat313;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ov;)V")
	public Class471(@OriginalArg(0) Class471 arg0) {
		this.method29760(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class471() {
		this.method29763();
	}

	@OriginalMember(owner = "client!ov", name = "bk", descriptor = "(F)V")
	void method29758(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat303;
		@Pc(15) float local15 = this.aFloat311;
		@Pc(18) float local18 = this.aFloat308;
		@Pc(21) float local21 = this.aFloat310;
		this.aFloat303 = local12 * local4 + this.aFloat305 * local9;
		this.aFloat305 = this.aFloat305 * local4 - local12 * local9;
		this.aFloat311 = local15 * local4 + this.aFloat307 * local9;
		this.aFloat307 = this.aFloat307 * local4 - local15 * local9;
		this.aFloat308 = local18 * local4 + this.aFloat302 * local9;
		this.aFloat302 = this.aFloat302 * local4 - local18 * local9;
		this.aFloat310 = local21 * local4 + this.aFloat313 * local9;
		this.aFloat313 = this.aFloat313 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ov", name = "ag", descriptor = "(Lclient!ov;)V")
	public void method29759(@OriginalArg(0) Class471 arg0) {
		this.aFloat303 = arg0.aFloat303;
		this.aFloat311 = arg0.aFloat311;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat304 = arg0.aFloat304;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat306 = arg0.aFloat306;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat305 = arg0.aFloat305;
		this.aFloat307 = arg0.aFloat307;
		this.aFloat302 = arg0.aFloat302;
		this.aFloat313 = arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "(Lclient!ov;)V")
	public void method29760(@OriginalArg(0) Class471 arg0) {
		this.aFloat303 = arg0.aFloat303;
		this.aFloat311 = arg0.aFloat311;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat304 = arg0.aFloat304;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat306 = arg0.aFloat306;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat305 = arg0.aFloat305;
		this.aFloat307 = arg0.aFloat307;
		this.aFloat302 = arg0.aFloat302;
		this.aFloat313 = arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(Lclient!oc;)V")
	public void method29761(@OriginalArg(0) Class457 arg0) {
		this.method29762(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(Lclient!oc;)V")
	public void method29762(@OriginalArg(0) Class457 arg0) {
		this.method29839(arg0.aClass463_62);
		this.method29784(arg0.aClass466_5);
		this.method29782(arg0.aClass463_61);
	}

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "()V")
	public void method29763() {
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "(DDDDDDFFF)V")
	public void method29764(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat303 = local22 * local55;
		this.aFloat311 = local30 * local55;
		this.aFloat308 = local38 * local55;
		this.aFloat305 = local4 * local72;
		this.aFloat307 = local9 * local72;
		this.aFloat302 = local14 * local72;
		this.aFloat304 = this.aFloat307 * this.aFloat308 - this.aFloat302 * this.aFloat311;
		this.aFloat309 = this.aFloat302 * this.aFloat303 - this.aFloat305 * this.aFloat308;
		this.aFloat306 = this.aFloat305 * this.aFloat311 - this.aFloat307 * this.aFloat303;
		this.aFloat310 = -((float) (arg0 * (double) this.aFloat303 + arg1 * (double) this.aFloat311 + arg2 * (double) this.aFloat308));
		this.aFloat312 = -((float) (arg0 * (double) this.aFloat304 + arg1 * (double) this.aFloat309 + arg2 * (double) this.aFloat306));
		this.aFloat313 = -((float) (arg0 * (double) this.aFloat305 + arg1 * (double) this.aFloat307 + arg2 * (double) this.aFloat302));
	}

	@OriginalMember(owner = "client!ov", name = "bj", descriptor = "(F)V")
	void method29765(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat304;
		@Pc(15) float local15 = this.aFloat309;
		@Pc(18) float local18 = this.aFloat306;
		@Pc(21) float local21 = this.aFloat312;
		this.aFloat304 = local12 * local4 - this.aFloat305 * local9;
		this.aFloat305 = local12 * local9 + this.aFloat305 * local4;
		this.aFloat309 = local15 * local4 - this.aFloat307 * local9;
		this.aFloat307 = local15 * local9 + this.aFloat307 * local4;
		this.aFloat306 = local18 * local4 - this.aFloat302 * local9;
		this.aFloat302 = local18 * local9 + this.aFloat302 * local4;
		this.aFloat312 = local21 * local4 - this.aFloat313 * local9;
		this.aFloat313 = local21 * local9 + this.aFloat313 * local4;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(Lclient!ov;)V")
	public void method29766(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat303;
		@Pc(5) float local5 = this.aFloat304;
		@Pc(8) float local8 = this.aFloat311;
		@Pc(11) float local11 = this.aFloat309;
		@Pc(14) float local14 = this.aFloat308;
		@Pc(17) float local17 = this.aFloat306;
		@Pc(20) float local20 = this.aFloat310;
		@Pc(23) float local23 = this.aFloat312;
		@Pc(26) float local26 = this.aFloat305;
		@Pc(29) float local29 = this.aFloat307;
		@Pc(32) float local32 = this.aFloat302;
		@Pc(35) float local35 = this.aFloat313;
		this.aFloat303 = local2 * arg0.aFloat303 + local5 * arg0.aFloat311 + local26 * arg0.aFloat308;
		this.aFloat304 = local2 * arg0.aFloat304 + local5 * arg0.aFloat309 + local26 * arg0.aFloat306;
		this.aFloat305 = local2 * arg0.aFloat305 + local5 * arg0.aFloat307 + local26 * arg0.aFloat302;
		this.aFloat311 = local8 * arg0.aFloat303 + local11 * arg0.aFloat311 + local29 * arg0.aFloat308;
		this.aFloat309 = local8 * arg0.aFloat304 + local11 * arg0.aFloat309 + local29 * arg0.aFloat306;
		this.aFloat307 = local8 * arg0.aFloat305 + local11 * arg0.aFloat307 + local29 * arg0.aFloat302;
		this.aFloat308 = local14 * arg0.aFloat303 + local17 * arg0.aFloat311 + local32 * arg0.aFloat308;
		this.aFloat306 = local14 * arg0.aFloat304 + local17 * arg0.aFloat309 + local32 * arg0.aFloat306;
		this.aFloat302 = local14 * arg0.aFloat305 + local17 * arg0.aFloat307 + local32 * arg0.aFloat302;
		this.aFloat310 = local20 * arg0.aFloat303 + local23 * arg0.aFloat311 + local35 * arg0.aFloat308 + arg0.aFloat310;
		this.aFloat312 = local20 * arg0.aFloat304 + local23 * arg0.aFloat309 + local35 * arg0.aFloat306 + arg0.aFloat312;
		this.aFloat313 = local20 * arg0.aFloat305 + local23 * arg0.aFloat307 + local35 * arg0.aFloat302 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "(Lclient!ov;)V")
	public void method29767(@OriginalArg(0) Class471 arg0) {
		if (arg0 == this) {
			this.method29768();
			return;
		}
		this.aFloat303 = arg0.aFloat303;
		this.aFloat311 = arg0.aFloat304;
		this.aFloat308 = arg0.aFloat305;
		this.aFloat304 = arg0.aFloat311;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat306 = arg0.aFloat307;
		this.aFloat305 = arg0.aFloat308;
		this.aFloat307 = arg0.aFloat306;
		this.aFloat302 = arg0.aFloat302;
		this.aFloat310 = -(arg0.aFloat310 * this.aFloat303 + arg0.aFloat312 * this.aFloat311 + arg0.aFloat313 * this.aFloat308);
		this.aFloat312 = -(arg0.aFloat310 * this.aFloat304 + arg0.aFloat312 * this.aFloat309 + arg0.aFloat313 * this.aFloat306);
		this.aFloat313 = -(arg0.aFloat310 * this.aFloat305 + arg0.aFloat312 * this.aFloat307 + arg0.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "()V")
	public void method29768() {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat312;
		@Pc(8) float local8 = this.aFloat311;
		this.aFloat311 = this.aFloat304;
		this.aFloat304 = local8;
		@Pc(18) float local18 = this.aFloat308;
		this.aFloat308 = this.aFloat305;
		this.aFloat305 = local18;
		@Pc(28) float local28 = this.aFloat306;
		this.aFloat306 = this.aFloat307;
		this.aFloat307 = local28;
		this.aFloat310 = -(local2 * this.aFloat303 + local5 * this.aFloat311 + this.aFloat313 * this.aFloat308);
		this.aFloat312 = -(local2 * this.aFloat304 + local5 * this.aFloat309 + this.aFloat313 * this.aFloat306);
		this.aFloat313 = -(local2 * this.aFloat305 + local5 * this.aFloat307 + this.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "(FFFF)V")
	public void method29769(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		this.aFloat303 = local4 + arg0 * arg0 * (1.0F - local4);
		this.aFloat304 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		this.aFloat305 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		this.aFloat311 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		this.aFloat309 = local4 + arg1 * arg1 * (1.0F - local4);
		this.aFloat307 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		this.aFloat308 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		this.aFloat306 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		this.aFloat302 = local4 + arg2 * arg2 * (1.0F - local4);
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!oq;)V")
	public void method29770(@OriginalArg(0) Class466 arg0) {
		this.method29810(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "ay", descriptor = "(FFF[F)V")
	public void method29771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat310;
		@Pc(9) float local9 = arg1 - this.aFloat312;
		@Pc(14) float local14 = arg2 - this.aFloat313;
		arg3[0] = (float) (this.aFloat303 * local4 + this.aFloat304 * local9 + this.aFloat305 * local14);
		arg3[1] = (float) (this.aFloat311 * local4 + this.aFloat309 * local9 + this.aFloat307 * local14);
		arg3[2] = (float) (this.aFloat308 * local4 + this.aFloat306 * local9 + this.aFloat302 * local14);
	}

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "(F)V")
	void method29772(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat304;
		@Pc(15) float local15 = this.aFloat309;
		@Pc(18) float local18 = this.aFloat306;
		@Pc(21) float local21 = this.aFloat312;
		this.aFloat304 = local12 * local4 - this.aFloat305 * local9;
		this.aFloat305 = local12 * local9 + this.aFloat305 * local4;
		this.aFloat309 = local15 * local4 - this.aFloat307 * local9;
		this.aFloat307 = local15 * local9 + this.aFloat307 * local4;
		this.aFloat306 = local18 * local4 - this.aFloat302 * local9;
		this.aFloat302 = local18 * local9 + this.aFloat302 * local4;
		this.aFloat312 = local21 * local4 - this.aFloat313 * local9;
		this.aFloat313 = local21 * local9 + this.aFloat313 * local4;
	}

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "(F)V")
	void method29773(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat303;
		@Pc(15) float local15 = this.aFloat311;
		@Pc(18) float local18 = this.aFloat308;
		@Pc(21) float local21 = this.aFloat310;
		this.aFloat303 = local12 * local4 + this.aFloat305 * local9;
		this.aFloat305 = this.aFloat305 * local4 - local12 * local9;
		this.aFloat311 = local15 * local4 + this.aFloat307 * local9;
		this.aFloat307 = this.aFloat307 * local4 - local15 * local9;
		this.aFloat308 = local18 * local4 + this.aFloat302 * local9;
		this.aFloat302 = this.aFloat302 * local4 - local18 * local9;
		this.aFloat310 = local21 * local4 + this.aFloat313 * local9;
		this.aFloat313 = this.aFloat313 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "(FFFF)V")
	public void method29774(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		@Pc(19) float local19 = local4 + arg0 * arg0 * (1.0F - local4);
		@Pc(31) float local31 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		@Pc(44) float local44 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		@Pc(57) float local57 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		@Pc(67) float local67 = local4 + arg1 * arg1 * (1.0F - local4);
		@Pc(79) float local79 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		@Pc(91) float local91 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		@Pc(104) float local104 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		@Pc(114) float local114 = local4 + arg2 * arg2 * (1.0F - local4);
		@Pc(117) float local117 = this.aFloat303;
		@Pc(120) float local120 = this.aFloat304;
		@Pc(123) float local123 = this.aFloat311;
		@Pc(126) float local126 = this.aFloat309;
		@Pc(129) float local129 = this.aFloat308;
		@Pc(132) float local132 = this.aFloat306;
		@Pc(135) float local135 = this.aFloat310;
		@Pc(138) float local138 = this.aFloat312;
		this.aFloat303 = local117 * local19 + local120 * local57 + this.aFloat305 * local91;
		this.aFloat304 = local117 * local31 + local120 * local67 + this.aFloat305 * local104;
		this.aFloat305 = local117 * local44 + local120 * local79 + this.aFloat305 * local114;
		this.aFloat311 = local123 * local19 + local126 * local57 + this.aFloat307 * local91;
		this.aFloat309 = local123 * local31 + local126 * local67 + this.aFloat307 * local104;
		this.aFloat307 = local123 * local44 + local126 * local79 + this.aFloat307 * local114;
		this.aFloat308 = local129 * local19 + local132 * local57 + this.aFloat302 * local91;
		this.aFloat306 = local129 * local31 + local132 * local67 + this.aFloat302 * local104;
		this.aFloat302 = local129 * local44 + local132 * local79 + this.aFloat302 * local114;
		this.aFloat310 = local135 * local19 + local138 * local57 + this.aFloat313 * local91;
		this.aFloat312 = local135 * local31 + local138 * local67 + this.aFloat313 * local104;
		this.aFloat313 = local135 * local44 + local138 * local79 + this.aFloat313 * local114;
	}

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "(FFF)V")
	public void method29775(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
		this.aFloat310 = arg0;
		this.aFloat312 = arg1;
		this.aFloat313 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "ci", descriptor = "([F)V")
	public void method29776(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat310;
		@Pc(13) float local13 = arg0[1] - this.aFloat312;
		@Pc(20) float local20 = arg0[2] - this.aFloat313;
		arg0[0] = (float) (this.aFloat303 * local6 + this.aFloat304 * local13 + this.aFloat305 * local20);
		arg0[1] = (float) (this.aFloat311 * local6 + this.aFloat309 * local13 + this.aFloat307 * local20);
		arg0[2] = (float) (this.aFloat308 * local6 + this.aFloat306 * local13 + this.aFloat302 * local20);
	}

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(FFFF)V")
	void method29777(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		@Pc(43) float local43 = 1.0F - (local19 + local31) * 2.0F;
		@Pc(49) float local49 = (local7 - local35) * 2.0F;
		@Pc(55) float local55 = (local11 + local27) * 2.0F;
		@Pc(61) float local61 = (local7 + local35) * 2.0F;
		@Pc(69) float local69 = 1.0F - (local3 + local31) * 2.0F;
		@Pc(75) float local75 = (local23 - local15) * 2.0F;
		@Pc(81) float local81 = (local11 - local27) * 2.0F;
		@Pc(87) float local87 = (local23 + local15) * 2.0F;
		@Pc(95) float local95 = 1.0F - (local3 + local19) * 2.0F;
		@Pc(98) float local98 = this.aFloat303;
		@Pc(101) float local101 = this.aFloat304;
		@Pc(104) float local104 = this.aFloat311;
		@Pc(107) float local107 = this.aFloat309;
		@Pc(110) float local110 = this.aFloat308;
		@Pc(113) float local113 = this.aFloat306;
		@Pc(116) float local116 = this.aFloat310;
		@Pc(119) float local119 = this.aFloat312;
		this.aFloat303 = local98 * local43 + local101 * local49 + this.aFloat305 * local55;
		this.aFloat304 = local98 * local61 + local101 * local69 + this.aFloat305 * local75;
		this.aFloat305 = local98 * local81 + local101 * local87 + this.aFloat305 * local95;
		this.aFloat311 = local104 * local43 + local107 * local49 + this.aFloat307 * local55;
		this.aFloat309 = local104 * local61 + local107 * local69 + this.aFloat307 * local75;
		this.aFloat307 = local104 * local81 + local107 * local87 + this.aFloat307 * local95;
		this.aFloat308 = local110 * local43 + local113 * local49 + this.aFloat302 * local55;
		this.aFloat306 = local110 * local61 + local113 * local69 + this.aFloat302 * local75;
		this.aFloat302 = local110 * local81 + local113 * local87 + this.aFloat302 * local95;
		this.aFloat310 = local116 * local43 + local119 * local49 + this.aFloat313 * local55;
		this.aFloat312 = local116 * local61 + local119 * local69 + this.aFloat313 * local75;
		this.aFloat313 = local116 * local81 + local119 * local87 + this.aFloat313 * local95;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(FFF)V")
	public void method29778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 = arg0;
		this.aFloat311 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat310 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat309 = arg1;
		this.aFloat306 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat302 = arg2;
		this.aFloat313 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method29779() {
		return this.aFloat303 + "," + this.aFloat311 + "," + this.aFloat308 + "," + this.aFloat310 + "\n" + this.aFloat304 + "," + this.aFloat309 + "," + this.aFloat306 + "," + this.aFloat312 + "\n" + this.aFloat305 + "," + this.aFloat307 + "," + this.aFloat302 + "," + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "af", descriptor = "(Lclient!oc;)V")
	public void method29780(@OriginalArg(0) Class457 arg0) {
		this.method29839(arg0.aClass463_62);
		this.method29784(arg0.aClass466_5);
		this.method29782(arg0.aClass463_61);
	}

	@OriginalMember(owner = "client!ov", name = "bs", descriptor = "(FFFF)V")
	void method29781(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat303 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat311 = (local7 - local35) * 2.0F;
		this.aFloat308 = (local11 + local27) * 2.0F;
		this.aFloat304 = (local7 + local35) * 2.0F;
		this.aFloat309 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat306 = (local23 - local15) * 2.0F;
		this.aFloat305 = (local11 - local27) * 2.0F;
		this.aFloat307 = (local23 + local15) * 2.0F;
		this.aFloat302 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "(Lclient!on;)V")
	public void method29782(@OriginalArg(0) Class463 arg0) {
		this.method29783(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "(FFF)V")
	public void method29783(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 += arg0;
		this.aFloat312 += arg1;
		this.aFloat313 += arg2;
	}

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "(Lclient!oq;)V")
	void method29784(@OriginalArg(0) Class466 arg0) {
		this.method29777(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "cv", descriptor = "(Lclient!on;)V")
	public void method29785(@OriginalArg(0) Class463 arg0) {
		this.method29783(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "an", descriptor = "(DDDDDDFFF)V")
	public void method29786(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat303 = local22 * local55;
		this.aFloat311 = local30 * local55;
		this.aFloat308 = local38 * local55;
		this.aFloat305 = local4 * local72;
		this.aFloat307 = local9 * local72;
		this.aFloat302 = local14 * local72;
		this.aFloat304 = this.aFloat307 * this.aFloat308 - this.aFloat302 * this.aFloat311;
		this.aFloat309 = this.aFloat302 * this.aFloat303 - this.aFloat305 * this.aFloat308;
		this.aFloat306 = this.aFloat305 * this.aFloat311 - this.aFloat307 * this.aFloat303;
		this.aFloat310 = -((float) (arg0 * (double) this.aFloat303 + arg1 * (double) this.aFloat311 + arg2 * (double) this.aFloat308));
		this.aFloat312 = -((float) (arg0 * (double) this.aFloat304 + arg1 * (double) this.aFloat309 + arg2 * (double) this.aFloat306));
		this.aFloat313 = -((float) (arg0 * (double) this.aFloat305 + arg1 * (double) this.aFloat307 + arg2 * (double) this.aFloat302));
	}

	@OriginalMember(owner = "client!ov", name = "ai", descriptor = "([F)V")
	public void method29787(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat310;
		@Pc(13) float local13 = arg0[1] - this.aFloat312;
		@Pc(20) float local20 = arg0[2] - this.aFloat313;
		arg0[0] = (float) (this.aFloat303 * local6 + this.aFloat304 * local13 + this.aFloat305 * local20);
		arg0[1] = (float) (this.aFloat311 * local6 + this.aFloat309 * local13 + this.aFloat307 * local20);
		arg0[2] = (float) (this.aFloat308 * local6 + this.aFloat306 * local13 + this.aFloat302 * local20);
	}

	@OriginalMember(owner = "client!ov", name = "aq", descriptor = "([F)V")
	public void method29788(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat303 * local3 + this.aFloat304 * local7 + this.aFloat305 * local11;
		arg0[1] = this.aFloat311 * local3 + this.aFloat309 * local7 + this.aFloat307 * local11;
		arg0[2] = this.aFloat308 * local3 + this.aFloat306 * local7 + this.aFloat302 * local11;
	}

	@OriginalMember(owner = "client!ov", name = "ao", descriptor = "([F)[F")
	public float[] method29789(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat312;
		arg0[2] = this.aFloat313;
		return arg0;
	}

	@OriginalMember(owner = "client!ov", name = "aj", descriptor = "([F)[F")
	public float[] method29790(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat303;
		arg0[1] = this.aFloat304;
		arg0[2] = this.aFloat305;
		arg0[3] = this.aFloat311;
		arg0[4] = this.aFloat309;
		arg0[5] = this.aFloat307;
		arg0[6] = this.aFloat308;
		arg0[7] = this.aFloat306;
		arg0[8] = this.aFloat302;
		return arg0;
	}

	@OriginalMember(owner = "client!ov", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat303 + "," + this.aFloat311 + "," + this.aFloat308 + "," + this.aFloat310 + "\n" + this.aFloat304 + "," + this.aFloat309 + "," + this.aFloat306 + "," + this.aFloat312 + "\n" + this.aFloat305 + "," + this.aFloat307 + "," + this.aFloat302 + "," + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cb", descriptor = "([F)[F")
	public float[] method29791(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat312;
		arg0[2] = this.aFloat313;
		return arg0;
	}

	@OriginalMember(owner = "client!ov", name = "ba", descriptor = "(FFFF)V")
	void method29792(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat303 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat311 = (local7 - local35) * 2.0F;
		this.aFloat308 = (local11 + local27) * 2.0F;
		this.aFloat304 = (local7 + local35) * 2.0F;
		this.aFloat309 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat306 = (local23 - local15) * 2.0F;
		this.aFloat305 = (local11 - local27) * 2.0F;
		this.aFloat307 = (local23 + local15) * 2.0F;
		this.aFloat302 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ac", descriptor = "(Lclient!ov;)V")
	public void method29793(@OriginalArg(0) Class471 arg0) {
		this.aFloat303 = arg0.aFloat303;
		this.aFloat311 = arg0.aFloat311;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat304 = arg0.aFloat304;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat306 = arg0.aFloat306;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat305 = arg0.aFloat305;
		this.aFloat307 = arg0.aFloat307;
		this.aFloat302 = arg0.aFloat302;
		this.aFloat313 = arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "ca", descriptor = "(FFF[F)V")
	public void method29794(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat303 * arg0 + this.aFloat311 * arg1 + this.aFloat308 * arg2 + this.aFloat310;
		arg3[1] = this.aFloat304 * arg0 + this.aFloat309 * arg1 + this.aFloat306 * arg2 + this.aFloat312;
		arg3[2] = this.aFloat305 * arg0 + this.aFloat307 * arg1 + this.aFloat302 * arg2 + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "ab", descriptor = "(Lclient!oc;)V")
	public void method29795(@OriginalArg(0) Class457 arg0) {
		this.method29762(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "al", descriptor = "(Lclient!oc;)V")
	public void method29796(@OriginalArg(0) Class457 arg0) {
		this.method29762(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "(FFFFFFFFF)V")
	public void method29797(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat303 = arg0;
		this.aFloat311 = arg3;
		this.aFloat308 = arg6;
		this.aFloat310 = 0.0F;
		this.aFloat304 = arg1;
		this.aFloat309 = arg4;
		this.aFloat306 = arg7;
		this.aFloat312 = 0.0F;
		this.aFloat305 = arg2;
		this.aFloat307 = arg5;
		this.aFloat302 = arg8;
		this.aFloat313 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "(IIIFFF)V")
	public void method29798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat306 = 0.0F;
			this.aFloat308 = 0.0F;
			this.aFloat307 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat305 = 0.0F;
			this.aFloat304 = 0.0F;
			this.aFloat303 = arg1 * 2;
			this.aFloat309 = arg2 * 2;
			this.aFloat302 = 1.0F;
			this.aFloat310 = arg3 - (float) arg1;
			this.aFloat312 = arg4 - (float) arg2;
			this.aFloat313 = arg5;
			return;
		}
		@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
		this.aFloat302 = 1.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat303 = local7 * 2.0F * (float) arg1;
		this.aFloat309 = local7 * 2.0F * (float) arg2;
		this.aFloat304 = local13 * 2.0F * (float) arg1;
		this.aFloat311 = -2.0F * local13 * (float) arg2;
		this.aFloat310 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat312 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat313 = arg5;
	}

	@OriginalMember(owner = "client!ov", name = "am", descriptor = "()V")
	public void method29799() {
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ak", descriptor = "()V")
	public void method29800() {
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
	}

	@OriginalMember(owner = "client!ov", name = "at", descriptor = "(DDDDDDFFF)V")
	public void method29801(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat303 = local22 * local55;
		this.aFloat311 = local30 * local55;
		this.aFloat308 = local38 * local55;
		this.aFloat305 = local4 * local72;
		this.aFloat307 = local9 * local72;
		this.aFloat302 = local14 * local72;
		this.aFloat304 = this.aFloat307 * this.aFloat308 - this.aFloat302 * this.aFloat311;
		this.aFloat309 = this.aFloat302 * this.aFloat303 - this.aFloat305 * this.aFloat308;
		this.aFloat306 = this.aFloat305 * this.aFloat311 - this.aFloat307 * this.aFloat303;
		this.aFloat310 = -((float) (arg0 * (double) this.aFloat303 + arg1 * (double) this.aFloat311 + arg2 * (double) this.aFloat308));
		this.aFloat312 = -((float) (arg0 * (double) this.aFloat304 + arg1 * (double) this.aFloat309 + arg2 * (double) this.aFloat306));
		this.aFloat313 = -((float) (arg0 * (double) this.aFloat305 + arg1 * (double) this.aFloat307 + arg2 * (double) this.aFloat302));
	}

	@OriginalMember(owner = "client!ov", name = "ad", descriptor = "(DDDDDDFFF)V")
	public void method29802(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat303 = local22 * local55;
		this.aFloat311 = local30 * local55;
		this.aFloat308 = local38 * local55;
		this.aFloat305 = local4 * local72;
		this.aFloat307 = local9 * local72;
		this.aFloat302 = local14 * local72;
		this.aFloat304 = this.aFloat307 * this.aFloat308 - this.aFloat302 * this.aFloat311;
		this.aFloat309 = this.aFloat302 * this.aFloat303 - this.aFloat305 * this.aFloat308;
		this.aFloat306 = this.aFloat305 * this.aFloat311 - this.aFloat307 * this.aFloat303;
		this.aFloat310 = -((float) (arg0 * (double) this.aFloat303 + arg1 * (double) this.aFloat311 + arg2 * (double) this.aFloat308));
		this.aFloat312 = -((float) (arg0 * (double) this.aFloat304 + arg1 * (double) this.aFloat309 + arg2 * (double) this.aFloat306));
		this.aFloat313 = -((float) (arg0 * (double) this.aFloat305 + arg1 * (double) this.aFloat307 + arg2 * (double) this.aFloat302));
	}

	@OriginalMember(owner = "client!ov", name = "av", descriptor = "(DDDDDDFFF)V")
	public void method29803(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat303 = local22 * local55;
		this.aFloat311 = local30 * local55;
		this.aFloat308 = local38 * local55;
		this.aFloat305 = local4 * local72;
		this.aFloat307 = local9 * local72;
		this.aFloat302 = local14 * local72;
		this.aFloat304 = this.aFloat307 * this.aFloat308 - this.aFloat302 * this.aFloat311;
		this.aFloat309 = this.aFloat302 * this.aFloat303 - this.aFloat305 * this.aFloat308;
		this.aFloat306 = this.aFloat305 * this.aFloat311 - this.aFloat307 * this.aFloat303;
		this.aFloat310 = -((float) (arg0 * (double) this.aFloat303 + arg1 * (double) this.aFloat311 + arg2 * (double) this.aFloat308));
		this.aFloat312 = -((float) (arg0 * (double) this.aFloat304 + arg1 * (double) this.aFloat309 + arg2 * (double) this.aFloat306));
		this.aFloat313 = -((float) (arg0 * (double) this.aFloat305 + arg1 * (double) this.aFloat307 + arg2 * (double) this.aFloat302));
	}

	@OriginalMember(owner = "client!ov", name = "ct", descriptor = "(Lclient!on;)V")
	public void method29804(@OriginalArg(0) Class463 arg0) {
		this.method29783(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "as", descriptor = "()V")
	public void method29805() {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat312;
		@Pc(8) float local8 = this.aFloat311;
		this.aFloat311 = this.aFloat304;
		this.aFloat304 = local8;
		@Pc(18) float local18 = this.aFloat308;
		this.aFloat308 = this.aFloat305;
		this.aFloat305 = local18;
		@Pc(28) float local28 = this.aFloat306;
		this.aFloat306 = this.aFloat307;
		this.aFloat307 = local28;
		this.aFloat310 = -(local2 * this.aFloat303 + local5 * this.aFloat311 + this.aFloat313 * this.aFloat308);
		this.aFloat312 = -(local2 * this.aFloat304 + local5 * this.aFloat309 + this.aFloat313 * this.aFloat306);
		this.aFloat313 = -(local2 * this.aFloat305 + local5 * this.aFloat307 + this.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "ae", descriptor = "(IIIFFF)V")
	public void method29806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat306 = 0.0F;
			this.aFloat308 = 0.0F;
			this.aFloat307 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat305 = 0.0F;
			this.aFloat304 = 0.0F;
			this.aFloat303 = arg1 * 2;
			this.aFloat309 = arg2 * 2;
			this.aFloat302 = 1.0F;
			this.aFloat310 = arg3 - (float) arg1;
			this.aFloat312 = arg4 - (float) arg2;
			this.aFloat313 = arg5;
			return;
		}
		@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
		this.aFloat302 = 1.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat303 = local7 * 2.0F * (float) arg1;
		this.aFloat309 = local7 * 2.0F * (float) arg2;
		this.aFloat304 = local13 * 2.0F * (float) arg1;
		this.aFloat311 = -2.0F * local13 * (float) arg2;
		this.aFloat310 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat312 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat313 = arg5;
	}

	@OriginalMember(owner = "client!ov", name = "ap", descriptor = "(IIIFFF)V")
	public void method29807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat306 = 0.0F;
			this.aFloat308 = 0.0F;
			this.aFloat307 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat305 = 0.0F;
			this.aFloat304 = 0.0F;
			this.aFloat303 = arg1 * 2;
			this.aFloat309 = arg2 * 2;
			this.aFloat302 = 1.0F;
			this.aFloat310 = arg3 - (float) arg1;
			this.aFloat312 = arg4 - (float) arg2;
			this.aFloat313 = arg5;
			return;
		}
		@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
		this.aFloat302 = 1.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat303 = local7 * 2.0F * (float) arg1;
		this.aFloat309 = local7 * 2.0F * (float) arg2;
		this.aFloat304 = local13 * 2.0F * (float) arg1;
		this.aFloat311 = -2.0F * local13 * (float) arg2;
		this.aFloat310 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat312 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat313 = arg5;
	}

	@OriginalMember(owner = "client!ov", name = "ah", descriptor = "(Lclient!oc;)V")
	public void method29808(@OriginalArg(0) Class457 arg0) {
		this.method29839(arg0.aClass463_62);
		this.method29784(arg0.aClass466_5);
		this.method29782(arg0.aClass463_61);
	}

	@OriginalMember(owner = "client!ov", name = "au", descriptor = "()V")
	public void method29809() {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat312;
		@Pc(8) float local8 = this.aFloat311;
		this.aFloat311 = this.aFloat304;
		this.aFloat304 = local8;
		@Pc(18) float local18 = this.aFloat308;
		this.aFloat308 = this.aFloat305;
		this.aFloat305 = local18;
		@Pc(28) float local28 = this.aFloat306;
		this.aFloat306 = this.aFloat307;
		this.aFloat307 = local28;
		this.aFloat310 = -(local2 * this.aFloat303 + local5 * this.aFloat311 + this.aFloat313 * this.aFloat308);
		this.aFloat312 = -(local2 * this.aFloat304 + local5 * this.aFloat309 + this.aFloat313 * this.aFloat306);
		this.aFloat313 = -(local2 * this.aFloat305 + local5 * this.aFloat307 + this.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "(FFFF)V")
	void method29810(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat303 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat311 = (local7 - local35) * 2.0F;
		this.aFloat308 = (local11 + local27) * 2.0F;
		this.aFloat304 = (local7 + local35) * 2.0F;
		this.aFloat309 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat306 = (local23 - local15) * 2.0F;
		this.aFloat305 = (local11 - local27) * 2.0F;
		this.aFloat307 = (local23 + local15) * 2.0F;
		this.aFloat302 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method29811() {
		return this.aFloat303 + "," + this.aFloat311 + "," + this.aFloat308 + "," + this.aFloat310 + "\n" + this.aFloat304 + "," + this.aFloat309 + "," + this.aFloat306 + "," + this.aFloat312 + "\n" + this.aFloat305 + "," + this.aFloat307 + "," + this.aFloat302 + "," + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cy", descriptor = "(Lclient!ov;)V")
	public void method29812(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat303;
		@Pc(5) float local5 = this.aFloat304;
		@Pc(8) float local8 = this.aFloat311;
		@Pc(11) float local11 = this.aFloat309;
		@Pc(14) float local14 = this.aFloat308;
		@Pc(17) float local17 = this.aFloat306;
		@Pc(20) float local20 = this.aFloat310;
		@Pc(23) float local23 = this.aFloat312;
		@Pc(26) float local26 = this.aFloat305;
		@Pc(29) float local29 = this.aFloat307;
		@Pc(32) float local32 = this.aFloat302;
		@Pc(35) float local35 = this.aFloat313;
		this.aFloat303 = local2 * arg0.aFloat303 + local5 * arg0.aFloat311 + local26 * arg0.aFloat308;
		this.aFloat304 = local2 * arg0.aFloat304 + local5 * arg0.aFloat309 + local26 * arg0.aFloat306;
		this.aFloat305 = local2 * arg0.aFloat305 + local5 * arg0.aFloat307 + local26 * arg0.aFloat302;
		this.aFloat311 = local8 * arg0.aFloat303 + local11 * arg0.aFloat311 + local29 * arg0.aFloat308;
		this.aFloat309 = local8 * arg0.aFloat304 + local11 * arg0.aFloat309 + local29 * arg0.aFloat306;
		this.aFloat307 = local8 * arg0.aFloat305 + local11 * arg0.aFloat307 + local29 * arg0.aFloat302;
		this.aFloat308 = local14 * arg0.aFloat303 + local17 * arg0.aFloat311 + local32 * arg0.aFloat308;
		this.aFloat306 = local14 * arg0.aFloat304 + local17 * arg0.aFloat309 + local32 * arg0.aFloat306;
		this.aFloat302 = local14 * arg0.aFloat305 + local17 * arg0.aFloat307 + local32 * arg0.aFloat302;
		this.aFloat310 = local20 * arg0.aFloat303 + local23 * arg0.aFloat311 + local35 * arg0.aFloat308 + arg0.aFloat310;
		this.aFloat312 = local20 * arg0.aFloat304 + local23 * arg0.aFloat309 + local35 * arg0.aFloat306 + arg0.aFloat312;
		this.aFloat313 = local20 * arg0.aFloat305 + local23 * arg0.aFloat307 + local35 * arg0.aFloat302 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "bg", descriptor = "(FFFF)V")
	public void method29813(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		this.aFloat303 = local4 + arg0 * arg0 * (1.0F - local4);
		this.aFloat304 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		this.aFloat305 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		this.aFloat311 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		this.aFloat309 = local4 + arg1 * arg1 * (1.0F - local4);
		this.aFloat307 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		this.aFloat308 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		this.aFloat306 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		this.aFloat302 = local4 + arg2 * arg2 * (1.0F - local4);
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "bl", descriptor = "(Lclient!oq;)V")
	public void method29814(@OriginalArg(0) Class466 arg0) {
		this.method29810(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "br", descriptor = "(Lclient!oq;)V")
	public void method29815(@OriginalArg(0) Class466 arg0) {
		this.method29810(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "(FFF)V")
	public void method29816(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 *= arg0;
		this.aFloat311 *= arg0;
		this.aFloat308 *= arg0;
		this.aFloat310 *= arg0;
		this.aFloat304 *= arg1;
		this.aFloat309 *= arg1;
		this.aFloat306 *= arg1;
		this.aFloat312 *= arg1;
		this.aFloat305 *= arg2;
		this.aFloat307 *= arg2;
		this.aFloat302 *= arg2;
		this.aFloat313 *= arg2;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!ov;Lclient!ov;)V")
	public void method29817(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		this.aFloat303 = arg0.aFloat303 * arg1.aFloat303 + arg0.aFloat304 * arg1.aFloat311 + arg0.aFloat305 * arg1.aFloat308;
		this.aFloat304 = arg0.aFloat303 * arg1.aFloat304 + arg0.aFloat304 * arg1.aFloat309 + arg0.aFloat305 * arg1.aFloat306;
		this.aFloat305 = arg0.aFloat303 * arg1.aFloat305 + arg0.aFloat304 * arg1.aFloat307 + arg0.aFloat305 * arg1.aFloat302;
		this.aFloat311 = arg0.aFloat311 * arg1.aFloat303 + arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat307 * arg1.aFloat308;
		this.aFloat309 = arg0.aFloat311 * arg1.aFloat304 + arg0.aFloat309 * arg1.aFloat309 + arg0.aFloat307 * arg1.aFloat306;
		this.aFloat307 = arg0.aFloat311 * arg1.aFloat305 + arg0.aFloat309 * arg1.aFloat307 + arg0.aFloat307 * arg1.aFloat302;
		this.aFloat308 = arg0.aFloat308 * arg1.aFloat303 + arg0.aFloat306 * arg1.aFloat311 + arg0.aFloat302 * arg1.aFloat308;
		this.aFloat306 = arg0.aFloat308 * arg1.aFloat304 + arg0.aFloat306 * arg1.aFloat309 + arg0.aFloat302 * arg1.aFloat306;
		this.aFloat302 = arg0.aFloat308 * arg1.aFloat305 + arg0.aFloat306 * arg1.aFloat307 + arg0.aFloat302 * arg1.aFloat302;
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat303 + arg0.aFloat312 * arg1.aFloat311 + arg0.aFloat313 * arg1.aFloat308 + arg1.aFloat310;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat304 + arg0.aFloat312 * arg1.aFloat309 + arg0.aFloat313 * arg1.aFloat306 + arg1.aFloat312;
		this.aFloat313 = arg0.aFloat310 * arg1.aFloat305 + arg0.aFloat312 * arg1.aFloat307 + arg0.aFloat313 * arg1.aFloat302 + arg1.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "bt", descriptor = "(FFFF)V")
	void method29818(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat303 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat311 = (local7 - local35) * 2.0F;
		this.aFloat308 = (local11 + local27) * 2.0F;
		this.aFloat304 = (local7 + local35) * 2.0F;
		this.aFloat309 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat306 = (local23 - local15) * 2.0F;
		this.aFloat305 = (local11 - local27) * 2.0F;
		this.aFloat307 = (local23 + local15) * 2.0F;
		this.aFloat302 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "cm", descriptor = "([F)V")
	public void method29819(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat310;
		@Pc(13) float local13 = arg0[1] - this.aFloat312;
		@Pc(20) float local20 = arg0[2] - this.aFloat313;
		arg0[0] = (float) (this.aFloat303 * local6 + this.aFloat304 * local13 + this.aFloat305 * local20);
		arg0[1] = (float) (this.aFloat311 * local6 + this.aFloat309 * local13 + this.aFloat307 * local20);
		arg0[2] = (float) (this.aFloat308 * local6 + this.aFloat306 * local13 + this.aFloat302 * local20);
	}

	@OriginalMember(owner = "client!ov", name = "by", descriptor = "(F)V")
	void method29820(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat304;
		@Pc(15) float local15 = this.aFloat309;
		@Pc(18) float local18 = this.aFloat306;
		@Pc(21) float local21 = this.aFloat312;
		this.aFloat304 = local12 * local4 - this.aFloat305 * local9;
		this.aFloat305 = local12 * local9 + this.aFloat305 * local4;
		this.aFloat309 = local15 * local4 - this.aFloat307 * local9;
		this.aFloat307 = local15 * local9 + this.aFloat307 * local4;
		this.aFloat306 = local18 * local4 - this.aFloat302 * local9;
		this.aFloat302 = local18 * local9 + this.aFloat302 * local4;
		this.aFloat312 = local21 * local4 - this.aFloat313 * local9;
		this.aFloat313 = local21 * local9 + this.aFloat313 * local4;
	}

	@OriginalMember(owner = "client!ov", name = "aw", descriptor = "()V")
	public void method29821() {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat312;
		@Pc(8) float local8 = this.aFloat311;
		this.aFloat311 = this.aFloat304;
		this.aFloat304 = local8;
		@Pc(18) float local18 = this.aFloat308;
		this.aFloat308 = this.aFloat305;
		this.aFloat305 = local18;
		@Pc(28) float local28 = this.aFloat306;
		this.aFloat306 = this.aFloat307;
		this.aFloat307 = local28;
		this.aFloat310 = -(local2 * this.aFloat303 + local5 * this.aFloat311 + this.aFloat313 * this.aFloat308);
		this.aFloat312 = -(local2 * this.aFloat304 + local5 * this.aFloat309 + this.aFloat313 * this.aFloat306);
		this.aFloat313 = -(local2 * this.aFloat305 + local5 * this.aFloat307 + this.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "bz", descriptor = "(F)V")
	void method29822(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat303;
		@Pc(15) float local15 = this.aFloat311;
		@Pc(18) float local18 = this.aFloat308;
		@Pc(21) float local21 = this.aFloat310;
		this.aFloat303 = local12 * local4 + this.aFloat305 * local9;
		this.aFloat305 = this.aFloat305 * local4 - local12 * local9;
		this.aFloat311 = local15 * local4 + this.aFloat307 * local9;
		this.aFloat307 = this.aFloat307 * local4 - local15 * local9;
		this.aFloat308 = local18 * local4 + this.aFloat302 * local9;
		this.aFloat302 = this.aFloat302 * local4 - local18 * local9;
		this.aFloat310 = local21 * local4 + this.aFloat313 * local9;
		this.aFloat313 = this.aFloat313 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "(F)V")
	void method29823(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat303;
		@Pc(15) float local15 = this.aFloat311;
		@Pc(18) float local18 = this.aFloat308;
		@Pc(21) float local21 = this.aFloat310;
		this.aFloat303 = local12 * local4 - this.aFloat304 * local9;
		this.aFloat304 = local12 * local9 + this.aFloat304 * local4;
		this.aFloat311 = local15 * local4 - this.aFloat309 * local9;
		this.aFloat309 = local15 * local9 + this.aFloat309 * local4;
		this.aFloat308 = local18 * local4 - this.aFloat306 * local9;
		this.aFloat306 = local18 * local9 + this.aFloat306 * local4;
		this.aFloat310 = local21 * local4 - this.aFloat312 * local9;
		this.aFloat312 = local21 * local9 + this.aFloat312 * local4;
	}

	@OriginalMember(owner = "client!ov", name = "bh", descriptor = "(FFFF)V")
	public void method29824(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		@Pc(19) float local19 = local4 + arg0 * arg0 * (1.0F - local4);
		@Pc(31) float local31 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		@Pc(44) float local44 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		@Pc(57) float local57 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		@Pc(67) float local67 = local4 + arg1 * arg1 * (1.0F - local4);
		@Pc(79) float local79 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		@Pc(91) float local91 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		@Pc(104) float local104 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		@Pc(114) float local114 = local4 + arg2 * arg2 * (1.0F - local4);
		@Pc(117) float local117 = this.aFloat303;
		@Pc(120) float local120 = this.aFloat304;
		@Pc(123) float local123 = this.aFloat311;
		@Pc(126) float local126 = this.aFloat309;
		@Pc(129) float local129 = this.aFloat308;
		@Pc(132) float local132 = this.aFloat306;
		@Pc(135) float local135 = this.aFloat310;
		@Pc(138) float local138 = this.aFloat312;
		this.aFloat303 = local117 * local19 + local120 * local57 + this.aFloat305 * local91;
		this.aFloat304 = local117 * local31 + local120 * local67 + this.aFloat305 * local104;
		this.aFloat305 = local117 * local44 + local120 * local79 + this.aFloat305 * local114;
		this.aFloat311 = local123 * local19 + local126 * local57 + this.aFloat307 * local91;
		this.aFloat309 = local123 * local31 + local126 * local67 + this.aFloat307 * local104;
		this.aFloat307 = local123 * local44 + local126 * local79 + this.aFloat307 * local114;
		this.aFloat308 = local129 * local19 + local132 * local57 + this.aFloat302 * local91;
		this.aFloat306 = local129 * local31 + local132 * local67 + this.aFloat302 * local104;
		this.aFloat302 = local129 * local44 + local132 * local79 + this.aFloat302 * local114;
		this.aFloat310 = local135 * local19 + local138 * local57 + this.aFloat313 * local91;
		this.aFloat312 = local135 * local31 + local138 * local67 + this.aFloat313 * local104;
		this.aFloat313 = local135 * local44 + local138 * local79 + this.aFloat313 * local114;
	}

	@OriginalMember(owner = "client!ov", name = "bv", descriptor = "(FFFF)V")
	public void method29825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		@Pc(19) float local19 = local4 + arg0 * arg0 * (1.0F - local4);
		@Pc(31) float local31 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		@Pc(44) float local44 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		@Pc(57) float local57 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		@Pc(67) float local67 = local4 + arg1 * arg1 * (1.0F - local4);
		@Pc(79) float local79 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		@Pc(91) float local91 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		@Pc(104) float local104 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		@Pc(114) float local114 = local4 + arg2 * arg2 * (1.0F - local4);
		@Pc(117) float local117 = this.aFloat303;
		@Pc(120) float local120 = this.aFloat304;
		@Pc(123) float local123 = this.aFloat311;
		@Pc(126) float local126 = this.aFloat309;
		@Pc(129) float local129 = this.aFloat308;
		@Pc(132) float local132 = this.aFloat306;
		@Pc(135) float local135 = this.aFloat310;
		@Pc(138) float local138 = this.aFloat312;
		this.aFloat303 = local117 * local19 + local120 * local57 + this.aFloat305 * local91;
		this.aFloat304 = local117 * local31 + local120 * local67 + this.aFloat305 * local104;
		this.aFloat305 = local117 * local44 + local120 * local79 + this.aFloat305 * local114;
		this.aFloat311 = local123 * local19 + local126 * local57 + this.aFloat307 * local91;
		this.aFloat309 = local123 * local31 + local126 * local67 + this.aFloat307 * local104;
		this.aFloat307 = local123 * local44 + local126 * local79 + this.aFloat307 * local114;
		this.aFloat308 = local129 * local19 + local132 * local57 + this.aFloat302 * local91;
		this.aFloat306 = local129 * local31 + local132 * local67 + this.aFloat302 * local104;
		this.aFloat302 = local129 * local44 + local132 * local79 + this.aFloat302 * local114;
		this.aFloat310 = local135 * local19 + local138 * local57 + this.aFloat313 * local91;
		this.aFloat312 = local135 * local31 + local138 * local67 + this.aFloat313 * local104;
		this.aFloat313 = local135 * local44 + local138 * local79 + this.aFloat313 * local114;
	}

	@OriginalMember(owner = "client!ov", name = "bp", descriptor = "(Lclient!oq;)V")
	void method29826(@OriginalArg(0) Class466 arg0) {
		this.method29777(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "bb", descriptor = "(Lclient!oq;)V")
	void method29827(@OriginalArg(0) Class466 arg0) {
		this.method29777(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "ar", descriptor = "(FFFFFFFFF)V")
	public void method29828(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat303 = arg0;
		this.aFloat311 = arg3;
		this.aFloat308 = arg6;
		this.aFloat310 = 0.0F;
		this.aFloat304 = arg1;
		this.aFloat309 = arg4;
		this.aFloat306 = arg7;
		this.aFloat312 = 0.0F;
		this.aFloat305 = arg2;
		this.aFloat307 = arg5;
		this.aFloat302 = arg8;
		this.aFloat313 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "bc", descriptor = "(FFF)V")
	public void method29829(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 = arg0;
		this.aFloat311 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat310 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat309 = arg1;
		this.aFloat306 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat302 = arg2;
		this.aFloat313 = 0.0F;
	}

	@OriginalMember(owner = "client!ov", name = "bf", descriptor = "(Lclient!on;)V")
	void method29830(@OriginalArg(0) Class463 arg0) {
		this.method29778(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "bw", descriptor = "(Lclient!on;)V")
	void method29831(@OriginalArg(0) Class463 arg0) {
		this.method29778(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "bx", descriptor = "(FFF)V")
	public void method29832(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 *= arg0;
		this.aFloat311 *= arg0;
		this.aFloat308 *= arg0;
		this.aFloat310 *= arg0;
		this.aFloat304 *= arg1;
		this.aFloat309 *= arg1;
		this.aFloat306 *= arg1;
		this.aFloat312 *= arg1;
		this.aFloat305 *= arg2;
		this.aFloat307 *= arg2;
		this.aFloat302 *= arg2;
		this.aFloat313 *= arg2;
	}

	@OriginalMember(owner = "client!ov", name = "bi", descriptor = "(FFF)V")
	public void method29833(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 *= arg0;
		this.aFloat311 *= arg0;
		this.aFloat308 *= arg0;
		this.aFloat310 *= arg0;
		this.aFloat304 *= arg1;
		this.aFloat309 *= arg1;
		this.aFloat306 *= arg1;
		this.aFloat312 *= arg1;
		this.aFloat305 *= arg2;
		this.aFloat307 *= arg2;
		this.aFloat302 *= arg2;
		this.aFloat313 *= arg2;
	}

	@OriginalMember(owner = "client!ov", name = "bu", descriptor = "(FFF)V")
	public void method29834(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 *= arg0;
		this.aFloat311 *= arg0;
		this.aFloat308 *= arg0;
		this.aFloat310 *= arg0;
		this.aFloat304 *= arg1;
		this.aFloat309 *= arg1;
		this.aFloat306 *= arg1;
		this.aFloat312 *= arg1;
		this.aFloat305 *= arg2;
		this.aFloat307 *= arg2;
		this.aFloat302 *= arg2;
		this.aFloat313 *= arg2;
	}

	@OriginalMember(owner = "client!ov", name = "bm", descriptor = "(FFF)V")
	public void method29835(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat303 *= arg0;
		this.aFloat311 *= arg0;
		this.aFloat308 *= arg0;
		this.aFloat310 *= arg0;
		this.aFloat304 *= arg1;
		this.aFloat309 *= arg1;
		this.aFloat306 *= arg1;
		this.aFloat312 *= arg1;
		this.aFloat305 *= arg2;
		this.aFloat307 *= arg2;
		this.aFloat302 *= arg2;
		this.aFloat313 *= arg2;
	}

	@OriginalMember(owner = "client!ov", name = "bq", descriptor = "(FFF)V")
	public void method29836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
		this.aFloat310 = arg0;
		this.aFloat312 = arg1;
		this.aFloat313 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "az", descriptor = "()V")
	public void method29837() {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat312;
		@Pc(8) float local8 = this.aFloat311;
		this.aFloat311 = this.aFloat304;
		this.aFloat304 = local8;
		@Pc(18) float local18 = this.aFloat308;
		this.aFloat308 = this.aFloat305;
		this.aFloat305 = local18;
		@Pc(28) float local28 = this.aFloat306;
		this.aFloat306 = this.aFloat307;
		this.aFloat307 = local28;
		this.aFloat310 = -(local2 * this.aFloat303 + local5 * this.aFloat311 + this.aFloat313 * this.aFloat308);
		this.aFloat312 = -(local2 * this.aFloat304 + local5 * this.aFloat309 + this.aFloat313 * this.aFloat306);
		this.aFloat313 = -(local2 * this.aFloat305 + local5 * this.aFloat307 + this.aFloat313 * this.aFloat302);
	}

	@OriginalMember(owner = "client!ov", name = "cd", descriptor = "(FFF)V")
	public void method29838(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
		this.aFloat310 = arg0;
		this.aFloat312 = arg1;
		this.aFloat313 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "(Lclient!on;)V")
	void method29839(@OriginalArg(0) Class463 arg0) {
		this.method29778(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "aa", descriptor = "(IIIFFF)V")
	public void method29840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat306 = 0.0F;
			this.aFloat308 = 0.0F;
			this.aFloat307 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat305 = 0.0F;
			this.aFloat304 = 0.0F;
			this.aFloat303 = arg1 * 2;
			this.aFloat309 = arg2 * 2;
			this.aFloat302 = 1.0F;
			this.aFloat310 = arg3 - (float) arg1;
			this.aFloat312 = arg4 - (float) arg2;
			this.aFloat313 = arg5;
			return;
		}
		@Pc(7) float local7 = Class473.aFloatArray111[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class473.aFloatArray112[arg0 & 0x3FFF];
		this.aFloat302 = 1.0F;
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat303 = local7 * 2.0F * (float) arg1;
		this.aFloat309 = local7 * 2.0F * (float) arg2;
		this.aFloat304 = local13 * 2.0F * (float) arg1;
		this.aFloat311 = -2.0F * local13 * (float) arg2;
		this.aFloat310 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat312 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat313 = arg5;
	}

	@OriginalMember(owner = "client!ov", name = "cn", descriptor = "(Lclient!on;)V")
	public void method29841(@OriginalArg(0) Class463 arg0) {
		this.method29783(arg0.aFloat297, arg0.aFloat295, arg0.aFloat296);
	}

	@OriginalMember(owner = "client!ov", name = "ax", descriptor = "(FFF[F)V")
	public void method29842(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat303 * arg0 + this.aFloat311 * arg1 + this.aFloat308 * arg2 + this.aFloat310;
		arg3[1] = this.aFloat304 * arg0 + this.aFloat309 * arg1 + this.aFloat306 * arg2 + this.aFloat312;
		arg3[2] = this.aFloat305 * arg0 + this.aFloat307 * arg1 + this.aFloat302 * arg2 + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "ch", descriptor = "(Lclient!ov;)V")
	public void method29843(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat303;
		@Pc(5) float local5 = this.aFloat304;
		@Pc(8) float local8 = this.aFloat311;
		@Pc(11) float local11 = this.aFloat309;
		@Pc(14) float local14 = this.aFloat308;
		@Pc(17) float local17 = this.aFloat306;
		@Pc(20) float local20 = this.aFloat310;
		@Pc(23) float local23 = this.aFloat312;
		@Pc(26) float local26 = this.aFloat305;
		@Pc(29) float local29 = this.aFloat307;
		@Pc(32) float local32 = this.aFloat302;
		@Pc(35) float local35 = this.aFloat313;
		this.aFloat303 = local2 * arg0.aFloat303 + local5 * arg0.aFloat311 + local26 * arg0.aFloat308;
		this.aFloat304 = local2 * arg0.aFloat304 + local5 * arg0.aFloat309 + local26 * arg0.aFloat306;
		this.aFloat305 = local2 * arg0.aFloat305 + local5 * arg0.aFloat307 + local26 * arg0.aFloat302;
		this.aFloat311 = local8 * arg0.aFloat303 + local11 * arg0.aFloat311 + local29 * arg0.aFloat308;
		this.aFloat309 = local8 * arg0.aFloat304 + local11 * arg0.aFloat309 + local29 * arg0.aFloat306;
		this.aFloat307 = local8 * arg0.aFloat305 + local11 * arg0.aFloat307 + local29 * arg0.aFloat302;
		this.aFloat308 = local14 * arg0.aFloat303 + local17 * arg0.aFloat311 + local32 * arg0.aFloat308;
		this.aFloat306 = local14 * arg0.aFloat304 + local17 * arg0.aFloat309 + local32 * arg0.aFloat306;
		this.aFloat302 = local14 * arg0.aFloat305 + local17 * arg0.aFloat307 + local32 * arg0.aFloat302;
		this.aFloat310 = local20 * arg0.aFloat303 + local23 * arg0.aFloat311 + local35 * arg0.aFloat308 + arg0.aFloat310;
		this.aFloat312 = local20 * arg0.aFloat304 + local23 * arg0.aFloat309 + local35 * arg0.aFloat306 + arg0.aFloat312;
		this.aFloat313 = local20 * arg0.aFloat305 + local23 * arg0.aFloat307 + local35 * arg0.aFloat302 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cc", descriptor = "(Lclient!ov;)V")
	public void method29844(@OriginalArg(0) Class471 arg0) {
		@Pc(2) float local2 = this.aFloat303;
		@Pc(5) float local5 = this.aFloat304;
		@Pc(8) float local8 = this.aFloat311;
		@Pc(11) float local11 = this.aFloat309;
		@Pc(14) float local14 = this.aFloat308;
		@Pc(17) float local17 = this.aFloat306;
		@Pc(20) float local20 = this.aFloat310;
		@Pc(23) float local23 = this.aFloat312;
		@Pc(26) float local26 = this.aFloat305;
		@Pc(29) float local29 = this.aFloat307;
		@Pc(32) float local32 = this.aFloat302;
		@Pc(35) float local35 = this.aFloat313;
		this.aFloat303 = local2 * arg0.aFloat303 + local5 * arg0.aFloat311 + local26 * arg0.aFloat308;
		this.aFloat304 = local2 * arg0.aFloat304 + local5 * arg0.aFloat309 + local26 * arg0.aFloat306;
		this.aFloat305 = local2 * arg0.aFloat305 + local5 * arg0.aFloat307 + local26 * arg0.aFloat302;
		this.aFloat311 = local8 * arg0.aFloat303 + local11 * arg0.aFloat311 + local29 * arg0.aFloat308;
		this.aFloat309 = local8 * arg0.aFloat304 + local11 * arg0.aFloat309 + local29 * arg0.aFloat306;
		this.aFloat307 = local8 * arg0.aFloat305 + local11 * arg0.aFloat307 + local29 * arg0.aFloat302;
		this.aFloat308 = local14 * arg0.aFloat303 + local17 * arg0.aFloat311 + local32 * arg0.aFloat308;
		this.aFloat306 = local14 * arg0.aFloat304 + local17 * arg0.aFloat309 + local32 * arg0.aFloat306;
		this.aFloat302 = local14 * arg0.aFloat305 + local17 * arg0.aFloat307 + local32 * arg0.aFloat302;
		this.aFloat310 = local20 * arg0.aFloat303 + local23 * arg0.aFloat311 + local35 * arg0.aFloat308 + arg0.aFloat310;
		this.aFloat312 = local20 * arg0.aFloat304 + local23 * arg0.aFloat309 + local35 * arg0.aFloat306 + arg0.aFloat312;
		this.aFloat313 = local20 * arg0.aFloat305 + local23 * arg0.aFloat307 + local35 * arg0.aFloat302 + arg0.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cu", descriptor = "(Lclient!ov;Lclient!ov;)V")
	public void method29845(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		this.aFloat303 = arg0.aFloat303 * arg1.aFloat303 + arg0.aFloat304 * arg1.aFloat311 + arg0.aFloat305 * arg1.aFloat308;
		this.aFloat304 = arg0.aFloat303 * arg1.aFloat304 + arg0.aFloat304 * arg1.aFloat309 + arg0.aFloat305 * arg1.aFloat306;
		this.aFloat305 = arg0.aFloat303 * arg1.aFloat305 + arg0.aFloat304 * arg1.aFloat307 + arg0.aFloat305 * arg1.aFloat302;
		this.aFloat311 = arg0.aFloat311 * arg1.aFloat303 + arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat307 * arg1.aFloat308;
		this.aFloat309 = arg0.aFloat311 * arg1.aFloat304 + arg0.aFloat309 * arg1.aFloat309 + arg0.aFloat307 * arg1.aFloat306;
		this.aFloat307 = arg0.aFloat311 * arg1.aFloat305 + arg0.aFloat309 * arg1.aFloat307 + arg0.aFloat307 * arg1.aFloat302;
		this.aFloat308 = arg0.aFloat308 * arg1.aFloat303 + arg0.aFloat306 * arg1.aFloat311 + arg0.aFloat302 * arg1.aFloat308;
		this.aFloat306 = arg0.aFloat308 * arg1.aFloat304 + arg0.aFloat306 * arg1.aFloat309 + arg0.aFloat302 * arg1.aFloat306;
		this.aFloat302 = arg0.aFloat308 * arg1.aFloat305 + arg0.aFloat306 * arg1.aFloat307 + arg0.aFloat302 * arg1.aFloat302;
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat303 + arg0.aFloat312 * arg1.aFloat311 + arg0.aFloat313 * arg1.aFloat308 + arg1.aFloat310;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat304 + arg0.aFloat312 * arg1.aFloat309 + arg0.aFloat313 * arg1.aFloat306 + arg1.aFloat312;
		this.aFloat313 = arg0.aFloat310 * arg1.aFloat305 + arg0.aFloat312 * arg1.aFloat307 + arg0.aFloat313 * arg1.aFloat302 + arg1.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "ce", descriptor = "(Lclient!ov;Lclient!ov;)V")
	public void method29846(@OriginalArg(0) Class471 arg0, @OriginalArg(1) Class471 arg1) {
		this.aFloat303 = arg0.aFloat303 * arg1.aFloat303 + arg0.aFloat304 * arg1.aFloat311 + arg0.aFloat305 * arg1.aFloat308;
		this.aFloat304 = arg0.aFloat303 * arg1.aFloat304 + arg0.aFloat304 * arg1.aFloat309 + arg0.aFloat305 * arg1.aFloat306;
		this.aFloat305 = arg0.aFloat303 * arg1.aFloat305 + arg0.aFloat304 * arg1.aFloat307 + arg0.aFloat305 * arg1.aFloat302;
		this.aFloat311 = arg0.aFloat311 * arg1.aFloat303 + arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat307 * arg1.aFloat308;
		this.aFloat309 = arg0.aFloat311 * arg1.aFloat304 + arg0.aFloat309 * arg1.aFloat309 + arg0.aFloat307 * arg1.aFloat306;
		this.aFloat307 = arg0.aFloat311 * arg1.aFloat305 + arg0.aFloat309 * arg1.aFloat307 + arg0.aFloat307 * arg1.aFloat302;
		this.aFloat308 = arg0.aFloat308 * arg1.aFloat303 + arg0.aFloat306 * arg1.aFloat311 + arg0.aFloat302 * arg1.aFloat308;
		this.aFloat306 = arg0.aFloat308 * arg1.aFloat304 + arg0.aFloat306 * arg1.aFloat309 + arg0.aFloat302 * arg1.aFloat306;
		this.aFloat302 = arg0.aFloat308 * arg1.aFloat305 + arg0.aFloat306 * arg1.aFloat307 + arg0.aFloat302 * arg1.aFloat302;
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat303 + arg0.aFloat312 * arg1.aFloat311 + arg0.aFloat313 * arg1.aFloat308 + arg1.aFloat310;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat304 + arg0.aFloat312 * arg1.aFloat309 + arg0.aFloat313 * arg1.aFloat306 + arg1.aFloat312;
		this.aFloat313 = arg0.aFloat310 * arg1.aFloat305 + arg0.aFloat312 * arg1.aFloat307 + arg0.aFloat313 * arg1.aFloat302 + arg1.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cs", descriptor = "(FFF[F)V")
	public void method29847(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat303 * arg0 + this.aFloat311 * arg1 + this.aFloat308 * arg2 + this.aFloat310;
		arg3[1] = this.aFloat304 * arg0 + this.aFloat309 * arg1 + this.aFloat306 * arg2 + this.aFloat312;
		arg3[2] = this.aFloat305 * arg0 + this.aFloat307 * arg1 + this.aFloat302 * arg2 + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cj", descriptor = "(FFF[F)V")
	public void method29848(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat303 * arg0 + this.aFloat311 * arg1 + this.aFloat308 * arg2 + this.aFloat310;
		arg3[1] = this.aFloat304 * arg0 + this.aFloat309 * arg1 + this.aFloat306 * arg2 + this.aFloat312;
		arg3[2] = this.aFloat305 * arg0 + this.aFloat307 * arg1 + this.aFloat302 * arg2 + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "ck", descriptor = "(FFF[F)V")
	public void method29849(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat303 * arg0 + this.aFloat311 * arg1 + this.aFloat308 * arg2 + this.aFloat310;
		arg3[1] = this.aFloat304 * arg0 + this.aFloat309 * arg1 + this.aFloat306 * arg2 + this.aFloat312;
		arg3[2] = this.aFloat305 * arg0 + this.aFloat307 * arg1 + this.aFloat302 * arg2 + this.aFloat313;
	}

	@OriginalMember(owner = "client!ov", name = "cw", descriptor = "([F)[F")
	public float[] method29850(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat312;
		arg0[2] = this.aFloat313;
		return arg0;
	}

	@OriginalMember(owner = "client!ov", name = "cr", descriptor = "(FFF[F)V")
	public void method29851(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat310;
		@Pc(9) float local9 = arg1 - this.aFloat312;
		@Pc(14) float local14 = arg2 - this.aFloat313;
		arg3[0] = (float) (this.aFloat303 * local4 + this.aFloat304 * local9 + this.aFloat305 * local14);
		arg3[1] = (float) (this.aFloat311 * local4 + this.aFloat309 * local9 + this.aFloat307 * local14);
		arg3[2] = (float) (this.aFloat308 * local4 + this.aFloat306 * local9 + this.aFloat302 * local14);
	}

	@OriginalMember(owner = "client!ov", name = "bo", descriptor = "(FFFF)V")
	void method29852(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		@Pc(43) float local43 = 1.0F - (local19 + local31) * 2.0F;
		@Pc(49) float local49 = (local7 - local35) * 2.0F;
		@Pc(55) float local55 = (local11 + local27) * 2.0F;
		@Pc(61) float local61 = (local7 + local35) * 2.0F;
		@Pc(69) float local69 = 1.0F - (local3 + local31) * 2.0F;
		@Pc(75) float local75 = (local23 - local15) * 2.0F;
		@Pc(81) float local81 = (local11 - local27) * 2.0F;
		@Pc(87) float local87 = (local23 + local15) * 2.0F;
		@Pc(95) float local95 = 1.0F - (local3 + local19) * 2.0F;
		@Pc(98) float local98 = this.aFloat303;
		@Pc(101) float local101 = this.aFloat304;
		@Pc(104) float local104 = this.aFloat311;
		@Pc(107) float local107 = this.aFloat309;
		@Pc(110) float local110 = this.aFloat308;
		@Pc(113) float local113 = this.aFloat306;
		@Pc(116) float local116 = this.aFloat310;
		@Pc(119) float local119 = this.aFloat312;
		this.aFloat303 = local98 * local43 + local101 * local49 + this.aFloat305 * local55;
		this.aFloat304 = local98 * local61 + local101 * local69 + this.aFloat305 * local75;
		this.aFloat305 = local98 * local81 + local101 * local87 + this.aFloat305 * local95;
		this.aFloat311 = local104 * local43 + local107 * local49 + this.aFloat307 * local55;
		this.aFloat309 = local104 * local61 + local107 * local69 + this.aFloat307 * local75;
		this.aFloat307 = local104 * local81 + local107 * local87 + this.aFloat307 * local95;
		this.aFloat308 = local110 * local43 + local113 * local49 + this.aFloat302 * local55;
		this.aFloat306 = local110 * local61 + local113 * local69 + this.aFloat302 * local75;
		this.aFloat302 = local110 * local81 + local113 * local87 + this.aFloat302 * local95;
		this.aFloat310 = local116 * local43 + local119 * local49 + this.aFloat313 * local55;
		this.aFloat312 = local116 * local61 + local119 * local69 + this.aFloat313 * local75;
		this.aFloat313 = local116 * local81 + local119 * local87 + this.aFloat313 * local95;
	}

	@OriginalMember(owner = "client!ov", name = "bn", descriptor = "(Lclient!oq;)V")
	public void method29853(@OriginalArg(0) Class466 arg0) {
		this.method29810(arg0.aFloat301, arg0.aFloat299, arg0.aFloat300, arg0.aFloat298);
	}

	@OriginalMember(owner = "client!ov", name = "cp", descriptor = "([F)V")
	public void method29854(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat303 * local3 + this.aFloat304 * local7 + this.aFloat305 * local11;
		arg0[1] = this.aFloat311 * local3 + this.aFloat309 * local7 + this.aFloat307 * local11;
		arg0[2] = this.aFloat308 * local3 + this.aFloat306 * local7 + this.aFloat302 * local11;
	}

	@OriginalMember(owner = "client!ov", name = "cg", descriptor = "([F)V")
	public void method29855(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat303 * local3 + this.aFloat304 * local7 + this.aFloat305 * local11;
		arg0[1] = this.aFloat311 * local3 + this.aFloat309 * local7 + this.aFloat307 * local11;
		arg0[2] = this.aFloat308 * local3 + this.aFloat306 * local7 + this.aFloat302 * local11;
	}

	@OriginalMember(owner = "client!ov", name = "be", descriptor = "(FFFF)V")
	public void method29856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		@Pc(19) float local19 = local4 + arg0 * arg0 * (1.0F - local4);
		@Pc(31) float local31 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		@Pc(44) float local44 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		@Pc(57) float local57 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		@Pc(67) float local67 = local4 + arg1 * arg1 * (1.0F - local4);
		@Pc(79) float local79 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		@Pc(91) float local91 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		@Pc(104) float local104 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		@Pc(114) float local114 = local4 + arg2 * arg2 * (1.0F - local4);
		@Pc(117) float local117 = this.aFloat303;
		@Pc(120) float local120 = this.aFloat304;
		@Pc(123) float local123 = this.aFloat311;
		@Pc(126) float local126 = this.aFloat309;
		@Pc(129) float local129 = this.aFloat308;
		@Pc(132) float local132 = this.aFloat306;
		@Pc(135) float local135 = this.aFloat310;
		@Pc(138) float local138 = this.aFloat312;
		this.aFloat303 = local117 * local19 + local120 * local57 + this.aFloat305 * local91;
		this.aFloat304 = local117 * local31 + local120 * local67 + this.aFloat305 * local104;
		this.aFloat305 = local117 * local44 + local120 * local79 + this.aFloat305 * local114;
		this.aFloat311 = local123 * local19 + local126 * local57 + this.aFloat307 * local91;
		this.aFloat309 = local123 * local31 + local126 * local67 + this.aFloat307 * local104;
		this.aFloat307 = local123 * local44 + local126 * local79 + this.aFloat307 * local114;
		this.aFloat308 = local129 * local19 + local132 * local57 + this.aFloat302 * local91;
		this.aFloat306 = local129 * local31 + local132 * local67 + this.aFloat302 * local104;
		this.aFloat302 = local129 * local44 + local132 * local79 + this.aFloat302 * local114;
		this.aFloat310 = local135 * local19 + local138 * local57 + this.aFloat313 * local91;
		this.aFloat312 = local135 * local31 + local138 * local67 + this.aFloat313 * local104;
		this.aFloat313 = local135 * local44 + local138 * local79 + this.aFloat313 * local114;
	}

	@OriginalMember(owner = "client!ov", name = "bd", descriptor = "(FFF)V")
	public void method29857(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat306 = 0.0F;
		this.aFloat308 = 0.0F;
		this.aFloat307 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat305 = 0.0F;
		this.aFloat304 = 0.0F;
		this.aFloat302 = 1.0F;
		this.aFloat309 = 1.0F;
		this.aFloat303 = 1.0F;
		this.aFloat310 = arg0;
		this.aFloat312 = arg1;
		this.aFloat313 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "cl", descriptor = "([F)[F")
	public float[] method29858(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat303;
		arg0[1] = this.aFloat304;
		arg0[2] = this.aFloat305;
		arg0[3] = this.aFloat311;
		arg0[4] = this.aFloat309;
		arg0[5] = this.aFloat307;
		arg0[6] = this.aFloat308;
		arg0[7] = this.aFloat306;
		arg0[8] = this.aFloat302;
		return arg0;
	}
}
