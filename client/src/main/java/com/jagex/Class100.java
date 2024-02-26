package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public abstract class Class100 {

	@OriginalMember(owner = "client!cb", name = "au", descriptor = "I")
	public static int anInt449;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	public final int anInt448;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public final int anInt446;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public final int anInt447;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public final int anInt445;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(I)V")
	static void method2954(@OriginalArg(0) int arg0) {
		Class622.aBoolean934 = false;
		Class503.anIntArray465 = null;
		Class347.anIntArray420 = null;
		Class622.aLinkedList7.clear();
		Class622.aLinkedList6.clear();
		Class279.aClass102_9.method20683();
	}

	@OriginalMember(owner = "client!cb", name = "ayy", descriptor = "(Lclient!yp;I)V")
	static void method2955(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub38_1.method16744(-1544125334);
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(III)V")
	static void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class630.anInt5549 * -310628999 == 1) {
			Class103_Sub11.method7907(Class130_Sub1.aClass80_Sub1_Sub11_2, arg0, arg1, false, -1294363341);
		} else if (Class630.anInt5549 * -310628999 == 2) {
			Class291.method26940(arg0, arg1, -1935447220);
		}
		Class630.anInt5549 = 0;
		Class130_Sub1.aClass80_Sub1_Sub11_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III[[I)V")
	Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt448 = arg0 * 684890117;
		this.anInt446 = arg1 * 1407195987;
		@Pc(13) int local13 = 0;
		while (arg2 > 1) {
			local13++;
			arg2 >>= 0x1;
		}
		this.anInt447 = (0x1 << local13) * -1308572513;
		this.anInt445 = local13 * 2037235291;
		this.anIntArrayArray7 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "av", descriptor = "(II)I")
	public final int method2908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!cb", name = "ao", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2909(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "(III[[ZZI)V")
	public abstract void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "()V")
	public abstract void method2912();

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(III[[ZZI)V")
	public abstract void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(IIB)I")
	public final int method2915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(6) int local6 = arg0 >> this.anInt445 * -615169581;
		@Pc(13) int local13 = arg1 >> this.anInt445 * -615169581;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt448 * -1548585779 - 1 || local13 > this.anInt446 * -1356799781 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt447 * -1174710433 - 1;
		@Pc(53) int local53 = arg1 & this.anInt447 * -1174710433 - 1;
		@Pc(83) int local83 = (this.anInt447 * -1174710433 - local44) * this.anIntArrayArray7[local6][local13] + this.anIntArrayArray7[local6 + 1][local13] * local44 >> this.anInt445 * -615169581;
		@Pc(117) int local117 = (this.anInt447 * -1174710433 - local44) * this.anIntArrayArray7[local6][local13 + 1] + this.anIntArrayArray7[local6 + 1][local13 + 1] * local44 >> this.anInt445 * -615169581;
		return (this.anInt447 * -1174710433 - local53) * local83 + local53 * local117 >> this.anInt445 * -615169581;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(III[[ZZI)V")
	public abstract void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "(III)I")
	public final int method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(IIB)I")
	public final int method2918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.anIntArrayArray7[Math.min(this.anInt448 * -1548585779 - 1, Math.max(0, arg0))][Math.min(this.anInt446 * -1356799781 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(III)V")
	public abstract void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2920(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2921(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "(Lclient!arx;IIIIZ)Z")
	public abstract boolean method2922(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "(Lclient!akb;[I)V")
	public abstract void method2923(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "(III)V")
	public abstract void method2924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class229 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "af", descriptor = "(Lclient!arx;IIIIZ)Z")
	public abstract boolean method2929(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "()V")
	public abstract void method2930();

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(III[[ZZI)V")
	public abstract void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "ax", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "ag", descriptor = "(Lclient!akb;[I)V")
	public abstract void method2933(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "aq", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2935(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "ay", descriptor = "(IILclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2);

	@OriginalMember(owner = "client!cb", name = "ai", descriptor = "(IILclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2);

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dp;Z)V")
	public abstract void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class229 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cb", name = "ac", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2939(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "ak", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2940(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(III)V")
	public abstract void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "al", descriptor = "(Lclient!akb;[I)V")
	public abstract void method2942(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "(Lclient!akb;[I)V")
	public abstract void method2943(@OriginalArg(0) Class80_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "aj", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2944(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "ah", descriptor = "(Lclient!arx;IIIIZ)Z")
	public abstract boolean method2945(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!arx;)Lclient!arx;")
	public abstract Class80_Sub1_Sub10 method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1_Sub10 arg2);

	@OriginalMember(owner = "client!cb", name = "am", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2947(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "at", descriptor = "(Lclient!arx;IIIIZ)V")
	public abstract void method2948(@OriginalArg(0) Class80_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "ad", descriptor = "(II)I")
	public final int method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt445 * -615169581;
		@Pc(13) int local13 = arg1 >> this.anInt445 * -615169581;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt448 * -1548585779 - 1 || local13 > this.anInt446 * -1356799781 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt447 * -1174710433 - 1;
		@Pc(53) int local53 = arg1 & this.anInt447 * -1174710433 - 1;
		@Pc(83) int local83 = (this.anInt447 * -1174710433 - local44) * this.anIntArrayArray7[local6][local13] + this.anIntArrayArray7[local6 + 1][local13] * local44 >> this.anInt445 * -615169581;
		@Pc(117) int local117 = (this.anInt447 * -1174710433 - local44) * this.anIntArrayArray7[local6][local13 + 1] + this.anIntArrayArray7[local6 + 1][local13 + 1] * local44 >> this.anInt445 * -615169581;
		return (this.anInt447 * -1174710433 - local53) * local83 + local53 * local117 >> this.anInt445 * -615169581;
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(III)I")
	public final int method2950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 >> this.anInt445 * -615169581;
		@Pc(13) int local13 = arg1 >> this.anInt445 * -615169581;
		@Pc(24) int local24 = Math.min(this.anInt448 * -1548585779 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt446 * -1356799781 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt448 * -1548585779 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt446 * -1356799781 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt447 * -1174710433 - 1;
		@Pc(75) int local75 = arg1 & this.anInt447 * -1174710433 - 1;
		@Pc(103) int local103 = this.anIntArrayArray7[local46][local35] * local66 + this.anIntArrayArray7[local24][local35] * (this.anInt447 * -1174710433 - local66) >> this.anInt445 * -615169581;
		@Pc(131) int local131 = this.anIntArrayArray7[local24][local57] * (this.anInt447 * -1174710433 - local66) + local66 * this.anIntArrayArray7[local46][local57] >> this.anInt445 * -615169581;
		return local75 * local131 + (this.anInt447 * -1174710433 - local75) * local103 >> this.anInt445 * -615169581;
	}

	@OriginalMember(owner = "client!cb", name = "an", descriptor = "(II)I")
	public final int method2951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!cb", name = "aa", descriptor = "(II)I")
	public final int method2952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt448 * -1548585779 - 1, Math.max(0, arg0))][Math.min(this.anInt446 * -1356799781 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cb", name = "ae", descriptor = "(II)I")
	public final int method2953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt448 * -1548585779 - 1, Math.max(0, arg0))][Math.min(this.anInt446 * -1356799781 - 1, Math.max(0, arg1))];
	}
}
