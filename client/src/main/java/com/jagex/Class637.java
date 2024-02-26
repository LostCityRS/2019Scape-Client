package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class637 implements Interface75 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!wh;")
	static final Class637 aClass637_3 = new Class637(0);

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!wh;")
	static final Class637 aClass637_2 = new Class637(1);

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!wh;")
	static final Class637 aClass637_1 = new Class637(2);

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Lclient!wh;")
	static final Class637 aClass637_4 = new Class637(3);

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!wh;")
	static final Class637 aClass637_5 = new Class637(4);

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!wh;")
	static final Class637 aClass637_6 = new Class637(5);

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	final int anInt5602;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "()[Lclient!wh;")
	public static Class637[] method32870() {
		return new Class637[] { aClass637_6, aClass637_4, aClass637_1, aClass637_2, aClass637_3, aClass637_5 };
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(IIIB)I")
	public static int method32871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(7) int local7 = Class210.method25806(arg2 - arg1 + 1, -564196416);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!wh", name = "go", descriptor = "(I)V")
	static void method32872(@OriginalArg(0) int arg0) {
		Class704.aClass41_Sub6_3.method17929(1407616672);
		Class20.aClass41_Sub21_11.method17929(1945209257);
		Class80_Sub1_Sub15.aClass41_Sub14_4.method17929(1406179586);
		client.aClass539_1.method30905(1705163371).method17929(1983294774);
		Class460.aClass41_Sub2_1.method17929(1697607578);
		Class25.aClass41_Sub9_1.method17929(1219911548);
		Class125.aClass41_Sub1_6.method17929(1465314738);
		Class104_Sub2.aClass41_Sub16_1.method17929(1843518330);
		Class664.aClass41_Sub17_2.method17929(1238232551);
		Class528.aClass2_Sub1_Sub1_3.method1536(-1871290545);
		Class110.aClass2_Sub1_Sub2_2.method1842(-616345719);
		Class143.aClass2_Sub1_Sub2_12.method1842(-616345719);
		Class130.aClass2_Sub1_Sub2_6.method1842(-616345719);
		Class188.aClass2_Sub1_Sub2_13.method1842(-616345719);
		Class121.aClass2_Sub1_Sub2_4.method1842(-616345719);
		Class533.aClass41_Sub18_1.method17929(1777764263);
		Class265.aClass41_Sub12_3.method17929(1747236448);
		Class157.aClass41_Sub13_2.method17929(1671961955);
		Class370.aClass41_Sub10_1.method17929(1846324487);
		Class621.aClass41_Sub7_1.method17929(1408444889);
		Class289.aClass41_Sub8_1.method17929(1774512416);
		Class332.aClass41_Sub5_1.method17929(2112221251);
		Class279.aClass41_Sub4_1.method17929(2053175130);
		Class510.aClass41_Sub15_1.method17929(1518122182);
		Class578.aClass41_Sub19_1.method17929(1907947557);
		Class357.method28123((byte) 47);
		Class165_Sub27.method16405(-1867362097);
		Class317.aClass464_1.method29598(465188911);
		Class687.method36833(1315500864);
		Class245.method26322((byte) 70);
		client.aClass243_68.method26259((byte) 3);
		client.aClass243_67.method26259((byte) 3);
		Class681.aClass243_96.method26259((byte) 3);
		client.aClass243_70.method26259((byte) 3);
		Class80_Sub1_Sub1.aClass41_2.method17929(1769651806);
		Class383.aClass41_3.method17929(1187415872);
		client.aClass243_66.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
	Class637(@OriginalArg(0) int arg0) {
		this.anInt5602 = arg0 * -1539605835;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5602 * 1126376349;
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5602 * 1126376349;
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5602 * 1126376349;
	}
}
