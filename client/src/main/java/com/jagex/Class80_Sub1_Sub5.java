package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!are")
public final class Class80_Sub1_Sub5 extends Class80_Sub1 {

	@OriginalMember(owner = "client!are", name = "m", descriptor = "Lclient!pf;")
	static Class480 aClass480_81;

	@OriginalMember(owner = "client!are", name = "s", descriptor = "I")
	int anInt3026;

	@OriginalMember(owner = "client!are", name = "h", descriptor = "Z")
	boolean aBoolean560;

	@OriginalMember(owner = "client!are", name = "k", descriptor = "I")
	int anInt3028;

	@OriginalMember(owner = "client!are", name = "j", descriptor = "[B")
	byte[] aByteArray58;

	@OriginalMember(owner = "client!are", name = "r", descriptor = "Z")
	boolean aBoolean561;

	@OriginalMember(owner = "client!are", name = "q", descriptor = "Z")
	boolean aBoolean562;

	@OriginalMember(owner = "client!are", name = "x", descriptor = "Lclient!akm;")
	Class80_Sub23 aClass80_Sub23_1;

	@OriginalMember(owner = "client!are", name = "a", descriptor = "[[Lclient!dr;")
	Class231[][] aClass231ArrayArray1 = (Class231[][]) null;

	@OriginalMember(owner = "client!are", name = "w", descriptor = "I")
	int anInt3029 = 0;

	@OriginalMember(owner = "client!are", name = "o", descriptor = "I")
	int anInt3027;

	@OriginalMember(owner = "client!are", name = "a", descriptor = "(Lclient!pf;Lclient!pf;)V")
	public static void method21808(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1) {
		Class291.aClass480_91 = arg0;
		aClass480_81 = arg1;
	}

