package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class315 {

	@OriginalMember(owner = "client!hj", name = "le", descriptor = "I")
	public static int anInt4021;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "Ljava/lang/String;")
	public String aString175;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/lang/String;")
	public String aString176;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "[Lclient!hg;")
	public Class312[] aClass312Array1;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "[Lclient!hg;")
	public Class312[] aClass312Array2;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/lang/String;")
	public String aString177;

	@OriginalMember(owner = "client!hj", name = "ov", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method27497(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2107187003) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray28 = Class431.method29089(local13, arg2, 1000214503);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!hj", name = "uw", descriptor = "(Lclient!yp;I)V")
	static void method27498(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class327 local14 = Class301.method27041(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 2140608085);
		if (local14.anInt4167 * 1052460537 == -1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local14.anInt4141 * 857016887;
		}
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "([I[F[FI)V")
	public static void method27499(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		Class150.method14522(arg0, arg1, arg2, 0, arg0.length - 1, -1729959424);
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "(Lclient!di;IIIIILclient!dn;IIIILclient!aad;I)Lclient!dn;")
	public static Class105 method27500(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6 arg11, @OriginalArg(12) int arg12) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23592(1972119313);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(41) Class243 local41 = Class430.aClass243_81;
		@Pc(47) Class105 local47;
		synchronized (Class430.aClass243_81) {
			local47 = (Class105) Class430.aClass243_81.method26282(local38);
		}
		@Pc(78) int local78;
		if (local47 == null || arg0.method21083(local47.method7326(), local5) != 0) {
			if (local47 != null) {
				local5 = arg0.method20755(local5, local47.method7326());
			}
			local78 = arg5 * 3 + 6;
			@Pc(80) byte local80 = 3;
			@Pc(95) int[] local95 = new int[] { 64, 96, 128 };
			@Pc(112) Class232 local112 = new Class232(local80 * local78 + 1, local80 * 2 * local78 - local78, 0);
			@Pc(118) int local118 = local112.method26042(0, 0, 0);
			@Pc(122) int[][] local122 = new int[local80][local78];
			@Pc(124) int local124;
			@Pc(131) int local131;
			@Pc(135) int local135;
			@Pc(154) int local154;
			for (local124 = 0; local124 < local80; local124++) {
				local131 = local95[local124];
				local135 = local95[local124];
				for (@Pc(137) int local137 = 0; local137 < local78; local137++) {
					@Pc(146) int local146 = (local137 << 14) / local78;
					local154 = local131 * Class467.anIntArray454[local146] >> 14;
					@Pc(162) int local162 = local135 * Class467.anIntArray453[local146] >> 14;
					local122[local124][local137] = local112.method26042(local154, 0, local162);
				}
			}
			for (local124 = 0; local124 < local80; local124++) {
				local131 = (local124 * 256 + 128) / local80;
				local135 = 256 - local131;
				@Pc(204) byte local204 = (byte) (arg9 * local135 + local131 * arg10 >> 8);
				@Pc(249) short local249 = (short) ((local135 * (arg7 & 0x7F) + local131 * (arg8 & 0x7F) & 0x7F00) + ((arg8 & 0xFC00) * local131 + (arg7 & 0xFC00) * local135 & 0xFC0000) + (local135 * (arg7 & 0x380) + (arg8 & 0x380) * local131 & 0x38000) >> 8);
				for (local154 = 0; local154 < local78; local154++) {
					if (local124 == 0) {
						local112.method26078(local118, local122[0][(local154 + 1) % local78], local122[0][local154], (byte) 1, (byte) -1, local249, local204, (short) -1);
					} else {
						local112.method26078(local122[local124 - 1][local154], local122[local124 - 1][(local154 + 1) % local78], local122[local124][(local154 + 1) % local78], (byte) 1, (byte) -1, local249, local204, (short) -1);
						local112.method26078(local122[local124 - 1][local154], local122[local124][(local154 + 1) % local78], local122[local124][local154], (byte) 1, (byte) -1, local249, local204, (short) -1);
					}
				}
			}
			local47 = arg0.method20753(local112, local5, Class430.anInt4640 * 767492759, 64, 768);
			@Pc(361) Class243 local361 = Class430.aClass243_81;
			synchronized (Class430.aClass243_81) {
				Class430.aClass243_81.method26253(local47, local38);
			}
		}
		local78 = arg6.method7533();
		@Pc(380) int local380 = arg6.method7485();
		@Pc(383) int local383 = arg6.method7368();
		@Pc(386) int local386 = arg6.method7342();
		if (arg11 == null) {
			local47 = local47.method7324((byte) 3, local5, true);
			local47.method7334(local380 - local78 >> 1, 128, local386 - local383 >> 1);
			local47.method7332(local380 + local78 >> 1, 0, local383 + local386 >> 1);
		} else {
			local47 = local47.method7324((byte) 3, local5, true);
			local47.method7334(local380 - local78 >> 1, 128, local386 - local383 >> 1);
			local47.method7332(local78 + local380 >> 1, 0, local386 + local383 >> 1);
			arg11.method23607(local47, 314536849);
		}
		if (arg2 != 0) {
			local47.method7330(arg2);
		}
		if (arg3 != 0) {
			local47.method7318(arg3);
		}
		if (arg4 != 0) {
			local47.method7332(0, arg4, 0);
		}
		return local47;
	}

	@OriginalMember(owner = "client!hj", name = "vz", descriptor = "(Lclient!yp;I)V")
	static void method27501(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class194.method24852(true, (short) -10632);
	}

	@OriginalMember(owner = "client!hj", name = "ly", descriptor = "(B)V")
	public static void method27502(@OriginalArg(0) byte arg0) {
		client.aBoolean743 = true;
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	Class315() {
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "(Lclient!hm;B)V")
	void method27494(@OriginalArg(0) Class318 arg0, @OriginalArg(1) byte arg1) {
		this.aString175 = arg0.method27519((byte) 14);
		this.aString176 = arg0.method27519((byte) 14);
		this.aString177 = arg0.method27519((byte) 14);
		@Pc(18) int local18 = arg0.method27520(-1897678104);
		@Pc(22) int local22 = arg0.method27520(-1863790349);
		this.aClass312Array2 = local18 == 0 ? null : new Class312[local18];
		this.aClass312Array1 = local22 == 0 ? null : new Class312[local22];
		@Pc(40) int local40;
		for (local40 = 0; local40 < local18; local40++) {
			this.aClass312Array2[local40] = new Class312();
			this.aClass312Array2[local40].method27460(arg0, (short) -4578);
		}
		for (local40 = 0; local40 < local22; local40++) {
			this.aClass312Array1[local40] = new Class312();
			this.aClass312Array1[local40].method27460(arg0, (short) -27143);
		}
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(Lclient!hm;)V")
	void method27495(@OriginalArg(0) Class318 arg0) {
		this.aString175 = arg0.method27519((byte) 14);
		this.aString176 = arg0.method27519((byte) 14);
		this.aString177 = arg0.method27519((byte) 14);
		@Pc(18) int local18 = arg0.method27520(-1901631239);
		@Pc(22) int local22 = arg0.method27520(-1860989253);
		this.aClass312Array2 = local18 == 0 ? null : new Class312[local18];
		this.aClass312Array1 = local22 == 0 ? null : new Class312[local22];
		@Pc(40) int local40;
		for (local40 = 0; local40 < local18; local40++) {
			this.aClass312Array2[local40] = new Class312();
			this.aClass312Array2[local40].method27460(arg0, (short) -14293);
		}
		for (local40 = 0; local40 < local22; local40++) {
			this.aClass312Array1[local40] = new Class312();
			this.aClass312Array1[local40].method27460(arg0, (short) -27);
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(Lclient!hm;)V")
	void method27496(@OriginalArg(0) Class318 arg0) {
		this.aString175 = arg0.method27519((byte) 14);
		this.aString176 = arg0.method27519((byte) 14);
		this.aString177 = arg0.method27519((byte) 14);
		@Pc(18) int local18 = arg0.method27520(-2048171134);
		@Pc(22) int local22 = arg0.method27520(-2037345285);
		this.aClass312Array2 = local18 == 0 ? null : new Class312[local18];
		this.aClass312Array1 = local22 == 0 ? null : new Class312[local22];
		@Pc(40) int local40;
		for (local40 = 0; local40 < local18; local40++) {
			this.aClass312Array2[local40] = new Class312();
			this.aClass312Array2[local40].method27460(arg0, (short) -26651);
		}
		for (local40 = 0; local40 < local22; local40++) {
			this.aClass312Array1[local40] = new Class312();
			this.aClass312Array1[local40].method27460(arg0, (short) -26656);
		}
	}
}
