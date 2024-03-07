package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
final class Class220 implements Interface27 {

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(B)V", line = 37)
	public static void method25541(@OriginalArg(0) byte arg0) {
		if (Class670.aClass146_6 != null) {
			Class670.aClass146_6.method11686(1518175937);
		}
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(I)I", line = 43)
	public static int method25542(@OriginalArg(0) int arg0) {
		Class53_Sub1.method14953(-1593140386);
		return Class474.aClass136_5.anInt1187 * 859877839;
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "(IIIILclient!ao;Lclient!ao;I)Lclient!sv;", line = 47)
	public static Class562 method25543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Interface11 arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class563[] local1 = null;
		@Pc(7) Class603 local7 = (Class603) arg4.method18261(arg0, 1428840854);
		if (local7.anIntArray486 != null) {
			local1 = new Class563[local7.anIntArray486.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class353 local31 = (Class353) arg5.method18261(local7.anIntArray486[local18], -773558756);
				local1[local18] = new Class563(local31.anInt4210 * -1345955691, local31.anInt4208 * -835293139, local31.anInt4212 * 1917694335, local31.anInt4209 * 1421004741, local31.anInt4207 * -691618485, local31.anInt4206 * -1875676513, local31.anInt4211 * -1567865913, local31.aBoolean726, local31.anInt4213 * -1648858631, local31.anInt4214 * 1528316847, local31.anInt4215 * 61090465);
			}
		}
		return new Class562(local7.anInt5550 * 887812353, local1, local7.anInt5551 * 430971733, arg1, arg2, arg3, local7.aClass604_2, local7.anInt5552 * -871926013);
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "(II)Lclient!asg;", line = 59)
	public static Class93_Sub1_Sub15 method25544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class93_Sub1_Sub15) Class329.aClass16_29.method214((long) arg0);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)Lclient!add;", line = 620)
	@Override
	public Class79_Sub1 method25539(@OriginalArg(0) byte arg0) {
		return Class21.aClass79_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()Lclient!add;", line = 620)
	@Override
	public Class79_Sub1 method25532() {
		return Class21.aClass79_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(B)Lclient!add;", line = 624)
	@Override
	public Class79_Sub1 method25528(@OriginalArg(0) byte arg0) {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "w", descriptor = "()Lclient!add;", line = 624)
	@Override
	public Class79_Sub1 method25529() {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()Lclient!add;", line = 624)
	@Override
	public Class79_Sub1 method25534() {
		return Class429.aClass79_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "z", descriptor = "()Lclient!aor;", line = 628)
	@Override
	public Class32_Sub16 method25536() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(I)Lclient!aor;", line = 628)
	@Override
	public Class32_Sub16 method25530(@OriginalArg(0) int arg0) {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "()Lclient!aor;", line = 628)
	@Override
	public Class32_Sub16 method25535() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!aor;", line = 628)
	@Override
	public Class32_Sub16 method25538() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "()Lclient!aor;", line = 628)
	@Override
	public Class32_Sub16 method25537() {
		return Class30.aClass32_Sub16_1;
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(B)Lclient!wq;", line = 632)
	@Override
	public Class644 method25531(@OriginalArg(0) byte arg0) {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "r", descriptor = "()Lclient!wq;", line = 632)
	@Override
	public Class644 method25540() {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()Lclient!wq;", line = 632)
	@Override
	public Class644 method25533() {
		return Class336.aClass644_1;
	}

	@OriginalMember(owner = "client!d", name = "fo", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5992)
	static final void method25545(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4010 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -985072599;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!d", name = "mw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7316)
	static final void method25546(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray25 = Class499.method30149(local13, arg2, 1818310325);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!d", name = "pf", descriptor = "(Lclient!yf;I)V", line = 7839)
	static final void method25547(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class32_Sub19.method17403(local11, local14, arg0, -270386490);
	}

	@OriginalMember(owner = "client!d", name = "bal", descriptor = "(Lclient!yf;B)V", line = 14310)
	static final void method25548(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub24_1.method16546(local12, 1638952250);
	}

	@OriginalMember(owner = "client!d", name = "bbn", descriptor = "(Lclient!yf;B)V", line = 14431)
	static final void method25549(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class132_Sub1_Sub1_Sub1_Sub1 local3 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		@Pc(6) String local6 = local3.aString66;
		@Pc(9) Class336 local9 = local3.aClass336_1;
		if (local9.anIntArray412 != null) {
			local9 = local9.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 20208);
			if (local9 == null) {
				local6 = "";
			} else {
				local6 = local9.aString178;
			}
		}
		if (local6 == null) {
			local6 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local6;
	}
}
