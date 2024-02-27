package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class382 implements Interface32 {

	@OriginalMember(owner = "client!km", name = "n", descriptor = "I")
	public static final int anInt4787 = 1;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static final int anInt4788 = 2;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public static final int anInt4790 = 0;

	@OriginalMember(owner = "client!km", name = "es", descriptor = "Lclient!pe;")
	public static Class479 aClass479_2;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Lclient!kv;")
	public final Class390 aClass390_9;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!ky;")
	public final Class392 aClass392_9;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	public final int anInt4791;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public final int anInt4789;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "I")
	public final int anInt4792;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public final int anInt4793;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	public final int anInt4786;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "(Lclient!alw;)Lclient!km;")
	public static Class382 method28314(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(6) Class390 local6 = Class708.method36937(-657866540)[arg0.method22425((short) 16384)];
		@Pc(13) Class392 local13 = Class252.method26071(196846681)[arg0.method22425((short) 16384)];
		@Pc(17) int local17 = arg0.method22494((byte) -48);
		@Pc(21) int local21 = arg0.method22494((byte) -24);
		@Pc(25) int local25 = arg0.method22448(-1918286249);
		@Pc(29) int local29 = arg0.method22431(-118643075);
		@Pc(33) int local33 = arg0.method22425((short) 16384);
		return new Class382(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!km", name = "m", descriptor = "(Lclient!dn;FI)F")
	static float method28315(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			@Pc(8) float local8 = arg1 - arg0.aFloat275;
			return local8 * (arg0.aFloatArray99[2] + (arg0.aFloatArray99[0] * local8 + arg0.aFloatArray99[1]) * local8) + arg0.aFloatArray99[3];
		}
	}

	@OriginalMember(owner = "client!km", name = "abd", descriptor = "(Lclient!yf;I)V")
	static void method28316(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26710(-1985248991);
	}

	@OriginalMember(owner = "client!km", name = "cu", descriptor = "(Lclient!yf;S)V")
	static void method28317(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 494464701);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class368.method28147(local16, local22, arg0, 215351404);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIII)V")
	Class382(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass390_9 = arg0;
		this.aClass392_9 = arg1;
		this.anInt4791 = arg2 * 312193091;
		this.anInt4789 = arg3 * -2136013739;
		this.anInt4792 = arg4 * 1300392279;
		this.anInt4793 = arg5 * -1408868263;
		this.anInt4786 = arg6 * -506917017;
	}

	@OriginalMember(owner = "client!km", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return Class388.aClass388_11;
	}

	@OriginalMember(owner = "client!km", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return Class388.aClass388_11;
	}
}
