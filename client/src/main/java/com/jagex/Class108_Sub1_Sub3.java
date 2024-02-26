package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apy")
public final class Class108_Sub1_Sub3 extends Class108_Sub1 {

	@OriginalMember(owner = "client!apy", name = "u", descriptor = "Lclient!bg;")
	Class183 aClass183_1;

	@OriginalMember(owner = "client!apy", name = "e", descriptor = "Lclient!bs;")
	Class194 aClass194_1;

	@OriginalMember(owner = "client!apy", name = "l", descriptor = "I")
	int anInt2611 = 0;

	@OriginalMember(owner = "client!apy", name = "g", descriptor = "I")
	int anInt2612 = 0;

	@OriginalMember(owner = "client!apy", name = "f", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_12;

	@OriginalMember(owner = "client!apy", name = "aj", descriptor = "(II[I[I[F[FIIIIII)V")
	static void method18542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg6 + arg7 * arg0;
		@Pc(11) int local11 = arg8 + arg1 * arg9;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(24) int local24;
		@Pc(31) int local31;
		if (arg2 == null) {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = arg10 + local5;
				while (local5 < local31) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = local5 + arg10;
				while (local5 < local31) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local24 = 0; local24 < arg11; local24++) {
				local31 = arg10 + local5;
				while (local5 < local31) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!apy", name = "<init>", descriptor = "(Lclient!aff;)V")
	Class108_Sub1_Sub3(@OriginalArg(0) Class102_Sub2 arg0) {
		this.aClass102_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!apy", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt2611 * 1554217243;
	}

	@OriginalMember(owner = "client!apy", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt2612 * -1253255717;
	}

	@OriginalMember(owner = "client!apy", name = "r", descriptor = "(ILclient!do;)V")
	@Override
	public void method23903(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass194_1 != null && local8 != null && (this.aClass194_1.anInt3348 * -699331075 != local8.anInt3324 * -1842770921 || this.aClass194_1.anInt3347 * -1414140539 != local8.anInt3323 * 85599795)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2611 = local8.anInt3324 * -1516665675;
			this.anInt2612 = local8.anInt3323 * -1363977079;
		} else if (this.aClass194_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(2118638343) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "w", descriptor = "(Lclient!de;)V")
	@Override
	public void method23905(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Class194 local2 = (Class194) arg0;
		if (this.aClass183_1 != null && local2 != null && (this.aClass183_1.anInt3324 * -1842770921 != local2.anInt3348 * -699331075 || this.aClass183_1.anInt3323 * 85599795 != local2.anInt3347 * -1414140539)) {
			throw new RuntimeException();
		}
		this.aClass194_1 = local2;
		if (local2 != null) {
			this.anInt2611 = local2.anInt3348 * 1219649223;
			this.anInt2612 = local2.anInt3347 * -810903521;
		} else if (this.aClass183_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(1540653626) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		this.aClass102_Sub2_12.method5113(this.anInt2611 * 1554217243, this.anInt2612 * -1253255717, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray293, this.aClass194_1 == null ? null : this.aClass194_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "q", descriptor = "()Z")
	@Override
	public boolean method23897() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
	}

	@OriginalMember(owner = "client!apy", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt2611 * 1554217243;
	}

	@OriginalMember(owner = "client!apy", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt2611 * 1554217243;
	}

	@OriginalMember(owner = "client!apy", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt2611 * 1554217243;
	}

	@OriginalMember(owner = "client!apy", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt2612 * -1253255717;
	}

	@OriginalMember(owner = "client!apy", name = "z", descriptor = "(ILclient!do;)V")
	@Override
	public void method23900(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass194_1 != null && local8 != null && (this.aClass194_1.anInt3348 * -699331075 != local8.anInt3324 * -1842770921 || this.aClass194_1.anInt3347 * -1414140539 != local8.anInt3323 * 85599795)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2611 = local8.anInt3324 * -1516665675;
			this.anInt2612 = local8.anInt3323 * -1363977079;
		} else if (this.aClass194_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(1801204206) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "d", descriptor = "(ILclient!do;)V")
	@Override
	public void method23899(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(8) Class183 local8 = (Class183) arg1;
		if (this.aClass194_1 != null && local8 != null && (this.aClass194_1.anInt3348 * -699331075 != local8.anInt3324 * -1842770921 || this.aClass194_1.anInt3347 * -1414140539 != local8.anInt3323 * 85599795)) {
			throw new RuntimeException();
		}
		this.aClass183_1 = local8;
		if (local8 != null) {
			this.anInt2611 = local8.anInt3324 * -1516665675;
			this.anInt2612 = local8.anInt3323 * -1363977079;
		} else if (this.aClass194_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(2123735696) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "v", descriptor = "(Lclient!de;)V")
	@Override
	public void method23902(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Class194 local2 = (Class194) arg0;
		if (this.aClass183_1 != null && local2 != null && (this.aClass183_1.anInt3324 * -1842770921 != local2.anInt3348 * -699331075 || this.aClass183_1.anInt3323 * 85599795 != local2.anInt3347 * -1414140539)) {
			throw new RuntimeException();
		}
		this.aClass194_1 = local2;
		if (local2 != null) {
			this.anInt2611 = local2.anInt3348 * 1219649223;
			this.anInt2612 = local2.anInt3347 * -810903521;
		} else if (this.aClass183_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(1407747990) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "ay", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray293;
			local3 = this.aClass102_Sub2_12.anIntArray50;
		}
		if (arg7 && this.aClass194_1 != null) {
			local5 = this.aClass194_1.aFloatArray91;
			local7 = this.aClass102_Sub2_12.aFloatArray12;
		}
		Class283.method26880(this.anInt2611 * 1554217243, this.aClass102_Sub2_12.anInt638 * 513500097, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -1314260993);
	}

	@OriginalMember(owner = "client!apy", name = "n", descriptor = "()Z")
	@Override
	public boolean method23908() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "c", descriptor = "()Z")
	@Override
	public boolean method23906() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "ax", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray293;
			local3 = this.aClass102_Sub2_12.anIntArray50;
		}
		if (arg7 && this.aClass194_1 != null) {
			local5 = this.aClass194_1.aFloatArray91;
			local7 = this.aClass102_Sub2_12.aFloatArray12;
		}
		Class283.method26880(this.anInt2611 * 1554217243, this.aClass102_Sub2_12.anInt638 * 513500097, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -460374436);
	}

	@OriginalMember(owner = "client!apy", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		this.aClass102_Sub2_12.method5113(this.anInt2611 * 1554217243, this.anInt2612 * -1253255717, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray293, this.aClass194_1 == null ? null : this.aClass194_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		this.aClass102_Sub2_12.method5113(this.anInt2611 * 1554217243, this.anInt2612 * -1253255717, this.aClass183_1 == null ? null : this.aClass183_1.anIntArray293, this.aClass194_1 == null ? null : this.aClass194_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "b", descriptor = "()Z")
	@Override
	public boolean method23896() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "y", descriptor = "()Z")
	@Override
	public boolean method23895() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "h", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray293;
			local3 = this.aClass102_Sub2_12.anIntArray50;
		}
		if (arg7 && this.aClass194_1 != null) {
			local5 = this.aClass194_1.aFloatArray91;
			local7 = this.aClass102_Sub2_12.aFloatArray12;
		}
		Class283.method26880(this.anInt2611 * 1554217243, this.aClass102_Sub2_12.anInt638 * 513500097, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -1155210221);
	}

