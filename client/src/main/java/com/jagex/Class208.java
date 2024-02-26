package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class208 implements Interface75 {

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Lclient!cl;")
	static final Class208 aClass208_9 = new Class208(0, 0);

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!cl;")
	static final Class208 aClass208_2 = new Class208(1, 1);

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!cl;")
	static final Class208 aClass208_3 = new Class208(2, 2);

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!cl;")
	static final Class208 aClass208_4 = new Class208(3, 3);

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!cl;")
	static final Class208 aClass208_1 = new Class208(4, 4);

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!cl;")
	static final Class208 aClass208_6 = new Class208(5, 5);

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!cl;")
	static final Class208 aClass208_7 = new Class208(6, 6);

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!cl;")
	static final Class208 aClass208_8 = new Class208(7, 7);

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!cl;")
	static final Class208 aClass208_5 = new Class208(8, 8);

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	final int anInt3397;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	final int anInt3398;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "()[Lclient!cl;")
	static Class208[] method25006() {
		return new Class208[] { aClass208_9, aClass208_2, aClass208_3, aClass208_4, aClass208_1, aClass208_6, aClass208_7, aClass208_8, aClass208_5 };
	}

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "(I)Lclient!cl;")
	static Class208 method25007(@OriginalArg(0) int arg0) {
		@Pc(6) Class208 local6 = (Class208) Class80_Sub39.method15030(Class73_Sub1.method17920((byte) -46), arg0, -2113228984);
		if (local6 == null) {
			local6 = aClass208_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "(I)Lclient!cl;")
	static Class208 method25008(@OriginalArg(0) int arg0) {
		@Pc(6) Class208 local6 = (Class208) Class80_Sub39.method15030(Class73_Sub1.method17920((byte) -62), arg0, -2100954189);
		if (local6 == null) {
			local6 = aClass208_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(Lclient!yp;I)V")
	static void method25009(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class352 local16 = (Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -811053944);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anIntArray428 == null ? 0 : local16.anIntArray428.length;
	}

	@OriginalMember(owner = "client!cl", name = "sw", descriptor = "(Lclient!yp;S)V")
	static void method25010(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4127 * 233524551;
	}

	@OriginalMember(owner = "client!cl", name = "aap", descriptor = "(Lclient!yp;I)V")
	static void method25011(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class14.aClass164Array1 == null || local12 >= Class274.anInt3924 * -912877411 || !Class14.aClass164Array1[local12].aString64.equalsIgnoreCase(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!cl", name = "aac", descriptor = "(Lclient!yp;I)V")
	static void method25012(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.aString148 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class693.method37005(client.aString148, 222573477);
		}
	}

	@OriginalMember(owner = "client!cl", name = "at", descriptor = "(IIIII)V")
	static void method25013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3397 = arg0 * 943398431;
		this.anInt3398 = arg1 * 1961353925;
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3398 * 2008763405;
	}

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3398 * 2008763405;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3398 * 2008763405;
	}
}
