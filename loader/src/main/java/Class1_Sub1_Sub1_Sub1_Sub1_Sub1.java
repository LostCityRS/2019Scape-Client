import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!i")
final class Class1_Sub1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!i", name = "p", descriptor = "I")
	static int anInt34;

	@OriginalMember(owner = "loader!i", name = "r", descriptor = "I")
	static int anInt35;

	@OriginalMember(owner = "loader!i", name = "q", descriptor = "Ljava/lang/Object;")
	Object anObject16;

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(BLjava/lang/String;)[B")
	static byte[] method25(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		anInt34++;
		@Pc(12) int local12 = arg1 == null ? 0 : arg1.length();
		if (local12 == 0) {
			return new byte[0];
		}
		@Pc(24) int local24 = local12 + 3 & 0xFFFFFFFC;
		if (arg0 <= 56) {
			return (byte[]) null;
		}
		@Pc(36) int var4;
		label27: {
			var4 = local24 / 4 * 3;
			if (local24 + -2 < local12 && Class1_Sub1_Sub1.method21(arg1.charAt(local24 + -2), -67) != -1) {
				if (local12 > local24 - 1 && Class1_Sub1_Sub1.method21(arg1.charAt(local24 + -1), -91) != -1) {
					break label27;
				}
				var4--;
				if (!Class1.aBoolean7) {
					break label27;
				}
			}
			var4 -= 2;
		}
		@Pc(83) byte[] local83 = new byte[var4];
		ClassLoader_Sub1.method12(local83, 0, arg1, (byte) -125);
		return local83;
	}

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;")
	static String method26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) boolean local1 = Class1.aBoolean7;
		anInt35++;
		if (arg3) {
			return (String) null;
		}
		@Pc(14) int local14 = arg1.indexOf(arg0);
		@Pc(38) String var10000;
		while (true) {
			if (local14 != -1) {
				arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(arg0.length() + local14);
				var10000 = arg1;
				if (local1) {
					break;
				}
				local14 = arg1.indexOf(arg0, arg2.length() + local14);
				if (!local1) {
					continue;
				}
			}
			var10000 = arg1;
			break;
		}
		return var10000;
	}

	@OriginalMember(owner = "loader!i", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
