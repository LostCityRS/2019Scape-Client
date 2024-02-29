package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class349 {

	@OriginalMember(owner = "client!iu", name = "ui", descriptor = "I")
	public static int anInt4242;

	@OriginalMember(owner = "client!iu", name = "cy", descriptor = "I")
	public static int anInt4243;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!iu;")
	static final Class349 aClass349_7 = new Class349(0);

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "Lclient!iu;")
	static final Class349 aClass349_3 = new Class349(1);

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Lclient!iu;")
	static final Class349 aClass349_2 = new Class349(2);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_4 = new Class349(3);

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_5 = new Class349(4);

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "Lclient!iu;")
	public static final Class349 aClass349_6 = new Class349(5);

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	int anInt4241;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "(S)Z")
	static boolean method27717(@OriginalArg(0) short arg0) {
		return Class411.anInt4907 * 276097583 == -1 ? Class93_Sub3.method11813(Class411.aString209, Class411.aString210, (byte) 47) : Class219.method25605(-1544706360);
	}

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "(Ljava/lang/String;II)Z")
	static boolean method27718(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class110.method20158(arg0, arg1, "openjs", (short) 3456);
	}

	@OriginalMember(owner = "client!iu", name = "avm", descriptor = "(Lclient!yf;I)V")
	static void method27719(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!iu", name = "awd", descriptor = "(Lclient!yf;I)V")
	static void method27720(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) int local16 = local12 >> 16;
		if (Class166_Sub1.aClass320Array1[local16] == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(44) String local44 = Class166_Sub1.aClass320Array1[local16].aClass312Array3[local12].aString168;
		if (local44 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local44;
		}
	}

	@OriginalMember(owner = "client!iu", name = "kb", descriptor = "(Lclient!hf;I)Z")
	static boolean method27721(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub19 local2 = client.method25250(arg0);
		if (local2.method13639(1926504675) > 0) {
			return true;
		} else if (local2.method13630(2056954753)) {
			return true;
		} else {
			return arg0.aClass312_9 != null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "je", descriptor = "(Lclient!yf;I)V")
	static void method27722(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V")
	Class349(@OriginalArg(0) int arg0) {
		this.anInt4241 = arg0 * 1967329225;
	}
}
