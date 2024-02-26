package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class269 {

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
	public static int anInt3918;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Lclient!fn;")
	public static final Class269 aClass269_4 = new Class269();

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!fn;")
	static final Class269 aClass269_1 = new Class269();

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!fn;")
	static final Class269 aClass269_2 = new Class269();

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!fn;")
	static final Class269 aClass269_3 = new Class269();

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Lclient!fn;")
	public static final Class269 aClass269_5 = new Class269();

	@OriginalMember(owner = "client!fn", name = "fs", descriptor = "(Lclient!yp;I)V")
	static void method26683(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2102521787);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class556.method31372(local16, local22, arg0, (byte) 112);
	}

	@OriginalMember(owner = "client!fn", name = "ael", descriptor = "(Lclient!yp;B)V")
	static void method26684(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(37) int local37 = 31 - local33;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 << local37 >>> local23 + local37;
	}

	@OriginalMember(owner = "client!fn", name = "apw", descriptor = "(Lclient!yp;I)V")
	static void method26685(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3846 * -378193585;
	}

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	static Class method26686(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "fg", descriptor = "(Lclient!pm;ZFFFFIII)V")
	static void method26687(@OriginalArg(0) Class487 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = client.aClass539_1.method30900(-1530216959);
		@Pc(7) int local7 = client.aClass539_1.method30899((short) 16048);
		arg0.method30188(arg2, arg3, arg4, arg5, (float) local7, (float) local3, (float) arg6, (float) arg7);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	Class269() {
	}
}
