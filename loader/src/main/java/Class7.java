import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!o")
final class Class7 {

	@OriginalMember(owner = "loader!o", name = "a", descriptor = "I")
	static int anInt60;

	@OriginalMember(owner = "loader!o", name = "a", descriptor = "(BLjava/lang/String;)[B")
	static byte[] method40(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		anInt60++;
		@Pc(14) int local14 = arg1 == null ? 0 : arg1.length();
		if (local14 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local14 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local27 + -2 >= local14 || Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(local27 + -2), -20323) == -1) {
			local33 -= 2;
		} else if (local27 + -1 >= local14 || Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(local27 + -1), -20323) == -1) {
			local33--;
		}
		@Pc(84) byte[] local84 = new byte[local33];
		if (arg0 != 32) {
			method40((byte) 33, null);
		}
		@Pc(96) int local96 = 0;
		@Pc(105) int local105 = arg1 == null ? 0 : arg1.length();
		for (@Pc(107) int local107 = 0; local107 < local105; local107 += 4) {
			@Pc(122) int local122 = Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(local107), arg0 + -20355);
			@Pc(145) int local145 = local107 + 1 >= local105 ? -1 : Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(1 - -local107), arg0 + -20355);
			@Pc(166) int local166 = local105 > 2 - -local107 ? Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(local107 + 2), -20323) : -1;
			@Pc(188) int local188 = local105 <= local107 + 3 ? -1 : Class1_Sub1_Sub1_Sub1_Sub1.method34(arg1.charAt(local107 + 3), arg0 + -20355);
			local84[local96++] = (byte) (local122 << 2 | local145 >>> 4);
			if (local166 == -1) {
				break;
			}
			local84[local96++] = (byte) ((local145 & 0xF) << 4 | local166 >>> 2);
			if (local188 == -1) {
				break;
			}
			local84[local96++] = (byte) (local188 | (local166 & 0x3) << 6);
		}
		return local84;
	}
}
