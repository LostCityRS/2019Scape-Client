import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!d", name = "k", descriptor = "Lloader!e;")
	static Class1 aClass1_12;

	@OriginalMember(owner = "loader!d", name = "j", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "loader!d", name = "i", descriptor = "Ljava/lang/Object;")
	Object anObject14;

	static {
		@Pc(4) Class1_Sub1 local4 = new Class1_Sub1(-121);
		((Class1_Sub1) local4).anObject12 = "crash";
		aClass1_12 = local4;
		aCharArray4 = new char[64];
		@Pc(19) int local19;
		for (local19 = 0; local19 < 26; local19++) {
			aCharArray4[local19] = (char) (local19 + 65);
		}
		for (local19 = 26; local19 < 52; local19++) {
			aCharArray4[local19] = (char) (local19 - -71);
		}
		for (local19 = 52; local19 < 62; local19++) {
			aCharArray4[local19] = (char) (48 - -local19 + -52);
		}
		aCharArray4[62] = '*';
		aCharArray4[63] = '-';
	}

	@OriginalMember(owner = "loader!d", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] method22(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x36);
		}
		return local1;
	}

	@OriginalMember(owner = "loader!d", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String method23(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 13;
					break;
				case 1:
					local15 = 53;
					break;
				case 2:
					local15 = 41;
					break;
				case 3:
					local15 = 35;
					break;
				default:
					local15 = 54;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
