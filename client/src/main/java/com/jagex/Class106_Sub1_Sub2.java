package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apo")
public final class Class106_Sub1_Sub2 extends Class106_Sub1 {

	@OriginalMember(owner = "client!apo", name = "u", descriptor = "[[I")
	static final int[][] anIntArrayArray45 = new int[6][];

	@OriginalMember(owner = "client!apo", name = "f", descriptor = "Lclient!adr;")
	Class84_Sub2 aClass84_Sub2_2;

	@OriginalMember(owner = "client!apo", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_33;

	@OriginalMember(owner = "client!apo", name = "e", descriptor = "I")
	final int anInt2552;

	@OriginalMember(owner = "client!apo", name = "<init>", descriptor = "(Lclient!afm;I)V")
	Class106_Sub1_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_33 = arg0;
		this.anInt2552 = arg1;
	}

	@OriginalMember(owner = "client!apo", name = "e", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18208() {
		if (this.aClass84_Sub2_2 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub3_33.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub3_33.aClass235_6.method26120(this.anInt2552, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 52)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 28);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.aClass84_Sub2_2 = new Class84_Sub2(this.aClass102_Sub3_33, Class210.aClass210_25, Class236.aClass236_21, local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray45);
		}
		return this.aClass84_Sub2_2;
	}

	@OriginalMember(owner = "client!apo", name = "t", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18209() {
		if (this.aClass84_Sub2_2 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub3_33.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub3_33.aClass235_6.method26120(this.anInt2552, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 10)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 115);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.aClass84_Sub2_2 = new Class84_Sub2(this.aClass102_Sub3_33, Class210.aClass210_25, Class236.aClass236_21, local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray45);
		}
		return this.aClass84_Sub2_2;
	}

	@OriginalMember(owner = "client!apo", name = "f", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18210() {
		if (this.aClass84_Sub2_2 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub3_33.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub3_33.aClass235_6.method26120(this.anInt2552, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) -17)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 25);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.aClass84_Sub2_2 = new Class84_Sub2(this.aClass102_Sub3_33, Class210.aClass210_25, Class236.aClass236_21, local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray45);
		}
		return this.aClass84_Sub2_2;
	}

	@OriginalMember(owner = "client!apo", name = "u", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18212() {
		if (this.aClass84_Sub2_2 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub3_33.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub3_33.aClass235_6.method26120(this.anInt2552, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 4)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 46);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.aClass84_Sub2_2 = new Class84_Sub2(this.aClass102_Sub3_33, Class210.aClass210_25, Class236.aClass236_21, local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray45);
		}
		return this.aClass84_Sub2_2;
	}

	@OriginalMember(owner = "client!apo", name = "l", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18211() {
		if (this.aClass84_Sub2_2 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub3_33.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub3_33.aClass235_6.method26120(this.anInt2552, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 13)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 9);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray45[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray45[local81], 0, local75);
			}
			this.aClass84_Sub2_2 = new Class84_Sub2(this.aClass102_Sub3_33, Class210.aClass210_25, Class236.aClass236_21, local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray45);
		}
		return this.aClass84_Sub2_2;
	}
}
