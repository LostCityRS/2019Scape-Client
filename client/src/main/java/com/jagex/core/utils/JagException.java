package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.applet.Applet;
import java.io.*;
import java.net.URL;

@ObfuscatedName("atc")
public class JagException extends RuntimeException {

	@ObfuscatedName("atc.e")
	public static long field12496;

	@ObfuscatedName("atc.n")
	public static String user;

	@ObfuscatedName("atc.m")
	public static int field12493;

	@ObfuscatedName("atc.k")
	public static int field12494;

	@ObfuscatedName("acs.f")
	public static Applet field9164;

	@ObfuscatedName("atc.w")
	public static URLWrapper field12495 = null;

	@ObfuscatedName("atc.l")
	public String field12491;

	@ObfuscatedName("atc.u")
	public Throwable field12497;

	public JagException(Throwable arg0, String arg1) {
		this.field12491 = arg1;
		this.field12497 = arg0;
		this.initCause(arg0);
	}

	@ObfuscatedName("wt.e(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void report(String arg0, Throwable arg1) {
		arg1.printStackTrace();

		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = method18769(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg0;
			}
			method3380(var2);
			String var3 = WebTools.urlencode(var2);
			URL var4 = null;
			if (field9164 != null) {
				var4 = field9164.getCodeBase();
			} else if (field12495 != null) {
				var4 = field12495.method7892((byte) -65);
			}
			if (var4 == null) {
				return;
			}
			String var5 = "Unknown";
			String var6 = "1.1";
			try {
				var5 = System.getProperty("java.vendor");
				var6 = System.getProperty("java.version");
			} catch (Exception var11) {
			}

			try {
				URL var8 = new URL(var4, "clienterror.ws?c=" + field12493 + "&cs=" + field12494 + "&u=" + (user == null ? "" + field12496 : WebTools.urlencode(user)) + "&v1=" + WebTools.urlencode(var5) + "&v2=" + WebTools.urlencode(var6) + "&e=" + var3);
				DataInputStream var9 = new DataInputStream(var8.openStream());
				var9.read();
				var9.close();
			} catch (IOException var12) {
				System.err.println("Failed to report exception to clienterror.ws");
			}
		} catch (Exception var12) {
			var12.printStackTrace();
		}
	}

	@ObfuscatedName("atl.n(Ljava/lang/Throwable;Ljava/lang/String;)Latc;")
	public static JagException report(Throwable arg0, String arg1) {
		JagException var2;
		if (arg0 instanceof JagException) {
			var2 = (JagException) arg0;
			var2.field12491 = var2.field12491 + ' ' + arg1;
		} else {
			var2 = new JagException(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("anl.m(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method18769(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof JagException) {
			JagException var1 = (JagException) arg0;
			var2 = var1.field12491 + " | ";
			arg0 = var1.field12497;
		} else {
			var2 = "";
		}
		StringWriter var3 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var3);
		arg0.printStackTrace(var4);
		var4.close();
		String var5 = var3.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();
		while (true) {
			String var8 = var6.readLine();
			if (var8 == null) {
				return var2 + "| " + var7;
			}
			int var10 = var8.indexOf(40);
			int var11 = var8.indexOf(41, var10 + 1);
			String var12;
			if (var10 == -1) {
				var12 = var8;
			} else {
				var12 = var8.substring(0, var10);
			}
			String var13 = var12.trim();
			String var14 = var13.substring(var13.lastIndexOf(32) + 1);
			String var15 = var14.substring(var14.lastIndexOf(9) + 1);
			String var16 = var2 + var15;
			if (var10 != -1 && var11 != -1) {
				int var17 = var8.indexOf(".java:", var10);
				if (var17 >= 0) {
					var16 = var16 + var8.substring(var17 + 5, var11);
				}
			}
			var2 = var16 + ' ';
		}
	}

	@ObfuscatedName("fr.k(Ljava/lang/String;S)V")
	public static final void method3380(String arg0) {
		System.out.println("Error: " + method9588(arg0, "%0a", "\n"));
	}

	@ObfuscatedName("vn.f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static final String method9588(String arg0, String arg1, String arg2) {
		for (int var3 = arg0.indexOf(arg1); var3 != -1; var3 = arg0.indexOf(arg1, var3 + arg2.length())) {
			arg0 = arg0.substring(0, var3) + arg2 + arg0.substring(var3 + arg1.length());
		}
		return arg0;
	}
}
