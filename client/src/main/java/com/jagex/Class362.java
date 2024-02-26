package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class362 {

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "Ljava/lang/String;")
	static String aString196;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "Lclient!uj;")
	static Class594 aClass594_1;

	@OriginalMember(owner = "client!jk", name = "ir", descriptor = "Lclient!wx;")
	public static Class651 aClass651_1;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "Lclient!jk;")
	public static final Class362 aClass362_1 = new Class362(0);

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Lclient!jk;")
	public static final Class362 aClass362_2 = new Class362(1);

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
	int anInt4493;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)Lclient!jk;")
	public static Class362 method28156(@OriginalArg(0) int arg0) {
		if (arg0 == aClass362_1.anInt4493 * -1928048299) {
			return aClass362_1;
		} else if (aClass362_2.anInt4493 * -1928048299 == arg0) {
			return aClass362_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V")
	static void method28157(@OriginalArg(0) byte arg0) {
		Class606.aClass121_Sub1_3 = null;
		Class606.aBoolean931 = false;
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)I")
	public static int method28158(@OriginalArg(0) int arg0) {
		return Class506.aTwitchEventLiveStreams1 == null || Class622.anInt5477 * -1659069467 >= Class506.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (Class622.anInt5477 += -1734596115) * -1659069467;
	}

	@OriginalMember(owner = "client!jk", name = "ae", descriptor = "(Lclient!di;IIIIIIB)V")
	static void method28159(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		arg0.method20716(arg1, arg2, arg3, arg4, arg5, (byte) 35);
		arg0.method20716(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6, (byte) 32);
		arg0.method20715(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6, -1068342187);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	Class362(@OriginalArg(0) int arg0) {
		this.anInt4493 = arg0 * 1889084413;
	}
}
