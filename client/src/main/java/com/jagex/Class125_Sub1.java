package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahe")
public class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!ahe", name = "gv", descriptor = "Lclient!ty;")
	public static Class586 aClass586_1;

	@OriginalMember(owner = "client!ahe", name = "p", descriptor = "I")
	public final int anInt1032;

	@OriginalMember(owner = "client!ahe", name = "d", descriptor = "I")
	public final int anInt1033;

	@OriginalMember(owner = "client!ahe", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIIII)V", line = 10)
	Class125_Sub1(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1032 = arg10 * -2071124369;
		this.anInt1033 = arg11 * -417585633;
	}

	@OriginalMember(owner = "client!ahe", name = "e", descriptor = "(ZI)Lclient!tl;", line = 15)
	public static Class573 method9212(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Stack local2 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			@Pc(10) Class573 local10;
			if (Class573.aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) Class573.aStack1.pop();
			}
			local10.aBoolean815 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ahe", name = "f", descriptor = "(Lclient!alw;)Lclient!kp;", line = 16)
	public static Class125 method9213(@OriginalArg(0) Packet arg0) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16727(arg0, -423624971);
		@Pc(7) int local7 = arg0.g4(-118643075);
		@Pc(11) int local11 = arg0.g4(-118643075);
		@Pc(15) int local15 = arg0.gSmart2or4null(-1869949931);
		return new Class125_Sub1(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahe", name = "n", descriptor = "(S)Lclient!kt;", line = 24)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_3;
	}

	@OriginalMember(owner = "client!ahe", name = "l", descriptor = "()Lclient!kt;", line = 24)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_3;
	}

	@OriginalMember(owner = "client!ahe", name = "aa", descriptor = "(IIIIIIILclient!arn;Lclient!eu;Lclient!aac;III)V", line = 1181)
	static void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class93_Sub1_Sub8 arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.anInt6 * -8978697 - 1 && arg1 < arg9.anInt10 * -1093354073 + arg6) {
			arg10 = arg11;
		}
		@Pc(31) String local31 = Class80.method1365(arg7, (byte) 0);
		arg8.method7546(local31, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class106.anInt891, Class110_Sub14.aClass100Array4, null, (byte) 1);
	}

	@OriginalMember(owner = "client!ahe", name = "kx", descriptor = "(Lclient!hf;III)V", line = 11704)
	public static final void method9215(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (client.aClass312_5 != null || Class454.aBoolean773 || (arg0 == null || !Class349.method27627(arg0, -1323171957))) {
			return;
		}
		client.aClass312_5 = arg0;
		client.aClass312_3 = Class40.method800(arg0, -1216225751);
		client.anInt3528 = arg1 * -1933597649;
		client.anInt3529 = arg2 * 365276271;
		Class550.anInt5314 = 0;
		client.aBoolean616 = false;
	}
}
