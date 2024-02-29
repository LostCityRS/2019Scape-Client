package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public class Class155 implements Interface65 {

	@OriginalMember(owner = "client!uh", name = "vf", descriptor = "I")
	public static int anInt2066;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_57 = new Class155("", 10, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_48 = new Class155("", 11, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_56 = new Class155("", 12, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_52 = new Class155("", 13, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_51 = new Class155("", 14, new ScriptVarType[] { ScriptVarType.MAPELEMENT}, null);

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_62 = new Class155("", 15, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_53 = new Class155("", 16, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_54 = new Class155("", 17, new ScriptVarType[] { ScriptVarType.MAPELEMENT, ScriptVarType.INT, ScriptVarType.INT}, null);

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!uh;")
	static final Class155 aClass155_55 = new Class155("", 18);

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_60 = new Class155("", 19);

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_68 = new Class155("", 20, new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.INT}, null);

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_58 = new Class155("", 21);

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_59 = new Class155("", 22);

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_50 = new Class155("", 23, new ScriptVarType[] { ScriptVarType.PLAYER_UID}, null);

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_61 = new Class155("", 24);

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_64 = new Class155("", 25);

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_63 = new Class155("", 26);

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_47 = new Class155("", 27);

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_65 = new Class155("", 28);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!uh;")
	public static final Class155 aClass155_66 = new Class155_Sub2("", 29, true, false);

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!uh;")
	static final Class155 aClass155_67 = new Class155_Sub1("", 30, true, false);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!uh;")
	static final Class155 aClass155_69 = new Class155("", 73, true, true);

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!uh;")
	static final Class155 aClass155_49 = new Class155("", 76, true, false);

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public final int anInt2065;

	@OriginalMember(owner = "client!uh", name = "yh", descriptor = "(Lclient!yf;I)V")
	static void method15317(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aBoolean640 ? 1 : 0;
	}

	@OriginalMember(owner = "client!uh", name = "bgy", descriptor = "(Lclient!yf;I)V")
	static void method15318(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "(Lclient!ov;I)I")
	public static int method15319(@OriginalArg(0) Class471 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat326);
		local4.method29713();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method15320(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[arg1 + local6] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = Class712.aCharArray8[local17 - 128];
					if (local32 == '\u0000') {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!uh", name = "bev", descriptor = "(Lclient!yf;B)V")
	static void method15321(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26371(local13, 1459967832).method26464(local23, 867457263);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;IZ[Lclient!qw;Z[Lclient!qw;)V")
	Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) ScriptVarType[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) ScriptVarType[] arg5) {
		this.anInt2065 = arg1 * 1169253771;
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;IZZ)V")
	Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this(arg0, arg1, arg2, (ScriptVarType[]) null, arg3, (ScriptVarType[]) null);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;I[Lclient!qw;[Lclient!qw;)V")
	Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ScriptVarType[] arg2, @OriginalArg(3) ScriptVarType[] arg3) {
		this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
	}

	// $FF: synthetic method
	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;IZZLclient!alz;)V")
	Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class155_Sub2 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, false, (ScriptVarType[]) null, false, (ScriptVarType[]) null);
	}

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "()I")
	@Override
	public final int getId() {
		return this.anInt2065 * 825039395;
	}
}
