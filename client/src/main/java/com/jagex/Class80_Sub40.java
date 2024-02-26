package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alk")
public class Class80_Sub40 extends Class80 {

	@OriginalMember(owner = "client!alk", name = "u", descriptor = "I")
	public final int anInt3156;

	@OriginalMember(owner = "client!alk", name = "l", descriptor = "I")
	public final int anInt3155;

	@OriginalMember(owner = "client!alk", name = "aiq", descriptor = "(Lclient!yp;B)V")
	static void method23439(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class75 local15 = Class52.method1074(16777215);
		@Pc(21) Class80_Sub31 local21 = Class623.method32440(Class443.aClass443_67, local15.aClass22_1, -191270971);
		local21.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		@Pc(32) int local32 = local21.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local21.aClass80_Sub36_Sub1_2.method23154(local12, 1275868335);
		local21.aClass80_Sub36_Sub1_2.method23155(arg0.aClass453_1.anInt4894 * 221296175, (byte) -76);
		arg0.aClass453_1.aClass80_Sub1_Sub19_1.method23050(local21.aClass80_Sub36_Sub1_2, arg0.aClass453_1.anIntArray451, (byte) -115);
		local21.aClass80_Sub36_Sub1_2.method23171(local21.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local32, (byte) 120);
		local15.method1325(local21, (byte) -30);
	}

	@OriginalMember(owner = "client!alk", name = "<init>", descriptor = "(II)V")
	public Class80_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3156 = arg0 * 1051723907;
		this.anInt3155 = arg1 * -787332045;
	}

	@OriginalMember(owner = "client!alk", name = "f", descriptor = "()Z")
	public boolean method23436() {
		return true;
	}

	@OriginalMember(owner = "client!alk", name = "t", descriptor = "(S)Z")
	public boolean method23437(@OriginalArg(0) short arg0) {
		return true;
	}

	@OriginalMember(owner = "client!alk", name = "e", descriptor = "()Z")
	public boolean method23438() {
		return true;
	}
}
