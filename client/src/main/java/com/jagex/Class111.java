package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public abstract class Class111 implements Interface23 {

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "D")
	static double aDouble3 = -1.0D;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "[I")
	static final int[] anIntArray93 = new int[256];

	@OriginalMember(owner = "client!dw", name = "at", descriptor = "(Ljava/awt/image/BufferedImage;)[I")
	public static int[] method7792(@OriginalArg(0) BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = (local19[local32] << 8) + -16777216 + (local19[local32] << 16) + local19[local32];
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = local19[local69] + (local19[local69 + 1] << 24) + (local19[local69] << 16) + (local19[local69] << 8);
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!dw", name = "ab", descriptor = "(Lclient!yp;I)V")
	static void method7793(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		if (arg0.anIntArray525[arg0.anInt5778 * 1896589581] >= arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!dw", name = "xo", descriptor = "(Lclient!yp;I)V")
	static void method7794(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class672.aClass134_1.method10447(local12, -1801088980);
	}

	@OriginalMember(owner = "client!dw", name = "pc", descriptor = "(Lclient!yp;I)V")
	static void method7795(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2113622444);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class114.method8626(local16, local22, arg0, 92842482);
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	Class111() {
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7768(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method7772(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local5.length; local11++) {
			if ((local5[local11] & 0xFFFFFF) == 0) {
				local5[local11] &= 0xFFFFFF;
			} else {
				local5[local11] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(Lclient!vl;II)[B")
	abstract byte[] method7769(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([BZI)[I")
	final int[] method7770(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class386.method28603(local5, (byte) 0);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7771(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method7772(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local5.length; local11++) {
			if ((local5[local11] & 0xFFFFFF) == 0) {
				local5[local11] &= 0xFFFFFF;
			} else {
				local5[local11] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7772(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, 1339263828);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, 1165585748);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, -1238379116);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7773(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, 948764603);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, -144359213);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(I)V")
	@Override
	public final void method7758(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "(Lclient!vl;IFIIZB)[I")
	@Override
	public final int[] method7755(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		return this.method7771(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "(Lclient!vl;IFIIZI)[I")
	@Override
	public final int[] method7756(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		return this.method7772(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7774(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, -1775489352);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, -1713349331);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, 988041769);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "ac", descriptor = "()V")
	@Override
	public final void method7761() {
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7775(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method7772(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local5.length; local11++) {
			if ((local5[local11] & 0xFFFFFF) == 0) {
				local5[local11] &= 0xFFFFFF;
			} else {
				local5[local11] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "(Lclient!vl;IIFIIZI)[F")
	@Override
	public final float[] method7757(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		return this.method7773(arg0, arg1, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "(Lclient!vl;I)[B")
	abstract byte[] method7776(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "(Lclient!vl;I)[B")
	abstract byte[] method7777(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "(Lclient!vl;I)[B")
	abstract byte[] method7778(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "(Lclient!vl;I)[B")
	abstract byte[] method7779(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dw", name = "ah", descriptor = "(Lclient!vl;IFIIZ)[I")
	@Override
	public final int[] method7766(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method7772(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7780(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method7772(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local5.length; local11++) {
			if ((local5[local11] & 0xFFFFFF) == 0) {
				local5[local11] &= 0xFFFFFF;
			} else {
				local5[local11] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(Lclient!vl;IILclient!vm;FIIZB)Z")
	public abstract boolean method7763(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class617 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8);

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7781(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, 268124832);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, 1343127225);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, -1805324423);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "al", descriptor = "(Lclient!vl;IFIIZ)[I")
	@Override
	public final int[] method7765(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method7772(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7782(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, 1390710554);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, 1248025816);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, 1722915551);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7783(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, 1935579193);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, -700072964);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, -85391632);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7784(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, 968777584);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, -1851531817);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "ax", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7785(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, -982292634);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, 1227904912);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "ay", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7786(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, 1647350327);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, -232177513);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "ai", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7787(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, -1949601478);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, 1963594358);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "(Lclient!vl;ID)[I")
	final int[] method7788(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method7769(arg0, arg1, -1390751458);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_3) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method7770(local73, false, -1458325646);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class528.method30715(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method7770(local134, false, 960344679);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class528.method30715(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(164) IOException local164) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "ao", descriptor = "()V")
	@Override
	public final void method7760() {
	}

	@OriginalMember(owner = "client!dw", name = "aj", descriptor = "()V")
	@Override
	public final void method7767() {
	}

	@OriginalMember(owner = "client!dw", name = "aq", descriptor = "(Lclient!vl;IID)[F")
	final float[] method7789(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (arg0 != Class616.aClass616_2) {
			return null;
		}
		@Pc(10) int[] local10 = this.method7772(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method7769(Class616.aClass616_1, arg2, -1167999382);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method7770(local42, false, -1677339155);
				for (local59 = 0; local59 < local16.length; local59++) {
					local16[local59] = local16[local59] >> 16 & 0xFF;
				}
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local59 = local10[local93];
			@Pc(105) int local105 = local59 >>> 24;
			@Pc(111) int local111 = local59 >> 16 & 0xFF;
			@Pc(117) int local117 = local59 >> 8 & 0xFF;
			@Pc(121) int local121 = local59 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = (float) local111 * local132 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = local132 * (float) local121 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dw", name = "ag", descriptor = "()V")
	@Override
	public final void method7754() {
	}

	@OriginalMember(owner = "client!dw", name = "ab", descriptor = "(Lclient!vl;IFIIZ)[I")
	@Override
	public final int[] method7764(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method7771(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "am", descriptor = "([BZ)[I")
	final int[] method7790(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class386.method28603(local5, (byte) 0);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dw", name = "af", descriptor = "(Lclient!vl;IIFIIZ)[F")
	@Override
	public final float[] method7759(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		return this.method7773(arg0, arg1, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "(Lclient!vl;IILclient!vm;FIIZ)Z")
	public abstract boolean method7762(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class617 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!dw", name = "ak", descriptor = "([BZ)[I")
	final int[] method7791(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class386.method28603(local5, (byte) 0);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}
}
