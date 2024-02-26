package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bz")
public abstract class Class84 {

	@OriginalMember(owner = "client!bz", name = "e", descriptor = "I")
	static final int anInt2588 = 34037;

	@OriginalMember(owner = "client!bz", name = "u", descriptor = "I")
	static final int anInt2589 = 34067;

	@OriginalMember(owner = "client!bz", name = "l", descriptor = "I")
	static final int anInt2590 = 32879;

	@OriginalMember(owner = "client!bz", name = "g", descriptor = "I")
	static final int anInt2591 = 5121;

	@OriginalMember(owner = "client!bz", name = "f", descriptor = "I")
	static final int anInt2593 = 3553;

	@OriginalMember(owner = "client!bz", name = "t", descriptor = "I")
	static final int anInt2595 = 3552;

	@OriginalMember(owner = "client!bz", name = "w", descriptor = "[I")
	static final int[] anIntArray220 = new int[1];

	@OriginalMember(owner = "client!bz", name = "k", descriptor = "Z")
	boolean aBoolean433 = false;

	@OriginalMember(owner = "client!bz", name = "i", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_34;

	@OriginalMember(owner = "client!bz", name = "o", descriptor = "I")
	final int anInt2587;

	@OriginalMember(owner = "client!bz", name = "j", descriptor = "Lclient!co;")
	final Class210 aClass210_16;

	@OriginalMember(owner = "client!bz", name = "a", descriptor = "Lclient!dy;")
	final Class236 aClass236_17;

	@OriginalMember(owner = "client!bz", name = "s", descriptor = "Z")
	boolean aBoolean432;

	@OriginalMember(owner = "client!bz", name = "x", descriptor = "I")
	final int anInt2594;

	@OriginalMember(owner = "client!bz", name = "m", descriptor = "I")
	int anInt2592;

	@OriginalMember(owner = "client!bz", name = "j", descriptor = "(IIIILclient!co;[B)V")
	static void method18316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class210 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class523.method30651(arg2, 1267767213)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class523.method30651(arg3, -1940994720)) {
			@Pc(26) int local26 = arg4.anInt3600 * 499559879;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class102_Sub3.method6423(arg4), 5121, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) byte local98 = local45[local80];
							local80 += local26;
							@Pc(108) int local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) int local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) int local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = (byte) (local128 >> 2);
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(159) byte[] local159 = local52;
				local52 = local45;
				local45 = local159;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "aj", descriptor = "(IIIILclient!co;[F)V")
	static void method18323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class210 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class523.method30651(arg2, -936083854)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class523.method30651(arg3, -1800069913)) {
			@Pc(26) int local26 = arg4.anInt3600 * 499559879;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class102_Sub3.method6423(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "o", descriptor = "(IIIIII[I)V")
	static void method18325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class523.method30651(arg2, -767902507)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class523.method30651(arg3, -562747945)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "a", descriptor = "(IIIILclient!co;[F)V")
	static void method18327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class210 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class523.method30651(arg2, 1669005404)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class523.method30651(arg3, -816296193)) {
			@Pc(26) int local26 = arg4.anInt3600 * 499559879;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class102_Sub3.method6423(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "ay", descriptor = "(IIIIII[I)V")
	static void method18332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class523.method30651(arg2, 129452523)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class523.method30651(arg3, -383043390)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "ao", descriptor = "(IIIILclient!co;[B)V")
	static void method18338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class210 arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Class523.method30651(arg2, -399710920)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class523.method30651(arg3, 703181163)) {
			@Pc(26) int local26 = arg4.anInt3600 * 499559879;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) byte[] local45 = arg5;
			@Pc(52) byte[] local52 = new byte[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local28, arg1, arg2, arg3, 0, Class102_Sub3.method6423(arg4), 5121, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) byte local98 = local45[local80];
							local80 += local26;
							@Pc(108) int local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) int local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) int local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = (byte) (local128 >> 2);
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(159) byte[] local159 = local52;
				local52 = local45;
				local45 = local159;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "aq", descriptor = "(IIIIII[I)V")
	static void method18348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class523.method30651(arg2, 104539405)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class523.method30651(arg3, -2003551373)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "ac", descriptor = "(IIIILclient!co;[F)V")
	static void method18349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class210 arg4, @OriginalArg(5) float[] arg5) {
		if (arg2 > 0 && !Class523.method30651(arg2, 53374338)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Class523.method30651(arg3, 1813548219)) {
			@Pc(26) int local26 = arg4.anInt3600 * 499559879;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = arg2 < arg3 ? arg2 : arg3;
			@Pc(39) int local39 = arg2 >> 1;
			@Pc(43) int local43 = arg3 >> 1;
			@Pc(45) float[] local45 = arg5;
			@Pc(52) float[] local52 = new float[local39 * local43 * local26];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local28, arg1, arg2, arg3, 0, Class102_Sub3.method6423(arg4), 5126, local45, 0);
				if (local35 <= 1) {
					return;
				}
				@Pc(71) int local71 = arg2 * local26;
				for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
					@Pc(78) int local78 = local73;
					@Pc(80) int local80 = local73;
					@Pc(84) int local84 = local73 + local71;
					for (@Pc(86) int local86 = 0; local86 < local43; local86++) {
						for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
							@Pc(98) float local98 = local45[local80];
							local80 += local26;
							@Pc(108) float local108 = local98 + local45[local80];
							local80 += local26;
							@Pc(118) float local118 = local108 + local45[local84];
							local84 += local26;
							@Pc(128) float local128 = local118 + local45[local84];
							local84 += local26;
							local52[local78] = local128 * 0.25F;
							local78 += local26;
						}
						local80 += local71;
						local84 += local71;
					}
				}
				@Pc(158) float[] local158 = local52;
				local52 = local45;
				local45 = local158;
				arg2 = local39;
				arg3 = local43;
				local39 >>= 0x1;
				local43 >>= 0x1;
				local35 >>= 0x1;
				local28++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "ai", descriptor = "(IIIIII[I)V")
	static void method18351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 > 0 && !Class523.method30651(arg2, 551439228)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Class523.method30651(arg3, -185139556)) {
			throw new IllegalArgumentException("");
		} else if (arg4 == 32993) {
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = arg2 < arg3 ? arg2 : arg3;
			@Pc(42) int local42 = arg2 >> 1;
			@Pc(46) int local46 = arg3 >> 1;
			@Pc(48) int[] local48 = arg6;
			@Pc(53) int[] local53 = new int[local42 * local46];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local31, arg1, arg2, arg3, 0, arg4, arg5, local48, 0);
				if (local38 <= 1) {
					return;
				}
				@Pc(69) int local69 = 0;
				@Pc(71) int local71 = 0;
				@Pc(75) int local75 = local71 + arg2;
				for (@Pc(77) int local77 = 0; local77 < local46; local77++) {
					for (@Pc(82) int local82 = 0; local82 < local42; local82++) {
						@Pc(90) int local90 = local48[local71++];
						@Pc(95) int local95 = local48[local71++];
						@Pc(100) int local100 = local48[local75++];
						@Pc(105) int local105 = local48[local75++];
						@Pc(111) int local111 = local90 >> 24 & 0xFF;
						@Pc(117) int local117 = local90 >> 16 & 0xFF;
						@Pc(123) int local123 = local90 >> 8 & 0xFF;
						@Pc(127) int local127 = local90 & 0xFF;
						@Pc(135) int local135 = local111 + (local95 >> 24 & 0xFF);
						@Pc(143) int local143 = local117 + (local95 >> 16 & 0xFF);
						@Pc(151) int local151 = local123 + (local95 >> 8 & 0xFF);
						@Pc(157) int local157 = local127 + (local95 & 0xFF);
						@Pc(165) int local165 = local135 + (local100 >> 24 & 0xFF);
						@Pc(173) int local173 = local143 + (local100 >> 16 & 0xFF);
						@Pc(181) int local181 = local151 + (local100 >> 8 & 0xFF);
						@Pc(187) int local187 = local157 + (local100 & 0xFF);
						@Pc(195) int local195 = local165 + (local105 >> 24 & 0xFF);
						@Pc(203) int local203 = local173 + (local105 >> 16 & 0xFF);
						@Pc(211) int local211 = local181 + (local105 >> 8 & 0xFF);
						@Pc(217) int local217 = local187 + (local105 & 0xFF);
						local53[local69++] = (local195 & 0x3FC) << 22 | (local203 & 0x3FC) << 14 | (local211 & 0x3FC) << 6 | local217 >> 2 & 0xFF;
					}
					local71 += arg2;
					local75 += arg2;
				}
				@Pc(258) int[] local258 = local53;
				local53 = local48;
				local48 = local258;
				arg2 = local42;
				arg3 = local46;
				local42 >>= 0x1;
				local46 >>= 0x1;
				local38 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bz", name = "<init>", descriptor = "(Lclient!afm;ILclient!co;Lclient!dy;IZ)V")
	Class84(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass102_Sub3_34 = arg0;
		this.anInt2587 = arg1;
		this.aClass210_16 = arg2;
		this.aClass236_17 = arg3;
		this.aBoolean432 = arg5;
		this.anInt2594 = arg4;
		OpenGL.glGenTextures(1, anIntArray220, 0);
		this.anInt2592 = anIntArray220[0];
		this.method18324(0);
	}

	@OriginalMember(owner = "client!bz", name = "p", descriptor = "()V")
	final void method18317() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.method6406(this.anInt2592, this.method18335());
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "f", descriptor = "()V")
	final void method18318() {
		this.aClass102_Sub3_34.method6339(this);
		if (this.aBoolean433) {
			OpenGL.glTexParameteri(this.anInt2587, 10241, this.aBoolean432 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2587, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2587, 10241, this.aBoolean432 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2587, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bz", name = "e", descriptor = "()Z")
	final boolean method18319() {
		if (!this.aClass102_Sub3_34.aBoolean141) {
			return false;
		}
		@Pc(6) int local6 = this.method18335();
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glGenerateMipmapEXT(this.anInt2587);
		this.aBoolean432 = true;
		this.method18318();
		this.method18324(local6);
		return true;
	}

	@OriginalMember(owner = "client!bz", name = "u", descriptor = "(Z)V")
	final void method18320(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean432 != arg0) {
			@Pc(6) int local6 = this.method18335();
			this.aBoolean432 = true;
			this.method18318();
			this.method18324(local6);
		}
	}

	@OriginalMember(owner = "client!bz", name = "l", descriptor = "()V")
	final void method18321() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.anInt774 -= this.method18335();
			@Pc(13) int[] local13 = new int[] { this.anInt2592 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "g", descriptor = "()V")
	final void method18322() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.method6406(this.anInt2592, this.method18335());
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "i", descriptor = "(I)V")
	final void method18324(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_34.anInt774 -= arg0;
		this.aClass102_Sub3_34.anInt774 += this.method18335();
	}

	@OriginalMember(owner = "client!bz", name = "finalize", descriptor = "()V")
	@Override
	final void finalize() throws Throwable {
		this.method18322();
		super.finalize();
	}

	@OriginalMember(owner = "client!bz", name = "q", descriptor = "(Z)V")
	final void method18326(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean432 != arg0) {
			@Pc(6) int local6 = this.method18335();
			this.aBoolean432 = true;
			this.method18318();
			this.method18324(local6);
		}
	}

	@OriginalMember(owner = "client!bz", name = "hy", descriptor = "()V")
	final void method18328() throws Throwable {
		this.method18322();
		super.finalize();
	}

	@OriginalMember(owner = "client!bz", name = "hj", descriptor = "()V")
	final void method18329() throws Throwable {
		this.method18322();
		super.finalize();
	}

	@OriginalMember(owner = "client!bz", name = "ht", descriptor = "()V")
	final void method18330() throws Throwable {
		this.method18322();
		super.finalize();
	}

	@OriginalMember(owner = "client!bz", name = "s", descriptor = "(Z)V")
	void method18331(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method18318();
		}
	}

	@OriginalMember(owner = "client!bz", name = "r", descriptor = "()V")
	final void method18333() {
		this.aClass102_Sub3_34.method6339(this);
		if (this.aBoolean433) {
			OpenGL.glTexParameteri(this.anInt2587, 10241, this.aBoolean432 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt2587, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt2587, 10241, this.aBoolean432 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt2587, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!bz", name = "w", descriptor = "(Z)V")
	void method18334(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method18318();
		}
	}

	@OriginalMember(owner = "client!bz", name = "m", descriptor = "()I")
	final int method18335() {
		@Pc(14) int local14 = this.aClass210_16.anInt3600 * 499559879 * this.aClass236_17.anInt3804 * -369125885 * this.anInt2594;
		return this.aBoolean432 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bz", name = "d", descriptor = "()V")
	final void method18336() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.anInt774 -= this.method18335();
			@Pc(13) int[] local13 = new int[] { this.anInt2592 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "h", descriptor = "(Z)V")
	final void method18337(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean432 != arg0) {
			@Pc(6) int local6 = this.method18335();
			this.aBoolean432 = true;
			this.method18318();
			this.method18324(local6);
		}
	}

	@OriginalMember(owner = "client!bz", name = "z", descriptor = "()V")
	final void method18339() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.anInt774 -= this.method18335();
			@Pc(13) int[] local13 = new int[] { this.anInt2592 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "t", descriptor = "(Z)V")
	void method18340(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method18318();
		}
	}

	@OriginalMember(owner = "client!bz", name = "v", descriptor = "()V")
	final void method18341() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.method6406(this.anInt2592, this.method18335());
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "n", descriptor = "()V")
	final void method18342() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.method6406(this.anInt2592, this.method18335());
			this.anInt2592 = 0;
		}
	}

	@OriginalMember(owner = "client!bz", name = "c", descriptor = "(I)V")
	final void method18343(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_34.anInt774 -= arg0;
		this.aClass102_Sub3_34.anInt774 += this.method18335();
	}

	@OriginalMember(owner = "client!bz", name = "b", descriptor = "(I)V")
	final void method18344(@OriginalArg(0) int arg0) {
		this.aClass102_Sub3_34.anInt774 -= arg0;
		this.aClass102_Sub3_34.anInt774 += this.method18335();
	}

	@OriginalMember(owner = "client!bz", name = "ax", descriptor = "()I")
	final int method18345() {
		@Pc(14) int local14 = this.aClass210_16.anInt3600 * 499559879 * this.aClass236_17.anInt3804 * -369125885 * this.anInt2594;
		return this.aBoolean432 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!bz", name = "k", descriptor = "(Z)V")
	void method18346(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method18318();
		}
	}

	@OriginalMember(owner = "client!bz", name = "x", descriptor = "(Z)V")
	void method18347(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method18318();
		}
	}

	@OriginalMember(owner = "client!bz", name = "y", descriptor = "()V")
	final void method18350() {
		if (this.anInt2592 != 0) {
			this.aClass102_Sub3_34.method6406(this.anInt2592, this.method18335());
			this.anInt2592 = 0;
		}
	}
}
