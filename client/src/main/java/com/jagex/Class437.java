package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class437 {

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	static final int anInt4973 = 4;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	static final int anInt4974 = 1;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	static final int anInt4975 = 9;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	static final int anInt4976 = 11;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	static final int anInt4977 = 6;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	static final int anInt4978 = 7;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	static final int anInt4979 = 5;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	static final int anInt4980 = 2;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	static final int anInt4981 = 13;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	static final int anInt4982 = 3;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	static final int anInt4983 = 8;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	static final int anInt4984 = 10;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	static final int anInt4985 = 12;

	@OriginalMember(owner = "client!nh", name = "jq", descriptor = "(Lclient!yf;B)V")
	static void method28997(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!nh", name = "agz", descriptor = "(Lclient!yf;I)V")
	static void method28998(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18273(local12, -342431525);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt176 * 44122389;
	}

	@OriginalMember(owner = "client!nh", name = "azf", descriptor = "(Lclient!yf;I)V")
	static void method28999(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "(Lclient!alw;I)V")
	static void method29000(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			switch(local3) {
				case 0:
					Class249.anInt3882 = arg0.method22427(-1434290800) * -1784392859;
					Class249.anInt3880 = arg0.method22427(-1434290800) * -1584427833;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "bcs", descriptor = "(Lclient!yf;I)V")
	static void method29001(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	Class437() throws Throwable {
		throw new Error();
	}
}
