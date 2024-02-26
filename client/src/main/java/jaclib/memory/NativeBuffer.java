package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "f", descriptor = "J")
	private long f;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "t", descriptor = "I")
	private int t = 1306526557;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "<init>", descriptor = "()V")
	protected NativeBuffer() {
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "t", descriptor = "()I")
	@Override
	public final int t() {
		return this.t * 1219794699;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "f", descriptor = "()J")
	@Override
	public final long f() {
		return this.f * 3555664083025024465L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "e", descriptor = "([BIII)V")
	@Override
	public void e(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.f * 3555664083025024465L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.t * 1219794699) {
			throw new RuntimeException();
		}
		this.put(this.f * 3555664083025024465L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "u", descriptor = "([BIII)V")
	@Override
	public void u(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.f * 3555664083025024465L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.t * 1219794699) {
			throw new RuntimeException();
		}
		this.put(this.f * 3555664083025024465L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "l", descriptor = "([BIII)V")
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.f * 3555664083025024465L == 0L | arg0 == null | arg1 < 0 | arg3 + arg1 > arg0.length | arg2 < 0 | arg3 + arg2 > this.t * 1219794699) {
			throw new RuntimeException();
		}
		this.put(this.f * 3555664083025024465L, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "g", descriptor = "()I")
	@Override
	public final int g() {
		return this.t * 1219794699;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.t * 1219794699;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "m", descriptor = "()I")
	@Override
	public final int m() {
		return this.t * 1219794699;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "o", descriptor = "()J")
	@Override
	public final long o() {
		return this.f * 3555664083025024465L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "j", descriptor = "()J")
	@Override
	public final long j() {
		return this.f * 3555664083025024465L;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "()J")
	@Override
	public final long a() {
		return this.f * 3555664083025024465L;
	}
}
