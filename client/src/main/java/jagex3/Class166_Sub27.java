package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ana")
public final class Class166_Sub27 extends Class166 {

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "I")
	static final int anInt2242 = 0;

	@OriginalMember(owner = "client!ana", name = "w", descriptor = "I")
	static final int anInt2243 = 4;

	@OriginalMember(owner = "client!ana", name = "g", descriptor = "(II)V")
	public static void method15950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(21, (long) arg0);
		local4.method21877(2145731156);
	}

	@OriginalMember(owner = "client!ana", name = "awl", descriptor = "(Lclient!yf;I)V")
	static void method15951(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3435 * -849002901 != 13 && client.anInt3435 * -849002901 != 18 || Class251.method26066(-961904827)) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		} else if (Class50.aBoolean26) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else if (Class333.aLong260 * -7110566573125480355L > Class305.method26889(1631621016) - 1000L) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			Class50.aBoolean26 = true;
			@Pc(76) Class175 local76 = Class330.method27465(-2084952673);
			@Pc(82) Class93_Sub22 local82 = Class102.method2592(Class446.aClass446_79, local76.aClass24_2, (byte) 95);
			local82.aClass93_Sub41_Sub2_1.method22407(Class632.anInt5881 * 1926204629, (byte) 45);
			local76.method24363(local82, -1598204780);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ana", name = "ep", descriptor = "(Lclient!yf;B)V")
	static void method15952(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class275.method26435(local11, local14, arg0, -1908690040);
	}

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub27(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ana", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "o", descriptor = "(I)V")
	public void method15943(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -32) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "s", descriptor = "(S)I")
	public int method15944(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "y", descriptor = "()V")
	public void method15945() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 32) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "h", descriptor = "()I")
	public int method15946() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ana", name = "b", descriptor = "()I")
	public int method15947() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ana", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ana", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!ana", name = "x", descriptor = "()V")
	public void method15948() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) 24) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ana", name = "q", descriptor = "()V")
	public void method15949() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16554((byte) -30) * -88839937;
		}
	}
}
