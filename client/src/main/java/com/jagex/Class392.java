package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ky")
public class Class392 {

	@OriginalMember(owner = "client!ky", name = "bn", descriptor = "Ljava/lang/String;")
	public static String aString197;

	@OriginalMember(owner = "client!ky", name = "ji", descriptor = "Lclient!ry;")
	public static Class541 aClass541_1;

	@OriginalMember(owner = "client!ky", name = "e", descriptor = "Lclient!ky;")
	static final Class392 aClass392_13 = new Class392();

	@OriginalMember(owner = "client!ky", name = "n", descriptor = "Lclient!ky;")
	static final Class392 aClass392_12 = new Class392();

	@OriginalMember(owner = "client!ky", name = "m", descriptor = "Lclient!ky;")
	static final Class392 aClass392_11 = new Class392();

	@OriginalMember(owner = "client!ky", name = "m", descriptor = "()[Lclient!ky;", line = 12)
	public static Class392[] method28290() {
		return new Class392[] { aClass392_13, aClass392_12, aClass392_11 };
	}

	@OriginalMember(owner = "client!ky", name = "<init>", descriptor = "()V", line = 15)
	Class392() {
	}

	@OriginalMember(owner = "client!ky", name = "n", descriptor = "(IIS)I", line = 18)
	public int method28291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = Class553.height * 2091353777 > arg1 ? Class553.height * 2091353777 : arg1;
		if (aClass392_13 == this) {
			return 0;
		} else if (aClass392_11 == this) {
			return local10 - arg0;
		} else if (aClass392_12 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ky", name = "k", descriptor = "(II)I", line = 18)
	public int method28292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class553.height * 2091353777 > arg1 ? Class553.height * 2091353777 : arg1;
		if (aClass392_13 == this) {
			return 0;
		} else if (aClass392_11 == this) {
			return local10 - arg0;
		} else if (aClass392_12 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ky", name = "r", descriptor = "(Lclient!dh;I)V", line = 286)
	static void method28293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (Class361.method27804(862937808) && Class570.method31314(-70868223)) {
			Class388.method28250(0, 0, Class553.width * -1378711501, 350, 943073303);
		}
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20721(0, 0, Class553.width * -1378711501, 350, Class168.anInt2448 * -649935255 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (Class168.anInt2441 * -1858737323);
		@Pc(55) int local55;
		if (Class168.anInt2442 * -227471249 > 0) {
			local55 = 346 - Class168.anInt2441 * -1858737323 - 4;
			@Pc(67) int local67 = local55 * local43 / (Class168.anInt2442 * -227471249 + local43 - 1);
			@Pc(69) int local69 = 4;
			if (Class168.anInt2442 * -227471249 > 1) {
				local69 += (local55 - local67) * (Class168.anInt2442 * -227471249 - 1 - Class168.anInt2446 * 1637474717) / (Class168.anInt2442 * -227471249 - 1);
			}
			arg0.method20721(Class553.width * -1378711501 - 16, local69, 12, local67, Class168.anInt2448 * -649935255 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Class168.anInt2446 * 1637474717; local118 < Class168.anInt2446 * 1637474717 + local43 && local118 < Class168.anInt2442 * -227471249; local118++) {
				@Pc(137) String[] local137 = client.method24953(Class518.aStringArray31[local118], '\b', 1727091607);
				@Pc(148) int local148 = (Class553.width * -1378711501 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local150 * local148 + 8;
					arg0.method20569(local160, 0, local148 + local160 - 8, 350);
					Class82.aClass106_1.method7523(Class11.method179(local137[local150], (byte) 85), local160, 350 - Class168.anInt2444 * 1737134917 - 2 - Class348.aClass5_14.anInt10 * -1093354073 - (local118 - Class168.anInt2446 * 1637474717) * -1858737323 * Class168.anInt2441, -1, -16777216, (byte) 0);
				}
			}
		}
		Class707.aClass106_13.method7527("910 1", Class553.width * -1378711501 - 25, 330, -1, -16777216, 1336485814);
		arg0.method20569(0, 0, Class553.width * -1378711501, 350);
		arg0.method20474(0, 350 - Class168.anInt2444 * 1737134917, Class553.width * -1378711501, -1, (byte) 10);
		Class118_Sub1.aClass106_3.method7523("--> " + Class11.method179(Class168.aString61, (byte) 64), 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 1, -1, -16777216, (byte) 0);
		if (Class20.aBoolean10) {
			local55 = -1;
			if (client.anInt3485 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method20476(Class110_Sub3.aClass5_7.method53("--> " + Class11.method179(Class168.aString61, (byte) 102).substring(0, Class168.anInt2445 * 66864267), 840448214) + 10, 350 - Class110_Sub3.aClass5_7.anInt10 * -1093354073 - 11, 12, local55, 1828882815);
		}
		arg0.method20568();
		Class143_Sub1.method11085((byte) -1);
	}

	@OriginalMember(owner = "client!ky", name = "cz", descriptor = "(Lclient!yf;I)V", line = 5452)
	static final void method28294(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class327.method27318(local11, local14, arg0, (byte) -58);
	}

	@OriginalMember(owner = "client!ky", name = "ft", descriptor = "(Lclient!yf;I)V", line = 5917)
	static final void method28295(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 3966889);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class533.method30604(local16, local22, arg0, (byte) -17);
	}

	@OriginalMember(owner = "client!ky", name = "kv", descriptor = "(Lclient!hf;[B[BLclient!yf;B)V", line = 6927)
	static final void method28296(@OriginalArg(0) Class312 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class681 arg3, @OriginalArg(4) byte arg4) {
		@Pc(14) int local14 = arg3.anIntArray519[(arg3.anInt5891 -= 1189701933) * -1497248091] - 1;
		if (local14 < 0 || local14 > 9) {
			throw new RuntimeException();
		}
		Class617.method32092(arg0, local14, arg1, arg2, arg3, 1452429715);
	}
}
