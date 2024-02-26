package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class331 {

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	static final int anInt4190 = 100;

	@OriginalMember(owner = "client!ia", name = "ak", descriptor = "I")
	static int anInt4192;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	int anInt4191;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[Lclient!asf;")
	Class80_Sub1_Sub14[] aClass80_Sub1_Sub14Array1 = new Class80_Sub1_Sub14[100];

	@OriginalMember(owner = "client!ia", name = "arf", descriptor = "(Lclient!yp;I)V")
	static void method27783(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.aString145 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aString145;
		}
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(I)[Lclient!dj;")
	static Class225[] method27784(@OriginalArg(0) int arg0) {
		return new Class225[] { Class225.aClass225_5, Class225.aClass225_2, Class225.aClass225_3, Class225.aClass225_4, Class225.aClass225_1 };
	}

	@OriginalMember(owner = "client!ia", name = "uz", descriptor = "(Lclient!yp;I)V")
	static void method27785(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class327 local14 = Class301.method27041(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 2084520560);
		if (local14.aClass327Array3 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			return;
		}
		@Pc(37) int local37 = local14.aClass327Array3.length;
		for (@Pc(39) int local39 = 0; local39 < local14.aClass327Array3.length; local39++) {
			if (local14.aClass327Array3[local39] == null) {
				local37 = local39;
				break;
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local37;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(Lclient!akw;Lclient!akw;B)V")
	public static void method27786(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483644);
		}
		arg0.aClass80_Sub1_67 = arg1.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = arg1;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "aki", descriptor = "(Lclient!yp;B)V")
	static void method27787(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class146.method13874(-710598820);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			return;
		}
		@Pc(35) boolean local35 = local15.method22596(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class681.anIntArray521, (byte) -124);
		if (local35) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[1];
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[2];
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(I)[Lclient!ib;")
	static Class332[] method27788(@OriginalArg(0) int arg0) {
		return new Class332[] { Class332.aClass332_1, Class332.aClass332_3, Class332.aClass332_2 };
	}

	@OriginalMember(owner = "client!ia", name = "aa", descriptor = "(IIS)V")
	static void method27789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(12, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!ia", name = "lu", descriptor = "([Lclient!hx;IB)V")
	static void method27790(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class327 local9 = arg0[local1];
			if (local9 != null && arg1 == local9.anInt4082 * 254495303 && !client.method25508(local9)) {
				if (local9.anInt4135 * 710314345 == 0) {
					method27790(arg0, local9.anInt4087 * -2053489901, (byte) 79);
					if (local9.aClass327Array4 != null) {
						method27790(local9.aClass327Array4, local9.anInt4087 * -2053489901, (byte) 51);
					}
					@Pc(56) Class80_Sub40 local56 = (Class80_Sub40) client.aClass24_20.method560((long) (local9.anInt4087 * -2053489901));
					if (local56 != null) {
						Class489.method30219(local56.anInt3156 * -151091669, 108158930);
					}
				}
				if (local9.anInt4135 * 710314345 == 6 && local9.anInt4146 * 1314212291 != -1) {
					if (local9.aClass6_6 == null) {
						local9.aClass6_6 = new Class6_Sub2();
						local9.aClass6_6.method23587(local9.anInt4146 * 1314212291, -2060415981);
					}
					if (local9.aClass6_6.method23601(client.anInt3516 * -2136892027, -1489933141) && local9.aClass6_6.method23658((byte) 1)) {
						local9.aClass6_6.method23598((short) -2103);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	Class331() {
	}

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;)Lclient!asf;")
	Class80_Sub1_Sub14 method27772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8) {
		@Pc(4) Class80_Sub1_Sub14 local4 = this.aClass80_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4191 * 1896624501; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass80_Sub1_Sub14Array1[local9] = this.aClass80_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class80_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24395((byte) 103);
			local4.method24406(-2147483643);
			local4.method22751(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, 620956837);
		}
		this.aClass80_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4191 * 1896624501 < 100) {
			this.anInt4191 += -655599907;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;I)Lclient!asf;")
	Class80_Sub1_Sub14 method27773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8, @OriginalArg(9) int arg9) {
		@Pc(4) Class80_Sub1_Sub14 local4 = this.aClass80_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4191 * 1896624501; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass80_Sub1_Sub14Array1[local9] = this.aClass80_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class80_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24395((byte) 3);
			local4.method24406(-2147483647);
			local4.method22751(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, 254854014);
		}
		this.aClass80_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4191 * 1896624501 < 100) {
			this.anInt4191 += -655599907;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
	int method27774(@OriginalArg(0) int arg0) {
		return this.anInt4191 * 1896624501;
	}

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "(I)Lclient!asf;")
	Class80_Sub1_Sub14 method27775(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4191 * 1896624501 ? this.aClass80_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;)Lclient!asf;")
	Class80_Sub1_Sub14 method27776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8) {
		@Pc(4) Class80_Sub1_Sub14 local4 = this.aClass80_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4191 * 1896624501; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass80_Sub1_Sub14Array1[local9] = this.aClass80_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class80_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24395((byte) 66);
			local4.method24406(-2147483647);
			local4.method22751(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8, 2079126246);
		}
		this.aClass80_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4191 * 1896624501 < 100) {
			this.anInt4191 += -655599907;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
	int method27777() {
		return this.anInt4191 * 1896624501;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)Lclient!asf;")
	Class80_Sub1_Sub14 method27778(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4191 * 1896624501 ? this.aClass80_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "(I)Lclient!asf;")
	Class80_Sub1_Sub14 method27779(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4191 * 1896624501 ? this.aClass80_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(IB)Lclient!asf;")
	Class80_Sub1_Sub14 method27780(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= 0 && arg0 < this.anInt4191 * 1896624501 ? this.aClass80_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)Lclient!asf;")
	Class80_Sub1_Sub14 method27781(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4191 * 1896624501 ? this.aClass80_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()I")
	int method27782() {
		return this.anInt4191 * 1896624501;
	}
}
