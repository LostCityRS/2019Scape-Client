package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "m", descriptor = "I")
	private int anInt4353;

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "m", descriptor = "([BIII)V", line = 13)
	@Override
	public void m(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4353 * -463667787 == 0) {
			throw new RuntimeException();
		}
		super.m(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "k", descriptor = "([BIII)V", line = 13)
	@Override
	public void k(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4353 * -463667787 == 0) {
			throw new RuntimeException();
		}
		super.m(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "f", descriptor = "([BIII)V", line = 13)
	@Override
	public void f(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4353 * -463667787 == 0) {
			throw new RuntimeException();
		}
		super.m(arg0, arg1, arg2, arg3);
	}
}
