package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;

@OriginalClass("client!adp")
public final class Class86 {

	@OriginalMember(owner = "client!adp", name = "q", descriptor = "Lclient!cm;")
	static Class99 aClass99_2;

	@OriginalMember(owner = "client!adp", name = "pn", descriptor = "I")
	static int anInt284;

	@OriginalMember(owner = "client!adp", name = "af", descriptor = "Ljava/io/File;")
	static File aFile1;

	@OriginalMember(owner = "client!adp", name = "f", descriptor = "Z")
	final boolean aBoolean45;

	@OriginalMember(owner = "client!adp", name = "t", descriptor = "[Lclient!ady;")
	final Class92[] aClass92Array1;

	@OriginalMember(owner = "client!adp", name = "afi", descriptor = "(Lclient!yp;I)V")
	static void method1698(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class650.method33124((char) local12, -1805607693) ? 1 : 0;
	}

	@OriginalMember(owner = "client!adp", name = "qm", descriptor = "(Lclient!yp;I)V")
	static void method1699(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class443.method29215(local11, local14, arg0, (byte) -85);
	}

	@OriginalMember(owner = "client!adp", name = "o", descriptor = "(III)I")
	public static int method1700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!adp", name = "alk", descriptor = "(Lclient!yp;I)V")
	static void method1701(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 == 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.aBoolean401 ? 1 : 0;
		} else if (local12 == 1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.aBoolean407 ? 1 : 0;
		} else if (local12 == 2) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.aBoolean408 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!adp", name = "<init>", descriptor = "(Z[Lclient!ady;)V")
	Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class92[] arg1) {
		this.aBoolean45 = arg0;
		this.aClass92Array1 = arg1;
	}
}
