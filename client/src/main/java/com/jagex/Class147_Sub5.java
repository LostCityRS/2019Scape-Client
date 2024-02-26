package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajt")
public final class Class147_Sub5 extends Class147 {

	@OriginalMember(owner = "client!ajt", name = "u", descriptor = "I")
	int anInt1491;

	@OriginalMember(owner = "client!ajt", name = "g", descriptor = "I")
	int anInt1492;

	@OriginalMember(owner = "client!ajt", name = "l", descriptor = "I")
	int anInt1493;

	@OriginalMember(owner = "client!ajt", name = "e", descriptor = "I")
	int anInt1494;

	@OriginalMember(owner = "client!ajt", name = "i", descriptor = "I")
	int anInt1495;

	@OriginalMember(owner = "client!ajt", name = "m", descriptor = "I")
	int anInt1496;

	@OriginalMember(owner = "client!ajt", name = "o", descriptor = "Ljava/lang/String;")
	String aString45;

	@OriginalMember(owner = "client!ajt", name = "ap", descriptor = "(Lclient!yp;I)V")
	static void method13539(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class24 local11 = arg0.aClass80_Sub1_Sub20_2.aClass24Array1[arg0.anIntArray526[arg0.anInt5780 * -1336568839]];
		@Pc(28) Class80_Sub20 local28 = (Class80_Sub20) local11.method560((long) arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581]);
		if (local28 != null) {
			arg0.anInt5780 += local28.anInt1588 * -1707498273;
		}
	}

	@OriginalMember(owner = "client!ajt", name = "ak", descriptor = "(IIB)V")
	static void method13540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(7, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!ajt", name = "awy", descriptor = "(Lclient!yp;B)V")
	static void method13541(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(42) long local42 = Class346.method27973(0, 0, 12, local13, local23, local33, -493493415);
		@Pc(45) int local45 = Class538.method30884(local42);
		if (local33 < 1970) {
			local45--;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local45;
	}

	@OriginalMember(owner = "client!ajt", name = "<init>", descriptor = "()V")
	Class147_Sub5() {
	}
}
