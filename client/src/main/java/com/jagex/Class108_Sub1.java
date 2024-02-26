package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afo")
public abstract class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!afo", name = "t", descriptor = "I")
	protected static final int anInt3239 = 4;

	@OriginalMember(owner = "client!afo", name = "q", descriptor = "(Lclient!zo;I)V")
	static void method23910(@OriginalArg(0) Class713 arg0, @OriginalArg(1) int arg1) {
		Class499.aClass713_1 = arg0;
	}

	@OriginalMember(owner = "client!afo", name = "aly", descriptor = "(Lclient!yp;S)V")
	static void method23911(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(17) int local17 = client.anIntArrayArrayArray15[arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581]].length >> 1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17;
	}

	@OriginalMember(owner = "client!afo", name = "xq", descriptor = "(Lclient!yp;I)V")
	static void method23912(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.method15513(local13, local23, true, -1143960985);
	}

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "()V")
	Class108_Sub1() {
	}

	@OriginalMember(owner = "client!afo", name = "ax", descriptor = "(IIIIIIZZ)V")
	public abstract void method23894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afo", name = "y", descriptor = "()Z")
	public abstract boolean method23895();

	@OriginalMember(owner = "client!afo", name = "b", descriptor = "()Z")
	public abstract boolean method23896();

	@OriginalMember(owner = "client!afo", name = "q", descriptor = "()Z")
	public abstract boolean method23897();

	@OriginalMember(owner = "client!afo", name = "h", descriptor = "(IIIIIIZZ)V")
	public abstract void method23898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afo", name = "d", descriptor = "(ILclient!do;)V")
	public abstract void method23899(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afo", name = "z", descriptor = "(ILclient!do;)V")
	public abstract void method23900(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afo", name = "p", descriptor = "(Lclient!de;)V")
	public abstract void method23901(@OriginalArg(0) Interface17 arg0);

	@OriginalMember(owner = "client!afo", name = "v", descriptor = "(Lclient!de;)V")
	public abstract void method23902(@OriginalArg(0) Interface17 arg0);

	@OriginalMember(owner = "client!afo", name = "r", descriptor = "(ILclient!do;)V")
	public abstract void method23903(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afo", name = "ai", descriptor = "(IIIIIIZZ)V")
	public abstract void method23904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afo", name = "w", descriptor = "(Lclient!de;)V")
	public abstract void method23905(@OriginalArg(0) Interface17 arg0);

	@OriginalMember(owner = "client!afo", name = "c", descriptor = "()Z")
	public abstract boolean method23906();

	@OriginalMember(owner = "client!afo", name = "ay", descriptor = "(IIIIIIZZ)V")
	public abstract void method23907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afo", name = "n", descriptor = "()Z")
	public abstract boolean method23908();

	@OriginalMember(owner = "client!afo", name = "aq", descriptor = "(IIIIIIZZ)V")
	public abstract void method23909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);
}
