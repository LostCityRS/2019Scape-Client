import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "loader!a", name = "h", descriptor = "I")
	static int anInt31;

	@OriginalMember(owner = "loader!a", name = "g", descriptor = "I")
	static int anInt32;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Lloader!e;")
	static Class1 aClass1_11;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Ljava/lang/Object;")
	Object anObject13;

	static {
		@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(-121);
		((Class1_Sub1) local8).anObject12 = "unsigned";
		aClass1_11 = local8;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(CI)I")
	static int method21(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		anInt31++;
		if (arg0 >= '\u0000' && RuntimeException_Sub1.anIntArray1.length > arg0) {
			return RuntimeException_Sub1.anIntArray1[arg0];
		} else if (arg1 >= -65) {
			return 2;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
