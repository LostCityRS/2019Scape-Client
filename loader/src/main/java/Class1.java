import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
class Class1 {

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "I")
	static int anInt48;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	static int anInt49;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	static int anInt50;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	static void method30(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		anInt49++;
		try {
			@Pc(7) String local7 = "";
			if (arg2 >= -51) {
				method32(null, -11);
			}
			if (arg0 != null) {
				local7 = Class3.method24((byte) 13, arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			@Pc(55) PrintStream local55 = System.out;
			@Pc(57) String local57 = local7;
			for (@Pc(63) int local63 = local7.indexOf("%0a"); local63 != -1; local63 = local57.indexOf("%0a", local63 + "\n".length())) {
				local57 = local57.substring(0, local63) + "\n" + local57.substring(local63 - -"%0a".length());
			}
			local55.println("Error: " + local57);
			local7 = Class1_Sub1_Sub1_Sub1.method33(43, local7);
			@Pc(124) URL local124 = null;
			if (Class1_Sub1_Sub1.anApplet4 != null) {
				local124 = Class1_Sub1_Sub1.anApplet4.getCodeBase();
			} else if (Class6.aClass1_8 != null) {
				local124 = method32(Class6.aClass1_8, 1097100413);
			}
			if (local124 == null) {
				return;
			}
			@Pc(150) String local150 = "Unknown";
			local57 = "1.1";
			try {
				local150 = System.getProperty("java.vendor");
				local57 = System.getProperty("java.version");
			} catch (@Pc(166) Exception local166) {
			}
			@Pc(236) URL local236 = new URL(local124, "clienterror.ws?c=" + Class1_Sub1.anInt52 * 1097100413 + "&cs=" + Class1_Sub1.anInt53 * -994818673 + "&u=" + (Class3.aString2 == null ? "" + Rs2Applet.aLong1 * -5154411780920651527L : Class1_Sub1_Sub1_Sub1.method33(43, Class3.aString2)) + "&v1=" + Class1_Sub1_Sub1_Sub1.method33(43, local150) + "&v2=" + Class1_Sub1_Sub1_Sub1.method33(43, local57) + "&e=" + local7);
			@Pc(242) DataInputStream local242 = new DataInputStream(local236.openStream());
			local242.read();
			local242.close();
		} catch (@Pc(249) Exception local249) {
			local249.printStackTrace();
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Lloader!d;ZLjava/lang/String;[B)V")
	static void method31(@OriginalArg(0) Class1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte[] arg3) {
		((Hashtable) ((Class1_Sub1_Sub1_Sub1_Sub1_Sub1) arg0).anObject16).put(arg2, arg3);
		anInt48++;
		if (arg1) {
			;
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Lloader!d;I)Ljava/net/URL;")
	private static URL method32(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		anInt50++;
		if (arg1 == 1097100413) {
			throw new IllegalStateException();
		}
		return (URL) null;
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(I)V")
	Class1(@OriginalArg(0) int arg0) {
	}
}
