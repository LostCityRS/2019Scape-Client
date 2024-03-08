package com.jagex;

import deob.ObfuscatedName;
//import netscape.javascript.JSObject;

import java.applet.Applet;

@ObfuscatedName("act")
public class BrowserControl {

	public BrowserControl() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("act.e(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void eval(Applet arg0, String arg1) throws Throwable {
		// JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("act.n(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object call(Applet arg0, String arg1) throws Throwable {
		return null; // JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@ObfuscatedName("act.m(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object call(Applet arg0, String arg1, Object[] arg2) throws Throwable {
		return null; // JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
