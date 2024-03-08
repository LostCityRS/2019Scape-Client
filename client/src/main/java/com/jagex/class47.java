package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@ObfuscatedName("ap")
public class class47 {

	@ObfuscatedName("ap.f")
	public static int field764 = 0;

	@ObfuscatedName("ap.w")
	public static int field771 = 0;

	@ObfuscatedName("ap.l")
	public static String field766 = "";

	@ObfuscatedName("ap.u")
	public static int field767 = 0;

	@ObfuscatedName("ap.z")
	public static int field769 = 0;

	@ObfuscatedName("ap.p")
	public static int field776 = 0;

	@ObfuscatedName("ap.d")
	public static boolean field770 = false;

	@ObfuscatedName("ap.r")
	public static int field772 = -1;

	@ObfuscatedName("ahs.e(I)V")
	public static void method16752() {
	}

	public class47() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cc.e(B)Z")
	public static boolean method1584() {
		return !Statics.method2092(client.field10791);
	}

	@ObfuscatedName("i.n(I)V")
	public static void method638() {
		if (!method1584()) {
			return;
		}
		if (Statics.field4845 == null) {
			method8025();
		}
		field770 = true;
		field776 = 0;
	}

	@ObfuscatedName("sm.m(S)V")
	public static void method8025() {
		Statics.field768 = Statics.field10268.field8569 + Statics.field10268.field8562 + 2;
		Statics.field763 = Statics.field2657.field8569 * 2 + Statics.field2657.field8562 * 2 + 4;
		Statics.field4845 = new String[500];
		for (int var0 = 0; var0 < Statics.field4845.length; var0++) {
			Statics.field4845[var0] = "";
		}
		method4285(class776.field9052.method15021(Statics.field1680));
	}

	@ObfuscatedName("amd.k(B)V")
	public static void method18557() {
		field770 = false;
		client.method9734();
	}

	@ObfuscatedName("sx.f(I)V")
	public static void method8023() {
		if (Statics.field773 != null) {
			try {
				Statics.field773.close();
			} catch (IOException var1) {
			}
		}
		Statics.field773 = null;
	}

	@ObfuscatedName("xh.w(I)Z")
	public static boolean method10211() {
		return field770;
	}

	@ObfuscatedName("aej.l([Ljava/lang/String;I)V")
	public static void method15383(String[] arg0) {
		if (arg0.length <= 1) {
			field766 = field766 + arg0[0];
			field769 += arg0[0].length();
			return;
		}
		for (int var1 = 0; var1 < arg0.length; var1++) {
			if (arg0[var1].startsWith("pause")) {
				int var2 = 5;
				try {
					var2 = Integer.parseInt(arg0[var1].substring(6));
				} catch (Exception var4) {
				}
				method4285("Pausing for " + var2 + " seconds...");
				Statics.field2615 = arg0;
				field772 = var1 + 1;
				Statics.field765 = class213.method3655() + (long) (var2 * 1000);
				return;
			}
			field766 = arg0[var1];
			method14718(false);
		}
	}

