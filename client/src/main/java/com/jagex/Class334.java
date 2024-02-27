package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class334 implements Interface3 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	protected static int anInt4196;

	@OriginalMember(owner = "client!id", name = "kv", descriptor = "(Lclient!yp;B)V")
	static void method27816(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2139232993);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class407.method28950(local16, local22, arg0, -2145651697);
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(CB)Z")
	static boolean method27818(@OriginalArg(0) char arg0, @OriginalArg(1) byte arg1) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!id", name = "eq", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method27819(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean814 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 567230551);
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	static boolean method27820(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		Class238.aBoolean769 = arg0;
		if (!arg1) {
			Class238.anInt3815 = 304387549;
		}
		Class238.aBoolean768 = arg1;
		Class238.aString154 = arg2;
		Class238.aString155 = arg3;
		Class238.aLong356 = arg4 * -959485551111415569L;
		if (!Class238.aBoolean768 && (Class238.aString154.equals("") || Class238.aString155.equals(""))) {
			Class530.method30812(3, -791961263);
			Class570.method31723(-417171384);
			return false;
		}
		if (Class238.anInt3812 * -1746286503 != 180) {
			Class238.anInt3847 = 0;
			Class238.anInt3853 = 1272474237;
			Class238.anInt3851 = -940669243;
		}
		Class238.aClass75_3.aBoolean35 = false;
		Class530.method30812(-3, -2053094734);
		Class238.anInt3841 = -771784724;
		Class238.anInt3814 = 0;
		Class238.anInt3845 = 0;
		return true;
	}

	@OriginalMember(owner = "client!id", name = "ajr", descriptor = "(Lclient!yp;I)V")
	static void method27821(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	Class334() {
	}

	@OriginalMember(owner = "client!id", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class352(arg0, arg1);
	}

	@OriginalMember(owner = "client!id", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class352.class;
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class352.class;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class352.class;
	}

	@OriginalMember(owner = "client!id", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class352(arg0, arg1);
	}

	@OriginalMember(owner = "client!id", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class352(arg0, arg1);
	}

	@OriginalMember(owner = "client!id", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class352(arg0, arg1);
	}

	@OriginalMember(owner = "client!id", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class352(arg0, arg1);
	}
}
