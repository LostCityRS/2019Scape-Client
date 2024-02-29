package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "peer", descriptor = "J")
	long peer;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "e", descriptor = "I")
	private final int e;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "n", descriptor = "Z")
	private boolean n;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V", line = 14)
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.e = arg0 * 176173835;
		this.allocateHeap(this.e * -322010973);
		this.n = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "e", descriptor = "()Z", line = 21)
	synchronized boolean e() {
		return this.n;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "k", descriptor = "()Z", line = 21)
	synchronized boolean k() {
		return this.n;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "n", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer n(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.n) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "f", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer f(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.n) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "w", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer w(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.n) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "l", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 25)
	public NativeHeapBuffer l(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.n) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "m", descriptor = "()V", line = 30)
	public synchronized void m() {
		if (this.n) {
			this.deallocateHeap();
		}
		this.n = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "u", descriptor = "()V", line = 30)
	public synchronized void u() {
		if (this.n) {
			this.deallocateHeap();
		}
		this.n = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "z", descriptor = "()V", line = 30)
	public synchronized void z() {
		if (this.n) {
			this.deallocateHeap();
		}
		this.n = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "p", descriptor = "()V", line = 30)
	public synchronized void p() {
		if (this.n) {
			this.deallocateHeap();
		}
		this.n = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "finalize", descriptor = "()V", line = 59)
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.m();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hl", descriptor = "()V", line = 59)
	protected synchronized void hl() throws Throwable {
		super.finalize();
		this.m();
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
}
