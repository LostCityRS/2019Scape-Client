package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anc")
public final class Class165_Sub28 extends Class165 {

	@OriginalMember(owner = "client!anc", name = "aaa", descriptor = "(Lclient!yp;B)V")
	static void method16426(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.aString148 == null || local12 >= Class274.anInt3924 * -912877411) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class14.aClass164Array1[local12].aByte57;
		}
	}

	@OriginalMember(owner = "client!anc", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anc", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub28(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "s", descriptor = "(I)I")
	public int method16420(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anc", name = "a", descriptor = "(I)V")
	public void method16421(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!anc", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anc", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anc", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anc", name = "k", descriptor = "()V")
	public void method16422() {
	}

	@OriginalMember(owner = "client!anc", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 0;
	}

	@OriginalMember(owner = "client!anc", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 0;
	}

	@OriginalMember(owner = "client!anc", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anc", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!anc", name = "x", descriptor = "()I")
	public int method16423() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anc", name = "w", descriptor = "()I")
	public int method16424() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!anc", name = "r", descriptor = "()I")
	public int method16425() {
		return this.anInt2398 * -229615671;
	}
}
