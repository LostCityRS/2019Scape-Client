package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class Class654 {

	@OriginalMember(owner = "client!xa", name = "f", descriptor = "[Lclient!atq;")
	static Class147_Sub3_Sub1_Sub1[] aClass147_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!xa", name = "e", descriptor = "I")
	static int anInt5672 = 0;

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "I")
	static int anInt5669 = 0;

	@OriginalMember(owner = "client!xa", name = "g", descriptor = "I")
	static int anInt5666 = 0;

	@OriginalMember(owner = "client!xa", name = "i", descriptor = "I")
	static int anInt5667 = 0;

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "I")
	static int anInt5668 = 0;

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "I")
	static int anInt5664 = 0;

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "[Lclient!nc;")
	static Class433[] aClass433Array1 = new Class433[16];

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "I")
	static int anInt5670 = 0;

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "Lclient!aax;")
	static Class24 aClass24_38 = new Class24(16);

	@OriginalMember(owner = "client!xa", name = "x", descriptor = "Lclient!aax;")
	static Class24 aClass24_39 = new Class24(8);

	@OriginalMember(owner = "client!xa", name = "w", descriptor = "I")
	static int anInt5671 = 0;

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "I")
	static int anInt5665 = 336957318;

	@OriginalMember(owner = "client!xa", name = "w", descriptor = "(Lclient!di;J)V")
	public static void method33147(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		anInt5664 = anInt5668 * -2011109703;
		anInt5668 = 0;
		Class303.method27111((byte) 83);
		@Pc(11) Iterator local11 = Class286.aList14.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class658 local18 = (Class658) local11.next();
			@Pc(23) boolean local23 = local18.method33236(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class40.aClass658Array1[anInt5667 * -1544286437] = local18;
				anInt5667 = (anInt5667 * -1544286437 + 1 & Class233.anIntArray351[anInt5665 * 2087772395]) * 2032775955;
			}
		}
	}

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "(I)I")
	static int method33148(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub20 local5 = (Class80_Sub20) aClass24_38.method560((long) arg0);
		if (local5 == null) {
			@Pc(12) Class433 local12 = Class518.anInterface48_1.method29225(arg0, (byte) -109);
			if (local12 == null || local12.anInt4737 * 821164565 != 2) {
				return -1;
			}
			local5 = new Class80_Sub20(anInt5670 * 70555301);
			aClass24_38.method563(local5, (long) arg0);
			aClass433Array1[(anInt5670 += -1670815443) * 70555301 - 1] = local12;
		}
		return local5.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "(I)I")
	static int method33149(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub20 local5 = (Class80_Sub20) aClass24_38.method560((long) arg0);
		if (local5 == null) {
			@Pc(12) Class433 local12 = Class518.anInterface48_1.method29225(arg0, (byte) -28);
			if (local12 == null || local12.anInt4737 * 821164565 != 2) {
				return -1;
			}
			local5 = new Class80_Sub20(anInt5670 * 70555301);
			aClass24_38.method563(local5, (long) arg0);
			aClass433Array1[(anInt5670 += -1670815443) * 70555301 - 1] = local12;
		}
		return local5.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "(Lclient!np;Lclient!nt;)V")
	public static void method33150(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface48 arg1) {
		anInt5672 = 0;
		anInt5669 = 0;
		Class286.aList14 = new LinkedList();
		aClass147_Sub3_Sub1_Sub1Array1 = new Class147_Sub3_Sub1_Sub1[1024];
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
		Class518.anInterface48_1 = arg1;
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lclient!np;Lclient!nt;)V")
	public static void method33151(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface48 arg1) {
		anInt5672 = 0;
		anInt5669 = 0;
		Class286.aList14 = new LinkedList();
		aClass147_Sub3_Sub1_Sub1Array1 = new Class147_Sub3_Sub1_Sub1[1024];
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
		Class518.anInterface48_1 = arg1;
	}

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "(Lclient!te;Lclient!di;)V")
	public static void method33152(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1) {
		@Pc(2) Iterator local2 = Class286.aList14.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class658 local9 = (Class658) local2.next();
			if (local9.aBoolean973) {
				local9.method33243(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!xa", name = "x", descriptor = "(Lclient!np;Lclient!nt;)V")
	public static void method33153(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface48 arg1) {
		anInt5672 = 0;
		anInt5669 = 0;
		Class286.aList14 = new LinkedList();
		aClass147_Sub3_Sub1_Sub1Array1 = new Class147_Sub3_Sub1_Sub1[1024];
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
		Class518.anInterface48_1 = arg1;
	}

	@OriginalMember(owner = "client!xa", name = "y", descriptor = "()I")
	public static int method33154() {
		return anInt5665 * 2087772395;
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "()V")
	public static void method33155() {
		aClass24_39 = new Class24(8);
		anInt5671 = 0;
		@Pc(9) Iterator local9 = Class286.aList14.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class658 local16 = (Class658) local9.next();
			local16.method33254();
		}
	}

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "(Lclient!np;Lclient!nt;)V")
	public static void method33156(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface48 arg1) {
		anInt5672 = 0;
		anInt5669 = 0;
		Class286.aList14 = new LinkedList();
		aClass147_Sub3_Sub1_Sub1Array1 = new Class147_Sub3_Sub1_Sub1[1024];
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
		Class518.anInterface48_1 = arg1;
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "()V")
	public static void method33157() {
		aClass24_39 = new Class24(8);
		anInt5671 = 0;
		@Pc(9) Iterator local9 = Class286.aList14.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class658 local16 = (Class658) local9.next();
			local16.method33254();
		}
	}

	@OriginalMember(owner = "client!xa", name = "j", descriptor = "(I)I")
	static int method33158(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub20 local5 = (Class80_Sub20) aClass24_38.method560((long) arg0);
		if (local5 == null) {
			@Pc(12) Class433 local12 = Class518.anInterface48_1.method29225(arg0, (byte) -2);
			if (local12 == null || local12.anInt4737 * 821164565 != 2) {
				return -1;
			}
			local5 = new Class80_Sub20(anInt5670 * 70555301);
			aClass24_38.method563(local5, (long) arg0);
			aClass433Array1[(anInt5670 += -1670815443) * 70555301 - 1] = local12;
		}
		return local5.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!xa", name = "z", descriptor = "(I)V")
	public static void method33159(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5665 = arg0 * -1979004989;
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "(I)V")
	public static void method33160(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5665 = arg0 * -1979004989;
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "v", descriptor = "(I)V")
	public static void method33161(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5665 = arg0 * -1979004989;
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "(I)V")
	public static void method33162(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5665 = arg0 * -1979004989;
		Class40.aClass658Array1 = new Class658[Class233.anIntArray351[anInt5665 * 2087772395] + 1];
		anInt5666 = 0;
		anInt5667 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "()I")
	public static int method33163() {
		return anInt5665 * 2087772395;
	}

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()I")
	public static int method33164() {
		return anInt5665 * 2087772395;
	}

	@OriginalMember(owner = "client!xa", name = "cy", descriptor = "(Lclient!yp;I)V")
	static void method33165(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class299.method27024(local11, local14, arg0, 1954599148);
	}

	@OriginalMember(owner = "client!xa", name = "wm", descriptor = "(Lclient!yp;S)V")
	static void method33166(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class220.method25906(local13, local23, false, -866041822);
	}

	@OriginalMember(owner = "client!xa", name = "aet", descriptor = "(Lclient!yp;I)V")
	static void method33167(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1];
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = (int) Math.sqrt((double) local9);
	}

	@OriginalMember(owner = "client!xa", name = "bbf", descriptor = "(Lclient!yp;I)V")
	static void method33168(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!xa", name = "bdy", descriptor = "(Lclient!yp;B)V")
	static void method33169(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local13, 326461728).method26717(local23, (byte) -35);
	}

	@OriginalMember(owner = "client!xa", name = "awh", descriptor = "(Lclient!yp;I)V")
	static void method33170(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) int local16 = local12 >> 16;
		if (Class709.aClass310Array1[local16] == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class709.aClass310Array1[local16].aClass327Array2[local12].anInt4092 * -1021656761;
		}
	}

	@OriginalMember(owner = "client!xa", name = "f", descriptor = "(Ljava/lang/String;ZZI)V")
	public static void method33171(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class162_Sub1.method15721(arg0, arg1, "openjs", arg2, (byte) 37);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "()V")
	Class654() throws Throwable {
		throw new Error();
	}
}
