package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amh")
public final class Class166_Sub8 extends Class166 {

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "I")
	public static final int anInt2115 = 1;

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "I")
	public static final int anInt2116 = 0;

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "I")
	public static final int anInt2117 = 2;

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub8(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amh", name = "o", descriptor = "(S)V")
	public void method15538(@OriginalArg(0) short arg0) {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-544365892) == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) 16) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-420657998) == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "(I)Z")
	public boolean method15539(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-899678357) != 0;
	}

	@OriginalMember(owner = "client!amh", name = "y", descriptor = "(S)I")
	public int method15540(@OriginalArg(0) short arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amh", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-172945371) == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "a", descriptor = "()I")
	public int method15541() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amh", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-1168729040) == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "()V")
	public void method15542() {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-868413519) == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -25) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "x", descriptor = "()V")
	public void method15543() {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(1837511243) == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16554((byte) -126) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "b", descriptor = "()Z")
	public boolean method15544() {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15666(-1883443322) != 0;
	}

	@OriginalMember(owner = "client!amh", name = "h", descriptor = "()I")
	public int method15545() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amh", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 2;
	}
}
