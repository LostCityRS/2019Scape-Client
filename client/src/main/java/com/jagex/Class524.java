package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class524 {

	@OriginalMember(owner = "client!ra", name = "ew", descriptor = "Lclient!pk;")
	public static Class485 aClass485_2;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!ra;")
	static final Class524 aClass524_9 = new Class524(0);

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_2 = new Class524(1);

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_3 = new Class524(2);

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_10 = new Class524(3);

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_5 = new Class524(4);

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_6 = new Class524(5);

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_7 = new Class524(6);

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_8 = new Class524(7);

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ra;")
	static final Class524 aClass524_4 = new Class524(8);

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!ra;")
	public static final Class524 aClass524_1 = new Class524(9);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	final int anInt5060;

	@OriginalMember(owner = "client!ra", name = "yl", descriptor = "(Lclient!yp;I)V")
	static void method30652(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean733 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "(Lclient!ald;B)Lclient!kn;")
	static Class125 method30653(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class391 local6 = Class58_Sub1.method15727((byte) -107)[arg0.method23362(-274068544)];
		@Pc(13) Class383 local13 = Class646.method33047(-1097781758)[arg0.method23362(1082608891)];
		@Pc(17) int local17 = arg0.method23179(363836379);
		@Pc(21) int local21 = arg0.method23179(313139019);
		@Pc(25) int local25 = arg0.method23178((byte) -117);
		@Pc(29) int local29 = arg0.method23178((byte) -50);
		@Pc(33) int local33 = arg0.method23179(794147482);
		@Pc(37) int local37 = arg0.method23210((byte) 76);
		@Pc(41) int local41 = arg0.method23182(1583191095);
		return new Class125(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	Class524(@OriginalArg(0) int arg0) {
		this.anInt5060 = arg0 * -762841263;
	}
}
