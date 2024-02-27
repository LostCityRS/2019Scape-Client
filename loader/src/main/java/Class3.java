import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!j")
final class Class3 {

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet1;

	@OriginalMember(owner = "loader!j", name = "b", descriptor = "I")
	static int anInt36;

	@OriginalMember(owner = "loader!j", name = "c", descriptor = "[C")
	private static char[] aCharArray5 = new char[64];

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (65 - -local4);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray5[local4] = (char) (local4 - -97 + -26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray5[local4] = (char) (local4 + -52 + 48);
		}
		aCharArray5[63] = '/';
		aCharArray5[62] = '+';
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	static RuntimeException_Sub1 method27(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		anInt36++;
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
			if (!Class1.aBoolean7) {
				return local9;
			}
		}
		local9 = new RuntimeException_Sub1(arg0, arg1);
		return local9;
	}
}
