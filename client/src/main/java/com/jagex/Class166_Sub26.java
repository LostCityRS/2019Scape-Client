package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amz")
public final class Class166_Sub26 extends Class166 {

	@OriginalMember(owner = "client!amz", name = "l", descriptor = "I")
	static final int anInt2236 = 2;

	@OriginalMember(owner = "client!amz", name = "w", descriptor = "I")
	static final int anInt2237 = 0;

	@OriginalMember(owner = "client!amz", name = "yk", descriptor = "(Lclient!yf;I)V")
	static void method15928(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3515 * 1563202683 >= 5 && client.anInt3515 * 1563202683 <= 9) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3515 * 1563202683;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub26(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amz", name = "h", descriptor = "()Z")
	public boolean method15917() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "g", descriptor = "()Z")
	public boolean method15918() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "s", descriptor = "(S)Z")
	public boolean method15919(@OriginalArg(0) short arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "y", descriptor = "(B)I")
	public int method15920(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "q", descriptor = "()V")
	public void method15921() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -30) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "x", descriptor = "()V")
	public void method15922() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) 31) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "b", descriptor = "()Z")
	public boolean method15923() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "i", descriptor = "()I")
	public int method15924() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "j", descriptor = "()I")
	public int method15925() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "o", descriptor = "(I)V")
	public void method15926(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) 25) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "a", descriptor = "()Z")
	public boolean method15927() {
		return true;
	}
}
