package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class Class95 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	static final int anInt404 = 34963;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	static final int anInt408 = 34962;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
	static final int[] anIntArray46 = new int[1];

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Z")
	boolean aBoolean78 = false;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_22;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	final int anInt407;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	int anInt406;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
	boolean aBoolean77;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	final int anInt405;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!afm;ILclient!jaclib/memory/Buffer;IZ)V")
	Class95(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_22 = arg0;
		this.anInt407 = arg1;
		this.anInt406 = arg3;
		this.aBoolean77 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray46, 0);
		this.anInt405 = anIntArray46[0];
		this.method2742();
		OpenGL.glBufferDataARBa(arg1, this.anInt406, arg2.f(), this.aBoolean77 ? 35040 : 35044);
		this.aClass102_Sub3_22.anInt775 += this.anInt406;
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!afm;I[BIZ)V")
	Class95(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_22 = arg0;
		this.anInt407 = arg1;
		this.anInt406 = arg3;
		this.aBoolean77 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray46, 0);
		this.anInt405 = anIntArray46[0];
		this.method2742();
		OpenGL.glBufferDataARBub(arg1, this.anInt406, arg2, 0, this.aBoolean77 ? 35040 : 35044);
		this.aClass102_Sub3_22.anInt775 += this.anInt406;
	}

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "()V")
	abstract void method2741();

	@OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		if (!this.aBoolean78) {
			this.aClass102_Sub3_22.method6422(this.anInt405, this.anInt406);
			this.aBoolean78 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "()V")
	abstract void method2742();

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "([BI)V")
	final void method2743(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2742();
		if (arg1 > this.anInt406) {
			OpenGL.glBufferDataARBub(this.anInt407, arg1, arg0, 0, this.aBoolean77 ? 35040 : 35044);
			this.aClass102_Sub3_22.anInt775 += arg1 - this.anInt406;
			this.anInt406 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt407, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "hy", descriptor = "()V")
	final void method2744() throws Throwable {
		if (!this.aBoolean78) {
			this.aClass102_Sub3_22.method6422(this.anInt405, this.anInt406);
			this.aBoolean78 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "hj", descriptor = "()V")
	final void method2745() throws Throwable {
		if (!this.aBoolean78) {
			this.aClass102_Sub3_22.method6422(this.anInt405, this.anInt406);
			this.aBoolean78 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "ht", descriptor = "()V")
	final void method2746() throws Throwable {
		if (!this.aBoolean78) {
			this.aClass102_Sub3_22.method6422(this.anInt405, this.anInt406);
			this.aBoolean78 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	abstract void method2747();

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
	abstract void method2748();

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "()V")
	abstract void method2749();

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "([BI)V")
	final void method2750(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2742();
		if (arg1 > this.anInt406) {
			OpenGL.glBufferDataARBub(this.anInt407, arg1, arg0, 0, this.aBoolean77 ? 35040 : 35044);
			this.aClass102_Sub3_22.anInt775 += arg1 - this.anInt406;
			this.anInt406 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt407, 0, arg1, arg0, 0);
		}
	}
}
