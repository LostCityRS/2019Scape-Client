package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dz")
public abstract class Class107 {

	@OriginalMember(owner = "client!dz", name = "<init>", descriptor = "()V", line = 4)
	Class107() {
	}

	@OriginalMember(owner = "client!dz", name = "n", descriptor = "([Lclient!za;II)Lclient!za;", line = 34)
	public static Interface75 method18116(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.getId()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dz", name = "u", descriptor = "(IZI)Ljava/lang/String;", line = 114)
	public static String method18117(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return arg1 && arg0 >= 0 ? Class703.method36723(arg0, 10, arg1, -235499267) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!dz", name = "z", descriptor = "([I[Ljava/lang/Object;I)V", line = 183)
	public static void method18118(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2) {
		Class350.method27635(arg0, arg1, 0, arg0.length - 1, -135837942);
	}

	@OriginalMember(owner = "client!dz", name = "r", descriptor = "(Lclient!dh;Lclient!vd;IIII)V", line = 400)
	static void method18119(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class610 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class65 local8 = (Class65) Class466.aClass32_Sub20_3.method18261(arg1.anInt5601 * -303013723, -930776699);
		if (local8.anInt232 * -1612489907 == -1) {
			return;
		}
		if (arg1.aBoolean832) {
			@Pc(25) int local25 = arg2 + arg1.anInt5602 * -104311805;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class100 local40 = local8.method1177(arg0, arg2, arg1.aBoolean836, 608157392);
		if (local40 == null) {
			return;
		}
		@Pc(48) int local48 = arg1.anInt5608 * 427800467;
		@Pc(53) int local53 = arg1.anInt5603 * -774442965;
		if ((arg2 & 0x1) == 1) {
			local48 = arg1.anInt5603 * -774442965;
			local53 = arg1.anInt5608 * 427800467;
		}
		@Pc(71) int local71 = local40.method18160();
		@Pc(74) int local74 = local40.method18193();
		if (local8.aBoolean30) {
			local71 = local48 * 4;
			local74 = local53 * 4;
		}
		if (local8.anInt233 * -1811914921 == 0) {
			local40.method18162(arg3, arg4 - (local53 - 1) * 4, local71, local74);
		} else {
			local40.method18166(arg3, arg4 - (local53 - 1) * 4, local71, local74, 0, local8.anInt233 * -1811914921 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!dz", name = "uz", descriptor = "(Lclient!yf;I)V", line = 8601)
	static final void method18120(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1478859549);
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.aString164;
	}

	@OriginalMember(owner = "client!dz", name = "zi", descriptor = "(Lclient!yf;B)V", line = 9413)
	static final void method18121(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean625 ? 1 : 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aString142 == null ? "" : client.aString142;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aString145 == null ? "" : client.aString145;
	}

	@OriginalMember(owner = "client!dz", name = "afv", descriptor = "(Lclient!yf;I)V", line = 10588)
	static final void method18122(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class36.method693((char) local12, 32598593) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dz", name = "any", descriptor = "(Lclient!yf;B)V", line = 12219)
	static final void method18123(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 == -1) {
			Class175.anInt3306 = 1395810859;
			Class444.anInt4895 = 783237131;
			return;
		}
		@Pc(21) int local21 = local12 >> 14 & 0x3FFF;
		@Pc(25) int local25 = local12 & 0x3FFF;
		@Pc(29) Class611 local29 = client.world.method30455(1893284929);
		local21 -= local29.anInt5623 * 270611681;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 >= client.world.method30459(-1357363239)) {
			local21 = client.world.method30459(1080896010);
		}
		local25 -= local29.anInt5624 * -1994307635;
		if (local25 < 0) {
			local25 = 0;
		} else if (local25 >= client.world.method30466((short) 128)) {
			local25 = client.world.method30466((short) 128);
		}
		Class175.anInt3306 = ((local21 << 9) + 256) * -1395810859;
		Class444.anInt4895 = ((local25 << 9) + 256) * -783237131;
	}
}
