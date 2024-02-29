package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aam")
public class Class15 {

	@OriginalMember(owner = "client!aam", name = "n", descriptor = "I")
	public static final int anInt52 = 64;

	@OriginalMember(owner = "client!aam", name = "e", descriptor = "I")
	static final int anInt53 = 512;

	@OriginalMember(owner = "client!aam", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886";

	@OriginalMember(owner = "client!aam", name = "m", descriptor = "I")
	static final int anInt54 = 10;

	@OriginalMember(owner = "client!aam", name = "f", descriptor = "[[J")
	static long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!aam", name = "w", descriptor = "[J")
	static long[] aLongArray2 = new long[11];

	@OriginalMember(owner = "client!aam", name = "l", descriptor = "[B")
	byte[] aByteArray10 = new byte[32];

	@OriginalMember(owner = "client!aam", name = "u", descriptor = "[B")
	byte[] aByteArray11 = new byte[64];

	@OriginalMember(owner = "client!aam", name = "z", descriptor = "I")
	int anInt55 = 0;

	@OriginalMember(owner = "client!aam", name = "p", descriptor = "I")
	int anInt56 = 0;

	@OriginalMember(owner = "client!aam", name = "d", descriptor = "[J")
	long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!aam", name = "c", descriptor = "[J")
	long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!aam", name = "r", descriptor = "[J")
	long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!aam", name = "v", descriptor = "[J")
	long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!aam", name = "o", descriptor = "[J")
	long[] aLongArray6 = new long[8];

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

	@OriginalMember(owner = "client!aam", name = "<init>", descriptor = "()V", line = 51)
	Class15() {
	}

	@OriginalMember(owner = "client!aam", name = "e", descriptor = "(I)V", line = 54)
	void method196(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "l", descriptor = "()V", line = 54)
	void method197() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "w", descriptor = "()V", line = 54)
	void method198() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "z", descriptor = "()V", line = 54)
	void method199() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "p", descriptor = "()V", line = 54)
	void method200() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "u", descriptor = "()V", line = 54)
	void method201() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray11[local3] << 56 ^ ((long) this.aByteArray11[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray11[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray11[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray11[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray11[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray11[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray11[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray1[local1] = this.aLongArray3[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray1[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray1[local3] = this.aLongArray4[local3];
			}
			this.aLongArray1[0] ^= aLongArray2[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray1[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aam", name = "n", descriptor = "(I)V", line = 87)
	void method202(@OriginalArg(0) int arg0) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray10[local1] = 0;
		}
		this.anInt56 = 0;
		this.anInt55 = 0;
		this.aByteArray11[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray3[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aam", name = "w", descriptor = "(I)I", line = 94)
	public static int method203(@OriginalArg(0) int arg0) {
		return 10;
	}

	@OriginalMember(owner = "client!aam", name = "c", descriptor = "([BJ)V", line = 95)
	void method204(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt55 * -1831991825 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray10[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray10[local21] = (byte) local23;
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
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
			this.anInt56 += -1461397227;
			this.anInt55 += (8 - local17) * -1106523889;
			if (this.anInt55 * -1831991825 == 512) {
				this.method196(1084124051);
				this.anInt56 = 0;
				this.anInt55 = 0;
			}
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt55 += local17 * -1106523889;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt55 = (int) ((long) this.anInt55 + arg1 * -1106523889L);
			return;
		}
		this.anInt56 += -1461397227;
		this.anInt55 += (8 - local17) * -1106523889;
		arg1 -= 8 - local17;
		if (this.anInt55 * -1831991825 == 512) {
			this.method196(1375333378);
			this.anInt56 = 0;
			this.anInt55 = 0;
		}
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt55 += (int) arg1 * -1106523889;
	}

	@OriginalMember(owner = "client!aam", name = "d", descriptor = "([BJ)V", line = 95)
	void method205(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt55 * -1831991825 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray10[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray10[local21] = (byte) local23;
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
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
			this.anInt56 += -1461397227;
			this.anInt55 += (8 - local17) * -1106523889;
			if (this.anInt55 * -1831991825 == 512) {
				this.method196(1369665735);
				this.anInt56 = 0;
				this.anInt55 = 0;
			}
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt55 += local17 * -1106523889;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt55 = (int) ((long) this.anInt55 + arg1 * -1106523889L);
			return;
		}
		this.anInt56 += -1461397227;
		this.anInt55 += (8 - local17) * -1106523889;
		arg1 -= 8 - local17;
		if (this.anInt55 * -1831991825 == 512) {
			this.method196(932561289);
			this.anInt56 = 0;
			this.anInt55 = 0;
		}
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt55 += (int) arg1 * -1106523889;
	}

	@OriginalMember(owner = "client!aam", name = "m", descriptor = "([BJ)V", line = 95)
	void method206(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt55 * -1831991825 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += (this.aByteArray10[local21] & 0xFF) + ((int) local19 & 0xFF);
			this.aByteArray10[local21] = (byte) local23;
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
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
			this.anInt56 += -1461397227;
			this.anInt55 += (8 - local17) * -1106523889;
			if (this.anInt55 * -1831991825 == 512) {
				this.method196(1477084319);
				this.anInt56 = 0;
				this.anInt55 = 0;
			}
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt55 += local17 * -1106523889;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt55 = (int) ((long) this.anInt55 + arg1 * -1106523889L);
			return;
		}
		this.anInt56 += -1461397227;
		this.anInt55 += (8 - local17) * -1106523889;
		arg1 -= 8 - local17;
		if (this.anInt55 * -1831991825 == 512) {
			this.method196(879895929);
			this.anInt56 = 0;
			this.anInt55 = 0;
		}
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt55 += (int) arg1 * -1106523889;
	}

	@OriginalMember(owner = "client!aam", name = "o", descriptor = "([BI)V", line = 149)
	void method207(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | 0x80 >>> (this.anInt55 * -1831991825 & 0x7));
		this.anInt56 += -1461397227;
		if (this.anInt56 * 1094495805 > 32) {
			while (true) {
				if (this.anInt56 * 1094495805 >= 64) {
					this.method196(927294250);
					this.anInt56 = 0;
					break;
				}
				this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
			}
		}
		while (this.anInt56 * 1094495805 < 32) {
			this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
		}
		System.arraycopy(this.aByteArray10, 0, this.aByteArray11, 32, 32);
		this.method196(1721740656);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray3[local93];
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

	@OriginalMember(owner = "client!aam", name = "k", descriptor = "([BII)V", line = 149)
	void method208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | 0x80 >>> (this.anInt55 * -1831991825 & 0x7));
		this.anInt56 += -1461397227;
		if (this.anInt56 * 1094495805 > 32) {
			while (true) {
				if (this.anInt56 * 1094495805 >= 64) {
					this.method196(2093318407);
					this.anInt56 = 0;
					break;
				}
				this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
			}
		}
		while (this.anInt56 * 1094495805 < 32) {
			this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
		}
		System.arraycopy(this.aByteArray10, 0, this.aByteArray11, 32, 32);
		this.method196(879535576);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray3[local93];
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

	@OriginalMember(owner = "client!aam", name = "r", descriptor = "([BI)V", line = 149)
	void method209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | 0x80 >>> (this.anInt55 * -1831991825 & 0x7));
		this.anInt56 += -1461397227;
		if (this.anInt56 * 1094495805 > 32) {
			while (true) {
				if (this.anInt56 * 1094495805 >= 64) {
					this.method196(1117164481);
					this.anInt56 = 0;
					break;
				}
				this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
			}
		}
		while (this.anInt56 * 1094495805 < 32) {
			this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
		}
		System.arraycopy(this.aByteArray10, 0, this.aByteArray11, 32, 32);
		this.method196(1777252096);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray3[local93];
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

	@OriginalMember(owner = "client!aam", name = "v", descriptor = "([BI)V", line = 149)
	void method210(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray11[this.anInt56 * 1094495805] = (byte) (this.aByteArray11[this.anInt56 * 1094495805] | 0x80 >>> (this.anInt55 * -1831991825 & 0x7));
		this.anInt56 += -1461397227;
		if (this.anInt56 * 1094495805 > 32) {
			while (true) {
				if (this.anInt56 * 1094495805 >= 64) {
					this.method196(1242055653);
					this.anInt56 = 0;
					break;
				}
				this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
			}
		}
		while (this.anInt56 * 1094495805 < 32) {
			this.aByteArray11[(this.anInt56 += -1461397227) * 1094495805 - 1] = 0;
		}
		System.arraycopy(this.aByteArray10, 0, this.aByteArray11, 32, 32);
		this.method196(1745585894);
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray3[local93];
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

	@OriginalMember(owner = "client!aam", name = "y", descriptor = "([BII)[B", line = 178)
	public static byte[] method211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class15 local26 = new Class15();
		local26.method202(2016450083);
		local26.method206(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method208(local39, 0, 1886711007);
		return local39;
	}

	@OriginalMember(owner = "client!aam", name = "s", descriptor = "([BII)[B", line = 178)
	public static byte[] method212(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class15 local26 = new Class15();
		local26.method202(1821078971);
		local26.method206(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method208(local39, 0, 1886711007);
		return local39;
	}

	@OriginalMember(owner = "client!aam", name = "q", descriptor = "([BII)[B", line = 178)
	public static byte[] method213(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class15 local26 = new Class15();
		local26.method202(2124110991);
		local26.method206(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method208(local39, 0, 1886711007);
		return local39;
	}
}
