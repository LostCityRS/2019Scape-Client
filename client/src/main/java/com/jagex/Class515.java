package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
final class Class515 implements Interface9 {

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30270(@OriginalArg(0) Packet arg0) {
		return arg0.g8(-131010491);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30272(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		return arg0.g8(307981831);
	}

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30271(@OriginalArg(0) Packet arg0) {
		return arg0.g8(-1983145780);
	}

	@OriginalMember(owner = "client!qs", name = "jj", descriptor = "(Lclient!yf;B)V", line = 6693)
	static final void method30273(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!qs", name = "px", descriptor = "(Lclient!yf;I)V", line = 7776)
	static final void method30274(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class601.method31850(local11, local14, arg0, -1008736640);
	}

	@OriginalMember(owner = "client!qs", name = "aby", descriptor = "(Lclient!yf;I)V", line = 9931)
	static final void method30275(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class282) Class557.aClass297_1.method26616((byte) 73).get(local12)).method26465((byte) 95);
	}

	@OriginalMember(owner = "client!qs", name = "ku", descriptor = "(Lclient!hf;I)V", line = 11665)
	static void method30276(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt3971 * -158526639 == 5 && arg0.anInt4045 * 307668159 != -1) {
			Class676.method33168(Class694.aClass104_14, arg0, -855042021);
		}
	}

	@OriginalMember(owner = "client!qs", name = "bcc", descriptor = "(Lclient!yf;I)V", line = 14633)
	static final void method30277(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class569.aClass143_Sub1Array2.length; local5++) {
			if (Class569.aClass143_Sub1Array2[local5] != null && Class569.aClass143_Sub1Array2[local5].method11096(-1964309414)) {
				local1 += Class569.aClass143_Sub1Array2[local5].method11087((byte) -63);
				local3 += Class569.aClass143_Sub1Array2[local5].method11090(1609279939);
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}
}
