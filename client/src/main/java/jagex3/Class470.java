package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class470 {

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "Lclient!ou;")
	public static final Class470 aClass470_54 = new Class470();

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "F")
	float aFloat309;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "F")
	float aFloat310;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "F")
	float aFloat311;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "F")
	float aFloat312;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "F")
	float aFloat313;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "F")
	float aFloat314;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "F")
	float aFloat315;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "F")
	float aFloat316;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "F")
	float aFloat317;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "F")
	float aFloat318;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "F")
	float aFloat319;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "F")
	float aFloat320;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ou;)V")
	public Class470(@OriginalArg(0) Class470 arg0) {
		this.method29545(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class470() {
		this.method29629();
	}

	@OriginalMember(owner = "client!ou", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method29543() {
		return this.aFloat310 + "," + this.aFloat313 + "," + this.aFloat309 + "," + this.aFloat318 + "\n" + this.aFloat311 + "," + this.aFloat320 + "," + this.aFloat316 + "," + this.aFloat319 + "\n" + this.aFloat312 + "," + this.aFloat315 + "," + this.aFloat317 + "," + this.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "be", descriptor = "(Lclient!ox;)V")
	void method29544(@OriginalArg(0) Class472 arg0) {
		this.method29601(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(Lclient!ou;)V")
	public void method29545(@OriginalArg(0) Class470 arg0) {
		this.aFloat310 = arg0.aFloat310;
		this.aFloat313 = arg0.aFloat313;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat311 = arg0.aFloat311;
		this.aFloat320 = arg0.aFloat320;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat319 = arg0.aFloat319;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat317 = arg0.aFloat317;
		this.aFloat314 = arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "(Lclient!oe;)V")
	public void method29546(@OriginalArg(0) Class458 arg0) {
		this.method29547(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "(Lclient!oe;)V")
	public void method29547(@OriginalArg(0) Class458 arg0) {
		this.method29564(arg0.aClass472_62);
		this.method29561(arg0.aClass471_5);
		this.method29567(arg0.aClass472_61);
	}

	@OriginalMember(owner = "client!ou", name = "ae", descriptor = "(FFF[F)V")
	public void method29548(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat310 * arg0 + this.aFloat313 * arg1 + this.aFloat309 * arg2 + this.aFloat318;
		arg3[1] = this.aFloat311 * arg0 + this.aFloat320 * arg1 + this.aFloat316 * arg2 + this.aFloat319;
		arg3[2] = this.aFloat312 * arg0 + this.aFloat315 * arg1 + this.aFloat317 * arg2 + this.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "(DDDDDDFFF)V")
	public void method29549(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat310 = local22 * local55;
		this.aFloat313 = local30 * local55;
		this.aFloat309 = local38 * local55;
		this.aFloat312 = local4 * local72;
		this.aFloat315 = local9 * local72;
		this.aFloat317 = local14 * local72;
		this.aFloat311 = this.aFloat315 * this.aFloat309 - this.aFloat317 * this.aFloat313;
		this.aFloat320 = this.aFloat317 * this.aFloat310 - this.aFloat312 * this.aFloat309;
		this.aFloat316 = this.aFloat312 * this.aFloat313 - this.aFloat315 * this.aFloat310;
		this.aFloat318 = -((float) (arg0 * (double) this.aFloat310 + arg1 * (double) this.aFloat313 + arg2 * (double) this.aFloat309));
		this.aFloat319 = -((float) (arg0 * (double) this.aFloat311 + arg1 * (double) this.aFloat320 + arg2 * (double) this.aFloat316));
		this.aFloat314 = -((float) (arg0 * (double) this.aFloat312 + arg1 * (double) this.aFloat315 + arg2 * (double) this.aFloat317));
	}

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "(IIIFFF)V")
	public void method29550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat316 = 0.0F;
			this.aFloat309 = 0.0F;
			this.aFloat315 = 0.0F;
			this.aFloat313 = 0.0F;
			this.aFloat312 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat310 = arg1 * 2;
			this.aFloat320 = arg2 * 2;
			this.aFloat317 = 1.0F;
			this.aFloat318 = arg3 - (float) arg1;
			this.aFloat319 = arg4 - (float) arg2;
			this.aFloat314 = arg5;
			return;
		}
		@Pc(7) float local7 = Class468.aFloatArray112[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class468.aFloatArray113[arg0 & 0x3FFF];
		this.aFloat317 = 1.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = local7 * 2.0F * (float) arg1;
		this.aFloat320 = local7 * 2.0F * (float) arg2;
		this.aFloat311 = local13 * 2.0F * (float) arg1;
		this.aFloat313 = -2.0F * local13 * (float) arg2;
		this.aFloat318 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat319 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat314 = arg5;
	}

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "(FFFFFFFFF)V")
	public void method29551(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat310 = arg0;
		this.aFloat313 = arg3;
		this.aFloat309 = arg6;
		this.aFloat318 = 0.0F;
		this.aFloat311 = arg1;
		this.aFloat320 = arg4;
		this.aFloat316 = arg7;
		this.aFloat319 = 0.0F;
		this.aFloat312 = arg2;
		this.aFloat315 = arg5;
		this.aFloat317 = arg8;
		this.aFloat314 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "(Lclient!ou;)V")
	public void method29552(@OriginalArg(0) Class470 arg0) {
		if (arg0 == this) {
			this.method29553();
			return;
		}
		this.aFloat310 = arg0.aFloat310;
		this.aFloat313 = arg0.aFloat311;
		this.aFloat309 = arg0.aFloat312;
		this.aFloat311 = arg0.aFloat313;
		this.aFloat320 = arg0.aFloat320;
		this.aFloat316 = arg0.aFloat315;
		this.aFloat312 = arg0.aFloat309;
		this.aFloat315 = arg0.aFloat316;
		this.aFloat317 = arg0.aFloat317;
		this.aFloat318 = -(arg0.aFloat318 * this.aFloat310 + arg0.aFloat319 * this.aFloat313 + arg0.aFloat314 * this.aFloat309);
		this.aFloat319 = -(arg0.aFloat318 * this.aFloat311 + arg0.aFloat319 * this.aFloat320 + arg0.aFloat314 * this.aFloat316);
		this.aFloat314 = -(arg0.aFloat318 * this.aFloat312 + arg0.aFloat319 * this.aFloat315 + arg0.aFloat314 * this.aFloat317);
	}

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "()V")
	public void method29553() {
		@Pc(2) float local2 = this.aFloat318;
		@Pc(5) float local5 = this.aFloat319;
		@Pc(8) float local8 = this.aFloat313;
		this.aFloat313 = this.aFloat311;
		this.aFloat311 = local8;
		@Pc(18) float local18 = this.aFloat309;
		this.aFloat309 = this.aFloat312;
		this.aFloat312 = local18;
		@Pc(28) float local28 = this.aFloat316;
		this.aFloat316 = this.aFloat315;
		this.aFloat315 = local28;
		this.aFloat318 = -(local2 * this.aFloat310 + local5 * this.aFloat313 + this.aFloat314 * this.aFloat309);
		this.aFloat319 = -(local2 * this.aFloat311 + local5 * this.aFloat320 + this.aFloat314 * this.aFloat316);
		this.aFloat314 = -(local2 * this.aFloat312 + local5 * this.aFloat315 + this.aFloat314 * this.aFloat317);
	}

	@OriginalMember(owner = "client!ou", name = "bz", descriptor = "(Lclient!ox;)V")
	public void method29554(@OriginalArg(0) Class472 arg0) {
		this.method29568(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(Lclient!ov;)V")
	public void method29555(@OriginalArg(0) Class471 arg0) {
		this.method29575(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "ay", descriptor = "(FFFF)V")
	public void method29556(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		this.aFloat310 = local4 + arg0 * arg0 * (1.0F - local4);
		this.aFloat311 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		this.aFloat312 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		this.aFloat313 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		this.aFloat320 = local4 + arg1 * arg1 * (1.0F - local4);
		this.aFloat315 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		this.aFloat309 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		this.aFloat316 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		this.aFloat317 = local4 + arg2 * arg2 * (1.0F - local4);
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "(F)V")
	void method29557(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat311;
		@Pc(15) float local15 = this.aFloat320;
		@Pc(18) float local18 = this.aFloat316;
		@Pc(21) float local21 = this.aFloat319;
		this.aFloat311 = local12 * local4 - this.aFloat312 * local9;
		this.aFloat312 = local12 * local9 + this.aFloat312 * local4;
		this.aFloat320 = local15 * local4 - this.aFloat315 * local9;
		this.aFloat315 = local15 * local9 + this.aFloat315 * local4;
		this.aFloat316 = local18 * local4 - this.aFloat317 * local9;
		this.aFloat317 = local18 * local9 + this.aFloat317 * local4;
		this.aFloat319 = local21 * local4 - this.aFloat314 * local9;
		this.aFloat314 = local21 * local9 + this.aFloat314 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "(F)V")
	void method29558(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 + this.aFloat312 * local9;
		this.aFloat312 = this.aFloat312 * local4 - local12 * local9;
		this.aFloat313 = local15 * local4 + this.aFloat315 * local9;
		this.aFloat315 = this.aFloat315 * local4 - local15 * local9;
		this.aFloat309 = local18 * local4 + this.aFloat317 * local9;
		this.aFloat317 = this.aFloat317 * local4 - local18 * local9;
		this.aFloat318 = local21 * local4 + this.aFloat314 * local9;
		this.aFloat314 = this.aFloat314 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "(F)V")
	void method29559(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 - this.aFloat311 * local9;
		this.aFloat311 = local12 * local9 + this.aFloat311 * local4;
		this.aFloat313 = local15 * local4 - this.aFloat320 * local9;
		this.aFloat320 = local15 * local9 + this.aFloat320 * local4;
		this.aFloat309 = local18 * local4 - this.aFloat316 * local9;
		this.aFloat316 = local18 * local9 + this.aFloat316 * local4;
		this.aFloat318 = local21 * local4 - this.aFloat319 * local9;
		this.aFloat319 = local21 * local9 + this.aFloat319 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "(FFFF)V")
	public void method29560(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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
		@Pc(117) float local117 = this.aFloat310;
		@Pc(120) float local120 = this.aFloat311;
		@Pc(123) float local123 = this.aFloat313;
		@Pc(126) float local126 = this.aFloat320;
		@Pc(129) float local129 = this.aFloat309;
		@Pc(132) float local132 = this.aFloat316;
		@Pc(135) float local135 = this.aFloat318;
		@Pc(138) float local138 = this.aFloat319;
		this.aFloat310 = local117 * local19 + local120 * local57 + this.aFloat312 * local91;
		this.aFloat311 = local117 * local31 + local120 * local67 + this.aFloat312 * local104;
		this.aFloat312 = local117 * local44 + local120 * local79 + this.aFloat312 * local114;
		this.aFloat313 = local123 * local19 + local126 * local57 + this.aFloat315 * local91;
		this.aFloat320 = local123 * local31 + local126 * local67 + this.aFloat315 * local104;
		this.aFloat315 = local123 * local44 + local126 * local79 + this.aFloat315 * local114;
		this.aFloat309 = local129 * local19 + local132 * local57 + this.aFloat317 * local91;
		this.aFloat316 = local129 * local31 + local132 * local67 + this.aFloat317 * local104;
		this.aFloat317 = local129 * local44 + local132 * local79 + this.aFloat317 * local114;
		this.aFloat318 = local135 * local19 + local138 * local57 + this.aFloat314 * local91;
		this.aFloat319 = local135 * local31 + local138 * local67 + this.aFloat314 * local104;
		this.aFloat314 = local135 * local44 + local138 * local79 + this.aFloat314 * local114;
	}

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "(Lclient!ov;)V")
	void method29561(@OriginalArg(0) Class471 arg0) {
		this.method29562(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "(FFFF)V")
	void method29562(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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
		@Pc(98) float local98 = this.aFloat310;
		@Pc(101) float local101 = this.aFloat311;
		@Pc(104) float local104 = this.aFloat313;
		@Pc(107) float local107 = this.aFloat320;
		@Pc(110) float local110 = this.aFloat309;
		@Pc(113) float local113 = this.aFloat316;
		@Pc(116) float local116 = this.aFloat318;
		@Pc(119) float local119 = this.aFloat319;
		this.aFloat310 = local98 * local43 + local101 * local49 + this.aFloat312 * local55;
		this.aFloat311 = local98 * local61 + local101 * local69 + this.aFloat312 * local75;
		this.aFloat312 = local98 * local81 + local101 * local87 + this.aFloat312 * local95;
		this.aFloat313 = local104 * local43 + local107 * local49 + this.aFloat315 * local55;
		this.aFloat320 = local104 * local61 + local107 * local69 + this.aFloat315 * local75;
		this.aFloat315 = local104 * local81 + local107 * local87 + this.aFloat315 * local95;
		this.aFloat309 = local110 * local43 + local113 * local49 + this.aFloat317 * local55;
		this.aFloat316 = local110 * local61 + local113 * local69 + this.aFloat317 * local75;
		this.aFloat317 = local110 * local81 + local113 * local87 + this.aFloat317 * local95;
		this.aFloat318 = local116 * local43 + local119 * local49 + this.aFloat314 * local55;
		this.aFloat319 = local116 * local61 + local119 * local69 + this.aFloat314 * local75;
		this.aFloat314 = local116 * local81 + local119 * local87 + this.aFloat314 * local95;
	}

	@OriginalMember(owner = "client!ou", name = "ci", descriptor = "([F)V")
	public void method29563(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat318;
		@Pc(13) float local13 = arg0[1] - this.aFloat319;
		@Pc(20) float local20 = arg0[2] - this.aFloat314;
		arg0[0] = (float) (this.aFloat310 * local6 + this.aFloat311 * local13 + this.aFloat312 * local20);
		arg0[1] = (float) (this.aFloat313 * local6 + this.aFloat320 * local13 + this.aFloat315 * local20);
		arg0[2] = (float) (this.aFloat309 * local6 + this.aFloat316 * local13 + this.aFloat317 * local20);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Lclient!ox;)V")
	void method29564(@OriginalArg(0) Class472 arg0) {
		this.method29601(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "(FFF)V")
	public void method29565(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 *= arg0;
		this.aFloat313 *= arg0;
		this.aFloat309 *= arg0;
		this.aFloat318 *= arg0;
		this.aFloat311 *= arg1;
		this.aFloat320 *= arg1;
		this.aFloat316 *= arg1;
		this.aFloat319 *= arg1;
		this.aFloat312 *= arg2;
		this.aFloat315 *= arg2;
		this.aFloat317 *= arg2;
		this.aFloat314 *= arg2;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(FFF)V")
	public void method29566(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat320 = 1.0F;
		this.aFloat310 = 1.0F;
		this.aFloat318 = arg0;
		this.aFloat319 = arg1;
		this.aFloat314 = arg2;
	}

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "(Lclient!ox;)V")
	public void method29567(@OriginalArg(0) Class472 arg0) {
		this.method29568(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "(FFF)V")
	public void method29568(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat318 += arg0;
		this.aFloat319 += arg1;
		this.aFloat314 += arg2;
	}

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "(Lclient!ou;)V")
	public void method29569(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat311;
		@Pc(8) float local8 = this.aFloat313;
		@Pc(11) float local11 = this.aFloat320;
		@Pc(14) float local14 = this.aFloat309;
		@Pc(17) float local17 = this.aFloat316;
		@Pc(20) float local20 = this.aFloat318;
		@Pc(23) float local23 = this.aFloat319;
		@Pc(26) float local26 = this.aFloat312;
		@Pc(29) float local29 = this.aFloat315;
		@Pc(32) float local32 = this.aFloat317;
		@Pc(35) float local35 = this.aFloat314;
		this.aFloat310 = local2 * arg0.aFloat310 + local5 * arg0.aFloat313 + local26 * arg0.aFloat309;
		this.aFloat311 = local2 * arg0.aFloat311 + local5 * arg0.aFloat320 + local26 * arg0.aFloat316;
		this.aFloat312 = local2 * arg0.aFloat312 + local5 * arg0.aFloat315 + local26 * arg0.aFloat317;
		this.aFloat313 = local8 * arg0.aFloat310 + local11 * arg0.aFloat313 + local29 * arg0.aFloat309;
		this.aFloat320 = local8 * arg0.aFloat311 + local11 * arg0.aFloat320 + local29 * arg0.aFloat316;
		this.aFloat315 = local8 * arg0.aFloat312 + local11 * arg0.aFloat315 + local29 * arg0.aFloat317;
		this.aFloat309 = local14 * arg0.aFloat310 + local17 * arg0.aFloat313 + local32 * arg0.aFloat309;
		this.aFloat316 = local14 * arg0.aFloat311 + local17 * arg0.aFloat320 + local32 * arg0.aFloat316;
		this.aFloat317 = local14 * arg0.aFloat312 + local17 * arg0.aFloat315 + local32 * arg0.aFloat317;
		this.aFloat318 = local20 * arg0.aFloat310 + local23 * arg0.aFloat313 + local35 * arg0.aFloat309 + arg0.aFloat318;
		this.aFloat319 = local20 * arg0.aFloat311 + local23 * arg0.aFloat320 + local35 * arg0.aFloat316 + arg0.aFloat319;
		this.aFloat314 = local20 * arg0.aFloat312 + local23 * arg0.aFloat315 + local35 * arg0.aFloat317 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "(Lclient!ou;Lclient!ou;)V")
	public void method29570(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class470 arg1) {
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat310 + arg0.aFloat311 * arg1.aFloat313 + arg0.aFloat312 * arg1.aFloat309;
		this.aFloat311 = arg0.aFloat310 * arg1.aFloat311 + arg0.aFloat311 * arg1.aFloat320 + arg0.aFloat312 * arg1.aFloat316;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat312 + arg0.aFloat311 * arg1.aFloat315 + arg0.aFloat312 * arg1.aFloat317;
		this.aFloat313 = arg0.aFloat313 * arg1.aFloat310 + arg0.aFloat320 * arg1.aFloat313 + arg0.aFloat315 * arg1.aFloat309;
		this.aFloat320 = arg0.aFloat313 * arg1.aFloat311 + arg0.aFloat320 * arg1.aFloat320 + arg0.aFloat315 * arg1.aFloat316;
		this.aFloat315 = arg0.aFloat313 * arg1.aFloat312 + arg0.aFloat320 * arg1.aFloat315 + arg0.aFloat315 * arg1.aFloat317;
		this.aFloat309 = arg0.aFloat309 * arg1.aFloat310 + arg0.aFloat316 * arg1.aFloat313 + arg0.aFloat317 * arg1.aFloat309;
		this.aFloat316 = arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat316 * arg1.aFloat320 + arg0.aFloat317 * arg1.aFloat316;
		this.aFloat317 = arg0.aFloat309 * arg1.aFloat312 + arg0.aFloat316 * arg1.aFloat315 + arg0.aFloat317 * arg1.aFloat317;
		this.aFloat318 = arg0.aFloat318 * arg1.aFloat310 + arg0.aFloat319 * arg1.aFloat313 + arg0.aFloat314 * arg1.aFloat309 + arg1.aFloat318;
		this.aFloat319 = arg0.aFloat318 * arg1.aFloat311 + arg0.aFloat319 * arg1.aFloat320 + arg0.aFloat314 * arg1.aFloat316 + arg1.aFloat319;
		this.aFloat314 = arg0.aFloat318 * arg1.aFloat312 + arg0.aFloat319 * arg1.aFloat315 + arg0.aFloat314 * arg1.aFloat317 + arg1.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "ac", descriptor = "([F)[F")
	public float[] method29571(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat318;
		arg0[1] = this.aFloat319;
		arg0[2] = this.aFloat314;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "ag", descriptor = "(FFF[F)V")
	public void method29572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(4) float local4 = arg0 - this.aFloat318;
		@Pc(9) float local9 = arg1 - this.aFloat319;
		@Pc(14) float local14 = arg2 - this.aFloat314;
		arg3[0] = (float) (this.aFloat310 * local4 + this.aFloat311 * local9 + this.aFloat312 * local14);
		arg3[1] = (float) (this.aFloat313 * local4 + this.aFloat320 * local9 + this.aFloat315 * local14);
		arg3[2] = (float) (this.aFloat309 * local4 + this.aFloat316 * local9 + this.aFloat317 * local14);
	}

	@OriginalMember(owner = "client!ou", name = "ah", descriptor = "([F)V")
	public void method29573(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat318;
		@Pc(13) float local13 = arg0[1] - this.aFloat319;
		@Pc(20) float local20 = arg0[2] - this.aFloat314;
		arg0[0] = (float) (this.aFloat310 * local6 + this.aFloat311 * local13 + this.aFloat312 * local20);
		arg0[1] = (float) (this.aFloat313 * local6 + this.aFloat320 * local13 + this.aFloat315 * local20);
		arg0[2] = (float) (this.aFloat309 * local6 + this.aFloat316 * local13 + this.aFloat317 * local20);
	}

	@OriginalMember(owner = "client!ou", name = "al", descriptor = "([F)V")
	public void method29574(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat310 * local3 + this.aFloat311 * local7 + this.aFloat312 * local11;
		arg0[1] = this.aFloat313 * local3 + this.aFloat320 * local7 + this.aFloat315 * local11;
		arg0[2] = this.aFloat309 * local3 + this.aFloat316 * local7 + this.aFloat317 * local11;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(FFFF)V")
	void method29575(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat310 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat313 = (local7 - local35) * 2.0F;
		this.aFloat309 = (local11 + local27) * 2.0F;
		this.aFloat311 = (local7 + local35) * 2.0F;
		this.aFloat320 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat316 = (local23 - local15) * 2.0F;
		this.aFloat312 = (local11 - local27) * 2.0F;
		this.aFloat315 = (local23 + local15) * 2.0F;
		this.aFloat317 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "cg", descriptor = "(Lclient!ou;Lclient!ou;)V")
	public void method29576(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class470 arg1) {
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat310 + arg0.aFloat311 * arg1.aFloat313 + arg0.aFloat312 * arg1.aFloat309;
		this.aFloat311 = arg0.aFloat310 * arg1.aFloat311 + arg0.aFloat311 * arg1.aFloat320 + arg0.aFloat312 * arg1.aFloat316;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat312 + arg0.aFloat311 * arg1.aFloat315 + arg0.aFloat312 * arg1.aFloat317;
		this.aFloat313 = arg0.aFloat313 * arg1.aFloat310 + arg0.aFloat320 * arg1.aFloat313 + arg0.aFloat315 * arg1.aFloat309;
		this.aFloat320 = arg0.aFloat313 * arg1.aFloat311 + arg0.aFloat320 * arg1.aFloat320 + arg0.aFloat315 * arg1.aFloat316;
		this.aFloat315 = arg0.aFloat313 * arg1.aFloat312 + arg0.aFloat320 * arg1.aFloat315 + arg0.aFloat315 * arg1.aFloat317;
		this.aFloat309 = arg0.aFloat309 * arg1.aFloat310 + arg0.aFloat316 * arg1.aFloat313 + arg0.aFloat317 * arg1.aFloat309;
		this.aFloat316 = arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat316 * arg1.aFloat320 + arg0.aFloat317 * arg1.aFloat316;
		this.aFloat317 = arg0.aFloat309 * arg1.aFloat312 + arg0.aFloat316 * arg1.aFloat315 + arg0.aFloat317 * arg1.aFloat317;
		this.aFloat318 = arg0.aFloat318 * arg1.aFloat310 + arg0.aFloat319 * arg1.aFloat313 + arg0.aFloat314 * arg1.aFloat309 + arg1.aFloat318;
		this.aFloat319 = arg0.aFloat318 * arg1.aFloat311 + arg0.aFloat319 * arg1.aFloat320 + arg0.aFloat314 * arg1.aFloat316 + arg1.aFloat319;
		this.aFloat314 = arg0.aFloat318 * arg1.aFloat312 + arg0.aFloat319 * arg1.aFloat315 + arg0.aFloat314 * arg1.aFloat317 + arg1.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "at", descriptor = "(Lclient!oe;)V")
	public void method29577(@OriginalArg(0) Class458 arg0) {
		this.method29547(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "aw", descriptor = "(Lclient!oe;)V")
	public void method29578(@OriginalArg(0) Class458 arg0) {
		this.method29547(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "cp", descriptor = "([F)V")
	public void method29579(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat310 * local3 + this.aFloat311 * local7 + this.aFloat312 * local11;
		arg0[1] = this.aFloat313 * local3 + this.aFloat320 * local7 + this.aFloat315 * local11;
		arg0[2] = this.aFloat309 * local3 + this.aFloat316 * local7 + this.aFloat317 * local11;
	}

	@OriginalMember(owner = "client!ou", name = "bf", descriptor = "(F)V")
	void method29580(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 + this.aFloat312 * local9;
		this.aFloat312 = this.aFloat312 * local4 - local12 * local9;
		this.aFloat313 = local15 * local4 + this.aFloat315 * local9;
		this.aFloat315 = this.aFloat315 * local4 - local15 * local9;
		this.aFloat309 = local18 * local4 + this.aFloat317 * local9;
		this.aFloat317 = this.aFloat317 * local4 - local18 * local9;
		this.aFloat318 = local21 * local4 + this.aFloat314 * local9;
		this.aFloat314 = this.aFloat314 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ou", name = "ad", descriptor = "(Lclient!oe;)V")
	public void method29581(@OriginalArg(0) Class458 arg0) {
		this.method29564(arg0.aClass472_62);
		this.method29561(arg0.aClass471_5);
		this.method29567(arg0.aClass472_61);
	}

	@OriginalMember(owner = "client!ou", name = "am", descriptor = "()V")
	public void method29582() {
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat320 = 1.0F;
		this.aFloat310 = 1.0F;
	}

	@OriginalMember(owner = "client!ou", name = "bh", descriptor = "(F)V")
	void method29583(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 - this.aFloat311 * local9;
		this.aFloat311 = local12 * local9 + this.aFloat311 * local4;
		this.aFloat313 = local15 * local4 - this.aFloat320 * local9;
		this.aFloat320 = local15 * local9 + this.aFloat320 * local4;
		this.aFloat309 = local18 * local4 - this.aFloat316 * local9;
		this.aFloat316 = local18 * local9 + this.aFloat316 * local4;
		this.aFloat318 = local21 * local4 - this.aFloat319 * local9;
		this.aFloat319 = local21 * local9 + this.aFloat319 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "cv", descriptor = "([F)V")
	public void method29584(@OriginalArg(0) float[] arg0) {
		@Pc(3) float local3 = arg0[0];
		@Pc(7) float local7 = arg0[1];
		@Pc(11) float local11 = arg0[2];
		arg0[0] = this.aFloat310 * local3 + this.aFloat311 * local7 + this.aFloat312 * local11;
		arg0[1] = this.aFloat313 * local3 + this.aFloat320 * local7 + this.aFloat315 * local11;
		arg0[2] = this.aFloat309 * local3 + this.aFloat316 * local7 + this.aFloat317 * local11;
	}

	@OriginalMember(owner = "client!ou", name = "ap", descriptor = "(IIIFFF)V")
	public void method29585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat316 = 0.0F;
			this.aFloat309 = 0.0F;
			this.aFloat315 = 0.0F;
			this.aFloat313 = 0.0F;
			this.aFloat312 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat310 = arg1 * 2;
			this.aFloat320 = arg2 * 2;
			this.aFloat317 = 1.0F;
			this.aFloat318 = arg3 - (float) arg1;
			this.aFloat319 = arg4 - (float) arg2;
			this.aFloat314 = arg5;
			return;
		}
		@Pc(7) float local7 = Class468.aFloatArray112[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class468.aFloatArray113[arg0 & 0x3FFF];
		this.aFloat317 = 1.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = local7 * 2.0F * (float) arg1;
		this.aFloat320 = local7 * 2.0F * (float) arg2;
		this.aFloat311 = local13 * 2.0F * (float) arg1;
		this.aFloat313 = -2.0F * local13 * (float) arg2;
		this.aFloat318 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat319 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat314 = arg5;
	}

	@OriginalMember(owner = "client!ou", name = "ak", descriptor = "(F)V")
	void method29586(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat311;
		@Pc(15) float local15 = this.aFloat320;
		@Pc(18) float local18 = this.aFloat316;
		@Pc(21) float local21 = this.aFloat319;
		this.aFloat311 = local12 * local4 - this.aFloat312 * local9;
		this.aFloat312 = local12 * local9 + this.aFloat312 * local4;
		this.aFloat320 = local15 * local4 - this.aFloat315 * local9;
		this.aFloat315 = local15 * local9 + this.aFloat315 * local4;
		this.aFloat316 = local18 * local4 - this.aFloat317 * local9;
		this.aFloat317 = local18 * local9 + this.aFloat317 * local4;
		this.aFloat319 = local21 * local4 - this.aFloat314 * local9;
		this.aFloat314 = local21 * local9 + this.aFloat314 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "ax", descriptor = "(FFFFFFFFF)V")
	public void method29587(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat310 = arg0;
		this.aFloat313 = arg3;
		this.aFloat309 = arg6;
		this.aFloat318 = 0.0F;
		this.aFloat311 = arg1;
		this.aFloat320 = arg4;
		this.aFloat316 = arg7;
		this.aFloat319 = 0.0F;
		this.aFloat312 = arg2;
		this.aFloat315 = arg5;
		this.aFloat317 = arg8;
		this.aFloat314 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "av", descriptor = "(Lclient!ou;)V")
	public void method29588(@OriginalArg(0) Class470 arg0) {
		if (arg0 == this) {
			this.method29553();
			return;
		}
		this.aFloat310 = arg0.aFloat310;
		this.aFloat313 = arg0.aFloat311;
		this.aFloat309 = arg0.aFloat312;
		this.aFloat311 = arg0.aFloat313;
		this.aFloat320 = arg0.aFloat320;
		this.aFloat316 = arg0.aFloat315;
		this.aFloat312 = arg0.aFloat309;
		this.aFloat315 = arg0.aFloat316;
		this.aFloat317 = arg0.aFloat317;
		this.aFloat318 = -(arg0.aFloat318 * this.aFloat310 + arg0.aFloat319 * this.aFloat313 + arg0.aFloat314 * this.aFloat309);
		this.aFloat319 = -(arg0.aFloat318 * this.aFloat311 + arg0.aFloat319 * this.aFloat320 + arg0.aFloat314 * this.aFloat316);
		this.aFloat314 = -(arg0.aFloat318 * this.aFloat312 + arg0.aFloat319 * this.aFloat315 + arg0.aFloat314 * this.aFloat317);
	}

	@OriginalMember(owner = "client!ou", name = "ar", descriptor = "(DDDDDDFFF)V")
	public void method29589(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) float local4 = (float) (arg3 - arg0);
		@Pc(9) float local9 = (float) (arg4 - arg1);
		@Pc(14) float local14 = (float) (arg5 - arg2);
		@Pc(22) float local22 = arg7 * local14 - arg8 * local9;
		@Pc(30) float local30 = arg8 * local4 - arg6 * local14;
		@Pc(38) float local38 = arg6 * local9 - arg7 * local4;
		@Pc(55) float local55 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local30 * local30 + local38 * local38)));
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local4 * local4 + local9 * local9 + local14 * local14)));
		this.aFloat310 = local22 * local55;
		this.aFloat313 = local30 * local55;
		this.aFloat309 = local38 * local55;
		this.aFloat312 = local4 * local72;
		this.aFloat315 = local9 * local72;
		this.aFloat317 = local14 * local72;
		this.aFloat311 = this.aFloat315 * this.aFloat309 - this.aFloat317 * this.aFloat313;
		this.aFloat320 = this.aFloat317 * this.aFloat310 - this.aFloat312 * this.aFloat309;
		this.aFloat316 = this.aFloat312 * this.aFloat313 - this.aFloat315 * this.aFloat310;
		this.aFloat318 = -((float) (arg0 * (double) this.aFloat310 + arg1 * (double) this.aFloat313 + arg2 * (double) this.aFloat309));
		this.aFloat319 = -((float) (arg0 * (double) this.aFloat311 + arg1 * (double) this.aFloat320 + arg2 * (double) this.aFloat316));
		this.aFloat314 = -((float) (arg0 * (double) this.aFloat312 + arg1 * (double) this.aFloat315 + arg2 * (double) this.aFloat317));
	}

	@OriginalMember(owner = "client!ou", name = "aj", descriptor = "(FFFF)V")
	public void method29590(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		this.aFloat310 = local4 + arg0 * arg0 * (1.0F - local4);
		this.aFloat311 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		this.aFloat312 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		this.aFloat313 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		this.aFloat320 = local4 + arg1 * arg1 * (1.0F - local4);
		this.aFloat315 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		this.aFloat309 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		this.aFloat316 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		this.aFloat317 = local4 + arg2 * arg2 * (1.0F - local4);
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "bv", descriptor = "(FFF)V")
	public void method29591(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat318 += arg0;
		this.aFloat319 += arg1;
		this.aFloat314 += arg2;
	}

	@OriginalMember(owner = "client!ou", name = "ab", descriptor = "(Lclient!ov;)V")
	public void method29592(@OriginalArg(0) Class471 arg0) {
		this.method29575(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "as", descriptor = "(Lclient!oe;)V")
	public void method29593(@OriginalArg(0) Class458 arg0) {
		this.method29547(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "ao", descriptor = "()V")
	public void method29594() {
		@Pc(2) float local2 = this.aFloat318;
		@Pc(5) float local5 = this.aFloat319;
		@Pc(8) float local8 = this.aFloat313;
		this.aFloat313 = this.aFloat311;
		this.aFloat311 = local8;
		@Pc(18) float local18 = this.aFloat309;
		this.aFloat309 = this.aFloat312;
		this.aFloat312 = local18;
		@Pc(28) float local28 = this.aFloat316;
		this.aFloat316 = this.aFloat315;
		this.aFloat315 = local28;
		this.aFloat318 = -(local2 * this.aFloat310 + local5 * this.aFloat313 + this.aFloat314 * this.aFloat309);
		this.aFloat319 = -(local2 * this.aFloat311 + local5 * this.aFloat320 + this.aFloat314 * this.aFloat316);
		this.aFloat314 = -(local2 * this.aFloat312 + local5 * this.aFloat315 + this.aFloat314 * this.aFloat317);
	}

	@OriginalMember(owner = "client!ou", name = "cw", descriptor = "([F)[F")
	public float[] method29595(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat311;
		arg0[2] = this.aFloat312;
		arg0[3] = this.aFloat313;
		arg0[4] = this.aFloat320;
		arg0[5] = this.aFloat315;
		arg0[6] = this.aFloat309;
		arg0[7] = this.aFloat316;
		arg0[8] = this.aFloat317;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "af", descriptor = "(F)V")
	void method29596(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat311;
		@Pc(15) float local15 = this.aFloat320;
		@Pc(18) float local18 = this.aFloat316;
		@Pc(21) float local21 = this.aFloat319;
		this.aFloat311 = local12 * local4 - this.aFloat312 * local9;
		this.aFloat312 = local12 * local9 + this.aFloat312 * local4;
		this.aFloat320 = local15 * local4 - this.aFloat315 * local9;
		this.aFloat315 = local15 * local9 + this.aFloat315 * local4;
		this.aFloat316 = local18 * local4 - this.aFloat317 * local9;
		this.aFloat317 = local18 * local9 + this.aFloat317 * local4;
		this.aFloat319 = local21 * local4 - this.aFloat314 * local9;
		this.aFloat314 = local21 * local9 + this.aFloat314 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "az", descriptor = "(FFFF)V")
	void method29597(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat310 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat313 = (local7 - local35) * 2.0F;
		this.aFloat309 = (local11 + local27) * 2.0F;
		this.aFloat311 = (local7 + local35) * 2.0F;
		this.aFloat320 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat316 = (local23 - local15) * 2.0F;
		this.aFloat312 = (local11 - local27) * 2.0F;
		this.aFloat315 = (local23 + local15) * 2.0F;
		this.aFloat317 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "ba", descriptor = "(Lclient!ou;)V")
	public void method29598(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat311;
		@Pc(8) float local8 = this.aFloat313;
		@Pc(11) float local11 = this.aFloat320;
		@Pc(14) float local14 = this.aFloat309;
		@Pc(17) float local17 = this.aFloat316;
		@Pc(20) float local20 = this.aFloat318;
		@Pc(23) float local23 = this.aFloat319;
		@Pc(26) float local26 = this.aFloat312;
		@Pc(29) float local29 = this.aFloat315;
		@Pc(32) float local32 = this.aFloat317;
		@Pc(35) float local35 = this.aFloat314;
		this.aFloat310 = local2 * arg0.aFloat310 + local5 * arg0.aFloat313 + local26 * arg0.aFloat309;
		this.aFloat311 = local2 * arg0.aFloat311 + local5 * arg0.aFloat320 + local26 * arg0.aFloat316;
		this.aFloat312 = local2 * arg0.aFloat312 + local5 * arg0.aFloat315 + local26 * arg0.aFloat317;
		this.aFloat313 = local8 * arg0.aFloat310 + local11 * arg0.aFloat313 + local29 * arg0.aFloat309;
		this.aFloat320 = local8 * arg0.aFloat311 + local11 * arg0.aFloat320 + local29 * arg0.aFloat316;
		this.aFloat315 = local8 * arg0.aFloat312 + local11 * arg0.aFloat315 + local29 * arg0.aFloat317;
		this.aFloat309 = local14 * arg0.aFloat310 + local17 * arg0.aFloat313 + local32 * arg0.aFloat309;
		this.aFloat316 = local14 * arg0.aFloat311 + local17 * arg0.aFloat320 + local32 * arg0.aFloat316;
		this.aFloat317 = local14 * arg0.aFloat312 + local17 * arg0.aFloat315 + local32 * arg0.aFloat317;
		this.aFloat318 = local20 * arg0.aFloat310 + local23 * arg0.aFloat313 + local35 * arg0.aFloat309 + arg0.aFloat318;
		this.aFloat319 = local20 * arg0.aFloat311 + local23 * arg0.aFloat320 + local35 * arg0.aFloat316 + arg0.aFloat319;
		this.aFloat314 = local20 * arg0.aFloat312 + local23 * arg0.aFloat315 + local35 * arg0.aFloat317 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "bl", descriptor = "(F)V")
	void method29599(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 + this.aFloat312 * local9;
		this.aFloat312 = this.aFloat312 * local4 - local12 * local9;
		this.aFloat313 = local15 * local4 + this.aFloat315 * local9;
		this.aFloat315 = this.aFloat315 * local4 - local15 * local9;
		this.aFloat309 = local18 * local4 + this.aFloat317 * local9;
		this.aFloat317 = this.aFloat317 * local4 - local18 * local9;
		this.aFloat318 = local21 * local4 + this.aFloat314 * local9;
		this.aFloat314 = this.aFloat314 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ou", name = "ce", descriptor = "(FFF[F)V")
	public void method29600(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat310 * arg0 + this.aFloat313 * arg1 + this.aFloat309 * arg2 + this.aFloat318;
		arg3[1] = this.aFloat311 * arg0 + this.aFloat320 * arg1 + this.aFloat316 * arg2 + this.aFloat319;
		arg3[2] = this.aFloat312 * arg0 + this.aFloat315 * arg1 + this.aFloat317 * arg2 + this.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "(FFF)V")
	public void method29601(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 = arg0;
		this.aFloat313 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat320 = arg1;
		this.aFloat316 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat317 = arg2;
		this.aFloat314 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "bx", descriptor = "(F)V")
	void method29602(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 - this.aFloat311 * local9;
		this.aFloat311 = local12 * local9 + this.aFloat311 * local4;
		this.aFloat313 = local15 * local4 - this.aFloat320 * local9;
		this.aFloat320 = local15 * local9 + this.aFloat320 * local4;
		this.aFloat309 = local18 * local4 - this.aFloat316 * local9;
		this.aFloat316 = local18 * local9 + this.aFloat316 * local4;
		this.aFloat318 = local21 * local4 - this.aFloat319 * local9;
		this.aFloat319 = local21 * local9 + this.aFloat319 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "bd", descriptor = "(F)V")
	void method29603(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 - this.aFloat311 * local9;
		this.aFloat311 = local12 * local9 + this.aFloat311 * local4;
		this.aFloat313 = local15 * local4 - this.aFloat320 * local9;
		this.aFloat320 = local15 * local9 + this.aFloat320 * local4;
		this.aFloat309 = local18 * local4 - this.aFloat316 * local9;
		this.aFloat316 = local18 * local9 + this.aFloat316 * local4;
		this.aFloat318 = local21 * local4 - this.aFloat319 * local9;
		this.aFloat319 = local21 * local9 + this.aFloat319 * local4;
	}

	@OriginalMember(owner = "client!ou", name = "bc", descriptor = "(Lclient!ov;)V")
	void method29604(@OriginalArg(0) Class471 arg0) {
		this.method29562(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "bi", descriptor = "(Lclient!ov;)V")
	void method29605(@OriginalArg(0) Class471 arg0) {
		this.method29562(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "bn", descriptor = "(Lclient!ov;)V")
	void method29606(@OriginalArg(0) Class471 arg0) {
		this.method29562(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "bt", descriptor = "(Lclient!ov;)V")
	void method29607(@OriginalArg(0) Class471 arg0) {
		this.method29562(arg0.aFloat322, arg0.aFloat323, arg0.aFloat324, arg0.aFloat321);
	}

	@OriginalMember(owner = "client!ou", name = "bq", descriptor = "(FFFF)V")
	void method29608(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
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
		@Pc(98) float local98 = this.aFloat310;
		@Pc(101) float local101 = this.aFloat311;
		@Pc(104) float local104 = this.aFloat313;
		@Pc(107) float local107 = this.aFloat320;
		@Pc(110) float local110 = this.aFloat309;
		@Pc(113) float local113 = this.aFloat316;
		@Pc(116) float local116 = this.aFloat318;
		@Pc(119) float local119 = this.aFloat319;
		this.aFloat310 = local98 * local43 + local101 * local49 + this.aFloat312 * local55;
		this.aFloat311 = local98 * local61 + local101 * local69 + this.aFloat312 * local75;
		this.aFloat312 = local98 * local81 + local101 * local87 + this.aFloat312 * local95;
		this.aFloat313 = local104 * local43 + local107 * local49 + this.aFloat315 * local55;
		this.aFloat320 = local104 * local61 + local107 * local69 + this.aFloat315 * local75;
		this.aFloat315 = local104 * local81 + local107 * local87 + this.aFloat315 * local95;
		this.aFloat309 = local110 * local43 + local113 * local49 + this.aFloat317 * local55;
		this.aFloat316 = local110 * local61 + local113 * local69 + this.aFloat317 * local75;
		this.aFloat317 = local110 * local81 + local113 * local87 + this.aFloat317 * local95;
		this.aFloat318 = local116 * local43 + local119 * local49 + this.aFloat314 * local55;
		this.aFloat319 = local116 * local61 + local119 * local69 + this.aFloat314 * local75;
		this.aFloat314 = local116 * local81 + local119 * local87 + this.aFloat314 * local95;
	}

	@OriginalMember(owner = "client!ou", name = "bm", descriptor = "(FFF)V")
	public void method29609(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 = arg0;
		this.aFloat313 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat320 = arg1;
		this.aFloat316 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat317 = arg2;
		this.aFloat314 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "bb", descriptor = "(FFF)V")
	public void method29610(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 = arg0;
		this.aFloat313 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat320 = arg1;
		this.aFloat316 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat317 = arg2;
		this.aFloat314 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "au", descriptor = "()V")
	public void method29611() {
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat320 = 1.0F;
		this.aFloat310 = 1.0F;
	}

	@OriginalMember(owner = "client!ou", name = "by", descriptor = "(Lclient!ox;)V")
	void method29612(@OriginalArg(0) Class472 arg0) {
		this.method29601(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "bu", descriptor = "(FFF)V")
	public void method29613(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat310 *= arg0;
		this.aFloat313 *= arg0;
		this.aFloat309 *= arg0;
		this.aFloat318 *= arg0;
		this.aFloat311 *= arg1;
		this.aFloat320 *= arg1;
		this.aFloat316 *= arg1;
		this.aFloat319 *= arg1;
		this.aFloat312 *= arg2;
		this.aFloat315 *= arg2;
		this.aFloat317 *= arg2;
		this.aFloat314 *= arg2;
	}

	@OriginalMember(owner = "client!ou", name = "bw", descriptor = "(FFF)V")
	public void method29614(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat320 = 1.0F;
		this.aFloat310 = 1.0F;
		this.aFloat318 = arg0;
		this.aFloat319 = arg1;
		this.aFloat314 = arg2;
	}

	@OriginalMember(owner = "client!ou", name = "bo", descriptor = "(Lclient!ox;)V")
	public void method29615(@OriginalArg(0) Class472 arg0) {
		this.method29568(arg0.aFloat325, arg0.aFloat326, arg0.aFloat327);
	}

	@OriginalMember(owner = "client!ou", name = "ca", descriptor = "([F)[F")
	public float[] method29616(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat318;
		arg0[1] = this.aFloat319;
		arg0[2] = this.aFloat314;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "bg", descriptor = "(Lclient!ou;)V")
	public void method29617(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat311;
		@Pc(8) float local8 = this.aFloat313;
		@Pc(11) float local11 = this.aFloat320;
		@Pc(14) float local14 = this.aFloat309;
		@Pc(17) float local17 = this.aFloat316;
		@Pc(20) float local20 = this.aFloat318;
		@Pc(23) float local23 = this.aFloat319;
		@Pc(26) float local26 = this.aFloat312;
		@Pc(29) float local29 = this.aFloat315;
		@Pc(32) float local32 = this.aFloat317;
		@Pc(35) float local35 = this.aFloat314;
		this.aFloat310 = local2 * arg0.aFloat310 + local5 * arg0.aFloat313 + local26 * arg0.aFloat309;
		this.aFloat311 = local2 * arg0.aFloat311 + local5 * arg0.aFloat320 + local26 * arg0.aFloat316;
		this.aFloat312 = local2 * arg0.aFloat312 + local5 * arg0.aFloat315 + local26 * arg0.aFloat317;
		this.aFloat313 = local8 * arg0.aFloat310 + local11 * arg0.aFloat313 + local29 * arg0.aFloat309;
		this.aFloat320 = local8 * arg0.aFloat311 + local11 * arg0.aFloat320 + local29 * arg0.aFloat316;
		this.aFloat315 = local8 * arg0.aFloat312 + local11 * arg0.aFloat315 + local29 * arg0.aFloat317;
		this.aFloat309 = local14 * arg0.aFloat310 + local17 * arg0.aFloat313 + local32 * arg0.aFloat309;
		this.aFloat316 = local14 * arg0.aFloat311 + local17 * arg0.aFloat320 + local32 * arg0.aFloat316;
		this.aFloat317 = local14 * arg0.aFloat312 + local17 * arg0.aFloat315 + local32 * arg0.aFloat317;
		this.aFloat318 = local20 * arg0.aFloat310 + local23 * arg0.aFloat313 + local35 * arg0.aFloat309 + arg0.aFloat318;
		this.aFloat319 = local20 * arg0.aFloat311 + local23 * arg0.aFloat320 + local35 * arg0.aFloat316 + arg0.aFloat319;
		this.aFloat314 = local20 * arg0.aFloat312 + local23 * arg0.aFloat315 + local35 * arg0.aFloat317 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "br", descriptor = "(FFF)V")
	public void method29618(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat318 += arg0;
		this.aFloat319 += arg1;
		this.aFloat314 += arg2;
	}

	@OriginalMember(owner = "client!ou", name = "cu", descriptor = "(FFF[F)V")
	public void method29619(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		arg3[0] = this.aFloat310 * arg0 + this.aFloat313 * arg1 + this.aFloat309 * arg2 + this.aFloat318;
		arg3[1] = this.aFloat311 * arg0 + this.aFloat320 * arg1 + this.aFloat316 * arg2 + this.aFloat319;
		arg3[2] = this.aFloat312 * arg0 + this.aFloat315 * arg1 + this.aFloat317 * arg2 + this.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "bp", descriptor = "(Lclient!ou;)V")
	public void method29620(@OriginalArg(0) Class470 arg0) {
		@Pc(2) float local2 = this.aFloat310;
		@Pc(5) float local5 = this.aFloat311;
		@Pc(8) float local8 = this.aFloat313;
		@Pc(11) float local11 = this.aFloat320;
		@Pc(14) float local14 = this.aFloat309;
		@Pc(17) float local17 = this.aFloat316;
		@Pc(20) float local20 = this.aFloat318;
		@Pc(23) float local23 = this.aFloat319;
		@Pc(26) float local26 = this.aFloat312;
		@Pc(29) float local29 = this.aFloat315;
		@Pc(32) float local32 = this.aFloat317;
		@Pc(35) float local35 = this.aFloat314;
		this.aFloat310 = local2 * arg0.aFloat310 + local5 * arg0.aFloat313 + local26 * arg0.aFloat309;
		this.aFloat311 = local2 * arg0.aFloat311 + local5 * arg0.aFloat320 + local26 * arg0.aFloat316;
		this.aFloat312 = local2 * arg0.aFloat312 + local5 * arg0.aFloat315 + local26 * arg0.aFloat317;
		this.aFloat313 = local8 * arg0.aFloat310 + local11 * arg0.aFloat313 + local29 * arg0.aFloat309;
		this.aFloat320 = local8 * arg0.aFloat311 + local11 * arg0.aFloat320 + local29 * arg0.aFloat316;
		this.aFloat315 = local8 * arg0.aFloat312 + local11 * arg0.aFloat315 + local29 * arg0.aFloat317;
		this.aFloat309 = local14 * arg0.aFloat310 + local17 * arg0.aFloat313 + local32 * arg0.aFloat309;
		this.aFloat316 = local14 * arg0.aFloat311 + local17 * arg0.aFloat320 + local32 * arg0.aFloat316;
		this.aFloat317 = local14 * arg0.aFloat312 + local17 * arg0.aFloat315 + local32 * arg0.aFloat317;
		this.aFloat318 = local20 * arg0.aFloat310 + local23 * arg0.aFloat313 + local35 * arg0.aFloat309 + arg0.aFloat318;
		this.aFloat319 = local20 * arg0.aFloat311 + local23 * arg0.aFloat320 + local35 * arg0.aFloat316 + arg0.aFloat319;
		this.aFloat314 = local20 * arg0.aFloat312 + local23 * arg0.aFloat315 + local35 * arg0.aFloat317 + arg0.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "bj", descriptor = "(Lclient!ou;Lclient!ou;)V")
	public void method29621(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class470 arg1) {
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat310 + arg0.aFloat311 * arg1.aFloat313 + arg0.aFloat312 * arg1.aFloat309;
		this.aFloat311 = arg0.aFloat310 * arg1.aFloat311 + arg0.aFloat311 * arg1.aFloat320 + arg0.aFloat312 * arg1.aFloat316;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat312 + arg0.aFloat311 * arg1.aFloat315 + arg0.aFloat312 * arg1.aFloat317;
		this.aFloat313 = arg0.aFloat313 * arg1.aFloat310 + arg0.aFloat320 * arg1.aFloat313 + arg0.aFloat315 * arg1.aFloat309;
		this.aFloat320 = arg0.aFloat313 * arg1.aFloat311 + arg0.aFloat320 * arg1.aFloat320 + arg0.aFloat315 * arg1.aFloat316;
		this.aFloat315 = arg0.aFloat313 * arg1.aFloat312 + arg0.aFloat320 * arg1.aFloat315 + arg0.aFloat315 * arg1.aFloat317;
		this.aFloat309 = arg0.aFloat309 * arg1.aFloat310 + arg0.aFloat316 * arg1.aFloat313 + arg0.aFloat317 * arg1.aFloat309;
		this.aFloat316 = arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat316 * arg1.aFloat320 + arg0.aFloat317 * arg1.aFloat316;
		this.aFloat317 = arg0.aFloat309 * arg1.aFloat312 + arg0.aFloat316 * arg1.aFloat315 + arg0.aFloat317 * arg1.aFloat317;
		this.aFloat318 = arg0.aFloat318 * arg1.aFloat310 + arg0.aFloat319 * arg1.aFloat313 + arg0.aFloat314 * arg1.aFloat309 + arg1.aFloat318;
		this.aFloat319 = arg0.aFloat318 * arg1.aFloat311 + arg0.aFloat319 * arg1.aFloat320 + arg0.aFloat314 * arg1.aFloat316 + arg1.aFloat319;
		this.aFloat314 = arg0.aFloat318 * arg1.aFloat312 + arg0.aFloat319 * arg1.aFloat315 + arg0.aFloat314 * arg1.aFloat317 + arg1.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "bs", descriptor = "(Lclient!ou;Lclient!ou;)V")
	public void method29622(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class470 arg1) {
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat310 + arg0.aFloat311 * arg1.aFloat313 + arg0.aFloat312 * arg1.aFloat309;
		this.aFloat311 = arg0.aFloat310 * arg1.aFloat311 + arg0.aFloat311 * arg1.aFloat320 + arg0.aFloat312 * arg1.aFloat316;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat312 + arg0.aFloat311 * arg1.aFloat315 + arg0.aFloat312 * arg1.aFloat317;
		this.aFloat313 = arg0.aFloat313 * arg1.aFloat310 + arg0.aFloat320 * arg1.aFloat313 + arg0.aFloat315 * arg1.aFloat309;
		this.aFloat320 = arg0.aFloat313 * arg1.aFloat311 + arg0.aFloat320 * arg1.aFloat320 + arg0.aFloat315 * arg1.aFloat316;
		this.aFloat315 = arg0.aFloat313 * arg1.aFloat312 + arg0.aFloat320 * arg1.aFloat315 + arg0.aFloat315 * arg1.aFloat317;
		this.aFloat309 = arg0.aFloat309 * arg1.aFloat310 + arg0.aFloat316 * arg1.aFloat313 + arg0.aFloat317 * arg1.aFloat309;
		this.aFloat316 = arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat316 * arg1.aFloat320 + arg0.aFloat317 * arg1.aFloat316;
		this.aFloat317 = arg0.aFloat309 * arg1.aFloat312 + arg0.aFloat316 * arg1.aFloat315 + arg0.aFloat317 * arg1.aFloat317;
		this.aFloat318 = arg0.aFloat318 * arg1.aFloat310 + arg0.aFloat319 * arg1.aFloat313 + arg0.aFloat314 * arg1.aFloat309 + arg1.aFloat318;
		this.aFloat319 = arg0.aFloat318 * arg1.aFloat311 + arg0.aFloat319 * arg1.aFloat320 + arg0.aFloat314 * arg1.aFloat316 + arg1.aFloat319;
		this.aFloat314 = arg0.aFloat318 * arg1.aFloat312 + arg0.aFloat319 * arg1.aFloat315 + arg0.aFloat314 * arg1.aFloat317 + arg1.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "cl", descriptor = "(Lclient!ou;Lclient!ou;)V")
	public void method29623(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class470 arg1) {
		this.aFloat310 = arg0.aFloat310 * arg1.aFloat310 + arg0.aFloat311 * arg1.aFloat313 + arg0.aFloat312 * arg1.aFloat309;
		this.aFloat311 = arg0.aFloat310 * arg1.aFloat311 + arg0.aFloat311 * arg1.aFloat320 + arg0.aFloat312 * arg1.aFloat316;
		this.aFloat312 = arg0.aFloat310 * arg1.aFloat312 + arg0.aFloat311 * arg1.aFloat315 + arg0.aFloat312 * arg1.aFloat317;
		this.aFloat313 = arg0.aFloat313 * arg1.aFloat310 + arg0.aFloat320 * arg1.aFloat313 + arg0.aFloat315 * arg1.aFloat309;
		this.aFloat320 = arg0.aFloat313 * arg1.aFloat311 + arg0.aFloat320 * arg1.aFloat320 + arg0.aFloat315 * arg1.aFloat316;
		this.aFloat315 = arg0.aFloat313 * arg1.aFloat312 + arg0.aFloat320 * arg1.aFloat315 + arg0.aFloat315 * arg1.aFloat317;
		this.aFloat309 = arg0.aFloat309 * arg1.aFloat310 + arg0.aFloat316 * arg1.aFloat313 + arg0.aFloat317 * arg1.aFloat309;
		this.aFloat316 = arg0.aFloat309 * arg1.aFloat311 + arg0.aFloat316 * arg1.aFloat320 + arg0.aFloat317 * arg1.aFloat316;
		this.aFloat317 = arg0.aFloat309 * arg1.aFloat312 + arg0.aFloat316 * arg1.aFloat315 + arg0.aFloat317 * arg1.aFloat317;
		this.aFloat318 = arg0.aFloat318 * arg1.aFloat310 + arg0.aFloat319 * arg1.aFloat313 + arg0.aFloat314 * arg1.aFloat309 + arg1.aFloat318;
		this.aFloat319 = arg0.aFloat318 * arg1.aFloat311 + arg0.aFloat319 * arg1.aFloat320 + arg0.aFloat314 * arg1.aFloat316 + arg1.aFloat319;
		this.aFloat314 = arg0.aFloat318 * arg1.aFloat312 + arg0.aFloat319 * arg1.aFloat315 + arg0.aFloat314 * arg1.aFloat317 + arg1.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "an", descriptor = "(F)V")
	void method29624(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 + this.aFloat312 * local9;
		this.aFloat312 = this.aFloat312 * local4 - local12 * local9;
		this.aFloat313 = local15 * local4 + this.aFloat315 * local9;
		this.aFloat315 = this.aFloat315 * local4 - local15 * local9;
		this.aFloat309 = local18 * local4 + this.aFloat317 * local9;
		this.aFloat317 = this.aFloat317 * local4 - local18 * local9;
		this.aFloat318 = local21 * local4 + this.aFloat314 * local9;
		this.aFloat314 = this.aFloat314 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "(FFFF)V")
	public void method29625(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(4) float local4 = (float) Math.cos((double) arg3);
		@Pc(9) float local9 = (float) Math.sin((double) arg3);
		this.aFloat310 = local4 + arg0 * arg0 * (1.0F - local4);
		this.aFloat311 = arg2 * local9 + arg1 * arg0 * (1.0F - local4);
		this.aFloat312 = -arg1 * local9 + arg2 * arg0 * (1.0F - local4);
		this.aFloat313 = -arg2 * local9 + arg0 * arg1 * (1.0F - local4);
		this.aFloat320 = local4 + arg1 * arg1 * (1.0F - local4);
		this.aFloat315 = arg0 * local9 + arg2 * arg1 * (1.0F - local4);
		this.aFloat309 = arg1 * local9 + arg0 * arg2 * (1.0F - local4);
		this.aFloat316 = -arg0 * local9 + arg1 * arg2 * (1.0F - local4);
		this.aFloat317 = local4 + arg2 * arg2 * (1.0F - local4);
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}

	@OriginalMember(owner = "client!ou", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aFloat310 + "," + this.aFloat313 + "," + this.aFloat309 + "," + this.aFloat318 + "\n" + this.aFloat311 + "," + this.aFloat320 + "," + this.aFloat316 + "," + this.aFloat319 + "\n" + this.aFloat312 + "," + this.aFloat315 + "," + this.aFloat317 + "," + this.aFloat314;
	}

	@OriginalMember(owner = "client!ou", name = "cn", descriptor = "([F)V")
	public void method29626(@OriginalArg(0) float[] arg0) {
		@Pc(6) float local6 = arg0[0] - this.aFloat318;
		@Pc(13) float local13 = arg0[1] - this.aFloat319;
		@Pc(20) float local20 = arg0[2] - this.aFloat314;
		arg0[0] = (float) (this.aFloat310 * local6 + this.aFloat311 * local13 + this.aFloat312 * local20);
		arg0[1] = (float) (this.aFloat313 * local6 + this.aFloat320 * local13 + this.aFloat315 * local20);
		arg0[2] = (float) (this.aFloat309 * local6 + this.aFloat316 * local13 + this.aFloat317 * local20);
	}

	@OriginalMember(owner = "client!ou", name = "ai", descriptor = "([F)[F")
	public float[] method29627(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat311;
		arg0[2] = this.aFloat312;
		arg0[3] = this.aFloat313;
		arg0[4] = this.aFloat320;
		arg0[5] = this.aFloat315;
		arg0[6] = this.aFloat309;
		arg0[7] = this.aFloat316;
		arg0[8] = this.aFloat317;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "bk", descriptor = "(F)V")
	void method29628(@OriginalArg(0) float arg0) {
		@Pc(4) float local4 = (float) Math.cos((double) arg0);
		@Pc(9) float local9 = (float) Math.sin((double) arg0);
		@Pc(12) float local12 = this.aFloat310;
		@Pc(15) float local15 = this.aFloat313;
		@Pc(18) float local18 = this.aFloat309;
		@Pc(21) float local21 = this.aFloat318;
		this.aFloat310 = local12 * local4 + this.aFloat312 * local9;
		this.aFloat312 = this.aFloat312 * local4 - local12 * local9;
		this.aFloat313 = local15 * local4 + this.aFloat315 * local9;
		this.aFloat315 = this.aFloat315 * local4 - local15 * local9;
		this.aFloat309 = local18 * local4 + this.aFloat317 * local9;
		this.aFloat317 = this.aFloat317 * local4 - local18 * local9;
		this.aFloat318 = local21 * local4 + this.aFloat314 * local9;
		this.aFloat314 = this.aFloat314 * local4 - local21 * local9;
	}

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "()V")
	public void method29629() {
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat313 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat311 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat320 = 1.0F;
		this.aFloat310 = 1.0F;
	}

	@OriginalMember(owner = "client!ou", name = "cx", descriptor = "([F)[F")
	public float[] method29630(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat318;
		arg0[1] = this.aFloat319;
		arg0[2] = this.aFloat314;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "aq", descriptor = "(IIIFFF)V")
	public void method29631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		if (arg0 == 0) {
			this.aFloat316 = 0.0F;
			this.aFloat309 = 0.0F;
			this.aFloat315 = 0.0F;
			this.aFloat313 = 0.0F;
			this.aFloat312 = 0.0F;
			this.aFloat311 = 0.0F;
			this.aFloat310 = arg1 * 2;
			this.aFloat320 = arg2 * 2;
			this.aFloat317 = 1.0F;
			this.aFloat318 = arg3 - (float) arg1;
			this.aFloat319 = arg4 - (float) arg2;
			this.aFloat314 = arg5;
			return;
		}
		@Pc(7) float local7 = Class468.aFloatArray112[arg0 & 0x3FFF];
		@Pc(13) float local13 = Class468.aFloatArray113[arg0 & 0x3FFF];
		this.aFloat317 = 1.0F;
		this.aFloat316 = 0.0F;
		this.aFloat309 = 0.0F;
		this.aFloat315 = 0.0F;
		this.aFloat312 = 0.0F;
		this.aFloat310 = local7 * 2.0F * (float) arg1;
		this.aFloat320 = local7 * 2.0F * (float) arg2;
		this.aFloat311 = local13 * 2.0F * (float) arg1;
		this.aFloat313 = -2.0F * local13 * (float) arg2;
		this.aFloat318 = (float) (arg1 * 2) * (local13 * 0.5F - local7 * 0.5F) + arg3;
		this.aFloat319 = (float) (arg2 * 2) * (-0.5F * local13 - local7 * 0.5F) + arg4;
		this.aFloat314 = arg5;
	}

	@OriginalMember(owner = "client!ou", name = "ct", descriptor = "([F)[F")
	public float[] method29632(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat311;
		arg0[2] = this.aFloat312;
		arg0[3] = this.aFloat313;
		arg0[4] = this.aFloat320;
		arg0[5] = this.aFloat315;
		arg0[6] = this.aFloat309;
		arg0[7] = this.aFloat316;
		arg0[8] = this.aFloat317;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "cf", descriptor = "([F)[F")
	public float[] method29633(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat311;
		arg0[2] = this.aFloat312;
		arg0[3] = this.aFloat313;
		arg0[4] = this.aFloat320;
		arg0[5] = this.aFloat315;
		arg0[6] = this.aFloat309;
		arg0[7] = this.aFloat316;
		arg0[8] = this.aFloat317;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "co", descriptor = "([F)[F")
	public float[] method29634(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat310;
		arg0[1] = this.aFloat311;
		arg0[2] = this.aFloat312;
		arg0[3] = this.aFloat313;
		arg0[4] = this.aFloat320;
		arg0[5] = this.aFloat315;
		arg0[6] = this.aFloat309;
		arg0[7] = this.aFloat316;
		arg0[8] = this.aFloat317;
		return arg0;
	}

	@OriginalMember(owner = "client!ou", name = "aa", descriptor = "(FFFF)V")
	void method29635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float local3 = arg0 * arg0;
		@Pc(7) float local7 = arg0 * arg1;
		@Pc(11) float local11 = arg0 * arg2;
		@Pc(15) float local15 = arg0 * arg3;
		@Pc(19) float local19 = arg1 * arg1;
		@Pc(23) float local23 = arg1 * arg2;
		@Pc(27) float local27 = arg1 * arg3;
		@Pc(31) float local31 = arg2 * arg2;
		@Pc(35) float local35 = arg2 * arg3;
		this.aFloat310 = 1.0F - (local19 + local31) * 2.0F;
		this.aFloat313 = (local7 - local35) * 2.0F;
		this.aFloat309 = (local11 + local27) * 2.0F;
		this.aFloat311 = (local7 + local35) * 2.0F;
		this.aFloat320 = 1.0F - (local3 + local31) * 2.0F;
		this.aFloat316 = (local23 - local15) * 2.0F;
		this.aFloat312 = (local11 - local27) * 2.0F;
		this.aFloat315 = (local23 + local15) * 2.0F;
		this.aFloat317 = 1.0F - (local3 + local19) * 2.0F;
		this.aFloat314 = 0.0F;
		this.aFloat319 = 0.0F;
		this.aFloat318 = 0.0F;
	}
}
