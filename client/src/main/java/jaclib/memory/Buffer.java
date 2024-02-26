package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "t", descriptor = "()I")
	int t();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "f", descriptor = "()J")
	long f();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "e", descriptor = "([BIII)V")
	void e(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "u", descriptor = "([BIII)V")
	void u(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "l", descriptor = "([BIII)V")
	void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "g", descriptor = "()I")
	int g();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "i", descriptor = "()I")
	int i();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "m", descriptor = "()I")
	int m();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "o", descriptor = "()J")
	long o();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "j", descriptor = "()J")
	long j();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "a", descriptor = "()J")
	long a();
}
