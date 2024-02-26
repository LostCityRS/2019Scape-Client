package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class330 {

	@OriginalMember(owner = "client!i", name = "u", descriptor = "I")
	static int anInt4185;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	static int anInt4186;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	static int anInt4187;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	static int anInt4188;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	static int anInt4189;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[Lclient!cm;")
	static Class99[] aClass99Array5;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(Lclient!di;Lclient!pf;)V")
	public static void method27757(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class480 arg1) {
		@Pc(6) Class109[] local6 = Class212.method25824(arg1, anInt4185 * -1246449819, 0);
		Class668.aClass99Array8 = new Class99[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class668.aClass99Array8[local12] = arg0.method20906(local6[local12], true);
		}
		local6 = Class212.method25824(arg1, anInt4187 * -1030279809, 0);
		Class313.aClass99Array4 = new Class99[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class313.aClass99Array4[local12] = arg0.method20906(local6[local12], true);
		}
		local6 = Class212.method25824(arg1, Class430.anInt4639 * 545292705, 0);
		Class250.aClass99Array3 = new Class99[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class250.aClass99Array3[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, anInt4189 * -670137465, 0);
		aClass99Array5 = new Class99[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			aClass99Array5[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, Class430.anInt4641 * -151892225, 0);
		Class697.aClass99Array9 = new Class99[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class697.aClass99Array9[local70] = arg0.method20906(local6[local70], true);
		}
		local6 = Class212.method25824(arg1, Class80_Sub28_Sub8.anInt3037 * 1866429939, 0);
		Class344.aClass99Array6 = new Class99[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method7134(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class344.aClass99Array6[local70] = arg0.method20906(local6[local70], true);
		}
		Class103_Sub17_Sub2.aClass99_18 = arg0.method20906(Class212.method25822(arg1, Class699.anInt5812 * 1381845589, 0), true);
		Class11.aClass99_1 = arg0.method20906(Class212.method25822(arg1, Class390.anInt4561 * 819940157, 0), true);
		local6 = Class212.method25824(arg1, Class45.anInt2423 * 2065867053, 0);
		Class393.aClass99Array7 = new Class99[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class393.aClass99Array7[local70] = arg0.method20906(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(Lclient!wi;)V")
	public static void method27758(@OriginalArg(0) Class638 arg0) {
		Class495.anInt5032 = arg0.anInt5622 * 514142987;
		Class361.anInt4492 = arg0.anInt5623 * 16046037;
		anInt4186 = arg0.anInt5620 * -1513671177;
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()[I")
	public static int[] method27759() {
		return new int[] { Class495.anInt5032 * -1666529807, Class361.anInt4492 * 187098293, anInt4186 * -1554812657 };
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!wi;)V")
	public static void method27760(@OriginalArg(0) Class638 arg0) {
		anInt4185 = arg0.anInt5614 * 1043363001;
		anInt4187 = arg0.anInt5626 * 1869682547;
		Class430.anInt4639 = arg0.anInt5624 * -39096481;
		Class475.anInt4961 = arg0.anInt5628 * 255546659;
		Class148.anInt1470 = arg0.anInt5629 * 2028919223;
		anInt4189 = arg0.anInt5603 * -1257819101;
		Class430.anInt4641 = arg0.anInt5631 * -1191265695;
		Class80_Sub28_Sub8.anInt3037 = arg0.anInt5632 * -1603275357;
		anInt4188 = arg0.anInt5612 * 2079409957;
		Class699.anInt5812 = arg0.anInt5634 * -1653390399;
		Class390.anInt4561 = arg0.anInt5611 * 879991607;
		Class45.anInt2423 = arg0.anInt5609 * -705330527;
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "(Lclient!wi;)V")
	public static void method27761(@OriginalArg(0) Class638 arg0) {
		Class495.anInt5032 = arg0.anInt5622 * 514142987;
		Class361.anInt4492 = arg0.anInt5623 * 16046037;
		anInt4186 = arg0.anInt5620 * -1513671177;
	}

	@OriginalMember(owner = "client!i", name = "x", descriptor = "(Lclient!di;)V")
	public static void method27762(@OriginalArg(0) Class102 arg0) {
		Class108.aClass104_22 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class495.anInt5032 * -1666529807, true, true, 873535157);
		Class619.aClass15_12 = Class317.aClass464_1.method29594(client.anInterface49_1, Class495.anInt5032 * -1666529807, (byte) 1);
		Class709.aClass104_26 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class361.anInt4492 * 187098293, true, true, 219373381);
		Class689.aClass15_13 = Class317.aClass464_1.method29594(client.anInterface49_1, Class361.anInt4492 * 187098293, (byte) 1);
		Class8.aClass104_1 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, anInt4186 * -1554812657, true, true, 1964726655);
		Class375.aClass15_9 = Class317.aClass464_1.method29594(client.anInterface49_1, anInt4186 * -1554812657, (byte) 1);
	}

	@OriginalMember(owner = "client!i", name = "w", descriptor = "()I")
	public static int method27763() {
		return 10;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()I")
	public static int method27764() {
		return 10;
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "()I")
	public static int method27765() {
		return 10;
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "()[I")
	public static int[] method27766() {
		return new int[] { Class495.anInt5032 * -1666529807, Class361.anInt4492 * 187098293, anInt4186 * -1554812657 };
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	static void method27767() {
		Class108.aClass104_22 = null;
		Class709.aClass104_26 = null;
		Class8.aClass104_1 = null;
		Class668.aClass99Array8 = null;
		Class313.aClass99Array4 = null;
		Class250.aClass99Array3 = null;
		aClass99Array5 = null;
		Class697.aClass99Array9 = null;
		Class344.aClass99Array6 = null;
		Class103_Sub17_Sub2.aClass99_18 = null;
		Class11.aClass99_1 = null;
		Class393.aClass99Array7 = null;
	}

	@OriginalMember(owner = "client!i", name = "kd", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method27768(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		arg1.anInt5778 -= -221471862;
		@Pc(15) int local15 = arg1.anIntArray525[arg1.anInt5778 * 1896589581] - 1;
		@Pc(25) int local25 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 1];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class388.method28634(arg0, local15, local25, arg1, -703430686);
	}

	@OriginalMember(owner = "client!i", name = "tf", descriptor = "(Lclient!yp;I)V")
	static void method27769(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2019050413);
		Class108_Sub2.method24060(local16, arg0, -810305285);
	}

	@OriginalMember(owner = "client!i", name = "axi", descriptor = "(Lclient!yp;I)V")
	static void method27770(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(7, local13, local23, "", 1599380542);
	}

	@OriginalMember(owner = "client!i", name = "ay", descriptor = "(IIIII)Lclient!asz;")
	public static Class80_Sub17_Sub2 method27771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class80_Sub17_Sub2[] local2 = Class80_Sub17_Sub2.aClass80_Sub17_Sub2Array1;
		synchronized (Class80_Sub17_Sub2.aClass80_Sub17_Sub2Array1) {
			@Pc(11) Class80_Sub17_Sub2 local11;
			if (Class167.anInt2472 * -1070370625 == 0) {
				local11 = new Class80_Sub17_Sub2();
			} else {
				local11 = Class80_Sub17_Sub2.aClass80_Sub17_Sub2Array1[(Class167.anInt2472 -= 54001471) * -1070370625];
			}
			local11.anInt3177 = arg0 * 480125599;
			local11.anInt3197 = arg1 * 1484841599;
			local11.anInt3172 = arg2 * 1590406265;
			local11.anInt3195 = arg3 * 676657145;
			local11.aLong299 = Class303.method27111((byte) 84) * -115045695046593249L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	Class330() throws Throwable {
		throw new Error();
	}
}
