import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!l")
class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!l", name = "n", descriptor = "I")
	static int anInt33;

	@OriginalMember(owner = "loader!l", name = "m", descriptor = "Ljava/lang/String;")
	static String aString3;

	@OriginalMember(owner = "loader!l", name = "o", descriptor = "Lloader!e;")
	static Class1 aClass1_13 = null;

	@OriginalMember(owner = "loader!l", name = "l", descriptor = "Ljava/lang/Object;")
	Object anObject15;

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	static String method24(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) boolean local1 = Class1.aBoolean7;
		anInt33++;
		@Pc(8) int local8 = arg0.length();
		@Pc(13) StringBuilder local13 = new StringBuilder(local8);
		if (arg1 > -122) {
			return (String) null;
		}
		@Pc(21) int local21 = 0;
		while (local21 < local8) {
			label80: {
				@Pc(28) char local28 = arg0.charAt(local21);
				if (local28 >= 'a' && local28 <= 'z' || local28 >= 'A' && local28 <= 'Z' || local28 >= '0' && local28 <= '9' || local28 == '.' || local28 == '-' || local28 == '*' || local28 == '_') {
					local13.append(local28);
					if (!local1) {
						break label80;
					}
				}
				if (local28 == ' ') {
					local13.append('+');
					if (!local1) {
						break label80;
					}
				}
				@Pc(115) byte var6;
				@Pc(125) int var7;
				label41: {
					var6 = RuntimeException_Sub1.method7(local28, 110);
					local13.append('%');
					var7 = var6 >> 4 & 0xF;
					if (var7 >= 10) {
						local13.append((char) (55 - -var7));
						if (!local1) {
							break label41;
						}
					}
					local13.append((char) (var7 - -48));
				}
				var7 = var6 & 0xF;
				if (var7 < 10) {
					local13.append((char) (var7 - -48));
					if (!local1) {
						break label80;
					}
				}
				local13.append((char) (var7 - -55));
			}
			local21++;
			if (local1) {
				break;
			}
		}
		return local13.toString();
	}

	@OriginalMember(owner = "loader!l", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}