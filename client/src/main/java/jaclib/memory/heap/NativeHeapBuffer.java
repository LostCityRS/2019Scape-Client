package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public final class NativeHeapBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "Z")
	private boolean k = true;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap n;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "m", descriptor = "I")
	private final int m;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "I")
	private final int e;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V", line = 15)
	NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.n = arg0;
		this.m = arg1 * -1355673869;
		this.e = arg2 * -3660897;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "()Z", line = 22)
	private final synchronized boolean p() {
		return this.n.e() && this.k;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "()Z", line = 22)
	private final synchronized boolean c() {
		return this.n.e() && this.k;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "r", descriptor = "()Z", line = 22)
	private final synchronized boolean r() {
		return this.n.e() && this.k;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "v", descriptor = "()Z", line = 22)
	private final synchronized boolean v() {
		return this.n.e() && this.k;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "n", descriptor = "()J", line = 26)
	@Override
	public final long n() {
		return this.n.getBufferAddress(this.m * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "()J", line = 26)
	@Override
	public final long l() {
		return this.n.getBufferAddress(this.m * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "()J", line = 26)
	@Override
	public final long u() {
		return this.n.getBufferAddress(this.m * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "z", descriptor = "()J", line = 26)
	@Override
	public final long z() {
		return this.n.getBufferAddress(this.m * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "()I", line = 30)
	@Override
	public final int e() {
		return this.e * 219166815;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "w", descriptor = "()I", line = 30)
	@Override
	public final int w() {
		return this.e * 219166815;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "m", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void m(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.p() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.e * 219166815) {
			throw new RuntimeException();
		}
		this.n.put(this.m * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void k(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.p() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.e * 219166815) {
			throw new RuntimeException();
		}
		this.n.put(this.m * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "f", descriptor = "([BIII)V", line = 34)
	@Override
	public final synchronized void f(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.p() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.e * 219166815) {
			throw new RuntimeException();
		}
		this.n.put(this.m * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "()V", line = 39)
	public final synchronized void d() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "o", descriptor = "()V", line = 39)
	public final synchronized void o() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "s", descriptor = "()V", line = 39)
	public final synchronized void s() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "y", descriptor = "()V", line = 39)
	public final synchronized void y() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "q", descriptor = "()V", line = 39)
	public final synchronized void q() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "x", descriptor = "()V", line = 39)
	public final synchronized void x() {
		if (this.p()) {
			this.n.deallocateBuffer(this.m * -947996101);
		}
		this.k = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V", line = 44)
	@Override
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		this.d();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hl", descriptor = "()V", line = 44)
	protected final synchronized void hl() throws Throwable {
		super.finalize();
		this.d();
	}
}
