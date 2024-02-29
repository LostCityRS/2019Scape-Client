package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anw")
public class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!anw", name = "k", descriptor = "Z")
	boolean aBoolean367;

	@OriginalMember(owner = "client!anw", name = "n", descriptor = "Lclient!jn;")
	Interface29 anInterface29_2;

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_52 = new Class472();

	@OriginalMember(owner = "client!anw", name = "f", descriptor = "Lclient!ox;")
	final Class472 aClass472_53 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anw", name = "w", descriptor = "Lclient!ox;")
	final Class472 aClass472_51 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anw", name = "l", descriptor = "Lclient!ox;")
	final Class472 aClass472_54 = new Class472();

	@OriginalMember(owner = "client!anw", name = "<init>", descriptor = "(Lclient!je;)V", line = 20)
	public Class25_Sub5(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anw", name = "q", descriptor = "(Lclient!jn;Lclient!ox;ZI)V", line = 24)
	public void method16472(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29550(arg1);
		this.aBoolean367 = arg2;
		arg0.method19938((byte) 65);
	}

	@OriginalMember(owner = "client!anw", name = "h", descriptor = "(Lclient!jn;Lclient!ox;Z)V", line = 24)
	public void method16473(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29550(arg1);
		this.aBoolean367 = arg2;
		arg0.method19938((byte) 96);
	}

	@OriginalMember(owner = "client!anw", name = "a", descriptor = "(Lclient!jn;Lclient!ox;Z)V", line = 24)
	public void method16474(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29550(arg1);
		this.aBoolean367 = arg2;
		arg0.method19938((byte) 91);
	}

	@OriginalMember(owner = "client!anw", name = "g", descriptor = "(Lclient!jn;Lclient!ox;Z)V", line = 24)
	public void method16475(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29550(arg1);
		this.aBoolean367 = arg2;
		arg0.method19938((byte) 114);
	}

	@OriginalMember(owner = "client!anw", name = "i", descriptor = "(Lclient!jn;Lclient!ox;Z)V", line = 24)
	public void method16476(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29550(arg1);
		this.aBoolean367 = arg2;
		arg0.method19938((byte) 62);
	}

	@OriginalMember(owner = "client!anw", name = "x", descriptor = "(I)V", line = 31)
	public void method16477(@OriginalArg(0) int arg0) {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-1543105430).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "ag", descriptor = "()V", line = 31)
	public void method16478() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-1692104186).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "j", descriptor = "()V", line = 31)
	public void method16479() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-1844885721).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "t", descriptor = "()V", line = 31)
	public void method16480() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-1707053059).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "ae", descriptor = "()V", line = 31)
	public void method16481() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-1789369804).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "ah", descriptor = "()V", line = 31)
	public void method16482() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method9018(-2045939413).method36705(this.anInterface29_2.method19946(65280), this.anInterface29_2.method19941(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "l", descriptor = "(F)V", line = 37)
	@Override
	public void method23132(@OriginalArg(0) float arg0) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29550(this.anInterface29_2.method19938((byte) 35).method13881(-401610637));
			this.aClass123_16.method8931(false, arg0, this.aClass472_53, this.aClass123_16.method9049(1750744935), this.aClass472_51, this.aClass472_54, (byte) -88);
		}
	}

	@OriginalMember(owner = "client!anw", name = "e", descriptor = "(FB)V", line = 37)
	@Override
	public void method23122(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29550(this.anInterface29_2.method19938((byte) 45).method13881(-1418517391));
			this.aClass123_16.method8931(false, arg0, this.aClass472_53, this.aClass123_16.method9049(2101651103), this.aClass472_51, this.aClass472_54, (byte) -12);
		}
	}

	@OriginalMember(owner = "client!anw", name = "u", descriptor = "(F)V", line = 37)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29550(this.anInterface29_2.method19938((byte) 24).method13881(553862716));
			this.aClass123_16.method8931(false, arg0, this.aClass472_53, this.aClass123_16.method9049(1216027066), this.aClass472_51, this.aClass472_54, (byte) 17);
		}
	}

	@OriginalMember(owner = "client!anw", name = "n", descriptor = "(I)Z", line = 43)
	@Override
	public boolean method23136(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_53.aFloat317);
	}

	@OriginalMember(owner = "client!anw", name = "z", descriptor = "()Z", line = 43)
	@Override
	public boolean method23129() {
		return !Float.isNaN(this.aClass472_53.aFloat317);
	}

	@OriginalMember(owner = "client!anw", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 47)
	@Override
	public void method23130(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29537(this.aClass123_16.method9025(-1719464790));
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		@Pc(29) Class472 local29 = this.method23124(-1393426412);
		local29.aFloat317 -= arg2;
		local29.aFloat319 -= arg3;
		local29.aFloat318 *= -1.0F;
		arg1.method29372((double) local5.aFloat317, (double) local5.aFloat318, (double) local5.aFloat319, (double) local29.aFloat317, (double) local29.aFloat318, (double) local29.aFloat319, 0.0F, 1.0F, 0.0F);
		local5.method29544();
		local29.method29544();
	}

	@OriginalMember(owner = "client!anw", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 47)
	@Override
	public void method23127(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(5) Class472 local5 = Class472.method29537(this.aClass123_16.method9025(-446994613));
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		@Pc(29) Class472 local29 = this.method23124(-290218276);
		local29.aFloat317 -= arg2;
		local29.aFloat319 -= arg3;
		local29.aFloat318 *= -1.0F;
		arg1.method29372((double) local5.aFloat317, (double) local5.aFloat318, (double) local5.aFloat319, (double) local29.aFloat317, (double) local29.aFloat318, (double) local29.aFloat319, 0.0F, 1.0F, 0.0F);
		local5.method29544();
		local29.method29544();
	}

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "(I)Lclient!ox;", line = 61)
	@Override
	public Class472 method23124(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_53);
		@Pc(7) Class472 local7 = Class472.method29537(this.aClass472_52);
		if (this.aBoolean367) {
			local7.method29623(this.anInterface29_2.method19939(65535));
		}
		local3.method29567(local7);
		local7.method29544();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "d", descriptor = "()Lclient!ox;", line = 61)
	@Override
	public Class472 method23131() {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_53);
		@Pc(7) Class472 local7 = Class472.method29537(this.aClass472_52);
		if (this.aBoolean367) {
			local7.method29623(this.anInterface29_2.method19939(65535));
		}
		local3.method29567(local7);
		local7.method29544();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "k", descriptor = "(I)Lclient!ox;", line = 70)
	@Override
	public Class472 method23126(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29537(this.aClass472_52);
		if (this.aBoolean367) {
			local7.method29623(this.anInterface29_2.method19939(65535));
		}
		local3.method29567(local7);
		local7.method29544();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "s", descriptor = "()Lclient!ox;", line = 70)
	@Override
	public Class472 method23121() {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29537(this.aClass472_52);
		if (this.aBoolean367) {
			local7.method29623(this.anInterface29_2.method19939(65535));
		}
		local3.method29567(local7);
		local7.method29544();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "y", descriptor = "()Lclient!ox;", line = 70)
	@Override
	public Class472 method23137() {
		@Pc(3) Class472 local3 = Class472.method29537(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29537(this.aClass472_52);
		if (this.aBoolean367) {
			local7.method29623(this.anInterface29_2.method19939(65535));
		}
		local3.method29567(local7);
		local7.method29544();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "ai", descriptor = "()Lclient!ox;", line = 79)
	public Class472 method16483() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "b", descriptor = "(I)Lclient!ox;", line = 79)
	public Class472 method16484(@OriginalArg(0) int arg0) {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "al", descriptor = "()Lclient!ox;", line = 79)
	public Class472 method16485() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "ac", descriptor = "()Lclient!ox;", line = 79)
	public Class472 method16486() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "w", descriptor = "(Lclient!alw;I)V", line = 83)
	@Override
	public void method23123(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22465((short) 16384), -2127878358);
		@Pc(9) int local9 = arg0.method22472(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method9018(-1921359625).method36705(local5, local9, (byte) 32);
		this.aClass472_52.method29546(arg0);
		if (arg0.method22465((short) 16384) == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "v", descriptor = "(Lclient!alw;)V", line = 83)
	@Override
	public void method23134(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22465((short) 16384), -2046023789);
		@Pc(9) int local9 = arg0.method22472(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method9018(-1636717958).method36705(local5, local9, (byte) 32);
		this.aClass472_52.method29546(arg0);
		if (arg0.method22465((short) 16384) == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "c", descriptor = "(Lclient!alw;)V", line = 83)
	@Override
	public void method23125(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22465((short) 16384), -2004967171);
		@Pc(9) int local9 = arg0.method22472(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method9018(-1606557995).method36705(local5, local9, (byte) 32);
		this.aClass472_52.method29546(arg0);
		if (arg0.method22465((short) 16384) == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "r", descriptor = "(Lclient!alw;)V", line = 83)
	@Override
	public void method23133(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22465((short) 16384), -2065185880);
		@Pc(9) int local9 = arg0.method22472(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method9018(-1608360168).method36705(local5, local9, (byte) 32);
		this.aClass472_52.method29546(arg0);
		if (arg0.method22465((short) 16384) == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "o", descriptor = "(Lclient!alw;)V", line = 83)
	@Override
	public void method23135(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22465((short) 16384), -2019436694);
		@Pc(9) int local9 = arg0.method22472(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method9018(-1782321774).method36705(local5, local9, (byte) 32);
		this.aClass472_52.method29546(arg0);
		if (arg0.method22465((short) 16384) == 1) {
			this.aBoolean367 = true;
		} else {
			this.aBoolean367 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "acs", descriptor = "(Lclient!yf;I)V", line = 10062)
	static final void method16487(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class144.method11158(local13, local28, (byte) 11);
	}

	@OriginalMember(owner = "client!anw", name = "azc", descriptor = "(Lclient!yf;I)V", line = 14177)
	static final void method16488(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15867((byte) 27) ? 1 : 0;
	}
}
