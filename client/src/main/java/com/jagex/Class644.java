package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class644 {

	@OriginalMember(owner = "client!wq", name = "rb", descriptor = "I")
	static int anInt5645;

	@OriginalMember(owner = "client!wq", name = "gv", descriptor = "Lclient!uf;")
	static Class592 aClass592_4;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "Ljava/lang/String;")
	String aString234;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	int anInt5644;

	@OriginalMember(owner = "client!wq", name = "lj", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method33031(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		@Pc(7) byte local7 = 10;
		@Pc(21) byte[] local21 = new byte[] { (byte) arg2.anIntArray525[arg2.anInt5778 * 1896589581] };
		@Pc(37) byte[] local37 = new byte[] { (byte) arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] };
		Class491.method30253(arg0, local7, local21, local37, arg2, -248629348);
	}

	@OriginalMember(owner = "client!wq", name = "aau", descriptor = "(Lclient!yp;I)V")
	static void method33032(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 0 || local12 >= client.anInt3519 * 227319795) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aClass699Array1[local12].aString243;
		}
	}

	@OriginalMember(owner = "client!wq", name = "aeh", descriptor = "(Lclient!yp;I)V")
	static void method33033(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(14) long local14 = (long) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) long local25 = (long) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(36) long local36 = (long) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (local14 * local36 / local25);
	}

	@OriginalMember(owner = "client!wq", name = "axw", descriptor = "(Lclient!yp;S)V")
	static void method33034(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(28) Class327 local28 = Class369.method28340(local13, local23, 1480943726);
		Class450.method29279((byte) 118);
		@Pc(33) Class80_Sub27 local33 = client.method25326(local28);
		Class723.method37343(local28, local33.method14325(-318983097), local33.anInt1636 * -909045709, (short) -2693);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	Class644() {
	}
}
