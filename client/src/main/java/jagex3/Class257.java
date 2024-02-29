package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
final class Class257 implements Interface39 {

	@OriginalMember(owner = "client!fa", name = "kx", descriptor = "I")
	public static int anInt3895;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fa", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_1;

	@OriginalMember(owner = "client!fa", name = "fv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method26115(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4069 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -1283265423;
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class239.method25916(arg0.anInt3994 * -1549590237, -156727306);
		}
	}

	@OriginalMember(owner = "client!fa", name = "ji", descriptor = "(Lclient!yf;I)V")
	static void method26116(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!fa", name = "aek", descriptor = "(Lclient!yf;I)V")
	static void method26117(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1];
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = Class464.method29462(local9);
	}

	@OriginalMember(owner = "client!fa", name = "mo", descriptor = "(Lclient!yf;S)V")
	static void method26118(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 597422859);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class75.method1266(local16, local22, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class257(@OriginalArg(0) Class258 arg0) {
		this.aClass258_1 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "()F")
	@Override
	public float method26439() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16235(-1975448762) / 255.0F;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)F")
	@Override
	public float method26438(@OriginalArg(0) int arg0) {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16235(218814774) / 255.0F;
	}
}
