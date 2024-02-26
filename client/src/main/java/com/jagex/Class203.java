package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class203 {

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public static final int anInt3379 = 0;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public static final int anInt3381 = 4318;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	public static final int anInt3382 = 32902;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static final int anInt3383 = 4098;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public static final int anInt3385 = -1;

	@OriginalMember(owner = "client!cf", name = "as", descriptor = "I")
	static int anInt3386;

	@OriginalMember(owner = "client!cf", name = "ar", descriptor = "[Lclient!abj;")
	protected static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!cf", name = "up", descriptor = "I")
	static int anInt3387;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public final int anInt3384;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString125;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public final int anInt3380;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "J")
	public final long aLong341;

	@OriginalMember(owner = "client!cf", name = "aev", descriptor = "(Lclient!yp;I)V")
	static void method24972(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 | local23;
	}

	@OriginalMember(owner = "client!cf", name = "mo", descriptor = "(Lclient!yp;I)V")
	static void method24973(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2000103501);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class322.method27603(local16, local22, arg0, (byte) 33);
	}

	@OriginalMember(owner = "client!cf", name = "awv", descriptor = "(Lclient!yp;I)V")
	static void method24974(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (Class721.method37333(local12, (byte) -109) / 60000L);
	}

	@OriginalMember(owner = "client!cf", name = "gb", descriptor = "(Lclient!yp;I)V")
	static void method24975(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class80_Sub8.method13490(local11, local14, arg0, 1995427962);
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;JZ)V")
	public Class203(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3384 = arg0 * 1226138969;
		this.aString125 = arg1;
		this.anInt3380 = arg2 * -1562613265;
		this.aString126 = arg3;
		this.aLong341 = arg4 * 6185961686755577207L;
	}
}
