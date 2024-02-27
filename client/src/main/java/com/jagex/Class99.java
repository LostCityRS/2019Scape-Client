package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public abstract class Class99 {

	@OriginalMember(owner = "client!cb", name = "oj", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public final int anInt414;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public final int anInt413;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public final int anInt412;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public final int anInt415;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cb", name = "atr", descriptor = "(Lclient!yf;I)V")
	static void method2515(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15414(-790628695) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III[[I)V")
	Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt414 = arg0 * -1288837341;
		this.anInt413 = arg1 * -2132457189;
		@Pc(13) int local13 = 0;
		while (arg2 > 1) {
			local13++;
			arg2 >>= 0x1;
		}
		this.anInt412 = (0x1 << local13) * -45500389;
		this.anInt415 = local13 * 1556937903;
		this.anIntArrayArray7 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(III)V")
	public abstract void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(IILclient!ara;)Lclient!ara;")
	public abstract Class93_Sub1_Sub4 method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2);

	@OriginalMember(owner = "client!cb", name = "ah", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "aw", descriptor = "(Lclient!ara;IIIIZ)Z")
	public abstract boolean method2477(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(III)I")
	public final int method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt414 * -1667858293 - 1 || local13 > this.anInt413 * -143202029 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(53) int local53 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(83) int local83 = (this.anInt412 * -1678286317 - local44) * this.anIntArrayArray7[local6][local13] + local44 * this.anIntArrayArray7[local6 + 1][local13] >> this.anInt415 * -373302705;
		@Pc(117) int local117 = local44 * this.anIntArrayArray7[local6 + 1][local13 + 1] + (this.anInt412 * -1678286317 - local44) * this.anIntArrayArray7[local6][local13 + 1] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local53) * local83 + local53 * local117 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "(III)I")
	public final int method2481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		@Pc(24) int local24 = Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt413 * -143202029 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt414 * -1667858293 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt413 * -143202029 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(75) int local75 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(103) int local103 = local66 * this.anIntArrayArray7[local46][local35] + this.anIntArrayArray7[local24][local35] * (this.anInt412 * -1678286317 - local66) >> this.anInt415 * -373302705;
		@Pc(131) int local131 = local66 * this.anIntArrayArray7[local46][local57] + (this.anInt412 * -1678286317 - local66) * this.anIntArrayArray7[local24][local57] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local75) * local103 + local131 * local75 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "(III)I")
	public final int method2482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "(III)I")
	public final int method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anIntArrayArray7[Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, arg0))][Math.min(this.anInt413 * -143202029 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(IILclient!ara;)Lclient!ara;")
	public abstract Class93_Sub1_Sub4 method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2);

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Lclient!ara;IIIIZ)V")
	public abstract void method2485(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "(III)V")
	public abstract void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "ag", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "(Lclient!ara;IIIIZ)Z")
	public abstract boolean method2488(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "ae", descriptor = "(Lclient!akf;[I)V")
	public abstract void method2489(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "ac", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "ad", descriptor = "(II)I")
	public final int method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt414 * -1667858293 - 1 || local13 > this.anInt413 * -143202029 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(53) int local53 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(83) int local83 = (this.anInt412 * -1678286317 - local44) * this.anIntArrayArray7[local6][local13] + local44 * this.anIntArrayArray7[local6 + 1][local13] >> this.anInt415 * -373302705;
		@Pc(117) int local117 = local44 * this.anIntArrayArray7[local6 + 1][local13 + 1] + (this.anInt412 * -1678286317 - local44) * this.anIntArrayArray7[local6][local13 + 1] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local53) * local83 + local53 * local117 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "()V")
	public abstract void method2492();

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	public abstract void method2493();

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(III[[ZZI)V")
	public abstract void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "(Lclient!ara;IIIIZ)V")
	public abstract void method2496(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(IILclient!ara;)Lclient!ara;")
	public abstract Class93_Sub1_Sub4 method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2);

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(Lclient!ara;IIIIZ)V")
	public abstract void method2498(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "au", descriptor = "(II)I")
	public final int method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		@Pc(24) int local24 = Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt413 * -143202029 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt414 * -1667858293 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt413 * -143202029 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(75) int local75 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(103) int local103 = local66 * this.anIntArrayArray7[local46][local35] + this.anIntArrayArray7[local24][local35] * (this.anInt412 * -1678286317 - local66) >> this.anInt415 * -373302705;
		@Pc(131) int local131 = local66 * this.anIntArrayArray7[local46][local57] + (this.anInt412 * -1678286317 - local66) * this.anIntArrayArray7[local24][local57] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local75) * local103 + local131 * local75 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(Lclient!ara;IIIIZ)V")
	public abstract void method2500(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(III[[ZZI)V")
	public abstract void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "(Lclient!akf;[I)V")
	public abstract void method2502(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cb", name = "al", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cb", name = "ai", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "(III)V")
	public abstract void method2505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "as", descriptor = "(Lclient!ara;IIIIZ)Z")
	public abstract boolean method2506(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "at", descriptor = "(Lclient!ara;IIIIZ)V")
	public abstract void method2507(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "()V")
	public abstract void method2508();

	@OriginalMember(owner = "client!cb", name = "am", descriptor = "(II)I")
	public final int method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		@Pc(24) int local24 = Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt413 * -143202029 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt414 * -1667858293 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt413 * -143202029 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(75) int local75 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(103) int local103 = local66 * this.anIntArrayArray7[local46][local35] + this.anIntArrayArray7[local24][local35] * (this.anInt412 * -1678286317 - local66) >> this.anInt415 * -373302705;
		@Pc(131) int local131 = local66 * this.anIntArrayArray7[local46][local57] + (this.anInt412 * -1678286317 - local66) * this.anIntArrayArray7[local24][local57] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local75) * local103 + local131 * local75 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	public abstract void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cb", name = "ar", descriptor = "(II)I")
	public final int method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		@Pc(24) int local24 = Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt413 * -143202029 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt414 * -1667858293 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt413 * -143202029 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(75) int local75 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(103) int local103 = local66 * this.anIntArrayArray7[local46][local35] + this.anIntArrayArray7[local24][local35] * (this.anInt412 * -1678286317 - local66) >> this.anInt415 * -373302705;
		@Pc(131) int local131 = local66 * this.anIntArrayArray7[local46][local57] + (this.anInt412 * -1678286317 - local66) * this.anIntArrayArray7[local24][local57] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local75) * local103 + local131 * local75 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "ap", descriptor = "(II)I")
	public final int method2512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt415 * -373302705;
		@Pc(13) int local13 = arg1 >> this.anInt415 * -373302705;
		@Pc(24) int local24 = Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt413 * -143202029 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt414 * -1667858293 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt413 * -143202029 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt412 * -1678286317 - 1;
		@Pc(75) int local75 = arg1 & this.anInt412 * -1678286317 - 1;
		@Pc(103) int local103 = local66 * this.anIntArrayArray7[local46][local35] + this.anIntArrayArray7[local24][local35] * (this.anInt412 * -1678286317 - local66) >> this.anInt415 * -373302705;
		@Pc(131) int local131 = local66 * this.anIntArrayArray7[local46][local57] + (this.anInt412 * -1678286317 - local66) * this.anIntArrayArray7[local24][local57] >> this.anInt415 * -373302705;
		return (this.anInt412 * -1678286317 - local75) * local103 + local131 * local75 >> this.anInt415 * -373302705;
	}

	@OriginalMember(owner = "client!cb", name = "aq", descriptor = "(II)I")
	public final int method2513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, arg0))][Math.min(this.anInt413 * -143202029 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cb", name = "ax", descriptor = "(II)I")
	public final int method2514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt414 * -1667858293 - 1, Math.max(0, arg0))][Math.min(this.anInt413 * -143202029 - 1, Math.max(0, arg1))];
	}
}
