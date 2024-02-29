import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!j")
final class Class726 {

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet4;

	@OriginalMember(owner = "loader!j", name = "b", descriptor = "I")
	static int anInt6004;

	@OriginalMember(owner = "loader!j", name = "c", descriptor = "[C")
	private static char[] aCharArray14 = new char[64];

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray14[local4] = (char) (65 - -local4);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray14[local4] = (char) (local4 - -97 + -26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray14[local4] = (char) (local4 + -52 + 48);
		}
		aCharArray14[63] = '/';
		aCharArray14[62] = '+';
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;", line = 34)
	static final RuntimeException_Sub5 method36970(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		anInt6004++;
		@Pc(9) RuntimeException_Sub5 local9;
		if (arg0 instanceof RuntimeException_Sub5) {
			local9 = (RuntimeException_Sub5) arg0;
			local9.aString246 = local9.aString246 + ' ' + arg1;
			if (!Class724.aBoolean888) {
				return local9;
			}
		}
		local9 = new RuntimeException_Sub5(arg0, arg1);
		return local9;
	}
}
