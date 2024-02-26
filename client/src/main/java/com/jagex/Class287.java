package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class287 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gg", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_8;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!gi;")
	final Class288 aClass288_1;

	@OriginalMember(owner = "client!gg", name = "pi", descriptor = "(Lclient!yp;S)V")
	static void method26904(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2129642343);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class672.method33565(local16, local22, arg0, -829607310);
	}

	@OriginalMember(owner = "client!gg", name = "ada", descriptor = "(Lclient!yp;I)V")
	static void method26905(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.aByte56;
	}

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "(I)[Lclient!dc;")
	static Class222[] method26906(@OriginalArg(0) int arg0) {
		return new Class222[] { Class222.aClass222_1, Class222.aClass222_5, Class222.aClass222_2, Class222.aClass222_3, Class222.aClass222_4 };
	}

	@OriginalMember(owner = "client!gg", name = "ahb", descriptor = "(Lclient!yp;I)V")
	static void method26907(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, 107025241);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.aBoolean24 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class287(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_8 = arg0;
		@Pc(13) boolean local13 = arg1.method23362(987272222) != 255;
		if (local13) {
			arg1.anInt3152 -= 1034180571;
		}
		this.aClass288_1 = new Class288(arg1, local13, true);
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27145(this.aClass288_1, -1945470025);
	}

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27145(this.aClass288_1, -1428255960);
	}
}
