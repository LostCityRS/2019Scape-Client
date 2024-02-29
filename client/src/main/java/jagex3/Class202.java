package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class202 {

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method24654(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local4 + local2);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z")
	static boolean method24655(@OriginalArg(0) byte arg0) {
		return !Class228.method25709(client.anInt3435 * -849002901, -1710463806);
	}

	@OriginalMember(owner = "client!cc", name = "aru", descriptor = "(Lclient!yf;I)V")
	static void method24656(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(42) boolean local42 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		Class149_Sub3.method12319(local13, local27, local42, (short) 4090);
	}

	@OriginalMember(owner = "client!cc", name = "ty", descriptor = "(Lclient!hf;Lclient!yf;I)V")
	static void method24657(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091] - 1;
		if (arg0.anInt4042 * 1553054515 != 6) {
			throw new RuntimeException("");
		} else if (local27 >= 0 && local27 < 12) {
			Class420.method28921(arg0, local27, local12, 1.0F, 0, 0, 0, 0, 0, 0, (byte) 101);
			Class354.method27789(arg0, -1174743804);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "(Ljava/lang/String;I)V")
	static void method24658(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class676.aClass704_1 = Class704.aClass704_2;
		Class355.aString190 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "(II)V")
	public static void method24659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(12, (long) arg0);
		local4.method21877(2146298923);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	Class202() throws Throwable {
		throw new Error();
	}
}
