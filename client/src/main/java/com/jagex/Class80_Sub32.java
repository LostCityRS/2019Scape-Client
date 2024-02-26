package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.BitSet;

@OriginalClass("client!akv")
public final class Class80_Sub32 extends Class80 {

	@OriginalMember(owner = "client!akv", name = "u", descriptor = "Z")
	boolean aBoolean382;

	@OriginalMember(owner = "client!akv", name = "m", descriptor = "[I")
	int[] anIntArray192;

	@OriginalMember(owner = "client!akv", name = "g", descriptor = "[Lclient!kj;")
	public Class382[] aClass382Array1;

	@OriginalMember(owner = "client!akv", name = "o", descriptor = "J")
	long aLong126;

	@OriginalMember(owner = "client!akv", name = "a", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!akv", name = "s", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "Z")
	boolean aBoolean381 = true;

	@OriginalMember(owner = "client!akv", name = "i", descriptor = "I")
	public int anInt1650 = 0;

	@OriginalMember(owner = "client!akv", name = "j", descriptor = "Ljava/lang/String;")
	public String aString52 = null;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!akv", name = "j", descriptor = "(II)V")
	public static void method14446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(6, (long) arg0);
		local4.method22078(-556282825);
	}

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class80_Sub32(@OriginalArg(0) Packet arg0) {
		this.method14437(arg0, -1535942276);
	}

