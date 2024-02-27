package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "peer", descriptor = "J")
	long peer;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "e", descriptor = "I")
	private final int anInt4265;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "n", descriptor = "Z")
	private boolean aBoolean732;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V")
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.anInt4265 = arg0 * 176173835;
		this.allocateHeap(this.anInt4265 * -322010973);
		this.aBoolean732 = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "e", descriptor = "()Z")
	synchronized boolean method27846() {
		return this.aBoolean732;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "n", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer method27847(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean732) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "m", descriptor = "()V")
	public synchronized void method27848() {
		if (this.aBoolean732) {
			this.deallocateHeap();
		}
		this.aBoolean732 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
	private native void allocateHeap(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateHeap", descriptor = "()V")
	private native void deallocateHeap();

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateBuffer", descriptor = "(IZ)I")
	synchronized native int allocateBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
	synchronized native long getBufferAddress(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "get", descriptor = "(I[BIII)V")
	synchronized native void get(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "put", descriptor = "(I[BIII)V")
	synchronized native void put(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
	synchronized native void deallocateBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "copy", descriptor = "(JJI)V")
	public synchronized native void copy(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "finalize", descriptor = "()V")
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.method27848();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hl", descriptor = "()V")
	protected synchronized void method27849() throws Throwable {
		super.finalize();
		this.method27848();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "k", descriptor = "()Z")
	synchronized boolean method27850() {
		return this.aBoolean732;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "f", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer method27851(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean732) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "w", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer method27852(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean732) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "l", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer method27853(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean732) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "u", descriptor = "()V")
	public synchronized void method27854() {
		if (this.aBoolean732) {
			this.deallocateHeap();
		}
		this.aBoolean732 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "z", descriptor = "()V")
	public synchronized void method27855() {
		if (this.aBoolean732) {
			this.deallocateHeap();
		}
		this.aBoolean732 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "p", descriptor = "()V")
	public synchronized void method27856() {
		if (this.aBoolean732) {
			this.deallocateHeap();
		}
		this.aBoolean732 = false;
	}
}
