package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anm")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "I")
	static int anInt2325 = 0;

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "I")
	static int anInt2324 = 0;

	@OriginalMember(owner = "client!anm", name = "g", descriptor = "I")
	static int anInt2323 = 0;

	@OriginalMember(owner = "client!anm", name = "i", descriptor = "I")
	static int anInt2322 = 0;

	@OriginalMember(owner = "client!anm", name = "m", descriptor = "F")
	static float aFloat153 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "o", descriptor = "F")
	static float aFloat154 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "j", descriptor = "F")
	static float aFloat152 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "a", descriptor = "F")
	static float aFloat155 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "s", descriptor = "F")
	static float aFloat156 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "k", descriptor = "F")
	static float aFloat157 = -1.0F;

	@OriginalMember(owner = "client!anm", name = "f", descriptor = "Lclient!oq;")
	final Class466 aClass466_4 = new Class466();

	@OriginalMember(owner = "client!anm", name = "e", descriptor = "Lclient!oq;")
	final Class466 aClass466_3 = new Class466(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class20_Sub3(@OriginalArg(0) Class121 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "r", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23089() {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_3));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(1947506887));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "y", descriptor = "(Lclient!oq;B)V")
	public void method16632(@OriginalArg(0) Class466 arg0, @OriginalArg(1) byte arg1) {
		this.aClass466_3.aFloat301 = arg0.aFloat301;
		this.aClass466_3.aFloat299 = arg0.aFloat299;
		this.aClass466_3.aFloat300 = arg0.aFloat300;
		this.aClass466_3.aFloat298 = arg0.aFloat298;
		this.aClass466_4.method29647(this.aClass466_3);
	}

	@OriginalMember(owner = "client!anm", name = "ak", descriptor = "(I)V")
	public void method16633(@OriginalArg(0) int arg0) {
		anInt2322 = arg0 * -847372467;
	}

	@OriginalMember(owner = "client!anm", name = "c", descriptor = "(IB)V")
	public void method16634(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		anInt2324 = arg0 * 1129166485;
	}

	@OriginalMember(owner = "client!anm", name = "l", descriptor = "(Lclient!jl;Lclient!ov;IIFI)V")
	@Override
	public void method23093(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(13361581));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		arg1.method29770(Class466.method29687(this.aClass466_4));
		arg1.method29782(local5);
		arg1.method29768();
		local5.method29557();
	}

	@OriginalMember(owner = "client!anm", name = "s", descriptor = "()Z")
	@Override
	public boolean method23092() {
		return !Float.isNaN(this.aClass466_4.aFloat301) && this.aClass121_16.method9608(-1111075871) != null;
	}

	@OriginalMember(owner = "client!anm", name = "e", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23080(@OriginalArg(0) int arg0) {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_4));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(958958698));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "ai", descriptor = "(Lclient!on;I)V")
	void method16635(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1) {
		if (aFloat153 != -1.0F && arg0.aFloat297 < aFloat153) {
			arg0.aFloat297 = aFloat153;
		}
		if (aFloat154 != -1.0F && arg0.aFloat297 > aFloat154) {
			arg0.aFloat297 = aFloat154;
		}
		if (aFloat152 != -1.0F && arg0.aFloat295 < aFloat152) {
			arg0.aFloat295 = aFloat152;
		}
		if (aFloat155 != -1.0F && arg0.aFloat295 > aFloat155) {
			arg0.aFloat295 = aFloat155;
		}
		if (-1.0F != aFloat156 && arg0.aFloat296 < aFloat156) {
			arg0.aFloat296 = aFloat156;
		}
		if (aFloat157 != -1.0F && arg0.aFloat296 > aFloat157) {
			arg0.aFloat296 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!anm", name = "ay", descriptor = "(IIIB)V")
	public void method16636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29764(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class468 local22 = new Class468();
		local3.method29790(local22.aFloatArray107);
		@Pc(30) Class466 local30 = local22.method29729();
		local30.method29701();
		this.aClass466_4.method29647(local30);
	}

	@OriginalMember(owner = "client!anm", name = "t", descriptor = "(FI)V")
	@Override
	public void method23075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class466 local3 = this.method16660((byte) -120);
		if (anInt2325 * -268991531 != 0 || anInt2324 * -711564099 != 0) {
			@Pc(14) Class466 local14 = Class466.method29640();
			local14.method29645(1.0F, 0.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) (anInt2325 * -268991531)) / 16384.0F);
			local3.method29660(local14);
			@Pc(38) Class463 local38 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local38.method29500(local3);
			@Pc(43) Class466 local43 = Class466.method29640();
			local38.method29482();
			local43.method29648(local38, (float) ((double) (anInt2324 * -711564099) * 2.0D * 3.141592653589793D) / 16384.0F);
			local3.method29660(local43);
			this.method16632(local3, (byte) 96);
			anInt2325 = 0;
			anInt2324 = 0;
		}
		if (this.aClass121_16.method9607(-706538051) != Class340.aClass340_5 || anInt2323 * -646511049 == 0 && anInt2322 * -110349947 == 0) {
			return;
		}
		local3.method29701();
		@Pc(93) Class123_Sub1 local93 = (Class123_Sub1) this.aClass121_16.method9603(-2075436386);
		@Pc(97) Class80_Sub33 local97 = local93.method20519((byte) 27);
		@Pc(101) Class463 local101 = local97.method14467(-1846171150);
		@Pc(109) Class463 local109 = Class463.method29541(0.0F, 0.0F, (float) (anInt2322 * -110349947));
		local109.method29500(local3);
		local109.aFloat295 *= -1.0F;
		local101.method29483(local109);
		@Pc(129) Class463 local129 = Class463.method29541((float) (anInt2323 * -646511049), 0.0F, 0.0F);
		local129.method29500(local3);
		local129.aFloat295 *= -1.0F;
		local101.method29483(local129);
		this.method16635(local101, -1254683160);
		local93.method9811(new Class80_Sub33(local97.anInt1652 * 1085842725, (int) local101.aFloat297, (int) local101.aFloat295, (int) local101.aFloat296), -1707230550);
		anInt2323 = 0;
		anInt2322 = 0;
	}

	@OriginalMember(owner = "client!anm", name = "o", descriptor = "(F)V")
	@Override
	public void method23082(@OriginalArg(0) float arg0) {
		@Pc(3) Class466 local3 = this.method16660((byte) -112);
		if (anInt2325 * -268991531 != 0 || anInt2324 * -711564099 != 0) {
			@Pc(14) Class466 local14 = Class466.method29640();
			local14.method29645(1.0F, 0.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) (anInt2325 * -268991531)) / 16384.0F);
			local3.method29660(local14);
			@Pc(38) Class463 local38 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local38.method29500(local3);
			@Pc(43) Class466 local43 = Class466.method29640();
			local38.method29482();
			local43.method29648(local38, (float) ((double) (anInt2324 * -711564099) * 2.0D * 3.141592653589793D) / 16384.0F);
			local3.method29660(local43);
			this.method16632(local3, (byte) 111);
			anInt2325 = 0;
			anInt2324 = 0;
		}
		if (this.aClass121_16.method9607(-1335624777) != Class340.aClass340_5 || anInt2323 * -646511049 == 0 && anInt2322 * -110349947 == 0) {
			return;
		}
		local3.method29701();
		@Pc(93) Class123_Sub1 local93 = (Class123_Sub1) this.aClass121_16.method9603(-2060882503);
		@Pc(97) Class80_Sub33 local97 = local93.method20519((byte) -14);
		@Pc(101) Class463 local101 = local97.method14467(216067617);
		@Pc(109) Class463 local109 = Class463.method29541(0.0F, 0.0F, (float) (anInt2322 * -110349947));
		local109.method29500(local3);
		local109.aFloat295 *= -1.0F;
		local101.method29483(local109);
		@Pc(129) Class463 local129 = Class463.method29541((float) (anInt2323 * -646511049), 0.0F, 0.0F);
		local129.method29500(local3);
		local129.aFloat295 *= -1.0F;
		local101.method29483(local129);
		this.method16635(local101, -874739032);
		local93.method9811(new Class80_Sub33(local97.anInt1652 * 1085842725, (int) local101.aFloat297, (int) local101.aFloat295, (int) local101.aFloat296), -2085966118);
		anInt2323 = 0;
		anInt2322 = 0;
	}

	@OriginalMember(owner = "client!anm", name = "aq", descriptor = "(Lclient!on;IIIIIII)V")
	public void method16637(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		aFloat153 = arg1 == -1 ? -1.0F : arg0.aFloat297 - (float) (arg1 * 512);
		aFloat154 = arg2 == -1 ? -1.0F : arg0.aFloat297 + (float) (arg2 * 512);
		aFloat152 = arg5 == -1 ? -1.0F : -arg0.aFloat295 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.aFloat295;
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat296 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat296;
	}

	@OriginalMember(owner = "client!anm", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method23076(@OriginalArg(0) byte arg0) {
		return !Float.isNaN(this.aClass466_4.aFloat301) && this.aClass121_16.method9608(-706799088) != null;
	}

	@OriginalMember(owner = "client!anm", name = "u", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method23078(@OriginalArg(0) int arg0) {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_3));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(1935777636));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "av", descriptor = "(I)V")
	public void method16638(@OriginalArg(0) int arg0) {
		anInt2322 = arg0 * -847372467;
	}

	@OriginalMember(owner = "client!anm", name = "g", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23094(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass466_4.method29644(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "i", descriptor = "(F)V")
	@Override
	public void method23081(@OriginalArg(0) float arg0) {
		@Pc(3) Class466 local3 = this.method16660((byte) -15);
		if (anInt2325 * -268991531 != 0 || anInt2324 * -711564099 != 0) {
			@Pc(14) Class466 local14 = Class466.method29640();
			local14.method29645(1.0F, 0.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) (anInt2325 * -268991531)) / 16384.0F);
			local3.method29660(local14);
			@Pc(38) Class463 local38 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local38.method29500(local3);
			@Pc(43) Class466 local43 = Class466.method29640();
			local38.method29482();
			local43.method29648(local38, (float) ((double) (anInt2324 * -711564099) * 2.0D * 3.141592653589793D) / 16384.0F);
			local3.method29660(local43);
			this.method16632(local3, (byte) 75);
			anInt2325 = 0;
			anInt2324 = 0;
		}
		if (this.aClass121_16.method9607(-741920293) != Class340.aClass340_5 || anInt2323 * -646511049 == 0 && anInt2322 * -110349947 == 0) {
			return;
		}
		local3.method29701();
		@Pc(93) Class123_Sub1 local93 = (Class123_Sub1) this.aClass121_16.method9603(-2003792302);
		@Pc(97) Class80_Sub33 local97 = local93.method20519((byte) -44);
		@Pc(101) Class463 local101 = local97.method14467(-545024243);
		@Pc(109) Class463 local109 = Class463.method29541(0.0F, 0.0F, (float) (anInt2322 * -110349947));
		local109.method29500(local3);
		local109.aFloat295 *= -1.0F;
		local101.method29483(local109);
		@Pc(129) Class463 local129 = Class463.method29541((float) (anInt2323 * -646511049), 0.0F, 0.0F);
		local129.method29500(local3);
		local129.aFloat295 *= -1.0F;
		local101.method29483(local129);
		this.method16635(local101, -1991364488);
		local93.method9811(new Class80_Sub33(local97.anInt1652 * 1085842725, (int) local101.aFloat297, (int) local101.aFloat295, (int) local101.aFloat296), -1925679538);
		anInt2323 = 0;
		anInt2322 = 0;
	}

	@OriginalMember(owner = "client!anm", name = "m", descriptor = "(F)V")
	@Override
	public void method23077(@OriginalArg(0) float arg0) {
		@Pc(3) Class466 local3 = this.method16660((byte) -42);
		if (anInt2325 * -268991531 != 0 || anInt2324 * -711564099 != 0) {
			@Pc(14) Class466 local14 = Class466.method29640();
			local14.method29645(1.0F, 0.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) (anInt2325 * -268991531)) / 16384.0F);
			local3.method29660(local14);
			@Pc(38) Class463 local38 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local38.method29500(local3);
			@Pc(43) Class466 local43 = Class466.method29640();
			local38.method29482();
			local43.method29648(local38, (float) ((double) (anInt2324 * -711564099) * 2.0D * 3.141592653589793D) / 16384.0F);
			local3.method29660(local43);
			this.method16632(local3, (byte) 118);
			anInt2325 = 0;
			anInt2324 = 0;
		}
		if (this.aClass121_16.method9607(-1253709592) != Class340.aClass340_5 || anInt2323 * -646511049 == 0 && anInt2322 * -110349947 == 0) {
			return;
		}
		local3.method29701();
		@Pc(93) Class123_Sub1 local93 = (Class123_Sub1) this.aClass121_16.method9603(-1728708273);
		@Pc(97) Class80_Sub33 local97 = local93.method20519((byte) 16);
		@Pc(101) Class463 local101 = local97.method14467(-1207760035);
		@Pc(109) Class463 local109 = Class463.method29541(0.0F, 0.0F, (float) (anInt2322 * -110349947));
		local109.method29500(local3);
		local109.aFloat295 *= -1.0F;
		local101.method29483(local109);
		@Pc(129) Class463 local129 = Class463.method29541((float) (anInt2323 * -646511049), 0.0F, 0.0F);
		local129.method29500(local3);
		local129.aFloat295 *= -1.0F;
		local101.method29483(local129);
		this.method16635(local101, -1271013461);
		local93.method9811(new Class80_Sub33(local97.anInt1652 * 1085842725, (int) local101.aFloat297, (int) local101.aFloat295, (int) local101.aFloat296), -963773728);
		anInt2323 = 0;
		anInt2322 = 0;
	}

	@OriginalMember(owner = "client!anm", name = "ag", descriptor = "(I)V")
	public void method16639(@OriginalArg(0) int arg0) {
		anInt2325 = arg0 * 195009917;
	}

	@OriginalMember(owner = "client!anm", name = "j", descriptor = "(F)V")
	@Override
	public void method23083(@OriginalArg(0) float arg0) {
		@Pc(3) Class466 local3 = this.method16660((byte) -34);
		if (anInt2325 * -268991531 != 0 || anInt2324 * -711564099 != 0) {
			@Pc(14) Class466 local14 = Class466.method29640();
			local14.method29645(1.0F, 0.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) (anInt2325 * -268991531)) / 16384.0F);
			local3.method29660(local14);
			@Pc(38) Class463 local38 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local38.method29500(local3);
			@Pc(43) Class466 local43 = Class466.method29640();
			local38.method29482();
			local43.method29648(local38, (float) ((double) (anInt2324 * -711564099) * 2.0D * 3.141592653589793D) / 16384.0F);
			local3.method29660(local43);
			this.method16632(local3, (byte) 3);
			anInt2325 = 0;
			anInt2324 = 0;
		}
		if (this.aClass121_16.method9607(-1553614082) != Class340.aClass340_5 || anInt2323 * -646511049 == 0 && anInt2322 * -110349947 == 0) {
			return;
		}
		local3.method29701();
		@Pc(93) Class123_Sub1 local93 = (Class123_Sub1) this.aClass121_16.method9603(-1954925909);
		@Pc(97) Class80_Sub33 local97 = local93.method20519((byte) 36);
		@Pc(101) Class463 local101 = local97.method14467(-509597479);
		@Pc(109) Class463 local109 = Class463.method29541(0.0F, 0.0F, (float) (anInt2322 * -110349947));
		local109.method29500(local3);
		local109.aFloat295 *= -1.0F;
		local101.method29483(local109);
		@Pc(129) Class463 local129 = Class463.method29541((float) (anInt2323 * -646511049), 0.0F, 0.0F);
		local129.method29500(local3);
		local129.aFloat295 *= -1.0F;
		local101.method29483(local129);
		this.method16635(local101, -1493991762);
		local93.method9811(new Class80_Sub33(local97.anInt1652 * 1085842725, (int) local101.aFloat297, (int) local101.aFloat295, (int) local101.aFloat296), -1890442680);
		anInt2323 = 0;
		anInt2322 = 0;
	}

	@OriginalMember(owner = "client!anm", name = "a", descriptor = "()Z")
	@Override
	public boolean method23084() {
		return !Float.isNaN(this.aClass466_4.aFloat301) && this.aClass121_16.method9608(2067020951) != null;
	}

	@OriginalMember(owner = "client!anm", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23086() {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_4));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(776441437));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "x", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23085() {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_4));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(-1154155108));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "w", descriptor = "()Lclient!on;")
	@Override
	public Class463 method23074() {
		@Pc(6) Class463 local6 = new Class463(0.0F, 0.0F, 1000.0F);
		local6.method29500(Class466.method29687(this.aClass466_3));
		local6.aFloat295 *= -1.0F;
		local6.method29483(this.aClass121_16.method9608(1765955233));
		return local6;
	}

	@OriginalMember(owner = "client!anm", name = "as", descriptor = "()Lclient!oq;")
	public Class466 method16640() {
		return new Class466(this.aClass466_4);
	}

	@OriginalMember(owner = "client!anm", name = "q", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23090(@OriginalArg(0) Packet arg0) {
		this.aClass466_4.method29644(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "h", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23091(@OriginalArg(0) Packet arg0) {
		this.aClass466_4.method29644(arg0);
	}

	@OriginalMember(owner = "client!anm", name = "aj", descriptor = "(Lclient!oq;)V")
	public void method16641(@OriginalArg(0) Class466 arg0) {
		this.aClass466_3.aFloat301 = arg0.aFloat301;
		this.aClass466_3.aFloat299 = arg0.aFloat299;
		this.aClass466_3.aFloat300 = arg0.aFloat300;
		this.aClass466_3.aFloat298 = arg0.aFloat298;
		this.aClass466_4.method29647(this.aClass466_3);
	}

	@OriginalMember(owner = "client!anm", name = "ac", descriptor = "(Lclient!oq;)V")
	public void method16642(@OriginalArg(0) Class466 arg0) {
		this.aClass466_3.aFloat301 = arg0.aFloat301;
		this.aClass466_3.aFloat299 = arg0.aFloat299;
		this.aClass466_3.aFloat300 = arg0.aFloat300;
		this.aClass466_3.aFloat298 = arg0.aFloat298;
		this.aClass466_4.method29647(this.aClass466_3);
	}

	@OriginalMember(owner = "client!anm", name = "ae", descriptor = "(Lclient!on;)V")
	void method16643(@OriginalArg(0) Class463 arg0) {
		if (aFloat153 != -1.0F && arg0.aFloat297 < aFloat153) {
			arg0.aFloat297 = aFloat153;
		}
		if (aFloat154 != -1.0F && arg0.aFloat297 > aFloat154) {
			arg0.aFloat297 = aFloat154;
		}
		if (aFloat152 != -1.0F && arg0.aFloat295 < aFloat152) {
			arg0.aFloat295 = aFloat152;
		}
		if (aFloat155 != -1.0F && arg0.aFloat295 > aFloat155) {
			arg0.aFloat295 = aFloat155;
		}
		if (-1.0F != aFloat156 && arg0.aFloat296 < aFloat156) {
			arg0.aFloat296 = aFloat156;
		}
		if (aFloat157 != -1.0F && arg0.aFloat296 > aFloat157) {
			arg0.aFloat296 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!anm", name = "ab", descriptor = "(I)V")
	public void method16644(@OriginalArg(0) int arg0) {
		anInt2325 = arg0 * 195009917;
	}

	@OriginalMember(owner = "client!anm", name = "al", descriptor = "(I)V")
	public void method16645(@OriginalArg(0) int arg0) {
		anInt2325 = arg0 * 195009917;
	}

	@OriginalMember(owner = "client!anm", name = "ah", descriptor = "(I)V")
	public void method16646(@OriginalArg(0) int arg0) {
		anInt2324 = arg0 * 1129166485;
	}

	@OriginalMember(owner = "client!anm", name = "af", descriptor = "(I)V")
	public void method16647(@OriginalArg(0) int arg0) {
		anInt2323 = arg0 * -1495953529;
	}

	@OriginalMember(owner = "client!anm", name = "bg", descriptor = "()Lclient!oq;")
	public Class466 method16648() {
		return new Class466(this.aClass466_4);
	}

	@OriginalMember(owner = "client!anm", name = "b", descriptor = "(II)V")
	public void method16649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2323 = arg0 * -1495953529;
	}

	@OriginalMember(owner = "client!anm", name = "ax", descriptor = "(II)V")
	public void method16650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2322 = arg0 * -847372467;
	}

	@OriginalMember(owner = "client!anm", name = "ad", descriptor = "(I)V")
	public void method16651(@OriginalArg(0) int arg0) {
		anInt2322 = arg0 * -847372467;
	}

	@OriginalMember(owner = "client!anm", name = "aa", descriptor = "(III)V")
	public void method16652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29764(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class468 local22 = new Class468();
		local3.method29790(local22.aFloatArray107);
		@Pc(30) Class466 local30 = local22.method29729();
		local30.method29701();
		this.aClass466_4.method29647(local30);
	}

	@OriginalMember(owner = "client!anm", name = "an", descriptor = "(III)V")
	public void method16653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29764(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class468 local22 = new Class468();
		local3.method29790(local22.aFloatArray107);
		@Pc(30) Class466 local30 = local22.method29729();
		local30.method29701();
		this.aClass466_4.method29647(local30);
	}

	@OriginalMember(owner = "client!anm", name = "am", descriptor = "(I)V")
	public void method16654(@OriginalArg(0) int arg0) {
		anInt2323 = arg0 * -1495953529;
	}

	@OriginalMember(owner = "client!anm", name = "at", descriptor = "(I)V")
	public void method16655(@OriginalArg(0) int arg0) {
		anInt2322 = arg0 * -847372467;
	}

	@OriginalMember(owner = "client!anm", name = "ap", descriptor = "(Lclient!on;IIIIII)V")
	public void method16656(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat153 = arg1 == -1 ? -1.0F : arg0.aFloat297 - (float) (arg1 * 512);
		aFloat154 = arg2 == -1 ? -1.0F : arg0.aFloat297 + (float) (arg2 * 512);
		aFloat152 = arg5 == -1 ? -1.0F : -arg0.aFloat295 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.aFloat295;
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat296 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat296;
	}

	@OriginalMember(owner = "client!anm", name = "ar", descriptor = "(Lclient!on;IIIIII)V")
	public void method16657(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat153 = arg1 == -1 ? -1.0F : arg0.aFloat297 - (float) (arg1 * 512);
		aFloat154 = arg2 == -1 ? -1.0F : arg0.aFloat297 + (float) (arg2 * 512);
		aFloat152 = arg5 == -1 ? -1.0F : -arg0.aFloat295 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.aFloat295;
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat296 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat296;
	}

	@OriginalMember(owner = "client!anm", name = "au", descriptor = "(Lclient!on;IIIIII)V")
	public void method16658(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat153 = arg1 == -1 ? -1.0F : arg0.aFloat297 - (float) (arg1 * 512);
		aFloat154 = arg2 == -1 ? -1.0F : arg0.aFloat297 + (float) (arg2 * 512);
		aFloat152 = arg5 == -1 ? -1.0F : -arg0.aFloat295 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.aFloat295;
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat296 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat296;
	}

	@OriginalMember(owner = "client!anm", name = "az", descriptor = "()Lclient!oq;")
	public Class466 method16659() {
		return new Class466(this.aClass466_4);
	}

	@OriginalMember(owner = "client!anm", name = "ao", descriptor = "(B)Lclient!oq;")
	public Class466 method16660(@OriginalArg(0) byte arg0) {
		return new Class466(this.aClass466_4);
	}

	@OriginalMember(owner = "client!anm", name = "aw", descriptor = "()Lclient!oq;")
	public Class466 method16661() {
		return new Class466(this.aClass466_4);
	}

	@OriginalMember(owner = "client!anm", name = "n", descriptor = "(II)V")
	public void method16662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2325 = arg0 * 195009917;
	}

	@OriginalMember(owner = "client!anm", name = "d", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23088(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(1355142806));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		arg1.method29770(Class466.method29687(this.aClass466_4));
		arg1.method29782(local5);
		arg1.method29768();
		local5.method29557();
	}

	@OriginalMember(owner = "client!anm", name = "z", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23087(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(750439711));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		arg1.method29770(Class466.method29687(this.aClass466_4));
		arg1.method29782(local5);
		arg1.method29768();
		local5.method29557();
	}

	@OriginalMember(owner = "client!anm", name = "p", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23079(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(-577284242));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		arg1.method29770(Class466.method29687(this.aClass466_4));
		arg1.method29782(local5);
		arg1.method29768();
		local5.method29557();
	}

	@OriginalMember(owner = "client!anm", name = "v", descriptor = "(Lclient!jl;Lclient!ov;IIF)V")
	@Override
	public void method23095(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class463 local5 = Class463.method29472(this.aClass121_16.method9608(1223988430));
		local5.aFloat297 -= arg2;
		local5.aFloat296 -= arg3;
		local5.aFloat295 *= -1.0F;
		arg1.method29770(Class466.method29687(this.aClass466_4));
		arg1.method29782(local5);
		arg1.method29768();
		local5.method29557();
	}
}
