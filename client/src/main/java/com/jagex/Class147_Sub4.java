package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajs")
public final class Class147_Sub4 extends Class147 {

	@OriginalMember(owner = "client!ajs", name = "e", descriptor = "Lclient!aac;")
	static Class5 aClass5_3 = new Class5();

	@OriginalMember(owner = "client!ajs", name = "u", descriptor = "I")
	static int anInt1486 = 0;

	@OriginalMember(owner = "client!ajs", name = "l", descriptor = "Lclient!ahb;")
	Class120_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ajs", name = "g", descriptor = "I")
	int anInt1487;

	@OriginalMember(owner = "client!ajs", name = "i", descriptor = "I")
	int anInt1488;

	@OriginalMember(owner = "client!ajs", name = "m", descriptor = "I")
	int anInt1489;

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "I")
	int anInt1490;

	@OriginalMember(owner = "client!ajs", name = "i", descriptor = "()Lclient!ajs;")
	static Class147_Sub4 method13525() {
		@Pc(4) Class147_Sub4 local4 = (Class147_Sub4) aClass5_3.method113((byte) 12);
		if (local4 == null) {
			return new Class147_Sub4();
		} else {
			anInt1486 -= -52220359;
			return local4;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "j", descriptor = "(Lclient!ajs;)V")
	static void method13526(@OriginalArg(0) Class147_Sub4 arg0) {
		arg0.aClass120_Sub1_Sub1_Sub1_1 = null;
		if (anInt1486 * -2145492983 < 20) {
			aClass5_3.method90(arg0, 864007266);
			anInt1486 += -52220359;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "m", descriptor = "(Lclient!ajs;)V")
	static void method13527(@OriginalArg(0) Class147_Sub4 arg0) {
		arg0.aClass120_Sub1_Sub1_Sub1_1 = null;
		if (anInt1486 * -2145492983 < 20) {
			aClass5_3.method90(arg0, 864007266);
			anInt1486 += -52220359;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "o", descriptor = "(Lclient!ajs;)V")
	static void method13528(@OriginalArg(0) Class147_Sub4 arg0) {
		arg0.aClass120_Sub1_Sub1_Sub1_1 = null;
		if (anInt1486 * -2145492983 < 20) {
			aClass5_3.method90(arg0, 864007266);
			anInt1486 += -52220359;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "a", descriptor = "(Lclient!ajs;)V")
	static void method13529(@OriginalArg(0) Class147_Sub4 arg0) {
		arg0.aClass120_Sub1_Sub1_Sub1_1 = null;
		if (anInt1486 * -2145492983 < 20) {
			aClass5_3.method90(arg0, 864007266);
			anInt1486 += -52220359;
		}
	}

	@OriginalMember(owner = "client!ajs", name = "<init>", descriptor = "()V")
	Class147_Sub4() {
	}
}
