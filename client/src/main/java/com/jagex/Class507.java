package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class507 {

	@OriginalMember(owner = "client!qi", name = "nx", descriptor = "I")
	public static int anInt5045;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(IIIIII)I")
	public static int method30497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(III)I")
	public static int method30498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(III)I")
	public static int method30499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
	public static int method30500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "(III)I")
	public static int method30501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "(III)I")
	public static int method30502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "(III)I")
	public static int method30503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(IIIIII)I")
	public static int method30504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "(IIIIII)I")
	public static int method30505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "(IIIIII)I")
	public static int method30506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "(IIIIII)I")
	public static int method30507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "(IIIIII)I")
	public static int method30508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (local14 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Lclient!di;JIIB)V")
	public static void method30509(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(9) int local9;
		if (arg0.method20693() && arg0.method20697() > -1) {
			local9 = arg0.method20697();
			@Pc(11) Class629 local11 = null;
			if (!Class622.aLinkedList6.isEmpty()) {
				local11 = (Class629) Class622.aLinkedList6.getFirst();
			}
			if (local11 != null && local9 == local11.anInt5543 * -1720890167) {
				Class622.aLinkedList6.removeFirst();
				arg0.method20782();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList8.isEmpty() && arg0.method20695()) {
					@Pc(55) long local55 = arg0.method20700(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
					local64 = Class669.aTwitchTV1.SubmitFrame(local55, arg0.method20696(), Class622.aBoolean937, arg2, arg3);
					arg0.method20701(local55);
				} else {
					arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
					Class229.method25997(Class503.anIntArray465, local11.aLinkedList8, local11.anInt5542 * 1341820711, local11.anInt5544 * 292274843, local11.aFloat338, 1956107616);
					local64 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, Class622.aBoolean937, arg2, arg3);
				}
				arg0.method20746();
				if (local64 == 2072) {
					Class622.aLong400 = arg1 * -31384695838519429L;
				} else if (local64 == 23) {
					Class622.aLong398 = arg1 * -2812865742381381251L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20698();
				Class622.aLinkedList6.clear();
			}
		}
		if (!Class622.aBoolean934) {
			return;
		}
		if (Class503.anIntArray465 == null) {
			Class503.anIntArray465 = new int[Class622.aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * 823569197 * Class292.anInt3951];
			Class347.anIntArray420 = new int[Class622.aBoolean937 ? arg3 * arg2 : Class351.anInt4255 * -1311710401 * Class292.anInt3951 * 823569197];
		}
		if (arg0.method20693()) {
			arg0.method20867(client.anInt3436, Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401);
			Class622.aLinkedList6.add(new Class629(client.anInt3436, Class622.aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200));
			Class622.aLinkedList7 = new LinkedList();
		} else {
			arg0.method20782();
			arg0.method20702(Class292.anInt3951 * 823569197, Class351.anInt4255 * -1311710401, Class503.anIntArray465, Class347.anIntArray420);
			Class229.method25997(Class503.anIntArray465, Class622.aLinkedList7, arg0.anInt2947 * 1069673649, arg0.anInt2932 * 262780429, arg0.aFloat200, 1186007415);
			local9 = Class669.aTwitchTV1.SubmitFrameRaw(Class503.anIntArray465, Class622.aBoolean937, arg2, arg3);
			arg0.method20746();
			Class622.aLinkedList7.clear();
			if (local9 == 2072) {
				Class622.aLong400 = arg1 * -31384695838519429L;
			} else if (local9 == 23) {
				Class622.aLong398 = arg1 * -2812865742381381251L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		Class622.aBoolean934 = false;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	public static void method30510(@OriginalArg(0) int arg0) {
		Class120_Sub1_Sub2_Sub1.method12503(1590102564);
	}

	@OriginalMember(owner = "client!qi", name = "bbn", descriptor = "(Lclient!yp;I)V")
	static void method30511(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		client.aBoolean737 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		if (client.aBoolean737) {
			Class624.method32447(89725933);
		}
	}

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "(B)[Lclient!adj;")
	static Class82[] method30512(@OriginalArg(0) byte arg0) {
		return new Class82[] { Class82.aClass82_20, Class82.aClass82_22, Class82.aClass82_19, Class82.aClass82_18, Class82.aClass82_23, Class82.aClass82_1, Class82.aClass82_16, Class82.aClass82_9, Class82.aClass82_3, Class82.aClass82_15, Class82.aClass82_2, Class82.aClass82_7, Class82.aClass82_21, Class82.aClass82_14, Class82.aClass82_27, Class82.aClass82_28, Class82.aClass82_10, Class82.aClass82_11, Class82.aClass82_12, Class82.aClass82_25, Class82.aClass82_4, Class82.aClass82_26, Class82.aClass82_30, Class82.aClass82_17, Class82.aClass82_8, Class82.aClass82_24, Class82.aClass82_31, Class82.aClass82_29, Class82.aClass82_13, Class82.aClass82_5, Class82.aClass82_6 };
	}

	@OriginalMember(owner = "client!qi", name = "amn", descriptor = "(Lclient!yp;I)V")
	static void method30513(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(Lclient!di;IIIILclient!dn;SBLclient!aad;B)Lclient!dn;")
	public static Class105 method30514(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) byte arg9) {
		if (arg5 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg8 != null) {
			local6 |= arg8.method23592(2110536489);
			local6 &= 0xFFFFFDFF;
		}
		@Pc(27) long local27 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(30) Class243 local30 = Class430.aClass243_81;
		@Pc(36) Class105 local36;
		synchronized (Class430.aClass243_81) {
			local36 = (Class105) Class430.aClass243_81.method26282(local27);
		}
		if (local36 == null || arg0.method21083(local36.method7326(), local6) != 0) {
			if (local36 != null) {
				local6 = arg0.method20755(local6, local36.method7326());
			}
			@Pc(67) Class232 local67 = new Class232(4, 2, 2);
			@Pc(69) short local69 = 128;
			@Pc(72) int[] local72 = new int[] { local67.method26042(-local69, 0, -local69), local67.method26042(local69, 0, -local69), local67.method26042(local69, 0, local69), local67.method26042(-local69, 0, local69) };
			local67.method26078(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26078(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method26044((short) 1, (short) 2, (short) 0);
			local67.method26044((short) 2, (short) 3, (short) 0);
			local36 = arg0.method20753(local67, local6, Class430.anInt4640 * 767492759, 64, 768);
			@Pc(155) Class243 local155 = Class430.aClass243_81;
			synchronized (Class430.aClass243_81) {
				Class430.aClass243_81.method26253(local36, local27);
			}
		}
		@Pc(171) int local171 = arg5.method7533();
		@Pc(174) int local174 = arg5.method7485();
		@Pc(177) int local177 = arg5.method7368();
		@Pc(180) int local180 = arg5.method7342();
		if (arg8 == null) {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local174 + local171 >> 1, 0, local180 + local177 >> 1);
		} else {
			local36 = local36.method7324((byte) 3, local6, true);
			local36.method7334(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method7332(local171 + local174 >> 1, 0, local177 + local180 >> 1);
			arg8.method23607(local36, 314536849);
		}
		if (arg2 != 0) {
			local36.method7330(arg2);
		}
		if (arg3 != 0) {
			local36.method7318(arg3);
		}
		if (arg4 != 0) {
			local36.method7332(0, arg4, 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!qi", name = "bdn", descriptor = "(Lclient!yp;I)V")
	static void method30515(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) boolean local17 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class575.method31785(local17, 1616440346);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
	public static void method30516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(7, (long) arg0);
		local4.method22078(1448631411);
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	Class507() throws Throwable {
		throw new Error();
	}
}
