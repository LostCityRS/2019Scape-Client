package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jx")
public class Class371 {

	@OriginalMember(owner = "client!jx", name = "n", descriptor = "I")
	static final int anInt4593 = 2048;

	@OriginalMember(owner = "client!jx", name = "k", descriptor = "I")
	static final int anInt4594 = 6;

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "I")
	static final int anInt4595 = 2;

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "I")
	static final int anInt4596 = 11;

	@OriginalMember(owner = "client!jx", name = "f", descriptor = "[I")
	static int[] anIntArray432 = new int[512];

	static {
		@Pc(4) byte local4 = 9;
		for (@Pc(8) int local8 = local4 - 1; local8 >= 0; local8--) {
			@Pc(18) int local18 = 0x1 << local4 - local8 - 1;
			@Pc(24) int local24 = 0x1 << local4 - local8;
			for (@Pc(26) int local26 = local18; local26 < local24; local26++) {
				anIntArray432[local26] = (local24 - local26 << 6 >>> local4 - local8 - 1) + (local8 << 6);
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "(IJ)Lclient!ars;", line = 47)
	static Class93_Sub1_Sub11 method28000(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Class93_Sub1_Sub11.aBoolean506 = false;
		@Pc(11) Class93_Sub1_Sub11 local11 = (Class93_Sub1_Sub11) Class93_Sub1_Sub11.aClass16_17.method214((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class93_Sub1_Sub11(arg0, arg1);
			Class93_Sub1_Sub11.aClass16_17.method220(local11, local11.aLong232 * -3750704643647536275L);
			Class93_Sub1_Sub11.aBoolean506 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "(B)V", line = 93)
	public static final void method28001(@OriginalArg(0) byte arg0) {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method428((byte) 52); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_18.method442(1145395438)) {
			if (local4.aBoolean309) {
				local4.method23969(-386141128);
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.world.method30459(1941313512) && local4.anInt1464 * 275343381 < client.world.method30466((short) 128)) {
					Class593.method31714(local4, (byte) 91);
				}
			}
		}
		for (local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method428((byte) 41); local4 != null; local4 = (Class93_Sub8) Class93_Sub8.aClass22_19.method442(1276733339)) {
			if (local4.aBoolean309) {
				local4.method23969(15341450);
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "dd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5478)
	static final void method28002(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091];
		arg0.anInt4045 = -678873919;
		if (arg0.anInt3995 * -1566573331 != local12) {
			arg0.anInt3995 = local12 * 2027274469;
			Class354.method27694(arg0, -1174743804);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class542.method30935(arg0.anInt3953 * -1549590237, (byte) 85);
		}
	}

	@OriginalMember(owner = "client!jx", name = "vb", descriptor = "(Lclient!yf;B)V", line = 8748)
	static final void method28003(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class328.method27326(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!jx", name = "aer", descriptor = "(Lclient!yf;I)V", line = 10274)
	static final void method28004(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 & -1 - (0x1 << local23);
	}

	@OriginalMember(owner = "client!jx", name = "afe", descriptor = "(Lclient!yf;I)V", line = 10497)
	static final void method28005(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13.toLowerCase();
	}

	@OriginalMember(owner = "client!jx", name = "anf", descriptor = "(Lclient!yf;B)V", line = 12192)
	static final void method28006(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3484 * 1974760385 - client.anInt3576 * 522759457;
	}

	@OriginalMember(owner = "client!jx", name = "axj", descriptor = "(Lclient!yf;I)V", line = 13912)
	static final void method28007(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!jx", name = "ayd", descriptor = "(Lclient!yf;I)V", line = 14036)
	static final void method28008(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}
}
