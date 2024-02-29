package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aps")
public class Class107_Sub1_Sub1 extends Class107_Sub1 {

	@OriginalMember(owner = "client!aps", name = "k", descriptor = "[[I")
	static final int[][] anIntArrayArray45 = new int[6][];

	@OriginalMember(owner = "client!aps", name = "n", descriptor = "Lclient!mr;")
	Interface44 anInterface44_4;

	@OriginalMember(owner = "client!aps", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_28;

	@OriginalMember(owner = "client!aps", name = "m", descriptor = "I")
	final int anInt2549;

	@OriginalMember(owner = "client!aps", name = "<init>", descriptor = "(Lclient!afc;I)V", line = 14)
	Class107_Sub1_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_28 = arg0;
		this.anInt2549 = arg1;
	}

	@OriginalMember(owner = "client!aps", name = "e", descriptor = "()Lclient!mr;", line = 20)
	@Override
	Interface44 method18125() {
		if (this.anInterface44_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass104_Sub2_28.anInterface24_6;
			@Pc(14) Class235 local14 = this.aClass104_Sub2_28.aClass225_6.method25597(this.anInt2549, -2112106979);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean654) {
				return null;
			}
			if (!local6.method6765(Class616.aClass616_1, local14.anInt3788 * -1747960127, -1, Class609.aClass609_1, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, -1630596103)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method6764(Class616.aClass616_1, local14.anInt3788 * -1747960127, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, -717544970);
			@Pc(75) int local75 = local14.anInt3806 * -923926085 * local14.anInt3806 * -923926085;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.anInterface44_4 = this.aClass104_Sub2_28.method21149(local14.anInt3806 * -923926085, local14.aByte119 != 0, anIntArrayArray45);
		}
		return this.anInterface44_4;
	}

	@OriginalMember(owner = "client!aps", name = "n", descriptor = "()Lclient!mr;", line = 20)
	@Override
	Interface44 method18126() {
		if (this.anInterface44_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass104_Sub2_28.anInterface24_6;
			@Pc(14) Class235 local14 = this.aClass104_Sub2_28.aClass225_6.method25597(this.anInt2549, 220842851);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean654) {
				return null;
			}
			if (!local6.method6765(Class616.aClass616_1, local14.anInt3788 * -1747960127, -1, Class609.aClass609_1, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, -1630596103)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method6764(Class616.aClass616_1, local14.anInt3788 * -1747960127, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, 1302905690);
			@Pc(75) int local75 = local14.anInt3806 * -923926085 * local14.anInt3806 * -923926085;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.anInterface44_4 = this.aClass104_Sub2_28.method21149(local14.anInt3806 * -923926085, local14.aByte119 != 0, anIntArrayArray45);
		}
		return this.anInterface44_4;
	}

	@OriginalMember(owner = "client!aps", name = "m", descriptor = "()Lclient!mr;", line = 20)
	@Override
	Interface44 method18124() {
		if (this.anInterface44_4 == null) {
			@Pc(6) Interface24 local6 = this.aClass104_Sub2_28.anInterface24_6;
			@Pc(14) Class235 local14 = this.aClass104_Sub2_28.aClass225_6.method25597(this.anInt2549, -1434117744);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean654) {
				return null;
			}
			if (!local6.method6765(Class616.aClass616_1, local14.anInt3788 * -1747960127, -1, Class609.aClass609_1, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, -1630596103)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method6764(Class616.aClass616_1, local14.anInt3788 * -1747960127, 1.0F, local14.anInt3806 * -923926085, local14.anInt3806 * -923926085, false, -113684763);
			@Pc(75) int local75 = local14.anInt3806 * -923926085 * local14.anInt3806 * -923926085;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.anInterface44_4 = this.aClass104_Sub2_28.method21149(local14.anInt3806 * -923926085, local14.aByte119 != 0, anIntArrayArray45);
		}
		return this.anInterface44_4;
	}
}
