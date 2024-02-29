package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class Class333 {

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "J")
	public static long aLong260;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!ic;")
	static final Class333 aClass333_4 = new Class333(0, true);

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!ic;")
	static final Class333 aClass333_5 = new Class333(1, true);

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ic;")
	static final Class333 aClass333_3 = new Class333(2, false);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	int anInt4149;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	boolean aBoolean712;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IZ)V", line = 10)
	Class333(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4149 = arg0 * -1722388029;
		this.aBoolean712 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)Lclient!ic;", line = 16)
	public static Class333 method27397(@OriginalArg(0) int arg0) {
		if (arg0 == aClass333_4.anInt4149 * 1516832491) {
			return aClass333_4;
		} else if (arg0 == aClass333_5.anInt4149 * 1516832491) {
			return aClass333_5;
		} else if (arg0 == aClass333_3.anInt4149 * 1516832491) {
			return aClass333_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)Lclient!ic;", line = 16)
	public static Class333 method27398(@OriginalArg(0) int arg0) {
		if (arg0 == aClass333_4.anInt4149 * 1516832491) {
			return aClass333_4;
		} else if (arg0 == aClass333_5.anInt4149 * 1516832491) {
			return aClass333_5;
		} else if (arg0 == aClass333_3.anInt4149 * 1516832491) {
			return aClass333_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "(Lclient!yf;I)V", line = 70)
	static void method27399(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2], -2092124442)).anIntArrayArray57[arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1]][1];
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!ic", name = "bdb", descriptor = "(Lclient!yf;I)V", line = 14734)
	static final void method27400(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class527.aString222.startsWith("win") ? 1 : 0;
	}
}
