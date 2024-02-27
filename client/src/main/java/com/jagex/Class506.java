package com.jagex;

import java.io.IOException;
import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
final class Class506 implements Comparator {

	@OriginalMember(owner = "client!qi", name = "in", descriptor = "Lclient!em;")
	public static Interface21 anInterface21_4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qi", name = "this$0", descriptor = "Lclient!qy;")
	final Class521 aClass521_2;

	@OriginalMember(owner = "client!qi", name = "afy", descriptor = "(Lclient!yf;I)V")
	static void method30400(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ~local12;
	}

	@OriginalMember(owner = "client!qi", name = "ale", descriptor = "(Lclient!yf;S)V")
	static void method30401(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class255.method26101(1741045804);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Lclient!dh;IILclient!hf;I)V")
	static void method30402(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) int arg4) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class660.method33006(false, true, 1902068381);
			@Pc(31) int local31 = Class685.anIntArray524[local23];
			Class46.method896(false, true, 1654921337);
			arg0.method20665(arg1, ((63 - local5) * -1490598249 * arg3.anInt4023 >> 6) + arg2, arg3.anInt4022 * 1215292027, (arg3.anInt4023 * -1490598249 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "ai", descriptor = "([BB)[B")
	static byte[] method30403(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(9) Class477 local9 = new Class477(local4);
		@Pc(13) Class484 local13 = local9.method29871((byte) -127);
		@Pc(17) int local17 = local9.method29872(-936234138);
		if (local17 < 0 || Class497.anInt5336 * -1140330639 != 0 && local17 > Class497.anInt5336 * -1140330639) {
			throw new RuntimeException();
		} else if (Class484.aClass484_5 == local13) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method22442(local38, 0, local17, (short) 3634);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29882((byte) 0);
			if (local50 < 0 || Class497.anInt5336 * -1140330639 != 0 && local50 > Class497.anInt5336 * -1140330639) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (Class484.aClass484_2 == local13) {
				local72 = new byte[local50];
				Class6.method81(local72, local50, arg0, local17, 9);
			} else if (local13 == Class484.aClass484_4) {
				local72 = new byte[local50];
				@Pc(89) Class91 local89 = Class497.aClass91_1;
				synchronized (Class497.aClass91_1) {
					Class497.aClass91_1.method1703(local4, local72, (short) 1043);
				}
			} else if (local13 == Class484.aClass484_3) {
				try {
					local72 = Class587.method31828(local4, local50, 48301838);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!qy;)V")
	Class506(@OriginalArg(0) Class521 arg0) {
		this.aClass521_2 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30392((Class503) arg0, (Class503) arg1, (byte) 50);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Lclient!qd;Lclient!qd;B)I")
	int method30392(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aLong287 * -2148301208355003327L > arg1.aLong287 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong287 * -2148301208355003327L < arg1.aLong287 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method30393(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30392((Class503) arg0, (Class503) arg1, (byte) 50);
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "(Lclient!qd;Lclient!qd;)I")
	int method30394(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1) {
		if (arg0.aLong287 * -2148301208355003327L > arg1.aLong287 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong287 * -2148301208355003327L < arg1.aLong287 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30395(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30396(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30397(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30398(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(Lclient!qd;Lclient!qd;)I")
	int method30399(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1) {
		if (arg0.aLong287 * -2148301208355003327L > arg1.aLong287 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong287 * -2148301208355003327L < arg1.aLong287 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}
}
