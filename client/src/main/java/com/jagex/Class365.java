package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class365 {

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	static final int anInt4576 = 2048;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
	static final int anInt4577 = 11;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	static final int anInt4578 = 5;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	static final int anInt4579 = -16777216;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	int anInt4580;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
	int anInt4581;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream1;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(IB)Lclient!ie;", line = 13)
	public static Class335 method27901(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class335.aClass335_2.anInt4150 * -754623559 == arg0) {
			return Class335.aClass335_2;
		} else if (arg0 == Class335.aClass335_1.anInt4150 * -754623559) {
			return Class335.aClass335_1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(Ljava/io/InputStream;B)V", line = 15)
	public final void method27902(@OriginalArg(0) InputStream arg0, @OriginalArg(1) byte arg1) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "(Ljava/io/InputStream;)V", line = 15)
	public final void method27903(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "(B)V", line = 19)
	public final void method27904(@OriginalArg(0) byte arg0) {
		this.anInputStream1 = null;
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(Lclient!dh;IIIIILclient!do;IIIILclient!aaq;B)Lclient!do;", line = 20)
	public static Class109 method27905(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class109 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class19 arg11, @OriginalArg(12) byte arg12) {
		if (arg6 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg11 != null) {
			local6 |= arg11.method23585(-1728448064);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(39) long local39 = ((long) arg8 << 48) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg7 << 32);
		@Pc(42) Class240 local42 = Class330.aClass240_79;
		@Pc(48) Class109 local48;
		synchronized (Class330.aClass240_79) {
			local48 = (Class109) Class330.aClass240_79.method25829(local39);
		}
		@Pc(79) int local79;
		if (local48 == null || arg0.method20759(local48.method6875(), local6) != 0) {
			if (local48 != null) {
				local6 = arg0.method20599(local6, local48.method6875());
			}
			local79 = arg5 * 3 + 6;
			@Pc(81) byte local81 = 3;
			@Pc(96) int[] local96 = new int[] { 64, 96, 128 };
			@Pc(113) Class231 local113 = new Class231(local79 * local81 + 1, local79 * local81 * 2 - local79, 0);
			@Pc(119) int local119 = local113.method25663(0, 0, 0);
			@Pc(123) int[][] local123 = new int[local81][local79];
			@Pc(125) int local125;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(155) int local155;
			for (local125 = 0; local125 < local81; local125++) {
				local132 = local96[local125];
				local136 = local96[local125];
				for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
					@Pc(147) int local147 = (local138 << 14) / local79;
					local155 = Class464.anIntArray451[local147] * local132 >> 14;
					@Pc(163) int local163 = local136 * Class464.anIntArray452[local147] >> 14;
					local123[local125][local138] = local113.method25663(local155, 0, local163);
				}
			}
			for (local125 = 0; local125 < local81; local125++) {
				local132 = (local125 * 256 + 128) / local81;
				local136 = 256 - local132;
				@Pc(205) byte local205 = (byte) (arg9 * local136 + arg10 * local132 >> 8);
				@Pc(250) short local250 = (short) (((arg7 & 0x380) * local136 + local132 * (arg8 & 0x380) & 0x38000) + ((arg8 & 0xFC00) * local132 + (arg7 & 0xFC00) * local136 & 0xFC0000) + ((arg7 & 0x7F) * local136 + local132 * (arg8 & 0x7F) & 0x7F00) >> 8);
				for (local155 = 0; local155 < local79; local155++) {
					if (local125 == 0) {
						local113.method25665(local119, local123[0][(local155 + 1) % local79], local123[0][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					} else {
						local113.method25665(local123[local125 - 1][local155], local123[local125 - 1][(local155 + 1) % local79], local123[local125][(local155 + 1) % local79], (byte) 1, (byte) -1, local250, local205, (short) -1);
						local113.method25665(local123[local125 - 1][local155], local123[local125][(local155 + 1) % local79], local123[local125][local155], (byte) 1, (byte) -1, local250, local205, (short) -1);
					}
				}
			}
			local48 = arg0.method20597(local113, local6, Class330.anInt4146 * -1710939251, 64, 768);
			@Pc(363) Class240 local363 = Class330.aClass240_79;
			synchronized (Class330.aClass240_79) {
				Class330.aClass240_79.method25838(local48, local39);
			}
		}
		local79 = arg6.method6901();
		@Pc(382) int local382 = arg6.method6902();
		@Pc(385) int local385 = arg6.method6905();
		@Pc(388) int local388 = arg6.method6957();
		if (arg11 == null) {
			local48 = local48.method6938((byte) 3, local6, true);
			local48.method6882(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6968(local79 + local382 >> 1, 0, local385 + local388 >> 1);
		} else {
			local48 = local48.method6938((byte) 3, local6, true);
			local48.method6882(local382 - local79 >> 1, 128, local388 - local385 >> 1);
			local48.method6968(local382 + local79 >> 1, 0, local388 + local385 >> 1);
			arg11.method23592(local48, (byte) 32);
		}
		if (arg2 != 0) {
			local48.method7011(arg2);
		}
		if (arg3 != 0) {
			local48.method6880(arg3);
		}
		if (arg4 != 0) {
			local48.method6968(0, arg4, 0);
		}
		return local48;
	}

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "(I)V", line = 23)
	public final void method27906(@OriginalArg(0) int arg0) throws IOException {
		this.anInt4581 = 0;
		this.anInt4580 = 430647041;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
		}
	}

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "(I)I", line = 29)
	public final int method27907(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4580 = (-1329977601 * this.anInt4580 >>> 1) * -430647041;
			@Pc(28) int local28 = this.anInt4581 * 314866317 - this.anInt4580 * -1329977601 >>> 31;
			this.anInt4581 -= (-1329977601 * this.anInt4580 & local28 - 1) * -1724590011;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "(II)I", line = 29)
	public final int method27908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4580 = (-1329977601 * this.anInt4580 >>> 1) * -430647041;
			@Pc(28) int local28 = this.anInt4581 * 314866317 - this.anInt4580 * -1329977601 >>> 31;
			this.anInt4581 -= (-1329977601 * this.anInt4580 & local28 - 1) * -1724590011;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "(I)I", line = 29)
	public final int method27909(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4580 = (-1329977601 * this.anInt4580 >>> 1) * -430647041;
			@Pc(28) int local28 = this.anInt4581 * 314866317 - this.anInt4580 * -1329977601 >>> 31;
			this.anInt4581 -= (-1329977601 * this.anInt4580 & local28 - 1) * -1724590011;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "(I)I", line = 29)
	public final int method27910(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4580 = (-1329977601 * this.anInt4580 >>> 1) * -430647041;
			@Pc(28) int local28 = this.anInt4581 * 314866317 - this.anInt4580 * -1329977601 >>> 31;
			this.anInt4581 -= (-1329977601 * this.anInt4580 & local28 - 1) * -1724590011;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)I", line = 29)
	public final int method27911(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4580 = (-1329977601 * this.anInt4580 >>> 1) * -430647041;
			@Pc(28) int local28 = this.anInt4581 * 314866317 - this.anInt4580 * -1329977601 >>> 31;
			this.anInt4581 -= (-1329977601 * this.anInt4580 & local28 - 1) * -1724590011;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "([SII)I", line = 44)
	public int method27912(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4580 * -1329977601 >>> 11) * local3;
		if ((this.anInt4581 * 314866317 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4580 = local12 * -430647041;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (this.anInt4580 * -1329977601 << 8) * -430647041;
			}
			return 0;
		}
		this.anInt4580 -= local12 * -430647041;
		this.anInt4581 -= local12 * -1724590011;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
			this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "([SI)I", line = 44)
	public int method27913(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4580 * -1329977601 >>> 11) * local3;
		if ((this.anInt4581 * 314866317 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4580 = local12 * -430647041;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (this.anInt4580 * -1329977601 << 8) * -430647041;
			}
			return 0;
		}
		this.anInt4580 -= local12 * -430647041;
		this.anInt4581 -= local12 * -1724590011;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
			this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "([SI)I", line = 44)
	public int method27914(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4580 * -1329977601 >>> 11) * local3;
		if ((this.anInt4581 * 314866317 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4580 = local12 * -430647041;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (this.anInt4580 * -1329977601 << 8) * -430647041;
			}
			return 0;
		}
		this.anInt4580 -= local12 * -430647041;
		this.anInt4581 -= local12 * -1724590011;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
			this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "([SI)I", line = 44)
	public int method27915(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4580 * -1329977601 >>> 11) * local3;
		if ((this.anInt4581 * 314866317 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4580 = local12 * -430647041;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (this.anInt4580 * -1329977601 << 8) * -430647041;
			}
			return 0;
		}
		this.anInt4580 -= local12 * -430647041;
		this.anInt4581 -= local12 * -1724590011;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
			this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "([SI)I", line = 44)
	public int method27916(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = (this.anInt4580 * -1329977601 >>> 11) * local3;
		if ((this.anInt4581 * 314866317 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4580 = local12 * -430647041;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
				this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
				this.anInt4580 = (this.anInt4580 * -1329977601 << 8) * -430647041;
			}
			return 0;
		}
		this.anInt4580 -= local12 * -430647041;
		this.anInt4581 -= local12 * -1724590011;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4580 * -1329977601 & 0xFF000000) == 0) {
			this.anInt4581 = (this.anInt4581 * 314866317 << 8 | this.anInputStream1.read()) * -1724590011;
			this.anInt4580 = (-1329977601 * this.anInt4580 << 8) * -430647041;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "([S)V", line = 68)
	public static void method27917(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jp", name = "gt", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6157)
	static final void method27918(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean701 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!jp", name = "ayj", descriptor = "(Lclient!yf;I)V", line = 14107)
	static final void method27919(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.aBoolean632) {
			Class447.aClass447_6.method28913(-2022949626);
		}
	}

	@OriginalMember(owner = "client!jp", name = "azk", descriptor = "(Lclient!yf;I)V", line = 14225)
	static final void method27920(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!jp", name = "bag", descriptor = "(Lclient!yf;B)V", line = 14253)
	static final void method27921(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method16546(local12, 1927192604);
	}
}
