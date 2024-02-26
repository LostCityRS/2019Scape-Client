package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class222 implements Interface75 {

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!dc;")
	static final Class222 aClass222_1 = new Class222(0, 0, null, 0);

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!dc;")
	static final Class222 aClass222_5 = new Class222(1, 1, null, 3);

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!dc;")
	static final Class222 aClass222_2 = new Class222(2, 2, null, 3);

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!dc;")
	static final Class222 aClass222_3 = new Class222(3, 3, null, 6);

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!dc;")
	static final Class222 aClass222_4 = new Class222(4, 4, null, 1);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	final int anInt3620;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	final int anInt3619;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	final int anInt3621;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "()[Lclient!dc;")
	static Class222[] method25914() {
		return new Class222[] { aClass222_1, aClass222_5, aClass222_2, aClass222_3, aClass222_4 };
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)Lclient!dc;")
	static Class222 method25917(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = (Class222) Class80_Sub39.method15030(Class287.method26906(-1961523904), arg0, -1102211209);
		if (local6 == null) {
			local6 = aClass222_1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "()[Lclient!dc;")
	static Class222[] method25918() {
		return new Class222[] { aClass222_1, aClass222_5, aClass222_2, aClass222_3, aClass222_4 };
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "()[Lclient!dc;")
	static Class222[] method25919() {
		return new Class222[] { aClass222_1, aClass222_5, aClass222_2, aClass222_3, aClass222_4 };
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lclient!dc;")
	static Class222 method25920(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = (Class222) Class80_Sub39.method15030(Class287.method26906(-1961523904), arg0, -1981693857);
		if (local6 == null) {
			local6 = aClass222_1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "awo", descriptor = "(Lclient!yp;I)V")
	static void method25922(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class163_Sub1 local2 = Class549.method31315(1207010000);
		if (local2 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2086 * -1140092917;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2081 * -682140789;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.aString63;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.method15766(2120675112);
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.method15767((byte) -19);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2083 * -263101925;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt2087 * 1438063139;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local2.aString61;
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!dc", name = "mp", descriptor = "(Ljava/lang/String;II)V")
	public static void method25923(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class75 local2 = Class52.method1074(16777215);
		@Pc(8) Class80_Sub31 local8 = Class623.method32440(Class443.aClass443_49, local2.aClass22_1, -191270971);
		local8.aPacketBit_2.p1(Class350.method28013(arg0, (short) 16383) + 1);
		local8.aPacketBit_2.pjstr(arg0);
		local8.aPacketBit_2.p1(arg1);
		local2.method1325(local8, (byte) -120);
	}

	@OriginalMember(owner = "client!dc", name = "bfb", descriptor = "(Lclient!yp;I)V")
	static void method25924(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IILjava/lang/String;I)V")
	Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt3620 = arg0 * -1940522969;
		this.anInt3619 = arg1 * 1299535307;
		this.anInt3621 = arg3 * 77813779;
	}

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "(B)I")
	int method25915(@OriginalArg(0) byte arg0) {
		return this.anInt3621 * -328846821;
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "()I")
	int method25916() {
		return this.anInt3621 * -328846821;
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3619 * -1370937373;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3619 * -1370937373;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3619 * -1370937373;
	}

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "()I")
	int method25921() {
		return this.anInt3621 * -328846821;
	}
}
