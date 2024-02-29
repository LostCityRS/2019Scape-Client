package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aph")
public abstract class Class112_Sub2_Sub2 extends Class112_Sub2 {

	@OriginalMember(owner = "client!aph", name = "ek", descriptor = "Lclient!ub;")
	public static Class158 aClass158_2;

	@OriginalMember(owner = "client!aph", name = "l", descriptor = "Z")
	boolean aBoolean533;

	@OriginalMember(owner = "client!aph", name = "f", descriptor = "[I")
	int[] anIntArray276;

	@OriginalMember(owner = "client!aph", name = "w", descriptor = "[F")
	float[] aFloatArray79;

	@OriginalMember(owner = "client!aph", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas5;

	@OriginalMember(owner = "client!aph", name = "e", descriptor = "Lclient!afg;")
	final Class104_Sub3 aClass104_Sub3_13;

	@OriginalMember(owner = "client!aph", name = "m", descriptor = "I")
	int anInt3228;

	@OriginalMember(owner = "client!aph", name = "k", descriptor = "I")
	int anInt3229;

	@OriginalMember(owner = "client!aph", name = "h", descriptor = "(Lclient!afg;Ljava/awt/Canvas;II)Lclient!aph;", line = 18)
	static Class112_Sub2_Sub2 method23699(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class112_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aph", name = "ah", descriptor = "(Lclient!afg;Ljava/awt/Canvas;II)Lclient!aph;", line = 18)
	static Class112_Sub2_Sub2 method23700(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class112_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aph", name = "<init>", descriptor = "(Lclient!afg;Ljava/awt/Canvas;II)V", line = 23)
	Class112_Sub2_Sub2(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas5 = arg1;
		this.aClass104_Sub3_13 = arg0;
		this.anInt3228 = arg2 * -2134385681;
		this.anInt3229 = arg3 * 1721452973;
	}

	@OriginalMember(owner = "client!aph", name = "b", descriptor = "(I)V", line = 31)
	void method23701(@OriginalArg(0) int arg0) {
		this.anIntArray276 = new int[this.anInt3228 * -2002865393 * this.anInt3229 * 1581711909];
		this.aFloatArray79 = new float[this.anInt3228 * -2002865393 * 1581711909 * this.anInt3229];
		if (this.aBoolean533) {
			this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		}
	}

	@OriginalMember(owner = "client!aph", name = "al", descriptor = "()V", line = 31)
	void method23702() {
		this.anIntArray276 = new int[this.anInt3228 * -2002865393 * this.anInt3229 * 1581711909];
		this.aFloatArray79 = new float[this.anInt3228 * -2002865393 * 1581711909 * this.anInt3229];
		if (this.aBoolean533) {
			this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		}
	}

	@OriginalMember(owner = "client!aph", name = "ac", descriptor = "()V", line = 31)
	void method23703() {
		this.anIntArray276 = new int[this.anInt3228 * -2002865393 * this.anInt3229 * 1581711909];
		this.aFloatArray79 = new float[this.anInt3228 * -2002865393 * 1581711909 * this.anInt3229];
		if (this.aBoolean533) {
			this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		}
	}

	@OriginalMember(owner = "client!aph", name = "t", descriptor = "(II)V", line = 37)
	@Override
	final void method23759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3228 * -2002865393 != arg0 || arg1 != this.anInt3229 * 1581711909) {
			this.anInt3228 = arg0 * -2134385681;
			this.anInt3229 = arg1 * 1721452973;
			this.method23701(1624832610);
		}
	}

	@OriginalMember(owner = "client!aph", name = "j", descriptor = "(II)V", line = 37)
	@Override
	final void method23757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3228 * -2002865393 != arg0 || arg1 != this.anInt3229 * 1581711909) {
			this.anInt3228 = arg0 * -2134385681;
			this.anInt3229 = arg1 * 1721452973;
			this.method23701(1789759569);
		}
	}

	@OriginalMember(owner = "client!aph", name = "i", descriptor = "(II)V", line = 37)
	@Override
	final void method23758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3228 * -2002865393 != arg0 || arg1 != this.anInt3229 * 1581711909) {
			this.anInt3228 = arg0 * -2134385681;
			this.anInt3229 = arg1 * 1721452973;
			this.method23701(1827465480);
		}
	}

	@OriginalMember(owner = "client!aph", name = "e", descriptor = "()I", line = 45)
	@Override
	public int method23737() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "l", descriptor = "()I", line = 45)
	@Override
	public int method23745() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "u", descriptor = "()I", line = 45)
	@Override
	public int method23744() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "z", descriptor = "()I", line = 45)
	@Override
	public int method23742() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "d", descriptor = "()I", line = 45)
	@Override
	public int method23736() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "w", descriptor = "()I", line = 45)
	@Override
	public int method23753() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "p", descriptor = "()I", line = 45)
	@Override
	public int method23746() {
		return this.anInt3228 * -2002865393;
	}

	@OriginalMember(owner = "client!aph", name = "n", descriptor = "()I", line = 49)
	@Override
	public int method23738() {
		return this.anInt3229 * 1581711909;
	}

	@OriginalMember(owner = "client!aph", name = "c", descriptor = "()I", line = 49)
	@Override
	public int method23747() {
		return this.anInt3229 * 1581711909;
	}

	@OriginalMember(owner = "client!aph", name = "r", descriptor = "()I", line = 49)
	@Override
	public int method23748() {
		return this.anInt3229 * 1581711909;
	}

	@OriginalMember(owner = "client!aph", name = "k", descriptor = "()Z", line = 53)
	@Override
	final boolean method23740() {
		this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		this.aBoolean533 = true;
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "o", descriptor = "()Z", line = 53)
	@Override
	final boolean method23743() {
		this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		this.aBoolean533 = true;
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "v", descriptor = "()Z", line = 53)
	@Override
	final boolean method23749() {
		this.aClass104_Sub3_13.method5719(this.anInt3228 * -2002865393, this.anInt3229 * 1581711909, this.anIntArray276, this.aFloatArray79);
		this.aBoolean533 = true;
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "f", descriptor = "()Z", line = 59)
	@Override
	final boolean method23741() {
		this.aBoolean533 = false;
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "s", descriptor = "()Z", line = 59)
	@Override
	final boolean method23750() {
		this.aBoolean533 = false;
		return true;
	}
}
