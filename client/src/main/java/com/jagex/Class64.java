package com.jagex;

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aco")
public final class Class64 {

	@OriginalMember(owner = "client!aco", name = "e", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
	public static Object method1220(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) byte arg3) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!aco", name = "f", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method1221(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1222(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!aco", name = "u", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method1223(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!aco", name = "g", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1224(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!aco", name = "t", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method1225(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!aco", name = "i", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1226(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!aco", name = "m", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method1227(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!aco", name = "<init>", descriptor = "()V")
	Class64() throws Throwable {
		throw new Error();
	}
}
