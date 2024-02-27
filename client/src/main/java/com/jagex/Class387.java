package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class387 implements Interface75 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!ks;")
	static final Class387 aClass387_12 = new Class387(14, 1);

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "Lclient!ks;")
	static final Class387 aClass387_5 = new Class387(7, 2);

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!ks;")
	static final Class387 aClass387_15 = new Class387(3, 3);

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "Lclient!ks;")
	static final Class387 aClass387_3 = new Class387(8, 4);

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!ks;")
	static final Class387 aClass387_2 = new Class387(11, 5);

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "Lclient!ks;")
	static final Class387 aClass387_9 = new Class387(1, 6);

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!ks;")
	static final Class387 aClass387_6 = new Class387(5, 7);

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "Lclient!ks;")
	static final Class387 aClass387_7 = new Class387(13, 8);

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!ks;")
	static final Class387 aClass387_8 = new Class387(2, 9);

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "Lclient!ks;")
	static final Class387 aClass387_1 = new Class387(4, 10);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!ks;")
	static final Class387 aClass387_13 = new Class387(12, 11);

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!ks;")
	static final Class387 aClass387_11 = new Class387(6, 12);

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Lclient!ks;")
	static final Class387 aClass387_10 = new Class387(9, 13);

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Lclient!ks;")
	static final Class387 aClass387_4 = new Class387(10, 14);

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!ks;")
	static final Class387 aClass387_14 = new Class387(0, 15);

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	final int anInt4811;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	final int anInt4810;

	@OriginalMember(owner = "client!ks", name = "ad", descriptor = "(S)V")
	static void method28423(@OriginalArg(0) short arg0) {
		Class625.aTwitchWebcamDeviceArray1 = Class166_Sub13.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!ks", name = "awr", descriptor = "(Lclient!yf;B)V")
	static void method28424(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) (Class41.method815(local12, 1901014307) / 60000L);
	}

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "(Lclient!ep;Lclient!ao;B)I")
	static int method28425(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18274(182453511); local3++) {
			@Pc(14) Class347 local14 = (Class347) arg1.method18273(local3, -1593675311);
			if (local14.method27677(arg0, -458136851)) {
				local1 += local14.anInt4235 * 1554294991;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ks", name = "ij", descriptor = "(I)V")
	static void method28426(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class93_Sub1_Sub6 local4 = (Class93_Sub1_Sub6) client.aClass22_46.method445((byte) 112); local4 != null; local4 = (Class93_Sub1_Sub6) client.aClass22_46.method415(1757725388)) {
			@Pc(10) Class132_Sub1_Sub1_Sub4 local10 = local4.aClass132_Sub1_Sub1_Sub4_1;
			if (client.anInt3485 > local10.anInt3260 * -887925359) {
				local4.method23981(-615835135);
				local10.method23928(432516458);
			} else if (client.anInt3485 >= local10.anInt3259 * 1157227495) {
				local10.method23929(-224269410);
				@Pc(131) Class472 local131;
				if (local10.anInt3263 * -1986528751 > 0) {
					if (client.anInt3463 * 1819062465 == 0) {
						@Pc(52) Class132_Sub1_Sub1_Sub1 local52 = Class249.aClass239Array1[local10.anInt3263 * -1986528751 - 1].method25900(1211361205);
						if (local52 != null) {
							@Pc(58) Class472 local58 = local52.method24241().aClass472_61;
							if ((int) local58.aFloat325 >= 0 && (int) local58.aFloat325 < client.aClass532_1.method30625(-953249206) * 512 && (int) local58.aFloat327 >= 0 && (int) local58.aFloat327 < client.aClass532_1.method30655((short) 128) * 512) {
								local10.method23925((int) local58.aFloat325, (int) local58.aFloat327, Class305.method26894((int) local58.aFloat325, (int) local58.aFloat327, local52.aByte100, (byte) -64) - local10.anInt3258 * 1286439089, client.anInt3485, 149362265);
							}
						}
					} else {
						@Pc(121) Class93_Sub15 local121 = (Class93_Sub15) client.aClass16_18.method215((long) (local10.anInt3263 * -1986528751 - 1));
						if (local121 != null) {
							@Pc(127) Class132_Sub1_Sub1_Sub1_Sub1 local127 = (Class132_Sub1_Sub1_Sub1_Sub1) local121.anObject5;
							local131 = local127.method24241().aClass472_61;
							if ((int) local131.aFloat325 >= 0 && (int) local131.aFloat325 < client.aClass532_1.method30625(1489824965) * 512 && (int) local131.aFloat327 >= 0 && (int) local131.aFloat327 < client.aClass532_1.method30655((short) 128) * 512) {
								local10.method23925((int) local131.aFloat325, (int) local131.aFloat327, Class305.method26894((int) local131.aFloat325, (int) local131.aFloat327, local10.aByte100, (byte) -102) - local10.anInt3258 * 1286439089, client.anInt3485, -2057917338);
							}
						}
					}
				}
				if (local10.anInt3263 * -1986528751 < 0) {
					@Pc(195) int local195 = -(local10.anInt3263 * -1986528751) - 1;
					@Pc(202) Class132_Sub1_Sub1_Sub1_Sub2 local202;
					if (local195 == client.anInt3513 * -859840571) {
						local202 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local202 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local195];
					}
					if (local202 != null) {
						local131 = local202.method24241().aClass472_61;
						if ((int) local131.aFloat325 >= 0 && (int) local131.aFloat325 < client.aClass532_1.method30625(-992582904) * 512 && (int) local131.aFloat327 >= 0 && (int) local131.aFloat327 < client.aClass532_1.method30655((short) 128) * 512) {
							local10.method23925((int) local131.aFloat325, (int) local131.aFloat327, Class305.method26894((int) local131.aFloat325, (int) local131.aFloat327, local10.aByte100, (byte) -38) - local10.anInt3258 * 1286439089, client.anInt3485, -216685054);
						}
					}
				}
				local10.method23932(client.anInt3480 * 1820654295, 2124873095);
				client.aClass532_1.method30640(-978430498).method31678(local10, true, -2048479155);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(II)V")
	Class387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4811 = arg0 * -800606999;
		this.anInt4810 = arg1 * -738597137;
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt4810 * -1390671857;
	}

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt4810 * -1390671857;
	}
}
