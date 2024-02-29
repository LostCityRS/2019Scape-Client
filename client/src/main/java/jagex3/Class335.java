package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class335 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!ie;")
	static final Class335 aClass335_2 = new Class335(0);

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!ie;")
	static final Class335 aClass335_1 = new Class335(1);

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	final int anInt4191;

	@OriginalMember(owner = "client!ie", name = "ae", descriptor = "(Lclient!yf;B)V")
	static void method27497(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		if (arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != arg0.anIntArray521[arg0.anInt6052 * -1497248091]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!ie", name = "jx", descriptor = "(Lclient!yf;I)V")
	static void method27498(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -7933309);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class329.method27440(local16, local22, arg0, 1825123840);
	}

	@OriginalMember(owner = "client!ie", name = "np", descriptor = "(Lclient!yf;B)V")
	static void method27499(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class370.method28180(local11, local14, arg0, (byte) -8);
	}

	@OriginalMember(owner = "client!ie", name = "azq", descriptor = "(Lclient!yf;I)V")
	static void method27500(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub26_1.method15919((short) -21412) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "([BI)[B")
	public static byte[] method27501(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!ie", name = "jn", descriptor = "(Ljava/lang/String;I)V")
	public static void method27502(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (!client.aBoolean627 || (Class253.anInt3892 * 735260021 & 0x18) == 0) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(14) int local14 = Class174.anInt3293 * -1081967415;
		@Pc(16) int[] local16 = Class174.anIntArray278;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(27) Class132_Sub1_Sub1_Sub1_Sub2 local27 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local16[local18]];
			if (local27.aString82 != null && local27.aString82.equalsIgnoreCase(arg0) && (local27 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 && (Class253.anInt3892 * 735260021 & 0x10) != 0 || (Class253.anInt3892 * 735260021 & 0x8) != 0)) {
				@Pc(58) Class93_Sub22 local58 = Class102.method2592(Class446.aClass446_71, client.aClass175_2.aClass24_2, (byte) 42);
				local58.aClass93_Sub41_Sub2_1.method22466(client.anInt3523 * 1573685689, 2133965049);
				local58.aClass93_Sub41_Sub2_1.method22458(0, -1591808004);
				local58.aClass93_Sub41_Sub2_1.method22602(client.anInt3524 * -239149331, (byte) -49);
				local58.aClass93_Sub41_Sub2_1.method22468(local16[local18], (short) 255);
				local58.aClass93_Sub41_Sub2_1.method22478(Class148.anInt1394 * -278883695, 844689790);
				client.aClass175_2.method24363(local58, -2145186804);
				Class498.method30318(local27.anIntArray240[0], local27.anIntArray239[0], -2062153340);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Class103.method2811(4, Class74.aClass74_127.method1259(Class106.aClass717_8, (byte) -9) + arg0, -1963408433);
		}
		if (client.aBoolean627) {
			Class624.method32341(682408472);
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	Class335(@OriginalArg(0) int arg0) {
		this.anInt4191 = arg0 * -953533815;
	}
}
