package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amb")
public final class Class165_Sub2 extends Class165 {

	@OriginalMember(owner = "client!amb", name = "i", descriptor = "I")
	public static final int anInt2103 = 1;

	@OriginalMember(owner = "client!amb", name = "g", descriptor = "I")
	static final int anInt2104 = 2;

	@OriginalMember(owner = "client!amb", name = "m", descriptor = "I")
	public static final int anInt2105 = 0;

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amb", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub2(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amb", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "r", descriptor = "()Z")
	public boolean method15858() {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amb", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10) {
			return arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) 5) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amb", name = "s", descriptor = "(I)Z")
	public boolean method15859(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10;
	}

	@OriginalMember(owner = "client!amb", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amb", name = "x", descriptor = "()V")
	public void method15860() {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.aClass80_Sub37_48.method14947(230999675).method449(600905640)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
				this.anInt2398 = this.method16949((byte) -40) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 50) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amb", name = "k", descriptor = "(I)I")
	public int method15861(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amb", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) == Class722.aClass722_10) {
			return arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) 76) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!amb", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amb", name = "a", descriptor = "(I)V")
	public void method15862(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.aClass80_Sub37_48.method14947(-749893524).method449(-282659840)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
				this.anInt2398 = this.method16949((byte) -49) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 8) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amb", name = "w", descriptor = "()V")
	public void method15863() {
		if (this.aClass80_Sub37_48.method14956((short) 16383) != Class722.aClass722_10) {
			this.anInt2398 = 251097721;
		}
		if (this.aClass80_Sub37_48.method14947(862889825).method449(1420958397)) {
			if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 2) {
				this.anInt2398 = this.method16949((byte) 92) * 251097721;
			}
		} else if (this.anInt2398 * -229615671 != 0 && this.anInt2398 * -229615671 != 1) {
			this.anInt2398 = this.method16949((byte) 46) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amb", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amb", name = "q", descriptor = "()I")
	public int method15864() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amb", name = "h", descriptor = "()I")
	public int method15865() {
		return this.anInt2398 * -229615671;
	}
}
