package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class433 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_5 = new Class433(8);

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_2 = new Class433(16);

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_4 = new Class433(8);

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!nd;")
	public static final Class433 aClass433_3 = new Class433(16);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!nd;")
	static final Class433 aClass433_6 = new Class433(32);

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public final int anInt4967;

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method28972(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray19 = Class499.method30329(local13, arg2, -181569031);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!nd", name = "nx", descriptor = "(Lclient!yf;I)V")
	static void method28973(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1063032499);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class379.method28286(local16, local22, arg0, (byte) 17);
	}

	@OriginalMember(owner = "client!nd", name = "amt", descriptor = "(Lclient!yf;S)V")
	static void method28974(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class106.method7580(client.anInt3435 * -849002901, 992462342) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "azg", descriptor = "(Lclient!yf;I)V")
	static void method28975(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15539(-1961113908) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "ha", descriptor = "(Lclient!yf;I)V")
	static void method28976(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method188(local11, local14, false, 2, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "(Lclient!alw;I)Ljava/lang/String;")
	public static String method28977(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		return Class106.method7581(arg0, 32767, -1989207878);
	}

	@OriginalMember(owner = "client!nd", name = "ayf", descriptor = "(Lclient!yf;B)V")
	static void method28978(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class32_Sub19.aBoolean375 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "aat", descriptor = "(Lclient!yf;B)V")
	static void method28979(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27663(0, -1614681388)) || local13.startsWith(Class346.method27663(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class260.method26250(local13, 2134078020) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
	Class433(@OriginalArg(0) int arg0) {
		this.anInt4967 = arg0 * 1374261873;
	}
}
