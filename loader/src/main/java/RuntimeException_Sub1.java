import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	String aString1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString1 = arg1;
		this.initCause(arg0);
	}
}
