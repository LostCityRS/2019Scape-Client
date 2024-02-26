package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class202 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_65 = new Class243(10485760, 256);

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_45;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!ew;")
	final Interface23 anInterface23_8;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!afm;Lclient!ew;)V")
	Class202(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Interface23 arg1) {
		this.aClass102_Sub3_45 = arg0;
		this.anInterface23_8 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "()V")
	void method24959() {
		this.aClass243_65.method26247(5, (byte) 125);
	}

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "(Lclient!dl;)Lclient!adm;")
	Class84_Sub1 method24960(@OriginalArg(0) Class227 arg0) {
		return this.method24961(arg0, arg0.anInt3654 * 1615444793);
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(Lclient!dl;I)Lclient!adm;")
	Class84_Sub1 method24961(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class84_Sub1 local9 = (Class84_Sub1) this.aClass243_65.method26282((long) (arg0.anInt3638 * 1778576723));
		if (local9 != null) {
			return local9;
		} else if (this.method24962(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3654 * 1615444793;
			}
			@Pc(93) Class84_Sub1 local93;
			if (arg0.aBoolean757 && this.aClass102_Sub3_45.method20784()) {
				@Pc(112) float[] local112 = this.anInterface23_8.method7757(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, 0.7F, arg1, arg1, false, 542176978);
				local93 = new Class84_Sub1(this.aClass102_Sub3_45, 3553, Class210.aClass210_24, Class236.aClass236_25, arg1, arg1, arg0.aByte118 != 0, local112, Class210.aClass210_24);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
					local59 = this.anInterface23_8.method7755(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, true, (byte) 52);
				} else {
					local59 = this.anInterface23_8.method7756(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, false, -1992375142);
				}
				local93 = new Class84_Sub1(this.aClass102_Sub3_45, 3553, arg1, arg1, arg0.aByte118 != 0, local59, 0, 0, false);
			}
			local93.method18355(arg0.aByte114 == 1, arg0.aByte119 == 1);
			this.aClass243_65.method26254(local93, (long) (arg0.anInt3638 * 1778576723), arg1 * arg1, (byte) -119);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(Lclient!vl;Lclient!dl;I)Z")
	boolean method24962(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3654 * 1615444793;
		}
		if (arg1.aBoolean757 && this.aClass102_Sub3_45.method20784()) {
			return this.anInterface23_8.method7763(arg0, arg1.anInt3652 * 343031549, arg1.anInt3653 * 313191253, Class617.aClass617_1, 0.7F, arg2, arg2, false, (byte) 6);
		} else if (arg1.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg1.aByte110, (byte) 1)) {
			return this.anInterface23_8.method7763(arg0, arg1.anInt3652 * 343031549, -1, Class617.aClass617_3, 0.7F, arg2, arg2, true, (byte) 51);
		} else {
			return this.anInterface23_8.method7763(arg0, arg1.anInt3652 * 343031549, -1, Class617.aClass617_2, 0.7F, arg2, arg2, false, (byte) -30);
		}
	}

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "()V")
	void method24963() {
		this.aClass243_65.method26247(5, (byte) 125);
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "()V")
	void method24964() {
		this.aClass243_65.method26256(1693912082);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(Lclient!dl;I)Lclient!adm;")
	Class84_Sub1 method24965(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class84_Sub1 local9 = (Class84_Sub1) this.aClass243_65.method26282((long) (arg0.anInt3638 * 1778576723));
		if (local9 != null) {
			return local9;
		} else if (this.method24962(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3654 * 1615444793;
			}
			@Pc(93) Class84_Sub1 local93;
			if (arg0.aBoolean757 && this.aClass102_Sub3_45.method20784()) {
				@Pc(112) float[] local112 = this.anInterface23_8.method7757(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, 0.7F, arg1, arg1, false, 694726261);
				local93 = new Class84_Sub1(this.aClass102_Sub3_45, 3553, Class210.aClass210_24, Class236.aClass236_25, arg1, arg1, arg0.aByte118 != 0, local112, Class210.aClass210_24);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
					local59 = this.anInterface23_8.method7755(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, true, (byte) 84);
				} else {
					local59 = this.anInterface23_8.method7756(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, false, 1080954769);
				}
				local93 = new Class84_Sub1(this.aClass102_Sub3_45, 3553, arg1, arg1, arg0.aByte118 != 0, local59, 0, 0, false);
			}
			local93.method18355(arg0.aByte114 == 1, arg0.aByte119 == 1);
			this.aClass243_65.method26254(local93, (long) (arg0.anInt3638 * 1778576723), arg1 * arg1, (byte) -5);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "()V")
	void method24966() {
		this.aClass243_65.method26247(5, (byte) 91);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "()V")
	void method24967() {
		this.aClass243_65.method26247(5, (byte) 46);
	}

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "()V")
	void method24968() {
		this.aClass243_65.method26256(1693912082);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	void method24969() {
		this.aClass243_65.method26256(1693912082);
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(Lclient!dl;)Lclient!adm;")
	Class84_Sub1 method24970(@OriginalArg(0) Class227 arg0) {
		return this.method24961(arg0, arg0.anInt3654 * 1615444793);
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "()V")
	void method24971() {
		this.aClass243_65.method26256(1693912082);
	}
}
