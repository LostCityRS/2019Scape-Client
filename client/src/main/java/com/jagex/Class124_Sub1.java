package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahg")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ahg", name = "u", descriptor = "Lclient!aqv;")
	Class80_Sub13_Sub1 aClass80_Sub13_Sub1_1;

	@OriginalMember(owner = "client!ahg", name = "e", descriptor = "Lclient!hb;")
	Class113 aClass113_2;

	@OriginalMember(owner = "client!ahg", name = "l", descriptor = "Lclient!ht;")
	Class114 aClass114_1;

	@OriginalMember(owner = "client!ahg", name = "a", descriptor = "(IZI)Lclient!akx;")
	public static Class80_Sub33 method9830(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class80_Sub33[] local2 = Class80_Sub33.aClass80_Sub33Array1;
		synchronized (Class80_Sub33.aClass80_Sub33Array1) {
			if (Class80_Sub33.anInt1651 * 24502281 == 0) {
				return new Class80_Sub33(arg0, arg1);
			} else {
				Class80_Sub33.aClass80_Sub33Array1[(Class80_Sub33.anInt1651 -= 1399041593) * 24502281].method14470(arg0, arg1, 1886394553);
				return Class80_Sub33.aClass80_Sub33Array1[Class80_Sub33.anInt1651 * 24502281];
			}
		}
	}

	@OriginalMember(owner = "client!ahg", name = "m", descriptor = "(Lclient!asa;ILclient!aqc;II)V")
	static void method9831(@OriginalArg(0) Class80_Sub36_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(36) int local36;
		if ((arg3 & 0x20) != 0) {
			local8 = arg0.method23213(-1999046363);
			@Pc(63) int local63;
			if (local8 > 0) {
				for (local12 = 0; local12 < local8; local12++) {
					local17 = -1;
					@Pc(19) boolean local19 = true;
					local21 = -1;
					local25 = arg0.method23195(1687568118);
					if (local25 == 32767) {
						local25 = arg0.method23195(1786789555);
						local36 = arg0.method23195(1669807095);
						local17 = arg0.method23195(1942789808);
						local21 = arg0.method23195(1310867222);
					} else if (local25 == 32766) {
						local25 = -1;
						local36 = arg0.method23212(-472976303);
					} else {
						local36 = arg0.method23195(1290260293);
					}
					local63 = arg0.method23195(1574415483);
					arg2.method18962(local25, local36, local17, local21, client.anInt3436, local63, 1761982781);
				}
			}
			local12 = arg0.method23213(-1448089932);
			if (local12 > 0) {
				for (local25 = 0; local25 < local12; local25++) {
					local17 = arg0.method23195(1662212289);
					local36 = arg0.method23195(2028912027);
					if (local36 == 32767) {
						arg2.method18964(local17, 1988210512);
					} else {
						local21 = arg0.method23195(2050646428);
						local63 = arg0.method23213(823097344);
						@Pc(112) int local112 = local36 > 0 ? arg0.method23245(482393438) : local63;
						arg2.method18963(local17, client.anInt3436, local36, local21, local63, local112, -910068450);
					}
				}
			}
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte70 = arg0.method23177((byte) -13);
			arg2.aByte71 = arg0.method23216(1831183447);
			arg2.aByte72 = arg0.method23216(1831183447);
			arg2.aByte73 = (byte) arg0.method23245(482393438);
			arg2.anInt2698 = (client.anInt3436 + arg0.method23221(-151055364)) * 396975409;
			arg2.anInt2692 = (client.anInt3436 + arg0.method23223(-431661322)) * 184947885;
		}
		@Pc(215) Class519 local215;
		@Pc(221) Class460 local221;
		if ((arg3 & 0x40000) != 0) {
			arg0.anInt3152 += 2068361142;
			local8 = arg0.aByteArray61[(arg0.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
			for (local12 = 0; local12 < local8; local12++) {
				local25 = arg0.method23213(-1351223576);
				local215 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), local25, -2043421519);
				local221 = Class528.aClass2_Sub1_Sub1_3.method1828(arg0, local215, -1580083261);
				arg2.anInterface4_5.method719(local221.anInt4907 * -38979583, local221.anObject19, -1773610592);
			}
		}
		@Pc(245) int[] local245;
		@Pc(248) int[] local248;
		if ((arg3 & 0x8000) != 0) {
			local8 = arg0.method23213(-1078987432);
			local245 = new int[local8];
			local248 = new int[local8];
			@Pc(251) int[] local251 = new int[local8];
			for (local36 = 0; local36 < local8; local36++) {
				local245[local36] = arg0.method23210((byte) 52);
				local248[local36] = arg0.method23245(482393438);
				local251[local36] = arg0.method23221(-1924721399);
			}
			Class110_Sub1.method7316(arg2, local245, local248, local251, 926997886);
		}
		@Pc(329) boolean local329;
		if ((arg3 & 0x2) != 0) {
			local8 = arg0.method23222(-522284266);
			local12 = arg0.method23314(2086650112);
			if (local8 == 65535) {
				local8 = -1;
			}
			local25 = arg0.method23245(482393438);
			local17 = local25 & 0x7;
			local36 = local25 >> 3 & 0xF;
			if (local36 == 15) {
				local36 = -1;
			}
			local329 = (local25 >> 7 & 0x1) == 1;
			arg2.method18998(local8, local12, local17, local36, local329, 0, -360356141);
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aBoolean457 = arg0.method23212(545198853) == 1;
		}
		if ((arg3 & 0x1) != 0) {
			local8 = arg0.method23223(-2118946402);
			if (local8 == 65535) {
				local8 = -1;
			}
			arg2.anInt2683 = local8 * 1779375907;
		}
		if ((arg3 & 0x2000) != 0) {
			local8 = arg0.method23223(1699412340);
			local12 = arg0.method23267(1747740237);
			if (local8 == 65535) {
				local8 = -1;
			}
			local25 = arg0.method23245(482393438);
			local17 = local25 & 0x7;
			local36 = local25 >> 3 & 0xF;
			if (local36 == 15) {
				local36 = -1;
			}
			local329 = (local25 >> 7 & 0x1) == 1;
			arg2.method18998(local8, local12, local17, local36, local329, 2, -360356141);
		}
		@Pc(440) byte[] local440;
		@Pc(445) Class80_Sub36 local445;
		if ((arg3 & 0x800) != 0) {
			local8 = arg0.method23245(482393438);
			local440 = new byte[local8];
			local445 = new Class80_Sub36(local440);
			arg0.method23234(local440, 0, local8, (byte) -25);
			Class51.aClass80_Sub36Array2[arg1] = local445;
			arg2.method19054(local445, 2015216348);
		}
		if ((arg3 & 0x80) != 0) {
			@Pc(466) int[] local466 = new int[4];
			for (local12 = 0; local12 < 4; local12++) {
				local466[local12] = arg0.method23210((byte) 19);
			}
			local12 = arg0.method23245(482393438);
			Class302.method27107(arg2, local466, local12, false, -1963690694);
		}
		if ((arg3 & 0x4) != 0) {
			local8 = arg0.method23212(161919182);
			local440 = new byte[local8];
			local445 = new Class80_Sub36(local440);
			arg0.method23399(local440, 0, local8, -2083557781);
			Class51.aClass80_Sub36Array1[arg1] = local445;
			arg2.method19053(local445, 1913269934);
		}
		if ((arg3 & 0x100000) != 0) {
			local8 = arg0.method23178((byte) -62);
			local12 = arg0.method23314(2086650112);
			if (local8 == 65535) {
				local8 = -1;
			}
			local25 = arg0.method23213(-2007624699);
			local17 = local25 & 0x7;
			local36 = local25 >> 3 & 0xF;
			if (local36 == 15) {
				local36 = -1;
			}
			local329 = (local25 >> 7 & 0x1) == 1;
			arg2.method18998(local8, local12, local17, local36, local329, 4, -360356141);
		}
		if ((arg3 & 0x100) != 0) {
			local8 = arg0.method23221(-1798151567);
			local12 = arg0.method23182(490125916);
			if (local8 == 65535) {
				local8 = -1;
			}
			local25 = arg0.method23245(482393438);
			local17 = local25 & 0x7;
			local36 = local25 >> 3 & 0xF;
			if (local36 == 15) {
				local36 = -1;
			}
			local329 = (local25 >> 7 & 0x1) == 1;
			arg2.method18998(local8, local12, local17, local36, local329, 1, -360356141);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.anInterface4_5.method720((byte) 15);
			arg0.anInt3152 += 2068361142;
			local8 = arg0.aByteArray61[(arg0.anInt3152 += 1034180571) * -1380987821 - 1] & 0xFF;
			for (local12 = 0; local12 < local8; local12++) {
				local25 = arg0.method23213(314573791);
				local215 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), local25, -1513093869);
				local221 = Class528.aClass2_Sub1_Sub1_3.method1828(arg0, local215, -1862732805);
				arg2.anInterface4_5.method719(local221.anInt4907 * -38979583, local221.anObject19, -1807031453);
			}
		}
		if ((arg3 & 0x400000) != 0) {
			local8 = arg0.method23223(64736030);
			local12 = arg0.method23314(2086650112);
			if (local8 == 65535) {
				local8 = -1;
			}
			local25 = arg0.method23213(-1520400544);
			local17 = local25 & 0x7;
			local36 = local25 >> 3 & 0xF;
			if (local36 == 15) {
				local36 = -1;
			}
			local329 = (local25 >> 7 & 0x1) == 1;
			arg2.method18998(local8, local12, local17, local36, local329, 3, -360356141);
		}
		@Pc(761) String local761;
		if ((arg3 & 0x200000) != 0) {
			local761 = arg0.method23376((short) 21605);
			local12 = arg0.method23212(81291568);
			if ((local12 & 0x1) != 0) {
				Class255.method26406(2, local12, arg2.method19057(true, -394962924), arg2.method19066(false, 2075053051), arg2.aString75, local761, null, (byte) 3);
			}
			arg2.method19062(local761, 0, 0, (byte) 125);
		}
		if ((arg3 & 0x80000) != 0) {
			local8 = arg0.method23245(482393438);
			local245 = new int[local8];
			local248 = new int[local8];
			for (local17 = 0; local17 < local8; local17++) {
				local36 = arg0.method23223(-529305034);
				if ((local36 & 0xC000) == 49152) {
					local21 = arg0.method23223(342021732);
					local245[local17] = local36 << 16 | local21;
				} else {
					local245[local17] = local36;
				}
				local248[local17] = arg0.method23222(-33028736);
			}
			arg2.method18957(local245, local248, (byte) 124);
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2714 = arg0.method23178((byte) -38) * 1297842623;
			if (arg2.anInt2700 * 1679797067 == 0) {
				arg2.method19033(arg2.anInt2714 * -469406145, (byte) 1);
				arg2.anInt2714 = -1297842623;
			}
		}
		if ((arg3 & 0x8) != 0) {
			arg2.anInt2684 = arg0.method23216(1831183447) * 667758131;
			arg2.anInt2704 = arg0.method23216(1831183447) * -1025470439;
			arg2.anInt2676 = arg0.method23244(1064310825) * -465151701;
			arg2.anInt2675 = arg0.method23177((byte) -91) * 1443464925;
			arg2.anInt2686 = arg0.method23244(1807820343) * -638322203;
			arg2.anInt2687 = arg0.method23244(883904265) * 1429480385;
			arg2.anInt2688 = (arg0.method23222(1797953677) + client.anInt3436) * 1890574175;
			arg2.anInt2689 = (arg0.method23222(-338399378) + client.anInt3436) * -2021716995;
			arg2.anInt2677 = arg0.method23221(-690791672) * 1338483447;
			arg2.anInt2700 = -1307113885;
			arg2.anInt2702 = 0;
			arg2.anInt2684 += arg2.anIntArray234[0] * 667758131;
			arg2.anInt2704 += arg2.anIntArray242[0] * -1025470439;
			arg2.anInt2676 += arg2.anIntArray234[0] * -465151701;
			arg2.anInt2675 += arg2.anIntArray242[0] * 1443464925;
			arg2.anInt2686 += arg2.aByte99 * -638322203;
			arg2.anInt2687 += arg2.aByte99 * 1429480385;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aClass289_1 = (Class289) Class80_Sub39.method15030(Class289.method26920(-825189621), arg0.method23245(482393438), -1803819500);
			if (arg2.aClass289_1 == null) {
				arg2.aClass289_1 = Class289.aClass289_2;
			}
		}
		if ((arg3 & 0x200) == 0) {
			return;
		}
		local761 = arg0.method23376((short) 25176);
		if (arg2 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
			Class255.method26406(2, 0, arg2.method19057(true, -394962924), arg2.method19066(false, 2039794549), arg2.aString75, local761, null, (byte) 3);
		}
		arg2.method19062(local761, 0, 0, (byte) 7);
	}

	@OriginalMember(owner = "client!ahg", name = "acw", descriptor = "(Lclient!yp;B)V")
	static void method9832(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.method28480((String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], (byte) 15);
	}

	@OriginalMember(owner = "client!ahg", name = "arr", descriptor = "(Lclient!yp;I)V")
	static void method9833(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(27) String local27 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(42) boolean local42 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		Class129_Sub2_Sub1.method20293(local13, local27, local42, 1461301530);
	}

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(Lclient!afa;)V")
	public Class124_Sub1(@OriginalArg(0) Class102_Sub1 arg0) throws Exception_Sub5 {
		super(arg0);
		this.method9828(-1758751804);
	}

	@OriginalMember(owner = "client!ahg", name = "u", descriptor = "(I)Z")
	boolean method9828(@OriginalArg(0) int arg0) throws Exception_Sub5 {
		this.aClass113_2 = this.aClass102_Sub1_19.method21142("BatchedSprite");
		this.aClass80_Sub13_Sub1_1 = this.aClass113_2.method8302("SpriteSampler", 2133881888);
		this.aClass114_1 = this.aClass113_2.method8377("Normal", (byte) -31);
		this.aClass113_2.method8295(this.aClass114_1);
		return true;
	}

	@OriginalMember(owner = "client!ahg", name = "t", descriptor = "()V")
	@Override
	public void method10376() {
		this.aClass113_2.method8256();
		this.aClass113_2.method8280(this.aClass80_Sub13_Sub1_1, 0, this.anInterface34_20, (short) 14553);
	}

	@OriginalMember(owner = "client!ahg", name = "f", descriptor = "()V")
	@Override
	public void method10374() {
		this.aClass113_2.method8256();
		this.aClass113_2.method8280(this.aClass80_Sub13_Sub1_1, 0, this.anInterface34_20, (short) 24375);
	}

	@OriginalMember(owner = "client!ahg", name = "e", descriptor = "()V")
	@Override
	public void method10375() {
		this.aClass113_2.method8256();
		this.aClass113_2.method8280(this.aClass80_Sub13_Sub1_1, 0, this.anInterface34_20, (short) 22182);
	}

	@OriginalMember(owner = "client!ahg", name = "l", descriptor = "()Z")
	boolean method9829() throws Exception_Sub5 {
		this.aClass113_2 = this.aClass102_Sub1_19.method21142("BatchedSprite");
		this.aClass80_Sub13_Sub1_1 = this.aClass113_2.method8302("SpriteSampler", 2017557968);
		this.aClass114_1 = this.aClass113_2.method8377("Normal", (byte) -11);
		this.aClass113_2.method8295(this.aClass114_1);
		return true;
	}
}
