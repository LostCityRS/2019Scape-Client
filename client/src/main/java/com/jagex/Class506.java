package com.jagex;

import java.io.IOException;
import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
class Class506 implements Comparator {

	@OriginalMember(owner = "client!qi", name = "in", descriptor = "Lclient!em;")
	public static Interface21 anInterface21_4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qi", name = "this$0", descriptor = "Lclient!qy;")
	final Class521 this$0;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!qy;)V", line = 7)
	Class506(@OriginalArg(0) Class521 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Lclient!qd;Lclient!qd;B)I", line = 9)
	int method30211(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aLong284 * -2148301208355003327L > arg1.aLong284 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong284 * -2148301208355003327L < arg1.aLong284 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "(Lclient!qd;Lclient!qd;)I", line = 9)
	int method30212(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1) {
		if (arg0.aLong284 * -2148301208355003327L > arg1.aLong284 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong284 * -2148301208355003327L < arg1.aLong284 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(Lclient!qd;Lclient!qd;)I", line = 9)
	int method30213(@OriginalArg(0) Class503 arg0, @OriginalArg(1) Class503 arg1) {
		if (arg0.aLong284 * -2148301208355003327L > arg1.aLong284 * -2148301208355003327L) {
			return 1;
		} else if (arg0.aLong284 * -2148301208355003327L < arg1.aLong284 * -2148301208355003327L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30211((Class503) arg0, (Class503) arg1, (byte) 50);
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method30214(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30211((Class503) arg0, (Class503) arg1, (byte) 50);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Lclient!dh;IILclient!hf;I)V", line = 17)
	static void method30215(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) int arg4) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class660.method32818(false, true, 1902068381);
			@Pc(31) int local31 = Class685.anIntArray522[local23];
			Class46.method891(false, true, 1654921337);
			arg0.method20721(arg1, ((63 - local5) * -1490598249 * arg3.anInt3982 >> 6) + arg2, arg3.anInt3981 * 1215292027, (arg3.anInt3982 * -1490598249 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method30216(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method30217(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method30218(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method30219(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "ai", descriptor = "([BB)[B", line = 439)
	static final byte[] method30220(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Packet local4 = new Packet(arg0);
		@Pc(9) Class477 local9 = new Class477(local4);
		@Pc(13) Class484 local13 = local9.method29689((byte) -127);
		@Pc(17) int local17 = local9.method29692(-936234138);
		if (local17 < 0 || Class497.anInt5175 * -1140330639 != 0 && local17 > Class497.anInt5175 * -1140330639) {
			throw new RuntimeException();
		} else if (Class484.aClass484_5 == local13) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.gdata(local38, 0, local17, (short) 3634);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29701((byte) 0);
			if (local50 < 0 || Class497.anInt5175 * -1140330639 != 0 && local50 > Class497.anInt5175 * -1140330639) {
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
					Class497.aClass91_1.method1705(local4, local72, (short) 1043);
				}
			} else if (local13 == Class484.aClass484_3) {
				try {
					local72 = Class587.method31645(local4, local50, 48301838);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!qi", name = "afy", descriptor = "(Lclient!yf;I)V", line = 10468)
	static final void method30221(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ~local12;
	}

	@OriginalMember(owner = "client!qi", name = "ale", descriptor = "(Lclient!yf;S)V", line = 11889)
	static final void method30222(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class255.getWindowMode(1741045804);
	}
}
