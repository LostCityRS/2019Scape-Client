package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class430 {

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	static int anInt4639;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "I")
	static int anInt4640;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	static int anInt4641;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!ej;")
	static Class243 aClass243_81 = new Class243(32);

	@OriginalMember(owner = "client!n", name = "k", descriptor = "(I)V")
	static void method29070(@OriginalArg(0) int arg0) {
		anInt4640 = arg0 * -1322214105;
		@Pc(6) Class243 local6 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!n", name = "i", descriptor = "(Lclient!di;IIIIILclient!dn;IIIILclient!aad;)Lclient!dn;")
	public static Class105 method29071(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23592(2006272955);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(41) Class243 local41 = aClass243_81;
		@Pc(47) Class105 local47;
		synchronized (aClass243_81) {
			local47 = (Class105) aClass243_81.method26282(local38);
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
			local47 = arg0.method20753(local112, local5, anInt4640 * 767492759, 64, 768);
			@Pc(361) Class243 local361 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local47, local38);
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

	@OriginalMember(owner = "client!n", name = "m", descriptor = "(Lclient!di;IIIIILclient!dn;IIIILclient!aad;)Lclient!dn;")
	public static Class105 method29072(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23592(1942435091);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(41) Class243 local41 = aClass243_81;
		@Pc(47) Class105 local47;
		synchronized (aClass243_81) {
			local47 = (Class105) aClass243_81.method26282(local38);
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
			local47 = arg0.method20753(local112, local5, anInt4640 * 767492759, 64, 768);
			@Pc(361) Class243 local361 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local47, local38);
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

	@OriginalMember(owner = "client!n", name = "o", descriptor = "(Lclient!di;IIIIILclient!dn;IIIILclient!aad;)Lclient!dn;")
	public static Class105 method29073(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23592(2002672709);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(41) Class243 local41 = aClass243_81;
		@Pc(47) Class105 local47;
		synchronized (aClass243_81) {
			local47 = (Class105) aClass243_81.method26282(local38);
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
			local47 = arg0.method20753(local112, local5, anInt4640 * 767492759, 64, 768);
			@Pc(361) Class243 local361 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local47, local38);
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

	@OriginalMember(owner = "client!n", name = "j", descriptor = "(Lclient!di;IIIIILclient!dn;IIIILclient!aad;)Lclient!dn;")
	public static Class105 method29074(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class6 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method23592(2072549955);
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(41) Class243 local41 = aClass243_81;
		@Pc(47) Class105 local47;
		synchronized (aClass243_81) {
			local47 = (Class105) aClass243_81.method26282(local38);
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
			local47 = arg0.method20753(local112, local5, anInt4640 * 767492759, 64, 768);
			@Pc(361) Class243 local361 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local47, local38);
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

	@OriginalMember(owner = "client!n", name = "w", descriptor = "(I)V")
	static void method29075(@OriginalArg(0) int arg0) {
		anInt4640 = arg0 * -1322214105;
		@Pc(6) Class243 local6 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
	static void method29076() {
		@Pc(2) Class243 local2 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!n", name = "s", descriptor = "(Lclient!di;IIIILclient!dn;SBLclient!aad;)Lclient!dn;")
	public static Class105 method29077(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class6 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg8 != null) {
			local6 |= arg8.method23592(2058342831);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(27) long local27 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(30) Class243 local30 = aClass243_81;
		@Pc(36) Class105 local36;
		synchronized (aClass243_81) {
			local36 = (Class105) aClass243_81.method26282(local27);
		}
		if (local36 == null || arg0.method21083(local36.method7326(), local6) != 0) {
			if (local36 != null) {
				local6 = arg0.method20755(local6, local36.method7326());
			}
			@Pc(67) Class232 local67 = new Class232(4, 2, 2);
			@Pc(69) short local69 = 128;
			@Pc(72) int[] local72 = new int[] { local67.method26042(-local69, 0, -local69), local67.method26042(local69, 0, -local69), local67.method26042(local69, 0, local69), local67.method26042(-local69, 0, local69) };
			local67.method26078(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26078(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26044((short) 1, (short) 2, (short) 0);
			local67.method26044((short) 2, (short) 3, (short) 0);
			local36 = arg0.method20753(local67, local6, anInt4640 * 767492759, 64, 768);
			@Pc(155) Class243 local155 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local36, local27);
			}
		}
		@Pc(171) int local171 = arg5.method7533();
		@Pc(174) int local174 = arg5.method7485();
		@Pc(177) int local177 = arg5.method7368();
		@Pc(180) int local180 = arg5.method7342();
		if (arg8 == null) {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local174 + local171 >> 1, 0, local180 + local177 >> 1);
		} else {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local171 + local174 >> 1, 0, local177 + local180 >> 1);
			arg8.method23607(local36, 314536849);
		}
		if (arg2 != 0) {
			local36.method7330(arg2);
		}
		if (arg3 != 0) {
			local36.method7318(arg3);
		}
		if (arg4 != 0) {
			local36.method7332(0, arg4, 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!n", name = "x", descriptor = "(I)V")
	static void method29078(@OriginalArg(0) int arg0) {
		anInt4640 = arg0 * -1322214105;
		@Pc(6) Class243 local6 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!n", name = "r", descriptor = "()V")
	public static void method29079() {
		@Pc(2) Class243 local2 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!n", name = "q", descriptor = "(I)V")
	static void method29080(@OriginalArg(0) int arg0) {
		@Pc(2) Class243 local2 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26247(arg0, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "()V")
	static void method29081() {
		@Pc(2) Class243 local2 = aClass243_81;
		synchronized (aClass243_81) {
			aClass243_81.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!di;IIIILclient!dn;SBLclient!aad;)Lclient!dn;")
	public static Class105 method29082(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class6 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg8 != null) {
			local6 |= arg8.method23592(1898465262);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(27) long local27 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(30) Class243 local30 = aClass243_81;
		@Pc(36) Class105 local36;
		synchronized (aClass243_81) {
			local36 = (Class105) aClass243_81.method26282(local27);
		}
		if (local36 == null || arg0.method21083(local36.method7326(), local6) != 0) {
			if (local36 != null) {
				local6 = arg0.method20755(local6, local36.method7326());
			}
			@Pc(67) Class232 local67 = new Class232(4, 2, 2);
			@Pc(69) short local69 = 128;
			@Pc(72) int[] local72 = new int[] { local67.method26042(-local69, 0, -local69), local67.method26042(local69, 0, -local69), local67.method26042(local69, 0, local69), local67.method26042(-local69, 0, local69) };
			local67.method26078(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26078(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26044((short) 1, (short) 2, (short) 0);
			local67.method26044((short) 2, (short) 3, (short) 0);
			local36 = arg0.method20753(local67, local6, anInt4640 * 767492759, 64, 768);
			@Pc(155) Class243 local155 = aClass243_81;
			synchronized (aClass243_81) {
				aClass243_81.method26253(local36, local27);
			}
		}
		@Pc(171) int local171 = arg5.method7533();
		@Pc(174) int local174 = arg5.method7485();
		@Pc(177) int local177 = arg5.method7368();
		@Pc(180) int local180 = arg5.method7342();
		if (arg8 == null) {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local174 + local171 >> 1, 0, local180 + local177 >> 1);
		} else {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local171 + local174 >> 1, 0, local177 + local180 >> 1);
			arg8.method23607(local36, 314536849);
		}
		if (arg2 != 0) {
			local36.method7330(arg2);
		}
		if (arg3 != 0) {
			local36.method7318(arg3);
		}
		if (arg4 != 0) {
			local36.method7332(0, arg4, 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(IIIIIII)I")
	public static int method29083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!n", name = "x", descriptor = "(Lclient!asw;ILclient!yp;B)V")
	static void method29084(@OriginalArg(0) Class80_Sub1_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg2.anInt5778 = 0;
		arg2.anInt5776 = 0;
		arg2.anInt5780 = 1216954807;
		arg2.aClass80_Sub1_Sub20_2 = arg0;
		arg2.aClass557Array2 = arg2.aClass80_Sub1_Sub20_2.aClass557Array1;
		arg2.anIntArray526 = arg2.aClass80_Sub1_Sub20_2.anIntArray283;
		@Pc(23) Class557 local23 = null;
		arg2.anInt5775 = 0;
		arg2.aMap23.clear();
		arg2.aMap23.put(Class143.aClass143_71, Class672.aClass134_1.aClass636_1);
		arg2.aMap23.put(Class143.aClass143_69, Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1);
		arg2.aMap23.put(Class143.aClass143_66, Class504.aClass110_1);
		if (arg2.aClass378_3 != null) {
			arg2.aMap23.put(Class143.aClass143_63, Class699.method37067(arg2.aClass378_3, 1176864696));
		}
		if (arg2.aClass120_Sub1_Sub1_Sub1_4 instanceof Class120_Sub1_Sub1_Sub1_Sub1) {
			arg2.aMap23.put(Class143.aClass143_62, arg2.aClass120_Sub1_Sub1_Sub1_4.anInterface22_3);
		}
		if (arg2.aClass120_Sub1_Sub1_Sub1_4 instanceof Class120_Sub1_Sub1_Sub1_Sub2) {
			arg2.aMap24.put(Class143.aClass143_71, arg2.aClass120_Sub1_Sub1_Sub1_4.anInterface22_3);
		}
		if (Class134.aClass305_1 != null) {
			arg2.aMap23.put(Class143.aClass143_70, Class134.aClass305_1.method27129(-975165009));
		}
		boolean var9 = false;
		label130: {
			try {
				var9 = true;
				Class681.anInt5748 = 0;
				while (true) {
					Class681.anInt5748 += -411487421;
					if (Class681.anInt5748 * 1400729963 > arg1) {
						throw new RuntimeException("");
					}
					local23 = arg2.aClass557Array2[(arg2.anInt5780 += -1216954807) * -1336568839];
					if (Class681.aBoolean985 && (Class681.aString240 == null || arg2.aClass80_Sub1_Sub20_2.aString116 != null && arg2.aClass80_Sub1_Sub20_2.aString116.indexOf(Class681.aString240) != -1)) {
						System.out.println(arg2.aClass80_Sub1_Sub20_2.aString116 + ": " + local23);
					}
					if (arg2.anIntArray526[arg2.anInt5780 * -1336568839] == 1) {
						arg2.aBoolean988 = true;
					} else {
						arg2.aBoolean988 = false;
					}
					if (Class557.aClass557_308 == local23 && arg2.anInt5775 * -156827145 == 0) {
						var9 = false;
						break label130;
					}
					Class553.method31366(local23, arg2, 65535);
				}
			} catch (@Pc(188) Exception local188) {
				Class583.method31839(arg2, local23, local188, "S", (byte) -56);
				var9 = false;
			} finally {
				if (var9) {
					Class647.method33053((byte) 44);
				}
			}
			Class647.method33053((byte) 38);
			return;
		}
		Class647.method33053((byte) 102);
	}

	@OriginalMember(owner = "client!n", name = "fl", descriptor = "(ILjava/lang/String;ZB)V")
	public static void method29085(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == 0) {
			Class279.aClass102_9 = Class620.method32309(0, Class454.aCanvas6, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780) * 2, (byte) -74);
			if (arg1 != null) {
				Class279.aClass102_9.method20714(1, 0);
				@Pc(34) Class15 local34 = Class165_Sub44.method16877(Class569.aClass480_124, Class361.anInt4492 * 187098293, 0, Class317.aClass464_1, -1880069492);
				@Pc(45) Class104 local45 = Class279.aClass102_9.method20749(local34, Class212.method25822(Class708.aClass480_136, Class361.anInt4492 * 187098293, 0), true);
				Class50.method1038(-324212068);
				Class92.method1878(arg1, true, Class279.aClass102_9, local45, local34, 1616158983);
			}
		} else {
			@Pc(57) Class102 local57 = null;
			if (arg1 != null) {
				local57 = Class620.method32309(0, Class454.aCanvas6, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -79);
				local57.method20714(1, 0);
				@Pc(84) Class15 local84 = Class427.method29056(Class569.aClass480_124, Class361.anInt4492 * 187098293, 0, (byte) 91);
				@Pc(95) Class104 local95 = local57.method20749(local84, Class212.method25822(Class708.aClass480_136, Class361.anInt4492 * 187098293, 0), true);
				Class50.method1038(556271868);
				Class92.method1878(arg1, true, local57, local95, local84, 764551646);
				try {
					local57.method20660(-959622364);
					local57 = null;
				} catch (@Pc(111) Throwable local111) {
				}
			}
			boolean var18 = false;
			label260: {
				try {
					try {
						var18 = true;
						Class230.method26005(-672164049);
						System.gc();
						Class279.aClass102_9 = Class620.method32309(arg0, Class454.aCanvas6, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780) * 2, (byte) -16);
						Class317.aClass464_1 = new Class464(Class279.aClass102_9, Class708.aClass480_136, Class569.aClass480_124, Class546.method31209(-373997454));
						if (Class279.aClass102_9.method20664()) {
							@Pc(145) boolean local145 = true;
							try {
								local145 = Class705.aClass80_Sub39_1.anInt1719 * 625439365 > 256;
							} catch (@Pc(157) Throwable local157) {
							}
							@Pc(163) Class80_Sub22 local163;
							if (local145) {
								local163 = Class279.aClass102_9.method21093(146800640);
							} else {
								local163 = Class279.aClass102_9.method21093(104857600);
							}
							Class279.aClass102_9.method20737(local163);
							var18 = false;
						} else {
							var18 = false;
						}
						break label260;
					} catch (@Pc(181) Throwable local181) {
						switch(arg0) {
							case 1:
								Class80.method24400(Class68.aClass68_4, (byte) -8);
								break;
							case 3:
								Class80.method24400(Class68.aClass68_13, (byte) 68);
								break;
						}
						if (local181 instanceof RuntimeException_Sub3) {
							Class703.aClass80_Sub37_49.aClass165_Sub43_2.method16952(0, 1413385158);
							Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16952(0, 1413385158);
						}
						@Pc(208) int local208 = Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1558765792);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_2, 0, (byte) 55);
						if (local57 != null) {
							try {
								local57.method20660(-1318530958);
								local57 = null;
							} catch (@Pc(224) Throwable local224) {
							}
						}
						Class230.method26005(-672164049);
						System.gc();
						method29085(local208, arg1, arg2, (byte) 0);
						var18 = false;
					}
				} finally {
					if (var18 && local57 != null) {
						try {
							local57.method20660(-621324784);
						} catch (@Pc(250) Throwable local250) {
						}
					}
				}
				if (local57 != null) {
					try {
						local57.method20660(-2107017949);
					} catch (@Pc(240) Throwable local240) {
					}
				}
				return;
			}
			if (local57 != null) {
				try {
					local57.method20660(-370614157);
				} catch (@Pc(179) Throwable local179) {
				}
			}
		}
		if (arg2) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, !arg2, 470442690);
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_2, arg0, (byte) 9);
		if (!arg2) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, !arg2, 470442690);
		}
		Class154.method14987((byte) 37);
		Class279.aClass102_9.method20752(20000);
		Class279.aClass102_9.method20704(32);
		client.aClass539_1.method30939(1984662039);
		if (Class279.aClass102_9.method20791()) {
			Class411.method28966(Class703.aClass80_Sub37_49.aClass165_Sub47_1.method16965((short) -4561) == 1, -52433728);
		}
		client.aClass539_1.method30915(true, -1927519205);
		client.aClass539_1.method30904((byte) -88).method33382(-2034331824);
		Class60.method1184(1800131532);
		client.aBoolean714 = false;
		client.aBoolean707 = false;
		client.aBoolean718 = true;
		Class413.aClass26Array1 = null;
		Class279.aClass102_9.method20708(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!n", name = "i", descriptor = "(Lclient!di;Lclient!pf;I)V")
	public static void method29086(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class109[] local6 = Class212.method25824(arg1, Class330.anInt4185 * -1246449819, 0);
		Class668.aClass99Array8 = new Class99[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class668.aClass99Array8[local12] = arg0.method20906(local6[local12], true);
		}
		local6 = Class212.method25824(arg1, Class330.anInt4187 * -1030279809, 0);
		Class313.aClass99Array4 = new Class99[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class313.aClass99Array4[local12] = arg0.method20906(local6[local12], true);
		}
		local6 = Class212.method25824(arg1, anInt4639 * 545292705, 0);
		Class250.aClass99Array3 = new Class99[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class250.aClass99Array3[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, Class330.anInt4189 * -670137465, 0);
		Class330.aClass99Array5 = new Class99[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class330.aClass99Array5[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, anInt4641 * -151892225, 0);
		Class697.aClass99Array9 = new Class99[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class697.aClass99Array9[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, Class80_Sub28_Sub8.anInt3037 * 1866429939, 0);
		Class344.aClass99Array6 = new Class99[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class344.aClass99Array6[local70] = arg0.method20906(local6[local70], true);
		}
		Class103_Sub17_Sub2.aClass99_18 = arg0.method20906(Class212.method25822(arg1, Class699.anInt5812 * 1381845589, 0), true);
		Class11.aClass99_1 = arg0.method20906(Class212.method25822(arg1, Class390.anInt4561 * 819940157, 0), true);
		local6 = Class212.method25824(arg1, Class45.anInt2423 * 2065867053, 0);
		Class393.aClass99Array7 = new Class99[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class393.aClass99Array7[local70] = arg0.method20906(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!n", name = "vl", descriptor = "(Lclient!yp;I)V")
	static void method29087(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		Class490.aClass263_13.method26530(arg0.anIntArray525[arg0.anInt5778 * 1896589581], 255, -1866728727);
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(IIIZI)I")
	public static int method29088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class374 local5 = (Class374) Class664.aClass41_Sub17_2.method18054(arg2, -356724280);
		@Pc(8) Class107 local8 = local5.aClass107_1;
		@Pc(13) Class80_Sub3 local13 = Class565.method31482(arg0, arg3, -1073619666);
		@Pc(38) int local38;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray178.length || local13.aClass33Array1 == null || local13.aClass33Array1[arg1] == null) {
			local38 = (Integer) local8.method7184((byte) 14);
		} else {
			local38 = local13.aClass33Array1[arg1].method722(local8.anInt862 * -1873516487, (byte) 2);
		}
		return local5.method28421(local38, 374116413);
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	Class430() throws Throwable {
		throw new Error();
	}
}
