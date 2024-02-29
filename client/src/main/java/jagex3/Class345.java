package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class345 implements Interface75 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!ip;")
	static final Class345 aClass345_3 = new Class345(0);

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!ip;")
	static final Class345 aClass345_1 = new Class345(1);

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Lclient!ip;")
	static final Class345 aClass345_2 = new Class345(2);

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	final int anInt4232;

	@OriginalMember(owner = "client!ip", name = "fw", descriptor = "(Lclient!yf;B)V")
	static void method27654(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class257.method26115(local11, local14, arg0, (byte) 119);
	}

	@OriginalMember(owner = "client!ip", name = "aac", descriptor = "(Lclient!yf;I)V")
	static void method27655(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5843 * 1581594575) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].aString92;
		}
	}

	@OriginalMember(owner = "client!ip", name = "azs", descriptor = "(Lclient!yf;I)V")
	static void method27656(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16540(-1996816178) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ip", name = "fb", descriptor = "(Lclient!yf;I)V")
	static void method27657(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class341.method27594(local11, local14, arg0, -112815327);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(I)V")
	Class345(@OriginalArg(0) int arg0) {
		this.anInt4232 = arg0 * -1554275711;
	}

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt4232 * 1395301761;
	}

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt4232 * 1395301761;
	}
}
