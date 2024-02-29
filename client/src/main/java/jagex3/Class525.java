package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class525 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!rn;")
	static Interface57 anInterface57_1;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(Lclient!rn;)V")
	public static void method30557(@OriginalArg(0) Interface57 arg0) {
		if (anInterface57_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface57_1 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "(Lclient!rn;)V")
	public static void method30558(@OriginalArg(0) Interface57 arg0) {
		if (anInterface57_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface57_1 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "()Z")
	public static boolean method30559() {
		return anInterface57_1 != null;
	}

	@OriginalMember(owner = "client!rb", name = "sh", descriptor = "(Lclient!yf;I)V")
	static void method30560(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4037 * -1099308531;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	Class525() throws Throwable {
		throw new Error();
	}
}
