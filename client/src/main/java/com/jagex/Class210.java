package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public class Class210 {

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!cq;")
	public Class210 aClass210_2;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!pq;")
	public Class489 aClass489_96;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public final int anInt3595;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public final int anInt3592;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(II)V", line = 16)
	Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3595 = arg0 * -836529219;
		this.anInt3592 = arg1 * 496974809;
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(Lclient!np;B)Lclient!na;", line = 22)
	public Class431 method25410(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method28875(this.anInt3595 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "(Lclient!np;)Lclient!na;", line = 22)
	public Class431 method25411(@OriginalArg(0) Interface47 arg0) {
		return arg0.method28875(this.anInt3595 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "(Lclient!np;)Lclient!na;", line = 22)
	public Class431 method25412(@OriginalArg(0) Interface47 arg0) {
		return arg0.method28875(this.anInt3595 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(Lclient!np;)Lclient!na;", line = 22)
	public Class431 method25413(@OriginalArg(0) Interface47 arg0) {
		return arg0.method28875(this.anInt3595 * -1159348331, -657045947);
	}

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "(II)Lclient!cq;", line = 26)
	Class210 method25414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class210(this.anInt3595 * -1159348331, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "(I)Lclient!cq;", line = 26)
	Class210 method25415(@OriginalArg(0) int arg0) {
		return new Class210(this.anInt3595 * -1159348331, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "cb", descriptor = "(Lclient!yf;I)V", line = 5426)
	static final void method25416(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1694193851);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class96.method2325(local16, local22, arg0, 658206658);
	}

	@OriginalMember(owner = "client!cq", name = "lv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6965)
	static final void method25417(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		@Pc(7) byte local7 = 10;
		@Pc(21) byte[] local21 = new byte[] { (byte) arg2.anIntArray519[arg2.anInt5891 * -1497248091] };
		@Pc(37) byte[] local37 = new byte[] { (byte) arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] };
		Class617.method32092(arg0, local7, local21, local37, arg2, 700309565);
	}
}
