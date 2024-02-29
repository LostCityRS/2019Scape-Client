package com.jagex;

import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
final class Class504 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	protected static int anInt5201;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30272(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		return arg0.method22509(641571683);
	}

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30271(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22509(1005656372);
	}

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 25)
	@Override
	public Object method30270(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22509(1732561270);
	}

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "(ZI)V", line = 89)
	public static void method30195(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "(I)Ljava/awt/Container;", line = 457)
	public static Container method30196(@OriginalArg(0) int arg0) {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.anApplet2 : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "ha", descriptor = "(Lclient!ahm;IIII)V", line = 4186)
	static void method30197(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class622 local3 = arg0.method19997(-389730816);
		@Pc(6) Class19_Sub3 local6 = arg0.aClass19_Sub3_3;
		@Pc(19) int local19 = arg0.anInt2771 * -1921859025 - arg0.aClass523_7.anInt5223 * -1093332503 & 0x3FFF;
		if (arg1 == Class707.aClass707_5.aByte176) {
			if (local19 == 0 && arg0.anInt2787 * 778439417 <= 25) {
				if (!local6.aBoolean379 || !local3.method32134(local6.method23564((byte) 46), -104543773)) {
					local6.method23569(local3.method32131(900047427), false, true, (byte) 59);
					local6.aBoolean379 = local6.method23557(1542754711);
				}
			} else if (arg3 < 0 && local3.anInt5648 * -1755274647 != -1) {
				local6.method23569(local3.anInt5648 * -1755274647, false, true, (byte) 114);
				local6.aBoolean379 = false;
			} else if (arg3 > 0 && local3.anInt5674 * -1352988691 != -1) {
				local6.method23569(local3.anInt5674 * -1352988691, false, true, (byte) 32);
				local6.aBoolean379 = false;
			} else if (!local6.aBoolean379 || !local3.method32134(local6.method23564((byte) 0), 657165549)) {
				local6.method23569(local3.method32131(383706371), false, true, (byte) 104);
				local6.aBoolean379 = arg0.aClass19_Sub3_3.method23557(-1948464408);
			}
		} else if (-583289569 * arg0.anInt2772 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(146) int local146 = client.anIntArray303[arg2] - arg0.aClass523_7.anInt5223 * -1093332503 & 0x3FFF;
			if (Class707.aClass707_3.aByte176 == arg1 && local3.anInt5680 * 1046628773 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5656 * 1632091583 != -1) {
					local6.method23569(local3.anInt5656 * 1632091583, false, true, (byte) 95);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5655 * 1798234475 != -1) {
					local6.method23569(local3.anInt5655 * 1798234475, false, true, (byte) 75);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5654 * 884977547 == -1) {
					local6.method23569(local3.anInt5680 * 1046628773, false, true, (byte) 27);
				} else {
					local6.method23569(local3.anInt5654 * 884977547, false, true, (byte) 69);
				}
			} else if (arg1 == Class707.aClass707_1.aByte176 && local3.anInt5657 * -2077928117 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5645 * 285037349 != -1) {
					local6.method23569(local3.anInt5645 * 285037349, false, true, (byte) 46);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5653 * -2038961455 != -1) {
					local6.method23569(local3.anInt5653 * -2038961455, false, true, (byte) 119);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5658 * 1363226867 == -1) {
					local6.method23569(local3.anInt5657 * -2077928117, false, true, (byte) 112);
				} else {
					local6.method23569(local3.anInt5658 * 1363226867, false, true, (byte) 98);
				}
			} else if (local146 > 2048 && local146 <= 6144 && local3.anInt5671 * -2004980231 != -1) {
				local6.method23569(local3.anInt5671 * -2004980231, false, true, (byte) 114);
			} else if (local146 >= 10240 && local146 < 14336 && -1383884533 * local3.anInt5651 != -1) {
				local6.method23569(local3.anInt5651 * -1383884533, false, true, (byte) 42);
			} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5650 * 269905359 == -1) {
				local6.method23569(local3.anInt5670 * 601549381, false, true, (byte) 93);
			} else {
				local6.method23569(local3.anInt5650 * 269905359, false, true, (byte) 81);
			}
			local6.aBoolean379 = false;
		} else if (local19 == 0 && arg0.anInt2787 * 778439417 <= 25) {
			if (arg1 == Class707.aClass707_3.aByte176 && local3.anInt5680 * 1046628773 != -1) {
				local6.method23569(local3.anInt5680 * 1046628773, false, true, (byte) 125);
			} else if (Class707.aClass707_1.aByte176 == arg1 && local3.anInt5657 * -2077928117 != -1) {
				local6.method23569(local3.anInt5657 * -2077928117, false, true, (byte) 56);
			} else {
				local6.method23569(local3.anInt5670 * 601549381, false, true, (byte) 7);
			}
			local6.aBoolean379 = false;
		} else {
			if (Class707.aClass707_3.aByte176 == arg1 && local3.anInt5680 * 1046628773 != -1) {
				if (arg3 < 0 && local3.anInt5662 * 252124713 != -1) {
					local6.method23569(local3.anInt5662 * 252124713, false, true, (byte) 98);
				} else if (arg3 <= 0 || local3.anInt5663 * 760255791 == -1) {
					local6.method23569(local3.anInt5680 * 1046628773, false, true, (byte) 46);
				} else {
					local6.method23569(local3.anInt5663 * 760255791, false, true, (byte) 90);
				}
			} else if (Class707.aClass707_1.aByte176 == arg1 && local3.anInt5657 * -2077928117 != -1) {
				if (arg3 < 0 && local3.anInt5672 * 1183309379 != -1) {
					local6.method23569(local3.anInt5672 * 1183309379, false, true, (byte) 90);
				} else if (arg3 <= 0 || local3.anInt5661 * 736304413 == -1) {
					local6.method23569(local3.anInt5657 * -2077928117, false, true, (byte) 77);
				} else {
					local6.method23569(local3.anInt5661 * 736304413, false, true, (byte) 57);
				}
			} else if (arg3 < 0 && local3.anInt5646 * 136766719 != -1) {
				local6.method23569(local3.anInt5646 * 136766719, false, true, (byte) 98);
			} else if (arg3 <= 0 || -589963453 * local3.anInt5665 == -1) {
				local6.method23569(local3.anInt5670 * 601549381, false, true, (byte) 3);
			} else {
				local6.method23569(local3.anInt5665 * -589963453, false, true, (byte) 44);
			}
			local6.aBoolean379 = false;
		}
	}

	@OriginalMember(owner = "client!qf", name = "cw", descriptor = "(Lclient!yf;I)V", line = 5368)
	static final void method30198(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class699.method36708(local11, local14, arg0, 1602382659);
	}

	@OriginalMember(owner = "client!qf", name = "aot", descriptor = "(Lclient!yf;I)V", line = 12594)
	static final void method30199(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_4) {
			throw new RuntimeException();
		}
		((Class124_Sub2) Class65.aClass123_Sub1_2.method9011((byte) -85)).method9300(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1, -995416995);
	}

	@OriginalMember(owner = "client!qf", name = "aqn", descriptor = "(Lclient!yf;I)V", line = 12786)
	static final void method30200(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class251.method25968(-1877670986).method36920();
	}

	@OriginalMember(owner = "client!qf", name = "azz", descriptor = "(Lclient!yf;B)V", line = 14153)
	static final void method30201(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub39_2.method16343(-2128919861) && Class694.aClass104_14.method20546() ? 1 : 0;
	}
}
