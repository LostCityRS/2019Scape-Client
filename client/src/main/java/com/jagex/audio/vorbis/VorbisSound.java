package com.jagex.audio.vorbis;

import com.jagex.audio.api.AudioEndianness;
import com.jagex.audio.api.AudioFormat;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@ObfuscatedName("hk")
public class VorbisSound implements VorbisInterface {

	@ObfuscatedName("hk.e")
	public int field2076;

	@ObfuscatedName("hk.n")
	public int field2045;

	@ObfuscatedName("hk.m")
	public int field2046;

	@ObfuscatedName("hk.k")
	public int field2055;

	@ObfuscatedName("hk.f")
	public int field2048;

	@ObfuscatedName("hk.w")
	public VorbisInterface2 field2049;

	@ObfuscatedName("hk.l")
	public List field2050 = new ArrayList();

	@ObfuscatedName("hk.u")
	public VorbisRelated field2106 = VorbisRelated.field3427;

	@ObfuscatedName("hk.z")
	public AudioFormat field2052;

	@ObfuscatedName("hk.p")
	public AudioEndianness field2053;

	@ObfuscatedName("hk.d")
	public int field2081;

	@ObfuscatedName("hk.c")
	public int field2110;

	@ObfuscatedName("hk.r")
	public int field2056;

	@ObfuscatedName("hk.v")
	public final float field2059;

	@ObfuscatedName("hk.o")
	public int blockSize0;

	@ObfuscatedName("hk.s")
	public int blockSize1;

	@ObfuscatedName("hk.y")
	public VorbisCodebook[] book_param;

	@ObfuscatedName("hk.q")
	public VorbisFloor[] floor_param;

	@ObfuscatedName("hk.x")
	public VorbisResidue[] residue_param;

	@ObfuscatedName("hk.b")
	public VorbisMapping[] map_param;

	@ObfuscatedName("hk.h")
	public boolean[] blockflags;

	@ObfuscatedName("hk.a")
	public int[] mappings;

	@ObfuscatedName("hk.g")
	public WindowFunction[] field2066;

	@ObfuscatedName("hk.i")
	public int field2054;

	@ObfuscatedName("hk.j")
	public int field2068;

	@ObfuscatedName("hk.t")
	public boolean[] field2089;

	@ObfuscatedName("hk.ae")
	public WindowFunction[] field2070;

	@ObfuscatedName("hk.ag")
	public WindowFunction trigA0;

	@ObfuscatedName("hk.ah")
	public WindowFunction trigB0;

	@ObfuscatedName("hk.al")
	public WindowFunction trigC0;

	@ObfuscatedName("hk.ac")
	public WindowFunction trigA1;

	@ObfuscatedName("hk.ai")
	public WindowFunction trigB1;

	@ObfuscatedName("hk.aw")
	public WindowFunction trigC1;

	@ObfuscatedName("hk.as")
	public int[] bitReverse0;

	@ObfuscatedName("hk.at")
	public int[] bitReverse1;

	@ObfuscatedName("hk.ad")
	public boolean field2090;

	@ObfuscatedName("hk.am")
	public List field2085 = new ArrayList();

	@ObfuscatedName("hk.au")
	public Packet field2112 = null;

	@ObfuscatedName("hk.ar")
	public int field2082 = 0;

	@ObfuscatedName("hk.ap")
	public int field2084 = 0;

	@ObfuscatedName("hk.aq")
	public List field2078 = new ArrayList();

	@ObfuscatedName("hk.ax")
	public boolean field2044;

	@ObfuscatedName("hk.av")
	public boolean field2086;

	@ObfuscatedName("hk.ao")
	public boolean field2087;

	@ObfuscatedName("hk.aj")
	public int field2088;

	@ObfuscatedName("hk.ay")
	public int field2079;

	@ObfuscatedName("hk.ab")
	public int field2107;

	@ObfuscatedName("hk.az")
	public int field2083;

	@ObfuscatedName("hk.aa")
	public boolean field2092;

	@ObfuscatedName("hk.af")
	public int field2093;

	@ObfuscatedName("hk.ak")
	public int field2094;

	@ObfuscatedName("hk.an")
	public int field2095;

	@ObfuscatedName("hk.bf")
	public int field2096;

	@ObfuscatedName("hk.bl")
	public int field2097;

	@ObfuscatedName("hk.bk")
	public List field2098 = new ArrayList();

	@ObfuscatedName("hk.bh")
	public List field2099 = new ArrayList();

	@ObfuscatedName("hk.bx")
	public AtomicReference field2100 = new AtomicReference(null);

	@ObfuscatedName("hk.bd")
	public int field2101;

	@ObfuscatedName("hk.bc")
	public int field2102 = 0;

	@ObfuscatedName("hk.bi")
	public WindowFunction[] field2103;

	@ObfuscatedName("hk.bn")
	public boolean field2104 = false;

	@ObfuscatedName("hk.bt")
	public int field2105 = 0;

	@ObfuscatedName("hk.bq")
	public static List field2057 = new ArrayList();

	@ObfuscatedName("hk.bm")
	public static SoftLruHashTable field2067 = new SoftLruHashTable(524288, 1024);

	@ObfuscatedName("hk.bb")
	public byte[] field2108;

	@ObfuscatedName("hk.be")
	public int field2109;

	@ObfuscatedName("hk.by")
	public int field2113;

	@ObfuscatedName("hk.bu")
	public boolean[] field2111 = null;

	@ObfuscatedName("hk.bw")
	public boolean[] field2047 = null;

	@ObfuscatedName("hk.bo")
	public boolean[] field2080 = null;

	public VorbisSound(float arg0) {
		this.field2059 = arg0;
		this.field2052 = AudioFormat.field3441;
		this.field2053 = AudioEndianness.LITTLE;
		this.method3744(false);
	}

	@ObfuscatedName("hk.e(Z)V")
	public void method3721(boolean arg0) {
		if (!arg0) {
			this.method3738();
		} else if (this.method3843() == VorbisRelated.field3426) {
			this.method3744(true);
			this.method3840(VorbisRelated.field3422);
		}
	}

	@ObfuscatedName("hk.n()V")
	public void method3738() {
		if (this.method3843() == VorbisRelated.field3423) {
			this.method3744(false);
			this.method3840(VorbisRelated.field3421);
		} else {
			this.method3744(false);
			this.method3840(VorbisRelated.field3427);
		}
	}

	@ObfuscatedName("hk.m()Lmc;")
	public VorbisRelated method3843() {
		return this.field2106;
	}

