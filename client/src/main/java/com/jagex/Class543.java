package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class543 {

	@OriginalMember(owner = "client!s", name = "rh", descriptor = "I")
	static int anInt5125;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	int anInt5122;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	int anInt5123;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	int anInt5124;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Z")
	boolean aBoolean905;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!gj;")
	Class289 aClass289_5 = Class289.aClass289_2;

	@OriginalMember(owner = "client!s", name = "afu", descriptor = "(Lclient!yp;I)V")
	static void method31175(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		@Pc(38) int local38 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14.indexOf(local25, local38);
	}

	@OriginalMember(owner = "client!s", name = "bfh", descriptor = "(Lclient!yp;I)V")
	static void method31176(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass65_15.method37268();
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	Class543() {
	}
}
