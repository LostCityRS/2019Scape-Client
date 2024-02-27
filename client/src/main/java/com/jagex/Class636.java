package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class636 implements Interface22 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "J")
	static final long aLong402 = 1L;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "J")
	static final long aLong403 = 4611686018427387904L;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "J")
	static final long aLong404 = 4611686018427387903L;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "J")
	static final long aLong405 = 500L;

	@OriginalMember(owner = "client!wg", name = "fx", descriptor = "J")
	static long js5ConnectTime;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!aax;")
	Class24 aClass24_36 = new Class24(128);

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
	int[] anIntArray507 = new int[Class528.aClass2_Sub1_Sub1_3.method18051(178036989)];

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "[I")
	int[] anIntArray508 = new int[Class528.aClass2_Sub1_Sub1_3.method18051(994660608)];

	@OriginalMember(owner = "client!wg", name = "asa", descriptor = "(Lclient!yp;B)V")
	static void method32862(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub46_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 0 ? 0 : 1, (byte) 79);
		Class719.method37291(-237162160);
	}

	@OriginalMember(owner = "client!wg", name = "axl", descriptor = "(Lclient!yp;I)V")
	static void method32863(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class450.method29279((byte) 58);
	}

	@OriginalMember(owner = "client!wg", name = "amv", descriptor = "(Lclient!yp;B)V")
	static void method32864(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wg", name = "ye", descriptor = "(Lclient!yp;I)V")
	static void method32865(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class512.aClass719_3.getId();
	}

	@OriginalMember(owner = "client!wg", name = "ko", descriptor = "(Lclient!yp;I)V")
	static void method32866(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2092840823);
		Class175.method24654(local16, arg0, -649564797);
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36985(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "(ZI)I")
	public int method32847(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class303.currentTimeMillis((byte) 107);
		for (@Pc(15) Class80_Sub25 local15 = (Class80_Sub25) (arg0 ? this.aClass24_36.method580((byte) -28) : this.aClass24_36.method566((byte) 7)); local15 != null; local15 = (Class80_Sub25) this.aClass24_36.method566((byte) 7)) {
			if ((local15.aLong111 * -3870080695537343021L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong111 * -3870080695537343021L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong338 * 3209506792906532031L);
					this.anIntArray508[local42] = this.anIntArray507[local42];
					local15.method24395((byte) 62);
					return local42;
				}
				local15.method24395((byte) 90);
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wg", name = "al", descriptor = "(Lclient!kb;I)V")
	public void method32848(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, 1125258678);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray508[arg0.anInt862 * -1873516487];
	}

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method36983(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray508[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(Class303.currentTimeMillis((byte) 31) + 500L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 101) + 500L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "(Lclient!ea;II)V")
	public void method32849(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray507[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(4611686018427387905L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else if (local17.aLong111 * -3870080695537343021L != 4611686018427387905L) {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 93) + 500L | 0x4000000000000000L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36977(@OriginalArg(0) Class107 arg0) {
		return this.anIntArray508[arg0.anInt862 * -1873516487];
	}

	@OriginalMember(owner = "client!wg", name = "af", descriptor = "(Lclient!kb;I)V")
	public void method32850(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -778981598);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36996(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(Lclient!ea;I)J")
	@Override
	public long method36984(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method28421(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], -1404926683);
	}

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36990(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray508[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(Class303.currentTimeMillis((byte) 106) + 500L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 56) + 500L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "ak", descriptor = "(Lclient!kb;I)V")
	public void method32851(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -114232446);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36979(@OriginalArg(0) Class107 arg0) {
		return this.anIntArray508[arg0.anInt862 * -1873516487];
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "(B)V")
	public void method32852(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class528.aClass2_Sub1_Sub1_3.method18051(3375203); local1++) {
			@Pc(12) Class107_Sub2 local12 = (Class107_Sub2) Class528.aClass2_Sub1_Sub1_3.method18054(local1, -306974673);
			if (local12 != null) {
				this.anIntArray507[local1] = 0;
				this.anIntArray508[local1] = 0;
			}
		}
		this.aClass24_36 = new Class24(128);
	}

	@OriginalMember(owner = "client!wg", name = "ag", descriptor = "(Lclient!ea;I)V")
	public void method32853(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray507[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(4611686018427387905L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else if (local17.aLong111 * -3870080695537343021L != 4611686018427387905L) {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 95) + 500L | 0x4000000000000000L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36982(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], -1762544244);
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36989(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray508[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(Class303.currentTimeMillis((byte) 107) + 500L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 59) + 500L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36992(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "(Lclient!ea;Ljava/lang/Object;I)V")
	@Override
	public void method37001(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "aj", descriptor = "(Lclient!ea;I)V")
	public void method32854(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray507[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(4611686018427387905L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else if (local17.aLong111 * -3870080695537343021L != 4611686018427387905L) {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 94) + 500L | 0x4000000000000000L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36999(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36994(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	public Object method36995(@OriginalArg(0) Class107 arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36997(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36998(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36986(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method37000(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method28422(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], arg1, -23682048);
		this.method36983(arg0.aClass107_1, local12, -1435618177);
	}

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "(Lclient!kb;I)V")
	@Override
	public void method36993(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method28422(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], arg1, 1859383018);
		this.method36983(arg0.aClass107_1, local12, 1997781679);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)I")
	public int method32855(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class303.currentTimeMillis((byte) 87);
		for (@Pc(15) Class80_Sub25 local15 = (Class80_Sub25) (arg0 ? this.aClass24_36.method580((byte) -39) : this.aClass24_36.method566((byte) 7)); local15 != null; local15 = (Class80_Sub25) this.aClass24_36.method566((byte) 7)) {
			if ((local15.aLong111 * -3870080695537343021L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong111 * -3870080695537343021L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong338 * 3209506792906532031L);
					this.anIntArray508[local42] = this.anIntArray507[local42];
					local15.method24395((byte) 82);
					return local42;
				}
				local15.method24395((byte) 89);
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wg", name = "ao", descriptor = "(Z)I")
	public int method32856(@OriginalArg(0) boolean arg0) {
		@Pc(2) long local2 = Class303.currentTimeMillis((byte) 61);
		for (@Pc(15) Class80_Sub25 local15 = (Class80_Sub25) (arg0 ? this.aClass24_36.method580((byte) -123) : this.aClass24_36.method566((byte) 7)); local15 != null; local15 = (Class80_Sub25) this.aClass24_36.method566((byte) 7)) {
			if ((local15.aLong111 * -3870080695537343021L & 0x3FFFFFFFFFFFFFFFL) < local2) {
				if ((local15.aLong111 * -3870080695537343021L & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) (local15.aLong338 * 3209506792906532031L);
					this.anIntArray508[local42] = this.anIntArray507[local42];
					local15.method24395((byte) 76);
					return local42;
				}
				local15.method24395((byte) 7);
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(Lclient!kb;II)V")
	public void method32857(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -1939198466);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "ac", descriptor = "(Lclient!ea;I)V")
	public void method32858(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray507[arg0.anInt862 * -1873516487] = arg1;
		@Pc(17) Class80_Sub25 local17 = (Class80_Sub25) this.aClass24_36.method560((long) (arg0.anInt862 * -1873516487));
		if (local17 == null) {
			local17 = new Class80_Sub25(4611686018427387905L);
			this.aClass24_36.method563(local17, (long) (arg0.anInt862 * -1873516487));
		} else if (local17.aLong111 * -3870080695537343021L != 4611686018427387905L) {
			local17.aLong111 = (Class303.currentTimeMillis((byte) 52) + 500L | 0x4000000000000000L) * -6811134150962562469L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(Lclient!kb;IB)V")
	@Override
	public void method36987(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws Exception_Sub6 {
		@Pc(12) int local12 = arg0.method28422(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], arg1, 327235244);
		this.method36983(arg0.aClass107_1, local12, 306698068);
	}

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "(Lclient!kb;I)V")
	public void method32859(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -1921165343);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36981(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.anIntArray508[arg0.aClass107_1.anInt862 * -1873516487], -2027069045);
	}

	@OriginalMember(owner = "client!wg", name = "ah", descriptor = "(Lclient!kb;I)V")
	public void method32860(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -969637580);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "(Lclient!ea;I)Ljava/lang/Object;")
	@Override
	public Object method36988(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wg", name = "am", descriptor = "(Lclient!kb;I)V")
	public void method32861(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method28422(this.anIntArray507[arg0.aClass107_1.anInt862 * -1873516487], arg1, -1215051482);
			this.method32849(arg0.aClass107_1, local12, 469139509);
		} catch (@Pc(20) Exception_Sub6 local20) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ea;)J")
	@Override
	public long method36991(@OriginalArg(0) Class107 arg0) {
		throw new UnsupportedOperationException();
	}
}
