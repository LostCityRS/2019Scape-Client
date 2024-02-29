package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ain")
final class Class138_Sub2 extends Class138 {

	@OriginalMember(owner = "client!ain", name = "<init>", descriptor = "(Lclient!xq;IZZ)V", line = 51)
	Class138_Sub2(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!ain", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 53)
	@Override
	Object method11532(@OriginalArg(0) Class108 arg0) {
		return Class519.aClass519_8 == arg0.aClass519_6 ? -1 : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!ain", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;", line = 53)
	@Override
	Object method11531(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return Class519.aClass519_8 == arg0.aClass519_6 ? -1 : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!ain", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 53)
	@Override
	Object method11533(@OriginalArg(0) Class108 arg0) {
		return Class519.aClass519_8 == arg0.aClass519_6 ? -1 : arg0.aClass519_6.method30319(657683700);
	}

	@OriginalMember(owner = "client!ain", name = "ub", descriptor = "(Lclient!yf;B)V", line = 8613)
	static final void method11269(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 830121149);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4043 * -1927602083;
	}

	@OriginalMember(owner = "client!ain", name = "xn", descriptor = "(Lclient!yf;I)V", line = 9136)
	static final void method11270(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local12 & 0x3FFF;
	}
}
