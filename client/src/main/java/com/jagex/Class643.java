package com.jagex;

import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class643 implements Interface68 {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Lclient!ws;")
	Class646 aClass646_2 = Class646.aClass646_4;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "Lclient!pf;")
	Class480 aClass480_132;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	int anInt5643;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!mr;")
	Class138 aClass138_5;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!wp;")
	Interface70 anInterface70_2;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(Lclient!yp;B)V")
	static void method33024(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(17) boolean local17 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] != 0;
		@Pc(31) boolean local31 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] != 0;
		Class120_Sub1_Sub1_Sub2.method12209(local17, local31, (byte) -48);
	}

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "(II)I")
	static int method33025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "(Lclient!ald;B)Lclient!kn;")
	public static Class125 method33026(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -89);
		@Pc(7) int local7 = arg0.g4();
		@Pc(11) int local11 = arg0.g4();
		return new Class125_Sub3(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11);
	}

	@OriginalMember(owner = "client!wo", name = "ix", descriptor = "(I)V")
	public static void method33027(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = Class703.aClass80_Sub37_49.aClass165_Sub10_2.method16018(-563460641);
		if (local4 == 0) {
			client.aClass539_1.method30909(null, 537902112);
			Class520.method30615(0, 2125140936);
		} else if (local4 == 1 || local4 == 3) {
			Class620.method32311((byte) 0, (byte) 11);
			Class520.method30615(512, 1752481194);
			if (client.aClass539_1.method30932(-1638462787) != null) {
				Class117.method8820((short) 17899);
			}
		} else {
			Class620.method32311((byte) (client.anInt3496 * 939223631 - 4 & 0xFF), (byte) 91);
			Class520.method30615(2, 1228746779);
		}
		client.anInt3484 = Class507.anInt5045 * -363154807;
	}

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "(IB)Lclient!ig;")
	public static Class337 method33028(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == Class337.aClass337_4.anInt4230 * 1053518529) {
			return Class337.aClass337_4;
		} else if (Class337.aClass337_2.anInt4230 * 1053518529 == arg0) {
			return Class337.aClass337_2;
		} else if (Class337.aClass337_5.anInt4230 * 1053518529 == arg0) {
			return Class337.aClass337_5;
		} else if (arg0 == Class337.aClass337_7.anInt4230 * 1053518529) {
			return Class337.aClass337_7;
		} else if (arg0 == Class337.aClass337_6.anInt4230 * 1053518529) {
			return Class337.aClass337_6;
		} else if (arg0 == Class337.aClass337_3.anInt4230 * 1053518529) {
			return Class337.aClass337_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "iw", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method33029(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		if (local12 == Class327.anInt4101 * -898902677 || local12 == Class327.anInt4126 * -2118595637 || local12 == Class327.anInt4076 * -679249797 || local12 == Class327.anInt4077 * -760891495) {
			arg0.anInt4159 = local12 * -1539868631;
		}
	}

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "(Ljava/lang/Object;I)V")
	static void method33030(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (Class166.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class166.anEventQueue1.peekEvent() != null; local4++) {
			Class217.method25866(1L);
		}
		try {
			if (arg0 != null) {
				Class166.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!pf;ILclient!mr;Lclient!wp;)V")
	public Class643(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) Interface70 arg3) {
		this.aClass480_132 = arg0;
		this.anInt5643 = arg1 * -779076897;
		this.aClass138_5 = arg2;
		this.anInterface70_2 = arg3;
		this.aClass646_2 = Class646.aClass646_3;
	}

	@OriginalMember(owner = "client!wo", name = "ar", descriptor = "()Z")
	@Override
	public boolean method32992() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "(I)V")
	@Override
	public void method32986(@OriginalArg(0) int arg0) {
		if (Class646.aClass646_3 != this.aClass646_2) {
			return;
		}
		this.method33018(-1344122298);
		this.aClass646_2 = Class646.aClass646_5;
		if (this.anInterface70_2 != null) {
			this.anInterface70_2.method26676(this, 0, this.anInt5643 * 678560031, true, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Lclient!rh;")
	@Override
	public Class529 method33013(@OriginalArg(0) int arg0) {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "ai", descriptor = "()Z")
	@Override
	public boolean method33007() {
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "(I)Z")
	@Override
	public boolean method32969(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "(I)V")
	void method33018(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "(B)I")
	@Override
	public int method32970(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "aq", descriptor = "()Z")
	@Override
	public boolean method32993() {
		return true;
	}

	@OriginalMember(owner = "client!wo", name = "av", descriptor = "(Lclient!ald;)V")
	@Override
	public void method33003(@OriginalArg(0) Packet arg0) {
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(II)[B")
	@Override
	public byte[] method32971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5643 * 678560031;
		}
		return this.aClass480_132.method29926(local1, 1472047355);
	}

	@OriginalMember(owner = "client!wo", name = "ag", descriptor = "(I)[B")
	@Override
	public byte[] method32981(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5643 * 678560031;
		}
		return this.aClass480_132.method29926(local1, 1472047355);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)Lclient!ald;")
	@Override
	public Packet method32976(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "(I)Lclient!qr;")
	@Override
	public Class516 method32979(@OriginalArg(0) int arg0) {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wo", name = "aw", descriptor = "(Z)V")
	@Override
	public void method33012(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wo", name = "am", descriptor = "()I")
	@Override
	public int method32999() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "ah", descriptor = "()I")
	@Override
	public int method32997() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "(I)Z")
	@Override
	public boolean method32972(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "()V")
	@Override
	public void method32982() {
		if (Class646.aClass646_3 != this.aClass646_2) {
			return;
		}
		this.method33018(-1645894162);
		this.aClass646_2 = Class646.aClass646_5;
		if (this.anInterface70_2 != null) {
			this.anInterface70_2.method26676(this, 0, this.anInt5643 * 678560031, true, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "()V")
	@Override
	public void method32983() {
		if (Class646.aClass646_3 != this.aClass646_2) {
			return;
		}
		this.method33018(-1907661325);
		this.aClass646_2 = Class646.aClass646_5;
		if (this.anInterface70_2 != null) {
			this.anInterface70_2.method26676(this, 0, this.anInt5643 * 678560031, true, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32984() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32985() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32967() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method33015() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "an", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method33014(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method33016() {
		return this.aClass646_2;
	}

	@OriginalMember(owner = "client!wo", name = "br", descriptor = "()Z")
	@Override
	public boolean method33004() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "ay", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method32991() {
		return this.aClass646_2;
	}

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method32975(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "(ZI)V")
	@Override
	public void method32980(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "(I)I")
	@Override
	public int method32974(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "ab", descriptor = "(I)[B")
	@Override
	public byte[] method32995(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5643 * 678560031;
		}
		return this.aClass480_132.method29926(local1, 1472047355);
	}

	@OriginalMember(owner = "client!wo", name = "al", descriptor = "(I)[B")
	@Override
	public byte[] method32996(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5643 * 678560031;
		}
		return this.aClass480_132.method29926(local1, 1472047355);
	}

	@OriginalMember(owner = "client!wo", name = "aa", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method33005(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "af", descriptor = "()I")
	@Override
	public int method32998() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32988() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_5);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wo", name = "ak", descriptor = "()I")
	@Override
	public int method32987() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "at", descriptor = "()Lclient!qr;")
	@Override
	public Class516 method32973() {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wo", name = "ad", descriptor = "()Lclient!qr;")
	@Override
	public Class516 method33002() {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wo", name = "bl", descriptor = "()Z")
	@Override
	public boolean method32989() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "ae", descriptor = "(I)Z")
	@Override
	public boolean method33006(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method32977(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "ap", descriptor = "()Z")
	@Override
	public boolean method33008() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "ax", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method33001() {
		return this.aClass646_2;
	}

	@OriginalMember(owner = "client!wo", name = "au", descriptor = "()Z")
	@Override
	public boolean method33009() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "az", descriptor = "()I")
	@Override
	public int method33010() {
		return 0;
	}

	@OriginalMember(owner = "client!wo", name = "as", descriptor = "(Z)V")
	@Override
	public void method33011(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "(IB)Z")
	@Override
	public boolean method32978(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "bg", descriptor = "(Z)V")
	@Override
	public void method33000(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Lclient!ws;")
	@Override
	public Class646 method32968(@OriginalArg(0) int arg0) {
		return this.aClass646_2;
	}

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "()V")
	void method33019() {
	}

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "()V")
	void method33020() {
	}

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "(B)I")
	@Override
	public int method32994(@OriginalArg(0) byte arg0) {
		return this.anInt5643 * 678560031;
	}

	@OriginalMember(owner = "client!wo", name = "ao", descriptor = "()V")
	void method33021() {
	}

	@OriginalMember(owner = "client!wo", name = "aj", descriptor = "()V")
	void method33022() {
	}

	@OriginalMember(owner = "client!wo", name = "ac", descriptor = "()V")
	void method33023() {
	}

	@OriginalMember(owner = "client!wo", name = "bt", descriptor = "()I")
	@Override
	public int method32990() {
		return this.anInt5643 * 678560031;
	}

	@OriginalMember(owner = "client!wo", name = "bs", descriptor = "()I")
	@Override
	public int method33017() {
		return this.anInt5643 * 678560031;
	}
}
