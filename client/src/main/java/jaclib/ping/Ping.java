package jaclib.ping;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/ping/Ping")
public final class Ping {

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "init", descriptor = "()Z")
	public static native boolean init();

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "e", descriptor = "(BBBBJ)I")
	public static int method27877(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "ping0", descriptor = "(BBBBJ)I")
	private static native int ping0(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "quit", descriptor = "()V")
	public static native void quit();

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "n", descriptor = "(BBBBJ)I")
	public static int method27878(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "m", descriptor = "(BBBBJ)I")
	public static int method27879(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "k", descriptor = "(BBBBJ)I")
	public static int method27880(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}

	@OriginalMember(owner = "client!jaclib/ping/Ping", name = "<init>", descriptor = "()V")
	private Ping() throws Throwable {
		throw new Error();
	}
}
