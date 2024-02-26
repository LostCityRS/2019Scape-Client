package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yr")
public final class Class692 {

	@OriginalMember(owner = "client!yr", name = "f", descriptor = "I")
	public volatile int anInt5782 = 1135211701;

	@OriginalMember(owner = "client!yr", name = "t", descriptor = "Ljava/lang/String;")
	volatile String aString241;

	@OriginalMember(owner = "client!yr", name = "kt", descriptor = "(Lclient!yp;B)V")
	static void method36972(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2017969820);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class435.method29122(local16, local22, arg0, -776167368);
	}

	@OriginalMember(owner = "client!yr", name = "t", descriptor = "([I[II)V")
	public static void method36973(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg1 == null) {
			Class701.anIntArray530 = null;
			Class701.anIntArray529 = null;
			Class701.aByteArrayArrayArray14 = null;
			return;
		}
		Class701.anIntArray530 = arg0;
		Class701.anIntArray529 = new int[arg0.length];
		Class701.aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class701.anIntArray530.length; local25++) {
			Class701.aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!yr", name = "a", descriptor = "(J)I")
	public static int method36974(@OriginalArg(0) long arg0) {
		Class220.method25907(arg0);
		return Class62.aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!yr", name = "fm", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method36975(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean817 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 162347593);
	}

	@OriginalMember(owner = "client!yr", name = "akf", descriptor = "(Lclient!yp;I)V")
	static void method36976(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		if (Class159_Sub1.aClass24_16 == null) {
			return;
		}
		@Pc(36) Class80 local36 = Class159_Sub1.aClass24_16.method560((long) local13);
		if (local36 != null && !local28) {
			local36.method24395((byte) 65);
		} else if (local36 == null && local28) {
			local36 = new Class80();
			Class159_Sub1.aClass24_16.method563(local36, (long) local13);
		}
	}

	@OriginalMember(owner = "client!yr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class692(@OriginalArg(0) String arg0) {
		this.aString241 = arg0;
	}
}
