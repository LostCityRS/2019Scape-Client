package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public final class NativeHeapBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "Z")
	private boolean u = true;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "f", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap f;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "I")
	private final int e;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "t", descriptor = "I")
	private final int t;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V")
	NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.f = arg0;
		this.e = arg1 * -831301823;
		this.t = arg2 * -888253839;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "s", descriptor = "()Z")
	private synchronized boolean s() {
		return this.f.t() && this.u;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "f", descriptor = "()J")
	@Override
	public long f() {
		return this.f.getBufferAddress(this.e * -1347077951);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "t", descriptor = "()I")
	@Override
	public int t() {
		return this.t * 2126720657;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "([BIII)V")
	@Override
	public synchronized void e(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.s() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.t * 2126720657) {
			throw new RuntimeException();
		}
		this.f.put(this.e * -1347077951, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "()V")
	public synchronized void k() {
		if (this.s()) {
			this.f.deallocateBuffer(this.e * -1347077951);
		}
		this.u = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.k();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "([BIII)V")
	@Override
	public synchronized void u(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.s() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.t * 2126720657) {
			throw new RuntimeException();
		}
		this.f.put(this.e * -1347077951, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "([BIII)V")
	@Override
	public synchronized void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.s() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.t * 2126720657) {
			throw new RuntimeException();
		}
		this.f.put(this.e * -1347077951, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hy", descriptor = "()V")
	protected synchronized void hy() throws Throwable {
		super.finalize();
		this.k();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hj", descriptor = "()V")
	protected synchronized void hj() throws Throwable {
		super.finalize();
		this.k();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "ht", descriptor = "()V")
	protected synchronized void ht() throws Throwable {
		super.finalize();
		this.k();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "g", descriptor = "()I")
	@Override
	public int g() {
		return this.t * 2126720657;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.t * 2126720657;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "m", descriptor = "()I")
	@Override
	public int m() {
		return this.t * 2126720657;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "o", descriptor = "()J")
	@Override
	public long o() {
		return this.f.getBufferAddress(this.e * -1347077951);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "j", descriptor = "()J")
	@Override
	public long j() {
		return this.f.getBufferAddress(this.e * -1347077951);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "a", descriptor = "()J")
	@Override
	public long a() {
		return this.f.getBufferAddress(this.e * -1347077951);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "x", descriptor = "()Z")
	private synchronized boolean x() {
		return this.f.t() && this.u;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "w", descriptor = "()Z")
	private synchronized boolean w() {
		return this.f.t() && this.u;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "r", descriptor = "()V")
	public synchronized void r() {
		if (this.s()) {
			this.f.deallocateBuffer(this.e * -1347077951);
		}
		this.u = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "q", descriptor = "()V")
	public synchronized void q() {
		if (this.s()) {
			this.f.deallocateBuffer(this.e * -1347077951);
		}
		this.u = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "h", descriptor = "()V")
	public synchronized void h() {
		if (this.s()) {
			this.f.deallocateBuffer(this.e * -1347077951);
		}
		this.u = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "()V")
	public synchronized void d() {
		if (this.s()) {
			this.f.deallocateBuffer(this.e * -1347077951);
		}
		this.u = false;
	}
}
