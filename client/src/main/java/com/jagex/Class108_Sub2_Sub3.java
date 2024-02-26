package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.*;

@OriginalClass("client!apw")
public abstract class Class108_Sub2_Sub3 extends Class108_Sub2 {

	@OriginalMember(owner = "client!apw", name = "i", descriptor = "Z")
	boolean aBoolean634;

	@OriginalMember(owner = "client!apw", name = "l", descriptor = "[I")
	int[] anIntArray287;

	@OriginalMember(owner = "client!apw", name = "g", descriptor = "[F")
	float[] aFloatArray90;

	@OriginalMember(owner = "client!apw", name = "f", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas4;

	@OriginalMember(owner = "client!apw", name = "t", descriptor = "Lclient!aff;")
	final Class102_Sub2 aClass102_Sub2_14;

	@OriginalMember(owner = "client!apw", name = "e", descriptor = "I")
	int anInt3237;

	@OriginalMember(owner = "client!apw", name = "u", descriptor = "I")
	int anInt3238;

	@OriginalMember(owner = "client!apw", name = "c", descriptor = "(Lclient!aff;Ljava/awt/Canvas;II)Lclient!apw;")
	static Class108_Sub2_Sub3 method23873(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class108_Sub2_Sub3_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apw", name = "b", descriptor = "(Lclient!aff;Ljava/awt/Canvas;II)Lclient!apw;")
	static Class108_Sub2_Sub3 method23874(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class108_Sub2_Sub3_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apw", name = "<init>", descriptor = "(Lclient!aff;Ljava/awt/Canvas;II)V")
	Class108_Sub2_Sub3(@OriginalArg(0) Class102_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas4 = arg1;
		this.aClass102_Sub2_14 = arg0;
		this.anInt3237 = arg2 * 1071516395;
		this.anInt3238 = arg3 * -1500193933;
	}

	@OriginalMember(owner = "client!apw", name = "z", descriptor = "(II)V")
	@Override
	final void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt3237 * -226538045 || arg1 != this.anInt3238 * -1201225285) {
			this.anInt3237 = arg0 * 1071516395;
			this.anInt3238 = arg1 * -1500193933;
			this.method23872(1866689401);
		}
	}

	@OriginalMember(owner = "client!apw", name = "i", descriptor = "()I")
	@Override
	public final int method24042() {
		return this.anInt3237 * -226538045;
	}

	@OriginalMember(owner = "client!apw", name = "f", descriptor = "()I")
	@Override
	public final int method24037() {
		return this.anInt3238 * -1201225285;
	}

	@OriginalMember(owner = "client!apw", name = "t", descriptor = "()I")
	@Override
	public final int method24036() {
		return this.anInt3237 * -226538045;
	}

	@OriginalMember(owner = "client!apw", name = "u", descriptor = "()Z")
	@Override
	final boolean method24039() {
		this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		this.aBoolean634 = true;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "l", descriptor = "()Z")
	@Override
	final boolean method24044() {
		this.aBoolean634 = false;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "g", descriptor = "()I")
	@Override
	public final int method24041() {
		return this.anInt3237 * -226538045;
	}

	@OriginalMember(owner = "client!apw", name = "r", descriptor = "(I)V")
	void method23872(@OriginalArg(0) int arg0) {
		this.anIntArray287 = new int[this.anInt3237 * -226538045 * this.anInt3238 * -1201225285];
		this.aFloatArray90 = new float[this.anInt3237 * -226538045 * -1201225285 * this.anInt3238];
		if (this.aBoolean634) {
			this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!apw", name = "s", descriptor = "()Z")
	@Override
	final boolean method24047() {
		this.aBoolean634 = false;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "o", descriptor = "()I")
	@Override
	public final int method24043() {
		return this.anInt3238 * -1201225285;
	}

	@OriginalMember(owner = "client!apw", name = "j", descriptor = "()Z")
	@Override
	final boolean method24045() {
		this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		this.aBoolean634 = true;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "a", descriptor = "()Z")
	@Override
	final boolean method24040() {
		this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		this.aBoolean634 = true;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "m", descriptor = "()I")
	@Override
	public final int method24035() {
		return this.anInt3237 * -226538045;
	}

	@OriginalMember(owner = "client!apw", name = "k", descriptor = "()Z")
	@Override
	final boolean method24048() {
		this.aBoolean634 = false;
		return true;
	}

	@OriginalMember(owner = "client!apw", name = "ax", descriptor = "()V")
	void method23875() {
		this.anIntArray287 = new int[this.anInt3237 * -226538045 * this.anInt3238 * -1201225285];
		this.aFloatArray90 = new float[this.anInt3237 * -226538045 * -1201225285 * this.anInt3238];
		if (this.aBoolean634) {
			this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!apw", name = "ay", descriptor = "()V")
	void method23876() {
		this.anIntArray287 = new int[this.anInt3237 * -226538045 * this.anInt3238 * -1201225285];
		this.aFloatArray90 = new float[this.anInt3237 * -226538045 * -1201225285 * this.anInt3238];
		if (this.aBoolean634) {
			this.aClass102_Sub2_14.method5113(this.anInt3237 * -226538045, this.anInt3238 * -1201225285, this.anIntArray287, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!apw", name = "d", descriptor = "(II)V")
	@Override
	final void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt3237 * -226538045 || arg1 != this.anInt3238 * -1201225285) {
			this.anInt3237 = arg0 * 1071516395;
			this.anInt3238 = arg1 * -1500193933;
			this.method23872(1866689401);
		}
	}
}
