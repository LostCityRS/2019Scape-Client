package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class611 implements Interface75 {

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!vg;")
	static final Class611 aClass611_5 = new Class611(0);

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!vg;")
	static final Class611 aClass611_2 = new Class611(1);

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!vg;")
	static final Class611 aClass611_1 = new Class611(2);

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!vg;")
	static final Class611 aClass611_3 = new Class611(3);

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Lclient!vg;")
	static final Class611 aClass611_6 = new Class611(4);

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!vg;")
	static final Class611 aClass611_4 = new Class611(5);

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	final int anInt5402;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "()[Lclient!vg;")
	public static Class611[] method32212() {
		return new Class611[] { aClass611_4, aClass611_1, aClass611_2, aClass611_5, aClass611_6, aClass611_3 };
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "()[Lclient!vg;")
	public static Class611[] method32213() {
		return new Class611[] { aClass611_4, aClass611_1, aClass611_2, aClass611_5, aClass611_6, aClass611_3 };
	}

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "()[Lclient!vg;")
	public static Class611[] method32214() {
		return new Class611[] { aClass611_4, aClass611_1, aClass611_2, aClass611_5, aClass611_6, aClass611_3 };
	}

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "()[Lclient!vg;")
	public static Class611[] method32215() {
		return new Class611[] { aClass611_4, aClass611_1, aClass611_2, aClass611_5, aClass611_6, aClass611_3 };
	}

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "(Lclient!yp;B)V")
	static void method32216(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], -584296886)).method28027(Class672.aClass134_1, arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 648878028) ? 1 : 0;
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!vg", name = "ax", descriptor = "(Lclient!yp;B)V")
	static void method32217(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class488.method30210(-1766806435);
		Class653.method33142(arg0, -931429502);
	}

	@OriginalMember(owner = "client!vg", name = "bap", descriptor = "(Lclient!yp;I)V")
	static void method32218(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub1_1.method16950(local12, (byte) -16);
	}

	@OriginalMember(owner = "client!vg", name = "aav", descriptor = "(Lclient!yp;S)V")
	static void method32219(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13.startsWith(Class6_Sub1.method23670(0, -1945770077)) || local13.startsWith(Class6_Sub1.method23670(1, -719220405))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class483.method30031(local13, (byte) 4);
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
	public static void method32220(@OriginalArg(0) int arg0) {
		if (Class659.aClass138_6 != null) {
			Class659.aClass138_6.method11509((byte) 1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "tb", descriptor = "(Lclient!yp;I)V")
	static void method32221(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2075897035);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4102 * 1332657417;
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	Class611(@OriginalArg(0) int arg0) {
		this.anInt5402 = arg0 * -656821527;
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5402 * -1755822759;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5402 * -1755822759;
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5402 * -1755822759;
	}
}
