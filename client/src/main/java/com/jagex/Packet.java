package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

@OriginalClass("client!ald")
public class Packet extends Class80 {

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "I")
	public static final int anInt3151 = 5000;

	@OriginalMember(owner = "client!ald", name = "a", descriptor = "J")
	public static final long aLong294 = -3932672073523589310L;

	@OriginalMember(owner = "client!ald", name = "o", descriptor = "I")
	public static final int anInt3153 = -306674912;

	@OriginalMember(owner = "client!ald", name = "u", descriptor = "I")
	public static final int anInt3154 = 100;

	@OriginalMember(owner = "client!ald", name = "m", descriptor = "[I")
	public static final int[] crctable = new int[256];

	@OriginalMember(owner = "client!ald", name = "j", descriptor = "[J")
	public static final long[] crc64table = new long[256];

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!ald", name = "i", descriptor = "I")
	public int pos;

	static {
		for (@Pc(4) int b = 0; b < 256; b++) {
			@Pc(9) int remainder = b;

			for (int bit = 0; bit < 8; bit++) {
				if ((remainder & 0x1) == 1) {
					remainder = remainder >>> 1 ^ 0xEDB88320;
				} else {
					remainder >>>= 0x1;
				}
			}

			crctable[b] = remainder;
		}

		for (int b = 0; b < 256; b++) {
			@Pc(49) long remainder = b;

			for (@Pc(51) int bit = 0; bit < 8; bit++) {
				if ((remainder & 0x1L) == 1L) {
					remainder = remainder >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					remainder >>>= 0x1;
				}
			}

			crc64table[b] = remainder;
		}
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "([B)V")
	public Packet(@OriginalArg(0) byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(IZ)V")
	public Packet(@OriginalArg(0) int size, @OriginalArg(1) boolean arg1) {
		this.data = ByteArrayPool.create(size, arg1);
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int size) {
		this.data = ByteArrayPool.create(size);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!et", name = "t", descriptor = "([BIII)I")
	public static int getcrc(@OriginalArg(0) byte[] src, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		@Pc(1) int checksum = -1;
		for (@Pc(3) int i = off; i < len; i++) {
			checksum = checksum >>> 8 ^ crctable[(checksum ^ src[i]) & 0xFF];
		}
		return ~checksum;
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "([BII)I")
	public static int getcrc(@OriginalArg(0) byte[] src, @OriginalArg(1) int len) {
		return getcrc(src, 0, len);
	}

	@OriginalMember(owner = "client!acd", name = "y", descriptor = "(Ljava/lang/String;B)I")
	public static int calculatePjstr2(@OriginalArg(0) String str) {
		return str.length() + 2;
	}

	@OriginalMember(owner = "client!ald", name = "u", descriptor = "(II)V")
	public void p1(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "(IB)V")
	public void p2(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "i", descriptor = "(II)V")
	public void p3(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "ax", descriptor = "(Lclient!ald;I)V")
	public void pdata(@OriginalArg(0) Packet src) {
		this.pdata(src.data, 0, src.pos * -1380987821);
	}

	@OriginalMember(owner = "client!ald", name = "a", descriptor = "(J)V")
	public void p6(@OriginalArg(0) long value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 40);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 32);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "s", descriptor = "(J)V")
	public void p8(@OriginalArg(0) long value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 56);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 48);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 40);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 32);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "x", descriptor = "(JIB)V")
	public void pVarLong(@OriginalArg(0) long arg0, @OriginalArg(1) int bytes) {
		@Pc(0) int read = bytes - 1;
		if (read < 0 || read > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int i = read * 8; i >= 0; i -= 8) {
			this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (arg0 >> i);
		}
	}

	@OriginalMember(owner = "client!ald", name = "z", descriptor = "(ZB)V")
	public void pbool(@OriginalArg(0) boolean value) {
		this.p1(value ? 1 : 0);
	}

	@OriginalMember(owner = "client!ald", name = "v", descriptor = "(Ljava/lang/String;I)V")
	public void pjstr(@OriginalArg(0) String value) {
		@Pc(3) int nulIndex = value.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("");
		}
		this.pos += Class188.encode(value, 0, value.length(), this.data, this.pos * -1380987821, (byte) 69) * 1034180571;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "n", descriptor = "(Ljava/lang/String;I)V")
	public void pjstr2(@OriginalArg(0) String value) {
		@Pc(3) int nulIndex = value.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("");
		}
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = 0;
		this.pos += Class188.encode(value, 0, value.length(), this.data, this.pos * -1380987821, (byte) 71) * 1034180571;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = 0;
	}

	@OriginalMember(owner = "client!ald", name = "c", descriptor = "(Ljava/lang/CharSequence;I)V")
	public void pUTF8(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class445.method29239(arg0, -2002308536);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = 0;
		this.pVarInt(local3);
		this.pos += Class384.method28594(this.data, this.pos * -1380987821, arg0, -626130498) * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "b", descriptor = "([BIIB)V")
	public void pdata(@OriginalArg(0) byte[] src, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		for (@Pc(1) int i = off; i < off + len; i++) {
			this.data[(this.pos += 1034180571) * -1380987821 - 1] = src[i];
		}
	}

	@OriginalMember(owner = "client!ald", name = "ay", descriptor = "(II)V")
	public void p2check(@OriginalArg(0) int value) {
		if (value < 0 || value > 65535) {
			throw new IllegalArgumentException();
		}
		this.data[this.pos * -1380987821 - value - 2] = (byte) (value >> 8);
		this.data[this.pos * -1380987821 - value - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "ai", descriptor = "(IB)V")
	public void p1check(@OriginalArg(0) int value) {
		if (value < 0 || value > 255) {
			throw new IllegalArgumentException();
		}
		this.data[this.pos * -1380987821 - value - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "cr", descriptor = "(B)I")
	public int g4_alt3() {
		this.pos += -158245012;
		return ((this.data[this.pos * -1380987821 - 3] & 0xFF) << 24) +
				((this.data[this.pos * -1380987821 - 4] & 0xFF) << 16) +
				((this.data[this.pos * -1380987821 - 1] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ao", descriptor = "(IS)V")
	public void pSmart1or2(@OriginalArg(0) int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "aj", descriptor = "(IB)V")
	public void pSmart2or4null(@OriginalArg(0) int value) {
		if (value < -1) {
			throw new IllegalArgumentException();
		} else if (value == -1) {
			this.p2(32767);
		} else if (value < 32767) {
			this.p2(value);
		} else {
			this.p4(value);
			this.data[this.pos * -1380987821 - 4] = (byte) (this.data[this.pos * -1380987821 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!ald", name = "cn", descriptor = "(I)I")
	public int g2s_alt2() {
		this.pos += 2068361142;
		@Pc(33) int value = ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8) + (this.data[this.pos * -1380987821 - 1] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "ab", descriptor = "(B)B")
	public byte g1b() {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "al", descriptor = "(B)I")
	public int g2() {
		this.pos += 2068361142;
		return (this.data[this.pos * -1380987821 - 1] & 0xFF) + ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ald", name = "ah", descriptor = "(I)I")
	public int g2s() {
		this.pos += 2068361142;
		@Pc(31) int value = (this.data[this.pos * -1380987821 - 1] & 0xFF) + ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "af", descriptor = "(I)I")
	public int g3() {
		this.pos += -1192425583;
		return ((this.data[this.pos * -1380987821 - 3] & 0xFF) << 16) + ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8) + (this.data[this.pos * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "am", descriptor = "(B)I")
	public int g3s() {
		this.pos += -1192425583;
		@Pc(45) int value = ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8) + ((this.data[this.pos * -1380987821 - 3] & 0xFF) << 16) + (this.data[this.pos * -1380987821 - 1] & 0xFF);
		if (value > 8388607) {
			value -= 16777216;
		}
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "ak", descriptor = "(I)I")
	public int g4() {
		this.pos += -158245012;
		return ((this.data[this.pos * -1380987821 - 4] & 0xFF) << 24) + ((this.data[this.pos * -1380987821 - 3] & 0xFF) << 16) + ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8) + (this.data[this.pos * -1380987821 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "at", descriptor = "(I)I")
	public int ip4() {
		this.pos += -158245012;
		return ((this.data[this.pos * -1380987821 - 1] & 0xFF) << 24) +
				((this.data[this.pos * -1380987821 - 2] & 0xFF) << 16) +
				((this.data[this.pos * -1380987821 - 3] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ad", descriptor = "(B)J")
	public long g5() {
		@Pc(6) long high = (long) this.g1() & 0xFFFFFFFFL;
		@Pc(13) long low = (long) this.g4() & 0xFFFFFFFFL;
		return (high << 32) + low;
	}

	@OriginalMember(owner = "client!ald", name = "au", descriptor = "(B)Ljava/lang/String;")
	public String gjstr2() {
		@Pc(14) byte version = this.data[(this.pos += 1034180571) * -1380987821 - 1];
		if (version != 0) {
			throw new IllegalStateException("");
		}
		@Pc(27) int start = this.pos * -1380987821;
		while (this.data[(this.pos += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(52) int length = this.pos * -1380987821 - start - 1;
		return length == 0 ? "" : Class2.method1814(this.data, start, length, (byte) 78);
	}

	@OriginalMember(owner = "client!ald", name = "aa", descriptor = "(IB)J")
	public long gVarLong(@OriginalArg(0) int bytes) {
		@Pc(0) int read = bytes - 1;
		if (read < 0 || read > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int bits = read * 8;
		@Pc(15) long value = 0L;
		while (bits >= 0) {
			value |= ((long) this.data[(this.pos += 1034180571) * -1380987821 - 1] & 0xFFL) << bits;
			bits -= 8;
		}
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "ae", descriptor = "(I)F")
	public float gFloat() {
		return Float.intBitsToFloat(this.g4());
	}

	@OriginalMember(owner = "client!ald", name = "ap", descriptor = "(I)Ljava/lang/String;")
	public String fastgstr() {
		if (this.data[this.pos * -1380987821] == 0) {
			this.pos += 1034180571;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@OriginalMember(owner = "client!ald", name = "bk", descriptor = "([IIIB)V")
	public void tinyenc(@OriginalArg(0) int[] key, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		@Pc(4) int start = this.pos * -1380987821;
		this.pos = off * 1034180571;
		@Pc(15) int blocks = (len - off) / 8;
		for (@Pc(17) int i = 0; i < blocks; i++) {
			@Pc(24) int v0 = this.g4();
			@Pc(28) int v1 = this.g4();
			@Pc(30) int sum = 0;
			@Pc(32) int magic = -1640531527;
			@Pc(34) int numRounds = 32;
			while (numRounds-- > 0) {
				v0 += v1 + (v1 << 4 ^ v1 >>> 5) ^ key[sum & 0x3] + sum;
				sum += magic;
				v1 += (v0 << 4 ^ v0 >>> 5) + v0 ^ key[sum >>> 11 & 0x3] + sum;
			}
			this.pos -= -316490024;
			this.p4(v0);
			this.p4(v1);
		}
		this.pos = start * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "az", descriptor = "(B)Ljava/lang/String;")
	public String gUTF8() {
		@Pc(14) byte local14 = this.data[(this.pos += 1034180571) * -1380987821 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.gVarInt();
		if (this.pos * -1380987821 + local26 > this.data.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class614.method32265(this.data, this.pos * -1380987821, local26, (byte) -52);
		this.pos += local26 * 1034180571;
		return local51;
	}

	@OriginalMember(owner = "client!ald", name = "aw", descriptor = "(I)I")
	public int gSmart1or2s() {
		@Pc(9) int value = this.data[this.pos * -1380987821] & 0xFF;
		return value < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@OriginalMember(owner = "client!ald", name = "bg", descriptor = "(I)I")
	public int gSmart1or2() {
		@Pc(9) int value = this.data[this.pos * -1380987821] & 0xFF;
		return value < 128 ? this.g1() : this.g2() - 32768;
	}

	@OriginalMember(owner = "client!ald", name = "bl", descriptor = "(I)I")
	public int gSmart1or2null() {
		@Pc(9) int value = this.data[this.pos * -1380987821] & 0xFF;
		return value < 128 ? this.g1() - 1 : this.g2() - 32769;
	}

	@OriginalMember(owner = "client!ald", name = "e", descriptor = "(B)V")
	public void release() {
		if (this.data != null) {
			ByteArrayPool.release(this.data, 1201638897);
		}
		this.data = null;
	}

	@OriginalMember(owner = "client!ald", name = "aq", descriptor = "(IB)V")
	public void pSmart1or2s(@OriginalArg(0) int value) {
		if (value < 64 && value >= -64) {
			this.p1(value + 64);
		} else if (value < 16384 && value >= -16384) {
			this.p2(value + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ald", name = "bs", descriptor = "(I)I")
	public int gVarInt2() {
		@Pc(1) int value = 0;
		@Pc(3) int acc = 0;
		@Pc(7) int next;
		do {
			next = this.g1();
			value |= (next & 0x7F) << acc;
			acc += 7;
		} while (next > 127);
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "bj", descriptor = "([II)V")
	public void tinyenc(@OriginalArg(0) int[] key) {
		@Pc(6) int blocks = this.pos * -1380987821 / 8;
		this.pos = 0;
		for (@Pc(11) int i = 0; i < blocks; i++) {
			@Pc(18) int v0 = this.g4();
			@Pc(22) int v1 = this.g4();
			@Pc(24) int sum = 0;
			@Pc(26) int magic = 0x9e3779b9;
			@Pc(28) int numRounds = 32;
			while (numRounds-- > 0) {
				v0 += (v1 << 4 ^ v1 >>> 5) + v1 ^ key[sum & 0x3] + sum;
				sum += magic;
				v1 += (v0 << 4 ^ v0 >>> 5) + v0 ^ key[sum >>> 11 & 0x3] + sum;
			}
			this.pos -= -316490024;
			this.p4(v0);
			this.p4(v1);
		}
	}

	@OriginalMember(owner = "client!ald", name = "by", descriptor = "([II)V")
	public void tinydec(@OriginalArg(0) int[] key) {
		@Pc(6) int blocks = this.pos * -1380987821 / 8;
		this.pos = 0;
		for (@Pc(11) int i = 0; i < blocks; i++) {
			@Pc(18) int v0 = this.g4();
			@Pc(22) int v1 = this.g4();
			@Pc(24) int sum = 0xc6ef3720;
			@Pc(26) int magic = 0x9e3779b9;
			@Pc(28) int numRounds = 32;
			while (numRounds-- > 0) {
				v1 -= v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum;
				sum -= magic;
				v0 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ key[sum & 0x3] + sum;
			}
			this.pos -= -316490024;
			this.p4(v0);
			this.p4(v1);
		}
	}

	@OriginalMember(owner = "client!ald", name = "av", descriptor = "(B)J")
	public long g6() {
		@Pc(6) long high = (long) this.g2() & 0xFFFFFFFFL;
		@Pc(13) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	@OriginalMember(owner = "client!ald", name = "be", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void rsaenc(@OriginalArg(0) BigInteger exponent, @OriginalArg(1) BigInteger modulus) {
		if (ClientConfig.DISABLE_RSA) {
			return;
		}

		@Pc(4) int length = this.pos * -1380987821;
		this.pos = 0;
		@Pc(10) byte[] temp = new byte[length];
		this.gdata(temp, 0, length);
		@Pc(21) BigInteger bigRaw = new BigInteger(temp);
		@Pc(26) BigInteger bigEnc = bigRaw.modPow(exponent, modulus);
		@Pc(29) byte[] rawEnc = bigEnc.toByteArray();
		this.pos = 0;
		this.p2(rawEnc.length);
		this.pdata(rawEnc, 0, rawEnc.length);
	}

	@OriginalMember(owner = "client!ald", name = "bh", descriptor = "(IB)I")
	public int addcrc(@OriginalArg(0) int off) {
		@Pc(9) int crc = getcrc(this.data, off, this.pos * -1380987821);
		this.p4(crc);
		return crc;
	}

	@OriginalMember(owner = "client!ald", name = "bv", descriptor = "(I)Z")
	public boolean checkcrc() {
		this.pos -= -158245012;
		@Pc(15) int crc = getcrc(this.data, 0, this.pos * -1380987821);
		@Pc(19) int expected = this.g4();
		return expected == crc;
	}

	@OriginalMember(owner = "client!ald", name = "bp", descriptor = "(II)V")
	public void p1_alt1(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!ald", name = "ba", descriptor = "(B)I")
	public int gSmart2or4null() {
		if (this.data[this.pos * -1380987821] < 0) {
			return this.g4() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int value = this.g2();
			return value == 32767 ? -1 : value;
		}
	}

	@OriginalMember(owner = "client!ald", name = "bo", descriptor = "(II)V")
	public void p1_alt3(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (128 - value);
	}

	@OriginalMember(owner = "client!ald", name = "bc", descriptor = "(I)I")
	public int g1_alt1() {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "bf", descriptor = "(I)I")
	public int g1_alt2() {
		return -this.data[(this.pos += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "bi", descriptor = "(I)B")
	public byte g1b_alt2() {
		return (byte) -this.data[(this.pos += 1034180571) * -1380987821 - 1];
	}

	@OriginalMember(owner = "client!ald", name = "bu", descriptor = "(I)B")
	public byte g1b_alt3() {
		return (byte) (128 - this.data[(this.pos += 1034180571) * -1380987821 - 1]);
	}

	@OriginalMember(owner = "client!ald", name = "bm", descriptor = "(II)V")
	public void p2_alt1(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "bq", descriptor = "(II)V")
	public void p2_alt2(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!ald", name = "bd", descriptor = "(II)V")
	public void p2_alt3(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value + 128);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "cd", descriptor = "(I)I")
	public int g2_alt1() {
		this.pos += 2068361142;
		return ((this.data[this.pos * -1380987821 - 1] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "cv", descriptor = "(I)I")
	public int g2_alt2() {
		this.pos += 2068361142;
		return ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ct", descriptor = "(I)I")
	public int g2_alt3() {
		this.pos += 2068361142;
		return ((this.data[this.pos * -1380987821 - 1] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ch", descriptor = "(IB)V")
	public void ip3(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!ald", name = "cu", descriptor = "(I)I")
	public int g3_alt1() {
		this.pos += -1192425583;
		return ((this.data[this.pos * -1380987821 - 3] & 0xFF) << 16) +
				((this.data[this.pos * -1380987821 - 1] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "ce", descriptor = "(II)V")
	public void p4_alt1(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "ci", descriptor = "([BIIB)V")
	public void gdata_alt2(@OriginalArg(0) byte[] dest, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		for (@Pc(1) int i = off; i < len + off; i++) {
			dest[i] = (byte) (this.data[(this.pos += 1034180571) * -1380987821 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ald", name = "bx", descriptor = "(I)B")
	public byte g1b_alt1() {
		return (byte) (this.data[(this.pos += 1034180571) * -1380987821 - 1] - 128);
	}

	@OriginalMember(owner = "client!ald", name = "bw", descriptor = "(I)I")
	public int g1_alt3() {
		return 128 - this.data[(this.pos += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "cj", descriptor = "(II)V")
	public void p4_alt3(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "bz", descriptor = "([IIII)V")
	public void tinydec(@OriginalArg(0) int[] key, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		@Pc(4) int start = this.pos * -1380987821;
		this.pos = off * 1034180571;
		@Pc(15) int blocks = (len - off) / 8;
		for (@Pc(17) int i = 0; i < blocks; i++) {
			@Pc(24) int v0 = this.g4();
			@Pc(28) int v1 = this.g4();
			@Pc(30) int sum = -957401312;
			@Pc(32) int magic = -1640531527;
			@Pc(34) int numRounds = 32;
			while (numRounds-- > 0) {
				v1 -= v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum;
				sum -= magic;
				v0 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ key[sum & 0x3] + sum;
			}
			this.pos -= -316490024;
			this.p4(v0);
			this.p4(v1);
		}
		this.pos = start * 1034180571;
	}

	@OriginalMember(owner = "client!ald", name = "br", descriptor = "(B)I")
	public int gExtended1or2() {
		@Pc(1) int acc = 0;
		@Pc(5) int next;
		for (next = this.gSmart1or2(); next == 32767; next = this.gSmart1or2()) {
			acc += 32767;
		}
		return acc + next;
	}

	@OriginalMember(owner = "client!ald", name = "ca", descriptor = "(I)I")
	public int g4_alt2() {
		this.pos += -158245012;
		return ((this.data[this.pos * -1380987821 - 2] & 0xFF) << 24) +
				((this.data[this.pos * -1380987821 - 1] & 0xFF) << 16) +
				((this.data[this.pos * -1380987821 - 4] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "cc", descriptor = "(II)V")
	public void p3_alt2(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "an", descriptor = "(B)J")
	public long g8() {
		@Pc(6) long high = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(13) long low = (long) this.g4() & 0xFFFFFFFFL;
		return (high << 32) + low;
	}

	@OriginalMember(owner = "client!ald", name = "j", descriptor = "(J)V")
	public void p5(@OriginalArg(0) long value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 32);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "cy", descriptor = "(I)I")
	public int g2s_alt3() {
		this.pos += 2068361142;
		@Pc(33) int value = ((this.data[this.pos * -1380987821 - 1] & 0xFF) << 8) + (this.data[this.pos * -1380987821 - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!ald", name = "ck", descriptor = "(I)I")
	public int g4_alt1() {
		this.pos += -158245012;
		return ((this.data[this.pos * -1380987821 - 1] & 0xFF) << 24) +
				((this.data[this.pos * -1380987821 - 2] & 0xFF) << 16) +
				((this.data[this.pos * -1380987821 - 3] & 0xFF) << 8) +
				(this.data[this.pos * -1380987821 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ald", name = "o", descriptor = "(II)V")
	public void ip4(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!ald", name = "bn", descriptor = "(I)I")
	public int gSmart2or4() {
		return this.data[this.pos * -1380987821] < 0 ? this.g4() & Integer.MAX_VALUE : this.g2();
	}

	@OriginalMember(owner = "client!ald", name = "bt", descriptor = "(I)I")
	int gVarInt() {
		@Pc(14) byte next = this.data[(this.pos += 1034180571) * -1380987821 - 1];
		@Pc(16) int acc = 0;
		while (next < 0) {
			acc = (acc | next & 0x7F) << 7;
			next = this.data[(this.pos += 1034180571) * -1380987821 - 1];
		}
		return acc | next;
	}

	@OriginalMember(owner = "client!ald", name = "m", descriptor = "(IB)V")
	public void p4(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
	}

	@OriginalMember(owner = "client!ald", name = "bb", descriptor = "(II)V")
	public void p1_alt2(@OriginalArg(0) int arg0) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ald", name = "ag", descriptor = "(I)I")
	public int g1() {
		return this.data[(this.pos += 1034180571) * -1380987821 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ald", name = "ar", descriptor = "(S)Ljava/lang/String;")
	public String gjstr() {
		@Pc(4) int start = this.pos * -1380987821;
		while (this.data[(this.pos += 1034180571) * -1380987821 - 1] != 0) {
		}
		@Pc(29) int length = this.pos * -1380987821 - start - 1;
		return length == 0 ? "" : Class2.method1814(this.data, start, length, (byte) 78);
	}

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "(II)V")
	public void ip2(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!ald", name = "ac", descriptor = "(II)V")
	void pVarInt(@OriginalArg(0) int value) {
		if ((value & 0xFFFFFF80) != 0) {
			if ((value & 0xFFFFC000) != 0) {
				if ((value & 0xFFE00000) != 0) {
					if ((value & 0xF0000000) != 0) {
						this.p1(value >>> 28 | 0x80);
					}
					this.p1(value >>> 21 | 0x80);
				}
				this.p1(value >>> 14 | 0x80);
			}
			this.p1(value >>> 7 | 0x80);
		}
		this.p1(value & 0x7F);
	}

	@OriginalMember(owner = "client!ald", name = "as", descriptor = "([BIII)V")
	public void gdata(@OriginalArg(0) byte[] dest, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		for (@Pc(1) int i = off; i < len + off; i++) {
			dest[i] = this.data[(this.pos += 1034180571) * -1380987821 - 1];
		}
	}

	@OriginalMember(owner = "client!ald", name = "cs", descriptor = "(IB)V")
	public void p4_alt2(@OriginalArg(0) int value) {
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) value;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (value >> 16);
	}
}
