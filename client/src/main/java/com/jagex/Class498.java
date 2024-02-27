package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pz")
public final class Class498 {

	@OriginalMember(owner = "client!pz", name = "b", descriptor = "I")
	public static final int anInt5337 = 8;

	@OriginalMember(owner = "client!pz", name = "y", descriptor = "I")
	public static final int anInt5338 = 2;

	@OriginalMember(owner = "client!pz", name = "x", descriptor = "I")
	public static final int anInt5339 = 0;

	@OriginalMember(owner = "client!pz", name = "k", descriptor = "I")
	public static final int anInt5340 = 4;

	@OriginalMember(owner = "client!pz", name = "f", descriptor = "I")
	public static final int anInt5341 = 10;

	@OriginalMember(owner = "client!pz", name = "w", descriptor = "I")
	public static final int anInt5342 = 17;

	@OriginalMember(owner = "client!pz", name = "e", descriptor = "I")
	public static final int anInt5343 = 5;

	@OriginalMember(owner = "client!pz", name = "u", descriptor = "I")
	public static final int anInt5344 = 13;

	@OriginalMember(owner = "client!pz", name = "z", descriptor = "I")
	public static final int anInt5345 = 6;

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "I")
	public static final int anInt5346 = 15;

	@OriginalMember(owner = "client!pz", name = "d", descriptor = "I")
	public static final int anInt5347 = 16;

	@OriginalMember(owner = "client!pz", name = "c", descriptor = "I")
	public static final int anInt5348 = 18;

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "I")
	public static final int anInt5349 = 9;

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "I")
	public static final int anInt5350 = 7;

	@OriginalMember(owner = "client!pz", name = "s", descriptor = "I")
	public static final int anInt5351 = 19;

	@OriginalMember(owner = "client!pz", name = "q", descriptor = "I")
	public static final int anInt5352 = 12;

	@OriginalMember(owner = "client!pz", name = "r", descriptor = "I")
	public static final int anInt5353 = 3;

	@OriginalMember(owner = "client!pz", name = "n", descriptor = "I")
	public static final int anInt5354 = 11;

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "I")
	public static final int anInt5355 = 14;

	@OriginalMember(owner = "client!pz", name = "m", descriptor = "I")
	public static final int anInt5356 = 1;

	@OriginalMember(owner = "client!pz", name = "ow", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method30315(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30778(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray20 = Class499.method30329(local13, arg2, 1862392219);
		arg0.anIntArray376 = local18;
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!pz", name = "zs", descriptor = "(Lclient!yf;I)V")
	static void method30316(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 != 2 || local12 >= client.anInt3444 * 862418793) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(26) Class281 local26 = client.aClass281Array1[local12];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local26.aString159;
		if (local26.aString160 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local26.aString160;
		}
	}

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "(CB)Z")
	public static boolean method30317(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pz", name = "ia", descriptor = "(III)V")
	static void method30318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class172.anInt3179 = arg0 * 2004084007;
		Class172.anInt3174 = arg1 * -246739717;
		Class172.aBoolean522 = false;
		Class723.method37124(1363036726);
	}

	@OriginalMember(owner = "client!pz", name = "aop", descriptor = "(Lclient!yf;I)V")
	static void method30319(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9023(-1662199153) != Class342.aClass342_3 || Class65.aClass123_Sub1_2.method8986((byte) -43) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class472 local20 = ((Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -113)).method9166(1395049383);
		@Pc(27) Class472 local27 = ((Class25_Sub5) Class65.aClass123_Sub1_2.method9040(1038035701)).method16488(-115974587);
		@Pc(30) Class472 local30 = Class472.method29711(local20);
		local30.method29764(local27);
		@Pc(40) float local40 = Class608.method32140(local30.aFloat325, local30.aFloat327, -2006917831);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) ((double) local40 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!pz", name = "<init>", descriptor = "()V")
	Class498() throws Throwable {
		throw new Error();
	}
}
