package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qx")
public class Class520 {

	@OriginalMember(owner = "client!qx", name = "m", descriptor = "I")
	static final int anInt5214 = 2;

	@OriginalMember(owner = "client!qx", name = "w", descriptor = "I")
	static final int anInt5215 = 16;

	@OriginalMember(owner = "client!qx", name = "e", descriptor = "I")
	public static final int anInt5216 = 2;

	@OriginalMember(owner = "client!qx", name = "k", descriptor = "I")
	public static final int anInt5217 = 4;

	@OriginalMember(owner = "client!qx", name = "f", descriptor = "I")
	public static final int anInt5218 = 8;

	@OriginalMember(owner = "client!qx", name = "n", descriptor = "I")
	static final int anInt5219 = 2;

	@OriginalMember(owner = "client!qx", name = "ay", descriptor = "I")
	public static int anInt5220;

	@OriginalMember(owner = "client!qx", name = "eb", descriptor = "Lclient!pp;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!qx", name = "ns", descriptor = "Lclient!aqk;")
	public static Class132_Sub1_Sub1_Sub1_Sub2 selfPlayer;

	@OriginalMember(owner = "client!qx", name = "l", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qx", name = "<init>", descriptor = "(III)V", line = 12)
	public Class520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArrayArrayArray12 = new byte[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!qx", name = "e", descriptor = "(I)V", line = 17)
	public void method30325(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qx", name = "l", descriptor = "()V", line = 17)
	public void method30326() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qx", name = "w", descriptor = "()V", line = 17)
	public void method30327() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qx", name = "e", descriptor = "(B)[Lclient!zd;", line = 18)
	static Class702[] method30328(@OriginalArg(0) byte arg0) {
		return new Class702[] { Class702.aClass702_6, Class702.aClass702_9, Class702.aClass702_10, Class702.aClass702_7, Class702.aClass702_8, Class702.aClass702_5 };
	}

	@OriginalMember(owner = "client!qx", name = "n", descriptor = "(III)Z", line = 27)
	public boolean method30329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "m", descriptor = "(III)Z", line = 32)
	public boolean method30330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "u", descriptor = "(II)Z", line = 32)
	public boolean method30331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "z", descriptor = "(II)Z", line = 32)
	public boolean method30332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "p", descriptor = "(II)Z", line = 32)
	public boolean method30333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "c", descriptor = "(IIII)Z", line = 38)
	public boolean method30334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30338(arg1, arg2, arg3, (byte) 0) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "k", descriptor = "(IIIIB)Z", line = 38)
	public boolean method30335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30338(arg1, arg2, arg3, (byte) 0) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "d", descriptor = "(IIII)Z", line = 38)
	public boolean method30336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method30338(arg1, arg2, arg3, (byte) 0) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qx", name = "r", descriptor = "(III)I", line = 45)
	int method30337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qx", name = "f", descriptor = "(IIIB)I", line = 45)
	int method30338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qx", name = "v", descriptor = "(III)I", line = 45)
	int method30339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qx", name = "k", descriptor = "(Lclient!dh;I)V", line = 70)
	public static void method30340(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		Class707.aClass106_13 = (Class106) Class157.aClass462_2.method29258(client.anInterface50_1, Class393.anInt4654 * -414755309, true, true, -920650126);
		Class584.aClass5_15 = Class157.aClass462_2.method29259(client.anInterface50_1, Class393.anInt4654 * -414755309, 373300371);
		Class82.aClass106_1 = (Class106) Class157.aClass462_2.method29258(client.anInterface50_1, Class393.anInt4653 * 545040483, true, true, -1182236181);
		Class348.aClass5_14 = Class157.aClass462_2.method29259(client.anInterface50_1, Class393.anInt4653 * 545040483, -1243403341);
		Class118_Sub1.aClass106_3 = (Class106) Class157.aClass462_2.method29258(client.anInterface50_1, Class393.anInt4657 * -1023914731, true, true, 1828171144);
		Class110_Sub3.aClass5_7 = Class157.aClass462_2.method29259(client.anInterface50_1, Class393.anInt4657 * -1023914731, 613405039);
	}

	@OriginalMember(owner = "client!qx", name = "u", descriptor = "(I)I", line = 151)
	public static int method30341(@OriginalArg(0) int arg0) {
		return Class625.anInt5696 * 908241389;
	}

	@OriginalMember(owner = "client!qx", name = "bi", descriptor = "(Lclient!yf;I)V", line = 5114)
	static final void method30342(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		Class659.method32808(local13, 1766568141);
		Class380.method28116(Class166_Sub1.aClass320Array1[local13 >>> 16], local13 & 0xFFFF, local23, local33, arg0.aBoolean875, arg0, -1292091849);
	}

	@OriginalMember(owner = "client!qx", name = "afo", descriptor = "(Lclient!yf;I)V", line = 10486)
	static final void method30343(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13 + Class107.method18117(local26, true, -449951645);
	}
}
