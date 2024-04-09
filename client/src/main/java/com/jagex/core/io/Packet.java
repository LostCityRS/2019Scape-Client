package com.jagex.core.io;

import com.jagex.core.datastruct.Node;
import com.jagex.core.utils.ByteArrayPool;
import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.Utf8;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.math.BigInteger;

@ObfuscatedName("alw")
public class Packet extends Node {

	private static final int CRC32_POLYNOMIAL = 0xEDB88320;

	private static final long CRC64_POLYNOMIAL = 0xC96C5795D7870F42L;

	@ObfuscatedName("alw.w")
	public byte[] data;

	@ObfuscatedName("alw.l")
	public int pos;

	@ObfuscatedName("alw.u")
	public static int[] crctable = new int[256];

	@ObfuscatedName("alw.p")
	public static long[] crc64table = new long[256];

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;

			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ CRC32_POLYNOMIAL;
				} else {
					var1 >>>= 0x1;
				}
			}

			crctable[var0] = var1;
		}

		for (int var3 = 0; var3 < 256; var3++) {
			long var4 = var3;

			for (int var6 = 0; var6 < 8; var6++) {
				if ((var4 & 0x1L) == 1L) {
					var4 = var4 >>> 1 ^ CRC64_POLYNOMIAL;
				} else {
					var4 >>>= 0x1;
				}
			}

			crc64table[var3] = var4;
		}
	}

	@ObfuscatedName("ahd.e([BIIB)I")
	public static int getcrc(byte[] src, int off, int len) {
		int crc = -1;
		for (int i = off; i < len; i++) {
			crc = crc >>> 8 ^ crctable[(crc ^ src[i]) & 0xFF];
		}
		return ~crc;
	}

	@ObfuscatedName("wg.n([BII)I")
	public static int getcrc(byte[] src, int len) {
		return getcrc(src, 0, len);
	}

	public Packet(int size) {
		this.data = ByteArrayPool.alloc(size);
		this.pos = 0;
	}

	public Packet(int size, boolean arg1) {
		this.data = ByteArrayPool.alloc(size, arg1);
	}

	public Packet(byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@ObfuscatedName("alw.m(B)V")
	public void release() {
		if (this.data != null) {
			ByteArrayPool.release(this.data);
		}

		this.data = null;
	}

	@ObfuscatedName("alw.k(IB)V")
	public void p1(int value) {
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.f(II)V")
	public void p2(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.w(II)V")
	public void ip2(int value) {
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
	}

	@ObfuscatedName("alw.l(IB)V")
	public void p3(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.u(IB)V")
	public void p4(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.z(II)V")
	public void ip4(int value) {
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
	}

	@ObfuscatedName("alw.p(J)V")
	public void p5(long value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 32);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.d(J)V")
	public void p6(long value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 40);
		this.data[(++this.pos) - 1] = (byte) (value >> 32);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.c(J)V")
	public void p8(long value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 56);
		this.data[(++this.pos) - 1] = (byte) (value >> 48);
		this.data[(++this.pos) - 1] = (byte) (value >> 40);
		this.data[(++this.pos) - 1] = (byte) (value >> 32);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.r(JII)V")
	public void pVarLong(long value, int bytes) {
		int size = bytes - 1;
		if (size < 0 || size > 7) {
			throw new IllegalArgumentException();
		}

		for (int bits = size * 8; bits >= 0; bits -= 8) {
			this.data[(++this.pos) - 1] = (byte) (value >> bits);
		}
	}

	@ObfuscatedName("alw.v(ZI)V")
	public void pbool(boolean value) {
		this.p1(value ? 1 : 0);
	}

	@ObfuscatedName("abu.y(Ljava/lang/String;I)I")
	public static int pjstrlen(String str) {
		return str.length() + 1;
	}

	@ObfuscatedName("alw.x(Ljava/lang/String;I)V")
	public void pjstr(String str) {
		int nulIndex = str.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("");
		}

		this.pos += Cp1252.method5981(str, 0, str.length(), this.data, this.pos);
		this.data[(++this.pos) - 1] = 0;
	}

	@ObfuscatedName("tu.h(Ljava/lang/String;I)I")
	public static int method8398(String str) {
		return str.length() + 2;
	}

	@ObfuscatedName("alw.a(Ljava/lang/String;I)V")
	public void pjstr2(String str) {
		int nulIndex = str.indexOf(0);
		if (nulIndex >= 0) {
			throw new IllegalArgumentException("");
		}

		this.data[(++this.pos) - 1] = 0;
		this.pos += Cp1252.method5981(str, 0, str.length(), this.data, this.pos);
		this.data[(++this.pos) - 1] = 0;
	}

	@ObfuscatedName("alw.g(Ljava/lang/CharSequence;I)V")
	public void pUTF8(CharSequence arg0) {
		int var2 = Utf8.method8499(arg0);
		this.data[(++this.pos) - 1] = 0;
		this.pVarInt(var2);
		this.pos += Utf8.method18328(this.data, this.pos, arg0);
	}

	@ObfuscatedName("alw.i([BIII)V")
	public void pdata(byte[] src, int off, int len) {
		for (int i = off; i < off + len; i++) {
			this.data[(++this.pos) - 1] = src[i];
		}
	}

	@ObfuscatedName("alw.j(Lalw;B)V")
	public void pdata(Packet buf) {
		this.pdata(buf.data, 0, buf.pos);
	}

	@ObfuscatedName("alw.t(II)V")
	public void psize2(int len) {
		if (len < 0 || len > 65535) {
			throw new IllegalArgumentException();
		}

		this.data[this.pos - len - 2] = (byte) (len >> 8);
		this.data[this.pos - len - 1] = (byte) len;
	}

	@ObfuscatedName("alw.ae(IB)V")
	public void psize1(int len) {
		if (len < 0 || len > 255) {
			throw new IllegalArgumentException();
		}

		this.data[this.pos - len - 1] = (byte) len;
	}

	@ObfuscatedName("alw.ag(II)V")
	public void pSmart1or2(int value) {
		if (value < 64 && value >= -64) {
			this.p1(value + 64);
		} else if (value < 16384 && value >= -16384) {
			this.p2(value + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("alw.ah(IB)V")
	public void pSmart1or2s(int value) {
		if (value >= 0 && value < 128) {
			this.p1(value);
		} else if (value >= 0 && value < 32768) {
			this.p2(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("alw.al(II)V")
	public void pSmart2or4(int value) {
		if (value < -1) {
			throw new IllegalArgumentException();
		} else if (value == -1) {
			this.p2(32767);
		} else if (value < 32767) {
			this.p2(value);
		} else {
			this.p4(value);
			this.data[this.pos - 4] = (byte) (this.data[this.pos - 4] | 0x80);
		}
	}

	@ObfuscatedName("alw.ac(II)V")
	public void pVarInt(int value) {
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

	@ObfuscatedName("alw.ai(S)I")
	public int g1() {
		return this.data[(++this.pos) - 1] & 0xFF;
	}

	@ObfuscatedName("alw.aw(I)B")
	public byte g1b() {
		return this.data[(++this.pos) - 1];
	}

	@ObfuscatedName("alw.as(I)I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("alw.at(B)I")
	public int g2s() {
		this.pos += 2;
		int value = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@ObfuscatedName("alw.ad(S)I")
	public int g3() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("alw.am(I)I")
	public int g3s() {
		this.pos += 3;
		int value = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (value > 8388607) {
			value -= 16777216;
		}
		return value;
	}

	@ObfuscatedName("alw.au(I)I")
	public int g4s() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 4] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ar(B)I")
	public int ig4s() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 1] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ap(I)J")
	public long g5() {
		long var1 = (long) this.g1() & 0xFFFFFFFFL;
		long var3 = (long) this.g4s() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.aq(I)J")
	public long g6() {
		long var1 = (long) this.g2() & 0xFFFFFFFFL;
		long var3 = (long) this.g4s() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.ax(I)J")
	public long g8() {
		long var1 = (long) this.g4s() & 0xFFFFFFFFL;
		long var3 = (long) this.g4s() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.av(II)J")
	public long gVarLong(int bytes) {
		int size = bytes - 1;
		if (size < 0 || size > 7) {
			throw new IllegalArgumentException();
		}

		int var2 = size * 8;
		long var3 = 0L;
		while (var2 >= 0) {
			var3 |= ((long) this.data[(++this.pos) - 1] & 0xFFL) << var2;
			var2 -= 8;
		}
		return var3;
	}

	@ObfuscatedName("alw.ao(I)F")
	public float gFloat() {
		return Float.intBitsToFloat(this.g4s());
	}

	@ObfuscatedName("alw.aj(B)Ljava/lang/String;")
	public String fastgstr() {
		if (this.data[this.pos] == 0) {
			++this.pos;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@ObfuscatedName("alw.ay(I)Ljava/lang/String;")
	public String gjstr() {
		int start = this.pos;
		while (this.data[(++this.pos) - 1] != 0) {
		}
		int length = this.pos - start - 1;
		return length == 0 ? "" : Cp1252.method9199(this.data, start, length);
	}

	@ObfuscatedName("alw.ab(I)Ljava/lang/String;")
	public String gjstr2() {
		byte version = this.data[(++this.pos) - 1];
		if (version != 0) {
			throw new IllegalStateException("");
		}
		int start = this.pos;
		while (this.data[(++this.pos) - 1] != 0) {
		}
		int length = this.pos - start - 1;
		return length == 0 ? "" : Cp1252.method9199(this.data, start, length);
	}

	@ObfuscatedName("alw.az(I)Ljava/lang/String;")
	public String gUTF8() {
		byte var1 = this.data[(++this.pos) - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.gVarInt();
		if (this.pos + var2 > this.data.length) {
			throw new IllegalStateException("");
		}
		String var3 = Utf8.method10345(this.data, this.pos, var2);
		this.pos += var2;
		return var3;
	}

	@ObfuscatedName("alw.aa([BIIS)V")
	public void gdata(byte[] dest, int off, int len) {
		for (int i = off; i < off + len; i++) {
			dest[i] = this.data[(++this.pos) - 1];
		}
	}

	@ObfuscatedName("alw.af(I)I")
	public int gSmart1or2s() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("alw.ak(B)I")
	public int gSmart1or2() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("alw.an(B)I")
	public int gSmart1or2null() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 1 : this.g2() - 32769;
	}

	@ObfuscatedName("alw.bf(I)I")
	public int gExtended1or2() {
		int var1 = 0;
		int var2;
		for (var2 = this.gSmart1or2(); var2 == 32767; var2 = this.gSmart1or2()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("alw.bl(I)I")
	public int gSmart2or4() {
		return this.data[this.pos] < 0 ? this.g4s() & Integer.MAX_VALUE : this.g2();
	}

	@ObfuscatedName("alw.bk(I)I")
	public int gSmart2or4null() {
		if (this.data[this.pos] < 0) {
			return this.g4s() & Integer.MAX_VALUE;
		} else {
			int var1 = this.g2();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("alw.bh(I)I")
	public int gVarInt() {
		byte var1 = this.data[(++this.pos) - 1];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.data[(++this.pos) - 1];
		}
		return var2 | var1;
	}

	// todo name
	@ObfuscatedName("alw.bx(S)I")
	public int gVarInt2() {
		int var1 = 0;
		int var2 = 0;
		int var3;
		do {
			var3 = this.g1();
			var1 |= (var3 & 0x7F) << var2;
			var2 += 7;
		} while (var3 > 127);
		return var1;
	}

	@ObfuscatedName("alw.bd([II)V")
	public void tinyenc(int[] key) {
        if (!Client.ENABLE_TINYENC) {
            return;
        }

		int var2 = this.pos / 8;
		this.pos = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.g4s();
			int var5 = this.g4s();
			int var6 = 0;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ key[var6 & 0x3] + var6;
				var6 += var7;
				var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ key[var6 >>> 11 & 0x3] + var6;
			}
			this.pos -= 8;
			this.p4(var4);
			this.p4(var5);
		}
	}

	@ObfuscatedName("alw.bc([II)V")
	public void tinydec(int[] key) {
		int var2 = this.pos / 8;
		this.pos = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.g4s();
			int var5 = this.g4s();
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ key[var6 >>> 11 & 0x3] + var6;
				var6 -= var7;
				var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ key[var6 & 0x3] + var6;
			}
			this.pos -= 8;
			this.p4(var4);
			this.p4(var5);
		}
	}

	@ObfuscatedName("alw.bi([IIIB)V")
	public void tinyenc(int[] key, int off, int len) {
        if (!Client.ENABLE_TINYENC) {
            return;
        }

		int var4 = this.pos;
		this.pos = off;
		int var5 = (len - off) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.g4s();
			int var8 = this.g4s();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ key[var9 & 0x3] + var9;
				var9 += var10;
				var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ key[var9 >>> 11 & 0x3] + var9;
			}
			this.pos -= 8;
			this.p4(var7);
			this.p4(var8);
		}
		this.pos = var4;
	}

	@ObfuscatedName("alw.bn([IIII)V")
	public void tinydec(int[] key, int off, int len) {
		int var4 = this.pos;
		this.pos = off;
		int var5 = (len - off) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.g4s();
			int var8 = this.g4s();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ key[var9 >>> 11 & 0x3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ key[var9 & 0x3] + var9;
			}
			this.pos -= 8;
			this.p4(var7);
			this.p4(var8);
		}
		this.pos = var4;
	}

	@ObfuscatedName("alw.bt(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void rsaenc(BigInteger exponent, BigInteger modulus) {
		if (!Client.ENABLE_RSA) {
			return;
		}

		int var3 = this.pos;
		this.pos = 0;
		byte[] var4 = new byte[var3];
		this.gdata(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(exponent, modulus);
		byte[] var7 = var6.toByteArray();
		this.pos = 0;
		this.p2(var7.length);
		this.pdata(var7, 0, var7.length);
	}

	@ObfuscatedName("alw.bq(II)I")
	public int addcrc(int off) {
		int crc = getcrc(this.data, off, this.pos);
		this.p4(crc);
		return crc;
	}

	@ObfuscatedName("alw.bm(I)Z")
	public boolean checkcrc() {
		this.pos -= 4;
		int crc = getcrc(this.data, 0, this.pos);
		int expected = this.g4s();
		return crc == expected;
	}

	@ObfuscatedName("alw.bb(II)V")
	public void p1_alt1(int value) {
		this.data[(++this.pos) - 1] = (byte) (value + 128);
	}

	@ObfuscatedName("alw.be(II)V")
	public void p1_alt2(int value) {
		this.data[(++this.pos) - 1] = (byte) -value;
	}

	@ObfuscatedName("alw.by(IB)V")
	public void p1_alt3(int value) {
		this.data[(++this.pos) - 1] = (byte) (128 - value);
	}

	@ObfuscatedName("alw.bu(I)I")
	public int g1_alt1() {
		return this.data[(++this.pos) - 1] - 128 & 0xFF;
	}

	@ObfuscatedName("alw.bw(I)I")
	public int g1_alt2() {
		return -this.data[(++this.pos) - 1] & 0xFF;
	}

	@ObfuscatedName("alw.bo(I)I")
	public int g1_alt3() {
		return 128 - this.data[(++this.pos) - 1] & 0xFF;
	}

	@ObfuscatedName("alw.bz(B)B")
	public byte g1b_alt1() {
		return (byte) (this.data[(++this.pos) - 1] - 128);
	}

	@ObfuscatedName("alw.bv(I)B")
	public byte g1b_alt2() {
		return (byte) -this.data[(++this.pos) - 1];
	}

	@ObfuscatedName("alw.br(I)B")
	public byte g1b_alt3() {
		return (byte) (128 - this.data[(++this.pos) - 1]);
	}

	@ObfuscatedName("alw.bg(IB)V")
	public void p2_alt1(int value) {
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
	}

	@ObfuscatedName("alw.ba(II)V")
	public void p2_alt2(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) (value + 128);
	}

	@ObfuscatedName("alw.bp(IS)V")
	public void p2_alt3(int value) {
		this.data[(++this.pos) - 1] = (byte) (value + 128);
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
	}

	@ObfuscatedName("alw.bj(I)I")
	public int g2_alt1() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@ObfuscatedName("alw.bs(I)I")
	public int g2_alt2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("alw.cl(I)I")
	public int g2_alt3() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("alw.cg(I)I")
	public int g2s_alt1() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("alw.ce(I)I")
	public int g2s_alt2() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("alw.cu(II)V")
	public void p3_alt2(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
	}

	@ObfuscatedName("alw.ci(IB)V")
	public void p3_alt3(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) value;
	}

	@ObfuscatedName("alw.cn(S)I")
	public int g3_alt3() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("alw.cv(II)V")
	public void p4_alt1(int value) {
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
	}

	@ObfuscatedName("alw.cp(II)V")
	public void p4_alt2(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
	}

	@ObfuscatedName("alw.ca(IB)V")
	public void p4_alt3(int value) {
		this.data[(++this.pos) - 1] = (byte) (value >> 16);
		this.data[(++this.pos) - 1] = (byte) (value >> 24);
		this.data[(++this.pos) - 1] = (byte) value;
		this.data[(++this.pos) - 1] = (byte) (value >> 8);
	}

	@ObfuscatedName("alw.cx(I)I")
	public int g4_alt1() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 1] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.cw(I)I")
	public int g4_alt2() {
		this.pos += 4;
		return (this.data[this.pos - 3] & 0xFF) + ((this.data[this.pos - 4] & 0xFF) << 8) + ((this.data[this.pos - 1] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ct(I)I")
	public int g4_alt3() {
		this.pos += 4;
		return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8) + ((this.data[this.pos - 4] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.cf([BIIB)V")
	public void gdata_alt1(byte[] dest, int off, int len) {
		for (int i = off + len - 1; i >= off; i--) {
			dest[i] = this.data[(++this.pos) - 1];
		}
	}

	@ObfuscatedName("alw.co([BIII)V")
	public void gdata_alt2(byte[] dest, int off, int len) {
		for (int i = off; i < off + len; i++) {
			dest[i] = (byte) (this.data[(++this.pos) - 1] - 128);
		}
	}
}
