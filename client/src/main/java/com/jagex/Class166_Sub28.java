package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!and")
public class Class166_Sub28 extends Class166 {

	@OriginalMember(owner = "client!and", name = "l", descriptor = "I")
	public static final int anInt2252 = 1;

	@OriginalMember(owner = "client!and", name = "u", descriptor = "I")
	public static final int anInt2253 = 0;

	@OriginalMember(owner = "client!and", name = "w", descriptor = "I")
	static final int anInt2254 = 3;

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub28(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!and", name = "o", descriptor = "(I)V", line = 21)
	public void method16036(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(-1071194842) && !Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 78), -588401376)) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14378(-1309367423).method149(1390272466)) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
				this.anInt2379 = this.method16545((byte) -43) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) -16) * -88839937;
		}
	}

	@OriginalMember(owner = "client!and", name = "q", descriptor = "()V", line = 21)
	public void method16037() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15432(839034175) && !Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 31), 652237239)) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14378(-381666983).method149(849985533)) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
				this.anInt2379 = this.method16545((byte) -32) * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16545((byte) -84) * -88839937;
		}
	}

	@OriginalMember(owner = "client!and", name = "e", descriptor = "(B)I", line = 37)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "f", descriptor = "()I", line = 37)
	@Override
	int method16544() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "w", descriptor = "()I", line = 37)
	@Override
	int method16552() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "u", descriptor = "()I", line = 37)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "l", descriptor = "()I", line = 37)
	@Override
	int method16549() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "s", descriptor = "(I)Z", line = 41)
	public boolean method16038(@OriginalArg(0) int arg0) {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 106), 641242417);
	}

	@OriginalMember(owner = "client!and", name = "x", descriptor = "()Z", line = 41)
	public boolean method16039() {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 43), 925189051);
	}

	@OriginalMember(owner = "client!and", name = "b", descriptor = "()Z", line = 41)
	public boolean method16040() {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 96), 783598080);
	}

	@OriginalMember(owner = "client!and", name = "z", descriptor = "(I)I", line = 46)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 42), -1635786054) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "n", descriptor = "(II)I", line = 46)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 31), -65902501) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "p", descriptor = "(I)I", line = 46)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return Class136.method10213(this.aClass93_Sub36_49.aClass166_Sub4_2.method15426((byte) 58), 1609136669) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "c", descriptor = "(I)V", line = 51)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "k", descriptor = "(II)V", line = 51)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "d", descriptor = "(I)V", line = 51)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "y", descriptor = "(B)I", line = 55)
	public int method16041(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!and", name = "h", descriptor = "()I", line = 55)
	public int method16042() {
		return this.anInt2379 * 960141055;
	}
}
