package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anz")
public final class Class166_Sub47 extends Class166 {

	@OriginalMember(owner = "client!anz", name = "w", descriptor = "I")
	public static final int anInt2381 = 1;

	@OriginalMember(owner = "client!anz", name = "l", descriptor = "I")
	static final int anInt2382 = 0;

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub47(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anz", name = "x", descriptor = "()I")
	public int method16566() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "o", descriptor = "(I)V")
	public void method16567(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 77);
		if (local5 != 3 && local5 != 5) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14365(-615318132).method141(-601356179) < 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 6) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anz", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14365(979410244).method141(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 90);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!anz", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14365(-1768315801).method141(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 55);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!anz", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "s", descriptor = "(S)I")
	public int method16568(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 46);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 34);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 56);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 104);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 64);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "y", descriptor = "()V")
	public void method16569() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 75);
		if (local5 != 3 && local5 != 5) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14365(-1233911357).method141(-601356179) < 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16554((byte) 5) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anz", name = "q", descriptor = "()I")
	public int method16570() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "a", descriptor = "()I")
	public int method16571() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "b", descriptor = "()I")
	public int method16572() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "h", descriptor = "()I")
	public int method16573() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14365(-1277592728).method141(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15436((byte) 92);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}
}
