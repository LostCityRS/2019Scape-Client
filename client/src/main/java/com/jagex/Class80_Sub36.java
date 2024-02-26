package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ald")
public class Class80_Sub36 extends Class80 {

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "I")
	public static final int anInt3151 = 5000;

	@OriginalMember(owner = "client!ald", name = "a", descriptor = "J")
	static final long aLong294 = -3932672073523589310L;

	@OriginalMember(owner = "client!ald", name = "o", descriptor = "I")
	static final int anInt3153 = -306674912;

	@OriginalMember(owner = "client!ald", name = "u", descriptor = "I")
	public static final int anInt3154 = 100;

	@OriginalMember(owner = "client!ald", name = "m", descriptor = "[I")
	static int[] anIntArray284 = new int[256];

	@OriginalMember(owner = "client!ald", name = "j", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!ald", name = "i", descriptor = "I")
	public int anInt3152;

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
			anIntArray284[local4] = local9;
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

	@OriginalMember(owner = "client!ald", name = "cm", descriptor = "([BII)I")
	static int method23235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray284[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!ald", name = "cp", descriptor = "([BII)I")
	static int method23236(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray284[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!ald", name = "dj", descriptor = "(Ljava/lang/String;)I")
	public static int method23266(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ald", name = "di", descriptor = "(Ljava/lang/String;)I")
	public static int method23360(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ald", name = "dz", descriptor = "(Ljava/lang/String;)I")
	public static int method23378(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ald", name = "al", descriptor = "(Lclient!yp;B)V")
	static void method23415(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.anIntArray527[arg0.anIntArray526[arg0.anInt5780 * -1336568839]];
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "([B)V")
	public Class80_Sub36(@OriginalArg(0) byte[] arg0) {
		this.aByteArray61 = arg0;
		this.anInt3152 = 0;
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(IZ)V")
	public Class80_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aByteArray61 = Class701.method37088(arg0, arg1, (byte) 7);
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(I)V")
	public Class80_Sub36(@OriginalArg(0) int arg0) {
		this.aByteArray61 = Class701.method37085(arg0, -211218219);
		this.anInt3152 = 0;
	}

	@OriginalMember(owner = "client!ald", name = "fw", descriptor = "()J")
	public final long method23151() {
		@Pc(6) long local6 = (long) this.method23182(899845523) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(-460165196) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "cq", descriptor = "(I)V")
	public final void method23152(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "fd", descriptor = "(I)J")
	public final long method23153(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ald", name = "u", descriptor = "(II)V")
	public final void method23154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "(IB)V")
	public final void method23155(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "dm", descriptor = "(JI)V")
	public final void method23156(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "i", descriptor = "(II)V")
	public final void method23157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "fl", descriptor = "()F")
	public final float method23158() {
		return Float.intBitsToFloat(this.method23182(-103986721));
	}

	@OriginalMember(owner = "client!ald", name = "ax", descriptor = "(Lclient!ald;I)V")
	public final void method23159(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		this.method23168(arg0.aByteArray61, 0, arg0.anInt3152 * -1380987821, (byte) 59);
	}

	@OriginalMember(owner = "client!ald", name = "ff", descriptor = "()Ljava/lang/String;")
	public final String method23160() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] == 0) {
			this.anInt3152 += 1034180571;
			return null;
		} else {
			return this.method23376((short) 22888);
		}
	}

	@OriginalMember(owner = "client!ald", name = "a", descriptor = "(J)V")
	public final void method23161(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "s", descriptor = "(J)V")
	public final void method23162(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 56);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 48);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "x", descriptor = "(JIB)V")
	public final void method23163(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "z", descriptor = "(ZB)V")
	public final void method23164(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.method23154(arg0 ? 1 : 0, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "v", descriptor = "(Ljava/lang/String;I)V")
	public final void method23165(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3152 += Class188.method24829(arg0, 0, arg0.length(), this.aByteArray61, this.anInt3152 * -1380987821, (byte) 69) * 1034180571;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "n", descriptor = "(Ljava/lang/String;I)V")
	public final void method23166(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.anInt3152 += Class188.method24829(arg0, 0, arg0.length(), this.aByteArray61, this.anInt3152 * -1380987821, (byte) 71) * 1034180571;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "c", descriptor = "(Ljava/lang/CharSequence;I)V")
	public final void method23167(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class445.method29239(arg0, -2002308536);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.method23388(local3, 2077945593);
		this.anInt3152 += Class384.method28594(this.aByteArray61, this.anInt3152 * -1380987821, arg0, -626130498) * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "b", descriptor = "([BIIB)V")
	public final void method23168(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "gg", descriptor = "()Ljava/lang/String;")
	public final String method23169() {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method23343(-1401788711);
		if (this.anInt3152 * -1380987821 + local26 > this.aByteArray61.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class614.method32265(this.aByteArray61, this.anInt3152 * -1380987821, local26, (byte) -30);
		this.anInt3152 += local26 * 1034180571;
		return local51;
	}

	@OriginalMember(owner = "client!ald", name = "ay", descriptor = "(II)V")
	public final void method23170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ai", descriptor = "(IB)V")
	public final void method23171(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "cr", descriptor = "(B)I")
	public final int method23172(@OriginalArg(0) byte arg0) {
		this.anInt3152 += -158245012;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "ao", descriptor = "(IS)V")
	public final void method23173(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method23154(arg0, 1275868335);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method23155(arg0 + 32768, (byte) -30);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "aj", descriptor = "(IB)V")
	public final void method23174(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method23155(32767, (byte) -69);
		} else if (arg0 < 32767) {
			this.method23155(arg0, (byte) -3);
		} else {
			this.method23345(arg0, (byte) 43);
			this.aByteArray61[this.anInt3152 * -1380987821 - 4] = (byte) (this.aByteArray61[this.anInt3152 * -1380987821 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!ald", name = "ei", descriptor = "()I")
	public final int method23175() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "cn", descriptor = "(I)I")
	public final int method23176(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		@Pc(33) int local33 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ald", name = "ab", descriptor = "(B)B")
	public final byte method23177(@OriginalArg(0) byte arg0) {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "al", descriptor = "(B)I")
	public final int method23178(@OriginalArg(0) byte arg0) {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "ah", descriptor = "(I)I")
	public final int method23179(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		@Pc(31) int local31 = (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ald", name = "af", descriptor = "(I)I")
	public final int method23180(@OriginalArg(0) int arg0) {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "am", descriptor = "(B)I")
	public final int method23181(@OriginalArg(0) byte arg0) {
		this.anInt3152 += -1192425583;
		@Pc(45) int local45 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ald", name = "ak", descriptor = "(I)I")
	public final int method23182(@OriginalArg(0) int arg0) {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "at", descriptor = "(I)I")
	public final int method23183(@OriginalArg(0) int arg0) {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ad", descriptor = "(B)J")
	public final long method23184(@OriginalArg(0) byte arg0) {
		@Pc(6) long local6 = (long) this.method23362(-601980264) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(1093666668) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "iu", descriptor = "()B")
	public final byte method23185() {
		return (byte) (128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "au", descriptor = "(B)Ljava/lang/String;")
	public final String method23186(@OriginalArg(0) byte arg0) {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(52) int local52 = this.anInt3152 * -1380987821 - local27 - 1;
		return local52 == 0 ? "" : Class2.method1814(this.aByteArray61, local27, local52, (byte) 78);
	}

	@OriginalMember(owner = "client!ald", name = "aa", descriptor = "(IB)J")
	public final long method23187(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ald", name = "ae", descriptor = "(I)F")
	public final float method23188(@OriginalArg(0) int arg0) {
		return Float.intBitsToFloat(this.method23182(1550536683));
	}

	@OriginalMember(owner = "client!ald", name = "ap", descriptor = "(I)Ljava/lang/String;")
	public final String method23189(@OriginalArg(0) int arg0) {
		if (this.aByteArray61[this.anInt3152 * -1380987821] == 0) {
			this.anInt3152 += 1034180571;
			return null;
		} else {
			return this.method23376((short) 26126);
		}
	}

	@OriginalMember(owner = "client!ald", name = "bk", descriptor = "([IIIB)V")
	public final void method23190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = arg1 * 1034180571;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method23182(1672755937);
			@Pc(28) int local28 = this.method23182(1614708993);
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local24, (byte) 123);
			this.method23345(local28, (byte) 48);
		}
		this.anInt3152 = local4 * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "fc", descriptor = "()F")
	public final float method23191() {
		return Float.intBitsToFloat(this.method23182(463070329));
	}

	@OriginalMember(owner = "client!ald", name = "az", descriptor = "(B)Ljava/lang/String;")
	public final String method23192(@OriginalArg(0) byte arg0) {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method23343(-2098238091);
		if (this.anInt3152 * -1380987821 + local26 > this.aByteArray61.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class614.method32265(this.aByteArray61, this.anInt3152 * -1380987821, local26, (byte) -52);
		this.anInt3152 += local26 * 1034180571;
		return local51;
	}

	@OriginalMember(owner = "client!ald", name = "ea", descriptor = "(I)V")
	public final void method23193(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method23154(arg0 + 64, 1275868335);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method23155(arg0 + 49152, (byte) -92);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "aw", descriptor = "(I)I")
	public final int method23194(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-1059389299) - 64 : this.method23178((byte) -104) - 49152;
	}

	@OriginalMember(owner = "client!ald", name = "bg", descriptor = "(I)I")
	public final int method23195(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-1052306080) : this.method23178((byte) -109) - 32768;
	}

	@OriginalMember(owner = "client!ald", name = "bl", descriptor = "(I)I")
	public final int method23196(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-772733645) - 1 : this.method23178((byte) -108) - 32769;
	}

	@OriginalMember(owner = "client!ald", name = "e", descriptor = "(B)V")
	public final void method23197(@OriginalArg(0) byte arg0) {
		if (this.aByteArray61 != null) {
			Class701.method37086(this.aByteArray61, 1201638897);
		}
		this.aByteArray61 = null;
	}

	@OriginalMember(owner = "client!ald", name = "jm", descriptor = "(I)V")
	public final void method23198(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "aq", descriptor = "(IB)V")
	public final void method23199(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method23154(arg0 + 64, 1275868335);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method23155(arg0 + 49152, (byte) -39);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "hb", descriptor = "(I)V")
	public final void method23200(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ald", name = "bs", descriptor = "(I)I")
	public final int method23201(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method23362(-243544220);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!ald", name = "bj", descriptor = "([II)V")
	public final void method23202(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(-1014960836);
			@Pc(22) int local22 = this.method23182(-1057850136);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 32);
			this.method23345(local22, (byte) 102);
		}
	}

	@OriginalMember(owner = "client!ald", name = "by", descriptor = "([II)V")
	public final void method23203(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(-1554570767);
			@Pc(22) int local22 = this.method23182(-1053747791);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= local18 + (local18 << 4 ^ local18 >>> 5) ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 48);
			this.method23345(local22, (byte) 32);
		}
	}

	@OriginalMember(owner = "client!ald", name = "el", descriptor = "(I)V")
	public final void method23204(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method23155(32767, (byte) -90);
		} else if (arg0 < 32767) {
			this.method23155(arg0, (byte) -99);
		} else {
			this.method23345(arg0, (byte) 31);
			this.aByteArray61[this.anInt3152 * -1380987821 - 4] = (byte) (this.aByteArray61[this.anInt3152 * -1380987821 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!ald", name = "av", descriptor = "(B)J")
	public final long method23205(@OriginalArg(0) byte arg0) {
		@Pc(6) long local6 = (long) this.method23178((byte) -37) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(823810554) & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!ald", name = "be", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method23206(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method23399(local10, 0, local4, -1691984830);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3152 = 0;
		this.method23155(local29.length, (byte) -71);
		this.method23168(local29, 0, local29.length, (byte) 125);
	}

	@OriginalMember(owner = "client!ald", name = "bh", descriptor = "(IB)I")
	public final int method23207(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) int local9 = Class251.method26373(this.aByteArray61, arg0, this.anInt3152 * -1380987821, -1638303044);
		this.method23345(local9, (byte) 111);
		return local9;
	}

	@OriginalMember(owner = "client!ald", name = "bv", descriptor = "(I)Z")
	public final boolean method23208(@OriginalArg(0) int arg0) {
		this.anInt3152 -= -158245012;
		@Pc(15) int local15 = Class251.method26373(this.aByteArray61, 0, this.anInt3152 * -1380987821, -1638303044);
		@Pc(19) int local19 = this.method23182(-1057110047);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!ald", name = "bp", descriptor = "(II)V")
	public final void method23209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "ba", descriptor = "(B)I")
	public final int method23210(@OriginalArg(0) byte arg0) {
		if (this.aByteArray61[this.anInt3152 * -1380987821] < 0) {
			return this.method23182(1558965619) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method23178((byte) -21);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ald", name = "bo", descriptor = "(II)V")
	public final void method23211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ald", name = "bc", descriptor = "(I)I")
	public final int method23212(@OriginalArg(0) int arg0) {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "bf", descriptor = "(I)I")
	public final int method23213(@OriginalArg(0) int arg0) {
		return -this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "gi", descriptor = "([BII)V")
	public final void method23214(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "hp", descriptor = "()I")
	public final int method23215() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method23362(884712419);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!ald", name = "bi", descriptor = "(I)B")
	public final byte method23216(@OriginalArg(0) int arg0) {
		return (byte) -this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "bu", descriptor = "(I)B")
	public final byte method23217(@OriginalArg(0) int arg0) {
		return (byte) (128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "bm", descriptor = "(II)V")
	public final void method23218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "bq", descriptor = "(II)V")
	public final void method23219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "bd", descriptor = "(II)V")
	public final void method23220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "cd", descriptor = "(I)I")
	public final int method23221(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "cv", descriptor = "(I)I")
	public final int method23222(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ct", descriptor = "(I)I")
	public final int method23223(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "gx", descriptor = "()I")
	final int method23224() {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ald", name = "co", descriptor = "(I)V")
	public final void method23225(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ch", descriptor = "(IB)V")
	public final void method23226(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "jl", descriptor = "(I)V")
	public final void method23227(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "cu", descriptor = "(I)I")
	public final int method23228(@OriginalArg(0) int arg0) {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ce", descriptor = "(II)V")
	public final void method23229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "ga", descriptor = "()I")
	public final int method23230() {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-955645968) : this.method23178((byte) -121) - 32768;
	}

	@OriginalMember(owner = "client!ald", name = "fi", descriptor = "()Ljava/lang/String;")
	public final String method23231() {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3152 * -1380987821 - local4 - 1;
		return local29 == 0 ? "" : Class2.method1814(this.aByteArray61, local4, local29, (byte) 17);
	}

	@OriginalMember(owner = "client!ald", name = "fr", descriptor = "()Ljava/lang/String;")
	public final String method23232() {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3152 * -1380987821 - local4 - 1;
		return local29 == 0 ? "" : Class2.method1814(this.aByteArray61, local4, local29, (byte) 32);
	}

	@OriginalMember(owner = "client!ald", name = "ed", descriptor = "([BII)V")
	public final void method23233(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "ci", descriptor = "([BIIB)V")
	public final void method23234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = (byte) (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ald", name = "iz", descriptor = "()I")
	public final int method23237() {
		this.anInt3152 += 2068361142;
		@Pc(33) int local33 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ald", name = "cb", descriptor = "()V")
	public final void method23238() {
		if (this.aByteArray61 != null) {
			Class701.method37086(this.aByteArray61, -1460004776);
		}
		this.aByteArray61 = null;
	}

	@OriginalMember(owner = "client!ald", name = "cw", descriptor = "(I)V")
	public final void method23239(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "cl", descriptor = "(I)V")
	public final void method23240(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "cx", descriptor = "(I)V")
	public final void method23241(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "cf", descriptor = "(I)V")
	public final void method23242(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "cz", descriptor = "(I)V")
	public final void method23243(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "bx", descriptor = "(I)B")
	public final byte method23244(@OriginalArg(0) int arg0) {
		return (byte) (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128);
	}

	@OriginalMember(owner = "client!ald", name = "bw", descriptor = "(I)I")
	public final int method23245(@OriginalArg(0) int arg0) {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "dg", descriptor = "(I)V")
	public final void method23246(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "dh", descriptor = "(I)V")
	public final void method23247(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "fq", descriptor = "()I")
	public final int method23248() {
		this.anInt3152 += -1192425583;
		@Pc(45) int local45 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ald", name = "dc", descriptor = "(I)V")
	public final void method23249(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "cj", descriptor = "(II)V")
	public final void method23250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "df", descriptor = "(I)V")
	public final void method23251(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "dl", descriptor = "(J)V")
	public final void method23252(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "bz", descriptor = "([IIII)V")
	public final void method23253(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = arg1 * 1034180571;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method23182(1363863772);
			@Pc(28) int local28 = this.method23182(2054906424);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local24, (byte) 93);
			this.method23345(local28, (byte) 43);
		}
		this.anInt3152 = local4 * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "dt", descriptor = "(J)V")
	public final void method23254(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "it", descriptor = "(I)V")
	public final void method23255(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ds", descriptor = "(J)V")
	public final void method23256(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "dw", descriptor = "(J)V")
	public final void method23257(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "dr", descriptor = "(J)V")
	public final void method23258(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "il", descriptor = "()I")
	public final int method23259() {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "de", descriptor = "(JI)V")
	public final void method23260(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "br", descriptor = "(B)I")
	public final int method23261(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method23195(1602339971); local5 == 32767; local5 = this.method23195(1989670368)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!ald", name = "ig", descriptor = "()B")
	public final byte method23262() {
		return (byte) (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128);
	}

	@OriginalMember(owner = "client!ald", name = "dq", descriptor = "(JI)V")
	public final void method23263(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "do", descriptor = "(JI)V")
	public final void method23264(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "ge", descriptor = "([BII)V")
	public final void method23265(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "ca", descriptor = "(I)I")
	public final int method23267(@OriginalArg(0) int arg0) {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 24) + (this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "cc", descriptor = "(II)V")
	public final void method23268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "dy", descriptor = "(Ljava/lang/String;)V")
	public final void method23269(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.anInt3152 += Class188.method24829(arg0, 0, arg0.length(), this.aByteArray61, this.anInt3152 * -1380987821, (byte) 32) * 1034180571;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "da", descriptor = "(Ljava/lang/String;)V")
	public final void method23270(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.anInt3152 += Class188.method24829(arg0, 0, arg0.length(), this.aByteArray61, this.anInt3152 * -1380987821, (byte) 71) * 1034180571;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "dk", descriptor = "(Ljava/lang/CharSequence;)V")
	public final void method23271(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class445.method29239(arg0, -1664967515);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.method23388(local3, 1907905066);
		this.anInt3152 += Class384.method28594(this.aByteArray61, this.anInt3152 * -1380987821, arg0, -626130498) * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "ec", descriptor = "(Ljava/lang/CharSequence;)V")
	public final void method23272(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class445.method29239(arg0, -2040303011);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.method23388(local3, 2050266143);
		this.anInt3152 += Class384.method28594(this.aByteArray61, this.anInt3152 * -1380987821, arg0, -626130498) * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "an", descriptor = "(B)J")
	public final long method23273(@OriginalArg(0) byte arg0) {
		@Pc(6) long local6 = (long) this.method23182(-2116224137) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(1590164808) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "gl", descriptor = "()I")
	public final int method23274() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] < 0) {
			return this.method23182(-255804685) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method23178((byte) -89);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ald", name = "eo", descriptor = "([BII)V")
	public final void method23275(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "ep", descriptor = "(Lclient!ald;)V")
	public final void method23276(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method23168(arg0.aByteArray61, 0, arg0.anInt3152 * -1380987821, (byte) 114);
	}

	@OriginalMember(owner = "client!ald", name = "ew", descriptor = "(Lclient!ald;)V")
	public final void method23277(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method23168(arg0.aByteArray61, 0, arg0.anInt3152 * -1380987821, (byte) 71);
	}

	@OriginalMember(owner = "client!ald", name = "ee", descriptor = "(Lclient!ald;)V")
	public final void method23278(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method23168(arg0.aByteArray61, 0, arg0.anInt3152 * -1380987821, (byte) 68);
	}

	@OriginalMember(owner = "client!ald", name = "ez", descriptor = "(I)V")
	public final void method23279(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ey", descriptor = "(I)V")
	public final void method23280(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray61[this.anInt3152 * -1380987821 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ek", descriptor = "(I)V")
	public final void method23281(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method23154(arg0 + 64, 1275868335);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method23155(arg0 + 49152, (byte) -97);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "j", descriptor = "(J)V")
	public final void method23282(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "eh", descriptor = "(I)V")
	public final void method23283(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method23155(32767, (byte) -93);
		} else if (arg0 < 32767) {
			this.method23155(arg0, (byte) -31);
		} else {
			this.method23345(arg0, (byte) 35);
			this.aByteArray61[this.anInt3152 * -1380987821 - 4] = (byte) (this.aByteArray61[this.anInt3152 * -1380987821 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!ald", name = "ia", descriptor = "()I")
	public final int method23284() {
		return -this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "em", descriptor = "(I)V")
	public final void method23285(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method23155(32767, (byte) 0);
		} else if (arg0 < 32767) {
			this.method23155(arg0, (byte) -48);
		} else {
			this.method23345(arg0, (byte) 11);
			this.aByteArray61[this.anInt3152 * -1380987821 - 4] = (byte) (this.aByteArray61[this.anInt3152 * -1380987821 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!ald", name = "et", descriptor = "(I)V")
	final void method23286(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "eu", descriptor = "(I)V")
	final void method23287(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "es", descriptor = "(I)V")
	final void method23288(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "er", descriptor = "(I)V")
	final void method23289(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "fn", descriptor = "()J")
	public final long method23290() {
		@Pc(6) long local6 = (long) this.method23178((byte) -62) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(-1310735129) & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!ald", name = "jn", descriptor = "(I)V")
	public final void method23291(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "eg", descriptor = "()I")
	public final int method23292() {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "eb", descriptor = "()B")
	public final byte method23293() {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "iw", descriptor = "(I)V")
	public final void method23294(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "ej", descriptor = "()I")
	public final int method23295() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "eq", descriptor = "()I")
	public final int method23296() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "fe", descriptor = "()I")
	public final int method23297() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "fv", descriptor = "()I")
	public final int method23298() {
		this.anInt3152 += 2068361142;
		@Pc(31) int local31 = (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ald", name = "fm", descriptor = "()I")
	public final int method23299() {
		this.anInt3152 += 2068361142;
		@Pc(31) int local31 = (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ald", name = "dx", descriptor = "(J)V")
	public final void method23300(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 56);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 48);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "fx", descriptor = "()I")
	public final int method23301() {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "fj", descriptor = "()I")
	public final int method23302() {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "he", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method23303(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method23399(local10, 0, local4, -1592884978);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3152 = 0;
		this.method23155(local29.length, (byte) -69);
		this.method23168(local29, 0, local29.length, (byte) 70);
	}

	@OriginalMember(owner = "client!ald", name = "hk", descriptor = "([I)V")
	public final void method23304(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(-1740047157);
			@Pc(22) int local22 = this.method23182(837372845);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= local18 + (local18 << 4 ^ local18 >>> 5) ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 34);
			this.method23345(local22, (byte) 104);
		}
	}

	@OriginalMember(owner = "client!ald", name = "fg", descriptor = "()F")
	public final float method23305() {
		return Float.intBitsToFloat(this.method23182(1408338130));
	}

	@OriginalMember(owner = "client!ald", name = "fz", descriptor = "()J")
	public final long method23306() {
		@Pc(6) long local6 = (long) this.method23362(-2063414582) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(-67136474) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "db", descriptor = "(J)V")
	public final void method23307(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "fh", descriptor = "()J")
	public final long method23308() {
		@Pc(6) long local6 = (long) this.method23182(-994178208) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(-456978249) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "gq", descriptor = "()I")
	public final int method23309() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] < 0) {
			return this.method23182(-140912585) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method23178((byte) -56);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ald", name = "fo", descriptor = "()J")
	public final long method23310() {
		@Pc(6) long local6 = (long) this.method23182(1213304269) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(547206830) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "fy", descriptor = "()J")
	public final long method23311() {
		@Pc(6) long local6 = (long) this.method23182(1667726807) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method23182(834618547) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ald", name = "fb", descriptor = "(I)J")
	public final long method23312(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ald", name = "cy", descriptor = "(I)I")
	public final int method23313(@OriginalArg(0) int arg0) {
		this.anInt3152 += 2068361142;
		@Pc(33) int local33 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ald", name = "ck", descriptor = "(I)I")
	public final int method23314(@OriginalArg(0) int arg0) {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "gr", descriptor = "()I")
	public final int method23315() {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(1580728241) & Integer.MAX_VALUE : this.method23178((byte) -4);
	}

	@OriginalMember(owner = "client!ald", name = "ex", descriptor = "()I")
	public final int method23316() {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "ft", descriptor = "()F")
	public final float method23317() {
		return Float.intBitsToFloat(this.method23182(-1624855767));
	}

	@OriginalMember(owner = "client!ald", name = "fs", descriptor = "()Ljava/lang/String;")
	public final String method23318() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] == 0) {
			this.anInt3152 += 1034180571;
			return null;
		} else {
			return this.method23376((short) 18688);
		}
	}

	@OriginalMember(owner = "client!ald", name = "fu", descriptor = "()Ljava/lang/String;")
	public final String method23319() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] == 0) {
			this.anInt3152 += 1034180571;
			return null;
		} else {
			return this.method23376((short) 14345);
		}
	}

	@OriginalMember(owner = "client!ald", name = "hu", descriptor = "(I)V")
	public final void method23320(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "o", descriptor = "(II)V")
	public final void method23321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "en", descriptor = "(I)V")
	final void method23322(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "gh", descriptor = "()Ljava/lang/String;")
	public final String method23323() {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(52) int local52 = this.anInt3152 * -1380987821 - local27 - 1;
		return local52 == 0 ? "" : Class2.method1814(this.aByteArray61, local27, local52, (byte) 9);
	}

	@OriginalMember(owner = "client!ald", name = "gz", descriptor = "()Ljava/lang/String;")
	public final String method23324() {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(52) int local52 = this.anInt3152 * -1380987821 - local27 - 1;
		return local52 == 0 ? "" : Class2.method1814(this.aByteArray61, local27, local52, (byte) 75);
	}

	@OriginalMember(owner = "client!ald", name = "gk", descriptor = "()Ljava/lang/String;")
	public final String method23325() {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method23343(-1103541968);
		if (this.anInt3152 * -1380987821 + local26 > this.aByteArray61.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class614.method32265(this.aByteArray61, this.anInt3152 * -1380987821, local26, (byte) -35);
		this.anInt3152 += local26 * 1034180571;
		return local51;
	}

	@OriginalMember(owner = "client!ald", name = "jv", descriptor = "()I")
	public final int method23326() {
		this.anInt3152 += 2068361142;
		@Pc(33) int local33 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ald", name = "id", descriptor = "()B")
	public final byte method23327() {
		return (byte) (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128);
	}

	@OriginalMember(owner = "client!ald", name = "gb", descriptor = "([BII)V")
	public final void method23328(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "du", descriptor = "(J)V")
	public final void method23329(@OriginalArg(0) long arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 40);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 32);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "bn", descriptor = "(I)I")
	public final int method23330(@OriginalArg(0) int arg0) {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(-1457639856) & Integer.MAX_VALUE : this.method23178((byte) -56);
	}

	@OriginalMember(owner = "client!ald", name = "gp", descriptor = "()I")
	public final int method23331() {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-300831331) - 64 : this.method23178((byte) -10) - 49152;
	}

	@OriginalMember(owner = "client!ald", name = "fk", descriptor = "()I")
	public final int method23332() {
		this.anInt3152 += -1192425583;
		@Pc(45) int local45 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ald", name = "gd", descriptor = "()I")
	public final int method23333() {
		@Pc(9) int local9 = this.aByteArray61[this.anInt3152 * -1380987821] & 0xFF;
		return local9 < 128 ? this.method23362(-921988631) : this.method23178((byte) -52) - 32768;
	}

	@OriginalMember(owner = "client!ald", name = "gc", descriptor = "()I")
	public final int method23334() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method23195(1341383686); local5 == 32767; local5 = this.method23195(2093293437)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!ald", name = "im", descriptor = "()I")
	public final int method23335() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "gf", descriptor = "()I")
	public final int method23336() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method23195(2108190479); local5 == 32767; local5 = this.method23195(1597711102)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!ald", name = "go", descriptor = "()I")
	public final int method23337() {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(-1720057177) & Integer.MAX_VALUE : this.method23178((byte) -43);
	}

	@OriginalMember(owner = "client!ald", name = "gv", descriptor = "()I")
	public final int method23338() {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(1633178423) & Integer.MAX_VALUE : this.method23178((byte) -40);
	}

	@OriginalMember(owner = "client!ald", name = "dn", descriptor = "(I)V")
	public final void method23339(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "gu", descriptor = "()I")
	public final int method23340() {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(-1529561048) & Integer.MAX_VALUE : this.method23178((byte) -61);
	}

	@OriginalMember(owner = "client!ald", name = "gt", descriptor = "()I")
	public final int method23341() {
		return this.aByteArray61[this.anInt3152 * -1380987821] < 0 ? this.method23182(1627164142) & Integer.MAX_VALUE : this.method23178((byte) -2);
	}

	@OriginalMember(owner = "client!ald", name = "gy", descriptor = "()I")
	public final int method23342() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] < 0) {
			return this.method23182(-410739090) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method23178((byte) -100);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ald", name = "bt", descriptor = "(I)I")
	final int method23343(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ald", name = "gm", descriptor = "()I")
	public final int method23344() {
		if (this.aByteArray61[this.anInt3152 * -1380987821] < 0) {
			return this.method23182(-208387950) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method23178((byte) -3);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ald", name = "m", descriptor = "(IB)V")
	public final void method23345(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ih", descriptor = "()I")
	public final int method23346() {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "gn", descriptor = "()I")
	public final int method23347() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method23362(-947764701);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!ald", name = "gs", descriptor = "()I")
	public final int method23348() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method23362(-548719906);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!ald", name = "jz", descriptor = "(I)V")
	public final void method23349(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "hf", descriptor = "([I)V")
	public final void method23350(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(-967916529);
			@Pc(22) int local22 = this.method23182(1208726631);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 125);
			this.method23345(local22, (byte) 50);
		}
	}

	@OriginalMember(owner = "client!ald", name = "bb", descriptor = "(II)V")
	public final void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "hn", descriptor = "([I)V")
	public final void method23352(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(1804137333);
			@Pc(22) int local22 = this.method23182(152559915);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= local18 + (local18 << 4 ^ local18 >>> 5) ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 78);
			this.method23345(local22, (byte) 39);
		}
	}

	@OriginalMember(owner = "client!ald", name = "ha", descriptor = "([I)V")
	public final void method23353(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(991212313);
			@Pc(22) int local22 = this.method23182(1283660214);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= local18 + (local18 << 4 ^ local18 >>> 5) ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 36);
			this.method23345(local22, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!ald", name = "dv", descriptor = "(JI)V")
	public final void method23354(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ald", name = "hv", descriptor = "([III)V")
	public final void method23355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = arg1 * 1034180571;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method23182(-1499842980);
			@Pc(28) int local28 = this.method23182(1505951426);
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local24, (byte) 7);
			this.method23345(local28, (byte) 75);
		}
		this.anInt3152 = local4 * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "hq", descriptor = "([III)V")
	public final void method23356(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = arg1 * 1034180571;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method23182(944610059);
			@Pc(28) int local28 = this.method23182(653815213);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local24, (byte) 11);
			this.method23345(local28, (byte) 124);
		}
		this.anInt3152 = local4 * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "hr", descriptor = "([III)V")
	public final void method23357(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = arg1 * 1034180571;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method23182(1102790540);
			@Pc(28) int local28 = this.method23182(1948720205);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local24, (byte) 70);
			this.method23345(local28, (byte) 34);
		}
		this.anInt3152 = local4 * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "fa", descriptor = "()I")
	public final int method23358() {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "hx", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method23359(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		this.anInt3152 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method23399(local10, 0, local4, -1551491370);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3152 = 0;
		this.method23155(local29.length, (byte) -42);
		this.method23168(local29, 0, local29.length, (byte) 79);
	}

	@OriginalMember(owner = "client!ald", name = "ho", descriptor = "()Z")
	public final boolean method23361() {
		this.anInt3152 -= -158245012;
		@Pc(15) int local15 = Class251.method26373(this.aByteArray61, 0, this.anInt3152 * -1380987821, -1638303044);
		@Pc(19) int local19 = this.method23182(-1720530376);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!ald", name = "ag", descriptor = "(I)I")
	public final int method23362(@OriginalArg(0) int arg0) {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "hh", descriptor = "(I)V")
	public final void method23363(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "hd", descriptor = "(I)V")
	public final void method23364(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "hm", descriptor = "(I)V")
	public final void method23365(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "hl", descriptor = "(I)V")
	public final void method23366(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "hg", descriptor = "(I)V")
	public final void method23367(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "gj", descriptor = "()I")
	public final int method23368() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method23195(1801648651); local5 == 32767; local5 = this.method23195(1454670908)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!ald", name = "hs", descriptor = "()I")
	public final int method23369() {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "gw", descriptor = "([BII)V")
	public final void method23370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "hz", descriptor = "()I")
	public final int method23371() {
		return -this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "ef", descriptor = "(Lclient!ald;)V")
	public final void method23372(@OriginalArg(0) Class80_Sub36 arg0) {
		this.method23168(arg0.aByteArray61, 0, arg0.anInt3152 * -1380987821, (byte) 57);
	}

	@OriginalMember(owner = "client!ald", name = "hc", descriptor = "()Z")
	public final boolean method23373() {
		this.anInt3152 -= -158245012;
		@Pc(15) int local15 = Class251.method26373(this.aByteArray61, 0, this.anInt3152 * -1380987821, -1638303044);
		@Pc(19) int local19 = this.method23182(-1056768513);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!ald", name = "in", descriptor = "()I")
	public final int method23374() {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "if", descriptor = "()I")
	public final int method23375() {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "ar", descriptor = "(S)Ljava/lang/String;")
	public final String method23376(@OriginalArg(0) short arg0) {
		@Pc(4) int local4 = this.anInt3152 * -1380987821;
		while (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3152 * -1380987821 - local4 - 1;
		return local29 == 0 ? "" : Class2.method1814(this.aByteArray61, local4, local29, (byte) 78);
	}

	@OriginalMember(owner = "client!ald", name = "io", descriptor = "()I")
	public final int method23377() {
		return 128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "fp", descriptor = "()I")
	public final int method23379() {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ix", descriptor = "()B")
	public final byte method23380() {
		return (byte) -this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "ip", descriptor = "()B")
	public final byte method23381() {
		return (byte) (128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "ir", descriptor = "()B")
	public final byte method23382() {
		return (byte) (128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "cg", descriptor = "()V")
	public final void method23383() {
		if (this.aByteArray61 != null) {
			Class701.method37086(this.aByteArray61, -474072812);
		}
		this.aByteArray61 = null;
	}

	@OriginalMember(owner = "client!ald", name = "iq", descriptor = "()B")
	public final byte method23384() {
		return (byte) (128 - this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "(II)V")
	public final void method23385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ib", descriptor = "(I)V")
	public final void method23386(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "iy", descriptor = "(I)V")
	public final void method23387(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ac", descriptor = "(II)V")
	final void method23388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method23154(arg0 >>> 28 | 0x80, 1275868335);
					}
					this.method23154(arg0 >>> 21 | 0x80, 1275868335);
				}
				this.method23154(arg0 >>> 14 | 0x80, 1275868335);
			}
			this.method23154(arg0 >>> 7 | 0x80, 1275868335);
		}
		this.method23154(arg0 & 0x7F, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "iv", descriptor = "(I)V")
	public final void method23389(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ald", name = "ie", descriptor = "(I)V")
	public final void method23390(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ik", descriptor = "(I)V")
	public final void method23391(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ii", descriptor = "(I)V")
	public final void method23392(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "is", descriptor = "(I)V")
	public final void method23393(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 + 128);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ic", descriptor = "()I")
	public final int method23394() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "dp", descriptor = "(Z)V")
	public final void method23395(@OriginalArg(0) boolean arg0) {
		this.method23154(arg0 ? 1 : 0, 1275868335);
	}

	@OriginalMember(owner = "client!ald", name = "ij", descriptor = "()I")
	public final int method23396() {
		this.anInt3152 += 2068361142;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "hi", descriptor = "()I")
	public final int method23397() {
		return this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "jd", descriptor = "()I")
	public final int method23398() {
		this.anInt3152 += 2068361142;
		@Pc(33) int local33 = ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ald", name = "as", descriptor = "([BIII)V")
	public final void method23399(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "hw", descriptor = "([I)V")
	public final void method23400(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3152 * -1380987821 / 8;
		this.anInt3152 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method23182(2062275137);
			@Pc(22) int local22 = this.method23182(-1067783438);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= local18 + (local18 << 4 ^ local18 >>> 5) ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3152 -= -316490024;
			this.method23345(local18, (byte) 4);
			this.method23345(local22, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!ald", name = "jj", descriptor = "(I)V")
	public final void method23401(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "jk", descriptor = "(I)V")
	public final void method23402(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "jr", descriptor = "()I")
	public final int method23403() {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "jw", descriptor = "()I")
	public final int method23404() {
		this.anInt3152 += -1192425583;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 16) + (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "jx", descriptor = "(I)V")
	public final void method23405(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "jy", descriptor = "(I)V")
	public final void method23406(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "jh", descriptor = "(I)V")
	public final void method23407(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "dd", descriptor = "(I)V")
	public final void method23408(@OriginalArg(0) int arg0) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ev", descriptor = "(Ljava/lang/CharSequence;)V")
	public final void method23409(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class445.method29239(arg0, -1933339537);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = 0;
		this.method23388(local3, 1586843565);
		this.anInt3152 += Class384.method28594(this.aByteArray61, this.anInt3152 * -1380987821, arg0, -626130498) * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "cs", descriptor = "(IB)V")
	public final void method23410(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 8);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) arg0;
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 24);
		this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "jo", descriptor = "()I")
	public final int method23411() {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ju", descriptor = "()I")
	public final int method23412() {
		this.anInt3152 += -158245012;
		return ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 8) + (this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "jq", descriptor = "()I")
	public final int method23413() {
		this.anInt3152 += -158245012;
		return (this.aByteArray61[this.anInt3152 * -1380987821 - 2] & 0xFF) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 3] & 0xFF) << 24) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 4] & 0xFF) << 16) + ((this.aByteArray61[this.anInt3152 * -1380987821 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "jt", descriptor = "([BII)V")
	public final void method23414(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = (byte) (this.aByteArray61[(this.anInt3152 += 1034180571) * -1380987821 - 1] - 128);
		}
	}
}
