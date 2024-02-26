package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiu")
final class Class143_Sub4 extends Class143 {

	@OriginalMember(owner = "client!aiu", name = "bx", descriptor = "(III)B")
	static byte method11767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aiu", name = "w", descriptor = "(IIIZB)I")
	public static int method11768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(25) boolean local25 = Class531.aString220.startsWith("mac");
		@Pc(39) int[] local39 = Class669.aTwitchTV1.GetRecommendedSettings(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, arg0, 2000, arg2, Class622.aFloat337, local25);
		if (local39[0] != 0) {
			return local39[0];
		}
		@Pc(51) int local51 = local39[1];
		@Pc(55) int local55 = local39[2];
		@Pc(59) int local59 = local39[3];
		@Pc(61) int local61 = local59;
		Class622.aLong399 = 0L;
		Class116_Sub1.aLong33 = (long) (1000.0F / (float) arg2) * 3891691916431978541L;
		Class292.anInt3951 = local51 * -267527003;
		Class351.anInt4255 = local55 * 253791423;
		if (arg1 != 0) {
			local59 = local59 * arg1 / 100;
		}
		Class294.method26961("Stream - Input: " + Class80_Sub1_Sub1.anInt254 * -255202897 + "x" + Class80_Sub25.anInt1627 * 167687103 + " (" + local61 + "kbps)" + " => " + "Output: " + local51 + "x" + local55 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local59 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])", 1455295997);
		return Class669.aTwitchTV1.StartStreaming(local51, local55, arg2, local59, arg1 != 0, Class622.aFloat337, Class622.anInt5479 * -1984318845, arg3);
	}

	@OriginalMember(owner = "client!aiu", name = "akt", descriptor = "(Lclient!yp;B)V")
	static void method11769(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class80_Sub18 local2 = Class148_Sub1.method13460(1916901067);
		if (local2 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt1587 * 1945594581;
			@Pc(77) int local77 = local2.anInt1583 * 2119674109 << 28 | Class159.anInt1991 + local2.anInt1582 * 652783051 << 14 | Class159.anInt1996 + local2.anInt1584 * -1163867765;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local77;
		}
	}

	@OriginalMember(owner = "client!aiu", name = "avm", descriptor = "(Lclient!yp;B)V")
	static void method11770(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class385.method28602(0, 0, client.aClass327_7.anInt4103 * 1892149809, client.aClass327_7.anInt4104 * 1990157877, false, (byte) -125);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3439 * -1389306785;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3576 * -1460317605;
	}

	@OriginalMember(owner = "client!aiu", name = "<init>", descriptor = "(Lclient!xl;IZZ)V")
	Class143_Sub4(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class143_Sub1) null);
	}

	@OriginalMember(owner = "client!aiu", name = "l", descriptor = "(Lclient!ea;B)Ljava/lang/Object;")
	@Override
	Object method11825(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(236325955);
	}

	@OriginalMember(owner = "client!aiu", name = "m", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	Object method11828(@OriginalArg(0) Class107 arg0) {
		return Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(1098766261);
	}
}
