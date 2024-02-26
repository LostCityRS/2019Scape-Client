package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class395 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!ej;")
	Class243 aClass243_80 = new Class243(10485760, 256);

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_35;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!ew;")
	final Interface23 anInterface23_9;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!afa;Lclient!ew;)V")
	Class395(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Interface23 arg1) {
		this.aClass102_Sub1_35 = arg0;
		this.anInterface23_9 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "(Lclient!dl;I)Z")
	boolean method28691(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3654 * 1615444793;
		}
		if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, Class617.aClass617_1, 0.7F, arg1, arg1, false, (byte) 31);
		} else if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_3, 0.7F, arg1, arg1, true, (byte) -66);
		} else {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_2, 0.7F, arg1, arg1, false, (byte) 83);
		}
	}

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "(Lclient!dl;)Lclient!lb;")
	Interface34 method28692(@OriginalArg(0) Class227 arg0) {
		return this.method28694(arg0, arg0.anInt3654 * 1615444793);
	}

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "()V")
	void method28693() {
		this.aClass243_80.method26256(1693912082);
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(Lclient!dl;I)Lclient!lb;")
	Interface34 method28694(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3638 * 1778576723);
		@Pc(15) Interface34 local15 = (Interface34) this.aClass243_80.method26282(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28703(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3654 * 1615444793;
			}
			@Pc(91) Interface34 local91;
			if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
				@Pc(110) float[] local110 = this.anInterface23_9.method7757(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, 0.7F, arg1, arg1, false, 313716060);
				local91 = this.aClass102_Sub1_35.method21208(Class210.aClass210_24, arg1, arg1, true, local110);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
					local64 = this.anInterface23_9.method7755(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, true, (byte) 49);
				} else {
					local64 = this.anInterface23_9.method7756(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, false, 2111171145);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass102_Sub1_35.method21206(arg1, arg1, true, local64);
			}
			local91.method11656(arg0.aByte114 == 1, arg0.aByte119 == 1);
			this.aClass243_80.method26254(local91, local9, arg1 * arg1, (byte) -6);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "()V")
	void method28695() {
		this.aClass243_80.method26247(5, (byte) 71);
	}

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
	void method28696() {
		this.aClass243_80.method26256(1693912082);
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(Lclient!dl;)Lclient!lb;")
	Interface34 method28697(@OriginalArg(0) Class227 arg0) {
		return this.method28694(arg0, arg0.anInt3654 * 1615444793);
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(Lclient!dl;I)Lclient!lb;")
	Interface34 method28698(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3638 * 1778576723);
		@Pc(15) Interface34 local15 = (Interface34) this.aClass243_80.method26282(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28703(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3654 * 1615444793;
			}
			@Pc(91) Interface34 local91;
			if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
				@Pc(110) float[] local110 = this.anInterface23_9.method7757(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, 0.7F, arg1, arg1, false, 1693804437);
				local91 = this.aClass102_Sub1_35.method21208(Class210.aClass210_24, arg1, arg1, true, local110);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
					local64 = this.anInterface23_9.method7755(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, true, (byte) 46);
				} else {
					local64 = this.anInterface23_9.method7756(Class616.aClass616_2, arg0.anInt3652 * 343031549, 0.7F, arg1, arg1, false, 1124376332);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass102_Sub1_35.method21206(arg1, arg1, true, local64);
			}
			local91.method11656(arg0.aByte114 == 1, arg0.aByte119 == 1);
			this.aClass243_80.method26254(local91, local9, arg1 * arg1, (byte) -84);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "(Lclient!dl;I)Z")
	boolean method28699(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3654 * 1615444793;
		}
		if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, Class617.aClass617_1, 0.7F, arg1, arg1, false, (byte) 38);
		} else if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_3, 0.7F, arg1, arg1, true, (byte) -14);
		} else {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_2, 0.7F, arg1, arg1, false, (byte) 13);
		}
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "()V")
	void method28700() {
		this.aClass243_80.method26256(1693912082);
	}

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "(Lclient!dl;I)Z")
	boolean method28701(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3654 * 1615444793;
		}
		if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, Class617.aClass617_1, 0.7F, arg1, arg1, false, (byte) -33);
		} else if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_3, 0.7F, arg1, arg1, true, (byte) 86);
		} else {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_2, 0.7F, arg1, arg1, false, (byte) -31);
		}
	}

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "()V")
	void method28702() {
		this.aClass243_80.method26247(5, (byte) 10);
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(Lclient!dl;I)Z")
	boolean method28703(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3654 * 1615444793;
		}
		if (arg0.aBoolean757 && this.aClass102_Sub1_35.method20784()) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, arg0.anInt3653 * 313191253, Class617.aClass617_1, 0.7F, arg1, arg1, false, (byte) -4);
		} else if (arg0.aClass608_2 == Class608.aClass608_5 && Class58.method15723(arg0.aByte110, (byte) 1)) {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_3, 0.7F, arg1, arg1, true, (byte) 1);
		} else {
			return this.anInterface23_9.method7763(Class616.aClass616_2, arg0.anInt3652 * 343031549, -1, Class617.aClass617_2, 0.7F, arg1, arg1, false, (byte) 62);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
	void method28704() {
		this.aClass243_80.method26247(5, (byte) 64);
	}

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "()V")
	void method28705() {
		this.aClass243_80.method26256(1693912082);
	}
}
