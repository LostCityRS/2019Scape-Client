package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class340 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!ik;")
	static final Class340 aClass340_3 = new Class340(0);

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!ik;")
	static final Class340 aClass340_4 = new Class340(1);

	@OriginalMember(owner = "client!ik", name = "bg", descriptor = "(Lclient!yf;S)V")
	static void method27583(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null) {
			Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32939(local13, local23, Class277.aClass32_Sub12_1, (byte) 100);
		}
	}

	@OriginalMember(owner = "client!ik", name = "zg", descriptor = "(Lclient!yf;B)V")
	static void method27584(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = client.aClass281Array1[local12].aString162;
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		}
	}

	@OriginalMember(owner = "client!ik", name = "axq", descriptor = "(Lclient!yf;B)V")
	static void method27585(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(28) Class312 local28 = Class124_Sub2.method9308(local13, local23, (byte) 31);
		Class624.method32341(682408472);
		@Pc(33) Class93_Sub19 local33 = client.method25250(local28);
		Class698.method36882(local28, local33.method13620((short) -16453), local33.anInt1546 * -1350606777, (byte) 13);
	}

	@OriginalMember(owner = "client!ik", name = "azw", descriptor = "(Lclient!yf;I)V")
	static void method27586(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16048(442562057) && Class694.aClass104_14.method20577() ? 1 : 0;
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	Class340(@OriginalArg(0) int arg0) {
	}
}
