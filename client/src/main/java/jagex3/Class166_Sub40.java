package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anr")
public final class Class166_Sub40 extends Class166 {

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "I")
	public static final int anInt2333 = 1;

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "I")
	public static final int anInt2334 = 4;

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "I")
	public static final int anInt2335 = 2;

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "I")
	public static final int anInt2336 = 3;

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "I")
	public static final int anInt2337 = 0;

	@OriginalMember(owner = "client!anr", name = "kr", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	static String[] method16378(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String[] local2 = new String[5];
		for (@Pc(4) int local4 = 0; local4 < 5; local4++) {
			local2[local4] = local4 + " ";
			if (arg0 != null && arg0[local4] != null) {
				local2[local4] = local2[local4] + arg0[local4];
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "(Lclient!yf;I)V")
	static void method16379(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2], 2107005754)).method27700(Class624.aClass120_1, arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], (byte) 121) ? 1 : 0;
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!anr", name = "ahg", descriptor = "(Lclient!yf;I)V")
	static void method16380(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		arg0.anInt6052 -= -1915563430;
		@Pc(39) int local39 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(49) int local49 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (local25 == null) {
			local25 = "";
		}
		if (local25.length() > 80) {
			local25 = local25.substring(0, 80);
		}
		@Pc(66) Class175 local66 = Class330.method27465(-1643987676);
		@Pc(72) Class93_Sub22 local72 = Class102.method2592(Class446.aClass446_77, local66.aClass24_2, (byte) 102);
		local72.aClass93_Sub41_Sub2_1.method22522(Class46.method894(local14, -1905129874) + 2 + Class46.method894(local25, -1698593716), (byte) -60);
		local72.aClass93_Sub41_Sub2_1.method22414(local14, 964893669);
		local72.aClass93_Sub41_Sub2_1.method22522(local39 - 1, (byte) -121);
		local72.aClass93_Sub41_Sub2_1.method22522(local49, (byte) -66);
		local72.aClass93_Sub41_Sub2_1.method22414(local25, -1781436268);
		local66.method24363(local72, -1553810752);
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub40(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "o", descriptor = "(I)V")
	public void method16373(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 14) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "s", descriptor = "(I)I")
	public int method16374(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "y", descriptor = "()V")
	public void method16375() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -127) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "q", descriptor = "()V")
	public void method16376() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -105) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "x", descriptor = "()I")
	public int method16377() {
		return this.anInt2379 * 960141055;
	}
}
