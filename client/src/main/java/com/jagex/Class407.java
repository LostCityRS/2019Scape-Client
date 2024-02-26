package com.jagex;

import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class407 implements Interface33 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString208;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "Lclient!ky;")
	public final Class391 aClass391_14;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!km;")
	public final Class383 aClass383_14;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
	public final int anInt4599;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	public final int anInt4600;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	public final int anInt4601;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
	public final int anInt4602;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public final int anInt4603;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	public final int anInt4607;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	public final int anInt4605;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
	public final int anInt4606;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	public final int anInt4604;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public final int anInt4608;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "(Lclient!ald;)Lclient!lv;")
	public static Class407 method28943(@OriginalArg(0) Packet arg0) {
		@Pc(3) String local3 = arg0.gjstr();
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -62)[arg0.g1()];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g1();
		@Pc(33) int local33 = arg0.g1();
		@Pc(37) int local37 = arg0.g1();
		@Pc(41) int local41 = arg0.g2();
		@Pc(45) int local45 = arg0.g2();
		@Pc(49) int local49 = arg0.gSmart2or4null();
		@Pc(53) int local53 = arg0.g4();
		@Pc(57) int local57 = arg0.g4();
		return new Class407(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "(Lclient!ald;)Lclient!lv;")
	public static Class407 method28944(@OriginalArg(0) Packet arg0) {
		@Pc(3) String local3 = arg0.gjstr();
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -83)[arg0.g1()];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g1();
		@Pc(33) int local33 = arg0.g1();
		@Pc(37) int local37 = arg0.g1();
		@Pc(41) int local41 = arg0.g2();
		@Pc(45) int local45 = arg0.g2();
		@Pc(49) int local49 = arg0.gSmart2or4null();
		@Pc(53) int local53 = arg0.g4();
		@Pc(57) int local57 = arg0.g4();
		return new Class407(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!lv", name = "kj", descriptor = "(Lclient!yp;I)V")
	static void method28945(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class350.method28010(local11, local14, arg0, 1815740643);
	}

	@OriginalMember(owner = "client!lv", name = "azz", descriptor = "(Lclient!yp;I)V")
	static void method28946(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub25_1.method16330((byte) 53) ? 1 : 0;
	}

	@OriginalMember(owner = "client!lv", name = "ei", descriptor = "(Lclient!yp;B)V")
	static void method28947(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2089494173);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class152.method14627(local16, local22, arg0, (byte) -99);
	}

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "(Lclient!vk;B)Z")
	static boolean method28948(@OriginalArg(0) Class615 arg0, @OriginalArg(1) byte arg1) {
		return Class299.method27022(arg0, null, (byte) 6);
	}

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "(IIIII)Lclient!akx;")
	public static Class80_Sub33 method28949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class80_Sub33[] local2 = Class80_Sub33.aClass80_Sub33Array1;
		synchronized (Class80_Sub33.aClass80_Sub33Array1) {
			if (Class80_Sub33.anInt1651 * 24502281 == 0) {
				return new Class80_Sub33(arg0, arg1, arg2, arg3);
			} else {
				Class80_Sub33.aClass80_Sub33Array1[(Class80_Sub33.anInt1651 -= 1399041593) * 24502281].method14468(arg0, arg1, arg2, arg3, 639279136);
				return Class80_Sub33.aClass80_Sub33Array1[Class80_Sub33.anInt1651 * 24502281];
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "ku", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method28950(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aString186 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ky;Lclient!km;IIIIIIIIII)V")
	Class407(@OriginalArg(0) String arg0, @OriginalArg(1) Class391 arg1, @OriginalArg(2) Class383 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aString208 = arg0;
		this.aClass391_14 = arg1;
		this.aClass383_14 = arg2;
		this.anInt4599 = arg3 * -722583955;
		this.anInt4600 = arg4 * -311256193;
		this.anInt4601 = arg5 * 163218455;
		this.anInt4602 = arg6 * -1608084051;
		this.anInt4603 = arg7 * -839857435;
		this.anInt4607 = arg8 * -292196609;
		this.anInt4605 = arg9 * -1829917849;
		this.anInt4606 = arg10 * -1861826941;
		this.anInt4604 = arg11 * -601132939;
		this.anInt4608 = arg12 * 81748339;
	}

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_8;
	}

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_8;
	}
}
