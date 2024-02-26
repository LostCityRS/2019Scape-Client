import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "loader!h", name = "j", descriptor = "Ljava/applet/Applet;")
	static Applet anApplet4;

	@OriginalMember(owner = "loader!h", name = "i", descriptor = "Ljava/lang/Object;")
	Object anObject13;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
