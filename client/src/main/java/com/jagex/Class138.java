package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public abstract class Class138 {

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!zl;")
	static Class710 aClass710_3;

	@OriginalMember(owner = "client!mr", name = "pq", descriptor = "(Lclient!yp;I)V")
	static void method11534(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class264.method26644(local11, local14, arg0, 388818002);
	}

	@OriginalMember(owner = "client!mr", name = "vb", descriptor = "(Lclient!yp;I)V")
	static void method11535(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(35) short local35 = 255;
		@Pc(37) short local37 = 256;
		Class490.aClass263_13.method26532(Class280.aClass280_9, local13, local23, local35, Class278.aClass278_5.method26831(1152654695), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local37, local33, 2092269831);
	}

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "(Ljava/lang/String;ZZB)V")
	public static void method11536(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class294.method26961("commands - This command", 1455295997);
				Class294.method26961("cls - Clear console", 1455295997);
				Class294.method26961("displayfps - Toggle FPS and other information", 1455295997);
				Class294.method26961("renderer - Print graphics renderer information", 1455295997);
				Class294.method26961("heap - Print java memory information", 1455295997);
				Class294.method26961("getcamerapos - Print location and direction of camera for use in bug reports", 1455295997);
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Class149.anInt1522 = 0;
				Class149.anInt1524 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean715 = !client.aBoolean715;
				if (client.aBoolean715) {
					Class294.method26961("FPS on", 1455295997);
				} else {
					Class294.method26961("FPS off", 1455295997);
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class203 local62 = Class279.aClass102_9.method20656();
				Class294.method26961("Toolkit ID: " + Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1337031338), 1455295997);
				Class294.method26961("Vendor: " + local62.anInt3384 * 1548391145, 1455295997);
				Class294.method26961("Name: " + local62.aString125, 1455295997);
				Class294.method26961("Version: " + local62.anInt3380 * -1713511153, 1455295997);
				Class294.method26961("Device: " + local62.aString126, 1455295997);
				Class294.method26961("Driver Version: " + local62.aLong341 * 5566305393711832135L, 1455295997);
				local139 = Class279.aClass102_9.method21048();
				if (local139.length() > 0) {
					Class294.method26961(local139, 1455295997);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class294.method26961("Heap: " + Class554.anInt3423 * -2024030715 + "MB", 1455295997);
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class626 local173 = client.aClass539_1.method30893((byte) -50);
				if (Class368.anInt4502 * -1583611537 == 3) {
					@Pc(182) Class463 local182 = Class160.aClass121_Sub1_2.method9608(239311056);
					@Pc(186) Class463 local186 = Class160.aClass121_Sub1_2.method9668(-1231992692);
					Class294.method26961("Pos: " + (new Class626(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (int) local182.aFloat297 >> 9, (int) local182.aFloat296 >> 9)).toString() + " Height: " + (Class439.method29150((int) local182.aFloat297 - (local173.anInt5540 * -390642507 << 9), (int) local182.aFloat296 - (local173.anInt5537 * -894305615 << 9), Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) + (int) local182.aFloat295), 1455295997);
					Class294.method26961("Look: " + (new Class626(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, (int) local186.aFloat297 >> 9, (int) local186.aFloat296 >> 9)).toString() + " Height: " + (Class439.method29150((int) local186.aFloat297 - (local173.anInt5540 * -390642507 << 9), (int) local182.aFloat296 - (local173.anInt5537 * -894305615 << 9), Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) + (int) local182.aFloat295), 1455295997);
				} else {
					Class294.method26961("Pos: " + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + "," + ((Class89.anInt319 * 1749751025 >> 9) + local173.anInt5540 * -390642507 >> 6) + "," + ((Class102_Sub2.anInt653 * 1132703631 >> 9) + local173.anInt5537 * -894305615 >> 6) + "," + ((Class89.anInt319 * 1749751025 >> 9) + local173.anInt5540 * -390642507 & 0x3F) + "," + (local173.anInt5537 * -894305615 + (Class102_Sub2.anInt653 * 1132703631 >> 9) & 0x3F) + " Height: " + (Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) - Class283.anInt3937 * -1465520451), 1455295997);
					Class294.method26961("Look: " + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 + "," + (local173.anInt5540 * -390642507 + Class606.anInt5395 * 1992380359 >> 6) + "," + (local173.anInt5537 * -894305615 + Class62.anInt214 * 1356155403 >> 6) + "," + (local173.anInt5540 * -390642507 + Class606.anInt5395 * 1992380359 & 0x3F) + "," + (Class62.anInt214 * 1356155403 + local173.anInt5537 * -894305615 & 0x3F) + " Height: " + (Class439.method29150(Class606.anInt5395 * 1992380359, Class62.anInt214 * 1356155403, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, 1037753497) - Class203.anInt3387 * 1729023179), 1455295997);
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class294.method26961(Class60.aClass60_2.method1180(Class512.aClass719_3, 585460867), 1455295997);
			return;
		}
		if (Class566.aClass697_1 != Class697.aClass697_4 || client.anInt3512 * -780671365 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class126.method20383(1, -1, -1, false, 1615516245);
					if (Class17.method437(-1349690784) == 1) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class126.method20383(2, -1, -1, false, 1615516245);
					if (Class17.method437(-1349690784) == 2) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (Class13.aBoolean5 && arg0.equalsIgnoreCase("wm3")) {
					Class126.method20383(3, 1024, 768, false, 1615516245);
					if (Class17.method437(-1349690784) == 3) {
						Class294.method26961("Success", 1455295997);
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				@Pc(570) Class80_Sub31 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3433 * 1994758437 != 4) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class294.method26961("Failure", 1455295997);
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class595.method31975(local139, local568, 1837490317);
					Class294.method26961("Success", 1455295997);
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class528.method30719(0, false, 1646868266);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1844450701) == 0) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 18);
						Class719.method37291(221396626);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class528.method30719(1, false, 835295966);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-316451504) == 1) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 1, (byte) 117);
						Class719.method37291(968567010);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class528.method30719(3, false, 63589675);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1352419495) == 3) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 3, (byte) 109);
						Class719.method37291(1787089972);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class528.method30719(5, false, 376508655);
					if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1618429289) == 5) {
						Class294.method26961("Success", 1455295997);
						Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 5, (byte) 4);
						Class719.method37291(1462486887);
						client.aBoolean714 = false;
					} else {
						Class294.method26961("Failure", 1455295997);
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3433 * 1994758437 == 18) {
						Class588.method31903((byte) -28);
					} else if (client.anInt3433 * 1994758437 == 3) {
						client.aClass75_1.aBoolean35 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class75[] local776 = client.aClass75Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class75 local786 = local776[local778];
						if (local786.method1321((byte) 2) != null) {
							local786.method1321((byte) 2).method15550((byte) 0);
						}
					}
					Class108_Sub2.aClass139_8.method10774(340163703);
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class294.method26961("varpbit=" + Class672.aClass134_1.method36978(Class672.aClass134_1.method28381(local568, -1482607674), (byte) -2), 1455295997);
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class294.method26961("varp=" + Class672.aClass134_1.method36980(Class672.aClass134_1.method28382(Class143.aClass143_71, local568, 1753681432), 917564637), 1455295997);
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = Class313.method27482(arg0.substring(12), ' ', 2036747717);
					if (local865.length == 2 || local865.length == 3) {
						if (Class353.method28071(1862808437)) {
							Class488.method30213(-1836834665);
						}
						Class60.method1183(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true, (byte) 4);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = Class313.method27482(arg0.substring(8), ' ', 2036747717);
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class129_Sub2_Sub1.method20293(local778, local923, true, 591377942);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class303.method27111((byte) 120) + ".log");
						if (local940.exists()) {
							Class294.method26961("file already exists!", 1455295997);
							return;
						}
					}
					if (Class677.aFileOutputStream1 != null) {
						Class677.aFileOutputStream1.close();
						Class677.aFileOutputStream1 = null;
					}
					try {
						Class677.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(982) FileNotFoundException local982) {
						Class294.method26961("Could not create " + local940.getName(), 1455295997);
						return;
					} catch (@Pc(995) SecurityException local995) {
						Class294.method26961("Cannot write to " + local940.getName(), 1455295997);
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class677.aFileOutputStream1 != null) {
						Class677.aFileOutputStream1.close();
					}
					Class677.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class294.method26961("No such file", 1455295997);
						return;
					}
					@Pc(1042) byte[] local1042 = Class480.method30006(local940, -152843898);
					if (local1042 == null) {
						Class294.method26961("Failed to read file", 1455295997);
						return;
					}
					@Pc(1060) String[] local1060 = Class313.method27482(Class165_Sub8.method15979(Class69.method1252(local1042, -1391852887), '\r', "", (byte) 58), '\n', 2036747717);
					Class301.method27038(local1060, 1132740453);
				}
				if (client.anInt3433 * 1994758437 == 18 || client.anInt3433 * 1994758437 == 13) {
					@Pc(1076) Class75 local1076 = Class52.method1074(16777215);
					local570 = Class623.method32440(Class443.aClass443_106, local1076.aClass22_1, -191270971);
					local570.aPacketBit_2.p1(arg0.length() + 3);
					local570.aPacketBit_2.p1(arg1 ? 1 : 0);
					local570.aPacketBit_2.p1(arg2 ? 1 : 0);
					local570.aPacketBit_2.pjstr(arg0);
					local1076.method1325(local570, (byte) -113);
				}
			} catch (@Pc(1119) Exception local1119) {
				Class294.method26961(Class60.aClass60_2.method1180(Class512.aClass719_3, -1886191921), 1455295997);
				return;
			}
		}
		if (client.anInt3433 * 1994758437 != 18 && client.anInt3433 * 1994758437 != 13) {
			Class294.method26961(Class60.aClass60_71.method1180(Class512.aClass719_3, -629682795) + arg0, 1455295997);
		}
	}

	@OriginalMember(owner = "client!mr", name = "jl", descriptor = "(IIIII)V")
	static void method11537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class165_Sub37.method16684(Class279.aClass102_9, 901357969);
		Class553.method31369(arg0, arg1, arg2, arg3, 256, 256, -1259213187);
		Class56.method1140(arg0, arg1, arg2, arg3, 256, 256, (byte) 100);
		Class575.method31786(arg0, arg1, arg2, arg3, 256, 256, -831817200);
		Class443.method29214(arg0, arg1, arg2, arg3, 1927240362);
	}

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "(I)V")
	static void method11538(@OriginalArg(0) int arg0) {
		Class155_Sub1.anIntArray196[44] = 71;
		Class155_Sub1.anIntArray196[45] = 26;
		Class155_Sub1.anIntArray196[46] = 72;
		Class155_Sub1.anIntArray196[47] = 73;
		Class155_Sub1.anIntArray196[59] = 57;
		Class155_Sub1.anIntArray196[61] = 27;
		Class155_Sub1.anIntArray196[91] = 42;
		Class155_Sub1.anIntArray196[92] = 74;
		Class155_Sub1.anIntArray196[93] = 43;
		Class155_Sub1.anIntArray196[192] = 28;
		Class155_Sub1.anIntArray196[222] = 58;
		Class155_Sub1.anIntArray196[520] = 59;
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	Class138() {
	}

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "(Lclient!qr;I)Lclient!ry;")
	public abstract Class541 method11508(@OriginalArg(0) Class516 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "(B)V")
	public abstract void method11509(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	public abstract Object method11510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "(Ljava/lang/Object;[BII)V")
	public abstract void method11511(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "(Ljava/lang/Object;[BIII)V")
	public abstract void method11512(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "(Ljava/lang/Object;I)I")
	public abstract int method11513(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "(Ljava/lang/Object;)I")
	public abstract int method11514(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "(Lclient!mb;I)Ljava/lang/Object;")
	abstract Object method11515(@OriginalArg(0) Class413 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "(I)Lclient!mt;")
	public abstract Class425 method11516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/Object;)V")
	public abstract void method11517(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "()Lclient!mt;")
	public abstract Class425 method11518();

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(Lclient!qr;)Lclient!ry;")
	public abstract Class541 method11519(@OriginalArg(0) Class516 arg0);

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "(Ljava/lang/Object;[BII)V")
	public abstract void method11520(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	abstract Object method11521(@OriginalArg(0) Class413 arg0);

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	abstract Object method11522(@OriginalArg(0) Class413 arg0);

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	abstract Object method11523(@OriginalArg(0) Class413 arg0);

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(Ljava/lang/Object;I)V")
	public abstract void method11524(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "()V")
	public abstract void method11525();

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "()V")
	public abstract void method11526();

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	public abstract Object method11527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "(I)V")
	public abstract void method11528(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	public abstract Object method11529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "(Lclient!qr;)Lclient!ry;")
	public abstract Class541 method11530(@OriginalArg(0) Class516 arg0);

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "(Lclient!qr;)Lclient!ry;")
	public abstract Class541 method11531(@OriginalArg(0) Class516 arg0);

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(IILclient!nv;Lclient!mm;IFI)Ljava/lang/Object;")
	public abstract Object method11532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
	public abstract void method11533();
}
