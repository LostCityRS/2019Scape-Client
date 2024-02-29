package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class609 {

	@OriginalMember(owner = "client!vc", name = "en", descriptor = "Lclient!uz;")
	static Class160 aClass160_4;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	static int anInt5745;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vc;")
	public static final Class609 aClass609_1 = new Class609(0);

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!vc;")
	public static final Class609 aClass609_2 = new Class609(1);

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!vc;")
	public static final Class609 aClass609_3 = new Class609(2);

	@OriginalMember(owner = "client!vc", name = "tf", descriptor = "(Lclient!yf;I)V")
	static void method32144(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class638.method32644(local11, arg0, (byte) 109);
	}

	@OriginalMember(owner = "client!vc", name = "zz", descriptor = "(Lclient!yf;I)V")
	static void method32145(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3572 * 825168203 == 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -2;
		} else if (client.anInt3572 * 825168203 == 1) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3444 * 862418793;
		}
	}

	@OriginalMember(owner = "client!vc", name = "afh", descriptor = "(Lclient!yf;I)V")
	static void method32146(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anInt6052 -= -725861497;
		@Pc(27) int local27 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(47) int local47 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(53) Class5 local53 = Class157.aClass462_2.method29422(client.anInterface50_1, local37, -1167558708);
		@Pc(61) String local61 = local53.method43(local13, local27, Class110_Sub14.aClass100Array4, local47, (byte) 14);
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local61 == null ? "" : local61;
	}

	@OriginalMember(owner = "client!vc", name = "aft", descriptor = "(Lclient!yf;S)V")
	static void method32147(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local13 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13.length();
		}
	}

	@OriginalMember(owner = "client!vc", name = "vl", descriptor = "(Lclient!yf;B)V")
	static void method32148(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class328.method27418(arg0, -1497248091);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	Class609(@OriginalArg(0) int arg0) {
	}
}
