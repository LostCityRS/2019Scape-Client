package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acv")
public final class Class70 implements Interface75 {

	@OriginalMember(owner = "client!acv", name = "t", descriptor = "Lclient!acv;")
	public static final Class70 aClass70_2 = new Class70(0);

	@OriginalMember(owner = "client!acv", name = "f", descriptor = "Lclient!acv;")
	public static final Class70 aClass70_1 = new Class70(1);

	@OriginalMember(owner = "client!acv", name = "e", descriptor = "I")
	final int anInt219;

	@OriginalMember(owner = "client!acv", name = "le", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method1256(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.method27640(899420248);
	}

	@OriginalMember(owner = "client!acv", name = "aor", descriptor = "(Lclient!yp;I)V")
	static void method1257(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(51) Class463 local51 = Class463.method29541((float) local13, (float) local23, (float) local33);
		if (local51.aFloat297 == -1.0F) {
			local51.aFloat297 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat295) {
			local51.aFloat295 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat296) {
			local51.aFloat296 = Float.POSITIVE_INFINITY;
		}
		BufferedSocket.aClass121_Sub1_2.method9583(local51, -351030388);
		BufferedSocket.aClass121_Sub1_2.method9610((float) local43 / 1000.0F, 2077125254);
		local51.method29557();
	}

	@OriginalMember(owner = "client!acv", name = "ho", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method1258(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4136 = 1410832846;
		arg0.aClass350_2 = null;
		arg0.anInt4122 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -258024019;
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -128);
		}
	}

	@OriginalMember(owner = "client!acv", name = "<init>", descriptor = "(I)V")
	Class70(@OriginalArg(0) int arg0) {
		this.anInt219 = arg0 * -942557001;
	}

	@OriginalMember(owner = "client!acv", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt219 * 1517987079;
	}

	@OriginalMember(owner = "client!acv", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt219 * 1517987079;
	}

	@OriginalMember(owner = "client!acv", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt219 * 1517987079;
	}
}
