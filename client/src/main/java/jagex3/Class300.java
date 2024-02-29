package jagex3;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class300 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gt", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_14;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "Lclient!gy;")
	final Class304 aClass304_2;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "(I)I")
	public static int method26809(@OriginalArg(0) int arg0) {
		return Class653.aClass357_1.method27913(593453344);
	}

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "(I)I")
	static int method26810(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = Class146.aClass370_3.anInt4751 * -909097621;
		if (local4 < Class362.aClass370Array1.length - 1) {
			Class146.aClass370_3 = Class362.aClass370Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!gt", name = "ej", descriptor = "(Lclient!yf;I)V")
	static void method26811(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1853806941);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class275.method26435(local16, local22, arg0, -1627776056);
	}

	@OriginalMember(owner = "client!gt", name = "bbt", descriptor = "(Lclient!yf;I)V")
	static void method26812(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method26813(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		return Class27.method591(arg0, (int) arg0.length(), -185960568);
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(IIIB)I")
	public static int method26814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(7) int local7 = Class8.method136(arg2 - arg1 + 1, -20435152);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 & ~local11;
	}

	@OriginalMember(owner = "client!gt", name = "de", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;IIB)Z")
	static boolean method26815(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		if (Class159_Sub1.aBoolean348 && !client.aBoolean622 && !Class159_Sub1.method14531(arg1.anInt1605 * 1012619213, arg1.anInt1608 * -2087611449)) {
			return false;
		}
		if (arg2.anIntArray400 != null) {
			arg2 = arg2.method27345(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface23_2, (short) 565);
			if (arg2 == null) {
				return false;
			}
		}
		@Pc(30) int local30 = Integer.MAX_VALUE;
		@Pc(32) int local32 = Integer.MIN_VALUE;
		@Pc(34) int local34 = Integer.MAX_VALUE;
		@Pc(36) int local36 = Integer.MIN_VALUE;
		if (arg2.anIntArray401 != null) {
			local30 = (arg2.anInt4145 * -975351719 + arg1.anInt1605 * 1012619213 - Class159_Sub1.anInt1937) * (Class159_Sub1.anInt1941 - Class159_Sub1.anInt1919) / (Class159_Sub1.anInt1939 - Class159_Sub1.anInt1937) + Class159_Sub1.anInt1919;
			local32 = (Class159_Sub1.anInt1941 - Class159_Sub1.anInt1919) * (arg2.anInt4163 * 141650771 + arg1.anInt1605 * 1012619213 - Class159_Sub1.anInt1937) / (Class159_Sub1.anInt1939 - Class159_Sub1.anInt1937) + Class159_Sub1.anInt1919;
			local36 = Class159_Sub1.anInt1942 - (arg1.anInt1608 * -2087611449 + arg2.anInt4162 * -1564254457 - Class159_Sub1.anInt1940) * (Class159_Sub1.anInt1942 - Class159_Sub1.anInt1934) / (Class159_Sub1.anInt1938 - Class159_Sub1.anInt1940);
			local34 = Class159_Sub1.anInt1942 - (arg1.anInt1608 * -2087611449 + arg2.anInt4164 * 226143903 - Class159_Sub1.anInt1940) * (Class159_Sub1.anInt1942 - Class159_Sub1.anInt1934) / (Class159_Sub1.anInt1938 - Class159_Sub1.anInt1940);
		}
		@Pc(130) Class100 local130 = null;
		@Pc(132) int local132 = 0;
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = 0;
		if (arg2.anInt4167 * -498063801 != -1) {
			if (arg1.aBoolean341 && arg2.anInt4170 * 2059687735 != -1) {
				local130 = arg2.method27346(arg0, true, 2146874587);
			} else {
				local130 = arg2.method27346(arg0, false, 2094701490);
			}
			if (local130 != null) {
				switch(arg2.aClass319_4.anInt4138 * -964115205) {
					case 0:
						local132 = arg1.anInt1606 * 704671089 - local130.method18172();
						local134 = arg1.anInt1606 * 704671089;
						break;
					case 1:
						local132 = arg1.anInt1606 * 704671089;
						local134 = arg1.anInt1606 * 704671089 + local130.method18172();
						break;
					case 2:
						local132 = arg1.anInt1606 * 704671089 - (local130.method18172() + 1 >> 1);
						local134 = arg1.anInt1606 * 704671089 + (local130.method18172() + 1 >> 1);
				}
				switch(arg2.aClass328_1.anInt4185 * 781808927) {
					case 0:
						local136 = arg1.anInt1607 * 1844815193 - local130.method18178();
						local138 = arg1.anInt1607 * 1844815193;
						break;
					case 1:
						local136 = arg1.anInt1607 * 1844815193;
						local138 = arg1.anInt1607 * 1844815193 + local130.method18178();
						break;
					case 2:
						local136 = arg1.anInt1607 * 1844815193 - (local130.method18178() + 1 >> 1);
						local138 = arg1.anInt1607 * 1844815193 + (local130.method18178() + 1 >> 1);
				}
				if (local132 < local30) {
					local30 = local132;
				}
				if (local134 > local32) {
					local32 = local134;
				}
				if (local136 < local34) {
					local34 = local136;
				}
				if (local138 > local36) {
					local36 = local138;
				}
			}
		}
		@Pc(306) Class100 local306 = null;
		if (arg2.anInt4153 * -2050445699 != -1) {
			local306 = arg2.method27347(arg0, (byte) -93);
		}
		@Pc(319) int local319 = 0;
		@Pc(321) int local321 = 0;
		@Pc(323) int local323 = 0;
		@Pc(325) int local325 = 0;
		@Pc(327) int local327 = 0;
		@Pc(329) int local329 = 0;
		@Pc(331) int local331 = 0;
		@Pc(333) int local333 = 0;
		if (arg2.aString180 != null) {
			Class254.method26094(arg2.anInt4157 * 1579741579, -1078358079);
			if (Class171.aClass106_9 != null) {
				local333 = Class129_Sub2.aClass5_13.method49(arg2.aString180, Class553.anInt3408 * -1378711501, 0, null, (byte) 0);
				local323 = Class129_Sub2.aClass5_13.method55(arg2.aString180, Class553.anInt3408 * -1378711501, null, -1910907678);
				local319 = arg1.anInt1606 * 704671089 - local323 / 2 + (Class159_Sub1.anInt1941 - Class159_Sub1.anInt1919) * arg2.anInt4172 * 2089237947 / (Class159_Sub1.anInt1939 - Class159_Sub1.anInt1937);
				local321 = arg1.anInt1607 * 1844815193 - arg2.anInt4161 * -876461677 * (Class159_Sub1.anInt1942 - Class159_Sub1.anInt1934) / (Class159_Sub1.anInt1938 - Class159_Sub1.anInt1940);
				if (local130 == null) {
					local321 -= local333 / 2;
				} else {
					local321 -= (local130.method18178() >> 1) + local333;
				}
				local325 = local319 + arg3;
				if (local325 < local30) {
					local30 = local325;
				}
				local327 = local323 + local319 + arg3;
				if (local327 > local32) {
					local32 = local327;
				}
				local329 = arg4 + local321;
				if (local329 < local34) {
					local34 = local329;
				}
				local331 = local333 + local321 + arg4;
				if (local331 > local36) {
					local36 = local331;
				}
			}
		}
		if (local32 < Class159_Sub1.anInt1919 || local30 > Class159_Sub1.anInt1941 || local36 < Class159_Sub1.anInt1934 || local34 > Class159_Sub1.anInt1942) {
			return true;
		}
		Class159_Sub1.method14530(arg0, arg1, arg2);
		if (local130 != null) {
			@Pc(489) int local489 = 0;
			@Pc(491) int local491 = 0;
			@Pc(493) int local493 = 0;
			@Pc(495) int local495 = 0;
			@Pc(497) int local497 = 0;
			@Pc(499) int local499 = 0;
			switch(arg2.aClass319_4.anInt4138 * -964115205) {
				case 0:
					local489 = local130.method18201();
					local491 = (local130.method18201() + 1) / 2;
					local493 = local130.method18172();
					break;
				case 1:
					local491 = -(local130.method18201() + 1) / 2;
					break;
				case 2:
					local489 = local130.method18201() / 2;
					local493 = local130.method18172() >> 1;
			}
			switch(arg2.aClass328_1.anInt4185 * 781808927) {
				case 0:
					local495 = local130.method18201();
					local497 = (local130.method18201() + 1) / 2;
					local499 = local130.method18178();
					break;
				case 1:
					local497 = -(local130.method18201() + 1) / 2;
					break;
				case 2:
					local495 = local130.method18201() / 2;
					local499 = local130.method18178() >> 1;
			}
			@Pc(586) Class355 local586 = (Class355) Class159_Sub1.aHashMap4.get(arg1.anInt1603 * 1208139441);
			if (local586 == null) {
				local586 = (Class355) Class159_Sub1.aHashMap5.get(arg2.anInt4146 * 880251661);
			}
			@Pc(629) int local629;
			@Pc(645) int local645;
			if (local586 != null && arg2.anInt4153 * -2050445699 == -1) {
				if (local586.anInt4258 * 1950348827 > Class159_Sub1.anInt1955 * 1548012049 / 2) {
					local629 = (Class159_Sub1.anInt1955 * -393918737 - local586.anInt4258 * -877255451) / (Class159_Sub1.anInt1955 * 1548012049);
				} else {
					local629 = local586.anInt4258 * -877255451 / (Class159_Sub1.anInt1955 * 1548012049);
				}
				local645 = local629 << 24 | 0xFFFF00;
				if (arg0 instanceof Class104_Sub2) {
					arg0.method20612(arg1.anInt1606 * 704671089 - local489 - 7, arg1.anInt1607 * 1844815193 - local495 - 7, local130.method18201() + 14, local130.method18201() + 14, local645, (byte) 91);
					arg0.method20612(arg1.anInt1606 * 704671089 - local489 - 5, arg1.anInt1607 * 1844815193 - local495 - 5, local130.method18201() + 10, local130.method18201() + 10, local645, (byte) 106);
					arg0.method20612(arg1.anInt1606 * 704671089 - local489 - 3, arg1.anInt1607 * 1844815193 - local495 - 3, local130.method18201() + 6, local130.method18201() + 6, local645, (byte) 58);
					arg0.method20612(arg1.anInt1606 * 704671089 - local489 - 1, arg1.anInt1607 * 1844815193 - local495 - 1, local130.method18201() + 2, local130.method18201() + 2, local645, (byte) 87);
					arg0.method20612(arg1.anInt1606 * 704671089 - local489, arg1.anInt1607 * 1844815193 - local495, local130.method18201(), local130.method18201(), local645, (byte) 23);
				} else {
					arg0.method20486(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497, local130.method18201() / 2 + 7, local645, 1717415110);
					arg0.method20486(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18201() / 2 + 5, local645, 1703234046);
					arg0.method20486(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18201() / 2 + 3, local645, 2063689017);
					arg0.method20486(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18201() / 2 + 1, local645, 1590298050);
					arg0.method20486(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18201() / 2, local645, 2088821106);
				}
			}
			local130.method18181(arg1.anInt1606 * 704671089 - local493, arg1.anInt1607 * 1844815193 - local499);
			local629 = 0;
			local645 = 0;
			if (local586 != null && local306 != null) {
				switch(arg2.aClass319_4.anInt4138 * -964115205) {
					case 0:
					default:
						break;
					case 1:
						local629 = local306.method18172();
						break;
					case 2:
						local629 = local306.method18172() >> 1;
				}
				switch(arg2.aClass328_1.anInt4185 * 781808927) {
					case 0:
						local645 = (local306.method18178() + local130.method18178()) / 2;
					case 1:
					default:
						break;
					case 2:
						local645 = (local306.method18178() / 2 + local130.method18178()) / 2;
				}
				@Pc(1003) int local1003;
				if (local586.anInt4258 * 1950348827 > Class159_Sub1.anInt1955 * 1548012049 / 2) {
					local1003 = (Class159_Sub1.anInt1955 * -393918737 - local586.anInt4258 * -877255451) / (Class159_Sub1.anInt1955 * 1548012049);
				} else {
					local1003 = local586.anInt4258 * -877255451 / (Class159_Sub1.anInt1955 * 1548012049);
				}
				@Pc(1019) int local1019 = local1003 << 24 | 0xFFFF00;
				local306.method18185(arg1.anInt1606 * 704671089 - local629, arg1.anInt1607 * 1844815193 - local645, 0, local1019, 1);
			}
		}
		if (arg2.aString180 != null && Class171.aClass106_9 != null) {
			Class314.method27034(arg0, arg1, arg2, local319, local321, local333, local323, 1145917887);
		}
		if (-498063801 * arg2.anInt4167 != -1 || arg2.aString180 != null) {
			@Pc(1065) Class93_Sub9 local1065 = new Class93_Sub9(arg1);
			local1065.anInt1488 = local132 * 1074208877;
			local1065.anInt1486 = local134 * 1065675971;
			local1065.anInt1483 = local136 * 315868373;
			local1065.anInt1485 = local138 * 1073762263;
			local1065.anInt1481 = local325 * 519191853;
			local1065.anInt1484 = local327 * -1010491119;
			local1065.anInt1487 = local329 * 92623553;
			local1065.anInt1482 = local331 * 669031469;
			Class93_Sub9.aClass22_20.method407(local1065, -1376341335);
		}
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "avu", descriptor = "(Lclient!yf;I)V")
	static void method26816(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aShort153;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aShort152;
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class300(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_14 = arg0;
		@Pc(13) boolean local13 = arg1.method22425((short) 16384) != 255;
		if (local13) {
			arg1.anInt3070 -= -1445626955;
		}
		this.aClass304_2 = new Class304(arg1, local13, true, arg0.anInterface27_2);
	}

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26718(this.aClass304_2, (byte) 124);
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26718(this.aClass304_2, (byte) 100);
	}

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26718(this.aClass304_2, (byte) 16);
	}
}
