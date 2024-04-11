package com.jagex.game.shared.console;

import com.jagex.core.constants.ModeWhere;
import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.FileUtil;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.StringTools;
import com.jagex.game.MiniMap;
import com.jagex.game.client.*;
import com.jagex.game.clientoptions.Preferences;
import com.jagex.game.config.iftype.Component;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.fullscreen.Fullscreen;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.SceneManager;
import com.jagex.graphics.*;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.login.LoginManager;
import rs2.client.login.WorldSwitcher;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@ObfuscatedName("ap")
public class DeveloperConsole {

	@ObfuscatedName("ap.n")
	public static int field768;

	@ObfuscatedName("ap.m")
	public static int field763;

	@ObfuscatedName("qv.k")
	public static String[] field4845;

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

	@ObfuscatedName("ap.c")
	public static long field765;

	@ObfuscatedName("ap.r")
	public static int field772 = -1;

	@ObfuscatedName("iv.v")
	public static String[] field2615;

	@ObfuscatedName("ap.o")
	public static FileOutputStream field773;

	@ObfuscatedName("ahs.e(I)V")
	public static void method16752() {
	}

	public DeveloperConsole() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cc.e(B)Z")
	public static boolean method1584() {
		return !Client.isStateLoading(Client.state);
	}

	@ObfuscatedName("i.n(I)V")
	public static void method638() {
		if (!method1584()) {
			return;
		}
		if (field4845 == null) {
			method8025();
		}
		field770 = true;
		field776 = 0;
	}

	@ObfuscatedName("sm.m(S)V")
	public static void method8025() {
		field768 = DefaultSprites.b12FullMetrics.field8569 + DefaultSprites.b12FullMetrics.field8562 + 2;
		field763 = DefaultSprites.p12FullMetrics.field8569 + DefaultSprites.p12FullMetrics.field8562 + 2;
		field4845 = new String[500];
		for (int var0 = 0; var0 < field4845.length; var0++) {
			field4845[var0] = "";
		}
		addline(LocalisedText.DEBUG_CONSOLE_INFO.forLang(Client.language));
	}

	@ObfuscatedName("amd.k(B)V")
	public static void close() {
		field770 = false;
		Client.method9734();
	}

	@ObfuscatedName("sx.f(I)V")
	public static void method8023() {
		if (field773 != null) {
			try {
				field773.close();
			} catch (IOException var1) {
			}
		}
		field773 = null;
	}

