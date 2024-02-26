package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class376 implements Interface33 {

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public final int anInt4525;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Lclient!ky;")
	public final Class391 aClass391_10;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!km;")
	public final Class383 aClass383_10;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public final int anInt4520;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public final int anInt4521;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	public final int anInt4527;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public final int anInt4526;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public final int anInt4522;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public final int anInt4523;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public final int anInt4524;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Z")
	public final boolean aBoolean847;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(Lclient!ald;)Lclient!kd;")
	public static Class376 method28456(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		@Pc(10) Class391 local10 = Class58_Sub1.method15727((byte) -97)[arg0.g1()];
		@Pc(17) Class383 local17 = Class646.method33047(-1097781758)[arg0.g1()];
		@Pc(21) int local21 = arg0.g2s();
		@Pc(25) int local25 = arg0.g2s();
		@Pc(29) int local29 = arg0.g2();
		@Pc(33) int local33 = arg0.g2();
		@Pc(37) int local37 = arg0.g4();
		@Pc(41) int local41 = arg0.g4();
		@Pc(45) int local45 = arg0.g4();
		@Pc(54) boolean local54 = arg0.g1() == 1;
		return new Class376(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	public static void method28457(@OriginalArg(0) int arg0) {
		@Pc(2) Stack local2 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			Class573.aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!kd", name = "bfo", descriptor = "(Lclient!yp;I)V")
	static void method28458(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kd", name = "an", descriptor = "(Lclient!di;I)V")
	static void method28459(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aBoolean957) {
			Class29.method661(arg0, -457430101);
		} else {
			Class370.method28379(arg0, -1373535980);
		}
	}

	@OriginalMember(owner = "client!kd", name = "abq", descriptor = "(Lclient!yp;B)V")
	static void method28460(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class134.aClass305_1.method27141((byte) -7);
	}

	@OriginalMember(owner = "client!kd", name = "aay", descriptor = "(Lclient!yp;I)V")
	static void method28461(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class618.aByte157;
	}

	@OriginalMember(owner = "client!kd", name = "yu", descriptor = "(Lclient!yp;I)V")
	static void method28462(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean708 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V")
	static void method28463(@OriginalArg(0) byte arg0) {
		Class80_Sub1_Sub9.aClass24_17.method564(885744624);
		Class80_Sub1_Sub9.aClass3_12.method41(-252802305);
		Class80_Sub1_Sub9.aClass3_11.method41(-252802305);
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILclient!ky;Lclient!km;IIIIIIIZ)V")
	Class376(@OriginalArg(0) int arg0, @OriginalArg(1) Class391 arg1, @OriginalArg(2) Class383 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4525 = arg0 * 1970745717;
		this.aClass391_10 = arg1;
		this.aClass383_10 = arg2;
		this.anInt4520 = arg3 * 53477597;
		this.anInt4521 = arg4 * 899422513;
		this.anInt4527 = arg5 * 1705946725;
		this.anInt4526 = arg6 * 659085645;
		this.anInt4522 = arg7 * 1361605761;
		this.anInt4523 = arg8 * -1347233941;
		this.anInt4524 = arg9 * 1698190337;
		this.aBoolean847 = arg10;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Lclient!kz;")
	@Override
	public Class392 method28942(@OriginalArg(0) int arg0) {
		return Class392.aClass392_5;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "()Lclient!kz;")
	@Override
	public Class392 method28941() {
		return Class392.aClass392_5;
	}
}
