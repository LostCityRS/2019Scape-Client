package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nz")
public final class Class453 {

	@OriginalMember(owner = "client!nz", name = "tw", descriptor = "Lclient!kf;")
	public static Class378 aClass378_2;

	@OriginalMember(owner = "client!nz", name = "t", descriptor = "I")
	public int anInt4894;

	@OriginalMember(owner = "client!nz", name = "f", descriptor = "Lclient!asu;")
	public Class80_Sub1_Sub19 aClass80_Sub1_Sub19_1;

	@OriginalMember(owner = "client!nz", name = "e", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!nz", name = "f", descriptor = "(Lclient!ald;)Lclient!nz;")
	public static Class453 method29289(@OriginalArg(0) Packet arg0) {
		@Pc(3) Class453 local3 = new Class453();
		local3.anInt4894 = arg0.g2() * -1867362097;
		local3.aClass80_Sub1_Sub19_1 = Class610.aClass52_2.method1073(local3.anInt4894 * 221296175, 2036644846);
		return local3;
	}

	@OriginalMember(owner = "client!nz", name = "e", descriptor = "(Lclient!ald;)Lclient!nz;")
	public static Class453 method29290(@OriginalArg(0) Packet arg0) {
		@Pc(3) Class453 local3 = new Class453();
		local3.anInt4894 = arg0.g2() * -1867362097;
		local3.aClass80_Sub1_Sub19_1 = Class610.aClass52_2.method1073(local3.anInt4894 * 221296175, 1949596591);
		return local3;
	}

	@OriginalMember(owner = "client!nz", name = "hc", descriptor = "(Lclient!yp;I)V")
	static void method29291(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, true, 1, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!nz", name = "xe", descriptor = "(Lclient!yp;I)V")
	static void method29292(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18981(4007826).method32524(1356276527);
	}

	@OriginalMember(owner = "client!nz", name = "aey", descriptor = "(Lclient!yp;I)V")
	static void method29293(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (Math.random() * (double) (local12 + 1));
	}

	@OriginalMember(owner = "client!nz", name = "azt", descriptor = "(Lclient!yp;I)V")
	static void method29294(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16582(-72604354) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nz", name = "st", descriptor = "(Lclient!yp;I)V")
	static void method29295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4094 * 2071556223;
	}

	@OriginalMember(owner = "client!nz", name = "iw", descriptor = "(I)V")
	static void method29296(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class147_Sub4 local4 = (Class147_Sub4) client.aClass5_7.method113((byte) 96); local4 != null; local4 = (Class147_Sub4) client.aClass5_7.method113((byte) 112)) {
			Class103_Sub20.method8555(local4, -1822220291);
		}
		@Pc(18) byte local18 = 0;
		@Pc(20) byte local20 = 3;
		@Pc(26) int local26;
		if (client.anInt3541 * -1330995431 == 0) {
			for (local26 = local18; local26 <= local20; local26++) {
				client.method25322(local26);
			}
			client.method25631();
			return;
		}
		client.method25332();
		for (local26 = local18; local26 <= local20; local26++) {
			client.method25320();
			client.method25321(local26);
			client.method25322(local26);
		}
		client.method25323();
		client.method25631();
	}

	@OriginalMember(owner = "client!nz", name = "wa", descriptor = "(Lclient!yp;I)V")
	static void method29297(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class511.method30553(local13, local23, false, (byte) -40);
	}

	@OriginalMember(owner = "client!nz", name = "m", descriptor = "(I)V")
	static void method29298(@OriginalArg(0) int arg0) {
		if (Class149.anInt1527 * 1338436645 < 102) {
			Class149.anInt1527 += 231464462;
		}
		@Pc(24) int local24;
		if (Class149.anInt1529 * -59652309 != -1 && Class519.aLong391 * 4234509874920039543L < Class303.method27111((byte) 95)) {
			for (local24 = Class149.anInt1529 * -59652309; local24 < Class491.aStringArray30.length; local24++) {
				if (Class491.aStringArray30[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class491.aStringArray30[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class294.method26961("Pausing for " + local36 + " seconds...", 1455295997);
					Class149.anInt1529 = (local24 + 1) * 864731011;
					Class519.aLong391 = (Class303.method27111((byte) 22) + (long) (local36 * 1000)) * 7383831285108766023L;
					return;
				}
				Class149.aString48 = Class491.aStringArray30[local24];
				Class436.method29134(false, -972307639);
			}
			Class149.anInt1529 = -864731011;
		}
		if (client.anInt3575 * 866611799 != 0) {
			Class149.anInt1524 -= client.anInt3575 * -949304581;
			if (Class149.anInt1524 * -868725591 >= Class149.anInt1522 * -2043909027) {
				Class149.anInt1524 = Class149.anInt1522 * -2071191915 - -1558243431;
			}
			if (Class149.anInt1524 * -868725591 < 0) {
				Class149.anInt1524 = 0;
			}
			client.anInt3575 = 0;
		}
		for (local24 = 0; local24 < client.anInt3444 * 200884815; local24++) {
			@Pc(128) Interface63 local128 = client.anInterface63Array2[local24];
			@Pc(132) int local132 = local128.method14065(-1444014763);
			@Pc(136) char local136 = local128.method14074(-91542808);
			@Pc(140) int local140 = local128.method14068(2006604282);
			if (local132 == 84) {
				Class436.method29134(false, -972307639);
			}
			if (local132 == 80) {
				Class436.method29134(true, -972307639);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					@Pc(166) String local166 = "";
					for (@Pc(171) int local171 = Class149.aStringArray16.length - 1; local171 >= 0; local171--) {
						if (Class149.aStringArray16[local171] != null && Class149.aStringArray16[local171].length() > 0) {
							local166 = local166 + Class149.aStringArray16[local171] + '\n';
						}
					}
					Class80_Sub42.aClipboard1.setContents(new StringSelection(local166), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class80_Sub42.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class80_Sub42.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class313.method27482(local225, '\n', 2036747717);
								Class301.method27038(local232, -308947600);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local132 == 85 && Class149.anInt1523 * -187541765 > 0) {
				Class149.aString48 = Class149.aString48.substring(0, Class149.anInt1523 * -187541765 - 1) + Class149.aString48.substring(Class149.anInt1523 * -187541765);
				Class149.anInt1523 -= -1734720461;
			} else if (local132 == 101 && Class149.anInt1523 * -187541765 < Class149.aString48.length()) {
				Class149.aString48 = Class149.aString48.substring(0, Class149.anInt1523 * -187541765) + Class149.aString48.substring(Class149.anInt1523 * -187541765 + 1);
			} else if (local132 == 96 && Class149.anInt1523 * -187541765 > 0) {
				Class149.anInt1523 -= -1734720461;
			} else if (local132 == 97 && Class149.anInt1523 * -187541765 < Class149.aString48.length()) {
				Class149.anInt1523 += -1734720461;
			} else if (local132 == 102) {
				Class149.anInt1523 = 0;
			} else if (local132 == 103) {
				Class149.anInt1523 = Class149.aString48.length() * -1734720461;
			} else if (local132 == 104 && Class149.anInt1525 * 1439733989 < Class149.aStringArray16.length) {
				Class149.anInt1525 += -738892563;
				Class313.method27479(-1114758995);
				Class149.anInt1523 = Class149.aString48.length() * -1734720461;
			} else if (local132 == 105 && Class149.anInt1525 * 1439733989 > 0) {
				Class149.anInt1525 -= -738892563;
				Class313.method27479(25566411);
				Class149.anInt1523 = Class149.aString48.length() * -1734720461;
			} else if (Class702.method37108(local136, 2120620890) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				Class149.aString48 = Class149.aString48.substring(0, Class149.anInt1523 * -187541765) + client.anInterface63Array2[local24].method14074(-2079514057) + Class149.aString48.substring(Class149.anInt1523 * -187541765);
				Class149.anInt1523 += -1734720461;
			}
		}
		client.anInt3444 = 0;
		client.anInt3446 = 0;
		Class138_Sub1.method10718((byte) 83);
	}
}
