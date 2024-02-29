package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class244 {

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!eg;")
	static final Class244 aClass244_2 = new Class244();

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!eg;")
	static final Class244 aClass244_3 = new Class244();

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Lclient!eg;")
	static final Class244 aClass244_4 = new Class244();

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(IS)V")
	public static void method25985(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		Class447.anInt5115 = arg0 * 209843575;
		@Pc(6) Class240 local6 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25926((byte) -86);
		}
		local6 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25926((byte) -28);
		}
	}

	@OriginalMember(owner = "client!eg", name = "alt", descriptor = "(Lclient!yf;I)V")
	static void method25986(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			Class717.method37076(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15856(235476874), -1, -1, false, (byte) 17);
		}
		if (Class343.method27611((byte) 125) == Class555.aClass555_3) {
			Class25.method23146(-1283127986);
			System.exit(0);
		} else {
			Class156.method14198(-1286828036);
		}
	}

	@OriginalMember(owner = "client!eg", name = "bcz", descriptor = "(Lclient!yf;I)V")
	static void method25987(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 3];
		@Pc(19) int local19 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2];
		@Pc(29) int local29 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1];
		arg0.anInt6052 -= -725861497;
		if (local9 > arg0.anIntArray520[local19]) {
			throw new RuntimeException();
		} else if (local9 > arg0.anIntArray520[local29]) {
			throw new RuntimeException();
		} else if (local29 == local19) {
			throw new RuntimeException();
		} else {
			Class86.method1494(arg0.anIntArrayArray67[local19], arg0.anIntArrayArray67[local29], 0, local9 - 1, 1815175593);
		}
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	Class244() {
	}
}
