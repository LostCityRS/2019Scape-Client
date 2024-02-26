package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class598 implements Interface66 {

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
	static int anInt5364;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "Lclient!acv;")
	final Class70 aClass70_3;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Ljava/lang/String;")
	final String aString230;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	final int anInt5365;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "Ljava/lang/String;")
	final String aString229;

	@OriginalMember(owner = "client!uq", name = "sk", descriptor = "(Lclient!yp;I)V")
	static void method32025(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2074853784);
		Class103_Sub12.method7922(local16, arg0, 1738479497);
	}

	@OriginalMember(owner = "client!uq", name = "ana", descriptor = "(Lclient!yp;I)V")
	static void method32026(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class238.method26206(arg0, arg0.aClass120_Sub1_Sub1_Sub1_4, (short) 16272);
	}

	@OriginalMember(owner = "client!uq", name = "apn", descriptor = "(Lclient!yp;I)V")
	static void method32027(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class218.method25872(-1277705824).method37268();
	}

	@OriginalMember(owner = "client!uq", name = "acl", descriptor = "(Lclient!yp;B)V")
	static void method32028(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class144.aClass80_Sub32_2 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
			arg0.aClass80_Sub32_4 = Class144.aClass80_Sub32_2;
		}
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!acv;Ljava/lang/String;ILjava/lang/Throwable;)V")
	Class598(@OriginalArg(0) Class70 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass70_3 = arg0;
		this.aString230 = arg1;
		this.anInt5365 = arg2 * 1742454963;
		this.aString229 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "()V")
	@Override
	public void method32126() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_89, client.aClass75_1.aClass22_1, -191270971);
		@Pc(16) int local16 = (local5.aClass80_Sub36_Sub1_2.anInt3152 += 1034180571) * -1380987821;
		local5.aClass80_Sub36_Sub1_2.method23154(this.aClass70_3.method37268(), 1275868335);
		local5.aClass80_Sub36_Sub1_2.method23165(this.aString230, 2078288974);
		local5.aClass80_Sub36_Sub1_2.method23155(this.anInt5365 * 1554837115, (byte) -95);
		local5.aClass80_Sub36_Sub1_2.method23165(Class531.aString221, 1636219507);
		if (this.aString229 == null) {
			local5.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local5.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(54) String local54 = this.aString229;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass80_Sub36_Sub1_2.method23165(local54, 2082518753);
		}
		local5.aClass80_Sub36_Sub1_2.method23171(local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local16, (byte) 119);
		client.aClass75_1.method1325(local5, (byte) -27);
	}

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "(I)V")
	@Override
	public void method32127(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_89, client.aClass75_1.aClass22_1, -191270971);
		@Pc(16) int local16 = (local5.aClass80_Sub36_Sub1_2.anInt3152 += 1034180571) * -1380987821;
		local5.aClass80_Sub36_Sub1_2.method23154(this.aClass70_3.method37268(), 1275868335);
		local5.aClass80_Sub36_Sub1_2.method23165(this.aString230, 1740426046);
		local5.aClass80_Sub36_Sub1_2.method23155(this.anInt5365 * 1554837115, (byte) -125);
		local5.aClass80_Sub36_Sub1_2.method23165(Class531.aString221, 1695163400);
		if (this.aString229 == null) {
			local5.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local5.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(54) String local54 = this.aString229;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass80_Sub36_Sub1_2.method23165(local54, 1689492914);
		}
		local5.aClass80_Sub36_Sub1_2.method23171(local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local16, (byte) 108);
		client.aClass75_1.method1325(local5, (byte) -18);
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "()V")
	@Override
	public void method32128() {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_89, client.aClass75_1.aClass22_1, -191270971);
		@Pc(16) int local16 = (local5.aClass80_Sub36_Sub1_2.anInt3152 += 1034180571) * -1380987821;
		local5.aClass80_Sub36_Sub1_2.method23154(this.aClass70_3.method37268(), 1275868335);
		local5.aClass80_Sub36_Sub1_2.method23165(this.aString230, 1781526834);
		local5.aClass80_Sub36_Sub1_2.method23155(this.anInt5365 * 1554837115, (byte) -18);
		local5.aClass80_Sub36_Sub1_2.method23165(Class531.aString221, 1984597830);
		if (this.aString229 == null) {
			local5.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		} else {
			local5.aClass80_Sub36_Sub1_2.method23154(1, 1275868335);
			@Pc(54) String local54 = this.aString229;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass80_Sub36_Sub1_2.method23165(local54, 1883257328);
		}
		local5.aClass80_Sub36_Sub1_2.method23171(local5.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local16, (byte) 113);
		client.aClass75_1.method1325(local5, (byte) -56);
	}
}
