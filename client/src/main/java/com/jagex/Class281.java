package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class281 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString164 = "services";

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	static final int anInt3928 = 7;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "I")
	static final int anInt3929 = 1000;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString165 = "passwordchoice.ws";

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	static final int anInt3930 = 2;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	static final int anInt3931 = 3;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	static final int anInt3932 = 4;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public static final int anInt3933 = 5;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Ljava/lang/String;")
	static final String aString166 = "m=accountappeal/login.ws";

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	static final int anInt3934 = 6;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	static final int anInt3935 = 2;

	@OriginalMember(owner = "client!g", name = "he", descriptor = "Lclient!apd;")
	public static Class41_Sub22 aClass41_Sub22_1;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger6 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger5 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@OriginalMember(owner = "client!g", name = "j", descriptor = "(Ljava/lang/String;)Z")
	static boolean method26854(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(10) MalformedURLException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "m", descriptor = "(JLjava/lang/String;)I")
	public static int method26855(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class80_Sub36 local8 = new Class80_Sub36(128);
		@Pc(13) Class80_Sub36 local13 = new Class80_Sub36(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method23154(10, 1275868335);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method23345(local3.nextInt(), (byte) 48);
		}
		local8.method23345(local16[0], (byte) 47);
		local8.method23345(local16[1], (byte) 84);
		local8.method23162(arg0);
		local8.method23162(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method23345(local3.nextInt(), (byte) 54);
		}
		local8.method23206(aBigInteger6, aBigInteger5, (byte) 0);
		local13.method23154(10, 1275868335);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method23345(local3.nextInt(), (byte) 3);
		}
		local13.method23162(local3.nextLong());
		local13.method23161(local3.nextLong());
		Class337.method27874(local13, 1675901876);
		local13.method23162(local3.nextLong());
		local13.method23206(aBigInteger6, aBigInteger5, (byte) 0);
		local44 = Class350.method28013(arg1, (short) 16383);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class80_Sub36 local147 = new Class80_Sub36(local44);
		local147.method23165(arg1, 1849421240);
		local147.anInt3152 = local44 * 1034180571;
		local147.method23202(local16, 2036473761);
		@Pc(180) Class80_Sub36 local180 = new Class80_Sub36(local147.anInt3152 * -1380987821 + local8.anInt3152 * -1380987821 + 5 + local13.anInt3152 * -1380987821);
		local180.method23154(2, 1275868335);
		local180.method23154(local8.anInt3152 * -1380987821, 1275868335);
		local180.method23168(local8.aByteArray61, 0, local8.anInt3152 * -1380987821, (byte) 99);
		local180.method23154(local13.anInt3152 * -1380987821, 1275868335);
		local180.method23168(local13.aByteArray61, 0, local13.anInt3152 * -1380987821, (byte) 63);
		local180.method23155(local147.anInt3152 * -1380987821, (byte) -107);
		local180.method23168(local147.aByteArray61, 0, local147.anInt3152 * -1380987821, (byte) 89);
		@Pc(240) String local240 = Class37_Sub1.method17381(local180.aByteArray61, (byte) 102);
		try {
			@Pc(255) URL local255 = new URL(Class103_Sub9.method7878("services", false, (byte) -28) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class475.method29886(local240, -135066301) + "&dest=" + Class475.method29886("passwordchoice.ws", -1244232048));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class80_Sub36(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray61, local180.anInt3152 * -1380987821, 1000 - local180.anInt3152 * -1380987821);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray61);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method23203(local16, -36074569);
						while (local180.anInt3152 * -1380987821 > 0 && local180.aByteArray61[local180.anInt3152 * -1380987821 - 1] == 0) {
							local180.anInt3152 -= 1034180571;
						}
						local348 = new String(local180.aByteArray61, 0, local180.anInt3152 * -1380987821);
						if (Class560.method31423(local348, -800704635)) {
							Class654.method33171(local348, true, client.aBoolean734, 1101443107);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt3152 += local317 * 1034180571;
			} while (local180.anInt3152 * -1380987821 < 1000);
			return 5;
		} catch (@Pc(424) Throwable local424) {
			local424.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!g", name = "u", descriptor = "()J")
	public static long method26856() {
		try {
			@Pc(14) URL local14 = new URL(Class103_Sub9.method7878("services", false, (byte) -43) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class80_Sub36 local50 = new Class80_Sub36(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray61, local50.anInt3152 * -1380987821, 1000 - local50.anInt3152 * -1380987821);
				if (local65 == -1) {
					local50.anInt3152 = 0;
					return local50.method23273((byte) 47);
				}
				local50.anInt3152 += local65 * 1034180571;
			} while (local50.anInt3152 * -1380987821 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!g", name = "l", descriptor = "()J")
	public static long method26857() {
		try {
			@Pc(14) URL local14 = new URL(Class103_Sub9.method7878("services", false, (byte) 83) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class80_Sub36 local50 = new Class80_Sub36(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray61, local50.anInt3152 * -1380987821, 1000 - local50.anInt3152 * -1380987821);
				if (local65 == -1) {
					local50.anInt3152 = 0;
					return local50.method23273((byte) 3);
				}
				local50.anInt3152 += local65 * 1034180571;
			} while (local50.anInt3152 * -1380987821 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "()J")
	public static long method26858() {
		try {
			@Pc(14) URL local14 = new URL(Class103_Sub9.method7878("services", false, (byte) -8) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class80_Sub36 local50 = new Class80_Sub36(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray61, local50.anInt3152 * -1380987821, 1000 - local50.anInt3152 * -1380987821);
				if (local65 == -1) {
					local50.anInt3152 = 0;
					return local50.method23273((byte) -7);
				}
				local50.anInt3152 += local65 * 1034180571;
			} while (local50.anInt3152 * -1380987821 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!g", name = "i", descriptor = "(JLjava/lang/String;)I")
	public static int method26859(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class80_Sub36 local8 = new Class80_Sub36(128);
		@Pc(13) Class80_Sub36 local13 = new Class80_Sub36(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method23154(10, 1275868335);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method23345(local3.nextInt(), (byte) 98);
		}
		local8.method23345(local16[0], (byte) 78);
		local8.method23345(local16[1], (byte) 80);
		local8.method23162(arg0);
		local8.method23162(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method23345(local3.nextInt(), (byte) 79);
		}
		local8.method23206(aBigInteger6, aBigInteger5, (byte) 0);
		local13.method23154(10, 1275868335);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method23345(local3.nextInt(), (byte) 81);
		}
		local13.method23162(local3.nextLong());
		local13.method23161(local3.nextLong());
		Class337.method27874(local13, 1244376632);
		local13.method23162(local3.nextLong());
		local13.method23206(aBigInteger6, aBigInteger5, (byte) 0);
		local44 = Class350.method28013(arg1, (short) 16383);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class80_Sub36 local147 = new Class80_Sub36(local44);
		local147.method23165(arg1, 1860580251);
		local147.anInt3152 = local44 * 1034180571;
		local147.method23202(local16, 2122381993);
		@Pc(180) Class80_Sub36 local180 = new Class80_Sub36(local147.anInt3152 * -1380987821 + local8.anInt3152 * -1380987821 + 5 + local13.anInt3152 * -1380987821);
		local180.method23154(2, 1275868335);
		local180.method23154(local8.anInt3152 * -1380987821, 1275868335);
		local180.method23168(local8.aByteArray61, 0, local8.anInt3152 * -1380987821, (byte) 100);
		local180.method23154(local13.anInt3152 * -1380987821, 1275868335);
		local180.method23168(local13.aByteArray61, 0, local13.anInt3152 * -1380987821, (byte) 49);
		local180.method23155(local147.anInt3152 * -1380987821, (byte) -73);
		local180.method23168(local147.aByteArray61, 0, local147.anInt3152 * -1380987821, (byte) 119);
		@Pc(240) String local240 = Class37_Sub1.method17381(local180.aByteArray61, (byte) 17);
		try {
			@Pc(255) URL local255 = new URL(Class103_Sub9.method7878("services", false, (byte) -49) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class475.method29886(local240, -345978175) + "&dest=" + Class475.method29886("passwordchoice.ws", -167174617));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class80_Sub36(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray61, local180.anInt3152 * -1380987821, 1000 - local180.anInt3152 * -1380987821);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray61);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method23203(local16, -36074569);
						while (local180.anInt3152 * -1380987821 > 0 && local180.aByteArray61[local180.anInt3152 * -1380987821 - 1] == 0) {
							local180.anInt3152 -= 1034180571;
						}
						local348 = new String(local180.aByteArray61, 0, local180.anInt3152 * -1380987821);
						if (Class560.method31423(local348, -1406204453)) {
							Class654.method33171(local348, true, client.aBoolean734, 1427353153);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt3152 += local317 * 1034180571;
			} while (local180.anInt3152 * -1380987821 < 1000);
			return 5;
		} catch (@Pc(424) Throwable local424) {
			local424.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!g", name = "o", descriptor = "(Ljava/lang/String;)Z")
	static boolean method26860(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(10) MalformedURLException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "v", descriptor = "(Lclient!hx;Lclient!cg;IIIIILjava/lang/String;Lclient!ed;Lclient!aan;II)V")
	static void method26861(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class104 arg8, @OriginalArg(9) Class15 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(18) int local18;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local18 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-1459697573) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local18 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class467.anIntArray454[local18];
		@Pc(77) int local77 = Class467.anIntArray453[local18];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local73 = local73 * 256 / (client.anInt3476 * -692320695 + 256);
			local77 = local77 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - arg4 * local73 >> 14;
		@Pc(129) int local129 = arg9.method377(arg7, 100, null, -1971114598);
		@Pc(137) int local137 = arg9.method380(arg7, 100, 0, null, (byte) -28);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt4103 * 1892149809) && local143 <= arg0.anInt4103 * 1892149809 && local122 >= -(arg0.anInt4104 * 1990157877) && local122 <= arg0.anInt4104 * 1990157877) {
			arg8.method7631(arg7, arg2 + local143 + arg0.anInt4103 * 1892149809 / 2, arg0.anInt4104 * 1990157877 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "aqq", descriptor = "(Lclient!yp;I)V")
	static void method26862(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!g", name = "arm", descriptor = "(Lclient!yp;B)V")
	static void method26863(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3433 * 1994758437 == 17) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_70, client.aClass75_2.aClass22_1, -191270971);
			client.aClass75_2.method1325(local11, (byte) -54);
		}
	}

	@OriginalMember(owner = "client!g", name = "fm", descriptor = "(II)Z")
	static boolean method26864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 10 || arg0 == 6 || arg0 == 3 || arg0 == 16 || arg0 == 8;
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	Class281() throws Throwable {
		throw new Error();
	}
}
