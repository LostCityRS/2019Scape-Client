package jaclib.memory.heap;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.e")
	public final int field411;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n")
	public final NativeHeap field412;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.m")
	public final int field413;

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.k")
	public boolean field414 = true;

	public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
		this.field412 = arg0;
		this.field413 = arg1;
		this.field411 = arg2;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.p()Z")
	public final synchronized boolean method80() {
		return this.field412.method91() && this.field414;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n()J")
	public final long method49() {
		return this.field412.getBufferAddress(this.field413);
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.e()I")
	public final int method48() {
		return this.field411;
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.m([BIII)V")
	public final synchronized void method8(byte[] arg0, int arg1, int arg2, int arg3) {
		if (!this.method80() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field411) {
			throw new RuntimeException();
		}
		this.field412.put(this.field413, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.d()V")
	public final synchronized void method81() {
		if (this.method80()) {
			this.field412.deallocateBuffer(this.field413);
		}
		this.field414 = false;
	}

	public final synchronized void finalize() throws Throwable {
		super.finalize();
		this.method81();
	}
}