	@OriginalMember(owner = "client!apy", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		return true;
	}

	@OriginalMember(owner = "client!apy", name = "ai", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray293;
			local3 = this.aClass102_Sub2_12.anIntArray50;
		}
		if (arg7 && this.aClass194_1 != null) {
			local5 = this.aClass194_1.aFloatArray91;
			local7 = this.aClass102_Sub2_12.aFloatArray12;
		}
		Class283.method26880(this.anInt2611 * 1554217243, this.aClass102_Sub2_12.anInt638 * 513500097, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -3320296);
	}

	@OriginalMember(owner = "client!apy", name = "aq", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass183_1 != null) {
			local1 = this.aClass183_1.anIntArray293;
			local3 = this.aClass102_Sub2_12.anIntArray50;
		}
		if (arg7 && this.aClass194_1 != null) {
			local5 = this.aClass194_1.aFloatArray91;
			local7 = this.aClass102_Sub2_12.aFloatArray12;
		}
		Class283.method26880(this.anInt2611 * 1554217243, this.aClass102_Sub2_12.anInt638 * 513500097, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3, -1577801519);
	}

	@OriginalMember(owner = "client!apy", name = "p", descriptor = "(Lclient!de;)V")
	@Override
	public void method23901(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Class194 local2 = (Class194) arg0;
		if (this.aClass183_1 != null && local2 != null && (this.aClass183_1.anInt3324 * -1842770921 != local2.anInt3348 * -699331075 || this.aClass183_1.anInt3323 * 85599795 != local2.anInt3347 * -1414140539)) {
			throw new RuntimeException();
		}
		this.aClass194_1 = local2;
		if (local2 != null) {
			this.anInt2611 = local2.anInt3348 * 1219649223;
			this.anInt2612 = local2.anInt3347 * -810903521;
		} else if (this.aClass183_1 == null) {
			this.anInt2611 = 0;
			this.anInt2612 = 0;
		}
		if (this.aClass102_Sub2_12.method20677(1069478996) == this) {
			this.method24039();
		}
	}

	@OriginalMember(owner = "client!apy", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
	}
}
