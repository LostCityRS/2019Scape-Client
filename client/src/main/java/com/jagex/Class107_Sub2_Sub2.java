package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apk")
public final class Class107_Sub2_Sub2 extends Class107_Sub2 {

	@OriginalMember(owner = "client!apk", name = "k", descriptor = "[[I")
	static final int[][] anIntArrayArray44 = new int[6][];

	@OriginalMember(owner = "client!apk", name = "n", descriptor = "Lclient!adq;")
	Class88_Sub1 aClass88_Sub1_2;

	@OriginalMember(owner = "client!apk", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_32;

	@OriginalMember(owner = "client!apk", name = "m", descriptor = "I")
	final int anInt2490;

	@OriginalMember(owner = "client!apk", name = "<init>", descriptor = "(Lclient!afa;I)V")
	Class107_Sub2_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_32 = arg0;
		this.anInt2490 = arg1;
	}

	@OriginalMember(owner = "client!apk", name = "n", descriptor = "()Lclient!adq;")
	@Override
	Class88_Sub1 method17853() {
		if (this.aClass88_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass104_Sub1_32.anInterface24_6;
			@Pc(14) Class235 local14 = this.aClass104_Sub1_32.aClass225_6.method25690(this.anInt2490, -762912642);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean658) {
				return null;
			}
			if (!local6.method6765(Class616.aClass616_1, local14.anInt3829 * -1747960127, -1, Class609.aClass609_1, 1.0F, local14.anInt3847 * -923926085, local14.anInt3847 * -923926085, false, -1630596103)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method6764(Class616.aClass616_1, local14.anInt3829 * -1747960127, 1.0F, local14.anInt3847 * -923926085, local14.anInt3847 * -923926085, false, 1251795217);
			@Pc(75) int local75 = local14.anInt3847 * -923926085 * local14.anInt3847 * -923926085;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.aClass88_Sub1_2 = new Class88_Sub1(this.aClass104_Sub1_32, Class206.aClass206_20, Class226.aClass226_22, local14.anInt3847 * -923926085, local14.aByte119 != 0, anIntArrayArray44);
		}
		return this.aClass88_Sub1_2;
	}

	@OriginalMember(owner = "client!apk", name = "e", descriptor = "()Lclient!adq;")
	@Override
	Class88_Sub1 method17852() {
		if (this.aClass88_Sub1_2 == null) {
			@Pc(6) Interface24 local6 = this.aClass104_Sub1_32.anInterface24_6;
			@Pc(14) Class235 local14 = this.aClass104_Sub1_32.aClass225_6.method25690(this.anInt2490, 789439200);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean658) {
				return null;
			}
			if (!local6.method6765(Class616.aClass616_1, local14.anInt3829 * -1747960127, -1, Class609.aClass609_1, 1.0F, local14.anInt3847 * -923926085, local14.anInt3847 * -923926085, false, -1630596103)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method6764(Class616.aClass616_1, local14.anInt3829 * -1747960127, 1.0F, local14.anInt3847 * -923926085, local14.anInt3847 * -923926085, false, -1373720157);
			@Pc(75) int local75 = local14.anInt3847 * -923926085 * local14.anInt3847 * -923926085;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.aClass88_Sub1_2 = new Class88_Sub1(this.aClass104_Sub1_32, Class206.aClass206_20, Class226.aClass226_22, local14.anInt3847 * -923926085, local14.aByte119 != 0, anIntArrayArray44);
		}
		return this.aClass88_Sub1_2;
	}
}
