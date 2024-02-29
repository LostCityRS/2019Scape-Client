package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amy")
public final class Class166_Sub25 extends Class166 {

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "I")
	public static final int anInt2230 = 1;

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "I")
	public static final int anInt2231 = 0;

	@OriginalMember(owner = "client!amy", name = "av", descriptor = "(Lclient!yf;I)V")
	static void method15902(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0.anIntArray522[arg0.anInt6050 * -709694321];
		@Pc(11) Class93_Sub1_Sub13 local11 = Class407.method28764(local7, 1200487767);
		if (local11 == null) {
			throw new RuntimeException();
		}
		@Pc(23) int[] local23 = new int[local11.anInt3065 * 341680345];
		@Pc(29) Object[] local29 = new Object[local11.anInt3064 * -1520226159];
		@Pc(35) long[] local35 = new long[local11.anInt3066 * 801418781];
		@Pc(37) int local37;
		for (local37 = 0; local37 < local11.anInt3067 * 1356869505; local37++) {
			local23[local37] = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - local11.anInt3067 * 1356869505 + local37];
		}
		for (local37 = 0; local37 < local11.anInt3068 * -1006881837; local37++) {
			local29[local37] = arg0.anObjectArray45[local37 + (arg0.anInt6049 * 587908375 - local11.anInt3068 * -1006881837)];
		}
		for (local37 = 0; local37 < local11.anInt3063 * -287495173; local37++) {
			local35[local37] = arg0.aLongArray27[arg0.anInt6055 * -2000995827 - local11.anInt3063 * -287495173 + local37];
		}
		arg0.anInt6052 -= local11.anInt3067 * -1387445587;
		arg0.anInt6049 -= local11.anInt3068 * -1734232923;
		arg0.anInt6055 -= local11.anInt3063 * -1492933593;
		@Pc(147) Class696 local147 = new Class696();
		local147.aClass93_Sub1_Sub13_2 = arg0.aClass93_Sub1_Sub13_1;
		local147.anInt6101 = arg0.anInt6050 * 2112632879;
		local147.anIntArray528 = arg0.anIntArray519;
		local147.anObjectArray46 = arg0.anObjectArray44;
		local147.aLongArray28 = arg0.aLongArray26;
		if (arg0.anInt6051 * -272305733 >= arg0.aClass696Array1.length) {
			throw new RuntimeException();
		}
		arg0.aClass696Array1[(arg0.anInt6051 += 142027635) * -272305733 - 1] = local147;
		arg0.aClass93_Sub1_Sub13_1 = local11;
		arg0.aClass560Array2 = arg0.aClass93_Sub1_Sub13_1.aClass560Array1;
		arg0.anIntArray522 = arg0.aClass93_Sub1_Sub13_1.anIntArray259;
		arg0.anInt6050 = -2047914607;
		arg0.anIntArray519 = local23;
		arg0.anObjectArray44 = local29;
		arg0.aLongArray26 = local35;
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub25(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amy", name = "o", descriptor = "(I)V")
	public void method15898(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) -9) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amy", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "s", descriptor = "(I)I")
	public int method15899(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amy", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amy", name = "y", descriptor = "()V")
	public void method15900() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) -22) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amy", name = "q", descriptor = "()I")
	public int method15901() {
		return this.anInt2379 * 960141055;
	}
}
