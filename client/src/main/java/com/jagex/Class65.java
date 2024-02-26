package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acp")
public final class Class65 implements Interface75 {

	@OriginalMember(owner = "client!acp", name = "t", descriptor = "Lclient!acp;")
	public static final Class65 aClass65_3 = new Class65(0);

	@OriginalMember(owner = "client!acp", name = "f", descriptor = "Lclient!acp;")
	static final Class65 aClass65_2 = new Class65(1);

	@OriginalMember(owner = "client!acp", name = "e", descriptor = "Lclient!acp;")
	static final Class65 aClass65_9 = new Class65(2);

	@OriginalMember(owner = "client!acp", name = "u", descriptor = "Lclient!acp;")
	static final Class65 aClass65_4 = new Class65(3);

	@OriginalMember(owner = "client!acp", name = "l", descriptor = "Lclient!acp;")
	static final Class65 aClass65_5 = new Class65(4);

	@OriginalMember(owner = "client!acp", name = "g", descriptor = "Lclient!acp;")
	static final Class65 aClass65_6 = new Class65(5);

	@OriginalMember(owner = "client!acp", name = "i", descriptor = "Lclient!acp;")
	static final Class65 aClass65_11 = new Class65(6);

	@OriginalMember(owner = "client!acp", name = "m", descriptor = "Lclient!acp;")
	static final Class65 aClass65_8 = new Class65(10);

	@OriginalMember(owner = "client!acp", name = "o", descriptor = "Lclient!acp;")
	static final Class65 aClass65_7 = new Class65(20);

	@OriginalMember(owner = "client!acp", name = "j", descriptor = "Lclient!acp;")
	static final Class65 aClass65_10 = new Class65(21);

	@OriginalMember(owner = "client!acp", name = "a", descriptor = "Lclient!acp;")
	public static final Class65 aClass65_1 = new Class65(100);

	@OriginalMember(owner = "client!acp", name = "s", descriptor = "Lclient!acp;")
	public static final Class65 aClass65_12 = new Class65(101);

	@OriginalMember(owner = "client!acp", name = "k", descriptor = "Lclient!acp;")
	static final Class65 aClass65_13 = new Class65(102);

	@OriginalMember(owner = "client!acp", name = "x", descriptor = "Lclient!acp;")
	static final Class65 aClass65_14 = new Class65(103);

	@OriginalMember(owner = "client!acp", name = "w", descriptor = "I")
	final int anInt215;

	@OriginalMember(owner = "client!acp", name = "e", descriptor = "()[Lclient!acp;")
	public static Class65[] method1233() {
		return new Class65[] { aClass65_12, aClass65_2, aClass65_3, aClass65_13, aClass65_9, aClass65_10, aClass65_14, aClass65_11, aClass65_4, aClass65_1, aClass65_8, aClass65_5, aClass65_6, aClass65_7 };
	}

	@OriginalMember(owner = "client!acp", name = "j", descriptor = "(IZB)V")
	static void method1234(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg1, 449344084);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray179.length; local10++) {
			local4.anIntArray179[local10] = -1;
			local4.anIntArray178[local10] = 0;
		}
		local4.aClass33Array1 = null;
	}

	@OriginalMember(owner = "client!acp", name = "<init>", descriptor = "(I)V")
	Class65(@OriginalArg(0) int arg0) {
		this.anInt215 = arg0 * -1478768937;
	}

	@OriginalMember(owner = "client!acp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "";
	}

	@OriginalMember(owner = "client!acp", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt215 * -1285649177;
	}

	@OriginalMember(owner = "client!acp", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method1231() {
		return "";
	}

	@OriginalMember(owner = "client!acp", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt215 * -1285649177;
	}

	@OriginalMember(owner = "client!acp", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt215 * -1285649177;
	}

	@OriginalMember(owner = "client!acp", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method1232() {
		return "";
	}
}
