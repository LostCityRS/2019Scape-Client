package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public class Class632 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public static int anInt5720;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	static final int anInt5721 = 1;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[Lclient!alc;")
	static Class154_Sub1[] aClass154_Sub1Array2;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	static final int anInt5722 = -1;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[Lclient!wv;")
	static Class648[] aClass648Array1;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	static final int anInt5723 = 2;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
	static boolean aBoolean851 = false;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 17)
	Class632() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "(I)Lclient!alc;", line = 22)
	public static Class154_Sub1 method32284(@OriginalArg(0) int arg0) {
		return aBoolean851 && arg0 >= Class607.anInt5560 * 1855382415 && arg0 <= Class361.anInt4571 * 977343673 ? aClass154_Sub1Array2[arg0 - Class607.anInt5560 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "(I)Lclient!alc;", line = 22)
	public static Class154_Sub1 method32285(@OriginalArg(0) int arg0) {
		return aBoolean851 && arg0 >= Class607.anInt5560 * 1855382415 && arg0 <= Class361.anInt4571 * 977343673 ? aClass154_Sub1Array2[arg0 - Class607.anInt5560 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Lclient!alc;", line = 22)
	public static Class154_Sub1 method32286(@OriginalArg(0) int arg0) {
		return aBoolean851 && arg0 >= Class607.anInt5560 * 1855382415 && arg0 <= Class361.anInt4571 * 977343673 ? aClass154_Sub1Array2[arg0 - Class607.anInt5560 * 1855382415] : null;
	}

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "([B)Z", line = 27)
	public static boolean method32287(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(8) int local8 = local4.method22465((short) 16384);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22465((short) 16384) == 1;
		if (local22) {
			Class698.method36695(local4, -2132183101);
		}
		Class351.method27643(local4, 125201872);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "([B)Z", line = 27)
	public static boolean method32288(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(8) int local8 = local4.method22465((short) 16384);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22465((short) 16384) == 1;
		if (local22) {
			Class698.method36695(local4, -2114229297);
		}
		Class351.method27643(local4, -2084414813);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "([B)Z", line = 27)
	public static boolean method32289(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(8) int local8 = local4.method22465((short) 16384);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22465((short) 16384) == 1;
		if (local22) {
			Class698.method36695(local4, -2133446003);
		}
		Class351.method27643(local4, -384849498);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "([B)Z", line = 27)
	public static boolean method32290(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		@Pc(8) int local8 = local4.method22465((short) 16384);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22465((short) 16384) == 1;
		if (local22) {
			Class698.method36695(local4, -2094712024);
		}
		Class351.method27643(local4, -1247228292);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "(Lclient!alw;)V", line = 37)
	static void method32291(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22528((byte) -40);
		aClass648Array1 = new Class648[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			aClass648Array1[local8] = new Class648();
			aClass648Array1[local8].anInt5794 = arg0.method22528((byte) -43) * -58277581;
			aClass648Array1[local8].aString237 = arg0.method22512(324854193);
		}
		Class607.anInt5560 = arg0.method22528((byte) -40) * -174531729;
		Class361.anInt4571 = arg0.method22528((byte) -40) * -1231507063;
		Class606.anInt5557 = arg0.method22528((byte) -51) * 470817221;
		aClass154_Sub1Array2 = new Class154_Sub1[Class361.anInt4571 * 977343673 - Class607.anInt5560 * 1855382415 + 1];
		for (local8 = 0; local8 < Class606.anInt5557 * 2035023117; local8++) {
			@Pc(75) int local75 = arg0.method22528((byte) -15);
			@Pc(83) Class154_Sub1 local83 = aClass154_Sub1Array2[local75] = new Class154_Sub1();
			local83.anInt1651 = arg0.method22465((short) 16384) * 88439695;
			local83.anInt1650 = arg0.method22483(-118643075) * 445350423;
			local83.anInt1653 = arg0.method22528((byte) -106) * -875570153;
			if (local83.anInt1653 * -2080957529 != 0) {
				local83.aString48 = arg0.method22512(69764640);
			}
			local83.anInt1654 = (Class607.anInt5560 * 1855382415 + local75) * 142830605;
			local83.aString47 = arg0.method22512(1497851355);
			local83.aString46 = arg0.method22512(2100853963);
		}
		anInt5720 = arg0.method22483(-118643075) * -537572227;
		aBoolean851 = true;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Lclient!alw;)V", line = 37)
	static void method32292(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22528((byte) -101);
		aClass648Array1 = new Class648[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			aClass648Array1[local8] = new Class648();
			aClass648Array1[local8].anInt5794 = arg0.method22528((byte) -113) * -58277581;
			aClass648Array1[local8].aString237 = arg0.method22512(672129942);
		}
		Class607.anInt5560 = arg0.method22528((byte) -6) * -174531729;
		Class361.anInt4571 = arg0.method22528((byte) -116) * -1231507063;
		Class606.anInt5557 = arg0.method22528((byte) -29) * 470817221;
		aClass154_Sub1Array2 = new Class154_Sub1[Class361.anInt4571 * 977343673 - Class607.anInt5560 * 1855382415 + 1];
		for (local8 = 0; local8 < Class606.anInt5557 * 2035023117; local8++) {
			@Pc(75) int local75 = arg0.method22528((byte) -103);
			@Pc(83) Class154_Sub1 local83 = aClass154_Sub1Array2[local75] = new Class154_Sub1();
			local83.anInt1651 = arg0.method22465((short) 16384) * 88439695;
			local83.anInt1650 = arg0.method22483(-118643075) * 445350423;
			local83.anInt1653 = arg0.method22528((byte) -98) * -875570153;
			if (local83.anInt1653 * -2080957529 != 0) {
				local83.aString48 = arg0.method22512(-1489389891);
			}
			local83.anInt1654 = (Class607.anInt5560 * 1855382415 + local75) * 142830605;
			local83.aString47 = arg0.method22512(-220419951);
			local83.aString46 = arg0.method22512(1596169629);
		}
		anInt5720 = arg0.method22483(-118643075) * -537572227;
		aBoolean851 = true;
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "(Lclient!alw;I)Lclient!vu;", line = 40)
	static Class624 method32293(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22465((short) 16384);
		@Pc(7) int local7 = arg0.method22465((short) 16384);
		@Pc(11) int local11 = arg0.method22465((short) 16384);
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.method22465((short) 16384);
		}
		return new Class624(local3, local7, local14);
	}

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "(Lclient!alw;)V", line = 66)
	static void method32294(@OriginalArg(0) Class93_Sub41 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class606.anInt5557 * 2035023117; local1++) {
			@Pc(10) int local10 = arg0.method22528((byte) -88);
			@Pc(14) int local14 = arg0.method22472(-1434290800);
			if (local14 == 65535) {
				local14 = -1;
			}
			if (aClass154_Sub1Array2[local10] != null) {
				aClass154_Sub1Array2[local10].anInt1652 = local14 * 1058716491;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "(Lclient!alw;)V", line = 66)
	static void method32295(@OriginalArg(0) Class93_Sub41 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class606.anInt5557 * 2035023117; local1++) {
			@Pc(10) int local10 = arg0.method22528((byte) -91);
			@Pc(14) int local14 = arg0.method22472(-1434290800);
			if (local14 == 65535) {
				local14 = -1;
			}
			if (aClass154_Sub1Array2[local10] != null) {
				aClass154_Sub1Array2[local10].anInt1652 = local14 * 1058716491;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(Lclient!arm;I)V", line = 835)
	static void method32296(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (Class454.aBoolean773) {
			return;
		}
		arg0.method23969(1312271020);
		Class454.anInt5042 -= 863099247;
		if (!arg0.aBoolean504) {
			@Pc(17) long local17 = arg0.aLong155 * 7070093341456026777L;
			@Pc(22) Class93_Sub1_Sub8 local22;
			for (local22 = (Class93_Sub1_Sub8) Class454.aClass16_34.method214(local17); local22 != null && !local22.aString101.equals(arg0.aString100); local22 = (Class93_Sub1_Sub8) Class454.aClass16_34.method216(-1796956099)) {
			}
			if (local22 != null && local22.method21721(arg0, (short) 20504)) {
				Class420.method28739(local22, -215944052);
			}
			return;
		}
		for (@Pc(54) Class93_Sub1_Sub8 local54 = (Class93_Sub1_Sub8) Class454.aClass18_16.method256(234556549); local54 != null; local54 = (Class93_Sub1_Sub8) Class454.aClass18_16.method264(-1926138044)) {
			if (local54.aString101.equals(arg0.aString100)) {
				@Pc(64) boolean local64 = false;
				for (@Pc(70) Class93_Sub1_Sub7 local70 = (Class93_Sub1_Sub7) local54.aClass18_10.method256(391108234); local70 != null; local70 = (Class93_Sub1_Sub7) local54.aClass18_10.method264(-161207983)) {
					if (arg0 == local70) {
						if (local54.method21721(arg0, (short) 31749)) {
							Class420.method28739(local54, 908565838);
						}
						local64 = true;
						break;
					}
				}
				if (local64) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "wp", descriptor = "(Lclient!yf;I)V", line = 9003)
	static final void method32297(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		Class274.aClass258_1.method26053(local13, (byte) -66);
	}

	@OriginalMember(owner = "client!wb", name = "ayk", descriptor = "(Lclient!yf;B)V", line = 14023)
	static final void method32298(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class380.anInt4623 * -1189534179;
	}
}
