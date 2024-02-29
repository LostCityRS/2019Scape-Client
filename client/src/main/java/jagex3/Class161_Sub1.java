package jagex3;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aln")
public final class Class161_Sub1 extends Class161 {

	@OriginalMember(owner = "client!aln", name = "n", descriptor = "[[F")
	static final float[][] aFloatArrayArray20 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!aln", name = "e", descriptor = "[I")
	int[] anIntArray197 = new int[512];

	@OriginalMember(owner = "client!aln", name = "v", descriptor = "(IFFF)F")
	static float method14750(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float[] local3 = aFloatArrayArray20[arg0];
		return local3[0] * arg1 + local3[1] * arg2 + local3[2] * arg3;
	}

	@OriginalMember(owner = "client!aln", name = "r", descriptor = "(IFFF)F")
	static float method14751(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float[] local3 = aFloatArrayArray20[arg0];
		return local3[0] * arg1 + local3[1] * arg2 + local3[2] * arg3;
	}

	@OriginalMember(owner = "client!aln", name = "f", descriptor = "(FFF)F")
	static float method14752(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!aln", name = "d", descriptor = "(FFF)F")
	static float method14753(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!aln", name = "u", descriptor = "(F)F")
	static float method14754(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!aln", name = "z", descriptor = "(F)F")
	static float method14755(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!aln", name = "p", descriptor = "(FFF)F")
	static float method14756(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!aln", name = "c", descriptor = "(FFF)F")
	static float method14757(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!aln", name = "l", descriptor = "(F)F")
	static float method14758(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!aln", name = "k", descriptor = "(F)F")
	static float method14759(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!aln", name = "w", descriptor = "(IFFF)F")
	static float method14760(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) float[] local3 = aFloatArrayArray20[arg0];
		return local3[0] * arg1 + local3[1] * arg2 + local3[2] * arg3;
	}

	@OriginalMember(owner = "client!aln", name = "<init>", descriptor = "(I)V")
	public Class161_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			this.anIntArray197[local13] = this.anIntArray197[local13 + 256] = local13;
		}
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray197[local40];
			this.anIntArray197[local40] = this.anIntArray197[local40 + 256] = this.anIntArray197[local13];
			this.anIntArray197[local13] = this.anIntArray197[local13 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!aln", name = "e", descriptor = "(IIIIFFFF[FI)V")
	@Override
	void method14747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (int) ((float) arg1 * arg4 - 1.0F);
		@Pc(11) int local11 = local7 & 0xFF;
		@Pc(19) int local19 = (int) ((float) arg2 * arg5 - 1.0F);
		@Pc(23) int local23 = local19 & 0xFF;
		@Pc(31) int local31 = (int) ((float) arg3 * arg6 - 1.0F);
		@Pc(35) int local35 = local31 & 0xFF;
		@Pc(40) float local40 = (float) arg0 * arg6;
		@Pc(43) int local43 = (int) local40;
		@Pc(47) int local47 = local43 + 1;
		@Pc(52) float local52 = local40 - (float) local43;
		@Pc(56) float local56 = 1.0F - local52;
		@Pc(59) float local59 = method14759(local52);
		@Pc(63) int local63 = local43 & local35;
		@Pc(67) int local67 = local47 & local35;
		@Pc(72) int local72 = this.anIntArray197[local63];
		@Pc(77) int local77 = this.anIntArray197[local67];
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			@Pc(87) float local87 = (float) local79 * arg5;
			@Pc(90) int local90 = (int) local87;
			@Pc(94) int local94 = local90 + 1;
			@Pc(99) float local99 = local87 - (float) local90;
			@Pc(103) float local103 = 1.0F - local99;
			@Pc(106) float local106 = method14759(local99);
			@Pc(110) int local110 = local90 & local23;
			@Pc(114) int local114 = local94 & local23;
			@Pc(121) int local121 = this.anIntArray197[local110 + local72];
			@Pc(128) int local128 = this.anIntArray197[local114 + local72];
			@Pc(135) int local135 = this.anIntArray197[local110 + local77];
			@Pc(142) int local142 = this.anIntArray197[local114 + local77];
			for (@Pc(144) int local144 = 0; local144 < arg1; local144++) {
				@Pc(152) float local152 = (float) local144 * arg4;
				@Pc(155) int local155 = (int) local152;
				@Pc(159) int local159 = local155 + 1;
				@Pc(164) float local164 = local152 - (float) local155;
				@Pc(168) float local168 = 1.0F - local164;
				@Pc(171) float local171 = method14759(local164);
				@Pc(175) int local175 = local155 & local11;
				@Pc(179) int local179 = local159 & local11;
				arg8[arg9++] = arg7 * method14752(method14752(method14752(method14760(this.anIntArray197[local175 + local121] & 0x7, local168, local103, local56), method14760(this.anIntArray197[local179 + local121] & 0x7, local164, local103, local56), local171), method14752(method14760(this.anIntArray197[local175 + local128] & 0x7, local168, local99, local56), method14760(this.anIntArray197[local179 + local128] & 0x7, local164, local99, local56), local171), local106), method14752(method14752(method14760(this.anIntArray197[local175 + local135] & 0x7, local168, local103, local52), method14760(this.anIntArray197[local179 + local135] & 0x7, local164, local103, local52), local171), method14752(method14760(this.anIntArray197[local175 + local142] & 0x7, local168, local99, local52), method14760(this.anIntArray197[local179 + local142] & 0x7, local164, local99, local52), local171), local106), local59);
			}
		}
	}

	@OriginalMember(owner = "client!aln", name = "m", descriptor = "(IIIIFFFF[FI)V")
	@Override
	void method14748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (int) ((float) arg1 * arg4 - 1.0F);
		@Pc(11) int local11 = local7 & 0xFF;
		@Pc(19) int local19 = (int) ((float) arg2 * arg5 - 1.0F);
		@Pc(23) int local23 = local19 & 0xFF;
		@Pc(31) int local31 = (int) ((float) arg3 * arg6 - 1.0F);
		@Pc(35) int local35 = local31 & 0xFF;
		@Pc(40) float local40 = (float) arg0 * arg6;
		@Pc(43) int local43 = (int) local40;
		@Pc(47) int local47 = local43 + 1;
		@Pc(52) float local52 = local40 - (float) local43;
		@Pc(56) float local56 = 1.0F - local52;
		@Pc(59) float local59 = method14759(local52);
		@Pc(63) int local63 = local43 & local35;
		@Pc(67) int local67 = local47 & local35;
		@Pc(72) int local72 = this.anIntArray197[local63];
		@Pc(77) int local77 = this.anIntArray197[local67];
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			@Pc(87) float local87 = (float) local79 * arg5;
			@Pc(90) int local90 = (int) local87;
			@Pc(94) int local94 = local90 + 1;
			@Pc(99) float local99 = local87 - (float) local90;
			@Pc(103) float local103 = 1.0F - local99;
			@Pc(106) float local106 = method14759(local99);
			@Pc(110) int local110 = local90 & local23;
			@Pc(114) int local114 = local94 & local23;
			@Pc(121) int local121 = this.anIntArray197[local110 + local72];
			@Pc(128) int local128 = this.anIntArray197[local114 + local72];
			@Pc(135) int local135 = this.anIntArray197[local110 + local77];
			@Pc(142) int local142 = this.anIntArray197[local114 + local77];
			for (@Pc(144) int local144 = 0; local144 < arg1; local144++) {
				@Pc(152) float local152 = (float) local144 * arg4;
				@Pc(155) int local155 = (int) local152;
				@Pc(159) int local159 = local155 + 1;
				@Pc(164) float local164 = local152 - (float) local155;
				@Pc(168) float local168 = 1.0F - local164;
				@Pc(171) float local171 = method14759(local164);
				@Pc(175) int local175 = local155 & local11;
				@Pc(179) int local179 = local159 & local11;
				arg8[arg9++] = arg7 * method14752(method14752(method14752(method14760(this.anIntArray197[local175 + local121] & 0x7, local168, local103, local56), method14760(this.anIntArray197[local179 + local121] & 0x7, local164, local103, local56), local171), method14752(method14760(this.anIntArray197[local175 + local128] & 0x7, local168, local99, local56), method14760(this.anIntArray197[local179 + local128] & 0x7, local164, local99, local56), local171), local106), method14752(method14752(method14760(this.anIntArray197[local175 + local135] & 0x7, local168, local103, local52), method14760(this.anIntArray197[local179 + local135] & 0x7, local164, local103, local52), local171), method14752(method14760(this.anIntArray197[local175 + local142] & 0x7, local168, local99, local52), method14760(this.anIntArray197[local179 + local142] & 0x7, local164, local99, local52), local171), local106), local59);
			}
		}
	}

	@OriginalMember(owner = "client!aln", name = "n", descriptor = "(IIIIFFFF[FI)V")
	@Override
	void method14749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (int) ((float) arg1 * arg4 - 1.0F);
		@Pc(11) int local11 = local7 & 0xFF;
		@Pc(19) int local19 = (int) ((float) arg2 * arg5 - 1.0F);
		@Pc(23) int local23 = local19 & 0xFF;
		@Pc(31) int local31 = (int) ((float) arg3 * arg6 - 1.0F);
		@Pc(35) int local35 = local31 & 0xFF;
		@Pc(40) float local40 = (float) arg0 * arg6;
		@Pc(43) int local43 = (int) local40;
		@Pc(47) int local47 = local43 + 1;
		@Pc(52) float local52 = local40 - (float) local43;
		@Pc(56) float local56 = 1.0F - local52;
		@Pc(59) float local59 = method14759(local52);
		@Pc(63) int local63 = local43 & local35;
		@Pc(67) int local67 = local47 & local35;
		@Pc(72) int local72 = this.anIntArray197[local63];
		@Pc(77) int local77 = this.anIntArray197[local67];
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			@Pc(87) float local87 = (float) local79 * arg5;
			@Pc(90) int local90 = (int) local87;
			@Pc(94) int local94 = local90 + 1;
			@Pc(99) float local99 = local87 - (float) local90;
			@Pc(103) float local103 = 1.0F - local99;
			@Pc(106) float local106 = method14759(local99);
			@Pc(110) int local110 = local90 & local23;
			@Pc(114) int local114 = local94 & local23;
			@Pc(121) int local121 = this.anIntArray197[local110 + local72];
			@Pc(128) int local128 = this.anIntArray197[local114 + local72];
			@Pc(135) int local135 = this.anIntArray197[local110 + local77];
			@Pc(142) int local142 = this.anIntArray197[local114 + local77];
			for (@Pc(144) int local144 = 0; local144 < arg1; local144++) {
				@Pc(152) float local152 = (float) local144 * arg4;
				@Pc(155) int local155 = (int) local152;
				@Pc(159) int local159 = local155 + 1;
				@Pc(164) float local164 = local152 - (float) local155;
				@Pc(168) float local168 = 1.0F - local164;
				@Pc(171) float local171 = method14759(local164);
				@Pc(175) int local175 = local155 & local11;
				@Pc(179) int local179 = local159 & local11;
				arg8[arg9++] = arg7 * method14752(method14752(method14752(method14760(this.anIntArray197[local175 + local121] & 0x7, local168, local103, local56), method14760(this.anIntArray197[local179 + local121] & 0x7, local164, local103, local56), local171), method14752(method14760(this.anIntArray197[local175 + local128] & 0x7, local168, local99, local56), method14760(this.anIntArray197[local179 + local128] & 0x7, local164, local99, local56), local171), local106), method14752(method14752(method14760(this.anIntArray197[local175 + local135] & 0x7, local168, local103, local52), method14760(this.anIntArray197[local179 + local135] & 0x7, local164, local103, local52), local171), method14752(method14760(this.anIntArray197[local175 + local142] & 0x7, local168, local99, local52), method14760(this.anIntArray197[local179 + local142] & 0x7, local164, local99, local52), local171), local106), local59);
			}
		}
	}
}
