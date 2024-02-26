import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!e", name = "n", descriptor = "I")
	static int anInt55;

	@OriginalMember(owner = "loader!e", name = "o", descriptor = "Lloader!d;")
	static Class1 aClass1_5;

	@OriginalMember(owner = "loader!e", name = "m", descriptor = "Ljava/lang/Object;")
	Object anObject15;

	static {
		@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(-93);
		((Class1_Sub1) local8).anObject12 = "clibs";
		aClass1_5 = local8;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(CI)I")
	static int method34(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		anInt55++;
		if (arg0 >= '\u0000' && arg0 < Class1_Sub1_Sub1_Sub1_Sub1_Sub1.anIntArray1.length) {
			return Class1_Sub1_Sub1_Sub1_Sub1_Sub1.anIntArray1[arg0];
		} else if (arg1 == -20323) {
			return -1;
		} else {
			return 115;
		}
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
