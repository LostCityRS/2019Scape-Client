package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class502 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	static final int anInt5037 = 2;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	static final int anInt5038 = 2;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	public static final int anInt5039 = 4;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public static final int anInt5040 = 8;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	static final int anInt5041 = 16;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public static final int anInt5042 = 2;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qc", name = "sz", descriptor = "(Lclient!yp;I)V")
	static void method30445(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4136 * -1322281851 == 1 ? local11.anInt4122 * -589001179 : -1;
	}

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "(Lclient!pf;Lclient!pf;B)V")
	public static void method30446(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) byte arg2) {
		Class291.aClass480_91 = arg0;
		Class80_Sub1_Sub5.aClass480_81 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
	public Class502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArrayArrayArray12 = new byte[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "(IIII)Z")
	public boolean method30426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30431(arg1, arg2, arg3, 949638234) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "(I)V")
	public void method30427(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
	public boolean method30428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(III)Z")
	public boolean method30429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "(IIIII)Z")
	public boolean method30430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30431(arg1, arg2, arg3, 523592723) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(IIII)I")
	int method30431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(III)Z")
	public boolean method30432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(II)Z")
	public boolean method30433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "(II)Z")
	public boolean method30434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "(II)Z")
	public boolean method30435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(II)Z")
	public boolean method30436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "(II)Z")
	public boolean method30437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(II)Z")
	public boolean method30438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "(IIII)Z")
	public boolean method30439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30431(arg1, arg2, arg3, 1867812205) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(II)Z")
	public boolean method30440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "(IIII)Z")
	public boolean method30441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30431(arg1, arg2, arg3, 1195079108) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "(III)I")
	int method30442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(III)I")
	int method30443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(III)I")
	int method30444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
