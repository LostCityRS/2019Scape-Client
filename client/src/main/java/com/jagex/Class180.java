package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public class Class180 implements Interface19 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	int anInt3313;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	int anInt3314;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[F")
	float[] aFloatArray91;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V", line = 10)
	Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3313 = arg0 * -721630437;
		this.anInt3314 = arg1 * 1475083349;
		this.aFloatArray91 = new float[this.anInt3314 * 139010301 * -1487890669 * this.anInt3313];
	}

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "()I", line = 17)
	@Override
	public int method30889() {
		return this.anInt3313 * -1487890669;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "()I", line = 17)
	@Override
	public int method30886() {
		return this.anInt3313 * -1487890669;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()I", line = 17)
	@Override
	public int method30890() {
		return this.anInt3313 * -1487890669;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(IB)Lclient!im;", line = 18)
	public static Class342 method24518(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class342.aClass342_4.anInt4188 * -1676947525 == arg0) {
			return Class342.aClass342_4;
		} else if (Class342.aClass342_3.anInt4188 * -1676947525 == arg0) {
			return Class342.aClass342_3;
		} else if (Class342.aClass342_7.anInt4188 * -1676947525 == arg0) {
			return Class342.aClass342_7;
		} else if (arg0 == Class342.aClass342_5.anInt4188 * -1676947525) {
			return Class342.aClass342_5;
		} else if (Class342.aClass342_6.anInt4188 * -1676947525 == arg0) {
			return Class342.aClass342_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "()I", line = 21)
	@Override
	public int method30887() {
		return this.anInt3314 * 139010301;
	}

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "()I", line = 21)
	@Override
	public int method30888() {
		return this.anInt3314 * 139010301;
	}

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "()I", line = 21)
	@Override
	public int method30891() {
		return this.anInt3314 * 139010301;
	}

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "()V", line = 24)
	@Override
	public void method30884() {
	}

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "()V", line = 24)
	@Override
	public void method30885() {
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(Lclient!abv;Lclient!alw;I)Lclient!abw;", line = 44)
	public static Class48 method24519(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2) {
		return Class115.method8196(arg0, arg1, 2, 311651813);
	}

	@OriginalMember(owner = "client!bc", name = "su", descriptor = "(Lclient!yf;I)V", line = 8271)
	static final void method24520(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4035 * -220894753;
	}

	@OriginalMember(owner = "client!bc", name = "xj", descriptor = "(Lclient!yf;I)V", line = 9208)
	static final void method24521(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class23.method498(local13, local23, true, -1836358656);
	}

	@OriginalMember(owner = "client!bc", name = "aoj", descriptor = "(Lclient!yf;I)V", line = 12521)
	static final void method24522(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(41) Class472 local41 = Class472.method29535((float) local13, (float) local23, (float) local33);
		Class65.aClass123_Sub1_2.method8971(local41, -4089155);
		local41.method29544();
	}
}
