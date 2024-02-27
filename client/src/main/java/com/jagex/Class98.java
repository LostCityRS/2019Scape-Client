package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class98 {

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	static final int anInt441 = 34963;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	static final int anInt443 = 34962;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "[I")
	static final int[] anIntArray36 = new int[1];

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "Z")
	boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_23;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	final int anInt442;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
	int anInt440;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "Z")
	boolean aBoolean68;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	final int anInt444;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!afa;ILclient!jaclib/memory/Buffer;IZ)V")
	Class98(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_23 = arg0;
		this.anInt442 = arg1;
		this.anInt440 = arg3;
		this.aBoolean68 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray36, 0);
		this.anInt444 = anIntArray36[0];
		this.method2752();
		OpenGL.glBufferDataARBa(arg1, this.anInt440, arg2.method27896(), this.aBoolean68 ? 35040 : 35044);
		this.aClass104_Sub1_23.anInt534 += this.anInt440;
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!afa;I[BIZ)V")
	Class98(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_23 = arg0;
		this.anInt442 = arg1;
		this.anInt440 = arg3;
		this.aBoolean68 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray36, 0);
		this.anInt444 = anIntArray36[0];
		this.method2752();
		OpenGL.glBufferDataARBub(arg1, this.anInt440, arg2, 0, this.aBoolean68 ? 35040 : 35044);
		this.aClass104_Sub1_23.anInt534 += this.anInt440;
	}

	@OriginalMember(owner = "client!bs", name = "hl", descriptor = "()V")
	final void method2748() throws Throwable {
		if (!this.aBoolean69) {
			this.aClass104_Sub1_23.method3897(this.anInt444, this.anInt440);
			this.aBoolean69 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "()V")
	abstract void method2749();

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "([BI)V")
	final void method2750(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2752();
		if (arg1 > this.anInt440) {
			OpenGL.glBufferDataARBub(this.anInt442, arg1, arg0, 0, this.aBoolean68 ? 35040 : 35044);
			this.aClass104_Sub1_23.anInt534 += arg1 - this.anInt440;
			this.anInt440 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt442, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bs", name = "finalize", descriptor = "()V")
	@Override
	final void finalize() throws Throwable {
		if (!this.aBoolean69) {
			this.aClass104_Sub1_23.method3897(this.anInt444, this.anInt440);
			this.aBoolean69 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "()V")
	abstract void method2751();

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "()V")
	abstract void method2752();
}
