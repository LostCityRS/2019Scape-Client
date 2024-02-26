package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asn")
public final class Class80_Sub1_Sub17 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asn", name = "m", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!asn", name = "i", descriptor = "Ljava/lang/String;")
	public String aString115;

	@OriginalMember(owner = "client!asn", name = "o", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!asn", name = "j", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!asn", name = "a", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!asn", name = "bx", descriptor = "(Lclient!yp;I)V")
	static void method22912(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) boolean local16 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] != 0;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null) {
			Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33527(local16, 371488149);
		}
	}

	@OriginalMember(owner = "client!asn", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub17() {
	}

	@OriginalMember(owner = "client!asn", name = "l", descriptor = "(B)V")
	void method22897(@OriginalArg(0) byte arg0) {
		@Pc(4) int local4;
		if (this.anIntArray278 != null) {
			for (local4 = 0; local4 < this.anIntArray278.length; local4++) {
				this.anIntArray278[local4] |= 0x8000;
			}
		}
		if (this.anIntArray277 != null) {
			for (local4 = 0; local4 < this.anIntArray277.length; local4++) {
				this.anIntArray277[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asn", name = "t", descriptor = "(Lclient!ald;B)V")
	void method22898(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1406385055);
			if (local3 == 0) {
				return;
			}
			this.method22899(arg0, local3, -678794014);
		}
	}

	@OriginalMember(owner = "client!asn", name = "f", descriptor = "(Lclient!ald;II)V")
	void method22899(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.aString115 = arg0.method23376((short) 8349);
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local15 = arg0.method23362(-444123271);
			this.anIntArray277 = new int[local15];
			this.aCharArray3 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray277[local25] = arg0.method23178((byte) -123);
				local39 = arg0.method23177((byte) -42);
				this.aCharArray3[local25] = local39 == 0 ? 0 : Class284.method26887(local39, 1896589581);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method23362(-225197635);
			this.anIntArray278 = new int[local15];
			this.aCharArray4 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray278[local25] = arg0.method23178((byte) -113);
				local39 = arg0.method23177((byte) -23);
				this.aCharArray4[local25] = local39 == 0 ? 0 : Class284.method26887(local39, 1896589581);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!asn", name = "e", descriptor = "(CI)I")
	public int method22900(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray277 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray277.length; local6++) {
			if (this.aCharArray3[local6] == arg0) {
				return this.anIntArray277[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "a", descriptor = "(C)I")
	public int method22901(@OriginalArg(0) char arg0) {
		if (this.anIntArray278 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray278.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray278[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "s", descriptor = "(C)I")
	public int method22902(@OriginalArg(0) char arg0) {
		if (this.anIntArray278 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray278.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray278[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "g", descriptor = "(Lclient!ald;)V")
	void method22903(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(656041117);
			if (local3 == 0) {
				return;
			}
			this.method22899(arg0, local3, -1389478806);
		}
	}

	@OriginalMember(owner = "client!asn", name = "i", descriptor = "(Lclient!ald;)V")
	void method22904(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1086502446);
			if (local3 == 0) {
				return;
			}
			this.method22899(arg0, local3, 560680438);
		}
	}

	@OriginalMember(owner = "client!asn", name = "p", descriptor = "()V")
	void method22905() {
		@Pc(4) int local4;
		if (this.anIntArray278 != null) {
			for (local4 = 0; local4 < this.anIntArray278.length; local4++) {
				this.anIntArray278[local4] |= 0x8000;
			}
		}
		if (this.anIntArray277 != null) {
			for (local4 = 0; local4 < this.anIntArray277.length; local4++) {
				this.anIntArray277[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asn", name = "u", descriptor = "(CI)I")
	public int method22906(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray278 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray278.length; local6++) {
			if (arg0 == this.aCharArray4[local6]) {
				return this.anIntArray278[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "j", descriptor = "(C)I")
	public int method22907(@OriginalArg(0) char arg0) {
		if (this.anIntArray277 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray277.length; local6++) {
			if (this.aCharArray3[local6] == arg0) {
				return this.anIntArray277[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "o", descriptor = "(C)I")
	public int method22908(@OriginalArg(0) char arg0) {
		if (this.anIntArray277 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray277.length; local6++) {
			if (this.aCharArray3[local6] == arg0) {
				return this.anIntArray277[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "m", descriptor = "(C)I")
	public int method22909(@OriginalArg(0) char arg0) {
		if (this.anIntArray277 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray277.length; local6++) {
			if (this.aCharArray3[local6] == arg0) {
				return this.anIntArray277[local6];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!asn", name = "x", descriptor = "()V")
	void method22910() {
		@Pc(4) int local4;
		if (this.anIntArray278 != null) {
			for (local4 = 0; local4 < this.anIntArray278.length; local4++) {
				this.anIntArray278[local4] |= 0x8000;
			}
		}
		if (this.anIntArray277 != null) {
			for (local4 = 0; local4 < this.anIntArray277.length; local4++) {
				this.anIntArray277[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asn", name = "z", descriptor = "()V")
	void method22911() {
		@Pc(4) int local4;
		if (this.anIntArray278 != null) {
			for (local4 = 0; local4 < this.anIntArray278.length; local4++) {
				this.anIntArray278[local4] |= 0x8000;
			}
		}
		if (this.anIntArray277 != null) {
			for (local4 = 0; local4 < this.anIntArray277.length; local4++) {
				this.anIntArray277[local4] |= 0x8000;
			}
		}
	}
}
