package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wz")
public abstract class Class163 {

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "I")
	static final int anInt2077 = 4;

	@OriginalMember(owner = "client!wz", name = "f", descriptor = "I")
	static final int anInt2078 = 2;

	@OriginalMember(owner = "client!wz", name = "u", descriptor = "I")
	static final int anInt2079 = 8;

	@OriginalMember(owner = "client!wz", name = "t", descriptor = "I")
	static final int anInt2082 = 1;

	@OriginalMember(owner = "client!wz", name = "ur", descriptor = "I")
	static int anInt2084;

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "I")
	int anInt2080;

	@OriginalMember(owner = "client!wz", name = "l", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!wz", name = "i", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "(IIII)I")
	public static int method15759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "(IIII)I")
	public static int method15760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!wz", name = "qu", descriptor = "(Lclient!yp;I)V")
	static void method15761(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2053031825);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class76.method1363(local16, local22, arg0, -1217566376);
	}

	@OriginalMember(owner = "client!wz", name = "asq", descriptor = "(Lclient!yp;I)V")
	static void method15762(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 15);
		Class719.method37291(920243896);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!wz", name = "dy", descriptor = "(ZB)V")
	static void method15763(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class626 local3 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18981(1176135641);
		@Pc(13) Class80_Sub1_Sub12 local13 = Class159_Sub1.method15338(local3.anInt5540 * -390642507, local3.anInt5537 * -894305615);
		if (local13 == null) {
			local13 = Class159_Sub1.method15423(Class159_Sub1.aClass632_2.anInt5587 * 33807589);
		}
		if (local13 == Class103_Sub8.aClass80_Sub1_Sub12_1 && !arg0) {
			return;
		}
		Class103_Sub8.aClass80_Sub1_Sub12_1 = local13;
		@Pc(32) boolean local32 = Class159_Sub1.method15419(local13);
		if (local32) {
			Class159_Sub1.aBoolean398 = true;
			Class443.method29216(766447493);
		}
	}

	@OriginalMember(owner = "client!wz", name = "arq", descriptor = "(Lclient!yp;B)V")
	static void method15764(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, local12, (byte) 53);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, local12, (byte) 27);
		Class703.aClass80_Sub37_49.aClass165_Sub10_1.method16022((byte) 58);
		Class703.aClass80_Sub37_49.aClass165_Sub10_2.method16022((byte) 31);
		Class643.method33027(429902465);
		Class719.method37291(521833830);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!wz", name = "<init>", descriptor = "()V")
	Class163() {
	}

	@OriginalMember(owner = "client!wz", name = "t", descriptor = "(I)Z")
	public final boolean method15748(@OriginalArg(0) int arg0) {
		return (this.anInt2081 * -682140789 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "l", descriptor = "()Z")
	public final boolean method15749() {
		return (this.anInt2081 * -682140789 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "(I)Z")
	public final boolean method15750(@OriginalArg(0) int arg0) {
		return (this.anInt2081 * -682140789 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "u", descriptor = "(I)Z")
	public final boolean method15751(@OriginalArg(0) int arg0) {
		return (this.anInt2081 * -682140789 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "f", descriptor = "(B)Z")
	public final boolean method15752(@OriginalArg(0) byte arg0) {
		return (this.anInt2081 * -682140789 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "()Z")
	public final boolean method15753() {
		return (this.anInt2081 * -682140789 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "i", descriptor = "()Z")
	public final boolean method15754() {
		return (this.anInt2081 * -682140789 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "a", descriptor = "()Z")
	public final boolean method15755() {
		return (this.anInt2081 * -682140789 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "o", descriptor = "()Z")
	public final boolean method15756() {
		return (this.anInt2081 * -682140789 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "j", descriptor = "()Z")
	public final boolean method15757() {
		return (this.anInt2081 * -682140789 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "()Z")
	public final boolean method15758() {
		return (this.anInt2081 * -682140789 & 0x4) != 0;
	}
}
