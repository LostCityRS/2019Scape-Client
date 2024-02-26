package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoh")
public final class Class41_Sub7 extends Class41 {

	@OriginalMember(owner = "client!aoh", name = "v", descriptor = "(I)Lclient!ald;")
	static Class80_Sub36 method17258(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(518);
		Class238.anIntArray354 = new int[4];
		Class238.anIntArray354[0] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[1] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[2] = Class66.aSecureRandom1.nextInt();
		Class238.anIntArray354[3] = Class66.aSecureRandom1.nextInt();
		local4.method23154(10, 1275868335);
		local4.method23345(Class238.anIntArray354[0], (byte) 50);
		local4.method23345(Class238.anIntArray354[1], (byte) 52);
		local4.method23345(Class238.anIntArray354[2], (byte) 9);
		local4.method23345(Class238.anIntArray354[3], (byte) 127);
		local4.method23162(Class238.aLong357 * -3618167682495159963L);
		if (client.anInt3433 * 1994758437 == 14) {
			local4.method23345(Class157_Sub1.anIntArray200[0], (byte) 53);
			local4.method23345(Class157_Sub1.anIntArray200[1], (byte) 49);
			local4.method23345(Class157_Sub1.anIntArray200[2], (byte) 10);
			local4.method23345(Class157_Sub1.anIntArray200[3], (byte) 21);
		}
		Class157_Sub1.anIntArray200 = Class238.anIntArray354;
		return local4;
	}

	@OriginalMember(owner = "client!aoh", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;)V")
	public Class41_Sub7(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2) {
		super(arg0, arg1, arg2, Class664.aClass664_70, 16, new Class63(Class599.class));
	}
}
