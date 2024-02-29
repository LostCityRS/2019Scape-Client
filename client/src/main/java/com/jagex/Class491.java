package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public class Class491 {

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	final int anInt5162;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
	final int anInt5161;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
	final int anInt5160;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "[B")
	final byte[] aByteArray95;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIII[B)V", line = 122)
	Class491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		this.anInt5162 = arg0 * 1216791181;
		this.anInt5161 = arg1 * -109848219;
		this.anInt5160 = arg2 * 138900405;
		this.aByteArray95 = arg4;
	}

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "(B)Z", line = 383)
	static boolean method29979(@OriginalArg(0) byte arg0) {
		if (Class594.aClass93_Sub1_Sub7_6 == null) {
			return false;
		} else {
			if (Class594.aClass93_Sub1_Sub7_6.anInt3012 * -92627949 >= 2000) {
				Class594.aClass93_Sub1_Sub7_6.anInt3012 -= 694563568;
			}
			return Class594.aClass93_Sub1_Sub7_6.anInt3012 * -92627949 == 1007;
		}
	}

	@OriginalMember(owner = "client!ps", name = "ai", descriptor = "(B)V", line = 462)
	static void method29980(@OriginalArg(0) byte arg0) {
		if (Class625.aClass100_51 != null && Class625.aClass100_51.method18205() == Class625.aTwitchWebcamFrameData1.width && Class625.aClass100_51.method18192() == Class625.aTwitchWebcamFrameData1.height) {
			Class625.aClass100_51.method18214(0, 0, Class625.aTwitchWebcamFrameData1.width, Class625.aTwitchWebcamFrameData1.height, Class625.aTwitchWebcamFrameData1.buffer, 0, Class625.aTwitchWebcamFrameData1.width);
		} else {
			Class625.aClass100_51 = Class694.aClass104_14.method20580(Class625.aTwitchWebcamFrameData1.buffer, 0, Class625.aTwitchWebcamFrameData1.width, Class625.aTwitchWebcamFrameData1.width, Class625.aTwitchWebcamFrameData1.height, false);
		}
	}

	@OriginalMember(owner = "client!ps", name = "ks", descriptor = "(I)V", line = 11719)
	static final void method29981(@OriginalArg(0) int arg0) {
		Class354.method27694(client.aClass312_5, -1174743804);
		Class550.anInt5314 += 487066403;
		if (client.aBoolean628 && client.aBoolean614) {
			@Pc(24) int local24 = Class82.aClass153_1.method14070(632793919);
			@Pc(28) int local28 = Class82.aClass153_1.method14075(1793022292);
			local24 -= client.anInt3528 * -75226417;
			local28 -= client.anInt3529 * 84488847;
			if (local24 < client.anInt3530 * 771950313) {
				local24 = client.anInt3530 * 771950313;
			}
			if (client.aClass312_5.anInt3981 * 1215292027 + local24 > client.anInt3530 * 771950313 + client.anInt3438 * 982073619) {
				local24 = client.anInt3438 * 982073619 + client.anInt3530 * 771950313 - client.aClass312_5.anInt3981 * 1215292027;
			}
			if (local28 < client.anInt3479 * -1329459211) {
				local28 = client.anInt3479 * -1329459211;
			}
			if (local28 + client.aClass312_5.anInt3982 * -1490598249 > client.anInt3479 * -1329459211 + client.anInt3532 * 1129349351) {
				local28 = client.anInt3532 * 1129349351 + client.anInt3479 * -1329459211 - client.aClass312_5.anInt3982 * -1490598249;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (Class255.aClass312_8 == client.aClass312_3) {
				local117 = local24;
				local119 = local28;
			} else {
				local117 = local24 - client.anInt3530 * 771950313 + client.aClass312_3.anInt3989 * 1868441863;
				local119 = client.aClass312_3.anInt3990 * -1543587533 + (local28 - client.anInt3479 * -1329459211);
			}
			@Pc(157) Class93_Sub39 local157;
			if (Class82.aClass153_1.method14065(1413691472)) {
				if (Class550.anInt5314 * -367035253 > client.aClass312_5.anInt4034 * -2143141249) {
					@Pc(321) int local321 = local24 - client.anInt3533 * 517790231;
					@Pc(327) int local327 = local28 - client.anInt3459 * -762673807;
					if (local321 > client.aClass312_5.anInt4033 * 421444097 || local321 < -(client.aClass312_5.anInt4033 * 421444097) || local327 > client.aClass312_5.anInt4033 * 421444097 || local327 < -(client.aClass312_5.anInt4033 * 421444097)) {
						client.aBoolean616 = true;
					}
				}
				if (client.aClass312_5.anObjectArray42 != null && client.aBoolean616) {
					local157 = new Class93_Sub39();
					local157.aClass312_1 = client.aClass312_5;
					local157.anInt1995 = local117 * -1524396813;
					local157.anInt1998 = local119 * 519538413;
					local157.anObjectArray4 = client.aClass312_5.anObjectArray42;
					Class211.method25429(local157, -1343184740);
				}
			} else {
				if (client.aBoolean616) {
					Class624.method32159(682408472);
					if (client.aClass312_5.anObjectArray6 != null) {
						local157 = new Class93_Sub39();
						local157.aClass312_1 = client.aClass312_5;
						local157.anInt1995 = local117 * -1524396813;
						local157.anInt1998 = local119 * 519538413;
						@Pc(173) Class312 local173 = client.method25367(client.aClass312_5);
						@Pc(175) Class312 local175 = client.aClass312_6;
						@Pc(177) boolean local177 = false;
						while (local175 != null && local175.anInt3985 * 897022795 != -1 && local173 != null) {
							if (local173.anInt3953 * -1549590237 == local175.anInt3953 * -1549590237) {
								local177 = true;
								break;
							}
							local175 = Class166_Sub1.aClass320Array1[local175.anInt3953 * -1549590237 >> 16].aClass312Array3[local175.anInt3985 * 897022795 & 0xFFFF];
						}
						if (local175 == null || local173 == null || Class255.aClass312_8 == local173 || local177) {
							local157.aClass312_2 = client.aClass312_6;
						} else {
							local157.aClass312_2 = Class255.aClass312_8;
						}
						local157.anObjectArray4 = client.aClass312_5.anObjectArray6;
						Class211.method25429(local157, 491330654);
					}
					if (client.aClass312_6 != null && client.method25367(client.aClass312_5) != null) {
						Class132_Sub1_Sub1_Sub1.method20031(client.aClass312_5, client.aClass312_6, -1885814787);
					}
				} else if ((client.anInt3519 * -169503325 == 1 || method29979((byte) -82)) && Class454.anInt5042 * -1838307953 > 2) {
					Class659.method32809(client.anInt3528 * -75226417 + client.anInt3533 * 517790231, client.anInt3459 * -762673807 + client.anInt3529 * 84488847, (byte) 1);
				} else if (Class91.method1708(-1909108699)) {
					Class659.method32809(client.anInt3528 * -75226417 + client.anInt3533 * 517790231, client.anInt3529 * 84488847 + client.anInt3459 * -762673807, (byte) 1);
				}
				client.aClass312_5 = null;
				client.aClass312_3 = null;
			}
		} else if (Class550.anInt5314 * -367035253 > 1) {
			client.aClass312_5 = null;
			client.aClass312_3 = null;
		}
	}
}
