package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ami")
public final class Class166_Sub9 extends Class166 {

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "I")
	static final int anInt2122 = 0;

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "I")
	static final int anInt2123 = 3;

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "I")
	static final int anInt2124 = 1;

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "I")
	static final int anInt2125 = -1;

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub9(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ami", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return this.aClass93_Sub36_49.method14365(-1628365376).method146(1762313981) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(285228330).method146(-617658522) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(I)I")
	public int method15560(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "()I")
	public int method15561() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return this.aClass93_Sub36_49.method14365(-1773170871).method146(1295217357) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return this.aClass93_Sub36_49.method14365(-218215329).method146(-1874293544) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return this.aClass93_Sub36_49.method14365(-506881339).method146(597821288) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "y", descriptor = "()V")
	public void method15562() {
		if (!this.aClass93_Sub36_49.method14365(-2118289122).method146(1525736280)) {
			this.anInt2379 = this.method16554((byte) -72) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -64) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "q", descriptor = "()V")
	public void method15563() {
		if (!this.aClass93_Sub36_49.method14365(79134665).method146(-794507870)) {
			this.anInt2379 = this.method16554((byte) 17) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -47) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "o", descriptor = "(I)V")
	public void method15564(@OriginalArg(0) int arg0) {
		if (!this.aClass93_Sub36_49.method14365(1208262117).method146(1717219492)) {
			this.anInt2379 = this.method16554((byte) 14) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -39) * -88839937;
		}
	}
}
