package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class510 {

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	static final int anInt5047 = 0;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	static final int anInt5048 = 32768;

	@OriginalMember(owner = "client!ql", name = "hv", descriptor = "Lclient!aot;")
	public static Class41_Sub15 aClass41_Sub15_1;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_88 = new Class243(64);

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_123;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_122;

	@OriginalMember(owner = "client!ql", name = "aes", descriptor = "(Lclient!yp;B)V")
	static void method30537(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class467.method29717(local13, local23);
	}

	@OriginalMember(owner = "client!ql", name = "awj", descriptor = "(Lclient!yp;B)V")
	static void method30538(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) long local2 = Class303.method27111((byte) 116);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class692.method36974(local2);
	}

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "(IIII)I")
	public static int method30539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Class210.method25806(arg2 - arg1 + 1, 943975280);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!ql", name = "pa", descriptor = "(Lclient!yp;I)V")
	static void method30540(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2052816894);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class114.method8627(local16, local22, arg0, 986853374);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!zv;Lclient!pf;Lclient!pf;)V")
	public Class510(@OriginalArg(0) Class719 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2) {
		this.aClass480_123 = arg1;
		this.aClass480_122 = arg2;
		if (this.aClass480_123 != null) {
			this.aClass480_123.method29929(0, -561697017);
		}
		if (this.aClass480_122 != null) {
			this.aClass480_122.method29929(0, -561697017);
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)Lclient!asn;")
	public Class80_Sub1_Sub17 method30534(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub17 local6 = (Class80_Sub1_Sub17) this.aClass243_88.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass480_122.method29918(0, arg0 & 0x7FFF, 1896589581);
		} else {
			local23 = this.aClass480_123.method29918(0, arg0, 1896589581);
		}
		local6 = new Class80_Sub1_Sub17();
		if (local23 != null) {
			local6.method22898(new Class80_Sub36(local23), (byte) -41);
		}
		if (arg0 >= 32768) {
			local6.method22897((byte) 0);
		}
		this.aClass243_88.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)Lclient!asn;")
	public Class80_Sub1_Sub17 method30535(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub17 local6 = (Class80_Sub1_Sub17) this.aClass243_88.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass480_122.method29918(0, arg0 & 0x7FFF, 1896589581);
		} else {
			local23 = this.aClass480_123.method29918(0, arg0, 1896589581);
		}
		local6 = new Class80_Sub1_Sub17();
		if (local23 != null) {
			local6.method22898(new Class80_Sub36(local23), (byte) -58);
		}
		if (arg0 >= 32768) {
			local6.method22897((byte) 0);
		}
		this.aClass243_88.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "(II)Lclient!asn;")
	public Class80_Sub1_Sub17 method30536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class80_Sub1_Sub17 local6 = (Class80_Sub1_Sub17) this.aClass243_88.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass480_122.method29918(0, arg0 & 0x7FFF, 1896589581);
		} else {
			local23 = this.aClass480_123.method29918(0, arg0, 1896589581);
		}
		local6 = new Class80_Sub1_Sub17();
		if (local23 != null) {
			local6.method22898(new Class80_Sub36(local23), (byte) -94);
		}
		if (arg0 >= 32768) {
			local6.method22897((byte) 0);
		}
		this.aClass243_88.method26253(local6, (long) arg0);
		return local6;
	}
}
