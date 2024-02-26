package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!um")
public abstract class Class152 {

	@OriginalMember(owner = "client!um", name = "s", descriptor = "(Ljava/awt/Component;Z)Lclient!um;")
	public static Class152 method14601(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class152_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "t", descriptor = "(Lclient!aam;I)[Lclient!aaz;")
	public static Class26[] method14626(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int[] local3 = arg0.method363((byte) -68);
		@Pc(9) Class26[] local9 = new Class26[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class26 local19 = new Class26();
			local9[local11] = local19;
			local19.anInt81 = local3[local11 << 2] * 2130480411;
			local19.anInt80 = local3[(local11 << 2) + 1] * 108526731;
			local19.anInt79 = local3[(local11 << 2) + 2] * 133348931;
			local19.anInt82 = local3[(local11 << 2) + 3] * -1922903105;
		}
		return local9;
	}

	@OriginalMember(owner = "client!um", name = "eb", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method14627(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4096 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -1078944815;
		Class296.method26998(arg0, 1236390469);
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	Class152() {
	}

	@OriginalMember(owner = "client!um", name = "u", descriptor = "(S)Z")
	public abstract boolean method14591(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "client!um", name = "ay", descriptor = "()I")
	public abstract int method14592();

	@OriginalMember(owner = "client!um", name = "ao", descriptor = "()Lclient!akg;")
	public abstract Class80_Sub17 method14593();

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(I)Z")
	public abstract boolean method14594(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "ab", descriptor = "()V")
	public abstract void method14595();

	@OriginalMember(owner = "client!um", name = "ah", descriptor = "()V")
	public abstract void method14596();

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)Z")
	public abstract boolean method14597(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "o", descriptor = "(I)I")
	public abstract int method14598(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "j", descriptor = "(B)Lclient!akg;")
	public abstract Class80_Sub17 method14599(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public abstract void method14600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "k", descriptor = "()V")
	public abstract void method14602();

	@OriginalMember(owner = "client!um", name = "x", descriptor = "()Z")
	public abstract boolean method14603();

	@OriginalMember(owner = "client!um", name = "w", descriptor = "()Z")
	public abstract boolean method14604();

	@OriginalMember(owner = "client!um", name = "r", descriptor = "()Z")
	public abstract boolean method14605();

	@OriginalMember(owner = "client!um", name = "q", descriptor = "()Z")
	public abstract boolean method14606();

	@OriginalMember(owner = "client!um", name = "h", descriptor = "()Z")
	public abstract boolean method14607();

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	public abstract void method14608(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(B)Z")
	public final boolean method14609(@OriginalArg(0) byte arg0) {
		return this.method14591((short) 5936) || this.method14594(1999425857) || this.method14597(399910339);
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "()Z")
	public abstract boolean method14610();

	@OriginalMember(owner = "client!um", name = "v", descriptor = "()Z")
	public abstract boolean method14611();

	@OriginalMember(owner = "client!um", name = "y", descriptor = "()Z")
	public abstract boolean method14612();

	@OriginalMember(owner = "client!um", name = "n", descriptor = "()Z")
	public final boolean method14613() {
		return this.method14591((short) -9670) || this.method14594(382576933) || this.method14597(-171421115);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
	public abstract int method14614();

	@OriginalMember(owner = "client!um", name = "m", descriptor = "(I)I")
	public abstract int method14615(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()Z")
	public final boolean method14616() {
		return this.method14591((short) 122) || this.method14594(-1499184275) || this.method14597(-1848053578);
	}

	@OriginalMember(owner = "client!um", name = "ai", descriptor = "()I")
	public abstract int method14617();

	@OriginalMember(owner = "client!um", name = "aq", descriptor = "()I")
	public abstract int method14618();

	@OriginalMember(owner = "client!um", name = "ax", descriptor = "()I")
	public abstract int method14619();

	@OriginalMember(owner = "client!um", name = "z", descriptor = "()Z")
	public abstract boolean method14620();

	@OriginalMember(owner = "client!um", name = "d", descriptor = "()Z")
	public abstract boolean method14621();

	@OriginalMember(owner = "client!um", name = "ag", descriptor = "()V")
	public abstract void method14622();

	@OriginalMember(owner = "client!um", name = "al", descriptor = "()V")
	public abstract void method14623();

	@OriginalMember(owner = "client!um", name = "ac", descriptor = "()V")
	public abstract void method14624();

	@OriginalMember(owner = "client!um", name = "aj", descriptor = "()Lclient!akg;")
	public abstract Class80_Sub17 method14625();
}
