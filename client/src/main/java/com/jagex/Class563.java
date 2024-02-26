package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sx")
public final class Class563 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!sx", name = "this$0", descriptor = "Lclient!st;")
	final Class560 aClass560_3;

	@OriginalMember(owner = "client!sx", name = "t", descriptor = "[S")
	short[] aShortArray137;

	@OriginalMember(owner = "client!sx", name = "f", descriptor = "[Lclient!jf;")
	Class359[] aClass359Array2;

	@OriginalMember(owner = "client!sx", name = "e", descriptor = "[Lclient!jf;")
	Class359[] aClass359Array3;

	@OriginalMember(owner = "client!sx", name = "u", descriptor = "Lclient!jf;")
	Class359 aClass359_2;

	@OriginalMember(owner = "client!sx", name = "l", descriptor = "I")
	int anInt5196;

	@OriginalMember(owner = "client!sx", name = "qj", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31455(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		@Pc(18) int[] local18 = Class619.method32302(local13, arg2, -2100885606);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray24 = Class431.method29089(local13, arg2, 1172937796);
		arg0.anIntArray408 = local18;
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!sx", name = "aop", descriptor = "(Lclient!yp;S)V")
	static void method31456(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -442943724;
		@Pc(14) float local14 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) float local25 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] / 1000.0F;
		Class160.aClass121_Sub1_2.method9589(Class463.method29541(local14, local25, local36), local49, (byte) -54);
	}

	@OriginalMember(owner = "client!sx", name = "f", descriptor = "(II)Lclient!aao;")
	public static Class16 method31457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class16[] local2 = Class374.method28438(422188207);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class16 local12 = local2[local4];
			if (local12.anInt51 * -2128440987 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sx", name = "h", descriptor = "(Lclient!yp;B)V")
	static void method31458(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) TwitchWebcamDevice local16 = Class578.method31796(local12, -1592955391);
		if (local16 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.e * 1851409193;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.t;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.f;
		}
	}

	@OriginalMember(owner = "client!sx", name = "lg", descriptor = "(B)V")
	static void method31459(@OriginalArg(0) byte arg0) {
		Class296.method26998(client.aClass327_8, -1461777079);
		Class633.anInt5595 += -1512859331;
		if (client.aBoolean742 && client.aBoolean739) {
			@Pc(24) int local24 = Class363.aClass152_1.method14615(-1968239512);
			@Pc(28) int local28 = Class363.aClass152_1.method14598(-852739291);
			local24 -= client.anInt3441 * 1483088529;
			local28 -= client.anInt3535 * 1500197833;
			if (local24 < client.anInt3504 * 647329353) {
				local24 = client.anInt3504 * 647329353;
			}
			if (client.aClass327_8.anInt4103 * 1892149809 + local24 > client.anInt3504 * 647329353 + client.anInt3505 * -1211228313) {
				local24 = client.anInt3504 * 647329353 + client.anInt3505 * -1211228313 - client.aClass327_8.anInt4103 * 1892149809;
			}
			if (local28 < client.anInt3490 * -1221797399) {
				local28 = client.anInt3490 * -1221797399;
			}
			if (local28 + client.aClass327_8.anInt4104 * 1990157877 > client.anInt3490 * -1221797399 + client.anInt3434 * -156756049) {
				local28 = client.anInt3434 * -156756049 + client.anInt3490 * -1221797399 - client.aClass327_8.anInt4104 * 1990157877;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (client.aClass327_9 == Class45.aClass327_5) {
				local117 = local24;
				local119 = local28;
			} else {
				local117 = client.aClass327_9.anInt4110 * -1652867993 + (local24 - client.anInt3504 * 647329353);
				local119 = local28 - client.anInt3490 * -1221797399 + client.aClass327_9.anInt4111 * 458112843;
			}
			@Pc(158) Class80_Sub42 local158;
			if (Class363.aClass152_1.method14609((byte) 76)) {
				if (Class633.anInt5595 * 2131822101 > client.aClass327_8.anInt4158 * 1262000901) {
					@Pc(322) int local322 = local24 - client.anInt3538 * 669926485;
					@Pc(328) int local328 = local28 - client.anInt3462 * 436529235;
					if (local322 > client.aClass327_8.anInt4113 * 2011094349 || local322 < -(client.aClass327_8.anInt4113 * 2011094349) || local328 > client.aClass327_8.anInt4113 * 2011094349 || local328 < -(client.aClass327_8.anInt4113 * 2011094349)) {
						client.aBoolean743 = true;
					}
				}
				if (client.aClass327_8.anObjectArray18 != null && client.aBoolean743) {
					local158 = new Class80_Sub42();
					local158.aClass327_3 = client.aClass327_8;
					local158.anInt2050 = local117 * 54950921;
					local158.anInt2051 = local119 * 1729309275;
					local158.anObjectArray4 = client.aClass327_8.anObjectArray18;
					Class279.method26847(local158, 1219534298);
				}
			} else {
				if (client.aBoolean743) {
					Class450.method29279((byte) 28);
					if (client.aClass327_8.anObjectArray10 != null) {
						local158 = new Class80_Sub42();
						local158.aClass327_3 = client.aClass327_8;
						local158.anInt2050 = local117 * 54950921;
						local158.anInt2051 = local119 * 1729309275;
						@Pc(174) Class327 local174 = client.method25327(client.aClass327_8);
						@Pc(176) Class327 local176 = client.aClass327_6;
						@Pc(178) boolean local178 = false;
						while (local176 != null && local176.anInt4082 * 254495303 != -1 && local174 != null) {
							if (local174.anInt4087 * -2053489901 == local176.anInt4087 * -2053489901) {
								local178 = true;
								break;
							}
							local176 = Class709.aClass310Array1[local176.anInt4087 * -2053489901 >> 16].aClass327Array2[local176.anInt4082 * 254495303 & 0xFFFF];
						}
						if (local176 == null || local174 == null || Class45.aClass327_5 == local174 || local178) {
							local158.aClass327_4 = client.aClass327_6;
						} else {
							local158.aClass327_4 = Class45.aClass327_5;
						}
						local158.anObjectArray4 = client.aClass327_8.anObjectArray10;
						Class279.method26847(local158, 1045896355);
					}
					if (client.aClass327_6 != null && client.method25327(client.aClass327_8) != null) {
						Class120_Sub1_Sub3_Sub1.method12744(client.aClass327_8, client.aClass327_6, 16777472);
					}
				} else if ((client.anInt3520 * 790836551 == 1 || Class293.method26954(-1300456733)) && Class630.anInt5553 * 721317679 > 2) {
					Class100.method2956(client.anInt3441 * 1483088529 + client.anInt3538 * 669926485, client.anInt3462 * 436529235 + client.anInt3535 * 1500197833, -1558319686);
				} else if (Class80_Sub1_Sub8.method22029((byte) -116)) {
					Class100.method2956(client.anInt3538 * 669926485 + client.anInt3441 * 1483088529, client.anInt3535 * 1500197833 + client.anInt3462 * 436529235, -1383040451);
				}
				client.aClass327_8 = null;
				client.aClass327_9 = null;
			}
		} else if (Class633.anInt5595 * 2131822101 > 1) {
			client.aClass327_8 = null;
			client.aClass327_9 = null;
		}
	}

	@OriginalMember(owner = "client!sx", name = "<init>", descriptor = "(Lclient!st;)V")
	Class563(@OriginalArg(0) Class560 arg0) {
		this.aClass560_3 = arg0;
		this.aShortArray137 = new short[2];
		this.aClass359Array2 = new Class359[16];
		this.aClass359Array3 = new Class359[16];
		this.aClass359_2 = new Class359(8);
		this.anInt5196 = 0;
	}

	@OriginalMember(owner = "client!sx", name = "j", descriptor = "(Lclient!jc;I)I")
	int method31445(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method28116(this.aShortArray137, 0, 689038234) == 0) {
			return this.aClass359Array2[arg1].method28133(arg0, (byte) -48);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method28116(this.aShortArray137, 1, -926969710) == 0) {
			local33 = local16 + this.aClass359Array3[arg1].method28133(arg0, (byte) -50);
		} else {
			local33 = local16 + 8 + this.aClass359_2.method28133(arg0, (byte) -48);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sx", name = "t", descriptor = "(II)V")
	void method31446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (this.anInt5196 * 952332025 < arg0) {
			this.aClass359Array2[this.anInt5196 * 952332025] = new Class359(3);
			this.aClass359Array3[this.anInt5196 * 952332025] = new Class359(3);
			this.anInt5196 += 371716937;
		}
	}

	@OriginalMember(owner = "client!sx", name = "f", descriptor = "(B)V")
	void method31447(@OriginalArg(0) byte arg0) {
		Class584.method31847(this.aShortArray137, 1787226977);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5196 * 952332025; local5++) {
			this.aClass359Array2[local5].method28132(-1846052078);
			this.aClass359Array3[local5].method28132(-1825603475);
		}
		this.aClass359_2.method28132(-2117618730);
	}

	@OriginalMember(owner = "client!sx", name = "e", descriptor = "(Lclient!jc;II)I")
	int method31448(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg0.method28116(this.aShortArray137, 0, 259078053) == 0) {
			return this.aClass359Array2[arg1].method28133(arg0, (byte) -97);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method28116(this.aShortArray137, 1, 272069627) == 0) {
			local33 = local16 + this.aClass359Array3[arg1].method28133(arg0, (byte) -94);
		} else {
			local33 = local16 + 8 + this.aClass359_2.method28133(arg0, (byte) -8);
		}
		return local33;
	}

	@OriginalMember(owner = "client!sx", name = "u", descriptor = "(I)V")
	void method31449(@OriginalArg(0) int arg0) {
		while (this.anInt5196 * 952332025 < arg0) {
			this.aClass359Array2[this.anInt5196 * 952332025] = new Class359(3);
			this.aClass359Array3[this.anInt5196 * 952332025] = new Class359(3);
			this.anInt5196 += 371716937;
		}
	}

	@OriginalMember(owner = "client!sx", name = "l", descriptor = "(I)V")
	void method31450(@OriginalArg(0) int arg0) {
		while (this.anInt5196 * 952332025 < arg0) {
			this.aClass359Array2[this.anInt5196 * 952332025] = new Class359(3);
			this.aClass359Array3[this.anInt5196 * 952332025] = new Class359(3);
			this.anInt5196 += 371716937;
		}
	}

	@OriginalMember(owner = "client!sx", name = "g", descriptor = "()V")
	void method31451() {
		Class584.method31847(this.aShortArray137, 1862066313);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5196 * 952332025; local5++) {
			this.aClass359Array2[local5].method28132(-1873775421);
			this.aClass359Array3[local5].method28132(-1831541611);
		}
		this.aClass359_2.method28132(-1938147271);
	}

	@OriginalMember(owner = "client!sx", name = "i", descriptor = "()V")
	void method31452() {
		Class584.method31847(this.aShortArray137, 254794247);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5196 * 952332025; local5++) {
			this.aClass359Array2[local5].method28132(-1945179595);
			this.aClass359Array3[local5].method28132(-1904557179);
		}
		this.aClass359_2.method28132(-1853565650);
	}

	@OriginalMember(owner = "client!sx", name = "m", descriptor = "()V")
	void method31453() {
		Class584.method31847(this.aShortArray137, 370621425);
		for (@Pc(5) int local5 = 0; local5 < this.anInt5196 * 952332025; local5++) {
			this.aClass359Array2[local5].method28132(-1896152851);
			this.aClass359Array3[local5].method28132(-2109676072);
		}
		this.aClass359_2.method28132(-2111382499);
	}

	@OriginalMember(owner = "client!sx", name = "o", descriptor = "(Lclient!jc;I)I")
	int method31454(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.method28116(this.aShortArray137, 0, 846076145) == 0) {
			return this.aClass359Array2[arg1].method28133(arg0, (byte) -122);
		}
		@Pc(16) byte local16 = 8;
		@Pc(33) int local33;
		if (arg0.method28116(this.aShortArray137, 1, -1772329200) == 0) {
			local33 = local16 + this.aClass359Array3[arg1].method28133(arg0, (byte) -37);
		} else {
			local33 = local16 + 8 + this.aClass359_2.method28133(arg0, (byte) -113);
		}
		return local33;
	}
}
