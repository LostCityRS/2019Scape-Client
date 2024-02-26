package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afq")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!afq", name = "e", descriptor = "I")
	int anInt851;

	@OriginalMember(owner = "client!afq", name = "u", descriptor = "I")
	int anInt852;

	@OriginalMember(owner = "client!afq", name = "g", descriptor = "I")
	int anInt854;

	@OriginalMember(owner = "client!afq", name = "l", descriptor = "I")
	int anInt855;

	@OriginalMember(owner = "client!afq", name = "m", descriptor = "Z")
	boolean aBoolean169 = false;

	@OriginalMember(owner = "client!afq", name = "t", descriptor = "I")
	int anInt853;

	@OriginalMember(owner = "client!afq", name = "f", descriptor = "I")
	int anInt850;

	@OriginalMember(owner = "client!afq", name = "i", descriptor = "[I")
	int[] anIntArray78;

	@OriginalMember(owner = "client!afq", name = "<init>", descriptor = "(II[I)V")
	Class109_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt853 = arg0;
		this.anInt850 = arg1;
		this.anIntArray78 = arg2;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray78.length; local15++) {
			if ((this.anIntArray78[local15] & -16777216) != -16777216) {
				this.aBoolean169 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!afq", name = "bj", descriptor = "()I")
	@Override
	public int method7135() {
		return this.anInt851;
	}

	@OriginalMember(owner = "client!afq", name = "t", descriptor = "()Z")
	@Override
	public boolean method7116() {
		return false;
	}

	@OriginalMember(owner = "client!afq", name = "aw", descriptor = "(Z)[I")
	@Override
	public int[] method7161(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7126() == this.anInt853 && this.method7137() == this.anInt850) {
			return this.anIntArray78;
		}
		@Pc(14) int local14 = this.method7126();
		@Pc(20) int[] local20 = new int[local14 * this.method7137()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt850; local22++) {
			@Pc(31) int local31 = local22 * this.anInt853;
			@Pc(41) int local41 = this.anInt851 + (local22 + this.anInt855) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt853; local43++) {
				local20[local41++] = this.anIntArray78[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afq", name = "e", descriptor = "()I")
	@Override
	public int method7119() {
		return this.anInt853;
	}

	@OriginalMember(owner = "client!afq", name = "ad", descriptor = "()V")
	@Override
	public void method7157() {
		this.anInt854 = 0;
		this.anInt855 = 0;
		this.anInt852 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!afq", name = "j", descriptor = "()I")
	@Override
	public int method7126() {
		return this.anInt853 + this.anInt851 + this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "a", descriptor = "()I")
	@Override
	public int method7137() {
		return this.anInt850 + this.anInt855 + this.anInt854;
	}

	@OriginalMember(owner = "client!afq", name = "l", descriptor = "()I")
	@Override
	public int method7121() {
		return this.anInt851;
	}

	@OriginalMember(owner = "client!afq", name = "g", descriptor = "()I")
	@Override
	public int method7122() {
		return this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "i", descriptor = "()I")
	@Override
	public int method7123() {
		return this.anInt855;
	}

	@OriginalMember(owner = "client!afq", name = "m", descriptor = "()I")
	@Override
	public int method7148() {
		return this.anInt854;
	}

	@OriginalMember(owner = "client!afq", name = "o", descriptor = "()V")
	@Override
	public void method7125() {
		this.anInt854 = 0;
		this.anInt855 = 0;
		this.anInt852 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!afq", name = "ai", descriptor = "()I")
	@Override
	public int method7144() {
		return this.anInt850;
	}

	@OriginalMember(owner = "client!afq", name = "br", descriptor = "(Z)[I")
	@Override
	public int[] method7170(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7126() == this.anInt853 && this.method7137() == this.anInt850) {
			return this.anIntArray78;
		}
		@Pc(14) int local14 = this.method7126();
		@Pc(20) int[] local20 = new int[local14 * this.method7137()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt850; local22++) {
			@Pc(31) int local31 = local22 * this.anInt853;
			@Pc(41) int local41 = this.anInt851 + (local22 + this.anInt855) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt853; local43++) {
				local20[local41++] = this.anIntArray78[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afq", name = "x", descriptor = "(I)V")
	@Override
	public void method7174(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt850 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt853;
			for (@Pc(16) int local16 = this.anInt853 - 1; local16 > 0; local16--) {
				if ((this.anIntArray78[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray78[local16 + local11 - 1 - this.anInt853] & 0xFF000000) != 0) {
					this.anIntArray78[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afq", name = "w", descriptor = "()V")
	@Override
	public void method7131() {
		@Pc(2) int[] local2 = this.anIntArray78;
		@Pc(7) int local7;
		for (local7 = this.anInt850 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt853;
			@Pc(21) int local21 = (local7 + 1) * this.anInt853;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt851;
		this.anInt851 = this.anInt852;
		this.anInt852 = local7;
	}

	@OriginalMember(owner = "client!afq", name = "r", descriptor = "()V")
	@Override
	public void method7172() {
		@Pc(2) int[] local2 = this.anIntArray78;
		@Pc(9) int local9;
		for (local9 = (this.anInt850 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt853;
			@Pc(26) int local26 = (this.anInt850 - local9 - 1) * this.anInt853;
			for (@Pc(30) int local30 = -this.anInt853; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt855;
		this.anInt855 = this.anInt854;
		this.anInt854 = local9;
	}

	@OriginalMember(owner = "client!afq", name = "q", descriptor = "()V")
	@Override
	public void method7133() {
		@Pc(6) int[] local6 = new int[this.anInt853 * this.anInt850];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt853; local10++) {
			for (@Pc(19) int local19 = this.anInt850 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray78[local10 + local19 * this.anInt853];
			}
		}
		this.anIntArray78 = local6;
		local10 = this.anInt855;
		this.anInt855 = this.anInt851;
		this.anInt851 = this.anInt854;
		this.anInt854 = this.anInt852;
		this.anInt852 = local10;
		local10 = this.anInt850;
		this.anInt850 = this.anInt853;
		this.anInt853 = local10;
	}

	@OriginalMember(owner = "client!afq", name = "h", descriptor = "(Z)[I")
	@Override
	public int[] method7117(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7126() == this.anInt853 && this.method7137() == this.anInt850) {
			return this.anIntArray78;
		}
		@Pc(14) int local14 = this.method7126();
		@Pc(20) int[] local20 = new int[local14 * this.method7137()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt850; local22++) {
			@Pc(31) int local31 = local22 * this.anInt853;
			@Pc(41) int local41 = this.anInt851 + (local22 + this.anInt855) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt853; local43++) {
				local20[local41++] = this.anIntArray78[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afq", name = "d", descriptor = "(III)V")
	@Override
	public void method7134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray78.length; local1++) {
			@Pc(15) int local15 = this.anIntArray78[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray78[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray78[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray78[local1] = this.anIntArray78[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!afq", name = "z", descriptor = "(II)I")
	@Override
	public int method7162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray78[arg0 + arg1 * this.anInt853];
	}

	@OriginalMember(owner = "client!afq", name = "p", descriptor = "()Z")
	@Override
	public boolean method7136() {
		return false;
	}

	@OriginalMember(owner = "client!afq", name = "u", descriptor = "()I")
	@Override
	public int method7127() {
		return this.anInt850;
	}

	@OriginalMember(owner = "client!afq", name = "y", descriptor = "()Z")
	@Override
	public boolean method7138() {
		return false;
	}

	@OriginalMember(owner = "client!afq", name = "n", descriptor = "()Z")
	@Override
	public boolean method7132() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!afq", name = "c", descriptor = "()Z")
	@Override
	public boolean method7160() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!afq", name = "b", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!afq", name = "v", descriptor = "()Z")
	@Override
	public boolean method7173() {
		return false;
	}

	@OriginalMember(owner = "client!afq", name = "ay", descriptor = "()I")
	@Override
	public int method7143() {
		return this.anInt853;
	}

	@OriginalMember(owner = "client!afq", name = "ap", descriptor = "(I)V")
	@Override
	public void method7120(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean169 = false;
		@Pc(11) int[] local11 = new int[this.anInt853 * this.anInt850];
		for (@Pc(13) int local13 = 0; local13 < this.anInt850; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt853; local19++) {
				@Pc(28) int local28 = this.anIntArray78[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray78[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray78[local1 - this.anInt853] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt853 - 1 && (this.anIntArray78[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt850 - 1 && (this.anIntArray78[local1 + this.anInt853] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray78 = local11;
	}

	@OriginalMember(owner = "client!afq", name = "aq", descriptor = "()I")
	@Override
	public int method7145() {
		return this.anInt853 + this.anInt851 + this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "ao", descriptor = "()I")
	@Override
	public int method7146() {
		return this.anInt853 + this.anInt851 + this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "ba", descriptor = "(II)I")
	@Override
	public int method7151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray78[arg0 + arg1 * this.anInt853];
	}

	@OriginalMember(owner = "client!afq", name = "ac", descriptor = "()I")
	@Override
	public int method7130() {
		return this.anInt850 + this.anInt855 + this.anInt854;
	}

	@OriginalMember(owner = "client!afq", name = "ag", descriptor = "()I")
	@Override
	public int method7149() {
		return this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "f", descriptor = "()Z")
	@Override
	public boolean method7118() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!afq", name = "ab", descriptor = "()I")
	@Override
	public int method7167() {
		return this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "bk", descriptor = "()V")
	@Override
	public void method7177() {
		@Pc(2) int[] local2 = this.anIntArray78;
		@Pc(7) int local7;
		for (local7 = this.anInt850 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt853;
			@Pc(21) int local21 = (local7 + 1) * this.anInt853;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt851;
		this.anInt851 = this.anInt852;
		this.anInt852 = local7;
	}

	@OriginalMember(owner = "client!afq", name = "k", descriptor = "(I)V")
	@Override
	public void method7129(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean169 = false;
		@Pc(11) int[] local11 = new int[this.anInt853 * this.anInt850];
		for (@Pc(13) int local13 = 0; local13 < this.anInt850; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt853; local19++) {
				@Pc(28) int local28 = this.anIntArray78[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray78[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray78[local1 - this.anInt853] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt853 - 1 && (this.anIntArray78[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt850 - 1 && (this.anIntArray78[local1 + this.anInt853] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray78 = local11;
	}

	@OriginalMember(owner = "client!afq", name = "am", descriptor = "()I")
	@Override
	public int method7154() {
		return this.anInt854;
	}

	@OriginalMember(owner = "client!afq", name = "av", descriptor = "()V")
	@Override
	public void method7158() {
		this.anInt854 = 0;
		this.anInt855 = 0;
		this.anInt852 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!afq", name = "at", descriptor = "()V")
	@Override
	public void method7156() {
		this.anInt854 = 0;
		this.anInt855 = 0;
		this.anInt852 = 0;
		this.anInt851 = 0;
	}

	@OriginalMember(owner = "client!afq", name = "ar", descriptor = "(I)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt850 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt853;
			for (@Pc(16) int local16 = this.anInt853 - 1; local16 > 0; local16--) {
				if ((this.anIntArray78[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray78[local16 + local11 - 1 - this.anInt853] & 0xFF000000) != 0) {
					this.anIntArray78[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afq", name = "ae", descriptor = "(I)V")
	@Override
	public void method7159(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt853 == local2 && this.anInt850 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt851) {
			local16 = this.anInt851;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt851 + this.anInt853 > local2) {
			local25 = local2 - this.anInt851 - this.anInt853;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt855) {
			local44 = this.anInt855;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt855 + this.anInt850 > local5) {
			local53 = local5 - this.anInt855 - this.anInt850;
		}
		@Pc(77) int local77 = this.anInt853 + local16 + local25;
		@Pc(84) int local84 = this.anInt850 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean169 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt850; local94++) {
			@Pc(103) int local103 = local94 * this.anInt853;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt853; local113++) {
				if ((this.anIntArray78[local103] & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local89[local111++] = this.anIntArray78[local103++];
			}
		}
		this.anInt851 -= local16;
		this.anInt855 -= local44;
		this.anInt852 -= local25;
		this.anInt854 -= local53;
		this.anInt853 = local77;
		this.anInt850 = local84;
		this.anIntArray78 = local89;
	}

	@OriginalMember(owner = "client!afq", name = "an", descriptor = "(I)V")
	@Override
	public void method7140(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt853 == local2 && this.anInt850 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt851) {
			local16 = this.anInt851;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt851 + this.anInt853 > local2) {
			local25 = local2 - this.anInt851 - this.anInt853;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt855) {
			local44 = this.anInt855;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt855 + this.anInt850 > local5) {
			local53 = local5 - this.anInt855 - this.anInt850;
		}
		@Pc(77) int local77 = this.anInt853 + local16 + local25;
		@Pc(84) int local84 = this.anInt850 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean169 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt850; local94++) {
			@Pc(103) int local103 = local94 * this.anInt853;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt853; local113++) {
				if ((this.anIntArray78[local103] & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local89[local111++] = this.anIntArray78[local103++];
			}
		}
		this.anInt851 -= local16;
		this.anInt855 -= local44;
		this.anInt852 -= local25;
		this.anInt854 -= local53;
		this.anInt853 = local77;
		this.anInt850 = local84;
		this.anIntArray78 = local89;
	}

	@OriginalMember(owner = "client!afq", name = "by", descriptor = "()I")
	@Override
	public int method7176() {
		return this.anInt851;
	}

	@OriginalMember(owner = "client!afq", name = "aj", descriptor = "()I")
	@Override
	public int method7150() {
		return this.anInt853 + this.anInt851 + this.anInt852;
	}

	@OriginalMember(owner = "client!afq", name = "af", descriptor = "()I")
	@Override
	public int method7153() {
		return this.anInt855;
	}

	@OriginalMember(owner = "client!afq", name = "au", descriptor = "(I)V")
	@Override
	public void method7164(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt850 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt853;
			for (@Pc(16) int local16 = this.anInt853 - 1; local16 > 0; local16--) {
				if ((this.anIntArray78[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray78[local16 + local11 - 1 - this.anInt853] & 0xFF000000) != 0) {
					this.anIntArray78[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afq", name = "az", descriptor = "()V")
	@Override
	public void method7139() {
		@Pc(2) int[] local2 = this.anIntArray78;
		@Pc(9) int local9;
		for (local9 = (this.anInt850 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt853;
			@Pc(26) int local26 = (this.anInt850 - local9 - 1) * this.anInt853;
			for (@Pc(30) int local30 = -this.anInt853; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt855;
		this.anInt855 = this.anInt854;
		this.anInt854 = local9;
	}

	@OriginalMember(owner = "client!afq", name = "bg", descriptor = "(Z)[I")
	@Override
	public int[] method7168(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7126() == this.anInt853 && this.method7137() == this.anInt850) {
			return this.anIntArray78;
		}
		@Pc(14) int local14 = this.method7126();
		@Pc(20) int[] local20 = new int[local14 * this.method7137()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt850; local22++) {
			@Pc(31) int local31 = local22 * this.anInt853;
			@Pc(41) int local41 = this.anInt851 + (local22 + this.anInt855) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt853; local43++) {
				local20[local41++] = this.anIntArray78[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afq", name = "ah", descriptor = "()I")
	@Override
	public int method7152() {
		return this.anInt855;
	}

	@OriginalMember(owner = "client!afq", name = "aa", descriptor = "(I)V")
	@Override
	public void method7128(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt853 == local2 && this.anInt850 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt851) {
			local16 = this.anInt851;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt851 + this.anInt853 > local2) {
			local25 = local2 - this.anInt851 - this.anInt853;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt855) {
			local44 = this.anInt855;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt855 + this.anInt850 > local5) {
			local53 = local5 - this.anInt855 - this.anInt850;
		}
		@Pc(77) int local77 = this.anInt853 + local16 + local25;
		@Pc(84) int local84 = this.anInt850 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean169 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt850; local94++) {
			@Pc(103) int local103 = local94 * this.anInt853;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt853; local113++) {
				if ((this.anIntArray78[local103] & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local89[local111++] = this.anIntArray78[local103++];
			}
		}
		this.anInt851 -= local16;
		this.anInt855 -= local44;
		this.anInt852 -= local25;
		this.anInt854 -= local53;
		this.anInt853 = local77;
		this.anInt850 = local84;
		this.anIntArray78 = local89;
	}

	@OriginalMember(owner = "client!afq", name = "bl", descriptor = "(Z)[I")
	@Override
	public int[] method7169(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7126() == this.anInt853 && this.method7137() == this.anInt850) {
			return this.anIntArray78;
		}
		@Pc(14) int local14 = this.method7126();
		@Pc(20) int[] local20 = new int[local14 * this.method7137()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt850; local22++) {
			@Pc(31) int local31 = local22 * this.anInt853;
			@Pc(41) int local41 = this.anInt851 + (local22 + this.anInt855) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt853; local43++) {
				local20[local41++] = this.anIntArray78[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afq", name = "s", descriptor = "(I)V")
	@Override
	public void method7165(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt853 == local2 && this.anInt850 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt851) {
			local16 = this.anInt851;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt851 + this.anInt853 > local2) {
			local25 = local2 - this.anInt851 - this.anInt853;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt855) {
			local44 = this.anInt855;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt855 + this.anInt850 > local5) {
			local53 = local5 - this.anInt855 - this.anInt850;
		}
		@Pc(77) int local77 = this.anInt853 + local16 + local25;
		@Pc(84) int local84 = this.anInt850 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean169 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt850; local94++) {
			@Pc(103) int local103 = local94 * this.anInt853;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt853; local113++) {
				if ((this.anIntArray78[local103] & -16777216) != -16777216) {
					this.aBoolean169 = true;
				}
				local89[local111++] = this.anIntArray78[local103++];
			}
		}
		this.anInt851 -= local16;
		this.anInt855 -= local44;
		this.anInt852 -= local25;
		this.anInt854 -= local53;
		this.anInt853 = local77;
		this.anInt850 = local84;
		this.anIntArray78 = local89;
	}

	@OriginalMember(owner = "client!afq", name = "bn", descriptor = "(III)V")
	@Override
	public void method7171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray78.length; local1++) {
			@Pc(15) int local15 = this.anIntArray78[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray78[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray78[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray78[local1] = this.anIntArray78[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!afq", name = "bs", descriptor = "(II)I")
	@Override
	public int method7175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray78[arg0 + arg1 * this.anInt853];
	}

	@OriginalMember(owner = "client!afq", name = "bt", descriptor = "(II)I")
	@Override
	public int method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray78[arg0 + arg1 * this.anInt853];
	}

	@OriginalMember(owner = "client!afq", name = "ax", descriptor = "()I")
	@Override
	public int method7142() {
		return this.anInt853;
	}

	@OriginalMember(owner = "client!afq", name = "al", descriptor = "()I")
	@Override
	public int method7124() {
		return this.anInt855;
	}

	@OriginalMember(owner = "client!afq", name = "as", descriptor = "()V")
	@Override
	public void method7166() {
		@Pc(6) int[] local6 = new int[this.anInt853 * this.anInt850];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt853; local10++) {
			for (@Pc(19) int local19 = this.anInt850 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray78[local10 + local19 * this.anInt853];
			}
		}
		this.anIntArray78 = local6;
		local10 = this.anInt855;
		this.anInt855 = this.anInt851;
		this.anInt851 = this.anInt854;
		this.anInt854 = this.anInt852;
		this.anInt852 = local10;
		local10 = this.anInt850;
		this.anInt850 = this.anInt853;
		this.anInt853 = local10;
	}

	@OriginalMember(owner = "client!afq", name = "ak", descriptor = "()I")
	@Override
	public int method7155() {
		return this.anInt854;
	}

	@OriginalMember(owner = "client!afq", name = "bz", descriptor = "()V")
	@Override
	public void method7178() {
		@Pc(2) int[] local2 = this.anIntArray78;
		@Pc(7) int local7;
		for (local7 = this.anInt850 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt853;
			@Pc(21) int local21 = (local7 + 1) * this.anInt853;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt851;
		this.anInt851 = this.anInt852;
		this.anInt852 = local7;
	}
}
