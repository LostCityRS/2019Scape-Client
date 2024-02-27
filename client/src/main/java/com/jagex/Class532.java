package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class532 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!rc;")
	Class526 aClass526_9;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "Lclient!rc;")
	Class526 aClass526_10;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!ib;")
	Class332 aClass332_7;

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
	int anInt5398;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "Lclient!aih;")
	Class142_Sub1 aClass142_Sub1_1;

	@OriginalMember(owner = "client!rl", name = "am", descriptor = "[[B")
	byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Lclient!rg;")
	Class529 aClass529_5;

	@OriginalMember(owner = "client!rl", name = "aj", descriptor = "I")
	public int anInt5399;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	int anInt5400;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "Lclient!tx;")
	Class585 aClass585_24;

	@OriginalMember(owner = "client!rl", name = "ar", descriptor = "[[B")
	byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Lclient!qx;")
	Class520 aClass520_3;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Lclient!aih;")
	Class142_Sub1 aClass142_Sub1_2;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
	int anInt5401;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!asy;")
	Class93_Sub1_Sub20 aClass93_Sub1_Sub20_3;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "F")
	float aFloat331;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_9;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "[[I")
	int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[[I")
	int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	int anInt5402;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	int anInt5403;

	@OriginalMember(owner = "client!rl", name = "ac", descriptor = "I")
	int anInt5408;

	@OriginalMember(owner = "client!rl", name = "as", descriptor = "[I")
	int[] anIntArray464;

	@OriginalMember(owner = "client!rl", name = "at", descriptor = "[[B")
	byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rl", name = "ad", descriptor = "[[B")
	byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rl", name = "aw", descriptor = "[I")
	int[] anIntArray465;

	@OriginalMember(owner = "client!rl", name = "au", descriptor = "[[B")
	byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!rl", name = "ax", descriptor = "J")
	public long aLong289;

	@OriginalMember(owner = "client!rl", name = "ap", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Lclient!tw;")
	Class584 aClass584_3;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	int anInt5410;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Lclient!xu;")
	Class671 aClass671_2;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ve;")
	Class611 aClass611_1 = new Class611();

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "Lclient!ve;")
	Class611 aClass611_2 = new Class611();

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!re;")
	Class528 aClass528_1 = new Class528(0, 0, 0, 0);

	@OriginalMember(owner = "client!rl", name = "ae", descriptor = "I")
	int anInt5404 = 0;

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
	int anInt5405 = 361014157;

	@OriginalMember(owner = "client!rl", name = "ah", descriptor = "I")
	int anInt5406 = 0;

	@OriginalMember(owner = "client!rl", name = "al", descriptor = "I")
	int anInt5407 = -2002956361;

	@OriginalMember(owner = "client!rl", name = "ai", descriptor = "I")
	int anInt5409 = 0;

	@OriginalMember(owner = "client!rl", name = "aq", descriptor = "Z")
	public boolean aBoolean799 = false;

	@OriginalMember(owner = "client!rl", name = "av", descriptor = "J")
	public long aLong290 = -1529257764138147785L;

	@OriginalMember(owner = "client!rl", name = "ao", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap10 = new HashMap();

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Z")
	boolean aBoolean798;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(Lclient!yf;I)V")
	static void method30777(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) 19);
		if (local16 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local16.aString154;
		}
	}

	@OriginalMember(owner = "client!rl", name = "ld", descriptor = "(Ljava/lang/String;Lclient!yf;I)[I")
	static int[] method30778(@OriginalArg(0) String arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			@Pc(25) int local25 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
			if (local25 > 0) {
				local1 = new int[local25];
				while (local25-- > 0) {
					local1[local25] = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!rl", name = "xs", descriptor = "(Lclient!yf;B)V")
	static void method30779(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class173.method23816(local13, local28, (byte) 0);
	}

	@OriginalMember(owner = "client!rl", name = "aik", descriptor = "(Lclient!yf;I)V")
	static void method30780(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (local23 == -1) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30448(local13, (byte) -45).method22374((char) local23, 1652710758);
		}
	}

	@OriginalMember(owner = "client!rl", name = "bfl", descriptor = "(Lclient!yf;B)V")
	static void method30781(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!rl", name = "aco", descriptor = "(Lclient!yf;I)V")
	static void method30782(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4805 * 2138173021;
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Z)V")
	public Class532(@OriginalArg(0) boolean arg0) {
		this.aBoolean798 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "(B)Lclient!re;")
	public Class528 method30619(@OriginalArg(0) byte arg0) {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "av", descriptor = "(B)Z")
	public boolean method30620(@OriginalArg(0) byte arg0) {
		if (!this.aBoolean798) {
			Class481.method29934(false, (byte) 5);
		}
		if (this.aLong290 * -8467614189479269767L == -1L) {
			this.aLong290 = Class305.method26889(548912792) * 1529257764138147785L;
		}
		this.anInt5404 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30273(this.anIntArray464[local23], -1675485462)) {
				this.anInt5404 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30250(this.aClass93_Sub1_Sub20_3.aString113, (byte) 1)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30232(this.aClass93_Sub1_Sub20_3.aString113, 455143186)) {
				this.aClass584_3 = Class443.method29049(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean622, (byte) 56);
			} else {
				this.anInt5404 += 968880165;
			}
		}
		if (this.anInt5404 * 1438297005 > 0) {
			if (this.anInt5405 * -1508419771 < this.anInt5404 * 1438297005) {
				this.anInt5405 = this.anInt5404 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_1.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_7.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_5.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_2.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_3.anInt5383 * -1655076145, (byte) 0);
			}
		}
		local23 = this.anInt5406 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5406 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5409 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(489657290)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, -968606712);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(-514693094)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, -1038525074);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5406 * -330761899 > 0) {
			if (local23 != this.anInt5406 * -330761899) {
				this.anInt5408 = client.anInt3485 * -176246917;
			} else if (this.anInt5408 * 766629811 != 0 && client.anInt3485 - this.anInt5408 * 766629811 == 1000) {
				Class389.method28444(local244.anInt5971 * -1287795829, local239.anInt5971 * -1287795829, this.anInt5406 * -330761899, 1454112597);
				Class591.method31877(1665619291);
			}
			if (this.anInt5407 * 1069530631 < this.anInt5406 * -330761899) {
				this.anInt5407 = this.anInt5406 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean798 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) 12) + Class430.aString216 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) -9);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean798 && Class274.aClass258_11 != null) {
			Class274.aClass258_11.method26125((short) -18542);
		}
		if (!this.aBoolean798) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean798) {
			Class700.method36897(true, (byte) -74);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1850397254) == 2) {
			for (local564 = 0; local564 < this.anInt5409 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16457(-1009300494), (byte) 93).anInt4245 * -2054577112;
		if (Class694.aClass104_14.method20441()) {
			local564++;
		}
		this.method30717((byte) -9);
		this.method30660(-506496005);
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local564, local556, Class694.aClass104_14.method20425() > 0);
		this.aClass585_24.method31613(false, 870300168);
		this.aClass585_24.method31611(client.anInt3536 * -1229702203, (byte) 24);
		this.aClass585_24.method31669(this.aHashMap10, (byte) 8);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31647(null, (byte) -18);
		} else {
			this.aClass585_24.method31647(Class707.aClass106_13, (byte) -23);
		}
		this.aClass528_1 = new Class528();
		this.aFloat331 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878(-662808309);
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 32299) * -822224463;
		this.aClass142_Sub1_1.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-2110247603) == 2;
		this.aClass142_Sub1_1.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-913870819) == 1;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(-594086045) == 1;
		this.aClass142_Sub1_1.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1712662284) == 1;
		if (this.aClass526_9.method30562(1476176594)) {
			this.method30664(this.aClass142_Sub1_1, this.aByteArrayArray19, 808347715);
		} else {
			this.method30663(this.aClass142_Sub1_1, this.aByteArrayArray19, -142052873);
		}
		if (this.aBoolean798) {
			this.method30662(50, -2065918820);
		}
		this.aClass671_2.method33156(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 976240573);
		this.aClass671_2.method33168(this, (byte) 3);
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878(-662808309);
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 27235) * -822224463;
			this.aClass142_Sub1_2.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-2106041369) == 2;
			this.aClass142_Sub1_2.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-2106589326) == 1;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(-1598575017) == 1;
			this.aClass142_Sub1_2.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(830169163) == 1;
			if (this.aClass526_9.method30562(403662090)) {
				this.method30664(this.aClass142_Sub1_2, this.aByteArrayArray21, 808347715);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			} else {
				this.method30663(this.aClass142_Sub1_2, this.aByteArrayArray21, 1794070140);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0], 963054590);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null, 1828616087);
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, -1107483911);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 1544564019);
		if (this.aClass526_9.method30562(-2012482138)) {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30666(this.aClass142_Sub1_1, this.aByteArrayArray20, (short) 10926);
		} else {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30665(this.aClass142_Sub1_1, this.aByteArrayArray20, (byte) 1);
			if (this.aByteArrayArray17 != null) {
				this.method30667((byte) -31);
			}
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null, (byte) -87);
		if (this.aBoolean798) {
			this.method30662(75, 707955621);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false, (byte) -99);
		if (this.aBoolean798) {
			this.method30662(75, 843944896);
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			if (this.aClass526_9.method30562(2089216527)) {
				this.method30666(this.aClass142_Sub1_2, this.aByteArrayArray18, (short) 10295);
			} else {
				this.method30665(this.aClass142_Sub1_2, this.aByteArrayArray18, (byte) 1);
			}
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0], (byte) -21);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true, (byte) -43);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, 612855619);
			}
		}
		this.aClass142_Sub1_1.method10879((byte) 13);
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879((byte) 97);
		}
		this.aClass585_24.method31785(-1958047629);
		if (this.aBoolean798) {
			Class305.method26889(856131530);
			while (!Class694.aClass104_14.method20526(2114416749)) {
				this.method30662(1, 650763746);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean798) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30649(local1170, -1174191152);
			Class392.aClass541_1.method31087(local1170, -1200020909);
			local1165 = true;
			Class305.method26889(1902898457);
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean613 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30660(1021790522);
			this.method30659(3, 1529344753);
			this.method30751(-746365432);
		} else {
			Class274.aClass258_11.method26125((short) -11504);
			this.aClass671_2.method33162(481216265);
			Class238.method25893((byte) 4);
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5400 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5403 * -2134504113; local1238++) {
					Class518.method30486(local292, local319, local1238, 851528207);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31445(1845104818);
			}
		}
		Class262.method26266(1539319813);
		Class371.method28185((byte) -82);
		if (Class343.method27611((byte) 53) == Class555.aClass555_3 && client.aClass175_2.method24368((byte) -34) != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2, (byte) 99);
			local1296.aClass93_Sub41_Sub2_1.method22407(1057001181, (byte) -60);
			client.aClass175_2.method24363(local1296, -1945942613);
		}
		if (!this.aClass526_9.method30562(430582708)) {
			local292 = (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5398 * 562190567 + (this.anInt5400 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5403 * -2134504113 >> 4) + this.anInt5410 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30231(this.method30692(local1370, local1379, -2084510600), 44555846);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26889(-162422269) - this.aLong290 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29937(4, 1823202236);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29937(13, 1823202236);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29937(15, 1823202236);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29937(0, 1823202236);
		} else {
			Class481.method29937(18, 1823202236);
			if (client.aClass175_2.method24368((byte) 17) != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2, (byte) 115);
				local1466.aClass93_Sub41_Sub2_1.method22407((int) local1417, (byte) 44);
				client.aClass175_2.method24363(local1466, -1692792900);
			}
		}
		if (this.aBoolean799) {
			Class314.method27032(Long.toString(Class305.method26889(1023660026) - this.aLong289 * 1216641514968376055L), -1923394157);
			this.aBoolean799 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)Lclient!rg;")
	public Class529 method30621(@OriginalArg(0) int arg0) {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)I")
	public int method30622(@OriginalArg(0) int arg0) {
		return 100 - this.anInt5404 * 2095779732 / (this.anInt5405 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)I")
	public int method30623(@OriginalArg(0) int arg0) {
		return 100 - this.anInt5406 * 1283548468 / (this.anInt5407 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)Lclient!ve;")
	public Class611 method30624(@OriginalArg(0) int arg0) {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)I")
	public int method30625(@OriginalArg(0) int arg0) {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V")
	public void method30626(@OriginalArg(0) int arg0) {
		this.aClass529_5 = Class529.aClass529_3;
		this.anInt5404 = 0;
		this.anInt5405 = 361014157;
		this.anInt5406 = 0;
		this.anInt5407 = -2002956361;
		this.anInt5408 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "(I)V")
	public void method30627(@OriginalArg(0) int arg0) {
		this.aClass671_2.method33145(this, null, 0, 1887678729);
	}

	@OriginalMember(owner = "client!rl", name = "dn", descriptor = "()V")
	public void method30628() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)F")
	public float method30629(@OriginalArg(0) int arg0) {
		return this.aFloat331;
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(Lclient!aop;I)V")
	public void method30630(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) int arg1) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I")
	public int method30631(@OriginalArg(0) int arg0) {
		return this.anInt5401 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "cu", descriptor = "(I)[[B")
	public byte[][] method30632(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "(II)[[B")
	public byte[][] method30633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "ae", descriptor = "(ZI)V")
	public void method30634(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class684 local1 = null;
		if (this.aClass671_2 != null && arg0) {
			local1 = this.aClass671_2.method33146(1451562891);
		}
		this.aClass671_2 = new Class671(Class694.aClass104_14, Class110_Sub7.aClass497_22, this.anInt5400 * -1096901053 >> 3, this.anInt5403 * -2134504113 >> 3);
		if (local1 != null) {
			this.aClass671_2.method33145(this, local1, 0, 150822920);
		}
	}

	@OriginalMember(owner = "client!rl", name = "es", descriptor = "()V")
	void method30635() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method33076((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5, 1956369033);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219((byte) 77);
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ck", descriptor = "(Lclient!aop;)V")
	public void method30636(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)[[I")
	public int[][] method30637(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rl", name = "cg", descriptor = "()Lclient!tx;")
	public Class585 method30638() {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)[[[B")
	public byte[][][] method30639(@OriginalArg(0) byte arg0) {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)Lclient!tx;")
	public Class585 method30640(@OriginalArg(0) int arg0) {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lclient!aih;")
	public Class142_Sub1 method30641(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1;
	}

	@OriginalMember(owner = "client!rl", name = "ei", descriptor = "()V")
	void method30642() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method33076((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5, 176921945);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219((byte) 114);
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V")
	public void method30643(@OriginalArg(0) byte arg0) {
		this.aClass611_1 = new Class611();
		this.anInt5410 = 0;
		this.anInt5398 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)V")
	public void method30644(@OriginalArg(0) byte arg0) {
		if (this.aClass585_24 != null) {
			Class54.method14857((short) 2665);
			this.aHashMap10 = this.aClass585_24.method31643(280011262);
			this.aClass585_24.aClass569_2.method31481(636969007);
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "bo", descriptor = "()I")
	public int method30645() {
		return this.anInt5403 * -2134504113;
	}

	@OriginalMember(owner = "client!rl", name = "ai", descriptor = "(Lclient!rt;I)V")
	public void method30646(@OriginalArg(0) Class537 arg0, @OriginalArg(1) int arg1) {
		this.aClass526_9 = arg0.aClass526_11;
		if (this.aClass526_9 == Class526.aClass526_1) {
			this.method30670((byte) -109);
		} else if (this.aClass526_9 == Class526.aClass526_8) {
			this.method30653(arg0.aClass93_Sub41_Sub2_3, 1728946347);
		} else if (this.aClass526_9 == Class526.aClass526_2) {
			this.method30721(-729120784);
		} else if (this.aClass526_9.method30562(-1338519550)) {
			this.method30673(arg0.aClass93_Sub41_Sub2_3, -911798147);
		}
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)Lclient!aop;")
	public Class32_Sub14 method30647(@OriginalArg(0) int arg0) {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "bl", descriptor = "()Lclient!rg;")
	public Class529 method30648() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "al", descriptor = "(Lclient!rl;I)V")
	void method30649(@OriginalArg(0) Class532 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) boolean local2 = arg0.aBoolean798;
		arg0.aBoolean798 = this.aBoolean798;
		this.aBoolean798 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method33157(arg0.method30713((byte) 8), -18199345);
	}

	@OriginalMember(owner = "client!rl", name = "ac", descriptor = "(B)V")
	public void method30650(@OriginalArg(0) byte arg0) {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dt", descriptor = "()V")
	public void method30651() {
		this.anInt5402 = 1662753784;
		if (this.anInt5400 * -1096901053 == 0) {
			this.anInt5401 = -1072245262;
		} else {
			this.anInt5401 = (int) ((double) (this.anInt5400 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5401 = (this.anInt5401 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20441()) {
			this.anInt5401 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "bg", descriptor = "()F")
	public float method30652() {
		return this.aFloat331;
	}

	@OriginalMember(owner = "client!rl", name = "as", descriptor = "(Lclient!ase;I)V")
	void method30653(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22455(2076110037);
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(14) int local14 = arg0.method22511(1960426441);
		@Pc(18) int local18 = arg0.method22425((short) 16384);
		@Pc(22) int local22 = arg0.method22455(2099809999);
		@Pc(31) boolean local31 = arg0.method22511(2121037556) == 1;
		if (!this.aBoolean798) {
			this.method30751(844149832);
		}
		this.method30688(Class260.method26251(local18, (byte) -1), -2124122269);
		this.anIntArray465 = new int[local14];
		this.anIntArray464 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5400 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5400 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5403 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5403 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local84, local107, -1847472196), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -55)) {
					this.anIntArray465[local14] = (local84 << 8) + local107;
					this.anIntArray464[local14] = this.method30692(local84, local107, -1801615758);
					local14++;
				}
			}
		}
		this.anInt5409 = local14 * -1132609489;
		this.method30726(local3, local22, 3, local31, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "di", descriptor = "()V")
	public void method30654() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(S)I")
	public int method30655(@OriginalArg(0) short arg0) {
		return this.anInt5403 * -2134504113;
	}

	@OriginalMember(owner = "client!rl", name = "en", descriptor = "(Lclient!aih;[[B)V")
	void method30656(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 13081);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, -533819184);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, (byte) -24);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) -3968);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8, -650106232);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public int method30657(@OriginalArg(0) int arg0) {
		return this.anInt5402 * -1297647513;
	}

	@OriginalMember(owner = "client!rl", name = "cq", descriptor = "()[[I")
	public int[][] method30658() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rl", name = "aq", descriptor = "(II)V")
	void method30659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = this.aClass611_1.anInt5784 * 270611681 - this.aClass611_2.anInt5784 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5785 * -1994307635 - this.aClass611_2.anInt5785 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29711(local43.method24241().aClass472_61);
					local73.aFloat325 -= local11 * 512;
					local73.aFloat327 -= local23 * 512;
					local43.method24236(local73);
					local73.method29713();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5400 * 1027376640 - 512;
			local117 = this.anInt5403 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29711(local134.method24241().aClass472_61);
					local139.aFloat325 -= local11 * 512;
					local139.aFloat327 -= local23 * 512;
					local134.method24236(local139);
					if ((int) local139.aFloat325 >= 0 && (int) local139.aFloat325 <= local110 && (int) local139.aFloat327 >= 0 && (int) local139.aFloat327 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5400 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5403 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18601(null, 852195418);
							local128.method23981(550798244);
							local101 = true;
						}
					} else {
						local134.method18601(null, -1747561648);
						local128.method23981(1660410529);
						local101 = true;
					}
					local139.method29713();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218(636521333) * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29711(local311.method24241().aClass472_61);
				local344.aFloat325 -= local11 * 512;
				local344.aFloat327 -= local23 * 512;
				local311.method24236(local344);
				local344.method29713();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 73); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(1659946316)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, 241316374);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(-1280032212);
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445((byte) 44); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415(385236094)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, -1350721914);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(-22098722);
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220((byte) -45); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222(1581925329)) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5785 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5400 * -1096901053 && local668 < this.anInt5403 * -2134504113 && local650 < this.aClass585_24.anInt5604 * -200159665 && local668 < this.aClass585_24.anInt5605 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31652(local117, local650, local668, (byte) 0);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23981(145958093);
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36933(false, (byte) 1);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt5047 -= local23 * 183720448;
			if (Class429.anInt4942 * -1453926679 != 4 && Class429.anInt4942 * -1453926679 != 3) {
				Class322.method27367(Class20.method376(1836476577), 1452588171);
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5450 -= local11 * 175543751;
			Class349.anInt4242 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3925 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5400 * -1096901053 || Math.abs(local23) > this.anInt5403 * -2134504113) {
				this.aClass671_2.method33184(-2038943944);
			}
		}
		Class380.method28301((byte) 91);
		Class360.method27982((short) -25363);
		client.aClass16_21.method219((byte) 98);
		client.aClass22_46.method406(-2037259486);
		client.aClass21_6.method378(-2066730760);
		Class286.method26618((byte) 24);
	}

	@OriginalMember(owner = "client!rl", name = "ax", descriptor = "(I)V")
	void method30660(@OriginalArg(0) int arg0) {
		this.aClass142_Sub1_2 = null;
		this.aClass142_Sub1_1 = null;
		if (this.aClass520_3 != null) {
			this.aClass520_3.method30507(191201242);
		}
		if (this.aClass671_2 != null) {
			this.aClass671_2.method33163((byte) 1);
		}
		if (this.aClass585_24 != null) {
			this.aClass585_24.aClass569_2.method31481(2100759172);
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "br", descriptor = "()F")
	public float method30661() {
		return this.aFloat331;
	}

	@OriginalMember(owner = "client!rl", name = "ao", descriptor = "(II)V")
	void method30662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "aj", descriptor = "(Lclient!aih;[[BI)V")
	void method30663(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray465[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray465[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5784 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) -4422);
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635, (byte) 38);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52, (byte) 16);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray465[local4] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(120) int local120 = (this.anIntArray465[local4] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5410 * 1028227575 < 800) {
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) -21519);
				}
				arg0.method10909(local105, local120, 64, 64, 1752647135);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ay", descriptor = "(Lclient!aih;[[BI)V")
	void method30664(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) -7562);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, -2060345145);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, (byte) 59);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 4609);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8, -1529430398);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "(Lclient!aih;[[BB)V")
	void method30665(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5409 * 412583631; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(29) int local29 = (this.anIntArray465[local1] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				@Pc(44) int local44 = (this.anIntArray465[local1] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (!this.aBoolean798) {
					Class274.aClass258_11.method26125((short) -16678);
				}
				arg0.method10976(Class694.aClass104_14, local11, local29, local44, -1411998358);
				if (this.aBoolean798) {
					this.method30662(10, -698229797);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "az", descriptor = "(Lclient!aih;[[BS)V")
	void method30666(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) short arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 6027);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 1056190302);
									break;
								}
							}
						}
					}
					if (this.aBoolean798) {
						this.method30662(5, -680600408);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "aa", descriptor = "(B)V")
	void method30667(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = this.aByteArrayArray17.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray17[local5] != null) {
				@Pc(16) int local16 = -1;
				for (@Pc(18) int local18 = 0; local18 < client.anInt3508 * -226108971; local18++) {
					if (client.anIntArray308[local18] == this.anIntArray465[local5]) {
						local16 = local18;
						break;
					}
				}
				if (local16 == -1) {
					client.anIntArray308[client.anInt3508 * -226108971] = this.anIntArray465[local5];
					local16 = (client.anInt3508 += 1216911229) * -226108971 - 1;
				}
				@Pc(66) Class93_Sub41 local66 = new Class93_Sub41(this.aByteArrayArray17[local5]);
				@Pc(68) int local68 = 0;
				while (local66.anInt3070 * 212851357 < this.aByteArrayArray17[local5].length && local68 < 511 && client.anInt3540 * 568731113 < 1023) {
					@Pc(94) int local94 = local16 | local68++ << 6;
					@Pc(98) int local98 = local66.method22427(-1434290800);
					@Pc(102) int local102 = local98 >> 14;
					@Pc(108) int local108 = local98 >> 7 & 0x3F;
					@Pc(112) int local112 = local98 & 0x3F;
					@Pc(129) int local129 = local108 + ((this.anIntArray465[local5] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681);
					@Pc(146) int local146 = (this.anIntArray465[local5] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635 + local112;
					@Pc(154) Class336 local154 = (Class336) Class162.aClass32_Sub3_2.method18273(local66.method22427(-1434290800), -1024135375);
					@Pc(160) Class93_Sub15 local160 = (Class93_Sub15) client.aClass16_18.method215((long) local94);
					if (local160 == null && (local154.aByte137 & 0x1) > 0 && local129 >= 0 && local129 + local154.anInt4195 * 447008399 < this.anInt5400 * -1096901053 && local146 >= 0 && local154.anInt4195 * 447008399 + local146 < this.anInt5403 * -2134504113) {
						@Pc(199) Class132_Sub1_Sub1_Sub1_Sub1 local199 = new Class132_Sub1_Sub1_Sub1_Sub1(this.aClass585_24);
						local199.anInt2768 = local94 * 171759809;
						@Pc(209) Class93_Sub15 local209 = new Class93_Sub15(local199);
						client.aClass16_18.method221(local209, (long) local94);
						client.aClass93_Sub15Array1[(client.anInt3488 += 436180911) * -1814159537 - 1] = local209;
						client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local94;
						local199.anInt2786 = client.anInt3485 * 632844529;
						local199.method18601(local154, -1344920544);
						local199.method19973(local199.aClass336_1.anInt4195 * 447008399, -2142170693);
						local199.anInt2788 = (local199.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
						local199.method19964(local199.aClass336_1.aClass706_1.method36918(-1466068232).method37101() << 11 & 0x3FFF, true, -1247975766);
						local199.method18604(local102, local129, local146, true, local199.method20009(1910086703), (byte) -9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "eu", descriptor = "(II)I")
	int method30668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!rl", name = "bk", descriptor = "()Lclient!rg;")
	public Class529 method30669() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "aw", descriptor = "(B)V")
	void method30670(@OriginalArg(0) byte arg0) {
		this.method30688(Class260.method26251(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15623((byte) -92), (byte) -1), -1975538512);
		@Pc(14) int local14 = this.aClass611_1.anInt5784 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5785 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3925 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5370 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20067(8, 8, (byte) 1);
		@Pc(52) byte local52 = 18;
		this.anIntArray465 = new int[local52];
		this.anIntArray464 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5400 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5400 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5403 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5403 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local116, -1963002823), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -58)) {
					this.anIntArray465[local82] = local134;
					this.anIntArray464[local82] = this.method30692(local93, local116, -1668919738);
					local82++;
				}
			}
		}
		this.anInt5409 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30726(local30, local40, local178, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "bf", descriptor = "()Lclient!rc;")
	public Class526 method30671() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "([[[BI)V")
	public void method30672(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "at", descriptor = "(Lclient!ase;I)V")
	void method30673(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(10) int local10 = arg0.method22425((short) 16384);
		@Pc(14) int local14 = arg0.method22425((short) 16384);
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22427(-1434290800);
		@Pc(49) int local49 = arg0.method22469(2081456539);
		@Pc(53) int local53 = arg0.method22461(1943508756);
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean798) {
			this.method30751(-1373073187);
		}
		this.method30688(Class260.method26251(local10, (byte) -1), -1708874007);
		arg0.method22680((byte) -47);
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5400 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5403 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22701(1, -775900283);
					if (local111 == 1) {
						local119 = arg0.method22701(26, -1176616120);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22682(-226547952);
		local83 = local81.size();
		this.anIntArray465 = new int[local83];
		this.anIntArray464 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5400 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5403 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray465[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30229(this.method30692(local268, local295, -1479429319), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -18)) {
								this.anIntArray465[local83] = local150;
								this.anIntArray464[local83] = this.method30692(local268, local295, -1626735284);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5409 = local83 * -1132609489;
		this.method30726(local45, local49, 3, local62, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "bh", descriptor = "()Lclient!rg;")
	public Class529 method30674() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "bx", descriptor = "()I")
	public int method30675() {
		return 100 - this.anInt5404 * 2095779732 / (this.anInt5405 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "bd", descriptor = "()I")
	public int method30676() {
		return 100 - this.anInt5404 * 2095779732 / (this.anInt5405 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "ak", descriptor = "()Lclient!rc;")
	public Class526 method30677() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "bi", descriptor = "()I")
	public int method30678() {
		return 100 - this.anInt5406 * 1283548468 / (this.anInt5407 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "af", descriptor = "()Lclient!rc;")
	public Class526 method30679() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "bt", descriptor = "()Lclient!ve;")
	public Class611 method30680() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bq", descriptor = "()Lclient!ve;")
	public Class611 method30681() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bm", descriptor = "()Lclient!ve;")
	public Class611 method30682() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "()I")
	public int method30683() {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "be", descriptor = "()I")
	public int method30684() {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "by", descriptor = "()I")
	public int method30685() {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bu", descriptor = "()I")
	public int method30686() {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bw", descriptor = "()I")
	public int method30687() {
		return this.anInt5400 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "au", descriptor = "(Lclient!ib;I)V")
	void method30688(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5400 = (this.anInt5403 = -1148791279 * arg0.anInt4189) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5400 * -1096901053 >> 3][this.anInt5403 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113);
		this.method30634(false, -1234098612);
		Class165.method15331(-1457747304);
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "bz", descriptor = "()Lclient!re;")
	public Class528 method30689() {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)Lclient!qx;")
	public Class520 method30690(@OriginalArg(0) int arg0) {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "cj", descriptor = "(Lclient!aop;)V")
	public void method30691(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "am", descriptor = "(III)I")
	int method30692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!rl", name = "ba", descriptor = "()I")
	public int method30693() {
		return this.anInt5402 * -1297647513;
	}

	@OriginalMember(owner = "client!rl", name = "bp", descriptor = "()I")
	public int method30694() {
		return this.anInt5401 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "bj", descriptor = "()I")
	public int method30695() {
		return this.anInt5401 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "bs", descriptor = "()I")
	public int method30696() {
		return this.anInt5401 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "cl", descriptor = "()Lclient!tx;")
	public Class585 method30697() {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "ci", descriptor = "(I)[[B")
	public byte[][] method30698(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "ce", descriptor = "(I)[[B")
	public byte[][] method30699(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "dd", descriptor = "()V")
	public void method30700() {
		if (this.aClass585_24 != null) {
			Class54.method14857((short) 6435);
			this.aHashMap10 = this.aClass585_24.method31643(1683803206);
			this.aClass585_24.aClass569_2.method31481(407886046);
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "em", descriptor = "(I)V")
	void method30701(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5784 * 270611681 - this.aClass611_2.anInt5784 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5785 * -1994307635 - this.aClass611_2.anInt5785 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29711(local43.method24241().aClass472_61);
					local73.aFloat325 -= local11 * 512;
					local73.aFloat327 -= local23 * 512;
					local43.method24236(local73);
					local73.method29713();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5400 * 1027376640 - 512;
			local117 = this.anInt5403 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29711(local134.method24241().aClass472_61);
					local139.aFloat325 -= local11 * 512;
					local139.aFloat327 -= local23 * 512;
					local134.method24236(local139);
					if ((int) local139.aFloat325 >= 0 && (int) local139.aFloat325 <= local110 && (int) local139.aFloat327 >= 0 && (int) local139.aFloat327 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5400 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5403 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18601(null, 173420798);
							local128.method23981(-1817633542);
							local101 = true;
						}
					} else {
						local134.method18601(null, 370138668);
						local128.method23981(1511766485);
						local101 = true;
					}
					local139.method29713();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218(-638486597) * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29711(local311.method24241().aClass472_61);
				local344.aFloat325 -= local11 * 512;
				local344.aFloat327 -= local23 * 512;
				local311.method24236(local344);
				local344.method29713();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 127); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(1276487582)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, -1392865124);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(523728461);
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445((byte) 104); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415(1460342415)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, -1562711448);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(-1161609524);
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220((byte) -9); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222(1723658883)) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5785 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5400 * -1096901053 && local668 < this.anInt5403 * -2134504113 && local650 < this.aClass585_24.anInt5604 * -200159665 && local668 < this.aClass585_24.anInt5605 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31652(local117, local650, local668, (byte) 0);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23981(-1734421429);
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36933(false, (byte) 1);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt5047 -= local23 * 183720448;
			if (Class429.anInt4942 * -1453926679 != 4 && Class429.anInt4942 * -1453926679 != 3) {
				Class322.method27367(Class20.method376(1387892749), 2085808841);
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5450 -= local11 * 175543751;
			Class349.anInt4242 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3925 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5400 * -1096901053 || Math.abs(local23) > this.anInt5403 * -2134504113) {
				this.aClass671_2.method33184(-933882108);
			}
		}
		Class380.method28301((byte) 23);
		Class360.method27982((short) 19333);
		client.aClass16_21.method219((byte) 124);
		client.aClass22_46.method406(-2037259486);
		client.aClass21_6.method378(-2038358729);
		Class286.method26618((byte) 24);
	}

	@OriginalMember(owner = "client!rl", name = "cn", descriptor = "()Lclient!qx;")
	public Class520 method30702() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "da", descriptor = "(Z)V")
	public void method30703(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class684 local1 = null;
		if (this.aClass671_2 != null && arg0) {
			local1 = this.aClass671_2.method33146(1423169690);
		}
		this.aClass671_2 = new Class671(Class694.aClass104_14, Class110_Sub7.aClass497_22, this.anInt5400 * -1096901053 >> 3, this.anInt5403 * -2134504113 >> 3);
		if (local1 != null) {
			this.aClass671_2.method33145(this, local1, 0, 1182764136);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ct", descriptor = "()Lclient!xu;")
	public Class671 method30704() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "ca", descriptor = "()Lclient!qx;")
	public Class520 method30705() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "an", descriptor = "()Lclient!rc;")
	public Class526 method30706() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "cw", descriptor = "()Lclient!xu;")
	public Class671 method30707() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "fg", descriptor = "(Lclient!aih;[[B)V")
	void method30708(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) -24616);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 237531673);
									break;
								}
							}
						}
					}
					if (this.aBoolean798) {
						this.method30662(5, -1157812212);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "cf", descriptor = "()Lclient!aop;")
	public Class32_Sub14 method30709() {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "co", descriptor = "()Lclient!aop;")
	public Class32_Sub14 method30710() {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "cr", descriptor = "()[[I")
	public int[][] method30711() {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rl", name = "bc", descriptor = "()I")
	public int method30712() {
		return 100 - this.anInt5404 * 2095779732 / (this.anInt5405 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "(B)Lclient!xu;")
	public Class671 method30713(@OriginalArg(0) byte arg0) {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "ch", descriptor = "()[[[B")
	public byte[][][] method30714() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "fm", descriptor = "(Lclient!aih;[[B)V")
	void method30715(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 728);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, -940284197);
									break;
								}
							}
						}
					}
					if (this.aBoolean798) {
						this.method30662(5, 233221519);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "cs", descriptor = "()[[[B")
	public byte[][][] method30716() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "ah", descriptor = "(B)V")
	public void method30717(@OriginalArg(0) byte arg0) {
		this.anInt5402 = 1662753784;
		if (this.anInt5400 * -1096901053 == 0) {
			this.anInt5401 = -1072245262;
		} else {
			this.anInt5401 = (int) ((double) (this.anInt5400 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5401 = (this.anInt5401 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20441()) {
			this.anInt5401 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "cc", descriptor = "([[[B)V")
	public void method30718(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "cz", descriptor = "()Lclient!aih;")
	public Class142_Sub1 method30719() {
		return this.aClass142_Sub1_1;
	}

	@OriginalMember(owner = "client!rl", name = "cd", descriptor = "()V")
	public void method30720() {
		this.aClass611_1 = new Class611();
		this.anInt5410 = 0;
		this.anInt5398 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "ad", descriptor = "(I)V")
	void method30721(@OriginalArg(0) int arg0) {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -2118820929);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 41); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(987089514)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 46); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(894230274)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -1598900781), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 35)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1698922358);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "bv", descriptor = "()Lclient!re;")
	public Class528 method30722() {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "cy", descriptor = "([[[B)V")
	public void method30723(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "dr", descriptor = "()V")
	public void method30724() {
		this.aClass529_5 = Class529.aClass529_3;
		this.anInt5404 = 0;
		this.anInt5405 = 361014157;
		this.anInt5406 = 0;
		this.anInt5407 = -2002956361;
		this.anInt5408 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Lclient!rc;")
	public Class526 method30725(@OriginalArg(0) int arg0) {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ap", descriptor = "(IIIZB)V")
	void method30726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (client.anInt3463 * 1819062465 == 4) {
			if (this.aBoolean798) {
				throw new IllegalStateException();
			}
			client.anInt3463 = 1167039939;
			client.anInt3462 = -654237073;
		}
		if (!arg3 && arg0 == this.anInt5398 * 562190567 && this.anInt5410 * 1028227575 == arg1) {
			return;
		}
		this.anInt5398 = arg0 * 1982151383;
		this.anInt5410 = arg1 * -1256878137;
		if (!this.aBoolean798) {
			Class481.method29937(arg2, 1823202236);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) -38), true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) 91);
		}
		if (this.aClass611_1 == null) {
			this.aClass611_2 = new Class611(0, 0, 0);
		} else {
			this.aClass611_2 = this.aClass611_1;
		}
		this.aClass611_1 = new Class611(0, (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) * 8, (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) * 8);
		this.aClass93_Sub1_Sub20_3 = Class159.method14508(this.anInt5400 * -1096901053 / 2 + this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635 + this.anInt5400 * -1096901053 / 2);
		this.aClass584_3 = null;
		this.aLong290 = -1529257764138147785L;
		if (!this.aBoolean798) {
			this.method30659(arg2, 857541004);
		}
	}

	@OriginalMember(owner = "client!rl", name = "do", descriptor = "()V")
	public void method30727() {
		this.anInt5402 = 1662753784;
		if (this.anInt5400 * -1096901053 == 0) {
			this.anInt5401 = -1072245262;
		} else {
			this.anInt5401 = (int) ((double) (this.anInt5400 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5401 = (this.anInt5401 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20441()) {
			this.anInt5401 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "dz", descriptor = "()V")
	public void method30728() {
		this.anInt5402 = 1662753784;
		if (this.anInt5400 * -1096901053 == 0) {
			this.anInt5401 = -1072245262;
		} else {
			this.anInt5401 = (int) ((double) (this.anInt5400 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5401 = (this.anInt5401 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20441()) {
			this.anInt5401 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "dv", descriptor = "(Lclient!rl;)V")
	void method30729(@OriginalArg(0) Class532 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean798;
		arg0.aBoolean798 = this.aBoolean798;
		this.aBoolean798 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method33157(arg0.method30713((byte) -13), -30177415);
	}

	@OriginalMember(owner = "client!rl", name = "dm", descriptor = "(Lclient!rl;)V")
	void method30730(@OriginalArg(0) Class532 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean798;
		arg0.aBoolean798 = this.aBoolean798;
		this.aBoolean798 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method33157(arg0.method30713((byte) 2), 258652904);
	}

	@OriginalMember(owner = "client!rl", name = "dq", descriptor = "()V")
	public void method30731() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dc", descriptor = "()V")
	public void method30732() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ev", descriptor = "(I)V")
	void method30733(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5784 * 270611681 - this.aClass611_2.anInt5784 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5785 * -1994307635 - this.aClass611_2.anInt5785 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29711(local43.method24241().aClass472_61);
					local73.aFloat325 -= local11 * 512;
					local73.aFloat327 -= local23 * 512;
					local43.method24236(local73);
					local73.method29713();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5400 * 1027376640 - 512;
			local117 = this.anInt5403 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29711(local134.method24241().aClass472_61);
					local139.aFloat325 -= local11 * 512;
					local139.aFloat327 -= local23 * 512;
					local134.method24236(local139);
					if ((int) local139.aFloat325 >= 0 && (int) local139.aFloat325 <= local110 && (int) local139.aFloat327 >= 0 && (int) local139.aFloat327 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5400 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5403 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18601(null, -397094597);
							local128.method23981(-1213768181);
							local101 = true;
						}
					} else {
						local134.method18601(null, -725106520);
						local128.method23981(1074023186);
						local101 = true;
					}
					local139.method29713();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218(-94463022) * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29711(local311.method24241().aClass472_61);
				local344.aFloat325 -= local11 * 512;
				local344.aFloat327 -= local23 * 512;
				local311.method24236(local344);
				local344.method29713();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 58); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(339156053)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, 226639903);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(-899528842);
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445((byte) 26); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415(790845587)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, 1166350140);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(1798183295);
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220((byte) -2); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222(2068521561)) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5785 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5400 * -1096901053 && local668 < this.anInt5403 * -2134504113 && local650 < this.aClass585_24.anInt5604 * -200159665 && local668 < this.aClass585_24.anInt5605 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31652(local117, local650, local668, (byte) 0);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23981(1248966111);
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36933(false, (byte) 1);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt5047 -= local23 * 183720448;
			if (Class429.anInt4942 * -1453926679 != 4 && Class429.anInt4942 * -1453926679 != 3) {
				Class322.method27367(Class20.method376(1034177989), -440247363);
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5450 -= local11 * 175543751;
			Class349.anInt4242 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3925 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5400 * -1096901053 || Math.abs(local23) > this.anInt5403 * -2134504113) {
				this.aClass671_2.method33184(-1783485401);
			}
		}
		Class380.method28301((byte) 74);
		Class360.method27982((short) 8995);
		client.aClass16_21.method219((byte) 126);
		client.aClass22_46.method406(-2037259486);
		client.aClass21_6.method378(-2053208393);
		Class286.method26618((byte) 24);
	}

	@OriginalMember(owner = "client!rl", name = "dk", descriptor = "()V")
	public void method30734() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "et", descriptor = "(Lclient!aih;[[B)V")
	void method30735(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray465[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray465[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5784 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) 23984);
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635, (byte) 101);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52, (byte) 29);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray465[local4] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(120) int local120 = (this.anIntArray465[local4] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5410 * 1028227575 < 800) {
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) -16724);
				}
				arg0.method10909(local105, local120, 64, 64, 988887068);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "df", descriptor = "()V")
	public void method30736() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dw", descriptor = "()V")
	public void method30737() {
		if (this.aBoolean798) {
			this.method30626(1213218812);
			this.aLong290 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5409 = local10.anInt5409;
			this.anIntArray465 = local10.anIntArray465;
			this.anIntArray464 = local10.anIntArray464;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5402 = local10.anInt5402;
			this.anInt5401 = local10.anInt5401;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5398 = local10.anInt5398;
			this.anInt5410 = local10.anInt5410;
			this.anInt5400 = local10.anInt5400;
			this.anInt5403 = local10.anInt5403;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29937(10, 1823202236);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29937(6, 1823202236);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29937(16, 1823202236);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29937(3, 1823202236);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29937(8, 1823202236);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ds", descriptor = "()V")
	void method30738() {
		this.method30688(Class260.method26251(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15623((byte) 101), (byte) -1), -1557975587);
		@Pc(14) int local14 = this.aClass611_1.anInt5784 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5785 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3925 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5370 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20067(8, 8, (byte) 1);
		@Pc(52) byte local52 = 18;
		this.anIntArray465 = new int[local52];
		this.anIntArray464 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5400 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5400 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5403 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5403 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local116, -2070662886), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -10)) {
					this.anIntArray465[local82] = local134;
					this.anIntArray464[local82] = this.method30692(local93, local116, -1656336124);
					local82++;
				}
			}
		}
		this.anInt5409 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30726(local30, local40, local178, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "du", descriptor = "()V")
	void method30739() {
		this.method30688(Class260.method26251(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15623((byte) 28), (byte) -1), -2078397487);
		@Pc(14) int local14 = this.aClass611_1.anInt5784 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5785 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3925 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5370 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20067(8, 8, (byte) 1);
		@Pc(52) byte local52 = 18;
		this.anIntArray465 = new int[local52];
		this.anIntArray464 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5400 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5400 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5403 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5403 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local116, -1680479225), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 58)) {
					this.anIntArray465[local82] = local134;
					this.anIntArray464[local82] = this.method30692(local93, local116, -2010601607);
					local82++;
				}
			}
		}
		this.anInt5409 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30726(local30, local40, local178, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "dl", descriptor = "(Lclient!ase;)V")
	void method30740(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22455(2072277742);
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(14) int local14 = arg0.method22511(1251659304);
		@Pc(18) int local18 = arg0.method22425((short) 16384);
		@Pc(22) int local22 = arg0.method22455(1749461057);
		@Pc(31) boolean local31 = arg0.method22511(1266878786) == 1;
		if (!this.aBoolean798) {
			this.method30751(-852651099);
		}
		this.method30688(Class260.method26251(local18, (byte) -1), -1834447189);
		this.anIntArray465 = new int[local14];
		this.anIntArray464 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5400 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5400 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5403 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5403 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local84, local107, -1697127862), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 17)) {
					this.anIntArray465[local14] = (local84 << 8) + local107;
					this.anIntArray464[local14] = this.method30692(local84, local107, -1674555697);
					local14++;
				}
			}
		}
		this.anInt5409 = local14 * -1132609489;
		this.method30726(local3, local22, 3, local31, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "dp", descriptor = "(Lclient!ase;)V")
	void method30741(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22455(1914141062);
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(14) int local14 = arg0.method22511(1867498403);
		@Pc(18) int local18 = arg0.method22425((short) 16384);
		@Pc(22) int local22 = arg0.method22455(2144512557);
		@Pc(31) boolean local31 = arg0.method22511(2039759102) == 1;
		if (!this.aBoolean798) {
			this.method30751(-879054990);
		}
		this.method30688(Class260.method26251(local18, (byte) -1), -1947901846);
		this.anIntArray465 = new int[local14];
		this.anIntArray464 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5400 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5400 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5403 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5403 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local84, local107, -1950674194), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 68)) {
					this.anIntArray465[local14] = (local84 << 8) + local107;
					this.anIntArray464[local14] = this.method30692(local84, local107, -1559324071);
					local14++;
				}
			}
		}
		this.anInt5409 = local14 * -1132609489;
		this.method30726(local3, local22, 3, local31, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "dy", descriptor = "(Lclient!ase;)V")
	void method30742(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22455(1875725968);
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(14) int local14 = arg0.method22511(1751642296);
		@Pc(18) int local18 = arg0.method22425((short) 16384);
		@Pc(22) int local22 = arg0.method22455(1732019439);
		@Pc(31) boolean local31 = arg0.method22511(1321218599) == 1;
		if (!this.aBoolean798) {
			this.method30751(1252025114);
		}
		this.method30688(Class260.method26251(local18, (byte) -1), -1752739265);
		this.anIntArray465 = new int[local14];
		this.anIntArray464 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5400 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5400 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5403 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5403 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local84, local107, -1996262767), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -103)) {
					this.anIntArray465[local14] = (local84 << 8) + local107;
					this.anIntArray464[local14] = this.method30692(local84, local107, -1898193468);
					local14++;
				}
			}
		}
		this.anInt5409 = local14 * -1132609489;
		this.method30726(local3, local22, 3, local31, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "db", descriptor = "(Lclient!ase;)V")
	void method30743(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22455(1925770789);
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(14) int local14 = arg0.method22511(1879506727);
		@Pc(18) int local18 = arg0.method22425((short) 16384);
		@Pc(22) int local22 = arg0.method22455(1670676838);
		@Pc(31) boolean local31 = arg0.method22511(1976826473) == 1;
		if (!this.aBoolean798) {
			this.method30751(1920534828);
		}
		this.method30688(Class260.method26251(local18, (byte) -1), -1854828677);
		this.anIntArray465 = new int[local14];
		this.anIntArray464 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5400 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5400 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5403 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5403 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30229(this.method30692(local84, local107, -1582309834), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -8)) {
					this.anIntArray465[local14] = (local84 << 8) + local107;
					this.anIntArray464[local14] = this.method30692(local84, local107, -1774055039);
					local14++;
				}
			}
		}
		this.anInt5409 = local14 * -1132609489;
		this.method30726(local3, local22, 3, local31, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "dh", descriptor = "(Lclient!ase;)V")
	void method30744(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(10) int local10 = arg0.method22425((short) 16384);
		@Pc(14) int local14 = arg0.method22425((short) 16384);
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22427(-1434290800);
		@Pc(49) int local49 = arg0.method22469(1566982549);
		@Pc(53) int local53 = arg0.method22461(2128919379);
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean798) {
			this.method30751(1464276366);
		}
		this.method30688(Class260.method26251(local10, (byte) -1), -2036196897);
		arg0.method22680((byte) -30);
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5400 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5403 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22701(1, -323512908);
					if (local111 == 1) {
						local119 = arg0.method22701(26, 887746890);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22682(844243881);
		local83 = local81.size();
		this.anIntArray465 = new int[local83];
		this.anIntArray464 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5400 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5403 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray465[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30229(this.method30692(local268, local295, -1536324456), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 42)) {
								this.anIntArray465[local83] = local150;
								this.anIntArray464[local83] = this.method30692(local268, local295, -1557533140);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5409 = local83 * -1132609489;
		this.method30726(local45, local49, 3, local62, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "ej", descriptor = "()V")
	void method30745() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method33076((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5, 519126115);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219((byte) 82);
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "dg", descriptor = "()V")
	void method30746() {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -1822768379);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 79); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(1486255087)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 98); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(1307182559)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -1793713906), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 23)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1749426529);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "de", descriptor = "()V")
	void method30747() {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -1882292427);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 21); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(1398928328)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 124); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(2022102231)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -1526623021), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 59)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1818941557);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "dj", descriptor = "()V")
	void method30748() {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -2141516344);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 122); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(1720045404)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 14); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(1855868765)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -1978194757), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 64)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1934259750);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "eo", descriptor = "()V")
	void method30749() {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -1545540582);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 113); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(1395367412)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 26); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(953733723)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -1564153467), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -18)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1677251203);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "ey", descriptor = "()V")
	void method30750() {
		this.aClass526_10 = this.aClass526_9;
		this.method30688(Class332.aClass332_6, -1858228027);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5400 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5403 * -2134504113 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 53); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415(-23241966)) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray465 = new int[local9];
		this.anIntArray464 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445((byte) 81); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415(1617109214)) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray465[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30229(this.method30692(local93, local98, -2062257835), Class522.aClass522_1.anInt5383 * -1655076145, (byte) -36)) {
						this.anIntArray465[local9] = local103;
						this.anIntArray464[local9] = this.method30692(local93, local98, -1693851170);
						local9++;
					}
				}
			}
		}
		this.anInt5409 = local9 * -1132609489;
		this.method30726(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 3, false, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "ar", descriptor = "(I)V")
	void method30751(@OriginalArg(0) int arg0) {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method33076((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5, -2107502363);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219((byte) 86);
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ed", descriptor = "(Lclient!ib;)V")
	void method30752(@OriginalArg(0) Class332 arg0) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5400 = (this.anInt5403 = -1148791279 * arg0.anInt4189) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5400 * -1096901053 >> 3][this.anInt5403 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113);
		this.method30634(false, -1173280840);
		Class165.method15331(-884306803);
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "ee", descriptor = "(Lclient!ib;)V")
	void method30753(@OriginalArg(0) Class332 arg0) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5400 = (this.anInt5403 = -1148791279 * arg0.anInt4189) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5400 * -1096901053 >> 3][this.anInt5403 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5400 * -1096901053][this.anInt5403 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113);
		this.method30634(false, -1726284845);
		Class165.method15331(1182531295);
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "cv", descriptor = "()Lclient!qx;")
	public Class520 method30754() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(B)[[I")
	public int[][] method30755(@OriginalArg(0) byte arg0) {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rl", name = "el", descriptor = "()V")
	void method30756() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method33076((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5, 792412415);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219((byte) 118);
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "cx", descriptor = "()Lclient!xu;")
	public Class671 method30757() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "ep", descriptor = "(IIIZ)V")
	void method30758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3463 * 1819062465 == 4) {
			if (this.aBoolean798) {
				throw new IllegalStateException();
			}
			client.anInt3463 = 1167039939;
			client.anInt3462 = -654237073;
		}
		if (!arg3 && arg0 == this.anInt5398 * 562190567 && this.anInt5410 * 1028227575 == arg1) {
			return;
		}
		this.anInt5398 = arg0 * 1982151383;
		this.anInt5410 = arg1 * -1256878137;
		if (!this.aBoolean798) {
			Class481.method29937(arg2, 1823202236);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) 50), true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) 2);
		}
		if (this.aClass611_1 == null) {
			this.aClass611_2 = new Class611(0, 0, 0);
		} else {
			this.aClass611_2 = this.aClass611_1;
		}
		this.aClass611_1 = new Class611(0, (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) * 8, (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) * 8);
		this.aClass93_Sub1_Sub20_3 = Class159.method14508(this.anInt5400 * -1096901053 / 2 + this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635 + this.anInt5400 * -1096901053 / 2);
		this.aClass584_3 = null;
		this.aLong290 = -1529257764138147785L;
		if (!this.aBoolean798) {
			this.method30659(arg2, 291924187);
		}
	}

	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "()[[[B")
	public byte[][][] method30759() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "ec", descriptor = "(I)V")
	void method30760(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5784 * 270611681 - this.aClass611_2.anInt5784 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5785 * -1994307635 - this.aClass611_2.anInt5785 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29711(local43.method24241().aClass472_61);
					local73.aFloat325 -= local11 * 512;
					local73.aFloat327 -= local23 * 512;
					local43.method24236(local73);
					local73.method29713();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5400 * 1027376640 - 512;
			local117 = this.anInt5403 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29711(local134.method24241().aClass472_61);
					local139.aFloat325 -= local11 * 512;
					local139.aFloat327 -= local23 * 512;
					local134.method24236(local139);
					if ((int) local139.aFloat325 >= 0 && (int) local139.aFloat325 <= local110 && (int) local139.aFloat327 >= 0 && (int) local139.aFloat327 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5400 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5403 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18601(null, -1751581083);
							local128.method23981(939401610);
							local101 = true;
						}
					} else {
						local134.method18601(null, 1889121541);
						local128.method23981(-339239125);
						local101 = true;
					}
					local139.method29713();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218(2079715250) * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29711(local311.method24241().aClass472_61);
				local344.aFloat325 -= local11 * 512;
				local344.aFloat327 -= local23 * 512;
				local311.method24236(local344);
				local344.method29713();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 40); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(1472564079)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, -2012320857);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(435066053);
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445((byte) 84); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415(427596658)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, -251098048);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(269260538);
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220((byte) 27); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222(2027820181)) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5785 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5400 * -1096901053 && local668 < this.anInt5403 * -2134504113 && local650 < this.aClass585_24.anInt5604 * -200159665 && local668 < this.aClass585_24.anInt5605 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31652(local117, local650, local668, (byte) 0);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23981(-1801452539);
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36933(false, (byte) 1);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt5047 -= local23 * 183720448;
			if (Class429.anInt4942 * -1453926679 != 4 && Class429.anInt4942 * -1453926679 != 3) {
				Class322.method27367(Class20.method376(1237485698), -1881417422);
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5450 -= local11 * 175543751;
			Class349.anInt4242 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3925 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5400 * -1096901053 || Math.abs(local23) > this.anInt5403 * -2134504113) {
				this.aClass671_2.method33184(-180007906);
			}
		}
		Class380.method28301((byte) 53);
		Class360.method27982((short) 8);
		client.aClass16_21.method219((byte) 108);
		client.aClass22_46.method406(-2037259486);
		client.aClass21_6.method378(-1924450364);
		Class286.method26618((byte) 24);
	}

	@OriginalMember(owner = "client!rl", name = "ek", descriptor = "(I)V")
	void method30761(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5784 * 270611681 - this.aClass611_2.anInt5784 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5785 * -1994307635 - this.aClass611_2.anInt5785 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29711(local43.method24241().aClass472_61);
					local73.aFloat325 -= local11 * 512;
					local73.aFloat327 -= local23 * 512;
					local43.method24236(local73);
					local73.method29713();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5400 * 1027376640 - 512;
			local117 = this.anInt5403 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29711(local134.method24241().aClass472_61);
					local139.aFloat325 -= local11 * 512;
					local139.aFloat327 -= local23 * 512;
					local134.method24236(local139);
					if ((int) local139.aFloat325 >= 0 && (int) local139.aFloat325 <= local110 && (int) local139.aFloat327 >= 0 && (int) local139.aFloat327 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5400 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5403 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18601(null, -1472459372);
							local128.method23981(-2005174788);
							local101 = true;
						}
					} else {
						local134.method18601(null, 1885743483);
						local128.method23981(-1864017226);
						local101 = true;
					}
					local139.method29713();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218(200680693) * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29711(local311.method24241().aClass472_61);
				local344.aFloat325 -= local11 * 512;
				local344.aFloat327 -= local23 * 512;
				local311.method24236(local344);
				local344.method29713();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 127); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(1520188095)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, 973488404);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(1833975080);
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445((byte) 6); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415(905207288)) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18273(local407.anInt1468 * -1430483277, 24509535);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5769 * 427800467;
				local45 = local435.anInt5764 * -774442965;
			} else {
				local117 = local435.anInt5764 * -774442965;
				local45 = local435.anInt5769 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5400 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5403 * -2134504113)) {
				local407.method23981(1019704159);
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220((byte) 70); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222(2076220412)) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5785 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5400 * -1096901053 && local668 < this.anInt5403 * -2134504113 && local650 < this.aClass585_24.anInt5604 * -200159665 && local668 < this.aClass585_24.anInt5605 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31652(local117, local650, local668, (byte) 0);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23981(-1368368285);
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36933(false, (byte) 1);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt5047 -= local23 * 183720448;
			if (Class429.anInt4942 * -1453926679 != 4 && Class429.anInt4942 * -1453926679 != 3) {
				Class322.method27367(Class20.method376(1507858175), 488009948);
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5450 -= local11 * 175543751;
			Class349.anInt4242 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3925 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5400 * -1096901053 || Math.abs(local23) > this.anInt5403 * -2134504113) {
				this.aClass671_2.method33184(-408157657);
			}
		}
		Class380.method28301((byte) 49);
		Class360.method27982((short) 11408);
		client.aClass16_21.method219((byte) 86);
		client.aClass22_46.method406(-2037259486);
		client.aClass21_6.method378(-2054904072);
		Class286.method26618((byte) 24);
	}

	@OriginalMember(owner = "client!rl", name = "ea", descriptor = "(Lclient!aih;[[B)V")
	void method30762(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray465[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray465[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5784 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) -11777);
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635, (byte) 127);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52, (byte) 36);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray465[local4] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(120) int local120 = (this.anIntArray465[local4] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5410 * 1028227575 < 800) {
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) -3191);
				}
				arg0.method10909(local105, local120, 64, 64, 952696363);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "eh", descriptor = "()V")
	void method30763() {
		this.aClass142_Sub1_2 = null;
		this.aClass142_Sub1_1 = null;
		if (this.aClass520_3 != null) {
			this.aClass520_3.method30507(381699326);
		}
		if (this.aClass671_2 != null) {
			this.aClass671_2.method33163((byte) 1);
		}
		if (this.aClass585_24 != null) {
			this.aClass585_24.aClass569_2.method31481(851296430);
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "eq", descriptor = "()Z")
	public boolean method30764() {
		if (!this.aBoolean798) {
			Class481.method29934(false, (byte) 5);
		}
		if (this.aLong290 * -8467614189479269767L == -1L) {
			this.aLong290 = Class305.method26889(458543361) * 1529257764138147785L;
		}
		this.anInt5404 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30273(this.anIntArray464[local23], 1881955315)) {
				this.anInt5404 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30250(this.aClass93_Sub1_Sub20_3.aString113, (byte) 1)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30232(this.aClass93_Sub1_Sub20_3.aString113, -535586969)) {
				this.aClass584_3 = Class443.method29049(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean622, (byte) 83);
			} else {
				this.anInt5404 += 968880165;
			}
		}
		if (this.anInt5404 * 1438297005 > 0) {
			if (this.anInt5405 * -1508419771 < this.anInt5404 * 1438297005) {
				this.anInt5405 = this.anInt5404 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_1.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_7.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_5.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_2.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_3.anInt5383 * -1655076145, (byte) 0);
			}
		}
		local23 = this.anInt5406 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5406 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5409 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(1758501359)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, -1210117650);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(-1068826393)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, -31190662);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5406 * -330761899 > 0) {
			if (local23 != this.anInt5406 * -330761899) {
				this.anInt5408 = client.anInt3485 * -176246917;
			} else if (this.anInt5408 * 766629811 != 0 && client.anInt3485 - this.anInt5408 * 766629811 == 1000) {
				Class389.method28444(local244.anInt5971 * -1287795829, local239.anInt5971 * -1287795829, this.anInt5406 * -330761899, 1659073893);
				Class591.method31877(659361545);
			}
			if (this.anInt5407 * 1069530631 < this.anInt5406 * -330761899) {
				this.anInt5407 = this.anInt5406 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean798 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) 29) + Class430.aString216 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) -55);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean798 && Class274.aClass258_11 != null) {
			Class274.aClass258_11.method26125((short) -9847);
		}
		if (!this.aBoolean798) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean798) {
			Class700.method36897(true, (byte) -85);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1667264591) == 2) {
			for (local564 = 0; local564 < this.anInt5409 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16457(-691196604), (byte) 78).anInt4245 * -2054577112;
		if (Class694.aClass104_14.method20441()) {
			local564++;
		}
		this.method30717((byte) -83);
		this.method30660(1067231142);
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local564, local556, Class694.aClass104_14.method20425() > 0);
		this.aClass585_24.method31613(false, 870300168);
		this.aClass585_24.method31611(client.anInt3536 * -1229702203, (byte) 21);
		this.aClass585_24.method31669(this.aHashMap10, (byte) 8);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31647(null, (byte) -89);
		} else {
			this.aClass585_24.method31647(Class707.aClass106_13, (byte) -85);
		}
		this.aClass528_1 = new Class528();
		this.aFloat331 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878(-662808309);
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 16822) * -822224463;
		this.aClass142_Sub1_1.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1646353278) == 2;
		this.aClass142_Sub1_1.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-2054117833) == 1;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(-899897958) == 1;
		this.aClass142_Sub1_1.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(135965712) == 1;
		if (this.aClass526_9.method30562(-1388421350)) {
			this.method30664(this.aClass142_Sub1_1, this.aByteArrayArray19, 808347715);
		} else {
			this.method30663(this.aClass142_Sub1_1, this.aByteArrayArray19, 944168601);
		}
		if (this.aBoolean798) {
			this.method30662(50, 288324872);
		}
		this.aClass671_2.method33156(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 1531101744);
		this.aClass671_2.method33168(this, (byte) 3);
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878(-662808309);
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 26220) * -822224463;
			this.aClass142_Sub1_2.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1915357347) == 2;
			this.aClass142_Sub1_2.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1241018648) == 1;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(504558879) == 1;
			this.aClass142_Sub1_2.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-584383497) == 1;
			if (this.aClass526_9.method30562(74830897)) {
				this.method30664(this.aClass142_Sub1_2, this.aByteArrayArray21, 808347715);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			} else {
				this.method30663(this.aClass142_Sub1_2, this.aByteArrayArray21, 1604262908);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0], 963054590);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null, 1134610186);
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, -1685499146);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 1178215543);
		if (this.aClass526_9.method30562(-1153325907)) {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30666(this.aClass142_Sub1_1, this.aByteArrayArray20, (short) 4213);
		} else {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30665(this.aClass142_Sub1_1, this.aByteArrayArray20, (byte) 1);
			if (this.aByteArrayArray17 != null) {
				this.method30667((byte) -118);
			}
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null, (byte) 24);
		if (this.aBoolean798) {
			this.method30662(75, -167111599);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false, (byte) -64);
		if (this.aBoolean798) {
			this.method30662(75, -1943913697);
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			if (this.aClass526_9.method30562(1980020511)) {
				this.method30666(this.aClass142_Sub1_2, this.aByteArrayArray18, (short) 27093);
			} else {
				this.method30665(this.aClass142_Sub1_2, this.aByteArrayArray18, (byte) 1);
			}
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0], (byte) -32);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true, (byte) -38);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, 473037419);
			}
		}
		this.aClass142_Sub1_1.method10879((byte) 114);
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879((byte) 49);
		}
		this.aClass585_24.method31785(-1722175208);
		if (this.aBoolean798) {
			Class305.method26889(1788180409);
			while (!Class694.aClass104_14.method20526(2114416749)) {
				this.method30662(1, 1087606675);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean798) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30649(local1170, 2070590356);
			Class392.aClass541_1.method31087(local1170, 1015379579);
			local1165 = true;
			Class305.method26889(435508589);
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean613 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30660(-888972975);
			this.method30659(3, 1567535051);
			this.method30751(-1864439555);
		} else {
			Class274.aClass258_11.method26125((short) -15787);
			this.aClass671_2.method33162(-1652530118);
			Class238.method25893((byte) 16);
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5400 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5403 * -2134504113; local1238++) {
					Class518.method30486(local292, local319, local1238, -1334045914);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31445(1150016707);
			}
		}
		Class262.method26266(1209358363);
		Class371.method28185((byte) -89);
		if (Class343.method27611((byte) 32) == Class555.aClass555_3 && client.aClass175_2.method24368((byte) -48) != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2, (byte) 121);
			local1296.aClass93_Sub41_Sub2_1.method22407(1057001181, (byte) -26);
			client.aClass175_2.method24363(local1296, -1799830833);
		}
		if (!this.aClass526_9.method30562(-846131069)) {
			local292 = (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5398 * 562190567 + (this.anInt5400 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5403 * -2134504113 >> 4) + this.anInt5410 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30231(this.method30692(local1370, local1379, -1840892506), 44555846);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26889(1765220921) - this.aLong290 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29937(4, 1823202236);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29937(13, 1823202236);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29937(15, 1823202236);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29937(0, 1823202236);
		} else {
			Class481.method29937(18, 1823202236);
			if (client.aClass175_2.method24368((byte) 68) != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2, (byte) 90);
				local1466.aClass93_Sub41_Sub2_1.method22407((int) local1417, (byte) 18);
				client.aClass175_2.method24363(local1466, -1557369932);
			}
		}
		if (this.aBoolean799) {
			Class314.method27032(Long.toString(Class305.method26889(1830909085) - this.aLong289 * 1216641514968376055L), -1961279020);
			this.aBoolean799 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "eg", descriptor = "()Z")
	public boolean method30765() {
		if (!this.aBoolean798) {
			Class481.method29934(false, (byte) 5);
		}
		if (this.aLong290 * -8467614189479269767L == -1L) {
			this.aLong290 = Class305.method26889(1624797390) * 1529257764138147785L;
		}
		this.anInt5404 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30273(this.anIntArray464[local23], 425056936)) {
				this.anInt5404 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30250(this.aClass93_Sub1_Sub20_3.aString113, (byte) 1)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30232(this.aClass93_Sub1_Sub20_3.aString113, 736307159)) {
				this.aClass584_3 = Class443.method29049(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean622, (byte) 59);
			} else {
				this.anInt5404 += 968880165;
			}
		}
		if (this.anInt5404 * 1438297005 > 0) {
			if (this.anInt5405 * -1508419771 < this.anInt5404 * 1438297005) {
				this.anInt5405 = this.anInt5404 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_1.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_7.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_5.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_2.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_3.anInt5383 * -1655076145, (byte) 0);
			}
		}
		local23 = this.anInt5406 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5406 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5409 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(-1562223005)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, 1349387857);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(-42611122)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, -1548684825);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5406 * -330761899 > 0) {
			if (local23 != this.anInt5406 * -330761899) {
				this.anInt5408 = client.anInt3485 * -176246917;
			} else if (this.anInt5408 * 766629811 != 0 && client.anInt3485 - this.anInt5408 * 766629811 == 1000) {
				Class389.method28444(local244.anInt5971 * -1287795829, local239.anInt5971 * -1287795829, this.anInt5406 * -330761899, 2051381242);
				Class591.method31877(-754948695);
			}
			if (this.anInt5407 * 1069530631 < this.anInt5406 * -330761899) {
				this.anInt5407 = this.anInt5406 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean798 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) -51) + Class430.aString216 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) -64);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean798 && Class274.aClass258_11 != null) {
			Class274.aClass258_11.method26125((short) 14258);
		}
		if (!this.aBoolean798) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean798) {
			Class700.method36897(true, (byte) 82);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1971549988) == 2) {
			for (local564 = 0; local564 < this.anInt5409 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16457(-821363243), (byte) 29).anInt4245 * -2054577112;
		if (Class694.aClass104_14.method20441()) {
			local564++;
		}
		this.method30717((byte) 32);
		this.method30660(2043446963);
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local564, local556, Class694.aClass104_14.method20425() > 0);
		this.aClass585_24.method31613(false, 870300168);
		this.aClass585_24.method31611(client.anInt3536 * -1229702203, (byte) 89);
		this.aClass585_24.method31669(this.aHashMap10, (byte) 8);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31647(null, (byte) -5);
		} else {
			this.aClass585_24.method31647(Class707.aClass106_13, (byte) -67);
		}
		this.aClass528_1 = new Class528();
		this.aFloat331 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878(-662808309);
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 7921) * -822224463;
		this.aClass142_Sub1_1.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1820286750) == 2;
		this.aClass142_Sub1_1.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-941943670) == 1;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(1535678425) == 1;
		this.aClass142_Sub1_1.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1224755660) == 1;
		if (this.aClass526_9.method30562(1051495276)) {
			this.method30664(this.aClass142_Sub1_1, this.aByteArrayArray19, 808347715);
		} else {
			this.method30663(this.aClass142_Sub1_1, this.aByteArrayArray19, 543354693);
		}
		if (this.aBoolean798) {
			this.method30662(50, -1962041841);
		}
		this.aClass671_2.method33156(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 989119590);
		this.aClass671_2.method33168(this, (byte) 3);
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878(-662808309);
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 25319) * -822224463;
			this.aClass142_Sub1_2.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1667198795) == 2;
			this.aClass142_Sub1_2.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-1786454471) == 1;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(-735263844) == 1;
			this.aClass142_Sub1_2.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-658082346) == 1;
			if (this.aClass526_9.method30562(-1299678307)) {
				this.method30664(this.aClass142_Sub1_2, this.aByteArrayArray21, 808347715);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			} else {
				this.method30663(this.aClass142_Sub1_2, this.aByteArrayArray21, 1810851824);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0], 963054590);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null, 1327580746);
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, 15786609);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 1002730612);
		if (this.aClass526_9.method30562(510230257)) {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30666(this.aClass142_Sub1_1, this.aByteArrayArray20, (short) 23606);
		} else {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30665(this.aClass142_Sub1_1, this.aByteArrayArray20, (byte) 1);
			if (this.aByteArrayArray17 != null) {
				this.method30667((byte) -106);
			}
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null, (byte) 85);
		if (this.aBoolean798) {
			this.method30662(75, -869470337);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false, (byte) -95);
		if (this.aBoolean798) {
			this.method30662(75, -1248356950);
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			if (this.aClass526_9.method30562(748078322)) {
				this.method30666(this.aClass142_Sub1_2, this.aByteArrayArray18, (short) 13216);
			} else {
				this.method30665(this.aClass142_Sub1_2, this.aByteArrayArray18, (byte) 1);
			}
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0], (byte) -20);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true, (byte) -125);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, 931850304);
			}
		}
		this.aClass142_Sub1_1.method10879((byte) 9);
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879((byte) 55);
		}
		this.aClass585_24.method31785(52508634);
		if (this.aBoolean798) {
			Class305.method26889(790414064);
			while (!Class694.aClass104_14.method20526(2114416749)) {
				this.method30662(1, -1347443704);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean798) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30649(local1170, 2062304001);
			Class392.aClass541_1.method31087(local1170, -141740711);
			local1165 = true;
			Class305.method26889(440769764);
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean613 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30660(-529649584);
			this.method30659(3, 1193290431);
			this.method30751(1403544438);
		} else {
			Class274.aClass258_11.method26125((short) 2534);
			this.aClass671_2.method33162(1397397433);
			Class238.method25893((byte) -18);
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5400 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5403 * -2134504113; local1238++) {
					Class518.method30486(local292, local319, local1238, -1293641471);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31445(1204725724);
			}
		}
		Class262.method26266(1297672251);
		Class371.method28185((byte) -106);
		if (Class343.method27611((byte) 85) == Class555.aClass555_3 && client.aClass175_2.method24368((byte) 2) != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2, (byte) 27);
			local1296.aClass93_Sub41_Sub2_1.method22407(1057001181, (byte) -76);
			client.aClass175_2.method24363(local1296, -1549413638);
		}
		if (!this.aClass526_9.method30562(-438827903)) {
			local292 = (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5398 * 562190567 + (this.anInt5400 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5403 * -2134504113 >> 4) + this.anInt5410 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30231(this.method30692(local1370, local1379, -1716468335), 44555846);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26889(-416145387) - this.aLong290 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29937(4, 1823202236);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29937(13, 1823202236);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29937(15, 1823202236);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29937(0, 1823202236);
		} else {
			Class481.method29937(18, 1823202236);
			if (client.aClass175_2.method24368((byte) 48) != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2, (byte) 96);
				local1466.aClass93_Sub41_Sub2_1.method22407((int) local1417, (byte) -4);
				client.aClass175_2.method24363(local1466, -1945873955);
			}
		}
		if (this.aBoolean799) {
			Class314.method27032(Long.toString(Class305.method26889(844609645) - this.aLong289 * 1216641514968376055L), -1959889328);
			this.aBoolean799 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "ez", descriptor = "()Z")
	public boolean method30766() {
		if (!this.aBoolean798) {
			Class481.method29934(false, (byte) 5);
		}
		if (this.aLong290 * -8467614189479269767L == -1L) {
			this.aLong290 = Class305.method26889(1782661325) * 1529257764138147785L;
		}
		this.anInt5404 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30273(this.anIntArray464[local23], 771239536)) {
				this.anInt5404 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30250(this.aClass93_Sub1_Sub20_3.aString113, (byte) 1)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30232(this.aClass93_Sub1_Sub20_3.aString113, -1048043231)) {
				this.aClass584_3 = Class443.method29049(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean622, (byte) 95);
			} else {
				this.anInt5404 += 968880165;
			}
		}
		if (this.anInt5404 * 1438297005 > 0) {
			if (this.anInt5405 * -1508419771 < this.anInt5404 * 1438297005) {
				this.anInt5405 = this.anInt5404 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5409 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_1.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_7.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_5.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_2.anInt5383 * -1655076145, (byte) 0);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30225(this.anIntArray464[local23], Class522.aClass522_3.anInt5383 * -1655076145, (byte) 0);
			}
		}
		local23 = this.anInt5406 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5406 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5409 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(1340851149)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, 401133294);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray465[local249] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
				local292 = (this.anIntArray465[local249] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (this.aClass526_9.method30562(717924117)) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27495(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local244, local239, 715196545);
				if (local319 > 0) {
					this.anInt5406 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5406 * -330761899 > 0) {
			if (local23 != this.anInt5406 * -330761899) {
				this.anInt5408 = client.anInt3485 * -176246917;
			} else if (this.anInt5408 * 766629811 != 0 && client.anInt3485 - this.anInt5408 * 766629811 == 1000) {
				Class389.method28444(local244.anInt5971 * -1287795829, local239.anInt5971 * -1287795829, this.anInt5406 * -330761899, -1069217288);
				Class591.method31877(-714969397);
			}
			if (this.anInt5407 * 1069530631 < this.anInt5406 * -330761899) {
				this.anInt5407 = this.anInt5406 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean798 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) -78) + Class430.aString216 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) 30);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean798 && Class274.aClass258_11 != null) {
			Class274.aClass258_11.method26125((short) 5434);
		}
		if (!this.aBoolean798) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean798) {
			Class700.method36897(true, (byte) 12);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-2069745124) == 2) {
			for (local564 = 0; local564 < this.anInt5409 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16457(1449360370), (byte) 85).anInt4245 * -2054577112;
		if (Class694.aClass104_14.method20441()) {
			local564++;
		}
		this.method30717((byte) 16);
		this.method30660(-374245720);
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, local564, local556, Class694.aClass104_14.method20425() > 0);
		this.aClass585_24.method31613(false, 870300168);
		this.aClass585_24.method31611(client.anInt3536 * -1229702203, (byte) 48);
		this.aClass585_24.method31669(this.aHashMap10, (byte) 8);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31647(null, (byte) -60);
		} else {
			this.aClass585_24.method31647(Class707.aClass106_13, (byte) -37);
		}
		this.aClass528_1 = new Class528();
		this.aFloat331 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878(-662808309);
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 12938) * -822224463;
		this.aClass142_Sub1_1.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1983997268) == 2;
		this.aClass142_Sub1_1.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-918800438) == 1;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(-606952348) == 1;
		this.aClass142_Sub1_1.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1642125137) == 1;
		if (this.aClass526_9.method30562(-1413075517)) {
			this.method30664(this.aClass142_Sub1_1, this.aByteArrayArray19, 808347715);
		} else {
			this.method30663(this.aClass142_Sub1_1, this.aByteArrayArray19, -476478724);
		}
		if (this.aBoolean798) {
			this.method30662(50, -864569689);
		}
		this.aClass671_2.method33156(this.anInt5400 * -1096901053 >> 4, this.anInt5403 * -2134504113 >> 4, 864973506);
		this.aClass671_2.method33168(this, (byte) 3);
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5400 * -1096901053, this.anInt5403 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878(-662808309);
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15540((short) 30002) * -822224463;
			this.aClass142_Sub1_2.aBoolean238 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15787(-1913234520) == 2;
			this.aClass142_Sub1_2.aBoolean236 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15770(-2077764076) == 1;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(1370538900) == 1;
			this.aClass142_Sub1_2.aBoolean232 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15666(-1223035972) == 1;
			if (this.aClass526_9.method30562(-1619550563)) {
				this.method30664(this.aClass142_Sub1_2, this.aByteArrayArray21, 808347715);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			} else {
				this.method30663(this.aClass142_Sub1_2, this.aByteArrayArray21, 1781254505);
				if (!this.aBoolean798) {
					Class481.method29934(true, (byte) 5);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0], 963054590);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null, 2008611874);
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, -1692335904);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null, 1867761566);
		if (this.aClass526_9.method30562(1248355464)) {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30666(this.aClass142_Sub1_1, this.aByteArrayArray20, (short) 2613);
		} else {
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.method30665(this.aClass142_Sub1_1, this.aByteArrayArray20, (byte) 1);
			if (this.aByteArrayArray17 != null) {
				this.method30667((byte) -84);
			}
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null, (byte) 33);
		if (this.aBoolean798) {
			this.method30662(75, -254972583);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false, (byte) -48);
		if (this.aBoolean798) {
			this.method30662(75, -1664951663);
		}
		if (!this.aBoolean798) {
			Class481.method29934(true, (byte) 5);
		}
		if (local556) {
			this.aClass585_24.method31613(true, 870300168);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			if (this.aClass526_9.method30562(1336936087)) {
				this.method30666(this.aClass142_Sub1_2, this.aByteArrayArray18, (short) 10806);
			} else {
				this.method30665(this.aClass142_Sub1_2, this.aByteArrayArray18, (byte) 1);
			}
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0], (byte) 91);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true, (byte) -118);
			if (!this.aBoolean798) {
				Class481.method29934(true, (byte) 5);
			}
			this.aClass585_24.method31613(false, 870300168);
			if (this.aBoolean798) {
				this.method30662(50, 962125142);
			}
		}
		this.aClass142_Sub1_1.method10879((byte) 63);
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879((byte) 52);
		}
		this.aClass585_24.method31785(-534332453);
		if (this.aBoolean798) {
			Class305.method26889(1207699739);
			while (!Class694.aClass104_14.method20526(2114416749)) {
				this.method30662(1, -1498870265);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean798) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30649(local1170, -248785060);
			Class392.aClass541_1.method31087(local1170, 1172984184);
			local1165 = true;
			Class305.method26889(1713991135);
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean613 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30660(122514442);
			this.method30659(3, 433281656);
			this.method30751(-380472161);
		} else {
			Class274.aClass258_11.method26125((short) -4988);
			this.aClass671_2.method33162(-1213170040);
			Class238.method25893((byte) -97);
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5400 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5403 * -2134504113; local1238++) {
					Class518.method30486(local292, local319, local1238, 2006363122);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31445(1418422616);
			}
		}
		Class262.method26266(14674239);
		Class371.method28185((byte) -1);
		if (Class343.method27611((byte) 53) == Class555.aClass555_3 && client.aClass175_2.method24368((byte) -18) != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2, (byte) 109);
			local1296.aClass93_Sub41_Sub2_1.method22407(1057001181, (byte) -6);
			client.aClass175_2.method24363(local1296, -1794534889);
		}
		if (!this.aClass526_9.method30562(-1428195585)) {
			local292 = (this.anInt5398 * 562190567 - (this.anInt5400 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5398 * 562190567 + (this.anInt5400 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5410 * 1028227575 - (this.anInt5403 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5403 * -2134504113 >> 4) + this.anInt5410 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30231(this.method30692(local1370, local1379, -2145392747), 44555846);
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26889(-96098382) - this.aLong290 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29937(4, 1823202236);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29937(13, 1823202236);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29937(15, 1823202236);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29937(0, 1823202236);
		} else {
			Class481.method29937(18, 1823202236);
			if (client.aClass175_2.method24368((byte) 32) != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2, (byte) 57);
				local1466.aClass93_Sub41_Sub2_1.method22407((int) local1417, (byte) 65);
				client.aClass175_2.method24363(local1466, -1854374812);
			}
		}
		if (this.aBoolean799) {
			Class314.method27032(Long.toString(Class305.method26889(-1431647) - this.aLong289 * 1216641514968376055L), -1937729766);
			this.aBoolean799 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "ef", descriptor = "(I)V")
	void method30767(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)Lclient!tw;")
	public Class584 method30768(@OriginalArg(0) int arg0) {
		return this.aClass584_3;
	}

	@OriginalMember(owner = "client!rl", name = "dx", descriptor = "(Lclient!ase;)V")
	void method30769(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		this.anInt5399 = arg0.method22425((short) 16384) * -823652121;
		@Pc(10) int local10 = arg0.method22425((short) 16384);
		@Pc(14) int local14 = arg0.method22425((short) 16384);
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22427(-1434290800);
		@Pc(49) int local49 = arg0.method22469(1691545945);
		@Pc(53) int local53 = arg0.method22461(1776221825);
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean798) {
			this.method30751(-1496131813);
		}
		this.method30688(Class260.method26251(local10, (byte) -1), -2040301373);
		arg0.method22680((byte) 117);
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5400 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5403 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22701(1, 836635316);
					if (local111 == 1) {
						local119 = arg0.method22701(26, 1167091017);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22682(-252344812);
		local83 = local81.size();
		this.anIntArray465 = new int[local83];
		this.anIntArray464 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5400 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5403 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray465[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30229(this.method30692(local268, local295, -1670413148), Class522.aClass522_1.anInt5383 * -1655076145, (byte) 14)) {
								this.anIntArray465[local83] = local150;
								this.anIntArray464[local83] = this.method30692(local268, local295, -1585885364);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5409 = local83 * -1132609489;
		this.method30726(local45, local49, 3, local62, (byte) 2);
	}

	@OriginalMember(owner = "client!rl", name = "ew", descriptor = "(Lclient!aih;[[B)V")
	void method30770(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray465[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray465[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5784 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5785 * -1994307635;
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) 1917);
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5784 * 270611681, this.aClass611_1.anInt5785 * -1994307635, (byte) 119);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52, (byte) 117);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray465[local4] >> 8) * 64 - this.aClass611_1.anInt5784 * 270611681;
			@Pc(120) int local120 = (this.anIntArray465[local4] & 0xFF) * 64 - this.aClass611_1.anInt5785 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5410 * 1028227575 < 800) {
				if (!this.aBoolean798 && Class274.aClass258_11 != null) {
					Class274.aClass258_11.method26125((short) 24499);
				}
				arg0.method10909(local105, local120, 64, 64, 1256784970);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "er", descriptor = "(Lclient!aih;[[B)V")
	void method30771(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 15583);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, -1806860421);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62, (byte) -59);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 8405);
			}
			for (local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8, -1775471641);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "cp", descriptor = "()Lclient!qx;")
	public Class520 method30772() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "(Lclient!aih;[[B)V")
	void method30773(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) -24265);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 2107959422);
									break;
								}
							}
						}
					}
					if (this.aBoolean798) {
						this.method30662(5, -1297380710);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ex", descriptor = "(Lclient!aih;[[B)V")
	void method30774(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean798) {
				Class274.aClass258_11.method26125((short) 5082);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5400 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5403 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean237 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray465.length; local86++) {
								if (local84 == this.anIntArray465[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62, 1068082147);
									break;
								}
							}
						}
					}
					if (this.aBoolean798) {
						this.method30662(5, -1349130846);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "bn", descriptor = "()I")
	public int method30775() {
		return 100 - this.anInt5406 * 1283548468 / (this.anInt5407 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "cm", descriptor = "()[[I")
	public int[][] method30776() {
		return this.anIntArrayArray61;
	}
}
