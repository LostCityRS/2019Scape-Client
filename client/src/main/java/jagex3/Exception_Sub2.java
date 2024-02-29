package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apc")
public class Exception_Sub2 extends Exception {

	@OriginalMember(owner = "client!apc", name = "akg", descriptor = "(Lclient!yf;B)V")
	static void method23649(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class159_Sub1.aBoolean352 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
	}

	@OriginalMember(owner = "client!apc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Exception_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
