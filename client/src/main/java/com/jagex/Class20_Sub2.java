package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ang")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "Lclient!on;")
	final Class463 aClass463_48 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ang", name = "e", descriptor = "Lclient!on;")
	final Class463 aClass463_49 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ang", name = "u", descriptor = "Lclient!on;")
	final Class463 aClass463_50 = new Class463();

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub2(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "(FI)V")
	@Override
	public void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aClass121_16.method9575(false, arg0, this.aClass463_48, this.aClass121_16.method9604((byte) 0), this.aClass463_49, this.aClass463_50, (short) 15390);
	}

	@OriginalMember(owner = "client!ang", name = "y", descriptor = "(Lclient!akx;S)V")
	public void method16504(@OriginalArg(0) Class80_Sub33 arg0, @OriginalArg(1) short arg1) {
		this.aClass463_49.aFloat297 = arg0.anInt1655 * -1125961095;
		this.aClass463_49.aFloat295 = arg0.anInt1654 * 2058467157;
		this.aClass463_49.aFloat296 = arg0.anInt1653 * 1944136251;
		if (Float.isNaN(this.aClass463_48.aFloat297)) {
			this.aClass463_48.method29478(this.aClass463_49);
			this.aClass463_50.method29575();
		}
	}

	@OriginalMember(owner = "client!ang", name = "n", descriptor = "(Lclient!akx;)V")
	public void method16505(@OriginalArg(0) Class80_Sub33 arg0) {
		this.aClass463_49.aFloat297 = arg0.anInt1655 * -1125961095;
		this.aClass463_49.aFloat295 = arg0.anInt1654 * 2058467157;
		this.aClass463_49.aFloat296 = arg0.anInt1653 * 1944136251;
		if (Float.isNaN(this.aClass463_48.aFloat297)) {
			this.aClass463_48.method29478(this.aClass463_49);
			this.aClass463_50.method29575();
		}
	}

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method23076(@OriginalArg(0) byte arg0) {
		return !Float.isNaN(this.aClass463_48.aFloat297);
	}

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	@Override
	public void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(-1323141289));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = Class463.method29472(this.aClass463_48);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!ang", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		return Class463.method29472(this.aClass463_48);
	}

	@OriginalMember(owner = "client!ang", name = "s", descriptor = "()Z")
	@Override
	public boolean method23092() {
		return !Float.isNaN(this.aClass463_48.aFloat297);
	}

	@OriginalMember(owner = "client!ang", name = "g", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23094(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.aClass463_49.method29476(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "c", descriptor = "(Lclient!akx;)V")
	public void method16506(@OriginalArg(0) Class80_Sub33 arg0) {
		this.aClass463_49.aFloat297 = arg0.anInt1655 * -1125961095;
		this.aClass463_49.aFloat295 = arg0.anInt1654 * 2058467157;
		this.aClass463_49.aFloat296 = arg0.anInt1653 * 1944136251;
		if (Float.isNaN(this.aClass463_48.aFloat297)) {
			this.aClass463_48.method29478(this.aClass463_49);
			this.aClass463_50.method29575();
		}
	}

	@OriginalMember(owner = "client!ang", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(716805408));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = Class463.method29472(this.aClass463_48);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!ang", name = "m", descriptor = "(F)V")
	@Override
	public void method23077(@OriginalArg(0) float arg0) {
		this.aClass121_16.method9575(false, arg0, this.aClass463_48, this.aClass121_16.method9604((byte) 0), this.aClass463_49, this.aClass463_50, (short) 22679);
	}

	@OriginalMember(owner = "client!ang", name = "o", descriptor = "(F)V")
	@Override
	public void method23082(@OriginalArg(0) float arg0) {
		this.aClass121_16.method9575(false, arg0, this.aClass463_48, this.aClass121_16.method9604((byte) 0), this.aClass463_49, this.aClass463_50, (short) -20201);
	}

	@OriginalMember(owner = "client!ang", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		return Class463.method29472(this.aClass463_48);
	}

	@OriginalMember(owner = "client!ang", name = "a", descriptor = "()Z")
	@Override
	public boolean method23084() {
		return !Float.isNaN(this.aClass463_48.aFloat297);
	}

	@OriginalMember(owner = "client!ang", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(333449748));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = Class463.method29472(this.aClass463_48);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!ang", name = "j", descriptor = "(F)V")
	@Override
	public void method23083(@OriginalArg(0) float arg0) {
		this.aClass121_16.method9575(false, arg0, this.aClass463_48, this.aClass121_16.method9604((byte) 0), this.aClass463_49, this.aClass463_50, (short) 4142);
	}

	@OriginalMember(owner = "client!ang", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		return Class463.method29472(this.aClass463_48);
	}

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		return Class463.method29472(this.aClass463_49);
	}

	@OriginalMember(owner = "client!ang", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		return Class463.method29472(this.aClass463_49);
	}

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23090(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aClass463_49.method29476(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "h", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23091(@OriginalArg(0) Class80_Sub36 arg0) {
		this.aClass463_49.method29476(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(1066671941));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = Class463.method29472(this.aClass463_48);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!ang", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(1470054696));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = Class463.method29472(this.aClass463_48);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!ang", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		return Class463.method29472(this.aClass463_49);
	}

	@OriginalMember(owner = "client!ang", name = "i", descriptor = "(F)V")
	@Override
	public void method23081(@OriginalArg(0) float arg0) {
		this.aClass121_16.method9575(false, arg0, this.aClass463_48, this.aClass121_16.method9604((byte) 0), this.aClass463_49, this.aClass463_50, (short) 5677);
	}
}
