package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class164 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Ljava/lang/String;")
	String aString67;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "(Lclient!ald;Lclient!add;I)Lclient!abg;")
	static Class33 method15803(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class2_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class33 local4 = new Class33(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method23362(-1465768123);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class519 local18 = (Class519) Class622.method32436(Class519.class, local8, -200484162);
			while (true) {
				@Pc(22) int local22 = arg0.method23362(-97793143);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3152 -= 1034180571;
				@Pc(38) Class460 local38 = arg1.method1828(arg0, local18, -1774174167);
				if (local38 != null) {
					local4.method719(local38.anInt4907 * -38979583, local38.anObject19, -2101557454);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(II)I")
	static int method15804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!am", name = "bfd", descriptor = "(Lclient!yp;B)V")
	static void method15805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -1650379242;
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	Class164() {
	}
}
