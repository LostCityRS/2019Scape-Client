package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public class Class437 {

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	static final int anInt4812 = 4;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	static final int anInt4813 = 1;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	static final int anInt4814 = 9;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	static final int anInt4815 = 11;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	static final int anInt4816 = 6;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	static final int anInt4817 = 7;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	static final int anInt4818 = 5;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	static final int anInt4819 = 2;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	static final int anInt4820 = 13;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	static final int anInt4821 = 3;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	static final int anInt4822 = 8;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	static final int anInt4823 = 10;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	static final int anInt4824 = 12;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 18)
	Class437() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "(Lclient!alw;I)V", line = 124)
	static void method28816(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			switch(local3) {
				case 0:
					Class249.anInt3841 = arg0.method22472(-1434290800) * -1784392859;
					Class249.anInt3839 = arg0.method22472(-1434290800) * -1584427833;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "jq", descriptor = "(Lclient!yf;B)V", line = 6681)
	static final void method28817(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!nh", name = "agz", descriptor = "(Lclient!yf;I)V", line = 10741)
	static final void method28818(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12, -342431525);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt176 * 44122389;
	}

	@OriginalMember(owner = "client!nh", name = "azf", descriptor = "(Lclient!yf;I)V", line = 14205)
	static final void method28819(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nh", name = "bcs", descriptor = "(Lclient!yf;I)V", line = 14691)
	static final void method28820(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
