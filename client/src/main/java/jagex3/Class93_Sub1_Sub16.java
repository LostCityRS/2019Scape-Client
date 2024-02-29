package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ask")
public abstract class Class93_Sub1_Sub16 extends Class93_Sub1 {

	@OriginalMember(owner = "client!ask", name = "l", descriptor = "Z")
	boolean aBoolean545;

	@OriginalMember(owner = "client!ask", name = "u", descriptor = "Z")
	boolean aBoolean546;

	@OriginalMember(owner = "client!ask", name = "z", descriptor = "Z")
	volatile boolean aBoolean547 = true;

	@OriginalMember(owner = "client!ask", name = "<init>", descriptor = "()V")
	Class93_Sub1_Sub16() {
	}

	@OriginalMember(owner = "client!ask", name = "f", descriptor = "()I")
	abstract int method23991();

	@OriginalMember(owner = "client!ask", name = "m", descriptor = "()[B")
	abstract byte[] method23992();

	@OriginalMember(owner = "client!ask", name = "e", descriptor = "(I)[B")
	abstract byte[] method23993(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ask", name = "k", descriptor = "()[B")
	abstract byte[] method23994();

	@OriginalMember(owner = "client!ask", name = "n", descriptor = "(I)I")
	abstract int method23995(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ask", name = "w", descriptor = "()I")
	abstract int method23996();
}
