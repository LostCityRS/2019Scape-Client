package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
final class Class251 implements Interface23 {

	@OriginalMember(owner = "client!et", name = "z", descriptor = "(I)Lclient!zl;")
	public static Class709 method26059(@OriginalArg(0) int arg0) {
		return Class676.aClass709_1 == null ? Class709.aClass709_4 : Class676.aClass709_1;
	}

	@OriginalMember(owner = "client!et", name = "w", descriptor = "(Lclient!alq;IIB)V")
	static void method26060(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		arg0.method14871(arg1, 1494441756);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32702((byte) 14);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31822((byte) 46);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26246(1522173328);
			local10 = 2;
		} else {
			Class238.method25889(true, 1736405322);
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 72) == arg1) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true, 1597280608);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1, (byte) 123);
			Class543.method31129(arg1, false, 1945646779);
		}
		Class106_Sub1.method5148(-500282930);
		arg0.method14869(local10, -1121353077);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Lclient!yf;I)V")
	static void method26061(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[-1497248091 * arg0.anInt6052 - 1], 538953545)).method27687(Class624.aClass120_1, -56090989) ? 1 : 0;
	}

	@OriginalMember(owner = "client!et", name = "y", descriptor = "(Lclient!yf;I)V")
	static void method26062(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2], 41450559)).aStringArray31[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]];
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!et", name = "pm", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method26063(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray29 = Class499.method30329(local13, arg2, -619820294);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!et", name = "ald", descriptor = "(Lclient!yf;I)V")
	static void method26064(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 >= 1 && local12 <= 2) {
			Class717.method37076(local12, -1, -1, false, (byte) 42);
		}
	}

	@OriginalMember(owner = "client!et", name = "aqc", descriptor = "(Lclient!yf;I)V")
	static void method26065(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4911 * 1486673001;
	}

	@OriginalMember(owner = "client!et", name = "w", descriptor = "(I)Z")
	public static boolean method26066(@OriginalArg(0) int arg0) {
		return Class411.anInt4882 * 327612781 != 7;
	}

	@OriginalMember(owner = "client!et", name = "al", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33638(@OriginalArg(0) Class108 arg0) {
		@Pc(8) Class93_Sub14 local8 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt867 * -1284841473));
		return local8 == null ? Class624.aClass120_1.method33636(arg0, -1576913014) : local8.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "u", descriptor = "(Lclient!ec;I)I")
	@Override
	public int method33636(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class93_Sub14 local8 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt867 * -1284841473));
		return local8 == null ? Class624.aClass120_1.method33636(arg0, -1166835359) : local8.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "z", descriptor = "(Lclient!kh;I)I")
	@Override
	public int method33635(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class93_Sub14 local10 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt4783 * -15749287) | 0x100000000L);
		return local10 == null ? Class624.aClass120_1.method33635(arg0, -1890685598) : local10.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "at", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33643(@OriginalArg(0) Class379 arg0) {
		@Pc(10) Class93_Sub14 local10 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt4783 * -15749287) | 0x100000000L);
		return local10 == null ? Class624.aClass120_1.method33635(arg0, 1979714963) : local10.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "aw", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33642(@OriginalArg(0) Class379 arg0) {
		@Pc(10) Class93_Sub14 local10 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt4783 * -15749287) | 0x100000000L);
		return local10 == null ? Class624.aClass120_1.method33635(arg0, -154214933) : local10.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "ac", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33639(@OriginalArg(0) Class108 arg0) {
		@Pc(8) Class93_Sub14 local8 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt867 * -1284841473));
		return local8 == null ? Class624.aClass120_1.method33636(arg0, 207119544) : local8.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "ah", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33637(@OriginalArg(0) Class108 arg0) {
		@Pc(8) Class93_Sub14 local8 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt867 * -1284841473));
		return local8 == null ? Class624.aClass120_1.method33636(arg0, -860700189) : local8.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "ai", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33640(@OriginalArg(0) Class108 arg0) {
		@Pc(8) Class93_Sub14 local8 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt867 * -1284841473));
		return local8 == null ? Class624.aClass120_1.method33636(arg0, -653174860) : local8.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!et", name = "as", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33641(@OriginalArg(0) Class379 arg0) {
		@Pc(10) Class93_Sub14 local10 = (Class93_Sub14) Class249.aClass16_24.method215((long) (arg0.anInt4783 * -15749287) | 0x100000000L);
		return local10 == null ? Class624.aClass120_1.method33635(arg0, -296507910) : local10.anInt1526 * 1279598251;
	}
}
