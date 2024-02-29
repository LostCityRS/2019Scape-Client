package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akm")
public abstract class Class93_Sub23 extends Class93 {

	@OriginalMember(owner = "client!akm", name = "p", descriptor = "I")
	static final int anInt3113 = 5;

	@OriginalMember(owner = "client!akm", name = "f", descriptor = "I")
	public static final int anInt3114 = 0;

	@OriginalMember(owner = "client!akm", name = "w", descriptor = "I")
	static final int anInt3115 = 1;

	@OriginalMember(owner = "client!akm", name = "k", descriptor = "I")
	public static final int anInt3116 = -1;

	@OriginalMember(owner = "client!akm", name = "z", descriptor = "I")
	static final int anInt3117 = 4;

	@OriginalMember(owner = "client!akm", name = "l", descriptor = "I")
	public static final int anInt3118 = 2;

	@OriginalMember(owner = "client!akm", name = "u", descriptor = "I")
	static final int anInt3119 = 3;

	@OriginalMember(owner = "client!akm", name = "d", descriptor = "I")
	public static final int anInt3120 = 6;

	@OriginalMember(owner = "client!akm", name = "<init>", descriptor = "()V", line = 43)
	Class93_Sub23() {
	}

	@OriginalMember(owner = "client!akm", name = "j", descriptor = "(I)Z", line = 51)
	public static boolean method22871(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akm", name = "r", descriptor = "(IIIB)I", line = 240)
	public static final int method22872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!akm", name = "g", descriptor = "()V")
	public abstract void method22873();

	@OriginalMember(owner = "client!akm", name = "r", descriptor = "()I")
	public abstract int method22874();

	@OriginalMember(owner = "client!akm", name = "n", descriptor = "(I)I")
	public abstract int method22875(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akm", name = "m", descriptor = "(B)I")
	public abstract int method22876(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!akm", name = "k", descriptor = "(I)I")
	public abstract int method22877(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!akm", name = "f", descriptor = "(B)J")
	public abstract long method22878(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!akm", name = "l", descriptor = "(B)V")
	public abstract void method22879(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!akm", name = "u", descriptor = "()I")
	public abstract int method22880();

	@OriginalMember(owner = "client!akm", name = "z", descriptor = "()I")
	public abstract int method22881();

	@OriginalMember(owner = "client!akm", name = "p", descriptor = "()I")
	public abstract int method22882();

	@OriginalMember(owner = "client!akm", name = "d", descriptor = "()I")
	public abstract int method22883();

	@OriginalMember(owner = "client!akm", name = "c", descriptor = "()I")
	public abstract int method22884();

	@OriginalMember(owner = "client!akm", name = "y", descriptor = "()J")
	public abstract long method22885();

	@OriginalMember(owner = "client!akm", name = "a", descriptor = "()I")
	public abstract int method22886();

	@OriginalMember(owner = "client!akm", name = "i", descriptor = "()V")
	public abstract void method22887();

	@OriginalMember(owner = "client!akm", name = "x", descriptor = "()J")
	public abstract long method22888();

	@OriginalMember(owner = "client!akm", name = "v", descriptor = "()I")
	public abstract int method22889();

	@OriginalMember(owner = "client!akm", name = "h", descriptor = "()J")
	public abstract long method22890();

	@OriginalMember(owner = "client!akm", name = "e", descriptor = "(I)I")
	public abstract int method22891(@OriginalArg(0) int arg0);
}
