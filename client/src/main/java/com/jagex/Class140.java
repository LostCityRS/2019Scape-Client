package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public abstract class Class140 implements Interface39 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	static final int anInt1322 = 3553;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
	static final int anInt1323 = 0;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	static final int anInt1325 = 32879;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	static final int anInt1326 = 34067;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
	static final int[] anIntArray120 = new int[1];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!le;")
	Class396 aClass396_4 = Class396.aClass396_5;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!aqi;")
	final Class102_Sub1_Sub1 aClass102_Sub1_Sub1_9;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	final int anInt1324;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!co;")
	final Class210 aClass210_14;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!dy;")
	final Class236 aClass236_15;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Z")
	boolean aBoolean247;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	final int anInt1328;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	int anInt1327;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!aqi;ILclient!co;Lclient!dy;IZ)V")
	Class140(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class210 arg2, @OriginalArg(3) Class236 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass102_Sub1_Sub1_9 = arg0;
		this.anInt1324 = arg1;
		this.aClass210_14 = arg2;
		this.aClass236_15 = arg3;
		this.aBoolean247 = arg5;
		this.anInt1328 = arg4;
		OpenGL.glGenTextures(1, anIntArray120, 0);
		this.anInt1327 = anIntArray120[0];
		this.method11726();
		this.method11717(0);
	}

	@OriginalMember(owner = "client!rg", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		if (this.aClass396_4 != arg0) {
			this.aClass396_4 = arg0;
			this.method11726();
		}
	}

	@OriginalMember(owner = "client!rg", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass102_Sub1_Sub1_9.method21351();
		@Pc(17) int local17 = this.aClass102_Sub1_Sub1_9.anIntArray251[local11];
		if (local17 != this.anInt1324) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1324);
			this.aClass102_Sub1_Sub1_9.anIntArray251[local11] = this.anInt1324;
		}
		OpenGL.glBindTexture(this.anInt1324, this.anInt1327);
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.anInt1327 != 0) {
			this.aClass102_Sub1_Sub1_9.anInt3001 -= this.method11718();
			@Pc(13) int[] local13 = new int[] { this.anInt1327 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1327 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "bu", descriptor = "(III[F)V")
	final void method11712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, 1258112570)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, -2051960629)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "()Z")
	boolean method11713() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11718();
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glEnable(this.anInt1324);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1324);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glDisable(this.anInt1324);
		}
		this.aBoolean247 = true;
		this.method11726();
		this.method11717(local10);
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "bz", descriptor = "(III[I)V")
	final void method11714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -83079502)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class523.method30651(arg2, -817083193)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass210_14 == Class210.aClass210_24) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "be", descriptor = "(III[B)V")
	final void method11715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -650956436)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, -1518997797)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "bh", descriptor = "(III[F)V")
	final void method11716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, 351542781)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, 414069062)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "bv", descriptor = "(I)V")
	final void method11717(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_Sub1_9.anInt3001 -= arg0;
		this.aClass102_Sub1_Sub1_9.anInt3001 += this.method11718();
	}

	@OriginalMember(owner = "client!rg", name = "bp", descriptor = "()I")
	final int method11718() {
		@Pc(14) int local14 = this.aClass210_14.anInt3600 * 499559879 * this.aClass236_15.anInt3804 * -369125885 * this.anInt1328;
		return this.aBoolean247 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rg", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass102_Sub1_Sub1_9.method21351();
		@Pc(17) int local17 = this.aClass102_Sub1_Sub1_9.anIntArray251[local11];
		if (local17 != this.anInt1324) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1324);
			this.aClass102_Sub1_Sub1_9.anIntArray251[local11] = this.anInt1324;
		}
		OpenGL.glBindTexture(this.anInt1324, this.anInt1327);
	}

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "()V")
	final void method11719() {
		if (this.anInt1327 != 0) {
			this.aClass102_Sub1_Sub1_9.method20122(this.anInt1327, this.method11718());
			this.anInt1327 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	final void finalize() throws Throwable {
		this.method11719();
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.anInt1327 != 0) {
			this.aClass102_Sub1_Sub1_9.anInt3001 -= this.method11718();
			@Pc(13) int[] local13 = new int[] { this.anInt1327 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1327 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "hy", descriptor = "()V")
	final void method11720() throws Throwable {
		this.method11719();
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "bc", descriptor = "(III[I)V")
	final void method11721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -925964929)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class523.method30651(arg2, -596429656)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass210_14 == Class210.aClass210_24) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, 32993, this.aClass102_Sub1_Sub1_9.anInt2837, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "hj", descriptor = "()V")
	final void method11722() throws Throwable {
		this.method11719();
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "ht", descriptor = "()V")
	final void method11723() throws Throwable {
		this.method11719();
		super.finalize();
	}

	@OriginalMember(owner = "client!rg", name = "an", descriptor = "()Z")
	boolean method11724() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11718();
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glEnable(this.anInt1324);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1324);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glDisable(this.anInt1324);
		}
		this.aBoolean247 = true;
		this.method11726();
		this.method11717(local10);
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "aa", descriptor = "()Z")
	boolean method11725() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11718();
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glEnable(this.anInt1324);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1324);
		if (this.aClass102_Sub1_Sub1_9.aBoolean488) {
			OpenGL.glDisable(this.anInt1324);
		}
		this.aBoolean247 = true;
		this.method11726();
		this.method11717(local10);
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.anInt1327 != 0) {
			this.aClass102_Sub1_Sub1_9.anInt3001 -= this.method11718();
			@Pc(13) int[] local13 = new int[] { this.anInt1327 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1327 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "bk", descriptor = "()V")
	final void method11726() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (this.aClass396_4 == Class396.aClass396_5) {
			OpenGL.glTexParameteri(this.anInt1324, 10241, this.aBoolean247 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1324, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1324, 10241, this.aBoolean247 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1324, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rg", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass102_Sub1_Sub1_9.method21351();
		@Pc(17) int local17 = this.aClass102_Sub1_Sub1_9.anIntArray251[local11];
		if (local17 != this.anInt1324) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1324);
			this.aClass102_Sub1_Sub1_9.anIntArray251[local11] = this.anInt1324;
		}
		OpenGL.glBindTexture(this.anInt1324, this.anInt1327);
	}

	@OriginalMember(owner = "client!rg", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		if (this.aClass396_4 != arg0) {
			this.aClass396_4 = arg0;
			this.method11726();
		}
	}

	@OriginalMember(owner = "client!rg", name = "bo", descriptor = "()V")
	final void method11727() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (this.aClass396_4 == Class396.aClass396_5) {
			OpenGL.glTexParameteri(this.anInt1324, 10241, this.aBoolean247 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1324, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1324, 10241, this.aBoolean247 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1324, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rg", name = "bx", descriptor = "(III[B)V")
	final void method11728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -359770927)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, -722632670)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "bf", descriptor = "(III[B)V")
	final void method11729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -506129948)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, 571067841)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "bw", descriptor = "(III[B)V")
	final void method11730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, 1078867072)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, 1622803458)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass102_Sub1_Sub1_9.method21351();
		@Pc(17) int local17 = this.aClass102_Sub1_Sub1_9.anIntArray251[local11];
		if (local17 != this.anInt1324) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1324);
			this.aClass102_Sub1_Sub1_9.anIntArray251[local11] = this.anInt1324;
		}
		OpenGL.glBindTexture(this.anInt1324, this.anInt1327);
	}

	@OriginalMember(owner = "client!rg", name = "bi", descriptor = "(III[F)V")
	final void method11731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1327 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class523.method30651(arg1, -1513292486)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class523.method30651(arg2, 1409242030)) {
			@Pc(35) int local35 = this.aClass210_14.anInt3600 * 499559879;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg2, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.anInt1327 != 0) {
			this.aClass102_Sub1_Sub1_9.anInt3001 -= this.method11718();
			@Pc(13) int[] local13 = new int[] { this.anInt1327 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1327 = 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "bm", descriptor = "(I)V")
	final void method11732(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_Sub1_9.anInt3001 -= arg0;
		this.aClass102_Sub1_Sub1_9.anInt3001 += this.method11718();
	}

	@OriginalMember(owner = "client!rg", name = "bq", descriptor = "(I)V")
	final void method11733(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_Sub1_9.anInt3001 -= arg0;
		this.aClass102_Sub1_Sub1_9.anInt3001 += this.method11718();
	}

	@OriginalMember(owner = "client!rg", name = "bd", descriptor = "()I")
	final int method11734() {
		@Pc(14) int local14 = this.aClass210_14.anInt3600 * 499559879 * this.aClass236_15.anInt3804 * -369125885 * this.anInt1328;
		return this.aBoolean247 ? local14 * 4 / 3 : local14;
	}
}
