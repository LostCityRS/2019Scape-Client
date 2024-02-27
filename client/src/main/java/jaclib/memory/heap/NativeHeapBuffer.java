package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public final class NativeHeapBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "Z")
	private boolean aBoolean733 = true;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap7;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "m", descriptor = "I")
	private final int anInt4267;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "I")
	private final int anInt4266;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "<init>", descriptor = "(Lclient!jaclib/memory/heap/NativeHeap;II)V")
	NativeHeapBuffer(@OriginalArg(0) NativeHeap arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aNativeHeap7 = arg0;
		this.anInt4267 = arg1 * -1355673869;
		this.anInt4266 = arg2 * -3660897;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "p", descriptor = "()Z")
	private synchronized boolean method27866() {
		return this.aNativeHeap7.method27846() && this.aBoolean733;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "n", descriptor = "()J")
	@Override
	public long method27896() {
		return this.aNativeHeap7.getBufferAddress(this.anInt4267 * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "e", descriptor = "()I")
	@Override
	public int method27895() {
		return this.anInt4266 * 219166815;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "m", descriptor = "([BIII)V")
	@Override
	public synchronized void method27897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method27866() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.anInt4266 * 219166815) {
			throw new RuntimeException();
		}
		this.aNativeHeap7.put(this.anInt4267 * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "d", descriptor = "()V")
	public synchronized void method27867() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "finalize", descriptor = "()V")
	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		this.method27867();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "k", descriptor = "([BIII)V")
	@Override
	public synchronized void method27898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method27866() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.anInt4266 * 219166815) {
			throw new RuntimeException();
		}
		this.aNativeHeap7.put(this.anInt4267 * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "f", descriptor = "([BIII)V")
	@Override
	public synchronized void method27899(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method27866() | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.anInt4266 * 219166815) {
			throw new RuntimeException();
		}
		this.aNativeHeap7.put(this.anInt4267 * -947996101, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "hl", descriptor = "()V")
	protected synchronized void method27868() throws Throwable {
		super.finalize();
		this.method27867();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "w", descriptor = "()I")
	@Override
	public int method27900() {
		return this.anInt4266 * 219166815;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "l", descriptor = "()J")
	@Override
	public long method27901() {
		return this.aNativeHeap7.getBufferAddress(this.anInt4267 * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "u", descriptor = "()J")
	@Override
	public long method27902() {
		return this.aNativeHeap7.getBufferAddress(this.anInt4267 * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "z", descriptor = "()J")
	@Override
	public long method27903() {
		return this.aNativeHeap7.getBufferAddress(this.anInt4267 * -947996101);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "c", descriptor = "()Z")
	private synchronized boolean method27869() {
		return this.aNativeHeap7.method27846() && this.aBoolean733;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "r", descriptor = "()Z")
	private synchronized boolean method27870() {
		return this.aNativeHeap7.method27846() && this.aBoolean733;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "v", descriptor = "()Z")
	private synchronized boolean method27871() {
		return this.aNativeHeap7.method27846() && this.aBoolean733;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "o", descriptor = "()V")
	public synchronized void method27872() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "s", descriptor = "()V")
	public synchronized void method27873() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "y", descriptor = "()V")
	public synchronized void method27874() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "q", descriptor = "()V")
	public synchronized void method27875() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeapBuffer", name = "x", descriptor = "()V")
	public synchronized void method27876() {
		if (this.method27866()) {
			this.aNativeHeap7.deallocateBuffer(this.anInt4267 * -947996101);
		}
		this.aBoolean733 = false;
	}
}
