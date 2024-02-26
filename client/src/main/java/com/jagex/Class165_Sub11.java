package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amk")
public final class Class165_Sub11 extends Class165 {

	@OriginalMember(owner = "client!amk", name = "c", descriptor = "(B)I")
	public static int method16047(@OriginalArg(0) byte arg0) {
		return (int) (1000000000L / (Class554.aLong346 * -4113900210149837993L));
	}

	@OriginalMember(owner = "client!amk", name = "i", descriptor = "(Lclient!ald;II)Lclient!asb;")
	static Class80_Sub1_Sub12 method16048(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(30) Class80_Sub1_Sub12 local30 = new Class80_Sub1_Sub12(arg1, arg0.method23376((short) 11255), arg0.method23376((short) 4012), arg0.method23182(-831308286), arg0.method23182(873711021), arg0.method23362(615944196) == 1, arg0.method23362(-1330603613), arg0.method23362(185926497));
		@Pc(34) int local34 = arg0.method23362(1032192776);
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass8_42.method232(new Class80_Sub16(arg0.method23362(-1862914170), arg0.method23178((byte) -21), arg0.method23178((byte) -62), arg0.method23178((byte) -84), arg0.method23178((byte) -109), arg0.method23178((byte) -52), arg0.method23178((byte) -35), arg0.method23178((byte) -99), arg0.method23178((byte) -48)), 330126519);
		}
		local30.method22597(18717591);
		return local30;
	}

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub11(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.method14947(221673006).method449(-1940972088) ? Class345.aClass345_6.anInt4247 * 659011863 : Class345.aClass345_2.anInt4247 * 659011863;
	}

	@OriginalMember(owner = "client!amk", name = "s", descriptor = "(B)Z")
	public boolean method16038(@OriginalArg(0) byte arg0) {
		if (this.aClass80_Sub37_48.method14947(-1469998150).method449(663657049)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass80_Sub37_48.method14947(514530730).method441(1853548323);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!amk", name = "a", descriptor = "(I)V")
	public void method16039(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14947(1250618014).method449(-196847148)) {
			this.anInt2398 = Class345.aClass345_6.anInt4247 * 1485027807;
			return;
		}
		@Pc(20) int local20 = this.aClass80_Sub37_48.method14947(-1313555422).method441(1879944278);
		if (local20 < 245) {
			this.anInt2398 = Class345.aClass345_2.anInt4247 * 1485027807;
		}
		if (this.anInt2398 * -229615671 == Class345.aClass345_4.anInt4247 * 659011863 && local20 < 500) {
			this.anInt2398 = Class345.aClass345_3.anInt4247 * 1485027807;
		}
		if (this.anInt2398 * -229615671 < Class345.aClass345_2.anInt4247 * 659011863 || this.anInt2398 * -229615671 > Class345.aClass345_5.anInt4247 * 659011863) {
			this.anInt2398 = this.method16949((byte) 48) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amk", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14947(-1918526860).method449(-613325402) ? Class345.aClass345_6.anInt4247 * 659011863 : Class345.aClass345_2.anInt4247 * 659011863;
	}

	@OriginalMember(owner = "client!amk", name = "k", descriptor = "(B)I")
	public int method16040(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amk", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass80_Sub37_48.method14947(1883330932).method449(1901063269)) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass80_Sub37_48.method14947(-960339564).method441(105828685);
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class345.aClass345_4.anInt4247 * 659011863 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!amk", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amk", name = "h", descriptor = "()I")
	public int method16041() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amk", name = "w", descriptor = "()Z")
	public boolean method16042() {
		if (this.aClass80_Sub37_48.method14947(1784892317).method449(-1648771608)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass80_Sub37_48.method14947(1936385015).method441(-1275253115);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!amk", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14947(293287728).method449(855316743)) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass80_Sub37_48.method14947(2135437782).method441(-2079034901);
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class345.aClass345_4.anInt4247 * 659011863 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!amk", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amk", name = "x", descriptor = "()Z")
	public boolean method16043() {
		if (this.aClass80_Sub37_48.method14947(-1509104709).method449(-2033681334)) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass80_Sub37_48.method14947(1464387607).method441(1034039661);
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!amk", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.method14947(2079391105).method449(17063700) ? Class345.aClass345_6.anInt4247 * 659011863 : Class345.aClass345_2.anInt4247 * 659011863;
	}

	@OriginalMember(owner = "client!amk", name = "r", descriptor = "()I")
	public int method16044() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amk", name = "q", descriptor = "()I")
	public int method16045() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amk", name = "d", descriptor = "()I")
	public int method16046() {
		return this.anInt2398 * -229615671;
	}
}
