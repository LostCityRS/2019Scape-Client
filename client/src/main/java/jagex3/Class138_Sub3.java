package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aip")
final class Class138_Sub3 extends Class138 {

	@OriginalMember(owner = "client!aip", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!aip", name = "e", descriptor = "(CI)B")
	public static byte method11406(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aip", name = "<init>", descriptor = "(Lclient!xq;IZZ)V")
	Class138_Sub3(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aip", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}

	@OriginalMember(owner = "client!aip", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}

	@OriginalMember(owner = "client!aip", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}
}
