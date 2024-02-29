package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "n", descriptor = "J")
	private long n;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "e", descriptor = "I")
	private int e = 402979407;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "<init>", descriptor = "()V", line = 11)
	protected NativeBuffer() {
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "e", descriptor = "()I", line = 14)
	@Override
	public final int e() {
		return this.e * -1685314735;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "w", descriptor = "()I", line = 14)
	@Override
	public final int w() {
		return this.e * -1685314735;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "n", descriptor = "()J", line = 18)
	@Override
	public final long n() {
		return this.n * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "l", descriptor = "()J", line = 18)
	@Override
	public final long l() {
		return this.n * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "u", descriptor = "()J", line = 18)
	@Override
	public final long u() {
		return this.n * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "z", descriptor = "()J", line = 18)
	@Override
	public final long z() {
		return this.n * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "m", descriptor = "([BIII)V", line = 22)
	@Override
	public void m(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.n * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.e * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.n * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "k", descriptor = "([BIII)V", line = 22)
	@Override
	public void k(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.n * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.e * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.n * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "f", descriptor = "([BIII)V", line = 22)
	@Override
	public void f(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.n * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.e * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.n * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private final native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private final native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
