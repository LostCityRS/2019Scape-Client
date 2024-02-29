package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anz")
public class Class166_Sub47 extends Class166 {

	@OriginalMember(owner = "client!anz", name = "w", descriptor = "I")
	public static final int anInt2381 = 1;

	@OriginalMember(owner = "client!anz", name = "l", descriptor = "I")
	static final int anInt2382 = 0;

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub47(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anz", name = "o", descriptor = "(I)V", line = 20)
	public void method16554(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 77);
		if (local5 != 3 && local5 != 5) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14378(-615318132).method140(-601356179) < 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) 6) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anz", name = "y", descriptor = "()V", line = 20)
	public void method16555() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 75);
		if (local5 != 3 && local5 != 5) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14378(-1233911357).method140(-601356179) < 2) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) 5) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anz", name = "f", descriptor = "()I", line = 27)
	@Override
	int method16544() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 46);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "w", descriptor = "()I", line = 27)
	@Override
	int method16552() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 34);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "l", descriptor = "()I", line = 27)
	@Override
	int method16549() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 56);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "u", descriptor = "()I", line = 27)
	@Override
	int method16550() {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 104);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "e", descriptor = "(B)I", line = 27)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 64);
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!anz", name = "z", descriptor = "(I)I", line = 33)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14378(979410244).method140(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 90);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!anz", name = "n", descriptor = "(II)I", line = 33)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14378(-1768315801).method140(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 55);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!anz", name = "p", descriptor = "(I)I", line = 33)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass93_Sub36_49.method14378(-1277592728).method140(-601356179) < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass93_Sub36_49.aClass166_Sub4_1.method15426((byte) 92);
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!anz", name = "k", descriptor = "(II)V", line = 41)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "c", descriptor = "(I)V", line = 41)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "d", descriptor = "(I)V", line = 41)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anz", name = "x", descriptor = "()I", line = 45)
	public int method16556() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "s", descriptor = "(S)I", line = 45)
	public int method16557(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "q", descriptor = "()I", line = 45)
	public int method16558() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "a", descriptor = "()I", line = 45)
	public int method16559() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "b", descriptor = "()I", line = 45)
	public int method16560() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anz", name = "h", descriptor = "()I", line = 45)
	public int method16561() {
		return this.anInt2379 * 960141055;
	}
}
