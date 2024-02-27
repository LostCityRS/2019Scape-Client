package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class170 {

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Ljava/lang/String;")
	String aString89;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!ar", name = "uw", descriptor = "(Lclient!yf;I)V")
	static void method21494(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1949471565);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4045 * 1572745861;
	}

	@OriginalMember(owner = "client!ar", name = "awh", descriptor = "(Lclient!yf;B)V")
	static void method21495(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(32) int local32 = Class250.method26049(Class280.aClass693_1, Class703.aClass703_3, local12, 893842351);
		@Pc(38) int local38 = Class654.method32900(Class280.aClass693_1, Class703.aClass703_3, local12, 153396189);
		if (client.anInt3435 * -849002901 == 13 && !Class251.method26066(-473748555)) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class624.method32339(local12, local26, local32, local38, -1351470887) ? 1 : 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "nu", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method21496(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30329(local13, arg2, -565857644);
	}

	@OriginalMember(owner = "client!ar", name = "aor", descriptor = "(Lclient!yf;I)V")
	static void method21497(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(51) Class472 local51 = Class472.method29710((float) local13, (float) local23, (float) local33);
		if (local51.aFloat325 == -1.0F) {
			local51.aFloat325 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat326) {
			local51.aFloat326 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat327 == -1.0F) {
			local51.aFloat327 = Float.POSITIVE_INFINITY;
		}
		Class65.aClass123_Sub1_2.method8933(local51, -849002901);
		Class65.aClass123_Sub1_2.method8955((float) local43 / 1000.0F, (byte) 108);
		local51.method29713();
	}

	@OriginalMember(owner = "client!ar", name = "aym", descriptor = "(Lclient!yf;I)V")
	static void method21498(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class626.anInt5865 * 2085461781;
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	Class170() {
	}
}
