package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yo")
public final class Class689 {

	@OriginalMember(owner = "client!yo", name = "k", descriptor = "F")
	public static final float aFloat369 = 0.69921875F;

	@OriginalMember(owner = "client!yo", name = "c", descriptor = "I")
	public static final int anInt6086 = 2816;

	@OriginalMember(owner = "client!yo", name = "m", descriptor = "F")
	public static final float aFloat370 = 1.1523438F;

	@OriginalMember(owner = "client!yo", name = "n", descriptor = "I")
	public static final int anInt6087 = 13156520;

	@OriginalMember(owner = "client!yo", name = "f", descriptor = "F")
	public static final float aFloat371 = 1.2F;

	@OriginalMember(owner = "client!yo", name = "e", descriptor = "I")
	public static final int anInt6088 = 16777215;

	@OriginalMember(owner = "client!yo", name = "l", descriptor = "I")
	public static final int anInt6089 = -60;

	@OriginalMember(owner = "client!yo", name = "u", descriptor = "I")
	public static final int anInt6090 = -50;

	@OriginalMember(owner = "client!yo", name = "d", descriptor = "I")
	public static final int anInt6091 = 2816;

	@OriginalMember(owner = "client!yo", name = "z", descriptor = "I")
	public static final int anInt6092 = 0;

	@OriginalMember(owner = "client!yo", name = "w", descriptor = "I")
	public static final int anInt6093 = -50;

	@OriginalMember(owner = "client!yo", name = "p", descriptor = "I")
	static final int anInt6094 = 5000;

	@OriginalMember(owner = "client!yo", name = "r", descriptor = "I")
	public static final int anInt6095 = 2816;

	static {
		new Class472(0.6F, 0.6F, 0.6F);
		new Class472(0.3F, 0.3F, 0.3F);
		new Class472(0.3F, 0.3F, 0.5F);
	}

	@OriginalMember(owner = "client!yo", name = "z", descriptor = "(Lclient!yf;S)V")
	static void method36703(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(16) boolean local16 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] != 0;
		Class341.method27589(local16, 2063417477);
	}

	@OriginalMember(owner = "client!yo", name = "w", descriptor = "(Lclient!als;II)V")
	static void method36704(@OriginalArg(0) Class93_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class93_Sub1_Sub13 local12 = Class407.method28764(local8, 1200487767);
		if (local12 == null) {
			return;
		}
		@Pc(19) Class681 local19 = Class96.method2324(-642860303);
		local19.anIntArray519 = new int[local12.anInt3065 * 341680345];
		@Pc(28) int local28 = 0;
		local19.anObjectArray44 = new String[local12.anInt3064 * -1520226159];
		@Pc(37) int local37 = 0;
		local19.aLongArray26 = new long[local12.anInt3066 * 801418781];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 1; local48 < local2.length; local48++) {
			if (local2[local48] instanceof Integer) {
				@Pc(63) int local63 = (Integer) local2[local48];
				if (local63 == -2147483647) {
					local63 = arg0.anInt1995 * -1085772741;
				}
				if (local63 == -2147483646) {
					local63 = arg0.anInt1998 * 1258145509;
				}
				if (local63 == -2147483645) {
					local63 = arg0.aClass312_1 == null ? -1 : arg0.aClass312_1.anInt3994 * -1549590237;
				}
				if (local63 == -2147483644) {
					local63 = arg0.anInt1996 * -922388793;
				}
				if (local63 == -2147483643) {
					local63 = arg0.aClass312_1 == null ? -1 : arg0.aClass312_1.anInt4011 * 532402067;
				}
				if (local63 == -2147483642) {
					local63 = arg0.aClass312_2 == null ? -1 : arg0.aClass312_2.anInt3994 * -1549590237;
				}
				if (local63 == -2147483641) {
					local63 = arg0.aClass312_2 == null ? -1 : arg0.aClass312_2.anInt4011 * 532402067;
				}
				if (local63 == -2147483640) {
					local63 = arg0.anInt1997 * 5932655;
				}
				if (local63 == -2147483639) {
					local63 = arg0.anInt1994 * -1518219161;
				}
				local19.anIntArray519[local28++] = local63;
			} else if (local2[local48] instanceof String) {
				@Pc(179) String local179 = (String) local2[local48];
				if (local179.equals("event_opbase")) {
					local179 = arg0.aString50;
				}
				local19.anObjectArray44[local37++] = local179;
			} else if (local2[local48] instanceof Long) {
				@Pc(204) long local204 = (Long) local2[local48];
				local19.aLongArray26[local46++] = local204;
			}
		}
		local19.anInt6053 = arg0.anInt1999 * -1605265415;
		Class91.method1706(local12, arg1, local19, 634588949);
		local19.anInt6053 = 0;
	}

	@OriginalMember(owner = "client!yo", name = "pz", descriptor = "(Lclient!yf;B)V")
	static void method36705(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class251.method26063(local11, local14, arg0, 1944953898);
	}

	@OriginalMember(owner = "client!yo", name = "rf", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method36706(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray41 = Class499.method30329(local13, arg2, -1318530352);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!yo", name = "aaj", descriptor = "(Lclient!yf;I)V")
	static void method36707(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class297.aByte124;
	}

	@OriginalMember(owner = "client!yo", name = "atf", descriptor = "(Lclient!yf;I)V")
	static void method36708(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1831440856) == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!yo", name = "akd", descriptor = "(Lclient!yf;I)V")
	static void method36709(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class267.method26341(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, true, 1302861754);
	}

	@OriginalMember(owner = "client!yo", name = "hb", descriptor = "(B)V")
	static void method36710(@OriginalArg(0) byte arg0) {
		Class143.method11063(Class694.aClass104_14, (long) client.anInt3485);
		if (client.anInt3526 * -703563959 != -1) {
			Class19.method23646(client.anInt3526 * -703563959, 1117783766);
		}
		@Pc(15) int local15;
		for (local15 = 0; local15 < client.anInt3562 * -1477010237; local15++) {
			client.aBooleanArray19[local15] = client.aBooleanArray22[local15];
			client.aBooleanArray22[local15] = false;
		}
		client.anInt3554 = client.anInt3485 * -836590449;
		if (-703563959 * client.anInt3526 != -1) {
			client.anInt3562 = 0;
			Class79_Sub1_Sub2.method1489(-1675832915);
		}
		Class694.aClass104_14.method20478();
		Class510.method30426(Class694.aClass104_14, 1483618617);
		local15 = Class168.method17640(572497392);
		if (local15 == -1) {
			local15 = client.anInt3520 * 895420077;
		}
		if (local15 == -1) {
			local15 = client.anInt3555 * 225035861;
		}
		Class696.method36831(local15, -683792111);
		client.anInt3480 = 0;
	}

	@OriginalMember(owner = "client!yo", name = "<init>", descriptor = "()V")
	Class689() throws Throwable {
		throw new Error();
	}
}
