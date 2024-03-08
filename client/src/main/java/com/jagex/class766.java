package com.jagex;

import deob.ObfuscatedName;
import netscape.javascript.JSObject;

import java.applet.Applet;

@ObfuscatedName("act")
public class class766 {

	public class766() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("act.e(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method14961(Applet arg0, String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("act.n(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method14969(Applet arg0, String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@ObfuscatedName("act.m(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object method14960(Applet arg0, String arg1, Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
