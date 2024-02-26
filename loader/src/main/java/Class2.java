import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
final class Class2 {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	static int anInt35;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "[C")
	private static char[] aCharArray4 = new char[64];

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray4[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray4[local4] = (char) (-26 + 97 + local4);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray4[local4] = (char) (local4 - -48 + -52);
		}
		aCharArray4[62] = '-';
		aCharArray4[63] = '_';
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	static RuntimeException_Sub1 method18(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		anInt35++;
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
