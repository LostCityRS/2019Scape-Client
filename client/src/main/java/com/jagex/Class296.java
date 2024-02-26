package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class296 {

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
	static final int anInt3954 = 11745;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "J")
	public static final long aLong360 = 1000L;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "J")
	public static final long aLong361 = 60000L;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "J")
	static final long aLong362 = 86400000L;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Ljava/util/Map;")
	static Map aMap17;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Ljava/util/HashMap;")
	static final HashMap aHashMap9 = new HashMap();

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Ljava/util/Calendar;")
	static final Calendar aCalendar4 = Calendar.getInstance(method26974("Europe/London", 2141632702));

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26970(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "(Ljava/util/Date;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method26971(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		return method26975(arg0, arg1, method26978(-65535), Class719.aClass719_4, 1237090828);
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I")
	public static int method26972(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
	static TimeZone method26973(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;")
	static TimeZone method26974(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zv;I)Ljava/lang/String;")
	static String method26975(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class719 arg3, @OriginalArg(4) int arg4) {
		if (aMap17 == null) {
			aMap17 = new HashMap(7);
			@Pc(10) Class719[] local10 = Class719.method37282((byte) -10);
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class719 local20 = local10[local12];
				aMap17.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap17.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method37273(-1311622300));
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I")
	public static int method26976(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "(II)Ljava/util/Date;")
	public static Date method26977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)Ljava/util/TimeZone;")
	static TimeZone method26978(@OriginalArg(0) int arg0) {
		return method26974("Europe/London", 893519168);
	}

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zv;)Ljava/lang/String;")
	static String method26979(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class719 arg3) {
		if (aMap17 == null) {
			aMap17 = new HashMap(7);
			@Pc(10) Class719[] local10 = Class719.method37282((byte) 57);
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class719 local20 = local10[local12];
				aMap17.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap17.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method37273(-624122720));
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "()Ljava/util/TimeZone;")
	static TimeZone method26980() {
		return method26974("Europe/London", 942463868);
	}

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "()Ljava/util/TimeZone;")
	static TimeZone method26981() {
		return method26974("Europe/London", 1490009104);
	}

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "()Ljava/util/TimeZone;")
	static TimeZone method26982() {
		return method26974("Europe/London", 1537278509);
	}

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
	static TimeZone method26983(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;")
	static TimeZone method26984(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()Ljava/util/TimeZone;")
	static TimeZone method26985() {
		return method26974("Europe/London", 1318658595);
	}

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26986(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26987(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26988(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26989(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26990(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I")
	public static int method26991(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26992(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I")
	public static int method26993(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Ljava/util/Date;")
	public static Date method26994(@OriginalArg(0) int arg0) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "(Lclient!arz;I)V")
	static void method26995(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return;
		}
		Class630.aClass8_55.method232(arg0, 1621279066);
		Class630.anInt5553 += 862926799;
		@Pc(12) Class80_Sub1_Sub4 local12 = null;
		if (arg0.aBoolean589 || "".equals(arg0.aString105)) {
			local12 = new Class80_Sub1_Sub4(arg0.aString105);
			Class630.anInt5554 += -561979003;
		} else {
			@Pc(25) long local25 = arg0.aLong249 * -6321316696381466459L;
			for (local12 = (Class80_Sub1_Sub4) Class630.aClass24_35.method560(local25); local12 != null && !local12.aString95.equals(arg0.aString105); local12 = (Class80_Sub1_Sub4) Class630.aClass24_35.method558((byte) 0)) {
			}
			if (local12 == null) {
				local12 = (Class80_Sub1_Sub4) Class630.aClass243_89.method26282(local25);
				if (local12 != null && !local12.aString95.equals(arg0.aString105)) {
					local12 = null;
				}
				if (local12 == null) {
					local12 = new Class80_Sub1_Sub4(arg0.aString105);
				}
				Class630.aClass24_35.method563(local12, local25);
				Class630.anInt5554 += -561979003;
			}
		}
		if (local12.method21706(arg0, 1951580292)) {
			Class162_Sub1.method15720(local12, -1740660730);
		}
	}

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "(Lclient!asa;B)V")
	static void method26996(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) byte arg1) {
		arg0.method22560(1668075746);
		@Pc(6) int local6 = client.anInt3558 * 188678613;
		@Pc(19) Class120_Sub1_Sub1_Sub1_Sub2 local19 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
		local19.anInt2671 = local6 * -486069653;
		@Pc(29) int local29 = arg0.method22559(30, -325783685);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class626 local48 = client.aClass539_1.method30893((byte) -8);
		local19.anIntArray234[0] = local40 - local48.anInt5540 * -390642507;
		local19.anIntArray242[0] = local44 - local48.anInt5537 * -894305615;
		local19.method24531((float) ((local19.anIntArray234[0] << 9) + (local19.method18966((byte) -122) << 8)), local19.method24554().aClass463_61.aFloat295, (float) ((local19.anIntArray242[0] << 9) + (local19.method18966((byte) -84) << 8)));
		Class507.anInt5045 = (local19.aByte99 = local19.aByte100 = local34) * -1165759125;
		if (client.aClass539_1.method30903(-463929735).method30429(local19.anIntArray234[0], local19.anIntArray242[0], 2069744072)) {
			local19.aByte100++;
		}
		if (Class51.aPacketArray1[local6] != null) {
			local19.method19053(Class51.aPacketArray1[local6], 1933367219);
		}
		if (Class51.aPacketArray2[local6] != null) {
			local19.method19054(Class51.aPacketArray2[local6], 2015216348);
		}
		Class51.anInt191 = 0;
		Class51.anIntArray20[(Class51.anInt191 += -585441073) * 44967471 - 1] = local6;
		Class51.aByteArray18[local6] = 0;
		Class51.anInt192 = 0;
		for (@Pc(173) int local173 = 1; local173 < 2048; local173++) {
			if (local173 != local6) {
				@Pc(185) int local185 = arg0.method22559(18, -325783685);
				@Pc(191) int local191 = local185 >> 16 & 0x3;
				@Pc(197) int local197 = local185 >> 8 & 0xFF;
				@Pc(201) int local201 = local185 & 0xFF;
				@Pc(209) Class543 local209 = Class51.aClass543Array1[local173] = new Class543();
				local209.anInt5122 = ((local197 << 14) + (local191 << 28) + local201) * -344784041;
				local209.anInt5123 = 0;
				local209.anInt5124 = 1760051131;
				local209.aClass289_5 = Class289.aClass289_2;
				local209.aBoolean905 = false;
				Class51.anIntArray21[(Class51.anInt192 += -1283238939) * -2044546579 - 1] = local173;
				Class51.aByteArray18[local173] = 0;
			}
		}
		arg0.method22568(178350976);
		@Pc(259) Class340 local259 = Class160.aClass121_Sub1_2.method9607(-1663575425);
		if (Class340.aClass340_7 == local259) {
			@Pc(267) Class123_Sub3 local267 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1584877514);
			local267.method10000((byte) 102);
		}
		@Pc(274) Class347 local274 = Class160.aClass121_Sub1_2.method9702(786823149);
		if (local274 == Class347.aClass347_3) {
			@Pc(282) Class20_Sub5 local282 = (Class20_Sub5) Class160.aClass121_Sub1_2.method9693(1894638147);
			local282.method16939(1950215551);
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(Lclient!yp;I)V")
	static void method26997(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class513.method30570(local14, local25, (byte) 112);
	}

	@OriginalMember(owner = "client!gq", name = "lx", descriptor = "(Lclient!hx;I)V")
	public static void method26998(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3560 * -664100501 == arg0.anInt4088 * 91374973) {
			client.aBooleanArray19[arg0.anInt4181 * -1531336755] = true;
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(Lclient!di;J)V")
	public static void method26999(@OriginalArg(0) Class102 arg0, @OriginalArg(1) long arg1) {
		if (Class622.anInt5483 * -1525318091 == 3 || Class622.anInt5483 * -1525318091 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (Class622.anInt5483 * -1525318091 == 1) {
			if (Class622.aStringArray32 == null || Class622.aStringArray32.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < Class622.aStringArray32.length; local29++) {
				if (Class622.aStringArray32[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class373.aClass586_1.method31865(Class622.aStringArray32[local29], false, (byte) 106);
					} catch (@Pc(49) Exception_Sub1 local49) {
						Class115_Sub1.method8671(Class70.aClass70_2, local49.aString70, local49.anInt2514 * -1965296183, local49.getCause(), -199906023);
						Class622.anInt5483 = 1209871447;
						return;
					}
				}
			}
			Class622.anInt5482 = local27 / Class622.aStringArray32.length * 301420519;
			if (Class622.anInt5482 * -168012841 != 100) {
				return;
			}
			Class622.anInt5483 = Class393.method28690((short) 617) * -1028365283;
			if (Class622.anInt5483 * -1525318091 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class669.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class229.method25998(local106, arg1)) {
					@Pc(115) Class601 local115 = local106.f();
					if (local115 != null) {
						Class312.method27463(local115.method37268(), local106, (byte) 24);
					}
				}
			}
		}
		if (Class669.aTwitchTV1.IsStreaming() && arg1 - Class622.aLong399 * -2257738343657064197L > Class116_Sub1.aLong33 * -4022348017745010779L) {
			Class622.aLong399 = arg1 * -5746832404463840717L;
			if (arg0.method20694()) {
				Class622.aBoolean934 = true;
			}
		}
		if (!Class669.aTwitchTV1.IsStreaming()) {
			Class622.anInt5472 = 0;
		} else if (arg1 - Class622.aLong400 * -1315910636336695373L < (long) (Class622.anInt5474 * 324842939)) {
			Class622.anInt5472 = 814561402;
		} else if (arg1 - Class622.aLong398 * -71842521790187563L < (long) (Class622.anInt5474 * 324842939)) {
			Class622.anInt5472 = -1740202947;
		} else {
			Class622.anInt5472 = 0;
		}
		if (arg1 - Class622.aLong401 * 2093873323454684451L > (long) (Class622.anInt5481 * 2012339063) && Class669.aTwitchTV1.GetWebcamState() == 5) {
			Class669.aTwitchTV1.RestartWebcamDevice();
			Class622.aLong401 = arg1 * 6599029287603157643L;
		}
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	Class296() throws Throwable {
		throw new Error();
	}
}
