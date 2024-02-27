import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	static int anInt30;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "J")
	static long aLong5;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/Object;")
	Object anObject12;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(I)V")
	Class1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
