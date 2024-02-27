package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class442 {

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	static final int anInt5052 = 0;

	@OriginalMember(owner = "client!nm", name = "jb", descriptor = "J")
	static long aLong279;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public int anInt5053 = -1702354679;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public int anInt5049 = -1185510848;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public int anInt5050 = -1326832448;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public int anInt5051 = -1493536822;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	public int anInt5048 = 619966023;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
	public boolean aBoolean777 = false;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Z")
	public boolean aBoolean778 = false;

	@OriginalMember(owner = "client!nm", name = "awm", descriptor = "(Lclient!yf;I)V")
	static void method29043(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Date local16 = Class285.method26588(local12, -1467396847);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class285.method26586(local16, Class687.aTimeZone1, -728112901);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class285.method26581(local16, Class687.aTimeZone1, 257002590) - 1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class285.method26585(local16, Class687.aTimeZone1, -1648217113);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	Class442() {
	}

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "(Lclient!alw;IIB)V")
	void method29038(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg1 == 1) {
			this.anInt5053 = arg0.method22427(-1434290800) * 1702354679;
			if (this.anInt5053 * -153468217 == 65535) {
				this.anInt5053 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt5049 = (arg0.method22427(-1434290800) + 1) * 652565033;
			this.anInt5050 = (arg0.method22427(-1434290800) + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22426(829756967);
		} else if (arg1 == 4) {
			this.anInt5051 = arg0.method22425((short) 16384) * 1400715237;
		} else if (arg1 == 5) {
			this.anInt5048 = arg0.method22425((short) 16384) * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean777 = true;
		} else if (arg1 == 7) {
			this.aBoolean778 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(Lclient!alw;IB)V")
	void method29039(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method29038(arg0, local3, arg1, (byte) -30);
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(Lclient!alw;II)V")
	void method29040(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5053 = arg0.method22427(-1434290800) * 1702354679;
			if (this.anInt5053 * -153468217 == 65535) {
				this.anInt5053 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt5049 = (arg0.method22427(-1434290800) + 1) * 652565033;
			this.anInt5050 = (arg0.method22427(-1434290800) + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22426(727210476);
		} else if (arg1 == 4) {
			this.anInt5051 = arg0.method22425((short) 16384) * 1400715237;
		} else if (arg1 == 5) {
			this.anInt5048 = arg0.method22425((short) 16384) * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean777 = true;
		} else if (arg1 == 7) {
			this.aBoolean778 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "(Lclient!alw;II)V")
	void method29041(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5053 = arg0.method22427(-1434290800) * 1702354679;
			if (this.anInt5053 * -153468217 == 65535) {
				this.anInt5053 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt5049 = (arg0.method22427(-1434290800) + 1) * 652565033;
			this.anInt5050 = (arg0.method22427(-1434290800) + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22426(550350297);
		} else if (arg1 == 4) {
			this.anInt5051 = arg0.method22425((short) 16384) * 1400715237;
		} else if (arg1 == 5) {
			this.anInt5048 = arg0.method22425((short) 16384) * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean777 = true;
		} else if (arg1 == 7) {
			this.aBoolean778 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "(Lclient!alw;I)V")
	void method29042(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method29038(arg0, local3, arg1, (byte) 52);
		}
	}
}
