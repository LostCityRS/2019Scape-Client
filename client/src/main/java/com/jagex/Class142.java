package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class Class142 implements Interface37 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	static final int anInt1302 = 34963;

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
	static final int anInt1307 = 34962;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[I")
	static final int[] anIntArray118 = new int[1];

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	int anInt1305;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	int anInt1306;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	int anInt1304 = -1;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!aqi;")
	final Class102_Sub1_Sub1 aClass102_Sub1_Sub1_7;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
	final int anInt1303;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "Z")
	final boolean aBoolean238;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!aqi;IZ)V")
	Class142(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass102_Sub1_Sub1_7 = arg0;
		this.anInt1303 = arg1;
		this.aBoolean238 = arg2;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
	void method29405(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "ax", descriptor = "()V")
	final void method11260() {
		if (this.anInt1304 >= 0) {
			return;
		}
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glGenBuffersARB(1, anIntArray118, 0);
			this.anInt1304 = anIntArray118[0];
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		} else {
			this.anInt1304 = 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "()V")
	void method30835() {
		if (this.anInt1304 > 0) {
			this.aClass102_Sub1_Sub1_7.method20098(this.anInt1304, this.anInt1305);
			this.anInt1304 = -1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)J")
	@Override
	public long method29384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		return OpenGL.glMapBufferARB(this.anInt1303, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "ht", descriptor = "()V")
	final void method11262() throws Throwable {
		this.method30837();
		super.finalize();
	}

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "(I)V")
	void method29401(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "ag", descriptor = "()V")
	final void method11264() {
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		}
	}

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "()V")
	@Override
	public void method29385() {
		OpenGL.glUnmapBufferARB(this.anInt1303);
	}

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "(IIJ)Z")
	@Override
	public boolean method29383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11260();
		if (this.anInt1304 > 0) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
			OpenGL.glBufferSubDataARBa(this.anInt1303, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.f.copy(this.aNativeHeapBuffer3.f() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "()V")
	void method30837() {
		if (this.anInt1304 > 0) {
			this.aClass102_Sub1_Sub1_7.method20098(this.anInt1304, this.anInt1305);
			this.anInt1304 = -1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "finalize", descriptor = "()V")
	@Override
	final void finalize() throws Throwable {
		this.method30837();
		super.finalize();
	}

	@OriginalMember(owner = "client!rt", name = "ab", descriptor = "()V")
	final void method11266() {
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		}
	}

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "()V")
	void method30836() {
		if (this.anInt1304 > 0) {
			this.aClass102_Sub1_Sub1_7.method20098(this.anInt1304, this.anInt1305);
			this.anInt1304 = -1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "()V")
	void method30834() {
		if (this.anInt1304 > 0) {
			this.aClass102_Sub1_Sub1_7.method20098(this.anInt1304, this.anInt1305);
			this.anInt1304 = -1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "hy", descriptor = "()V")
	final void method11269() throws Throwable {
		this.method30837();
		super.finalize();
	}

	@OriginalMember(owner = "client!rt", name = "hj", descriptor = "()V")
	final void method11270() throws Throwable {
		this.method30837();
		super.finalize();
	}

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "(I)V")
	void method29399(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "()I")
	@Override
	public int method29382() {
		return this.anInt1305;
	}

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "(IIJ)Z")
	@Override
	public boolean method29388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11260();
		if (this.anInt1304 > 0) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
			OpenGL.glBufferSubDataARBa(this.anInt1303, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.f.copy(this.aNativeHeapBuffer3.f() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "(II)J")
	@Override
	public long method29387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		return OpenGL.glMapBufferARB(this.anInt1303, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "()I")
	@Override
	public int method29391() {
		return this.anInt1305;
	}

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "()V")
	@Override
	public void method29389() {
		OpenGL.glUnmapBufferARB(this.anInt1303);
	}

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "()I")
	@Override
	public int method29386() {
		return this.anInt1305;
	}

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "(I)V")
	void method29403(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "ai", descriptor = "()V")
	final void method11273() {
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		}
	}

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "(I)V")
	void method29398(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "()V")
	@Override
	public void method29390() {
		OpenGL.glUnmapBufferARB(this.anInt1303);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	void method29406(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1306) {
			this.method11260();
			if (this.anInt1304 > 0) {
				OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
				OpenGL.glBufferDataARBub(this.anInt1303, arg0, null, 0, this.aBoolean238 ? 35040 : 35044);
				this.aClass102_Sub1_Sub1_7.anInt2959 += arg0 - this.anInt1306;
			} else {
				this.aNativeHeapBuffer3 = this.aClass102_Sub1_Sub1_7.method21166(arg0, false);
			}
			this.anInt1306 = arg0;
		}
		this.anInt1305 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "()V")
	@Override
	public void method29392() {
		OpenGL.glUnmapBufferARB(this.anInt1303);
	}

	@OriginalMember(owner = "client!rt", name = "aq", descriptor = "()V")
	final void method11276() {
		if (this.anInt1304 >= 0) {
			return;
		}
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glGenBuffersARB(1, anIntArray118, 0);
			this.anInt1304 = anIntArray118[0];
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		} else {
			this.anInt1304 = 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "ao", descriptor = "()V")
	final void method11277() {
		if (this.anInt1304 >= 0) {
			return;
		}
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glGenBuffersARB(1, anIntArray118, 0);
			this.anInt1304 = anIntArray118[0];
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		} else {
			this.anInt1304 = 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "aj", descriptor = "()J")
	final long method11278() {
		return this.anInt1304 == 0 ? this.aNativeHeapBuffer3.f() : 0L;
	}

	@OriginalMember(owner = "client!rt", name = "ac", descriptor = "()V")
	final void method11279() {
		if (this.aClass102_Sub1_Sub1_7.aBoolean492) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
		}
	}

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11260();
		if (this.anInt1304 > 0) {
			OpenGL.glBindBufferARB(this.anInt1303, this.anInt1304);
			OpenGL.glBufferSubDataARBa(this.anInt1303, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.f.copy(this.aNativeHeapBuffer3.f() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rt", name = "ay", descriptor = "()J")
	final long method11280() {
		return this.anInt1304 == 0 ? this.aNativeHeapBuffer3.f() : 0L;
	}
}
