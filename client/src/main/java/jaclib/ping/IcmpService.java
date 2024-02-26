package jaclib.ping;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/ping/IcmpService")
public abstract class IcmpService implements Runnable {

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "available", descriptor = "()Z")
	public static native boolean available();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "<init>", descriptor = "()V")
	protected IcmpService() {
	}

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(I)V")
	protected abstract void notify(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(III)V")
	protected abstract void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "run", descriptor = "()V")
	public final native void run();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "quit", descriptor = "()V")
	protected final native void quit();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "q", descriptor = "()V")
	public final native void q();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "h", descriptor = "()V")
	public final native void h();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "t", descriptor = "(I)V")
	protected abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "f", descriptor = "(I)V")
	protected abstract void f(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "e", descriptor = "(III)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
