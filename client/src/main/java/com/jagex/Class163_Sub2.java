package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alt")
public class Class163_Sub2 extends Class163 {

	@OriginalMember(owner = "client!alt", name = "<init>", descriptor = "()V", line = 11)
	Class163_Sub2() {
	}

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "(I)V", line = 14)
	@Override
	void method14920(@OriginalArg(0) int arg0) {
		@Pc(3) Class93_Sub23 local3 = this.method14929(-361774001);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14908(local3, 32767, 1960704974);
		@Pc(15) int local15 = local3.method22876((byte) -91);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22875(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22891(1106946160) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2588(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 119);
		local54.aPacketBit_1.p4(local29 | local15 << 16, (byte) 20);
		local54.aPacketBit_1.p2_alt3(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24356(local54, -2063301593);
	}

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "()V", line = 14)
	@Override
	void method14918() {
		@Pc(3) Class93_Sub23 local3 = this.method14929(980324554);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14908(local3, 32767, -1725280454);
		@Pc(15) int local15 = local3.method22876((byte) -23);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22875(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22891(-1042519865) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2588(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 35);
		local54.aPacketBit_1.p4(local29 | local15 << 16, (byte) 38);
		local54.aPacketBit_1.p2_alt3(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24356(local54, -1490890350);
	}

	@OriginalMember(owner = "client!alt", name = "d", descriptor = "()V", line = 14)
	@Override
	void method14919() {
		@Pc(3) Class93_Sub23 local3 = this.method14929(706724354);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14908(local3, 32767, 1484218136);
		@Pc(15) int local15 = local3.method22876((byte) -107);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22875(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22891(214706887) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2588(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 78);
		local54.aPacketBit_1.p4(local29 | local15 << 16, (byte) -2);
		local54.aPacketBit_1.p2_alt3(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24356(local54, -1921175465);
	}

	@OriginalMember(owner = "client!alt", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method14922(@OriginalArg(0) int arg0) {
		return this.method14929(1134103010) != null || this.aLong106 * -1130360274060180351L < Class305.method26797(1076665732) - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "c", descriptor = "()Z", line = 34)
	@Override
	boolean method14913() {
		return this.method14929(542776431) != null || this.aLong106 * -1130360274060180351L < Class305.method26797(1094397478) - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "ag", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14925() {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 36);
	}

	@OriginalMember(owner = "client!alt", name = "j", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14926() {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 83);
	}

	@OriginalMember(owner = "client!alt", name = "ah", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14927() {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 83);
	}

	@OriginalMember(owner = "client!alt", name = "t", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14928() {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 51);
	}

	@OriginalMember(owner = "client!alt", name = "i", descriptor = "(I)Lclient!akm;", line = 38)
	Class93_Sub23 method14929(@OriginalArg(0) int arg0) {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 59);
	}

	@OriginalMember(owner = "client!alt", name = "ae", descriptor = "()Lclient!akm;", line = 38)
	Class93_Sub23 method14930() {
		return (Class93_Sub23) client.aClass22_45.method428((byte) 80);
	}

	@OriginalMember(owner = "client!alt", name = "r", descriptor = "()Lclient!akl;", line = 43)
	@Override
	Class93_Sub22 method14921() {
		return Class102.method2588(Class446.aClass446_99, client.aClass175_2.aClass24_2, (byte) 54);
	}

	@OriginalMember(owner = "client!alt", name = "z", descriptor = "(S)Lclient!akl;", line = 43)
	@Override
	Class93_Sub22 method14917(@OriginalArg(0) short arg0) {
		return Class102.method2588(Class446.aClass446_99, client.aClass175_2.aClass24_2, (byte) 67);
	}

	@OriginalMember(owner = "client!alt", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V", line = 46)
	@Override
	void method14916(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!alt", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 46)
	@Override
	void method14923(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 46)
	@Override
	void method14924(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "f", descriptor = "(I)I", line = 49)
	@Override
	int method14915(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!alt", name = "v", descriptor = "()I", line = 49)
	@Override
	int method14914() {
		return 0;
	}
}
