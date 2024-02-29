package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asa")
public abstract class Class93_Sub1_Sub12 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asa", name = "l", descriptor = "I")
	final int anInt3214;

	@OriginalMember(owner = "client!asa", name = "<init>", descriptor = "(I)V")
	Class93_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt3214 = arg0 * -478942565;
	}

	@OriginalMember(owner = "client!asa", name = "f", descriptor = "()Ljava/lang/Object;")
	abstract Object method23554();

	@OriginalMember(owner = "client!asa", name = "e", descriptor = "(B)Ljava/lang/Object;")
	abstract Object method23555(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!asa", name = "n", descriptor = "(I)Z")
	abstract boolean method23556(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!asa", name = "k", descriptor = "()Ljava/lang/Object;")
	abstract Object method23557();

	@OriginalMember(owner = "client!asa", name = "m", descriptor = "()Ljava/lang/Object;")
	abstract Object method23558();

	@OriginalMember(owner = "client!asa", name = "w", descriptor = "()Ljava/lang/Object;")
	abstract Object method23559();

	@OriginalMember(owner = "client!asa", name = "l", descriptor = "()Z")
	abstract boolean method23560();
}
