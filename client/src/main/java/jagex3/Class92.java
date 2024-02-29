package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adw")
public final class Class92 {

	@OriginalMember(owner = "client!adw", name = "bx", descriptor = "Lclient!cm;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!adw", name = "n", descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;")
	public static String method1711(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class138_Sub3.method11406(local16, 2022467042);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!adw", name = "<init>", descriptor = "()V")
	Class92() throws Throwable {
		throw new Error();
	}
}
