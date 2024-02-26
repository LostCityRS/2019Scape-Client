package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!any")
public final class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!any", name = "f", descriptor = "Lclient!jr;")
	Interface31 anInterface31_2;

	@OriginalMember(owner = "client!any", name = "u", descriptor = "Z")
	boolean aBoolean418;

	@OriginalMember(owner = "client!any", name = "e", descriptor = "Lclient!on;")
	final Class463 aClass463_52 = new Class463();

	@OriginalMember(owner = "client!any", name = "l", descriptor = "Lclient!on;")
	final Class463 aClass463_51 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!any", name = "g", descriptor = "Lclient!on;")
	final Class463 aClass463_53 = new Class463(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!any", name = "i", descriptor = "Lclient!on;")
	final Class463 aClass463_54 = new Class463();

	@OriginalMember(owner = "client!any", name = "be", descriptor = "(Lclient!yp;B)V")
	static void method16946(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class691 local18;
		if (arg0.aBoolean988) {
			local18 = arg0.aClass691_1;
		} else {
			local18 = arg0.aClass691_2;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.method36967(local12, -1, 282819024) ? 1 : 0;
	}

	@OriginalMember(owner = "client!any", name = "ajd", descriptor = "(Lclient!yp;I)V")
	static void method16947(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!any", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub5(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!any", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_53);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(65163999));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "y", descriptor = "(Lclient!jr;Lclient!on;ZI)V")
	public void method16938(@OriginalArg(0) Interface31 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		this.anInterface31_2 = arg0;
		this.aClass463_52.method29478(arg1);
		this.aBoolean418 = arg2;
		arg0.method18941((byte) 45);
	}

	@OriginalMember(owner = "client!any", name = "n", descriptor = "(I)V")
	public void method16939(@OriginalArg(0) int arg0) {
		if (this.anInterface31_2 != null) {
			this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(this.anInterface31_2.method18947(1817459909), this.anInterface31_2.method18940(-716072171), 1910411868);
		}
	}

	@OriginalMember(owner = "client!any", name = "m", descriptor = "(F)V")
	@Override
	public void method23077(@OriginalArg(0) float arg0) {
		if (this.anInterface31_2 != null) {
			this.aClass463_53.method29478(this.anInterface31_2.method18941((byte) 33).method14467(-1244308806));
			this.aClass121_16.method9575(false, arg0, this.aClass463_51, this.aClass121_16.method9604((byte) 0), this.aClass463_53, this.aClass463_54, (short) 7569);
		}
	}

	@OriginalMember(owner = "client!any", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method23076(@OriginalArg(0) byte arg0) {
		return !Float.isNaN(this.aClass463_51.aFloat297);
	}

	@OriginalMember(owner = "client!any", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	@Override
	public void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(1426393451));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = this.method23080(-1432091418);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!any", name = "g", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23094(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class362 local5 = Class384.method28588(arg0.method23362(-1334613118), (byte) 33);
		@Pc(9) int local9 = arg0.method23178((byte) -105);
		this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(local5, local9, 1992309029);
		this.aClass463_52.method29476(arg0);
		if (arg0.method23362(-1856698258) == 1) {
			this.aBoolean418 = true;
		} else {
			this.aBoolean418 = false;
		}
	}

	@OriginalMember(owner = "client!any", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(-464888513));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = this.method23080(-1963832639);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!any", name = "c", descriptor = "(I)Lclient!on;")
	public Class463 method16940(@OriginalArg(0) int arg0) {
		return this.aClass463_51;
	}

	@OriginalMember(owner = "client!any", name = "i", descriptor = "(F)V")
	@Override
	public void method23081(@OriginalArg(0) float arg0) {
		if (this.anInterface31_2 != null) {
			this.aClass463_53.method29478(this.anInterface31_2.method18941((byte) 36).method14467(-137205522));
			this.aClass121_16.method9575(false, arg0, this.aClass463_51, this.aClass121_16.method9604((byte) 0), this.aClass463_53, this.aClass463_54, (short) 2409);
		}
	}

	@OriginalMember(owner = "client!any", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_51);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(-1249731028));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(2099233777));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = this.method23080(-720423540);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!any", name = "j", descriptor = "(F)V")
	@Override
	public void method23083(@OriginalArg(0) float arg0) {
		if (this.anInterface31_2 != null) {
			this.aClass463_53.method29478(this.anInterface31_2.method18941((byte) 19).method14467(-263720294));
			this.aClass121_16.method9575(false, arg0, this.aClass463_51, this.aClass121_16.method9604((byte) 0), this.aClass463_53, this.aClass463_54, (short) 9893);
		}
	}

	@OriginalMember(owner = "client!any", name = "a", descriptor = "()Z")
	@Override
	public boolean method23084() {
		return !Float.isNaN(this.aClass463_51.aFloat297);
	}

	@OriginalMember(owner = "client!any", name = "s", descriptor = "()Z")
	@Override
	public boolean method23092() {
		return !Float.isNaN(this.aClass463_51.aFloat297);
	}

	@OriginalMember(owner = "client!any", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_51);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(-835892949));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "t", descriptor = "(FI)V")
	@Override
	public void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface31_2 != null) {
			this.aClass463_53.method29478(this.anInterface31_2.method18941((byte) 18).method14467(1388796621));
			this.aClass121_16.method9575(false, arg0, this.aClass463_51, this.aClass121_16.method9604((byte) 0), this.aClass463_53, this.aClass463_54, (short) 2806);
		}
	}

	@OriginalMember(owner = "client!any", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_53);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(762600828));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "o", descriptor = "(F)V")
	@Override
	public void method23082(@OriginalArg(0) float arg0) {
		if (this.anInterface31_2 != null) {
			this.aClass463_53.method29478(this.anInterface31_2.method18941((byte) 90).method14467(1767503305));
			this.aClass121_16.method9575(false, arg0, this.aClass463_51, this.aClass121_16.method9604((byte) 0), this.aClass463_53, this.aClass463_54, (short) 9373);
		}
	}

	@OriginalMember(owner = "client!any", name = "q", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23090(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(5) Class362 local5 = Class384.method28588(arg0.method23362(607920369), (byte) -38);
		@Pc(9) int local9 = arg0.method23178((byte) -72);
		this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(local5, local9, 2095065286);
		this.aClass463_52.method29476(arg0);
		if (arg0.method23362(-586893695) == 1) {
			this.aBoolean418 = true;
		} else {
			this.aBoolean418 = false;
		}
	}

	@OriginalMember(owner = "client!any", name = "h", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23091(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(5) Class362 local5 = Class384.method28588(arg0.method23362(841261343), (byte) 35);
		@Pc(9) int local9 = arg0.method23178((byte) -26);
		this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(local5, local9, 2012736278);
		this.aClass463_52.method29476(arg0);
		if (arg0.method23362(594318543) == 1) {
			this.aBoolean418 = true;
		} else {
			this.aBoolean418 = false;
		}
	}

	@OriginalMember(owner = "client!any", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(-2078516747));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = this.method23080(-2057055226);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!any", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_53);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(-158311134));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		@Pc(3) Class463 local3 = Class463.method29472(this.aClass463_51);
		@Pc(7) Class463 local7 = Class463.method29472(this.aClass463_52);
		if (this.aBoolean418) {
			local7.method29500(this.anInterface31_2.method18942(-133411742));
		}
		local3.method29483(local7);
		local7.method29557();
		return local3;
	}

	@OriginalMember(owner = "client!any", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(-174672235));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		@Pc(29) Class463 local29 = this.method23080(-1187958203);
		local29.aFloat297 -= arg2;
		local29.aFloat296 -= arg3;
		local29.aFloat295 *= -1.0F;
		arg1.method29764((double) local5.aFloat297, (double) local5.aFloat295, (double) local5.aFloat296, (double) local29.aFloat297, (double) local29.aFloat295, (double) local29.aFloat296, 0.0F, 1.0F, 0.0F);
		local5.method29557();
		local29.method29557();
	}

	@OriginalMember(owner = "client!any", name = "b", descriptor = "(Lclient!jr;Lclient!on;Z)V")
	public void method16941(@OriginalArg(0) Interface31 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface31_2 = arg0;
		this.aClass463_52.method29478(arg1);
		this.aBoolean418 = arg2;
		arg0.method18941((byte) 40);
	}

	@OriginalMember(owner = "client!any", name = "ax", descriptor = "(Lclient!jr;Lclient!on;Z)V")
	public void method16942(@OriginalArg(0) Interface31 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface31_2 = arg0;
		this.aClass463_52.method29478(arg1);
		this.aBoolean418 = arg2;
		arg0.method18941((byte) 14);
	}

	@OriginalMember(owner = "client!any", name = "ay", descriptor = "()V")
	public void method16943() {
		if (this.anInterface31_2 != null) {
			this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(this.anInterface31_2.method18947(564635577), this.anInterface31_2.method18940(702656479), 2037795420);
		}
	}

	@OriginalMember(owner = "client!any", name = "ai", descriptor = "()V")
	public void method16944() {
		if (this.anInterface31_2 != null) {
			this.anInterface31_2 = this.aClass121_16.method9605(959375167).method29301(this.anInterface31_2.method18947(-248064556), this.anInterface31_2.method18940(1852704015), 1967185472);
		}
	}

	@OriginalMember(owner = "client!any", name = "aq", descriptor = "()Lclient!on;")
	public Class463 method16945() {
		return this.aClass463_51;
	}
}
