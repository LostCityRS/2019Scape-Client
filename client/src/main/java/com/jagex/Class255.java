package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ez")
public class Class255 {

	@OriginalMember(owner = "client!ez", name = "qo", descriptor = "Lclient!hf;")
	static Class312 aClass312_8;

	@OriginalMember(owner = "client!ez", name = "e", descriptor = "[I")
	final int[] anIntArray357;

	@OriginalMember(owner = "client!ez", name = "n", descriptor = "[I")
	final int[] anIntArray358;

	@OriginalMember(owner = "client!ez", name = "m", descriptor = "[I")
	final int[] anIntArray359;

	@OriginalMember(owner = "client!ez", name = "k", descriptor = "[I")
	final int[] anIntArray360;

	@OriginalMember(owner = "client!ez", name = "f", descriptor = "[I")
	final int[] anIntArray361;

	@OriginalMember(owner = "client!ez", name = "w", descriptor = "[I")
	final int[] anIntArray362;

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "[I")
	final int[] anIntArray363;

	@OriginalMember(owner = "client!ez", name = "<init>", descriptor = "(Lclient!alw;)V", line = 15)
	Class255(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method22528((byte) -104);
		this.anIntArray357 = new int[local5];
		this.anIntArray358 = new int[local5];
		this.anIntArray359 = new int[local5];
		this.anIntArray360 = new int[local5];
		this.anIntArray361 = new int[local5];
		this.anIntArray362 = new int[local5];
		this.anIntArray363 = new int[local5];
		for (@Pc(35) int local35 = 0; local35 < local5; local35++) {
			this.anIntArray357[local35] = arg0.method22472(-1434290800) - 5120;
			this.anIntArray359[local35] = arg0.method22472(-1434290800) - 5120;
			this.anIntArray358[local35] = arg0.method22475((byte) -29);
			this.anIntArray361[local35] = arg0.method22472(-1434290800) - 5120;
			this.anIntArray363[local35] = arg0.method22472(-1434290800) - 5120;
			this.anIntArray362[local35] = arg0.method22475((byte) -104);
			this.anIntArray360[local35] = arg0.method22475((byte) -90);
		}
	}

	@OriginalMember(owner = "client!ez", name = "e", descriptor = "(IS)V", line = 36)
	void method26003(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(7) int[][] local7 = new int[this.anIntArray357.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray357.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray357[local9];
			local7[local9 * 2][1] = this.anIntArray358[local9];
			local7[local9 * 2][2] = this.anIntArray359[local9];
			local7[local9 * 2][3] = this.anIntArray360[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray361[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray360[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ez", name = "n", descriptor = "(I)V", line = 36)
	void method26004(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray357.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray357.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray357[local9];
			local7[local9 * 2][1] = this.anIntArray358[local9];
			local7[local9 * 2][2] = this.anIntArray359[local9];
			local7[local9 * 2][3] = this.anIntArray360[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray361[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray360[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ez", name = "m", descriptor = "(I)V", line = 36)
	void method26005(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray357.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray357.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray357[local9];
			local7[local9 * 2][1] = this.anIntArray358[local9];
			local7[local9 * 2][2] = this.anIntArray359[local9];
			local7[local9 * 2][3] = this.anIntArray360[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray361[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray362[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray363[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray360[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ez", name = "s", descriptor = "(Lclient!yf;I)V", line = 80)
	static void method26006(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class347 local16 = (Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -1050431703);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anIntArray421 == null ? 0 : local16.anIntArray421.length;
	}

	@OriginalMember(owner = "client!ez", name = "be", descriptor = "(Lclient!hf;II)Ljava/lang/String;", line = 1593)
	static String method26007(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!client.method25364(arg0).method13622(arg1, -244589856) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray23 == null || arg0.aStringArray23.length <= arg1 || arg0.aStringArray23[arg1] == null || arg0.aStringArray23[arg1].trim().length() == 0) {
			return client.aBoolean615 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray23[arg1];
		}
	}

	@OriginalMember(owner = "client!ez", name = "fm", descriptor = "(I)I", line = 2248)
	public static int method26008(@OriginalArg(0) int arg0) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			return 3;
		} else if (client.aBoolean623) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ez", name = "rr", descriptor = "(Lclient!yf;I)V", line = 8138)
	static final void method26009(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		@Pc(19) Class312 local19 = Class431.method28780(local14, local11, -1208839593);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local19 == null ? -1 : local19.anInt3953 * -1549590237;
	}
}
