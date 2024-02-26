package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class118 {

	@OriginalMember(owner = "client!ah", name = "uo", descriptor = "I")
	static int anInt1027;

	@OriginalMember(owner = "client!ah", name = "ui", descriptor = "J")
	static long aLong34;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "[B")
	volatile byte[] aByteArray31;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Z")
	volatile boolean aBoolean188;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Ljava/net/URL;")
	final URL anURL1;

	@OriginalMember(owner = "client!ah", name = "alz", descriptor = "(Lclient!yp;I)V")
	static void method8826(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = null;
		if (Class134.aClass306_1 != null) {
			local1 = Class134.aClass306_1.method27208(2056586781);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local1;
	}

	@OriginalMember(owner = "client!ah", name = "zs", descriptor = "(Lclient!yp;I)V")
	static void method8827(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class50 local29 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local13, 581202736);
		if (local29.aClass521_1 != Class521.aClass521_42) {
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local29.method1016(local23, 965421312);
	}

	@OriginalMember(owner = "client!ah", name = "aw", descriptor = "(Lclient!yp;I)V")
	static void method8828(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5777 -= -1672568046;
		if (arg0.aLongArray27[arg0.anInt5777 * -628853575 + 1] != arg0.aLongArray27[arg0.anInt5777 * -628853575]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/net/URL;)V")
	Class118(@OriginalArg(0) URL arg0) {
		this.anURL1 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(S)[B")
	byte[] method8822(@OriginalArg(0) short arg0) {
		return this.aByteArray31;
	}

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "(I)Z")
	boolean method8823(@OriginalArg(0) int arg0) {
		return this.aBoolean188;
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "()Z")
	boolean method8824() {
		return this.aBoolean188;
	}

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "()[B")
	byte[] method8825() {
		return this.aByteArray31;
	}
}
