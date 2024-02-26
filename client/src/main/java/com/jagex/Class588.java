package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
final class Class588 implements Interface49 {

	@OriginalMember(owner = "client!u", name = "bp", descriptor = "Ljava/lang/String;")
	static String aString227;

	@OriginalMember(owner = "client!u", name = "gc", descriptor = "Lclient!pf;")
	public static Class480 aClass480_127;

	@OriginalMember(owner = "client!u", name = "ud", descriptor = "I")
	public static int anInt5304;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "(IS)I")
	static int method31899(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		switch(arg0) {
			case 0:
				return 64;
			case 1:
				return 128;
			case 2:
				return 256;
			case 3:
				return 512;
			case 4:
				return 1024;
			default:
				return -1;
		}
	}

	@OriginalMember(owner = "client!u", name = "au", descriptor = "(IIIIIIILclient!ara;Lclient!ed;Lclient!aan;III)V")
	static void method31900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class80_Sub1_Sub4 arg7, @OriginalArg(8) Class104 arg8, @OriginalArg(9) Class15 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.anInt45 * 1190692343 - 1 && arg1 < arg9.anInt46 * -191270971 + arg6) {
			arg10 = arg11;
		}
		@Pc(31) String local31 = Class569.method31536(arg7, -1101981990);
		arg8.method7636(local31, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class622.anInt5488, Class344.aClass99Array6, null, -2118200131);
	}

	@OriginalMember(owner = "client!u", name = "dv", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31901(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		if (arg0.anInt4146 * 1314212291 != local12) {
			if (local12 == -1) {
				arg0.aClass6_6 = null;
			} else {
				if (arg0.aClass6_6 == null) {
					arg0.aClass6_6 = new Class6_Sub2();
				}
				arg0.aClass6_6.method23587(local12, -2060415981);
			}
			arg0.anInt4146 = local12 * -365498645;
			Class296.method26998(arg0, 1124700465);
		}
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class122_Sub2.method10327(arg0.anInt4087 * -2053489901, -830661955);
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)Lclient!rq;")
	public static Interface58 method31902(@OriginalArg(0) int arg0) {
		if (Class526.anInterface58_1 == null) {
			throw new IllegalStateException("");
		}
		return Class526.anInterface58_1;
	}

	@OriginalMember(owner = "client!u", name = "gr", descriptor = "(B)V")
	static void method31903(@OriginalArg(0) byte arg0) {
		if (Class301.method27043(client.anInt3433 * 1994758437, (byte) -73) || Class392.method28683(client.anInt3433 * 1994758437, -2078416795)) {
			client.aClass65_15 = Class65.aClass65_12;
			Class266.method26657(false, (short) 21108);
		} else {
			client.aClass65_15 = Class65.aClass65_1;
			OutputStream_Sub1.aClass160_3 = client.aClass75_1.method1321((byte) 2);
			client.aClass75_1.method1320(988532437);
			Class604.method32148(14, -763004919);
		}
	}

	@OriginalMember(owner = "client!u", name = "ajj", descriptor = "(Lclient!yp;B)V")
	static void method31904(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) Class80_Sub1_Sub12 local13 = Class159.method15423(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581]);
		if (local13 == null || local13.aString109 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local13.aString109;
		}
	}

	@OriginalMember(owner = "client!u", name = "u", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	@Override
	public Object method31898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2) {
		return Class279.aClass102_9.method20749(arg1, Class212.method25825(arg0)[0], arg2);
	}

	@OriginalMember(owner = "client!u", name = "t", descriptor = "([BLclient!aan;ZI)Ljava/lang/Object;")
	@Override
	public Object method31897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return Class279.aClass102_9.method20749(arg1, Class212.method25825(arg0)[0], arg2);
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	@Override
	public Object method31895(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2) {
		return Class279.aClass102_9.method20749(arg1, Class212.method25825(arg0)[0], arg2);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "([BLclient!aan;Z)Ljava/lang/Object;")
	@Override
	public Object method31896(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2) {
		return Class279.aClass102_9.method20749(arg1, Class212.method25825(arg0)[0], arg2);
	}
}
