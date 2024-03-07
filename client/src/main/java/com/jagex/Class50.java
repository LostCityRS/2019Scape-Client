package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abz")
public class Class50 {

	@OriginalMember(owner = "client!abz", name = "n", descriptor = "Lclient!aba;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!abz", name = "e", descriptor = "Lclient!aba;")
	public static Class28 lobby;

	@OriginalMember(owner = "client!abz", name = "f", descriptor = "Lclient!aba;")
	public static Class28 game;

	@OriginalMember(owner = "client!abz", name = "l", descriptor = "Lclient!aba;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!abz", name = "k", descriptor = "Lclient!aba;")
	public static Class28 world;

	@OriginalMember(owner = "client!abz", name = "m", descriptor = "Lclient!aba;")
	public static Class28 aClass28_6;

	@OriginalMember(owner = "client!abz", name = "z", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!abz", name = "c", descriptor = "[Lclient!alc;")
	static Class154_Sub1[] aClass154_Sub1Array1 = new Class154_Sub1[0];

	@OriginalMember(owner = "client!abz", name = "r", descriptor = "I")
	static int anInt194 = 254181067;

	@OriginalMember(owner = "client!abz", name = "v", descriptor = "I")
	static int anInt195 = 0;

	@OriginalMember(owner = "client!abz", name = "o", descriptor = "Lclient!yb;")
	static Class678 aClass678_1 = null;

	@OriginalMember(owner = "client!abz", name = "s", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!abz", name = "<init>", descriptor = "()V", line = 31)
	Class50() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abz", name = "v", descriptor = "()V", line = 36)
	public static void method983() {
		if (!aBoolean27) {
			return;
		}
		if (anInt195 * -1020006083 < Class607.anInt5560 * 1855382415) {
			anInt195 = Class607.anInt5560 * 746527931;
		}
		while (true) {
			while (anInt195 * -1020006083 < Class361.anInt4571 * 977343673) {
				@Pc(27) Class154_Sub1 local27 = Class367.method27959(anInt195 * -1020006083, (byte) -69);
				if (local27 != null && local27.anInt1655 * 1280583823 == -1) {
					if (aClass678_1 == null) {
						aClass678_1 = client.aClass698_1.method36684(local27.aString46, (byte) 1);
					}
					@Pc(54) int local54 = aClass678_1.anInt5886 * 1528915565;
					if (local54 == -1) {
						return;
					}
					local27.anInt1655 = local54 * 1499985519;
					anInt195 += 247033365;
					aClass678_1 = null;
				} else {
					anInt195 += 247033365;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abz", name = "o", descriptor = "()V", line = 36)
	public static void method984() {
		if (!aBoolean27) {
			return;
		}
		if (anInt195 * -1020006083 < Class607.anInt5560 * 1855382415) {
			anInt195 = Class607.anInt5560 * 746527931;
		}
		while (true) {
			while (anInt195 * -1020006083 < Class361.anInt4571 * 977343673) {
				@Pc(27) Class154_Sub1 local27 = Class367.method27959(anInt195 * -1020006083, (byte) 18);
				if (local27 != null && local27.anInt1655 * 1280583823 == -1) {
					if (aClass678_1 == null) {
						aClass678_1 = client.aClass698_1.method36684(local27.aString46, (byte) 1);
					}
					@Pc(54) int local54 = aClass678_1.anInt5886 * 1528915565;
					if (local54 == -1) {
						return;
					}
					local27.anInt1655 = local54 * 1499985519;
					anInt195 += 247033365;
					aClass678_1 = null;
				} else {
					anInt195 += 247033365;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abz", name = "r", descriptor = "()V", line = 36)
	public static void method985() {
		if (!aBoolean27) {
			return;
		}
		if (anInt195 * -1020006083 < Class607.anInt5560 * 1855382415) {
			anInt195 = Class607.anInt5560 * 746527931;
		}
		while (true) {
			while (anInt195 * -1020006083 < Class361.anInt4571 * 977343673) {
				@Pc(27) Class154_Sub1 local27 = Class367.method27959(anInt195 * -1020006083, (byte) 60);
				if (local27 != null && local27.anInt1655 * 1280583823 == -1) {
					if (aClass678_1 == null) {
						aClass678_1 = client.aClass698_1.method36684(local27.aString46, (byte) 1);
					}
					@Pc(54) int local54 = aClass678_1.anInt5886 * 1528915565;
					if (local54 == -1) {
						return;
					}
					local27.anInt1655 = local54 * 1499985519;
					anInt195 += 247033365;
					aClass678_1 = null;
				} else {
					anInt195 += 247033365;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!abz", name = "s", descriptor = "(ILjava/lang/String;II)Z", line = 55)
	public static boolean method986(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		world = new Class28();
		world.id = arg0 * 470002905;
		world.host = arg1;
		world.port1 = arg2 * -1138615973;
		world.port2 = arg3 * 702279345;
		return true;
	}

	@OriginalMember(owner = "client!abz", name = "q", descriptor = "(Ljava/lang/String;I)V", line = 64)
	public static void method987(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (lobby == null) {
			lobby = new Class28();
		}
		lobby.host = arg0;
		lobby.id = (arg1 + 1099) * 470002905;
		lobby.port1 = Class250.method25947(Class280.modeWhere, Class703.aClass703_2, lobby.id * 2142901097, -1608230696) * -1138615973;
		lobby.port2 = Class654.method32718(Class280.modeWhere, Class703.aClass703_2, lobby.id * 2142901097, -986600748) * 702279345;
	}

	@OriginalMember(owner = "client!abz", name = "y", descriptor = "(Ljava/lang/String;I)V", line = 64)
	public static void method988(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (lobby == null) {
			lobby = new Class28();
		}
		lobby.host = arg0;
		lobby.id = (arg1 + 1099) * 470002905;
		lobby.port1 = Class250.method25947(Class280.modeWhere, Class703.aClass703_2, lobby.id * 2142901097, 635696343) * -1138615973;
		lobby.port2 = Class654.method32718(Class280.modeWhere, Class703.aClass703_2, lobby.id * 2142901097, 1731024311) * 702279345;
	}

	@OriginalMember(owner = "client!abz", name = "b", descriptor = "()V", line = 72)
	public static void method989() {
		if (Class94.mapWorld.id * 2142901097 != -1) {
			Class624.method32156(Class94.mapWorld.id * 2142901097, Class94.mapWorld.host, Class94.mapWorld.port1 * 721448659, Class94.mapWorld.port2 * -1815897519, -1021247143);
		}
	}

	@OriginalMember(owner = "client!abz", name = "x", descriptor = "()V", line = 72)
	public static void method990() {
		if (Class94.mapWorld.id * 2142901097 != -1) {
			Class624.method32156(Class94.mapWorld.id * 2142901097, Class94.mapWorld.host, Class94.mapWorld.port1 * 721448659, Class94.mapWorld.port2 * -1815897519, -1553384514);
		}
	}

	@OriginalMember(owner = "client!abz", name = "h", descriptor = "()Lclient!alc;", line = 95)
	public static Class154_Sub1 method991() {
		anInt194 = 0;
		return Class443.method28870(2036177897);
	}

	@OriginalMember(owner = "client!abz", name = "a", descriptor = "()Lclient!alc;", line = 95)
	public static Class154_Sub1 method992() {
		anInt194 = 0;
		return Class443.method28870(2036177897);
	}

	@OriginalMember(owner = "client!abz", name = "g", descriptor = "()Lclient!alc;", line = 95)
	public static Class154_Sub1 method993() {
		anInt194 = 0;
		return Class443.method28870(2036177897);
	}

	@OriginalMember(owner = "client!abz", name = "j", descriptor = "()Lclient!alc;", line = 100)
	public static Class154_Sub1 method994() {
		return anInt194 * -621240299 < aClass154_Sub1Array1.length ? aClass154_Sub1Array1[(anInt194 += 291909437) * -621240299 - 1] : null;
	}

	@OriginalMember(owner = "client!abz", name = "i", descriptor = "()Lclient!alc;", line = 100)
	public static Class154_Sub1 method995() {
		return anInt194 * -621240299 < aClass154_Sub1Array1.length ? aClass154_Sub1Array1[(anInt194 += 291909437) * -621240299 - 1] : null;
	}

	@OriginalMember(owner = "client!abz", name = "t", descriptor = "()Lclient!alc;", line = 105)
	public static Class154_Sub1 method996() {
		return Class367.method27959(world.id * 2142901097, (byte) 93);
	}

	@OriginalMember(owner = "client!abz", name = "ae", descriptor = "()Lclient!alc;", line = 105)
	public static Class154_Sub1 method997() {
		return Class367.method27959(world.id * 2142901097, (byte) 29);
	}

	@OriginalMember(owner = "client!abz", name = "al", descriptor = "(IZIZ)V", line = 109)
	public static void method998(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class271.method26303(0, aClass154_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, 564292647);
		anInt195 = 0;
		aClass678_1 = null;
	}

	@OriginalMember(owner = "client!abz", name = "ag", descriptor = "(IZIZ)V", line = 109)
	public static void method999(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class271.method26303(0, aClass154_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, 1494819559);
		anInt195 = 0;
		aClass678_1 = null;
	}

	@OriginalMember(owner = "client!abz", name = "ah", descriptor = "(IZIZ)V", line = 109)
	public static void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class271.method26303(0, aClass154_Sub1Array1.length - 1, arg0, arg1, arg2, arg3, 1753091934);
		anInt195 = 0;
		aClass678_1 = null;
	}

	@OriginalMember(owner = "client!abz", name = "ac", descriptor = "(IIIZIZ)V", line = 115)
	static void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg0 + arg1) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class154_Sub1 local14 = aClass154_Sub1Array1[local8];
		aClass154_Sub1Array1[local8] = aClass154_Sub1Array1[arg1];
		aClass154_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class288.method26548(aClass154_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5, -2142065558) <= 0) {
				@Pc(44) Class154_Sub1 local44 = aClass154_Sub1Array1[local26];
				aClass154_Sub1Array1[local26] = aClass154_Sub1Array1[local10];
				aClass154_Sub1Array1[local10++] = local44;
			}
		}
		aClass154_Sub1Array1[arg1] = aClass154_Sub1Array1[local10];
		aClass154_Sub1Array1[local10] = local14;
		Class271.method26303(arg0, local10 - 1, arg2, arg3, arg4, arg5, 123146387);
		Class271.method26303(local10 + 1, arg1, arg2, arg3, arg4, arg5, 200281112);
	}

	@OriginalMember(owner = "client!abz", name = "v", descriptor = "(II)V", line = 132)
	public static void method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(10, (long) arg0);
		local4.method21885(2144905394);
	}

	@OriginalMember(owner = "client!abz", name = "ai", descriptor = "(Lclient!alc;Lclient!alc;IZIZ)I", line = 137)
	static int method1003(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class243.method25888(arg0, arg1, arg2, arg3, (byte) -26);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class243.method25888(arg0, arg1, arg4, arg5, (byte) -127);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!abz", name = "as", descriptor = "(Lclient!alc;Lclient!alc;IZIZ)I", line = 137)
	static int method1004(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class243.method25888(arg0, arg1, arg2, arg3, (byte) -12);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class243.method25888(arg0, arg1, arg4, arg5, (byte) -23);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!abz", name = "aw", descriptor = "(Lclient!alc;Lclient!alc;IZIZ)I", line = 137)
	static int method1005(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = Class243.method25888(arg0, arg1, arg2, arg3, (byte) -90);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class243.method25888(arg0, arg1, arg4, arg5, (byte) -76);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!abz", name = "at", descriptor = "(Lclient!alc;Lclient!alc;IZ)I", line = 149)
	static int method1006(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt1652 * 1625257571;
			local12 = arg1.anInt1652 * 1625257571;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class488.method29820(arg0.method14157((byte) -85), arg1.method14157((byte) -37), Class106.lang, -826026012);
		} else if (arg2 == 3) {
			if (arg0.aString47.equals("-")) {
				if (arg1.aString47.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString47.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class488.method29820(arg0.aString47, arg1.aString47, Class106.lang, -1981895540);
			}
		} else if (arg2 == 4) {
			return arg0.method14141((byte) 1) ? (arg1.method14141((byte) 1) ? 0 : 1) : (arg1.method14141((byte) 1) ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method14136((short) 30799) ? (arg1.method14136((short) 9416) ? 0 : 1) : (arg1.method14136((short) 31728) ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method14139(-845882076) ? (arg1.method14139(-1545206288) ? 0 : 1) : (arg1.method14139(-2093189057) ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method14132(1770264607) ? (arg1.method14132(2037219423) ? 0 : 1) : (arg1.method14132(1823406593) ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt1655 * 1280583823;
			local12 = arg1.anInt1655 * 1280583823;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt1654 * 2079113925 - arg1.anInt1654 * 2079113925;
		}
	}
}
