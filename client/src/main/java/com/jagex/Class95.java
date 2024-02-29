package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public class Class95 {

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	static int anInt320;

	@OriginalMember(owner = "client!ae", name = "bt", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger4 = new BigInteger("89a1a51902ff0cb294dcafe10f6dc680d56a5ca37d0923826bbf7212e09a3f2fdfb616db51473dd3c38339ad1f859519befafce85f7f5498a1c6e7829707fa053a0bdcab63b7c45cca0b8a66d2800efd43bb27f794360b722c429e36ddc61ec15cd428f7b64e1ecf8648f6ff6d191eaed8e89fc576721e7d668e5455e34ef5a3", 16);

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("9b62983a828fa2e4572cec5f2448c4b98562bc14217c3def4b2c02a3006a4ecce6084751ce20f60f66669635d3e5cc6fba23adc0a9adedf9e8d4200e8cd7b0ea06a517574b2d1969a5945ed09bc789900528874777d7c68300951bfcb8ff3d0df0e656b9f4d339cc2bfca3be083cc6b378225686af226cd03f489096993a3c5a37f12ce5e7318725290391d2edf2930d477019103cb4cc83c7eae620462a5baf8a27fdf2b9eb18ab06fd1e60e46167a5eb02c7d73c0d10ea54176b408bdcbda571c8c5d918d1151285865aac1b208e9e9ff5aa232bdf24b9524fae2d3627f8626dbd6061865417960b39ff2b692158e3d428824c577916209d21ce9f95c797580c8e14a6209218ae5b64fef72d23d0897ea473e3fad24ca41978d7d4dea855430fe03cd333adddf4b2f41631535baad313b4c0afd1878e668419e8e82d500b95446b8dece2d68af9c973f24360364a3ce0d5be9af1724197eb7978aed192671c675a98a1b4bec8388098f3a5cf45db3b9b21e34be4ea0acfb6972efe4c378b6108e21ffaa1c29b5d7c254e8d4711faae6e86daaf4d816d3eae56f21425db849ce2845b0dc334765a3d943d2b7ef7423857301ae9212ef8eaf76ea784b42e6d711183f96ad0e31f6ff389a3b9da4f5cff159d81736b08af9e0f377e2057e52892f26e08347ca012359b7f2cbfe2efda69e5b3d6295dffb2f62e156685f89c92a5", 16);

	static {
		new BigInteger("10001", 16);
		new BigInteger("d09a9575024fa1cd1357b43840ad0090a4fd8dcd2d5f7dc03eae42886072413c9b51b8c49d770bef272515a1d352bb28eb9433f7f1eb11c6e97de1901a25ebd1", 16);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 19)
	Class95() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)V", line = 86)
	public static void method1800(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2588(Class446.aClass446_63, client.aClass175_1.aClass24_2, (byte) 32);
			client.aClass175_1.method24356(local10, -1573030867);
			Class676.aClass704_1 = Class704.aClass704_3;
			Class355.aString184 = null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "(Ljava/lang/String;ZLclient!dh;Lclient!eu;Lclient!aac;B)V", line = 86)
	public static void method1801(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) byte arg5) {
		@Pc(8) boolean local8 = !Class93_Sub1_Sub1.aBoolean42 || Class110_Sub23.method8623(1434157203);
		if (!local8) {
			return;
		}
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(90) int local90;
		if (Class93_Sub1_Sub1.aBoolean42 && local8) {
			@Pc(17) Class5 local17 = Class63.aClass5_2;
			@Pc(23) Class106 local23 = arg2.method20593(local17, Class171.aClass105_Sub2_1, true);
			local30 = local17.method64(arg0, 250, null, -1910907678);
			local41 = local17.method72(arg0, 250, local17.anInt7 * -2059082111, null, (byte) 0);
			@Pc(44) int local44 = Class171.aClass105_1.method7206();
			local48 = local44 + 4;
			local30 += local48 * 2;
			local41 += local48 * 2;
			if (local30 < Class171.anInt3056 * 517811577) {
				local30 = Class171.anInt3056 * 517811577;
			}
			if (local41 < Class653.anInt5805 * -1506836959) {
				local41 = Class653.anInt5805 * -1506836959;
			}
			local90 = Class171.aClass390_8.method28274(local30, client.anInt3511 * 2040043391, 15040190) + Class171.anInt3055 * 1543350707;
			@Pc(102) int local102 = Class171.aClass392_8.method28291(local41, client.anInt3512 * -817449061, (short) 255) + Class355.anInt4219 * -246562615;
			arg2.method20589(Class531.aClass105_3, false).method18202(local90 + Class171.aClass105_2.method7206(), local102 + Class171.aClass105_2.method7198(), local30 - Class171.aClass105_2.method7206() * 2, local41 - Class171.aClass105_2.method7198() * 2, 1, -1, 0);
			arg2.method20589(Class171.aClass105_2, true).method18161(local90, local102);
			Class171.aClass105_2.method7168();
			arg2.method20589(Class171.aClass105_2, true).method18161(local90 + local30 - local44, local102);
			Class171.aClass105_2.method7169();
			arg2.method20589(Class171.aClass105_2, true).method18161(local90 + local30 - local44, local41 + local102 - local44);
			Class171.aClass105_2.method7168();
			arg2.method20589(Class171.aClass105_2, true).method18161(local90, local102 + local41 - local44);
			Class171.aClass105_2.method7169();
			arg2.method20589(Class171.aClass105_1, true).method18168(local90, local102 + Class171.aClass105_2.method7198(), local44, local41 - Class171.aClass105_2.method7198() * 2);
			Class171.aClass105_1.method7155();
			arg2.method20589(Class171.aClass105_1, true).method18168(local90 + Class171.aClass105_2.method7206(), local102, local30 - Class171.aClass105_2.method7206() * 2, local44);
			Class171.aClass105_1.method7155();
			arg2.method20589(Class171.aClass105_1, true).method18168(local30 + local90 - local44, local102 + Class171.aClass105_2.method7198(), local44, local41 - Class171.aClass105_2.method7198() * 2);
			Class171.aClass105_1.method7155();
			arg2.method20589(Class171.aClass105_1, true).method18168(local90 + Class171.aClass105_2.method7206(), local41 + local102 - local44, local30 - Class171.aClass105_2.method7206() * 2, local44);
			Class171.aClass105_1.method7155();
			local23.method7534(arg0, local48 + local90, local102 + local48, local30 - local48 * 2, local41 - local48 * 2, anInt320 * 2016248431 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0, (short) 657);
			Class269.method26274(local90, local102, local30, local41, (byte) -40);
		} else {
			local30 = arg4.method64(arg0, 250, null, -1910907678);
			local41 = arg4.method66(arg0, 250, null, -143202029) * 13;
			@Pc(326) byte local326 = 4;
			local48 = local326 + 6;
			local90 = local326 + 6;
			arg2.method20721(local48 - local326, local90 - local326, local326 + local326 + local30, local326 + local41 + local326, -16777216, 0);
			arg2.method20573(local48 - local326, local90 - local326, local326 + local30 + local326, local41 + local326 + local326, -1, 0);
			arg3.method7534(arg0, local48, local90, local30, local41, -1, -1, 1, 1, 0, null, null, null, 0, 0, (short) 657);
			Class269.method26274(local48 - local326, local90 - local326, local30 + local326 + local326, local326 + local326 + local41, (byte) -63);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method20489();
			arg2.method20421(-1392012896);
		} catch (@Pc(420) Exception_Sub4 local420) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "ge", descriptor = "(Lclient!yf;I)V", line = 6126)
	static final void method1802(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anInt5891 -= -1915563430;
		@Pc(25) int local25 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(35) int local35 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(41) Class87 local41 = (Class87) Class124.aClass32_Sub21_7.method18261(local25, -1583968213);
		if (local35 == local41.anInt265 * 951920133) {
			local11.method26914(local25, 2087973884);
		} else {
			local11.method26909(local25, local35, 1662412852);
		}
	}

	@OriginalMember(owner = "client!ae", name = "ago", descriptor = "(Lclient!yf;I)V", line = 10784)
	static final void method1803(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class342.method27511(local13, local26 == 1, (short) 31342);
	}
}
