package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alt")
public final class Class163_Sub2 extends Class163 {

	@OriginalMember(owner = "client!alt", name = "<init>", descriptor = "()V")
	Class163_Sub2() {
	}

	@OriginalMember(owner = "client!alt", name = "ag", descriptor = "()Lclient!akm;")
	Class93_Sub23 method14937() {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 36);
	}

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "(I)V")
	@Override
	void method14924(@OriginalArg(0) int arg0) {
		@Pc(3) Class93_Sub23 local3 = this.method14941(-361774001);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14916(local3, 32767, 1960704974);
		@Pc(15) int local15 = local3.method22886((byte) -91);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22885(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22902(1106946160) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 119);
		local54.aClass93_Sub41_Sub2_1.method22407(local29 | local15 << 16, (byte) 20);
		local54.aClass93_Sub41_Sub2_1.method22468(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24363(local54, -2063301593);
	}

	@OriginalMember(owner = "client!alt", name = "u", descriptor = "(I)Z")
	@Override
	boolean method14926(@OriginalArg(0) int arg0) {
		return this.method14941(1134103010) != null || this.aLong106 * -1130360274060180351L < Class305.method26889(1076665732) - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "()V")
	@Override
	void method14922() {
		@Pc(3) Class93_Sub23 local3 = this.method14941(980324554);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14916(local3, 32767, -1725280454);
		@Pc(15) int local15 = local3.method22886((byte) -23);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22885(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22902(-1042519865) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 35);
		local54.aClass93_Sub41_Sub2_1.method22407(local29 | local15 << 16, (byte) 38);
		local54.aClass93_Sub41_Sub2_1.method22468(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24363(local54, -1490890350);
	}

	@OriginalMember(owner = "client!alt", name = "f", descriptor = "(I)I")
	@Override
	int method14917(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!alt", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V")
	@Override
	void method14918(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!alt", name = "j", descriptor = "()Lclient!akm;")
	Class93_Sub23 method14938() {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 83);
	}

	@OriginalMember(owner = "client!alt", name = "ah", descriptor = "()Lclient!akm;")
	Class93_Sub23 method14939() {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 83);
	}

	@OriginalMember(owner = "client!alt", name = "d", descriptor = "()V")
	@Override
	void method14923() {
		@Pc(3) Class93_Sub23 local3 = this.method14941(706724354);
		if (local3 == null) {
			return;
		}
		@Pc(11) int local11 = this.method14916(local3, 32767, 1484218136);
		@Pc(15) int local15 = local3.method22886((byte) -107);
		if (local15 < 0) {
			local15 = 0;
		} else if (local15 > 65535) {
			local15 = 65535;
		}
		@Pc(29) int local29 = local3.method22885(-1678286317);
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 65535) {
			local29 = 65535;
		}
		@Pc(41) byte local41 = 0;
		if (local3.method22902(214706887) == 2) {
			local41 = 1;
		}
		@Pc(54) Class93_Sub22 local54 = Class102.method2592(Class446.aClass446_47, client.aClass175_2.aClass24_2, (byte) 78);
		local54.aClass93_Sub41_Sub2_1.method22407(local29 | local15 << 16, (byte) -2);
		local54.aClass93_Sub41_Sub2_1.method22468(local11 | local41 << 15, (short) 255);
		client.aClass175_2.method24363(local54, -1921175465);
	}

	@OriginalMember(owner = "client!alt", name = "c", descriptor = "()Z")
	@Override
	boolean method14912() {
		return this.method14941(542776431) != null || this.aLong106 * -1130360274060180351L < Class305.method26889(1094397478) - 2000L;
	}

	@OriginalMember(owner = "client!alt", name = "r", descriptor = "()Lclient!akl;")
	@Override
	Class93_Sub22 method14925() {
		return Class102.method2592(Class446.aClass446_99, client.aClass175_2.aClass24_2, (byte) 54);
	}

	@OriginalMember(owner = "client!alt", name = "v", descriptor = "()I")
	@Override
	int method14913() {
		return 0;
	}

	@OriginalMember(owner = "client!alt", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V")
	@Override
	void method14927(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V")
	@Override
	void method14928(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
	}

	@OriginalMember(owner = "client!alt", name = "t", descriptor = "()Lclient!akm;")
	Class93_Sub23 method14940() {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 51);
	}

	@OriginalMember(owner = "client!alt", name = "i", descriptor = "(I)Lclient!akm;")
	Class93_Sub23 method14941(@OriginalArg(0) int arg0) {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 59);
	}

	@OriginalMember(owner = "client!alt", name = "z", descriptor = "(S)Lclient!akl;")
	@Override
	Class93_Sub22 method14921(@OriginalArg(0) short arg0) {
		return Class102.method2592(Class446.aClass446_99, client.aClass175_2.aClass24_2, (byte) 67);
	}

	@OriginalMember(owner = "client!alt", name = "ae", descriptor = "()Lclient!akm;")
	Class93_Sub23 method14942() {
		return (Class93_Sub23) client.aClass22_45.method445((byte) 80);
	}
}
