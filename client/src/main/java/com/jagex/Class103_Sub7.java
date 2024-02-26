package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agc")
public final class Class103_Sub7 extends Class103 {

	@OriginalMember(owner = "client!agc", name = "i", descriptor = "Lclient!pf;")
	static Class480 aClass480_19;

	@OriginalMember(owner = "client!agc", name = "f", descriptor = "I")
	final int anInt926;

	@OriginalMember(owner = "client!agc", name = "e", descriptor = "I")
	final int anInt927;

	@OriginalMember(owner = "client!agc", name = "u", descriptor = "I")
	final int anInt928;

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "I")
	final int anInt929;

	@OriginalMember(owner = "client!agc", name = "g", descriptor = "Lclient!rh;")
	Class529 aClass529_1;

	@OriginalMember(owner = "client!agc", name = "mu", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method7849(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = client.aBoolean731 ? 400 : 100;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3519 * 227319795 >= local5) {
			Class141.method10906(4, client.aBoolean731 ? Class60.aClass60_149.method1180(Class512.aClass719_3, -1949111643) : Class60.aClass60_79.method1180(Class512.aClass719_3, -640602582), (byte) 15);
			return;
		}
		@Pc(33) String local33 = Class635.method32821(arg0, Class126.aClass91_13, 1176568415);
		if (local33 == null) {
			return;
		}
		@Pc(38) int local38;
		@Pc(53) String local53;
		@Pc(85) String local85;
		for (local38 = 0; local38 < client.anInt3519 * 227319795; local38++) {
			@Pc(47) Class699 local47 = client.aClass699Array1[local38];
			local53 = Class635.method32821(local47.aString244, Class126.aClass91_13, 1754294399);
			if (local53 != null && local53.equals(local33)) {
				Class141.method10906(4, arg0 + Class60.aClass60_100.method1180(Class512.aClass719_3, -1931485548), (byte) 92);
				return;
			}
			if (local47.aString242 != null) {
				local85 = Class635.method32821(local47.aString242, Class126.aClass91_13, 973755041);
				if (local85 != null && local85.equals(local33)) {
					Class141.method10906(4, arg0 + Class60.aClass60_100.method1180(Class512.aClass719_3, -1349215031), (byte) 1);
					return;
				}
			}
		}
		for (local38 = 0; local38 < client.anInt3573 * 975306769; local38++) {
			@Pc(119) Class676 local119 = client.aClass676Array1[local38];
			local53 = Class635.method32821(local119.aString236, Class126.aClass91_13, 11857063);
			if (local53 != null && local53.equals(local33)) {
				Class141.method10906(4, Class60.aClass60_157.method1180(Class512.aClass719_3, -1564987335) + arg0 + Class60.aClass60_158.method1180(Class512.aClass719_3, 1583182267), (byte) 47);
				return;
			}
			if (local119.aString237 != null) {
				local85 = Class635.method32821(local119.aString237, Class126.aClass91_13, 2140133213);
				if (local85 != null && local85.equals(local33)) {
					Class141.method10906(4, Class60.aClass60_157.method1180(Class512.aClass719_3, -920350643) + arg0 + Class60.aClass60_158.method1180(Class512.aClass719_3, -1565428291), (byte) 33);
					return;
				}
			}
		}
		if (Class635.method32821(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73, Class126.aClass91_13, 1311418968).equals(local33)) {
			Class141.method10906(4, Class60.aClass60_171.method1180(Class512.aClass719_3, 1490669162), (byte) 13);
			return;
		}
		@Pc(208) Class75 local208 = Class52.method1074(16777215);
		@Pc(214) Class80_Sub31 local214 = Class623.method32440(Class443.aClass443_15, local208.aClass22_1, -191270971);
		local214.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(arg0, (short) 16383) + 1, 1275868335);
		local214.aClass80_Sub36_Sub1_2.method23165(arg0, 2064669924);
		local214.aClass80_Sub36_Sub1_2.method23154(arg1 ? 1 : 0, 1275868335);
		local208.method1325(local214, (byte) -40);
	}

	@OriginalMember(owner = "client!agc", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub7(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt926 = arg0.method23178((byte) -93) * -1312806833;
		this.anInt927 = arg0.method23362(-738765500) * -1708666999;
		this.anInt928 = arg0.method23362(-195356621) * 458307329;
		this.anInt929 = arg0.method23362(-558327380) * 1628070409;
		this.aClass529_1 = Class490.aClass263_13.method26536(Class280.aClass280_9, this, this.anInt926 * -1083838801, this.anInt929 * 1514785849, this.anInt927 * -1851042119, Class278.aClass278_5.method26831(-697689830), Class269.aClass269_5, 0.0F, 0.0F, null, 0, this.anInt928 * -679491327, false, 39194789);
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30768((byte) 48);
		}
	}

	@OriginalMember(owner = "client!agc", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30726(-1735409435);
		}
	}

	@OriginalMember(owner = "client!agc", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30726(-1316776139);
		}
	}

	@OriginalMember(owner = "client!agc", name = "e", descriptor = "(I)V")
	@Override
	void method19200(@OriginalArg(0) int arg0) {
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30788(50, -2061166475);
			Class490.aClass263_13.method26582(this.aClass529_1, (byte) -91);
			this.aClass529_1 = null;
		}
	}

	@OriginalMember(owner = "client!agc", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30726(-1041817252);
		}
	}

	@OriginalMember(owner = "client!agc", name = "j", descriptor = "()V")
	@Override
	void method19203() {
		if (this.aClass529_1 != null) {
			this.aClass529_1.method30788(50, -367076423);
			Class490.aClass263_13.method26582(this.aClass529_1, (byte) -42);
			this.aClass529_1 = null;
		}
	}
}
