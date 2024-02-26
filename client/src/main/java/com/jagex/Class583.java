package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class583 {

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "(II)I")
	static int method31831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "(II)I")
	static int method31832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "(II)I")
	static int method31833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "(I)[[[B")
	public static byte[][][] method31834(@OriginalArg(0) int arg0) {
		@Pc(3) byte[][][] local3 = new byte[8][4][];
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg0;
		@Pc(12) byte[] local12 = new byte[arg0 * arg0];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		@Pc(21) int local21;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local7; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local14 >= 0 && local14 < local12.length) {
					if (local21 >= local16 << 1) {
						local12[local14] = -1;
					}
					local14++;
				} else {
					local14++;
				}
			}
		}
		local3[1][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 <= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 >= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][3] = local12;
		return local3;
	}

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "(I)I")
	static int method31835(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "(I)I")
	static int method31836(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!tu", name = "aga", descriptor = "(Lclient!yp;B)V")
	static void method31837(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054(local13, -382798765);
		if (local23 < 1 || local23 > 5 || local29.aStringArray5[local23 - 1] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local29.aStringArray5[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!tu", name = "amq", descriptor = "(Lclient!yp;I)V")
	static void method31838(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = "";
		if (Class80_Sub42.aClipboard1 != null) {
			@Pc(8) Transferable local8 = Class80_Sub42.aClipboard1.getContents(null);
			if (local8 != null) {
				try {
					local1 = (String) local8.getTransferData(DataFlavor.stringFlavor);
					if (local1 == null) {
						local1 = "";
					}
				} catch (@Pc(22) Exception local22) {
				}
			}
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local1;
	}

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "(Lclient!yp;Lclient!sp;Ljava/lang/Exception;Ljava/lang/String;B)V")
	static void method31839(@OriginalArg(0) Class690 arg0, @OriginalArg(1) Class557 arg1, @OriginalArg(2) Exception arg2, @OriginalArg(3) String arg3, @OriginalArg(4) byte arg4) {
		@Pc(4) StringBuilder local4 = new StringBuilder(30);
		local4.append(arg3 + " ").append(arg0.aClass80_Sub1_Sub20_2.aLong338 * 3209506792906532031L).append(" ");
		for (@Pc(30) int local30 = arg0.anInt5775 * -156827145 - 1; local30 >= 0; local30--) {
			local4.append("").append(arg0.aClass682Array1[local30].aClass80_Sub1_Sub20_1.aLong338 * 3209506792906532031L).append(" ");
		}
		local4.append("").append(arg1.anInt5179 * 122729371);
		Class603.method32133(local4.toString(), arg2, 839300151);
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	Class583() throws Throwable {
		throw new Error();
	}
}
