package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aun")
public final class Class80_Sub1_Sub15_Sub3 extends Class80_Sub1_Sub15 {

	@OriginalMember(owner = "client!aun", name = "as", descriptor = "I")
	public static int anInt3293;

	@OriginalMember(owner = "client!aun", name = "a", descriptor = "B")
	byte aByte95;

	@OriginalMember(owner = "client!aun", name = "j", descriptor = "Lclient!ald;")
	Class80_Sub36 aClass80_Sub36_13;

	@OriginalMember(owner = "client!aun", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub15_Sub3() {
	}

	@OriginalMember(owner = "client!aun", name = "t", descriptor = "(I)[B")
	@Override
	byte[] method24390(@OriginalArg(0) int arg0) {
		if (this.aBoolean661 || this.aClass80_Sub36_13.anInt3152 * -1380987821 < this.aClass80_Sub36_13.aByteArray61.length - this.aByte95) {
			throw new RuntimeException();
		}
		return this.aClass80_Sub36_13.aByteArray61;
	}

	@OriginalMember(owner = "client!aun", name = "u", descriptor = "()[B")
	@Override
	byte[] method24392() {
		if (this.aBoolean661 || this.aClass80_Sub36_13.anInt3152 * -1380987821 < this.aClass80_Sub36_13.aByteArray61.length - this.aByte95) {
			throw new RuntimeException();
		}
		return this.aClass80_Sub36_13.aByteArray61;
	}

	@OriginalMember(owner = "client!aun", name = "f", descriptor = "(I)I")
	@Override
	int method24391(@OriginalArg(0) int arg0) {
		return this.aClass80_Sub36_13 == null ? 0 : this.aClass80_Sub36_13.anInt3152 * -659828628 / (this.aClass80_Sub36_13.aByteArray61.length - this.aByte95);
	}

	@OriginalMember(owner = "client!aun", name = "e", descriptor = "()[B")
	@Override
	byte[] method24389() {
		if (this.aBoolean661 || this.aClass80_Sub36_13.anInt3152 * -1380987821 < this.aClass80_Sub36_13.aByteArray61.length - this.aByte95) {
			throw new RuntimeException();
		}
		return this.aClass80_Sub36_13.aByteArray61;
	}

	@OriginalMember(owner = "client!aun", name = "l", descriptor = "()I")
	@Override
	int method24393() {
		return this.aClass80_Sub36_13 == null ? 0 : this.aClass80_Sub36_13.anInt3152 * -659828628 / (this.aClass80_Sub36_13.aByteArray61.length - this.aByte95);
	}
}
