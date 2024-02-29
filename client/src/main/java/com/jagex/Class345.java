package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public class Class345 implements Interface75 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!ip;")
	static final Class345 aClass345_3 = new Class345(0);

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!ip;")
	static final Class345 aClass345_1 = new Class345(1);

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Lclient!ip;")
	static final Class345 aClass345_2 = new Class345(2);

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	final int anInt4191;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(I)V", line = 44)
	Class345(@OriginalArg(0) int arg0) {
		this.anInt4191 = arg0 * -1554275711;
	}

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "()I", line = 49)
	@Override
	public int method36920() {
		return this.anInt4191 * 1395301761;
	}

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "()I", line = 49)
	@Override
	public int method36919() {
		return this.anInt4191 * 1395301761;
	}

	@OriginalMember(owner = "client!ip", name = "fw", descriptor = "(Lclient!yf;B)V", line = 5944)
	static final void method27561(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class257.method26022(local11, local14, arg0, (byte) 119);
	}

	@OriginalMember(owner = "client!ip", name = "fb", descriptor = "(Lclient!yf;I)V", line = 5985)
	static final void method27562(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class341.method27498(local11, local14, arg0, -112815327);
	}

	@OriginalMember(owner = "client!ip", name = "aac", descriptor = "(Lclient!yf;I)V", line = 9781)
	static final void method27563(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5682 * 1581594575) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aString92;
		}
	}

	@OriginalMember(owner = "client!ip", name = "azs", descriptor = "(Lclient!yf;I)V", line = 14169)
	static final void method27564(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16533(-1996816178) ? 1 : 0;
	}
}
