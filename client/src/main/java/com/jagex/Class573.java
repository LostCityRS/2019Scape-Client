package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public class Class573 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/util/Stack;")
	static Stack aStack1 = new Stack();

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
	boolean aBoolean815;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!alh;")
	public Class132_Sub1 aClass132_Sub1_25;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!tg;")
	Class569 aClass569_1;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 12)
	Class573() {
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(Z)Lclient!tl;", line = 15)
	public static Class573 method31336(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class573 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) aStack1.pop();
			}
			local10.aBoolean815 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "(Z)Lclient!tl;", line = 15)
	public static Class573 method31337(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class573 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) aStack1.pop();
			}
			local10.aBoolean815 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "(II)Lclient!xs;", line = 37)
	public static Class669 method31338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class669[] local2 = Class152.method13995(1836723017);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (arg0 == local2[local4].anInt5852 * 1337578489) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "(Lclient!dh;III)Z", line = 44)
	public boolean method31339(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.aClass132_Sub1_25.method24258(651080561);
		if (this.aClass132_Sub1_25.aClass241Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass132_Sub1_25.aClass241Array21.length; local11++) {
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 <<= local4;
				if (this.aClass132_Sub1_25.aClass241Array21[local11].method25876(arg1 + this.aClass569_1.anInt5389 * 1585258293, arg2 + this.aClass569_1.anInt5390 * -1073884667) && this.aClass132_Sub1_25.method24283(arg0, arg1, arg2, (byte) -87)) {
					this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
					return true;
				}
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(Lclient!dh;II)Z", line = 44)
	public boolean method31340(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass132_Sub1_25.method24258(-277702633);
		if (this.aClass132_Sub1_25.aClass241Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass132_Sub1_25.aClass241Array21.length; local11++) {
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 <<= local4;
				if (this.aClass132_Sub1_25.aClass241Array21[local11].method25876(arg1 + this.aClass569_1.anInt5389 * 1585258293, arg2 + this.aClass569_1.anInt5390 * -1073884667) && this.aClass132_Sub1_25.method24283(arg0, arg1, arg2, (byte) -99)) {
					this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
					return true;
				}
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "(Lclient!dh;II)Z", line = 44)
	public boolean method31341(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass132_Sub1_25.method24258(1468623128);
		if (this.aClass132_Sub1_25.aClass241Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass132_Sub1_25.aClass241Array21.length; local11++) {
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 <<= local4;
				if (this.aClass132_Sub1_25.aClass241Array21[local11].method25876(arg1 + this.aClass569_1.anInt5389 * 1585258293, arg2 + this.aClass569_1.anInt5390 * -1073884667) && this.aClass132_Sub1_25.method24283(arg0, arg1, arg2, (byte) -122)) {
					this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
					return true;
				}
				this.aClass132_Sub1_25.aClass241Array21[local11].anInt3832 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "(CI)Z", line = 48)
	static final boolean method31342(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!tl", name = "ju", descriptor = "(IIIIIILclient!oe;IIB)V", line = 10018)
	public static void method31343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class458 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= client.aClass532_1.method30459(789645594) - 1 || arg2 >= client.aClass532_1.method30466((short) 128) - 1) {
			return;
		}
		if (client.aClass532_1.method30481(-1060849552) == null) {
			return;
		}
		@Pc(34) Interface61 local34;
		if (arg3 == 0) {
			local34 = (Interface61) client.aClass532_1.method30481(-1973903823).method31534(arg0, arg1, arg2, -1309876799);
			@Pc(44) Interface61 local44 = (Interface61) client.aClass532_1.method30481(-1124323373).method31543(arg0, arg1, arg2, -1583959719);
			if (local34 != null && arg4 != 2) {
				if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
					((Class132_Sub1_Sub2_Sub2) local34).aClass558_2.method31068(arg7, arg8, -84795505);
				} else {
					Class71.method1247(arg0, arg3, arg1, arg2, local34.method13423(-1037211373), arg5, arg4, arg6, arg7, arg8, (byte) -25);
				}
			}
			if (local44 != null) {
				if (local44 instanceof Class132_Sub1_Sub2_Sub2) {
					((Class132_Sub1_Sub2_Sub2) local44).aClass558_2.method31068(arg7, arg8, -860896709);
				} else {
					Class71.method1247(arg0, arg3, arg1, arg2, local44.method13423(-1037211373), arg5, arg4, arg6, arg7, arg8, (byte) -65);
				}
			}
		} else if (arg3 == 1) {
			local34 = (Interface61) client.aClass532_1.method30481(-1740417433).method31544(arg0, arg1, arg2, -2076903304);
			if (local34 != null) {
				if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
					((Class132_Sub1_Sub3_Sub1) local34).aClass558_1.method31068(arg7, arg8, 1922760338);
				} else {
					@Pc(132) int local132 = local34.method13423(-1037211373);
					if (arg4 == 4 || arg4 == 5) {
						Class71.method1247(arg0, arg3, arg1, arg2, local132, arg5, 4, arg6, arg7, arg8, (byte) 27);
					} else if (arg4 == 6) {
						Class71.method1247(arg0, arg3, arg1, arg2, local132, arg5 + 4, 4, arg6, arg7, arg8, (byte) 19);
					} else if (arg4 == 7) {
						Class71.method1247(arg0, arg3, arg1, arg2, local132, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8, (byte) -11);
					} else if (arg4 == 8) {
						Class71.method1247(arg0, arg3, arg1, arg2, local132, arg5 + 4, 4, arg6, arg7, arg8, (byte) 10);
						Class71.method1247(arg0, arg3, arg1, arg2, local132, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8, (byte) -90);
					}
				}
			}
		} else if (arg3 == 2) {
			local34 = (Interface61) client.aClass532_1.method30481(-2026121943).method31551(arg0, arg1, arg2, client.anInterface62_1, (byte) 3);
			if (local34 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
					((Class132_Sub1_Sub1_Sub3) local34).aClass558_4.method31068(arg7, arg8, 2008510106);
				} else {
					Class71.method1247(arg0, arg3, arg1, arg2, local34.method13423(-1037211373), arg5, arg4, arg6, arg7, arg8, (byte) -25);
				}
			}
		} else if (arg3 == 3) {
			local34 = (Interface61) client.aClass532_1.method30481(-2083185738).method31556(arg0, arg1, arg2, -968156135);
			if (local34 != null) {
				if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
					((Class132_Sub1_Sub4_Sub1) local34).aClass558_3.method31068(arg7, arg8, -209475280);
				} else {
					Class71.method1247(arg0, arg3, arg1, arg2, local34.method13423(-1037211373), arg5, arg4, arg6, arg7, arg8, (byte) -97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "afz", descriptor = "(Lclient!yf;B)V", line = 10492)
	static final void method31344(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class306.method26804(local12, 2028479107);
	}

	@OriginalMember(owner = "client!tl", name = "apb", descriptor = "(Lclient!yf;I)V", line = 12706)
	static final void method31345(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9020((byte) -85) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9017(-1697255711)).method15977(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 18);
	}
}
