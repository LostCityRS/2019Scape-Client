package jagex3;

import jagex3.twitchtv.TwitchEventResult;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xt")
public final class Class670 {

	@OriginalMember(owner = "client!xt", name = "e", descriptor = "Lclient!mt;")
	static Class146 aClass146_6 = null;

	@OriginalMember(owner = "client!xt", name = "z", descriptor = "(Lclient!xf;)V")
	public static void method33128(@OriginalArg(0) Class657 arg0) {
		if (arg0.aClass429_3 == Class429.aClass429_1) {
			aClass146_6 = new Class146_Sub2(arg0);
		} else if (arg0.aClass429_3 == Class429.aClass429_2) {
			aClass146_6 = new Class146_Sub1(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xt", name = "u", descriptor = "(Lclient!xf;)V")
	public static void method33129(@OriginalArg(0) Class657 arg0) {
		if (arg0.aClass429_3 == Class429.aClass429_1) {
			aClass146_6 = new Class146_Sub2(arg0);
		} else if (arg0.aClass429_3 == Class429.aClass429_2) {
			aClass146_6 = new Class146_Sub1(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xt", name = "r", descriptor = "(Lclient!py;ILclient!wj;ZLclient!eb;)Lclient!wr;")
	public static Interface70 method33130(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class240 arg4) {
		if (aClass146_6 == null) {
			return null;
		} else {
			return (Interface70) (arg3 ? new Class643(arg0, arg1, aClass146_6, arg2) : new Class635(arg0, arg1, aClass146_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xt", name = "c", descriptor = "(Lclient!py;ILclient!wj;ZLclient!eb;)Lclient!wr;")
	public static Interface70 method33131(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class240 arg4) {
		if (aClass146_6 == null) {
			return null;
		} else {
			return (Interface70) (arg3 ? new Class643(arg0, arg1, aClass146_6, arg2) : new Class635(arg0, arg1, aClass146_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xt", name = "d", descriptor = "()V")
	public static void method33132() {
		if (aClass146_6 != null) {
			aClass146_6.method11683(981810618);
		}
	}

	@OriginalMember(owner = "client!xt", name = "p", descriptor = "()V")
	public static void method33133() {
		if (aClass146_6 != null) {
			aClass146_6.method11677((byte) -12);
			aClass146_6 = null;
		}
	}

	@OriginalMember(owner = "client!xt", name = "v", descriptor = "(IIFLclient!ma;)V")
	public static void method33134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3) {
		if (aClass146_6 != null) {
			aClass146_6.method11689(567429094).method28838(arg0, arg1, arg2, arg3, -1618005872);
		}
	}

	@OriginalMember(owner = "client!xt", name = "o", descriptor = "(I)Lclient!mj;")
	public static Class420 method33135(@OriginalArg(0) int arg0) {
		return aClass146_6 == null ? null : aClass146_6.method11689(-1145422705).method28841(arg0, (byte) 76);
	}

	@OriginalMember(owner = "client!xt", name = "cp", descriptor = "(Lclient!yf;I)V")
	static void method33136(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class542.method31115(local11, local14, arg0, 1189701933);
	}

	@OriginalMember(owner = "client!xt", name = "z", descriptor = "(FFFF[FI)V")
	static void method33137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!xt", name = "qu", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method33138(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray31 = Class499.method30329(local13, arg2, 1823503780);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!xt", name = "lc", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method33139(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class175 local2 = Class330.method27465(-1999693521);
		@Pc(8) Class93_Sub22 local8 = Class102.method2592(Class446.aClass446_66, local2.aClass24_2, (byte) 124);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -2112445074) + Class46.method894(arg1, -2002128209), (byte) -97);
		local8.aClass93_Sub41_Sub2_1.method22414(arg0, 660568065);
		local8.aClass93_Sub41_Sub2_1.method22414(arg1, 330355015);
		local2.method24363(local8, -2034693953);
	}

	@OriginalMember(owner = "client!xt", name = "ac", descriptor = "(IIB)V")
	static void method33140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class591 local8 = local5.method25474();
		if (local8 != null) {
			Class707.method36932(local8.method37101(), local5, (byte) -64);
		}
	}

	@OriginalMember(owner = "client!xt", name = "ai", descriptor = "(Lclient!yf;B)V")
	static void method33141(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class379 local9 = (Class379) arg0.aClass93_Sub1_Sub13_1.anObjectArray5[arg0.anInt6050 * -709694321];
		@Pc(32) Interface20 local32 = (Interface20) (arg0.anIntArray522[arg0.anInt6050 * -709694321] == 0 ? arg0.aMap26.get(local9.aClass108_1.aClass138_6) : arg0.aMap25.get(local9.aClass108_1.aClass138_6));
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local32.method33635(local9, 1286953617);
	}

	@OriginalMember(owner = "client!xt", name = "<init>", descriptor = "()V")
	Class670() throws Throwable {
		throw new Error();
	}
}
