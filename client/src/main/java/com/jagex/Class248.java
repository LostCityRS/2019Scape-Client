package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class248 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!akw;")
	Class80_Sub1 aClass80_Sub1_69 = new Class80_Sub1();

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "Lclient!aaa;")
	SecondaryLinkedList aSecondaryLinkedList_14 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	int anInt3869;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	int anInt3870;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "Lclient!aax;")
	Class24 aClass24_24;

	@OriginalMember(owner = "client!eq", name = "bal", descriptor = "(Lclient!yp;I)V")
	static void method26338(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class279.aClass102_9.method21081()) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub43_2.method16950(local12, (byte) -127);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!eq", name = "aef", descriptor = "(Lclient!yp;B)V")
	static void method26339(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(14) long local14 = (long) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) long local25 = (long) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (local14 * local25 / 100L + local14);
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(I)V")
	public Class248(@OriginalArg(0) int arg0) {
		this.anInt3869 = arg0 * 1221990371;
		this.anInt3870 = arg0 * -969251305;
		@Pc(23) int local23;
		for (local23 = 1; local23 + local23 < arg0; local23 += local23) {
		}
		this.aClass24_24 = new Class24(local23);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(Lclient!akw;J)V")
	public void method26330(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3870 * -676646489 == 0) {
			@Pc(9) Class80_Sub1 local9 = this.aSecondaryLinkedList_14.method67(835173147);
			local9.method24395((byte) 120);
			local9.unlinkSecondary(-2147483643);
			if (this.aClass80_Sub1_69 == local9) {
				local9 = this.aSecondaryLinkedList_14.method67(-834238014);
				local9.method24395((byte) 96);
				local9.unlinkSecondary(-2147483641);
			}
		} else {
			this.anInt3870 -= -969251305;
		}
		this.aClass24_24.method563(arg0, arg1);
		this.aSecondaryLinkedList_14.addTail(arg0, 1599142138);
	}

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "(J)Lclient!akw;")
	public Class80_Sub1 method26331(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1 local5 = (Class80_Sub1) this.aClass24_24.method560(arg0);
		if (local5 != null) {
			this.aSecondaryLinkedList_14.addTail(local5, 1599142138);
		}
		return local5;
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	public void method26332(@OriginalArg(0) int arg0) {
		this.aSecondaryLinkedList_14.method41(-252802305);
		this.aClass24_24.method564(-1272458582);
		this.aClass80_Sub1_69 = new Class80_Sub1();
		this.anInt3870 = this.anInt3869 * 2135590717;
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "()V")
	public void method26333() {
		this.aSecondaryLinkedList_14.method41(-252802305);
		this.aClass24_24.method564(-1747074140);
		this.aClass80_Sub1_69 = new Class80_Sub1();
		this.anInt3870 = this.anInt3869 * 2135590717;
	}

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "(J)Lclient!akw;")
	public Class80_Sub1 method26334(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1 local5 = (Class80_Sub1) this.aClass24_24.method560(arg0);
		if (local5 != null) {
			this.aSecondaryLinkedList_14.addTail(local5, 1599142138);
		}
		return local5;
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(J)Lclient!akw;")
	public Class80_Sub1 method26335(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1 local5 = (Class80_Sub1) this.aClass24_24.method560(arg0);
		if (local5 != null) {
			this.aSecondaryLinkedList_14.addTail(local5, 1599142138);
		}
		return local5;
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "()V")
	public void method26336() {
		this.aSecondaryLinkedList_14.method41(-252802305);
		this.aClass24_24.method564(-258520469);
		this.aClass80_Sub1_69 = new Class80_Sub1();
		this.anInt3870 = this.anInt3869 * 2135590717;
	}

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "()V")
	public void method26337() {
		this.aSecondaryLinkedList_14.method41(-252802305);
		this.aClass24_24.method564(-1669491269);
		this.aClass80_Sub1_69 = new Class80_Sub1();
		this.anInt3870 = this.anInt3869 * 2135590717;
	}
}
