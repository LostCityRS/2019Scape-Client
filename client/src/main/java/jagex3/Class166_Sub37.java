package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ann")
public final class Class166_Sub37 extends Class166 {

	@OriginalMember(owner = "client!ann", name = "w", descriptor = "I")
	static final int anInt2314 = 100;

	@OriginalMember(owner = "client!ann", name = "u", descriptor = "I")
	static final int anInt2315 = 33;

	@OriginalMember(owner = "client!ann", name = "l", descriptor = "I")
	static final int anInt2316 = 400;

	@OriginalMember(owner = "client!ann", name = "j", descriptor = "[Lclient!cm;")
	static Class100[] aClass100Array5;

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub37(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ann", name = "y", descriptor = "()V")
	public void method16276() {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 400) {
			this.anInt2379 = this.method16554((byte) 25) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ann", name = "s", descriptor = "(I)I")
	public int method16277(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ann", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 100;
	}

	@OriginalMember(owner = "client!ann", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "o", descriptor = "(B)V")
	public void method16278(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 33 || this.anInt2379 * 960141055 > 400) {
			this.anInt2379 = this.method16554((byte) -72) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ann", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ann", name = "q", descriptor = "()I")
	public int method16279() {
		return this.anInt2379 * 960141055;
	}
}
