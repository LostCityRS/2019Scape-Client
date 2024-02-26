package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoh")
public final class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!aoh", name = "v", descriptor = "(I)Lclient!ald;")
	static Packet method17258(@OriginalArg(0) int arg0) {
		@Pc(4) Packet local4 = new Packet(518);
		Class238.anIntArray354 = new int[4];
		Class238.anIntArray354[0] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[1] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[2] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[3] = Class66.aSecureRandom1.nextInt();
		local4.p1(10);
		local4.p4(Class238.anIntArray354[0]);
		local4.p4(Class238.anIntArray354[1]);
		local4.p4(Class238.anIntArray354[2]);
		local4.p4(Class238.anIntArray354[3]);
		local4.p8(Class238.aLong357 * -3618167682495159963L);
		if (client.anInt3433 * 1994758437 == 14) {
			local4.p4(Class157_Sub1.anIntArray200[0]);
			local4.p4(Class157_Sub1.anIntArray200[1]);
			local4.p4(Class157_Sub1.anIntArray200[2]);
			local4.p4(Class157_Sub1.anIntArray200[3]);
		}
		Class157_Sub1.anIntArray200 = Class238.anIntArray354;
		return local4;
	}

	@OriginalMember(owner = "client!aoh", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;)V")
	public Class41_Sub7(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2) {
		super(arg0, arg1, arg2, Class664.aClass664_70, 16, new Class63(Class599.class));
	}
}
