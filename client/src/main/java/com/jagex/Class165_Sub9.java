package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ami")
public final class Class165_Sub9 extends Class165 {

	@OriginalMember(owner = "client!ami", name = "i", descriptor = "I")
	public static final int anInt2146 = 0;

	@OriginalMember(owner = "client!ami", name = "g", descriptor = "I")
	public static final int anInt2147 = 1;

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub9(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ami", name = "d", descriptor = "()Z")
	public boolean method15993() {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!ami", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(B)Z")
	public boolean method15994(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 != 0 && this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) -77) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "()V")
	public void method15995() {
		if (this.anInt2398 * -229615671 != 0 && this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) 46) != 1) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 != 0 && this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) 30) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ami", name = "k", descriptor = "(B)I")
	public int method15996(@OriginalArg(0) byte arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "()I")
	public int method15997() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ami", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) 66) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ami", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "()Z")
	public boolean method15998() {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "r", descriptor = "()Z")
	public boolean method15999() {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "q", descriptor = "()Z")
	public boolean method16000() {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "h", descriptor = "()Z")
	public boolean method16001() {
		return true;
	}

	@OriginalMember(owner = "client!ami", name = "a", descriptor = "(I)V")
	public void method16002(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 != 0 && this.aClass80_Sub37_48.aClass165_Sub41_1.method16802((byte) -29) != 1) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 != 0 && this.aClass80_Sub37_48.aClass165_Sub25_1.method16332(-441029515) == 2) {
			this.anInt2398 = 0;
		}
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 1) {
			this.anInt2398 = this.method16949((byte) 51) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ami", name = "p", descriptor = "()I")
	public int method16003() {
		return this.anInt2398 * -229615671;
	}
}
