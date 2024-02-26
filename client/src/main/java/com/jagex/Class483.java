package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@OriginalClass("client!pi")
public final class Class483 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	static int anInt5003;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pi", name = "this$0", descriptor = "Lclient!pq;")
	final Class490 aClass490_4;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "[B")
	byte[] aByteArray93;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "(B)V")
	public static void method30026(@OriginalArg(0) byte arg0) {
		Class686.aClass248_1.method26332(1679924012);
	}

	@OriginalMember(owner = "client!pi", name = "do", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30027(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean807 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 1484076560);
	}

	@OriginalMember(owner = "client!pi", name = "ape", descriptor = "(Lclient!yp;B)V")
	static void method30028(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class103.method19210((short) -1314).method37268();
	}

	@OriginalMember(owner = "client!pi", name = "mi", descriptor = "(II)Lclient!adt;")
	public static Class88 method30029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class88 local5 = (Class88) client.aClass243_66.method26282((long) arg0);
		if (local5 == null) {
			local5 = new Class88(Class688.aClass480_135, Class603.method32130(arg0, 504309486), Class75.method1344(arg0, 1453949498));
			client.aClass243_66.method26253(local5, (long) arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!pi", name = "dm", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;IIIII)V")
	static void method30030(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4040 * 861398173 != 0) {
			arg0.method20716(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4040 * 861398173, (byte) 36);
		}
		if (arg2.anInt4041 * 1350573417 != 0) {
			arg0.method20715(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4041 * 1350573417, -1068342187);
		}
		@Pc(61) int local61 = arg2.anInt4032 * -791504431;
		if (arg1.aBoolean364 && arg2.anInt4035 * -1673387527 != -1) {
			local61 = arg2.anInt4035 * -1673387527;
		}
		Class165_Sub38.aClass104_12.method7631(arg2.aString178, arg3, arg4, arg6, arg5, local61 | 0xFF000000, Class159_Sub1.aClass632_2.anInt5581 * 2032438309, 1, 0, 0, null, null, null, 0, 0, (byte) 0);
	}

	@OriginalMember(owner = "client!pi", name = "lq", descriptor = "(Ljava/lang/String;B)I")
	public static int method30031(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < client.anInt3573 * 975306769; local6++) {
			if (arg0.equalsIgnoreCase(client.aClass676Array1[local6].aString236)) {
				return local6;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!pq;Ljava/io/InputStream;Lclient!atl;Ljava/net/URL;)V")
	Class483(@OriginalArg(0) Class490 arg0, @OriginalArg(1) InputStream arg1, @OriginalArg(2) Class80_Sub1_Sub15_Sub1 arg2, @OriginalArg(3) URL arg3) {
		this.aClass490_4 = arg0;
		this.aByteArray93 = null;
		if (arg1 != null) {
			@Pc(11) short local11 = 10240;
			@Pc(17) Packet local17 = new Packet(local11, true);
			@Pc(19) int local19 = 0;
			@Pc(23) byte[] local23 = ByteArrayPool.create(1024);
			@Pc(53) int local53;
			while (local19 >= 0) {
				try {
					local19 = arg1.read(local23);
				} catch (@Pc(31) IOException local31) {
					local31.printStackTrace();
					local19 = -1;
				}
				if (local19 > 0) {
					if (local19 + local17.pos * -1380987821 >= local17.data.length) {
						local53 = local17.data.length + 10240;
						@Pc(58) byte[] local58 = ByteArrayPool.create(local53, true);
						System.arraycopy(local17.data, 0, local58, 0, local17.pos * -1380987821);
						ByteArrayPool.release(local17.data, -2081608905);
						local17.data = local58;
					}
					local17.pdata(local23, 0, local19);
				}
			}
			for (local53 = 0; local53 < arg2.anInt3234 * -190580633; local53++) {
				local17.p1(0);
			}
			@Pc(102) byte[] local102 = new byte[local17.pos * -1380987821];
			System.arraycopy(local17.data, 0, local102, 0, local17.pos * -1380987821);
			local17.release();
			local17 = null;
			ByteArrayPool.release(local23, -569137688);
			@Pc(122) Object local122 = null;
			this.aByteArray93 = local102;
			try {
				arg1.close();
			} catch (@Pc(129) IOException local129) {
				local129.printStackTrace();
			}
		}
		arg2.aBoolean661 = false;
		arg0.method30223(-315400436);
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "()[B")
	byte[] method30023() {
		return this.aByteArray93;
	}

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "(I)[B")
	byte[] method30024(@OriginalArg(0) int arg0) {
		return this.aByteArray93;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "()[B")
	byte[] method30025() {
		return this.aByteArray93;
	}
}
