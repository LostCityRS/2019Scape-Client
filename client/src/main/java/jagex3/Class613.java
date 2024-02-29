package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class613 implements Interface75 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!vg;")
	static final Class613 aClass613_2 = new Class613(0);

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!vg;")
	static final Class613 aClass613_3 = new Class613(1);

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!vg;")
	public static final Class613 aClass613_4 = new Class613(2);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	final int anInt5788;

	@OriginalMember(owner = "client!vg", name = "uu", descriptor = "(Lclient!yf;I)V")
	static void method32240(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 891652010);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4076 * -220894753;
	}

	@OriginalMember(owner = "client!vg", name = "ahq", descriptor = "(Lclient!yf;B)V")
	static void method32241(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18273(local23, -1030967057);
		if (local29.method1508(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class610) client.aClass532_1.method30647(1139320094).method18273(local13, -1722652423)).method32165(local23, local29.aString11, (byte) 79);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class610) client.aClass532_1.method30647(2034848841).method18273(local13, 334707401)).method32167(local23, local29.anInt265 * 951920133, 1072417041);
		}
	}

	@OriginalMember(owner = "client!vg", name = "azh", descriptor = "(Lclient!yf;B)V")
	static void method32242(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15438((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vg", name = "bel", descriptor = "(Lclient!yf;I)V")
	static void method32243(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26371(local13, 1570649000).method26465(local23, 1443246446);
	}

	@OriginalMember(owner = "client!vg", name = "bcr", descriptor = "(Lclient!yf;I)V")
	static void method32244(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!vg", name = "and", descriptor = "(Lclient!yf;I)V")
	static void method32245(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3484 = (client.anInt3576 * 522759457 + local12) * 1541774401;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(IB)V")
	static void method32246(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class240 local2 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25925(arg0, (byte) 40);
		}
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	Class613(@OriginalArg(0) int arg0) {
		this.anInt5788 = arg0 * 1474616659;
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5788 * 919563995;
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5788 * 919563995;
	}
}
