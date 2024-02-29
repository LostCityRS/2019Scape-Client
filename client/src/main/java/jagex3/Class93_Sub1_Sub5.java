package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ard")
public final class Class93_Sub1_Sub5 extends Class93_Sub1 {

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "I")
	int anInt3000;

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "[B")
	byte[] aByteArray56;

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "I")
	int anInt3002;

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "Lclient!ako;")
	Class93_Sub25 aClass93_Sub25_1;

	@OriginalMember(owner = "client!ard", name = "q", descriptor = "Z")
	boolean aBoolean500;

	@OriginalMember(owner = "client!ard", name = "s", descriptor = "Z")
	boolean aBoolean501;

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "Z")
	boolean aBoolean502;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "[[Lclient!dn;")
	Class230[][] aClass230ArrayArray1 = (Class230[][]) null;

	@OriginalMember(owner = "client!ard", name = "o", descriptor = "I")
	int anInt3003 = 0;

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "I")
	int anInt3001;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "(Lclient!py;Lclient!py;)V")
	public static void method21560(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "(Lclient!py;Lclient!py;)V")
	public static void method21561(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "(Lclient!py;Lclient!py;)V")
	public static void method21562(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "(Lclient!py;Lclient!py;)V")
	public static void method21565(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "<init>", descriptor = "(I)V")
	public Class93_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3001 = arg0 * 230938741;
	}

	@OriginalMember(owner = "client!ard", name = "m", descriptor = "(Lclient!alw;IB)V")
	void method21551(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt3002 = arg0.method22427(-1434290800) * -1452663667;
		this.anInt3000 = arg0.method22427(-1434290800) * 458944011;
		this.anInt3003 = arg0.method22425((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.method22427(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21493(arg0.method22425((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.method22443(-358186793);
			@Pc(53) Class211 local53 = Class581.method31580(arg0.method22425((short) 16384), 1241791091);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25740(arg0, arg1, 1143974006);
			@Pc(67) int local67 = local43.method25820(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25515(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean500 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean501 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean502 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "at", descriptor = "()Z")
	public boolean method21552() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!ard", name = "w", descriptor = "(I)I")
	int method21553(@OriginalArg(0) int arg0) {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "k", descriptor = "(S)I")
	public int method21554(@OriginalArg(0) short arg0) {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "f", descriptor = "(B)I")
	public int method21555(@OriginalArg(0) byte arg0) {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "(I)I")
	public int method21556(@OriginalArg(0) int arg0) {
		return this.method21555((byte) 1) - this.method21554((short) -27825);
	}

	@OriginalMember(owner = "client!ard", name = "ag", descriptor = "()I")
	int method21557() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "i", descriptor = "()I")
	public int method21558() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "(I)Z")
	public boolean method21559(@OriginalArg(0) int arg0) {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!ard", name = "h", descriptor = "()I")
	public int method21563() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "(Lclient!alw;I)V")
	void method21564(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.method22427(-1434290800) * -1452663667;
		this.anInt3000 = arg0.method22427(-1434290800) * 458944011;
		this.anInt3003 = arg0.method22425((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.method22427(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21493(arg0.method22425((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.method22443(-358186793);
			@Pc(53) Class211 local53 = Class581.method31580(arg0.method22425((short) 16384), -2045176106);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25740(arg0, arg1, 35254018);
			@Pc(67) int local67 = local43.method25820(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25515(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean500 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean501 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean502 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "a", descriptor = "()I")
	public int method21566() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "n", descriptor = "(I)Z")
	public boolean method21567(@OriginalArg(0) int arg0) {
		if (this.aClass230ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray56 == null) {
			@Pc(12) Class497 local12 = Class614.aClass497_134;
			synchronized (Class614.aClass497_134) {
				this.aByteArray56 = Class614.aClass497_134.method30240(this.anInt3001 * 1796814813, (byte) 50);
				if (this.aByteArray56 == null) {
					return false;
				}
			}
		}
		@Pc(39) boolean local39 = true;
		@Pc(45) Class93_Sub41 local45 = new Class93_Sub41(this.aByteArray56);
		@Pc(49) int local49 = local45.method22425((short) 16384);
		@Pc(53) int local53 = local45.method22427(-1434290800);
		@Pc(56) Class497 local56 = Class722.aClass497_144;
		synchronized (Class722.aClass497_144) {
			local39 &= Class722.aClass497_144.method30235(local53, -512225963);
		}
		if (!local39) {
			return false;
		}
		local56 = Class614.aClass497_134;
		synchronized (Class614.aClass497_134) {
			this.aClass93_Sub25_1 = new Class93_Sub25(local53, Class722.aClass497_144.method30240(local53, (byte) 37));
			this.method21551(local45, local49, (byte) -25);
			this.aByteArray56 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!ard", name = "g", descriptor = "()I")
	public int method21568() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "as", descriptor = "()Z")
	public boolean method21569() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!ard", name = "j", descriptor = "()I")
	public int method21570() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "ae", descriptor = "()I")
	public int method21571() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "ai", descriptor = "()I")
	public int method21572() {
		return this.method21555((byte) 1) - this.method21554((short) 12914);
	}

	@OriginalMember(owner = "client!ard", name = "ah", descriptor = "()I")
	int method21573() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "al", descriptor = "()I")
	int method21574() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ac", descriptor = "()I")
	int method21575() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "x", descriptor = "(Lclient!alw;I)V")
	void method21576(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.method22427(-1434290800) * -1452663667;
		this.anInt3000 = arg0.method22427(-1434290800) * 458944011;
		this.anInt3003 = arg0.method22425((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.method22427(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21493(arg0.method22425((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.method22443(-358186793);
			@Pc(53) Class211 local53 = Class581.method31580(arg0.method22425((short) 16384), -1522079753);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25740(arg0, arg1, 726335222);
			@Pc(67) int local67 = local43.method25820(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25515(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean500 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean501 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean502 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "aw", descriptor = "()Z")
	public boolean method21577() {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!ard", name = "u", descriptor = "(I)Z")
	public boolean method21578(@OriginalArg(0) int arg0) {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "(I)Z")
	public boolean method21579(@OriginalArg(0) int arg0) {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!ard", name = "ad", descriptor = "()Z")
	public boolean method21580() {
		return this.aBoolean500;
	}
}
