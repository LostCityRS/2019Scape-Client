package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class484 implements Interface75 {

	@OriginalMember(owner = "client!pj", name = "ex", descriptor = "Lclient!pu;")
	public static Class493 aClass493_2;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Lclient!pj;")
	static final Class484 aClass484_5 = new Class484("UNCOMPRESSED", 0);

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Lclient!pj;")
	static final Class484 aClass484_2 = new Class484("BZIP2", 1);

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!pj;")
	static final Class484 aClass484_4 = new Class484("GZIP", 2);

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!pj;")
	static final Class484 aClass484_3 = new Class484("LZMA", 3);

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/lang/String;")
	final String aString224;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	final int anInt5304;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "()[Lclient!pj;")
	static Class484[] method29964() {
		return new Class484[] { aClass484_4, aClass484_3, aClass484_2, aClass484_5 };
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(S)[Lclient!pj;")
	static Class484[] method29965(@OriginalArg(0) short arg0) {
		return new Class484[] { aClass484_4, aClass484_3, aClass484_2, aClass484_5 };
	}

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "()[Lclient!pj;")
	static Class484[] method29966() {
		return new Class484[] { aClass484_4, aClass484_3, aClass484_2, aClass484_5 };
	}

	@OriginalMember(owner = "client!pj", name = "zf", descriptor = "(Lclient!yf;I)V")
	static void method29967(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		Class670.method33139(local14, local25, 1750421324);
	}

	@OriginalMember(owner = "client!pj", name = "abi", descriptor = "(Lclient!yf;I)V")
	static void method29968(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 2 && local12 < client.anInt3444 * 862418793) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass281Array1[local12].aBoolean677 ? 1 : 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "anb", descriptor = "(Lclient!yf;B)V")
	static void method29969(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class320.method27333(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3, -1694852530);
	}

	@OriginalMember(owner = "client!pj", name = "ava", descriptor = "(Lclient!yf;I)V")
	static void method29970(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!pj", name = "avh", descriptor = "(Lclient!yf;I)V")
	static void method29971(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!pj", name = "jt", descriptor = "(Lclient!akl;IIII)V")
	static void method29972(@OriginalArg(0) Class93_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.aClass93_Sub41_Sub2_1.method22468(arg3, (short) 255);
		arg0.aClass93_Sub41_Sub2_1.method22470(arg2, -1871503550);
		arg0.aClass93_Sub41_Sub2_1.method22407(arg1, (byte) -9);
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)[Lclient!dt;")
	static Class233[] method29973(@OriginalArg(0) int arg0) {
		return new Class233[] { Class233.aClass233_4, Class233.aClass233_2, Class233.aClass233_5, Class233.aClass233_1, Class233.aClass233_3 };
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class484(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString224 = arg0;
		this.anInt5304 = arg1 * -907348981;
	}

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5304 * 2144401315;
	}

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5304 * 2144401315;
	}
}
