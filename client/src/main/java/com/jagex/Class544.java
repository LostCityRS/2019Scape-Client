package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class544 {

	@OriginalMember(owner = "client!sa", name = "eh", descriptor = "Lclient!un;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!sa;")
	public static final Class544 aClass544_3 = new Class544();

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!sa;")
	static final Class544 aClass544_4 = new Class544();

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!sa;")
	static final Class544 aClass544_5 = new Class544();

	@OriginalMember(owner = "client!sa", name = "nz", descriptor = "(Lclient!yp;B)V")
	static void method31177(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2001597515);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class656.method33222(local16, local22, arg0, -1740685043);
	}

	@OriginalMember(owner = "client!sa", name = "aig", descriptor = "(Lclient!yp;I)V")
	static void method31178(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class241.method26232(local13, (short) -3383);
	}

	@OriginalMember(owner = "client!sa", name = "ani", descriptor = "(Lclient!yp;I)V")
	static void method31179(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= 1819398433;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class60.method1183(local14, local25, local36, local54, (byte) 4);
	}

	@OriginalMember(owner = "client!sa", name = "aos", descriptor = "(Lclient!yp;B)V")
	static void method31180(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (!Class160.aClass121_Sub1_2.method9607(-1029056994).method27901(-138509754)) {
			throw new RuntimeException();
		}
		@Pc(14) Class123_Sub2 local14 = (Class123_Sub2) Class160.aClass121_Sub1_2.method9603(-1661099790);
		local14.method20542(Class524.aClass485_2, -1, 0.0F, 1887749978);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!sa", name = "awr", descriptor = "(Lclient!yp;I)V")
	static void method31181(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class709.aClass310Array1[local12] == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class709.aClass310Array1[local12].aClass327Array2.length;
		}
	}

	@OriginalMember(owner = "client!sa", name = "ben", descriptor = "(Lclient!yp;B)V")
	static void method31182(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(37) int local37 = Class603.method32130(local23, 504309486);
		@Pc(41) int local41 = Class75.method1344(local23, -633562361);
		@Pc(47) Class35 local47 = (Class35) Class80_Sub1_Sub1.aClass41_2.method18054(local13, 408779296);
		@Pc(53) Class81 local53 = (Class81) Class383.aClass41_3.method18054(local37, -1471912049);
		@Pc(58) Class521[] local58 = local53.aClass521ArrayArray2[local41];
		@Pc(63) Object[] local63 = local47.method756(local41, (byte) -88);
		if (local63 == null && local53.anObjectArrayArray2 != null) {
			local63 = local53.anObjectArrayArray2[local41];
		}
		@Pc(78) int local78;
		if (local63 == null) {
			for (local78 = 0; local78 < local58.length; local78++) {
				@Pc(86) Class521 local86 = local58[local78];
				if (local86 == Class521.aClass521_42) {
					arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
				} else if (local86 == Class521.aClass521_65 || local86 == Class521.aClass521_49) {
					arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
				} else {
					arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
				}
			}
			return;
		}
		local78 = local63.length / local58.length;
		if (local33 < 0 || local33 >= local78) {
			throw new RuntimeException();
		}
		for (@Pc(162) int local162 = 0; local162 < local58.length; local162++) {
			@Pc(173) int local173 = local58.length * local33 + local162;
			if (Class521.aClass521_42 == local58[local162]) {
				arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local63[local173];
			} else {
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (Integer) local63[local173];
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(JLjava/lang/String;B)I")
	public static int method31183(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Packet local8 = new Packet(128);
		@Pc(13) Packet local13 = new Packet(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.p1(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.p4(local3.nextInt());
		}
		local8.p4(local16[0]);
		local8.p4(local16[1]);
		local8.p8(arg0);
		local8.p8(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.p4(local3.nextInt());
		}
		local8.rsaenc(Class281.aBigInteger6, Class281.aBigInteger5);
		local13.p1(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.p4(local3.nextInt());
		}
		local13.p8(local3.nextLong());
		local13.p6(local3.nextLong());
		Class337.method27874(local13, -905787856);
		local13.p8(local3.nextLong());
		local13.rsaenc(Class281.aBigInteger6, Class281.aBigInteger5);
		local44 = Class350.method28013(arg1, (short) 16383);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Packet local147 = new Packet(local44);
		local147.pjstr(arg1);
		local147.pos = local44 * 1034180571;
		local147.tinyenc(local16);
		@Pc(180) Packet local180 = new Packet(local147.pos * -1380987821 + local8.pos * -1380987821 + 5 + local13.pos * -1380987821);
		local180.p1(2);
		local180.p1(local8.pos * -1380987821);
		local180.pdata(local8.data, 0, local8.pos * -1380987821);
		local180.p1(local13.pos * -1380987821);
		local180.pdata(local13.data, 0, local13.pos * -1380987821);
		local180.p2(local147.pos * -1380987821);
		local180.pdata(local147.data, 0, local147.pos * -1380987821);
		@Pc(240) String local240 = Class37_Sub1.method17381(local180.data, (byte) 66);
		try {
			@Pc(255) URL local255 = new URL(Class103_Sub9.method7878("services", false, (byte) 111) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class475.method29886(local240, -484398344) + "&dest=" + Class475.method29886("passwordchoice.ws", -1368949286));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Packet(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.data, local180.pos * -1380987821, 1000 - local180.pos * -1380987821);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.data);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.tinydec(local16);
						while (local180.pos * -1380987821 > 0 && local180.data[local180.pos * -1380987821 - 1] == 0) {
							local180.pos -= 1034180571;
						}
						local348 = new String(local180.data, 0, local180.pos * -1380987821);
						if (Class560.method31423(local348, 1163478439)) {
							Class654.method33171(local348, true, client.aBoolean734, 1351634940);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.pos += local317 * 1034180571;
			} while (local180.pos * -1380987821 < 1000);
			return 5;
		} catch (@Pc(424) Throwable local424) {
			local424.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!sa", name = "ey", descriptor = "(IIII)I")
	public static int method31184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class159_Sub1.anInt2017 * 1776676847 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - Class159_Sub1.anInt1991;
		@Pc(18) int local18 = arg2 - Class159_Sub1.anInt1996;
		for (@Pc(23) Class80_Sub18 local23 = (Class80_Sub18) Class159_Sub1.aClass8_28.method247(129206984); local23 != null; local23 = (Class80_Sub18) Class159_Sub1.aClass8_28.method237(-2096956868)) {
			if (arg0 == local23.anInt1587 * 1945594581) {
				@Pc(37) int local37 = local23.anInt1582 * 652783051;
				@Pc(42) int local42 = local23.anInt1584 * -1163867765;
				@Pc(52) int local52 = Class159_Sub1.anInt1991 + local37 << 14 | local42 + Class159_Sub1.anInt1996;
				@Pc(68) int local68 = (local18 - local42) * (local18 - local42) + (local14 - local37) * (local14 - local37);
				if (local8 < 0 || local68 < local10) {
					local8 = local52;
					local10 = local68;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	Class544() {
	}
}
