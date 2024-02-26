package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class182 {

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Ljava/lang/Object;")
	static Object anObject10;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	static final int anInt3319 = 128;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	static final int anInt3320 = 128;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	static final int anInt3321 = 4000;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljava/lang/Object;")
	static Object anObject11;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	static final int anInt3322 = 16;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Ljava/lang/Object;")
	static Object anObject12;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[Lclient!adm;")
	Class84_Sub1[] aClass84_Sub1Array2 = null;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!ads;")
	Class84_Sub3 aClass84_Sub3_1 = null;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "[Lclient!adm;")
	Class84_Sub1[] aClass84_Sub1Array3 = null;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!ads;")
	Class84_Sub3 aClass84_Sub3_2 = null;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!ads;")
	Class84_Sub3 aClass84_Sub3_3 = null;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Z")
	boolean aBoolean675;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(Lclient!afm;)V")
	static void method24686(@OriginalArg(0) Class102_Sub3 arg0) {
		@Pc(11) byte[] local11;
		if (anObject11 == null) {
			@Pc(5) Class137_Sub2_Sub1 local5 = new Class137_Sub2_Sub1();
			local11 = local5.method19183(128, 128, 16);
			anObject11 = Class696.method37040(local11, false, (short) 256);
		}
		if (anObject12 == null) {
			@Pc(22) Class137_Sub1_Sub2 local22 = new Class137_Sub1_Sub2();
			local11 = local22.method20623(128, 128, 16);
			anObject12 = Class696.method37040(local11, false, (short) 256);
		}
		@Pc(36) Class215 local36 = arg0.aClass215_1;
		if (local36.method25839() && anObject10 == null) {
			local11 = Class581.method31815(128, 128, 16, 8, new Class153_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject10 = Class696.method37040(local11, false, (short) 256);
		}
	}

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "(Lclient!afm;)V")
	static void method24687(@OriginalArg(0) Class102_Sub3 arg0) {
		@Pc(11) byte[] local11;
		if (anObject11 == null) {
			@Pc(5) Class137_Sub2_Sub1 local5 = new Class137_Sub2_Sub1();
			local11 = local5.method19183(128, 128, 16);
			anObject11 = Class696.method37040(local11, false, (short) 256);
		}
		if (anObject12 == null) {
			@Pc(22) Class137_Sub1_Sub2 local22 = new Class137_Sub1_Sub2();
			local11 = local22.method20623(128, 128, 16);
			anObject12 = Class696.method37040(local11, false, (short) 256);
		}
		@Pc(36) Class215 local36 = arg0.aClass215_1;
		if (local36.method25839() && anObject10 == null) {
			local11 = Class581.method31815(128, 128, 16, 8, new Class153_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject10 = Class696.method37040(local11, false, (short) 256);
		}
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class182(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aBoolean675 = arg0.aBoolean138;
		method24687(arg0);
		if (this.aBoolean675) {
			@Pc(103) byte[] local103 = Class217.method25867(anObject11, false, (byte) 29);
			this.aClass84_Sub3_1 = new Class84_Sub3(arg0, Class210.aClass210_26, Class236.aClass236_21, 128, 128, 16, local103, Class210.aClass210_26);
			@Pc(121) byte[] local121 = Class217.method25867(anObject12, false, (byte) 0);
			this.aClass84_Sub3_2 = new Class84_Sub3(arg0, Class210.aClass210_26, Class236.aClass236_21, 128, 128, 16, local121, Class210.aClass210_26);
			@Pc(137) Class215 local137 = arg0.aClass215_1;
			if (local137.method25839()) {
				local103 = Class217.method25867(anObject10, false, (byte) -87);
				this.aClass84_Sub3_3 = new Class84_Sub3(arg0, Class210.aClass210_24, Class236.aClass236_21, 128, 128, 16);
				@Pc(168) Class84_Sub3 local168 = new Class84_Sub3(arg0, Class210.aClass210_19, Class236.aClass236_21, 128, 128, 16, local103, Class210.aClass210_19);
				if (local137.method25840(this.aClass84_Sub3_3, local168, 2.0F)) {
					this.aClass84_Sub3_3.method18319();
				} else {
					this.aClass84_Sub3_3.method18322();
					this.aClass84_Sub3_3 = null;
				}
				local168.method18322();
			}
		} else {
			this.aClass84_Sub1Array2 = new Class84_Sub1[16];
			@Pc(31) int local31;
			@Pc(42) byte[] local42;
			for (local31 = 0; local31 < 16; local31++) {
				local42 = Class297.method27006(anObject11, local31 * 32768, 32768, (byte) 82);
				this.aClass84_Sub1Array2[local31] = new Class84_Sub1(arg0, 3553, Class210.aClass210_26, Class236.aClass236_21, 128, 128, true, local42, Class210.aClass210_26, false);
			}
			this.aClass84_Sub1Array3 = new Class84_Sub1[16];
			for (local31 = 0; local31 < 16; local31++) {
				local42 = Class297.method27006(anObject12, local31 * 32768, 32768, (byte) 33);
				this.aClass84_Sub1Array3[local31] = new Class84_Sub1(arg0, 3553, Class210.aClass210_26, Class236.aClass236_21, 128, 128, true, local42, Class210.aClass210_26, false);
			}
		}
	}
}
