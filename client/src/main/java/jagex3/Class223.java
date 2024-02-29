package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class223 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static final int anInt3673 = 2;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static final int anInt3674 = 16;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static final int anInt3675 = 1;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public static final int anInt3676 = 8191;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static final int anInt3677 = 64;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	public static final int anInt3678 = 2;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public static final int anInt3679 = 0;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	public static final int anInt3680 = 16;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static final int anInt3681 = 0;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static final int anInt3682 = 32;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public static final int anInt3683 = 8;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static final int anInt3684 = 1023;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
	public static final int[] anIntArray339 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dc", name = "awz", descriptor = "(Lclient!yf;B)V")
	static void method25680(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class154_Sub1 local2 = Class454.method29295(1250465674);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2 == null ? 0 : local2.anInt1650 * 803722663;
	}

	@OriginalMember(owner = "client!dc", name = "sr", descriptor = "(Lclient!yf;I)V")
	static void method25681(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4036 * -1566573331;
	}

	@OriginalMember(owner = "client!dc", name = "do", descriptor = "(Lclient!yf;B)V")
	static void method25682(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 407948161);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class224.method25684(local16, local22, arg0, -336743888);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	Class223() throws Throwable {
		throw new Error();
	}
}
