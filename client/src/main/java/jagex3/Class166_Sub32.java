package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anh")
public final class Class166_Sub32 extends Class166 {

	@OriginalMember(owner = "client!anh", name = "w", descriptor = "I")
	static final int anInt2278 = -3;

	@OriginalMember(owner = "client!anh", name = "l", descriptor = "I")
	static final int anInt2279 = -2;

	@OriginalMember(owner = "client!anh", name = "ak", descriptor = "I")
	static int anInt2280;

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anh", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub32(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anh", name = "h", descriptor = "()I")
	public int method16144() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "o", descriptor = "(I)V")
	public void method16145(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16554((byte) -39) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "s", descriptor = "(I)I")
	public int method16146(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "q", descriptor = "()V")
	public void method16147() {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16554((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!anh", name = "y", descriptor = "()V")
	public void method16148() {
		if (this.anInt2379 * 960141055 < -3) {
			this.anInt2379 = this.method16554((byte) -33) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anh", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return -2;
	}

	@OriginalMember(owner = "client!anh", name = "x", descriptor = "()I")
	public int method16149() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "b", descriptor = "()I")
	public int method16150() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anh", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anh", name = "a", descriptor = "()I")
	public int method16151() {
		return this.anInt2379 * 960141055;
	}
}
