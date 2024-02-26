package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahf")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!ahf", name = "f", descriptor = "I")
	int anInt1121;

	@OriginalMember(owner = "client!ahf", name = "e", descriptor = "Lclient!on;")
	final Class463 aClass463_35 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahf", name = "u", descriptor = "Lclient!on;")
	final Class463 aClass463_36 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahf", name = "l", descriptor = "Lclient!on;")
	final Class463 aClass463_37 = new Class463();

	@OriginalMember(owner = "client!ahf", name = "g", descriptor = "Z")
	boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ahf", name = "fk", descriptor = "(II)Z")
	public static boolean method9819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 18 || arg0 == 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ahf", name = "me", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method9820(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3519 * 227319795; local5++) {
			@Pc(14) Class699 local14 = client.aClass699Array1[local5];
			if (arg0.equalsIgnoreCase(local14.aString244)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(local14.aString242)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ahf", name = "t", descriptor = "(Lclient!oq;I)F")
	public static float method9821(@OriginalArg(0) Class466 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		return (float) local14;
	}

	@OriginalMember(owner = "client!ahf", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class123_Sub1(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahf", name = "ac", descriptor = "(Z)V")
	public void method9810(@OriginalArg(0) boolean arg0) {
		this.aBoolean215 = arg0;
	}

	@OriginalMember(owner = "client!ahf", name = "ax", descriptor = "(Lclient!akx;I)V")
	public void method9811(@OriginalArg(0) Class80_Sub33 arg0, @OriginalArg(1) int arg1) {
		this.aClass463_36.aFloat297 = arg0.anInt1655 * -1125961095;
		this.aClass463_36.aFloat295 = arg0.anInt1654 * 2058467157;
		this.aClass463_36.aFloat296 = arg0.anInt1653 * 1944136251;
		if (Float.isNaN(this.aClass463_35.aFloat297)) {
			this.aClass463_35.method29478(this.aClass463_36);
			this.aClass463_37.method29575();
		}
		this.anInt1121 = arg0.anInt1652 * 378185551;
	}

	@OriginalMember(owner = "client!ahf", name = "t", descriptor = "(F[[[ILclient!qc;IIS)V")
	@Override
	public void method20499(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5) {
		if (this.aBoolean215) {
			this.method9812(arg1, arg2, arg3, arg4, 1747008194);
		}
		this.aClass121_13.method9575(true, arg0, this.aClass463_35, this.aClass121_13.method9604((byte) 0), this.aClass463_36, this.aClass463_37, (short) 15805);
	}

	@OriginalMember(owner = "client!ahf", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method20500(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass463_35.aFloat297);
	}

	@OriginalMember(owner = "client!ahf", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method20516(@OriginalArg(0) int arg0) {
		return Class463.method29472(this.aClass463_35);
	}

	@OriginalMember(owner = "client!ahf", name = "u", descriptor = "(I)[D")
	@Override
	public double[] method20502(@OriginalArg(0) int arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class463 local6 = this.method20516(1436604136);
		local2[0] = local6.aFloat297;
		local2[1] = local6.aFloat295;
		local2[2] = local6.aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!ahf", name = "l", descriptor = "(B)Lclient!akx;")
	@Override
	public Class80_Sub33 method20519(@OriginalArg(0) byte arg0) {
		return new Class80_Sub33(this.anInt1121 * 1106513739, (int) this.aClass463_35.aFloat297, (int) this.aClass463_35.aFloat295, (int) this.aClass463_35.aFloat296);
	}

	@OriginalMember(owner = "client!ahf", name = "ai", descriptor = "([[[ILclient!qc;III)V")
	void method9812(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class502 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method20500(736958860) || !this.aClass121_13.method9624((byte) -29) && !this.aClass121_13.method9625(-596633890) || !this.aClass121_13.method9625(-596633890) || arg0 == null) {
			return;
		}
		@Pc(29) int local29 = (int) this.aClass463_36.aFloat297 - arg2 >> 9;
		@Pc(38) int local38 = (int) this.aClass463_36.aFloat296 - arg3 >> 9;
		if (local29 < 0 || local38 < 0 || local29 + 1 >= arg0[0].length || local38 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(65) int local65 = this.anInt1121 * 1106513739;
		if (arg1.method30429(local29, local38, 1473825746)) {
			local65 = this.anInt1121 * 1106513739 + 1;
		}
		@Pc(85) long local85 = (long) this.aClass463_36.aFloat297 % 512L;
		@Pc(92) long local92 = (long) this.aClass463_36.aFloat296 % 512L;
		@Pc(109) long local109 = (512L - local85) * (long) arg0[local65][local29][local38] * (512L - local92);
		@Pc(128) long local128 = local109 + (512L - local92) * (long) arg0[local65][local29 + 1][local38] * local85;
		@Pc(147) long local147 = local128 + local92 * (512L - local85) * (long) arg0[local65][local29][local38 + 1];
		@Pc(166) long local166 = local147 + local85 * (long) arg0[local65][local29 + 1][local38 + 1] * local92;
		@Pc(170) long local170 = local166 / 262144L;
		@Pc(174) long local174 = local170 - 512L;
		@Pc(182) float local182 = (float) -local174 - this.aClass463_36.aFloat295;
		if (local182 > 0.0F) {
			this.aClass463_36.aFloat295 = -local174;
		}
	}

	@OriginalMember(owner = "client!ahf", name = "a", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public void method20509(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean215) {
			this.method9812(arg1, arg2, arg3, arg4, -1412886813);
		}
		this.aClass121_13.method9575(true, arg0, this.aClass463_35, this.aClass121_13.method9604((byte) 0), this.aClass463_36, this.aClass463_37, (short) -17073);
	}

	@OriginalMember(owner = "client!ahf", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20505() {
		return Class463.method29472(this.aClass463_35);
	}

	@OriginalMember(owner = "client!ahf", name = "n", descriptor = "(Lclient!ald;)V")
	@Override
	public void method20521(@OriginalArg(0) Packet arg0) {
		this.aClass463_36.method29476(arg0);
	}

	@OriginalMember(owner = "client!ahf", name = "i", descriptor = "(Lclient!jl;IIB)V")
	@Override
	public void method20518(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4494 = ((int) this.aClass463_35.aFloat297 - arg1) * -628823913;
		arg0.anInt4495 = (int) -this.aClass463_35.aFloat295 * 391913553;
		arg0.anInt4496 = ((int) this.aClass463_35.aFloat296 - arg2) * 1873294199;
	}

	@OriginalMember(owner = "client!ahf", name = "ay", descriptor = "(ZB)V")
	public void method9813(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean215 = arg0;
	}

	@OriginalMember(owner = "client!ahf", name = "m", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method20506(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass463_36.method29476(arg0);
	}

	@OriginalMember(owner = "client!ahf", name = "o", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public void method20498(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean215) {
			this.method9812(arg1, arg2, arg3, arg4, -1793280175);
		}
		this.aClass121_13.method9575(true, arg0, this.aClass463_35, this.aClass121_13.method9604((byte) 0), this.aClass463_36, this.aClass463_37, (short) 11033);
	}

	@OriginalMember(owner = "client!ahf", name = "s", descriptor = "()Z")
	@Override
	public boolean method20510() {
		return !Float.isNaN(this.aClass463_35.aFloat297);
	}

	@OriginalMember(owner = "client!ahf", name = "k", descriptor = "()Z")
	@Override
	public boolean method20511() {
		return !Float.isNaN(this.aClass463_35.aFloat297);
	}

	@OriginalMember(owner = "client!ahf", name = "aq", descriptor = "(Lclient!akx;)V")
	public void method9814(@OriginalArg(0) Class80_Sub33 arg0) {
		this.aClass463_36.aFloat297 = arg0.anInt1655 * -1125961095;
		this.aClass463_36.aFloat295 = arg0.anInt1654 * 2058467157;
		this.aClass463_36.aFloat296 = arg0.anInt1653 * 1944136251;
		if (Float.isNaN(this.aClass463_35.aFloat297)) {
			this.aClass463_35.method29478(this.aClass463_36);
			this.aClass463_37.method29575();
		}
		this.anInt1121 = arg0.anInt1652 * 378185551;
	}

	@OriginalMember(owner = "client!ahf", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20512() {
		return Class463.method29472(this.aClass463_35);
	}

	@OriginalMember(owner = "client!ahf", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method20513() {
		return Class463.method29472(this.aClass463_35);
	}

	@OriginalMember(owner = "client!ahf", name = "q", descriptor = "()[D")
	@Override
	public double[] method20520() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class463 local6 = this.method20516(1436604136);
		local2[0] = local6.aFloat297;
		local2[1] = local6.aFloat295;
		local2[2] = local6.aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!ahf", name = "h", descriptor = "()[D")
	@Override
	public double[] method20515() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class463 local6 = this.method20516(1436604136);
		local2[0] = local6.aFloat297;
		local2[1] = local6.aFloat295;
		local2[2] = local6.aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!ahf", name = "d", descriptor = "()[D")
	@Override
	public double[] method20514() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class463 local6 = this.method20516(1436604136);
		local2[0] = local6.aFloat297;
		local2[1] = local6.aFloat295;
		local2[2] = local6.aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!ahf", name = "z", descriptor = "()[D")
	@Override
	public double[] method20503() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class463 local6 = this.method20516(1436604136);
		local2[0] = local6.aFloat297;
		local2[1] = local6.aFloat295;
		local2[2] = local6.aFloat296;
		return local2;
	}

	@OriginalMember(owner = "client!ahf", name = "p", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method20507() {
		return new Class80_Sub33(this.anInt1121 * 1106513739, (int) this.aClass463_35.aFloat297, (int) this.aClass463_35.aFloat295, (int) this.aClass463_35.aFloat296);
	}

	@OriginalMember(owner = "client!ahf", name = "v", descriptor = "()F")
	@Override
	public float method20501() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahf", name = "y", descriptor = "(Lclient!ald;)V")
	@Override
	public void method20517(@OriginalArg(0) Packet arg0) {
		this.aClass463_36.method29476(arg0);
	}

	@OriginalMember(owner = "client!ahf", name = "g", descriptor = "(B)F")
	@Override
	public float method20504(@OriginalArg(0) byte arg0) {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahf", name = "c", descriptor = "(Lclient!ald;)V")
	@Override
	public void method20522(@OriginalArg(0) Packet arg0) {
		this.aClass463_36.method29476(arg0);
	}

	@OriginalMember(owner = "client!ahf", name = "ao", descriptor = "(Z)V")
	public void method9815(@OriginalArg(0) boolean arg0) {
		this.aBoolean215 = arg0;
	}

	@OriginalMember(owner = "client!ahf", name = "ag", descriptor = "([[[ILclient!qc;II)V")
	void method9816(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class502 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method20500(-487257855) || !this.aClass121_13.method9624((byte) -9) && !this.aClass121_13.method9625(-596633890) || !this.aClass121_13.method9625(-596633890) || arg0 == null) {
			return;
		}
		@Pc(29) int local29 = (int) this.aClass463_36.aFloat297 - arg2 >> 9;
		@Pc(38) int local38 = (int) this.aClass463_36.aFloat296 - arg3 >> 9;
		if (local29 < 0 || local38 < 0 || local29 + 1 >= arg0[0].length || local38 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(65) int local65 = this.anInt1121 * 1106513739;
		if (arg1.method30429(local29, local38, 804475048)) {
			local65 = this.anInt1121 * 1106513739 + 1;
		}
		@Pc(85) long local85 = (long) this.aClass463_36.aFloat297 % 512L;
		@Pc(92) long local92 = (long) this.aClass463_36.aFloat296 % 512L;
		@Pc(109) long local109 = (512L - local85) * (long) arg0[local65][local29][local38] * (512L - local92);
		@Pc(128) long local128 = local109 + (512L - local92) * (long) arg0[local65][local29 + 1][local38] * local85;
		@Pc(147) long local147 = local128 + local92 * (512L - local85) * (long) arg0[local65][local29][local38 + 1];
		@Pc(166) long local166 = local147 + local85 * (long) arg0[local65][local29 + 1][local38 + 1] * local92;
		@Pc(170) long local170 = local166 / 262144L;
		@Pc(174) long local174 = local170 - 512L;
		@Pc(182) float local182 = (float) -local174 - this.aClass463_36.aFloat295;
		if (local182 > 0.0F) {
			this.aClass463_36.aFloat295 = -local174;
		}
	}

	@OriginalMember(owner = "client!ahf", name = "aj", descriptor = "(Z)V")
	public void method9817(@OriginalArg(0) boolean arg0) {
		this.aBoolean215 = arg0;
	}

	@OriginalMember(owner = "client!ahf", name = "j", descriptor = "(F[[[ILclient!qc;II)V")
	@Override
	public void method20508(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean215) {
			this.method9812(arg1, arg2, arg3, arg4, 1521059374);
		}
		this.aClass121_13.method9575(true, arg0, this.aClass463_35, this.aClass121_13.method9604((byte) 0), this.aClass463_36, this.aClass463_37, (short) 8439);
	}

	@OriginalMember(owner = "client!ahf", name = "ab", descriptor = "([[[ILclient!qc;II)V")
	void method9818(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class502 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method20500(119189498) || !this.aClass121_13.method9624((byte) -106) && !this.aClass121_13.method9625(-596633890) || !this.aClass121_13.method9625(-596633890) || arg0 == null) {
			return;
		}
		@Pc(29) int local29 = (int) this.aClass463_36.aFloat297 - arg2 >> 9;
		@Pc(38) int local38 = (int) this.aClass463_36.aFloat296 - arg3 >> 9;
		if (local29 < 0 || local38 < 0 || local29 + 1 >= arg0[0].length || local38 + 1 >= arg0[0][0].length) {
			return;
		}
		@Pc(65) int local65 = this.anInt1121 * 1106513739;
		if (arg1.method30429(local29, local38, 2093684405)) {
			local65 = this.anInt1121 * 1106513739 + 1;
		}
		@Pc(85) long local85 = (long) this.aClass463_36.aFloat297 % 512L;
		@Pc(92) long local92 = (long) this.aClass463_36.aFloat296 % 512L;
		@Pc(109) long local109 = (512L - local85) * (long) arg0[local65][local29][local38] * (512L - local92);
		@Pc(128) long local128 = local109 + (512L - local92) * (long) arg0[local65][local29 + 1][local38] * local85;
		@Pc(147) long local147 = local128 + local92 * (512L - local85) * (long) arg0[local65][local29][local38 + 1];
		@Pc(166) long local166 = local147 + local85 * (long) arg0[local65][local29 + 1][local38 + 1] * local92;
		@Pc(170) long local170 = local166 / 262144L;
		@Pc(174) long local174 = local170 - 512L;
		@Pc(182) float local182 = (float) -local174 - this.aClass463_36.aFloat295;
		if (local182 > 0.0F) {
			this.aClass463_36.aFloat295 = -local174;
		}
	}

	@OriginalMember(owner = "client!ahf", name = "b", descriptor = "(Lclient!jl;II)V")
	@Override
	public void method20523(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt4494 = ((int) this.aClass463_35.aFloat297 - arg1) * -628823913;
		arg0.anInt4495 = (int) -this.aClass463_35.aFloat295 * 391913553;
		arg0.anInt4496 = ((int) this.aClass463_35.aFloat296 - arg2) * 1873294199;
	}
}
