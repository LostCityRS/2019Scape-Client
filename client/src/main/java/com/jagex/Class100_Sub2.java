package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aei")
public class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!aei", name = "m", descriptor = "Lclient!apr;")
	Class88_Sub2_Sub1 aClass88_Sub2_Sub1_2;

	@OriginalMember(owner = "client!aei", name = "k", descriptor = "I")
	int anInt361 = 0;

	@OriginalMember(owner = "client!aei", name = "f", descriptor = "Z")
	boolean aBoolean57 = false;

	@OriginalMember(owner = "client!aei", name = "w", descriptor = "I")
	int anInt360 = 0;

	@OriginalMember(owner = "client!aei", name = "l", descriptor = "I")
	int anInt359 = 0;

	@OriginalMember(owner = "client!aei", name = "u", descriptor = "I")
	int anInt363 = 0;

	@OriginalMember(owner = "client!aei", name = "z", descriptor = "I")
	int anInt362 = 0;

	@OriginalMember(owner = "client!aei", name = "n", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_11;

	@OriginalMember(owner = "client!aei", name = "e", descriptor = "Lclient!apr;")
	final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_3;

	@OriginalMember(owner = "client!aei", name = "<init>", descriptor = "(Lclient!afa;IIZ)V", line = 18)
	Class100_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass104_Sub1_11 = arg0;
		this.aClass88_Sub2_Sub1_3 = Class88_Sub2_Sub1.method18101(arg0, arg3 ? Class206.aClass206_22 : Class206.aClass206_20, Class226.aClass226_22, arg1, arg2);
	}

	@OriginalMember(owner = "client!aei", name = "<init>", descriptor = "(Lclient!afa;IIII)V", line = 23)
	Class100_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub1_11 = arg0;
		this.aClass88_Sub2_Sub1_3 = Class88_Sub2_Sub1.method18108(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aei", name = "<init>", descriptor = "(Lclient!afa;II[III)V", line = 28)
	Class100_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub1_11 = arg0;
		this.aClass88_Sub2_Sub1_3 = Class88_Sub2_Sub1.method18103(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!aei", name = "e", descriptor = "(IIII)V", line = 34)
	@Override
	public void method18189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt359 = arg0;
		this.anInt360 = arg1;
		this.anInt362 = arg2;
		this.anInt363 = arg3;
		this.aBoolean57 = this.anInt359 != 0 || this.anInt360 != 0 || this.anInt362 != 0 || this.anInt363 != 0;
	}

	@OriginalMember(owner = "client!aei", name = "az", descriptor = "(IIII)V", line = 34)
	@Override
	public void method18221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt359 = arg0;
		this.anInt360 = arg1;
		this.anInt362 = arg2;
		this.anInt363 = arg3;
		this.aBoolean57 = this.anInt359 != 0 || this.anInt360 != 0 || this.anInt362 != 0 || this.anInt363 != 0;
	}

	@OriginalMember(owner = "client!aei", name = "aa", descriptor = "(IIII)V", line = 34)
	@Override
	public void method18206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt359 = arg0;
		this.anInt360 = arg1;
		this.anInt362 = arg2;
		this.anInt363 = arg3;
		this.aBoolean57 = this.anInt359 != 0 || this.anInt360 != 0 || this.anInt362 != 0 || this.anInt363 != 0;
	}

	@OriginalMember(owner = "client!aei", name = "n", descriptor = "([I)V", line = 42)
	@Override
	public void method18190(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt359;
		arg0[1] = this.anInt360;
		arg0[2] = this.anInt362;
		arg0[3] = this.anInt363;
	}

	@OriginalMember(owner = "client!aei", name = "af", descriptor = "([I)V", line = 42)
	@Override
	public void method18222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt359;
		arg0[1] = this.anInt360;
		arg0[2] = this.anInt362;
		arg0[3] = this.anInt363;
	}

	@OriginalMember(owner = "client!aei", name = "ak", descriptor = "([I)V", line = 42)
	@Override
	public void method18223(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt359;
		arg0[1] = this.anInt360;
		arg0[2] = this.anInt362;
		arg0[3] = this.anInt363;
	}

	@OriginalMember(owner = "client!aei", name = "m", descriptor = "()I", line = 49)
	@Override
	public int method18205() {
		return this.aClass88_Sub2_Sub1_3.anInt2547;
	}

	@OriginalMember(owner = "client!aei", name = "an", descriptor = "()I", line = 49)
	@Override
	public int method18207() {
		return this.aClass88_Sub2_Sub1_3.anInt2547;
	}

	@OriginalMember(owner = "client!aei", name = "bf", descriptor = "()I", line = 49)
	@Override
	public int method18225() {
		return this.aClass88_Sub2_Sub1_3.anInt2547;
	}

	@OriginalMember(owner = "client!aei", name = "k", descriptor = "()I", line = 53)
	@Override
	public int method18160() {
		return this.aClass88_Sub2_Sub1_3.anInt2547 + this.anInt359 + this.anInt362;
	}

	@OriginalMember(owner = "client!aei", name = "bh", descriptor = "()I", line = 53)
	@Override
	public int method18159() {
		return this.aClass88_Sub2_Sub1_3.anInt2547 + this.anInt359 + this.anInt362;
	}

	@OriginalMember(owner = "client!aei", name = "f", descriptor = "()I", line = 57)
	@Override
	public int method18192() {
		return this.aClass88_Sub2_Sub1_3.anInt2548;
	}

	@OriginalMember(owner = "client!aei", name = "bl", descriptor = "()I", line = 57)
	@Override
	public int method18226() {
		return this.aClass88_Sub2_Sub1_3.anInt2548;
	}

	@OriginalMember(owner = "client!aei", name = "bk", descriptor = "()I", line = 57)
	@Override
	public int method18227() {
		return this.aClass88_Sub2_Sub1_3.anInt2548;
	}

	@OriginalMember(owner = "client!aei", name = "bx", descriptor = "()I", line = 61)
	@Override
	public int method18228() {
		return this.aClass88_Sub2_Sub1_3.anInt2548 + this.anInt360 + this.anInt363;
	}

	@OriginalMember(owner = "client!aei", name = "w", descriptor = "()I", line = 61)
	@Override
	public int method18193() {
		return this.aClass88_Sub2_Sub1_3.anInt2548 + this.anInt360 + this.anInt363;
	}

	@OriginalMember(owner = "client!aei", name = "l", descriptor = "()Lclient!dp;", line = 65)
	@Override
	public Interface18 method18194() {
		return this.aClass88_Sub2_Sub1_3.method18097(0);
	}

	@OriginalMember(owner = "client!aei", name = "ar", descriptor = "()Lclient!dp;", line = 65)
	@Override
	public Interface18 method18234() {
		return this.aClass88_Sub2_Sub1_3.method18097(0);
	}

	@OriginalMember(owner = "client!aei", name = "ap", descriptor = "()Lclient!dp;", line = 65)
	@Override
	public Interface18 method18215() {
		return this.aClass88_Sub2_Sub1_3.method18097(0);
	}

	@OriginalMember(owner = "client!aei", name = "as", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method18211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2314(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aei", name = "p", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method18196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2314(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aei", name = "at", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method18204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2314(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aei", name = "cl", descriptor = "(IIIIIIZ)V", line = 73)
	void method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass104_Sub1_11.aBoolean89 || arg6) {
			this.aClass88_Sub2_Sub1_3.method18092(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass104_Sub1_11.method20552(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18214(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aei", name = "cu", descriptor = "(IIIIIIZ)V", line = 73)
	void method2315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass104_Sub1_11.aBoolean89 || arg6) {
			this.aClass88_Sub2_Sub1_3.method18092(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass104_Sub1_11.method20552(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18214(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aei", name = "ci", descriptor = "(IIIIIIZ)V", line = 73)
	void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass104_Sub1_11.aBoolean89 || arg6) {
			this.aClass88_Sub2_Sub1_3.method18092(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass104_Sub1_11.method20552(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18214(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aei", name = "au", descriptor = "(III)V", line = 84)
	@Override
	public void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass88_Sub2_Sub1_2 = Class88_Sub2_Sub1.method18108(this.aClass104_Sub1_11, arg0, arg1, this.aClass88_Sub2_Sub1_3.anInt2547, this.aClass88_Sub2_Sub1_3.anInt2548);
		this.anInt361 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aei", name = "d", descriptor = "(III)V", line = 84)
	@Override
	public void method18197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass88_Sub2_Sub1_2 = Class88_Sub2_Sub1.method18108(this.aClass104_Sub1_11, arg0, arg1, this.aClass88_Sub2_Sub1_3.anInt2547, this.aClass88_Sub2_Sub1_3.anInt2548);
		this.anInt361 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aei", name = "ad", descriptor = "(III)V", line = 84)
	@Override
	public void method18195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass88_Sub2_Sub1_2 = Class88_Sub2_Sub1.method18108(this.aClass104_Sub1_11, arg0, arg1, this.aClass88_Sub2_Sub1_3.anInt2547, this.aClass88_Sub2_Sub1_3.anInt2548);
		this.anInt361 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aei", name = "am", descriptor = "(III)V", line = 84)
	@Override
	public void method18212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass88_Sub2_Sub1_2 = Class88_Sub2_Sub1.method18108(this.aClass104_Sub1_11, arg0, arg1, this.aClass88_Sub2_Sub1_3.anInt2547, this.aClass88_Sub2_Sub1_3.anInt2548);
		this.anInt361 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aei", name = "u", descriptor = "(IIII[III)V", line = 101)
	@Override
	public void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass88_Sub2_Sub1_3.method18085(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aei", name = "ac", descriptor = "(IIII[III)V", line = 101)
	@Override
	public void method18210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass88_Sub2_Sub1_3.method18085(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aei", name = "ai", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18087(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aei", name = "z", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18087(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aei", name = "aw", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18087(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aei", name = "cg", descriptor = "(I)V", line = 109)
	void method2317(@OriginalArg(0) int arg0) {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3894(this.aClass104_Sub1_11.method3891(arg0), 7681);
		this.aClass104_Sub1_11.method3898(1, 34167, 768);
		this.aClass104_Sub1_11.method3903(0, 34168, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_2);
		this.aClass104_Sub1_11.method3894(34479, 7681);
		this.aClass104_Sub1_11.method3898(1, 34166, 768);
		if (this.anInt361 == 0) {
			this.aClass104_Sub1_11.method3908(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt361 == 1) {
			this.aClass104_Sub1_11.method3908(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt361 == 2) {
			this.aClass104_Sub1_11.method3908(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt361 == 3) {
			this.aClass104_Sub1_11.method3908(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aei", name = "cn", descriptor = "(I)V", line = 109)
	void method2318(@OriginalArg(0) int arg0) {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3894(this.aClass104_Sub1_11.method3891(arg0), 7681);
		this.aClass104_Sub1_11.method3898(1, 34167, 768);
		this.aClass104_Sub1_11.method3903(0, 34168, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_2);
		this.aClass104_Sub1_11.method3894(34479, 7681);
		this.aClass104_Sub1_11.method3898(1, 34166, 768);
		if (this.anInt361 == 0) {
			this.aClass104_Sub1_11.method3908(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt361 == 1) {
			this.aClass104_Sub1_11.method3908(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt361 == 2) {
			this.aClass104_Sub1_11.method3908(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt361 == 3) {
			this.aClass104_Sub1_11.method3908(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aei", name = "cv", descriptor = "(I)V", line = 109)
	void method2319(@OriginalArg(0) int arg0) {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3894(this.aClass104_Sub1_11.method3891(arg0), 7681);
		this.aClass104_Sub1_11.method3898(1, 34167, 768);
		this.aClass104_Sub1_11.method3903(0, 34168, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_2);
		this.aClass104_Sub1_11.method3894(34479, 7681);
		this.aClass104_Sub1_11.method3898(1, 34166, 768);
		if (this.anInt361 == 0) {
			this.aClass104_Sub1_11.method3908(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt361 == 1) {
			this.aClass104_Sub1_11.method3908(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt361 == 2) {
			this.aClass104_Sub1_11.method3908(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt361 == 3) {
			this.aClass104_Sub1_11.method3908(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aei", name = "ce", descriptor = "()V", line = 125)
	void method2320() {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3894(8448, 8448);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
		this.aClass104_Sub1_11.method3903(0, 5890, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aei", name = "cx", descriptor = "()V", line = 125)
	void method2321() {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3894(8448, 8448);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
		this.aClass104_Sub1_11.method3903(0, 5890, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aei", name = "cp", descriptor = "()V", line = 125)
	void method2322() {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3894(8448, 8448);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
		this.aClass104_Sub1_11.method3903(0, 5890, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aei", name = "ca", descriptor = "()V", line = 125)
	void method2323() {
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3894(8448, 8448);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
		this.aClass104_Sub1_11.method3903(0, 5890, 770);
		this.aClass104_Sub1_11.method3882(0);
		this.aClass104_Sub1_11.method3898(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aei", name = "r", descriptor = "(IIIII)V", line = 135)
	@Override
	public void method18198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt359;
		@Pc(35) int local35 = arg1 + this.anInt360;
		if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2317(arg2);
		this.aClass88_Sub2_Sub1_2.method18040(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
		OpenGL.glEnd();
		this.method2320();
	}

	@OriginalMember(owner = "client!aei", name = "ax", descriptor = "(IIIII)V", line = 135)
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt359;
		@Pc(35) int local35 = arg1 + this.anInt360;
		if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2317(arg2);
		this.aClass88_Sub2_Sub1_2.method18040(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
		OpenGL.glEnd();
		this.method2320();
	}

	@OriginalMember(owner = "client!aei", name = "aq", descriptor = "(IIIII)V", line = 135)
	@Override
	public void method18236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt359;
		@Pc(35) int local35 = arg1 + this.anInt360;
		if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
			OpenGL.glEnd();
			return;
		}
		this.method2317(arg2);
		this.aClass88_Sub2_Sub1_2.method18040(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2i(local30 + this.aClass88_Sub2_Sub1_3.anInt2547, local35);
		OpenGL.glEnd();
		this.method2320();
	}

	@OriginalMember(owner = "client!aei", name = "ao", descriptor = "(IILclient!ch;II)V", line = 177)
	@Override
	public void method18235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg2;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3888(1);
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(local5);
		this.aClass104_Sub1_11.method3894(7681, 8448);
		this.aClass104_Sub1_11.method3898(0, 34168, 768);
		this.aClass104_Sub1_11.method3938(1);
		@Pc(49) int local49 = arg0 + this.anInt359;
		@Pc(54) int local54 = arg1 + this.anInt360;
		@Pc(60) int local60 = local49 + this.aClass88_Sub2_Sub1_3.anInt2547;
		@Pc(66) int local66 = local54 + this.aClass88_Sub2_Sub1_3.anInt2548;
		@Pc(73) float local73 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(80) float local80 = local5.aFloat163 / (float) local5.anInt2548;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat163 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat163 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54);
		OpenGL.glEnd();
		this.aClass104_Sub1_11.method3898(0, 5890, 768);
		this.aClass104_Sub1_11.method3888(0);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3882(0);
	}

	@OriginalMember(owner = "client!aei", name = "v", descriptor = "(IILclient!ch;II)V", line = 177)
	@Override
	public void method18199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg2;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3888(1);
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(local5);
		this.aClass104_Sub1_11.method3894(7681, 8448);
		this.aClass104_Sub1_11.method3898(0, 34168, 768);
		this.aClass104_Sub1_11.method3938(1);
		@Pc(49) int local49 = arg0 + this.anInt359;
		@Pc(54) int local54 = arg1 + this.anInt360;
		@Pc(60) int local60 = local49 + this.aClass88_Sub2_Sub1_3.anInt2547;
		@Pc(66) int local66 = local54 + this.aClass88_Sub2_Sub1_3.anInt2548;
		@Pc(73) float local73 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(80) float local80 = local5.aFloat163 / (float) local5.anInt2548;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat163 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat163 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54);
		OpenGL.glEnd();
		this.aClass104_Sub1_11.method3898(0, 5890, 768);
		this.aClass104_Sub1_11.method3888(0);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3882(0);
	}

	@OriginalMember(owner = "client!aei", name = "av", descriptor = "(IILclient!ch;II)V", line = 177)
	@Override
	public void method18217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg2;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3888(1);
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(local5);
		this.aClass104_Sub1_11.method3894(7681, 8448);
		this.aClass104_Sub1_11.method3898(0, 34168, 768);
		this.aClass104_Sub1_11.method3938(1);
		@Pc(49) int local49 = arg0 + this.anInt359;
		@Pc(54) int local54 = arg1 + this.anInt360;
		@Pc(60) int local60 = local49 + this.aClass88_Sub2_Sub1_3.anInt2547;
		@Pc(66) int local66 = local54 + this.aClass88_Sub2_Sub1_3.anInt2548;
		@Pc(73) float local73 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(80) float local80 = local5.aFloat163 / (float) local5.anInt2548;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat163 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat163 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54 + this.aClass88_Sub2_Sub1_3.anInt2548);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass88_Sub2_Sub1_3.anInt2547, local54);
		OpenGL.glEnd();
		this.aClass104_Sub1_11.method3898(0, 5890, 768);
		this.aClass104_Sub1_11.method3888(0);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3882(0);
	}

	@OriginalMember(owner = "client!aei", name = "aj", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18040((arg7 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean57) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18160();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18193();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt359 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt360 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass88_Sub2_Sub1_3.anInt2547 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass88_Sub2_Sub1_3.anInt2548 * local48;
			if (this.aClass88_Sub2_Sub1_2 == null) {
				this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
				this.aClass104_Sub1_11.method3888(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2317(arg4);
				this.aClass88_Sub2_Sub1_2.method18040(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2320();
			}
		} else if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2317(arg4);
			this.aClass88_Sub2_Sub1_2.method18040(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2320();
		}
	}

	@OriginalMember(owner = "client!aei", name = "ay", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18040((arg7 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean57) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18160();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18193();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt359 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt360 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass88_Sub2_Sub1_3.anInt2547 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass88_Sub2_Sub1_3.anInt2548 * local48;
			if (this.aClass88_Sub2_Sub1_2 == null) {
				this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
				this.aClass104_Sub1_11.method3888(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2317(arg4);
				this.aClass88_Sub2_Sub1_2.method18040(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2320();
			}
		} else if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2317(arg4);
			this.aClass88_Sub2_Sub1_2.method18040(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2320();
		}
	}

	@OriginalMember(owner = "client!aei", name = "ab", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18040((arg7 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean57) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18160();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18193();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt359 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt360 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass88_Sub2_Sub1_3.anInt2547 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass88_Sub2_Sub1_3.anInt2548 * local48;
			if (this.aClass88_Sub2_Sub1_2 == null) {
				this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
				this.aClass104_Sub1_11.method3888(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2317(arg4);
				this.aClass88_Sub2_Sub1_2.method18040(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2320();
			}
		} else if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2317(arg4);
			this.aClass88_Sub2_Sub1_2.method18040(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2320();
		}
	}

	@OriginalMember(owner = "client!aei", name = "y", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass88_Sub2_Sub1_3.method18040((arg7 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3938(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean57) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18160();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18193();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt359 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt360 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass88_Sub2_Sub1_3.anInt2547 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass88_Sub2_Sub1_3.anInt2548 * local48;
			if (this.aClass88_Sub2_Sub1_2 == null) {
				this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
				this.aClass104_Sub1_11.method3888(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method2317(arg4);
				this.aClass88_Sub2_Sub1_2.method18040(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method2320();
			}
		} else if (this.aClass88_Sub2_Sub1_2 == null) {
			this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
			this.aClass104_Sub1_11.method3888(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2317(arg4);
			this.aClass88_Sub2_Sub1_2.method18040(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2320();
		}
	}

	@OriginalMember(owner = "client!aei", name = "x", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg6);
		this.aClass104_Sub1_11.method3888(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass88_Sub2_Sub1_3.aBoolean384 && !this.aBoolean57 && arg3 >= this.aClass88_Sub2_Sub1_3.anInt2548 && arg2 >= this.aClass88_Sub2_Sub1_3.anInt2547) {
			@Pc(71) float local71 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) arg3 / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(83) float local83 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) arg2 / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt359, (float) this.anInt360, 0.0F);
		@Pc(123) int local123 = this.method18160();
		@Pc(126) int local126 = this.method18193();
		@Pc(132) int local132 = arg1 + this.aClass88_Sub2_Sub1_3.anInt2548;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local147) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) (this.aClass88_Sub2_Sub1_3.anInt2548 - (local7 - local136)) / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(272) int local272 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local145) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aei", name = "bd", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg6);
		this.aClass104_Sub1_11.method3888(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass88_Sub2_Sub1_3.aBoolean384 && !this.aBoolean57 && arg3 >= this.aClass88_Sub2_Sub1_3.anInt2548 && arg2 >= this.aClass88_Sub2_Sub1_3.anInt2547) {
			@Pc(71) float local71 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) arg3 / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(83) float local83 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) arg2 / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt359, (float) this.anInt360, 0.0F);
		@Pc(123) int local123 = this.method18160();
		@Pc(126) int local126 = this.method18193();
		@Pc(132) int local132 = arg1 + this.aClass88_Sub2_Sub1_3.anInt2548;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local147) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) (this.aClass88_Sub2_Sub1_3.anInt2548 - (local7 - local136)) / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(272) int local272 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local145) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aei", name = "bc", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass88_Sub2_Sub1_3.method18040(false);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg6);
		this.aClass104_Sub1_11.method3888(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass88_Sub2_Sub1_3.aBoolean384 && !this.aBoolean57 && arg3 >= this.aClass88_Sub2_Sub1_3.anInt2548 && arg2 >= this.aClass88_Sub2_Sub1_3.anInt2547) {
			@Pc(71) float local71 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) arg3 / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(83) float local83 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) arg2 / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt359, (float) this.anInt360, 0.0F);
		@Pc(123) int local123 = this.method18160();
		@Pc(126) int local126 = this.method18193();
		@Pc(132) int local132 = arg1 + this.aClass88_Sub2_Sub1_3.anInt2548;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local147) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass88_Sub2_Sub1_3.aFloat163 * (float) (this.aClass88_Sub2_Sub1_3.anInt2548 - (local7 - local136)) / (float) this.aClass88_Sub2_Sub1_3.anInt2548;
			@Pc(272) int local272 = arg0 + this.aClass88_Sub2_Sub1_3.anInt2547;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass88_Sub2_Sub1_3.aFloat164 * (float) (local3 - local145) / (float) this.aClass88_Sub2_Sub1_3.anInt2547;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass88_Sub2_Sub1_3.aFloat163);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aei", name = "ag", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean57) {
			local6 = this.method18160();
			local10 = this.method18193();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt360;
			@Pc(46) float local46 = local34 * (float) this.anInt360;
			@Pc(52) float local52 = local16 * (float) this.anInt359;
			@Pc(58) float local58 = local22 * (float) this.anInt359;
			@Pc(65) float local65 = -local16 * (float) this.anInt362;
			@Pc(72) float local72 = -local22 * (float) this.anInt362;
			@Pc(79) float local79 = -local28 * (float) this.anInt363;
			@Pc(86) float local86 = -local34 * (float) this.anInt363;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg9 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg8);
		this.aClass104_Sub1_11.method3888(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aei", name = "bi", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean57) {
			local6 = this.method18160();
			local10 = this.method18193();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt360;
			@Pc(46) float local46 = local34 * (float) this.anInt360;
			@Pc(52) float local52 = local16 * (float) this.anInt359;
			@Pc(58) float local58 = local22 * (float) this.anInt359;
			@Pc(65) float local65 = -local16 * (float) this.anInt362;
			@Pc(72) float local72 = -local22 * (float) this.anInt362;
			@Pc(79) float local79 = -local28 * (float) this.anInt363;
			@Pc(86) float local86 = -local34 * (float) this.anInt363;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg9 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg8);
		this.aClass104_Sub1_11.method3888(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aei", name = "bt", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean57) {
			local6 = this.method18160();
			local10 = this.method18193();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt360;
			@Pc(46) float local46 = local34 * (float) this.anInt360;
			@Pc(52) float local52 = local16 * (float) this.anInt359;
			@Pc(58) float local58 = local22 * (float) this.anInt359;
			@Pc(65) float local65 = -local16 * (float) this.anInt362;
			@Pc(72) float local72 = -local22 * (float) this.anInt362;
			@Pc(79) float local79 = -local28 * (float) this.anInt363;
			@Pc(86) float local86 = -local34 * (float) this.anInt363;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg9 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg8);
		this.aClass104_Sub1_11.method3888(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aei", name = "bn", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18231(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean57) {
			local6 = this.method18160();
			local10 = this.method18193();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt360;
			@Pc(46) float local46 = local34 * (float) this.anInt360;
			@Pc(52) float local52 = local16 * (float) this.anInt359;
			@Pc(58) float local58 = local22 * (float) this.anInt359;
			@Pc(65) float local65 = -local16 * (float) this.anInt362;
			@Pc(72) float local72 = -local22 * (float) this.anInt362;
			@Pc(79) float local79 = -local28 * (float) this.anInt363;
			@Pc(86) float local86 = -local34 * (float) this.anInt363;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg9 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3938(arg8);
		this.aClass104_Sub1_11.method3888(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aei", name = "al", descriptor = "(FFFFFFILclient!ch;II)V", line = 439)
	@Override
	void method18203(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class88_Sub2_Sub1 local3 = ((Class96_Sub1) arg7).aClass88_Sub2_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean57) {
			local10 = this.method18160();
			local14 = this.method18193();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt360;
			@Pc(50) float local50 = local38 * (float) this.anInt360;
			@Pc(56) float local56 = local20 * (float) this.anInt359;
			@Pc(62) float local62 = local26 * (float) this.anInt359;
			@Pc(69) float local69 = -local20 * (float) this.anInt362;
			@Pc(76) float local76 = -local26 * (float) this.anInt362;
			@Pc(83) float local83 = -local32 * (float) this.anInt363;
			@Pc(90) float local90 = -local38 * (float) this.anInt363;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg6 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3888(1);
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(local3);
		this.aClass104_Sub1_11.method3894(7681, 8448);
		this.aClass104_Sub1_11.method3898(0, 34168, 768);
		this.aClass104_Sub1_11.method3938(1);
		local20 = local3.aFloat164 / (float) local3.anInt2547;
		local26 = local3.aFloat163 / (float) local3.anInt2548;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat163 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat163 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat163 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat163 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass104_Sub1_11.method3898(0, 5890, 768);
		this.aClass104_Sub1_11.method3888(0);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3882(0);
	}

	@OriginalMember(owner = "client!aei", name = "bq", descriptor = "(FFFFFFILclient!ch;II)V", line = 439)
	@Override
	void method18200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class96 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class88_Sub2_Sub1 local3 = ((Class96_Sub1) arg7).aClass88_Sub2_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean57) {
			local10 = this.method18160();
			local14 = this.method18193();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt360;
			@Pc(50) float local50 = local38 * (float) this.anInt360;
			@Pc(56) float local56 = local20 * (float) this.anInt359;
			@Pc(62) float local62 = local26 * (float) this.anInt359;
			@Pc(69) float local69 = -local20 * (float) this.anInt362;
			@Pc(76) float local76 = -local26 * (float) this.anInt362;
			@Pc(83) float local83 = -local32 * (float) this.anInt363;
			@Pc(90) float local90 = -local38 * (float) this.anInt363;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass88_Sub2_Sub1_3.method18040((arg6 & 0x1) != 0);
		this.aClass104_Sub1_11.method3867();
		this.aClass104_Sub1_11.method3887(this.aClass88_Sub2_Sub1_3);
		this.aClass104_Sub1_11.method3888(1);
		this.aClass104_Sub1_11.method3882(1);
		this.aClass104_Sub1_11.method3887(local3);
		this.aClass104_Sub1_11.method3894(7681, 8448);
		this.aClass104_Sub1_11.method3898(0, 34168, 768);
		this.aClass104_Sub1_11.method3938(1);
		local20 = local3.aFloat164 / (float) local3.anInt2547;
		local26 = local3.aFloat163 / (float) local3.anInt2548;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat163 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat163 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat163 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_3.aFloat164, this.aClass88_Sub2_Sub1_3.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat163 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass104_Sub1_11.method3898(0, 5890, 768);
		this.aClass104_Sub1_11.method3888(0);
		this.aClass104_Sub1_11.method3887(null);
		this.aClass104_Sub1_11.method3882(0);
	}
}
