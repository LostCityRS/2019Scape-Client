package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xh")
public final class Class659 implements Interface75 {

	@OriginalMember(owner = "client!xh", name = "iw", descriptor = "Lclient!wc;")
	public static Class633 aClass633_1;

	@OriginalMember(owner = "client!xh", name = "ov", descriptor = "I")
	public static int anInt5983;

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "Lclient!xh;")
	public static final Class659 aClass659_3 = new Class659(0);

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "Lclient!xh;")
	static final Class659 aClass659_4 = new Class659(1);

	@OriginalMember(owner = "client!xh", name = "m", descriptor = "Lclient!xh;")
	static final Class659 aClass659_2 = new Class659(2);

	@OriginalMember(owner = "client!xh", name = "k", descriptor = "I")
	final int anInt5982;

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "(I)[Lclient!xh;")
	public static Class659[] method32977(@OriginalArg(0) int arg0) {
		return new Class659[] { aClass659_3, aClass659_4, aClass659_2 };
	}

	@OriginalMember(owner = "client!xh", name = "w", descriptor = "()[Lclient!xh;")
	public static Class659[] method32980() {
		return new Class659[] { aClass659_3, aClass659_4, aClass659_2 };
	}

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "(IIB)V")
	static void method32985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (Class454.anInt5202 * -656229149 == 1) {
			Class169.method18350(Class102.aClass93_Sub1_Sub7_3, arg0, arg1, false, 1824286321);
		} else if (Class454.anInt5202 * -656229149 == 2) {
			Class31.method638(arg0, arg1, (short) 6193);
		}
		Class454.anInt5202 = 0;
		Class102.aClass93_Sub1_Sub7_3 = null;
	}

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "(II)Lclient!hf;")
	public static Class312 method32986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		if (Class166_Sub1.aClass320Array1[local3] == null || Class166_Sub1.aClass320Array1[local3].method27321(arg0, 865175819) == null) {
			@Pc(19) boolean local19 = Class383.method28326(local3, null, 839823793);
			if (!local19) {
				return null;
			}
		}
		return Class166_Sub1.aClass320Array1[local3].method27321(arg0, 181682937);
	}

	@OriginalMember(owner = "client!xh", name = "e", descriptor = "(B)[Lclient!wa;")
	public static Class631[] method32987(@OriginalArg(0) byte arg0) {
		return new Class631[] { Class631.aClass631_1, Class631.aClass631_2, Class631.aClass631_3 };
	}

	@OriginalMember(owner = "client!xh", name = "aq", descriptor = "(Lclient!yf;B)V")
	static void method32988(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!xh", name = "tu", descriptor = "(Lclient!yf;I)V")
	static void method32989(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = method32986(local12, -146989917);
		Class493.method30189(local16, arg0, 1376488456);
	}

	@OriginalMember(owner = "client!xh", name = "zk", descriptor = "(Lclient!yf;I)V")
	static void method32990(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class39 local18 = (Class39) Class19.aClass32_Sub7_5.method18273(local12, -746105267);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.method747(885023744);
	}

	@OriginalMember(owner = "client!xh", name = "afi", descriptor = "(Lclient!yf;B)V")
	static void method32991(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local13 + local26;
	}

	@OriginalMember(owner = "client!xh", name = "agx", descriptor = "(Lclient!yf;I)V")
	static void method32992(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(32) Class5 local32 = Class157.aClass462_2.method29422(client.anInterface50_1, local26, -1804264195);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local32.method37(local13, Class110_Sub14.aClass100Array4, (byte) -34);
	}

	@OriginalMember(owner = "client!xh", name = "v", descriptor = "(B)Ljava/lang/String;")
	public static String method32993(@OriginalArg(0) byte arg0) {
		return Class355.aString190;
	}

	@OriginalMember(owner = "client!xh", name = "d", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method32994(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2) {
		Class681.method33426(arg0, arg1, 0, arg0.length - 1, -1213995184);
	}

	@OriginalMember(owner = "client!xh", name = "w", descriptor = "(I)Z")
	static boolean method32995(@OriginalArg(0) int arg0) {
		return Class168.aBoolean381;
	}

	@OriginalMember(owner = "client!xh", name = "eq", descriptor = "(Lclient!yf;S)V")
	static void method32996(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class693.method36794(local11, local14, arg0, -1987680147);
	}

	@OriginalMember(owner = "client!xh", name = "<init>", descriptor = "(I)V")
	Class659(@OriginalArg(0) int arg0) {
		this.anInt5982 = arg0 * 1015357935;
	}

	@OriginalMember(owner = "client!xh", name = "m", descriptor = "(I)Z")
	public boolean method32975(@OriginalArg(0) int arg0) {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5982 * 1384393999;
	}

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "()Z")
	public boolean method32976() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "l", descriptor = "()Z")
	public boolean method32978() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "f", descriptor = "(I)Z")
	public boolean method32979(@OriginalArg(0) int arg0) {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5982 * 1384393999;
	}

	@OriginalMember(owner = "client!xh", name = "z", descriptor = "()Z")
	public boolean method32981() {
		return aClass659_4 == this;
	}

	@OriginalMember(owner = "client!xh", name = "p", descriptor = "()Z")
	public boolean method32982() {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "d", descriptor = "()Z")
	public boolean method32983() {
		return aClass659_3 != this;
	}

	@OriginalMember(owner = "client!xh", name = "c", descriptor = "()Z")
	public boolean method32984() {
		return aClass659_3 != this;
	}
}