	@ObfuscatedName("fv.z(I)V")
	public static void method3085() {
		if (field767 <= 0) {
			field766 = "";
			return;
		}
		int var0 = 0;
		for (int var1 = 0; var1 < Statics.field4845.length; var1++) {
			if (Statics.field4845[var1].indexOf("--> ") != -1) {
				var0++;
				if (field767 == var0) {
					field766 = Statics.field4845[var1].substring(Statics.field4845[var1].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@ObfuscatedName("ai.p(Ljava/lang/String;I)V")
	public static void method722(String arg0) {
		field766 = arg0;
		field769 = field766.length();
	}

	@ObfuscatedName("abc.d(ZI)V")
	public static void method14718(boolean arg0) {
		field766 = field766.trim();
		field767 = 0;
		if (field766.length() == 0) {
			field769 = 0;
			return;
		}
		method4285("--> " + field766);
		method18913(field766, false, arg0);
		if (arg0) {
			field769 = field766.length();
		} else {
			field769 = 0;
			field766 = "";
		}
	}

	@ObfuscatedName("hj.c(Ljava/lang/String;I)V")
	public static void method4285(String arg0) {
		if (Statics.field4845 == null) {
			method8025();
		}
		client.field11088.setTime(new Date(class213.method3655()));
		int var1 = client.field11088.get(11);
		int var2 = client.field11088.get(12);
		int var3 = client.field11088.get(13);
		String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
		String[] var5 = class695.method17361(arg0, '\n');
		for (int var6 = 0; var6 < var5.length; var6++) {
			for (int var7 = field764; var7 > 0; var7--) {
				Statics.field4845[var7] = Statics.field4845[var7 - 1];
			}
			Statics.field4845[0] = var4 + ": " + var5[var6];
			if (Statics.field773 != null) {
				try {
					Statics.field773.write(class693.method3064(Statics.field4845[0] + "\n"));
				} catch (IOException var9) {
				}
			}
			if (field764 < Statics.field4845.length - 1) {
				field764++;
				if (field771 > 0) {
					field771++;
				}
			}
		}
	}

	@ObfuscatedName("ky.r(Ldh;I)V")
	public static void method5378(class133 arg0) {
		if (class586.method5076() && class586.method8634()) {
			class586.method5389(0, 0, Statics.field6586, 350);
		}
		arg0.method2168(0, 0, Statics.field6586, 350);
		arg0.method2354(0, 0, Statics.field6586, 350, field776 * 36 << 24 | 0x332277, 1);
		int var1 = 350 / (Statics.field763 * 2);
		if (field764 > 0) {
			int var2 = 346 - Statics.field763 * 2 - 4;
			int var3 = var1 * var2 / (field764 + var1 - 1);
			int var4 = 4;
			if (field764 > 1) {
				var4 += (field764 - 1 - field771) * (var2 - var3) / (field764 - 1);
			}
			arg0.method2354(Statics.field6586 - 16, var4, 12, var3, field776 * 36 << 24 | 0x332277, 2);
			for (int var5 = field771; var5 < field771 + var1 && var5 < field764; var5++) {
				String[] var6 = class695.method17361(Statics.field4845[var5], '\b');
				int var7 = (Statics.field6586 - 8 - 16) / var6.length;
				for (int var8 = 0; var8 < var6.length; var8++) {
					int var9 = var7 * var8 + 8;
					arg0.method2168(var9, 0, var7 + var9 - 8, 350);
					Statics.field9184.method2681(method14312(var6[var8]), var9, 350 - Statics.field768 - 2 - Statics.field2657.field8569 - Statics.field763 * 2 * (var5 - field771), -1, -16777216);
				}
			}
		}
		Statics.field8321.method2682("910 1", Statics.field6586 - 25, 330, -1, -16777216);
		arg0.method2168(0, 0, Statics.field6586, 350);
		arg0.method2176(0, 350 - Statics.field768, Statics.field6586, -1);
		Statics.field10355.method2681("--> " + method14312(field766), 10, 350 - Statics.field10268.field8569 - 1, -1, -16777216);
		if (Statics.field8491) {
			int var10 = -1;
			if (client.field10903 % 30 > 15) {
				var10 = 16777215;
			}
			arg0.method2177(Statics.field10268.method14532("--> " + method14312(field766).substring(0, field769)) + 10, 350 - Statics.field10268.field8569 - 11, 12, var10);
		}
		arg0.method2167();
		method16858();
	}

	@ObfuscatedName("aai.v(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method14312(String arg0) {
		String var1 = null;
		int var2 = arg0.indexOf("--> ");
		if (var2 >= 0) {
			var1 = arg0.substring(0, var2 + 4);
			arg0 = arg0.substring(var2 + 4);
		}
		int var3 = -1;
		if (arg0.startsWith("directlogin ")) {
			var3 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (var3 >= 0) {
			int var4 = arg0.length();
			arg0 = arg0.substring(0, var3) + " ";
			for (int var5 = var3 + 1; var5 < var4; var5++) {
				arg0 = arg0 + "*";
			}
		}
		return var1 == null ? arg0 : var1 + arg0;
	}

	@ObfuscatedName("aij.o(B)V")
	public static void method16858() {
	}

	@ObfuscatedName("aoh.s(Ljava/lang/String;ZZB)V")
	public static void method18913(String arg0, boolean arg1, boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				method4285("commands - This command");
				method4285("cls - Clear console");
				method4285("displayfps - Toggle FPS and other information");
				method4285("renderer - Print graphics renderer information");
				method4285("heap - Print java memory information");
				method4285("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				field764 = 0;
				field771 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.field10794 = !client.field10794;
				if (client.field10794) {
					method4285("FPS on");
				} else {
					method4285("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				class108 var3 = Statics.field8198.method2272();
				method4285("Toolkit ID: " + Statics.field688.field11540.method18545());
				method4285("Vendor: " + var3.field1261);
				method4285("Name: " + var3.field1257);
				method4285("Version: " + var3.field1263);
				method4285("Device: " + var3.field1256);
				method4285("Driver Version: " + var3.field1265);
				String var4 = Statics.field8198.method2132();
				if (var4.length() > 0) {
					method4285(var4);
				}
				return;
			}
			if (arg0.equals("heap")) {
				method4285("Heap: " + class507.field6616 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				class594 var5 = client.field10855.method7727();
				if (Statics.field3416 == 3) {
					class423 var6 = Statics.field9155.method4714();
					class423 var7 = Statics.field9155.method4711();
					method4285("Pos: " + (new class594(Statics.field4490.field11717, (int) var6.field4308 >> 9, (int) var6.field4313 >> 9)).toString() + " Height: " + (client.method3660((int) var6.field4308 - (var5.field7426 << 9), (int) var6.field4313 - (var5.field7427 << 9), Statics.field4490.field11717) + (int) var6.field4311));
					method4285("Look: " + (new class594(Statics.field4490.field11717, (int) var7.field4308 >> 9, (int) var7.field4313 >> 9)).toString() + " Height: " + (client.method3660((int) var7.field4308 - (var5.field7426 << 9), (int) var6.field4313 - (var5.field7427 << 9), Statics.field4490.field11717) + (int) var6.field4311));
				} else {
					method4285("Pos: " + Statics.field4490.field11717 + "," + ((Statics.field7956 >> 9) + var5.field7426 >> 6) + "," + ((Statics.field1881 >> 9) + var5.field7427 >> 6) + "," + ((Statics.field7956 >> 9) + var5.field7426 & 0x3F) + "," + ((Statics.field1881 >> 9) + var5.field7427 & 0x3F) + " Height: " + (client.method3660(Statics.field7956, Statics.field1881, Statics.field4490.field11717) - Statics.field10518));
					method4285("Look: " + Statics.field4490.field11717 + "," + (Statics.field6714 + var5.field7426 >> 6) + "," + (Statics.field2626 + var5.field7427 >> 6) + "," + (Statics.field6714 + var5.field7426 & 0x3F) + "," + (Statics.field2626 + var5.field7427 & 0x3F) + " Height: " + (client.method3660(Statics.field6714, Statics.field2626, Statics.field4490.field11717) - Statics.field1983));
				}
				return;
			}
		} catch (Exception var37) {
			method4285(class776.field9061.method15021(Statics.field1680));
			return;
		}
		if (Statics.field1811 != class682.field8273 || client.field10949 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					client.method13880(1, -1, -1, false);
					if (client.method2845() == 1) {
						method4285("Success");
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					client.method13880(2, -1, -1, false);
					if (client.method2845() == 2) {
						method4285("Success");
					} else {
						method4285("Failure");
					}
					return;
				}
				if (class725.field8531 && arg0.equalsIgnoreCase("wm3")) {
					client.method13880(3, 1024, 768, false);
					if (client.method2845() == 3) {
						method4285("Success");
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.startsWith("setlobby ")) {
					if (client.field10791 != 4) {
						method4285("Failure");
						return;
					}
					int var9 = -1;
					Object var10 = null;
					String var11 = arg0.substring(9);
					int var12 = var11.indexOf(32);
					if (var12 == -1) {
						method4285("Failure");
						return;
					}
					try {
						var9 = Integer.parseInt(var11.substring(0, var12));
					} catch (NumberFormatException var33) {
					}
					if (var9 == -1) {
						method4285("Failure");
						return;
					}
					String var14 = var11.substring(var12 + 1).trim() + ".runescape.com";
					class750.method2105(var14, var9);
					method4285("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					client.method486(0, false);
					if (Statics.field688.field11540.method18545() == 0) {
						method4285("Success");
						Statics.field688.method18157(Statics.field688.field11524, 0);
						class48.method16391();
						client.field10800 = false;
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					client.method486(1, false);
					if (Statics.field688.field11540.method18545() == 1) {
						method4285("Success");
						Statics.field688.method18157(Statics.field688.field11524, 1);
						class48.method16391();
						client.field10800 = false;
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					client.method486(3, false);
					if (Statics.field688.field11540.method18545() == 3) {
						method4285("Success");
						Statics.field688.method18157(Statics.field688.field11524, 3);
						class48.method16391();
						client.field10800 = false;
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					client.method486(5, false);
					if (Statics.field688.field11540.method18545() == 5) {
						method4285("Success");
						Statics.field688.method18157(Statics.field688.field11524, 5);
						class48.method16391();
						client.field10800 = false;
					} else {
						method4285("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.field10791 == 18) {
						client.method8321();
					} else if (client.field10791 == 3) {
						client.field10849.field808 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					class49[] var15 = client.field10850;
					for (int var16 = 0; var16 < var15.length; var16++) {
						class49 var17 = var15[var16];
						if (var17.method939() != null) {
							var17.method939().method9032();
						}
					}
					Statics.field4489.method7035();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					int var18 = Integer.parseInt(arg0.substring(17));
					method4285("varpbit=" + Statics.field7410.method678(Statics.field7410.method694(var18)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					int var19 = Integer.parseInt(arg0.substring(14));
					method4285("varp=" + Statics.field7410.method679(Statics.field7410.method695(class455.field4594, var19)));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					String[] var20 = class695.method17361(arg0.substring(12), ' ');
					if (var20.length == 2 || var20.length == 3) {
						if (class10.method2865()) {
							class10.method14129();
						}
						class10.method665(var20[0], var20[1], var20.length > 2 ? var20[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					String[] var21 = class695.method17361(arg0.substring(8), ' ');
					int var22 = Integer.parseInt(var21[0]);
					String var23 = var21.length > 1 ? var21[1] : "";
					class10.method2050(var22, var23, true);
					return;
				}
				if (arg0.startsWith("setoutput ")) {
					File var24 = new File(arg0.substring(10));
					if (var24.exists()) {
						var24 = new File(arg0.substring(10) + "." + class213.method3655() + ".log");
						if (var24.exists()) {
							method4285("file already exists!");
							return;
						}
					}
					if (Statics.field773 != null) {
						Statics.field773.close();
						Statics.field773 = null;
					}
					try {
						Statics.field773 = new FileOutputStream(var24);
						return;
					} catch (FileNotFoundException var34) {
						method4285("Could not create " + var24.getName());
						return;
					} catch (SecurityException var35) {
						method4285("Cannot write to " + var24.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Statics.field773 != null) {
						Statics.field773.close();
					}
					Statics.field773 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					File var27 = new File(arg0.substring(10));
					if (!var27.exists()) {
						method4285("No such file");
						return;
					}
					byte[] var28 = class751.method3587(var27);
					if (var28 == null) {
						method4285("Failed to read file");
						return;
					}
					String[] var29 = class695.method17361(Statics.method17687(class693.method667(var28), '\r', ""), '\n');
					method15383(var29);
				}
				if (client.field10791 == 18 || client.field10791 == 13) {
					class49 var30 = client.method640();
					class983 var31 = Statics.method1604(class390.field3766, var30.field794);
					var31.field11432.method18001(arg0.length() + 3);
					var31.field11432.method18001(arg1 ? 1 : 0);
					var31.field11432.method18001(arg2 ? 1 : 0);
					var31.field11432.method17893(arg0);
					var30.method934(var31);
				}
			} catch (Exception var36) {
				method4285(class776.field9061.method15021(Statics.field1680));
				return;
			}
		}
		if (client.field10791 != 18 && client.field10791 != 13) {
			method4285(class776.field8949.method15021(Statics.field1680) + arg0);
		}
	}

	@ObfuscatedName("ahj.y(II)V")
	public static void method16614(int arg0) {
		if (arg0 == 28) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 29) {
					method18557();
				} else if (arg0 == 11) {
					method4285("" + class507.field6585);
				} else if (arg0 == 24) {
					class555 var1 = client.field10855.method7743().field6930;
					var1.field7031 = !var1.field7031;
				} else if (arg0 == 25) {
					client.field10794 = true;
				} else if (arg0 == 21) {
					client.field10794 = false;
				} else if (arg0 == 10) {
					client.field10864.method14242();
				} else if (arg0 == 5) {
					client.method10444();
					for (int var2 = 0; var2 < 10; var2++) {
						System.gc();
					}
					Runtime var3 = Runtime.getRuntime();
					int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
					method4285("" + var4);
				} else if (arg0 == 20) {
					client.method10444();
					for (int var5 = 0; var5 < 10; var5++) {
						System.gc();
					}
					Runtime var6 = Runtime.getRuntime();
					int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					method4285("" + var7);
					class43.method7319();
					client.method10444();
					for (int var8 = 0; var8 < 10; var8++) {
						System.gc();
					}
					int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					method4285("" + var9);
				} else if (arg0 == 9) {
					method4285(Statics.field10577.method7909() ? "Success" : "Failure");
				} else if (arg0 == 23) {
					Statics.field8755.method14758();
				} else if (arg0 == 14) {
					Statics.field4489.method7020();
				} else if (arg0 == 6) {
					Statics.field4489.method7014();
				} else if (arg0 == 26) {
					Statics.field10578.setLocation(50, 50);
				} else if (arg0 == 22) {
					Statics.field10578.setLocation(class507.field6596, class507.field6597);
				} else if (arg0 == 4) {
					method10153();
				} else if (arg0 == 17) {
					client.field10855.field5056 = class213.method3655();
					client.field10855.field5037 = true;
					method10153();
				} else if (arg0 == 19) {
					class423 var10 = Statics.field4490.method10536().field4298;
					method4285(((int) var10.field4308 >> 9) + " " + ((int) var10.field4313 >> 9));
				} else if (arg0 == 16) {
					class423 var11 = Statics.field4490.method10536().field4298;
					method4285("" + client.field10855.method7743().field6913[Statics.field4490.field11717].method1529((int) var11.field4308 >> 9, (int) var11.field4313 >> 9));
				} else if (arg0 == 27) {
					method4285(class226.field2175.method2926() + " " + class226.field2175.method2925());
					method4285(class226.field2297.method2926() + " " + class226.field2297.method2925());
				} else if (arg0 == 8) {
					Statics.method14055(false);
				} else if (arg0 == 13) {
					client.field10848 = !client.field10848;
					Statics.field8198.method2253(client.field10848);
					method16752();
					return;
				} else if (arg0 == 1) {
					client.field11005 = 0;
					client.field10855.method7753();
				} else if (arg0 == 3) {
					client.field11005 = 1;
					client.field10855.method7753();
				} else if (arg0 == 15) {
					client.field11005 = 2;
					client.field10855.method7753();
				}
			} catch (Exception var13) {
				method4285(class776.field9061.method15021(Statics.field1680));
			}
		}
	}

	@ObfuscatedName("xi.q(B)V")
	public static void method10153() {
		if (Statics.field688.field11561.method18750() == 1) {
			Statics.field3183.method7680(new class494(class496.field5070, null));
		} else {
			client.field10855.method7753();
			class42.method5065();
		}
	}
}
