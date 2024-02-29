package jagex3;

import jagex3.twitchtv.TwitchWebcamDevice;
import jagex3.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yi")
public final class Class683 {

	@OriginalMember(owner = "client!yi", name = "e", descriptor = "Z")
	static boolean aBoolean885 = false;

	@OriginalMember(owner = "client!yi", name = "ci", descriptor = "(Lclient!yf;)V")
	static void method33460(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) 11);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25485(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!yi", name = "cb", descriptor = "(Lclient!yf;)V")
	static void method33461(@OriginalArg(0) Class681 arg0) {
		@Pc(2) int local2 = Class608.method32143((byte) -84);
		if (local2 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class522.aTwitchEventLiveStreams1.anIntArray333[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray23[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray24[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray25[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray26[local2];
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!yi", name = "af", descriptor = "(Lclient!yf;)V")
	static void method33462(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class91.method1710(local13, local23, local33, local43 != 0, 1288935129);
	}

	@OriginalMember(owner = "client!yi", name = "ai", descriptor = "(Lclient!yf;)V")
	static void method33463(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class528.method30574((byte) -1);
	}

	@OriginalMember(owner = "client!yi", name = "aw", descriptor = "(Lclient!yf;)V")
	static void method33464(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class528.method30574((byte) -1);
	}

	@OriginalMember(owner = "client!yi", name = "ck", descriptor = "(Lclient!yf;)V")
	static void method33465(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -725861497;
		if (aBoolean885) {
			Class504.method30376(arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0, 1813151266);
			Class320.method27331(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0, -522627859);
			Class585.method31792(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] != 0, -1133639401);
		}
	}

	@OriginalMember(owner = "client!yi", name = "at", descriptor = "(Lclient!yf;)V")
	static void method33466(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class520.method30522(-1268427542);
	}

	@OriginalMember(owner = "client!yi", name = "au", descriptor = "(Lclient!yf;)V")
	static void method33467(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class262.method26262(local14, local25, (byte) -40);
	}

	@OriginalMember(owner = "client!yi", name = "am", descriptor = "(Lclient!yf;)V")
	static void method33468(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class262.method26262(local14, local25, (byte) 60);
	}

	@OriginalMember(owner = "client!yi", name = "ak", descriptor = "(Lclient!yf;)V")
	static void method33469(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class91.method1710(local13, local23, local33, local43 != 0, 531562634);
	}

	@OriginalMember(owner = "client!yi", name = "ap", descriptor = "(Lclient!yf;)V")
	static void method33470(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class570.method31501(-1823585317);
	}

	@OriginalMember(owner = "client!yi", name = "aq", descriptor = "(Lclient!yf;)V")
	static void method33471(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class570.method31501(-503295339);
	}

	@OriginalMember(owner = "client!yi", name = "ax", descriptor = "(Lclient!yf;)V")
	static void method33472(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class222.method25674(-1908626968);
	}

	@OriginalMember(owner = "client!yi", name = "cr", descriptor = "(Lclient!yf;)V")
	static void method33473(@OriginalArg(0) Class681 arg0) {
		Class20.method375(16711935);
		Class111.method6799(arg0, -502111719);
	}

	@OriginalMember(owner = "client!yi", name = "ac", descriptor = "(Lclient!yf;)V")
	static void method33474(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class528.method30574((byte) -1);
	}

	@OriginalMember(owner = "client!yi", name = "aj", descriptor = "(Lclient!yf;)V")
	static void method33475(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class222.method25674(-1908626968);
	}

	@OriginalMember(owner = "client!yi", name = "ay", descriptor = "(Lclient!yf;)V")
	static void method33476(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class222.method25674(-1908626968);
	}

	@OriginalMember(owner = "client!yi", name = "cj", descriptor = "(Lclient!yf;)V")
	static void method33477(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class407.method28761(955083601) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "av", descriptor = "(Lclient!yf;)V")
	static void method33478(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class222.method25674(-1908626968);
	}

	@OriginalMember(owner = "client!yi", name = "aa", descriptor = "(Lclient!yf;)V")
	static void method33479(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class523.method30549(1533752489);
	}

	@OriginalMember(owner = "client!yi", name = "bg", descriptor = "(Lclient!yf;)V")
	static void method33480(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) 80);
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

	@OriginalMember(owner = "client!yi", name = "bl", descriptor = "(Lclient!yf;)V")
	static void method33481(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class572.method31514(Class694.aClass104_14, -2108920695);
	}

	@OriginalMember(owner = "client!yi", name = "bf", descriptor = "(Lclient!yf;)V")
	static void method33482(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class572.method31514(Class694.aClass104_14, -2083909352);
	}

	@OriginalMember(owner = "client!yi", name = "as", descriptor = "(Lclient!yf;)V")
	static void method33483(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class520.method30522(-201630337);
	}

	@OriginalMember(owner = "client!yi", name = "bk", descriptor = "(Lclient!yf;)V")
	static void method33484(@OriginalArg(0) Class681 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] != 0;
		Class341.method27589(local16, 1855824150);
	}

	@OriginalMember(owner = "client!yi", name = "cw", descriptor = "(Lclient!yf;)V")
	static void method33485(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(17) boolean local17 = arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0;
		@Pc(31) boolean local31 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0;
		Class111.method6798(local17, local31, -1008012047);
	}

	@OriginalMember(owner = "client!yi", name = "an", descriptor = "(Lclient!yf;)V")
	static void method33486(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class572.method31514(Class694.aClass104_14, -2082582615);
	}

	@OriginalMember(owner = "client!yi", name = "bv", descriptor = "(Lclient!yf;)V")
	static void method33487(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class272.method26414(993534245);
	}

	@OriginalMember(owner = "client!yi", name = "bc", descriptor = "(Lclient!yf;)V")
	static void method33488(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class452.method29142((byte) 36);
	}

	@OriginalMember(owner = "client!yi", name = "bd", descriptor = "(Lclient!yf;)V")
	static void method33489(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class452.method29142((byte) -82);
	}

	@OriginalMember(owner = "client!yi", name = "cc", descriptor = "(Lclient!yf;)V")
	static void method33490(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -725861497;
		if (aBoolean885) {
			Class504.method30376(arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0, 332882425);
			Class320.method27331(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0, -80951305);
			Class585.method31792(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] != 0, -1501033627);
		}
	}

	@OriginalMember(owner = "client!yi", name = "bt", descriptor = "(Lclient!yf;)V")
	static void method33491(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class662.method33029(1811275755);
	}

	@OriginalMember(owner = "client!yi", name = "bq", descriptor = "(Lclient!yf;)V")
	static void method33492(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class662.method33029(-850121997);
	}

	@OriginalMember(owner = "client!yi", name = "bm", descriptor = "(Lclient!yf;)V")
	static void method33493(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class589.method31864((short) -25986);
	}

	@OriginalMember(owner = "client!yi", name = "bb", descriptor = "(Lclient!yf;)V")
	static void method33494(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class589.method31864((short) -1208);
	}

	@OriginalMember(owner = "client!yi", name = "be", descriptor = "(Lclient!yf;)V")
	static void method33495(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class676.method33398(-497888945);
	}

	@OriginalMember(owner = "client!yi", name = "by", descriptor = "(Lclient!yf;)V")
	static void method33496(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class353.method27778((byte) 78) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "bu", descriptor = "(Lclient!yf;)V")
	static void method33497(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class353.method27778((byte) 90) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "bw", descriptor = "(Lclient!yf;)V")
	static void method33498(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class353.method27778((byte) 57) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "bo", descriptor = "(Lclient!yf;)V")
	static void method33499(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class353.method27778((byte) 50) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "bz", descriptor = "(Lclient!yf;)V")
	static void method33500(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class272.method26414(-1842655858);
	}

	@OriginalMember(owner = "client!yi", name = "bx", descriptor = "(Lclient!yf;)V")
	static void method33501(@OriginalArg(0) Class681 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] != 0;
		Class341.method27589(local16, 2031880268);
	}

	@OriginalMember(owner = "client!yi", name = "br", descriptor = "(Lclient!yf;)V")
	static void method33502(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) -44);
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

	@OriginalMember(owner = "client!yi", name = "cn", descriptor = "(Lclient!yf;)V")
	static void method33503(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) 6);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25486(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!yi", name = "ba", descriptor = "(Lclient!yf;)V")
	static void method33504(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) 33);
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

	@OriginalMember(owner = "client!yi", name = "bp", descriptor = "(Lclient!yf;)V")
	static void method33505(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) 60);
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

	@OriginalMember(owner = "client!yi", name = "bj", descriptor = "(Lclient!yf;)V")
	static void method33506(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(17) TwitchWebcamDevice local17 = Class546.method31151(local13, (byte) 1);
		if (local17 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString154;
		}
	}

	@OriginalMember(owner = "client!yi", name = "bs", descriptor = "(Lclient!yf;)V")
	static void method33507(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(17) TwitchWebcamDevice local17 = Class546.method31151(local13, (byte) 1);
		if (local17 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString154;
		}
	}

	@OriginalMember(owner = "client!yi", name = "cl", descriptor = "(Lclient!yf;)V")
	static void method33508(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(17) TwitchWebcamDevice local17 = Class546.method31151(local13, (byte) 1);
		if (local17 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString154;
		}
	}

	@OriginalMember(owner = "client!yi", name = "cg", descriptor = "(Lclient!yf;)V")
	static void method33509(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(17) TwitchWebcamDevice local17 = Class546.method31151(local13, (byte) 1);
		if (local17 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local17.anInt3624 * -1015277237;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString153;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local17.aString154;
		}
	}

	@OriginalMember(owner = "client!yi", name = "ce", descriptor = "(Lclient!yf;)V")
	static void method33510(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12, (byte) -49);
		if (local16 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.method25487();
		}
	}

	@OriginalMember(owner = "client!yi", name = "cu", descriptor = "(Lclient!yf;)V")
	static void method33511(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) -90);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25485(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!yi", name = "az", descriptor = "(Lclient!yf;)V")
	static void method33512(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class523.method30549(1533752489);
	}

	@OriginalMember(owner = "client!yi", name = "cy", descriptor = "(Lclient!yf;)V")
	static void method33513(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -725861497;
		if (aBoolean885) {
			Class504.method30376(arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0, 241363025);
			Class320.method27331(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0, -493134229);
			Class585.method31792(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] != 0, -1820525259);
		}
	}

	@OriginalMember(owner = "client!yi", name = "cq", descriptor = "(Lclient!yf;)V")
	static void method33514(@OriginalArg(0) Class681 arg0) {
		@Pc(2) int local2 = Class608.method32143((byte) 14);
		if (local2 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class522.aTwitchEventLiveStreams1.anIntArray333[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray23[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray24[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray25[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray26[local2];
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!yi", name = "cp", descriptor = "(Lclient!yf;)V")
	static void method33515(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) 47);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25486(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!yi", name = "ca", descriptor = "(Lclient!yf;)V")
	static void method33516(@OriginalArg(0) Class681 arg0) {
		@Pc(14) int local14 = Class499.method30334(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -871010670);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local14;
	}

	@OriginalMember(owner = "client!yi", name = "cx", descriptor = "(Lclient!yf;)V")
	static void method33517(@OriginalArg(0) Class681 arg0) {
		@Pc(14) int local14 = Class499.method30334(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -771182890);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local14;
	}

	@OriginalMember(owner = "client!yi", name = "bi", descriptor = "(Lclient!yf;)V")
	static void method33518(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class440.method29031(local13, 914182141);
	}

	@OriginalMember(owner = "client!yi", name = "ct", descriptor = "(Lclient!yf;)V")
	static void method33519(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class269.method26365(571235295);
	}

	@OriginalMember(owner = "client!yi", name = "ad", descriptor = "(Lclient!yf;)V")
	static void method33520(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class520.method30522(-1478607057);
	}

	@OriginalMember(owner = "client!yi", name = "co", descriptor = "(Lclient!yf;)V")
	static void method33521(@OriginalArg(0) Class681 arg0) {
		Class20.method375(16711935);
		Class111.method6799(arg0, -586961750);
	}

	@OriginalMember(owner = "client!yi", name = "ao", descriptor = "(Lclient!yf;)V")
	static void method33522(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class222.method25674(-1908626968);
	}

	@OriginalMember(owner = "client!yi", name = "cm", descriptor = "(Lclient!yf;)V")
	static void method33523(@OriginalArg(0) Class681 arg0) {
		Class20.method375(16711935);
		Class111.method6799(arg0, -1539830898);
	}

	@OriginalMember(owner = "client!yi", name = "ar", descriptor = "(Lclient!yf;)V")
	static void method33524(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class570.method31501(-783526516);
	}

	@OriginalMember(owner = "client!yi", name = "ch", descriptor = "(Lclient!yf;)V")
	static void method33525(@OriginalArg(0) Class681 arg0) {
		@Pc(2) int local2 = Class608.method32143((byte) -16);
		if (local2 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class522.aTwitchEventLiveStreams1.anIntArray333[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray23[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray24[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray25[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray26[local2];
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!yi", name = "ab", descriptor = "(Lclient!yf;)V")
	static void method33526(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class523.method30549(1533752489);
	}

	@OriginalMember(owner = "client!yi", name = "cs", descriptor = "(Lclient!yf;)V")
	static void method33527(@OriginalArg(0) Class681 arg0) {
		@Pc(2) int local2 = Class608.method32143((byte) 12);
		if (local2 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class522.aTwitchEventLiveStreams1.anIntArray333[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray23[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray24[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray25[local2];
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class522.aTwitchEventLiveStreams1.aStringArray26[local2];
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!yi", name = "cv", descriptor = "(Lclient!yf;)V")
	static void method33528(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) 50);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25486(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!yi", name = "cf", descriptor = "(Lclient!yf;)V")
	static void method33529(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class269.method26365(1885594553);
	}

	@OriginalMember(owner = "client!yi", name = "bh", descriptor = "(Lclient!yf;)V")
	static void method33530(@OriginalArg(0) Class681 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] != 0;
		Class341.method27589(local16, 1714401939);
	}

	@OriginalMember(owner = "client!yi", name = "cz", descriptor = "(Lclient!yf;)V")
	static void method33531(@OriginalArg(0) Class681 arg0) {
		arg0.anInt6052 -= -725861497;
		if (aBoolean885) {
			Class504.method30376(arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0, 922994868);
			Class320.method27331(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0, -455087816);
			Class585.method31792(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2] != 0, -2066615919);
		}
	}

	@OriginalMember(owner = "client!yi", name = "bn", descriptor = "(Lclient!yf;)V")
	static void method33532(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class662.method33029(-376534954);
	}

	@OriginalMember(owner = "client!yi", name = "cd", descriptor = "(Lclient!yf;)V")
	static void method33533(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class407.method28761(955083601) ? 1 : 0;
	}

	@OriginalMember(owner = "client!yi", name = "awt", descriptor = "(Lclient!yf;I)V")
	static void method33534(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class334.method27496(3, local13, local23, "", (short) 17635);
	}

	@OriginalMember(owner = "client!yi", name = "bet", descriptor = "(Lclient!yf;B)V")
	static void method33535(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!yi", name = "bef", descriptor = "(Lclient!yf;I)V")
	static void method33536(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!yi", name = "<init>", descriptor = "()V")
	Class683() throws Throwable {
		throw new Error();
	}
}
