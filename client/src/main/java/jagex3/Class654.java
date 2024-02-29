package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public final class Class654 {

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "I")
	public static final int anInt5967 = 2048;

	@OriginalMember(owner = "client!xa", name = "e", descriptor = "I")
	public static final int anInt5968 = 256;

	@OriginalMember(owner = "client!xa", name = "alz", descriptor = "(Lclient!yf;B)V")
	static void method32899(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15856(4456625);
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(Lclient!yu;Lclient!ze;II)I")
	public static int method32900(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == Class693.aClass693_8 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!xa", name = "wy", descriptor = "(Lclient!yf;B)V")
	static void method32901(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8655(local12, (byte) 56);
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "()V")
	Class654() throws Throwable {
		throw new Error();
	}
}
