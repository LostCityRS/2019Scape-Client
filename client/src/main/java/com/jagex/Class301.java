package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public class Class301 implements Interface75 {

	@OriginalMember(owner = "client!gv", name = "al", descriptor = "I")
	static int anInt3931;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!gv;")
	static final Class301 aClass301_3 = new Class301(3, 0);

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!gv;")
	static final Class301 aClass301_2 = new Class301(0, 1);

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lclient!gv;")
	static final Class301 aClass301_4 = new Class301(2, 2);

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!gv;")
	static final Class301 aClass301_1 = new Class301(1, 3);

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	final int anInt3929;

	@OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
	final int anInt3930;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "()[Lclient!gv;", line = 18)
	static Class301[] method26726() {
		return new Class301[] { aClass301_2, aClass301_1, aClass301_4, aClass301_3 };
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "()[Lclient!gv;", line = 18)
	static Class301[] method26727() {
		return new Class301[] { aClass301_2, aClass301_1, aClass301_4, aClass301_3 };
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)[Lclient!gv;", line = 18)
	static Class301[] method26728(@OriginalArg(0) int arg0) {
		return new Class301[] { aClass301_2, aClass301_1, aClass301_4, aClass301_3 };
	}

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(II)V", line = 21)
	Class301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3929 = arg0 * -640850781;
		this.anInt3930 = arg1 * -1953849059;
	}

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "()I", line = 27)
	@Override
	public int method36919() {
		return this.anInt3930 * 2034968885;
	}

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "()I", line = 27)
	@Override
	public int method36920() {
		return this.anInt3930 * 2034968885;
	}

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "(Lclient!ec;I)V", line = 82)
	public static void method26729(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class93_Sub1_Sub11 local7 = Class371.method28000(1, (long) (arg0.anInt867 * -1284841473));
		local7.method21885(2145808186);
	}

	@OriginalMember(owner = "client!gv", name = "gt", descriptor = "(B)V", line = 3783)
	public static final void method26730(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray21[local1] = false;
		}
		client.anInt3486 = -1975201975;
		client.anInt3490 = -468246877;
		Class5.anInt14 = 0;
		Class174.anInt3297 = 0;
		Class429.anInt4781 = -1279696551;
		if (Class20.method376(1207975135) == 3) {
			@Pc(28) Class611 local28 = client.aClass532_1.method30455(1810107931);
			@Pc(35) int local35 = local28.anInt5623 * 270611681 << 9;
			@Pc(42) int local42 = local28.anInt5624 * -1994307635 << 9;
			@Pc(47) int local47 = 1000 / Class451.method28950((byte) 3);
			Class65.aClass123_Sub1_2.method8925((float) local47 / 1000.0F, client.aClass532_1.method30511(-310507201).anIntArrayArrayArray14, client.aClass532_1.method30487(-1214309031), local35, local42, 1160510591);
		}
		Class444.anInt4895 = 783237131;
		Class175.anInt3306 = 1395810859;
		client.anInt3483 = client.anInt3485 * -1316998297;
		Class86.anInt264 = Class163.anInt2002 * 100561771;
		Class508.anInt5204 = Class130_Sub2.anInt1117 * 1612451805;
		Class156.anInt1664 = Class270.anInt3884 * 1977957923;
		Class219.anInt3628 = Class620.anInt5644 * 151828669;
		Class35.anInt114 = Class24.anInt82 * 881336097;
		Class627.anInt5706 = client.anInt3571 * -1367702225;
	}

	@OriginalMember(owner = "client!gv", name = "uy", descriptor = "(Lclient!yf;B)V", line = 8637)
	static final void method26731(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1287944099);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4007 * 1214995653;
	}

	@OriginalMember(owner = "client!gv", name = "bbs", descriptor = "(Lclient!yf;B)V", line = 14456)
	static final void method26732(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass312_4 == null ? -1 : -1549590237 * client.aClass312_4.anInt3953;
	}

	@OriginalMember(owner = "client!gv", name = "bbz", descriptor = "(Lclient!yf;S)V", line = 14471)
	static final void method26733(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class132_Sub1_Sub1_Sub1_Sub1 local16 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		@Pc(21) int local21 = local16.method18617(local12, (byte) 34);
		@Pc(26) int local26 = local16.method18618(local12, (byte) 61);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local21;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local26;
	}
}
