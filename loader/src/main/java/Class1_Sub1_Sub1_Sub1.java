import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!b", name = "l", descriptor = "I")
	static int anInt54;

	@OriginalMember(owner = "loader!b", name = "k", descriptor = "Ljava/lang/Object;")
	Object anObject14;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/CharSequence;)Ljava/lang/String;")
	static String method33(@OriginalArg(0) int arg0, @OriginalArg(1) CharSequence arg1) {
		anInt54++;
		@Pc(8) int local8 = arg1.length();
		@Pc(13) StringBuilder local13 = new StringBuilder(local8);
		@Pc(15) int local15 = 0;
		if (arg0 != 43) {
			return (String) null;
		}
		while (local15 < local8) {
			@Pc(32) char local32 = arg1.charAt(local15);
			if (local32 >= 'a' && local32 <= 'z' || !(local32 < 'A' || local32 > 'Z') || local32 >= '0' && local32 <= '9' || local32 == '.' || local32 == '-' || local32 == '*' || local32 == '_') {
				local13.append(local32);
			} else if (local32 == ' ') {
				local13.append('+');
			} else {
				@Pc(99) byte local99 = Class3.method26(true, local32);
				local13.append('%');
				@Pc(109) int local109 = local99 >> 4 & 0xF;
				if (local109 >= 10) {
					local13.append((char) (local109 + 55));
				} else {
					local13.append((char) (local109 + 48));
				}
				local109 = local99 & 0xF;
				if (local109 < 10) {
					local13.append((char) (local109 + 48));
				} else {
					local13.append((char) (local109 - -55));
				}
			}
			local15++;
		}
		return local13.toString();
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
