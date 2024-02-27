package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class511 {

	@OriginalMember(owner = "client!qn", name = "on", descriptor = "Ljava/lang/String;")
	static String aString229;

	@OriginalMember(owner = "client!qn", name = "rw", descriptor = "I")
	static int anInt5369;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!qn;")
	static final Class511 aClass511_7 = new Class511(0);

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!qn;")
	public static final Class511 aClass511_2 = new Class511(1);

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Lclient!qn;")
	static final Class511 aClass511_3 = new Class511(2);

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "Lclient!qn;")
	public static final Class511 aClass511_4 = new Class511(3);

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!qn;")
	public static final Class511 aClass511_5 = new Class511(4);

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!qn;")
	public static final Class511 aClass511_6 = new Class511(5);

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!qn;")
	static final Class511 aClass511_1 = new Class511(6);

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!qn;")
	static final Class511 aClass511_8 = new Class511(7);

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!qn;")
	static final Class511 aClass511_9 = new Class511(8);

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	final int anInt5368;

	@OriginalMember(owner = "client!qn", name = "al", descriptor = "(Lclient!yf;S)V")
	static void method30430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		if (arg0.anIntArray521[arg0.anInt6052 * -1497248091] > arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!qn", name = "aaa", descriptor = "(Lclient!yf;I)V")
	static void method30431(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		Class212.method25535(local13, (byte) -12);
	}

	@OriginalMember(owner = "client!qn", name = "aol", descriptor = "(Lclient!yf;S)V")
	static void method30432(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(51) Class472 local51 = Class472.method29710((float) local13, (float) local23, (float) local33);
		if (local51.aFloat325 == -1.0F) {
			local51.aFloat325 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat326 == -1.0F) {
			local51.aFloat326 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat327) {
			local51.aFloat327 = Float.POSITIVE_INFINITY;
		}
		Class65.aClass123_Sub1_2.method9057(local51, 1755092373);
		Class65.aClass123_Sub1_2.method9009((float) local43 / 1000.0F, -610275647);
		local51.method29713();
	}

	@OriginalMember(owner = "client!qn", name = "bes", descriptor = "(Lclient!yf;B)V")
	static void method30433(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class146.aClass344_3.method27619(local12 != 0, (short) 5799);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
	Class511(@OriginalArg(0) int arg0) {
		this.anInt5368 = arg0 * 238123707;
	}
}
