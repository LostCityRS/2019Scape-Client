package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class222 implements SerializableEnum {

	@OriginalMember(owner = "client!db", name = "ga", descriptor = "Lclient!py;")
	public static Class497 aClass497_97;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!db;")
	static final Class222 aClass222_2 = new Class222(0, 0);

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!db;")
	static final Class222 aClass222_5 = new Class222(1, 1);

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!db;")
	static final Class222 aClass222_3 = new Class222(2, 2);

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!db;")
	static final Class222 aClass222_4 = new Class222(3, 3);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!db;")
	static final Class222 aClass222_1 = new Class222(4, 4);

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	final int anInt3671;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	final int anInt3672;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "()[Lclient!db;")
	static Class222[] method25673() {
		return new Class222[] { aClass222_2, aClass222_5, aClass222_3, aClass222_4, aClass222_1 };
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	public static int method25674(@OriginalArg(0) int arg0) {
		return Class166_Sub13.aTwitchTV1.GetLoginState();
	}

	@OriginalMember(owner = "client!db", name = "dp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V")
	static void method25675(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg0.aBoolean692 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!db", name = "iy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method25676(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4075 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -724075137;
	}

	@OriginalMember(owner = "client!db", name = "auw", descriptor = "(Lclient!yf;I)V")
	static void method25677(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(1947646546) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!db", name = "jh", descriptor = "(Lclient!yf;I)V")
	static void method25678(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class329.method27440(local11, local14, arg0, 1825123840);
	}

	@OriginalMember(owner = "client!db", name = "aud", descriptor = "(Lclient!yf;I)V")
	static void method25679(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub36_1.method16258((byte) 1);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
	Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3671 = arg0 * -700411507;
		this.anInt3672 = arg1 * 954153333;
	}

	@OriginalMember(owner = "client!db", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3672 * -307556643;
	}

}
