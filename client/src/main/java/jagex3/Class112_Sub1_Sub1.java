package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apn")
public final class Class112_Sub1_Sub1 extends Class112_Sub1 {

	@OriginalMember(owner = "client!apn", name = "o", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_4;

	@OriginalMember(owner = "client!apn", name = "k", descriptor = "Lclient!bf;")
	Class183 aClass183_1;

	@OriginalMember(owner = "client!apn", name = "m", descriptor = "Lclient!bc;")
	Class180 aClass180_1;

	@OriginalMember(owner = "client!apn", name = "f", descriptor = "I")
	int anInt2494 = 0;

	@OriginalMember(owner = "client!apn", name = "w", descriptor = "I")
	int anInt2493 = 0;

	@OriginalMember(owner = "client!apn", name = "n", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_10;

	@OriginalMember(owner = "client!apn", name = "ai", descriptor = "(II[I[I[F[FIIIIII)V")
	static void method17888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg7 * arg0 + arg6;
		@Pc(11) int local11 = arg8 + arg9 * arg1;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!apn", name = "aw", descriptor = "(II[I[I[F[FIIIIII)V")
	static void method17889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg7 * arg0 + arg6;
		@Pc(11) int local11 = arg8 + arg9 * arg1;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!apn", name = "gk", descriptor = "(Lclient!yf;I)V")
	static void method17890(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1361875209);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class30.method626(local16, local22, arg0, 302106858);
	}

	@OriginalMember(owner = "client!apn", name = "<init>", descriptor = "(Lclient!afg;)V")
	Class112_Sub1_Sub1(@OriginalArg(0) Class104_Sub3 arg0) {
		this.aClass104_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!apn", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray292;
			local3 = this.aClass104_Sub3_10.anIntArray46;
		}
		if (arg7 && this.aClass180_1 != null) {
			local5 = this.aClass180_1.aFloatArray91;
			local7 = this.aClass104_Sub3_10.aFloatArray20;
		}
		Class446.method29079(this.anInt2494 * 335394069, this.aClass104_Sub3_10.anInt719 * 1808307287, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -668959189);
	}

	@OriginalMember(owner = "client!apn", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
	}

	@OriginalMember(owner = "client!apn", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt2493 * -1175437387;
	}

	@OriginalMember(owner = "client!apn", name = "b", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23446(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass180_1 != null && local8 != null && (this.aClass180_1.anInt3313 * -1487890669 != local8.anInt3332 * -774739475 || this.aClass180_1.anInt3314 * 139010301 != local8.anInt3331 * -534357729)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2494 = local8.anInt3332 * -726448263;
			this.anInt2493 = local8.anInt3331 * -226790909;
		} else if (this.aClass180_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -29) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
	}

	@OriginalMember(owner = "client!apn", name = "h", descriptor = "()Z")
	@Override
	public boolean method23453() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		this.aClass104_Sub3_10.method5704(this.anInt2494 * 335394069, this.anInt2493 * -1175437387, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray292, this.aClass180_1 == null ? null : this.aClass180_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "x", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23448(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Class180 local2 = (Class180) arg0;
		if (this.aClass183_1 != null && local2 != null && (this.aClass183_1.anInt3332 * -774739475 != local2.anInt3313 * -1487890669 || this.aClass183_1.anInt3331 * -534357729 != local2.anInt3314 * 139010301)) {
			throw new RuntimeException();
		}
		this.aClass180_1 = local2;
		if (local2 != null) {
			this.anInt2494 = local2.anInt3313 * -2053769849;
			this.anInt2493 = local2.anInt3314 * -542811863;
		} else if (this.aClass183_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -86) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "i", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23450(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass180_1 != null && local8 != null && (this.aClass180_1.anInt3313 * -1487890669 != local8.anInt3332 * -774739475 || this.aClass180_1.anInt3314 * 139010301 != local8.anInt3331 * -534357729)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2494 = local8.anInt3332 * -726448263;
			this.anInt2493 = local8.anInt3331 * -226790909;
		} else if (this.aClass180_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -23) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt2493 * -1175437387;
	}

	@OriginalMember(owner = "client!apn", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt2493 * -1175437387;
	}

	@OriginalMember(owner = "client!apn", name = "g", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23444(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass180_1 != null && local8 != null && (this.aClass180_1.anInt3313 * -1487890669 != local8.anInt3332 * -774739475 || this.aClass180_1.anInt3314 * 139010301 != local8.anInt3331 * -534357729)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2494 = local8.anInt3332 * -726448263;
			this.anInt2493 = local8.anInt3331 * -226790909;
		} else if (this.aClass180_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -110) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "t", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23451(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Class180 local2 = (Class180) arg0;
		if (this.aClass183_1 != null && local2 != null && (this.aClass183_1.anInt3332 * -774739475 != local2.anInt3313 * -1487890669 || this.aClass183_1.anInt3331 * -534357729 != local2.anInt3314 * 139010301)) {
			throw new RuntimeException();
		}
		this.aClass180_1 = local2;
		if (local2 != null) {
			this.anInt2494 = local2.anInt3313 * -2053769849;
			this.anInt2493 = local2.anInt3314 * -542811863;
		} else if (this.aClass183_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -27) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "j", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23449(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass180_1 != null && local8 != null && (this.aClass180_1.anInt3313 * -1487890669 != local8.anInt3332 * -774739475 || this.aClass180_1.anInt3314 * 139010301 != local8.anInt3331 * -534357729)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2494 = local8.anInt3332 * -726448263;
			this.anInt2493 = local8.anInt3331 * -226790909;
		} else if (this.aClass180_1 == null) {
			this.anInt2494 = 0;
			this.anInt2493 = 0;
		}
		if (this.aClass104_Sub3_10.method20446((byte) -38) == this) {
			this.method23751();
		}
	}

	@OriginalMember(owner = "client!apn", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		this.aClass104_Sub3_10.method5704(this.anInt2494 * 335394069, this.anInt2493 * -1175437387, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray292, this.aClass180_1 == null ? null : this.aClass180_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		this.aClass104_Sub3_10.method5704(this.anInt2494 * 335394069, this.anInt2493 * -1175437387, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray292, this.aClass180_1 == null ? null : this.aClass180_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "ag", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray292;
			local3 = this.aClass104_Sub3_10.anIntArray46;
		}
		if (arg7 && this.aClass180_1 != null) {
			local5 = this.aClass180_1.aFloatArray91;
			local7 = this.aClass104_Sub3_10.aFloatArray20;
		}
		Class446.method29079(this.anInt2494 * 335394069, this.aClass104_Sub3_10.anInt719 * 1808307287, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -2084436487);
	}

	@OriginalMember(owner = "client!apn", name = "ae", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray292;
			local3 = this.aClass104_Sub3_10.anIntArray46;
		}
		if (arg7 && this.aClass180_1 != null) {
			local5 = this.aClass180_1.aFloatArray91;
			local7 = this.aClass104_Sub3_10.aFloatArray20;
		}
		Class446.method29079(this.anInt2494 * 335394069, this.aClass104_Sub3_10.anInt719 * 1808307287, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, 245127258);
	}

	@OriginalMember(owner = "client!apn", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt2494 * 335394069;
	}

	@OriginalMember(owner = "client!apn", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
	}

	@OriginalMember(owner = "client!apn", name = "ah", descriptor = "()Z")
	@Override
	public boolean method23454() {
		return true;
	}

	@OriginalMember(owner = "client!apn", name = "al", descriptor = "()Z")
	@Override
	public boolean method23455() {
		return true;
	}
}
