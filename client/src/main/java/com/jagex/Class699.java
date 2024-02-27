package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!z")
public final class Class699 implements Interface31 {

	@OriginalMember(owner = "client!z", name = "n", descriptor = "(I)I")
	public static int method36887(@OriginalArg(0) int arg0) {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class104 local19 = Class5.method79(0, local3, null, null, null, null, null, null, 0, 636490669);
		@Pc(22) long local22 = Class305.method26889(1712770404);
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20863(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class305.method26889(-384106333) - local22);
		local19.method20612(0, 0, 100, 100, -16777216, (byte) 32);
		local19.method20889(-858326133);
		return local24;
	}

	@OriginalMember(owner = "client!z", name = "e", descriptor = "(B)V")
	static void method36888(@OriginalArg(0) byte arg0) {
		Class366.aClass240_80.method25926((byte) -112);
	}

	@OriginalMember(owner = "client!z", name = "nf", descriptor = "(Lclient!yf;B)V")
	static void method36889(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -668486315);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class170.method21496(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!z", name = "ca", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method36890(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean686 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
	}

	@OriginalMember(owner = "client!z", name = "aln", descriptor = "(Lclient!yf;B)V")
	static void method36891(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (Class4.aBoolean2) {
			Class717.method37076(3, local13, local23, false, (byte) 102);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class125_Sub2_Sub1.aFrame1 == null ? 0 : 1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!z", name = "<init>", descriptor = "()V")
	Class699() {
	}

	@OriginalMember(owner = "client!z", name = "n", descriptor = "(Lclient!jl;I)Lclient!jn;")
	@Override
	public Interface29 method36885(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method215((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!z", name = "e", descriptor = "(Lclient!jl;IB)Lclient!jn;")
	@Override
	public Interface29 method36886(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method215((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!z", name = "m", descriptor = "(Lclient!jl;I)Lclient!jn;")
	@Override
	public Interface29 method36884(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method215((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}
}
