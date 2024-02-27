package com.jagex;

import java.awt.Canvas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoh")
public final class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!aoh", name = "g", descriptor = "I")
	static int anInt2393;

	@OriginalMember(owner = "client!aoh", name = "x", descriptor = "(Lclient!afg;Ljava/awt/Canvas;III)Lclient!aph;")
	static Class112_Sub2_Sub2 method16834(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class112_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aoh", name = "s", descriptor = "(Ljava/lang/String;ZZB)V")
	public static void method16835(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class314.method27032("commands - This command", -1900088902);
				Class314.method27032("cls - Clear console", -1841112835);
				Class314.method27032("displayfps - Toggle FPS and other information", -1895268900);
				Class314.method27032("renderer - Print graphics renderer information", -1953766099);
				Class314.method27032("heap - Print java memory information", -1865979398);
				Class314.method27032("getcamerapos - Print location and direction of camera for use in bug reports", -2030225708);
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Class168.anInt2442 = 0;
				Class168.anInt2446 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean601 = !client.aBoolean601;
				if (client.aBoolean601) {
					Class314.method27032("FPS on", -1945745401);
				} else {
					Class314.method27032("FPS off", -2144687054);
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class219 local62 = Class694.aClass104_14.method20583();
				Class314.method27032("Toolkit ID: " + Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 48), -1843390628);
				Class314.method27032("Vendor: " + local62.anInt3664 * -348611355, -2015277393);
				Class314.method27032("Name: " + local62.aString157, -1845268621);
				Class314.method27032("Version: " + local62.anInt3666 * -140508595, -2068008069);
				Class314.method27032("Device: " + local62.aString156, -1948953591);
				Class314.method27032("Driver Version: " + local62.aLong247 * -2731861378298283411L, -1848310793);
				local139 = Class694.aClass104_14.method20443();
				if (local139.length() > 0) {
					Class314.method27032(local139, -2103200917);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class314.method27032("Heap: " + Class553.anInt3419 * 1798078423 + "MB", -2035420207);
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class611 local173 = client.aClass532_1.method30624(1915714173);
				if (Class429.anInt4942 * -1453926679 == 3) {
					@Pc(182) Class472 local182 = Class65.aClass123_Sub1_2.method8957(1307905604);
					@Pc(186) Class472 local186 = Class65.aClass123_Sub1_2.method8954(1208611233);
					Class314.method27032("Pos: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local182.aFloat325 >> 9, (int) local182.aFloat327 >> 9)).toString() + " Height: " + (Class305.method26894((int) local182.aFloat325 - (local173.anInt5784 * 270611681 << 9), (int) local182.aFloat327 - (local173.anInt5785 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -48) + (int) local182.aFloat326), -1859342309);
					Class314.method27032("Look: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local186.aFloat325 >> 9, (int) local186.aFloat327 >> 9)).toString() + " Height: " + (Class305.method26894((int) local186.aFloat325 - (local173.anInt5784 * 270611681 << 9), (int) local182.aFloat327 - (local173.anInt5785 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -50) + (int) local182.aFloat326), -2086301014);
				} else {
					Class314.method27032("Pos: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5784 * 270611681 >> 6) + "," + (local173.anInt5785 * -1994307635 + (Class270.anInt3925 * 466086187 >> 9) >> 6) + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5784 * 270611681 & 0x3F) + "," + (local173.anInt5785 * -1994307635 + (Class270.anInt3925 * 466086187 >> 9) & 0x3F) + " Height: " + (Class305.method26894(Class163.anInt2002 * -1331168249, Class270.anInt3925 * 466086187, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -109) - Class130_Sub2.anInt1117 * 1055108289), -1954920897);
					Class314.method27032("Look: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + (Class545.anInt5450 * 904567799 + local173.anInt5784 * 270611681 >> 6) + "," + (Class349.anInt4242 * -1998384879 + local173.anInt5785 * -1994307635 >> 6) + "," + (Class545.anInt5450 * 904567799 + local173.anInt5784 * 270611681 & 0x3F) + "," + (local173.anInt5785 * -1994307635 + Class349.anInt4242 * -1998384879 & 0x3F) + " Height: " + (Class305.method26894(Class545.anInt5450 * 904567799, Class349.anInt4242 * -1998384879, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) -59) - Class290.anInt3952 * -1980774829), -1946169511);
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) 43), -2007416784);
			return;
		}
		if (Class280.aClass693_1 != Class693.aClass693_8 || client.anInt3514 * 2055688893 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class717.method37076(1, -1, -1, false, (byte) 121);
					if (Class255.method26101(2065158934) == 1) {
						Class314.method27032("Success", -2140614378);
					} else {
						Class314.method27032("Failure", -2030034784);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class717.method37076(2, -1, -1, false, (byte) 28);
					if (Class255.method26101(2023373449) == 2) {
						Class314.method27032("Success", -1983072734);
					} else {
						Class314.method27032("Failure", -2006833349);
					}
					return;
				}
				if (Class4.aBoolean2 && arg0.equalsIgnoreCase("wm3")) {
					Class717.method37076(3, 1024, 768, false, (byte) 6);
					if (Class255.method26101(1653595705) == 3) {
						Class314.method27032("Success", -2078368673);
					} else {
						Class314.method27032("Failure", -1981096775);
					}
					return;
				}
				@Pc(570) Class93_Sub22 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3435 * -849002901 != 4) {
						Class314.method27032("Failure", -1932374134);
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class314.method27032("Failure", -2090243110);
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class314.method27032("Failure", -2138798752);
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class237.method25871(local139, local568, -895218641);
					Class314.method27032("Success", -2055408723);
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class543.method31129(0, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 41) == 0) {
						Class314.method27032("Success", -1857815724);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 90);
						Class106_Sub1.method5148(-1652906090);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -2146181896);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class543.method31129(1, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 42) == 1) {
						Class314.method27032("Success", -1858628190);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 1, (byte) 15);
						Class106_Sub1.method5148(-2129037392);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -2097725127);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class543.method31129(3, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 60) == 3) {
						Class314.method27032("Success", -1846473380);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 3, (byte) 54);
						Class106_Sub1.method5148(-2021424307);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -2006235469);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class543.method31129(5, false, 1945646779);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 106) == 5) {
						Class314.method27032("Success", -2050365061);
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 5, (byte) 44);
						Class106_Sub1.method5148(-1844685407);
						client.aBoolean603 = false;
					} else {
						Class314.method27032("Failure", -1937683109);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3435 * -849002901 == 18) {
						Class565.method31435(-2066387364);
					} else if (client.anInt3435 * -849002901 == 3) {
						client.aClass175_2.aBoolean566 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class175[] local776 = client.aClass175Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class175 local786 = local776[local778];
						if (local786.method24368((byte) 50) != null) {
							local786.method24368((byte) 65).method14714(-1453926679);
						}
					}
					Class520.aClass144_3.method11169(-337961482);
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class314.method27032("varpbit=" + Class624.aClass120_1.method33635(Class624.aClass120_1.method28134(local568, (byte) -50), 1590591055), -1870461469);
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class314.method27032("varp=" + Class624.aClass120_1.method33636(Class624.aClass120_1.method28135(Class138.aClass138_65, local568, -1497248091), 1585251344), -2109390046);
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = client.method25414(arg0.substring(12), ' ', 1757271390);
					if (local865.length == 2 || local865.length == 3) {
						if (Class251.method26066(672230734)) {
							Class3.method23((byte) -55);
						}
						Class114.method7634(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true, (byte) 70);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = client.method25414(arg0.substring(8), ' ', 1655382309);
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class225.method25697(local778, local923, true, 1469053538);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class305.method26889(1691152894) + ".log");
						if (local940.exists()) {
							Class314.method27032("file already exists!", -2098238963);
							return;
						}
					}
					if (Class168.aFileOutputStream1 != null) {
						Class168.aFileOutputStream1.close();
						Class168.aFileOutputStream1 = null;
					}
					try {
						Class168.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(983) FileNotFoundException local983) {
						Class314.method27032("Could not create " + local940.getName(), -1989937827);
						return;
					} catch (@Pc(996) SecurityException local996) {
						Class314.method27032("Cannot write to " + local940.getName(), -1854859286);
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class168.aFileOutputStream1 != null) {
						Class168.aFileOutputStream1.close();
					}
					Class168.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class314.method27032("No such file", -1867883129);
						return;
					}
					@Pc(1043) byte[] local1043 = Class300.method26813(local940, 931656821);
					if (local1043 == null) {
						Class314.method27032("Failed to read file", -2141763795);
						return;
					}
					@Pc(1061) String[] local1061 = client.method25414(Class93_Sub13.method13491(Class114.method7636(local1043, 34838), '\r', "", 1010804703), '\n', 1430112904);
					Class96_Sub3.method2331(local1061, -1409707306);
				}
				if (client.anInt3435 * -849002901 == 18 || client.anInt3435 * -849002901 == 13) {
					@Pc(1077) Class175 local1077 = Class330.method27465(-2080489687);
					local570 = Class102.method2592(Class446.aClass446_86, local1077.aClass24_2, (byte) 19);
					local570.aClass93_Sub41_Sub2_1.method22522(arg0.length() + 3, (byte) -48);
					local570.aClass93_Sub41_Sub2_1.method22522(arg1 ? 1 : 0, (byte) -32);
					local570.aClass93_Sub41_Sub2_1.method22522(arg2 ? 1 : 0, (byte) -65);
					local570.aClass93_Sub41_Sub2_1.method22414(arg0, -286626860);
					local1077.method24363(local570, -2018191068);
				}
			} catch (@Pc(1120) Exception local1120) {
				Class314.method27032(Class74.aClass74_116.method1259(Class106.aClass717_8, (byte) -13), -1876308812);
				return;
			}
		}
		if (client.anInt3435 * -849002901 != 18 && client.anInt3435 * -849002901 != 13) {
			Class314.method27032(Class74.aClass74_4.method1259(Class106.aClass717_8, (byte) -57) + arg0, -2040709813);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "axg", descriptor = "(Lclient!yf;I)V")
	static void method16836(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18273(local12, -198406608);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt4157 * 1579741579;
	}

	@OriginalMember(owner = "client!aoh", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V")
	public Class32_Sub7(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_40, 128, new Class52(Class39.class));
	}
}
