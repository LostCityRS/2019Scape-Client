package jaclib.nanotime;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/nanotime/QueryPerformanceCounter")
public class QueryPerformanceCounter {

	@OriginalMember(owner = "client!jaclib/nanotime/QueryPerformanceCounter", name = "<init>", descriptor = "()V", line = 8)
	private QueryPerformanceCounter() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jaclib/nanotime/QueryPerformanceCounter", name = "init", descriptor = "()Z")
	public static native boolean init();

	@OriginalMember(owner = "client!jaclib/nanotime/QueryPerformanceCounter", name = "nanoTime", descriptor = "()J")
	public static native long nanoTime();

	@OriginalMember(owner = "client!jaclib/nanotime/QueryPerformanceCounter", name = "quit", descriptor = "()V")
	public static native void quit();
}
