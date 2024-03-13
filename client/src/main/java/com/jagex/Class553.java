package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public abstract class Class553 implements Interface60, Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!sk", name = "aq", descriptor = "Ljava/lang/String;")
	static final String aString132 = "main_file_cache.dat2";

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	static int anInt3409;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
	static final int anInt3410 = 32;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	static int anInt3411;

	@OriginalMember(owner = "client!sk", name = "an", descriptor = "I")
	static final int anInt3412 = 0;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	protected static int anInt3413;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!sr;")
	public static Class147 aClass147_2;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!sk", name = "at", descriptor = "J")
	static final long aLong240 = 3221225472L;

	@OriginalMember(owner = "client!sk", name = "am", descriptor = "Ljava/lang/String;")
	static final String aString134 = "rw";

	@OriginalMember(owner = "client!sk", name = "au", descriptor = "Ljava/io/File;")
	static File aFile2;

	@OriginalMember(owner = "client!sk", name = "ax", descriptor = "Ljava/lang/String;")
	static final String aString135 = "main_file_cache.idx";

	@OriginalMember(owner = "client!sk", name = "av", descriptor = "Ljava/lang/String;")
	static final String aString136 = "main_file_cache.idx255";

	@OriginalMember(owner = "client!sk", name = "ao", descriptor = "Ljava/lang/String;")
	static final String aString137 = "random.dat";

	@OriginalMember(owner = "client!sk", name = "bf", descriptor = "I")
	static final int anInt3420 = 1;

	@OriginalMember(owner = "client!sk", name = "ad", descriptor = "I")
	static final int anInt3421 = 1048576;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	static int anInt3423;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "J")
	static long aLong238 = -1671841977774964480L;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public static int anInt3407 = 0;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public static int anInt3417 = 0;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[J")
	static long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "[J")
	static long[] aLongArray22 = new long[32];

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
	public static int anInt3414 = 0;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Ljava/lang/String;")
	protected static String aString133 = null;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Z")
	protected static volatile boolean aBoolean586 = true;

	@OriginalMember(owner = "client!sk", name = "ae", descriptor = "I")
	static int anInt3418 = 1831995076;

	@OriginalMember(owner = "client!sk", name = "ag", descriptor = "Z")
	protected static volatile boolean aBoolean590 = false;

	@OriginalMember(owner = "client!sk", name = "ah", descriptor = "J")
	static volatile long aLong239 = 0L;

	@OriginalMember(owner = "client!sk", name = "ac", descriptor = "Z")
	protected static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!sk", name = "ai", descriptor = "Z")
	static volatile boolean aBoolean589 = true;

	@OriginalMember(owner = "client!sk", name = "aj", descriptor = "Lclient!abp;")
	static Class42 aClass42_4 = null;

	@OriginalMember(owner = "client!sk", name = "ay", descriptor = "Lclient!abp;")
	protected static Class42 aClass42_5 = null;

	@OriginalMember(owner = "client!sk", name = "ab", descriptor = "Lclient!abp;")
	protected static Class42 aClass42_6 = null;

	@OriginalMember(owner = "client!sk", name = "bl", descriptor = "Lclient!sm;")
	static Class555 aClass555_2 = null;

	@OriginalMember(owner = "client!sk", name = "bk", descriptor = "J")
	static long aLong241 = 0L;

	@OriginalMember(owner = "client!sk", name = "bh", descriptor = "Z")
	static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!sk", name = "bd", descriptor = "I")
	public static int anInt3419 = -2060182503;

	@OriginalMember(owner = "client!sk", name = "bc", descriptor = "I")
	public static int anInt3422 = -1401201395;

	@OriginalMember(owner = "client!sk", name = "bx", descriptor = "Z")
	boolean aBoolean592 = false;

	@OriginalMember(owner = "client!sk", name = "bi", descriptor = "Z")
	boolean aBoolean587 = false;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;Lclient!ox;FFFFB)V", line = 13)
	public static void method24841(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) Class472 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) byte arg11) {
		if (arg3.method29558(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29535(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29537(Class472.method29579(arg3, arg1));
		local14.method29623(arg2);
		@Pc(21) Class472 local21 = Class472.method29579(local14, local9);
		@Pc(24) float local24 = local21.method29593();
		if (arg7 > 0.0F) {
			arg5 = Class472.method29537(arg5);
			arg5.method29604(local24 / arg7 * arg8);
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat317 || Float.isNaN(arg1.aFloat317) || local24 > arg9 || local24 < arg10) {
			arg1.method29550(arg3);
			arg4.method29553();
			return;
		}
		arg2.method29492();
		@Pc(68) Class472 local68 = Class472.method29535(1.0F, 0.0F, 0.0F);
		@Pc(73) Class472 local73 = Class472.method29535(0.0F, 1.0F, 0.0F);
		@Pc(78) Class472 local78 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local68.method29623(arg2);
		local73.method29623(arg2);
		local78.method29623(arg2);
		@Pc(98) Class472 local98 = Class472.method29535(Class472.method29586(local68, arg4), Class472.method29586(local73, arg4), Class472.method29586(local78, arg4));
		@Pc(101) Class472 local101 = Class472.method29537(local98);
		local101.method29595();
		@Pc(111) Class472 local111 = Class472.method29611(Class472.method29601(local101, local101), Class472.method29619(arg5, 2.0F));
		@Pc(114) Class472 local114 = Class472.method29537(local21);
		local114.method29595();
		@Pc(119) Class472 local119 = Class472.method29537(local98);
		if (local111.aFloat317 > local114.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			} else {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < 0.0F) {
					local119.aFloat317 = 0.0F;
				}
			}
		} else if (local101.aFloat317 < arg6.aFloat317) {
			if (local21.aFloat317 < 0.0F) {
				local119.aFloat317 -= arg5.aFloat317 * arg0;
				if (local119.aFloat317 < -arg6.aFloat317) {
					local119.aFloat317 = -arg6.aFloat317;
				}
			} else {
				local119.aFloat317 += arg0 * arg5.aFloat317;
				if (local119.aFloat317 > arg6.aFloat317) {
					local119.aFloat317 = arg6.aFloat317;
				}
			}
		}
		if (local111.aFloat318 > local114.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 += arg5.aFloat318 * arg0;
				if (local119.aFloat318 > 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			} else {
				local119.aFloat318 -= arg0 * arg5.aFloat318;
				if (local119.aFloat318 < 0.0F) {
					local119.aFloat318 = 0.0F;
				}
			}
		} else if (local101.aFloat318 < arg6.aFloat318) {
			if (local21.aFloat318 < 0.0F) {
				local119.aFloat318 -= arg5.aFloat318 * arg0;
				if (local119.aFloat318 < -arg6.aFloat318) {
					local119.aFloat318 = -arg6.aFloat318;
				}
			} else {
				local119.aFloat318 += arg0 * arg5.aFloat318;
				if (local119.aFloat318 > arg6.aFloat318) {
					local119.aFloat318 = arg6.aFloat318;
				}
			}
		}
		if (local111.aFloat319 > local114.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 += arg0 * arg5.aFloat319;
				if (local119.aFloat319 > 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			} else {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < 0.0F) {
					local119.aFloat319 = 0.0F;
				}
			}
		} else if (local101.aFloat319 < arg6.aFloat319) {
			if (local21.aFloat319 < 0.0F) {
				local119.aFloat319 -= arg5.aFloat319 * arg0;
				if (local119.aFloat319 < -arg6.aFloat319) {
					local119.aFloat319 = -arg6.aFloat319;
				}
			} else {
				local119.aFloat319 += arg5.aFloat319 * arg0;
				if (local119.aFloat319 > arg6.aFloat319) {
					local119.aFloat319 = arg6.aFloat319;
				}
			}
		}
		@Pc(421) Class472 local421 = Class472.method29619(local68, local119.aFloat317);
		local421.method29572(local73, local119.aFloat318);
		local421.method29572(local78, local119.aFloat319);
		arg4.method29634(local421, 0.8F);
		arg1.method29567(Class472.method29619(arg4, arg0));
		local101.method29544();
		local119.method29544();
		local114.method29544();
	}

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "(II)Lclient!aaa;", line = 24)
	public static Class3 method24842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class3[] local2 = Class529.method30397((byte) 32);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class3 local12 = local2[local4];
			if (arg0 == local12.anInt5 * 1108974345) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 89)
	Class553() {
	}

	@OriginalMember(owner = "client!sk", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V", line = 92)
	@Override
	public void supplyApplet(@OriginalArg(0) Applet arg0) {
		Class32_Sub10.applet = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "af", descriptor = "(Ljava/applet/Applet;)V", line = 92)
	@Override
	public void method24833(@OriginalArg(0) Applet arg0) {
		Class32_Sub10.applet = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "ak", descriptor = "(Lclient!sq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24843(@OriginalArg(0) Class559 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24935(Class555.aClass555_4, arg7, 1101059334);
			anInt3413 = (width = arg0.method31115(-820575818) * 1671148283) * -1040934271;
			Class504.anInt5201 = (height = arg0.method31118(-567283080) * 490799697) * 500427957;
			anInt3414 = 0;
			anInt3415 = 0;
			if (Class343.method27519((byte) 45) == Class555.aClass555_5) {
				anInt3413 += arg0.method31119(-1175088513) * 1522031862;
				Class504.anInt5201 += arg0.method31123(-1743498683) * 1706598026;
				this.method24865(arg0.method31125((byte) -13), (byte) 114);
			}
			Class69.anApplet1 = Class32_Sub10.applet;
			this.method24847(arg1, arg2, arg3, arg4, arg5, arg6, -616301363);
		} catch (@Pc(67) Throwable local67) {
			Class646.method32608(null, local67, 1579532191);
			this.method24929("crash", 1979386679);
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(Lclient!sq;Ljava/lang/String;Ljava/lang/String;IIIIZI)V", line = 97)
	final void method24844(@OriginalArg(0) Class559 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		try {
			this.method24935(Class555.aClass555_4, arg7, 1331913860);
			anInt3413 = (width = arg0.method31115(-820575818) * 1671148283) * -1040934271;
			Class504.anInt5201 = (height = arg0.method31118(-567283080) * 490799697) * 500427957;
			anInt3414 = 0;
			anInt3415 = 0;
			if (Class343.method27519((byte) 115) == Class555.aClass555_5) {
				anInt3413 += arg0.method31119(-1726618611) * 1522031862;
				Class504.anInt5201 += arg0.method31123(-1743498683) * 1706598026;
				this.method24865(arg0.method31125((byte) -78), (byte) 99);
			}
			Class69.anApplet1 = Class32_Sub10.applet;
			this.method24847(arg1, arg2, arg3, arg4, arg5, arg6, -616301363);
		} catch (@Pc(67) Throwable local67) {
			Class646.method32608(null, local67, 1692810338);
			this.method24929("crash", 1399590744);
		}
	}

	@OriginalMember(owner = "client!sk", name = "an", descriptor = "(Lclient!sq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24845(@OriginalArg(0) Class559 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24935(Class555.aClass555_4, arg7, 917811850);
			anInt3413 = (width = arg0.method31115(-820575818) * 1671148283) * -1040934271;
			Class504.anInt5201 = (height = arg0.method31118(-567283080) * 490799697) * 500427957;
			anInt3414 = 0;
			anInt3415 = 0;
			if (Class343.method27519((byte) 44) == Class555.aClass555_5) {
				anInt3413 += arg0.method31119(1426116554) * 1522031862;
				Class504.anInt5201 += arg0.method31123(-1743498683) * 1706598026;
				this.method24865(arg0.method31125((byte) -47), (byte) 125);
			}
			Class69.anApplet1 = Class32_Sub10.applet;
			this.method24847(arg1, arg2, arg3, arg4, arg5, arg6, -616301363);
		} catch (@Pc(67) Throwable local67) {
			Class646.method32608(null, local67, 1089355595);
			this.method24929("crash", 2102320563);
		}
	}

	@OriginalMember(owner = "client!sk", name = "bf", descriptor = "(Lclient!sq;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24846(@OriginalArg(0) Class559 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24935(Class555.aClass555_4, arg7, -868112265);
			anInt3413 = (width = arg0.method31115(-820575818) * 1671148283) * -1040934271;
			Class504.anInt5201 = (height = arg0.method31118(-567283080) * 490799697) * 500427957;
			anInt3414 = 0;
			anInt3415 = 0;
			if (Class343.method27519((byte) 9) == Class555.aClass555_5) {
				anInt3413 += arg0.method31119(-1311792139) * 1522031862;
				Class504.anInt5201 += arg0.method31123(-1743498683) * 1706598026;
				this.method24865(arg0.method31125((byte) -87), (byte) 105);
			}
			Class69.anApplet1 = Class32_Sub10.applet;
			this.method24847(arg1, arg2, arg3, arg4, arg5, arg6, -616301363);
		} catch (@Pc(67) Throwable local67) {
			Class646.method32608(null, local67, 823907050);
			this.method24929("crash", -1380350714);
		}
	}

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V", line = 117)
	final void method24847(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) throws Exception {
		Class177.anInt3312 = arg3 * -50287977;
		Class366.anInt4584 = arg2 * 1992753025;
		RuntimeException_Sub1.anInt3188 = arg4 * 637270585;
		RuntimeException_Sub1.anInt3189 = arg5 * -501733079;
		Class392.aString197 = "Unknown";
		Class95.aString12 = "1.1";
		try {
			Class392.aString197 = System.getProperty("java.vendor");
			Class95.aString12 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class154_Sub1.aString49 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class154_Sub1.aString49 = "Unknown";
		}
		Class339.aString179 = Class154_Sub1.aString49.toLowerCase();
		try {
			Class320.aString173 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class320.aString173 = "";
		}
		try {
			Class672.aString238 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class672.aString238 = "";
		}
		try {
			Class485.aString216 = System.getProperty("user.home");
			if (Class485.aString216 != null) {
				Class485.aString216 = Class485.aString216 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class339.aString179.startsWith("win")) {
				if (Class485.aString216 == null) {
					Class485.aString216 = System.getenv("USERPROFILE");
				}
			} else if (Class485.aString216 == null) {
				Class485.aString216 = System.getenv("HOME");
			}
			if (Class485.aString216 != null) {
				Class485.aString216 = Class485.aString216 + "/";
			}
		} catch (@Pc(100) Exception local100) {
		}
		if (Class485.aString216 == null) {
			Class485.aString216 = "~/";
		}
		try {
			Class604.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(110) Throwable local110) {
		}
		Class676.aStringArray34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class485.aString216, "/tmp/", "" };
		Class133.aStringArray16 = new String[] { ".jagex_cache_" + Class366.anInt4584 * -1839644543, ".file_store_" + Class366.anInt4584 * -1839644543 };
		@Pc(176) int local176 = 0;
		@Pc(201) int local201;
		label131: while (local176 < 4) {
			Class564.aFile4 = this.method24849(arg0, arg1, local176, 16777215);
			if (!Class564.aFile4.exists()) {
				Class564.aFile4.mkdirs();
			}
			@Pc(195) File[] local195 = Class564.aFile4.listFiles();
			if (local195 == null) {
				break;
			}
			@Pc(199) File[] local199 = local195;
			local201 = 0;
			while (true) {
				if (local201 >= local199.length) {
					break label131;
				}
				@Pc(209) File local209 = local199[local201];
				if (!this.method24858(local209, false, (byte) -11)) {
					local176++;
					break;
				}
				local201++;
			}
		}
		Class294.method26596(Class564.aFile4, (byte) 21);
		Class430.method28761(1719882568);
		aClass42_5 = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.dat2", -861829956), "rw", 3221225472L), 5200, 0);
		aClass42_6 = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.idx255", -416434094), "rw", 1048576L), 6000, 0);
		Class623.aClass42Array1 = new Class42[Class177.anInt3312 * 694777127];
		for (local176 = 0; local176 < Class177.anInt3312 * 694777127; local176++) {
			Class623.aClass42Array1[local176] = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.idx" + local176, -2006573480), "rw", 1048576L), 6000, 0);
		}
		try {
			Class556.aClass7_1 = new Class7();
		} catch (@Pc(297) Exception local297) {
			Class4.aBoolean2 = false;
		}
		Class270.aClass551_1 = new Class551();
		@Pc(306) ThreadGroup local306 = Thread.currentThread().getThreadGroup();
		for (@Pc(309) ThreadGroup local309 = local306.getParent(); local309 != null; local309 = local309.getParent()) {
			local306 = local309;
		}
		@Pc(320) Thread[] local320 = new Thread[1000];
		local306.enumerate(local320);
		for (local201 = 0; local201 < local320.length; local201++) {
			if (local320[local201] != null && local320[local201].getName().startsWith("AWT")) {
				local320[local201].setPriority(1);
			}
		}
		@Pc(353) Thread local353 = new Thread(this);
		local353.setDaemon(true);
		local353.start();
		local353.setPriority(1);
	}

	@OriginalMember(owner = "client!sk", name = "bl", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V", line = 117)
	final void method24848(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class177.anInt3312 = arg3 * -50287977;
		Class366.anInt4584 = arg2 * 1992753025;
		RuntimeException_Sub1.anInt3188 = arg4 * 637270585;
		RuntimeException_Sub1.anInt3189 = arg5 * -501733079;
		Class392.aString197 = "Unknown";
		Class95.aString12 = "1.1";
		try {
			Class392.aString197 = System.getProperty("java.vendor");
			Class95.aString12 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class154_Sub1.aString49 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class154_Sub1.aString49 = "Unknown";
		}
		Class339.aString179 = Class154_Sub1.aString49.toLowerCase();
		try {
			Class320.aString173 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class320.aString173 = "";
		}
		try {
			Class672.aString238 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class672.aString238 = "";
		}
		try {
			Class485.aString216 = System.getProperty("user.home");
			if (Class485.aString216 != null) {
				Class485.aString216 = Class485.aString216 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class339.aString179.startsWith("win")) {
				if (Class485.aString216 == null) {
					Class485.aString216 = System.getenv("USERPROFILE");
				}
			} else if (Class485.aString216 == null) {
				Class485.aString216 = System.getenv("HOME");
			}
			if (Class485.aString216 != null) {
				Class485.aString216 = Class485.aString216 + "/";
			}
		} catch (@Pc(100) Exception local100) {
		}
		if (Class485.aString216 == null) {
			Class485.aString216 = "~/";
		}
		try {
			Class604.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(110) Throwable local110) {
		}
		Class676.aStringArray34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class485.aString216, "/tmp/", "" };
		Class133.aStringArray16 = new String[] { ".jagex_cache_" + Class366.anInt4584 * -1839644543, ".file_store_" + Class366.anInt4584 * -1839644543 };
		@Pc(176) int local176 = 0;
		@Pc(201) int local201;
		label131: while (local176 < 4) {
			Class564.aFile4 = this.method24849(arg0, arg1, local176, 16777215);
			if (!Class564.aFile4.exists()) {
				Class564.aFile4.mkdirs();
			}
			@Pc(195) File[] local195 = Class564.aFile4.listFiles();
			if (local195 == null) {
				break;
			}
			@Pc(199) File[] local199 = local195;
			local201 = 0;
			while (true) {
				if (local201 >= local199.length) {
					break label131;
				}
				@Pc(209) File local209 = local199[local201];
				if (!this.method24858(local209, false, (byte) -108)) {
					local176++;
					break;
				}
				local201++;
			}
		}
		Class294.method26596(Class564.aFile4, (byte) 24);
		Class430.method28761(638430743);
		aClass42_5 = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.dat2", -852735306), "rw", 3221225472L), 5200, 0);
		aClass42_6 = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.idx255", -153802781), "rw", 1048576L), 6000, 0);
		Class623.aClass42Array1 = new Class42[Class177.anInt3312 * 694777127];
		for (local176 = 0; local176 < Class177.anInt3312 * 694777127; local176++) {
			Class623.aClass42Array1[local176] = new Class42(new Class38(Class19_Sub2.method17371("main_file_cache.idx" + local176, -1664160811), "rw", 1048576L), 6000, 0);
		}
		try {
			Class556.aClass7_1 = new Class7();
		} catch (@Pc(297) Exception local297) {
			Class4.aBoolean2 = false;
		}
		Class270.aClass551_1 = new Class551();
		@Pc(306) ThreadGroup local306 = Thread.currentThread().getThreadGroup();
		for (@Pc(309) ThreadGroup local309 = local306.getParent(); local309 != null; local309 = local309.getParent()) {
			local306 = local309;
		}
		@Pc(320) Thread[] local320 = new Thread[1000];
		local306.enumerate(local320);
		for (local201 = 0; local201 < local320.length; local201++) {
			if (local320[local201] != null && local320[local201].getName().startsWith("AWT")) {
				local320[local201].setPriority(1);
			}
		}
		@Pc(353) Thread local353 = new Thread(this);
		local353.setDaemon(true);
		local353.start();
		local353.setPriority(1);
	}

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", line = 225)
	File method24849(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		aFile2 = new File(Class485.aString216, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (aFile2.exists()) {
			try {
				@Pc(50) Class38 local50 = new Class38(aFile2, "rw", 10000L);
				@Pc(58) Packet local58 = new Packet((int) local50.method732(1660572298));
				@Pc(84) int local84;
				while (local58.pos * 212851357 < local58.data.length) {
					local84 = local50.method734(local58.data, local58.pos * 212851357, local58.data.length - local58.pos * 212851357, (byte) 30);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.pos += local84 * -1445626955;
				}
				local58.pos = 0;
				local84 = local58.g1((short) 16384);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.g1((short) 16384);
				}
				if (local84 <= 2) {
					local36 = local58.gjstr2(1918013460);
					if (local127 == 1) {
						local38 = local58.gjstr2(-360628168);
					}
				} else {
					local36 = local58.gUTF8(-1927749946);
					if (local127 == 1) {
						local38 = local58.gUTF8(1319692524);
					}
				}
				local50.method728(-1482521954);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method24858(local174, true, (byte) -57)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class133.aStringArray16.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class676.aStringArray34.length; local209++) {
					@Pc(235) File local235 = new File(Class676.aStringArray34[local209] + Class133.aStringArray16[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method24858(new File(local235, "test.dat"), true, (byte) -31)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class485.aString216 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local174, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method24854(new File(local36), null, -1497248091);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sk", name = "bh", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 225)
	File method24850(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		aFile2 = new File(Class485.aString216, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (aFile2.exists()) {
			try {
				@Pc(50) Class38 local50 = new Class38(aFile2, "rw", 10000L);
				@Pc(58) Packet local58 = new Packet((int) local50.method732(1851298646));
				@Pc(84) int local84;
				while (local58.pos * 212851357 < local58.data.length) {
					local84 = local50.method734(local58.data, local58.pos * 212851357, local58.data.length - local58.pos * 212851357, (byte) 9);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.pos += local84 * -1445626955;
				}
				local58.pos = 0;
				local84 = local58.g1((short) 16384);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.g1((short) 16384);
				}
				if (local84 <= 2) {
					local36 = local58.gjstr2(-954973916);
					if (local127 == 1) {
						local38 = local58.gjstr2(-914566597);
					}
				} else {
					local36 = local58.gUTF8(-2049293466);
					if (local127 == 1) {
						local38 = local58.gUTF8(1078310015);
					}
				}
				local50.method728(-1215743722);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method24858(local174, true, (byte) -4)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class133.aStringArray16.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class676.aStringArray34.length; local209++) {
					@Pc(235) File local235 = new File(Class676.aStringArray34[local209] + Class133.aStringArray16[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method24858(new File(local235, "test.dat"), true, (byte) -66)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class485.aString216 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local174, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method24854(new File(local36), null, -1497248091);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sk", name = "bk", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 225)
	File method24851(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		aFile2 = new File(Class485.aString216, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (aFile2.exists()) {
			try {
				@Pc(50) Class38 local50 = new Class38(aFile2, "rw", 10000L);
				@Pc(58) Packet local58 = new Packet((int) local50.method732(1387314695));
				@Pc(84) int local84;
				while (local58.pos * 212851357 < local58.data.length) {
					local84 = local50.method734(local58.data, local58.pos * 212851357, local58.data.length - local58.pos * 212851357, (byte) 53);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.pos += local84 * -1445626955;
				}
				local58.pos = 0;
				local84 = local58.g1((short) 16384);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.g1((short) 16384);
				}
				if (local84 <= 2) {
					local36 = local58.gjstr2(490795334);
					if (local127 == 1) {
						local38 = local58.gjstr2(368323162);
					}
				} else {
					local36 = local58.gUTF8(-139136361);
					if (local127 == 1) {
						local38 = local58.gUTF8(496690280);
					}
				}
				local50.method728(33957482);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method24858(local174, true, (byte) -114)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class133.aStringArray16.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class676.aStringArray34.length; local209++) {
					@Pc(235) File local235 = new File(Class676.aStringArray34[local209] + Class133.aStringArray16[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method24858(new File(local235, "test.dat"), true, (byte) -5)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class485.aString216 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local174, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method24854(new File(local36), null, -1497248091);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sk", name = "bd", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 225)
	File method24852(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		aFile2 = new File(Class485.aString216, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (aFile2.exists()) {
			try {
				@Pc(50) Class38 local50 = new Class38(aFile2, "rw", 10000L);
				@Pc(58) Packet local58 = new Packet((int) local50.method732(1154194021));
				@Pc(84) int local84;
				while (local58.pos * 212851357 < local58.data.length) {
					local84 = local50.method734(local58.data, local58.pos * 212851357, local58.data.length - local58.pos * 212851357, (byte) -67);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.pos += local84 * -1445626955;
				}
				local58.pos = 0;
				local84 = local58.g1((short) 16384);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.g1((short) 16384);
				}
				if (local84 <= 2) {
					local36 = local58.gjstr2(1036988259);
					if (local127 == 1) {
						local38 = local58.gjstr2(1821938129);
					}
				} else {
					local36 = local58.gUTF8(612036406);
					if (local127 == 1) {
						local38 = local58.gUTF8(1946811762);
					}
				}
				local50.method728(-704935415);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method24858(local174, true, (byte) -68)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class133.aStringArray16.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class676.aStringArray34.length; local209++) {
					@Pc(235) File local235 = new File(Class676.aStringArray34[local209] + Class133.aStringArray16[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method24858(new File(local235, "test.dat"), true, (byte) -44)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class485.aString216 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local174, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method24854(new File(local36), null, -1497248091);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sk", name = "bx", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 225)
	File method24853(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		aFile2 = new File(Class485.aString216, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (aFile2.exists()) {
			try {
				@Pc(50) Class38 local50 = new Class38(aFile2, "rw", 10000L);
				@Pc(58) Packet local58 = new Packet((int) local50.method732(1265194522));
				@Pc(84) int local84;
				while (local58.pos * 212851357 < local58.data.length) {
					local84 = local50.method734(local58.data, local58.pos * 212851357, local58.data.length - local58.pos * 212851357, (byte) -26);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.pos += local84 * -1445626955;
				}
				local58.pos = 0;
				local84 = local58.g1((short) 16384);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.g1((short) 16384);
				}
				if (local84 <= 2) {
					local36 = local58.gjstr2(1569283594);
					if (local127 == 1) {
						local38 = local58.gjstr2(-213334342);
					}
				} else {
					local36 = local58.gUTF8(757385102);
					if (local127 == 1) {
						local38 = local58.gUTF8(321840681);
					}
				}
				local50.method728(871620613);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method24858(local174, true, (byte) -98)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class133.aStringArray16.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class676.aStringArray34.length; local209++) {
					@Pc(235) File local235 = new File(Class676.aStringArray34[local209] + Class133.aStringArray16[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method24858(new File(local235, "test.dat"), true, (byte) -118)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class485.aString216 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local174, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method24854(new File(local36), null, -1497248091);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "(Ljava/io/File;Ljava/io/File;I)V", line = 318)
	void method24854(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class38 local6 = new Class38(aFile2, "rw", 10000L);
			@Pc(11) Packet local11 = new Packet(500);
			local11.p1(3, (byte) -88);
			local11.p1(arg1 == null ? 0 : 1, (byte) -102);
			local11.pUTF8(arg0.getPath(), -1489303680);
			if (arg1 != null) {
				local11.pUTF8(arg1.getPath(), -1489303680);
			}
			local6.method725(local11.data, 0, local11.pos * 212851357, 1989108324);
			local6.method728(-857072319);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sk", name = "bn", descriptor = "(Ljava/io/File;Ljava/io/File;)V", line = 318)
	void method24855(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class38 local6 = new Class38(aFile2, "rw", 10000L);
			@Pc(11) Packet local11 = new Packet(500);
			local11.p1(3, (byte) -83);
			local11.p1(arg1 == null ? 0 : 1, (byte) -56);
			local11.pUTF8(arg0.getPath(), -1489303680);
			if (arg1 != null) {
				local11.pUTF8(arg1.getPath(), -1489303680);
			}
			local6.method725(local11.data, 0, local11.pos * 212851357, 894179715);
			local6.method728(976031218);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sk", name = "bi", descriptor = "(Ljava/io/File;Ljava/io/File;)V", line = 318)
	void method24856(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class38 local6 = new Class38(aFile2, "rw", 10000L);
			@Pc(11) Packet local11 = new Packet(500);
			local11.p1(3, (byte) -6);
			local11.p1(arg1 == null ? 0 : 1, (byte) -118);
			local11.pUTF8(arg0.getPath(), -1489303680);
			if (arg1 != null) {
				local11.pUTF8(arg1.getPath(), -1489303680);
			}
			local6.method725(local11.data, 0, local11.pos * 212851357, -1708741302);
			local6.method728(-457505000);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sk", name = "bc", descriptor = "(Ljava/io/File;Ljava/io/File;)V", line = 318)
	void method24857(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class38 local6 = new Class38(aFile2, "rw", 10000L);
			@Pc(11) Packet local11 = new Packet(500);
			local11.p1(3, (byte) -36);
			local11.p1(arg1 == null ? 0 : 1, (byte) -7);
			local11.pUTF8(arg0.getPath(), -1489303680);
			if (arg1 != null) {
				local11.pUTF8(arg1.getPath(), -1489303680);
			}
			local6.method725(local11.data, 0, local11.pos * 212851357, -1272482105);
			local6.method728(257370419);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(Ljava/io/File;ZB)Z", line = 334)
	boolean method24858(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "bt", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abl;", line = 353)
	public static Class38 method24859(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class564.aFile4, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class38(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class366.anInt4584 * -1839644543 == 33) {
			local29 = "_rc";
		} else if (Class366.anInt4584 * -1839644543 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class485.aString216, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class38(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class38(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sk", name = "bq", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abl;", line = 353)
	public static Class38 method24860(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class564.aFile4, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class38(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class366.anInt4584 * -1839644543 == 33) {
			local29 = "_rc";
		} else if (Class366.anInt4584 * -1839644543 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class485.aString216, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class38(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class38(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sk", name = "bm", descriptor = "()V", line = 382)
	static void method24861() {
		try {
			@Pc(5) File local5 = new File(Class485.aString216, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass42_4 = new Class42(new Class38(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class133.aStringArray16.length; local23++) {
					for (local29 = 0; local29 < Class676.aStringArray34.length; local29++) {
						@Pc(53) File local53 = new File(Class676.aStringArray34[local29] + Class133.aStringArray16[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass42_4 = new Class42(new Class38(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass42_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				aClass42_4 = new Class42(new Class38(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "bb", descriptor = "(Lclient!alw;)V", line = 411)
	public static void method24862(@OriginalArg(0) Packet arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass42_4.method819(0L);
			aClass42_4.method825(local2, -1632071155);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.pdata(local2, 0, 24, 2026842986);
	}

	@OriginalMember(owner = "client!sk", name = "be", descriptor = "(Lclient!alw;I)V", line = 428)
	static void method24863(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (aClass42_4 == null) {
			return;
		}
		try {
			aClass42_4.method819(0L);
			aClass42_4.method835(arg0.data, arg1, 24, 1992282413);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "by", descriptor = "(Lclient!alw;I)V", line = 428)
	static void method24864(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (aClass42_4 == null) {
			return;
		}
		try {
			aClass42_4.method819(0L);
			aClass42_4.method835(arg0.data, arg1, 24, 1612784751);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(Ljava/lang/String;B)V", line = 438)
	synchronized void method24865(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		Class628.aFrame2 = new Frame();
		Class628.aFrame2.setTitle(arg0);
		Class628.aFrame2.setResizable(true);
		Class628.aFrame2.addWindowListener(this);
		Class628.aFrame2.setBackground(Color.black);
		Class628.aFrame2.setVisible(true);
		Class628.aFrame2.toFront();
		@Pc(23) Insets local23 = Class628.aFrame2.getInsets();
		Class628.aFrame2.setSize(anInt3413 * -108363597 + local23.left + local23.right, local23.bottom + local23.top + Class504.anInt5201 * 2090134413);
	}

	@OriginalMember(owner = "client!sk", name = "bu", descriptor = "(Ljava/lang/String;)V", line = 438)
	synchronized void method24866(@OriginalArg(0) String arg0) {
		Class628.aFrame2 = new Frame();
		Class628.aFrame2.setTitle(arg0);
		Class628.aFrame2.setResizable(true);
		Class628.aFrame2.addWindowListener(this);
		Class628.aFrame2.setBackground(Color.black);
		Class628.aFrame2.setVisible(true);
		Class628.aFrame2.toFront();
		@Pc(23) Insets local23 = Class628.aFrame2.getInsets();
		Class628.aFrame2.setSize(anInt3413 * -108363597 + local23.left + local23.right, local23.bottom + local23.top + Class504.anInt5201 * 2090134413);
	}

	@OriginalMember(owner = "client!sk", name = "bw", descriptor = "(Ljava/lang/String;)V", line = 438)
	synchronized void method24867(@OriginalArg(0) String arg0) {
		Class628.aFrame2 = new Frame();
		Class628.aFrame2.setTitle(arg0);
		Class628.aFrame2.setResizable(true);
		Class628.aFrame2.addWindowListener(this);
		Class628.aFrame2.setBackground(Color.black);
		Class628.aFrame2.setVisible(true);
		Class628.aFrame2.toFront();
		@Pc(23) Insets local23 = Class628.aFrame2.getInsets();
		Class628.aFrame2.setSize(anInt3413 * -108363597 + local23.left + local23.right, local23.bottom + local23.top + Class504.anInt5201 * 2090134413);
	}

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "(I)V", line = 450)
	synchronized void method24868(@OriginalArg(0) int arg0) {
		this.method24876(-1978270461);
		@Pc(5) Container local5 = Class504.method30196(-283088421);
		Class125_Sub3.aCanvas1 = new Canvas_Sub1(local5);
		this.method24875(local5, 1220248857);
	}

	@OriginalMember(owner = "client!sk", name = "bz", descriptor = "()Ljava/awt/Container;", line = 457)
	public static Container method24869() {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.applet : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "br", descriptor = "()Ljava/awt/Container;", line = 457)
	public static Container method24870() {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.applet : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "bv", descriptor = "()Ljava/awt/Container;", line = 457)
	public static Container method24871() {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.applet : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "bo", descriptor = "()Ljava/awt/Container;", line = 457)
	public static Container method24872() {
		if (Class125_Sub2_Sub1.aFrame1 == null) {
			return Class628.aFrame2 == null ? Class32_Sub10.applet : Class628.aFrame2;
		} else {
			return Class125_Sub2_Sub1.aFrame1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "ba", descriptor = "(Ljava/awt/Container;)V", line = 463)
	void method24873(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class125_Sub3.aCanvas1);
		Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
		Class125_Sub3.aCanvas1.setVisible(true);
		if (Class628.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class628.aFrame2.getInsets();
			Class125_Sub3.aCanvas1.setLocation(local26.left + anInt3414 * 495533241, local26.top + anInt3415 * -1074927711);
		} else {
			Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
		}
		Class125_Sub3.aCanvas1.addFocusListener(this);
		Class125_Sub3.aCanvas1.requestFocus();
		Class20.aBoolean10 = true;
		aBoolean589 = true;
		Class125_Sub3.aCanvas1.setFocusTraversalKeysEnabled(false);
		aBoolean586 = true;
		aBoolean590 = false;
		aLong239 = Class305.method26797(1033826531) * -4981684860522027511L;
	}

	@OriginalMember(owner = "client!sk", name = "bg", descriptor = "(Ljava/awt/Container;)V", line = 463)
	void method24874(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class125_Sub3.aCanvas1);
		Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
		Class125_Sub3.aCanvas1.setVisible(true);
		if (Class628.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class628.aFrame2.getInsets();
			Class125_Sub3.aCanvas1.setLocation(local26.left + anInt3414 * 495533241, local26.top + anInt3415 * -1074927711);
		} else {
			Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
		}
		Class125_Sub3.aCanvas1.addFocusListener(this);
		Class125_Sub3.aCanvas1.requestFocus();
		Class20.aBoolean10 = true;
		aBoolean589 = true;
		Class125_Sub3.aCanvas1.setFocusTraversalKeysEnabled(false);
		aBoolean586 = true;
		aBoolean590 = false;
		aLong239 = Class305.method26797(1219722229) * -4981684860522027511L;
	}

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "(Ljava/awt/Container;I)V", line = 463)
	void method24875(@OriginalArg(0) Container arg0, @OriginalArg(1) int arg1) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class125_Sub3.aCanvas1);
		Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
		Class125_Sub3.aCanvas1.setVisible(true);
		if (Class628.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class628.aFrame2.getInsets();
			Class125_Sub3.aCanvas1.setLocation(local26.left + anInt3414 * 495533241, local26.top + anInt3415 * -1074927711);
		} else {
			Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
		}
		Class125_Sub3.aCanvas1.addFocusListener(this);
		Class125_Sub3.aCanvas1.requestFocus();
		Class20.aBoolean10 = true;
		aBoolean589 = true;
		Class125_Sub3.aCanvas1.setFocusTraversalKeysEnabled(false);
		aBoolean586 = true;
		aBoolean590 = false;
		aLong239 = Class305.method26797(-275359244) * -4981684860522027511L;
	}

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "(I)V", line = 484)
	void method24876(@OriginalArg(0) int arg0) {
		if (Class125_Sub3.aCanvas1 != null) {
			Class125_Sub3.aCanvas1.removeFocusListener(this);
			Class125_Sub3.aCanvas1.getParent().setBackground(Color.black);
			Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!sk", name = "bp", descriptor = "()V", line = 484)
	void method24877() {
		if (Class125_Sub3.aCanvas1 != null) {
			Class125_Sub3.aCanvas1.removeFocusListener(this);
			Class125_Sub3.aCanvas1.getParent().setBackground(Color.black);
			Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!sk", name = "bj", descriptor = "()V", line = 484)
	void method24878() {
		if (Class125_Sub3.aCanvas1 != null) {
			Class125_Sub3.aCanvas1.removeFocusListener(this);
			Class125_Sub3.aCanvas1.getParent().setBackground(Color.black);
			Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z", line = 492)
	final boolean method24879(@OriginalArg(0) int arg0) {
        if (!client.ENABLE_HOST_CHECK) {
            return true;
        }

		@Pc(4) String local4 = Class32_Sub10.applet.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.equals("stellardawn.com") || local4.endsWith(".stellardawn.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method24929("invalidhost", -1177588208);
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "run", descriptor = "()V", line = 506)
	@Override
	public void run() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method24884(1286359357);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class646.method32608(this.method24898((byte) 112), local11, 552130837);
				this.method24929("crash", -684708272);
				var6 = false;
			} finally {
				if (var6) {
					this.method24901(true, -266556112);
				}
			}
			this.method24901(true, -1353705725);
			return;
		}
		this.method24901(true, -2097600644);
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "()V", line = 506)
	public void method24880() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method24884(709894690);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class646.method32608(this.method24898((byte) 69), local11, 932771544);
				this.method24929("crash", -2040856707);
				var6 = false;
			} finally {
				if (var6) {
					this.method24901(true, -1014019599);
				}
			}
			this.method24901(true, 326649974);
			return;
		}
		this.method24901(true, -512812427);
	}

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "()V", line = 506)
	public void method24881() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method24884(1546186898);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class646.method32608(this.method24898((byte) 92), local11, 258427659);
				this.method24929("crash", -584675640);
				var6 = false;
			} finally {
				if (var6) {
					this.method24901(true, 211633769);
				}
			}
			this.method24901(true, -275160914);
			return;
		}
		this.method24901(true, -1076171819);
	}

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "()V", line = 506)
	public void method24882() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method24884(76237799);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class646.method32608(this.method24898((byte) 65), local11, 661422765);
				this.method24929("crash", -582446019);
				var6 = false;
			} finally {
				if (var6) {
					this.method24901(true, -1331069602);
				}
			}
			this.method24901(true, -216665316);
			return;
		}
		this.method24901(true, -1507795961);
	}

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "()V", line = 506)
	public void method24883() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method24884(1225712396);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class646.method32608(this.method24898((byte) 96), local11, 1212936138);
				this.method24929("crash", -772458594);
				var6 = false;
			} finally {
				if (var6) {
					this.method24901(true, -1699987452);
				}
			}
			this.method24901(true, -377334594);
			return;
		}
		this.method24901(true, 241226325);
	}

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V", line = 522)
	void method24884(@OriginalArg(0) int arg0) {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", -44089755);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", 660211670);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(1344353626);
		aClass147_2 = Class450.method28933(984252925);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(778989178) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) -19);
			}
			this.method24893(787203204);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "cl", descriptor = "()V", line = 522)
	void method24885() {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", -1965439405);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", 1364960903);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(1791314116);
		aClass147_2 = Class450.method28933(-652952171);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(-262068893) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) -24);
			}
			this.method24893(-171033447);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "cg", descriptor = "()V", line = 522)
	void method24886() {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", 1169828676);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", 1191446614);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(184891866);
		aClass147_2 = Class450.method28933(1469083926);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(1516693151) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) -95);
			}
			this.method24893(778132536);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "cu", descriptor = "()V", line = 522)
	void method24887() {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", 1619997299);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", 58034280);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(1509528789);
		aClass147_2 = Class450.method28933(2065172053);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(1972040643) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) -79);
			}
			this.method24893(1419382199);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "bs", descriptor = "()V", line = 522)
	void method24888() {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", 1979615946);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", -519295078);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(-100444539);
		aClass147_2 = Class450.method28933(-1514142770);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(1347965270) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) 42);
			}
			this.method24893(2058044390);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "ce", descriptor = "()V", line = 522)
	void method24889() {
		if (Class392.aString197 != null) {
			@Pc(5) String local5 = Class392.aString197.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class95.aString12;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24929("wrongjava", -313025265);
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class498.method30134(local17.charAt(local72), (byte) 1); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class633.method32304(local89, 250407149) && Class616.method32090(local89, (byte) 8) < 10) {
						this.method24929("wrongjava", 1128403157);
						return;
					}
				}
			}
		}
		Class504.method30196(-283088421).setFocusCycleRoot(true);
		anInt3419 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2060182503;
		anInt3422 = Runtime.getRuntime().availableProcessors() * -1401201395;
		this.method24868(-1483631858);
		this.method24940(-273589671);
		aClass147_2 = Class450.method28933(688839595);
		while (aLong241 * -8807787511991959949L == 0L || Class305.method26797(933605808) < aLong241 * -8807787511991959949L) {
			anInt3423 = aClass147_2.method12686(aLong238 * 3394915126462843437L) * -709089635;
			for (@Pc(154) int local154 = 0; local154 < anInt3423 * 970166197; local154++) {
				this.method24890((byte) -64);
			}
			this.method24893(1116521221);
			Class256.method26013(Class125_Sub3.aCanvas1, 165759862);
		}
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)V", line = 565)
	void method24890(@OriginalArg(0) byte arg0) {
		@Pc(2) long local2 = Class305.method26797(826221803);
		@Pc(8) long local8 = aLongArray22[anInt3409 * 950088787];
		aLongArray22[anInt3409 * 950088787] = local2;
		anInt3409 = (anInt3409 * 950088787 + 1 & 0x1F) * -185651237;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class20.aBoolean10 = aBoolean589;
		}
		this.method24941(-263225392);
	}

	@OriginalMember(owner = "client!sk", name = "ci", descriptor = "()V", line = 565)
	void method24891() {
		@Pc(2) long local2 = Class305.method26797(-399227516);
		@Pc(8) long local8 = aLongArray22[anInt3409 * 950088787];
		aLongArray22[anInt3409 * 950088787] = local2;
		anInt3409 = (anInt3409 * 950088787 + 1 & 0x1F) * -185651237;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class20.aBoolean10 = aBoolean589;
		}
		this.method24941(-263225392);
	}

	@OriginalMember(owner = "client!sk", name = "cn", descriptor = "()V", line = 565)
	void method24892() {
		@Pc(2) long local2 = Class305.method26797(815538933);
		@Pc(8) long local8 = aLongArray22[anInt3409 * 950088787];
		aLongArray22[anInt3409 * 950088787] = local2;
		anInt3409 = (anInt3409 * 950088787 + 1 & 0x1F) * -185651237;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class20.aBoolean10 = aBoolean589;
		}
		this.method24941(-263225392);
	}

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "(I)V", line = 577)
	void method24893(@OriginalArg(0) int arg0) {
		@Pc(2) long local2 = Class305.method26797(1511073804);
		@Pc(12) long local12 = aLongArray21[anInt3411 * -1288987007 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[anInt3411 * -1288987007];
		aLongArray21[anInt3411 * -1288987007] = local2;
		anInt3411 = (anInt3411 * -1288987007 + 1 & 0x1F) * -1990811263;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3417 = (int) (local2 - local12) * 406073307;
			anInt3407 = ((local47 >> 1) + 32000) / local47 * -332499549;
		}
		if ((anInt3418 += 1670111301) * -133680499 - 1 > 50) {
			anInt3418 -= 1901186426;
			aBoolean586 = true;
			Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
			Class125_Sub3.aCanvas1.setVisible(true);
			if (Class628.aFrame2 != null && Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(101) Insets local101 = Class628.aFrame2.getInsets();
				Class125_Sub3.aCanvas1.setLocation(local101.left + anInt3414 * 495533241, anInt3415 * -1074927711 + local101.top);
			} else {
				Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
			}
		}
		this.method24942(1943259820);
	}

	@OriginalMember(owner = "client!sk", name = "cv", descriptor = "()V", line = 577)
	void method24894() {
		@Pc(2) long local2 = Class305.method26797(692459437);
		@Pc(12) long local12 = aLongArray21[anInt3411 * -1288987007 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[anInt3411 * -1288987007];
		aLongArray21[anInt3411 * -1288987007] = local2;
		anInt3411 = (anInt3411 * -1288987007 + 1 & 0x1F) * -1990811263;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3417 = (int) (local2 - local12) * 406073307;
			anInt3407 = ((local47 >> 1) + 32000) / local47 * -332499549;
		}
		if ((anInt3418 += 1670111301) * -133680499 - 1 > 50) {
			anInt3418 -= 1901186426;
			aBoolean586 = true;
			Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
			Class125_Sub3.aCanvas1.setVisible(true);
			if (Class628.aFrame2 != null && Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(101) Insets local101 = Class628.aFrame2.getInsets();
				Class125_Sub3.aCanvas1.setLocation(local101.left + anInt3414 * 495533241, anInt3415 * -1074927711 + local101.top);
			} else {
				Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
			}
		}
		this.method24942(1943259820);
	}

	@OriginalMember(owner = "client!sk", name = "cp", descriptor = "()V", line = 577)
	void method24895() {
		@Pc(2) long local2 = Class305.method26797(-169016978);
		@Pc(12) long local12 = aLongArray21[anInt3411 * -1288987007 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[anInt3411 * -1288987007];
		aLongArray21[anInt3411 * -1288987007] = local2;
		anInt3411 = (anInt3411 * -1288987007 + 1 & 0x1F) * -1990811263;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3417 = (int) (local2 - local12) * 406073307;
			anInt3407 = ((local47 >> 1) + 32000) / local47 * -332499549;
		}
		if ((anInt3418 += 1670111301) * -133680499 - 1 > 50) {
			anInt3418 -= 1901186426;
			aBoolean586 = true;
			Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
			Class125_Sub3.aCanvas1.setVisible(true);
			if (Class628.aFrame2 != null && Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(101) Insets local101 = Class628.aFrame2.getInsets();
				Class125_Sub3.aCanvas1.setLocation(local101.left + anInt3414 * 495533241, anInt3415 * -1074927711 + local101.top);
			} else {
				Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
			}
		}
		this.method24942(1943259820);
	}

	@OriginalMember(owner = "client!sk", name = "ca", descriptor = "()V", line = 577)
	void method24896() {
		@Pc(2) long local2 = Class305.method26797(428472719);
		@Pc(12) long local12 = aLongArray21[anInt3411 * -1288987007 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[anInt3411 * -1288987007];
		aLongArray21[anInt3411 * -1288987007] = local2;
		anInt3411 = (anInt3411 * -1288987007 + 1 & 0x1F) * -1990811263;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3417 = (int) (local2 - local12) * 406073307;
			anInt3407 = ((local47 >> 1) + 32000) / local47 * -332499549;
		}
		if ((anInt3418 += 1670111301) * -133680499 - 1 > 50) {
			anInt3418 -= 1901186426;
			aBoolean586 = true;
			Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
			Class125_Sub3.aCanvas1.setVisible(true);
			if (Class628.aFrame2 != null && Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(101) Insets local101 = Class628.aFrame2.getInsets();
				Class125_Sub3.aCanvas1.setLocation(local101.left + anInt3414 * 495533241, anInt3415 * -1074927711 + local101.top);
			} else {
				Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
			}
		}
		this.method24942(1943259820);
	}

	@OriginalMember(owner = "client!sk", name = "cx", descriptor = "()V", line = 577)
	void method24897() {
		@Pc(2) long local2 = Class305.method26797(1515076156);
		@Pc(12) long local12 = aLongArray21[anInt3411 * -1288987007 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[anInt3411 * -1288987007];
		aLongArray21[anInt3411 * -1288987007] = local2;
		anInt3411 = (anInt3411 * -1288987007 + 1 & 0x1F) * -1990811263;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3417 = (int) (local2 - local12) * 406073307;
			anInt3407 = ((local47 >> 1) + 32000) / local47 * -332499549;
		}
		if ((anInt3418 += 1670111301) * -133680499 - 1 > 50) {
			anInt3418 -= 1901186426;
			aBoolean586 = true;
			Class125_Sub3.aCanvas1.setSize(width * -1378711501, height * 2091353777);
			Class125_Sub3.aCanvas1.setVisible(true);
			if (Class628.aFrame2 != null && Class125_Sub2_Sub1.aFrame1 == null) {
				@Pc(101) Insets local101 = Class628.aFrame2.getInsets();
				Class125_Sub3.aCanvas1.setLocation(local101.left + anInt3414 * 495533241, anInt3415 * -1074927711 + local101.top);
			} else {
				Class125_Sub3.aCanvas1.setLocation(anInt3414 * 495533241, anInt3415 * -1074927711);
			}
		}
		this.method24942(1943259820);
	}

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "(B)Ljava/lang/String;", line = 602)
	String method24898(@OriginalArg(0) byte arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "az", descriptor = "()Ljava/lang/String;", line = 602)
	String method24899() {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "aa", descriptor = "()Ljava/lang/String;", line = 602)
	String method24900() {
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "(ZI)V", line = 606)
	final void method24901(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		synchronized (this) {
			if (aBoolean591) {
				return;
			}
			aBoolean591 = true;
		}
		try {
			this.method24943((byte) -103);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass42_5.method818(1216916480);
			for (@Pc(28) int local28 = 0; local28 < Class177.anInt3312 * 694777127; local28++) {
				Class623.aClass42Array1[local28].method818(1216916480);
			}
			aClass42_6.method818(1216916480);
			aClass42_4.method818(1216916480);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean587) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class10.method159(628717055)) {
			Class376.method28043(672839876).method31624(-998187544);
		}
		if (Class125_Sub3.aCanvas1 != null) {
			try {
				Class125_Sub3.aCanvas1.removeFocusListener(this);
				Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Class628.aFrame2 != null) {
			Class628.aFrame2.setVisible(false);
			Class628.aFrame2.dispose();
			Class628.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "ct", descriptor = "(Z)V", line = 606)
	final void method24902(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (aBoolean591) {
				return;
			}
			aBoolean591 = true;
		}
		try {
			this.method24943((byte) -4);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass42_5.method818(1216916480);
			for (@Pc(28) int local28 = 0; local28 < Class177.anInt3312 * 694777127; local28++) {
				Class623.aClass42Array1[local28].method818(1216916480);
			}
			aClass42_6.method818(1216916480);
			aClass42_4.method818(1216916480);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean587) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class10.method159(1573015288)) {
			Class376.method28043(672839876).method31624(-1000571758);
		}
		if (Class125_Sub3.aCanvas1 != null) {
			try {
				Class125_Sub3.aCanvas1.removeFocusListener(this);
				Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Class628.aFrame2 != null) {
			Class628.aFrame2.setVisible(false);
			Class628.aFrame2.dispose();
			Class628.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cf", descriptor = "(Z)V", line = 606)
	final void method24903(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (aBoolean591) {
				return;
			}
			aBoolean591 = true;
		}
		try {
			this.method24943((byte) -68);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass42_5.method818(1216916480);
			for (@Pc(28) int local28 = 0; local28 < Class177.anInt3312 * 694777127; local28++) {
				Class623.aClass42Array1[local28].method818(1216916480);
			}
			aClass42_6.method818(1216916480);
			aClass42_4.method818(1216916480);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean587) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class10.method159(237690969)) {
			Class376.method28043(672839876).method31624(-1046733038);
		}
		if (Class125_Sub3.aCanvas1 != null) {
			try {
				Class125_Sub3.aCanvas1.removeFocusListener(this);
				Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Class628.aFrame2 != null) {
			Class628.aFrame2.setVisible(false);
			Class628.aFrame2.dispose();
			Class628.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cw", descriptor = "(Z)V", line = 606)
	final void method24904(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (aBoolean591) {
				return;
			}
			aBoolean591 = true;
		}
		try {
			this.method24943((byte) -101);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass42_5.method818(1216916480);
			for (@Pc(28) int local28 = 0; local28 < Class177.anInt3312 * 694777127; local28++) {
				Class623.aClass42Array1[local28].method818(1216916480);
			}
			aClass42_6.method818(1216916480);
			aClass42_4.method818(1216916480);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean587) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class10.method159(492037067)) {
			Class376.method28043(672839876).method31624(-1575976234);
		}
		if (Class125_Sub3.aCanvas1 != null) {
			try {
				Class125_Sub3.aCanvas1.removeFocusListener(this);
				Class125_Sub3.aCanvas1.getParent().remove(Class125_Sub3.aCanvas1);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Class628.aFrame2 != null) {
			Class628.aFrame2.setVisible(false);
			Class628.aFrame2.dispose();
			Class628.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "co", descriptor = "()I", line = 645)
	public static final int method24905() {
		return (int) (1000000000L / (aLong238 * 3394915126462843437L));
	}

	@OriginalMember(owner = "client!sk", name = "cr", descriptor = "()V", line = 649)
	public static final void method24906() {
		aClass147_2.method12691((byte) -26);
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray21[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray22[local4] = 0L;
		}
		anInt3423 = 0;
	}

	@OriginalMember(owner = "client!sk", name = "cq", descriptor = "()J", line = 656)
	static long method24907() {
		return aClass147_2.method12705(1528120999);
	}

	@OriginalMember(owner = "client!sk", name = "cm", descriptor = "()J", line = 656)
	static long method24908() {
		return aClass147_2.method12705(1943217329);
	}

	@OriginalMember(owner = "client!sk", name = "ch", descriptor = "()J", line = 656)
	static long method24909() {
		return aClass147_2.method12705(2046501842);
	}

	@OriginalMember(owner = "client!sk", name = "start", descriptor = "()V", line = 660)
	@Override
	public void start() {
		if (!aBoolean591) {
			aLong241 = 0L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "stop", descriptor = "()V", line = 665)
	@Override
	public void stop() {
		if (!aBoolean591) {
			aLong241 = (Class305.method26797(1835689683) + 4000L) * -992610302756464965L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cs", descriptor = "()V", line = 665)
	@Override
	public void method24835() {
		if (!aBoolean591) {
			aLong241 = (Class305.method26797(1220090424) + 4000L) * -992610302756464965L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cb", descriptor = "()V", line = 665)
	@Override
	public void method24834() {
		if (!aBoolean591) {
			aLong241 = (Class305.method26797(2091017695) + 4000L) * -992610302756464965L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cy", descriptor = "()V", line = 665)
	@Override
	public void method24836() {
		if (!aBoolean591) {
			aLong241 = (Class305.method26797(766378930) + 4000L) * -992610302756464965L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "cc", descriptor = "()V", line = 665)
	@Override
	public void method24837() {
		if (!aBoolean591) {
			aLong241 = (Class305.method26797(1594748392) + 4000L) * -992610302756464965L;
		}
	}

	@OriginalMember(owner = "client!sk", name = "destroy", descriptor = "()V", line = 670)
	@Override
	public void destroy() {
		if (!aBoolean591) {
			aLong241 = Class305.method26797(4543014) * -992610302756464965L;
			Class212.method25431(5000L);
			this.method24901(false, 242259386);
		}
	}

	@OriginalMember(owner = "client!sk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 677)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "cz", descriptor = "(Ljava/awt/Graphics;)V", line = 677)
	@Override
	public final void method24832(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (aBoolean591) {
			return;
		}
		aBoolean586 = true;
		if (Class305.method26797(322683967) - aLong239 * -8866144438303274951L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3413 * -108363597 && local16.height >= Class504.anInt5201 * 2090134413) {
				aBoolean590 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "ck", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
	@Override
	public final synchronized void method24838(@OriginalArg(0) Graphics arg0) {
		if (aBoolean591) {
			return;
		}
		aBoolean586 = true;
		if (Class305.method26797(648936748) - aLong239 * -8866144438303274951L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3413 * -108363597 && local16.height >= Class504.anInt5201 * 2090134413) {
				aBoolean590 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		aBoolean589 = true;
		aBoolean586 = true;
	}

	@OriginalMember(owner = "client!sk", name = "cj", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	public final void method24910(@OriginalArg(0) FocusEvent arg0) {
		aBoolean589 = true;
		aBoolean586 = true;
	}

	@OriginalMember(owner = "client!sk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		aBoolean589 = false;
	}

	@OriginalMember(owner = "client!sk", name = "dj", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	public final void method24911(@OriginalArg(0) FocusEvent arg0) {
		aBoolean589 = false;
	}

	@OriginalMember(owner = "client!sk", name = "de", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	public final void method24912(@OriginalArg(0) FocusEvent arg0) {
		aBoolean589 = false;
	}

	@OriginalMember(owner = "client!sk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 698)
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dr", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24913(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dd", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24914(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "cd", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24915(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "da", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24916(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dt", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24917(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 702)
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		aBoolean588 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!sk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "do", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24918(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dm", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24919(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dz", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24920(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dv", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24921(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dq", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	public final void method24922(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 708)
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dc", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 708)
	public final void method24923(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "di", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	public final void method24924(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "dl", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 718)
	public static final void method24925(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class125_Sub3.aCanvas1.getGraphics();
			if (Class68.aFont1 == null) {
				Class68.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			@Pc(83) int local83;
			try {
				if (Class115.anImage3 == null) {
					Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(width * -1378711501, height * 2091353777);
				}
				@Pc(54) Graphics local54 = Class115.anImage3.getGraphics();
				local54.setColor(Color.black);
				local54.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local54.setColor(arg3);
				local54.drawRect(local75, local83, 303, 33);
				local54.setColor(arg2);
				local54.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(local75 + 1, local83 + 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2 + local75, local83 + 2, 300 - arg0 * 3, 30);
				local54.setFont(Class68.aFont1);
				local54.setColor(arg4);
				local54.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
				if (aString133 != null) {
					local54.setFont(Class68.aFont1);
					local54.setColor(arg4);
					local54.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawImage(Class115.anImage3, 0, 0, null);
			} catch (@Pc(200) Exception local200) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local75, local83, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local75 + 1, local83 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local75 + 2, local83 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class68.aFont1);
				local2.setColor(arg4);
				if (aString133 != null) {
					local2.setFont(Class68.aFont1);
					local2.setColor(arg4);
					local2.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
			}
		} catch (@Pc(338) Exception local338) {
			Class125_Sub3.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sk", name = "du", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 718)
	public static final void method24926(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class125_Sub3.aCanvas1.getGraphics();
			if (Class68.aFont1 == null) {
				Class68.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			@Pc(83) int local83;
			try {
				if (Class115.anImage3 == null) {
					Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(width * -1378711501, height * 2091353777);
				}
				@Pc(54) Graphics local54 = Class115.anImage3.getGraphics();
				local54.setColor(Color.black);
				local54.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local54.setColor(arg3);
				local54.drawRect(local75, local83, 303, 33);
				local54.setColor(arg2);
				local54.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(local75 + 1, local83 + 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2 + local75, local83 + 2, 300 - arg0 * 3, 30);
				local54.setFont(Class68.aFont1);
				local54.setColor(arg4);
				local54.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
				if (aString133 != null) {
					local54.setFont(Class68.aFont1);
					local54.setColor(arg4);
					local54.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawImage(Class115.anImage3, 0, 0, null);
			} catch (@Pc(200) Exception local200) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local75, local83, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local75 + 1, local83 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local75 + 2, local83 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class68.aFont1);
				local2.setColor(arg4);
				if (aString133 != null) {
					local2.setFont(Class68.aFont1);
					local2.setColor(arg4);
					local2.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
			}
		} catch (@Pc(338) Exception local338) {
			Class125_Sub3.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sk", name = "dp", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 718)
	public static final void method24927(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class125_Sub3.aCanvas1.getGraphics();
			if (Class68.aFont1 == null) {
				Class68.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			@Pc(83) int local83;
			try {
				if (Class115.anImage3 == null) {
					Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(width * -1378711501, height * 2091353777);
				}
				@Pc(54) Graphics local54 = Class115.anImage3.getGraphics();
				local54.setColor(Color.black);
				local54.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local54.setColor(arg3);
				local54.drawRect(local75, local83, 303, 33);
				local54.setColor(arg2);
				local54.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(local75 + 1, local83 + 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2 + local75, local83 + 2, 300 - arg0 * 3, 30);
				local54.setFont(Class68.aFont1);
				local54.setColor(arg4);
				local54.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
				if (aString133 != null) {
					local54.setFont(Class68.aFont1);
					local54.setColor(arg4);
					local54.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawImage(Class115.anImage3, 0, 0, null);
			} catch (@Pc(200) Exception local200) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, width * -1378711501, height * 2091353777);
				local75 = width * -1378711501 / 2 - 152;
				local83 = height * 2091353777 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local75, local83, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local75 + 1, local83 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local75 + 2, local83 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class68.aFont1);
				local2.setColor(arg4);
				if (aString133 != null) {
					local2.setFont(Class68.aFont1);
					local2.setColor(arg4);
					local2.drawString(aString133, width * -1378711501 / 2 - aString133.length() * 6 / 2, height * 2091353777 / 2 - 26);
				}
				local2.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
			}
		} catch (@Pc(338) Exception local338) {
			Class125_Sub3.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sk", name = "dy", descriptor = "()V", line = 777)
	public static final void method24928() {
		Class115.anImage3 = null;
		Class68.aFont1 = null;
	}

	@OriginalMember(owner = "client!sk", name = "ad", descriptor = "(Ljava/lang/String;I)V", line = 782)
	void method24929(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean592) {
			return;
		}
		this.aBoolean592 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class70.method1237(Class32_Sub10.applet, "loggedout", 1946669565);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "db", descriptor = "(Ljava/lang/String;)V", line = 782)
	void method24930(@OriginalArg(0) String arg0) {
		if (this.aBoolean592) {
			return;
		}
		this.aBoolean592 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class70.method1237(Class32_Sub10.applet, "loggedout", 2092136710);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "dh", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V", line = 796)
	void method24931(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean592) {
			return;
		}
		this.aBoolean592 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class70.method1237(Class32_Sub10.applet, "loggedout", 1622519257);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "am", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V", line = 796)
	void method24932(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (this.aBoolean592) {
			return;
		}
		this.aBoolean592 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class70.method1237(Class32_Sub10.applet, "loggedout", 2002709341);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class32_Sub10.applet.getAppletContext().showDocument(new URL(Class32_Sub10.applet.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "au", descriptor = "(B)V", line = 810)
	public void method24933(@OriginalArg(0) byte arg0) throws Exception_Sub1 {
		if (this.aBoolean587) {
			return;
		}
		Class376.method28043(672839876).method31617("jaclib", (byte) -43);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class339.aString179.startsWith("win")) {
				throw new Exception_Sub1(128, "jaclib");
			}
		}
		this.aBoolean587 = true;
	}

	@OriginalMember(owner = "client!sk", name = "dx", descriptor = "()V", line = 810)
	public void method24934() throws Exception_Sub1 {
		if (this.aBoolean587) {
			return;
		}
		Class376.method28043(672839876).method31617("jaclib", (byte) -87);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class339.aString179.startsWith("win")) {
				throw new Exception_Sub1(128, "jaclib");
			}
		}
		this.aBoolean587 = true;
	}

	@OriginalMember(owner = "client!sk", name = "ar", descriptor = "(Lclient!sm;ZI)V", line = 822)
	void method24935(@OriginalArg(0) Class555 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class555.aClass555_4 == arg0 || Class555.aClass555_3 == arg0) {
			aClass555_2 = arg0;
			if (Class555.aClass555_3 != aClass555_2 && arg1) {
				aClass555_2 = Class555.aClass555_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sk", name = "dg", descriptor = "()Lclient!sm;", line = 838)
	public static Class555 method24936() {
		return aClass555_2;
	}

	@OriginalMember(owner = "client!sk", name = "ea", descriptor = "(IIII)I", line = 917)
	public static int method24937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class159_Sub1.anInt1950 * -1574654625 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - Class159_Sub1.anInt1915;
		@Pc(18) int local18 = arg2 - Class159_Sub1.anInt1921;
		for (@Pc(23) Class93_Sub29 local23 = (Class93_Sub29) Class159_Sub1.aClass22_28.method428((byte) 84); local23 != null; local23 = (Class93_Sub29) Class159_Sub1.aClass22_28.method442(2131125755)) {
			if (arg0 == local23.anInt1603 * 1208139441) {
				@Pc(37) int local37 = local23.anInt1605 * 1012619213;
				@Pc(42) int local42 = local23.anInt1608 * -2087611449;
				@Pc(52) int local52 = Class159_Sub1.anInt1915 + local37 << 14 | Class159_Sub1.anInt1921 + local42;
				@Pc(68) int local68 = (local14 - local37) * (local14 - local37) + (local18 - local42) * (local18 - local42);
				if (local8 < 0 || local68 < local10) {
					local8 = local52;
					local10 = local68;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!sk", name = "wl", descriptor = "(Lclient!yf;I)V", line = 8989)
	static final void method24938(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1451722994;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4];
		@Pc(63) int local63 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5];
		@Pc(82) Class539 local82 = Class274.aClass258_1.method26097(Class275.aClass275_13, Class274.aClass258_1, local13, local23, local43, Class280.aClass280_7.method26450(-743817974), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local53, false, 96674096);
		if (local82 != null) {
			Class274.aClass258_1.method26049(local82, local63, local33, -895310388);
		}
	}

	@OriginalMember(owner = "client!sk", name = "ds", descriptor = "()V")
	abstract void method24939();

	@OriginalMember(owner = "client!sk", name = "al", descriptor = "(I)V")
	abstract void method24940(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sk", name = "ac", descriptor = "(I)V")
	abstract void method24941(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sk", name = "ai", descriptor = "(I)V")
	abstract void method24942(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sk", name = "aw", descriptor = "(B)V")
	abstract void method24943(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sk", name = "aq", descriptor = "()V")
	abstract void method24944();

	@OriginalMember(owner = "client!sk", name = "ax", descriptor = "()V")
	abstract void method24945();

	@OriginalMember(owner = "client!sk", name = "av", descriptor = "()V")
	abstract void method24946();

	@OriginalMember(owner = "client!sk", name = "ao", descriptor = "()V")
	abstract void method24947();

	@OriginalMember(owner = "client!sk", name = "ay", descriptor = "()V")
	abstract void method24948();

	@OriginalMember(owner = "client!sk", name = "dn", descriptor = "()V")
	public abstract void method24840();

	@OriginalMember(owner = "client!sk", name = "ab", descriptor = "()V")
	abstract void method24949();

	@OriginalMember(owner = "client!sk", name = "aj", descriptor = "()V")
	abstract void method24950();

	@OriginalMember(owner = "client!sk", name = "dw", descriptor = "()V")
	abstract void method24951();

	@OriginalMember(owner = "client!sk", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!sk", name = "dk", descriptor = "()V")
	public abstract void method24839();

	@OriginalMember(owner = "client!sk", name = "df", descriptor = "()V")
	abstract void method24952();
}