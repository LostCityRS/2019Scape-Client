package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ard")
public class Class93_Sub1_Sub5 extends Class93_Sub1 {

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "I")
	int anInt3000;

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "[B")
	byte[] aByteArray56;

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "I")
	int anInt3002;

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "Lclient!ako;")
	Class93_Sub25 aClass93_Sub25_1;

	@OriginalMember(owner = "client!ard", name = "q", descriptor = "Z")
	boolean aBoolean499;

	@OriginalMember(owner = "client!ard", name = "s", descriptor = "Z")
	boolean aBoolean500;

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "Z")
	boolean aBoolean501;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "[[Lclient!dn;")
	Class230[][] aClass230ArrayArray1 = (Class230[][]) null;

	@OriginalMember(owner = "client!ard", name = "o", descriptor = "I")
	int anInt3003 = 0;

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "I")
	int anInt3001;

	@OriginalMember(owner = "client!ard", name = "d", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21539(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21540(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "r", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21541(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public static void method21542(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		Class614.aClass497_134 = arg0;
		Class722.aClass497_144 = arg1;
	}

	@OriginalMember(owner = "client!ard", name = "<init>", descriptor = "(I)V", line = 27)
	public Class93_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3001 = arg0 * 230938741;
	}

	@OriginalMember(owner = "client!ard", name = "n", descriptor = "(I)Z", line = 32)
	public boolean method21543(@OriginalArg(0) int arg0) {
		if (this.aClass230ArrayArray1 != null) {
			return true;
		}
		if (this.aByteArray56 == null) {
			@Pc(12) Class497 local12 = Class614.aClass497_134;
			synchronized (Class614.aClass497_134) {
				this.aByteArray56 = Class614.aClass497_134.method30079(this.anInt3001 * 1796814813, (byte) 50);
				if (this.aByteArray56 == null) {
					return false;
				}
			}
		}
		@Pc(39) boolean local39 = true;
		@Pc(45) Packet local45 = new Packet(this.aByteArray56);
		@Pc(49) int local49 = local45.g1((short) 16384);
		@Pc(53) int local53 = local45.g2(-1434290800);
		@Pc(56) Class497 local56 = Class722.aClass497_144;
		synchronized (Class722.aClass497_144) {
			local39 &= Class722.aClass497_144.method30071(local53, -512225963);
		}
		if (!local39) {
			return false;
		}
		local56 = Class614.aClass497_134;
		synchronized (Class614.aClass497_134) {
			this.aClass93_Sub25_1 = new Class93_Sub25(local53, Class722.aClass497_144.method30079(local53, (byte) 37));
			this.method21544(local45, local49, (byte) -25);
			this.aByteArray56 = null;
			return true;
		}
	}

	@OriginalMember(owner = "client!ard", name = "m", descriptor = "(Lclient!alw;IB)V", line = 56)
	void method21544(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt3002 = arg0.g2(-1434290800) * -1452663667;
		this.anInt3000 = arg0.g2(-1434290800) * 458944011;
		this.anInt3003 = arg0.g1((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.g2(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.g1((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.gSmart1or2s(-358186793);
			@Pc(53) Class211 local53 = Class581.method31391(arg0.g1((short) 16384), 1241791091);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25629(arg0, arg1, 1143974006);
			@Pc(67) int local67 = local43.method25730(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25425(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "(Lclient!alw;I)V", line = 56)
	void method21545(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.g2(-1434290800) * -1452663667;
		this.anInt3000 = arg0.g2(-1434290800) * 458944011;
		this.anInt3003 = arg0.g1((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.g2(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.g1((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.gSmart1or2s(-358186793);
			@Pc(53) Class211 local53 = Class581.method31391(arg0.g1((short) 16384), -2045176106);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25629(arg0, arg1, 35254018);
			@Pc(67) int local67 = local43.method25730(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25425(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "x", descriptor = "(Lclient!alw;I)V", line = 56)
	void method21546(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInt3002 = arg0.g2(-1434290800) * -1452663667;
		this.anInt3000 = arg0.g2(-1434290800) * 458944011;
		this.anInt3003 = arg0.g1((short) 16384) * -412893821;
		@Pc(24) int local24 = arg0.g2(-1434290800);
		this.aClass230ArrayArray1 = new Class230[this.aClass93_Sub25_1.anInt1590 * 1418467783][];
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			@Pc(43) Class233 local43 = Class129_Sub2_Sub1.method21481(arg0.g1((short) 16384), (short) 166);
			@Pc(47) int local47 = arg0.gSmart1or2s(-358186793);
			@Pc(53) Class211 local53 = Class581.method31391(arg0.g1((short) 16384), -1522079753);
			@Pc(57) Class230 local57 = new Class230();
			local57.method25629(arg0, arg1, 726335222);
			@Pc(67) int local67 = local43.method25730(-907590386);
			if (this.aClass230ArrayArray1[local47] == null) {
				this.aClass230ArrayArray1[local47] = new Class230[local67];
			}
			this.aClass230ArrayArray1[local47][local53.method25425(759266314)] = local57;
			if (Class233.aClass233_5 == local43) {
				this.aBoolean499 = true;
			} else if (local43 == Class233.aClass233_1) {
				this.aBoolean500 = true;
			} else if (Class233.aClass233_3 == local43) {
				this.aBoolean501 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ard", name = "k", descriptor = "(S)I", line = 85)
	public int method21547(@OriginalArg(0) short arg0) {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "i", descriptor = "()I", line = 85)
	public int method21548() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "h", descriptor = "()I", line = 85)
	public int method21549() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "a", descriptor = "()I", line = 85)
	public int method21550() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "g", descriptor = "()I", line = 85)
	public int method21551() {
		return this.anInt3002 * 291964485;
	}

	@OriginalMember(owner = "client!ard", name = "f", descriptor = "(B)I", line = 89)
	public int method21552(@OriginalArg(0) byte arg0) {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "j", descriptor = "()I", line = 89)
	public int method21553() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "ae", descriptor = "()I", line = 89)
	public int method21554() {
		return this.anInt3000 * 98020771;
	}

	@OriginalMember(owner = "client!ard", name = "w", descriptor = "(I)I", line = 93)
	int method21555(@OriginalArg(0) int arg0) {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ag", descriptor = "()I", line = 93)
	int method21556() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ah", descriptor = "()I", line = 93)
	int method21557() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "al", descriptor = "()I", line = 93)
	int method21558() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "ac", descriptor = "()I", line = 93)
	int method21559() {
		return this.anInt3003 * -1238419157;
	}

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "(I)I", line = 97)
	public int method21560(@OriginalArg(0) int arg0) {
		return this.method21552((byte) 1) - this.method21547((short) -27825);
	}

	@OriginalMember(owner = "client!ard", name = "ai", descriptor = "()I", line = 97)
	public int method21561() {
		return this.method21552((byte) 1) - this.method21547((short) 12914);
	}

	@OriginalMember(owner = "client!ard", name = "u", descriptor = "(I)Z", line = 101)
	public boolean method21562(@OriginalArg(0) int arg0) {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!ard", name = "z", descriptor = "(I)Z", line = 105)
	public boolean method21563(@OriginalArg(0) int arg0) {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!ard", name = "aw", descriptor = "()Z", line = 105)
	public boolean method21564() {
		return this.aBoolean501;
	}

	@OriginalMember(owner = "client!ard", name = "at", descriptor = "()Z", line = 109)
	public boolean method21565() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "as", descriptor = "()Z", line = 109)
	public boolean method21566() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "(I)Z", line = 109)
	public boolean method21567(@OriginalArg(0) int arg0) {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!ard", name = "ad", descriptor = "()Z", line = 109)
	public boolean method21568() {
		return this.aBoolean499;
	}
}
