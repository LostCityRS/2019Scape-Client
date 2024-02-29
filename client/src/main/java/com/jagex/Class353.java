package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iy")
public class Class353 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!iy", name = "u", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!iy", name = "k", descriptor = "I")
	public int anInt4209;

	@OriginalMember(owner = "client!iy", name = "e", descriptor = "I")
	public int anInt4210;

	@OriginalMember(owner = "client!iy", name = "w", descriptor = "Z")
	public boolean aBoolean726;

	@OriginalMember(owner = "client!iy", name = "m", descriptor = "I")
	public int anInt4212;

	@OriginalMember(owner = "client!iy", name = "z", descriptor = "I")
	public int anInt4213;

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "I")
	public int anInt4214;

	@OriginalMember(owner = "client!iy", name = "d", descriptor = "I")
	public int anInt4215;

	@OriginalMember(owner = "client!iy", name = "n", descriptor = "I")
	public int anInt4206 = 1385777912;

	@OriginalMember(owner = "client!iy", name = "l", descriptor = "I")
	public int anInt4211 = 1996845577;

	@OriginalMember(owner = "client!iy", name = "<init>", descriptor = "()V", line = 21)
	Class353() {
	}

	@OriginalMember(owner = "client!iy", name = "e", descriptor = "(Lclient!alw;B)V", line = 25)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27683(arg0, local3, (byte) -80);
		}
	}

	@OriginalMember(owner = "client!iy", name = "m", descriptor = "(Lclient!alw;)V", line = 25)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27683(arg0, local3, (byte) -55);
		}
	}

	@OriginalMember(owner = "client!iy", name = "k", descriptor = "(Lclient!alw;)V", line = 25)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27683(arg0, local3, (byte) -66);
		}
	}

	@OriginalMember(owner = "client!iy", name = "w", descriptor = "(Lclient!alw;)V", line = 25)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27683(arg0, local3, (byte) -70);
		}
	}

	@OriginalMember(owner = "client!iy", name = "f", descriptor = "(Lclient!alw;)V", line = 25)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27683(arg0, local3, (byte) -46);
		}
	}

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "(Lclient!alw;I)V", line = 32)
	void method27682(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4206 = arg0.method22472(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean726 = true;
		} else if (arg1 == 3) {
			this.anInt4212 = arg0.method22475((byte) -20) * 1413484159;
			this.anInt4209 = arg0.method22475((byte) -116) * 1586091789;
			this.anInt4207 = arg0.method22475((byte) -93) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4210 = arg0.method22465((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4208 = arg0.method22542(-706040793) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4211 = arg0.method22478((short) -2379) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4213 = arg0.method22475((byte) -6) * -227932087;
			this.anInt4214 = arg0.method22475((byte) -66) * 905769807;
			this.anInt4215 = arg0.method22475((byte) -57) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "u", descriptor = "(Lclient!alw;IB)V", line = 32)
	void method27683(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt4206 = arg0.method22472(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean726 = true;
		} else if (arg1 == 3) {
			this.anInt4212 = arg0.method22475((byte) -44) * 1413484159;
			this.anInt4209 = arg0.method22475((byte) -26) * 1586091789;
			this.anInt4207 = arg0.method22475((byte) -59) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4210 = arg0.method22465((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4208 = arg0.method22542(-1481203127) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4211 = arg0.method22478((short) -2269) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4213 = arg0.method22475((byte) -51) * -227932087;
			this.anInt4214 = arg0.method22475((byte) -40) * 905769807;
			this.anInt4215 = arg0.method22475((byte) -128) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "d", descriptor = "(Lclient!alw;I)V", line = 32)
	void method27684(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4206 = arg0.method22472(-1434290800) * 710093151;
		} else if (arg1 == 2) {
			this.aBoolean726 = true;
		} else if (arg1 == 3) {
			this.anInt4212 = arg0.method22475((byte) -105) * 1413484159;
			this.anInt4209 = arg0.method22475((byte) -117) * 1586091789;
			this.anInt4207 = arg0.method22475((byte) -117) * 2129323107;
		} else if (arg1 == 4) {
			this.anInt4210 = arg0.method22465((short) 16384) * -371871043;
		} else if (arg1 == 5) {
			this.anInt4208 = arg0.method22542(-162194924) * -1794285659;
		} else if (arg1 == 6) {
			this.anInt4211 = arg0.method22478((short) 11085) * 2147126775;
		} else if (arg1 == 7) {
			this.anInt4213 = arg0.method22475((byte) -65) * -227932087;
			this.anInt4214 = arg0.method22475((byte) -84) * 905769807;
			this.anInt4215 = arg0.method22475((byte) -55) * -326223519;
		}
	}

	@OriginalMember(owner = "client!iy", name = "z", descriptor = "(IB)V", line = 56)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!iy", name = "r", descriptor = "(I)V", line = 56)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "v", descriptor = "(I)V", line = 56)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "l", descriptor = "()V", line = 57)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!iy", name = "n", descriptor = "(I)V", line = 57)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "g", descriptor = "(B)Z", line = 273)
	public static boolean method27685(@OriginalArg(0) byte arg0) {
		return Class527.aString222.startsWith("win");
	}

	@OriginalMember(owner = "client!iy", name = "as", descriptor = "(III)I", line = 473)
	public static int method27686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class625.aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < Class625.aTwitchWebcamDeviceArray1.length ? Class166_Sub13.aTwitchTV1.StartWebcamDevice(Class625.aTwitchWebcamDeviceArray1[arg0].k * -1975853991, arg1) : -1;
	}

	@OriginalMember(owner = "client!iy", name = "b", descriptor = "(Lclient!arm;Lclient!yf;I)V", line = 539)
	static final void method27687(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		arg1.anIntArray519[(arg1.anInt5891 += 1189701933) * -1497248091 - 1] = Class166_Sub14.method15657(arg0, 1334749392);
		arg1.anObjectArray45[(arg1.anInt5888 += 957530791) * 587908375 - 1] = Class358.method27777(arg0, -1478709820);
		arg1.anObjectArray45[(arg1.anInt5888 += 957530791) * 587908375 - 1] = Class451.method28951(arg0, (byte) 4);
		arg1.anObjectArray45[(arg1.anInt5888 += 957530791) * 587908375 - 1] = Class200.method24629(arg0, 738466688);
	}

	@OriginalMember(owner = "client!iy", name = "bn", descriptor = "(Lclient!yf;B)V", line = 5123)
	static final void method27688(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		if (local8.aClass312_13.anInt3970 * 532402067 != -1) {
			@Pc(32) Class312 local32 = local8.method33225(1860865209);
			local32.aClass312Array2[local8.aClass312_13.anInt3970 * 532402067] = null;
			Class354.method27694(local32, -1174743804);
		} else if (arg0.aBoolean875) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iy", name = "ox", descriptor = "(Lclient!yf;I)V", line = 7679)
	static final void method27689(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1282740934);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24575(local16, local22, arg0, -840859671);
	}

	@OriginalMember(owner = "client!iy", name = "rn", descriptor = "(Lclient!yf;I)V", line = 8152)
	static final void method27690(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3989 * 1868441863;
	}

	@OriginalMember(owner = "client!iy", name = "xq", descriptor = "(Lclient!yf;I)V", line = 9229)
	static final void method27691(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class89.method1596(local13, local23, local33, true, (byte) 50);
	}
}
