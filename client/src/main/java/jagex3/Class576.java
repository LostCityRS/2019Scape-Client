package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class576 {

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	public static final int anInt5560 = 16384;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	static final int anInt5561 = 2048;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	public static final int anInt5562 = 16384;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	static final int anInt5563 = 2048;

	@OriginalMember(owner = "client!to", name = "uo", descriptor = "(Lclient!yf;S)V")
	static void method31530(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(14) Class312 local14 = Class659.method32986(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -168162872);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local14.anInt4086 * 307668159;
	}

	@OriginalMember(owner = "client!to", name = "zu", descriptor = "(Lclient!yf;I)V")
	static void method31531(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1653542369;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(53) int local53 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 4];
		if (local33 == -1) {
			throw new RuntimeException();
		}
		@Pc(66) Class39 local66 = (Class39) Class19.aClass32_Sub7_5.method18273(local33, 1454891541);
		if (local66.aScriptVarType_2.getId() != local23) {
			throw new RuntimeException();
		} else if (local66.aScriptVarType_1.getId() == local13) {
			@Pc(90) int[] local90 = local66.method767(local43, -1497248091);
			if (local53 < 0 || local90 == null || local90.length <= local53) {
				throw new RuntimeException();
			}
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local90[local53];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!to", name = "acy", descriptor = "(Lclient!yf;I)V")
	static void method31532(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = arg0.aClass386_3.method28351((byte) 0)[arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1]];
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	Class576() throws Throwable {
		throw new Error();
	}
}
