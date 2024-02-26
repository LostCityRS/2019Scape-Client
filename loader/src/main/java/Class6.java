import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!n")
final class Class6 {

	@OriginalMember(owner = "loader!n", name = "b", descriptor = "Lloader!d;")
	static Class1 aClass1_8 = null;

	@OriginalMember(owner = "loader!n", name = "a", descriptor = "Lloader!d;")
	static Class1 aClass1_7;

	static {
		@Pc(6) Class1_Sub1 local6 = new Class1_Sub1(-93);
		((Class1_Sub1) local6).anObject12 = "crash";
		aClass1_7 = local6;
	}

	@OriginalMember(owner = "loader!n", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] method38(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x72);
		}
		return local1;
	}

	@OriginalMember(owner = "loader!n", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String method39(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 48;
					break;
				case 1:
					local15 = 123;
					break;
				case 2:
					local15 = 103;
					break;
				case 3:
					local15 = 62;
					break;
				default:
					local15 = 114;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}
}
