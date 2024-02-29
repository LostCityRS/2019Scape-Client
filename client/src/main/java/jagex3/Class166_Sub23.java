package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amw")
public final class Class166_Sub23 extends Class166 {

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "I")
	public static final int anInt2216 = 2;

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "I")
	public static final int anInt2217 = 3;

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "I")
	public static final int anInt2218 = 1;

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub23(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amw", name = "y", descriptor = "()V")
	public void method15852() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) 21) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "o", descriptor = "(I)V")
	public void method15853(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -56) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(-164079270).method139(1350484459) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "x", descriptor = "()V")
	public void method15854() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -17) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return this.aClass93_Sub36_49.method14365(-2064889751).method139(1350484459) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return this.aClass93_Sub36_49.method14365(-1372326755).method139(1350484459) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return this.aClass93_Sub36_49.method14365(-1436517836).method139(1350484459) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return this.aClass93_Sub36_49.method14365(-1529306746).method139(1350484459) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "q", descriptor = "()V")
	public void method15855() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) -9) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "s", descriptor = "(I)I")
	public int method15856(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "b", descriptor = "()I")
	public int method15857() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "h", descriptor = "()I")
	public int method15858() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "a", descriptor = "()I")
	public int method15859() {
		return this.anInt2379 * 960141055;
	}
}
