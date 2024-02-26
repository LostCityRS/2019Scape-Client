package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "peer", descriptor = "J")
	long peer;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "t", descriptor = "I")
	private final int t;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "f", descriptor = "Z")
	private boolean f;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V")
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.t = arg0 * -425008377;
		this.allocateHeap(this.t * 967776951);
		this.f = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "t", descriptor = "()Z")
	synchronized boolean t() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "f", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer f(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.f) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "e", descriptor = "()V")
	public synchronized void e() {
		if (this.f) {
			this.deallocateHeap();
		}
		this.f = false;
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
		this.e();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hy", descriptor = "()V")
	protected synchronized void hy() throws Throwable {
		super.finalize();
		this.e();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "hj", descriptor = "()V")
	protected synchronized void hj() throws Throwable {
		super.finalize();
		this.e();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "ht", descriptor = "()V")
	protected synchronized void ht() throws Throwable {
		super.finalize();
		this.e();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "u", descriptor = "()Z")
	synchronized boolean u() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "l", descriptor = "()Z")
	synchronized boolean l() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "g", descriptor = "()Z")
	synchronized boolean g() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "i", descriptor = "()Z")
	synchronized boolean i() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "m", descriptor = "()Z")
	synchronized boolean m() {
		return this.f;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "o", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer o(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.f) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "j", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer j(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.f) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "()V")
	public synchronized void a() {
		if (this.f) {
			this.deallocateHeap();
		}
		this.f = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "s", descriptor = "()V")
	public synchronized void s() {
		if (this.f) {
			this.deallocateHeap();
		}
		this.f = false;
	}
}
