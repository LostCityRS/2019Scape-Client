package com.jagex.console;

import com.jagex.*;
import com.jagex.core.util.Cp1252;
import com.jagex.core.util.FileUtil;
import com.jagex.core.util.MonotonicTime;
import com.jagex.core.util.StringUtils;
import com.jagex.game.LoginManager;
import com.jagex.game.client.*;
import com.jagex.game.world.WorldSwitcher;
import com.jagex.game.world.entity.SceneManager;
import com.jagex.graphics.*;
import rs2.client.options.Preferences;
import com.jagex.core.constants.ModeWhere;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;
import rs2.shared.prot.ClientProt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@ObfuscatedName("ap")
public class DeveloperConsole {

	@ObfuscatedName("ap.f")
	public static int field764 = 0;

	@ObfuscatedName("ap.w")
	public static int field771 = 0;

	@ObfuscatedName("ap.l")
	public static String currententry = "";

	@ObfuscatedName("ap.u")
	public static int commandpointer = 0;

	@ObfuscatedName("ap.z")
	public static int commandcharpointer = 0;

	@ObfuscatedName("ap.p")
	public static int field776 = 0;

	@ObfuscatedName("ap.d")
	public static boolean field770 = false;

	@ObfuscatedName("ap.r")
	public static int field772 = -1;

	@ObfuscatedName("ahs.e(I)V")
	public static void method16752() {
	}

	public DeveloperConsole() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cc.e(B)Z")
	public static boolean method1584() {
		return !Statics.method2092(client.state);
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
		Statics.field763 = Statics.field2657.field8569 + Statics.field2657.field8562 + 2;
		Statics.field4845 = new String[500];
		for (int var0 = 0; var0 < Statics.field4845.length; var0++) {
			Statics.field4845[var0] = "";
		}
		addline(LocalisedText.DEBUG_CONSOLE_INFO.method15021(Statics.field1680));
	}

