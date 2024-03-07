package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amz")
public class Class166_Sub26 extends Class166 {

	@OriginalMember(owner = "client!amz", name = "l", descriptor = "I")
	static final int anInt2236 = 2;

	@OriginalMember(owner = "client!amz", name = "w", descriptor = "I")
	static final int anInt2237 = 0;

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(ILclient!ali;)V", line = 11)
	public Class166_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(Lclient!ali;)V", line = 15)
	public Class166_Sub26(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amz", name = "q", descriptor = "()V", line = 19)
	public void method15905() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -30) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "x", descriptor = "()V", line = 19)
	public void method15906() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) 31) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "o", descriptor = "(I)V", line = 19)
	public void method15907(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) 25) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amz", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amz", name = "h", descriptor = "()Z", line = 27)
	public boolean method15908() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "g", descriptor = "()Z", line = 27)
	public boolean method15909() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "s", descriptor = "(S)Z", line = 27)
	public boolean method15910(@OriginalArg(0) short arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "b", descriptor = "()Z", line = 27)
	public boolean method15911() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "a", descriptor = "()Z", line = 27)
	public boolean method15912() {
		return true;
	}

	@OriginalMember(owner = "client!amz", name = "n", descriptor = "(II)I", line = 31)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "p", descriptor = "(I)I", line = 31)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!amz", name = "k", descriptor = "(II)V", line = 36)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "d", descriptor = "(I)V", line = 36)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "c", descriptor = "(I)V", line = 36)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amz", name = "y", descriptor = "(B)I", line = 40)
	public int method15913(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "i", descriptor = "()I", line = 40)
	public int method15914() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "j", descriptor = "()I", line = 40)
	public int method15915() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amz", name = "yk", descriptor = "(Lclient!yf;I)V", line = 9263)
	static final void method15916(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.userPlayerModLevel * 1563202683 >= 5 && client.userPlayerModLevel * 1563202683 <= 9) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.userPlayerModLevel * 1563202683;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}
}
