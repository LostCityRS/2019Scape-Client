package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amv")
public final class Class166_Sub22 extends Class166 {

	@OriginalMember(owner = "client!amv", name = "l", descriptor = "I")
	static final int anInt2209 = 2;

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "I")
	static final int anInt2210 = 3;

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "I")
	static final int anInt2211 = 0;

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amv", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub22(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amv", name = "y", descriptor = "()V")
	public void method15834() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16554((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amv", name = "o", descriptor = "(B)V")
	public void method15835(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16554((byte) -127) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amv", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "s", descriptor = "(I)I")
	public int method15836(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amv", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amv", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amv", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 2;
	}

	@OriginalMember(owner = "client!amv", name = "q", descriptor = "()V")
	public void method15837() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 != 3) {
			this.anInt2379 = this.method16554((byte) -127) * -88839937;
		}
	}
}
