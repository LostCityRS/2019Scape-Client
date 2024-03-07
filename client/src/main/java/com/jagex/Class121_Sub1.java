package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
	int anInt1004 = 0;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!py;Lclient!aht;)V", line = 11)
	Class121_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class133_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "(Lclient!alw;I)Lclient!la;", line = 14)
	public static Class133 method8710(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class133 local3 = Class133.method28926(arg0, 1357920860);
		@Pc(7) int local7 = arg0.g3s(-87715282);
		return new Class133_Sub1(local3.anInt1133 * 716586081, local3.aClass390_6, local3.aClass392_6, local3.anInt1131 * -1599175185, local3.anInt1132 * -1271918157, local7);
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(Z)V", line = 15)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, -1260493662) + this.aClass133_2.anInt1131 * -1599175185;
		@Pc(35) int local35 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
		this.aClass100_8.method18170((float) (local17 + this.aClass100_8.method18160() / 2), (float) (local35 + this.aClass100_8.method18193() / 2), 4096, this.anInt1004 * -1472062523);
		this.anInt1004 += ((Class133_Sub1) this.aClass133_2).anInt1134 * -95441819;
	}

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "(Z)V", line = 15)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(17) int local17 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, -1152049963) + this.aClass133_2.anInt1131 * -1599175185;
		@Pc(35) int local35 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
		this.aClass100_8.method18170((float) (local17 + this.aClass100_8.method18160() / 2), (float) (local35 + this.aClass100_8.method18193() / 2), 4096, this.anInt1004 * -1472062523);
		this.anInt1004 += ((Class133_Sub1) this.aClass133_2).anInt1134 * -95441819;
	}

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "(ZI)V", line = 15)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.aClass133_2.aClass390_6.method28274(this.aClass100_8.method18160(), client.anInt3511 * 2040043391, 2072623825) + this.aClass133_2.anInt1131 * -1599175185;
		@Pc(35) int local35 = this.aClass133_2.aClass392_6.method28291(this.aClass100_8.method18193(), client.anInt3512 * -817449061, (short) 255) + this.aClass133_2.anInt1132 * -1271918157;
		this.aClass100_8.method18170((float) (local17 + this.aClass100_8.method18160() / 2), (float) (local35 + this.aClass100_8.method18193() / 2), 4096, this.anInt1004 * -1472062523);
		this.anInt1004 += ((Class133_Sub1) this.aClass133_2).anInt1134 * -95441819;
	}

	@OriginalMember(owner = "client!aha", name = "ao", descriptor = "(IIB)V", line = 287)
	static void method8711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(15, (long) arg0);
		local4.method21886(1910208030);
		local4.anInt3020 = arg1 * 1415359557;
	}
}
