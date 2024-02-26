package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class350 {

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "J")
	public long aLong370;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "[I")
	int[] anIntArray422;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "[F")
	float[] aFloatArray105;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "[[I")
	int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(B)V")
	public static void method28007(@OriginalArg(0) byte arg0) {
		if (Class659.aClass138_6 != null) {
			Class659.aClass138_6.method11528(-1617569574);
			Class659.aClass138_6 = null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "aa", descriptor = "(Lclient!yp;ZZB)V")
	static void method28008(@OriginalArg(0) Class690 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(7) int local7 = arg0.anIntArray526[arg0.anInt5780 * -1336568839];
		@Pc(20) int local20 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local20 < 0 || local20 >= arg0.anIntArray528[local7]) {
			throw new RuntimeException();
		} else if (!arg1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.anIntArrayArray67[local7][local20];
		} else if (arg2) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.anIntArrayArray67[local7][local20];
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local20;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local20;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.anIntArrayArray67[local7][local20];
		}
	}

	@OriginalMember(owner = "client!iv", name = "hr", descriptor = "(Lclient!yp;I)V")
	static void method28009(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2012173286);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, false, 1, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!iv", name = "ks", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method28010(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aString185 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
	}

	@OriginalMember(owner = "client!iv", name = "acp", descriptor = "(Lclient!yp;B)V")
	static void method28011(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.aClass378_3.aStringArray29[local12];
	}

	@OriginalMember(owner = "client!iv", name = "mv", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method28012(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1738908892) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray17 = Class431.method29089(local13, arg2, 1562685262);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "(Ljava/lang/String;S)I")
	public static int method28013(@OriginalArg(0) String arg0, @OriginalArg(1) short arg1) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!iv", name = "ax", descriptor = "(Lclient!di;I)V")
	static void method28014(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aBoolean955) {
			Class376.method28459(arg0, -751476541);
		} else {
			Class171.method23507(arg0, (short) -29499);
		}
	}

	@OriginalMember(owner = "client!iv", name = "adu", descriptor = "(Lclient!yp;B)V")
	static void method28015(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class477.aClass80_Sub32_3 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
			arg0.aClass80_Sub32_4 = Class477.aClass80_Sub32_3;
		}
	}

	@OriginalMember(owner = "client!iv", name = "awm", descriptor = "(Lclient!yp;B)V")
	static void method28016(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class163_Sub1 local16 = Class80_Sub28_Sub2.method21750(local12, 2112612189);
		if (local16 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt2081 * -682140789;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.aString63;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.method15766(970275788);
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.method15767((byte) -46);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt2083 * -263101925;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt2087 * 1438063139;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.aString61;
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ie;Z)V")
	public Class350(@OriginalArg(0) Class335 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.anIntArray422 = new int[arg0.anIntArray412.length];
			this.aFloatArray105 = new float[arg0.anIntArray412.length];
			this.anIntArrayArray53 = new int[arg0.anIntArray412.length][3];
			this.anIntArrayArray54 = new int[arg0.anIntArray412.length][3];
			System.arraycopy(arg0.anIntArray412, 0, this.anIntArray422, 0, this.anIntArray422.length);
		} else {
			this.anIntArray422 = new int[arg0.anIntArray413.length];
			this.aFloatArray105 = new float[arg0.anIntArray413.length];
			this.anIntArrayArray53 = new int[arg0.anIntArray413.length][3];
			this.anIntArrayArray54 = new int[arg0.anIntArray413.length][3];
			System.arraycopy(arg0.anIntArray413, 0, this.anIntArray422, 0, this.anIntArray422.length);
		}
		if (arg0.aShortArray115 != null) {
			this.aShortArray119 = new short[arg0.aShortArray115.length];
			System.arraycopy(arg0.aShortArray115, 0, this.aShortArray119, 0, this.aShortArray119.length);
		}
		if (arg0.aShortArray117 != null) {
			this.aShortArray120 = new short[arg0.aShortArray117.length];
			System.arraycopy(arg0.aShortArray117, 0, this.aShortArray120, 0, this.aShortArray120.length);
		}
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(J[I[F[[I[[I[S[S)V")
	public Class350(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) short[] arg6) {
		this.aLong370 = arg0 * 1429031336920090503L;
		this.anIntArray422 = arg1;
		this.aFloatArray105 = arg2;
		this.anIntArrayArray53 = arg3;
		this.anIntArrayArray54 = arg4;
		this.aShortArray119 = arg5;
		this.aShortArray120 = arg6;
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(III)V")
	public void method28002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method28004(arg0, (byte) 47);
		this.anIntArray422[arg0] = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "(IIFIIIIIII)V")
	public void method28003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method28004(arg0, (byte) 106);
		this.anIntArray422[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray53[arg0][0] = arg3;
		this.anIntArrayArray53[arg0][1] = arg4;
		this.anIntArrayArray53[arg0][2] = arg5;
		this.anIntArrayArray54[arg0][0] = arg6;
		this.anIntArrayArray54[arg0][1] = arg7;
		this.anIntArrayArray54[arg0][2] = arg8;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(IB)V")
	void method28004(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < this.anIntArray422.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray422, 0, local9, 0, this.anIntArray422.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray422.length; local46++) {
			System.arraycopy(this.anIntArrayArray53[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray54[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray422.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray422 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray53 = local20;
		this.anIntArrayArray54 = local26;
	}

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "(IIFIIIIII)V")
	public void method28005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method28004(arg0, (byte) 15);
		this.anIntArray422[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray53[arg0][0] = arg3;
		this.anIntArrayArray53[arg0][1] = arg4;
		this.anIntArrayArray53[arg0][2] = arg5;
		this.anIntArrayArray54[arg0][0] = arg6;
		this.anIntArrayArray54[arg0][1] = arg7;
		this.anIntArrayArray54[arg0][2] = arg8;
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(IIFIIIIII)V")
	public void method28006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method28004(arg0, (byte) 56);
		this.anIntArray422[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray53[arg0][0] = arg3;
		this.anIntArrayArray53[arg0][1] = arg4;
		this.anIntArrayArray53[arg0][2] = arg5;
		this.anIntArrayArray54[arg0][0] = arg6;
		this.anIntArrayArray54[arg0][1] = arg7;
		this.anIntArrayArray54[arg0][2] = arg8;
	}
}
