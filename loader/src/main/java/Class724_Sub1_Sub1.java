import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
class Class724_Sub1_Sub1 extends Class724_Sub1 {

	@OriginalMember(owner = "loader!a", name = "h", descriptor = "I")
	static int anInt5999;

	@OriginalMember(owner = "loader!a", name = "g", descriptor = "I")
	static int anInt6000;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Lloader!e;")
	static Class724 aClass724_11;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Ljava/lang/Object;")
	Object anObject40;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(CI)I", line = 5)
	static final int method36964(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		anInt5999++;
		if (arg0 >= '\u0000' && RuntimeException_Sub5.anIntArray529.length > arg0) {
			return RuntimeException_Sub5.anIntArray529[arg0];
		} else if (arg1 >= -65) {
			return 2;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(I)V", line = 19)
	Class724_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	static {
		@Pc(8) Class724_Sub1 local8 = new Class724_Sub1(-121);
		((Class724_Sub1) local8).anObject39 = "unsigned";
		aClass724_11 = local8;
	}
}
