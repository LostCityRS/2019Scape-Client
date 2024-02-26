package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.util.Date;

@OriginalClass("client!go")
public final class Class294 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!go", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_10;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "(Ljava/lang/String;I)V")
	public static void method26961(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class149.aStringArray16 == null) {
			Class579.method31811(65280);
		}
		client.aCalendar3.setTime(new Date(Class303.method27111((byte) 8)));
		@Pc(14) int local14 = client.aCalendar3.get(11);
		@Pc(18) int local18 = client.aCalendar3.get(12);
		@Pc(22) int local22 = client.aCalendar3.get(13);
		@Pc(56) String local56 = Integer.toString(local14 / 10) + local14 % 10 + ":" + local18 / 10 + local18 % 10 + ":" + local22 / 10 + local22 % 10;
		@Pc(61) String[] local61 = Class313.method27482(arg0, '\n', 2036747717);
		for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
			for (@Pc(71) int local71 = Class149.anInt1522 * -2043909027; local71 > 0; local71--) {
				Class149.aStringArray16[local71] = Class149.aStringArray16[local71 - 1];
			}
			Class149.aStringArray16[0] = local56 + ": " + local61[local63];
			if (Class677.aFileOutputStream1 != null) {
				try {
					Class677.aFileOutputStream1.write(Class623.method32438(Class149.aStringArray16[0] + "\n", -2113522262));
				} catch (@Pc(116) IOException local116) {
				}
			}
			if (Class149.anInt1522 * -2043909027 < Class149.aStringArray16.length - 1) {
				Class149.anInt1522 += 1480640501;
				if (Class149.anInt1524 * -868725591 > 0) {
					Class149.anInt1524 += -1558243431;
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "sm", descriptor = "(Lclient!yp;B)V")
	static void method26962(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4143 * -219970905;
	}

	@OriginalMember(owner = "client!go", name = "aou", descriptor = "(Lclient!yp;I)V")
	static void method26963(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) float local13 = Class467.method29716(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581]);
		@Pc(21) Class80_Sub1_Sub13_Sub1 local21 = new Class80_Sub1_Sub13_Sub1(Class160.aClass121_Sub1_2.method9722(1381388953), local13);
		Class160.aClass121_Sub1_2.method9596(local21, (byte) 1);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local21.anInt3226 * 393755111;
	}

	@OriginalMember(owner = "client!go", name = "app", descriptor = "(Lclient!yp;I)V")
	static void method26964(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class98.method2704(local13, 65280);
	}

	@OriginalMember(owner = "client!go", name = "bbh", descriptor = "(Lclient!yp;B)V")
	static void method26965(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!go", name = "kl", descriptor = "(B)V")
	static void method26966(@OriginalArg(0) byte arg0) {
		Class667.aClass327Array5 = null;
		Class80_Sub12.method14000(client.anInt3460 * 1849344509, 0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, 0, 0, -1, 319715750);
		if (Class667.aClass327Array5 != null) {
			Class165_Sub12.method16065(Class667.aClass327Array5, -1412584499, 0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, Class543.anInt5125 * -1120505255, Class107_Sub2.anInt865 * 451789213, Class45.aClass327_5 == client.aClass327_9 ? -1 : -1531336755 * client.aClass327_9.anInt4181, true, 1990462392);
			Class667.aClass327Array5 = null;
		}
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!gc;)V")
	Class294(@OriginalArg(0) Class284 arg0) {
		this.aClass284_10 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27152(1445487151);
	}

	@OriginalMember(owner = "client!go", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27152(207864287);
	}
}