	@OriginalMember(owner = "client!akv", name = "e", descriptor = "(Lclient!kj;I)V")
	void method14430(@OriginalArg(0) Class382 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass382Array1 == null || this.anInt1650 * 753247591 >= this.aClass382Array1.length) {
			this.method14442(this.anInt1650 * 753247591 + 5, (byte) 21);
		}
		this.aClass382Array1[(this.anInt1650 += 19703383) * 753247591 - 1] = arg0;
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!akv", name = "f", descriptor = "(I)[I")
	public int[] method14431(@OriginalArg(0) int arg0) {
		if (this.anIntArray192 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1650 * 753247591];
			this.anIntArray192 = new int[this.anInt1650 * 753247591];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1650 * 753247591) {
				local8[local17] = this.aClass382Array1[local17].aString204;
				this.anIntArray192[local17] = local17++;
			}
			Class602.method32125(local8, this.anIntArray192, -1183119602);
		}
		return this.anIntArray192;
	}

	@OriginalMember(owner = "client!akv", name = "m", descriptor = "(Lclient!kj;)V")
	void method14432(@OriginalArg(0) Class382 arg0) {
		if (this.aClass382Array1 == null || this.anInt1650 * 753247591 >= this.aClass382Array1.length) {
			this.method14442(this.anInt1650 * 753247591 + 5, (byte) 66);
		}
		this.aClass382Array1[(this.anInt1650 += 19703383) * 753247591 - 1] = arg0;
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!akv", name = "u", descriptor = "(II)V")
	void method14433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1650 -= 19703383;
		if (this.anInt1650 * 753247591 == 0) {
			this.aClass382Array1 = null;
		} else {
			System.arraycopy(this.aClass382Array1, arg0 + 1, this.aClass382Array1, arg0, this.anInt1650 * 753247591 - arg0);
		}
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "(Ljava/lang/String;B)I")
	public int method14434(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1650 * 753247591; local1++) {
			if (this.aClass382Array1[local1].aString204.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akv", name = "j", descriptor = "(I)V")
	void method14435(@OriginalArg(0) int arg0) {
		this.anInt1650 -= 19703383;
		if (this.anInt1650 * 753247591 == 0) {
			this.aClass382Array1 = null;
		} else {
			System.arraycopy(this.aClass382Array1, arg0 + 1, this.aClass382Array1, arg0, this.anInt1650 * 753247591 - arg0);
		}
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!akv", name = "i", descriptor = "()[I")
	public int[] method14436() {
		if (this.anIntArray192 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1650 * 753247591];
			this.anIntArray192 = new int[this.anInt1650 * 753247591];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1650 * 753247591) {
				local8[local17] = this.aClass382Array1[local17].aString204;
				this.anIntArray192[local17] = local17++;
			}
			Class602.method32125(local8, this.anIntArray192, -679062781);
		}
		return this.anIntArray192;
	}

	@OriginalMember(owner = "client!akv", name = "g", descriptor = "(Lclient!ald;I)V")
	void method14437(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g1();
		if ((local3 & 0x1) != 0) {
			this.aBoolean382 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean381 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.g1();
		}
		this.aLong338 = arg0.g8() * 6850079459805481791L;
		this.aLong126 = arg0.g8() * 175499899195935747L;
		this.aString52 = arg0.gjstr();
		arg0.g1();
		this.aByte56 = arg0.g1b();
		this.aByte55 = arg0.g1b();
		this.anInt1650 = arg0.g2() * 19703383;
		if (this.anInt1650 * 753247591 <= 0) {
			return;
		}
		this.aClass382Array1 = new Class382[this.anInt1650 * 753247591];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1650 * 753247591; local83++) {
			@Pc(93) Class382 local93 = new Class382();
			if (this.aBoolean382) {
				arg0.g8();
			}
			if (this.aBoolean381) {
				local93.aString204 = arg0.gjstr();
			}
			local93.aByte146 = arg0.g1b();
			local93.anInt4538 = arg0.g2() * -477853141;
			if (local21 >= 3) {
				arg0.g1();
			}
			this.aClass382Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!akv", name = "o", descriptor = "(Lclient!kj;)V")
	void method14438(@OriginalArg(0) Class382 arg0) {
		if (this.aClass382Array1 == null || this.anInt1650 * 753247591 >= this.aClass382Array1.length) {
			this.method14442(this.anInt1650 * 753247591 + 5, (byte) 106);
		}
		this.aClass382Array1[(this.anInt1650 += 19703383) * 753247591 - 1] = arg0;
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!akv", name = "x", descriptor = "(Ljava/lang/String;)I")
	public int method14439(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1650 * 753247591; local1++) {
			if (this.aClass382Array1[local1].aString204.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akv", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method14440(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1650 * 753247591; local1++) {
			if (this.aClass382Array1[local1].aString204.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akv", name = "s", descriptor = "(Ljava/lang/String;)I")
	public int method14441(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1650 * 753247591; local1++) {
			if (this.aClass382Array1[local1].aString204.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akv", name = "t", descriptor = "(IB)V")
	void method14442(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass382Array1 == null) {
			this.aClass382Array1 = new Class382[arg0];
		} else {
			System.arraycopy(this.aClass382Array1, 0, this.aClass382Array1 = new Class382[arg0], 0, this.anInt1650 * 753247591);
		}
	}

	@OriginalMember(owner = "client!akv", name = "z", descriptor = "(Lclient!ald;)V")
	void method14443(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		if ((local3 & 0x1) != 0) {
			this.aBoolean382 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean381 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.g1();
		}
		this.aLong338 = arg0.g8() * 6850079459805481791L;
		this.aLong126 = arg0.g8() * 175499899195935747L;
		this.aString52 = arg0.gjstr();
		arg0.g1();
		this.aByte56 = arg0.g1b();
		this.aByte55 = arg0.g1b();
		this.anInt1650 = arg0.g2() * 19703383;
		if (this.anInt1650 * 753247591 <= 0) {
			return;
		}
		this.aClass382Array1 = new Class382[this.anInt1650 * 753247591];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1650 * 753247591; local83++) {
			@Pc(93) Class382 local93 = new Class382();
			if (this.aBoolean382) {
				arg0.g8();
			}
			if (this.aBoolean381) {
				local93.aString204 = arg0.gjstr();
			}
			local93.aByte146 = arg0.g1b();
			local93.anInt4538 = arg0.g2() * -477853141;
			if (local21 >= 3) {
				arg0.g1();
			}
			this.aClass382Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!akv", name = "p", descriptor = "(Lclient!ald;)V")
	void method14444(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		if ((local3 & 0x1) != 0) {
			this.aBoolean382 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean381 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.g1();
		}
		this.aLong338 = arg0.g8() * 6850079459805481791L;
		this.aLong126 = arg0.g8() * 175499899195935747L;
		this.aString52 = arg0.gjstr();
		arg0.g1();
		this.aByte56 = arg0.g1b();
		this.aByte55 = arg0.g1b();
		this.anInt1650 = arg0.g2() * 19703383;
		if (this.anInt1650 * 753247591 <= 0) {
			return;
		}
		this.aClass382Array1 = new Class382[this.anInt1650 * 753247591];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1650 * 753247591; local83++) {
			@Pc(93) Class382 local93 = new Class382();
			if (this.aBoolean382) {
				arg0.g8();
			}
			if (this.aBoolean381) {
				local93.aString204 = arg0.gjstr();
			}
			local93.aByte146 = arg0.g1b();
			local93.anInt4538 = arg0.g2() * -477853141;
			if (local21 >= 3) {
				arg0.g1();
			}
			this.aClass382Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!akv", name = "v", descriptor = "(Lclient!ald;)V")
	void method14445(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		if ((local3 & 0x1) != 0) {
			this.aBoolean382 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean381 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.g1();
		}
		this.aLong338 = arg0.g8() * 6850079459805481791L;
		this.aLong126 = arg0.g8() * 175499899195935747L;
		this.aString52 = arg0.gjstr();
		arg0.g1();
		this.aByte56 = arg0.g1b();
		this.aByte55 = arg0.g1b();
		this.anInt1650 = arg0.g2() * 19703383;
		if (this.anInt1650 * 753247591 <= 0) {
			return;
		}
		this.aClass382Array1 = new Class382[this.anInt1650 * 753247591];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1650 * 753247591; local83++) {
			@Pc(93) Class382 local93 = new Class382();
			if (this.aBoolean382) {
				arg0.g8();
			}
			if (this.aBoolean381) {
				local93.aString204 = arg0.gjstr();
			}
			local93.aByte146 = arg0.g1b();
			local93.anInt4538 = arg0.g2() * -477853141;
			if (local21 >= 3) {
				arg0.g1();
			}
			this.aClass382Array1[local83] = local93;
		}
	}
}
