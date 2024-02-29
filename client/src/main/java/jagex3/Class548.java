package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class548 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sf", name = "this$0", descriptor = "Lclient!sb;")
	final Class545 aClass545_3;

	@OriginalMember(owner = "client!sf", name = "se", descriptor = "(Lclient!yf;I)V")
	static void method31191(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4045 * 1572745861;
	}

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "(Lclient!yf;I)V")
	static void method31192(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		if (local11.aString171 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local11.aString171;
		}
	}

	@OriginalMember(owner = "client!sf", name = "aex", descriptor = "(Lclient!yf;I)V")
	static void method31193(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 & local23;
	}

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "(B)V")
	static void method31194(@OriginalArg(0) byte arg0) {
		Class701.aClass93_Sub1_Sub7_7 = new Class93_Sub1_Sub7(Class74.aClass74_56.method1259(Class106.aClass717_8, (byte) -78), "", client.anInt3520 * 895420077, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "(II)I")
	public static int method31195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "(B)V")
	public static void method31196(@OriginalArg(0) byte arg0) {
		@Pc(2) Class175 local2 = Class330.method27465(-1858814111);
		@Pc(8) Class93_Sub22 local8 = Class102.method2592(Class446.aClass446_94, local2.aClass24_2, (byte) 45);
		local8.aClass93_Sub41_Sub2_1.method22522(0, (byte) -42);
		local2.method24363(local8, -1509960398);
	}

	@OriginalMember(owner = "client!sf", name = "jx", descriptor = "(Lclient!hq;Lclient!hf;ZI)V")
	public static void method31197(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class110_Sub21.method8545(arg0.aClass312Array3, arg1, arg2, -1532752138);
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!sb;)V")
	Class548(@OriginalArg(0) Class545 arg0) {
		this.aClass545_3 = arg0;
	}
}
