package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afs")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!afs", name = "m", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!afs", name = "f", descriptor = "I")
	int anInt856;

	@OriginalMember(owner = "client!afs", name = "e", descriptor = "I")
	int anInt857;

	@OriginalMember(owner = "client!afs", name = "u", descriptor = "I")
	int anInt858;

	@OriginalMember(owner = "client!afs", name = "l", descriptor = "I")
	int anInt859;

	@OriginalMember(owner = "client!afs", name = "g", descriptor = "I")
	int anInt860;

	@OriginalMember(owner = "client!afs", name = "i", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!afs", name = "o", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!afs", name = "t", descriptor = "I")
	int anInt861;

	@OriginalMember(owner = "client!afs", name = "<init>", descriptor = "()V")
	Class109_Sub2() {
	}

	@OriginalMember(owner = "client!afs", name = "br", descriptor = "(Z)[I")
	@Override
	public int[] method7170(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10;
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg0) {
			local4 = this.method7126();
			local10 = new int[local4 * this.method7137()];
			if (this.aByteArray26 == null) {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						@Pc(104) int local104 = this.anIntArray79[this.aByteArray25[local24++] & 0xFF];
						if (local104 == 0) {
							local10[local34++] = 0;
						} else {
							local10[local34++] = local104 | 0xFF000000;
						}
					}
				}
			} else {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						local10[local34++] = this.aByteArray26[local24] << 24 | this.anIntArray79[this.aByteArray25[local24] & 0xFF];
						local24++;
					}
				}
			}
		} else {
			local10 = new int[this.anInt861 * this.anInt856];
			local4 = 0;
			local15 = 0;
			if (this.aByteArray26 == null) {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local36 = this.anIntArray79[this.aByteArray25[local4++] & 0xFF];
						local10[local15++] = local36 == 0 ? 0 : local36 | 0xFF000000;
					}
				}
			} else {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local10[local15++] = this.aByteArray26[local4] << 24 | this.anIntArray79[this.aByteArray25[local4] & 0xFF];
						local4++;
					}
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!afs", name = "n", descriptor = "()Z")
	@Override
	public boolean method7132() {
		return this.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!afs", name = "f", descriptor = "()Z")
	@Override
	public boolean method7118() {
		return this.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!afs", name = "e", descriptor = "()I")
	@Override
	public int method7119() {
		return this.anInt861;
	}

	@OriginalMember(owner = "client!afs", name = "u", descriptor = "()I")
	@Override
	public int method7127() {
		return this.anInt856;
	}

	@OriginalMember(owner = "client!afs", name = "j", descriptor = "()I")
	@Override
	public int method7126() {
		return this.anInt861 + this.anInt857 + this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "z", descriptor = "(II)I")
	@Override
	public int method7162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray79[this.aByteArray25[arg0 + arg1 * this.anInt861] & 0xFF];
	}

	@OriginalMember(owner = "client!afs", name = "l", descriptor = "()I")
	@Override
	public int method7121() {
		return this.anInt857;
	}

	@OriginalMember(owner = "client!afs", name = "g", descriptor = "()I")
	@Override
	public int method7122() {
		return this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "az", descriptor = "()V")
	@Override
	public void method7139() {
		@Pc(2) byte[] local2 = this.aByteArray25;
		@Pc(39) byte local39;
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.aByteArray26 == null) {
			for (local12 = (this.anInt856 >> 1) - 1; local12 >= 0; local12--) {
				local19 = local12 * this.anInt861;
				local29 = (this.anInt856 - local12 - 1) * this.anInt861;
				for (local33 = -this.anInt861; local33 < 0; local33++) {
					local39 = local2[local19];
					local2[local19] = local2[local29];
					local2[local29] = local39;
					local19++;
					local29++;
				}
			}
		} else {
			@Pc(59) byte[] local59 = this.aByteArray26;
			for (local19 = (this.anInt856 >> 1) - 1; local19 >= 0; local19--) {
				local29 = local19 * this.anInt861;
				local33 = (this.anInt856 - local19 - 1) * this.anInt861;
				for (@Pc(87) int local87 = -this.anInt861; local87 < 0; local87++) {
					local39 = local2[local29];
					local2[local29] = local2[local33];
					local2[local33] = local39;
					local39 = local59[local29];
					local59[local29] = local59[local33];
					local59[local33] = local39;
					local29++;
					local33++;
				}
			}
		}
		local12 = this.anInt859;
		this.anInt859 = this.anInt860;
		this.anInt860 = local12;
	}

	@OriginalMember(owner = "client!afs", name = "bt", descriptor = "(II)I")
	@Override
	public int method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray79[this.aByteArray25[arg0 + arg1 * this.anInt861] & 0xFF];
	}

	@OriginalMember(owner = "client!afs", name = "o", descriptor = "()V")
	@Override
	public void method7125() {
		this.anInt860 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		this.anInt857 = 0;
	}

	@OriginalMember(owner = "client!afs", name = "x", descriptor = "(I)V")
	@Override
	public void method7174(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(63) int local63;
		@Pc(69) int local69;
		if (this.anIntArray79.length < 255) {
			for (local8 = 0; local8 < this.anIntArray79.length; local8++) {
				if (this.anIntArray79[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray79.length;
				@Pc(38) int[] local38 = new int[this.anIntArray79.length + 1];
				System.arraycopy(this.anIntArray79, 0, local38, 0, this.anIntArray79.length);
				this.anIntArray79 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			@Pc(73) int local73 = arg0 & 0xFF;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray79.length; local75++) {
				@Pc(85) int local85 = this.anIntArray79[local75];
				@Pc(91) int local91 = local85 >> 16 & 0xFF;
				@Pc(97) int local97 = local85 >> 8 & 0xFF;
				@Pc(101) int local101 = local85 & 0xFF;
				@Pc(105) int local105 = local63 - local91;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local69 - local97;
				if (local114 < 0) {
					local114 = -local114;
				}
				@Pc(123) int local123 = local73 - local101;
				if (local123 < 0) {
					local123 = -local123;
				}
				@Pc(134) int local134 = local105 + local114 + local123;
				if (local134 < local8) {
					local8 = local134;
					local1 = local75;
				}
			}
		}
		for (local8 = this.anInt856 - 1; local8 > 0; local8--) {
			local63 = local8 * this.anInt861;
			for (local69 = this.anInt861 - 1; local69 > 0; local69--) {
				if (this.anIntArray79[this.aByteArray25[local69 + local63] & 0xFF] == 0 && this.anIntArray79[this.aByteArray25[local69 + local63 - 1 - this.anInt861] & 0xFF] != 0) {
					this.aByteArray25[local69 + local63] = (byte) local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "k", descriptor = "(I)V")
	@Override
	public void method7129(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (this.anIntArray79.length < 255) {
			for (local8 = 0; local8 < this.anIntArray79.length; local8++) {
				if (this.anIntArray79[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray79.length;
				@Pc(38) int[] local38 = new int[this.anIntArray79.length + 1];
				System.arraycopy(this.anIntArray79, 0, local38, 0, this.anIntArray79.length);
				this.anIntArray79 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			@Pc(63) int local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			local73 = arg0 & 0xFF;
			for (local75 = 0; local75 < this.anIntArray79.length; local75++) {
				@Pc(85) int local85 = this.anIntArray79[local75];
				@Pc(91) int local91 = local85 >> 16 & 0xFF;
				@Pc(97) int local97 = local85 >> 8 & 0xFF;
				@Pc(101) int local101 = local85 & 0xFF;
				@Pc(105) int local105 = local63 - local91;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local69 - local97;
				if (local114 < 0) {
					local114 = -local114;
				}
				@Pc(123) int local123 = local73 - local101;
				if (local123 < 0) {
					local123 = -local123;
				}
				@Pc(134) int local134 = local105 + local114 + local123;
				if (local134 < local8) {
					local8 = local134;
					local1 = local75;
				}
			}
		}
		local8 = 0;
		@Pc(152) byte[] local152 = new byte[this.anInt861 * this.anInt856];
		for (local69 = 0; local69 < this.anInt856; local69++) {
			for (local73 = 0; local73 < this.anInt861; local73++) {
				local75 = this.aByteArray25[local8] & 0xFF;
				if (this.anIntArray79[local75] == 0) {
					if (local73 > 0 && this.anIntArray79[this.aByteArray25[local8 - 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 > 0 && this.anIntArray79[this.aByteArray25[local8 - this.anInt861] & 0xFF] != 0) {
						local75 = local1;
					} else if (local73 < this.anInt861 - 1 && this.anIntArray79[this.aByteArray25[local8 + 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 < this.anInt856 - 1 && this.anIntArray79[this.aByteArray25[local8 + this.anInt861] & 0xFF] != 0) {
						local75 = local1;
					}
				}
				local152[local8++] = (byte) local75;
			}
		}
		this.aByteArray25 = local152;
	}

	@OriginalMember(owner = "client!afs", name = "as", descriptor = "()V")
	@Override
	public void method7166() {
		@Pc(6) byte[] local6 = new byte[this.anInt861 * this.anInt856];
		@Pc(8) int local8 = 0;
		@Pc(13) int local13;
		@Pc(22) int local22;
		if (this.aByteArray26 == null) {
			for (local13 = 0; local13 < this.anInt861; local13++) {
				for (local22 = this.anInt856 - 1; local22 >= 0; local22--) {
					local6[local8++] = this.aByteArray25[local13 + local22 * this.anInt861];
				}
			}
			this.aByteArray25 = local6;
		} else {
			@Pc(52) byte[] local52 = new byte[this.anInt861 * this.anInt856];
			for (local22 = 0; local22 < this.anInt861; local22++) {
				for (@Pc(63) int local63 = this.anInt856 - 1; local63 >= 0; local63--) {
					local6[local8] = this.aByteArray25[local22 + local63 * this.anInt861];
					local52[local8++] = this.aByteArray26[local22 + local63 * this.anInt861];
				}
			}
			this.aByteArray25 = local6;
			this.aByteArray26 = local52;
		}
		local13 = this.anInt859;
		this.anInt859 = this.anInt857;
		this.anInt857 = this.anInt860;
		this.anInt860 = this.anInt858;
		this.anInt858 = local13;
		local13 = this.anInt856;
		this.anInt856 = this.anInt861;
		this.anInt861 = local13;
	}

	@OriginalMember(owner = "client!afs", name = "w", descriptor = "()V")
	@Override
	public void method7131() {
		@Pc(2) byte[] local2 = this.aByteArray25;
		@Pc(32) byte local32;
		@Pc(10) int local10;
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (this.aByteArray26 == null) {
			for (local10 = this.anInt856 - 1; local10 >= 0; local10--) {
				local17 = local10 * this.anInt861;
				local24 = (local10 + 1) * this.anInt861;
				while (local17 < local24) {
					local24--;
					local32 = local2[local17];
					local2[local17] = local2[local24];
					local2[local24] = local32;
					local17++;
				}
			}
		} else {
			@Pc(50) byte[] local50 = this.aByteArray26;
			for (local17 = this.anInt856 - 1; local17 >= 0; local17--) {
				local24 = local17 * this.anInt861;
				@Pc(69) int local69 = (local17 + 1) * this.anInt861;
				while (local24 < local69) {
					local69--;
					local32 = local2[local24];
					local2[local24] = local2[local69];
					local2[local69] = local32;
					local32 = local50[local24];
					local50[local24] = local50[local69];
					local50[local69] = local32;
					local24++;
				}
			}
		}
		local10 = this.anInt857;
		this.anInt857 = this.anInt858;
		this.anInt858 = local10;
	}

	@OriginalMember(owner = "client!afs", name = "ak", descriptor = "()I")
	@Override
	public int method7155() {
		return this.anInt860;
	}

	@OriginalMember(owner = "client!afs", name = "q", descriptor = "()V")
	@Override
	public void method7133() {
		@Pc(6) byte[] local6 = new byte[this.anInt861 * this.anInt856];
		@Pc(8) int local8 = 0;
		@Pc(13) int local13;
		@Pc(22) int local22;
		if (this.aByteArray26 == null) {
			for (local13 = 0; local13 < this.anInt861; local13++) {
				for (local22 = this.anInt856 - 1; local22 >= 0; local22--) {
					local6[local8++] = this.aByteArray25[local13 + local22 * this.anInt861];
				}
			}
			this.aByteArray25 = local6;
		} else {
			@Pc(52) byte[] local52 = new byte[this.anInt861 * this.anInt856];
			for (local22 = 0; local22 < this.anInt861; local22++) {
				for (@Pc(63) int local63 = this.anInt856 - 1; local63 >= 0; local63--) {
					local6[local8] = this.aByteArray25[local22 + local63 * this.anInt861];
					local52[local8++] = this.aByteArray26[local22 + local63 * this.anInt861];
				}
			}
			this.aByteArray25 = local6;
			this.aByteArray26 = local52;
		}
		local13 = this.anInt859;
		this.anInt859 = this.anInt857;
		this.anInt857 = this.anInt860;
		this.anInt860 = this.anInt858;
		this.anInt858 = local13;
		local13 = this.anInt856;
		this.anInt856 = this.anInt861;
		this.anInt861 = local13;
	}

	@OriginalMember(owner = "client!afs", name = "h", descriptor = "(Z)[I")
	@Override
	public int[] method7117(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10;
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg0) {
			local4 = this.method7126();
			local10 = new int[local4 * this.method7137()];
			if (this.aByteArray26 == null) {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						@Pc(104) int local104 = this.anIntArray79[this.aByteArray25[local24++] & 0xFF];
						if (local104 == 0) {
							local10[local34++] = 0;
						} else {
							local10[local34++] = local104 | 0xFF000000;
						}
					}
				}
			} else {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						local10[local34++] = this.aByteArray26[local24] << 24 | this.anIntArray79[this.aByteArray25[local24] & 0xFF];
						local24++;
					}
				}
			}
		} else {
			local10 = new int[this.anInt861 * this.anInt856];
			local4 = 0;
			local15 = 0;
			if (this.aByteArray26 == null) {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local36 = this.anIntArray79[this.aByteArray25[local4++] & 0xFF];
						local10[local15++] = local36 == 0 ? 0 : local36 | 0xFF000000;
					}
				}
			} else {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local10[local15++] = this.aByteArray26[local4] << 24 | this.anIntArray79[this.aByteArray25[local4] & 0xFF];
						local4++;
					}
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!afs", name = "d", descriptor = "(III)V")
	@Override
	public void method7134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray79.length; local1++) {
			if (this.anIntArray79[local1] != 1 && this.anIntArray79[local1] != 16711935) {
				@Pc(28) int local28 = this.anIntArray79[local1] >> 16 & 0xFF;
				local28 += arg0;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(51) int local51 = this.anIntArray79[local1] >> 8 & 0xFF;
				local51 += arg1;
				if (local51 < 0) {
					local51 = 0;
				} else if (local51 > 255) {
					local51 = 255;
				}
				@Pc(74) int local74 = this.anIntArray79[local1] >> 0 & 0xFF;
				local74 += arg2;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray79[local1] = local28 << 16 | local51 << 8 | local74;
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "bk", descriptor = "()V")
	@Override
	public void method7177() {
		@Pc(2) byte[] local2 = this.aByteArray25;
		@Pc(32) byte local32;
		@Pc(10) int local10;
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (this.aByteArray26 == null) {
			for (local10 = this.anInt856 - 1; local10 >= 0; local10--) {
				local17 = local10 * this.anInt861;
				local24 = (local10 + 1) * this.anInt861;
				while (local17 < local24) {
					local24--;
					local32 = local2[local17];
					local2[local17] = local2[local24];
					local2[local24] = local32;
					local17++;
				}
			}
		} else {
			@Pc(50) byte[] local50 = this.aByteArray26;
			for (local17 = this.anInt856 - 1; local17 >= 0; local17--) {
				local24 = local17 * this.anInt861;
				@Pc(69) int local69 = (local17 + 1) * this.anInt861;
				while (local24 < local69) {
					local69--;
					local32 = local2[local24];
					local2[local24] = local2[local69];
					local2[local69] = local32;
					local32 = local50[local24];
					local50[local24] = local50[local69];
					local50[local69] = local32;
					local24++;
				}
			}
		}
		local10 = this.anInt857;
		this.anInt857 = this.anInt858;
		this.anInt858 = local10;
	}

	@OriginalMember(owner = "client!afs", name = "p", descriptor = "()Z")
	@Override
	public boolean method7136() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "v", descriptor = "()Z")
	@Override
	public boolean method7173() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "ag", descriptor = "()I")
	@Override
	public int method7149() {
		return this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "ai", descriptor = "()I")
	@Override
	public int method7144() {
		return this.anInt856;
	}

	@OriginalMember(owner = "client!afs", name = "c", descriptor = "()Z")
	@Override
	public boolean method7160() {
		return this.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!afs", name = "ax", descriptor = "()I")
	@Override
	public int method7142() {
		return this.anInt861;
	}

	@OriginalMember(owner = "client!afs", name = "bn", descriptor = "(III)V")
	@Override
	public void method7171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray79.length; local1++) {
			if (this.anIntArray79[local1] != 1 && this.anIntArray79[local1] != 16711935) {
				@Pc(28) int local28 = this.anIntArray79[local1] >> 16 & 0xFF;
				local28 += arg0;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(51) int local51 = this.anIntArray79[local1] >> 8 & 0xFF;
				local51 += arg1;
				if (local51 < 0) {
					local51 = 0;
				} else if (local51 > 255) {
					local51 = 255;
				}
				@Pc(74) int local74 = this.anIntArray79[local1] >> 0 & 0xFF;
				local74 += arg2;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray79[local1] = local28 << 16 | local51 << 8 | local74;
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "t", descriptor = "()Z")
	@Override
	public boolean method7116() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "aq", descriptor = "()I")
	@Override
	public int method7145() {
		return this.anInt861 + this.anInt857 + this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "ao", descriptor = "()I")
	@Override
	public int method7146() {
		return this.anInt861 + this.anInt857 + this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "m", descriptor = "()I")
	@Override
	public int method7148() {
		return this.anInt860;
	}

	@OriginalMember(owner = "client!afs", name = "ac", descriptor = "()I")
	@Override
	public int method7130() {
		return this.anInt856 + this.anInt859 + this.anInt860;
	}

	@OriginalMember(owner = "client!afs", name = "r", descriptor = "()V")
	@Override
	public void method7172() {
		@Pc(2) byte[] local2 = this.aByteArray25;
		@Pc(39) byte local39;
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.aByteArray26 == null) {
			for (local12 = (this.anInt856 >> 1) - 1; local12 >= 0; local12--) {
				local19 = local12 * this.anInt861;
				local29 = (this.anInt856 - local12 - 1) * this.anInt861;
				for (local33 = -this.anInt861; local33 < 0; local33++) {
					local39 = local2[local19];
					local2[local19] = local2[local29];
					local2[local29] = local39;
					local19++;
					local29++;
				}
			}
		} else {
			@Pc(59) byte[] local59 = this.aByteArray26;
			for (local19 = (this.anInt856 >> 1) - 1; local19 >= 0; local19--) {
				local29 = local19 * this.anInt861;
				local33 = (this.anInt856 - local19 - 1) * this.anInt861;
				for (@Pc(87) int local87 = -this.anInt861; local87 < 0; local87++) {
					local39 = local2[local29];
					local2[local29] = local2[local33];
					local2[local33] = local39;
					local39 = local59[local29];
					local59[local29] = local59[local33];
					local59[local33] = local39;
					local29++;
					local33++;
				}
			}
		}
		local12 = this.anInt859;
		this.anInt859 = this.anInt860;
		this.anInt860 = local12;
	}

	@OriginalMember(owner = "client!afs", name = "ab", descriptor = "()I")
	@Override
	public int method7167() {
		return this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "al", descriptor = "()I")
	@Override
	public int method7124() {
		return this.anInt859;
	}

	@OriginalMember(owner = "client!afs", name = "b", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return this.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!afs", name = "af", descriptor = "()I")
	@Override
	public int method7153() {
		return this.anInt859;
	}

	@OriginalMember(owner = "client!afs", name = "am", descriptor = "()I")
	@Override
	public int method7154() {
		return this.anInt860;
	}

	@OriginalMember(owner = "client!afs", name = "aw", descriptor = "(Z)[I")
	@Override
	public int[] method7161(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10;
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg0) {
			local4 = this.method7126();
			local10 = new int[local4 * this.method7137()];
			if (this.aByteArray26 == null) {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						@Pc(104) int local104 = this.anIntArray79[this.aByteArray25[local24++] & 0xFF];
						if (local104 == 0) {
							local10[local34++] = 0;
						} else {
							local10[local34++] = local104 | 0xFF000000;
						}
					}
				}
			} else {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						local10[local34++] = this.aByteArray26[local24] << 24 | this.anIntArray79[this.aByteArray25[local24] & 0xFF];
						local24++;
					}
				}
			}
		} else {
			local10 = new int[this.anInt861 * this.anInt856];
			local4 = 0;
			local15 = 0;
			if (this.aByteArray26 == null) {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local36 = this.anIntArray79[this.aByteArray25[local4++] & 0xFF];
						local10[local15++] = local36 == 0 ? 0 : local36 | 0xFF000000;
					}
				}
			} else {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local10[local15++] = this.aByteArray26[local4] << 24 | this.anIntArray79[this.aByteArray25[local4] & 0xFF];
						local4++;
					}
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!afs", name = "au", descriptor = "(I)V")
	@Override
	public void method7164(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(63) int local63;
		@Pc(69) int local69;
		if (this.anIntArray79.length < 255) {
			for (local8 = 0; local8 < this.anIntArray79.length; local8++) {
				if (this.anIntArray79[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray79.length;
				@Pc(38) int[] local38 = new int[this.anIntArray79.length + 1];
				System.arraycopy(this.anIntArray79, 0, local38, 0, this.anIntArray79.length);
				this.anIntArray79 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			@Pc(73) int local73 = arg0 & 0xFF;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray79.length; local75++) {
				@Pc(85) int local85 = this.anIntArray79[local75];
				@Pc(91) int local91 = local85 >> 16 & 0xFF;
				@Pc(97) int local97 = local85 >> 8 & 0xFF;
				@Pc(101) int local101 = local85 & 0xFF;
				@Pc(105) int local105 = local63 - local91;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local69 - local97;
				if (local114 < 0) {
					local114 = -local114;
				}
				@Pc(123) int local123 = local73 - local101;
				if (local123 < 0) {
					local123 = -local123;
				}
				@Pc(134) int local134 = local105 + local114 + local123;
				if (local134 < local8) {
					local8 = local134;
					local1 = local75;
				}
			}
		}
		for (local8 = this.anInt856 - 1; local8 > 0; local8--) {
			local63 = local8 * this.anInt861;
			for (local69 = this.anInt861 - 1; local69 > 0; local69--) {
				if (this.anIntArray79[this.aByteArray25[local69 + local63] & 0xFF] == 0 && this.anIntArray79[this.aByteArray25[local69 + local63 - 1 - this.anInt861] & 0xFF] != 0) {
					this.aByteArray25[local69 + local63] = (byte) local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "ad", descriptor = "()V")
	@Override
	public void method7157() {
		this.anInt860 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		this.anInt857 = 0;
	}

	@OriginalMember(owner = "client!afs", name = "av", descriptor = "()V")
	@Override
	public void method7158() {
		this.anInt860 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		this.anInt857 = 0;
	}

	@OriginalMember(owner = "client!afs", name = "an", descriptor = "(I)V")
	@Override
	public void method7140(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt861 == local2 && this.anInt856 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt857) {
			local16 = this.anInt857;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt857 + this.anInt861 > local2) {
			local25 = local2 - this.anInt857 - this.anInt861;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt859) {
			local44 = this.anInt859;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt859 + this.anInt856 > local5) {
			local53 = local5 - this.anInt859 - this.anInt856;
		}
		@Pc(77) int local77 = this.anInt861 + local16 + local25;
		@Pc(84) int local84 = this.anInt856 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(113) int local113;
		if (this.aByteArray26 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt856; local94++) {
				local103 = local94 * this.anInt861;
				local111 = (local94 + local44) * local77 + local16;
				for (local113 = 0; local113 < this.anInt861; local113++) {
					local89[local111++] = this.aByteArray25[local103++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local103 = 0; local103 < this.anInt856; local103++) {
				local111 = local103 * this.anInt861;
				local113 = (local103 + local44) * local77 + local16;
				for (@Pc(157) int local157 = 0; local157 < this.anInt861; local157++) {
					local136[local113] = this.aByteArray26[local111];
					local89[local113++] = this.aByteArray25[local111++];
				}
			}
			this.aByteArray26 = local136;
		}
		this.anInt857 -= local16;
		this.anInt859 -= local44;
		this.anInt858 -= local25;
		this.anInt860 -= local53;
		this.anInt861 = local77;
		this.anInt856 = local84;
		this.aByteArray25 = local89;
	}

	@OriginalMember(owner = "client!afs", name = "aa", descriptor = "(I)V")
	@Override
	public void method7128(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt861 == local2 && this.anInt856 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt857) {
			local16 = this.anInt857;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt857 + this.anInt861 > local2) {
			local25 = local2 - this.anInt857 - this.anInt861;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt859) {
			local44 = this.anInt859;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt859 + this.anInt856 > local5) {
			local53 = local5 - this.anInt859 - this.anInt856;
		}
		@Pc(77) int local77 = this.anInt861 + local16 + local25;
		@Pc(84) int local84 = this.anInt856 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(113) int local113;
		if (this.aByteArray26 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt856; local94++) {
				local103 = local94 * this.anInt861;
				local111 = (local94 + local44) * local77 + local16;
				for (local113 = 0; local113 < this.anInt861; local113++) {
					local89[local111++] = this.aByteArray25[local103++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local103 = 0; local103 < this.anInt856; local103++) {
				local111 = local103 * this.anInt861;
				local113 = (local103 + local44) * local77 + local16;
				for (@Pc(157) int local157 = 0; local157 < this.anInt861; local157++) {
					local136[local113] = this.aByteArray26[local111];
					local89[local113++] = this.aByteArray25[local111++];
				}
			}
			this.aByteArray26 = local136;
		}
		this.anInt857 -= local16;
		this.anInt859 -= local44;
		this.anInt858 -= local25;
		this.anInt860 -= local53;
		this.anInt861 = local77;
		this.anInt856 = local84;
		this.aByteArray25 = local89;
	}

	@OriginalMember(owner = "client!afs", name = "ae", descriptor = "(I)V")
	@Override
	public void method7159(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt861 == local2 && this.anInt856 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt857) {
			local16 = this.anInt857;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt857 + this.anInt861 > local2) {
			local25 = local2 - this.anInt857 - this.anInt861;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt859) {
			local44 = this.anInt859;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt859 + this.anInt856 > local5) {
			local53 = local5 - this.anInt859 - this.anInt856;
		}
		@Pc(77) int local77 = this.anInt861 + local16 + local25;
		@Pc(84) int local84 = this.anInt856 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(113) int local113;
		if (this.aByteArray26 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt856; local94++) {
				local103 = local94 * this.anInt861;
				local111 = (local94 + local44) * local77 + local16;
				for (local113 = 0; local113 < this.anInt861; local113++) {
					local89[local111++] = this.aByteArray25[local103++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local103 = 0; local103 < this.anInt856; local103++) {
				local111 = local103 * this.anInt861;
				local113 = (local103 + local44) * local77 + local16;
				for (@Pc(157) int local157 = 0; local157 < this.anInt861; local157++) {
					local136[local113] = this.aByteArray26[local111];
					local89[local113++] = this.aByteArray25[local111++];
				}
			}
			this.aByteArray26 = local136;
		}
		this.anInt857 -= local16;
		this.anInt859 -= local44;
		this.anInt858 -= local25;
		this.anInt860 -= local53;
		this.anInt861 = local77;
		this.anInt856 = local84;
		this.aByteArray25 = local89;
	}

	@OriginalMember(owner = "client!afs", name = "by", descriptor = "()I")
	@Override
	public int method7176() {
		return this.anInt857;
	}

	@OriginalMember(owner = "client!afs", name = "ar", descriptor = "(I)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(63) int local63;
		@Pc(69) int local69;
		if (this.anIntArray79.length < 255) {
			for (local8 = 0; local8 < this.anIntArray79.length; local8++) {
				if (this.anIntArray79[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray79.length;
				@Pc(38) int[] local38 = new int[this.anIntArray79.length + 1];
				System.arraycopy(this.anIntArray79, 0, local38, 0, this.anIntArray79.length);
				this.anIntArray79 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			@Pc(73) int local73 = arg0 & 0xFF;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray79.length; local75++) {
				@Pc(85) int local85 = this.anIntArray79[local75];
				@Pc(91) int local91 = local85 >> 16 & 0xFF;
				@Pc(97) int local97 = local85 >> 8 & 0xFF;
				@Pc(101) int local101 = local85 & 0xFF;
				@Pc(105) int local105 = local63 - local91;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local69 - local97;
				if (local114 < 0) {
					local114 = -local114;
				}
				@Pc(123) int local123 = local73 - local101;
				if (local123 < 0) {
					local123 = -local123;
				}
				@Pc(134) int local134 = local105 + local114 + local123;
				if (local134 < local8) {
					local8 = local134;
					local1 = local75;
				}
			}
		}
		for (local8 = this.anInt856 - 1; local8 > 0; local8--) {
			local63 = local8 * this.anInt861;
			for (local69 = this.anInt861 - 1; local69 > 0; local69--) {
				if (this.anIntArray79[this.aByteArray25[local69 + local63] & 0xFF] == 0 && this.anIntArray79[this.aByteArray25[local69 + local63 - 1 - this.anInt861] & 0xFF] != 0) {
					this.aByteArray25[local69 + local63] = (byte) local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "()Z")
	@Override
	public boolean method7138() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "a", descriptor = "()I")
	@Override
	public int method7137() {
		return this.anInt856 + this.anInt859 + this.anInt860;
	}

	@OriginalMember(owner = "client!afs", name = "ah", descriptor = "()I")
	@Override
	public int method7152() {
		return this.anInt859;
	}

	@OriginalMember(owner = "client!afs", name = "aj", descriptor = "()I")
	@Override
	public int method7150() {
		return this.anInt861 + this.anInt857 + this.anInt858;
	}

	@OriginalMember(owner = "client!afs", name = "bg", descriptor = "(Z)[I")
	@Override
	public int[] method7168(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10;
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg0) {
			local4 = this.method7126();
			local10 = new int[local4 * this.method7137()];
			if (this.aByteArray26 == null) {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						@Pc(104) int local104 = this.anIntArray79[this.aByteArray25[local24++] & 0xFF];
						if (local104 == 0) {
							local10[local34++] = 0;
						} else {
							local10[local34++] = local104 | 0xFF000000;
						}
					}
				}
			} else {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						local10[local34++] = this.aByteArray26[local24] << 24 | this.anIntArray79[this.aByteArray25[local24] & 0xFF];
						local24++;
					}
				}
			}
		} else {
			local10 = new int[this.anInt861 * this.anInt856];
			local4 = 0;
			local15 = 0;
			if (this.aByteArray26 == null) {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local36 = this.anIntArray79[this.aByteArray25[local4++] & 0xFF];
						local10[local15++] = local36 == 0 ? 0 : local36 | 0xFF000000;
					}
				}
			} else {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local10[local15++] = this.aByteArray26[local4] << 24 | this.anIntArray79[this.aByteArray25[local4] & 0xFF];
						local4++;
					}
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!afs", name = "bl", descriptor = "(Z)[I")
	@Override
	public int[] method7169(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10;
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg0) {
			local4 = this.method7126();
			local10 = new int[local4 * this.method7137()];
			if (this.aByteArray26 == null) {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						@Pc(104) int local104 = this.anIntArray79[this.aByteArray25[local24++] & 0xFF];
						if (local104 == 0) {
							local10[local34++] = 0;
						} else {
							local10[local34++] = local104 | 0xFF000000;
						}
					}
				}
			} else {
				for (local15 = 0; local15 < this.anInt856; local15++) {
					local24 = local15 * this.anInt861;
					local34 = this.anInt857 + (local15 + this.anInt859) * local4;
					for (local36 = 0; local36 < this.anInt861; local36++) {
						local10[local34++] = this.aByteArray26[local24] << 24 | this.anIntArray79[this.aByteArray25[local24] & 0xFF];
						local24++;
					}
				}
			}
		} else {
			local10 = new int[this.anInt861 * this.anInt856];
			local4 = 0;
			local15 = 0;
			if (this.aByteArray26 == null) {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local36 = this.anIntArray79[this.aByteArray25[local4++] & 0xFF];
						local10[local15++] = local36 == 0 ? 0 : local36 | 0xFF000000;
					}
				}
			} else {
				for (local24 = 0; local24 < this.anInt856; local24++) {
					for (local34 = 0; local34 < this.anInt861; local34++) {
						local10[local15++] = this.aByteArray26[local4] << 24 | this.anIntArray79[this.aByteArray25[local4] & 0xFF];
						local4++;
					}
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!afs", name = "i", descriptor = "()I")
	@Override
	public int method7123() {
		return this.anInt859;
	}

	@OriginalMember(owner = "client!afs", name = "ay", descriptor = "()I")
	@Override
	public int method7143() {
		return this.anInt861;
	}

	@OriginalMember(owner = "client!afs", name = "ba", descriptor = "(II)I")
	@Override
	public int method7151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray79[this.aByteArray25[arg0 + arg1 * this.anInt861] & 0xFF];
	}

	@OriginalMember(owner = "client!afs", name = "ap", descriptor = "(I)V")
	@Override
	public void method7120(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (this.anIntArray79.length < 255) {
			for (local8 = 0; local8 < this.anIntArray79.length; local8++) {
				if (this.anIntArray79[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray79.length;
				@Pc(38) int[] local38 = new int[this.anIntArray79.length + 1];
				System.arraycopy(this.anIntArray79, 0, local38, 0, this.anIntArray79.length);
				this.anIntArray79 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			@Pc(63) int local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			local73 = arg0 & 0xFF;
			for (local75 = 0; local75 < this.anIntArray79.length; local75++) {
				@Pc(85) int local85 = this.anIntArray79[local75];
				@Pc(91) int local91 = local85 >> 16 & 0xFF;
				@Pc(97) int local97 = local85 >> 8 & 0xFF;
				@Pc(101) int local101 = local85 & 0xFF;
				@Pc(105) int local105 = local63 - local91;
				if (local105 < 0) {
					local105 = -local105;
				}
				@Pc(114) int local114 = local69 - local97;
				if (local114 < 0) {
					local114 = -local114;
				}
				@Pc(123) int local123 = local73 - local101;
				if (local123 < 0) {
					local123 = -local123;
				}
				@Pc(134) int local134 = local105 + local114 + local123;
				if (local134 < local8) {
					local8 = local134;
					local1 = local75;
				}
			}
		}
		local8 = 0;
		@Pc(152) byte[] local152 = new byte[this.anInt861 * this.anInt856];
		for (local69 = 0; local69 < this.anInt856; local69++) {
			for (local73 = 0; local73 < this.anInt861; local73++) {
				local75 = this.aByteArray25[local8] & 0xFF;
				if (this.anIntArray79[local75] == 0) {
					if (local73 > 0 && this.anIntArray79[this.aByteArray25[local8 - 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 > 0 && this.anIntArray79[this.aByteArray25[local8 - this.anInt861] & 0xFF] != 0) {
						local75 = local1;
					} else if (local73 < this.anInt861 - 1 && this.anIntArray79[this.aByteArray25[local8 + 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 < this.anInt856 - 1 && this.anIntArray79[this.aByteArray25[local8 + this.anInt861] & 0xFF] != 0) {
						local75 = local1;
					}
				}
				local152[local8++] = (byte) local75;
			}
		}
		this.aByteArray25 = local152;
	}

	@OriginalMember(owner = "client!afs", name = "bs", descriptor = "(II)I")
	@Override
	public int method7175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray79[this.aByteArray25[arg0 + arg1 * this.anInt861] & 0xFF];
	}

	@OriginalMember(owner = "client!afs", name = "bj", descriptor = "()I")
	@Override
	public int method7135() {
		return this.anInt857;
	}

	@OriginalMember(owner = "client!afs", name = "at", descriptor = "()V")
	@Override
	public void method7156() {
		this.anInt860 = 0;
		this.anInt859 = 0;
		this.anInt858 = 0;
		this.anInt857 = 0;
	}

	@OriginalMember(owner = "client!afs", name = "s", descriptor = "(I)V")
	@Override
	public void method7165(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method7126();
		@Pc(5) int local5 = this.method7137();
		if (this.anInt861 == local2 && this.anInt856 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt857) {
			local16 = this.anInt857;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt857 + this.anInt861 > local2) {
			local25 = local2 - this.anInt857 - this.anInt861;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt859) {
			local44 = this.anInt859;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt859 + this.anInt856 > local5) {
			local53 = local5 - this.anInt859 - this.anInt856;
		}
		@Pc(77) int local77 = this.anInt861 + local16 + local25;
		@Pc(84) int local84 = this.anInt856 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(113) int local113;
		if (this.aByteArray26 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt856; local94++) {
				local103 = local94 * this.anInt861;
				local111 = (local94 + local44) * local77 + local16;
				for (local113 = 0; local113 < this.anInt861; local113++) {
					local89[local111++] = this.aByteArray25[local103++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local103 = 0; local103 < this.anInt856; local103++) {
				local111 = local103 * this.anInt861;
				local113 = (local103 + local44) * local77 + local16;
				for (@Pc(157) int local157 = 0; local157 < this.anInt861; local157++) {
					local136[local113] = this.aByteArray26[local111];
					local89[local113++] = this.aByteArray25[local111++];
				}
			}
			this.aByteArray26 = local136;
		}
		this.anInt857 -= local16;
		this.anInt859 -= local44;
		this.anInt858 -= local25;
		this.anInt860 -= local53;
		this.anInt861 = local77;
		this.anInt856 = local84;
		this.aByteArray25 = local89;
	}

	@OriginalMember(owner = "client!afs", name = "bz", descriptor = "()V")
	@Override
	public void method7178() {
		@Pc(2) byte[] local2 = this.aByteArray25;
		@Pc(32) byte local32;
		@Pc(10) int local10;
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (this.aByteArray26 == null) {
			for (local10 = this.anInt856 - 1; local10 >= 0; local10--) {
				local17 = local10 * this.anInt861;
				local24 = (local10 + 1) * this.anInt861;
				while (local17 < local24) {
					local24--;
					local32 = local2[local17];
					local2[local17] = local2[local24];
					local2[local24] = local32;
					local17++;
				}
			}
		} else {
			@Pc(50) byte[] local50 = this.aByteArray26;
			for (local17 = this.anInt856 - 1; local17 >= 0; local17--) {
				local24 = local17 * this.anInt861;
				@Pc(69) int local69 = (local17 + 1) * this.anInt861;
				while (local24 < local69) {
					local69--;
					local32 = local2[local24];
					local2[local24] = local2[local69];
					local2[local69] = local32;
					local32 = local50[local24];
					local50[local24] = local50[local69];
					local50[local69] = local32;
					local24++;
				}
			}
		}
		local10 = this.anInt857;
		this.anInt857 = this.anInt858;
		this.anInt858 = local10;
	}
}
