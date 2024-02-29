package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
final class Class220 implements Interface27 {

	@OriginalMember(owner = "client!d", name = "u", descriptor = "(II)Lclient!asg;")
	public static Class93_Sub1_Sub15 method25634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class93_Sub1_Sub15) Class329.aClass16_29.method215((long) arg0);
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "(IIIILclient!ao;Lclient!ao;I)Lclient!sv;")
	public static Class562 method25635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18273(arg0, 1428840854);
		if (local7.anIntArray488 != null) {
			local1 = new Class563[local7.anIntArray488.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18273(local7.anIntArray488[local18], -773558756);
				local1[local18] = new Class563(local31.anInt4251 * -1345955691, local31.anInt4249 * -835293139, local31.anInt4253 * 1917694335, local31.anInt4250 * 1421004741, local31.anInt4248 * -691618485, local31.anInt4247 * -1875676513, local31.anInt4252 * -1567865913, local31.aBoolean730, local31.anInt4254 * -1648858631, local31.anInt4255 * 1528316847, local31.anInt4256 * 61090465);
			}
		}
		return new Class562(local7.anInt5711 * 887812353, local1, local7.anInt5712 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5713 * -871926013);
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(B)V")
	public static void method25636(@OriginalArg(0) byte arg0) {
		if (Class670.aClass146_6 != null) {
			Class670.aClass146_6.method11683(1518175937);
		}
	}

	@OriginalMember(owner = "client!d", name = "mw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method25637(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray25 = Class499.method30329(local13, arg2, 1818310325);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!d", name = "pf", descriptor = "(Lclient!yf;I)V")
	static void method25638(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class32_Sub19.method17416(local11, local14, arg0, -270386490);
	}

	@OriginalMember(owner = "client!d", name = "bal", descriptor = "(Lclient!yf;B)V")
	static void method25639(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method16555(local12, 1638952250);
	}

	@OriginalMember(owner = "client!d", name = "fo", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method25640(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4051 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -985072599;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!d", name = "bbn", descriptor = "(Lclient!yf;B)V")
	static void method25641(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class132_Sub1_Sub1_Sub1_Sub1 local3 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		@Pc(6) String local6 = local3.aString66;
		@Pc(9) Class336 local9 = local3.aClass336_1;
		if (local9.anIntArray414 != null) {
			local9 = local9.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 20208);
			if (local9 == null) {
				local6 = "";
			} else {
				local6 = local9.aString184;
			}
		}
		if (local6 == null) {
			local6 = "";
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local6;
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(I)I")
	public static int method25642(@OriginalArg(0) int arg0) {
		Class53_Sub1.method14967(-1593140386);
		return Class474.aClass136_5.anInt1187 * 859877839;
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(B)Lclient!add;")
	@Override
	public Class79_Sub1 method25621(@OriginalArg(0) byte arg0) {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "z", descriptor = "()Lclient!aor;")
	@Override
	public Class32_Sub16 method25629() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)Lclient!add;")
	@Override
	public Class79_Sub1 method25632(@OriginalArg(0) byte arg0) {
		return Class21.aClass79_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(I)Lclient!aor;")
	@Override
	public Class32_Sub16 method25623(@OriginalArg(0) int arg0) {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(B)Lclient!wq;")
	@Override
	public Class644 method25624(@OriginalArg(0) byte arg0) {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()Lclient!add;")
	@Override
	public Class79_Sub1 method25625() {
		return Class21.aClass79_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!d", name = "w", descriptor = "()Lclient!add;")
	@Override
	public Class79_Sub1 method25622() {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()Lclient!add;")
	@Override
	public Class79_Sub1 method25627() {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "r", descriptor = "()Lclient!wq;")
	@Override
	public Class644 method25633() {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "()Lclient!aor;")
	@Override
	public Class32_Sub16 method25628() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!aor;")
	@Override
	public Class32_Sub16 method25631() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()Lclient!wq;")
	@Override
	public Class644 method25626() {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "()Lclient!aor;")
	@Override
	public Class32_Sub16 method25630() {
		return Class30.aClass32_Sub16_1;
	}
}
