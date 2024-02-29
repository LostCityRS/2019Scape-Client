package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amt")
public final class Class166_Sub20 extends Class166 {

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "I")
	static final int anInt2196 = 1;

	@OriginalMember(owner = "client!amt", name = "w", descriptor = "I")
	public static final int anInt2197 = 2;

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "I")
	public static final int anInt2198 = 0;

	@OriginalMember(owner = "client!amt", name = "jd", descriptor = "Lclient!uz;")
	static Class160 aClass160_2;

	@OriginalMember(owner = "client!amt", name = "ajv", descriptor = "(Lclient!yf;B)V")
	static void method15795(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class112_Sub2_Sub2.aClass158_2.method14308(81, -359907109)) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub20(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amt", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(2047483596) == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "s", descriptor = "(B)Z")
	public boolean method15786(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(1021793313) == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "y", descriptor = "(I)I")
	public int method15787(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amt", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "o", descriptor = "(I)V")
	public void method15788(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "q", descriptor = "()V")
	public void method15789() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -47) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "a", descriptor = "()Z")
	public boolean method15790() {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "g", descriptor = "()I")
	public int method15791() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amt", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "x", descriptor = "()V")
	public void method15792() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -116) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "h", descriptor = "()Z")
	public boolean method15793() {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16541(-1999799217) == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "b", descriptor = "()V")
	public void method15794() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -116) * -88839937;
		}
	}
}
