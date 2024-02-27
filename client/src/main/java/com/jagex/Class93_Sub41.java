package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alw")
public class Class93_Sub41 extends Class93 {

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "J")
	static final long aLong185 = -3932672073523589310L;

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "I")
	public static final int anInt3069 = 5000;

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "I")
	public static final int anInt3071 = 100;

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "I")
	static final int anInt3072 = -306674912;

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "[I")
	static int[] anIntArray262 = new int[256];

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "I")
	public int anInt3070;

	static {
		@Pc(11) int local11;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(9) int local9 = local4;
			for (local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray262[local4] = local9;
		}
		aLongArray18 = new long[256];
		for (local11 = 0; local11 < 256; local11++) {
			@Pc(49) long local49 = (long) local11;
			for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
				if ((local49 & 0x1L) == 1L) {
					local49 = local49 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local49 >>>= 0x1;
				}
			}
			aLongArray18[local11] = local49;
		}
	}

	@OriginalMember(owner = "client!alw", name = "cr", descriptor = "([BII)I")
	static int method22485(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!alw", name = "cb", descriptor = "([BI)I")
	public static int method22489(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1, (byte) 16);
	}

	@OriginalMember(owner = "client!alw", name = "dp", descriptor = "(Ljava/lang/String;)I")
	public static int method22514(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!alw", name = "dy", descriptor = "(Ljava/lang/String;)I")
	public static int method22595(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!alw", name = "cq", descriptor = "([BI)I")
	public static int method22611(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1, (byte) 16);
	}

	@OriginalMember(owner = "client!alw", name = "ch", descriptor = "([BI)I")
	public static int method22614(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1, (byte) 16);
	}

	@OriginalMember(owner = "client!alw", name = "cm", descriptor = "([BII)I")
	static int method22623(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!alw", name = "bfh", descriptor = "(Lclient!yf;I)V")
	static void method22671(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 957530791;
	}

	@OriginalMember(owner = "client!alw", name = "akf", descriptor = "(Lclient!yf;I)V")
	static void method22672(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class159.method14509(local12);
		if (local15 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15.anInt3166 * -332819059;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15.anInt3170 * 598304723;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15.anInt3167 * -1863527503;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15.anInt3169 * -1436122155;
		}
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(I)V")
	public Class93_Sub41(@OriginalArg(0) int arg0) {
		this.aByteArray58 = Class723.method37115(arg0, 1818285080);
		this.anInt3070 = 0;
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(IZ)V")
	public Class93_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aByteArray58 = Class723.method37116(arg0, arg1, 495930698);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "([B)V")
	public Class93_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
		this.anInt3070 = 0;
	}

	@OriginalMember(owner = "client!alw", name = "go", descriptor = "()I")
	public final int method22399() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 64 : this.method22427(-1434290800) - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "hm", descriptor = "([I)V")
	public final void method22400(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) 3);
			this.method22407(local22, (byte) 21);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bv", descriptor = "(I)B")
	public final byte method22401(@OriginalArg(0) int arg0) {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "ce", descriptor = "(I)I")
	public final int method22402(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "jz", descriptor = "([BII)V")
	public final void method22403(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "jf", descriptor = "()I")
	public final int method22404() {
		this.anInt3070 += -41913569;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "(II)V")
	public final void method22405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "(IB)V")
	public final void method22406(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "(IB)V")
	public final void method22407(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "(II)V")
	public final void method22408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "(J)V")
	public final void method22409(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "(J)V")
	public final void method22410(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "c", descriptor = "(J)V")
	public final void method22411(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "jq", descriptor = "()I")
	public final int method22412() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "v", descriptor = "(ZI)V")
	public final void method22413(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method22522(arg0 ? 1 : 0, (byte) -24);
	}

	@OriginalMember(owner = "client!alw", name = "x", descriptor = "(Ljava/lang/String;I)V")
	public final void method22414(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -1245289712) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method22415(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -950731040) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "g", descriptor = "(Ljava/lang/CharSequence;I)V")
	public final void method22416(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class587.method31824(arg0, -74374927);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.method22424(local3, 534011993);
		this.anInt3070 += Class54_Sub1.method14885(this.aByteArray58, this.anInt3070 * 212851357, arg0, (byte) 8) * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "i", descriptor = "([BIII)V")
	public final void method22417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "fp", descriptor = "(I)J")
	public final long method22418(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "(II)V")
	public final void method22419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "am", descriptor = "(I)I")
	public final int method22420(@OriginalArg(0) int arg0) {
		this.anInt3070 += -41913569;
		@Pc(45) int local45 = (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!alw", name = "cd", descriptor = "(I)V")
	public final void method22421(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "dk", descriptor = "(J)V")
	public final void method22422(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "al", descriptor = "(II)V")
	public final void method22423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22466(32767, 2134029885);
		} else if (arg0 < 32767) {
			this.method22466(arg0, 2138745190);
		} else {
			this.method22407(arg0, (byte) -53);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ac", descriptor = "(II)V")
	final void method22424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22522(arg0 >>> 28 | 0x80, (byte) -26);
					}
					this.method22522(arg0 >>> 21 | 0x80, (byte) -76);
				}
				this.method22522(arg0 >>> 14 | 0x80, (byte) -11);
			}
			this.method22522(arg0 >>> 7 | 0x80, (byte) -69);
		}
		this.method22522(arg0 & 0x7F, (byte) -74);
	}

	@OriginalMember(owner = "client!alw", name = "ai", descriptor = "(S)I")
	public final int method22425(@OriginalArg(0) short arg0) {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "aw", descriptor = "(I)B")
	public final byte method22426(@OriginalArg(0) int arg0) {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "as", descriptor = "(I)I")
	public final int method22427(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "bt", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method22428(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22442(local10, 0, local4, (short) 18161);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22466(local29.length, 2129263681);
		this.method22417(local29, 0, local29.length, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "ad", descriptor = "(S)I")
	public final int method22429(@OriginalArg(0) short arg0) {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "fm", descriptor = "()I")
	public final int method22430() {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "au", descriptor = "(I)I")
	public final int method22431(@OriginalArg(0) int arg0) {
		this.anInt3070 += -1487540524;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ar", descriptor = "(B)I")
	public final int method22432(@OriginalArg(0) byte arg0) {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "dw", descriptor = "(JI)V")
	public final void method22433(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "aq", descriptor = "(I)J")
	public final long method22434(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.method22427(-1434290800) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ax", descriptor = "(I)J")
	public final long method22435(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "av", descriptor = "(II)J")
	public final long method22436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "ao", descriptor = "(I)F")
	public final float method22437(@OriginalArg(0) int arg0) {
		return Float.intBitsToFloat(this.method22431(-118643075));
	}

	@OriginalMember(owner = "client!alw", name = "aj", descriptor = "(B)Ljava/lang/String;")
	public final String method22438(@OriginalArg(0) byte arg0) {
		if (this.aByteArray58[this.anInt3070 * 212851357] == 0) {
			this.anInt3070 += -1445626955;
			return null;
		} else {
			return this.method22439(985856348);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ay", descriptor = "(I)Ljava/lang/String;")
	public final String method22439(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15320(this.aByteArray58, local4, local29, (byte) -32);
	}

	@OriginalMember(owner = "client!alw", name = "ab", descriptor = "(I)Ljava/lang/String;")
	public final String method22440(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15320(this.aByteArray58, local26, local51, (byte) -47);
	}

	@OriginalMember(owner = "client!alw", name = "az", descriptor = "(I)Ljava/lang/String;")
	public final String method22441(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22449(1110966645);
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32935(this.aByteArray58, this.anInt3070 * 212851357, local26, (byte) 27);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "aa", descriptor = "([BIIS)V")
	public final void method22442(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "af", descriptor = "(I)I")
	public final int method22443(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 64 : this.method22427(-1434290800) - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "gv", descriptor = "()I")
	public final int method22444() {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22431(-118643075) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22427(-1434290800);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "an", descriptor = "(B)I")
	public final int method22445(@OriginalArg(0) byte arg0) {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 1 : this.method22427(-1434290800) - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "fq", descriptor = "(I)J")
	public final long method22446(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "bl", descriptor = "(I)I")
	public final int method22447(@OriginalArg(0) int arg0) {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22431(-118643075) & Integer.MAX_VALUE : this.method22427(-1434290800);
	}

	@OriginalMember(owner = "client!alw", name = "bk", descriptor = "(I)I")
	public final int method22448(@OriginalArg(0) int arg0) {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22431(-118643075) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22427(-1434290800);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "bh", descriptor = "(I)I")
	final int method22449(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!alw", name = "hu", descriptor = "([III)V")
	public final void method22450(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22431(-118643075);
			@Pc(28) int local28 = this.method22431(-118643075);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local24, (byte) -23);
			this.method22407(local28, (byte) -52);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "ib", descriptor = "()I")
	public final int method22451() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "bc", descriptor = "([II)V")
	public final void method22452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) 14);
			this.method22407(local22, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bi", descriptor = "([IIIB)V")
	public final void method22453(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22431(-118643075);
			@Pc(28) int local28 = this.method22431(-118643075);
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local30 + arg0[local30 >>> 11 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local24, (byte) -31);
			this.method22407(local28, (byte) -53);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bn", descriptor = "([IIII)V")
	public final void method22454(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22431(-118643075);
			@Pc(28) int local28 = this.method22431(-118643075);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local24, (byte) -33);
			this.method22407(local28, (byte) -14);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bs", descriptor = "(I)I")
	public final int method22455(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ci", descriptor = "(IB)V")
	public final void method22456(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "hz", descriptor = "()B")
	public final byte method22457() {
		return (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
	}

	@OriginalMember(owner = "client!alw", name = "bb", descriptor = "(II)V")
	public final void method22458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "be", descriptor = "(II)V")
	public final void method22459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!alw", name = "by", descriptor = "(IB)V")
	public final void method22460(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "bu", descriptor = "(I)I")
	public final int method22461(@OriginalArg(0) int arg0) {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ea", descriptor = "()B")
	public final byte method22462() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "bz", descriptor = "(B)B")
	public final byte method22463(@OriginalArg(0) byte arg0) {
		return (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
	}

	@OriginalMember(owner = "client!alw", name = "cs", descriptor = "(I)V")
	public final void method22464(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "jt", descriptor = "()I")
	public final int method22465() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "(II)V")
	public final void method22466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "fn", descriptor = "()J")
	public final long method22467() {
		@Pc(6) long local6 = (long) this.method22425((short) 16384) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "bp", descriptor = "(IS)V")
	public final void method22468(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "bj", descriptor = "(I)I")
	public final int method22469(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ba", descriptor = "(II)V")
	public final void method22470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "cl", descriptor = "(I)I")
	public final int method22471(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cg", descriptor = "(I)I")
	public final int method22472(@OriginalArg(0) int arg0) {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "fj", descriptor = "()I")
	public final int method22473() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "gt", descriptor = "()I")
	public final int method22474() {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22431(-118643075) & Integer.MAX_VALUE : this.method22427(-1434290800);
	}

	@OriginalMember(owner = "client!alw", name = "hh", descriptor = "()Z")
	public final boolean method22475() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357, (byte) 16);
		@Pc(19) int local19 = this.method22431(-118643075);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "bf", descriptor = "(I)I")
	public final int method22476(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22644((byte) -66); local5 == 32767; local5 = this.method22644((byte) -120)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "cv", descriptor = "(II)V")
	public final void method22477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "cp", descriptor = "(II)V")
	public final void method22478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "ca", descriptor = "(IB)V")
	public final void method22479(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "cx", descriptor = "(I)I")
	public final int method22480(@OriginalArg(0) int arg0) {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "fg", descriptor = "()I")
	public final int method22481() {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "iu", descriptor = "()I")
	public final int method22482() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cf", descriptor = "([BIIB)V")
	public final void method22483(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "ee", descriptor = "(I)V")
	public final void method22484(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ii", descriptor = "()I")
	public final int method22486() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "bd", descriptor = "([II)V")
	public final void method22487(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) -24);
			this.method22407(local22, (byte) 31);
		}
	}

	@OriginalMember(owner = "client!alw", name = "cn", descriptor = "(S)I")
	public final int method22488(@OriginalArg(0) short arg0) {
		this.anInt3070 += -41913569;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!alw", name = "in", descriptor = "()I")
	public final int method22490() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "cy", descriptor = "(I)V")
	public final void method22491(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "cc", descriptor = "(I)V")
	public final void method22492(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "cz", descriptor = "(I)V")
	public final void method22493(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "at", descriptor = "(B)I")
	public final int method22494(@OriginalArg(0) byte arg0) {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "cj", descriptor = "(I)V")
	public final void method22495(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "hc", descriptor = "()I")
	public final int method22496() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "dd", descriptor = "(I)V")
	public final void method22497(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dr", descriptor = "(I)V")
	public final void method22498(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "he", descriptor = "(I)V")
	public final void method22499(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "dt", descriptor = "(I)V")
	public final void method22500(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "do", descriptor = "(I)V")
	public final void method22501(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "dz", descriptor = "(I)V")
	public final void method22502(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "dv", descriptor = "(I)V")
	public final void method22503(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "dh", descriptor = "(Ljava/lang/String;)V")
	public final void method22504(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -1347752484) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "hx", descriptor = "(I)I")
	public final int method22505(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357, (byte) 16);
		this.method22407(local9, (byte) 105);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "dc", descriptor = "(J)V")
	public final void method22506(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "di", descriptor = "(J)V")
	public final void method22507(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ck", descriptor = "(I)V")
	public final void method22508(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "bw", descriptor = "(I)I")
	public final int method22509(@OriginalArg(0) int arg0) {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "df", descriptor = "(JI)V")
	public final void method22510(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bo", descriptor = "(I)I")
	public final int method22511(@OriginalArg(0) int arg0) {
		return 128 - this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ds", descriptor = "(JI)V")
	public final void method22512(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "dl", descriptor = "(Z)V")
	public final void method22513(@OriginalArg(0) boolean arg0) {
		this.method22522(arg0 ? 1 : 0, (byte) -117);
	}

	@OriginalMember(owner = "client!alw", name = "br", descriptor = "(I)B")
	public final byte method22515(@OriginalArg(0) int arg0) {
		return (byte) (128 - this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1]);
	}

	@OriginalMember(owner = "client!alw", name = "db", descriptor = "(Ljava/lang/String;)V")
	public final void method22516(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -1111686651) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "hn", descriptor = "(I)V")
	public final void method22517(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!alw", name = "bq", descriptor = "(II)I")
	public final int method22518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357, (byte) 16);
		this.method22407(local9, (byte) -33);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "dg", descriptor = "(Ljava/lang/String;)V")
	public final void method22519(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -1177063576) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "cw", descriptor = "(I)I")
	public final int method22520(@OriginalArg(0) int arg0) {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "dj", descriptor = "([BII)V")
	public final void method22521(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "(IB)V")
	public final void method22522(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ey", descriptor = "([BII)V")
	public final void method22523(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "eu", descriptor = "(Lclient!alw;)V")
	public final void method22524(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method22417(arg0.aByteArray58, 0, arg0.anInt3070 * 212851357, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "ed", descriptor = "(I)V")
	public final void method22525(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "gw", descriptor = "()I")
	public final int method22526() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22425((short) 16384);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "es", descriptor = "(I)V")
	public final void method22527(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ei", descriptor = "(I)V")
	public final void method22528(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "el", descriptor = "(I)V")
	public final void method22529(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ej", descriptor = "(I)V")
	public final void method22530(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22522(arg0 + 64, (byte) -55);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22466(arg0 + 49152, 2133904630);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ep", descriptor = "(I)V")
	public final void method22531(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22522(arg0, (byte) -127);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22466(arg0 + 32768, 2132466219);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ev", descriptor = "(I)V")
	public final void method22532(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22522(arg0, (byte) -100);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22466(arg0 + 32768, 2126287037);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ec", descriptor = "(I)V")
	public final void method22533(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22466(32767, 2144617404);
		} else if (arg0 < 32767) {
			this.method22466(arg0, 2133706291);
		} else {
			this.method22407(arg0, (byte) -45);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ek", descriptor = "(I)V")
	public final void method22534(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22466(32767, 2133712815);
		} else if (arg0 < 32767) {
			this.method22466(arg0, 2124853497);
		} else {
			this.method22407(arg0, (byte) 85);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "em", descriptor = "(I)V")
	public final void method22535(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22466(32767, 2141635239);
		} else if (arg0 < 32767) {
			this.method22466(arg0, 2142417570);
		} else {
			this.method22407(arg0, (byte) -76);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "eh", descriptor = "(I)V")
	final void method22536(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22522(arg0 >>> 28 | 0x80, (byte) -65);
					}
					this.method22522(arg0 >>> 21 | 0x80, (byte) -18);
				}
				this.method22522(arg0 >>> 14 | 0x80, (byte) -95);
			}
			this.method22522(arg0 >>> 7 | 0x80, (byte) -21);
		}
		this.method22522(arg0 & 0x7F, (byte) -128);
	}

	@OriginalMember(owner = "client!alw", name = "eq", descriptor = "(I)V")
	final void method22537(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22522(arg0 >>> 28 | 0x80, (byte) -70);
					}
					this.method22522(arg0 >>> 21 | 0x80, (byte) -31);
				}
				this.method22522(arg0 >>> 14 | 0x80, (byte) -65);
			}
			this.method22522(arg0 >>> 7 | 0x80, (byte) -84);
		}
		this.method22522(arg0 & 0x7F, (byte) -86);
	}

	@OriginalMember(owner = "client!alw", name = "eg", descriptor = "(I)V")
	final void method22538(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22522(arg0 >>> 28 | 0x80, (byte) -10);
					}
					this.method22522(arg0 >>> 21 | 0x80, (byte) -11);
				}
				this.method22522(arg0 >>> 14 | 0x80, (byte) -108);
			}
			this.method22522(arg0 >>> 7 | 0x80, (byte) -60);
		}
		this.method22522(arg0 & 0x7F, (byte) -82);
	}

	@OriginalMember(owner = "client!alw", name = "ez", descriptor = "()I")
	public final int method22539() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ef", descriptor = "()I")
	public final int method22540() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "gh", descriptor = "()I")
	public final int method22541() {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22431(-118643075) & Integer.MAX_VALUE : this.method22427(-1434290800);
	}

	@OriginalMember(owner = "client!alw", name = "fa", descriptor = "()J")
	public final long method22542() {
		@Pc(6) long local6 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "co", descriptor = "([BIII)V")
	public final void method22543(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!alw", name = "er", descriptor = "()I")
	public final int method22544() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "en", descriptor = "()I")
	public final int method22545() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "eb", descriptor = "()I")
	public final int method22546() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ex", descriptor = "()I")
	public final int method22547() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "hf", descriptor = "(I)I")
	public final int method22548(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357, (byte) 16);
		this.method22407(local9, (byte) -6);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "ae", descriptor = "(IB)V")
	public final void method22549(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ct", descriptor = "(I)I")
	public final int method22550(@OriginalArg(0) int arg0) {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "fs", descriptor = "()I")
	public final int method22551() {
		this.anInt3070 += -1487540524;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "fz", descriptor = "()I")
	public final int method22552() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ih", descriptor = "()I")
	public final int method22553() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "fd", descriptor = "()I")
	public final int method22554() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "gg", descriptor = "()I")
	public final int method22555() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22644((byte) -15); local5 == 32767; local5 = this.method22644((byte) -58)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "fi", descriptor = "()J")
	public final long method22556() {
		@Pc(6) long local6 = (long) this.method22425((short) 16384) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ft", descriptor = "()J")
	public final long method22557() {
		@Pc(6) long local6 = (long) this.method22425((short) 16384) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fx", descriptor = "()J")
	public final long method22558() {
		@Pc(6) long local6 = (long) this.method22427(-1434290800) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "gp", descriptor = "()I")
	public final int method22559() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 64 : this.method22427(-1434290800) - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "fc", descriptor = "()J")
	public final long method22560() {
		@Pc(6) long local6 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "r", descriptor = "(JII)V")
	public final void method22561(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "de", descriptor = "(Ljava/lang/CharSequence;)V")
	public final void method22562(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class587.method31824(arg0, -74374927);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.method22424(local3, 207899987);
		this.anInt3070 += Class54_Sub1.method14885(this.aByteArray58, this.anInt3070 * 212851357, arg0, (byte) -40) * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "hg", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method22563(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22442(local10, 0, local4, (short) 13668);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22466(local29.length, 2139327467);
		this.method22417(local29, 0, local29.length, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "eo", descriptor = "([BII)V")
	public final void method22564(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "ff", descriptor = "(I)J")
	public final long method22565(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "fl", descriptor = "()F")
	public final float method22566() {
		return Float.intBitsToFloat(this.method22431(-118643075));
	}

	@OriginalMember(owner = "client!alw", name = "fb", descriptor = "()F")
	public final float method22567() {
		return Float.intBitsToFloat(this.method22431(-118643075));
	}

	@OriginalMember(owner = "client!alw", name = "fo", descriptor = "()Ljava/lang/String;")
	public final String method22568() {
		if (this.aByteArray58[this.anInt3070 * 212851357] == 0) {
			this.anInt3070 += -1445626955;
			return null;
		} else {
			return this.method22439(1958183285);
		}
	}

	@OriginalMember(owner = "client!alw", name = "fy", descriptor = "()Ljava/lang/String;")
	public final String method22569() {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15320(this.aByteArray58, local4, local29, (byte) -12);
	}

	@OriginalMember(owner = "client!alw", name = "fe", descriptor = "()Ljava/lang/String;")
	public final String method22570() {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15320(this.aByteArray58, local4, local29, (byte) -81);
	}

	@OriginalMember(owner = "client!alw", name = "fk", descriptor = "()Ljava/lang/String;")
	public final String method22571() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15320(this.aByteArray58, local26, local51, (byte) -16);
	}

	@OriginalMember(owner = "client!alw", name = "fh", descriptor = "()Ljava/lang/String;")
	public final String method22572() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15320(this.aByteArray58, local26, local51, (byte) 16);
	}

	@OriginalMember(owner = "client!alw", name = "fr", descriptor = "()Ljava/lang/String;")
	public final String method22573() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22449(118016209);
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32935(this.aByteArray58, this.anInt3070 * 212851357, local26, (byte) 114);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "gu", descriptor = "()Ljava/lang/String;")
	public final String method22574() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22449(-1663109557);
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32935(this.aByteArray58, this.anInt3070 * 212851357, local26, (byte) 43);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "gq", descriptor = "([BII)V")
	public final void method22575(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "jn", descriptor = "(I)V")
	public final void method22576(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "hj", descriptor = "()I")
	public final int method22577() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "gk", descriptor = "()I")
	public final int method22578() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 64 : this.method22427(-1434290800) - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "ir", descriptor = "()I")
	public final int method22579() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "gy", descriptor = "()I")
	public final int method22580() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) : this.method22427(-1434290800) - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "ga", descriptor = "()I")
	public final int method22581() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) : this.method22427(-1434290800) - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "gn", descriptor = "()I")
	public final int method22582() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) : this.method22427(-1434290800) - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "gc", descriptor = "()I")
	public final int method22583() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 1 : this.method22427(-1434290800) - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "gf", descriptor = "()I")
	public final int method22584() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 1 : this.method22427(-1434290800) - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "gx", descriptor = "()I")
	public final int method22585() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) - 1 : this.method22427(-1434290800) - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "du", descriptor = "(Z)V")
	public final void method22586(@OriginalArg(0) boolean arg0) {
		this.method22522(arg0 ? 1 : 0, (byte) -18);
	}

	@OriginalMember(owner = "client!alw", name = "gb", descriptor = "([I)V")
	public final void method22587(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) -62);
			this.method22407(local22, (byte) -8);
		}
	}

	@OriginalMember(owner = "client!alw", name = "gr", descriptor = "()I")
	public final int method22588() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22644((byte) -51); local5 == 32767; local5 = this.method22644((byte) -68)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "gs", descriptor = "()I")
	public final int method22589() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22644((byte) -91); local5 == 32767; local5 = this.method22644((byte) -91)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "gl", descriptor = "([BII)V")
	public final void method22590(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "id", descriptor = "()I")
	public final int method22591() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "gm", descriptor = "()I")
	public final int method22592() {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22431(-118643075) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22427(-1434290800);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "dq", descriptor = "(J)V")
	public final void method22593(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "gj", descriptor = "()I")
	final int method22594() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!alw", name = "gd", descriptor = "()I")
	public final int method22596() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22425((short) 16384);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "gz", descriptor = "([I)V")
	public final void method22597(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) -13);
			this.method22407(local22, (byte) -75);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ew", descriptor = "()B")
	public final byte method22598() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "gi", descriptor = "([I)V")
	public final void method22599(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22431(-118643075);
			@Pc(22) int local22 = this.method22431(-118643075);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local18, (byte) 17);
			this.method22407(local22, (byte) -18);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ha", descriptor = "([III)V")
	public final void method22600(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22431(-118643075);
			@Pc(28) int local28 = this.method22431(-118643075);
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local30 + arg0[local30 >>> 11 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local24, (byte) -37);
			this.method22407(local28, (byte) 76);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "hk", descriptor = "([III)V")
	public final void method22601(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22431(-118643075);
			@Pc(28) int local28 = this.method22431(-118643075);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22407(local24, (byte) 20);
			this.method22407(local28, (byte) 42);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bg", descriptor = "(IB)V")
	public final void method22602(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "dn", descriptor = "(J)V")
	public final void method22603(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dx", descriptor = "(Ljava/lang/String;)V")
	public final void method22604(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method29064(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357, -1341752963) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "hd", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method22605(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22442(local10, 0, local4, (short) 8798);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22466(local29.length, 2133152219);
		this.method22417(local29, 0, local29.length, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "iy", descriptor = "()I")
	public final int method22606() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "hq", descriptor = "(I)I")
	public final int method22607(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357, (byte) 16);
		this.method22407(local9, (byte) 82);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "bx", descriptor = "(S)I")
	public final int method22608(@OriginalArg(0) short arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22425((short) 16384);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "hr", descriptor = "(I)I")
	public final int method22609(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357, (byte) 16);
		this.method22407(local9, (byte) -109);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "hs", descriptor = "()Z")
	public final boolean method22610() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357, (byte) 16);
		@Pc(19) int local19 = this.method22431(-118643075);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "hp", descriptor = "()Z")
	public final boolean method22612() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357, (byte) 16);
		@Pc(19) int local19 = this.method22431(-118643075);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "fv", descriptor = "()J")
	public final long method22613() {
		@Pc(6) long local6 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "da", descriptor = "(I)V")
	public final void method22615(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "hi", descriptor = "(I)V")
	public final void method22616(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "hw", descriptor = "(I)V")
	public final void method22617(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "ht", descriptor = "(I)V")
	public final void method22618(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "fu", descriptor = "()I")
	public final int method22619() {
		this.anInt3070 += -41913569;
		@Pc(45) int local45 = (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!alw", name = "ho", descriptor = "()I")
	public final int method22620() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ap", descriptor = "(I)J")
	public final long method22621(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.method22425((short) 16384) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fw", descriptor = "()J")
	public final long method22622() {
		@Pc(6) long local6 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22431(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ij", descriptor = "()B")
	public final byte method22624() {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "io", descriptor = "()B")
	public final byte method22625() {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "iq", descriptor = "(I)V")
	public final void method22626(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ig", descriptor = "(I)V")
	public final void method22627(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "iv", descriptor = "(I)V")
	public final void method22628(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ie", descriptor = "(I)V")
	public final void method22629(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "hv", descriptor = "()I")
	public final int method22630() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "dm", descriptor = "(J)V")
	public final void method22631(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "j", descriptor = "(Lclient!alw;B)V")
	public final void method22632(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.method22417(arg0.aByteArray58, 0, arg0.anInt3070 * 212851357, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "it", descriptor = "()I")
	public final int method22633() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ix", descriptor = "()I")
	public final int method22634() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "is", descriptor = "()I")
	public final int method22635() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "jb", descriptor = "(I)V")
	public final void method22636(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "il", descriptor = "()I")
	public final int method22637() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "et", descriptor = "()B")
	public final byte method22638() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "ip", descriptor = "()I")
	public final int method22639() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ge", descriptor = "()I")
	public final int method22640() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22644((byte) -105); local5 == 32767; local5 = this.method22644((byte) -82)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "ia", descriptor = "()I")
	public final int method22641() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "if", descriptor = "()I")
	public final int method22642() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "cu", descriptor = "(II)V")
	public final void method22643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ak", descriptor = "(B)I")
	public final int method22644(@OriginalArg(0) byte arg0) {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22425((short) 16384) : this.method22427(-1434290800) - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "iw", descriptor = "()I")
	public final int method22645() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "iz", descriptor = "()I")
	public final int method22646() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "ik", descriptor = "(I)V")
	public final void method22647(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "hy", descriptor = "(I)V")
	public final void method22648(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "ic", descriptor = "(I)V")
	public final void method22649(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "jd", descriptor = "(I)V")
	public final void method22650(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ah", descriptor = "(IB)V")
	public final void method22651(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22522(arg0, (byte) -8);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22466(arg0 + 32768, 2130864696);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ju", descriptor = "(I)V")
	public final void method22652(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "jy", descriptor = "(I)V")
	public final void method22653(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jl", descriptor = "(I)V")
	public final void method22654(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "hb", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method22655(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22442(local10, 0, local4, (short) 22223);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22466(local29.length, 2137448457);
		this.method22417(local29, 0, local29.length, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "je", descriptor = "(I)V")
	public final void method22656(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "im", descriptor = "(I)V")
	public final void method22657(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "jm", descriptor = "(I)V")
	public final void method22658(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jw", descriptor = "(I)V")
	public final void method22659(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "jr", descriptor = "()I")
	public final int method22660() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "js", descriptor = "()I")
	public final int method22661() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ji", descriptor = "()I")
	public final int method22662() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "m", descriptor = "(B)V")
	public final void method22663(@OriginalArg(0) byte arg0) {
		if (this.aByteArray58 != null) {
			Class723.method37119(this.aByteArray58, (byte) 19);
		}
		this.aByteArray58 = null;
	}

	@OriginalMember(owner = "client!alw", name = "ag", descriptor = "(II)V")
	public final void method22664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22522(arg0 + 64, (byte) 0);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22466(arg0 + 49152, 2125389251);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "jv", descriptor = "()I")
	public final int method22665() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ja", descriptor = "()I")
	public final int method22666() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jj", descriptor = "()I")
	public final int method22667() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jo", descriptor = "()I")
	public final int method22668() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "bm", descriptor = "(I)Z")
	public final boolean method22669(@OriginalArg(0) int arg0) {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357, (byte) 16);
		@Pc(19) int local19 = this.method22431(-118643075);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "jc", descriptor = "([BII)V")
	public final void method22670(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}
}
