package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afb")
public class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!afb", name = "f", descriptor = "I")
	int anInt583;

	@OriginalMember(owner = "client!afb", name = "m", descriptor = "I")
	int anInt585;

	@OriginalMember(owner = "client!afb", name = "k", descriptor = "I")
	int anInt586;

	@OriginalMember(owner = "client!afb", name = "w", descriptor = "I")
	int anInt587;

	@OriginalMember(owner = "client!afb", name = "u", descriptor = "Z")
	boolean aBoolean108 = false;

	@OriginalMember(owner = "client!afb", name = "e", descriptor = "I")
	int anInt584;

	@OriginalMember(owner = "client!afb", name = "n", descriptor = "I")
	int anInt588;

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "[I")
	int[] anIntArray43;

	@OriginalMember(owner = "client!afb", name = "<init>", descriptor = "(II[I)V", line = 15)
	Class105_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt584 = arg0;
		this.anInt588 = arg1;
		this.anIntArray43 = arg2;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray43.length; local15++) {
			if ((this.anIntArray43[local15] & -16777216) != -16777216) {
				this.aBoolean108 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!afb", name = "bm", descriptor = "()Z", line = 28)
	@Override
	public boolean method7216() {
		return false;
	}

	@OriginalMember(owner = "client!afb", name = "e", descriptor = "()Z", line = 28)
	@Override
	public boolean method7154() {
		return false;
	}

	@OriginalMember(owner = "client!afb", name = "bn", descriptor = "()Z", line = 28)
	@Override
	public boolean method7212() {
		return false;
	}

	@OriginalMember(owner = "client!afb", name = "bq", descriptor = "()Z", line = 28)
	@Override
	public boolean method7215() {
		return false;
	}

	@OriginalMember(owner = "client!afb", name = "bt", descriptor = "()Z", line = 28)
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!afb", name = "n", descriptor = "()Z", line = 32)
	@Override
	public boolean method7211() {
		return this.aBoolean108;
	}

	@OriginalMember(owner = "client!afb", name = "h", descriptor = "()Z", line = 32)
	@Override
	public boolean method7174() {
		return this.aBoolean108;
	}

	@OriginalMember(owner = "client!afb", name = "a", descriptor = "()Z", line = 32)
	@Override
	public boolean method7159() {
		return this.aBoolean108;
	}

	@OriginalMember(owner = "client!afb", name = "m", descriptor = "()I", line = 36)
	@Override
	public int method7206() {
		return this.anInt584;
	}

	@OriginalMember(owner = "client!afb", name = "bb", descriptor = "()I", line = 36)
	@Override
	public int method7217() {
		return this.anInt584;
	}

	@OriginalMember(owner = "client!afb", name = "be", descriptor = "()I", line = 36)
	@Override
	public int method7161() {
		return this.anInt584;
	}

	@OriginalMember(owner = "client!afb", name = "g", descriptor = "()I", line = 40)
	@Override
	public int method7176() {
		return this.anInt588;
	}

	@OriginalMember(owner = "client!afb", name = "i", descriptor = "()I", line = 40)
	@Override
	public int method7177() {
		return this.anInt588;
	}

	@OriginalMember(owner = "client!afb", name = "j", descriptor = "()I", line = 40)
	@Override
	public int method7178() {
		return this.anInt588;
	}

	@OriginalMember(owner = "client!afb", name = "k", descriptor = "()I", line = 40)
	@Override
	public int method7198() {
		return this.anInt588;
	}

	@OriginalMember(owner = "client!afb", name = "p", descriptor = "()I", line = 44)
	@Override
	public int method7163() {
		return this.anInt584 + this.anInt585 + this.anInt586;
	}

	@OriginalMember(owner = "client!afb", name = "t", descriptor = "()I", line = 44)
	@Override
	public int method7209() {
		return this.anInt584 + this.anInt585 + this.anInt586;
	}

	@OriginalMember(owner = "client!afb", name = "ae", descriptor = "()I", line = 44)
	@Override
	public int method7180() {
		return this.anInt584 + this.anInt585 + this.anInt586;
	}

	@OriginalMember(owner = "client!afb", name = "ah", descriptor = "()I", line = 48)
	@Override
	public int method7182() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "ag", descriptor = "()I", line = 48)
	@Override
	public int method7181() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "ac", descriptor = "()I", line = 48)
	@Override
	public int method7183() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "ai", descriptor = "()I", line = 48)
	@Override
	public int method7175() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "al", descriptor = "()I", line = 48)
	@Override
	public int method7179() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "d", descriptor = "()I", line = 48)
	@Override
	public int method7164() {
		return this.anInt588 + this.anInt583 + this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "f", descriptor = "()I", line = 52)
	@Override
	public int method7158() {
		return this.anInt585;
	}

	@OriginalMember(owner = "client!afb", name = "at", descriptor = "()I", line = 52)
	@Override
	public int method7187() {
		return this.anInt585;
	}

	@OriginalMember(owner = "client!afb", name = "ad", descriptor = "()I", line = 52)
	@Override
	public int method7173() {
		return this.anInt585;
	}

	@OriginalMember(owner = "client!afb", name = "aw", descriptor = "()I", line = 52)
	@Override
	public int method7165() {
		return this.anInt585;
	}

	@OriginalMember(owner = "client!afb", name = "as", descriptor = "()I", line = 52)
	@Override
	public int method7186() {
		return this.anInt585;
	}

	@OriginalMember(owner = "client!afb", name = "w", descriptor = "()I", line = 56)
	@Override
	public int method7170() {
		return this.anInt586;
	}

	@OriginalMember(owner = "client!afb", name = "am", descriptor = "()I", line = 56)
	@Override
	public int method7193() {
		return this.anInt586;
	}

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "()I", line = 60)
	@Override
	public int method7160() {
		return this.anInt583;
	}

	@OriginalMember(owner = "client!afb", name = "au", descriptor = "()I", line = 60)
	@Override
	public int method7190() {
		return this.anInt583;
	}

	@OriginalMember(owner = "client!afb", name = "u", descriptor = "()I", line = 64)
	@Override
	public int method7218() {
		return this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "ar", descriptor = "()I", line = 64)
	@Override
	public int method7220() {
		return this.anInt587;
	}

	@OriginalMember(owner = "client!afb", name = "z", descriptor = "()V", line = 68)
	@Override
	public void method7162() {
		this.anInt587 = 0;
		this.anInt583 = 0;
		this.anInt586 = 0;
		this.anInt585 = 0;
	}

	@OriginalMember(owner = "client!afb", name = "ap", descriptor = "()V", line = 68)
	@Override
	public void method7192() {
		this.anInt587 = 0;
		this.anInt583 = 0;
		this.anInt586 = 0;
		this.anInt585 = 0;
	}

	@OriginalMember(owner = "client!afb", name = "aq", descriptor = "()V", line = 68)
	@Override
	public void method7200() {
		this.anInt587 = 0;
		this.anInt583 = 0;
		this.anInt586 = 0;
		this.anInt585 = 0;
	}

	@OriginalMember(owner = "client!afb", name = "c", descriptor = "(I)V", line = 75)
	@Override
	public void method7213(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7163();
		@Pc(5) int local5 = this.method7164();
		if (this.anInt584 == local2 && this.anInt588 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt585) {
			local16 = this.anInt585;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt585 + this.anInt584 > local2) {
			local25 = local2 - this.anInt585 - this.anInt584;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt583) {
			local44 = this.anInt583;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt583 + this.anInt588 > local5) {
			local53 = local5 - this.anInt583 - this.anInt588;
		}
		@Pc(77) int local77 = this.anInt584 + local16 + local25;
		@Pc(84) int local84 = this.anInt588 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean108 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt588; local94++) {
			@Pc(103) int local103 = local94 * this.anInt584;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt584; local113++) {
				if ((this.anIntArray43[local103] & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local89[local111++] = this.anIntArray43[local103++];
			}
		}
		this.anInt585 -= local16;
		this.anInt583 -= local44;
		this.anInt586 -= local25;
		this.anInt587 -= local53;
		this.anInt584 = local77;
		this.anInt588 = local84;
		this.anIntArray43 = local89;
	}

	@OriginalMember(owner = "client!afb", name = "by", descriptor = "(I)V", line = 75)
	@Override
	public void method7219(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7163();
		@Pc(5) int local5 = this.method7164();
		if (this.anInt584 == local2 && this.anInt588 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt585) {
			local16 = this.anInt585;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt585 + this.anInt584 > local2) {
			local25 = local2 - this.anInt585 - this.anInt584;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt583) {
			local44 = this.anInt583;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt583 + this.anInt588 > local5) {
			local53 = local5 - this.anInt583 - this.anInt588;
		}
		@Pc(77) int local77 = this.anInt584 + local16 + local25;
		@Pc(84) int local84 = this.anInt588 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean108 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt588; local94++) {
			@Pc(103) int local103 = local94 * this.anInt584;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt584; local113++) {
				if ((this.anIntArray43[local103] & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local89[local111++] = this.anIntArray43[local103++];
			}
		}
		this.anInt585 -= local16;
		this.anInt583 -= local44;
		this.anInt586 -= local25;
		this.anInt587 -= local53;
		this.anInt584 = local77;
		this.anInt588 = local84;
		this.anIntArray43 = local89;
	}

	@OriginalMember(owner = "client!afb", name = "bu", descriptor = "(I)V", line = 75)
	@Override
	public void method7185(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7163();
		@Pc(5) int local5 = this.method7164();
		if (this.anInt584 == local2 && this.anInt588 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt585) {
			local16 = this.anInt585;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt585 + this.anInt584 > local2) {
			local25 = local2 - this.anInt585 - this.anInt584;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt583) {
			local44 = this.anInt583;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt583 + this.anInt588 > local5) {
			local53 = local5 - this.anInt583 - this.anInt588;
		}
		@Pc(77) int local77 = this.anInt584 + local16 + local25;
		@Pc(84) int local84 = this.anInt588 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean108 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt588; local94++) {
			@Pc(103) int local103 = local94 * this.anInt584;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt584; local113++) {
				if ((this.anIntArray43[local103] & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local89[local111++] = this.anIntArray43[local103++];
			}
		}
		this.anInt585 -= local16;
		this.anInt583 -= local44;
		this.anInt586 -= local25;
		this.anInt587 -= local53;
		this.anInt584 = local77;
		this.anInt588 = local84;
		this.anIntArray43 = local89;
	}

	@OriginalMember(owner = "client!afb", name = "bw", descriptor = "(I)V", line = 75)
	@Override
	public void method7221(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7163();
		@Pc(5) int local5 = this.method7164();
		if (this.anInt584 == local2 && this.anInt588 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt585) {
			local16 = this.anInt585;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt585 + this.anInt584 > local2) {
			local25 = local2 - this.anInt585 - this.anInt584;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt583) {
			local44 = this.anInt583;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt583 + this.anInt588 > local5) {
			local53 = local5 - this.anInt583 - this.anInt588;
		}
		@Pc(77) int local77 = this.anInt584 + local16 + local25;
		@Pc(84) int local84 = this.anInt588 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean108 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt588; local94++) {
			@Pc(103) int local103 = local94 * this.anInt584;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt584; local113++) {
				if ((this.anIntArray43[local103] & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local89[local111++] = this.anIntArray43[local103++];
			}
		}
		this.anInt585 -= local16;
		this.anInt583 -= local44;
		this.anInt586 -= local25;
		this.anInt587 -= local53;
		this.anInt584 = local77;
		this.anInt588 = local84;
		this.anIntArray43 = local89;
	}

	@OriginalMember(owner = "client!afb", name = "ax", descriptor = "(I)V", line = 110)
	@Override
	public void method7194(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean108 = false;
		@Pc(11) int[] local11 = new int[this.anInt584 * this.anInt588];
		for (@Pc(13) int local13 = 0; local13 < this.anInt588; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt584; local19++) {
				@Pc(28) int local28 = this.anIntArray43[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray43[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray43[local1 - this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt584 - 1 && (this.anIntArray43[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt588 - 1 && (this.anIntArray43[local1 + this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray43 = local11;
	}

	@OriginalMember(owner = "client!afb", name = "r", descriptor = "(I)V", line = 110)
	@Override
	public void method7166(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean108 = false;
		@Pc(11) int[] local11 = new int[this.anInt584 * this.anInt588];
		for (@Pc(13) int local13 = 0; local13 < this.anInt588; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt584; local19++) {
				@Pc(28) int local28 = this.anIntArray43[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray43[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray43[local1 - this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt584 - 1 && (this.anIntArray43[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt588 - 1 && (this.anIntArray43[local1 + this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray43 = local11;
	}

	@OriginalMember(owner = "client!afb", name = "av", descriptor = "(I)V", line = 110)
	@Override
	public void method7195(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean108 = false;
		@Pc(11) int[] local11 = new int[this.anInt584 * this.anInt588];
		for (@Pc(13) int local13 = 0; local13 < this.anInt588; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt584; local19++) {
				@Pc(28) int local28 = this.anIntArray43[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray43[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray43[local1 - this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt584 - 1 && (this.anIntArray43[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt588 - 1 && (this.anIntArray43[local1 + this.anInt584] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean108 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray43 = local11;
	}

	@OriginalMember(owner = "client!afb", name = "v", descriptor = "(I)V", line = 132)
	@Override
	public void method7167(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt588 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt584;
			for (@Pc(16) int local16 = this.anInt584 - 1; local16 > 0; local16--) {
				if ((this.anIntArray43[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray43[local16 + local11 - 1 - this.anInt584] & 0xFF000000) != 0) {
					this.anIntArray43[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afb", name = "ao", descriptor = "(I)V", line = 132)
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt588 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt584;
			for (@Pc(16) int local16 = this.anInt584 - 1; local16 > 0; local16--) {
				if ((this.anIntArray43[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray43[local16 + local11 - 1 - this.anInt584] & 0xFF000000) != 0) {
					this.anIntArray43[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afb", name = "aj", descriptor = "(I)V", line = 132)
	@Override
	public void method7197(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt588 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt584;
			for (@Pc(16) int local16 = this.anInt584 - 1; local16 > 0; local16--) {
				if ((this.anIntArray43[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray43[local16 + local11 - 1 - this.anInt584] & 0xFF000000) != 0) {
					this.anIntArray43[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afb", name = "o", descriptor = "()V", line = 144)
	@Override
	public void method7168() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(7) int local7;
		for (local7 = this.anInt588 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt584;
			@Pc(21) int local21 = (local7 + 1) * this.anInt584;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt585;
		this.anInt585 = this.anInt586;
		this.anInt586 = local7;
	}

	@OriginalMember(owner = "client!afb", name = "ab", descriptor = "()V", line = 144)
	@Override
	public void method7199() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(7) int local7;
		for (local7 = this.anInt588 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt584;
			@Pc(21) int local21 = (local7 + 1) * this.anInt584;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt585;
		this.anInt585 = this.anInt586;
		this.anInt586 = local7;
	}

	@OriginalMember(owner = "client!afb", name = "ay", descriptor = "()V", line = 144)
	@Override
	public void method7205() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(7) int local7;
		for (local7 = this.anInt588 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt584;
			@Pc(21) int local21 = (local7 + 1) * this.anInt584;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt585;
		this.anInt585 = this.anInt586;
		this.anInt586 = local7;
	}

	@OriginalMember(owner = "client!afb", name = "aa", descriptor = "()V", line = 144)
	@Override
	public void method7201() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(7) int local7;
		for (local7 = this.anInt588 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt584;
			@Pc(21) int local21 = (local7 + 1) * this.anInt584;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt585;
		this.anInt585 = this.anInt586;
		this.anInt586 = local7;
	}

	@OriginalMember(owner = "client!afb", name = "az", descriptor = "()V", line = 144)
	@Override
	public void method7188() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(7) int local7;
		for (local7 = this.anInt588 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt584;
			@Pc(21) int local21 = (local7 + 1) * this.anInt584;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt585;
		this.anInt585 = this.anInt586;
		this.anInt586 = local7;
	}

	@OriginalMember(owner = "client!afb", name = "s", descriptor = "()V", line = 163)
	@Override
	public void method7169() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(9) int local9;
		for (local9 = (this.anInt588 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt584;
			@Pc(26) int local26 = (this.anInt588 - local9 - 1) * this.anInt584;
			for (@Pc(30) int local30 = -this.anInt584; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt583;
		this.anInt583 = this.anInt587;
		this.anInt587 = local9;
	}

	@OriginalMember(owner = "client!afb", name = "br", descriptor = "()V", line = 163)
	@Override
	public void method7225() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(9) int local9;
		for (local9 = (this.anInt588 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt584;
			@Pc(26) int local26 = (this.anInt588 - local9 - 1) * this.anInt584;
			for (@Pc(30) int local30 = -this.anInt584; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt583;
		this.anInt583 = this.anInt587;
		this.anInt587 = local9;
	}

	@OriginalMember(owner = "client!afb", name = "bo", descriptor = "()V", line = 163)
	@Override
	public void method7222() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(9) int local9;
		for (local9 = (this.anInt588 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt584;
			@Pc(26) int local26 = (this.anInt588 - local9 - 1) * this.anInt584;
			for (@Pc(30) int local30 = -this.anInt584; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt583;
		this.anInt583 = this.anInt587;
		this.anInt587 = local9;
	}

	@OriginalMember(owner = "client!afb", name = "bz", descriptor = "()V", line = 163)
	@Override
	public void method7223() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(9) int local9;
		for (local9 = (this.anInt588 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt584;
			@Pc(26) int local26 = (this.anInt588 - local9 - 1) * this.anInt584;
			for (@Pc(30) int local30 = -this.anInt584; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt583;
		this.anInt583 = this.anInt587;
		this.anInt587 = local9;
	}

	@OriginalMember(owner = "client!afb", name = "bv", descriptor = "()V", line = 163)
	@Override
	public void method7224() {
		@Pc(2) int[] local2 = this.anIntArray43;
		@Pc(9) int local9;
		for (local9 = (this.anInt588 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt584;
			@Pc(26) int local26 = (this.anInt588 - local9 - 1) * this.anInt584;
			for (@Pc(30) int local30 = -this.anInt584; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt583;
		this.anInt583 = this.anInt587;
		this.anInt587 = local9;
	}

	@OriginalMember(owner = "client!afb", name = "ak", descriptor = "()V", line = 181)
	@Override
	public void method7203() {
		@Pc(6) int[] local6 = new int[this.anInt584 * this.anInt588];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt584; local10++) {
			for (@Pc(19) int local19 = this.anInt588 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray43[local10 + local19 * this.anInt584];
			}
		}
		this.anIntArray43 = local6;
		local10 = this.anInt583;
		this.anInt583 = this.anInt585;
		this.anInt585 = this.anInt587;
		this.anInt587 = this.anInt586;
		this.anInt586 = local10;
		local10 = this.anInt588;
		this.anInt588 = this.anInt584;
		this.anInt584 = local10;
	}

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "()V", line = 181)
	@Override
	public void method7155() {
		@Pc(6) int[] local6 = new int[this.anInt584 * this.anInt588];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt584; local10++) {
			for (@Pc(19) int local19 = this.anInt588 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray43[local10 + local19 * this.anInt584];
			}
		}
		this.anIntArray43 = local6;
		local10 = this.anInt583;
		this.anInt583 = this.anInt585;
		this.anInt585 = this.anInt587;
		this.anInt587 = this.anInt586;
		this.anInt586 = local10;
		local10 = this.anInt588;
		this.anInt588 = this.anInt584;
		this.anInt584 = local10;
	}

	@OriginalMember(owner = "client!afb", name = "af", descriptor = "()V", line = 181)
	@Override
	public void method7202() {
		@Pc(6) int[] local6 = new int[this.anInt584 * this.anInt588];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt584; local10++) {
			for (@Pc(19) int local19 = this.anInt588 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray43[local10 + local19 * this.anInt584];
			}
		}
		this.anIntArray43 = local6;
		local10 = this.anInt583;
		this.anInt583 = this.anInt585;
		this.anInt585 = this.anInt587;
		this.anInt587 = this.anInt586;
		this.anInt586 = local10;
		local10 = this.anInt588;
		this.anInt588 = this.anInt584;
		this.anInt584 = local10;
	}

	@OriginalMember(owner = "client!afb", name = "an", descriptor = "()V", line = 181)
	@Override
	public void method7204() {
		@Pc(6) int[] local6 = new int[this.anInt584 * this.anInt588];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt584; local10++) {
			for (@Pc(19) int local19 = this.anInt588 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray43[local10 + local19 * this.anInt584];
			}
		}
		this.anIntArray43 = local6;
		local10 = this.anInt583;
		this.anInt583 = this.anInt585;
		this.anInt585 = this.anInt587;
		this.anInt587 = this.anInt586;
		this.anInt586 = local10;
		local10 = this.anInt588;
		this.anInt588 = this.anInt584;
		this.anInt584 = local10;
	}

	@OriginalMember(owner = "client!afb", name = "bl", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method7157(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7163() == this.anInt584 && this.method7164() == this.anInt588) {
			return this.anIntArray43;
		}
		@Pc(14) int local14 = this.method7163();
		@Pc(20) int[] local20 = new int[local14 * this.method7164()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt588; local22++) {
			@Pc(31) int local31 = local22 * this.anInt584;
			@Pc(41) int local41 = this.anInt585 + (local22 + this.anInt583) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt584; local43++) {
				local20[local41++] = this.anIntArray43[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afb", name = "q", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method7171(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7163() == this.anInt584 && this.method7164() == this.anInt588) {
			return this.anIntArray43;
		}
		@Pc(14) int local14 = this.method7163();
		@Pc(20) int[] local20 = new int[local14 * this.method7164()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt588; local22++) {
			@Pc(31) int local31 = local22 * this.anInt584;
			@Pc(41) int local41 = this.anInt585 + (local22 + this.anInt583) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt584; local43++) {
				local20[local41++] = this.anIntArray43[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afb", name = "bf", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method7156(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method7163() == this.anInt584 && this.method7164() == this.anInt588) {
			return this.anIntArray43;
		}
		@Pc(14) int local14 = this.method7163();
		@Pc(20) int[] local20 = new int[local14 * this.method7164()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt588; local22++) {
			@Pc(31) int local31 = local22 * this.anInt584;
			@Pc(41) int local41 = this.anInt585 + (local22 + this.anInt583) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt584; local43++) {
				local20[local41++] = this.anIntArray43[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!afb", name = "x", descriptor = "(III)V", line = 215)
	@Override
	public void method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray43.length; local1++) {
			@Pc(15) int local15 = this.anIntArray43[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray43[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray43[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray43[local1] = this.anIntArray43[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!afb", name = "bk", descriptor = "(III)V", line = 215)
	@Override
	public void method7207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray43.length; local1++) {
			@Pc(15) int local15 = this.anIntArray43[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray43[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray43[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray43[local1] = this.anIntArray43[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!afb", name = "bh", descriptor = "(III)V", line = 215)
	@Override
	public void method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray43.length; local1++) {
			@Pc(15) int local15 = this.anIntArray43[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray43[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray43[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray43[local1] = this.anIntArray43[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!afb", name = "bx", descriptor = "(II)I", line = 233)
	@Override
	public int method7191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray43[arg0 + arg1 * this.anInt584];
	}

	@OriginalMember(owner = "client!afb", name = "b", descriptor = "(II)I", line = 233)
	@Override
	public int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray43[arg0 + arg1 * this.anInt584];
	}

	@OriginalMember(owner = "client!afb", name = "bd", descriptor = "(II)I", line = 233)
	@Override
	public int method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray43[arg0 + arg1 * this.anInt584];
	}

	@OriginalMember(owner = "client!afb", name = "bc", descriptor = "(II)I", line = 233)
	@Override
	public int method7153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray43[arg0 + arg1 * this.anInt584];
	}

	@OriginalMember(owner = "client!afb", name = "bi", descriptor = "(II)I", line = 233)
	@Override
	public int method7189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray43[arg0 + arg1 * this.anInt584];
	}
}
