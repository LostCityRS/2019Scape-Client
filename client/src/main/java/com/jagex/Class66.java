package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acp")
public class Class66 {

	@OriginalMember(owner = "client!acp", name = "k", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!acp", name = "n", descriptor = "I")
	public static int anInt234;

	@OriginalMember(owner = "client!acp", name = "m", descriptor = "I")
	static int anInt235;

	@OriginalMember(owner = "client!acp", name = "e", descriptor = "I")
	static final int anInt236 = 12;

	@OriginalMember(owner = "client!acp", name = "f", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!acp", name = "c", descriptor = "I")
	static int anInt237;

	@OriginalMember(owner = "client!acp", name = "w", descriptor = "Lclient!qy;")
	static Class521 aClass521_1 = new Class521(16, Class502.aClass502_1);

	@OriginalMember(owner = "client!acp", name = "<init>", descriptor = "()V", line = 16)
	Class66() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acp", name = "e", descriptor = "(III)V", line = 21)
	public static void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9;
		if (anInt234 * -679585439 != arg0) {
			anIntArray18 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray18[local9] = (local9 << 12) / arg0;
			}
			anInt234 = arg0 * 1233914529;
		}
		if (arg1 == anInt235 * 1241692931) {
			return;
		}
		if (arg1 == anInt234 * -679585439) {
			anIntArray19 = anIntArray18;
		} else {
			anIntArray19 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray19[local9] = (local9 << 12) / arg1;
			}
		}
		anInt235 = arg1 * -105904213;
	}

	@OriginalMember(owner = "client!acp", name = "m", descriptor = "(II)V", line = 21)
	public static void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (anInt234 * -679585439 != arg0) {
			anIntArray18 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray18[local9] = (local9 << 12) / arg0;
			}
			anInt234 = arg0 * 1233914529;
		}
		if (arg1 == anInt235 * 1241692931) {
			return;
		}
		if (arg1 == anInt234 * -679585439) {
			anIntArray19 = anIntArray18;
		} else {
			anIntArray19 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray19[local9] = (local9 << 12) / arg1;
			}
		}
		anInt235 = arg1 * -105904213;
	}

	@OriginalMember(owner = "client!acp", name = "e", descriptor = "(Lclient!alw;I)Lclient!km;", line = 28)
	public static Class382 method1191(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class390 local6 = Class708.method36753(-266018790)[arg0.g1((short) 16384)];
		@Pc(13) Class392 local13 = Class252.method25976(501236194)[arg0.g1((short) 16384)];
		@Pc(17) int local17 = arg0.g2s((byte) -67);
		@Pc(21) int local21 = arg0.g2s((byte) -103);
		@Pc(25) int local25 = arg0.gSmart2or4null(-2129557247);
		@Pc(29) int local29 = arg0.g4(-118643075);
		@Pc(33) int local33 = arg0.g1((short) 16384);
		return new Class382(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!acp", name = "f", descriptor = "(I)[B", line = 37)
	public static byte[] method1192(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass521_1.method30346(arg0, -2039760756);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class58.method1100(local19, local40, 1462586631);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass521_1.method30349(arg0, local7, -345690454);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acp", name = "n", descriptor = "(II)[B", line = 37)
	public static byte[] method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) byte[] local7 = (byte[]) aClass521_1.method30346(arg0, -1538769377);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class58.method1100(local19, local40, 1979084768);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass521_1.method30349(arg0, local7, 1505535680);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acp", name = "l", descriptor = "(I)[B", line = 37)
	public static byte[] method1194(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass521_1.method30346(arg0, -1874298370);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class58.method1100(local19, local40, 1865753723);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass521_1.method30349(arg0, local7, -1412497993);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acp", name = "k", descriptor = "(I)[B", line = 37)
	public static byte[] method1195(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass521_1.method30346(arg0, -1414917165);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class58.method1100(local19, local40, 1911305699);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass521_1.method30349(arg0, local7, -681286533);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acp", name = "w", descriptor = "(I)[B", line = 37)
	public static byte[] method1196(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass521_1.method30346(arg0, -1971003707);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(19) Random local19 = new Random((long) arg0);
			@Pc(21) int local21;
			for (local21 = 0; local21 < 255; local21++) {
				local7[local21] = (byte) local21;
			}
			for (local21 = 0; local21 < 255; local21++) {
				@Pc(40) int local40 = 255 - local21;
				@Pc(45) int local45 = Class58.method1100(local19, local40, 1860189220);
				@Pc(49) byte local49 = local7[local45];
				local7[local45] = local7[local40];
				local7[local40] = local7[511 - local21] = local49;
			}
			aClass521_1.method30349(arg0, local7, -518468916);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acp", name = "x", descriptor = "(Lclient!hf;Lclient!hx;IIIIIJ)V", line = 733)
	static void method1197(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7) {
		@Pc(7) int local7 = arg4 * arg4 + arg5 * arg5;
		if ((long) local7 > arg7) {
			return;
		}
		@Pc(32) int local32;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local32 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -32) * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local32 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local32 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
		}
		@Pc(57) int local57 = Class464.anIntArray451[local32];
		@Pc(61) int local61 = Class464.anIntArray452[local32];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local57 = local57 * 256 / (client.anInt3478 * 663566609 + 256);
			local61 = local61 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(96) int local96 = local57 * arg5 + local61 * arg4 >> 14;
		@Pc(106) int local106 = local61 * arg5 - arg4 * local57 >> 14;
		@Pc(110) Class100 local110 = Class393.aClass100Array7[arg6];
		@Pc(113) int local113 = local110.method18205();
		@Pc(116) int local116 = local110.method18192();
		@Pc(129) int local129 = local96 + arg0.anInt3981 * 1215292027 / 2 - local113 / 2;
		@Pc(133) int local133 = local129 + local113;
		@Pc(145) int local145 = -local106 + arg0.anInt3982 * -1490598249 / 2 - local116;
		@Pc(149) int local149 = local116 + local145;
		@Pc(179) boolean local179;
		if (arg1 == null) {
			@Pc(186) int local186 = local113 / 2;
			local179 = local145 <= -local116 || local149 >= arg0.anInt3982 * -1490598249 || local129 <= -local186 || local133 >= local186 + arg0.anInt3981 * 1215292027;
		} else {
			local179 = !arg1.method27314(local129, local145, (byte) 30) || !arg1.method27314(local133, local145, (byte) 30) || !arg1.method27314(local129, local149, (byte) 30) || !arg1.method27314(local133, local149, (byte) 30);
		}
		if (local179) {
			@Pc(220) double local220 = Math.atan2((double) local96, (double) local106);
			@Pc(228) double local228 = Math.atan2((double) Math.abs(local96), (double) Math.abs(local106));
			@Pc(244) double local244 = Math.atan2((double) (arg0.anInt3981 * 1215292027 / 2), (double) (arg0.anInt3982 * -1490598249 / 2));
			@Pc(246) boolean local246 = false;
			@Pc(248) double local248 = 0.0D;
			@Pc(263) int local263;
			if (local228 < local244) {
				local248 = 1.5707963267948966D - local220;
				local263 = arg0.anInt3982 * -1490598249 / 2;
			} else {
				local248 = local220;
				local263 = arg0.anInt3981 * 1215292027 / 2;
			}
			@Pc(285) int local285 = Math.abs((int) -((double) local263 * Math.sin(1.5707963267948966D) / Math.sin(local248)));
			Class552.aClass100Array8[arg6].method18169((float) (arg0.anInt3981 * 1215292027) / 2.0F + (float) arg2 + 0.0F, (float) arg3 + (float) (arg0.anInt3982 * -1490598249) / 2.0F - 0.0F, (float) Class552.aClass100Array8[arg6].method18160() / 2.0F, (float) local285, 4096, (int) (-local220 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			local110.method18161(local129 + arg2, arg3 + local145);
		} else {
			local110.method18199(local129 + arg2, local145 + arg3, arg1.aClass96_1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!acp", name = "uk", descriptor = "(Lclient!yf;B)V", line = 8631)
	static final void method1198(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 706483547);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4044 * 1088282729;
	}

	@OriginalMember(owner = "client!acp", name = "bdv", descriptor = "(Lclient!yf;B)V", line = 14712)
	static final void method1199(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class584.method31427(local12, (byte) 7);
	}
}
