package com.jagex;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public abstract class Class139 implements Interface36 {

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	static final int anInt1388 = 34962;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	static final int anInt1389 = 34963;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "[I")
	static final int[] anIntArray163 = new int[1];

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	int anInt1386;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
	int anInt1387;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
	int anInt1384 = -1;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_9;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	final int anInt1385;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
	final boolean aBoolean260;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!aqv;IZ)V")
	Class139(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass104_Sub2_Sub2_9 = arg0;
		this.anInt1385 = arg1;
		this.aBoolean260 = arg2;
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(II)J")
	@Override
	public long method29524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "()V")
	final void method11630() {
		if (this.anInt1384 >= 0) {
			return;
		}
		if (this.aClass104_Sub2_Sub2_9.aBoolean491) {
			OpenGL.glGenBuffersARB(1, anIntArray163, 0);
			this.anInt1384 = anIntArray163[0];
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		} else {
			this.anInt1384 = 0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "()I")
	@Override
	public int method29519() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(IIJ)Z")
	@Override
	public boolean method29514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.aNativeHeap7.copy(this.aNativeHeapBuffer3.method27896() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	void method29532(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean260 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20927(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(II)J")
	@Override
	public long method29513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "()V")
	void method31066() {
		if (this.anInt1384 > 0) {
			this.aClass104_Sub2_Sub2_9.method21316(this.anInt1384, this.anInt1387);
			this.anInt1384 = -1;
		}
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "()V")
	@Override
	public void method29525() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "()I")
	@Override
	public int method29518() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method31065();
		super.finalize();
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "()J")
	final long method11633() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.method27896() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "hl", descriptor = "()V")
	final void method11634() throws Throwable {
		this.method31065();
		super.finalize();
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "()I")
	@Override
	public int method29517() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(I)V")
	void method29536(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean260 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20927(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()I")
	@Override
	public int method29520() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IIJ)Z")
	@Override
	public boolean method29523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.aNativeHeap7.copy(this.aNativeHeapBuffer3.method27896() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.aNativeHeap7.copy(this.aNativeHeapBuffer3.method27896() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(II)J")
	@Override
	public long method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(II)J")
	@Override
	public long method29516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "ah", descriptor = "()J")
	final long method11636() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.method27896() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(II)J")
	@Override
	public long method29515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "()V")
	@Override
	public void method29526() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "()V")
	@Override
	public void method29527() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "()V")
	@Override
	public void method29528() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "ae", descriptor = "()V")
	final void method11637() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean491) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
	void method29535(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean260 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20927(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "()V")
	@Override
	public void method29529() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "ag", descriptor = "()J")
	final long method11639() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.method27896() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "()V")
	void method31065() {
		if (this.anInt1384 > 0) {
			this.aClass104_Sub2_Sub2_9.method21316(this.anInt1384, this.anInt1387);
			this.anInt1384 = -1;
		}
	}

	@OriginalMember(owner = "client!rv", name = "al", descriptor = "()J")
	final long method11641() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.method27896() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "ac", descriptor = "()V")
	final void method11642() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean491) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "ai", descriptor = "()V")
	final void method11643() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean491) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "aw", descriptor = "()V")
	final void method11644() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean491) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}
}
