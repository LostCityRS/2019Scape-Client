package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public final class MapBuffer extends NativeBuffer {

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "e", descriptor = "I")
	private int anInt4270;

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "e", descriptor = "([BIII)V")
	@Override
	public void e(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4270 * -151171723 == 0) {
			throw new RuntimeException();
		}
		super.e(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "u", descriptor = "([BIII)V")
	@Override
	public void u(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4270 * -151171723 == 0) {
			throw new RuntimeException();
		}
		super.e(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "l", descriptor = "([BIII)V")
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4270 * -151171723 == 0) {
			throw new RuntimeException();
		}
		super.e(arg0, arg1, arg2, arg3);
	}
}