	@OriginalMember(owner = "client!are", name = "f", descriptor = "(S)Lclient!ov;")
	public static Class471 method21809(@OriginalArg(0) short arg0) {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29769(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29783(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29774(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!are", name = "<init>", descriptor = "(I)V")
	public Class80_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3027 = arg0 * 1980159207;
	}

	@OriginalMember(owner = "client!are", name = "al", descriptor = "()Z")
	public boolean method21781() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "f", descriptor = "(I)Z")
	public boolean method21782(@OriginalArg(0) int arg0) {
		if (this.aClass231ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray58 == null) {
			@Pc(11) Class480 local11 = Class291.aClass480_91;
			synchronized (Class291.aClass480_91) {
				this.aByteArray58 = Class291.aClass480_91.method29926(this.anInt3027 * -133497129, 1472047355);
				if (this.aByteArray58 == null) {
					return false;
				}
			}
		}
		@Pc(38) boolean local38 = true;
		@Pc(44) Packet local44 = new Packet(this.aByteArray58);
		@Pc(48) int local48 = local44.g1();
		@Pc(52) int local52 = local44.g2();
		@Pc(55) Class480 local55 = aClass480_81;
		synchronized (aClass480_81) {
			local38 &= aClass480_81.method29945(local52, (byte) 1);
		}
		if (!local38) {
			return false;
		}
		local55 = Class291.aClass480_91;
		synchronized (Class291.aClass480_91) {
			this.aClass80_Sub23_1 = new Class80_Sub23(local52, aClass480_81.method29926(local52, 1472047355));
			this.method21783(local44, local48, (byte) -5);
			this.aByteArray58 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!are", name = "e", descriptor = "(Lclient!ald;IB)V")
	void method21783(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt3026 = arg0.g2() * -1721883587;
		this.anInt3028 = arg0.g2() * -1846040425;
		this.anInt3029 = arg0.g1() * 1312954443;
		@Pc(24) int local24 = arg0.g2();
		this.aClass231ArrayArray1 = new Class231[this.aClass80_Sub23_1.anInt1619 * -1195478191][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class222 local43 = Class220.method25902(arg0.g1(), 1911123765);
			@Pc(47) int local47 = arg0.gSmart1or2s();
			@Pc(53) Class205 local53 = Class17.method438(arg0.g1(), (byte) 0);
			@Pc(57) Class231 local57 = new Class231();
			local57.method26010(arg0, arg1, 1943688457);
			@Pc(67) int local67 = local43.method25915((byte) 1);
			if (this.aClass231ArrayArray1[local47] == null) {
				this.aClass231ArrayArray1[local47] = new Class231[local67];
			}
			this.aClass231ArrayArray1[local47][local53.method24982(-1146634733)] = local57;
			if (Class222.aClass222_2 == local43) {
				this.aBoolean560 = true;
			} else if (local43 == Class222.aClass222_3) {
				this.aBoolean561 = true;
			} else if (local43 == Class222.aClass222_4) {
				this.aBoolean562 = true;
			}
		}
	}

	@OriginalMember(owner = "client!are", name = "u", descriptor = "(I)I")
	public int method21784(@OriginalArg(0) int arg0) {
		return this.anInt3026 * 2111345429;
	}

	@OriginalMember(owner = "client!are", name = "l", descriptor = "(I)I")
	public int method21785(@OriginalArg(0) int arg0) {
		return this.anInt3028 * 1142314791;
	}

	@OriginalMember(owner = "client!are", name = "g", descriptor = "(S)I")
	int method21786(@OriginalArg(0) short arg0) {
		return this.anInt3029 * 1400303971;
	}

	@OriginalMember(owner = "client!are", name = "i", descriptor = "(I)I")
	public int method21787(@OriginalArg(0) int arg0) {
		return this.method21785(1001096775) - this.method21784(681366030);
	}

	@OriginalMember(owner = "client!are", name = "m", descriptor = "(I)Z")
	public boolean method21788(@OriginalArg(0) int arg0) {
		return this.aBoolean561;
	}

	@OriginalMember(owner = "client!are", name = "o", descriptor = "(I)Z")
	public boolean method21789(@OriginalArg(0) int arg0) {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!are", name = "j", descriptor = "(B)Z")
	public boolean method21790(@OriginalArg(0) byte arg0) {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "x", descriptor = "()Z")
	public boolean method21791() {
		if (this.aClass231ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray58 == null) {
			@Pc(11) Class480 local11 = Class291.aClass480_91;
			synchronized (Class291.aClass480_91) {
				this.aByteArray58 = Class291.aClass480_91.method29926(this.anInt3027 * -133497129, 1472047355);
				if (this.aByteArray58 == null) {
					return false;
				}
			}
		}
		@Pc(38) boolean local38 = true;
		@Pc(44) Packet local44 = new Packet(this.aByteArray58);
		@Pc(48) int local48 = local44.g1();
		@Pc(52) int local52 = local44.g2();
		@Pc(55) Class480 local55 = aClass480_81;
		synchronized (aClass480_81) {
			local38 &= aClass480_81.method29945(local52, (byte) 1);
		}
		if (!local38) {
			return false;
		}
		local55 = Class291.aClass480_91;
		synchronized (Class291.aClass480_91) {
			this.aClass80_Sub23_1 = new Class80_Sub23(local52, aClass480_81.method29926(local52, 1472047355));
			this.method21783(local44, local48, (byte) -2);
			this.aByteArray58 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!are", name = "p", descriptor = "()I")
	public int method21792() {
		return this.anInt3026 * 2111345429;
	}

	@OriginalMember(owner = "client!are", name = "v", descriptor = "()I")
	public int method21793() {
		return this.anInt3028 * 1142314791;
	}

	@OriginalMember(owner = "client!are", name = "z", descriptor = "(Lclient!ald;I)V")
	void method21794(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInt3026 = arg0.g2() * -1721883587;
		this.anInt3028 = arg0.g2() * -1846040425;
		this.anInt3029 = arg0.g1() * 1312954443;
		@Pc(24) int local24 = arg0.g2();
		this.aClass231ArrayArray1 = new Class231[this.aClass80_Sub23_1.anInt1619 * -1195478191][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class222 local43 = Class220.method25902(arg0.g1(), 1185308769);
			@Pc(47) int local47 = arg0.gSmart1or2s();
			@Pc(53) Class205 local53 = Class17.method438(arg0.g1(), (byte) 0);
			@Pc(57) Class231 local57 = new Class231();
			local57.method26010(arg0, arg1, 1893270243);
			@Pc(67) int local67 = local43.method25915((byte) 1);
			if (this.aClass231ArrayArray1[local47] == null) {
				this.aClass231ArrayArray1[local47] = new Class231[local67];
			}
			this.aClass231ArrayArray1[local47][local53.method24982(426113401)] = local57;
			if (Class222.aClass222_2 == local43) {
				this.aBoolean560 = true;
			} else if (local43 == Class222.aClass222_3) {
				this.aBoolean561 = true;
			} else if (local43 == Class222.aClass222_4) {
				this.aBoolean562 = true;
			}
		}
	}

	@OriginalMember(owner = "client!are", name = "aq", descriptor = "()Z")
	public boolean method21795() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!are", name = "ac", descriptor = "()Z")
	public boolean method21796() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "y", descriptor = "()I")
	public int method21797() {
		return this.anInt3028 * 1142314791;
	}

	@OriginalMember(owner = "client!are", name = "s", descriptor = "()Z")
	public boolean method21798() {
		if (this.aClass231ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray58 == null) {
			@Pc(11) Class480 local11 = Class291.aClass480_91;
			synchronized (Class291.aClass480_91) {
				this.aByteArray58 = Class291.aClass480_91.method29926(this.anInt3027 * -133497129, 1472047355);
				if (this.aByteArray58 == null) {
					return false;
				}
			}
		}
		@Pc(38) boolean local38 = true;
		@Pc(44) Packet local44 = new Packet(this.aByteArray58);
		@Pc(48) int local48 = local44.g1();
		@Pc(52) int local52 = local44.g2();
		@Pc(55) Class480 local55 = aClass480_81;
		synchronized (aClass480_81) {
			local38 &= aClass480_81.method29945(local52, (byte) 1);
		}
		if (!local38) {
			return false;
		}
		local55 = Class291.aClass480_91;
		synchronized (Class291.aClass480_91) {
			this.aClass80_Sub23_1 = new Class80_Sub23(local52, aClass480_81.method29926(local52, 1472047355));
			this.method21783(local44, local48, (byte) -64);
			this.aByteArray58 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!are", name = "ax", descriptor = "()I")
	public int method21799() {
		return this.method21785(1001096775) - this.method21784(683491659);
	}

	@OriginalMember(owner = "client!are", name = "ay", descriptor = "()I")
	public int method21800() {
		return this.method21785(1001096775) - this.method21784(1927201915);
	}

	@OriginalMember(owner = "client!are", name = "ai", descriptor = "()Z")
	public boolean method21801() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!are", name = "n", descriptor = "()I")
	int method21802() {
		return this.anInt3029 * 1400303971;
	}

	@OriginalMember(owner = "client!are", name = "ah", descriptor = "()Z")
	public boolean method21803() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "aj", descriptor = "()Z")
	public boolean method21804() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!are", name = "ab", descriptor = "()Z")
	public boolean method21805() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "ag", descriptor = "()Z")
	public boolean method21806() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!are", name = "ao", descriptor = "()Z")
	public boolean method21807() {
		return this.aBoolean562;
	}
}
