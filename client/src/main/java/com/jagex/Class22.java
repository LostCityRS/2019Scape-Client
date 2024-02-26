package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aav")
public final class Class22 {

	@OriginalMember(owner = "client!aav", name = "f", descriptor = "I")
	static final int anInt70 = 256;

	@OriginalMember(owner = "client!aav", name = "t", descriptor = "I")
	static final int anInt71 = 8;

	@OriginalMember(owner = "client!aav", name = "e", descriptor = "I")
	static final int anInt73 = 1020;

	@OriginalMember(owner = "client!aav", name = "i", descriptor = "I")
	int anInt69;

	@OriginalMember(owner = "client!aav", name = "u", descriptor = "I")
	int anInt72;

	@OriginalMember(owner = "client!aav", name = "m", descriptor = "I")
	int anInt74;

	@OriginalMember(owner = "client!aav", name = "o", descriptor = "I")
	int anInt75;

	@OriginalMember(owner = "client!aav", name = "g", descriptor = "[I")
	int[] anIntArray6 = new int[256];

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "[I")
	int[] anIntArray5 = new int[256];

	@OriginalMember(owner = "client!aav", name = "t", descriptor = "(Lclient!ald;I)Lclient!lt;")
	public static Class405 method542(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method23210((byte) 100);
		return new Class405(local3);
	}

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "(CI)C")
	static char method543(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!aav", name = "f", descriptor = "(Lclient!wi;I)V")
	public static void method544(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int arg1) {
		Class330.anInt4185 = arg0.anInt5614 * 1043363001;
		Class330.anInt4187 = arg0.anInt5626 * 1869682547;
		Class430.anInt4639 = arg0.anInt5624 * -39096481;
		Class475.anInt4961 = arg0.anInt5628 * 255546659;
		Class148.anInt1470 = arg0.anInt5629 * 2028919223;
		Class330.anInt4189 = arg0.anInt5603 * -1257819101;
		Class430.anInt4641 = arg0.anInt5631 * -1191265695;
		Class80_Sub28_Sub8.anInt3037 = arg0.anInt5632 * -1603275357;
		Class330.anInt4188 = arg0.anInt5612 * 2079409957;
		Class699.anInt5812 = arg0.anInt5634 * -1653390399;
		Class390.anInt4561 = arg0.anInt5611 * 879991607;
		Class45.anInt2423 = arg0.anInt5609 * -705330527;
	}

	@OriginalMember(owner = "client!aav", name = "t", descriptor = "(IJ)Lclient!art;")
	static Class80_Sub1_Sub9 method545(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Class80_Sub1_Sub9.aBoolean580 = false;
		@Pc(11) Class80_Sub1_Sub9 local11 = (Class80_Sub1_Sub9) Class80_Sub1_Sub9.aClass24_17.method560((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class80_Sub1_Sub9(arg0, arg1);
			Class80_Sub1_Sub9.aClass24_17.method563(local11, local11.aLong338 * 3209506792906532031L);
			Class80_Sub1_Sub9.aBoolean580 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!aav", name = "m", descriptor = "(IB)V")
	public static void method546(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = method545(4, (long) arg0);
		local4.method22078(918900485);
	}

	@OriginalMember(owner = "client!aav", name = "<init>", descriptor = "([I)V")
	public Class22(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray5[local11] = arg0[local11];
		}
		this.method540(-867535261);
	}

	@OriginalMember(owner = "client!aav", name = "g", descriptor = "()V")
	void method534() {
		this.anInt74 += (this.anInt75 += 438011719) * -810421975;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 << 13) * 705948373;
				} else {
					this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 >>> 6) * 705948373;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 << 2) * 705948373;
			} else {
				this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 >>> 16) * 705948373;
			}
			this.anInt69 += this.anIntArray6[local15 + 128 & 0xFF] * 705948373;
			@Pc(136) int local136;
			this.anIntArray6[local15] = local136 = this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt69 * 28049021 + this.anInt74 * -228910433;
			this.anIntArray5[local15] = (this.anInt74 = (local23 + this.anIntArray6[local136 >> 8 >> 2 & 0xFF]) * 165249375) * -228910433;
		}
	}

	@OriginalMember(owner = "client!aav", name = "t", descriptor = "(I)I")
	public int method535(@OriginalArg(0) int arg0) {
		if (this.anInt72 * -1394474501 == 0) {
			this.method537(-725718226);
			this.anInt72 = -186567936;
		}
		return this.anIntArray5[(this.anInt72 -= -1728782029) * -1394474501];
	}

	@OriginalMember(owner = "client!aav", name = "f", descriptor = "(B)I")
	public int method536(@OriginalArg(0) byte arg0) {
		if (this.anInt72 * -1394474501 == 0) {
			this.method537(943586431);
			this.anInt72 = -186567936;
		}
		return this.anIntArray5[this.anInt72 * -1394474501 - 1];
	}

	@OriginalMember(owner = "client!aav", name = "e", descriptor = "(I)V")
	void method537(@OriginalArg(0) int arg0) {
		this.anInt74 += (this.anInt75 += 438011719) * -810421975;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 << 13) * 705948373;
				} else {
					this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 >>> 6) * 705948373;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 << 2) * 705948373;
			} else {
				this.anInt69 = (this.anInt69 * 28049021 ^ this.anInt69 * 28049021 >>> 16) * 705948373;
			}
			this.anInt69 += this.anIntArray6[local15 + 128 & 0xFF] * 705948373;
			@Pc(136) int local136;
			this.anIntArray6[local15] = local136 = this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt69 * 28049021 + this.anInt74 * -228910433;
			this.anIntArray5[local15] = (this.anInt74 = (local23 + this.anIntArray6[local136 >> 8 >> 2 & 0xFF]) * 165249375) * -228910433;
		}
	}

	@OriginalMember(owner = "client!aav", name = "i", descriptor = "()V")
	void method538() {
		@Pc(1) int local1 = -1640531527;
		@Pc(3) int local3 = -1640531527;
		@Pc(5) int local5 = -1640531527;
		@Pc(7) int local7 = -1640531527;
		@Pc(9) int local9 = -1640531527;
		@Pc(11) int local11 = -1640531527;
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray5[local17];
			local13 += this.anIntArray5[local17 + 1];
			local11 += this.anIntArray5[local17 + 2];
			local9 += this.anIntArray5[local17 + 3];
			local7 += this.anIntArray5[local17 + 4];
			local5 += this.anIntArray5[local17 + 5];
			local3 += this.anIntArray5[local17 + 6];
			local1 += this.anIntArray5[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray6[local17];
			local13 += this.anIntArray6[local17 + 1];
			local11 += this.anIntArray6[local17 + 2];
			local9 += this.anIntArray6[local17 + 3];
			local7 += this.anIntArray6[local17 + 4];
			local5 += this.anIntArray6[local17 + 5];
			local3 += this.anIntArray6[local17 + 6];
			local1 += this.anIntArray6[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		this.method537(-868558224);
		this.anInt72 = -186567936;
	}

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "()I")
	public int method539() {
		if (this.anInt72 * -1394474501 == 0) {
			this.method537(2020989899);
			this.anInt72 = -186567936;
		}
		return this.anIntArray5[this.anInt72 * -1394474501 - 1];
	}

	@OriginalMember(owner = "client!aav", name = "u", descriptor = "(I)V")
	void method540(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1640531527;
		@Pc(3) int local3 = -1640531527;
		@Pc(5) int local5 = -1640531527;
		@Pc(7) int local7 = -1640531527;
		@Pc(9) int local9 = -1640531527;
		@Pc(11) int local11 = -1640531527;
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray5[local17];
			local13 += this.anIntArray5[local17 + 1];
			local11 += this.anIntArray5[local17 + 2];
			local9 += this.anIntArray5[local17 + 3];
			local7 += this.anIntArray5[local17 + 4];
			local5 += this.anIntArray5[local17 + 5];
			local3 += this.anIntArray5[local17 + 6];
			local1 += this.anIntArray5[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray6[local17];
			local13 += this.anIntArray6[local17 + 1];
			local11 += this.anIntArray6[local17 + 2];
			local9 += this.anIntArray6[local17 + 3];
			local7 += this.anIntArray6[local17 + 4];
			local5 += this.anIntArray6[local17 + 5];
			local3 += this.anIntArray6[local17 + 6];
			local1 += this.anIntArray6[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		this.method537(-1405409938);
		this.anInt72 = -186567936;
	}

	@OriginalMember(owner = "client!aav", name = "m", descriptor = "()V")
	void method541() {
		@Pc(1) int local1 = -1640531527;
		@Pc(3) int local3 = -1640531527;
		@Pc(5) int local5 = -1640531527;
		@Pc(7) int local7 = -1640531527;
		@Pc(9) int local9 = -1640531527;
		@Pc(11) int local11 = -1640531527;
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray5[local17];
			local13 += this.anIntArray5[local17 + 1];
			local11 += this.anIntArray5[local17 + 2];
			local9 += this.anIntArray5[local17 + 3];
			local7 += this.anIntArray5[local17 + 4];
			local5 += this.anIntArray5[local17 + 5];
			local3 += this.anIntArray5[local17 + 6];
			local1 += this.anIntArray5[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray6[local17];
			local13 += this.anIntArray6[local17 + 1];
			local11 += this.anIntArray6[local17 + 2];
			local9 += this.anIntArray6[local17 + 3];
			local7 += this.anIntArray6[local17 + 4];
			local5 += this.anIntArray6[local17 + 5];
			local3 += this.anIntArray6[local17 + 6];
			local1 += this.anIntArray6[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray6[local17] = local15;
			this.anIntArray6[local17 + 1] = local13;
			this.anIntArray6[local17 + 2] = local11;
			this.anIntArray6[local17 + 3] = local9;
			this.anIntArray6[local17 + 4] = local7;
			this.anIntArray6[local17 + 5] = local5;
			this.anIntArray6[local17 + 6] = local3;
			this.anIntArray6[local17 + 7] = local1;
		}
		this.method537(-1090254294);
		this.anInt72 = -186567936;
	}
}
