package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class612 implements Interface67 {

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	final int anInt5403;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	final int anInt5404;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(Lclient!ald;)Lclient!vh;")
	static Class612 method32226(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		@Pc(7) int local7 = arg0.g1();
		return new Class612(local3, local7);
	}

	@OriginalMember(owner = "client!vh", name = "aix", descriptor = "(Lclient!yp;I)V")
	static void method32227(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class98.anIntArray45 == null || Class345.anInt4249 * 131613239 >= Class98.anIntArray45.length) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class98.anIntArray45[(Class345.anInt4249 += -2033380473) * 131613239 - 1] & 0xFFFF;
		}
	}

	@OriginalMember(owner = "client!vh", name = "qo", descriptor = "(Lclient!yp;B)V")
	static void method32228(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class147_Sub3.method23937(local11, local14, arg0, -1167058701);
	}

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "(III)I")
	static int method32229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "(I)V")
	static void method32230(@OriginalArg(0) int arg0) {
		if (Class499.aClass411_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (Class499.anInt5034 * 1504780479 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			Class499.anInt5033 += -2100438453;
			if (Class499.anInt5033 * -848257181 > local9) {
				Class161.method15651((byte) -11);
			}
			@Pc(62) int local62;
			if (Class499.aClass411_3 == Class411.aClass411_2) {
				client.aClass75_2.method1316(Class411.method28965(Class47.aClass28_3.method655(907314028), 40000, (byte) -27), Class47.aClass28_3.aString4, -619669261);
				client.aClass75_2.method1314(1587586714);
				@Pc(43) Class80_Sub31 local43 = Class668.method33490(2032736644);
				local43.aPacketBit_2.p1(Class436.aClass436_8.anInt4802 * 663664571);
				local43.aPacketBit_2.p2(0);
				local62 = local43.aPacketBit_2.pos * -1380987821;
				local43.aPacketBit_2.p2(910);
				local43.aPacketBit_2.p2(1);
				Class499.anIntArray464 = Class464.method29620(local43, 1756123056);
				@Pc(82) int local82 = local43.aPacketBit_2.pos * -1380987821;
				local43.aPacketBit_2.pjstr(client.aString142);
				local43.aPacketBit_2.p2(client.anInt3426 * -622206633);
				local43.aPacketBit_2.p4(client.anInt3428 * 805324377);
				local43.aPacketBit_2.p4(client.anInt3427 * 1329290145);
				local43.aPacketBit_2.pjstr(Class593.aString228);
				local43.aPacketBit_2.p1(Class512.aClass719_3.method37268());
				local43.aPacketBit_2.p1(client.aClass722_4.anInt5829 * 1531299647);
				Class337.method27874(local43.aPacketBit_2, 507151176);
				@Pc(133) String local133 = client.aString143;
				local43.aPacketBit_2.p1(local133 == null ? 0 : 1);
				if (local133 != null) {
					local43.aPacketBit_2.pjstr(local133);
				}
				Class705.aClass80_Sub39_1.method15025(local43.aPacketBit_2, (byte) 3);
				local43.aPacketBit_2.pos += -1350670595;
				local43.aPacketBit_2.tinyenc(Class499.anIntArray464, local82, local43.aPacketBit_2.pos * -1380987821);
				local43.aPacketBit_2.p2check(local43.aPacketBit_2.pos * -1380987821 - local62);
				client.aClass75_2.method1325(local43, (byte) -7);
				client.aClass75_2.method1315(852078060);
				Class499.aClass411_3 = Class411.aClass411_1;
			}
			if (Class411.aClass411_1 == Class499.aClass411_3) {
				if (client.aClass75_2.method1321((byte) 2) == null) {
					Class161.method15651((byte) -92);
					return;
				}
				if (!client.aClass75_2.method1321((byte) 2).method15545(1, (byte) -107)) {
					return;
				}
				client.aClass75_2.method1321((byte) 2).method15551(client.aClass75_2.aPacketBit_1.data, 0, 1, -1770745780);
				Class499.aClass708_1 = (Class708) Class80_Sub39.method15030(Class538.method30883(-1355340414), client.aClass75_2.aPacketBit_1.data[0] & 0xFF, -1486983874);
				if (Class499.aClass708_1 == Class708.aClass708_10) {
					client.aClass75_2.aClass22_1 = new Class22(Class499.anIntArray464);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = Class499.anIntArray464[local62] + 50;
					}
					client.aClass75_2.aClass22_2 = new Class22(local247);
					new Class22(local247);
					client.aClass75_2.aPacketBit_1.method22564(client.aClass75_2.aClass22_2, 1155816484);
					Class604.method32148(0, 797540832);
					client.aClass75_2.method1314(1587586714);
					client.aClass75_2.aPacketBit_1.pos = 0;
					client.aClass75_2.aClass448_3 = null;
					client.aClass75_2.aClass448_4 = null;
					client.aClass75_2.aClass448_1 = null;
					client.aClass75_2.anInt245 = 0;
					Class672.aClass134_1.aClass636_1.method32852((byte) 16);
					Class376.method28463((byte) 0);
				} else {
					client.aClass75_2.method1319((short) 468);
				}
				client.aClass75_2.aClass448_2 = null;
				Class499.aClass411_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class161.method15651((byte) -20);
		}
	}

	@OriginalMember(owner = "client!vh", name = "bu", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32231(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -442943724;
		arg0.anInt4089 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 2017859153;
		arg0.anInt4182 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * -1380277965;
		@Pc(39) int local39 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2];
		if (local39 < 0) {
			local39 = 0;
		} else if (local39 > 5) {
			local39 = 5;
		}
		@Pc(59) int local59 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 3];
		if (local59 < 0) {
			local59 = 0;
		} else if (local59 > 5) {
			local59 = 5;
		}
		arg0.aByte124 = (byte) local39;
		arg0.aByte125 = (byte) local59;
		Class296.method26998(arg0, 681239345);
		Class122_Sub2.method10326(arg1, arg0, -777507174);
		if (arg0.anInt4135 * 710314345 == 0) {
			Class388.method28636(arg1, arg0, false, (byte) 8);
		}
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class154_Sub1.method14998(arg0.anInt4087 * -2053489901, (byte) 84);
		}
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	Class612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5403 = arg0 * -212373683;
		this.anInt5404 = arg1 * 2090903825;
	}

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;S)Z")
	@Override
	public boolean method32275(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) short arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface63 local12 = arg1[local1];
			if (local12 != null && local12.method14065(-753742866) == this.anInt5403 * 1988321669 && local12.method14068(1388107258) == this.anInt5404 * 1963681777) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32276(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface63 local12 = arg1[local1];
			if (local12 != null && local12.method14065(-451902615) == this.anInt5403 * 1988321669 && local12.method14068(1138654859) == this.anInt5404 * 1963681777) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32277(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface63 local12 = arg1[local1];
			if (local12 != null && local12.method14065(112726474) == this.anInt5403 * 1988321669 && local12.method14068(973703471) == this.anInt5404 * 1963681777) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "(Lclient!akg;[Lclient!ua;ILclient!un;)Z")
	@Override
	public boolean method32278(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) Interface63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface63 local12 = arg1[local1];
			if (local12 != null && local12.method14065(-948221891) == this.anInt5403 * 1988321669 && local12.method14068(1098280560) == this.anInt5404 * 1963681777) {
				return true;
			}
		}
		return false;
	}
}
