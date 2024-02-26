package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class617 {

	@OriginalMember(owner = "client!vm", name = "uk", descriptor = "I")
	static int anInt5429;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "Lclient!vm;")
	public static final Class617 aClass617_3 = new Class617(0);

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!vm;")
	public static final Class617 aClass617_2 = new Class617(1);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!vm;")
	public static final Class617 aClass617_1 = new Class617(2);

	@OriginalMember(owner = "client!vm", name = "aim", descriptor = "(Lclient!yp;I)V")
	static void method32291(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(28) Class80_Sub1_Sub17 local28 = Class71.aClass510_2.method30536(local13, 1725260770);
		@Pc(33) int local33 = local28.anIntArray277[local23];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local33;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(Ljava/lang/String;B)V")
	public static void method32292(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		Class255.method26406(0, 0, "", "", "", arg0, null, (byte) 3);
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V")
	Class617(@OriginalArg(0) int arg0) {
	}
}
