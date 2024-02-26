package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yt")
public final class Class694 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!yt", name = "t", descriptor = "I")
	static final int anInt5794 = 1190717;

	@OriginalMember(owner = "client!yt", name = "f", descriptor = "I")
	int anInt5785;

	@OriginalMember(owner = "client!yt", name = "e", descriptor = "I")
	public int anInt5786 = 0;

	@OriginalMember(owner = "client!yt", name = "u", descriptor = "I")
	public int anInt5787 = -244061577;

	@OriginalMember(owner = "client!yt", name = "l", descriptor = "Z")
	public boolean aBoolean989 = true;

	@OriginalMember(owner = "client!yt", name = "g", descriptor = "I")
	public int anInt5788 = 1275852455;

	@OriginalMember(owner = "client!yt", name = "i", descriptor = "I")
	public int anInt5789 = 1420521984;

	@OriginalMember(owner = "client!yt", name = "m", descriptor = "Z")
	public boolean aBoolean990 = true;

	@OriginalMember(owner = "client!yt", name = "o", descriptor = "I")
	public int anInt5790 = -1914742616;

	@OriginalMember(owner = "client!yt", name = "j", descriptor = "Z")
	public boolean aBoolean991 = false;

	@OriginalMember(owner = "client!yt", name = "a", descriptor = "I")
	public int anInt5791 = 935345519;

	@OriginalMember(owner = "client!yt", name = "s", descriptor = "I")
	public int anInt5784 = -1008954176;

	@OriginalMember(owner = "client!yt", name = "k", descriptor = "I")
	public int anInt5793 = 1919154365;

	@OriginalMember(owner = "client!yt", name = "x", descriptor = "I")
	public int anInt5792 = -869883785;

	@OriginalMember(owner = "client!yt", name = "w", descriptor = "I")
	public int anInt5795 = 0;

	@OriginalMember(owner = "client!yt", name = "r", descriptor = "I")
	public int anInt5796 = -1782193984;

	@OriginalMember(owner = "client!yt", name = "k", descriptor = "(I)I")
	static int method37017(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class651.method33130(arg0, 1543669420);
	}

	@OriginalMember(owner = "client!yt", name = "x", descriptor = "(I)I")
	static int method37018(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class651.method33130(arg0, 1802166337);
	}

	@OriginalMember(owner = "client!yt", name = "w", descriptor = "(I)I")
	static int method37019(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class651.method33130(arg0, 1912532926);
	}

	@OriginalMember(owner = "client!yt", name = "r", descriptor = "(I)I")
	static int method37020(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class651.method33130(arg0, 1641396950);
	}

	@OriginalMember(owner = "client!yt", name = "ea", descriptor = "(Lclient!yp;I)V")
	static void method37021(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2080412371);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class433.method29105(local16, local22, arg0, 1206901479);
	}

	@OriginalMember(owner = "client!yt", name = "alh", descriptor = "(Lclient!yp;I)V")
	static void method37022(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) int local16 = Class297.method27005(local12, -945724847);
		if (local16 < 0) {
			throw new RuntimeException();
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16;
	}

	@OriginalMember(owner = "client!yt", name = "avp", descriptor = "(Lclient!yp;I)V")
	static void method37023(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!yt", name = "azb", descriptor = "(Lclient!yp;S)V")
	static void method37024(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!yt", name = "<init>", descriptor = "()V")
	Class694() {
	}

	@OriginalMember(owner = "client!yt", name = "m", descriptor = "(Lclient!ald;I)V")
	void method37015(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5786 = Class273.method26774(arg0.method23180(1710327153), (byte) 1) * -1746910345;
		} else if (arg1 == 2) {
			this.anInt5787 = arg0.method23362(285432452) * 244061577;
		} else if (arg1 == 3) {
			this.anInt5787 = arg0.method23178((byte) -104) * 244061577;
			if (this.anInt5787 * 318042297 == 65535) {
				this.anInt5787 = -244061577;
			}
		} else if (arg1 == 5) {
			this.aBoolean989 = false;
		} else if (arg1 == 7) {
			this.anInt5788 = Class273.method26774(arg0.method23180(1710327153), (byte) 1) * -1275852455;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5789 = (arg0.method23178((byte) -4) << 2) * 1177179577;
			} else if (arg1 == 10) {
				this.aBoolean990 = false;
			} else if (arg1 == 11) {
				this.anInt5790 = arg0.method23362(-345317732) * 1371269909;
			} else if (arg1 == 12) {
				this.aBoolean991 = true;
			} else if (arg1 == 13) {
				this.anInt5791 = arg0.method23180(1710327153) * -1572911589;
			} else if (arg1 == 14) {
				this.anInt5784 = (arg0.method23362(-417356924) << 2) * -351309229;
			} else if (arg1 == 16) {
				this.anInt5793 = arg0.method23362(-336716070) * 1944472131;
			} else if (arg1 == 20) {
				this.anInt5792 = arg0.method23178((byte) -41) * 122540489;
			} else if (arg1 == 21) {
				this.anInt5795 = arg0.method23362(-2427537) * -1489893169;
			} else if (arg1 == 22) {
				this.anInt5796 = arg0.method23178((byte) -11) * 173479811;
			}
		}
	}

	@OriginalMember(owner = "client!yt", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-359176496);
			if (local3 == 0) {
				return;
			}
			this.method37016(arg0, local3, (byte) 100);
		}
	}

	@OriginalMember(owner = "client!yt", name = "l", descriptor = "(Lclient!ald;IB)V")
	void method37016(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt5786 = Class273.method26774(arg0.method23180(1710327153), (byte) 1) * -1746910345;
		} else if (arg1 == 2) {
			this.anInt5787 = arg0.method23362(612870692) * 244061577;
		} else if (arg1 == 3) {
			this.anInt5787 = arg0.method23178((byte) -61) * 244061577;
			if (this.anInt5787 * 318042297 == 65535) {
				this.anInt5787 = -244061577;
			}
		} else if (arg1 == 5) {
			this.aBoolean989 = false;
		} else if (arg1 == 7) {
			this.anInt5788 = Class273.method26774(arg0.method23180(1710327153), (byte) 1) * -1275852455;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5789 = (arg0.method23178((byte) -118) << 2) * 1177179577;
			} else if (arg1 == 10) {
				this.aBoolean990 = false;
			} else if (arg1 == 11) {
				this.anInt5790 = arg0.method23362(1005926424) * 1371269909;
			} else if (arg1 == 12) {
				this.aBoolean991 = true;
			} else if (arg1 == 13) {
				this.anInt5791 = arg0.method23180(1710327153) * -1572911589;
			} else if (arg1 == 14) {
				this.anInt5784 = (arg0.method23362(1086744656) << 2) * -351309229;
			} else if (arg1 == 16) {
				this.anInt5793 = arg0.method23362(-791636385) * 1944472131;
			} else if (arg1 == 20) {
				this.anInt5792 = arg0.method23178((byte) -13) * 122540489;
			} else if (arg1 == 21) {
				this.anInt5795 = arg0.method23362(432485050) * -1489893169;
			} else if (arg1 == 22) {
				this.anInt5796 = arg0.method23178((byte) -29) * 173479811;
			}
		}
	}

	@OriginalMember(owner = "client!yt", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
		this.anInt5790 = (this.anInt5790 * 392432701 << 8 | this.anInt5785 * -2056010301) * 1371269909;
	}

	@OriginalMember(owner = "client!yt", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		this.anInt5785 = arg0 * -838118677;
	}

	@OriginalMember(owner = "client!yt", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
		this.anInt5790 = (this.anInt5790 * 392432701 << 8 | this.anInt5785 * -2056010301) * 1371269909;
	}

	@OriginalMember(owner = "client!yt", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1783948768);
			if (local3 == 0) {
				return;
			}
			this.method37016(arg0, local3, (byte) 100);
		}
	}

	@OriginalMember(owner = "client!yt", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0 * -838118677;
	}

	@OriginalMember(owner = "client!yt", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0 * -838118677;
	}

	@OriginalMember(owner = "client!yt", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0 * -838118677;
	}

	@OriginalMember(owner = "client!yt", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
		this.anInt5785 = arg0 * -838118677;
	}
}
