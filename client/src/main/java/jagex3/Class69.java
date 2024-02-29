package jagex3;

import java.applet.Applet;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acs")
public final class Class69 {

	@OriginalMember(owner = "client!acs", name = "f", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!acs", name = "e", descriptor = "[[Ljava/lang/String;")
	static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@OriginalMember(owner = "client!acs", name = "n", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!acs", name = "m", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!acs", name = "b", descriptor = "(J)V")
	static void method1207(@OriginalArg(0) long arg0) {
		aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "ag", descriptor = "(IIIIII)J")
	public static long method1208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar2.clear();
		aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!acs", name = "r", descriptor = "(JI)Ljava/lang/String;")
	public static String method1209(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class474.method29847(arg0, arg1, (byte) -110) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acs", name = "v", descriptor = "(JIZ)Ljava/lang/String;")
	public static String method1210(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class543.method31128(arg0);
			local5 = aCalendar2;
		} else {
			Class337.method27552(arg0);
			local5 = aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class362.method28029(arg0, arg1, arg2, (byte) 24) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "ai", descriptor = "(J)I")
	public static int method1211(@OriginalArg(0) long arg0) {
		Class337.method27552(arg0);
		return aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!acs", name = "y", descriptor = "(JI)Ljava/lang/String;")
	static String method1212(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(11) int local11 = aCalendar1.get(2) + 1;
		@Pc(15) int local15 = aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "q", descriptor = "(JI)Ljava/lang/String;")
	public static String method1213(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(11);
		@Pc(9) int local9 = aCalendar1.get(12);
		@Pc(13) int local13 = aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "x", descriptor = "(JI)Ljava/lang/String;")
	public static String method1214(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(11);
		@Pc(9) int local9 = aCalendar1.get(12);
		@Pc(13) int local13 = aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "h", descriptor = "(J)V")
	static void method1215(@OriginalArg(0) long arg0) {
		aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "t", descriptor = "(J)V")
	static void method1216(@OriginalArg(0) long arg0) {
		aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "c", descriptor = "(JI)Ljava/lang/String;")
	public static String method1217(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class474.method29847(arg0, arg1, (byte) -19) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acs", name = "g", descriptor = "(J)V")
	static void method1218(@OriginalArg(0) long arg0) {
		aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "i", descriptor = "(J)V")
	static void method1219(@OriginalArg(0) long arg0) {
		aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "j", descriptor = "(J)V")
	static void method1220(@OriginalArg(0) long arg0) {
		aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "a", descriptor = "(J)V")
	static void method1221(@OriginalArg(0) long arg0) {
		aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acs", name = "ae", descriptor = "(IIIIII)J")
	public static long method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar2.clear();
		aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!acs", name = "s", descriptor = "(JI)Ljava/lang/String;")
	static String method1223(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(11) int local11 = aCalendar1.get(2) + 1;
		@Pc(15) int local15 = aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "ah", descriptor = "(IIIIII)J")
	public static long method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar2.clear();
		aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!acs", name = "al", descriptor = "(I)J")
	public static long method1225(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!acs", name = "ac", descriptor = "(J)I")
	public static int method1226(@OriginalArg(0) long arg0) {
		Class337.method27552(arg0);
		return aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!acs", name = "o", descriptor = "(JIZ)Ljava/lang/String;")
	public static String method1227(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class543.method31128(arg0);
			local5 = aCalendar2;
		} else {
			Class337.method27552(arg0);
			local5 = aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class362.method28029(arg0, arg1, arg2, (byte) 24) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!acs", name = "er", descriptor = "(Lclient!pq;ZFFFFIII)V")
	static void method1228(@OriginalArg(0) Class489 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = client.aClass532_1.method30631(-1884407916);
		@Pc(7) int local7 = client.aClass532_1.method30657(-953546015);
		arg0.method30117(arg2, arg3, arg4, arg5, (float) local7, (float) local3, (float) arg6, (float) arg7);
	}

	@OriginalMember(owner = "client!acs", name = "s", descriptor = "(I)V")
	static void method1229(@OriginalArg(0) int arg0) {
		Class158_Sub1.anIntArray183[44] = 71;
		Class158_Sub1.anIntArray183[45] = 26;
		Class158_Sub1.anIntArray183[46] = 72;
		Class158_Sub1.anIntArray183[47] = 73;
		Class158_Sub1.anIntArray183[59] = 57;
		Class158_Sub1.anIntArray183[61] = 27;
		Class158_Sub1.anIntArray183[91] = 42;
		Class158_Sub1.anIntArray183[92] = 74;
		Class158_Sub1.anIntArray183[93] = 43;
		Class158_Sub1.anIntArray183[192] = 28;
		Class158_Sub1.anIntArray183[222] = 58;
		Class158_Sub1.anIntArray183[520] = 59;
	}

	@OriginalMember(owner = "client!acs", name = "<init>", descriptor = "()V")
	Class69() throws Throwable {
		throw new Error();
	}
}
