package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anc")
public class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!anc", name = "n", descriptor = "Lclient!ox;")
	final Class472 aClass472_48 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anc", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_49 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anc", name = "k", descriptor = "Lclient!ox;")
	final Class472 aClass472_50 = new Class472();

	@OriginalMember(owner = "client!anc", name = "e", descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;", line = 11)
	public static String method16018(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class138_Sub3.method11406(local16, 1973178655);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!anc", name = "<init>", descriptor = "(Lclient!je;)V", line = 16)
	public Class25_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "q", descriptor = "(Lclient!akt;B)V", line = 20)
	public void method16019(@OriginalArg(0) Class93_Sub30 arg0, @OriginalArg(1) byte arg1) {
		this.aClass472_49.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat317)) {
			this.aClass472_48.method29550(this.aClass472_49);
			this.aClass472_50.method29553();
		}
	}

	@OriginalMember(owner = "client!anc", name = "x", descriptor = "(Lclient!akt;)V", line = 20)
	public void method16020(@OriginalArg(0) Class93_Sub30 arg0) {
		this.aClass472_49.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat317)) {
			this.aClass472_48.method29550(this.aClass472_49);
			this.aClass472_50.method29553();
		}
	}

	@OriginalMember(owner = "client!anc", name = "b", descriptor = "(Lclient!akt;)V", line = 20)
	public void method16021(@OriginalArg(0) Class93_Sub30 arg0) {
		this.aClass472_49.aFloat317 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat318 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat319 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat317)) {
			this.aClass472_48.method29550(this.aClass472_49);
			this.aClass472_50.method29553();
		}
	}

	@OriginalMember(owner = "client!anc", name = "l", descriptor = "(F)V", line = 30)
	@Override
	public void method23132(@OriginalArg(0) float arg0) {
		this.aClass123_16.method8931(false, arg0, this.aClass472_48, this.aClass123_16.method9049(975758127), this.aClass472_49, this.aClass472_50, (byte) -19);
	}

	@OriginalMember(owner = "client!anc", name = "u", descriptor = "(F)V", line = 30)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
		this.aClass123_16.method8931(false, arg0, this.aClass472_48, this.aClass123_16.method9049(44780007), this.aClass472_49, this.aClass472_50, (byte) -2);
	}

	@OriginalMember(owner = "client!anc", name = "e", descriptor = "(FB)V", line = 30)
	@Override
	public void method23122(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aClass123_16.method8931(false, arg0, this.aClass472_48, this.aClass123_16.method9049(1984510670), this.aClass472_49, this.aClass472_50, (byte) 17);
	}

	@OriginalMember(owner = "client!anc", name = "n", descriptor = "(I)Z", line = 34)
	@Override
	public boolean method23136(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_48.aFloat317);
	}

	@OriginalMember(owner = "client!anc", name = "z", descriptor = "()Z", line = 34)
	@Override
	public boolean method23129() {
		return !Float.isNaN(this.aClass472_48.aFloat317);
	}

	@OriginalMember(owner = "client!anc", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 38)
	@Override
	public void method23127(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(5) Class472 local5 = Class472.method29537(this.aClass123_16.method9025(-2006254837));
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		@Pc(29) Class472 local29 = Class472.method29537(this.aClass472_48);
		local29.aFloat317 -= arg2;
		local29.aFloat319 -= arg3;
		local29.aFloat318 *= -1.0F;
		arg1.method29372((double) local5.aFloat317, (double) local5.aFloat318, (double) local5.aFloat319, (double) local29.aFloat317, (double) local29.aFloat318, (double) local29.aFloat319, 0.0F, 1.0F, 0.0F);
		local5.method29544();
		local29.method29544();
	}

	@OriginalMember(owner = "client!anc", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 38)
	@Override
	public void method23130(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29537(this.aClass123_16.method9025(-1240354525));
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		@Pc(29) Class472 local29 = Class472.method29537(this.aClass472_48);
		local29.aFloat317 -= arg2;
		local29.aFloat319 -= arg3;
		local29.aFloat318 *= -1.0F;
		arg1.method29372((double) local5.aFloat317, (double) local5.aFloat318, (double) local5.aFloat319, (double) local29.aFloat317, (double) local29.aFloat318, (double) local29.aFloat319, 0.0F, 1.0F, 0.0F);
		local5.method29544();
		local29.method29544();
	}

	@OriginalMember(owner = "client!anc", name = "d", descriptor = "()Lclient!ox;", line = 52)
	@Override
	public Class472 method23131() {
		return Class472.method29537(this.aClass472_48);
	}

	@OriginalMember(owner = "client!anc", name = "m", descriptor = "(I)Lclient!ox;", line = 52)
	@Override
	public Class472 method23124(@OriginalArg(0) int arg0) {
		return Class472.method29537(this.aClass472_48);
	}

	@OriginalMember(owner = "client!anc", name = "k", descriptor = "(I)Lclient!ox;", line = 56)
	@Override
	public Class472 method23126(@OriginalArg(0) int arg0) {
		return Class472.method29537(this.aClass472_49);
	}

	@OriginalMember(owner = "client!anc", name = "s", descriptor = "()Lclient!ox;", line = 56)
	@Override
	public Class472 method23121() {
		return Class472.method29537(this.aClass472_49);
	}

	@OriginalMember(owner = "client!anc", name = "y", descriptor = "()Lclient!ox;", line = 56)
	@Override
	public Class472 method23137() {
		return Class472.method29537(this.aClass472_49);
	}

	@OriginalMember(owner = "client!anc", name = "o", descriptor = "(Lclient!alw;)V", line = 60)
	@Override
	public void method23135(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29546(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "w", descriptor = "(Lclient!alw;I)V", line = 60)
	@Override
	public void method23123(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_49.method29546(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "c", descriptor = "(Lclient!alw;)V", line = 60)
	@Override
	public void method23125(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29546(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "r", descriptor = "(Lclient!alw;)V", line = 60)
	@Override
	public void method23133(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29546(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "v", descriptor = "(Lclient!alw;)V", line = 60)
	@Override
	public void method23134(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29546(arg0);
	}
}
