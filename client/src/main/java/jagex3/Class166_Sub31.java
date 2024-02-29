package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ang")
public final class Class166_Sub31 extends Class166 {

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "I")
	public static final int anInt2272 = 0;

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "I")
	public static final int anInt2273 = 1;

	@OriginalMember(owner = "client!ang", name = "le", descriptor = "(ZIB)V")
	public static void method16129(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) Class93_Sub28 local5 = arg0 ? Class121.aClass93_Sub28_2 : Class253.aClass93_Sub28_3;
		if (local5 == null || arg1 < 0 || arg1 >= local5.anInt1602 * -1052058559) {
			return;
		}
		@Pc(21) Class373 local21 = local5.aClass373Array1[arg1];
		if (local21.aByte150 != -1) {
			return;
		}
		@Pc(29) String local29 = local21.aString200;
		@Pc(32) Class175 local32 = Class330.method27465(-2070490767);
		@Pc(38) Class93_Sub22 local38 = Class102.method2592(Class446.aClass446_96, local32.aClass24_2, (byte) 33);
		local38.aClass93_Sub41_Sub2_1.method22522(Class46.method894(local29, -1614772735) + 3, (byte) -37);
		local38.aClass93_Sub41_Sub2_1.method22522(arg0 ? 1 : 0, (byte) -29);
		local38.aClass93_Sub41_Sub2_1.method22466(arg1, 2136911152);
		local38.aClass93_Sub41_Sub2_1.method22414(local29, 1257477998);
		local32.method24363(local38, -2102181116);
	}

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub31(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ang", name = "i", descriptor = "()I")
	public int method16117() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "o", descriptor = "(I)V")
	public void method16118(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) -109) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ang", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "()I")
	public int method16119() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "y", descriptor = "(S)I")
	public int method16120(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "s", descriptor = "(I)Z")
	public boolean method16121(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ang", name = "b", descriptor = "()Z")
	public boolean method16122() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "h", descriptor = "()Z")
	public boolean method16123() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "()V")
	public void method16124() {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16554((byte) -105) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ang", name = "x", descriptor = "()Z")
	public boolean method16125() {
		return true;
	}

	@OriginalMember(owner = "client!ang", name = "j", descriptor = "()I")
	public int method16126() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "g", descriptor = "()I")
	public int method16127() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ang", name = "a", descriptor = "()Z")
	public boolean method16128() {
		return true;
	}
}
