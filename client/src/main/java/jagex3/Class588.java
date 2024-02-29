package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class588 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!u;")
	static Class588 aClass588_3;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
	static int[] anIntArray477;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!u;")
	static final Class588 aClass588_1 = new Class588();

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!u;")
	static final Class588 aClass588_2 = new Class588();

	@OriginalMember(owner = "client!u", name = "n", descriptor = "(IB)Z")
	public static boolean method31830(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!u", name = "ah", descriptor = "(Lclient!yf;I)V")
	static void method31831(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		if (Class683.aBoolean885) {
			Class504.method30376(arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0, 98582919);
			Class320.method27331(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0, 802032704);
			Class585.method31792(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] != 0, -2027415738);
		}
	}

	@OriginalMember(owner = "client!u", name = "lw", descriptor = "(Lclient!yf;I)V")
	static void method31832(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class675.method33347(local11, local14, arg0, -1862892858);
	}

	@OriginalMember(owner = "client!u", name = "aqp", descriptor = "(Lclient!yf;I)V")
	static void method31833(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 957530791;
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!u", name = "aqu", descriptor = "(Lclient!yf;B)V")
	static void method31834(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(Lclient!yf;B)V")
	static void method31835(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class528.method30574((byte) -1);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	Class588() {
	}
}
