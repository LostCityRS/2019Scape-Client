package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class491 {

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	final int anInt5323;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
	final int anInt5322;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
	final int anInt5321;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "[B")
	final byte[] aByteArray96;

	@OriginalMember(owner = "client!ps", name = "ai", descriptor = "(B)V")
	static void method30160(@OriginalArg(0) byte arg0) {
		if (Class625.aClass100_51 != null && Class625.aClass100_51.method18201() == Class625.aTwitchWebcamFrameData1.anInt3631 && Class625.aClass100_51.method18177() == Class625.aTwitchWebcamFrameData1.anInt3632) {
			Class625.aClass100_51.method18211(0, 0, Class625.aTwitchWebcamFrameData1.anInt3631, Class625.aTwitchWebcamFrameData1.anInt3632, Class625.aTwitchWebcamFrameData1.anIntArray334, 0, Class625.aTwitchWebcamFrameData1.anInt3631);
		} else {
			Class625.aClass100_51 = Class694.aClass104_14.method20499(Class625.aTwitchWebcamFrameData1.anIntArray334, 0, Class625.aTwitchWebcamFrameData1.anInt3631, Class625.aTwitchWebcamFrameData1.anInt3631, Class625.aTwitchWebcamFrameData1.anInt3632, false);
		}
	}

	@OriginalMember(owner = "client!ps", name = "ks", descriptor = "(I)V")
	static void method30161(@OriginalArg(0) int arg0) {
		Class354.method27789(client.aClass312_5, -1174743804);
		Class550.anInt5475 += 487066403;
		if (client.aBoolean630 && client.aBoolean616) {
			@Pc(24) int local24 = Class82.aClass153_1.method14058(632793919);
			@Pc(28) int local28 = Class82.aClass153_1.method14064(1793022292);
			local24 -= client.anInt3528 * -75226417;
			local28 -= client.anInt3529 * 84488847;
			if (local24 < client.anInt3530 * 771950313) {
				local24 = client.anInt3530 * 771950313;
			}
			if (client.aClass312_5.anInt4022 * 1215292027 + local24 > client.anInt3530 * 771950313 + client.anInt3438 * 982073619) {
				local24 = client.anInt3438 * 982073619 + client.anInt3530 * 771950313 - client.aClass312_5.anInt4022 * 1215292027;
			}
			if (local28 < client.anInt3479 * -1329459211) {
				local28 = client.anInt3479 * -1329459211;
			}
			if (local28 + client.aClass312_5.anInt4023 * -1490598249 > client.anInt3479 * -1329459211 + client.anInt3532 * 1129349351) {
				local28 = client.anInt3532 * 1129349351 + client.anInt3479 * -1329459211 - client.aClass312_5.anInt4023 * -1490598249;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (Class255.aClass312_8 == client.aClass312_3) {
				local117 = local24;
				local119 = local28;
			} else {
				local117 = local24 - client.anInt3530 * 771950313 + client.aClass312_3.anInt4030 * 1868441863;
				local119 = client.aClass312_3.anInt4031 * -1543587533 + (local28 - client.anInt3479 * -1329459211);
			}
			@Pc(157) Class93_Sub39 local157;
			if (Class82.aClass153_1.method14062(1413691472)) {
				if (Class550.anInt5475 * -367035253 > client.aClass312_5.anInt4075 * -2143141249) {
					@Pc(321) int local321 = local24 - client.anInt3533 * 517790231;
					@Pc(327) int local327 = local28 - client.anInt3459 * -762673807;
					if (local321 > client.aClass312_5.anInt4074 * 421444097 || local321 < -(client.aClass312_5.anInt4074 * 421444097) || local327 > client.aClass312_5.anInt4074 * 421444097 || local327 < -(client.aClass312_5.anInt4074 * 421444097)) {
						client.aBoolean618 = true;
					}
				}
				if (client.aClass312_5.anObjectArray42 != null && client.aBoolean618) {
					local157 = new Class93_Sub39();
					local157.aClass312_1 = client.aClass312_5;
					local157.anInt1995 = local117 * -1524396813;
					local157.anInt1998 = local119 * 519538413;
					local157.anObjectArray4 = client.aClass312_5.anObjectArray42;
					Class211.method25522(local157, -1343184740);
				}
			} else {
				if (client.aBoolean618) {
					Class624.method32341(682408472);
					if (client.aClass312_5.anObjectArray6 != null) {
						local157 = new Class93_Sub39();
						local157.aClass312_1 = client.aClass312_5;
						local157.anInt1995 = local117 * -1524396813;
						local157.anInt1998 = local119 * 519538413;
						@Pc(173) Class312 local173 = client.method25291(client.aClass312_5);
						@Pc(175) Class312 local175 = client.aClass312_6;
						@Pc(177) boolean local177 = false;
						while (local175 != null && local175.anInt4026 * 897022795 != -1 && local173 != null) {
							if (local173.anInt3994 * -1549590237 == local175.anInt3994 * -1549590237) {
								local177 = true;
								break;
							}
							local175 = Class166_Sub1.aClass320Array1[local175.anInt3994 * -1549590237 >> 16].aClass312Array3[local175.anInt4026 * 897022795 & 0xFFFF];
						}
						if (local175 == null || local173 == null || Class255.aClass312_8 == local173 || local177) {
							local157.aClass312_2 = client.aClass312_6;
						} else {
							local157.aClass312_2 = Class255.aClass312_8;
						}
						local157.anObjectArray4 = client.aClass312_5.anObjectArray6;
						Class211.method25522(local157, 491330654);
					}
					if (client.aClass312_6 != null && client.method25291(client.aClass312_5) != null) {
						Class132_Sub1_Sub1_Sub1.method20057(client.aClass312_5, client.aClass312_6, -1885814787);
					}
				} else if ((client.anInt3519 * -169503325 == 1 || method30162((byte) -82)) && Class454.anInt5203 * -1838307953 > 2) {
					Class659.method32985(client.anInt3528 * -75226417 + client.anInt3533 * 517790231, client.anInt3459 * -762673807 + client.anInt3529 * 84488847, (byte) 1);
				} else if (Class91.method1707(-1909108699)) {
					Class659.method32985(client.anInt3528 * -75226417 + client.anInt3533 * 517790231, client.anInt3529 * 84488847 + client.anInt3459 * -762673807, (byte) 1);
				}
				client.aClass312_5 = null;
				client.aClass312_3 = null;
			}
		} else if (Class550.anInt5475 * -367035253 > 1) {
			client.aClass312_5 = null;
			client.aClass312_3 = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "(B)Z")
	static boolean method30162(@OriginalArg(0) byte arg0) {
		if (Class594.aClass93_Sub1_Sub7_6 == null) {
			return false;
		} else {
			if (Class594.aClass93_Sub1_Sub7_6.anInt3012 * -92627949 >= 2000) {
				Class594.aClass93_Sub1_Sub7_6.anInt3012 -= 694563568;
			}
			return Class594.aClass93_Sub1_Sub7_6.anInt3012 * -92627949 == 1007;
		}
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIII[B)V")
	Class491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		this.anInt5323 = arg0 * 1216791181;
		this.anInt5322 = arg1 * -109848219;
		this.anInt5321 = arg2 * 138900405;
		this.aByteArray96 = arg4;
	}
}
