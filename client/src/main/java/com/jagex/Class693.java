package com.jagex;

import java.util.HashSet;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yu")
public final class Class693 implements Interface75 {

	@OriginalMember(owner = "client!yu", name = "e", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_8 = new Class693("", 0, new Class705[] { Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "n", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_5 = new Class693("", 1, new Class705[] { Class705.aClass705_2, Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "m", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_4 = new Class693("", 2, new Class705[] { Class705.aClass705_2, Class705.aClass705_1, Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "k", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_3 = new Class693("", 3, new Class705[] { Class705.aClass705_2 });

	@OriginalMember(owner = "client!yu", name = "f", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_12 = new Class693("", 4);

	@OriginalMember(owner = "client!yu", name = "w", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_7 = new Class693("", 5, new Class705[] { Class705.aClass705_2, Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "l", descriptor = "Lclient!yu;")
	static final Class693 aClass693_14 = new Class693("", 6, new Class705[] { Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "u", descriptor = "Lclient!yu;")
	static final Class693 aClass693_9 = new Class693("", 8, new Class705[] { Class705.aClass705_2, Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "z", descriptor = "Lclient!yu;")
	static final Class693 aClass693_10 = new Class693("", 9, new Class705[] { Class705.aClass705_2, Class705.aClass705_1 });

	@OriginalMember(owner = "client!yu", name = "p", descriptor = "Lclient!yu;")
	public static final Class693 aClass693_11 = new Class693("", 10, new Class705[] { Class705.aClass705_2 });

	@OriginalMember(owner = "client!yu", name = "d", descriptor = "Lclient!yu;")
	static final Class693 aClass693_2 = new Class693("", 11, new Class705[] { Class705.aClass705_2 });

	@OriginalMember(owner = "client!yu", name = "c", descriptor = "Lclient!yu;")
	static final Class693 aClass693_13 = new Class693("", 12, new Class705[] { Class705.aClass705_2, Class705.aClass705_3 });

	@OriginalMember(owner = "client!yu", name = "r", descriptor = "Lclient!yu;")
	static final Class693 aClass693_6 = new Class693("", 13, new Class705[] { Class705.aClass705_2 });

	@OriginalMember(owner = "client!yu", name = "o", descriptor = "Ljava/util/Set;")
	final Set aSet2 = new HashSet();

	@OriginalMember(owner = "client!yu", name = "v", descriptor = "I")
	final int anInt6098;

	static {
		method36791((byte) 1);
	}

	@OriginalMember(owner = "client!yu", name = "apa", descriptor = "(Lclient!yf;I)V")
	static void method36788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4900 * -466225957;
	}

	@OriginalMember(owner = "client!yu", name = "f", descriptor = "()[Lclient!yu;")
	public static Class693[] method36789() {
		return new Class693[] { aClass693_5, aClass693_6, aClass693_10, aClass693_12, aClass693_14, aClass693_4, aClass693_11, aClass693_8, aClass693_2, aClass693_7, aClass693_13, aClass693_3, aClass693_9 };
	}

	@OriginalMember(owner = "client!yu", name = "w", descriptor = "()[Lclient!yu;")
	public static Class693[] method36790() {
		return new Class693[] { aClass693_5, aClass693_6, aClass693_10, aClass693_12, aClass693_14, aClass693_4, aClass693_11, aClass693_8, aClass693_2, aClass693_7, aClass693_13, aClass693_3, aClass693_9 };
	}

	@OriginalMember(owner = "client!yu", name = "e", descriptor = "(B)[Lclient!yu;")
	public static Class693[] method36791(@OriginalArg(0) byte arg0) {
		return new Class693[] { aClass693_5, aClass693_6, aClass693_10, aClass693_12, aClass693_14, aClass693_4, aClass693_11, aClass693_8, aClass693_2, aClass693_7, aClass693_13, aClass693_3, aClass693_9 };
	}

	@OriginalMember(owner = "client!yu", name = "m", descriptor = "(S)V")
	public static void method36793(@OriginalArg(0) short arg0) {
		Class655.aClass163_Sub2_1.method14914(616785387);
		Class655.aClass163_Sub1_1.method14914(700526817);
		Class655.aLong302 = 2492000195029924361L;
		Class655.aBoolean870 = true;
	}

	@OriginalMember(owner = "client!yu", name = "em", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method36794(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean698 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!yu", name = "apl", descriptor = "(Lclient!yf;I)V")
	static void method36795(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1451722994;
		@Pc(19) Class93_Sub30 local19 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (Class65.aClass123_Sub1_2.method8986((byte) -82) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9040(871938700)).method15974(local19.method13870(-762951493), arg0.anIntArray521[arg0.anInt6052 * -1497248091], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 4], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 5], (byte) 0);
	}

	@OriginalMember(owner = "client!yu", name = "atm", descriptor = "(Lclient!yf;I)V")
	static void method36796(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15819(761099430) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!yu", name = "asg", descriptor = "(Lclient!yf;B)V")
	static void method36797(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 2 : 0, (byte) 40);
		client.aClass532_1.method30650((byte) 0);
		Class106_Sub1.method5148(-1925434054);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!yu", name = "l", descriptor = "(I)V")
	public static void method36798(@OriginalArg(0) int arg0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!yu", name = "bce", descriptor = "(Lclient!yf;I)V")
	static void method36799(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4).aClass336_1.anInt4207 * -1894904179;
	}

	@OriginalMember(owner = "client!yu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class693(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6098 = arg1 * -694500089;
	}

	@OriginalMember(owner = "client!yu", name = "<init>", descriptor = "(Ljava/lang/String;I[Lclient!zh;)V")
	Class693(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class705[] arg2) {
		this.anInt6098 = arg1 * -694500089;
		@Pc(13) Class705[] local13 = arg2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class705 local23 = local13[local15];
			this.aSet2.add(local23);
		}
	}

	@OriginalMember(owner = "client!yu", name = "m", descriptor = "(Lclient!zh;I)Z")
	public boolean method36786(@OriginalArg(0) Class705 arg0, @OriginalArg(1) int arg1) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yu", name = "l", descriptor = "(Lclient!zh;)Z")
	public boolean method36787(@OriginalArg(0) Class705 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yu", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt6098 * 458725559;
	}

	@OriginalMember(owner = "client!yu", name = "u", descriptor = "(Lclient!zh;)Z")
	public boolean method36792(@OriginalArg(0) Class705 arg0) {
		return this.aSet2.contains(arg0);
	}

	@OriginalMember(owner = "client!yu", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt6098 * 458725559;
	}
}
