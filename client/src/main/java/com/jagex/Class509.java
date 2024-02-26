package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class509 {

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!qk;")
	public static final Class509 aClass509_2 = new Class509(0);

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!qk;")
	static final Class509 aClass509_3 = new Class509(1);

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	final int anInt5046;

	@OriginalMember(owner = "client!qk", name = "anc", descriptor = "(Lclient!yp;I)V")
	static void method30531(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(21) Class463 local21 = Class463.method29541((float) local13, (float) local13, (float) local13);
		Class160.aClass121_Sub1_2.method9704(local21, (byte) -73);
		local21.method29557();
	}

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "(Lclient!yp;I)V")
	static void method30532(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class614.method32273((byte) 24);
	}

	@OriginalMember(owner = "client!qk", name = "yw", descriptor = "(Lclient!yp;I)V")
	static void method30533(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3525 * -284278233;
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
	Class509(@OriginalArg(0) int arg0) {
		this.anInt5046 = arg0 * -1730581337;
	}
}
