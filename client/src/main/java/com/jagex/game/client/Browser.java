package com.jagex.game.client;

import deob.ObfuscatedName;

import java.applet.Applet;
import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("sx")
public class Browser {

	@ObfuscatedName("sx.e")
	public static Applet field6574 = null;

	@ObfuscatedName("sx.n")
	public static String field6575 = null;

	public Browser() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uk.e(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method9163(Applet arg0, String arg1) {
		field6574 = arg0;
		field6575 = arg1;
	}

	@ObfuscatedName("ii.n(Ljava/lang/String;ZZB)V")
	public static void openUrl(String arg0, boolean arg1, boolean arg2) {
		method6081(arg0, arg1, "openjs", arg2);
	}

	@ObfuscatedName("nz.m(Ljava/lang/String;ZLjava/lang/String;ZB)V")
	public static void method6081(String arg0, boolean arg1, String arg2, boolean arg3) {
		if (!arg1) {
			method4408(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (Exception var5) {
			}
		}
		if (field6575.startsWith("win") && !arg3) {
			method4408(arg0, 0);
			return;
		}
		if (field6575.startsWith("mac")) {
			method2898(arg0, 1, arg2);
			return;
		}
		method4408(arg0, 2);
	}

	@ObfuscatedName("iu.k(Ljava/lang/String;II)Z")
	public static boolean method4408(String arg0, int arg1) {
		return method2898(arg0, arg1, "openjs");
	}

	@ObfuscatedName("ew.f(Ljava/lang/String;ILjava/lang/String;S)Z")
	public static boolean method2898(String arg0, int arg1, String arg2) {
		if (arg1 == 0) {
			try {
				if (!field6575.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int var4 = 0; var4 < arg0.length(); var4++) {
						if (var3.indexOf(arg0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (Throwable var11) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				Object var6 = BrowserControl.call(field6574, arg2, new Object[] { (new URL(field6574.getCodeBase(), arg0)).toString() });
				return var6 != null;
			} catch (Throwable var12) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				field6574.getAppletContext().showDocument(new URL(field6574.getCodeBase(), arg0), "_blank");
				return true;
			} catch (Exception var13) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				BrowserControl.call(field6574, "loggedout");
			} catch (Throwable var15) {
			}
			try {
				field6574.getAppletContext().showDocument(new URL(field6574.getCodeBase(), arg0), "_top");
				return true;
			} catch (Exception var14) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
