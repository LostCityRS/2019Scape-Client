import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!m")
class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "loader!m", name = "f", descriptor = "I")
	static int anInt52;

	@OriginalMember(owner = "loader!m", name = "e", descriptor = "I")
	static int anInt53;

	@OriginalMember(owner = "loader!m", name = "g", descriptor = "[C")
	private static char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "loader!m", name = "h", descriptor = "Ljava/lang/Object;")
	Object anObject12;

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray7[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray7[local4] = (char) (71 - -local4);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray7[local4] = (char) (local4 - -48 + -52);
		}
		aCharArray7[62] = '*';
		aCharArray7[63] = '-';
	}

	@OriginalMember(owner = "loader!m", name = "<init>", descriptor = "(I)V")
	Class1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
