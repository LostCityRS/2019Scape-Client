package jagex3;

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

@OriginalClass("client!w")
public final class Class630 {

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	static final int anInt5872 = 1000;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	static final int anInt5873 = 2;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Ljava/lang/String;")
	static final String aString243 = "passwordchoice.ws";

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString244 = "m=accountappeal/login.ws";

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	static final int anInt5874 = 2;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	static final int anInt5875 = 3;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	static final int anInt5876 = 4;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString245 = "services";

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	static final int anInt5877 = 6;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	static final int anInt5878 = 7;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public static final int anInt5879 = 5;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger7 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger8 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(Ljava/lang/String;)Z")
	static boolean method32447(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(Ljava/lang/String;)Z")
	static boolean method32448(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()J")
	public static long method32449() {
		try {
			@Pc(14) URL local14 = new URL(Class119.method8605("services", false, -1622110674) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class93_Sub41 local50 = new Class93_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray58, local50.anInt3070 * 212851357, 1000 - local50.anInt3070 * 212851357);
				if (local65 == -1) {
					local50.anInt3070 = 0;
					return local50.method22435(-1717217003);
				}
				local50.anInt3070 += local65 * -1445626955;
			} while (local50.anInt3070 * 212851357 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()J")
	public static long method32450() {
		try {
			@Pc(14) URL local14 = new URL(Class119.method8605("services", false, -921497864) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class93_Sub41 local50 = new Class93_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray58, local50.anInt3070 * 212851357, 1000 - local50.anInt3070 * 212851357);
				if (local65 == -1) {
					local50.anInt3070 = 0;
					return local50.method22435(1609455049);
				}
				local50.anInt3070 += local65 * -1445626955;
			} while (local50.anInt3070 * 212851357 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "(JLjava/lang/String;)I")
	public static int method32451(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class93_Sub41 local8 = new Class93_Sub41(128);
		@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method22522(10, (byte) -38);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22407(local3.nextInt(), (byte) 40);
		}
		local8.method22407(local16[0], (byte) 5);
		local8.method22407(local16[1], (byte) -21);
		local8.method22411(arg0);
		local8.method22411(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22407(local3.nextInt(), (byte) -44);
		}
		local8.method22428(aBigInteger7, aBigInteger8, (byte) -17);
		local13.method22522(10, (byte) -66);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method22407(local3.nextInt(), (byte) 23);
		}
		local13.method22411(local3.nextLong());
		local13.method22410(local3.nextLong());
		Class314.method27033(local13, 2128804438);
		local13.method22411(local3.nextLong());
		local13.method22428(aBigInteger7, aBigInteger8, (byte) -84);
		local44 = Class46.method894(arg1, -1889900536);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(146) Class93_Sub41 local146 = new Class93_Sub41(local44);
		local146.method22414(arg1, -85852108);
		local146.anInt3070 = local44 * -1445626955;
		local146.method22487(local16, -817017705);
		@Pc(179) Class93_Sub41 local179 = new Class93_Sub41(local13.anInt3070 * 212851357 + 5 + local8.anInt3070 * 212851357 + local146.anInt3070 * 212851357);
		local179.method22522(2, (byte) -8);
		local179.method22522(local8.anInt3070 * 212851357, (byte) -84);
		local179.method22417(local8.aByteArray58, 0, local8.anInt3070 * 212851357, 2026842986);
		local179.method22522(local13.anInt3070 * 212851357, (byte) -13);
		local179.method22417(local13.aByteArray58, 0, local13.anInt3070 * 212851357, 2026842986);
		local179.method22466(local146.anInt3070 * 212851357, 2132457506);
		local179.method22417(local146.aByteArray58, 0, local146.anInt3070 * 212851357, 2026842986);
		@Pc(239) String local239 = Class669.method33124(local179.aByteArray58, 2047889127);
		try {
			@Pc(254) URL local254 = new URL(Class119.method8605("services", false, 770935442) + "m=accountappeal/login.ws");
			@Pc(257) URLConnection local257 = local254.openConnection();
			local257.setDoInput(true);
			local257.setDoOutput(true);
			local257.setConnectTimeout(5000);
			@Pc(272) OutputStreamWriter local272 = new OutputStreamWriter(local257.getOutputStream());
			local272.write("data2=" + Class25_Sub2.method16033(local239, (byte) 73) + "&dest=" + Class25_Sub2.method16033("passwordchoice.ws", (byte) 73));
			local272.flush();
			@Pc(295) InputStream local295 = local257.getInputStream();
			local179 = new Class93_Sub41(new byte[1000]);
			do {
				@Pc(316) int local316 = local295.read(local179.aByteArray58, local179.anInt3070 * 212851357, 1000 - local179.anInt3070 * 212851357);
				if (local316 == -1) {
					local272.close();
					local295.close();
					@Pc(347) String local347 = new String(local179.aByteArray58);
					if (local347.startsWith("OFFLINE")) {
						return 4;
					} else if (local347.startsWith("WRONG")) {
						return 7;
					} else if (local347.startsWith("RELOAD")) {
						return 3;
					} else if (local347.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local179.method22452(local16, 1442669960);
						while (local179.anInt3070 * 212851357 > 0 && local179.aByteArray58[local179.anInt3070 * 212851357 - 1] == 0) {
							local179.anInt3070 -= -1445626955;
						}
						local347 = new String(local179.aByteArray58, 0, local179.anInt3070 * 212851357);
						if (Class89.method1600(local347, (byte) 1)) {
							Class338.method27561(local347, true, client.aBoolean598, (byte) -125);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local179.anInt3070 += local316 * -1445626955;
			} while (local179.anInt3070 * 212851357 < 1000);
			return 5;
		} catch (@Pc(423) Throwable local423) {
			local423.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "([F[IIII)V")
	public static void method32452(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method32452(arg0, arg1, arg2, local10 - 1, -1734123487);
		method32452(arg0, arg1, local10 + 1, arg3, -1980715364);
	}

	@OriginalMember(owner = "client!w", name = "gx", descriptor = "(Lclient!yf;S)V")
	static void method32453(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class606.method32093(local11, local14, arg0, (byte) 85);
	}

	@OriginalMember(owner = "client!w", name = "ayh", descriptor = "(Lclient!yf;I)V")
	static void method32454(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class238.method25889(true, 1773551774);
		Class275.method26434(1558357183);
		client.aClass532_1.method30650((byte) 0);
		Class106_Sub1.method5148(-636886944);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!w", name = "n", descriptor = "(CI)Z")
	public static boolean method32455(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(16) char[] local16 = Class712.aCharArray8;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) char local26 = local16[local18];
				if (local26 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!w", name = "in", descriptor = "(Lclient!yf;I)V")
	static void method32456(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class110_Sub8.method7959(local11, local14, arg0, (short) -26165);
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "(Ljava/lang/String;B)V")
	public static void method32457(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_30, client.aClass175_1.aClass24_2, (byte) 47);
		local10.aClass93_Sub41_Sub2_1.method22466(0, 2144093970);
		@Pc(21) int local21 = local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local10.aClass93_Sub41_Sub2_1.method22414(arg0, 1419926272);
		local10.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local10.aClass93_Sub41_Sub2_1.method22453(Class676.anIntArray518, local21, local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -65);
		local10.aClass93_Sub41_Sub2_1.method22419(local10.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local21, 2020888247);
		client.aClass175_1.method24363(local10, -1528137382);
		Class103.aClass721_1 = Class721.aClass721_5;
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	Class630() throws Throwable {
		throw new Error();
	}
}
