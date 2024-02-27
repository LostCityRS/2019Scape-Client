package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "e", descriptor = "()I")
	int method27895();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "n", descriptor = "()J")
	long method27896();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "m", descriptor = "([BIII)V")
	void method27897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "k", descriptor = "([BIII)V")
	void method27898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "f", descriptor = "([BIII)V")
	void method27899(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "w", descriptor = "()I")
	int method27900();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "l", descriptor = "()J")
	long method27901();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "u", descriptor = "()J")
	long method27902();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "z", descriptor = "()J")
	long method27903();
}
