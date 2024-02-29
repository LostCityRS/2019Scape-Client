package jagex3;

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class646 {

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
	public static final int anInt5954 = 6;

	@OriginalMember(owner = "client!wt", name = "alg", descriptor = "(Lclient!yf;B)V")
	static void method32788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (Class4.aBoolean2) {
			@Pc(17) Class14[] local17 = Class124_Sub3.method21465(16711935);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17[local12].anInt49 * -1362482655;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17[local12].anInt50 * 72041005;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!wt", name = "ek", descriptor = "(IIIIB)V")
	static void method32789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(5) float local5 = (float) Class159_Sub1.anInt1922 / (float) Class159_Sub1.anInt1923;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) (local5 * (float) arg2);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class93_Sub14.anInt1527 = local34 * Class159_Sub1.anInt1923 / local7 * -1845499089;
		Class159_Sub1.anInt1952 = (Class159_Sub1.anInt1922 - local42 * Class159_Sub1.anInt1922 / local9) * 1415476369;
		Class159_Sub1.anInt1956 = -130712985;
		Class159_Sub1.anInt1951 = -919990023;
		Class358.method27961(-1310338920);
	}

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "(I)Ljava/lang/String;")
	public static String method32790(@OriginalArg(0) int arg0) {
		return Class556.aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method32791(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class166_Sub35.method16241(arg1, Integer.MIN_VALUE);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class273.method26422(local1, (short) 27038);
			local1 = Class25_Sub2.method16033(local1, (byte) 73);
			@Pc(41) URL local41 = null;
			if (Class69.anApplet1 != null) {
				local41 = Class69.anApplet1.getCodeBase();
			} else if (RuntimeException_Sub1.anInterface59_1 != null) {
				local41 = RuntimeException_Sub1.anInterface59_1.method30938((byte) -65);
			}
			if (local41 == null) {
				return;
			}
			@Pc(60) String local60 = "Unknown";
			@Pc(62) String local62 = "1.1";
			try {
				local60 = System.getProperty("java.vendor");
				local62 = System.getProperty("java.version");
			} catch (@Pc(70) Exception local70) {
			}
			@Pc(126) URL local126 = new URL(local41, "clienterror.ws?c=" + RuntimeException_Sub1.anInt3188 * 978703369 + "&cs=" + RuntimeException_Sub1.anInt3189 * -1468759271 + "&u=" + (RuntimeException_Sub1.aString116 == null ? "" + RuntimeException_Sub1.aLong210 * -7577937061430114655L : Class25_Sub2.method16033(RuntimeException_Sub1.aString116, (byte) 73)) + "&v1=" + Class25_Sub2.method16033(local60, (byte) 73) + "&v2=" + Class25_Sub2.method16033(local62, (byte) 73) + "&e=" + local1);
			@Pc(132) DataInputStream local132 = new DataInputStream(local126.openStream());
			local132.read();
			local132.close();
		} catch (@Pc(139) Exception local139) {
			local139.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	Class646() throws Throwable {
		throw new Error();
	}
}