	@ObfuscatedName("hk.k(Lmc;)V")
	public void method3840(VorbisRelated arg0) {
		this.field2106 = arg0;
	}

	@ObfuscatedName("hk.f(Lmm;)V")
	public void method3770(VorbisInterface2 arg0) {
		this.field2049 = arg0;
	}

	@ObfuscatedName("hk.w(Lalw;)V")
	public void method3726(Packet arg0) {
		if (this.method3843() == VorbisRelated.field3425 || this.method3843() == VorbisRelated.field3426) {
			if (arg0 != null) {
				arg0.release();
			}
		} else if (arg0 == null) {
			boolean var2 = this.field2104 && (this.field2096 > 0 && this.field2097 < this.field2096 || this.field2096 < 0);
			if (this.field2078.isEmpty()) {
				if (!var2) {
					this.method3756();
					this.method3840(VorbisRelated.field3426);
				}
			} else if (!var2) {
				this.method3756();
				this.method3840(VorbisRelated.field3425);
			}
			if (var2) {
				this.method3744(true);
			}
		} else {
			this.method3762(arg0);
		}
	}

	@ObfuscatedName("hk.l()V")
	public void method3727() {
		if (this.method3843() == VorbisRelated.field3421 || this.method3843() == VorbisRelated.field3427 || this.method3843() == VorbisRelated.field3422) {
			this.method3840(VorbisRelated.field3423);
			this.method3745();
		}
	}

	@ObfuscatedName("hk.u(I)Lalw;")
	public Packet method3728(int arg0) {
		return this.method3768(arg0);
	}

	@ObfuscatedName("hk.z()I")
	public int method3729() {
		return this.method3780();
	}

	@ObfuscatedName("hk.p(I)I")
	public int method3730(int arg0) {
		return arg0 / (this.method3733().field3445 / 8);
	}

	@ObfuscatedName("hk.d(I)I")
	public int method3731(int arg0) {
		return arg0 * (this.method3733().field3445 / 8);
	}

	@ObfuscatedName("hk.c()I")
	public int method3732() {
		if (!this.method3868()) {
			throw new RuntimeException("");
		}
		return this.field2076;
	}

	@ObfuscatedName("hk.r()Lnd;")
	public AudioFormat method3733() {
		return this.field2052;
	}

	@ObfuscatedName("hk.v()Lmw;")
	public AudioEndianness method3734() {
		return this.field2053;
	}

