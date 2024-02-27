package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public abstract class Class141 implements Interface43 {

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	static final int anInt1370 = 34067;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	static final int anInt1371 = 0;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	static final int anInt1372 = 3553;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	static final int anInt1374 = 32879;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "[I")
	static final int[] anIntArray162 = new int[1];

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!lt;")
	Class405 aClass405_4 = Class405.aClass405_6;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_8;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
	final int anInt1373;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Lclient!ck;")
	final Class206 aClass206_15;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "Lclient!dg;")
	final Class226 aClass226_16;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Z")
	boolean aBoolean256;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	final int anInt1375;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	int anInt1369;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!aqv;ILclient!ck;Lclient!dg;IZ)V")
	Class141(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass104_Sub2_Sub2_8 = arg0;
		this.anInt1373 = arg1;
		this.aClass206_15 = arg2;
		this.aClass226_16 = arg3;
		this.aBoolean256 = arg5;
		this.anInt1375 = arg4;
		OpenGL.glGenTextures(1, anIntArray162, 0);
		this.anInt1369 = anIntArray162[0];
		this.method11421();
		this.method11440(0);
	}

	@OriginalMember(owner = "client!rj", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		if (this.aClass405_4 != arg0) {
			this.aClass405_4 = arg0;
			this.method11421();
		}
	}

	@OriginalMember(owner = "client!rj", name = "ba", descriptor = "()V")
	final void method11419() {
		if (this.anInt1369 != 0) {
			this.aClass104_Sub2_Sub2_8.method21317(this.anInt1369, this.method11427());
			this.anInt1369 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "bw", descriptor = "()I")
	final int method11420() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "bl", descriptor = "()V")
	final void method11421() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass405_4 == Class405.aClass405_6) {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "()Z")
	boolean method11422() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11427();
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glEnable(this.anInt1373);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1373);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glDisable(this.anInt1373);
		}
		this.aBoolean256 = true;
		this.method11421();
		this.method11440(local10);
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "ar", descriptor = "()Z")
	boolean method11423() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11427();
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glEnable(this.anInt1373);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1373);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glDisable(this.anInt1373);
		}
		this.aBoolean256 = true;
		this.method11421();
		this.method11440(local10);
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "bh", descriptor = "(III[B)V")
	final void method11424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -1828013136)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class364.method28081(arg2, -1418273744)) {
			@Pc(35) int local35 = this.aClass206_15.anInt3389 * -1639868421;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5121, local54, 0);
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

	@OriginalMember(owner = "client!rj", name = "bx", descriptor = "(III[F)V")
	final void method11425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -1807001643)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class364.method28081(arg2, -1567714687)) {
			@Pc(35) int local35 = this.aClass206_15.anInt3389 * -1639868421;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5126, local54, 0);
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

	@OriginalMember(owner = "client!rj", name = "bn", descriptor = "()V")
	final void method11426() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass405_4 == Class405.aClass405_6) {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rj", name = "bc", descriptor = "()I")
	final int method11427() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.anInt1369 != 0) {
			this.aClass104_Sub2_Sub2_8.anInt2916 -= this.method11427();
			@Pc(13) int[] local13 = new int[] { this.anInt1369 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1369 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "bk", descriptor = "(III[I)V")
	final void method11428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -1445160312)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class364.method28081(arg2, -1788877942)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass206_15 == Class206.aClass206_22) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, local57, 0);
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

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method11433();
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.anInt1369 != 0) {
			this.aClass104_Sub2_Sub2_8.anInt2916 -= this.method11427();
			@Pc(13) int[] local13 = new int[] { this.anInt1369 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1369 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "hl", descriptor = "()V")
	final void method11429() throws Throwable {
		this.method11433();
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "au", descriptor = "()Z")
	boolean method11430() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11427();
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glEnable(this.anInt1373);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1373);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glDisable(this.anInt1373);
		}
		this.aBoolean256 = true;
		this.method11421();
		this.method11440(local10);
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		if (this.aClass405_4 != arg0) {
			this.aClass405_4 = arg0;
			this.method11421();
		}
	}

	@OriginalMember(owner = "client!rj", name = "ap", descriptor = "()Z")
	boolean method11431() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method11427();
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glEnable(this.anInt1373);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1373);
		if (this.aClass104_Sub2_Sub2_8.aBoolean492) {
			OpenGL.glDisable(this.anInt1373);
		}
		this.aBoolean256 = true;
		this.method11421();
		this.method11440(local10);
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "by", descriptor = "(I)V")
	final void method11432(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_Sub2_8.anInt2916 -= arg0;
		this.aClass104_Sub2_Sub2_8.anInt2916 += this.method11427();
	}

	@OriginalMember(owner = "client!rj", name = "bi", descriptor = "()V")
	final void method11433() {
		if (this.anInt1369 != 0) {
			this.aClass104_Sub2_Sub2_8.method21317(this.anInt1369, this.method11427());
			this.anInt1369 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass104_Sub2_Sub2_8.method20977();
		@Pc(17) int local17 = this.aClass104_Sub2_Sub2_8.anIntArray253[local11];
		if (local17 != this.anInt1373) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1373);
			this.aClass104_Sub2_Sub2_8.anIntArray253[local11] = this.anInt1373;
		}
		OpenGL.glBindTexture(this.anInt1373, this.anInt1369);
	}

	@OriginalMember(owner = "client!rj", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass104_Sub2_Sub2_8.method20977();
		@Pc(17) int local17 = this.aClass104_Sub2_Sub2_8.anIntArray253[local11];
		if (local17 != this.anInt1373) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1373);
			this.aClass104_Sub2_Sub2_8.anIntArray253[local11] = this.anInt1373;
		}
		OpenGL.glBindTexture(this.anInt1373, this.anInt1369);
	}

	@OriginalMember(owner = "client!rj", name = "bo", descriptor = "()I")
	final int method11434() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "bt", descriptor = "()V")
	final void method11435() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass104_Sub2_Sub2_8.method21032(this);
		if (this.aClass405_4 == Class405.aClass405_6) {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1373, 10241, this.aBoolean256 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1373, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rj", name = "bq", descriptor = "(III[I)V")
	final void method11436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -1632558728)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class364.method28081(arg2, -2048141697)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass206_15 == Class206.aClass206_22) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, local57, 0);
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

	@OriginalMember(owner = "client!rj", name = "bb", descriptor = "(III[B)V")
	final void method11437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -2135010570)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class364.method28081(arg2, -1316671233)) {
			@Pc(35) int local35 = this.aClass206_15.anInt3389 * -1639868421;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5121, local54, 0);
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

	@OriginalMember(owner = "client!rj", name = "be", descriptor = "(III[B)V")
	final void method11438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -1418927057)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class364.method28081(arg2, -1679209152)) {
			@Pc(35) int local35 = this.aClass206_15.anInt3389 * -1639868421;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, Class104_Sub2_Sub2.method21329(this.aClass206_15), 5121, local54, 0);
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

	@OriginalMember(owner = "client!rj", name = "bv", descriptor = "()I")
	final int method11439() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass104_Sub2_Sub2_8.method20977();
		@Pc(17) int local17 = this.aClass104_Sub2_Sub2_8.anIntArray253[local11];
		if (local17 != this.anInt1373) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1373);
			this.aClass104_Sub2_Sub2_8.anIntArray253[local11] = this.anInt1373;
		}
		OpenGL.glBindTexture(this.anInt1373, this.anInt1369);
	}

	@OriginalMember(owner = "client!rj", name = "bd", descriptor = "(I)V")
	final void method11440(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_Sub2_8.anInt2916 -= arg0;
		this.aClass104_Sub2_Sub2_8.anInt2916 += this.method11427();
	}

	@OriginalMember(owner = "client!rj", name = "bu", descriptor = "(I)V")
	final void method11441(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_Sub2_8.anInt2916 -= arg0;
		this.aClass104_Sub2_Sub2_8.anInt2916 += this.method11427();
	}

	@OriginalMember(owner = "client!rj", name = "bz", descriptor = "()I")
	final int method11442() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "bm", descriptor = "(III[I)V")
	final void method11443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1369 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class364.method28081(arg1, -2052090667)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class364.method28081(arg2, -1277430326)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass206_15 == Class206.aClass206_22) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class104_Sub2_Sub2.method21321(this.aClass206_15, this.aClass226_16), arg1, arg2, 0, 32993, this.aClass104_Sub2_Sub2_8.anInt2963, local57, 0);
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

	@OriginalMember(owner = "client!rj", name = "br", descriptor = "()I")
	final int method11444() {
		@Pc(14) int local14 = this.aClass206_15.anInt3389 * -1639868421 * this.aClass226_16.anInt3687 * -1066472467 * this.anInt1375;
		return this.aBoolean256 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!rj", name = "bg", descriptor = "()V")
	final void method11445() {
		if (this.anInt1369 != 0) {
			this.aClass104_Sub2_Sub2_8.method21317(this.anInt1369, this.method11427());
			this.anInt1369 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		if (this.aClass405_4 != arg0) {
			this.aClass405_4 = arg0;
			this.method11421();
		}
	}
}
