package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pz")
public class Class498 {

	@OriginalMember(owner = "client!pz", name = "b", descriptor = "I")
	public static final int anInt5176 = 8;

	@OriginalMember(owner = "client!pz", name = "y", descriptor = "I")
	public static final int anInt5177 = 2;

	@OriginalMember(owner = "client!pz", name = "x", descriptor = "I")
	public static final int anInt5178 = 0;

	@OriginalMember(owner = "client!pz", name = "k", descriptor = "I")
	public static final int anInt5179 = 4;

	@OriginalMember(owner = "client!pz", name = "f", descriptor = "I")
	public static final int anInt5180 = 10;

	@OriginalMember(owner = "client!pz", name = "w", descriptor = "I")
	public static final int anInt5181 = 17;

	@OriginalMember(owner = "client!pz", name = "e", descriptor = "I")
	public static final int anInt5182 = 5;

	@OriginalMember(owner = "client!pz", name = "u", descriptor = "I")
	public static final int anInt5183 = 13;

	@OriginalMember(owner = "client!pz", name = "z", descriptor = "I")
	public static final int anInt5184 = 6;

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "I")
	public static final int anInt5185 = 15;

	@OriginalMember(owner = "client!pz", name = "d", descriptor = "I")
	public static final int anInt5186 = 16;

	@OriginalMember(owner = "client!pz", name = "c", descriptor = "I")
	public static final int anInt5187 = 18;

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "I")
	public static final int anInt5188 = 9;

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "I")
	public static final int anInt5189 = 7;

	@OriginalMember(owner = "client!pz", name = "s", descriptor = "I")
	public static final int anInt5190 = 19;

	@OriginalMember(owner = "client!pz", name = "q", descriptor = "I")
	public static final int anInt5191 = 12;

	@OriginalMember(owner = "client!pz", name = "r", descriptor = "I")
	public static final int anInt5192 = 3;

	@OriginalMember(owner = "client!pz", name = "n", descriptor = "I")
	public static final int anInt5193 = 11;

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "I")
	public static final int anInt5194 = 14;

	@OriginalMember(owner = "client!pz", name = "m", descriptor = "I")
	public static final int anInt5195 = 1;

	@OriginalMember(owner = "client!pz", name = "<init>", descriptor = "()V", line = 25)
	Class498() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "(CB)Z", line = 186)
	public static boolean method30134(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pz", name = "ia", descriptor = "(III)V", line = 6367)
	static final void method30135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class172.anInt3179 = arg0 * 2004084007;
		Class172.anInt3174 = arg1 * -246739717;
		Class172.aBoolean521 = false;
		Class723.method36942(1363036726);
	}

	@OriginalMember(owner = "client!pz", name = "ow", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7549)
	static final void method30136(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30597(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray20 = Class499.method30149(local13, arg2, 1862392219);
		arg0.anIntArray374 = local18;
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!pz", name = "zs", descriptor = "(Lclient!yf;I)V", line = 9599)
	static final void method30137(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 != 2 || local12 >= client.anInt3444 * 862418793) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(26) Class281 local26 = client.aClass281Array1[local12];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local26.aString153;
		if (local26.aString154 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local26.aString154;
		}
	}

	@OriginalMember(owner = "client!pz", name = "aop", descriptor = "(Lclient!yf;I)V", line = 12562)
	static final void method30138(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_3 || Class65.aClass123_Sub1_2.method9020((byte) -43) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class472 local20 = ((Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -113)).method9181(1395049383);
		@Pc(27) Class472 local27 = ((Class25_Sub5) Class65.aClass123_Sub1_2.method9017(1038035701)).method16484(-115974587);
		@Pc(30) Class472 local30 = Class472.method29537(local20);
		local30.method29576(local27);
		@Pc(40) float local40 = Class608.method31937(local30.aFloat317, local30.aFloat319, -2006917831);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) ((double) local40 * 2607.5945876176133D) & 0x3FFF;
	}
}
