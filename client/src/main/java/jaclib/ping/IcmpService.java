package jaclib.ping;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/ping/IcmpService")
public abstract class IcmpService implements Runnable {

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "<init>", descriptor = "()V", line = 9)
	protected IcmpService() {
	}

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(I)V")
	protected abstract void notify(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(III)V")
	protected abstract void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "run", descriptor = "()V")
	public native void run();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "quit", descriptor = "()V")
	protected native void quit();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "available", descriptor = "()Z")
	public static native boolean available();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "c", descriptor = "()V")
	public native void c();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "r", descriptor = "()V")
	public native void r();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "o", descriptor = "()V")
	public native void o();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "e", descriptor = "(I)V")
	protected abstract void e(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "n", descriptor = "(I)V")
	protected abstract void n(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "m", descriptor = "(III)V")
	protected abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "k", descriptor = "(III)V")
	protected abstract void k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
