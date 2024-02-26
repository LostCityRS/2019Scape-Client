package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class372 {

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	int anInt4505;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!k", name = "hw", descriptor = "(Lclient!yp;I)V")
	static void method28404(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2125417242);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class630.method32716(local16, local22, true, 2, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!k", name = "ads", descriptor = "(Lclient!yp;I)V")
	static void method28405(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local23 + local13;
	}

	@OriginalMember(owner = "client!k", name = "aei", descriptor = "(Lclient!yp;I)V")
	static void method28406(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 | 0x1 << local23;
	}

	@OriginalMember(owner = "client!k", name = "api", descriptor = "(Lclient!yp;I)V")
	static void method28407(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		if (Class160.aClass121_Sub1_2.method9702(166249686) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) Class160.aClass121_Sub1_2.method9693(2137969723)).method16636(arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2], (byte) -30);
	}

	@OriginalMember(owner = "client!k", name = "azj", descriptor = "(Lclient!yp;I)V")
	static void method28408(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!k", name = "s", descriptor = "()V")
	public void method28391() {
		this.anInt4506 = (this.anInt4506 * 1783746791 & 0x3FFF) * -1822276905;
	}

	@OriginalMember(owner = "client!k", name = "t", descriptor = "(IIII)Z")
	public boolean method28392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anInt4505 * 1322374041;
		if (this.anInt4506 * 1783746791 == arg0 && this.anInt4505 * 1322374041 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt4505 * 1322374041 == 0) {
			if (arg0 > this.anInt4506 * 1783746791 && arg0 <= arg1 + this.anInt4506 * 1783746791 || arg0 < this.anInt4506 * 1783746791 && arg0 >= this.anInt4506 * 1783746791 - arg1) {
				this.anInt4506 = arg0 * -1822276905;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt4505 * 1322374041 > 0 && arg0 > this.anInt4506 * 1783746791) {
				local86 = this.anInt4505 * 1322374041 * this.anInt4505 * 1322374041 / (arg1 * 2);
				local93 = local86 + this.anInt4506 * 1783746791;
				if (local93 < arg0 && local93 >= this.anInt4506 * 1783746791) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt4505 * 1322374041 < 0 && arg0 < this.anInt4506 * 1783746791) {
				local86 = this.anInt4505 * 1322374041 * 1322374041 * this.anInt4505 / (arg1 * 2);
				local93 = this.anInt4506 * 1783746791 - local86;
				if (local93 > arg0 && local93 <= this.anInt4506 * 1783746791) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt4506 * 1783746791) {
				this.anInt4505 += arg1 * -1050160983;
				if (arg2 != 0 && this.anInt4505 * 1322374041 > arg2) {
					this.anInt4505 = arg2 * -1050160983;
				}
			} else {
				this.anInt4505 -= arg1 * -1050160983;
				if (arg2 != 0 && this.anInt4505 * 1322374041 < -arg2) {
					this.anInt4505 = -arg2 * -1050160983;
				}
			}
			if (local4 != this.anInt4505 * 1322374041) {
				local86 = this.anInt4505 * 1322374041 * this.anInt4505 * 1322374041 / (arg1 * 2);
				if (arg0 > this.anInt4506 * 1783746791) {
					if (this.anInt4506 * 1783746791 + local86 > arg0) {
						this.anInt4505 = local4 * -1050160983;
					}
				} else if (arg0 < this.anInt4506 * 1783746791 && this.anInt4506 * 1783746791 - local86 < arg0) {
					this.anInt4505 = local4 * -1050160983;
				}
			}
		} else if (this.anInt4505 * 1322374041 > 0) {
			this.anInt4505 -= arg1 * -1050160983;
			if (this.anInt4505 * 1322374041 < 0) {
				this.anInt4505 = 0;
			}
		} else {
			this.anInt4505 += arg1 * -1050160983;
			if (this.anInt4505 * 1322374041 > 0) {
				this.anInt4505 = 0;
			}
		}
		this.anInt4506 += (this.anInt4505 * 1322374041 + local4 >> 1) * -1822276905;
		return local60;
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "()I")
	public int method28393() {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I")
	public int method28394(@OriginalArg(0) byte arg0) {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "u", descriptor = "(B)V")
	public void method28395(@OriginalArg(0) byte arg0) {
		this.anInt4506 = (this.anInt4506 * 1783746791 & 0x3FFF) * -1822276905;
	}

	@OriginalMember(owner = "client!k", name = "l", descriptor = "(I)V")
	public void method28396(@OriginalArg(0) int arg0) {
		this.anInt4506 = arg0 * -1822276905;
		this.anInt4505 = 0;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "()I")
	public int method28397() {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "o", descriptor = "()I")
	public int method28398() {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "m", descriptor = "()I")
	public int method28399() {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(II)V")
	public void method28400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4506 = arg0 * -1822276905;
		this.anInt4505 = 0;
	}

	@OriginalMember(owner = "client!k", name = "i", descriptor = "()I")
	public int method28401() {
		return this.anInt4506 * 1783746791 & 0x3FFF;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	public void method28402() {
		this.anInt4506 = (this.anInt4506 * 1783746791 & 0x3FFF) * -1822276905;
	}

	@OriginalMember(owner = "client!k", name = "k", descriptor = "()V")
	public void method28403() {
		this.anInt4506 = (this.anInt4506 * 1783746791 & 0x3FFF) * -1822276905;
	}
}
