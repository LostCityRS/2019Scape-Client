package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ax")
public final class Class174 {

	@OriginalMember(owner = "client!ax", name = "t", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ax", name = "f", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger2 = new BigInteger("89a1a51902ff0cb294dcafe10f6dc680d56a5ca37d0923826bbf7212e09a3f2fdfb616db51473dd3c38339ad1f859519befafce85f7f5498a1c6e7829707fa053a0bdcab63b7c45cca0b8a66d2800efd43bb27f794360b722c429e36ddc61ec15cd428f7b64e1ecf8648f6ff6d191eaed8e89fc576721e7d668e5455e34ef5a3", 16);

	@OriginalMember(owner = "client!ax", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ax", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("9b62983a828fa2e4572cec5f2448c4b98562bc14217c3def4b2c02a3006a4ecce6084751ce20f60f66669635d3e5cc6fba23adc0a9adedf9e8d4200e8cd7b0ea06a517574b2d1969a5945ed09bc789900528874777d7c68300951bfcb8ff3d0df0e656b9f4d339cc2bfca3be083cc6b378225686af226cd03f489096993a3c5a37f12ce5e7318725290391d2edf2930d477019103cb4cc83c7eae620462a5baf8a27fdf2b9eb18ab06fd1e60e46167a5eb02c7d73c0d10ea54176b408bdcbda571c8c5d918d1151285865aac1b208e9e9ff5aa232bdf24b9524fae2d3627f8626dbd6061865417960b39ff2b692158e3d428824c577916209d21ce9f95c797580c8e14a6209218ae5b64fef72d23d0897ea473e3fad24ca41978d7d4dea855430fe03cd333adddf4b2f41631535baad313b4c0afd1878e668419e8e82d500b95446b8dece2d68af9c973f24360364a3ce0d5be9af1724197eb7978aed192671c675a98a1b4bec8388098f3a5cf45db3b9b21e34be4ea0acfb6972efe4c378b6108e21ffaa1c29b5d7c254e8d4711faae6e86daaf4d816d3eae56f21425db849ce2845b0dc334765a3d943d2b7ef7423857301ae9212ef8eaf76ea784b42e6d711183f96ad0e31f6ff389a3b9da4f5cff159d81736b08af9e0f377e2057e52892f26e08347ca012359b7f2cbfe2efda69e5b3d6295dffb2f62e156685f89c92a5", 16);

	static {
		new BigInteger("10001", 16);
		new BigInteger("d09a9575024fa1cd1357b43840ad0090a4fd8dcd2d5f7dc03eae42886072413c9b51b8c49d770bef272515a1d352bb28eb9433f7f1eb11c6e97de1901a25ebd1", 16);
	}

	@OriginalMember(owner = "client!ax", name = "z", descriptor = "(Lclient!hx;Lclient!cg;IIIILclient!cm;I)V")
	static void method24632(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class99 arg6, @OriginalArg(7) int arg7) {
		Class165.method16960(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class313.aClass313_1, Class309.aClass309_3, (byte) 104);
	}

	@OriginalMember(owner = "client!ax", name = "mn", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method24633(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1907815594) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray6 = Class431.method29089(local13, arg2, 2041539947);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!ax", name = "avb", descriptor = "(Lclient!yp;I)V")
	static void method24634(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		client.aShort160 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		if (client.aShort160 <= 0) {
			client.aShort160 = 1;
		}
		client.aShort155 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (client.aShort155 <= 0) {
			client.aShort155 = 32767;
		} else if (client.aShort155 < client.aShort160) {
			client.aShort155 = client.aShort160;
		}
		client.aShort154 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		if (client.aShort154 <= 0) {
			client.aShort154 = 1;
		}
		client.aShort153 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		if (client.aShort153 <= 0) {
			client.aShort153 = 32767;
		} else if (client.aShort153 < client.aShort154) {
			client.aShort153 = client.aShort154;
		}
	}

	@OriginalMember(owner = "client!ax", name = "azi", descriptor = "(Lclient!yp;I)V")
	static void method24635(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub47_1.method16961(1896589581) && Class279.aClass102_9.method20791() ? 1 : 0;
	}

	@OriginalMember(owner = "client!ax", name = "ek", descriptor = "(I)Lclient!akh;")
	public static Class80_Sub18 method24636(@OriginalArg(0) int arg0) {
		if (Class159_Sub1.aClass8_28 == null || Class159_Sub1.aClass7_1 == null) {
			return null;
		}
		Class159_Sub1.aClass7_1.method210(Class159_Sub1.aClass8_28, 116356022);
		@Pc(15) Class80_Sub18 local15 = (Class80_Sub18) Class159_Sub1.aClass7_1.method220(1664430862);
		if (local15 == null) {
			return null;
		} else {
			@Pc(28) Class320 local28 = (Class320) Class159_Sub1.aClass41_Sub13_4.method18054(local15.anInt1587 * 1945594581, 945266106);
			return local28 != null && local28.aBoolean797 && local28.method27544(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface24_2, -2095140046) ? local15 : Class148_Sub1.method13460(1060434502);
		}
	}

	@OriginalMember(owner = "client!ax", name = "<init>", descriptor = "()V")
	Class174() throws Throwable {
		throw new Error();
	}
}
