package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@OriginalClass("client!afv")
public final class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!afv", name = "f", descriptor = "I")
	static final int anInt873 = 1;

	@OriginalMember(owner = "client!afv", name = "gd", descriptor = "Lclient!pf;")
	public static Class480 aClass480_17;

	@OriginalMember(owner = "client!afv", name = "m", descriptor = "[Lclient!og;")
	Class460[] aClass460Array1;

	@OriginalMember(owner = "client!afv", name = "e", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!afv", name = "u", descriptor = "J")
	public long aLong28 = -5417489894409825011L;

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "Z")
	boolean aBoolean172 = false;

	@OriginalMember(owner = "client!afv", name = "i", descriptor = "J")
	long aLong29 = -1827088047933691291L;

	@OriginalMember(owner = "client!afv", name = "o", descriptor = "I")
	int anInt872 = 0;

	@OriginalMember(owner = "client!afv", name = "j", descriptor = "[Lclient!qn;")
	final Class512[] aClass512Array1;

	@OriginalMember(owner = "client!afv", name = "g", descriptor = "Ljava/util/Set;")
	Set aSet1;

	@OriginalMember(owner = "client!afv", name = "ig", descriptor = "(IIIIZB)V")
	static void method7315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		if (client.aClass539_1.method30932(-1638462787) == null) {
			Class279.aClass102_9.method20716(arg0, arg1, arg2, arg3, -16777216, (byte) 124);
			return;
		}
		@Pc(16) Class463 local16 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
		@Pc(18) boolean local18 = false;
		if (client.anInt3541 * -1330995431 == 3) {
			if ((int) local16.aFloat297 < 0 || (int) local16.aFloat297 >= client.aClass539_1.method30921(2085483617) * 512 || (int) local16.aFloat296 < 0 || (int) local16.aFloat296 >= client.aClass539_1.method31011(-1194298857) * 512) {
				local18 = true;
			}
			if (Class368.anInt4502 * -1583611537 == 3 && !Class160.aClass121_Sub1_2.method9600(-650332462)) {
				local18 = true;
			}
		} else if (!client.aBoolean722) {
			local18 = true;
		}
		if (local18) {
			Class279.aClass102_9.method20716(arg0, arg1, arg2, arg3, -16777216, (byte) 112);
			return;
		}
		client.anInt3496 += 870804655;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 != null && (int) local16.aFloat297 - (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -7) - 1) * 256 >> 9 == Class27.anInt85 * 764713663 && (int) local16.aFloat296 - (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -112) - 1) * 256 >> 9 == Class27.anInt88 * -812677461) {
			Class27.anInt85 = 1198271169;
			Class27.anInt88 = 2069609469;
			Class677.method33597((short) 9250);
		}
		Class453.method29296(1706917211);
		if (!arg4) {
			Class85.method1696(-1688491570);
		}
		Class79.method1435((short) 30000);
		@Pc(135) int local135;
		for (local135 = 0; local135 < client.aClass574Array1.length; local135++) {
			if (client.aClass574Array1[local135] != null && !client.aClass574Array1[local135].method31762(1780695657) && client.aClass574Array1[local135].method31754(Class279.aClass102_9, (short) 18303)) {
				client.aClass574Array1[local135].method31750(client.aClass539_1.method30932(-1638462787), -1833363218);
			}
		}
		Class385.method28602(arg0, arg1, arg2, arg3, true, (byte) 94);
		@Pc(177) int local177 = client.anInt3587 * -1188403957;
		@Pc(181) int local181 = client.anInt3565 * 1317994825;
		@Pc(185) int local185 = client.anInt3439 * -1389306785;
		@Pc(189) int local189 = client.anInt3576 * -1460317605;
		Class646.method33048(local177, local181, (byte) -113);
		@Pc(240) int local240;
		if (Class368.anInt4502 * -1583611537 == 2) {
			local135 = (int) client.aFloat254;
			if (client.anInt3487 * 467081551 >> 8 > local135) {
				local135 = client.anInt3487 * 467081551 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray330[4] + 128 > local135) {
				local135 = client.anIntArray330[4] + 128;
			}
			local240 = (int) client.aFloat255 + client.anInt3471 * 2051687043 & 0x3FFF;
			Class616.method32289(Class268.anInt3917 * 1368033245, Class439.method29150((int) local16.aFloat297, (int) local16.aFloat296, Class507.anInt5045 * -1170417853, 1037753497) - client.anInt3486 * 67931827, Class315.anInt4021 * -262576965, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, 1238893364);
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local135 = (int) client.aFloat254;
			if (client.anInt3487 * 467081551 >> 8 > local135) {
				local135 = client.anInt3487 * 467081551 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray330[4] + 128 > local135) {
				local135 = client.anIntArray330[4] + 128;
			}
			local240 = (int) client.aFloat255 & 0x3FFF;
			Class616.method32289(Class268.anInt3917 * 1368033245, Class439.method29150(client.anInt3479 * -1853431703, client.anInt3480 * 608799169, Class507.anInt5045 * -1170417853, 1037753497) - client.anInt3486 * 67931827, Class315.anInt4021 * -262576965, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, 1476411733);
		} else if (Class368.anInt4502 * -1583611537 == 1) {
			Class528.method30720(local189, (byte) 106);
		}
		local135 = Class89.anInt319 * 1749751025;
		local240 = Class283.anInt3937 * -1465520451;
		@Pc(375) int local375 = Class102_Sub2.anInt653 * 1132703631;
		@Pc(379) int local379 = client.anInt3481 * 1789770377;
		@Pc(383) int local383 = Class664.anInt5692 * -953671403;
		@Pc(427) int local427;
		for (@Pc(385) int local385 = 0; local385 < 5; local385++) {
			if (client.aBooleanArray21[local385]) {
				local427 = (int) (Math.random() * (double) (client.anIntArray329[local385] * 2 + 1) - (double) client.anIntArray329[local385] + Math.sin((double) client.anIntArray331[local385] / 100.0D * (double) client.anIntArray332[local385]) * (double) client.anIntArray330[local385]);
				if (local385 == 0) {
					Class89.anInt319 += (local427 << 2) * 2068667409;
				}
				if (local385 == 1) {
					Class283.anInt3937 += (local427 << 2) * 364051605;
				}
				if (local385 == 2) {
					Class102_Sub2.anInt653 += (local427 << 2) * 483037039;
				}
				if (local385 == 3) {
					Class664.anInt5692 = (Class664.anInt5692 * -953671403 + local427 & 0x3FFF) * -399825347;
				}
				if (local385 == 4) {
					client.anInt3481 += local427 * -560342087;
					if (client.anInt3481 * 1789770377 < 1024) {
						client.anInt3481 = 1735320576;
					} else if (client.anInt3481 * 1789770377 > 3072) {
						client.anInt3481 = 910994432;
					}
				}
			}
		}
		if (Class89.anInt319 * 1749751025 < 0) {
			Class89.anInt319 = 0;
		}
		if (Class89.anInt319 * 1749751025 > (client.aClass539_1.method30932(-1638462787).anInt5245 * 1487025827 << 9) - 1) {
			Class89.anInt319 = ((client.aClass539_1.method30932(-1638462787).anInt5245 * 1487025827 << 9) - 1) * 2068667409;
		}
		if (Class102_Sub2.anInt653 * 1132703631 < 0) {
			Class102_Sub2.anInt653 = 0;
		}
		if (Class102_Sub2.anInt653 * 1132703631 > (client.aClass539_1.method30932(-1638462787).anInt5246 * -1561777241 << 9) - 1) {
			Class102_Sub2.anInt653 = ((client.aClass539_1.method30932(-1638462787).anInt5246 * -1561777241 << 9) - 1) * 483037039;
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub10_2.method16018(-1782856669) == 2) {
			Class147.method23931(1745685701);
		} else if (Class703.aClass80_Sub37_49.aClass165_Sub10_2.method16018(-423079405) == 3) {
			Class341.method27940(-515844729);
		}
		Class279.aClass102_9.method20706(local177, local181, local185, local189);
		Class279.aClass102_9.method20712(true);
		Class279.aClass102_9.method20986(local177, local181, local185 + local177, local181 + local189);
		@Pc(607) Class655 local607 = client.aClass539_1.method30904((byte) -84).method33370(2009905140);
		local427 = local607.method33183(-145216570);
		@Pc(615) Class363 local615 = new Class363();
		@Pc(619) Class626 local619 = client.aClass539_1.method30893((byte) -52);
		if (Class130.method10199(755243815)) {
			Class606.aClass121_Sub1_3.method9601(local615, client.aClass471_51, client.aClass487_95, local619.anInt5540 * -390642507 << 9, local619.anInt5537 * -894305615 << 9, -172011429);
		} else if (Class368.anInt4502 * -1583611537 == 3) {
			Class160.aClass121_Sub1_2.method9601(local615, client.aClass471_51, client.aClass487_95, local619.anInt5540 * -390642507 << 9, local619.anInt5537 * -894305615 << 9, -494292523);
		} else {
			client.aClass471_51.method29775((float) -(Class89.anInt319 * 1749751025), (float) -(Class283.anInt3937 * -1465520451), (float) -(Class102_Sub2.anInt653 * 1132703631));
			client.aClass471_51.method29774(0.0F, -1.0F, 0.0F, Class467.method29716(-(Class664.anInt5692 * -953671403) & 0x3FFF));
			client.aClass471_51.method29774(-1.0F, 0.0F, 0.0F, Class467.method29716(-(client.anInt3481 * 1789770377) & 0x3FFF));
			client.aClass471_51.method29774(0.0F, 0.0F, -1.0F, Class467.method29716(-(Class338.anInt4231 * -553315487) & 0x3FFF));
			Class269.method26687(client.aClass487_95, true, (float) (local185 / 2), (float) (local189 / 2), (float) (client.anInt3498 * 1097261927 << 1), (float) (client.anInt3498 * 1097261927 << 1), local185, local189, -1132540387);
		}
		Class279.aClass102_9.method20759(client.aClass471_51);
		Class279.aClass102_9.method20933(client.aClass487_95);
		@Pc(786) int local786;
		if (local607.method33184(-848346037) == null) {
			Class279.aClass102_9.method20714(3, local427);
		} else {
			Class279.aClass102_9.method20801(1.0F);
			Class279.aClass102_9.method20765(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Class368.anInt4502 * -1583611537 == 3) {
				@Pc(778) int local778 = (int) ((double) Class160.aClass121_Sub1_2.method9612(1665100075) * 2607.5945876176133D);
				local786 = (int) ((double) Class160.aClass121_Sub1_2.method9648(-1639232169) * 2607.5945876176133D);
				local607.method33184(-1566042451).method31296(Class279.aClass102_9, Class262.anInt3902 * -672465957 << 3, local177, local181, local185, local189, local778, local786, 0, local427, true, false, -767356145);
			} else {
				local607.method33184(-458476464).method31296(Class279.aClass102_9, Class262.anInt3902 * -672465957 << 3, local177, local181, local185, local189, client.anInt3481 * 1789770377, Class664.anInt5692 * -953671403, Class338.anInt4231 * -553315487, local427, true, false, -767356145);
			}
			Class279.aClass102_9.method20744();
		}
		Class279.aClass102_9.method20712(false);
		Class290.method26933(client.aClass471_51, client.aClass487_95, local185, local189, 1889319721);
		client.aClass539_1.method30904((byte) -58).method33366(client.aClass539_1, (byte) -17);
		local786 = Class703.aClass80_Sub37_49.aClass165_Sub10_2.method16018(-655053476);
		@Pc(870) byte local870;
		if (local786 == 2) {
			local870 = (byte) (client.anInt3496 * 939223631);
		} else if (local786 == 3) {
			local870 = (byte) (client.aBoolean750 ? 1 : -1);
		} else {
			local870 = 1;
		}
		if (Class130.method10199(755243815) || Class368.anInt4502 * -1583611537 == 3) {
			client.aClass539_1.method30932(-1638462787).method31580(client.anInt3436, local615.anInt4494 * -1436739801, local615.anInt4495 * -1997461327, local615.anInt4496 * 803116615, client.aClass539_1.method30960(-126036613), client.anIntArray305, client.anIntArray314, client.anIntArray315, client.anIntArray316, client.anIntArray317, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + 1, local870, (int) local16.aFloat297 >> 9, (int) local16.aFloat296 >> 9, Class703.aClass80_Sub37_49.aClass165_Sub7_1.method15953(-395223684) == 0, true, 0, true);
		} else {
			client.aClass539_1.method30932(-1638462787).method31580(client.anInt3436, Class89.anInt319 * 1749751025, Class283.anInt3937 * -1465520451, Class102_Sub2.anInt653 * 1132703631, client.aClass539_1.method30960(693786935), client.anIntArray305, client.anIntArray314, client.anIntArray315, client.anIntArray316, client.anIntArray317, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + 1, local870, (int) local16.aFloat297 >> 9, (int) local16.aFloat296 >> 9, Class703.aClass80_Sub37_49.aClass165_Sub7_1.method15953(-1366749376) == 0, true, 0, true);
		}
		client.anInt3440 += 965673495;
		if (!Class279.aClass102_9.method20776() && client.anInt3433 * 1994758437 == 18) {
			Class138.method11537(local177, local181, local185, local189, 2025420213);
		}
		client.aClass539_1.method30932(-1638462787).method31672(1702121439);
		Class89.anInt319 = local135 * 2068667409;
		Class283.anInt3937 = local240 * 364051605;
		Class102_Sub2.anInt653 = local375 * 483037039;
		client.anInt3481 = local379 * -560342087;
		Class664.anInt5692 = local383 * -399825347;
		if (client.aBoolean730 && Class108_Sub2.aClass139_8.method10767((byte) 78) == 0) {
			client.aBoolean730 = false;
		}
		if (client.aBoolean730) {
			Class279.aClass102_9.method20716(local177, local181, local185, local189, -16777216, (byte) 26);
			Class92.method1878(Class60.aClass60_99.method1180(Class512.aClass719_3, -1804461417), false, Class279.aClass102_9, Class709.aClass104_26, Class689.aClass15_13, 803918904);
		}
		Class269.method26687(client.aClass487_95, false, (float) (local177 + local185 / 2), (float) (local189 / 2 + local181), (float) (client.anInt3498 * 1097261927 << 1), (float) (client.anInt3498 * 1097261927 << 1), local185, local189, -1132540387);
		Class279.aClass102_9.method20933(client.aClass487_95);
		Class103_Sub17_Sub1.method18565(client.aClass487_95, (byte) 109);
	}

	@OriginalMember(owner = "client!afv", name = "if", descriptor = "(Lclient!ahb;[I[I[II)V")
	public static void method7316(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(9) int local9 = arg1[local1];
			@Pc(13) int local13 = arg3[local1];
			@Pc(17) int local17 = arg2[local1];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg0.aClass6_Sub1_Sub1Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass6_Sub1_Sub1Array3[local19] = null;
					} else {
						@Pc(47) Class261 local47 = (Class261) Class125.aClass41_Sub1_6.method18054(local9, -165393376);
						@Pc(52) int local52 = local47.anInt3897 * 746333843;
						@Pc(57) Class6_Sub1_Sub1 local57 = arg0.aClass6_Sub1_Sub1Array3[local19];
						if (local57 != null && local57.method23590(-499060808)) {
							if (local9 == local57.method23582(-671997009)) {
								if (local52 == 0) {
									arg0.aClass6_Sub1_Sub1Array3[local19] = null;
									local57 = null;
								} else if (local52 == 1) {
									local57.method23598((short) -26499);
									local57.anInt3222 = local17 * 1688866949;
								} else if (local52 == 2) {
									local57.method23597(-1884244150);
								}
							} else if (local47.anInt3888 * 1680050639 >= local57.method23581((byte) 67).anInt3888 * 1680050639) {
								arg0.aClass6_Sub1_Sub1Array3[local19] = null;
								local57 = null;
							}
						}
						if (local57 == null || !local57.method23590(-499060808)) {
							local57 = arg0.aClass6_Sub1_Sub1Array3[local19] = new Class6_Sub1_Sub1(arg0);
							local57.method23587(local9, -2060415981);
							local57.anInt3222 = local17 * 1688866949;
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!afv", name = "<init>", descriptor = "(Lclient!add;)V")
	public Class110_Sub1(@OriginalArg(0) Class2_Sub1 arg0) {
		super(arg0);
		this.aClass512Array1 = new Class512[arg0.method18051(-737957540)];
		for (@Pc(25) int local25 = 0; local25 < arg0.method18051(107408706); local25++) {
			this.aClass512Array1[local25] = ((Class107) arg0.method18054(local25, 693925601)).aClass512_3;
		}
		this.aSet1 = new HashSet(arg0.method18051(-2108670996));
	}

	@OriginalMember(owner = "client!afv", name = "q", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36997(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method36988(arg0, -1671888128);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			}
		}
		super.method37001(arg0, arg1, 2140639790);
	}

	@OriginalMember(owner = "client!afv", name = "s", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36992(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		if (Class512.aClass512_4 == this.aClass512Array1[arg0.anInt862 * -1873516487]) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36984(arg0, 1996950136) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36985(arg0, arg1);
	}

	@OriginalMember(owner = "client!afv", name = "am", descriptor = "(Lclient!abp;)V")
	public void method7296(@OriginalArg(0) Class40 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface4_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class460 local14 = (Class460) var4.next();
						if (this.aClass512Array1[local14.anInt4907 * -38979583] == Class512.aClass512_4) {
							local3 += Class615.aClass2_Sub1_Sub2_14.method1821(local14, (byte) 118);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1);
					local37.p2(local5);
					@Pc(49) Iterator local49 = this.anInterface4_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class460 local56 = (Class460) local49.next();
						if (Class512.aClass512_4 == this.aClass512Array1[local56.anInt4907 * -38979583]) {
							Class615.aClass2_Sub1_Sub2_14.method1822(local37, local56, 1911977975);
						}
					}
					arg0.method834(local37.data, 0, local37.pos * -1380987821, (byte) 1);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method838(-599456460);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method838(-1159284339);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method838(646738274);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong28 = Class303.method27111((byte) 51) * 5417489894409825011L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afv", name = "i", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36989(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36980(arg0, -1351895873) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36983(arg0, arg1, -92320392);
	}

	@OriginalMember(owner = "client!afv", name = "v", descriptor = "(I)V")
	public void method7297(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass512Array1.length; local1++) {
			if (Class512.aClass512_6 == this.aClass512Array1[local1] || this.aClass512Array1[local1] == Class512.aClass512_5) {
				this.anInterface4_2.method721(local1, 288336073);
			}
		}
		this.aSet1.clear();
		this.aBoolean172 = false;
		this.aClass460Array1 = null;
		this.aLong29 = -1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "(Lclient!ea;Ljava/lang/Object;I)V")
	@Override
	public void method37001(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method36988(arg0, -1671888128);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			}
		}
		super.method37001(arg0, arg1, 2089306867);
	}

	@OriginalMember(owner = "client!afv", name = "n", descriptor = "(Lclient!abp;S)V")
	public void method7298(@OriginalArg(0) Class40 arg0, @OriginalArg(1) short arg1) {
		boolean var21 = false;
		label255: {
			label242: {
				label243: {
					label256: {
						label257: {
							try {
								var21 = true;
								@Pc(7) byte[] local7 = new byte[(int) arg0.method839((byte) 0)];
								@Pc(21) int local21;
								for (int var4 = 0; var4 < local7.length; var4 += local21) {
									local21 = arg0.method832(local7, var4, local7.length - var4, (byte) -2);
									if (local21 == -1) {
										throw new EOFException();
									}
								}
								@Pc(38) Packet local38 = new Packet(local7);
								if (local38.data.length - local38.pos * -1380987821 < 1) {
									var21 = false;
									break label242;
								}
								@Pc(58) int local58 = local38.g1();
								if (local58 < 0) {
									var21 = false;
									break label255;
								}
								if (local58 > 1) {
									var21 = false;
									break label255;
								}
								if (local38.data.length - local38.pos * -1380987821 < 2) {
									var21 = false;
									break label243;
								}
								@Pc(89) int local89 = local38.g2();
								if (local38.data.length - local38.pos * -1380987821 < local89 * 6) {
									var21 = false;
									break label256;
								}
								@Pc(109) int local109 = 0;
								while (true) {
									if (local109 >= local89) {
										var21 = false;
										break;
									}
									@Pc(117) Class460 local117 = Class615.aClass2_Sub1_Sub2_14.method1820(local38, -216267726);
									if (Class512.aClass512_4 == this.aClass512Array1[local117.anInt4907 * -38979583] && ((Class107) Class615.aClass2_Sub1_Sub2_14.method18054(local117.anInt4907 * -38979583, 825819041)).aClass521_6.method30623(-666678663).aClass2.isAssignableFrom(local117.anObject19.getClass())) {
										this.anInterface4_2.method719(local117.anInt4907 * -38979583, local117.anObject19, -1715695710);
									}
									local109++;
								}
							} catch (@Pc(164) Exception local164) {
								var21 = false;
								break label257;
							} finally {
								if (var21) {
									try {
										arg0.method838(310336747);
									} catch (@Pc(176) Exception local176) {
									}
								}
							}
							try {
								arg0.method838(-685037181);
							} catch (@Pc(162) Exception local162) {
							}
							return;
						}
						try {
							arg0.method838(-883532954);
						} catch (@Pc(169) Exception local169) {
						}
						return;
					}
					try {
						arg0.method838(1728890651);
					} catch (@Pc(106) Exception local106) {
					}
					return;
				}
				try {
					arg0.method838(-1776323822);
				} catch (@Pc(84) Exception local84) {
				}
				return;
			}
			try {
				arg0.method838(-146363496);
			} catch (@Pc(53) Exception local53) {
			}
			return;
		}
		try {
			arg0.method838(310267128);
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!afv", name = "c", descriptor = "(Lclient!abp;I)V")
	public void method7299(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		boolean var15 = false;
		label109: {
			label108: {
				try {
					var15 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var5 = this.anInterface4_2.iterator();
					while (var5.hasNext()) {
						@Pc(14) Class460 local14 = (Class460) var5.next();
						if (this.aClass512Array1[local14.anInt4907 * -38979583] == Class512.aClass512_4) {
							local3 += Class615.aClass2_Sub1_Sub2_14.method1821(local14, (byte) 88);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1);
					local37.p2(local5);
					@Pc(49) Iterator local49 = this.anInterface4_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class460 local56 = (Class460) local49.next();
						if (Class512.aClass512_4 == this.aClass512Array1[local56.anInt4907 * -38979583]) {
							Class615.aClass2_Sub1_Sub2_14.method1822(local37, local56, 1690099281);
						}
					}
					arg0.method834(local37.data, 0, local37.pos * -1380987821, (byte) 1);
					var15 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var15 = false;
				} finally {
					if (var15) {
						try {
							arg0.method838(-1044362888);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method838(-2111576490);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method838(1409929916);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong28 = Class303.method27111((byte) 86) * 5417489894409825011L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afv", name = "b", descriptor = "(B)V")
	public void method7300(@OriginalArg(0) byte arg0) {
		if (Class303.method27111((byte) 7) < this.aLong29 * -1539683278029240173L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass460Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass460Array1 = new Class460[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass460Array1[local23++] = new Class460(local35, this.anInterface4_2.method718(local35, (byte) 81));
			}
			this.anInt872 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass460Array1 == null || this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			return;
		}
		@Pc(74) Class75 local74 = Class52.method1074(16777215);
		if (local74.anInt249 * 982154633 > 1200) {
			return;
		}
		@Pc(87) Class80_Sub31 local87 = Class623.method32440(Class443.aClass443_73, local74.aClass22_1, -191270971);
		local87.aPacketBit_2.p2(0);
		local35 = local87.aPacketBit_2.pos * -1380987821;
		local87.aPacketBit_2.pos += 1034180571;
		while (this.anInt872 * -355906771 < this.aClass460Array1.length) {
			@Pc(121) Class460 local121 = this.aClass460Array1[this.anInt872 * -355906771];
			if (local87.aPacketBit_2.pos * -1380987821 + local74.anInt249 * 982154633 + Class615.aClass2_Sub1_Sub2_14.method1821(local121, (byte) 96) > 1500) {
				break;
			}
			Class615.aClass2_Sub1_Sub2_14.method1822(local87.aPacketBit_2, local121, 686126931);
			this.anInt872 += 263470245;
		}
		local87.aPacketBit_2.p2check(local87.aPacketBit_2.pos * -1380987821 - local35);
		if (this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			local87.aPacketBit_2.data[local35] = 1;
		} else {
			local87.aPacketBit_2.data[local35] = 0;
		}
		local74.method1325(local87, (byte) -104);
		this.aLong29 = (Class303.method27111((byte) 127) + 1000L) * 1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "ao", descriptor = "(I)V")
	public void method7301(@OriginalArg(0) int arg0) {
		if (this.aClass460Array1 != null && this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			this.aClass460Array1 = null;
			this.anInt872 = 0;
		}
	}

	@OriginalMember(owner = "client!afv", name = "av", descriptor = "()V")
	public void method7302() {
		if (this.aClass460Array1 != null && this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			this.aClass460Array1 = null;
			this.anInt872 = 0;
		}
	}

	@OriginalMember(owner = "client!afv", name = "af", descriptor = "(Lclient!abp;)V")
	public void method7303(@OriginalArg(0) Class40 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface4_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class460 local14 = (Class460) var4.next();
						if (this.aClass512Array1[local14.anInt4907 * -38979583] == Class512.aClass512_4) {
							local3 += Class615.aClass2_Sub1_Sub2_14.method1821(local14, (byte) 109);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1);
					local37.p2(local5);
					@Pc(49) Iterator local49 = this.anInterface4_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class460 local56 = (Class460) local49.next();
						if (Class512.aClass512_4 == this.aClass512Array1[local56.anInt4907 * -38979583]) {
							Class615.aClass2_Sub1_Sub2_14.method1822(local37, local56, 939400343);
						}
					}
					arg0.method834(local37.data, 0, local37.pos * -1380987821, (byte) 1);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method838(166040956);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method838(-828740122);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method838(-8317186);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong28 = Class303.method27111((byte) 81) * 5417489894409825011L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afv", name = "j", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36990(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36980(arg0, -1150109020) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36983(arg0, arg1, -1290487192);
	}

	@OriginalMember(owner = "client!afv", name = "k", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36999(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		if (Class512.aClass512_4 == this.aClass512Array1[arg0.anInt862 * -1873516487]) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36984(arg0, 1951250790) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36985(arg0, arg1);
	}

	@OriginalMember(owner = "client!afv", name = "x", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36994(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		if (Class512.aClass512_4 == this.aClass512Array1[arg0.anInt862 * -1873516487]) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36984(arg0, 2031370799) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36985(arg0, arg1);
	}

	@OriginalMember(owner = "client!afv", name = "r", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36996(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method36988(arg0, -1671888128);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			}
		}
		super.method37001(arg0, arg1, 2073352277);
	}

	@OriginalMember(owner = "client!afv", name = "ag", descriptor = "(Lclient!abp;)V")
	public void method7304(@OriginalArg(0) Class40 arg0) {
		boolean var20 = false;
		label255: {
			label242: {
				label243: {
					label256: {
						label257: {
							try {
								var20 = true;
								@Pc(7) byte[] local7 = new byte[(int) arg0.method839((byte) 0)];
								@Pc(21) int local21;
								for (int var3 = 0; var3 < local7.length; var3 += local21) {
									local21 = arg0.method832(local7, var3, local7.length - var3, (byte) -3);
									if (local21 == -1) {
										throw new EOFException();
									}
								}
								@Pc(38) Packet local38 = new Packet(local7);
								if (local38.data.length - local38.pos * -1380987821 < 1) {
									var20 = false;
									break label242;
								}
								@Pc(58) int local58 = local38.g1();
								if (local58 < 0) {
									var20 = false;
									break label255;
								}
								if (local58 > 1) {
									var20 = false;
									break label255;
								}
								if (local38.data.length - local38.pos * -1380987821 < 2) {
									var20 = false;
									break label243;
								}
								@Pc(89) int local89 = local38.g2();
								if (local38.data.length - local38.pos * -1380987821 < local89 * 6) {
									var20 = false;
									break label256;
								}
								@Pc(109) int local109 = 0;
								while (true) {
									if (local109 >= local89) {
										var20 = false;
										break;
									}
									@Pc(117) Class460 local117 = Class615.aClass2_Sub1_Sub2_14.method1820(local38, -2044500685);
									if (Class512.aClass512_4 == this.aClass512Array1[local117.anInt4907 * -38979583] && ((Class107) Class615.aClass2_Sub1_Sub2_14.method18054(local117.anInt4907 * -38979583, 1109049813)).aClass521_6.method30623(-666678663).aClass2.isAssignableFrom(local117.anObject19.getClass())) {
										this.anInterface4_2.method719(local117.anInt4907 * -38979583, local117.anObject19, -1995474660);
									}
									local109++;
								}
							} catch (@Pc(164) Exception local164) {
								var20 = false;
								break label257;
							} finally {
								if (var20) {
									try {
										arg0.method838(459348943);
									} catch (@Pc(176) Exception local176) {
									}
								}
							}
							try {
								arg0.method838(-1409866668);
							} catch (@Pc(162) Exception local162) {
							}
							return;
						}
						try {
							arg0.method838(1005686738);
						} catch (@Pc(169) Exception local169) {
						}
						return;
					}
					try {
						arg0.method838(-1172471479);
					} catch (@Pc(106) Exception local106) {
					}
					return;
				}
				try {
					arg0.method838(-96724507);
				} catch (@Pc(84) Exception local84) {
				}
				return;
			}
			try {
				arg0.method838(1218176937);
			} catch (@Pc(53) Exception local53) {
			}
			return;
		}
		try {
			arg0.method838(-896334794);
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!afv", name = "h", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36998(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method36988(arg0, -1671888128);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			}
		}
		super.method37001(arg0, arg1, 2087021043);
	}

	@OriginalMember(owner = "client!afv", name = "d", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36986(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method36988(arg0, -1671888128);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt862 * -1873516487);
			}
		}
		super.method37001(arg0, arg1, 2132351761);
	}

	@OriginalMember(owner = "client!afv", name = "aj", descriptor = "()V")
	public void method7305() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass512Array1.length; local1++) {
			if (Class512.aClass512_6 == this.aClass512Array1[local1] || this.aClass512Array1[local1] == Class512.aClass512_5) {
				this.anInterface4_2.method721(local1, 330526072);
			}
		}
		this.aSet1.clear();
		this.aBoolean172 = false;
		this.aClass460Array1 = null;
		this.aLong29 = -1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "ak", descriptor = "()V")
	public void method7306() {
		if (Class303.method27111((byte) 52) < this.aLong29 * -1539683278029240173L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass460Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass460Array1 = new Class460[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass460Array1[local23++] = new Class460(local35, this.anInterface4_2.method718(local35, (byte) 54));
			}
			this.anInt872 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass460Array1 == null || this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			return;
		}
		@Pc(74) Class75 local74 = Class52.method1074(16777215);
		if (local74.anInt249 * 982154633 > 1200) {
			return;
		}
		@Pc(87) Class80_Sub31 local87 = Class623.method32440(Class443.aClass443_73, local74.aClass22_1, -191270971);
		local87.aPacketBit_2.p2(0);
		local35 = local87.aPacketBit_2.pos * -1380987821;
		local87.aPacketBit_2.pos += 1034180571;
		while (this.anInt872 * -355906771 < this.aClass460Array1.length) {
			@Pc(121) Class460 local121 = this.aClass460Array1[this.anInt872 * -355906771];
			if (local87.aPacketBit_2.pos * -1380987821 + local74.anInt249 * 982154633 + Class615.aClass2_Sub1_Sub2_14.method1821(local121, (byte) 55) > 1500) {
				break;
			}
			Class615.aClass2_Sub1_Sub2_14.method1822(local87.aPacketBit_2, local121, 1571609027);
			this.anInt872 += 263470245;
		}
		local87.aPacketBit_2.p2check(local87.aPacketBit_2.pos * -1380987821 - local35);
		if (this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			local87.aPacketBit_2.data[local35] = 1;
		} else {
			local87.aPacketBit_2.data[local35] = 0;
		}
		local74.method1325(local87, (byte) -112);
		this.aLong29 = (Class303.method27111((byte) 108) + 1000L) * 1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "ac", descriptor = "()V")
	public void method7307() {
		this.anInt872 = 0;
	}

	@OriginalMember(owner = "client!afv", name = "ab", descriptor = "(Lclient!abp;)V")
	public void method7308(@OriginalArg(0) Class40 arg0) {
		boolean var20 = false;
		label255: {
			label242: {
				label243: {
					label256: {
						label257: {
							try {
								var20 = true;
								@Pc(7) byte[] local7 = new byte[(int) arg0.method839((byte) 0)];
								@Pc(21) int local21;
								for (int var3 = 0; var3 < local7.length; var3 += local21) {
									local21 = arg0.method832(local7, var3, local7.length - var3, (byte) -76);
									if (local21 == -1) {
										throw new EOFException();
									}
								}
								@Pc(38) Packet local38 = new Packet(local7);
								if (local38.data.length - local38.pos * -1380987821 < 1) {
									var20 = false;
									break label242;
								}
								@Pc(58) int local58 = local38.g1();
								if (local58 < 0) {
									var20 = false;
									break label255;
								}
								if (local58 > 1) {
									var20 = false;
									break label255;
								}
								if (local38.data.length - local38.pos * -1380987821 < 2) {
									var20 = false;
									break label243;
								}
								@Pc(89) int local89 = local38.g2();
								if (local38.data.length - local38.pos * -1380987821 < local89 * 6) {
									var20 = false;
									break label256;
								}
								@Pc(109) int local109 = 0;
								while (true) {
									if (local109 >= local89) {
										var20 = false;
										break;
									}
									@Pc(117) Class460 local117 = Class615.aClass2_Sub1_Sub2_14.method1820(local38, -535415868);
									if (Class512.aClass512_4 == this.aClass512Array1[local117.anInt4907 * -38979583] && ((Class107) Class615.aClass2_Sub1_Sub2_14.method18054(local117.anInt4907 * -38979583, 1357210901)).aClass521_6.method30623(-666678663).aClass2.isAssignableFrom(local117.anObject19.getClass())) {
										this.anInterface4_2.method719(local117.anInt4907 * -38979583, local117.anObject19, -1807190589);
									}
									local109++;
								}
							} catch (@Pc(164) Exception local164) {
								var20 = false;
								break label257;
							} finally {
								if (var20) {
									try {
										arg0.method838(926762970);
									} catch (@Pc(176) Exception local176) {
									}
								}
							}
							try {
								arg0.method838(1110613285);
							} catch (@Pc(162) Exception local162) {
							}
							return;
						}
						try {
							arg0.method838(-1611193046);
						} catch (@Pc(169) Exception local169) {
						}
						return;
					}
					try {
						arg0.method838(-1691770277);
					} catch (@Pc(106) Exception local106) {
					}
					return;
				}
				try {
					arg0.method838(13115266);
				} catch (@Pc(84) Exception local84) {
				}
				return;
			}
			try {
				arg0.method838(-982607039);
			} catch (@Pc(53) Exception local53) {
			}
			return;
		}
		try {
			arg0.method838(-1391694148);
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!afv", name = "t", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method36983(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_4) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36980(arg0, -100456500) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36983(arg0, arg1, 841933642);
	}

	@OriginalMember(owner = "client!afv", name = "ah", descriptor = "(Lclient!abp;)V")
	public void method7309(@OriginalArg(0) Class40 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface4_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class460 local14 = (Class460) var4.next();
						if (this.aClass512Array1[local14.anInt4907 * -38979583] == Class512.aClass512_4) {
							local3 += Class615.aClass2_Sub1_Sub2_14.method1821(local14, (byte) 62);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1);
					local37.p2(local5);
					@Pc(49) Iterator local49 = this.anInterface4_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class460 local56 = (Class460) local49.next();
						if (Class512.aClass512_4 == this.aClass512Array1[local56.anInt4907 * -38979583]) {
							Class615.aClass2_Sub1_Sub2_14.method1822(local37, local56, 1986949661);
						}
					}
					arg0.method834(local37.data, 0, local37.pos * -1380987821, (byte) 1);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method838(657689433);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method838(831537244);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method838(-688406522);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong28 = Class303.method27111((byte) 100) * 5417489894409825011L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afv", name = "y", descriptor = "(I)V")
	public void method7310(@OriginalArg(0) int arg0) {
		this.anInt872 = 0;
	}

	@OriginalMember(owner = "client!afv", name = "al", descriptor = "(Lclient!abp;)V")
	public void method7311(@OriginalArg(0) Class40 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface4_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class460 local14 = (Class460) var4.next();
						if (this.aClass512Array1[local14.anInt4907 * -38979583] == Class512.aClass512_4) {
							local3 += Class615.aClass2_Sub1_Sub2_14.method1821(local14, (byte) 127);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1);
					local37.p2(local5);
					@Pc(49) Iterator local49 = this.anInterface4_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class460 local56 = (Class460) local49.next();
						if (Class512.aClass512_4 == this.aClass512Array1[local56.anInt4907 * -38979583]) {
							Class615.aClass2_Sub1_Sub2_14.method1822(local37, local56, 1338603997);
						}
					}
					arg0.method834(local37.data, 0, local37.pos * -1380987821, (byte) 1);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method838(-692923420);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method838(1125597521);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method838(1371863529);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong28 = Class303.method27111((byte) 14) * 5417489894409825011L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afv", name = "e", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36985(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		if (Class512.aClass512_4 == this.aClass512Array1[arg0.anInt862 * -1873516487]) {
			this.aBoolean171 = true;
		} else if (this.aClass512Array1[arg0.anInt862 * -1873516487] == Class512.aClass512_5 && this.method36984(arg0, 2076489010) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt862 * -1873516487);
		}
		super.method36985(arg0, arg1);
	}

	@OriginalMember(owner = "client!afv", name = "at", descriptor = "()V")
	public void method7312() {
		if (Class303.method27111((byte) 64) < this.aLong29 * -1539683278029240173L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass460Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass460Array1 = new Class460[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass460Array1[local23++] = new Class460(local35, this.anInterface4_2.method718(local35, (byte) 47));
			}
			this.anInt872 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass460Array1 == null || this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			return;
		}
		@Pc(74) Class75 local74 = Class52.method1074(16777215);
		if (local74.anInt249 * 982154633 > 1200) {
			return;
		}
		@Pc(87) Class80_Sub31 local87 = Class623.method32440(Class443.aClass443_73, local74.aClass22_1, -191270971);
		local87.aPacketBit_2.p2(0);
		local35 = local87.aPacketBit_2.pos * -1380987821;
		local87.aPacketBit_2.pos += 1034180571;
		while (this.anInt872 * -355906771 < this.aClass460Array1.length) {
			@Pc(121) Class460 local121 = this.aClass460Array1[this.anInt872 * -355906771];
			if (local87.aPacketBit_2.pos * -1380987821 + local74.anInt249 * 982154633 + Class615.aClass2_Sub1_Sub2_14.method1821(local121, (byte) 104) > 1500) {
				break;
			}
			Class615.aClass2_Sub1_Sub2_14.method1822(local87.aPacketBit_2, local121, 165287542);
			this.anInt872 += 263470245;
		}
		local87.aPacketBit_2.p2check(local87.aPacketBit_2.pos * -1380987821 - local35);
		if (this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			local87.aPacketBit_2.data[local35] = 1;
		} else {
			local87.aPacketBit_2.data[local35] = 0;
		}
		local74.method1325(local87, (byte) -48);
		this.aLong29 = (Class303.method27111((byte) 101) + 1000L) * 1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "ad", descriptor = "()V")
	public void method7313() {
		if (Class303.method27111((byte) 46) < this.aLong29 * -1539683278029240173L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass460Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass460Array1 = new Class460[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass460Array1[local23++] = new Class460(local35, this.anInterface4_2.method718(local35, (byte) 96));
			}
			this.anInt872 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass460Array1 == null || this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			return;
		}
		@Pc(74) Class75 local74 = Class52.method1074(16777215);
		if (local74.anInt249 * 982154633 > 1200) {
			return;
		}
		@Pc(87) Class80_Sub31 local87 = Class623.method32440(Class443.aClass443_73, local74.aClass22_1, -191270971);
		local87.aPacketBit_2.p2(0);
		local35 = local87.aPacketBit_2.pos * -1380987821;
		local87.aPacketBit_2.pos += 1034180571;
		while (this.anInt872 * -355906771 < this.aClass460Array1.length) {
			@Pc(121) Class460 local121 = this.aClass460Array1[this.anInt872 * -355906771];
			if (local87.aPacketBit_2.pos * -1380987821 + local74.anInt249 * 982154633 + Class615.aClass2_Sub1_Sub2_14.method1821(local121, (byte) 28) > 1500) {
				break;
			}
			Class615.aClass2_Sub1_Sub2_14.method1822(local87.aPacketBit_2, local121, 881221063);
			this.anInt872 += 263470245;
		}
		local87.aPacketBit_2.p2check(local87.aPacketBit_2.pos * -1380987821 - local35);
		if (this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			local87.aPacketBit_2.data[local35] = 1;
		} else {
			local87.aPacketBit_2.data[local35] = 0;
		}
		local74.method1325(local87, (byte) -60);
		this.aLong29 = (Class303.method27111((byte) 118) + 1000L) * 1827088047933691291L;
	}

	@OriginalMember(owner = "client!afv", name = "an", descriptor = "()V")
	public void method7314() {
		if (this.aClass460Array1 != null && this.anInt872 * -355906771 >= this.aClass460Array1.length) {
			this.aClass460Array1 = null;
			this.anInt872 = 0;
		}
	}
}
