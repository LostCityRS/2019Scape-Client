package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!adf")
public final class Class79 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!adf", name = "f", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!adf", name = "t", descriptor = "Lclient!qy;")
	Class521 aClass521_3;

	@OriginalMember(owner = "client!adf", name = "e", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!adf", name = "u", descriptor = "Z")
	public boolean aBoolean36 = true;

	@OriginalMember(owner = "client!adf", name = "lb", descriptor = "(ILclient!alk;[IZI)Lclient!alk;")
	public static Class80_Sub40 method1430(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub40 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class80_Sub40 local5 = (Class80_Sub40) client.aClass24_20.method560((long) arg0);
		if (local5 != null) {
			Class80_Sub42.method15605(local5, arg1.anInt3156 * -151091669 != local5.anInt3156 * -151091669, arg3, (byte) -36);
		}
		client.aClass24_20.method563(arg1, (long) arg0);
		Class682.method36706(arg1.anInt3156 * -151091669, arg2, 16711935);
		@Pc(40) Class327 local40 = Class301.method27041(arg0, 2038508323);
		if (local40 != null) {
			Class296.method26998(local40, -272194120);
		}
		if (client.aClass327_10 != null) {
			Class296.method26998(client.aClass327_10, 1227814280);
			client.aClass327_10 = null;
		}
		if (local40 != null) {
			Class388.method28636(Class709.aClass310Array1[local40.anInt4087 * -2053489901 >>> 16], local40, !arg3, (byte) 8);
		}
		if (!arg3) {
			Class367.method28283(arg1.anInt3156 * -151091669, arg2, -762353800);
		}
		if (!arg3 && client.anInt3460 * 1849344509 != -1) {
			Class2_Sub1_Sub2.method1852(client.anInt3460 * 1849344509, 1, -1693072807);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!adf", name = "my", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method1431(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class75 local2 = Class52.method1074(16777215);
		@Pc(8) Class80_Sub31 local8 = Class623.method32440(Class443.aClass443_5, local2.aClass22_1, -191270971);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aPacketBit_2.p1(Class350.method28013(arg0, (short) 16383) + Class350.method28013(arg1, (short) 16383));
		local8.aPacketBit_2.pjstr(arg1);
		local8.aPacketBit_2.pjstr(arg0);
		local2.method1325(local8, (byte) -18);
	}

	@OriginalMember(owner = "client!adf", name = "u", descriptor = "(I)I")
	public static int method1432(@OriginalArg(0) int arg0) {
		if (Class32.anInt105 * 1355646637 == -1) {
			@Pc(7) Class32[] local7 = Class337.method27878(51924286);
			for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
				@Pc(17) Class32 local17 = local7[local9];
				if (local17.anInt106 * -296656423 > Class32.anInt105 * 1355646637) {
					Class32.anInt105 = local17.anInt106 * 451209565;
				}
			}
			Class32.anInt105 += 2023738661;
		}
		return Class32.anInt105 * 1355646637;
	}

	@OriginalMember(owner = "client!adf", name = "atl", descriptor = "(Lclient!yp;B)V")
	static void method1433(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780);
	}

	@OriginalMember(owner = "client!adf", name = "m", descriptor = "(S)I")
	static int method1434(@OriginalArg(0) short arg0) {
		@Pc(4) int local4 = Class365.aClass360_19.anInt4490 * 1975723063;
		if (local4 < Class365.aClass360Array1.length - 1) {
			Class365.aClass360_19 = Class365.aClass360Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!adf", name = "jv", descriptor = "(S)V")
	static void method1435(@OriginalArg(0) short arg0) {
		@Pc(2) Iterator local2 = client.aClass24_19.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class80_Sub1_Sub8 local9 = (Class80_Sub1_Sub8) local2.next();
			@Pc(12) Class120_Sub1_Sub1_Sub5 local12 = local9.aClass120_Sub1_Sub1_Sub5_1;
			if (client.aClass539_1.method30932(-1638462787) != null && local12.method24334(2114300249)) {
				client.aClass539_1.method30932(-1638462787).method31696(local12, true, 6898847);
			}
		}
	}

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "()V")
	Class79() {
	}

	@OriginalMember(owner = "client!adf", name = "k", descriptor = "()Z")
	public boolean method1426() {
		return this.aClass521_3 == Class521.aClass521_42;
	}

	@OriginalMember(owner = "client!adf", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!adf", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1427(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_3 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 2) {
			this.anInt253 = arg0.g4() * -856157649;
		} else if (arg1 == 4) {
			this.aBoolean36 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr();
		} else if (arg1 == 101) {
			this.aClass521_3 = (Class521) Class80_Sub39.method15030(Class521.method30628(1687540357), arg0.gSmart1or2(), -1182821653);
		}
	}

	@OriginalMember(owner = "client!adf", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1427(arg0, local3, 923785774);
		}
	}

	@OriginalMember(owner = "client!adf", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!adf", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!adf", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1427(arg0, local3, 923785774);
		}
	}

	@OriginalMember(owner = "client!adf", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adf", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adf", name = "i", descriptor = "(I)Z")
	public boolean method1428(@OriginalArg(0) int arg0) {
		return this.aClass521_3 == Class521.aClass521_42;
	}

	@OriginalMember(owner = "client!adf", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adf", name = "m", descriptor = "(Lclient!ald;I)V")
	void method1429(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class284.method26887(arg0.g1b(), 1896589581);
			this.aClass521_3 = Class521.method30626(local8, -2015931105);
		} else if (arg1 == 2) {
			this.anInt253 = arg0.g4() * -856157649;
		} else if (arg1 == 4) {
			this.aBoolean36 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr();
		} else if (arg1 == 101) {
			this.aClass521_3 = (Class521) Class80_Sub39.method15030(Class521.method30628(1685710884), arg0.gSmart1or2(), -1615935265);
		}
	}

	@OriginalMember(owner = "client!adf", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}
}
