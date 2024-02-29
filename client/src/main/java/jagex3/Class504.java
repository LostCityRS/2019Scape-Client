package jagex3;

import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
final class Class504 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	protected static int anInt5362;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "(ZI)V")
	public static void method30376(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "(I)Ljava/awt/Container;")
	public static Container method30377(@OriginalArg(0) int arg0) {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.anApplet2 : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "cw", descriptor = "(Lclient!yf;I)V")
	static void method30378(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class699.method36890(local11, local14, arg0, 1602382659);
	}

	@OriginalMember(owner = "client!qf", name = "aot", descriptor = "(Lclient!yf;I)V")
	static void method30379(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9023(-1662199153) != Class342.aClass342_4) {
			throw new RuntimeException();
		}
		((Class124_Sub2) Class65.aClass123_Sub1_2.method8952((byte) -85)).method9298(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1, -995416995);
	}

	@OriginalMember(owner = "client!qf", name = "azz", descriptor = "(Lclient!yf;B)V")
	static void method30380(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub39_2.method16354(-2128919861) && Class694.aClass104_14.method20452() ? 1 : 0;
	}

	@OriginalMember(owner = "client!qf", name = "aqn", descriptor = "(Lclient!yf;I)V")
	static void method30381(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class251.method26059(-1877670986).method37101();
	}

	@OriginalMember(owner = "client!qf", name = "ha", descriptor = "(Lclient!ahm;IIII)V")
	static void method30382(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class622 local3 = arg0.method19978(-389730816);
		@Pc(6) Class19_Sub3 local6 = arg0.aClass19_Sub3_3;
		@Pc(19) int local19 = arg0.anInt2771 * -1921859025 - arg0.aClass523_7.anInt5384 * -1093332503 & 0x3FFF;
		if (arg1 == Class707.aClass707_5.aByte176) {
			if (local19 == 0 && arg0.anInt2787 * 778439417 <= 25) {
				if (!local6.aBoolean380 || !local3.method32310(local6.method23566((byte) 46), -104543773)) {
					local6.method23570(local3.method32315(900047427), false, true, (byte) 59);
					local6.aBoolean380 = local6.method23564(1542754711);
				}
			} else if (arg3 < 0 && local3.anInt5809 * -1755274647 != -1) {
				local6.method23570(local3.anInt5809 * -1755274647, false, true, (byte) 114);
				local6.aBoolean380 = false;
			} else if (arg3 > 0 && local3.anInt5835 * -1352988691 != -1) {
				local6.method23570(local3.anInt5835 * -1352988691, false, true, (byte) 32);
				local6.aBoolean380 = false;
			} else if (!local6.aBoolean380 || !local3.method32310(local6.method23566((byte) 0), 657165549)) {
				local6.method23570(local3.method32315(383706371), false, true, (byte) 104);
				local6.aBoolean380 = arg0.aClass19_Sub3_3.method23564(-1948464408);
			}
		} else if (-583289569 * arg0.anInt2772 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(146) int local146 = client.anIntArray303[arg2] - arg0.aClass523_7.anInt5384 * -1093332503 & 0x3FFF;
			if (Class707.aClass707_3.aByte176 == arg1 && local3.anInt5841 * 1046628773 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5817 * 1632091583 != -1) {
					local6.method23570(local3.anInt5817 * 1632091583, false, true, (byte) 95);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5816 * 1798234475 != -1) {
					local6.method23570(local3.anInt5816 * 1798234475, false, true, (byte) 75);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5815 * 884977547 == -1) {
					local6.method23570(local3.anInt5841 * 1046628773, false, true, (byte) 27);
				} else {
					local6.method23570(local3.anInt5815 * 884977547, false, true, (byte) 69);
				}
			} else if (arg1 == Class707.aClass707_1.aByte176 && local3.anInt5818 * -2077928117 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt5806 * 285037349 != -1) {
					local6.method23570(local3.anInt5806 * 285037349, false, true, (byte) 46);
				} else if (local146 >= 10240 && local146 < 14336 && local3.anInt5814 * -2038961455 != -1) {
					local6.method23570(local3.anInt5814 * -2038961455, false, true, (byte) 119);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5819 * 1363226867 == -1) {
					local6.method23570(local3.anInt5818 * -2077928117, false, true, (byte) 112);
				} else {
					local6.method23570(local3.anInt5819 * 1363226867, false, true, (byte) 98);
				}
			} else if (local146 > 2048 && local146 <= 6144 && local3.anInt5832 * -2004980231 != -1) {
				local6.method23570(local3.anInt5832 * -2004980231, false, true, (byte) 114);
			} else if (local146 >= 10240 && local146 < 14336 && -1383884533 * local3.anInt5812 != -1) {
				local6.method23570(local3.anInt5812 * -1383884533, false, true, (byte) 42);
			} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt5811 * 269905359 == -1) {
				local6.method23570(local3.anInt5831 * 601549381, false, true, (byte) 93);
			} else {
				local6.method23570(local3.anInt5811 * 269905359, false, true, (byte) 81);
			}
			local6.aBoolean380 = false;
		} else if (local19 == 0 && arg0.anInt2787 * 778439417 <= 25) {
			if (arg1 == Class707.aClass707_3.aByte176 && local3.anInt5841 * 1046628773 != -1) {
				local6.method23570(local3.anInt5841 * 1046628773, false, true, (byte) 125);
			} else if (Class707.aClass707_1.aByte176 == arg1 && local3.anInt5818 * -2077928117 != -1) {
				local6.method23570(local3.anInt5818 * -2077928117, false, true, (byte) 56);
			} else {
				local6.method23570(local3.anInt5831 * 601549381, false, true, (byte) 7);
			}
			local6.aBoolean380 = false;
		} else {
			if (Class707.aClass707_3.aByte176 == arg1 && local3.anInt5841 * 1046628773 != -1) {
				if (arg3 < 0 && local3.anInt5823 * 252124713 != -1) {
					local6.method23570(local3.anInt5823 * 252124713, false, true, (byte) 98);
				} else if (arg3 <= 0 || local3.anInt5824 * 760255791 == -1) {
					local6.method23570(local3.anInt5841 * 1046628773, false, true, (byte) 46);
				} else {
					local6.method23570(local3.anInt5824 * 760255791, false, true, (byte) 90);
				}
			} else if (Class707.aClass707_1.aByte176 == arg1 && local3.anInt5818 * -2077928117 != -1) {
				if (arg3 < 0 && local3.anInt5833 * 1183309379 != -1) {
					local6.method23570(local3.anInt5833 * 1183309379, false, true, (byte) 90);
				} else if (arg3 <= 0 || local3.anInt5822 * 736304413 == -1) {
					local6.method23570(local3.anInt5818 * -2077928117, false, true, (byte) 77);
				} else {
					local6.method23570(local3.anInt5822 * 736304413, false, true, (byte) 57);
				}
			} else if (arg3 < 0 && local3.anInt5807 * 136766719 != -1) {
				local6.method23570(local3.anInt5807 * 136766719, false, true, (byte) 98);
			} else if (arg3 <= 0 || -589963453 * local3.anInt5826 == -1) {
				local6.method23570(local3.anInt5831 * 601549381, false, true, (byte) 3);
			} else {
				local6.method23570(local3.anInt5826 * -589963453, false, true, (byte) 44);
			}
			local6.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;")
	@Override
	public Object method30453(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		return arg0.method22439(641571683);
	}

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;")
	@Override
	public Object method30452(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22439(1005656372);
	}

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;")
	@Override
	public Object method30451(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22439(1732561270);
	}
}
