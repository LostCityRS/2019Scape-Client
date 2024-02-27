package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adi")
public final class Class83 implements Interface75 {

	@OriginalMember(owner = "client!adi", name = "e", descriptor = "Lclient!adi;")
	public static final Class83 aClass83_6 = new Class83(0, 0, "", "");

	@OriginalMember(owner = "client!adi", name = "n", descriptor = "Lclient!adi;")
	static final Class83 aClass83_9 = new Class83(5, 1, "", "");

	@OriginalMember(owner = "client!adi", name = "m", descriptor = "Lclient!adi;")
	static final Class83 aClass83_2 = new Class83(6, 2, "", "");

	@OriginalMember(owner = "client!adi", name = "k", descriptor = "Lclient!adi;")
	public static final Class83 aClass83_3 = new Class83(8, 3, "", "");

	@OriginalMember(owner = "client!adi", name = "f", descriptor = "Lclient!adi;")
	static final Class83 aClass83_4 = new Class83(7, 4, "", "");

	@OriginalMember(owner = "client!adi", name = "w", descriptor = "Lclient!adi;")
	public static final Class83 aClass83_5 = new Class83(2, 5, "", "");

	@OriginalMember(owner = "client!adi", name = "l", descriptor = "Lclient!adi;")
	public static final Class83 aClass83_8 = new Class83(3, 6, "", "");

	@OriginalMember(owner = "client!adi", name = "u", descriptor = "Lclient!adi;")
	static final Class83 aClass83_7 = new Class83(4, 7, "", "");

	@OriginalMember(owner = "client!adi", name = "z", descriptor = "Lclient!adi;")
	public static final Class83 aClass83_1 = new Class83(1, -1, "", "", true, new Class83[] { aClass83_6, aClass83_9, aClass83_2, aClass83_4, aClass83_3 });

	@OriginalMember(owner = "client!adi", name = "p", descriptor = "I")
	final int anInt253;

	@OriginalMember(owner = "client!adi", name = "d", descriptor = "I")
	final int anInt252;

	@OriginalMember(owner = "client!adi", name = "c", descriptor = "Ljava/lang/String;")
	final String aString10;

	@OriginalMember(owner = "client!adi", name = "ip", descriptor = "(IIIIII)I")
	public static int method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (client.aClass532_1.method30640(-1429843164) == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(12) Class520 local12 = client.aClass532_1.method30690(-626226984);
			@Pc(16) int local16 = arg0 >> 9;
			@Pc(20) int local20 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > client.aClass532_1.method30625(-1695441531) - 1 || arg3 > client.aClass532_1.method30655((short) 128) - 1) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > client.aClass532_1.method30625(2020371789) - 1 || local20 > client.aClass532_1.method30655((short) 128) - 1) {
				return 0;
			}
			@Pc(81) boolean local81 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(105) boolean local105;
			@Pc(122) boolean local122;
			if ((arg0 & 0x1FF) == 0) {
				local105 = (local12.aByteArrayArrayArray12[1][local16 - 1][arg1 >> 9] & 0x2) != 0;
				local122 = (local12.aByteArrayArrayArray12[1][local16][arg1 >> 9] & 0x2) != 0;
				if (local122 != local105) {
					local81 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local105 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20 - 1] & 0x2) != 0;
				local122 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20] & 0x2) != 0;
				if (local105 != local122) {
					local81 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (local81) {
				arg4++;
			}
		}
		return client.aClass532_1.method30640(-1845062565).aClass99Array1[arg4].method2480(arg0, arg1, 168936804);
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.anInt253 = arg0 * 651800959;
		this.anInt252 = arg1 * 23439709;
		this.aString10 = arg3;
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lclient!adi;)V")
	Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class83[] arg5) {
		this.anInt253 = arg0 * 651800959;
		this.anInt252 = arg1 * 23439709;
		this.aString10 = arg3;
	}

	@OriginalMember(owner = "client!adi", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt252 * -178785547;
	}

	@OriginalMember(owner = "client!adi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.aString10;
	}

	@OriginalMember(owner = "client!adi", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt252 * -178785547;
	}

	@OriginalMember(owner = "client!adi", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method1388() {
		return this.aString10;
	}
}
