package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xn")
final class Class665 implements Iterator {

	@OriginalMember(owner = "client!xn", name = "r", descriptor = "I")
	static int anInt6009;

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "I")
	int anInt6008;

	// $FF: synthetic field
	@OriginalMember(owner = "client!xn", name = "this$0", descriptor = "Lclient!adm;")
	final Class79_Sub1_Sub2 aClass79_Sub1_Sub2_6;

	@OriginalMember(owner = "client!xn", name = "fq", descriptor = "(Lclient!yf;I)V")
	static void method33072(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class453.method29149(local11, local14, arg0, (short) -1473);
	}

	@OriginalMember(owner = "client!xn", name = "qz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method33073(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray36 = Class499.method30329(local13, arg2, -308888708);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!xn", name = "apt", descriptor = "(Lclient!yf;I)V")
	static void method33074(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4911 * 1486673001;
	}

	@OriginalMember(owner = "client!xn", name = "bbc", descriptor = "(Lclient!yf;I)V")
	static void method33075(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class132_Sub1_Sub1_Sub1_Sub1 local3 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		@Pc(6) Class336 local6 = local3.aClass336_1;
		if (local6.anIntArray414 != null) {
			local6 = local6.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 2121);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local6 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "(Lclient!aqc;I)V")
	public static void method33076(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method445((byte) 31); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method415(417390369)) {
			if (arg0 == local4.aClass132_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30972(100, (byte) -106);
					Class274.aClass258_11.method26161(local4.aClass539_3, 2038006081);
					local4.aClass539_3 = null;
				}
				local4.method23981(132966673);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!xn", name = "<init>", descriptor = "(Lclient!adm;)V")
	Class665(@OriginalArg(0) Class79_Sub1_Sub2 arg0) {
		this.aClass79_Sub1_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "()V")
	public void method33066() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!xn", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt6008 * 1778774915 < this.aClass79_Sub1_Sub2_6.method18274(999937528);
	}

	@OriginalMember(owner = "client!xn", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt6008 += 654258987) * 1778774915 - 1;
		@Pc(19) Class108_Sub2 local19 = (Class108_Sub2) this.aClass79_Sub1_Sub2_6.aClass240_6.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub2_6.method1474(local11, (byte) 111) : local19;
	}

	@OriginalMember(owner = "client!xn", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!xn", name = "n", descriptor = "()Z")
	public boolean method33067() {
		return this.anInt6008 * 1778774915 < this.aClass79_Sub1_Sub2_6.method18274(1094222882);
	}

	@OriginalMember(owner = "client!xn", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method33068() {
		@Pc(11) int local11 = (this.anInt6008 += 654258987) * 1778774915 - 1;
		@Pc(19) Class108_Sub2 local19 = (Class108_Sub2) this.aClass79_Sub1_Sub2_6.aClass240_6.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub2_6.method1474(local11, (byte) 26) : local19;
	}

	@OriginalMember(owner = "client!xn", name = "f", descriptor = "()V")
	public void method33069() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!xn", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method33070() {
		@Pc(11) int local11 = (this.anInt6008 += 654258987) * 1778774915 - 1;
		@Pc(19) Class108_Sub2 local19 = (Class108_Sub2) this.aClass79_Sub1_Sub2_6.aClass240_6.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub2_6.method1474(local11, (byte) 101) : local19;
	}

	@OriginalMember(owner = "client!xn", name = "e", descriptor = "()Z")
	public boolean method33071() {
		return this.anInt6008 * 1778774915 < this.aClass79_Sub1_Sub2_6.method18274(347713205);
	}
}
