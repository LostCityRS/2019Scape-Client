package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/DirectBufferHelper")
public class DirectBufferHelper {

	@OriginalMember(owner = "client!jaclib/memory/DirectBufferHelper", name = "<init>", descriptor = "()V", line = 7)
	private DirectBufferHelper() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jaclib/memory/DirectBufferHelper", name = "getDirectBufferAddress", descriptor = "(Ljava/lang/Object;)J")
	public static native long getDirectBufferAddress(@OriginalArg(0) Object arg0);
}
