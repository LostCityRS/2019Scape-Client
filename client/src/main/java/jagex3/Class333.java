package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class333 {

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "J")
	public static long aLong260;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!ic;")
	static final Class333 aClass333_4 = new Class333(0, true);

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!ic;")
	static final Class333 aClass333_5 = new Class333(1, true);

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ic;")
	static final Class333 aClass333_3 = new Class333(2, false);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	int anInt4190;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	boolean aBoolean716;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)Lclient!ic;")
	public static Class333 method27490(@OriginalArg(0) int arg0) {
		if (arg0 == aClass333_4.anInt4190 * 1516832491) {
			return aClass333_4;
		} else if (arg0 == aClass333_5.anInt4190 * 1516832491) {
			return aClass333_5;
		} else if (arg0 == aClass333_3.anInt4190 * 1516832491) {
			return aClass333_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)Lclient!ic;")
	public static Class333 method27491(@OriginalArg(0) int arg0) {
		if (arg0 == aClass333_4.anInt4190 * 1516832491) {
			return aClass333_4;
		} else if (arg0 == aClass333_5.anInt4190 * 1516832491) {
			return aClass333_5;
		} else if (arg0 == aClass333_3.anInt4190 * 1516832491) {
			return aClass333_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "(Lclient!yf;I)V")
	static void method27492(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2], -2092124442)).anIntArrayArray57[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]][1];
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!ic", name = "bdb", descriptor = "(Lclient!yf;I)V")
	static void method27493(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class527.aString231.startsWith("win") ? 1 : 0;
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IZ)V")
	Class333(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4190 = arg0 * -1722388029;
		this.aBoolean716 = arg1;
	}
}
