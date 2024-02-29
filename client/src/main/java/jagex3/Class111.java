package jagex3;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public abstract class Class111 implements Interface24 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "D")
	static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
	static final int[] anIntArray69 = new int[256];

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "([ID)V")
	static void method6786(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				anIntArray69[local5] = local18 > 255 ? 255 : local18;
			}
			aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = anIntArray69[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = anIntArray69[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = anIntArray69[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "([ID)V")
	static void method6793(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				anIntArray69[local5] = local18 > 255 ? 255 : local18;
			}
			aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = anIntArray69[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = anIntArray69[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = anIntArray69[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
	public static void method6796(@OriginalArg(0) int arg0) {
		if (-849002901 * client.anInt3435 == 4 && (!Class251.method26066(557768686) && !Class631.method32463(1145615378))) {
			Class481.method29937(12, 1823202236);
		}
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(ZI)V")
	public static void method6797(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (Class653.aClass357_1 == null) {
			Class393.method28498((byte) 31);
		}
		if (arg0) {
			Class653.aClass357_1.method27912(1903464892);
		}
	}

	@OriginalMember(owner = "client!dk", name = "ap", descriptor = "(ZZI)V")
	public static void method6798(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Class625.aBoolean854 = arg0;
		Class625.aBoolean856 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "ag", descriptor = "(Lclient!yf;I)V")
	static void method6799(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = Class608.method32143((byte) 4);
		if (local2 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class522.aTwitchEventLiveStreams1.anIntArray333[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray23[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray24[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray25[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray26[local2];
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!dk", name = "akr", descriptor = "(Lclient!yf;I)V")
	static void method6800(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class159.method14509(local12);
		if (local15 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15.anInt3165 * -2102669545;
		}
	}

	@OriginalMember(owner = "client!dk", name = "he", descriptor = "(II)I")
	static int method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(9) int local9 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local9 == 0) {
				return 1;
			}
			if (local9 == 1) {
				return 2;
			}
			if (local9 == 2) {
				return 4;
			}
			if (local9 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local9 == 0) {
				return 16;
			}
			if (local9 == 1) {
				return 32;
			}
			if (local9 == 2) {
				return 64;
			}
			if (local9 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	Class111() {
	}

	@OriginalMember(owner = "client!dk", name = "ag", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6763(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "(Lclient!vk;IILclient!vc;FIIZI)Z")
	public abstract boolean method6765(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6781(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method6782(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6782(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method6794(arg0, arg1, (byte) -35);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(16) byte local16 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_1) {
				if (local16 != 6) {
					return null;
				}
				@Pc(26) int[] local26 = null;
				@Pc(28) int local28 = 1;
				for (@Pc(30) int local30 = 0; local30 < 6; local30++) {
					@Pc(69) int local69 = (local5[local28] & 0xFF) << 24 | (local5[local28 + 1] & 0xFF) << 16 | (local5[local28 + 2] & 0xFF) << 8 | local5[local28 + 3] & 0xFF;
					@Pc(72) byte[] local72 = new byte[local69];
					System.arraycopy(local5, local28 + 4, local72, 0, local69);
					@Pc(86) int[] local86 = this.method6791(local72, false, -886934223);
					if (local30 == 0) {
						local26 = new int[local86.length * 6];
					}
					System.arraycopy(local86, 0, local26, local30 * local86.length, local86.length);
					local28 += local69 + 4;
				}
				if (arg2 != 1.0D) {
					Class125.method21471(local26, arg2);
				}
				return local26;
			} else if (local16 == 1) {
				@Pc(133) byte[] local133 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local133, 0, local5.length - 5);
				@Pc(148) int[] local148 = this.method6791(local133, false, -2082155486);
				if (local148 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class125.method21471(local148, arg2);
					}
					return local148;
				}
			} else {
				return null;
			}
		} catch (@Pc(162) IOException local162) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "(Lclient!vk;IID)[F")
	final float[] method6783(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (Class616.aClass616_2 != arg0) {
			return null;
		}
		@Pc(10) int[] local10 = this.method6782(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method6794(Class616.aClass616_3, arg2, (byte) -37);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method6791(local42, false, -403548696);
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

	@OriginalMember(owner = "client!dk", name = "ae", descriptor = "()V")
	@Override
	public final void method6777() {
	}

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "(B)V")
	@Override
	public final void method6778(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "(Lclient!vk;IFIIZB)[I")
	@Override
	public final int[] method6780(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		return this.method6782(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "(Lclient!vk;IIFIIZB)[F")
	@Override
	public final float[] method6766(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7) {
		return this.method6783(arg0, arg1, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!dk", name = "ah", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6775(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "(Lclient!vk;IFIIZI)[I")
	@Override
	public final int[] method6764(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	public abstract boolean method6769(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "()V")
	@Override
	public final void method6771() {
	}

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "(Lclient!vk;I)[B")
	abstract byte[] method6784(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "(Lclient!vk;I)[B")
	abstract byte[] method6785(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6787(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method6782(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6788(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method6782(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6789(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method6794(arg0, arg1, (byte) -68);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(16) byte local16 = (byte) (local5[0] & 0xFF);
			if (arg0 == Class616.aClass616_1) {
				if (local16 != 6) {
					return null;
				}
				@Pc(26) int[] local26 = null;
				@Pc(28) int local28 = 1;
				for (@Pc(30) int local30 = 0; local30 < 6; local30++) {
					@Pc(69) int local69 = (local5[local28] & 0xFF) << 24 | (local5[local28 + 1] & 0xFF) << 16 | (local5[local28 + 2] & 0xFF) << 8 | local5[local28 + 3] & 0xFF;
					@Pc(72) byte[] local72 = new byte[local69];
					System.arraycopy(local5, local28 + 4, local72, 0, local69);
					@Pc(86) int[] local86 = this.method6791(local72, false, -1181045736);
					if (local30 == 0) {
						local26 = new int[local86.length * 6];
					}
					System.arraycopy(local86, 0, local26, local30 * local86.length, local86.length);
					local28 += local69 + 4;
				}
				if (arg2 != 1.0D) {
					Class125.method21471(local26, arg2);
				}
				return local26;
			} else if (local16 == 1) {
				@Pc(133) byte[] local133 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local133, 0, local5.length - 5);
				@Pc(148) int[] local148 = this.method6791(local133, false, -559126242);
				if (local148 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class125.method21471(local148, arg2);
					}
					return local148;
				}
			} else {
				return null;
			}
		} catch (@Pc(162) IOException local162) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!vk;ID)[I")
	final int[] method6790(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method6782(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "([BZI)[I")
	final int[] method6791(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class46.method895(local5, -2081444826);
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

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "(Lclient!vk;IID)[F")
	final float[] method6792(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3) {
		if (Class616.aClass616_2 != arg0) {
			return null;
		}
		@Pc(10) int[] local10 = this.method6782(arg0, arg1, arg3);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method6794(Class616.aClass616_3, arg2, (byte) -26);
		@Pc(59) int local59;
		if (local22 != null) {
			try {
				@Pc(31) byte local31 = (byte) (local22[0] & 0xFF);
				if (local31 != 1) {
					return null;
				}
				@Pc(42) byte[] local42 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local42, 0, local22.length - 5);
				local16 = this.method6791(local42, false, -1506271954);
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

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	public abstract boolean method6768(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "()V")
	@Override
	public final void method6772() {
	}

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	public abstract boolean method6770(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "(Lclient!vk;IB)[B")
	abstract byte[] method6794(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!dk", name = "al", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6776(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "ac", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6767(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "ai", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6774(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6787(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "aw", descriptor = "(Lclient!vk;IFIIZ)[I")
	@Override
	public final int[] method6779(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return this.method6782(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dk", name = "as", descriptor = "(Lclient!vk;IIFIIZ)[F")
	@Override
	public final float[] method6773(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		return this.method6783(arg0, arg1, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!dk", name = "at", descriptor = "([BZ)[I")
	final int[] method6795(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class46.method895(local5, -1760641683);
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
