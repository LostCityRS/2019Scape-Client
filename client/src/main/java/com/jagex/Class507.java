package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public class Class507 implements Interface75 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_5 = new Class507(0);

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_4 = new Class507(1);

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_6 = new Class507(2);

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	final int anInt5202;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "()[Lclient!qj;", line = 14)
	public static Class507[] method30225() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "()[Lclient!qj;", line = 14)
	public static Class507[] method30226() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "()[Lclient!qj;", line = 14)
	public static Class507[] method30227() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V", line = 17)
	Class507(@OriginalArg(0) int arg0) {
		this.anInt5202 = arg0 * 518352289;
	}

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "()I", line = 22)
	@Override
	public int method36920() {
		return this.anInt5202 * 1367455329;
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5202 * 1367455329;
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(II)I", line = 55)
	static final int method30228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 238)
	static boolean method30229(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		Class411.aBoolean749 = arg0;
		if (!arg1) {
			Class411.anInt4746 = -48143567;
		}
		Class411.aBoolean750 = arg1;
		Class411.aString200 = arg2;
		Class411.aString201 = arg3;
		Class411.aLong271 = arg4 * 7033311592096984251L;
		if (!Class411.aBoolean750 && (Class411.aString200.equals("") || Class411.aString201.equals(""))) {
			Class114.method7637(3, 404726518);
			Class680.method33240(-658529605);
			return false;
		}
		if (Class411.anInt4714 * -1128337797 != 132) {
			Class411.anInt4739 = 0;
			Class411.anInt4755 = -1109601241;
			Class411.anInt4754 = -156824051;
		}
		Class411.aClass175_3.aBoolean564 = false;
		Class114.method7637(-3, -1221204395);
		Class411.anInt4721 = -1044277882;
		Class411.anInt4751 = 0;
		Class411.anInt4748 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "en", descriptor = "(I)V", line = 2148)
	static void method30230(@OriginalArg(0) int arg0) {
		if (Class694.aClass104_14 == null) {
			return;
		}
		client.aClass532_1.method30518((byte) 59);
		Class360.method27799((short) -5760);
		Class389.method28267((byte) 34);
		Class54.method14856((short) 2003);
		Class106.method7569((byte) 1);
		client.aClass532_1.method30522(true, -1425513161);
		Class542.method30934(-1497248091);
		Class165.method15315(-248208143);
		Class700.method36716(false, (byte) -31);
		Class286.method26526(1204150188);
		Class166_Sub18.method15742(1608465020);
		Exception_Sub1.method17631(-1962708807);
		@Pc(32) int local32;
		for (local32 = 0; local32 < client.aClass567Array1.length; local32++) {
			if (client.aClass567Array1[local32] != null) {
				client.aClass567Array1[local32].aClass109_8 = null;
			}
		}
		@Pc(61) int local61;
		for (local32 = 0; local32 < 2048; local32++) {
			@Pc(56) Class132_Sub1_Sub1_Sub1_Sub2 local56 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local32];
			if (local56 != null) {
				for (local61 = 0; local61 < local56.aClass109Array3.length; local61++) {
					local56.aClass109Array3[local61] = null;
				}
			}
		}
		for (local32 = 0; local32 < client.anInt3488 * -1814159537; local32++) {
			@Pc(88) Class132_Sub1_Sub1_Sub1_Sub1 local88 = (Class132_Sub1_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local32].anObject5;
			if (local88 != null) {
				for (local61 = 0; local61 < local88.aClass109Array3.length; local61++) {
					local88.aClass109Array3[local61] = null;
				}
			}
		}
		client.aClass16_21.method225((byte) 71);
		Class694.aClass104_14.method20429(-1550720229);
		Class694.aClass104_14 = null;
	}

	@OriginalMember(owner = "client!qj", name = "api", descriptor = "(Lclient!yf;B)V", line = 12644)
	static final void method30231(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		Class65.aClass123_Sub1_2.method8951((float) arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] / 1000.0F, 614785474);
	}
}
