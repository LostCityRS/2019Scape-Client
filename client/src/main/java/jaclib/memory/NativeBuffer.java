package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "n", descriptor = "J")
	private long aLong263;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "e", descriptor = "I")
	private int anInt4513 = 402979407;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "<init>", descriptor = "()V")
	protected NativeBuffer() {
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "e", descriptor = "()I")
	@Override
	public final int method27895() {
		return this.anInt4513 * -1685314735;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "n", descriptor = "()J")
	@Override
	public final long method27896() {
		return this.aLong263 * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "m", descriptor = "([BIII)V")
	@Override
	public void method27897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aLong263 * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.anInt4513 * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.aLong263 * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "k", descriptor = "([BIII)V")
	@Override
	public void method27898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aLong263 * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.anInt4513 * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.aLong263 * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "f", descriptor = "([BIII)V")
	@Override
	public void method27899(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aLong263 * -4468181687621428335L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg2 + arg3 > this.anInt4513 * -1685314735) {
			throw new RuntimeException();
		}
		this.put(this.aLong263 * -4468181687621428335L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "w", descriptor = "()I")
	@Override
	public final int method27900() {
		return this.anInt4513 * -1685314735;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "l", descriptor = "()J")
	@Override
	public final long method27901() {
		return this.aLong263 * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "u", descriptor = "()J")
	@Override
	public final long method27902() {
		return this.aLong263 * -4468181687621428335L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "z", descriptor = "()J")
	@Override
	public final long method27903() {
		return this.aLong263 * -4468181687621428335L;
	}
}
