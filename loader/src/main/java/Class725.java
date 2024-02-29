import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
final class Class725 {

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Lloader!e;")
	static Class724 aClass724_7;

	static {
		@Pc(4) Class724_Sub1 local4 = new Class724_Sub1(-121);
		((Class724_Sub1) local4).anObject39 = "clibs";
		aClass724_7 = local4;
	}

	@OriginalMember(owner = "loader!h", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] method36958(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x48);
		}
		return local1;
	}

	@OriginalMember(owner = "loader!h", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String method36959(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 27;
					break;
				case 1:
					local15 = 7;
					break;
				case 2:
					local15 = 24;
					break;
				case 3:
					local15 = 9;
					break;
				default:
					local15 = 72;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}
}
