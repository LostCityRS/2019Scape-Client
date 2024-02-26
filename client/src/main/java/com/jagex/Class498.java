package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!py")
public final class Class498 implements Interface6 {

	@OriginalMember(owner = "client!py", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_121;

	@OriginalMember(owner = "client!py", name = "f", descriptor = "Ljava/lang/String;")
	final String aString214;

	@OriginalMember(owner = "client!py", name = "no", descriptor = "(Lclient!yp;I)V")
	static void method30354(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class515.method30573(local11, local14, arg0, 1925332816);
	}

	@OriginalMember(owner = "client!py", name = "oi", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method30355(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		@Pc(18) int[] local18 = Class619.method32302(local13, arg2, -2047301879);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray19 = Class431.method29089(local13, arg2, 1811892080);
		arg0.anIntArray406 = local18;
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!py", name = "zk", descriptor = "(Lclient!yp;B)V")
	static void method30356(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass372_8.method28394((byte) 3) >> 3;
	}

	@OriginalMember(owner = "client!py", name = "arw", descriptor = "(Lclient!yp;I)V")
	static void method30357(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3852 * 2095040843;
	}

	@OriginalMember(owner = "client!py", name = "ao", descriptor = "(Lclient!yp;B)V")
	static void method30358(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.anInt5775 * -156827145 == 0) {
			return;
		}
		@Pc(18) Class682 local18 = arg0.aClass682Array1[(arg0.anInt5775 -= -1720709177) * -156827145];
		arg0.aClass80_Sub1_Sub20_2 = local18.aClass80_Sub1_Sub20_1;
		arg0.aClass557Array2 = arg0.aClass80_Sub1_Sub20_2.aClass557Array1;
		arg0.anIntArray526 = arg0.aClass80_Sub1_Sub20_2.anIntArray283;
		arg0.anInt5780 = local18.anInt5750 * -1728816003;
		arg0.anIntArray527 = local18.anIntArray522;
		arg0.anObjectArray45 = local18.anObjectArray44;
		arg0.aLongArray28 = local18.aLongArray26;
	}

	@OriginalMember(owner = "client!py", name = "t", descriptor = "(Lclient!pf;Ljava/lang/String;ZB)Lclient!ty;")
	public static Class587 method30359(@OriginalArg(0) Class480 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = arg0.method29934(arg1, (byte) -15);
		if (local4 == -1) {
			return new Class587(0);
		}
		@Pc(18) byte[] local18 = arg0.method29918(local4, 1, 1896589581);
		if (local18 == null) {
			return new Class587(0);
		}
		@Pc(31) Packet local31 = new Packet(local18);
		@Pc(35) int local35 = local31.g2();
		@Pc(40) Class587 local40 = new Class587(local35);
		@Pc(42) int local42 = 0;
		while (true) {
			while (local42 < local40.anInt5303 * -70603505) {
				@Pc(52) int local52 = local31.g4();
				@Pc(56) int local56 = local31.g2();
				@Pc(60) int local60 = local31.g1();
				if (!arg2 && local60 == 1) {
					local40.anInt5303 -= 1039049199;
				} else {
					local40.anIntArray479[local42] = local52;
					local40.anIntArray480[local42] = local56;
					local42++;
				}
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!py", name = "aq", descriptor = "(Lclient!yp;I)V")
	static void method30360(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class520.method30616(1421650040) ? 1 : 0;
	}

	@OriginalMember(owner = "client!py", name = "l", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z")
	public static boolean method30361(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		if (arg1 == 0) {
			try {
				if (!Class562.aString224.startsWith("win")) {
					throw new Exception();
				} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
					@Pc(24) String local24 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
						if (local24.indexOf(arg0.charAt(local26)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
					return true;
				} else {
					throw new Exception();
				}
			} catch (@Pc(59) Throwable local59) {
				return false;
			}
		} else if (arg1 == 1) {
			try {
				@Pc(81) Object local81 = Class64.method1220(Class562.anApplet3, arg2, new Object[] { (new URL(Class562.anApplet3.getCodeBase(), arg0)).toString() }, (byte) 86);
				return local81 != null;
			} catch (@Pc(89) Throwable local89) {
				return false;
			}
		} else if (arg1 == 2) {
			try {
				Class562.anApplet3.getAppletContext().showDocument(new URL(Class562.anApplet3.getCodeBase(), arg0), "_blank");
				return true;
			} catch (@Pc(107) Exception local107) {
				return false;
			}
		} else if (arg1 == 3) {
			try {
				Class64.method1221(Class562.anApplet3, "loggedout", 20937170);
			} catch (@Pc(119) Throwable local119) {
			}
			try {
				Class562.anApplet3.getAppletContext().showDocument(new URL(Class562.anApplet3.getCodeBase(), arg0), "_top");
				return true;
			} catch (@Pc(132) Exception local132) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!py", name = "<init>", descriptor = "(Lclient!pf;Ljava/lang/String;)V")
	Class498(@OriginalArg(0) Class480 arg0, @OriginalArg(1) String arg1) {
		this.aClass480_121 = arg0;
		this.aString214 = arg1;
	}

	@OriginalMember(owner = "client!py", name = "e", descriptor = "()I")
	@Override
	public int method30348() {
		return this.aClass480_121.method29921(this.aString214, -282136253) ? 100 : 0;
	}

	@OriginalMember(owner = "client!py", name = "t", descriptor = "(B)I")
	@Override
	public int method30349(@OriginalArg(0) byte arg0) {
		return this.aClass480_121.method29921(this.aString214, 767228371) ? 100 : 0;
	}

	@OriginalMember(owner = "client!py", name = "f", descriptor = "(I)Lclient!acr;")
	@Override
	public Class67 method30347(@OriginalArg(0) int arg0) {
		return Class67.aClass67_2;
	}

	@OriginalMember(owner = "client!py", name = "i", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30346() {
		return Class67.aClass67_2;
	}

	@OriginalMember(owner = "client!py", name = "l", descriptor = "()I")
	@Override
	public int method30353() {
		return this.aClass480_121.method29921(this.aString214, -1832226370) ? 100 : 0;
	}

	@OriginalMember(owner = "client!py", name = "g", descriptor = "()I")
	@Override
	public int method30352() {
		return this.aClass480_121.method29921(this.aString214, -1891120726) ? 100 : 0;
	}

	@OriginalMember(owner = "client!py", name = "u", descriptor = "()I")
	@Override
	public int method30350() {
		return this.aClass480_121.method29921(this.aString214, -507089582) ? 100 : 0;
	}

	@OriginalMember(owner = "client!py", name = "m", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30351() {
		return Class67.aClass67_2;
	}
}
