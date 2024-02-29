package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "e", descriptor = "()I")
	int e();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "n", descriptor = "()J")
	long n();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "m", descriptor = "([BIII)V")
	void m(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "k", descriptor = "([BIII)V")
	void k(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "f", descriptor = "([BIII)V")
	void f(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "w", descriptor = "()I")
	int w();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "l", descriptor = "()J")
	long l();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "u", descriptor = "()J")
	long u();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "z", descriptor = "()J")
	long z();
}
