package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class251 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "[Lclient!eg;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "[Lclient!ex;")
	public static Class254[] aClass254Array1;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "[Lclient!es;")
	static Class250[] aClass250Array1;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[Lclient!eb;")
	static Class239[] aClass239Array1;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "S")
	static short aShort164;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "Lclient!aag;")
	public static Class8 aClass8_50 = new Class8();

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!aax;")
	public static Class24 aClass24_25 = new Class24(32);

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	static int anInt3876 = -878712665;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	static int anInt3877 = 0;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	static int anInt3878 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Z")
	static boolean aBoolean774 = false;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	static int anInt3879 = -1407837447;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "I")
	static int anInt3880 = 1851501401;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!ey;")
	public static final Interface24 anInterface24_3 = new Class245();

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(Z)V")
	public static void method26358(@OriginalArg(0) boolean arg0) {
		if (client.anInt3541 * -1330995431 == 4 || client.anInt3541 * -1330995431 == 3) {
			return;
		}
		if (!arg0) {
			if (aClass103Array1 != null) {
				@Pc(16) Class103[] local16 = aClass103Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class103 local26 = local16[local18];
					local26.method19200(783414730);
				}
			}
			if (anInt3879 * 1635678391 != -1) {
				Class490.aClass263_13.method26530(anInt3879 * 1635678391, 255, -1190237887);
			}
		}
		client.anInt3541 = -158780252;
		Class548.aPacket_16 = null;
		client.aBoolean722 = false;
		if (anInt3880 * -1561586921 > 0) {
			Class107.method7196(Class158.aClass158_56, anInt3880 * -1561586921, -1, 30180256);
		}
		Class662.method33334(2891271);
		@Pc(68) Class80_Sub31 local68 = Class623.method32440(Class443.aClass443_42, client.aClass75_1.aClass22_1, -191270971);
		local68.aPacketBit_2.p1(arg0 ? 1 : 0);
		client.aClass75_1.method1325(local68, (byte) -79);
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(Lclient!ald;)V")
	static void method26359(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			switch(local3) {
				case 0:
					anInt3877 = arg0.g2() * 2099092997;
					anInt3878 = arg0.g2() * -3670491;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
	public static boolean method26360(@OriginalArg(0) int arg0) {
		if (anInt3880 * -1561586921 != arg0 || Class235.aClass252_1 == null) {
			Class662.method33334(-918476807);
			Class235.aClass252_1 = Class252.aClass252_4;
			anInt3880 = arg0 * -1851501401;
		}
		@Pc(39) int local39;
		if (Class252.aClass252_4 == Class235.aClass252_1) {
			@Pc(23) byte[] local23 = Class110_Sub1.aClass480_17.method29926(arg0, 1472047355);
			if (local23 == null) {
				return false;
			}
			@Pc(32) Packet local32 = new Packet(local23);
			Class614.method32274(local32, (byte) 123);
			local39 = local32.g1();
			@Pc(41) int local41;
			for (local41 = 0; local41 < local39; local41++) {
				aClass8_50.method232(new Class80_Sub30(local32), -33056083);
			}
			local41 = local32.gSmart1or2();
			aClass250Array1 = new Class250[local41];
			@Pc(62) int local62;
			for (local62 = 0; local62 < local41; local62++) {
				aClass250Array1[local62] = new Class250(local32);
			}
			local62 = local32.gSmart1or2();
			aClass254Array1 = new Class254[local62];
			@Pc(83) int local83;
			for (local83 = 0; local83 < local62; local83++) {
				aClass254Array1[local83] = new Class254(local32, local83);
			}
			local83 = local32.gSmart1or2();
			Class700.aClass249Array1 = new Class249[local83];
			@Pc(105) int local105;
			for (local105 = 0; local105 < local83; local105++) {
				Class700.aClass249Array1[local105] = new Class249(local32);
			}
			local105 = local32.gSmart1or2();
			aClass239Array1 = new Class239[local105];
			@Pc(126) int local126;
			for (local126 = 0; local126 < local105; local126++) {
				aClass239Array1[local126] = new Class239(local32);
			}
			local126 = local32.gSmart1or2();
			aClass103Array1 = new Class103[local126];
			for (@Pc(147) int local147 = 0; local147 < local126; local147++) {
				aClass103Array1[local147] = Class98.method2707(local32, (byte) 14);
			}
			Class235.aClass252_1 = Class252.aClass252_3;
		}
		if (Class235.aClass252_1 == Class252.aClass252_3) {
			@Pc(165) boolean local165 = true;
			@Pc(167) Class254[] local167 = aClass254Array1;
			for (local39 = 0; local39 < local167.length; local39++) {
				@Pc(177) Class254 local177 = local167[local39];
				if (!local177.method26389(16711935)) {
					local165 = false;
				}
			}
			@Pc(187) Class103[] local187 = aClass103Array1;
			for (local39 = 0; local39 < local187.length; local39++) {
				@Pc(197) Class103 local197 = local187[local39];
				if (!local197.method19201(1878982480)) {
					local165 = false;
				}
			}
			@Pc(207) Class249[] local207 = Class700.aClass249Array1;
			for (local39 = 0; local39 < local207.length; local39++) {
				@Pc(217) Class249 local217 = local207[local39];
				if (!local217.method26343(1901969671)) {
					local165 = false;
				}
			}
			if (!local165) {
				return false;
			}
			Class235.aClass252_1 = Class252.aClass252_2;
		}
		return true;
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(Lclient!ald;)V")
	static void method26361(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			switch(local3) {
				case 0:
					anInt3877 = arg0.g2() * 2099092997;
					anInt3878 = arg0.g2() * -3670491;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "o", descriptor = "(Lclient!ald;)V")
	static void method26362(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			switch(local3) {
				case 0:
					anInt3877 = arg0.g2() * 2099092997;
					anInt3878 = arg0.g2() * -3670491;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "()V")
	public static void method26363() {
		aShort164 = client.aShort154;
		Class253.aShort165 = client.aShort153;
		Class427.aShort172 = client.aShort160;
		Class113.aShort23 = client.aShort155;
		aBoolean774 = true;
		anInt3879 = Class490.aClass263_13.method26606(-782029833) * 1407837447;
		if (anInt3878 * -235016787 != 0 && anInt3877 * -1558544691 != 0) {
			client.aShort160 = 334;
			client.aShort155 = 334;
			client.aShort153 = client.aShort154 = (short) (anInt3878 * -69510656 / (anInt3877 * -1558544691));
		}
	}

	@OriginalMember(owner = "client!et", name = "s", descriptor = "(Z)V")
	public static void method26364(@OriginalArg(0) boolean arg0) {
		if (client.anInt3541 * -1330995431 == 4 || client.anInt3541 * -1330995431 == 3) {
			return;
		}
		if (!arg0) {
			if (aClass103Array1 != null) {
				@Pc(16) Class103[] local16 = aClass103Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class103 local26 = local16[local18];
					local26.method19200(-2049412684);
				}
			}
			if (anInt3879 * 1635678391 != -1) {
				Class490.aClass263_13.method26530(anInt3879 * 1635678391, 255, -1942993917);
			}
		}
		client.anInt3541 = -158780252;
		Class548.aPacket_16 = null;
		client.aBoolean722 = false;
		if (anInt3880 * -1561586921 > 0) {
			Class107.method7196(Class158.aClass158_56, anInt3880 * -1561586921, -1, -1442670886);
		}
		Class662.method33334(-934303873);
		@Pc(68) Class80_Sub31 local68 = Class623.method32440(Class443.aClass443_42, client.aClass75_1.aClass22_1, -191270971);
		local68.aPacketBit_2.p1(arg0 ? 1 : 0);
		client.aClass75_1.method1325(local68, (byte) -98);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "()V")
	public static void method26365() {
		aShort164 = client.aShort154;
		Class253.aShort165 = client.aShort153;
		Class427.aShort172 = client.aShort160;
		Class113.aShort23 = client.aShort155;
		aBoolean774 = true;
		anInt3879 = Class490.aClass263_13.method26606(-1034872256) * 1407837447;
		if (anInt3878 * -235016787 != 0 && anInt3877 * -1558544691 != 0) {
			client.aShort160 = 334;
			client.aShort155 = 334;
			client.aShort153 = client.aShort154 = (short) (anInt3878 * -69510656 / (anInt3877 * -1558544691));
		}
	}

	@OriginalMember(owner = "client!et", name = "gy", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26366(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4136 = -961378150;
		arg0.aClass350_2 = null;
		arg0.anInt4122 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -258024019;
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -39);
		}
	}

	@OriginalMember(owner = "client!et", name = "amk", descriptor = "(Lclient!yp;B)V")
	static void method26367(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloat254 >> 3;
	}

	@OriginalMember(owner = "client!et", name = "anv", descriptor = "(Lclient!yp;I)V")
	static void method26368(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		BufferedSocket.aClass121_Sub1_2.method9645((float) ((double) local13 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) local23 * 2.0D * 3.141592653589793D / 16384.0D), 133874245);
	}

	@OriginalMember(owner = "client!et", name = "ank", descriptor = "(Lclient!yp;I)V")
	static void method26369(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!et", name = "yq", descriptor = "(Lclient!yp;I)V")
	static void method26370(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class601.method32105(Class491.method30258(-1390816942), arg0, (byte) 3);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZI)V")
	static void method26371(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg1, -917131258);
		if (local4 != null) {
			local4.method24395((byte) 80);
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	public static void method26372(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-654864405)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 67);
			} else {
				local4.aBoolean337 = true;
				if (local4.anInt1476 * 781975081 >= 0 && local4.anInt1473 * -1479987305 >= 0 && local4.anInt1476 * 781975081 < client.aClass539_1.method30921(1915375938) && local4.anInt1473 * -1479987305 < client.aClass539_1.method31011(-1656770168)) {
					Class618.method32297(local4, (byte) 2);
				}
			}
		}
		for (local4 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(305740391)) {
			if (local4.aBoolean338) {
				local4.method24395((byte) 2);
			} else {
				local4.aBoolean337 = true;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "ajw", descriptor = "(Lclient!yp;I)V")
	static void method26374(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	Class251() throws Throwable {
		throw new Error();
	}
}
