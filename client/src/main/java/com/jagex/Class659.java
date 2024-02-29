package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xh")
public class Class659 implements Interface75 {

	@OriginalMember(owner = "client!xh", name = "iw", descriptor = "Lclient!wc;")
	public static Class633 aClass633_1;

	@OriginalMember(owner = "client!xh", name = "ov", descriptor = "I")
	public static int anInt5822;

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "Lclient!xh;")
	public static final Class659 aClass659_3 = new Class659(0);

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "Lclient!xh;")
	static final Class659 aClass659_4 = new Class659(1);

	@OriginalMember(owner = "client!xh", name = "m", descriptor = "Lclient!xh;")
	static final Class659 aClass659_2 = new Class659(2);

	@OriginalMember(owner = "client!xh", name = "k", descriptor = "I")
	final int anInt5821;

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "(B)[Lclient!wa;", line = 14)
	public static Class631[] method32794(@OriginalArg(0) byte arg0) {
		return new Class631[] { Class631.aClass631_1, Class631.aClass631_2, Class631.aClass631_3 };
	}

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "(I)[Lclient!xh;", line = 23)
	public static Class659[] method32795(@OriginalArg(0) int arg0) {
		return new Class659[] { aClass659_3, aClass659_4, aClass659_2 };
	}

	@OriginalMember(owner = "client!xh", name = "w", descriptor = "()[Lclient!xh;", line = 23)
	public static Class659[] method32796() {
		return new Class659[] { aClass659_3, aClass659_4, aClass659_2 };
	}

	@OriginalMember(owner = "client!xh", name = "<init>", descriptor = "(I)V", line = 26)
	Class659(@OriginalArg(0) int arg0) {
		this.anInt5821 = arg0 * 1015357935;
	}

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "()I", line = 31)
	@Override
	public int method36920() {
		return this.anInt5821 * 1384393999;
	}

	@OriginalMember(owner = "client!xh", name = "k", descriptor = "()I", line = 31)
	@Override
	public int method36919() {
		return this.anInt5821 * 1384393999;
	}

	@OriginalMember(owner = "client!xh", name = "m", descriptor = "(I)Z", line = 35)
	public boolean method32797(@OriginalArg(0) int arg0) {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "()Z", line = 35)
	public boolean method32798() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "l", descriptor = "()Z", line = 35)
	public boolean method32799() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "z", descriptor = "()Z", line = 35)
	public boolean method32800() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "f", descriptor = "(I)Z", line = 39)
	public boolean method32801(@OriginalArg(0) int arg0) {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "p", descriptor = "()Z", line = 39)
	public boolean method32802() {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "d", descriptor = "()Z", line = 39)
	public boolean method32803() {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "c", descriptor = "()Z", line = 39)
	public boolean method32804() {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "w", descriptor = "(I)Z", line = 103)
	static boolean method32805(@OriginalArg(0) int arg0) {
		return Class168.aBoolean380;
	}

	@OriginalMember(owner = "client!xh", name = "v", descriptor = "(B)Ljava/lang/String;", line = 147)
	public static String method32806(@OriginalArg(0) byte arg0) {
		return Class355.aString184;
	}

	@OriginalMember(owner = "client!xh", name = "d", descriptor = "([J[Ljava/lang/Object;I)V", line = 218)
	public static void method32807(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2) {
		Class681.method33245(arg0, arg1, 0, arg0.length - 1, -1213995184);
	}

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "(II)Lclient!hf;", line = 269)
	public static Class312 method32808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		if (Class166_Sub1.aClass320Array1[local3] == null || Class166_Sub1.aClass320Array1[local3].method27234(arg0, 865175819) == null) {
			@Pc(19) boolean local19 = Class383.method28142(local3, null, 839823793);
			if (!local19) {
				return null;
			}
		}
		return Class166_Sub1.aClass320Array1[local3].method27234(arg0, 181682937);
	}

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "(IIB)V", line = 374)
	static void method32809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class454.anInt5041 * -656229149 == 1) {
			Class169.method18341(Class102.aClass93_Sub1_Sub7_3, arg0, arg1, false, 1824286321);
		} else if (Class454.anInt5041 * -656229149 == 2) {
			Class31.method637(arg0, arg1, (short) 6193);
		}
		Class454.anInt5041 = 0;
		Class102.aClass93_Sub1_Sub7_3 = null;
	}

	@OriginalMember(owner = "client!xh", name = "aq", descriptor = "(Lclient!yf;B)V", line = 4966)
	static final void method32810(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!xh", name = "eq", descriptor = "(Lclient!yf;S)V", line = 5787)
	static final void method32811(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class693.method36613(local11, local14, arg0, -1987680147);
	}

	@OriginalMember(owner = "client!xh", name = "tu", descriptor = "(Lclient!yf;I)V", line = 8350)
	static final void method32812(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = method32808(local12, -146989917);
		Class493.method30010(local16, arg0, 1376488456);
	}

	@OriginalMember(owner = "client!xh", name = "zk", descriptor = "(Lclient!yf;I)V", line = 9470)
	static final void method32813(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class39 local18 = (Class39) Class19.aClass32_Sub7_5.method18261(local12, -746105267);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.method765(885023744);
	}

	@OriginalMember(owner = "client!xh", name = "afi", descriptor = "(Lclient!yf;B)V", line = 10473)
	static final void method32814(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13 + local26;
	}

	@OriginalMember(owner = "client!xh", name = "agx", descriptor = "(Lclient!yf;I)V", line = 10657)
	static final void method32815(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(32) Class5 local32 = Class157.aClass462_2.method29259(client.anInterface50_1, local26, -1804264195);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local32.method55(local13, Class110_Sub14.aClass100Array4, (byte) -34);
	}
}