	@ObfuscatedName("hk.o(ILnd;Lmw;I)V")
	public void method3774(int arg0, AudioFormat arg1, AudioEndianness arg2, int arg3) {
		this.field2081 = arg3;
		if (!this.method3723(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.field2052 = arg1;
		this.field2053 = arg2;
	}

	@ObfuscatedName("hk.s(ILnd;Lmw;)Z")
	public boolean method3723(int arg0, AudioFormat arg1, AudioEndianness arg2) {
		if (AudioFormat.field3441 == arg1) {
			return true;
		} else if (AudioFormat.field3442 == arg1) {
			return true;
		} else if (AudioFormat.field3440 == arg1) {
			return true;
		} else {
			return AudioFormat.field3443 == arg1;
		}
	}

	@ObfuscatedName("hk.y()I")
	public int method3849() {
		if (!this.field2086) {
			throw new RuntimeException("");
		}
		return this.field2045;
	}

	@ObfuscatedName("hk.q()I")
	public int method3722() {
		if (!this.field2086) {
			throw new RuntimeException("");
		}
		return this.method3849() < this.field2081 ? this.field2081 : this.method3849();
	}

	@ObfuscatedName("hk.x()Z")
	public synchronized boolean method3868() {
		return this.field2087;
	}

	@ObfuscatedName("hk.b(Z)V")
	public synchronized void method3740(boolean arg0) {
		this.field2087 = arg0;
	}

	@ObfuscatedName("hk.h(II)[Lhb;")
	public WindowFunction[] method3753(int arg0, int arg1) {
		WindowFunction[] var3 = new WindowFunction[arg0];
		for (int var4 = 0; var4 < var3.length; var4++) {
			var3[var4] = this.method3836(arg1);
		}
		return var3;
	}

	@ObfuscatedName("hk.a(I)Lhb;")
	public WindowFunction method3836(int arg0) {
		SoftLruHashTable var2 = field2067;
		synchronized (field2067) {
			Object var3 = null;
			WindowFunction var4 = (WindowFunction) field2067.method2950();
			WindowFunction var5 = null;
			int var6 = arg0;
			while (var4 != null) {
				if (var4.floor.length > arg0 && !var4.field2125 && (var5 == null || var4.floor.length < var6)) {
					var5 = var4;
					var6 = var4.floor.length;
				}
				if (var4.floor.length == arg0 && !var4.field2125) {
					break;
				}
				var4 = (WindowFunction) field2067.method2937();
			}
			if (var4 == null) {
				var4 = var5;
			}
			if (var4 == null) {
				var4 = new WindowFunction(this);
				int var7 = 0;
				boolean var8 = false;
				while (!var8 && var7 < 1000) {
					if (field2067.get((long) var7) == null) {
						var8 = true;
					} else {
						var7++;
					}
				}
				var4.field2124 = var7;
				float[] var9 = new float[arg0];
				var4.floor = var9;
				var4.field2125 = true;
				var4.field2122 = arg0;
				if (field2067.method2926() < arg0 * 4) {
				}
				field2067.put(var4, (long) var4.field2124, var9.length * 4);
			} else {
				for (int var10 = 0; var10 < var4.floor.length; var10++) {
					var4.floor[var10] = 0.0F;
				}
				var4.field2122 = arg0;
			}
			var4.field2125 = true;
			return var4;
		}
	}

	@ObfuscatedName("hk.g(Lhb;)V")
	public void method3742(WindowFunction arg0) {
		if (arg0 != null) {
			SoftLruHashTable var2 = field2067;
			synchronized (field2067) {
				arg0.field2125 = false;
			}
		}
	}

	@ObfuscatedName("hk.i([Lhb;)V")
	public void method3743(WindowFunction[] arg0) {
		if (arg0 != null) {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				this.method3742(arg0[var2]);
			}
		}
	}

	@ObfuscatedName("hk.j(Z)V")
	public synchronized void method3744(boolean arg0) {
		if (!arg0) {
			this.blockSize0 = 0;
			this.blockSize1 = 0;
			this.blockflags = null;
			this.mappings = null;
			this.method3743(this.field2103);
			this.field2103 = null;
			this.method3743(this.field2066);
			this.field2066 = null;
			this.field2054 = 0;
			this.field2068 = 0;
			this.field2089 = null;
			this.method3743(this.field2070);
			this.field2070 = null;
			this.method3742(this.trigA0);
			this.method3742(this.trigB0);
			this.method3742(this.trigC0);
			this.method3742(this.trigA1);
			this.method3742(this.trigB1);
			this.method3742(this.trigC1);
			this.trigA0 = null;
			this.trigB0 = null;
			this.trigC0 = null;
			this.trigA1 = null;
			this.trigB1 = null;
			this.trigC1 = null;
			this.bitReverse0 = null;
			this.bitReverse1 = null;
		}
		this.field2101 = 0;
		Iterator var2 = this.field2085.iterator();
		while (var2.hasNext()) {
			Packet var3 = (Packet) var2.next();
			var3.release();
		}
		this.field2085.clear();
		this.field2090 = false;
		if (this.field2112 != null) {
			Packet var4 = this.field2112;
			synchronized (this.field2112) {
				this.field2112.release();
				this.field2112 = null;
			}
		}
		this.field2082 = 0;
		this.field2084 = 0;
		if (!arg0) {
			List var6 = this.field2078;
			synchronized (this.field2078) {
				Iterator var7 = this.field2078.iterator();
				while (true) {
					if (!var7.hasNext()) {
						this.field2078.clear();
						break;
					}
					Packet var8 = (Packet) var7.next();
					var8.release();
				}
			}
			this.field2105 = 0;
		}
		List var10 = this.field2050;
		synchronized (this.field2050) {
			Iterator var11 = this.field2050.iterator();
			while (true) {
				if (!var11.hasNext()) {
					this.field2050.clear();
					break;
				}
				Packet var12 = (Packet) var11.next();
				var12.release();
			}
		}
		this.field2044 = false;
		this.field2088 = 0;
		this.field2083 = -1;
		this.field2095 = -1;
		if (arg0) {
			this.field2097++;
			this.field2092 = true;
			return;
		}
		this.method3740(false);
		this.field2086 = false;
		this.field2110 = -1;
		this.field2056 = -1;
		this.field2096 = 0;
		this.field2097 = 0;
		this.field2079 = -1;
		this.field2107 = -1;
		this.field2093 = -1;
		this.field2094 = -1;
		this.field2092 = false;
		this.field2104 = false;
	}

	@ObfuscatedName("hk.t()V")
	public void method3745() {
		if (this.method3843() != VorbisRelated.field3425) {
			this.method3761();
			if (this.method3843() == VorbisRelated.field3423) {
				this.method3840(VorbisRelated.field3422);
			}
		}
	}

	@ObfuscatedName("hk.ae(Lalw;)V")
	public void method3871(Packet arg0) {
		this.field2085.add(arg0);
	}

	@ObfuscatedName("hk.ag()Z")
	public boolean method3747() {
		return this.field2090;
	}

	@ObfuscatedName("hk.ah(Lalw;)Z")
	public boolean method3748(Packet arg0) {
		return arg0.g1() == 79 && arg0.g1() == 103 && arg0.g1() == 103 && arg0.g1() == 83;
	}

	@ObfuscatedName("hk.al([BII)Z")
	public boolean method3749(byte[] arg0, int arg1, int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hk.ac(I)F")
	public float float32Unpack(int x) {
		int mantissa = x & 0x1FFFFF;
		int sign = x & Integer.MIN_VALUE;
		int exponent = x >> 21 & 0x3FF;
		if (sign != 0) {
			mantissa = -mantissa;
		}
		return (float) ((double) mantissa * Math.pow(2.0D, exponent - 788));
	}

	@ObfuscatedName("hk.ai()I")
	public int method3751() {
		return this.field2109;
	}

	@ObfuscatedName("hk.aw()I")
	public int method3752() {
		return this.field2113;
	}

	@ObfuscatedName("hk.as([BI)V")
	public void method3754(byte[] arg0, int arg1) {
		this.field2108 = arg0;
		this.field2109 = arg1;
		this.field2113 = 0;
	}

	@ObfuscatedName("hk.at()I")
	public int readBit() {
		int var1 = this.field2108[this.field2109] >> this.field2113 & 0x1;
		this.field2113++;
		this.field2109 += this.field2113 >> 3;
		this.field2113 &= 0x7;
		return var1;
	}

	@ObfuscatedName("hk.ad(I)I")
	public int read(int bits) {
		int var2 = 0;
		int var3 = 0;
		while (bits >= 8 - this.field2113) {
			int var4 = 8 - this.field2113;
			int var5 = (0x1 << var4) - 1;
			var2 += (this.field2108[this.field2109] >> this.field2113 & var5) << var3;
			this.field2113 = 0;
			this.field2109++;
			var3 += var4;
			bits -= var4;
		}
		if (bits > 0) {
			int var6 = (0x1 << bits) - 1;
			var2 += (this.field2108[this.field2109] >> this.field2113 & var6) << var3;
			this.field2113 += bits;
		}
		return var2;
	}

	@ObfuscatedName("hk.am()V")
	public void method3756() {
		this.field2108 = null;
	}

	@ObfuscatedName("hk.au()V")
	public void unpackBooks() {
		int books = this.read(8) + 1;

		Iterator var2 = field2057.iterator();
		LookResidue0 var3;

		do {
			if (!var2.hasNext()) {
				this.book_param = new VorbisCodebook[books];

				for (int i = 0; i < books; i++) {
					if (this.book_param[i] == null) {
						this.book_param[i] = new VorbisCodebook();
					}

					this.book_param[i].unpack(this);
				}

				LookResidue0 var6 = new LookResidue0(this.field2045, this.field2076, this.field2046, this.field2048, this.field2055, this.book_param);
				field2057.add(var6);
				return;
			}

			var3 = (LookResidue0) var2.next();
		} while (var3.field2040 != 0 || var3.field2043 != 0 || var3.books.length != books || this.field2045 != var3.field2039 || this.field2076 != var3.field2041 || this.field2055 != var3.field2042);

		this.book_param = var3.books;

		for (int i = 0; i < this.book_param.length; i++) {
			this.book_param[i].method3880(this);
		}
	}

	@ObfuscatedName("hk.ar([BI)V")
	public void unpack(byte[] arg0, int arg1) {
		this.field2101 = 0;

		if (this.method3868()) {
			return;
		}

		if (arg0 == null) {
			throw new RuntimeException("");
		}

		byte var3 = 0;
		byte var4;
		if (this.method3749(arg0, arg1, 1)) {
			var4 = 1;
		} else if (this.method3749(arg0, arg1, 3)) {
			var4 = 3;
		} else if (this.method3749(arg0, arg1, 5)) {
			var4 = 5;
		} else {
			throw new RuntimeException("" + var3);
		}

		if (var4 == 1) {
			this.method3754(arg0, arg1 + 7);
			int var5 = this.read(32);
			this.field2045 = this.read(8);
			this.field2076 = this.read(32);
			this.field2046 = this.read(32);
			this.field2055 = this.read(32);
			this.field2048 = this.read(32);
			this.blockSize0 = 0x1 << this.read(4);
			this.blockSize1 = 0x1 << this.read(4);

			int var6 = 0x1 << this.read(1);
			if (var5 != 0 || var6 == 0) {
				throw new RuntimeException("");
			}

			this.field2086 = true;
			this.field2083++;
		} else if (var4 != 3 && var4 == 5) {
			if (!this.method3749(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}

			this.method3754(arg0, arg1 + 7);
			if (this.field2070 != null) {
				this.method3743(this.field2070);
				this.field2070 = null;
			}

			this.field2070 = this.method3753(this.field2045, this.blockSize1);
			for (int var7 = 0; var7 < 2; var7++) {
				int var8 = var7 == 0 ? this.blockSize0 : this.blockSize1;
				int var9 = var8 >> 1;
				int var10 = var8 >> 2;
				int var11 = var8 >> 3;

				WindowFunction var12 = this.method3836(var9);
				for (int var13 = 0; var13 < var10; var13++) {
					var12.floor[var13 * 2] = (float) Math.cos((double) (var13 * 4) * 3.141592653589793D / (double) var8);
					var12.floor[var13 * 2 + 1] = -((float) Math.sin((double) (var13 * 4) * 3.141592653589793D / (double) var8));
				}

				WindowFunction var14 = this.method3836(var9);
				for (int var15 = 0; var15 < var10; var15++) {
					var14.floor[var15 * 2] = (float) Math.cos((double) (var15 * 2 + 1) * 3.141592653589793D / (double) (var8 * 2));
					var14.floor[var15 * 2 + 1] = (float) Math.sin((double) (var15 * 2 + 1) * 3.141592653589793D / (double) (var8 * 2));
				}

				WindowFunction var16 = this.method3836(var10);
				for (int var17 = 0; var17 < var11; var17++) {
					var16.floor[var17 * 2] = (float) Math.cos((double) (var17 * 4 + 2) * 3.141592653589793D / (double) var8);
					var16.floor[var17 * 2 + 1] = -((float) Math.sin((double) (var17 * 4 + 2) * 3.141592653589793D / (double) var8));
				}

				int[] var18 = new int[var11];
				int var19 = IntMath.ilog(var11 - 1);
				for (int var20 = 0; var20 < var11; var20++) {
					var18[var20] = IntMath.bitReverse(var20, var19);
				}

				if (var7 == 0) {
					this.trigA0 = var12;
					this.trigB0 = var14;
					this.trigC0 = var16;
					this.bitReverse0 = var18;
				} else {
					this.trigA1 = var12;
					this.trigB1 = var14;
					this.trigC1 = var16;
					this.bitReverse1 = var18;
				}
			}

			this.unpackBooks();

			int times = this.read(6) + 1;
			for (int i = 0; i < times; i++) {
				this.read(16);
			}

			int floors = this.read(6) + 1;
			if (this.floor_param == null || this.floor_param.length != floors) {
				this.floor_param = new VorbisFloor[floors];
			}

			for (int i = 0; i < floors; i++) {
				if (this.floor_param[i] == null) {
					this.floor_param[i] = new VorbisFloor();
				}

				this.floor_param[i].unpack(this, this.field2045);
			}

			int residues = this.read(6) + 1;
			if (this.residue_param == null || this.residue_param.length != residues) {
				this.residue_param = new VorbisResidue[residues];
			}

			for (int i = 0; i < residues; i++) {
				if (this.residue_param[i] == null) {
					this.residue_param[i] = new VorbisResidue();
				}

				this.residue_param[i].unpack(this);
			}

			int maps = this.read(6) + 1;
			if (this.map_param == null || this.map_param.length != maps) {
				this.map_param = new VorbisMapping[maps];
			}

			for (int i = 0; i < maps; i++) {
				if (this.map_param[i] == null) {
					this.map_param[i] = new VorbisMapping();
				}

				this.map_param[i].unpack(this);
			}

			int modes = this.read(6) + 1;
			this.blockflags = new boolean[modes];
			this.mappings = new int[modes];

			for (int i = 0; i < modes; i++) {
				this.blockflags[i] = this.readBit() != 0;
				this.read(16); // windowtype
				this.read(16); // transformtype
				this.mappings[i] = this.read(8);
			}

			this.method3740(true);
		}
	}

	@ObfuscatedName("hk.ap(I)I")
	public int method3759(int arg0) {
		int var2 = 0;
		while (arg0 > 0) {
			var2++;
			arg0 >>= 0x1;
		}
		return var2;
	}

	@ObfuscatedName("hk.aq([BIILjava/util/concurrent/atomic/AtomicReference;)Z")
	public boolean method3776(byte[] arg0, int arg1, int arg2, AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method3754(arg0, arg1);
			int var5 = this.readBit();
			if (var5 != 0) {
				this.unpack(arg0, arg1);
				return false;
			} else if (this.method3868()) {
				int var6 = this.read(this.method3759(this.mappings.length - 1));
				boolean var7 = this.blockflags[var6];
				int var8 = var7 ? this.blockSize1 : this.blockSize0;
				boolean var9 = false;
				boolean var10 = false;
				if (var7) {
					var9 = this.readBit() != 0;
					var10 = this.readBit() != 0;
				}
				int var11 = var8 >> 1;
				int var12;
				int var13;
				int var14;
				if (var7 && !var9) {
					var12 = (var8 >> 2) - (this.blockSize0 >> 2);
					var13 = (this.blockSize0 >> 2) + (var8 >> 2);
					var14 = this.blockSize0 >> 1;
				} else {
					var12 = 0;
					var13 = var11;
					var14 = var8 >> 1;
				}
				int var15;
				int var16;
				int var17;
				if (var7 && !var10) {
					var15 = var8 - (var8 >> 2) - (this.blockSize0 >> 2);
					var16 = (this.blockSize0 >> 2) + (var8 - (var8 >> 2));
					var17 = this.blockSize0 >> 1;
				} else {
					var15 = var11;
					var16 = var8;
					var17 = var8 >> 1;
				}
				VorbisMapping var18 = this.map_param[this.mappings[var6]];
				if (this.field2111 == null || this.field2111.length != this.field2045) {
					this.field2111 = new boolean[this.field2045];
					this.field2047 = new boolean[this.field2045];
				}
				for (int var19 = 0; var19 < this.field2045; var19++) {
					int var20 = var18.mux == null ? 0 : var18.mux[var19];
					int var22 = var18.submapFloor[var20];
					this.field2111[var19] = !this.floor_param[var22].method3687(var19);
					this.field2047[var19] = this.field2111[var19];
				}
				for (int var23 = 0; var23 < var18.field2132; var23++) {
					if (!this.field2111[var18.field2127[var23]] || !this.field2111[var18.field2133[var23]]) {
						this.field2111[var18.field2127[var23]] = false;
						this.field2111[var18.field2133[var23]] = false;
					}
				}
				if (this.field2080 == null || this.field2080.length != this.field2045) {
					this.field2080 = new boolean[this.field2045];
				}
				for (int var24 = 0; var24 < var18.submaps; var24++) {
					int var25 = 0;
					for (int var26 = 0; var26 < this.field2045; var26++) {
						int var27 = var18.mux == null ? var24 : var18.mux[var26];
						if (var24 == var27) {
							this.field2080[var25++] = this.field2111[var26];
						}
					}
					VorbisResidue var28 = this.residue_param[var18.submapResidue[var24]];
					Object var29 = null;
					WindowFunction[] var35;
					if (var28.field2019 == 2) {
						WindowFunction[] var30 = this.method3753(1, this.field2045 * var8);
						int var31 = 0;
						while (true) {
							if (var31 >= var8) {
								WindowFunction[] var34 = var28.method3676(var30, var8 >> 1, this.field2080);
								var35 = this.field2070;
								for (int var36 = 0; var36 < var8; var36++) {
									for (int var37 = 0; var37 < this.field2045; var37++) {
										try {
											var35[var37].floor[var36] = var34[0].floor[this.field2045 * var36 + var37];
										} catch (ArrayIndexOutOfBoundsException var133) {
											var133.printStackTrace();
										}
									}
								}
								this.method3743(var34);
								Object var39 = null;
								break;
							}
							for (int var32 = 0; var32 < this.field2045; var32++) {
								try {
									var30[0].floor[this.field2045 * var31 + var32] = this.field2070[var32].floor[var31];
								} catch (ArrayIndexOutOfBoundsException var134) {
									var134.printStackTrace();
								}
							}
							var31++;
						}
					} else {
						var35 = var28.method3676(this.field2070, var8 >> 1, this.field2080);
					}
					if (var18.mux == null) {
						if (this.field2070 != var35) {
							this.method3743(this.field2070);
						}
						this.field2070 = var35;
					} else {
						int var40 = 0;
						for (int var41 = 0; var41 < this.field2045; var41++) {
							int var42 = var18.mux[var41];
							if (var24 == var42) {
								this.field2070[var41] = var35[var40++];
							}
						}
					}
				}
				for (int var43 = var18.field2132 - 1; var43 >= 0; var43--) {
					WindowFunction var44 = this.field2070[var18.field2127[var43]];
					WindowFunction var45 = this.field2070[var18.field2133[var43]];
					for (int var46 = 0; var46 < var44.field2122; var46++) {
						float var47 = var44.floor[var46];
						float var48 = var45.floor[var46];
						float var51;
						float var52;
						if (var47 > 0.0F) {
							if (var48 > 0.0F) {
								var51 = var47;
								var52 = var47 - var48;
							} else {
								var52 = var47;
								var51 = var47 + var48;
							}
						} else if (var48 > 0.0F) {
							var51 = var47;
							var52 = var47 + var48;
						} else {
							var52 = var47;
							var51 = var47 - var48;
						}
						var44.floor[var46] = var51;
						var45.floor[var46] = var52;
					}
				}
				for (int var53 = 0; var53 < this.field2111.length; var53++) {
					this.field2111[var53] = this.field2047[var53];
				}
				for (int var54 = 0; var54 < this.field2045; var54++) {
					if (!this.field2111[var54]) {
						int var55 = var18.mux == null ? 0 : var18.mux[var54];
						int var57 = var18.submapFloor[var55];
						this.floor_param[var57].method3688(var54);
						this.floor_param[var57].method3689(this.field2070[var54], var8 >> 1, var54);
					}
				}
				for (int var58 = 0; var58 < this.field2045; var58++) {
					if (this.field2111[var58]) {
						for (int var59 = var8 >> 1; var59 < var8; var59++) {
							this.field2070[var58].floor[var59] = 0.0F;
						}
					} else {
						int var60 = var8 >> 1;
						int var61 = var8 >> 2;
						int var62 = var8 >> 3;
						WindowFunction var63 = this.field2070[var58];
						for (int var64 = 0; var64 < var60; var64++) {
							var63.floor[var64] *= 0.5F;
						}
						for (int var65 = var60; var65 < var8; var65++) {
							var63.floor[var65] = -var63.floor[var8 - var65 - 1];
						}
						WindowFunction var66 = var7 ? this.trigA1 : this.trigA0;
						WindowFunction var67 = var7 ? this.trigB1 : this.trigB0;
						WindowFunction var68 = var7 ? this.trigC1 : this.trigC0;
						int[] var69 = var7 ? this.bitReverse1 : this.bitReverse0;
						for (int var70 = 0; var70 < var61; var70++) {
							float var71 = var63.floor[var70 * 4] - var63.floor[var8 - var70 * 4 - 1];
							float var72 = var63.floor[var70 * 4 + 2] - var63.floor[var8 - var70 * 4 - 3];
							float var73 = var66.floor[var70 * 2];
							float var74 = var66.floor[var70 * 2 + 1];
							var63.floor[var8 - var70 * 4 - 1] = var71 * var73 - var72 * var74;
							var63.floor[var8 - var70 * 4 - 3] = var71 * var74 + var72 * var73;
						}
						for (int var75 = 0; var75 < var62; var75++) {
							float var76 = var63.floor[var75 * 4 + var60 + 3];
							float var77 = var63.floor[var75 * 4 + var60 + 1];
							float var78 = var63.floor[var75 * 4 + 3];
							float var79 = var63.floor[var75 * 4 + 1];
							var63.floor[var75 * 4 + var60 + 3] = var76 + var78;
							var63.floor[var75 * 4 + var60 + 1] = var77 + var79;
							float var80 = var66.floor[var60 - 4 - var75 * 4];
							float var81 = var66.floor[var60 - 3 - var75 * 4];
							var63.floor[var75 * 4 + 3] = (var76 - var78) * var80 - (var77 - var79) * var81;
							var63.floor[var75 * 4 + 1] = (var76 - var78) * var81 + (var77 - var79) * var80;
						}
						int var82 = IntMath.ilog(var8 - 1);
						for (int var83 = 0; var83 < var82 - 3; var83++) {
							int var84 = var8 >> var83 + 2;
							int var85 = 0x8 << var83;
							for (int var86 = 0; var86 < 0x2 << var83; var86++) {
								int var87 = var8 - var84 * 2 * var86;
								int var88 = var8 - (var86 * 2 + 1) * var84;
								for (int var89 = 0; var89 < var8 >> var83 + 4; var89++) {
									int var90 = var89 * 4;
									float var91 = var63.floor[var87 - 1 - var90];
									float var92 = var63.floor[var87 - 3 - var90];
									float var93 = var63.floor[var88 - 1 - var90];
									float var94 = var63.floor[var88 - 3 - var90];
									var63.floor[var87 - 1 - var90] = var91 + var93;
									var63.floor[var87 - 3 - var90] = var92 + var94;
									float var95 = var66.floor[var85 * var89];
									float var96 = var66.floor[var85 * var89 + 1];
									var63.floor[var88 - 1 - var90] = (var91 - var93) * var95 - (var92 - var94) * var96;
									var63.floor[var88 - 3 - var90] = (var91 - var93) * var96 + (var92 - var94) * var95;
								}
							}
						}
						for (int var97 = 1; var97 < var62 - 1; var97++) {
							int var98 = var69[var97];
							if (var97 < var98) {
								int var99 = var97 * 8;
								int var100 = var98 * 8;
								float var101 = var63.floor[var99 + 1];
								var63.floor[var99 + 1] = var63.floor[var100 + 1];
								var63.floor[var100 + 1] = var101;
								float var102 = var63.floor[var99 + 3];
								var63.floor[var99 + 3] = var63.floor[var100 + 3];
								var63.floor[var100 + 3] = var102;
								float var103 = var63.floor[var99 + 5];
								var63.floor[var99 + 5] = var63.floor[var100 + 5];
								var63.floor[var100 + 5] = var103;
								float var104 = var63.floor[var99 + 7];
								var63.floor[var99 + 7] = var63.floor[var100 + 7];
								var63.floor[var100 + 7] = var104;
							}
						}
						for (int var105 = 0; var105 < var60; var105++) {
							var63.floor[var105] = var63.floor[var105 * 2 + 1];
						}
						for (int var106 = 0; var106 < var62; var106++) {
							var63.floor[var8 - 1 - var106 * 2] = var63.floor[var106 * 4];
							var63.floor[var8 - 2 - var106 * 2] = var63.floor[var106 * 4 + 1];
							var63.floor[var8 - var61 - 1 - var106 * 2] = var63.floor[var106 * 4 + 2];
							var63.floor[var8 - var61 - 2 - var106 * 2] = var63.floor[var106 * 4 + 3];
						}
						for (int var107 = 0; var107 < var62; var107++) {
							float var108 = var68.floor[var107 * 2];
							float var109 = var68.floor[var107 * 2 + 1];
							float var110 = var63.floor[var107 * 2 + var60];
							float var111 = var63.floor[var107 * 2 + var60 + 1];
							float var112 = var63.floor[var8 - 2 - var107 * 2];
							float var113 = var63.floor[var8 - 1 - var107 * 2];
							float var114 = (var110 - var112) * var109 + (var111 + var113) * var108;
							var63.floor[var107 * 2 + var60] = (var110 + var112 + var114) * 0.5F;
							var63.floor[var8 - 2 - var107 * 2] = (var110 + var112 - var114) * 0.5F;
							float var115 = (var111 + var113) * var109 - (var110 - var112) * var108;
							var63.floor[var107 * 2 + var60 + 1] = (var111 - var113 + var115) * 0.5F;
							var63.floor[var8 - 1 - var107 * 2] = (-var111 + var113 + var115) * 0.5F;
						}
						for (int var116 = 0; var116 < var61; var116++) {
							var63.floor[var116] = var67.floor[var116 * 2] * var63.floor[var116 * 2 + var60] + var67.floor[var116 * 2 + 1] * var63.floor[var116 * 2 + 1 + var60];
							var63.floor[var60 - 1 - var116] = var63.floor[var116 * 2 + var60] * var67.floor[var116 * 2 + 1] - var67.floor[var116 * 2] * var63.floor[var116 * 2 + 1 + var60];
						}
						for (int var117 = 0; var117 < var61; var117++) {
							var63.floor[var8 - var61 + var117] = -var63.floor[var117];
						}
						for (int var118 = 0; var118 < var61; var118++) {
							var63.floor[var118] = var63.floor[var61 + var118];
						}
						for (int var119 = 0; var119 < var61; var119++) {
							var63.floor[var61 + var119] = -var63.floor[var61 - var119 - 1];
						}
						for (int var120 = 0; var120 < var61; var120++) {
							var63.floor[var60 + var120] = var63.floor[var8 - var120 - 1];
						}
						for (int var121 = var12; var121 < var13; var121++) {
							float var122 = (float) Math.sin(((double) (var121 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D);
							this.field2070[var58].floor[var121] *= (float) Math.sin((double) var122 * 1.5707963267948966D * (double) var122);
						}
						for (int var123 = var15; var123 < var16; var123++) {
							float var124 = (float) Math.sin(((double) (var123 - var15) + 0.5D) / (double) var17 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.field2070[var58].floor[var123] *= (float) Math.sin((double) var124 * 1.5707963267948966D * (double) var124);
						}
					}
				}
				WindowFunction[] var125 = null;
				if (this.field2054 > 0) {
					int var126 = this.field2054 + var8 >> 2;
					var125 = this.method3753(this.field2045, var126);
					for (int var127 = 0; var127 < this.field2045; var127++) {
						if (!this.field2089[var127]) {
							for (int var128 = 0; var128 < this.field2068; var128++) {
								int var129 = (this.field2054 >> 1) + var128;
								var125[var127].floor[var128] += this.field2066[var127].floor[var129];
							}
						}
						if (!this.field2111[var127]) {
							for (int var130 = var12; var130 < var8 >> 1; var130++) {
								int var131 = var125[var127].field2122 - (var8 >> 1) + var130;
								var125[var127].floor[var131] += this.field2070[var127].floor[var130];
							}
						}
					}
				}
				WindowFunction[] var132 = this.field2066;
				this.field2066 = this.field2070;
				this.field2070 = var132;
				this.field2054 = var8;
				this.field2068 = var16 - (var8 >> 1);
				this.field2089 = this.field2111;
				arg3.set(var125);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("hk.ax()V")
	public void method3761() {
		if (this.method3843() == VorbisRelated.field3421 || (this.method3843() == VorbisRelated.field3424 || this.field2087 && (float) (this.field2105 / this.method3732()) > this.field2059)) {
			return;
		}
		if (!this.method3747()) {
			Packet var1 = (Packet) (this.field2050 == null || this.field2050.isEmpty() ? null : this.field2050.get(0));
			if (var1 == null) {
				if (!this.field2044) {
					this.method3840(VorbisRelated.field3424);
					this.field2049.method5932();
					this.field2044 = true;
				}
				return;
			}
			this.field2044 = false;
			this.field2090 = true;
			this.field2050.remove(0);
			this.method3871(var1);
		}
		this.method3842();
	}

	@ObfuscatedName("hk.av(Lalw;)V")
	public synchronized void method3762(Packet arg0) {
		this.field2050.add(arg0);
		this.method3840(VorbisRelated.field3422);
	}

	@ObfuscatedName("hk.ao()V")
	public synchronized void method3842() {
		int var1 = this.field2112 == null ? 0 : this.field2112.pos;
		int var2 = 0;
		Iterator var3 = this.field2085.iterator();
		while (var3.hasNext()) {
			Packet var4 = (Packet) var3.next();
			var2 += var4.pos;
		}
		if (this.field2112 == null) {
			this.field2112 = this.method3796(var2);
			this.field2082 = 0;
			var1 = 0;
		} else if (this.field2112.data.length - this.field2112.pos < var2) {
			Packet var5 = this.method3796(this.field2082 + var2);
			var5.pdata(this.field2112.data, this.field2112.pos - this.field2084, this.field2082);
			this.field2112.release();
			this.field2112 = var5;
			var1 = this.field2084;
		}
		Iterator var6 = this.field2085.iterator();
		while (var6.hasNext()) {
			Packet var7 = (Packet) var6.next();
			this.field2112.pdata(var7.data, 0, var7.pos);
			this.field2082 += var7.pos;
			var7.release();
		}
		this.field2112.pos = var1 - this.field2084;
		this.field2084 = 0;
		this.field2085.clear();
		label286: while (true) {
			if (this.field2090) {
				if (this.field2112.pos < this.field2112.data.length) {
					if (this.field2087 && (float) (this.field2105 / this.method3732()) > this.field2059) {
						return;
					}
					if (this.field2112 != null && this.field2082 >= 27) {
						int var8 = this.field2112.pos;
						byte var9 = 0;
						int var10 = 0;
						if (!this.method3748(this.field2112)) {
							return;
						}
						this.field2095++;
						if (this.field2094 < 0) {
							this.field2093++;
						}
						this.field2098.clear();
						this.field2099.clear();
						this.field2112.g1();
						int var11 = this.field2112.g1();
						int var12 = this.field2112.g1() & 0xFF | (this.field2112.g1() & 0xFF) << 8 | (this.field2112.g1() & 0xFF) << 16 | this.field2112.g1() << 24;
						int var13 = var12 - var9;
						this.field2112.pos += 16;
						int var14 = this.field2112.g1();
						int var15 = this.field2112.pos;
						int var16 = var14 + var15;
						if (var16 > this.field2082 + var8) {
							this.field2112.pos = (this.field2082 + var8);
							this.field2084 = (this.field2112.pos - var8);
							this.field2090 = false;
						}
						int var17 = var16;
						int var18 = 0;
						if (this.field2090) {
							for (int var19 = 0; var19 < var14; var19++) {
								int var20 = this.field2112.data[var15++] & 0xFF;
								var16 += var20;
								var18 += var20;
								if (var16 > this.field2082 + var8) {
									this.field2112.pos = (this.field2082 + var8);
									this.field2084 = (this.field2112.pos - var8);
									this.field2090 = false;
									break;
								}
								if (var20 < 255) {
									this.field2098.add(var17);
									this.field2099.add(var18);
									var17 = var16;
									var18 = 0;
								}
							}
						}
						if (!this.field2090) {
							continue;
						}
						int var22 = -1;
						Iterator var23 = this.field2098.iterator();
						Iterator var24 = this.field2099.iterator();
						boolean var25 = false;
						this.field2102 = 0;
						while (true) {
							while (var23.hasNext()) {
								Integer var26 = (Integer) var23.next();
								Integer var27 = (Integer) var24.next();
								var22++;
								if (this.method3868() && this.field2092 && this.field2095 < this.field2093 && var22 < this.field2094) {
									this.field2088 += var25 ? 0 : var13;
									var25 = true;
								} else {
									this.field2100.set(null);
									boolean var28 = this.method3776(this.field2112.data, var26, var27, this.field2100);
									WindowFunction[] var29 = (WindowFunction[]) this.field2100.get();
									if (!var28 || this.field2092 && this.field2095 < this.field2093 && var22 < this.field2094) {
										if (this.method3868()) {
											this.field2054 = 0;
											if (this.field2066 == null || this.field2066 != null && (this.field2066.length != this.field2045 || this.field2066[0].field2122 != this.blockSize1)) {
												if (this.field2066 != null) {
													this.method3743(this.field2066);
												}
												this.field2066 = this.method3753(this.field2045, this.blockSize1);
											}
										}
									} else if (var29 != null) {
										int var30 = var29[0].field2122;
										this.field2101 += var30;
										if (this.field2101 > var12 && var11 == 4) {
											this.field2102 = this.field2101 - var12 - this.field2102;
											var30 -= this.field2102;
											if (this.field2102 > var29[0].field2122) {
												this.field2102 = var29[0].field2122;
											}
											if (var30 < 0) {
												var30 = 0;
											}
										}
										int var31 = 0;
										int var32 = this.method3731(var30) * var29.length;
										if (this.field2092 && this.field2088 < this.field2110) {
											int var33 = var32;
											var32 -= this.method3731(this.field2110 - this.field2088);
											if (var32 <= 0) {
												this.field2088 += this.method3730(var33);
												this.method3743(var29);
												Object var34 = null;
												continue;
											}
											var31 += this.field2110 - this.field2088;
										}
										if (this.field2088 + var30 > this.field2056 && (this.field2097 < this.field2096 || this.field2096 < 0) && this.field2104) {
											var32 -= this.method3731(this.field2088 + var30 - this.field2056 - 1);
											if (var32 <= 0) {
												this.method3743(var29);
												Object var35 = null;
												continue;
											}
										}
										int var36 = this.method3722();
										if (this.method3849() < this.method3722()) {
											int var37 = this.method3722() - this.method3849();
											var32 += var32 / this.method3849() * var37;
										}
										Packet var38 = this.method3796(var32);
										for (int var39 = var31; var39 < var30; var39++) {
											boolean var40 = this.field2092;
											if (this.field2096 != 0) {
												if (this.field2110 == this.field2088) {
													if (this.field2079 < 0) {
														this.field2079 = this.field2083;
														this.field2094 = var22;
													}
													this.field2092 = false;
												}
												if (this.field2088 == this.field2056 && this.field2107 < 0) {
													this.field2107 = this.field2083;
												}
												if (this.field2088 > this.field2056 && (this.field2097 < this.field2096 || this.field2096 < 0) && this.field2104) {
													var40 = true;
												}
											}
											if (var40 && (this.field2088 < this.field2110 || this.field2088 > this.field2056)) {
												this.field2088++;
												var10++;
												if (var10 > var13) {
													throw new RuntimeException();
												}
											} else {
												for (int var41 = 0; var41 < var36; var41++) {
													float var42;
													if (var41 < var29.length) {
														var42 = var29[var41].floor[var39];
													} else {
														var42 = var29[var41 % this.method3849()].floor[var39];
													}
													if (AudioFormat.field3441 == this.field2052) {
														int var43 = this.method3879(var42);
														if (AudioEndianness.LITTLE == this.field2053) {
															var38.ip2(var43);
														} else {
															var38.p2(var43);
														}
													} else if (AudioFormat.field3440 == this.field2052) {
														int var44 = this.method3765(var42);
														if (AudioEndianness.LITTLE == this.field2053) {
															var38.ip2(var44);
														} else {
															var38.p2(var44);
														}
													} else if (AudioFormat.field3442 == this.field2052) {
														int var45 = this.method3872(var42);
														var38.p1(var45);
													} else if (AudioFormat.field3443 == this.field2052) {
														int var46 = this.method3767(var42);
														var38.p1(var46);
													}
												}
												this.field2088++;
												var10++;
											}
										}
										List var47 = this.field2078;
										synchronized (this.field2078) {
											this.field2105 += this.method3730(var38.pos) / this.method3722();
											this.field2078.add(var38);
										}
									}
									this.method3743(var29);
									Object var49 = null;
								}
							}
							this.field2112.pos = var16;
							this.field2082 -= var16 - var8;
							continue label286;
						}
					}
					if (this.field2112 != null) {
						this.field2084 = this.field2082;
						this.field2112.pos += this.field2082;
					}
					this.field2090 = false;
					return;
				}
				this.field2090 = false;
			}
			return;
		}
	}

	@ObfuscatedName("hk.aj(F)I")
	public int method3879(float arg0) {
		int var2 = (int) (arg0 * 32767.0F);
		if (var2 > 32767) {
			return 32767;
		} else if (var2 < -32768) {
			return -32768;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hk.ay(F)I")
	public int method3765(float arg0) {
		int var2 = (int) (arg0 * 32767.0F + 32768.0F);
		if (var2 > 65535) {
			return 65535;
		} else if (var2 < 0) {
			return 0;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hk.ab(F)I")
	public int method3872(float arg0) {
		int var2 = (int) (arg0 * 127.0F);
		if (var2 > 127) {
			return 127;
		} else if (var2 < -128) {
			return -128;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hk.az(F)I")
	public int method3767(float arg0) {
		int var2 = (int) (arg0 * 127.0F + 128.0F);
		if (var2 > 255) {
			return 255;
		} else if (var2 < 0) {
			return 0;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hk.aa(I)Lalw;")
	public Packet method3768(int arg0) {
		Packet var2 = this.method3796(this.method3731(arg0));
		int var3 = arg0;
		List var4 = this.field2078;
		synchronized (this.field2078) {
			while (!this.field2078.isEmpty()) {
				Packet var5 = (Packet) this.field2078.remove(0);
				this.field2105 -= this.method3730(var5.pos) / this.method3722();
				int var6 = this.method3731(var3);
				int var7 = var5.pos < var6 ? var5.pos : var6;
				var2.pdata(var5.data, 0, var7);
				var3 -= this.method3730(var7);
				int var8 = var5.pos - var7;
				if (var8 == 0) {
					var5.release();
				} else {
					System.arraycopy(var5.data, var7, var5.data, 0, var8);
					var5.pos = var8;
					this.field2105 += this.method3730(var8) / this.method3722();
					this.field2078.add(0, var5);
				}
				if (var3 <= 0) {
					break;
				}
			}
			if (this.field2078.isEmpty() && this.method3843() == VorbisRelated.field3425) {
				this.method3840(VorbisRelated.field3426);
			}
			return var2;
		}
	}

	@ObfuscatedName("hk.af(I)Lalw;")
	public Packet method3796(int arg0) {
		return new Packet(arg0, true);
	}

	@ObfuscatedName("hk.ak()I")
	public int method3780() {
		return this.field2105;
	}

	// line 1316
	@ObfuscatedName("hk.an(ZIII)V")
	public void method3771(boolean arg0, int arg1, int arg2, int arg3) {
		this.field2104 = arg0;
		this.field2096 = arg1;
		this.field2110 = arg2;
		this.field2056 = arg3;
	}

	@ObfuscatedName("hb")
	public static class WindowFunction {

		// $FF: synthetic field
		public final VorbisSound this$0;

		@ObfuscatedName("hb.e")
		public float[] floor;

		@ObfuscatedName("hb.n")
		public int field2122;

		@ObfuscatedName("hb.m")
		public boolean field2125;

		@ObfuscatedName("hb.k")
		public int field2124;

		// line 1346
		public WindowFunction(VorbisSound arg0) {
			this.this$0 = arg0;
		}
	}
}
