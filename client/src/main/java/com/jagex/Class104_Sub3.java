package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afj")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!afj", name = "w", descriptor = "Lclient!aff;")
	Class102_Sub2 aClass102_Sub2_5;

	@OriginalMember(owner = "client!afj", name = "r", descriptor = "[Lclient!cm;")
	Class99[] aClass99Array1;

	@OriginalMember(owner = "client!afj", name = "q", descriptor = "[Lclient!cm;")
	Class99[] aClass99Array2;

	@OriginalMember(owner = "client!afj", name = "o", descriptor = "(IZIZI)V")
	public static void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		Class679.method33624(0, Class47.aClass163_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, (byte) -118);
		Class47.anInt181 = 0;
		Class47.aClass692_1 = null;
	}

	@OriginalMember(owner = "client!afj", name = "<init>", descriptor = "(Lclient!aff;Lclient!aan;Lclient!afq;)V")
	Class104_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass102_Sub2_5 = arg0;
		this.aClass102_Sub2_5 = arg0;
		@Pc(13) int[] local13 = arg2.method7117(false);
		@Pc(18) int[] local18 = (int[]) local13.clone();
		@Pc(20) int local20;
		@Pc(28) int local28;
		for (local20 = 0; local20 < local18.length; local20++) {
			local28 = local18[local20];
			@Pc(51) byte local51 = (byte) ((local28 & 0xFF) + (local28 >> 8 & 0xFF) * 4 + (local28 >> 16 & 0xFF) * 3 >> 3);
			local18[local20] = local18[local20] & 0xFF000000 | local51 << 16 | local51 << 8 | local51;
		}
		this.aClass99Array1 = new Class99[256];
		this.aClass99Array2 = new Class99[256];
		for (local20 = 0; local20 < 256; local20++) {
			local28 = this.aClass15_8.method369(local20, (short) -13838);
			@Pc(96) int local96 = this.aClass15_8.method371(local20, -957727846);
			@Pc(102) short[] local102 = this.aClass15_8.method384(local20, -1381083777);
			@Pc(106) short local106 = local102[0];
			@Pc(110) short local110 = local102[1];
			@Pc(115) int[] local115 = new int[local28 * local96];
			@Pc(122) int local122;
			for (@Pc(117) int local117 = 0; local117 < local96; local117++) {
				for (local122 = 0; local122 < local28; local122++) {
					local115[local28 * local117 + local122] = local13[local122 * this.aClass15_8.anInt50 * -2031443477 + local106 + (local117 * this.aClass15_8.anInt50 * -2031443477 + local110) * this.aClass15_8.anInt49 * 592072939];
				}
			}
			@Pc(168) int[] local168 = new int[local96 * local28];
			for (local122 = 0; local122 < local96; local122++) {
				for (@Pc(175) int local175 = 0; local175 < local28; local175++) {
					local168[local175 + local122 * local28] = local18[local175 * this.aClass15_8.anInt50 * -2031443477 + local106 + this.aClass15_8.anInt49 * 592072939 * (local110 + local122 * -2031443477 * this.aClass15_8.anInt50)];
				}
			}
			this.aClass99Array1[local20] = this.aClass102_Sub2_5.method20740(local115, 0, local28, local28, local96, false);
			this.aClass99Array2[local20] = this.aClass102_Sub2_5.method20740(local168, 0, local28, local28, local96, false);
		}
	}

	@OriginalMember(owner = "client!afj", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_5.anIntArray50 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -2062037238);
		if (arg4) {
			this.aClass99Array2[arg0].method18226(arg1, local12, 1, arg3, 1);
		} else {
			this.aClass99Array1[arg0].method18226(arg1, local12, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afj", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afj", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afj", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_5.anIntArray50 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -1644879231);
		if (arg4) {
			this.aClass99Array2[arg0].method18226(arg1, local12, 1, arg3, 1);
		} else {
			this.aClass99Array1[arg0].method18226(arg1, local12, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afj", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_5.anIntArray50 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, 5623544);
		if (arg4) {
			this.aClass99Array2[arg0].method18226(arg1, local12, 1, arg3, 1);
		} else {
			this.aClass99Array1[arg0].method18226(arg1, local12, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afj", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_5.anIntArray50 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -395717849);
		if (arg4) {
			this.aClass99Array2[arg0].method18226(arg1, local12, 1, arg3, 1);
		} else {
			this.aClass99Array1[arg0].method18226(arg1, local12, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afj", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afj", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass102_Sub2_5.anIntArray50 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 + this.aClass15_8.method401(arg0, -52326854);
		if (arg4) {
			this.aClass99Array2[arg0].method18226(arg1, local12, 1, arg3, 1);
		} else {
			this.aClass99Array1[arg0].method18226(arg1, local12, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afj", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
