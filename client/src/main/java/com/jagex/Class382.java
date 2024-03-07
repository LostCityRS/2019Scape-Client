package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public class Class382 implements Interface32 {

	@OriginalMember(owner = "client!km", name = "n", descriptor = "I")
	public static final int anInt4626 = 1;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static final int anInt4627 = 2;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public static final int anInt4629 = 0;

	@OriginalMember(owner = "client!km", name = "es", descriptor = "Lclient!pe;")
	public static Class479 aClass479_2;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Lclient!kv;")
	public final Class390 aClass390_9;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!ky;")
	public final Class392 aClass392_9;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	public final int anInt4630;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public final int anInt4628;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "I")
	public final int anInt4631;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public final int anInt4632;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	public final int anInt4625;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIII)V", line = 17)
	Class382(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass390_9 = arg0;
		this.aClass392_9 = arg1;
		this.anInt4630 = arg2 * 312193091;
		this.anInt4628 = arg3 * -2136013739;
		this.anInt4631 = arg4 * 1300392279;
		this.anInt4632 = arg5 * -1408868263;
		this.anInt4625 = arg6 * -506917017;
	}

	@OriginalMember(owner = "client!km", name = "m", descriptor = "(Lclient!alw;)Lclient!km;", line = 28)
	public static Class382 method28133(@OriginalArg(0) Packet arg0) {
		@Pc(6) Class390 local6 = Class708.method36753(-657866540)[arg0.g1((short) 16384)];
		@Pc(13) Class392 local13 = Class252.method25976(196846681)[arg0.g1((short) 16384)];
		@Pc(17) int local17 = arg0.g2s((byte) -48);
		@Pc(21) int local21 = arg0.g2s((byte) -24);
		@Pc(25) int local25 = arg0.gSmart2or4null(-1918286249);
		@Pc(29) int local29 = arg0.g4(-118643075);
		@Pc(33) int local33 = arg0.g1((short) 16384);
		return new Class382(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!km", name = "n", descriptor = "(S)Lclient!kt;", line = 39)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_11;
	}

	@OriginalMember(owner = "client!km", name = "l", descriptor = "()Lclient!kt;", line = 39)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_11;
	}

	@OriginalMember(owner = "client!km", name = "m", descriptor = "(Lclient!dn;FI)F", line = 127)
	static float method28134(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			@Pc(8) float local8 = arg1 - arg0.aFloat275;
			return local8 * (arg0.aFloatArray99[2] + (arg0.aFloatArray99[0] * local8 + arg0.aFloatArray99[1]) * local8) + arg0.aFloatArray99[3];
		}
	}

	@OriginalMember(owner = "client!km", name = "cu", descriptor = "(Lclient!yf;S)V", line = 5320)
	static final void method28135(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 494464701);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class368.method27963(local16, local22, arg0, 215351404);
	}

	@OriginalMember(owner = "client!km", name = "abd", descriptor = "(Lclient!yf;I)V", line = 9940)
	static final void method28136(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26628(-1985248991);
	}
}
