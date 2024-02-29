package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anu")
public final class Class166_Sub43 extends Class166 {

	@OriginalMember(owner = "client!anu", name = "u", descriptor = "I")
	static final int anInt2354 = 3;

	@OriginalMember(owner = "client!anu", name = "w", descriptor = "I")
	static final int anInt2355 = 0;

	@OriginalMember(owner = "client!anu", name = "l", descriptor = "I")
	static final int anInt2356 = 1;

	@OriginalMember(owner = "client!anu", name = "r", descriptor = "(Lclient!yf;I)V")
	static void method16439(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class589.method31864((short) -17562);
	}

	@OriginalMember(owner = "client!anu", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anu", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub43(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anu", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 77), -1912701350) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "o", descriptor = "(I)V")
	public void method16434(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -90) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "s", descriptor = "(I)I")
	public int method16435(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anu", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anu", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "x", descriptor = "()I")
	public int method16436() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anu", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 82), -657508631) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 110), 1739485463) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anu", name = "y", descriptor = "()V")
	public void method16437() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -36) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "q", descriptor = "()V")
	public void method16438() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -105) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}
}
