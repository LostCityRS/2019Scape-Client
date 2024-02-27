package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iy")
public final class Class353 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "I")
	public int anInt4248;

	@OriginalMember(owner = "client!iy", name = "u", descriptor = "I")
	public int anInt4249;

	@OriginalMember(owner = "client!iy", name = "k", descriptor = "I")
	public int anInt4250;

	@OriginalMember(owner = "client!iy", name = "e", descriptor = "I")
	public int anInt4251;

	@OriginalMember(owner = "client!iy", name = "w", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!iy", name = "m", descriptor = "I")
	public int anInt4253;

	@OriginalMember(owner = "client!iy", name = "z", descriptor = "I")
	public int anInt4254;

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "I")
	public int anInt4255;

	@OriginalMember(owner = "client!iy", name = "d", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!iy", name = "n", descriptor = "I")
	public int anInt4247 = 1385777912;

	@OriginalMember(owner = "client!iy", name = "l", descriptor = "I")
	public int anInt4252 = 1996845577;

	@OriginalMember(owner = "client!iy", name = "g", descriptor = "(B)Z")
	public static boolean method27778(@OriginalArg(0) byte arg0) {
		return Class527.aString231.startsWith("win");
	}

	@OriginalMember(owner = "client!iy", name = "as", descriptor = "(III)I")
	public static int method27779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class625.aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < Class625.aTwitchWebcamDeviceArray1.length ? Class166_Sub13.aTwitchTV1.StartWebcamDevice(Class625.aTwitchWebcamDeviceArray1[arg0].anInt3625 * -1975853991, arg1) : -1;
	}

	@OriginalMember(owner = "client!iy", name = "b", descriptor = "(Lclient!arm;Lclient!yf;I)V")
	static void method27780(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = Class166_Sub14.method15669(arg0, 1334749392);
		arg1.anObjectArray45[(arg1.anInt6049 += 957530791) * 587908375 - 1] = Class358.method27960(arg0, -1478709820);
		arg1.anObjectArray45[(arg1.anInt6049 += 957530791) * 587908375 - 1] = Class451.method29131(arg0, (byte) 4);
		arg1.anObjectArray45[(arg1.anInt6049 += 957530791) * 587908375 - 1] = Class200.method24641(arg0, 738466688);
	}

	@OriginalMember(owner = "client!iy", name = "bn", descriptor = "(Lclient!yf;B)V")
	static void method27781(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		if (local8.aClass312_13.anInt4011 * 532402067 != -1) {
			@Pc(32) Class312 local32 = local8.method33409(1860865209);
			local32.aClass312Array2[local8.aClass312_13.anInt4011 * 532402067] = null;
			Class354.method27789(local32, -1174743804);
		} else if (arg0.aBoolean884) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iy", name = "ox", descriptor = "(Lclient!yf;I)V")
	static void method27782(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1282740934);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24585(local16, local22, arg0, -840859671);
	}

	@OriginalMember(owner = "client!iy", name = "rn", descriptor = "(Lclient!yf;I)V")
	static void method27783(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4030 * 1868441863;
	}

	@OriginalMember(owner = "client!iy", name = "xq", descriptor = "(Lclient!yf;I)V")
	static void method27784(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class89.method1599(local13, local23, local33, true, (byte) 50);
	}

	@OriginalMember(owner = "client!iy", name = "<init>", descriptor = "()V")
	Class353() {
	}

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "(Lclient!alw;I)V")
	void method27775(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4247 = arg0.method22427(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean730 = true;
		} else if (arg1 == 3) {
			this.anInt4253 = arg0.method22494((byte) -20) * 1413484159;
			this.anInt4250 = arg0.method22494((byte) -116) * 1586091789;
			this.anInt4248 = arg0.method22494((byte) -93) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4251 = arg0.method22425((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4249 = arg0.method22448(-706040793) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4252 = arg0.method22429((short) -2379) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4254 = arg0.method22494((byte) -6) * -227932087;
			this.anInt4255 = arg0.method22494((byte) -66) * 905769807;
			this.anInt4256 = arg0.method22494((byte) -57) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27776(arg0, local3, (byte) -80);
		}
	}

	@OriginalMember(owner = "client!iy", name = "u", descriptor = "(Lclient!alw;IB)V")
	void method27776(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt4247 = arg0.method22427(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean730 = true;
		} else if (arg1 == 3) {
			this.anInt4253 = arg0.method22494((byte) -44) * 1413484159;
			this.anInt4250 = arg0.method22494((byte) -26) * 1586091789;
			this.anInt4248 = arg0.method22494((byte) -59) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4251 = arg0.method22425((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4249 = arg0.method22448(-1481203127) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4252 = arg0.method22429((short) -2269) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4254 = arg0.method22494((byte) -51) * -227932087;
			this.anInt4255 = arg0.method22494((byte) -40) * 905769807;
			this.anInt4256 = arg0.method22494((byte) -128) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!iy", name = "d", descriptor = "(Lclient!alw;I)V")
	void method27777(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4247 = arg0.method22427(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean730 = true;
		} else if (arg1 == 3) {
			this.anInt4253 = arg0.method22494((byte) -105) * 1413484159;
			this.anInt4250 = arg0.method22494((byte) -117) * 1586091789;
			this.anInt4248 = arg0.method22494((byte) -117) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4251 = arg0.method22425((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4249 = arg0.method22448(-162194924) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4252 = arg0.method22429((short) 11085) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4254 = arg0.method22494((byte) -65) * -227932087;
			this.anInt4255 = arg0.method22494((byte) -84) * 905769807;
			this.anInt4256 = arg0.method22494((byte) -55) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27776(arg0, local3, (byte) -55);
		}
	}

	@OriginalMember(owner = "client!iy", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27776(arg0, local3, (byte) -66);
		}
	}

	@OriginalMember(owner = "client!iy", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27776(arg0, local3, (byte) -70);
		}
	}

	@OriginalMember(owner = "client!iy", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!iy", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27776(arg0, local3, (byte) -46);
		}
	}

	@OriginalMember(owner = "client!iy", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}
}