	@ObfuscatedName("xh.w(I)Z")
	public static boolean isopen() {
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
				field2615 = arg0;
				field772 = var1 + 1;
				field765 = MonotonicTime.get() + (long) (var2 * 1000);
				return;
			}
			currententry = arg0[var1];
			method14718(false);
		}
	}

	@ObfuscatedName("xd.u(B)V")
	public static void update() {
		if (field776 * 36 < 102) {
			field776 = field776 * 36 + 6;
		}
		if (field772 != -1 && field765 < MonotonicTime.get()) {
			for (int var0 = field772; var0 < field2615.length; var0++) {
				if (field2615[var0].startsWith("pause")) {
					int var1 = 5;
					try {
						var1 = Integer.parseInt(field2615[var0].substring(6));
					} catch (Exception var14) {
					}
					addline("Pausing for " + var1 + " seconds...");
					field772 = var0 + 1;
					field765 = MonotonicTime.get() + (long) (var1 * 1000);
					return;
				}
				currententry = field2615[var0];
				method14718(false);
			}
			field772 = -1;
		}
		if (Client.field10817 != 0) {
			field771 -= Client.field10817 * 5;
			if (field771 >= field764) {
				field771 = field764 - 1;
			}
			if (field771 < 0) {
				field771 = 0;
			}
			Client.field10817 = 0;
		}
		for (int var3 = 0; var3 < Client.allKeyboardEventCount; var3++) {
			KeyboardEvent var4 = Client.allKeyboardEvents[var3];
			int var5 = var4.method9141();
			char var6 = var4.method9131();
			int var7 = var4.method9134();
			if (var5 == 84) {
				method14718(false);
			}
			if (var5 == 80) {
				method14718(true);
			} else if (var5 == 66 && (var7 & 0x4) != 0) {
				if (Client.clipboard != null) {
					String var8 = "";
					for (int var9 = field4845.length - 1; var9 >= 0; var9--) {
						if (field4845[var9] != null && field4845[var9].length() > 0) {
							var8 = var8 + field4845[var9] + '\n';
						}
					}
					Client.clipboard.setContents(new StringSelection(var8), null);
				}
			} else if (var5 == 67 && (var7 & 0x4) != 0) {
				if (Client.clipboard != null) {
					try {
						Transferable var10 = Client.clipboard.getContents(null);
						if (var10 != null) {
							String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
							if (var11 != null) {
								String[] var12 = StringTools.split(var11, '\n');
								method15383(var12);
							}
						}
					} catch (Exception var15) {
					}
				}
			} else if (var5 == 85 && commandcharpointer > 0) {
				currententry = currententry.substring(0, commandcharpointer - 1) + currententry.substring(commandcharpointer);
				commandcharpointer--;
			} else if (var5 == 101 && commandcharpointer < currententry.length()) {
				currententry = currententry.substring(0, commandcharpointer) + currententry.substring(commandcharpointer + 1);
			} else if (var5 == 96 && commandcharpointer > 0) {
				commandcharpointer--;
			} else if (var5 == 97 && commandcharpointer < currententry.length()) {
				commandcharpointer++;
			} else if (var5 == 102) {
				commandcharpointer = 0;
			} else if (var5 == 103) {
				commandcharpointer = currententry.length();
			} else if (var5 == 104 && commandpointer < field4845.length) {
				commandpointer++;
				method3085();
				commandcharpointer = currententry.length();
			} else if (var5 == 105 && commandpointer > 0) {
				commandpointer--;
				method3085();
				commandcharpointer = currententry.length();
			} else if (StringTools.charIsAlphaNumeric(var6) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
				currententry = currententry.substring(0, commandcharpointer) + Client.allKeyboardEvents[var3].method9131() + currententry.substring(commandcharpointer);
				commandcharpointer++;
			}
		}
		Client.allKeyboardEventCount = 0;
		Client.keyboardEventCount = 0;
		Client.method9734();
	}

	@ObfuscatedName("fv.z(I)V")
	public static void method3085() {
		if (commandpointer <= 0) {
			currententry = "";
			return;
		}
		int var0 = 0;
		for (int var1 = 0; var1 < field4845.length; var1++) {
			if (field4845[var1].indexOf("--> ") != -1) {
				var0++;
				if (commandpointer == var0) {
					currententry = field4845[var1].substring(field4845[var1].indexOf(62) + 2);
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
		doCheat(currententry, false, arg0);
		if (arg0) {
			commandcharpointer = currententry.length();
		} else {
			commandcharpointer = 0;
			currententry = "";
		}
	}

	@ObfuscatedName("hj.c(Ljava/lang/String;I)V")
	public static void addline(String arg0) {
		if (field4845 == null) {
			method8025();
		}
		Client.field11088.setTime(new Date(MonotonicTime.get()));
		int var1 = Client.field11088.get(11);
		int var2 = Client.field11088.get(12);
		int var3 = Client.field11088.get(13);
		String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
		String[] var5 = StringTools.split(arg0, '\n');
		for (int var6 = 0; var6 < var5.length; var6++) {
			for (int var7 = field764; var7 > 0; var7--) {
				field4845[var7] = field4845[var7 - 1];
			}
			field4845[0] = var4 + ": " + var5[var6];
			if (field773 != null) {
				try {
					field773.write(Cp1252.method3064(field4845[0] + "\n"));
				} catch (IOException var9) {
				}
			}
			if (field764 < field4845.length - 1) {
				field764++;
				if (field771 > 0) {
					field771++;
				}
			}
		}
	}

	@ObfuscatedName("ky.r(Ldh;I)V")
	public static void draw(Toolkit toolkit) {
		if (TwitchHardwarePlatform.isStreaming() && TwitchHardwarePlatform.method8634()) {
			TwitchHardwarePlatform.drawTwitchStream(0, 0, GameShell.canvasWid, 350);
		}
		toolkit.resetBounds(0, 0, GameShell.canvasWid, 350);
		toolkit.fillRectangle(0, 0, GameShell.canvasWid, 350, field776 * 36 << 24 | 0x332277, 1);
		int var1 = 350 / field763;
		if (field764 > 0) {
			int var2 = 346 - field763 - 4;
			int var3 = var1 * var2 / (field764 + var1 - 1);
			int var4 = 4;
			if (field764 > 1) {
				var4 += (field764 - 1 - field771) * (var2 - var3) / (field764 - 1);
			}
			toolkit.fillRectangle(GameShell.canvasWid - 16, var4, 12, var3, field776 * 36 << 24 | 0x332277, 2);
			for (int var5 = field771; var5 < field771 + var1 && var5 < field764; var5++) {
				String[] var6 = StringTools.split(field4845[var5], '\b');
				int var7 = (GameShell.canvasWid - 8 - 16) / var6.length;
				for (int var8 = 0; var8 < var6.length; var8++) {
					int var9 = var7 * var8 + 8;
					toolkit.resetBounds(var9, 0, var7 + var9 - 8, 350);
					DefaultSprites.p12FullFont.drawString(method14312(var6[var8]), var9, 350 - field768 - 2 - DefaultSprites.p12FullMetrics.field8569 - field763 * (var5 - field771), -1, -16777216);
				}
			}
		}
		DefaultSprites.p11FullFont.drawStringRight("910 1", GameShell.canvasWid - 25, 330, -1, -16777216);
		toolkit.resetBounds(0, 0, GameShell.canvasWid, 350);
		toolkit.drawHorizontalLine(0, 350 - field768, GameShell.canvasWid, -1);
		DefaultSprites.b12FullFont.drawString("--> " + method14312(currententry), 10, 350 - DefaultSprites.b12FullMetrics.field8569 - 1, -1, -16777216);
		if (GameShell.focus) {
			int var10 = -1;
			if (Client.loopCycle % 30 > 15) {
				var10 = 16777215;
			}
			toolkit.drawVerticalLine(DefaultSprites.b12FullMetrics.stringWidth("--> " + method14312(currententry).substring(0, commandcharpointer)) + 10, 350 - DefaultSprites.b12FullMetrics.field8569 - 11, 12, var10);
		}
		toolkit.resetClip();
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
	public static void doCheat(String arg0, boolean arg1, boolean arg2) {
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
				Client.field10794 = !Client.field10794;
				if (Client.field10794) {
					addline("FPS on");
				} else {
					addline("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				RendererInfo var3 = Client.toolkit.getRendererInfo();
				addline("Toolkit ID: " + Client.preferences.displayMode.getValue());
				addline("Vendor: " + var3.toolkitId);
				addline("Name: " + var3.name);
				addline("Version: " + var3.version);
				addline("Device: " + var3.device);
				addline("Driver Version: " + var3.driverVersion);
				String var4 = Client.toolkit.hardwareInfo();
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
				CoordGrid var5 = Client.world.getBase();
				if (Client.cameraState == 3) {
					Vector3 var6 = Client.cam2.method4714();
					Vector3 var7 = Client.cam2.method4711();
					addline("Pos: " + (new CoordGrid(Client.localPlayerEntity.level, (int) var6.x >> 9, (int) var6.z >> 9)).toString() + " Height: " + (Client.getHeightmapY((int) var6.x - (var5.x << 9), (int) var6.z - (var5.z << 9), Client.localPlayerEntity.level) + (int) var6.y));
					addline("Look: " + (new CoordGrid(Client.localPlayerEntity.level, (int) var7.x >> 9, (int) var7.z >> 9)).toString() + " Height: " + (Client.getHeightmapY((int) var7.x - (var5.x << 9), (int) var6.z - (var5.z << 9), Client.localPlayerEntity.level) + (int) var6.y));
				} else {
					addline("Pos: " + Client.localPlayerEntity.level + "," + ((Client.cameraX >> 9) + var5.x >> 6) + "," + ((Client.cameraZ >> 9) + var5.z >> 6) + "," + ((Client.cameraX >> 9) + var5.x & 0x3F) + "," + ((Client.cameraZ >> 9) + var5.z & 0x3F) + " Height: " + (Client.getHeightmapY(Client.cameraX, Client.cameraZ, Client.localPlayerEntity.level) - Client.cameraY));
					addline("Look: " + Client.localPlayerEntity.level + "," + (Client.cameraLookX + var5.x >> 6) + "," + (Client.cameraLookZ + var5.z >> 6) + "," + (Client.cameraLookX + var5.x & 0x3F) + "," + (Client.cameraLookZ + var5.z & 0x3F) + " Height: " + (Client.getHeightmapY(Client.cameraLookX, Client.cameraLookZ, Client.localPlayerEntity.level) - Client.field1983));
				}
				return;
			}
		} catch (Exception var37) {
			addline(LocalisedText.DEBUG_CONSOLE_ERROR.forLang(Client.language));
			return;
		}
		if (Client.modewhere != ModeWhere.LIVE || Client.staffModLevel >= 2 || Client.ALLOW_COMMANDS_ANYWHERE) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Client.setWindowMode(1, -1, -1, false);
					if (Client.getWindowMode() == 1) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Client.setWindowMode(2, -1, -1, false);
					if (Client.getWindowMode() == 2) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (Fullscreen.allowed && arg0.equalsIgnoreCase("wm3")) {
					Client.setWindowMode(3, 1024, 768, false);
					if (Client.getWindowMode() == 3) {
						addline("Success");
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.startsWith("setlobby ")) {
					if (Client.state != 4) {
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
					Client.setToolkit(0, false);
					if (Client.preferences.displayMode.getValue() == 0) {
						addline("Success");
						Client.preferences.setPreference(Client.preferences.toolkit, 0);
						Preferences.save();
						Client.preferencesChangeNotified = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Client.setToolkit(1, false);
					if (Client.preferences.displayMode.getValue() == 1) {
						addline("Success");
						Client.preferences.setPreference(Client.preferences.toolkit, 1);
						Preferences.save();
						Client.preferencesChangeNotified = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Client.setToolkit(3, false);
					if (Client.preferences.displayMode.getValue() == 3) {
						addline("Success");
						Client.preferences.setPreference(Client.preferences.toolkit, 3);
						Preferences.save();
						Client.preferencesChangeNotified = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Client.setToolkit(5, false);
					if (Client.preferences.displayMode.getValue() == 5) {
						addline("Success");
						Client.preferences.setPreference(Client.preferences.toolkit, 5);
						Preferences.save();
						Client.preferencesChangeNotified = false;
					} else {
						addline("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (Client.state == 18) {
						Client.tryReconnect();
					} else if (Client.state == 3) {
						Client.gameConnection.disconnected = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					ServerConnection[] var15 = Client.connections;
					for (int var16 = 0; var16 < var15.length; var16++) {
						ServerConnection var17 = var15[var16];
						if (var17.getStream() != null) {
							var17.getStream().closeForcefully();
						}
					}
					Client.js5TcpClient.closeForcefully();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					int var18 = Integer.parseInt(arg0.substring(17));
					addline("varpbit=" + Client.localPlayerGameState.getVarBitValue(Client.localPlayerGameState.getVarBitType(var18)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					int var19 = Integer.parseInt(arg0.substring(14));
					addline("varp=" + Client.localPlayerGameState.getVarValueInt(Client.localPlayerGameState.getVarType(VarDomainType.PLAYER, var19)));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					String[] var20 = StringTools.split(arg0.substring(12), ' ');
					if (var20.length == 2 || var20.length == 3) {
						if (LoginManager.isInProgress()) {
							LoginManager.cancelLogin();
						}
						LoginManager.requestLogin(var20[0], var20[1], var20.length > 2 ? var20[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					String[] var21 = StringTools.split(arg0.substring(8), ' ');
					int var22 = Integer.parseInt(var21[0]);
					String var23 = var21.length > 1 ? var21[1] : "";
					LoginManager.requestSocialNetworkLogin(var22, var23, true);
					return;
				}
				if (arg0.startsWith("setoutput ")) {
					File var24 = new File(arg0.substring(10));
					if (var24.exists()) {
						var24 = new File(arg0.substring(10) + "." + MonotonicTime.get() + ".log");
						if (var24.exists()) {
							addline("file already exists!");
							return;
						}
					}
					if (field773 != null) {
						field773.close();
						field773 = null;
					}
					try {
						field773 = new FileOutputStream(var24);
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
					if (field773 != null) {
						field773.close();
					}
					field773 = null;
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
					String[] var29 = StringTools.split(StringTools.method17687(Cp1252.method667(var28), '\r', ""), '\n');
					method15383(var29);
				}
				if (Client.state == 18 || Client.state == 13) {
					ServerConnection var30 = Client.getCurrentConnection();
					ClientMessage var31 = ClientMessage.createMessage(ClientProt.CLIENT_CHEAT, var30.randomOut);
					var31.buf.p1(arg0.length() + 3);
					var31.buf.p1(arg1 ? 1 : 0);
					var31.buf.p1(arg2 ? 1 : 0);
					var31.buf.pjstr(arg0);
					var30.queue(var31);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				addline(LocalisedText.DEBUG_CONSOLE_ERROR.forLang(Client.language));
				return;
			}
		}
		if (Client.state != 18 && Client.state != 13 && !Client.ALLOW_COMMANDS_ANYWHERE) {
			addline(LocalisedText.DEBUG_CONSOLE_UNKNOWNCOMMAND.forLang(Client.language) + arg0);
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
					OcclusionManager var1 = Client.world.getScene().occlusionManager;
					var1.field7031 = !var1.field7031;
				} else if (arg0 == 25) {
					Client.field10794 = true;
				} else if (arg0 == 21) {
					Client.field10794 = false;
				} else if (arg0 == 10) {
					Client.textCoords.clear();
				} else if (arg0 == 5) {
					Client.removeSoftReferencesCaches();
					for (int var2 = 0; var2 < 10; var2++) {
						System.gc();
					}
					Runtime var3 = Runtime.getRuntime();
					int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
					addline("" + var4);
				} else if (arg0 == 20) {
					Client.removeSoftReferencesCaches();
					for (int var5 = 0; var5 < 10; var5++) {
						System.gc();
					}
					Runtime var6 = Runtime.getRuntime();
					int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					addline("" + var7);
					SceneManager.method7319();
					Client.removeSoftReferencesCaches();
					for (int var8 = 0; var8 < 10; var8++) {
						System.gc();
					}
					int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
					addline("" + var9);
				} else if (arg0 == 9) {
					addline(Client.hardwarePlatformLoader.method7909() ? "Success" : "Failure");
				} else if (arg0 == 23) {
					WorldSwitcher.currentWorld.configureSocketType();
				} else if (arg0 == 14) {
					Client.js5TcpClient.closeGracefully();
				} else if (arg0 == 6) {
					Client.js5TcpClient.sendCloseStream();
				} else if (arg0 == 26) {
					GameShell.canvas.setLocation(50, 50);
				} else if (arg0 == 22) {
					GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
				} else if (arg0 == 4) {
					method10153();
				} else if (arg0 == 17) {
					Client.world.field5056 = MonotonicTime.get();
					Client.world.field5037 = true;
					method10153();
				} else if (arg0 == 19) {
					Vector3 var10 = Client.localPlayerEntity.getTransform().trans;
					addline(((int) var10.x >> 9) + " " + ((int) var10.z >> 9));
				} else if (arg0 == 16) {
					Vector3 var11 = Client.localPlayerEntity.getTransform().trans;
					addline("" + Client.world.getScene().levelHeightmaps[Client.localPlayerEntity.level].getTileHeight((int) var11.x >> 9, (int) var11.z >> 9));
				} else if (arg0 == 27) {
					addline(Component.spriteCache.method2926() + " " + Component.spriteCache.method2925());
					addline(Component.modelCache.method2926() + " " + Component.modelCache.method2925());
				} else if (arg0 == 8) {
					Client.resetCaches(false);
				} else if (arg0 == 13) {
					Client.field10848 = !Client.field10848;
					Client.toolkit.method2253(Client.field10848);
					method16752();
					return;
				} else if (arg0 == 1) {
					Client.field11005 = 0;
					Client.world.rebuild();
				} else if (arg0 == 3) {
					Client.field11005 = 1;
					Client.world.rebuild();
				} else if (arg0 == 15) {
					Client.field11005 = 2;
					Client.world.rebuild();
				}
			} catch (Exception var13) {
				addline(LocalisedText.DEBUG_CONSOLE_ERROR.forLang(Client.language));
			}
		}
	}

	@ObfuscatedName("xi.q(B)V")
	public static void method10153() {
		if (Client.preferences.unknown7.getValue() == 1) {
			Client.asyncRebuild.method7680(new RebuildRequest(RebuildType.field5070, null));
		} else {
			Client.world.rebuild();
			MiniMap.rebuild();
		}
	}
}
