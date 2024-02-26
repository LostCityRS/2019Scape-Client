import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
final class Class3 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	static int anInt44;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	static int anInt45;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	static String aString2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	static int anInt46;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[C")
	private static char[] aCharArray6 = new char[64];

	static {
		@Pc(49) int local49;
		for (local49 = 0; local49 < 26; local49++) {
			aCharArray6[local49] = (char) (65 - -local49);
		}
		for (local49 = 26; local49 < 52; local49++) {
			aCharArray6[local49] = (char) (-26 + 97 + local49);
		}
		for (local49 = 52; local49 < 62; local49++) {
			aCharArray6[local49] = (char) (48 - (-local49 + 52));
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	static String method24(@OriginalArg(0) byte arg0, @OriginalArg(1) Throwable arg1) throws IOException {
		@Pc(9) int local9 = 45 % ((-67 - arg0) / 38);
		anInt45++;
		@Pc(18) String local18;
		if (arg1 instanceof RuntimeException_Sub1) {
			@Pc(28) RuntimeException_Sub1 local28 = (RuntimeException_Sub1) arg1;
			local18 = local28.aString1 + " | ";
			arg1 = local28.aThrowable1;
		} else {
			local18 = "";
		}
		@Pc(47) StringWriter local47 = new StringWriter();
		@Pc(52) PrintWriter local52 = new PrintWriter(local47);
		arg1.printStackTrace(local52);
		local52.close();
		@Pc(60) String local60 = local47.toString();
		@Pc(68) BufferedReader local68 = new BufferedReader(new StringReader(local60));
		@Pc(71) String local71 = local68.readLine();
		while (true) {
			@Pc(74) String local74 = local68.readLine();
			if (local74 == null) {
				return local18 + "| " + local71;
			}
			@Pc(80) int local80 = local74.indexOf(40);
			@Pc(87) int local87 = local74.indexOf(41, local80 + 1);
			@Pc(101) String local101;
			if (local80 == -1) {
				local101 = local74;
			} else {
				local101 = local74.substring(0, local80);
			}
			local101 = local101.trim();
			local101 = local101.substring(local101.lastIndexOf(32) + 1);
			local101 = local101.substring(local101.lastIndexOf(9) + 1);
			local18 = local18 + local101;
			if (local80 != -1 && local87 != -1) {
				@Pc(150) int local150 = local74.indexOf(".java:", local80);
				if (local150 >= 0) {
					local18 = local18 + local74.substring(local150 - -5, local87);
				}
			}
			local18 = local18 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Lloader!d;B)Lloader!l;")
	static ClassLoader_Sub1 method25(@OriginalArg(0) Class1 arg0, @OriginalArg(1) byte arg1) {
		anInt44++;
		@Pc(11) int local11 = 5 % ((arg1 - -19) / 52);
		return new ClassLoader_Sub1(arg0);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZC)B")
	static byte method26(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
		anInt46++;
		if (!arg0) {
			return 110;
		}
		@Pc(44) byte local44;
		if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
			local44 = (byte) arg1;
		} else if (arg1 == '€') {
			local44 = -128;
		} else if (arg1 == '‚') {
			local44 = -126;
		} else if (arg1 == 'ƒ') {
			local44 = -125;
		} else if (arg1 == '„') {
			local44 = -124;
		} else if (arg1 == '…') {
			local44 = -123;
		} else if (arg1 == '†') {
			local44 = -122;
		} else if (arg1 == '‡') {
			local44 = -121;
		} else if (arg1 == 'ˆ') {
			local44 = -120;
		} else if (arg1 == '‰') {
			local44 = -119;
		} else if (arg1 == 'Š') {
			local44 = -118;
		} else if (arg1 == '‹') {
			local44 = -117;
		} else if (arg1 == 'Œ') {
			local44 = -116;
		} else if (arg1 == 'Ž') {
			local44 = -114;
		} else if (arg1 == '‘') {
			local44 = -111;
		} else if (arg1 == '’') {
			local44 = -110;
		} else if (arg1 == '“') {
			local44 = -109;
		} else if (arg1 == '”') {
			local44 = -108;
		} else if (arg1 == '•') {
			local44 = -107;
		} else if (arg1 == '–') {
			local44 = -106;
		} else if (arg1 == '—') {
			local44 = -105;
		} else if (arg1 == '˜') {
			local44 = -104;
		} else if (arg1 == '™') {
			local44 = -103;
		} else if (arg1 == 'š') {
			local44 = -102;
		} else if (arg1 == '›') {
			local44 = -101;
		} else if (arg1 == 'œ') {
			local44 = -100;
		} else if (arg1 == 'ž') {
			local44 = -98;
		} else if (arg1 == 'Ÿ') {
			local44 = -97;
		} else {
			local44 = 63;
		}
		return local44;
	}
}
