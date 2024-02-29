package jagex3;

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!act")
public final class Class70 {

	@OriginalMember(owner = "client!act", name = "m", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object method1230(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!act", name = "e", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method1231(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!act", name = "p", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method1232(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!act", name = "k", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method1233(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!act", name = "l", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1234(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!act", name = "f", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method1235(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!act", name = "w", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method1236(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!act", name = "u", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1237(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!act", name = "z", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method1238(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!act", name = "n", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method1239(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!act", name = "<init>", descriptor = "()V")
	Class70() throws Throwable {
		throw new Error();
	}
}
