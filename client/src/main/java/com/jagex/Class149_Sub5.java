package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajq")
public final class Class149_Sub5 extends Class149 {

	@OriginalMember(owner = "client!ajq", name = "m", descriptor = "Lclient!aas;")
	static Class21 aClass21_3 = new Class21();

	@OriginalMember(owner = "client!ajq", name = "k", descriptor = "I")
	static int anInt1448 = 0;

	@OriginalMember(owner = "client!ajq", name = "l", descriptor = "I")
	int anInt1447;

	@OriginalMember(owner = "client!ajq", name = "f", descriptor = "Lclient!ahm;")
	Class132_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ajq", name = "w", descriptor = "I")
	int anInt1449;

	@OriginalMember(owner = "client!ajq", name = "u", descriptor = "I")
	int anInt1450;

	@OriginalMember(owner = "client!ajq", name = "z", descriptor = "I")
	int anInt1451;

	@OriginalMember(owner = "client!ajq", name = "k", descriptor = "()Lclient!ajq;")
	static Class149_Sub5 method12716() {
		@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) aClass21_3.method381(-972089962);
		if (local4 == null) {
			return new Class149_Sub5();
		} else {
			anInt1448 -= 1630361431;
			return local4;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "f", descriptor = "()Lclient!ajq;")
	static Class149_Sub5 method12717() {
		@Pc(4) Class149_Sub5 local4 = (Class149_Sub5) aClass21_3.method381(-2019457593);
		if (local4 == null) {
			return new Class149_Sub5();
		} else {
			anInt1448 -= 1630361431;
			return local4;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "w", descriptor = "(Lclient!ajq;)V")
	static void method12718(@OriginalArg(0) Class149_Sub5 arg0) {
		arg0.aClass132_Sub1_Sub1_Sub1_1 = null;
		if (anInt1448 * 829391975 < 20) {
			aClass21_3.method379(arg0, (byte) 4);
			anInt1448 += 1630361431;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "l", descriptor = "(Lclient!ajq;)V")
	static void method12719(@OriginalArg(0) Class149_Sub5 arg0) {
		arg0.aClass132_Sub1_Sub1_Sub1_1 = null;
		if (anInt1448 * 829391975 < 20) {
			aClass21_3.method379(arg0, (byte) 4);
			anInt1448 += 1630361431;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "ae", descriptor = "(IIIIB)Lclient!asp;")
	public static Class93_Sub23_Sub2 method12720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(2) Class93_Sub23_Sub2[] local2 = Class93_Sub23_Sub2.aClass93_Sub23_Sub2Array1;
		synchronized (Class93_Sub23_Sub2.aClass93_Sub23_Sub2Array1) {
			@Pc(11) Class93_Sub23_Sub2 local11;
			if (Class640.anInt5916 * -757688083 == 0) {
				local11 = new Class93_Sub23_Sub2();
			} else {
				local11 = Class93_Sub23_Sub2.aClass93_Sub23_Sub2Array1[(Class640.anInt5916 -= 1091273957) * -757688083];
			}
			local11.anInt3149 = arg0 * -1644814841;
			local11.anInt3153 = arg1 * 1046265683;
			local11.anInt3150 = arg2 * 1534805459;
			local11.anInt3138 = arg3 * -733881729;
			local11.aLong199 = Class305.method26889(1475800309) * -1149401875204728019L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "<init>", descriptor = "()V")
	Class149_Sub5() {
	}
}
