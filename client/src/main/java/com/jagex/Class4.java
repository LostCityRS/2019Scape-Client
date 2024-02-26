package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aab")
public final class Class4 {

	@OriginalMember(owner = "client!aab", name = "f", descriptor = "I")
	public static final int anInt2 = 64;

	@OriginalMember(owner = "client!aab", name = "e", descriptor = "I")
	static final int anInt3 = 10;

	@OriginalMember(owner = "client!aab", name = "u", descriptor = "Ljava/lang/String;")
	static final String aString1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886";

	@OriginalMember(owner = "client!aab", name = "t", descriptor = "I")
	static final int anInt6 = 512;

	@OriginalMember(owner = "client!aab", name = "l", descriptor = "[[J")
	static long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!aab", name = "g", descriptor = "[J")
	static long[] aLongArray2 = new long[11];

	@OriginalMember(owner = "client!aab", name = "i", descriptor = "[B")
	byte[] aByteArray2 = new byte[32];

	@OriginalMember(owner = "client!aab", name = "m", descriptor = "[B")
	byte[] aByteArray1 = new byte[64];

	@OriginalMember(owner = "client!aab", name = "o", descriptor = "I")
	int anInt4 = 0;

	@OriginalMember(owner = "client!aab", name = "j", descriptor = "I")
	int anInt5 = 0;

	@OriginalMember(owner = "client!aab", name = "a", descriptor = "[J")
	long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!aab", name = "s", descriptor = "[J")
	long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!aab", name = "k", descriptor = "[J")
	long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!aab", name = "x", descriptor = "[J")
	long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!aab", name = "w", descriptor = "[J")
	long[] aLongArray3 = new long[8];

	static {
		@Pc(8) int local8;
		for (local8 = 0; local8 < 256; local8++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(31) long local31 = (local8 & 0x1) == 0 ? (long) (local17 >>> 8) : (long) (local17 & 0xFF);
			@Pc(35) long local35 = local31 << 1;
			if (local35 >= 256L) {
				local35 ^= 0x11DL;
			}
			@Pc(47) long local47 = local35 << 1;
			if (local47 >= 256L) {
				local47 ^= 0x11DL;
			}
			@Pc(59) long local59 = local47 ^ local31;
			@Pc(63) long local63 = local47 << 1;
			if (local63 >= 256L) {
				local63 ^= 0x11DL;
			}
			@Pc(75) long local75 = local63 ^ local31;
			aLongArrayArray1[0][local8] = local31 << 56 | local31 << 48 | local47 << 40 | local31 << 32 | local63 << 24 | local59 << 16 | local35 << 8 | local75;
			for (@Pc(111) int local111 = 1; local111 < 8; local111++) {
				aLongArrayArray1[local111][local8] = aLongArrayArray1[local111 - 1][local8] >>> 8 | aLongArrayArray1[local111 - 1][local8] << 56;
			}
		}
		aLongArray2[0] = 0L;
		for (local8 = 1; local8 <= 10; local8++) {
			@Pc(157) int local157 = (local8 - 1) * 8;
			aLongArray2[local8] = aLongArrayArray1[0][local157] & 0xFF00000000000000L ^ aLongArrayArray1[1][local157 + 1] & 0xFF000000000000L ^ aLongArrayArray1[2][local157 + 2] & 0xFF0000000000L ^ aLongArrayArray1[3][local157 + 3] & 0xFF00000000L ^ aLongArrayArray1[4][local157 + 4] & 0xFF000000L ^ aLongArrayArray1[5][local157 + 5] & 0xFF0000L ^ aLongArrayArray1[6][local157 + 6] & 0xFF00L ^ aLongArrayArray1[7][local157 + 7] & 0xFFL;
		}
	}

	@OriginalMember(owner = "client!aab", name = "q", descriptor = "([BII)[B")
	public static byte[] method80(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[local6 + arg1];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class4 local26 = new Class4();
		local26.method72((byte) 3);
		local26.method73(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method74(local39, 0, -1392911759);
		return local39;
	}

	@OriginalMember(owner = "client!aab", name = "r", descriptor = "([BII)[B")
	public static byte[] method85(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[local6 + arg1];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class4 local26 = new Class4();
		local26.method72((byte) 3);
		local26.method73(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method74(local39, 0, -1392911759);
		return local39;
	}

	@OriginalMember(owner = "client!aab", name = "cz", descriptor = "(Lclient!yp;I)V")
	static void method87(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2135684266);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class626.method32536(local16, local22, arg0, 1641025274);
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "()V")
	Class4() {
	}

	@OriginalMember(owner = "client!aab", name = "a", descriptor = "([BJ)V")
	void method71(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt4 * -1014900057 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray2[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray2[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
			this.anInt5 += 2029772835;
			this.anInt4 += (8 - local17) * 1873423639;
			if (this.anInt4 * -1014900057 == 512) {
				this.method75(2042344535);
				this.anInt5 = 0;
				this.anInt4 = 0;
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt4 += local17 * 1873423639;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt4 = (int) ((long) this.anInt4 + arg1 * 1873423639L);
			return;
		}
		this.anInt5 += 2029772835;
		this.anInt4 += (8 - local17) * 1873423639;
		arg1 -= 8 - local17;
		if (this.anInt4 * -1014900057 == 512) {
			this.method75(2108309081);
			this.anInt5 = 0;
			this.anInt4 = 0;
		}
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt4 += (int) arg1 * 1873423639;
	}

	@OriginalMember(owner = "client!aab", name = "f", descriptor = "(B)V")
	void method72(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray2[local1] = 0;
		}
		this.anInt5 = 0;
		this.anInt4 = 0;
		this.aByteArray1[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aab", name = "e", descriptor = "([BJ)V")
	void method73(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt4 * -1014900057 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray2[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray2[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
			this.anInt5 += 2029772835;
			this.anInt4 += (8 - local17) * 1873423639;
			if (this.anInt4 * -1014900057 == 512) {
				this.method75(2050681856);
				this.anInt5 = 0;
				this.anInt4 = 0;
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt4 += local17 * 1873423639;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt4 = (int) ((long) this.anInt4 + arg1 * 1873423639L);
			return;
		}
		this.anInt5 += 2029772835;
		this.anInt4 += (8 - local17) * 1873423639;
		arg1 -= 8 - local17;
		if (this.anInt4 * -1014900057 == 512) {
			this.method75(2137120540);
			this.anInt5 = 0;
			this.anInt4 = 0;
		}
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt4 += (int) arg1 * 1873423639;
	}

	@OriginalMember(owner = "client!aab", name = "u", descriptor = "([BII)V")
	void method74(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | 0x80 >>> (this.anInt4 * -1014900057 & 0x7));
		this.anInt5 += 2029772835;
		if (this.anInt5 * 1720438667 > 32) {
			while (true) {
				if (this.anInt5 * 1720438667 >= 64) {
					this.method75(2132848050);
					this.anInt5 = 0;
					break;
				}
				this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
			}
		}
		while (this.anInt5 * 1720438667 < 32) {
			this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
		}
		System.arraycopy(this.aByteArray2, 0, this.aByteArray1, 32, 32);
		this.method75(2138514661);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aab", name = "t", descriptor = "(I)V")
	void method75(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray6[local1] = (long) this.aByteArray1[local3] << 56 ^ ((long) this.aByteArray1[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray1[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray1[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray1[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray1[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray1[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray1[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] = this.aLongArray6[local1] ^ (this.aLongArray4[local1] = this.aLongArray5[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray1[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray4[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
			}
			this.aLongArray4[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray1[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray1[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] ^= this.aLongArray3[local1] ^ this.aLongArray6[local1];
		}
	}

	@OriginalMember(owner = "client!aab", name = "g", descriptor = "()V")
	void method76() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray6[local1] = (long) this.aByteArray1[local3] << 56 ^ ((long) this.aByteArray1[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray1[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray1[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray1[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray1[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray1[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray1[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] = this.aLongArray6[local1] ^ (this.aLongArray4[local1] = this.aLongArray5[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray1[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray4[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
			}
			this.aLongArray4[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray1[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray1[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] ^= this.aLongArray3[local1] ^ this.aLongArray6[local1];
		}
	}

	@OriginalMember(owner = "client!aab", name = "i", descriptor = "()V")
	void method77() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray2[local1] = 0;
		}
		this.anInt5 = 0;
		this.anInt4 = 0;
		this.aByteArray1[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aab", name = "m", descriptor = "()V")
	void method78() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray2[local1] = 0;
		}
		this.anInt5 = 0;
		this.anInt4 = 0;
		this.aByteArray1[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aab", name = "o", descriptor = "()V")
	void method79() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray2[local1] = 0;
		}
		this.anInt5 = 0;
		this.anInt4 = 0;
		this.aByteArray1[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray5[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aab", name = "k", descriptor = "([BI)V")
	void method81(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | 0x80 >>> (this.anInt4 * -1014900057 & 0x7));
		this.anInt5 += 2029772835;
		if (this.anInt5 * 1720438667 > 32) {
			while (true) {
				if (this.anInt5 * 1720438667 >= 64) {
					this.method75(2055689255);
					this.anInt5 = 0;
					break;
				}
				this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
			}
		}
		while (this.anInt5 * 1720438667 < 32) {
			this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
		}
		System.arraycopy(this.aByteArray2, 0, this.aByteArray1, 32, 32);
		this.method75(2051244694);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aab", name = "s", descriptor = "([BJ)V")
	void method82(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt4 * -1014900057 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray2[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray2[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
			this.anInt5 += 2029772835;
			this.anInt4 += (8 - local17) * 1873423639;
			if (this.anInt4 * -1014900057 == 512) {
				this.method75(2054907725);
				this.anInt5 = 0;
				this.anInt4 = 0;
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt4 += local17 * 1873423639;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt4 = (int) ((long) this.anInt4 + arg1 * 1873423639L);
			return;
		}
		this.anInt5 += 2029772835;
		this.anInt4 += (8 - local17) * 1873423639;
		arg1 -= 8 - local17;
		if (this.anInt4 * -1014900057 == 512) {
			this.method75(2074686230);
			this.anInt5 = 0;
			this.anInt4 = 0;
		}
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt4 += (int) arg1 * 1873423639;
	}

	@OriginalMember(owner = "client!aab", name = "j", descriptor = "([BJ)V")
	void method83(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt4 * -1014900057 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray2[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray2[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
			this.anInt5 += 2029772835;
			this.anInt4 += (8 - local17) * 1873423639;
			if (this.anInt4 * -1014900057 == 512) {
				this.method75(2038902804);
				this.anInt5 = 0;
				this.anInt4 = 0;
			}
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt4 += local17 * 1873423639;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt4 = (int) ((long) this.anInt4 + arg1 * 1873423639L);
			return;
		}
		this.anInt5 += 2029772835;
		this.anInt4 += (8 - local17) * 1873423639;
		arg1 -= 8 - local17;
		if (this.anInt4 * -1014900057 == 512) {
			this.method75(2041962181);
			this.anInt5 = 0;
			this.anInt4 = 0;
		}
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt4 += (int) arg1 * 1873423639;
	}

	@OriginalMember(owner = "client!aab", name = "w", descriptor = "([BI)V")
	void method84(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | 0x80 >>> (this.anInt4 * -1014900057 & 0x7));
		this.anInt5 += 2029772835;
		if (this.anInt5 * 1720438667 > 32) {
			while (true) {
				if (this.anInt5 * 1720438667 >= 64) {
					this.method75(2075112800);
					this.anInt5 = 0;
					break;
				}
				this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
			}
		}
		while (this.anInt5 * 1720438667 < 32) {
			this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
		}
		System.arraycopy(this.aByteArray2, 0, this.aByteArray1, 32, 32);
		this.method75(2051967275);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aab", name = "x", descriptor = "([BI)V")
	void method86(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray1[this.anInt5 * 1720438667] = (byte) (this.aByteArray1[this.anInt5 * 1720438667] | 0x80 >>> (this.anInt4 * -1014900057 & 0x7));
		this.anInt5 += 2029772835;
		if (this.anInt5 * 1720438667 > 32) {
			while (true) {
				if (this.anInt5 * 1720438667 >= 64) {
					this.method75(2125282822);
					this.anInt5 = 0;
					break;
				}
				this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
			}
		}
		while (this.anInt5 * 1720438667 < 32) {
			this.aByteArray1[(this.anInt5 += 2029772835) * 1720438667 - 1] = 0;
		}
		System.arraycopy(this.aByteArray2, 0, this.aByteArray1, 32, 32);
		this.method75(2046386096);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}
}
