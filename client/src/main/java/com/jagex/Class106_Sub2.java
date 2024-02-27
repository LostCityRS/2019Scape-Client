package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afh")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!afh", name = "i", descriptor = "I")
	static int anInt749;

	@OriginalMember(owner = "client!afh", name = "o", descriptor = "Lclient!afg;")
	Class104_Sub3 aClass104_Sub3_4;

	@OriginalMember(owner = "client!afh", name = "s", descriptor = "[Lclient!cm;")
	Class100[] aClass100Array2;

	@OriginalMember(owner = "client!afh", name = "y", descriptor = "[Lclient!cm;")
	Class100[] aClass100Array3;

	@OriginalMember(owner = "client!afh", name = "<init>", descriptor = "(Lclient!afg;Lclient!aac;Lclient!afb;)V")
	Class106_Sub2(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105_Sub1 arg2) {
		super(arg0, arg1);
		this.aClass104_Sub3_4 = arg0;
		this.aClass104_Sub3_4 = arg0;
		@Pc(13) int[] local13 = arg2.method7171(false);
		@Pc(18) int[] local18 = (int[]) local13.clone();
		@Pc(20) int local20;
		@Pc(28) int local28;
		for (local20 = 0; local20 < local18.length; local20++) {
			local28 = local18[local20];
			@Pc(51) byte local51 = (byte) ((local28 & 0xFF) + (local28 >> 16 & 0xFF) * 3 + (local28 >> 8 & 0xFF) * 4 >> 3);
			local18[local20] = local18[local20] & 0xFF000000 | local51 << 16 | local51 << 8 | local51;
		}
		this.aClass100Array2 = new Class100[256];
		this.aClass100Array3 = new Class100[256];
		for (local20 = 0; local20 < 256; local20++) {
			local28 = this.aClass5_10.method62(local20, (byte) -29);
			@Pc(96) int local96 = this.aClass5_10.method33(local20, 1415476369);
			@Pc(102) short[] local102 = this.aClass5_10.method65(local20, 1781724665);
			@Pc(106) short local106 = local102[0];
			@Pc(110) short local110 = local102[1];
			@Pc(115) int[] local115 = new int[local96 * local28];
			@Pc(122) int local122;
			for (@Pc(117) int local117 = 0; local117 < local96; local117++) {
				for (local122 = 0; local122 < local28; local122++) {
					local115[local122 + local117 * local28] = local13[this.aClass5_10.anInt12 * -2141347013 * (local110 + this.aClass5_10.anInt11 * 286794121 * local117) + local106 + local122 * 286794121 * this.aClass5_10.anInt11];
				}
			}
			@Pc(168) int[] local168 = new int[local28 * local96];
			for (local122 = 0; local122 < local96; local122++) {
				for (@Pc(175) int local175 = 0; local175 < local28; local175++) {
					local168[local122 * local28 + local175] = local18[local106 + this.aClass5_10.anInt12 * -2141347013 * (local110 + local122 * this.aClass5_10.anInt11 * 286794121) + this.aClass5_10.anInt11 * 286794121 * local175];
				}
			}
			this.aClass100Array2[local20] = this.aClass104_Sub3_4.method20499(local115, 0, local28, local28, local96, false);
			this.aClass100Array3[local20] = this.aClass104_Sub3_4.method20499(local168, 0, local28, local28, local96, false);
		}
	}

	@OriginalMember(owner = "client!afh", name = "b", descriptor = "(CIIIZ)V")
	@Override
	void method7549(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_4.anIntArray46 == null) {
			return;
		}
		@Pc(13) int local13 = arg2 + this.aClass5_10.method64(arg0, (byte) -10);
		if (arg4) {
			this.aClass100Array3[arg0].method18185(arg1, local13, 1, arg3, 1);
		} else {
			this.aClass100Array2[arg0].method18185(arg1, local13, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afh", name = "s", descriptor = "(CIIIZ)V")
	@Override
	void method7533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_4.anIntArray46 == null) {
			return;
		}
		@Pc(13) int local13 = arg2 + this.aClass5_10.method64(arg0, (byte) -23);
		if (arg4) {
			this.aClass100Array3[arg0].method18185(arg1, local13, 1, arg3, 1);
		} else {
			this.aClass100Array2[arg0].method18185(arg1, local13, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afh", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7544(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_4.anIntArray46 == null) {
			return;
		}
		@Pc(13) int local13 = arg2 + this.aClass5_10.method64(arg0, (byte) -117);
		if (arg4) {
			this.aClass100Array3[arg0].method18185(arg1, local13, 1, arg3, 1);
		} else {
			this.aClass100Array2[arg0].method18185(arg1, local13, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afh", name = "q", descriptor = "(CIIIZ)V")
	@Override
	void method7541(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_4.anIntArray46 == null) {
			return;
		}
		@Pc(13) int local13 = arg2 + this.aClass5_10.method64(arg0, (byte) -77);
		if (arg4) {
			this.aClass100Array3[arg0].method18185(arg1, local13, 1, arg3, 1);
		} else {
			this.aClass100Array2[arg0].method18185(arg1, local13, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afh", name = "x", descriptor = "(CIIIZ)V")
	@Override
	void method7523(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass104_Sub3_4.anIntArray46 == null) {
			return;
		}
		@Pc(13) int local13 = arg2 + this.aClass5_10.method64(arg0, (byte) -100);
		if (arg4) {
			this.aClass100Array3[arg0].method18185(arg1, local13, 1, arg3, 1);
		} else {
			this.aClass100Array2[arg0].method18185(arg1, local13, 1, arg3, 1);
		}
	}

	@OriginalMember(owner = "client!afh", name = "g", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7546(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afh", name = "a", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7545(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afh", name = "y", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7540(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!afh", name = "i", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7566(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
