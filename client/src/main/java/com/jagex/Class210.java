package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class210 {

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public int anInt3634;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
	public int anInt3635;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public int anInt3637;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!cq;")
	public Class210 aClass210_2;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!pq;")
	public Class489 aClass489_96;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public final int anInt3636;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public final int anInt3633;

	@OriginalMember(owner = "client!cq", name = "cb", descriptor = "(Lclient!yf;I)V")
	static void method25509(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1694193851);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class96.method2325(local16, local22, arg0, 658206658);
	}

	@OriginalMember(owner = "client!cq", name = "lv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method25510(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -1915563430;
		@Pc(7) byte local7 = 10;
		@Pc(21) byte[] local21 = new byte[] { (byte) arg2.anIntArray521[arg2.anInt6052 * -1497248091] };
		@Pc(37) byte[] local37 = new byte[] { (byte) arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1] };
		Class617.method32273(arg0, local7, local21, local37, arg2, 700309565);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(II)V")
	Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3636 = arg0 * -836529219;
		this.anInt3633 = arg1 * 496974809;
	}

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "(II)Lclient!cq;")
	Class210 method25503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class210(this.anInt3636 * -1159348331, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(Lclient!np;B)Lclient!na;")
	public Class431 method25504(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method29056(this.anInt3636 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "(Lclient!np;)Lclient!na;")
	public Class431 method25505(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29056(this.anInt3636 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "(Lclient!np;)Lclient!na;")
	public Class431 method25506(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29056(this.anInt3636 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(Lclient!np;)Lclient!na;")
	public Class431 method25507(@OriginalArg(0) Interface47 arg0) {
		return arg0.method29056(this.anInt3636 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "(I)Lclient!cq;")
	Class210 method25508(@OriginalArg(0) int arg0) {
		return new Class210(this.anInt3636 * -1159348331, arg0);
	}
}
