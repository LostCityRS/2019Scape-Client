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
	final boolean aBoolean259;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!aqv;IZ)V", line = 21)
	Class139(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass104_Sub2_Sub2_9 = arg0;
		this.anInt1385 = arg1;
		this.aBoolean259 = arg2;
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "()V", line = 28)
	void method11630() {
		if (this.anInt1384 >= 0) {
			return;
		}
		if (this.aClass104_Sub2_Sub2_9.aBoolean490) {
			OpenGL.glGenBuffersARB(1, anIntArray163, 0);
			this.anInt1384 = anIntArray163[0];
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		} else {
			this.anInt1384 = 0;
		}
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "()I", line = 38)
	@Override
	public int method29338() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "()I", line = 38)
	@Override
	public int method29337() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "()I", line = 38)
	@Override
	public int method29336() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "()I", line = 38)
	@Override
	public int method29339() {
		return this.anInt1387;
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "()J", line = 42)
	long method11631() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.n() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "ah", descriptor = "()J", line = 42)
	long method11632() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.n() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "ag", descriptor = "()J", line = 42)
	long method11633() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.n() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "al", descriptor = "()J", line = 42)
	long method11634() {
		return this.anInt1384 == 0 ? this.aNativeHeapBuffer3.n() : 0L;
	}

	@OriginalMember(owner = "client!rv", name = "ae", descriptor = "()V", line = 46)
	void method11635() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean490) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "ac", descriptor = "()V", line = 46)
	void method11636() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean490) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "ai", descriptor = "()V", line = 46)
	void method11637() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean490) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "aw", descriptor = "()V", line = 46)
	void method11638() {
		if (this.aClass104_Sub2_Sub2_9.aBoolean490) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 50)
	void method29351(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean259 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20954(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(I)V", line = 50)
	void method29355(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean259 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20954(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V", line = 50)
	void method29354(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt1386) {
			this.method11630();
			if (this.anInt1384 > 0) {
				OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
				OpenGL.glBufferDataARBub(this.anInt1385, arg0, null, 0, this.aBoolean259 ? 35040 : 35044);
				this.aClass104_Sub2_Sub2_9.anInt2917 += arg0 - this.anInt1386;
			} else {
				this.aNativeHeapBuffer3 = this.aClass104_Sub2_Sub2_9.method20954(arg0, false);
			}
			this.anInt1386 = arg0;
		}
		this.anInt1387 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(II)J", line = 64)
	@Override
	public long method29343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(II)J", line = 64)
	@Override
	public long method29332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(II)J", line = 64)
	@Override
	public long method29341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(II)J", line = 64)
	@Override
	public long method29335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(II)J", line = 64)
	@Override
	public long method29334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
		return OpenGL.glMapBufferARB(this.anInt1385, 35001) + (long) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "()V", line = 69)
	@Override
	public void method29344() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "()V", line = 69)
	@Override
	public void method29345() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "()V", line = 69)
	@Override
	public void method29346() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "()V", line = 69)
	@Override
	public void method29347() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "()V", line = 69)
	@Override
	public void method29348() {
		OpenGL.glUnmapBufferARB(this.anInt1385);
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method29333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.n.copy(this.aNativeHeapBuffer3.n() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method29342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.n.copy(this.aNativeHeapBuffer3.n() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(IIJ)Z", line = 73)
	@Override
	public boolean method29340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		this.method11630();
		if (this.anInt1384 > 0) {
			OpenGL.glBindBufferARB(this.anInt1385, this.anInt1384);
			OpenGL.glBufferSubDataARBa(this.anInt1385, arg0, arg1, arg2);
		} else {
			this.aNativeHeapBuffer3.n.copy(this.aNativeHeapBuffer3.n() + (long) arg0, arg2, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "()V", line = 85)
	void method30885() {
		if (this.anInt1384 > 0) {
			this.aClass104_Sub2_Sub2_9.method21313(this.anInt1384, this.anInt1387);
			this.anInt1384 = -1;
		}
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "()V", line = 85)
	void method30884() {
		if (this.anInt1384 > 0) {
			this.aClass104_Sub2_Sub2_9.method21313(this.anInt1384, this.anInt1387);
			this.anInt1384 = -1;
		}
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 92)
	@Override
	void finalize() throws Throwable {
		this.method30884();
		super.finalize();
	}

	@OriginalMember(owner = "client!rv", name = "hl", descriptor = "()V", line = 92)
	void method11644() throws Throwable {
		this.method30884();
		super.finalize();
	}
}