	@ObfuscatedName("amd.k(B)V")
	public static void close() {
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
			currententry = currententry + arg0[0];
			commandcharpointer += arg0[0].length();
			return;
		}
		for (int var1 = 0; var1 < arg0.length; var1++) {
			if (arg0[var1].startsWith("pause")) {
				int var2 = 5;
				try {
					var2 = Integer.parseInt(arg0[var1].substring(6));
				} catch (Exception var4) {
				}
				addline("Pausing for " + var2 + " seconds...");
				Statics.field2615 = arg0;
				field772 = var1 + 1;
				Statics.field765 = MonotonicTime.method3655() + (long) (var2 * 1000);
				return;
			}
			currententry = arg0[var1];
			method14718(false);
		}
	}

	@ObfuscatedName("fv.z(I)V")
	public static void method3085() {
		if (commandpointer <= 0) {
			currententry = "";
			return;
		}
		int var0 = 0;
		for (int var1 = 0; var1 < Statics.field4845.length; var1++) {
			if (Statics.field4845[var1].indexOf("--> ") != -1) {
				var0++;
				if (commandpointer == var0) {
					currententry = Statics.field4845[var1].substring(Statics.field4845[var1].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@ObfuscatedName("ai.p(Ljava/lang/String;I)V")
	public static void method722(String arg0) {
		currententry = arg0;
		commandcharpointer = currententry.length();
	}

	@ObfuscatedName("abc.d(ZI)V")
	public static void method14718(boolean arg0) {
		currententry = currententry.trim();
		commandpointer = 0;
		if (currententry.length() == 0) {
			commandcharpointer = 0;
			return;
		}
		addline("--> " + currententry);
		method18913(currententry, false, arg0);
		if (arg0) {
			commandcharpointer = currententry.length();
		} else {
			commandcharpointer = 0;
			currententry = "";
		}
	}

	@ObfuscatedName("hj.c(Ljava/lang/String;I)V")
	public static void addline(String arg0) {
		if (Statics.field4845 == null) {
			method8025();
		}
		client.field11088.setTime(new Date(MonotonicTime.method3655()));
		int var1 = client.field11088.get(11);
		int var2 = client.field11088.get(12);
		int var3 = client.field11088.get(13);
		String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
		String[] var5 = StringUtils.method17361(arg0, '\n');
		for (int var6 = 0; var6 < var5.length; var6++) {
			for (int var7 = field764; var7 > 0; var7--) {
				Statics.field4845[var7] = Statics.field4845[var7 - 1];
			}
			Statics.field4845[0] = var4 + ": " + var5[var6];
			if (Statics.field773 != null) {
				try {
					Statics.field773.write(Cp1252.method3064(Statics.field4845[0] + "\n"));
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
	public static void method5378(Renderer arg0) {
		if (TwitchHardwarePlatform.method5076() && TwitchHardwarePlatform.method8634()) {
			TwitchHardwarePlatform.method5389(0, 0, Statics.canvasWid, 350);
		}
		arg0.method2168(0, 0, Statics.canvasWid, 350);
		arg0.method2354(0, 0, Statics.canvasWid, 350, field776 * 36 << 24 | 0x332277, 1);
		int var1 = 350 / Statics.field763;
		if (field764 > 0) {
			int var2 = 346 - Statics.field763 - 4;
			int var3 = var1 * var2 / (field764 + var1 - 1);
			int var4 = 4;
			if (field764 > 1) {
				var4 += (field764 - 1 - field771) * (var2 - var3) / (field764 - 1);
			}
			arg0.method2354(Statics.canvasWid - 16, var4, 12, var3, field776 * 36 << 24 | 0x332277, 2);
			for (int var5 = field771; var5 < field771 + var1 && var5 < field764; var5++) {
				String[] var6 = StringUtils.method17361(Statics.field4845[var5], '\b');
				int var7 = (Statics.canvasWid - 8 - 16) / var6.length;
				for (int var8 = 0; var8 < var6.length; var8++) {
					int var9 = var7 * var8 + 8;
					arg0.method2168(var9, 0, var7 + var9 - 8, 350);
					Statics.field9184.method2681(method14312(var6[var8]), var9, 350 - Statics.field768 - 2 - Statics.field2657.field8569 - Statics.field763 * (var5 - field771), -1, -16777216);
				}
			}
		}
		Statics.field8321.method2682("910 1", Statics.canvasWid - 25, 330, -1, -16777216);
		arg0.method2168(0, 0, Statics.canvasWid, 350);
		arg0.method2176(0, 350 - Statics.field768, Statics.canvasWid, -1);
		Statics.field10355.method2681("--> " + method14312(currententry), 10, 350 - Statics.field10268.field8569 - 1, -1, -16777216);
		if (Statics.focus) {
			int var10 = -1;
			if (client.field10903 % 30 > 15) {
				var10 = 16777215;
			}
			arg0.method2177(Statics.field10268.method14532("--> " + method14312(currententry).substring(0, commandcharpointer)) + 10, 350 - Statics.field10268.field8569 - 11, 12, var10);
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
				addline("commands - This command");
				addline("cls - Clear console");
				addline("displayfps - Toggle FPS and other information");
				addline("renderer - Print graphics renderer information");
				addline("heap - Print java memory information");
				addline("getcamerapos - Print location and direction of camera for use in bug reports");
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
					addline("FPS on");
				} else {
					addline("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				RendererInfo var3 = Statics.field8198.method2272();
				addline("Toolkit ID: " + Statics.field688.displayMode2.method18545());
				addline("Vendor: " + var3.field1261);
				addline("Name: " + var3.field1257);
				addline("Version: " + var3.field1263);
				addline("Device: " + var3.field1256);
				addline("Driver Version: " + var3.field1265);
				String var4 = Statics.field8198.method2132();
				if (var4.length() > 0) {
					addline(var4);
				}
				return;
			}
			if (arg0.equals("heap")) {
				addline("Heap: " + GameShell.maxmemory + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				CoordGrid var5 = client.world.method7727();
				if (Statics.field3416 == 3) {
					Vector3 var6 = Statics.field9155.method4714();
					Vector3 var7 = Statics.field9155.method4711();
					addline("Pos: " + (new CoordGrid(Statics.field4490.field11717, (int) var6.field4308 >> 9, (int) var6.field4313 >> 9)).toString() + " Height: " + (client.method3660((int) var6.field4308 - (var5.field7426 << 9), (int) var6.field4313 - (var5.field7427 << 9), Statics.field4490.field11717) + (int) var6.field4311));
					addline("Look: " + (new CoordGrid(Statics.field4490.field11717, (int) var7.field4308 >> 9, (int) var7.field4313 >> 9)).toString() + " Height: " + (client.method3660((int) var7.field4308 - (var5.field7426 << 9), (int) var6.field4313 - (var5.field7427 << 9), Statics.field4490.field11717) + (int) var6.field4311));
				} else {
					addline("Pos: " + Statics.field4490.field11717 + "," + ((Statics.field7956 >> 9) + var5.field7426 >> 6) + "," + ((Statics.field1881 >> 9) + var5.field7427 >> 6) + "," + ((Statics.field7956 >> 9) + var5.field7426 & 0x3F) + "," + ((Statics.field1881 >> 9) + var5.field7427 & 0x3F) + " Height: " + (client.method3660(Statics.field7956, Statics.field1881, Statics.field4490.field11717) - Statics.field10518));
					addline("Look: " + Statics.field4490.field11717 + "," + (Statics.field6714 + var5.field7426 >> 6) + "," + (Statics.field2626 + var5.field7427 >> 6) + "," + (Statics.field6714 + var5.field7426 & 0x3F) + "," + (Statics.field2626 + var5.field7427 & 0x3F) + " Height: " + (client.method3660(Statics.field6714, Statics.field2626, Statics.field4490.field11717) - Statics.field1983));
				}
				return;
			}
		} catch (Exception var37) {
			addline(LocalisedText.DEBUG_CONSOLE_ERROR.method15021(Statics.field1680));
			return;
		}
		if (Statics.field1811 != ModeWhere.field8273 || client.field10949 >= 2 || client.ALLOW_COMMANDS_ANYWHERE) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					client.setWindowMode(1, -1, -1, false);
					if (client.getWindowMode() == 1) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					client.setWindowMode(2, -1, -1, false);
					if (client.getWindowMode() == 2) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (Fullscreen.allowed && arg0.equalsIgnoreCase("wm3")) {
					client.setWindowMode(3, 1024, 768, false);
					if (client.getWindowMode() == 3) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.startsWith("setlobby ")) {
					if (client.state != 4) {
						addline("Failure");
						return;
					}
					int var9 = -1;
					Object var10 = null;
					String var11 = arg0.substring(9);
					int var12 = var11.indexOf(32);
					if (var12 == -1) {
						addline("Failure");
						return;
					}
					try {
						var9 = Integer.parseInt(var11.substring(0, var12));
					} catch (NumberFormatException var33) {
					}
					if (var9 == -1) {
						addline("Failure");
						return;
					}
					String var14 = var11.substring(var12 + 1).trim() + ".runescape.com";
					WorldSwitcher.method2105(var14, var9);
					addline("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					client.method486(0, false);
					if (Statics.field688.displayMode2.method18545() == 0) {
						addline("Success");
						Statics.field688.method18157(Statics.field688.displayMode, 0);
						Preferences.method16391();
						client.field10800 = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					client.method486(1, false);
					if (Statics.field688.displayMode2.method18545() == 1) {
						addline("Success");
						Statics.field688.method18157(Statics.field688.displayMode, 1);
						Preferences.method16391();
						client.field10800 = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					client.method486(3, false);
					if (Statics.field688.displayMode2.method18545() == 3) {
						addline("Success");
						Statics.field688.method18157(Statics.field688.displayMode, 3);
						Preferences.method16391();
						client.field10800 = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					client.method486(5, false);
					if (Statics.field688.displayMode2.method18545() == 5) {
						addline("Success");
						Statics.field688.method18157(Statics.field688.displayMode, 5);
						Preferences.method16391();
						client.field10800 = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.state == 18) {
						client.method8321();
					} else if (client.state == 3) {
						client.field10849.field808 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					ServerConnection[] var15 = client.field10850;
					for (int var16 = 0; var16 < var15.length; var16++) {
						ServerConnection var17 = var15[var16];
						if (var17.method939() != null) {
							var17.method939().method9032();
						}
					}
					Statics.field4489.method7035();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					int var18 = Integer.parseInt(arg0.substring(17));
					addline("varpbit=" + Statics.field7410.method678(Statics.field7410.method694(var18)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					int var19 = Integer.parseInt(arg0.substring(14));
					addline("varp=" + Statics.field7410.method679(Statics.field7410.method695(VarDomainType.PLAYER, var19)));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					String[] var20 = StringUtils.method17361(arg0.substring(12), ' ');
					if (var20.length == 2 || var20.length == 3) {
						if (LoginManager.method2865()) {
							LoginManager.method14129();
						}
						LoginManager.method665(var20[0], var20[1], var20.length > 2 ? var20[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					String[] var21 = StringUtils.method17361(arg0.substring(8), ' ');
					int var22 = Integer.parseInt(var21[0]);
					String var23 = var21.length > 1 ? var21[1] : "";
					LoginManager.method2050(var22, var23, true);
					return;
				}
				if (arg0.startsWith("setoutput ")) {
					File var24 = new File(arg0.substring(10));
					if (var24.exists()) {
						var24 = new File(arg0.substring(10) + "." + MonotonicTime.method3655() + ".log");
						if (var24.exists()) {
							addline("file already exists!");
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
						addline("Could not create " + var24.getName());
						return;
					} catch (SecurityException var35) {
						addline("Cannot write to " + var24.getName());
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
						addline("No such file");
						return;
					}
					byte[] var28 = FileUtil.method3587(var27);
					if (var28 == null) {
						addline("Failed to read file");
						return;
					}
					String[] var29 = StringUtils.method17361(Statics.method17687(Cp1252.method667(var28), '\r', ""), '\n');
					method15383(var29);
				}
				if (client.state == 18 || client.state == 13) {
					ServerConnection var30 = client.method640();
					ClientMessage var31 = Statics.method1604(ClientProt.CLIENT_CHEAT, var30.field794);
					var31.field11432.p1(arg0.length() + 3);
					var31.field11432.p1(arg1 ? 1 : 0);
					var31.field11432.p1(arg2 ? 1 : 0);
					var31.field11432.pjstr(arg0);
					var30.method934(var31);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				addline(LocalisedText.DEBUG_CONSOLE_ERROR.method15021(Statics.field1680));
				return;
			}
		}
		if (client.state != 18 && client.state != 13 && !client.ALLOW_COMMANDS_ANYWHERE) {
			addline(LocalisedText.DEBUG_CONSOLE_UNKNOWNCOMMAND.method15021(Statics.field1680) + arg0);
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
					close();
				} else if (arg0 == 11) {
					addline("" + GameShell.fps);
				} else if (arg0 == 24) {
					OcclusionManager var1 = client.world.method7743().field6930;
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
					addline("" + var4);
				} else if (arg0 == 20) {
					client.method10444();
					for (int var5 = 0; var5 < 10; var5++) {
						System.gc();
					}
					Runtime var6 = Runtime.getRuntime();
					int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					addline("" + var7);
					SceneManager.method7319();
					client.method10444();
					for (int var8 = 0; var8 < 10; var8++) {
						System.gc();
					}
					int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					addline("" + var9);
				} else if (arg0 == 9) {
					addline(Statics.field10577.method7909() ? "Success" : "Failure");
				} else if (arg0 == 23) {
					Statics.field8755.method14758();
				} else if (arg0 == 14) {
					Statics.field4489.method7020();
				} else if (arg0 == 6) {
					Statics.field4489.method7014();
				} else if (arg0 == 26) {
					Statics.canvas.setLocation(50, 50);
				} else if (arg0 == 22) {
					Statics.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
				} else if (arg0 == 4) {
					method10153();
				} else if (arg0 == 17) {
					client.world.field5056 = MonotonicTime.method3655();
					client.world.field5037 = true;
					method10153();
				} else if (arg0 == 19) {
					Vector3 var10 = Statics.field4490.method10536().field4298;
					addline(((int) var10.field4308 >> 9) + " " + ((int) var10.field4313 >> 9));
				} else if (arg0 == 16) {
					Vector3 var11 = Statics.field4490.method10536().field4298;
					addline("" + client.world.method7743().field6913[Statics.field4490.field11717].method1529((int) var11.field4308 >> 9, (int) var11.field4313 >> 9));
				} else if (arg0 == 27) {
					addline(Component.field2175.method2926() + " " + Component.field2175.method2925());
					addline(Component.field2297.method2926() + " " + Component.field2297.method2925());
				} else if (arg0 == 8) {
					Statics.method14055(false);
				} else if (arg0 == 13) {
					client.field10848 = !client.field10848;
					Statics.field8198.method2253(client.field10848);
					method16752();
					return;
				} else if (arg0 == 1) {
					client.field11005 = 0;
					client.world.method7753();
				} else if (arg0 == 3) {
					client.field11005 = 1;
					client.world.method7753();
				} else if (arg0 == 15) {
					client.field11005 = 2;
					client.world.method7753();
				}
			} catch (Exception var13) {
				addline(LocalisedText.DEBUG_CONSOLE_ERROR.method15021(Statics.field1680));
			}
		}
	}

	@ObfuscatedName("xi.q(B)V")
	public static void method10153() {
		if (Statics.field688.unknown7.method18750() == 1) {
			Statics.field3183.method7680(new RebuildRequest(RebuildType.field5070, null));
		} else {
			client.world.method7753();
			Minimap.method5065();
		}
	}
}
