package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aav")
public final class Class24 {

	@OriginalMember(owner = "client!aav", name = "n", descriptor = "I")
	static final int anInt75 = 256;

	@OriginalMember(owner = "client!aav", name = "m", descriptor = "I")
	static final int anInt76 = 1020;

	@OriginalMember(owner = "client!aav", name = "e", descriptor = "I")
	static final int anInt79 = 8;

	@OriginalMember(owner = "client!aav", name = "ls", descriptor = "I")
	public static int anInt82;

	@OriginalMember(owner = "client!aav", name = "k", descriptor = "I")
	int anInt77;

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "I")
	int anInt78;

	@OriginalMember(owner = "client!aav", name = "u", descriptor = "I")
	int anInt80;

	@OriginalMember(owner = "client!aav", name = "z", descriptor = "I")
	int anInt81;

	@OriginalMember(owner = "client!aav", name = "w", descriptor = "[I")
	int[] anIntArray6 = new int[256];

	@OriginalMember(owner = "client!aav", name = "f", descriptor = "[I")
	int[] anIntArray5 = new int[256];

	@OriginalMember(owner = "client!aav", name = "aty", descriptor = "(Lclient!yf;I)V")
	static void method520(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!aav", name = "<init>", descriptor = "([I)V")
	public Class24(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray5[local11] = arg0[local11];
		}
		this.method508(1288205261);
	}

	@OriginalMember(owner = "client!aav", name = "c", descriptor = "()V")
	void method504() {
		this.anInt80 += (this.anInt81 += -1172788929) * -1222813753;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 13) * 1260880719;
				} else {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 6) * 1260880719;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 2) * 1260880719;
			} else {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 16) * 1260880719;
			}
			this.anInt78 += this.anIntArray6[local15 + 128 & 0xFF] * 1260880719;
			@Pc(137) int local137;
			this.anIntArray6[local15] = local137 = this.anInt80 * 1352157513 + this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt78 * -423382097;
			this.anIntArray5[local15] = (this.anInt80 = (local23 + this.anIntArray6[local137 >> 8 >> 2 & 0xFF]) * 1070790905) * 1352157513;
		}
	}

	@OriginalMember(owner = "client!aav", name = "e", descriptor = "(I)I")
	public int method505(@OriginalArg(0) int arg0) {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(-225680934);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[(this.anInt77 -= -1861444745) * -732254649];
	}

	@OriginalMember(owner = "client!aav", name = "n", descriptor = "(I)I")
	public int method506(@OriginalArg(0) int arg0) {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(434971419);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[this.anInt77 * -732254649 - 1];
	}

	@OriginalMember(owner = "client!aav", name = "m", descriptor = "(I)V")
	void method507(@OriginalArg(0) int arg0) {
		this.anInt80 += (this.anInt81 += -1172788929) * -1222813753;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 13) * 1260880719;
				} else {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 6) * 1260880719;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 2) * 1260880719;
			} else {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 16) * 1260880719;
			}
			this.anInt78 += this.anIntArray6[local15 + 128 & 0xFF] * 1260880719;
			@Pc(137) int local137;
			this.anIntArray6[local15] = local137 = this.anInt80 * 1352157513 + this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt78 * -423382097;
			this.anIntArray5[local15] = (this.anInt80 = (local23 + this.anIntArray6[local137 >> 8 >> 2 & 0xFF]) * 1070790905) * 1352157513;
		}
	}

	@OriginalMember(owner = "client!aav", name = "k", descriptor = "(I)V")
	void method508(@OriginalArg(0) int arg0) {
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
		this.method507(-482059358);
		this.anInt77 = 211515136;
	}

	@OriginalMember(owner = "client!aav", name = "f", descriptor = "()I")
	public int method509() {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(-257115870);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[(this.anInt77 -= -1861444745) * -732254649];
	}

	@OriginalMember(owner = "client!aav", name = "u", descriptor = "()I")
	public int method510() {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(642042485);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[this.anInt77 * -732254649 - 1];
	}

	@OriginalMember(owner = "client!aav", name = "r", descriptor = "()V")
	void method511() {
		this.anInt80 += (this.anInt81 += -1172788929) * -1222813753;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 13) * 1260880719;
				} else {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 6) * 1260880719;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 2) * 1260880719;
			} else {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 16) * 1260880719;
			}
			this.anInt78 += this.anIntArray6[local15 + 128 & 0xFF] * 1260880719;
			@Pc(137) int local137;
			this.anIntArray6[local15] = local137 = this.anInt80 * 1352157513 + this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt78 * -423382097;
			this.anIntArray5[local15] = (this.anInt80 = (local23 + this.anIntArray6[local137 >> 8 >> 2 & 0xFF]) * 1070790905) * 1352157513;
		}
	}

	@OriginalMember(owner = "client!aav", name = "z", descriptor = "()I")
	public int method512() {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(1546756360);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[this.anInt77 * -732254649 - 1];
	}

	@OriginalMember(owner = "client!aav", name = "p", descriptor = "()V")
	void method513() {
		this.anInt80 += (this.anInt81 += -1172788929) * -1222813753;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 13) * 1260880719;
				} else {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 6) * 1260880719;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 2) * 1260880719;
			} else {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 16) * 1260880719;
			}
			this.anInt78 += this.anIntArray6[local15 + 128 & 0xFF] * 1260880719;
			@Pc(137) int local137;
			this.anIntArray6[local15] = local137 = this.anInt80 * 1352157513 + this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt78 * -423382097;
			this.anIntArray5[local15] = (this.anInt80 = (local23 + this.anIntArray6[local137 >> 8 >> 2 & 0xFF]) * 1070790905) * 1352157513;
		}
	}

	@OriginalMember(owner = "client!aav", name = "d", descriptor = "()V")
	void method514() {
		this.anInt80 += (this.anInt81 += -1172788929) * -1222813753;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray6[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 13) * 1260880719;
				} else {
					this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 6) * 1260880719;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 << 2) * 1260880719;
			} else {
				this.anInt78 = (this.anInt78 * -423382097 ^ this.anInt78 * -423382097 >>> 16) * 1260880719;
			}
			this.anInt78 += this.anIntArray6[local15 + 128 & 0xFF] * 1260880719;
			@Pc(137) int local137;
			this.anIntArray6[local15] = local137 = this.anInt80 * 1352157513 + this.anIntArray6[local23 >> 2 & 0xFF] + this.anInt78 * -423382097;
			this.anIntArray5[local15] = (this.anInt80 = (local23 + this.anIntArray6[local137 >> 8 >> 2 & 0xFF]) * 1070790905) * 1352157513;
		}
	}

	@OriginalMember(owner = "client!aav", name = "s", descriptor = "()V")
	void method515() {
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
		this.method507(-417956294);
		this.anInt77 = 211515136;
	}

	@OriginalMember(owner = "client!aav", name = "w", descriptor = "()I")
	public int method516() {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(-1582750906);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[(this.anInt77 -= -1861444745) * -732254649];
	}

	@OriginalMember(owner = "client!aav", name = "v", descriptor = "()V")
	void method517() {
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
		this.method507(1508301597);
		this.anInt77 = 211515136;
	}

	@OriginalMember(owner = "client!aav", name = "o", descriptor = "()V")
	void method518() {
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
		this.method507(-1027081929);
		this.anInt77 = 211515136;
	}

	@OriginalMember(owner = "client!aav", name = "l", descriptor = "()I")
	public int method519() {
		if (this.anInt77 * -732254649 == 0) {
			this.method507(-1731319154);
			this.anInt77 = 211515136;
		}
		return this.anIntArray5[this.anInt77 * -732254649 - 1];
	}
}
