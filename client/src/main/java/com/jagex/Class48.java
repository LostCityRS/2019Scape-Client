package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abw")
public final class Class48 {

	@OriginalMember(owner = "client!abw", name = "m", descriptor = "I")
	static final int anInt188 = 2;

	@OriginalMember(owner = "client!abw", name = "n", descriptor = "I")
	static final int anInt189 = 1;

	@OriginalMember(owner = "client!abw", name = "f", descriptor = "I")
	static final int anInt190 = 8;

	@OriginalMember(owner = "client!abw", name = "k", descriptor = "I")
	static final int anInt191 = 4;

	@OriginalMember(owner = "client!abw", name = "e", descriptor = "I")
	static final int anInt192 = 2;

	@OriginalMember(owner = "client!abw", name = "w", descriptor = "[I")
	public int[] anIntArray14 = new int[3];

	@OriginalMember(owner = "client!abw", name = "l", descriptor = "[I")
	public int[] anIntArray12 = new int[3];

	@OriginalMember(owner = "client!abw", name = "u", descriptor = "[I")
	public int[] anIntArray13 = new int[2];

	@OriginalMember(owner = "client!abw", name = "z", descriptor = "[I")
	public int[] anIntArray15 = new int[2];

	@OriginalMember(owner = "client!abw", name = "p", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!abw", name = "d", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!abw", name = "m", descriptor = "(Lclient!abv;Lclient!alw;)Lclient!abw;")
	public static Class48 method961(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		return Class115.method8314(arg0, arg1, 2, -1150803207);
	}

	@OriginalMember(owner = "client!abw", name = "k", descriptor = "(Lclient!abv;Lclient!alw;)Lclient!abw;")
	public static Class48 method962(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		return Class115.method8314(arg0, arg1, 2, -1507692329);
	}

	@OriginalMember(owner = "client!abw", name = "f", descriptor = "(Lclient!abv;Lclient!alw;)Lclient!abw;")
	public static Class48 method963(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		return Class115.method8314(arg0, arg1, 2, -456066828);
	}

	@OriginalMember(owner = "client!abw", name = "w", descriptor = "(Lclient!abv;Lclient!alw;I)Lclient!abw;")
	static Class48 method964(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class48 local4 = new Class48(arg0);
		@Pc(8) int local8 = arg1.method22425((short) 16384);
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(32) boolean local32 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray14[0] = arg1.method22427(-1434290800);
				local4.anIntArray12[0] = arg1.method22427(-1434290800);
			} else {
				local4.anIntArray14[0] = arg1.method22448(-1368519913);
				local4.anIntArray12[0] = arg1.method22448(-786524519);
			}
			if (arg0.anInt143 * 876926327 != -1 || arg0.anInt158 * 61740559 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[1] = arg1.method22427(-1434290800);
					local4.anIntArray12[1] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray14[1] = arg1.method22448(-1538969244);
					local4.anIntArray12[1] = arg1.method22448(-98519579);
				}
			}
			if (arg0.anInt159 * -606200001 != -1 || arg0.anInt160 * -492567931 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[2] = arg1.method22427(-1434290800);
					local4.anIntArray12[2] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray14[2] = arg1.method22448(-1143639983);
					local4.anIntArray12[2] = arg1.method22448(-1453226108);
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray13[0] = arg1.method22427(-1434290800);
				local4.anIntArray15[0] = arg1.method22427(-1434290800);
			} else {
				local4.anIntArray13[0] = arg1.method22448(-1071681222);
				local4.anIntArray15[0] = arg1.method22448(-1605866384);
			}
			if (arg0.anInt141 * 1052917305 != -1 || arg0.anInt168 * -1920351591 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray13[1] = arg1.method22427(-1434290800);
					local4.anIntArray15[1] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray13[1] = arg1.method22448(-1490501037);
					local4.anIntArray15[1] = arg1.method22448(-1185337352);
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local32) {
			local247 = arg1.method22427(-1434290800);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.method22427(-1434290800);
				}
			}
		}
		if (local41) {
			local247 = arg1.method22425((short) 16384);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.method22427(-1434290800);
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!abw", name = "<init>", descriptor = "(Lclient!abv;)V")
	Class48(@OriginalArg(0) Class47 arg0) {
		this.anIntArray14[0] = arg0.anInt155 * -1607963233;
		this.anIntArray14[1] = arg0.anInt143 * 876926327;
		this.anIntArray14[2] = arg0.anInt159 * -606200001;
		this.anIntArray12[0] = arg0.anInt157 * 123632705;
		this.anIntArray12[1] = arg0.anInt158 * 61740559;
		this.anIntArray12[2] = arg0.anInt160 * -492567931;
		this.anIntArray13[0] = arg0.anInt166 * 237432167;
		this.anIntArray13[1] = arg0.anInt141 * 1052917305;
		this.anIntArray15[0] = arg0.anInt167 * 503799639;
		this.anIntArray15[1] = arg0.anInt168 * -1920351591;
		if (arg0.aShortArray1 != null) {
			this.aShortArray6 = new short[arg0.aShortArray1.length];
			System.arraycopy(arg0.aShortArray1, 0, this.aShortArray6, 0, this.aShortArray6.length);
		}
		if (arg0.aShortArray3 != null) {
			this.aShortArray7 = new short[arg0.aShortArray3.length];
			System.arraycopy(arg0.aShortArray3, 0, this.aShortArray7, 0, this.aShortArray7.length);
		}
	}
}
