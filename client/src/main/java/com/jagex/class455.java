package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qe")
public class class455 implements class685 {

	@ObfuscatedName("qe.e")
	public static final class455 field4594 = new class941(class655.field8018, 0, true, true);

	@ObfuscatedName("qe.n")
	public static final class455 field4596 = new class943(class655.field8027, 1, false, true);

	@ObfuscatedName("qe.m")
	public static final class455 field4592 = new class940(class655.field8028, 2, true, true);

	@ObfuscatedName("qe.k")
	public static final class455 field4593 = new class939(class655.field8029, 3, false, false);

	@ObfuscatedName("qe.f")
	public static final class455 field4595 = new class455(class655.field8030, 4, false, false);

	@ObfuscatedName("qe.w")
	public static final class455 field4602 = new class455(class655.field8046, 5, true, true);

	@ObfuscatedName("qe.l")
	public static final class455 field4600 = new class455(class655.field8034, 6, true, true);

	@ObfuscatedName("qe.u")
	public static final class455 field4597 = new class455(class655.field8031, 7, true, false);

	@ObfuscatedName("qe.z")
	public static final class455 field4598 = new class942(class655.field8033, 8, false, false);

	@ObfuscatedName("qe.p")
	public static final class455 field4599 = new class455(class655.field8020, 9, false, true);

	@ObfuscatedName("qe.d")
	public static final class455 field4590 = new class455(class655.field8048, 10, false, false);

	@ObfuscatedName("qe.c")
	public final class655 field4601;

	@ObfuscatedName("qe.r")
	public final int field4591;

	// $FF: synthetic method
	public class455(class655 arg0, int arg1, boolean arg2, boolean arg3, class941 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("qe.e(I)[Lqe;")
	public static class455[] method7216() {
		return new class455[] { field4599, field4597, field4598, field4590, field4594, field4592, field4595, field4602, field4593, field4596, field4600 };
	}

	public class455(class655 arg0, int arg1, boolean arg2, boolean arg3) {
		this.field4601 = arg0;
		this.field4591 = arg1;
	}

	@ObfuscatedName("qe.m(B)Lxq;")
	public final class655 method7218() {
		return this.field4601;
	}

	@ObfuscatedName("qe.n()I")
	public int method1303() {
		return this.field4591;
	}

	@ObfuscatedName("qe.f(Lec;B)Ljava/lang/Object;")
	public Object method7211(class149 arg0) {
		return arg0.field1703 ? this.method7212(arg0) : arg0.field1704.method7298();
	}

	@ObfuscatedName("qe.w(Lec;I)Ljava/lang/Object;")
	public Object method7212(class149 arg0) {
		return arg0.field1704.method7298();
	}
}
