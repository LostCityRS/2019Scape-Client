package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ape")
public final class Class106_Sub2_Sub1 extends Class106_Sub2 {

	@OriginalMember(owner = "client!ape", name = "u", descriptor = "[[I")
	static final int[][] anIntArrayArray44 = new int[6][];

	@OriginalMember(owner = "client!ape", name = "f", descriptor = "Lclient!ml;")
	Interface42 anInterface42_4;

	@OriginalMember(owner = "client!ape", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_28;

	@OriginalMember(owner = "client!ape", name = "e", descriptor = "I")
	final int anInt2478;

	@OriginalMember(owner = "client!ape", name = "<init>", descriptor = "(Lclient!afa;I)V")
	Class106_Sub2_Sub1(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_28 = arg0;
		this.anInt2478 = arg1;
	}

	@OriginalMember(owner = "client!ape", name = "t", descriptor = "()Lclient!ml;")
	@Override
	Interface42 method17951() {
		if (this.anInterface42_4 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub1_28.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub1_28.aClass235_6.method26120(this.anInt2478, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 73)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 64);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.anInterface42_4 = this.aClass102_Sub1_28.method21213(local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray44);
		}
		return this.anInterface42_4;
	}

	@OriginalMember(owner = "client!ape", name = "e", descriptor = "()Lclient!ml;")
	@Override
	Interface42 method17950() {
		if (this.anInterface42_4 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub1_28.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub1_28.aClass235_6.method26120(this.anInt2478, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) -83)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 27);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.anInterface42_4 = this.aClass102_Sub1_28.method21213(local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray44);
		}
		return this.anInterface42_4;
	}

	@OriginalMember(owner = "client!ape", name = "f", descriptor = "()Lclient!ml;")
	@Override
	Interface42 method17952() {
		if (this.anInterface42_4 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub1_28.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub1_28.aClass235_6.method26120(this.anInt2478, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) -48)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 49);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.anInterface42_4 = this.aClass102_Sub1_28.method21213(local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray44);
		}
		return this.anInterface42_4;
	}

	@OriginalMember(owner = "client!ape", name = "u", descriptor = "()Lclient!ml;")
	@Override
	Interface42 method17953() {
		if (this.anInterface42_4 == null) {
			@Pc(6) Interface23 local6 = this.aClass102_Sub1_28.anInterface23_7;
			@Pc(14) Class227 local14 = this.aClass102_Sub1_28.aClass235_6.method26120(this.anInt2478, 73831368);
			if (local14 == null) {
				return null;
			}
			if (!local14.aBoolean756) {
				return null;
			}
			if (!local6.method7763(Class616.aClass616_3, local14.anInt3652 * 343031549, -1, Class617.aClass617_3, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) -25)) {
				return null;
			}
			@Pc(65) int[] local65 = local6.method7755(Class616.aClass616_3, local14.anInt3652 * 343031549, 1.0F, local14.anInt3654 * 1615444793, local14.anInt3654 * 1615444793, false, (byte) 35);
			@Pc(75) int local75 = local14.anInt3654 * 1615444793 * local14.anInt3654 * 1615444793;
			if (local65 == null) {
				return null;
			}
			for (@Pc(81) int local81 = 0; local81 < 6; local81++) {
				anIntArrayArray44[local81] = new int[local75];
				System.arraycopy(local65, local75 * local81, anIntArrayArray44[local81], 0, local75);
			}
			this.anInterface42_4 = this.aClass102_Sub1_28.method21213(local14.anInt3654 * 1615444793, local14.aByte118 != 0, anIntArrayArray44);
		}
		return this.anInterface42_4;
	}
}
