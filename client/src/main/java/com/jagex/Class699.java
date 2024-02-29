package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!z")
public class Class699 implements Interface31 {

	@OriginalMember(owner = "client!z", name = "<init>", descriptor = "()V", line = 10)
	Class699() {
	}

	@OriginalMember(owner = "client!z", name = "n", descriptor = "(Lclient!jl;I)Lclient!jn;", line = 13)
	@Override
	public Interface29 method36704(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method214((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!z", name = "e", descriptor = "(Lclient!jl;IB)Lclient!jn;", line = 13)
	@Override
	public Interface29 method36705(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method214((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!z", name = "m", descriptor = "(Lclient!jl;I)Lclient!jn;", line = 13)
	@Override
	public Interface29 method36703(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1) {
		if (Class363.aClass363_1 == arg0) {
			return client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (Class363.aClass363_2 == arg0) {
			@Pc(15) Class93_Sub15 local15 = (Class93_Sub15) client.aClass16_18.method214((long) arg1);
			if (local15 != null) {
				return (Interface29) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!z", name = "n", descriptor = "(I)I", line = 16)
	public static int method36706(@OriginalArg(0) int arg0) {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class104 local19 = Class5.method40(0, local3, null, null, null, null, null, null, 0, 636490669);
		@Pc(22) long local22 = Class305.method26797(1712770404);
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20873(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class305.method26797(-384106333) - local22);
		local19.method20469(0, 0, 100, 100, -16777216, (byte) 32);
		local19.method20429(-858326133);
		return local24;
	}

	@OriginalMember(owner = "client!z", name = "e", descriptor = "(B)V", line = 30)
	static void method36707(@OriginalArg(0) byte arg0) {
		Class366.aClass240_80.method25847((byte) -112);
	}

	@OriginalMember(owner = "client!z", name = "ca", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5357)
	static final void method36708(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean682 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
	}

	@OriginalMember(owner = "client!z", name = "nf", descriptor = "(Lclient!yf;B)V", line = 7466)
	static final void method36709(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -668486315);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class170.method21482(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!z", name = "aln", descriptor = "(Lclient!yf;B)V", line = 11834)
	static final void method36710(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (Class4.aBoolean2) {
			Class717.method36895(3, local13, local23, false, (byte) 102);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class125_Sub2_Sub1.aFrame1 == null ? 0 : 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}
}
