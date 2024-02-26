package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ain")
final class Class143_Sub2 extends Class143 {

	@OriginalMember(owner = "client!ain", name = "f", descriptor = "(I)V")
	static void method11246(@OriginalArg(0) int arg0) {
		if (!Class240.method26225(1473003958)) {
			return;
		}
		if (Class149.aStringArray16 == null) {
			Class579.method31811(65280);
		}
		Class149.aBoolean355 = true;
		Class149.anInt1527 = 0;
	}

	@OriginalMember(owner = "client!ain", name = "<init>", descriptor = "(Lclient!xl;IZZ)V")
	Class143_Sub2(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class143_Sub1) null);
	}

	@OriginalMember(owner = "client!ain", name = "l", descriptor = "(Lclient!ea;B)Ljava/lang/Object;")
	@Override
	Object method11825(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		return Class521.aClass521_65 == arg0.aClass521_6 || Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(824949407);
	}

	@OriginalMember(owner = "client!ain", name = "m", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	Object method11828(@OriginalArg(0) Class107 arg0) {
		return Class521.aClass521_65 == arg0.aClass521_6 || Class521.aClass521_49 == arg0.aClass521_6 ? -1 : arg0.aClass521_6.method30625(171570366);
	}
}
