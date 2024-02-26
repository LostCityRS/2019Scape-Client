package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class373 implements Interface33 {

	@OriginalMember(owner = "client!ka", name = "gy", descriptor = "Lclient!tx;")
	public static Class586 aClass586_1;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
	public final int anInt4507;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(Lclient!ald;)Lclient!ka;")
	public static Class373 method28411(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23182(-188755917);
		return new Class373(local3);
	}

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "(Lclient!ald;)Lclient!ka;")
	public static Class373 method28412(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23182(-336100419);
		return new Class373(local3);
	}

	@OriginalMember(owner = "client!ka", name = "vv", descriptor = "(Lclient!yp;B)V")
	static void method28413(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class167.method17877((String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], 1395046226);
	}

	@OriginalMember(owner = "client!ka", name = "hh", descriptor = "(I)V")
	static void method28414(@OriginalArg(0) int arg0) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -20);
		@Pc(7) Class463 local7 = Class160.aClass121_Sub1_2.method9608(2043947411);
		Class89.anInt319 = ((int) local7.aFloat297 - (local3.anInt5540 * -390642507 << 9)) * 2068667409;
		Class283.anInt3937 = -((int) local7.aFloat295) * 364051605;
		Class102_Sub2.anInt653 = ((int) local7.aFloat296 - (local3.anInt5537 * -894305615 << 9)) * 483037039;
		client.anInt3481 = ((int) ((double) Class160.aClass121_Sub1_2.method9612(-2035359138) * 2607.5945876176133D) & 0x3FFF) * -560342087;
		Class664.anInt5692 = ((int) ((double) Class160.aClass121_Sub1_2.method9648(-827111528) * 2607.5945876176133D) & 0x3FFF) * -399825347;
		Class338.anInt4231 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	Class373(@OriginalArg(0) int arg0) {
		this.anInt4507 = arg0 * -635265855;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_11;
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_11;
	}
}
