package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qe")
public class VarDomainType implements SerializableEnum {

	@ObfuscatedName("qe.e")
	public static final VarDomainType field4594 = new class941(Js5ConfigGroup.VAR_PLAYER, 0, true, true);

	@ObfuscatedName("qe.n")
	public static final VarDomainType field4596 = new class943(Js5ConfigGroup.VAR_NPC, 1, false, true);

	@ObfuscatedName("qe.m")
	public static final VarDomainType field4592 = new class940(Js5ConfigGroup.VAR_CLIENT, 2, true, true);

	@ObfuscatedName("qe.k")
	public static final VarDomainType field4593 = new class939(Js5ConfigGroup.VAR_WORLD, 3, false, false);

	@ObfuscatedName("qe.f")
	public static final VarDomainType field4595 = new VarDomainType(Js5ConfigGroup.VAR_REGION, 4, false, false);

	@ObfuscatedName("qe.w")
	public static final VarDomainType field4602 = new VarDomainType(Js5ConfigGroup.VAR_OBJECT, 5, true, true);

	@ObfuscatedName("qe.l")
	public static final VarDomainType field4600 = new VarDomainType(Js5ConfigGroup.VAR_CLAN, 6, true, true);

	@ObfuscatedName("qe.u")
	public static final VarDomainType field4597 = new VarDomainType(Js5ConfigGroup.VAR_CLAN_SETTING, 7, true, false);

	@ObfuscatedName("qe.z")
	public static final VarDomainType field4598 = new class942(Js5ConfigGroup.VAR_CONTROLLER, 8, false, false);

	@ObfuscatedName("qe.p")
	public static final VarDomainType field4599 = new VarDomainType(Js5ConfigGroup.VAR_PLAYER_GROUP, 9, false, true);

	@ObfuscatedName("qe.d")
	public static final VarDomainType field4590 = new VarDomainType(Js5ConfigGroup.VAR_SHARED, 10, false, false);

	@ObfuscatedName("qe.c")
	public final Js5ConfigGroup field4601;

	@ObfuscatedName("qe.r")
	public final int field4591;

	// $FF: synthetic method
	public VarDomainType(Js5ConfigGroup arg0, int arg1, boolean arg2, boolean arg3, class941 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("qe.e(I)[Lqe;")
	public static VarDomainType[] method7216() {
		return new VarDomainType[] { field4599, field4597, field4598, field4590, field4594, field4592, field4595, field4602, field4593, field4596, field4600 };
	}

	public VarDomainType(Js5ConfigGroup arg0, int arg1, boolean arg2, boolean arg3) {
		this.field4601 = arg0;
		this.field4591 = arg1;
	}

	@ObfuscatedName("qe.m(B)Lxq;")
	public final Js5ConfigGroup method7218() {
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
