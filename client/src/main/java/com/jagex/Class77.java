package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adb")
public class Class77 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!adb", name = "e", descriptor = "[[Lclient!qw;")
	public Class519[][] aClass519ArrayArray2;

	@OriginalMember(owner = "client!adb", name = "n", descriptor = "[[Ljava/lang/Object;")
	public Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!adb", name = "<init>", descriptor = "()V", line = 15)
	Class77() {
	}

	@OriginalMember(owner = "client!adb", name = "m", descriptor = "(Lclient!alw;)V", line = 19)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1295(arg0, local3, (short) -7627);
		}
	}

	@OriginalMember(owner = "client!adb", name = "e", descriptor = "(Lclient!alw;B)V", line = 19)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1295(arg0, local3, (short) -11253);
		}
	}

	@OriginalMember(owner = "client!adb", name = "k", descriptor = "(Lclient!alw;)V", line = 19)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1295(arg0, local3, (short) -10116);
		}
	}

	@OriginalMember(owner = "client!adb", name = "f", descriptor = "(Lclient!alw;)V", line = 19)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1295(arg0, local3, (short) -17173);
		}
	}

	@OriginalMember(owner = "client!adb", name = "w", descriptor = "(Lclient!alw;)V", line = 19)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1295(arg0, local3, (short) -26943);
		}
	}

	@OriginalMember(owner = "client!adb", name = "u", descriptor = "(Lclient!alw;IS)V", line = 26)
	void method1295(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.g1((short) 16384);
		if (this.aClass519ArrayArray2 == null) {
			this.aClass519ArrayArray2 = new Class519[local6][];
		}
		for (@Pc(18) int local18 = arg0.g1((short) 16384); local18 != 255; local18 = arg0.g1((short) 16384)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class519[] local38 = new Class519[arg0.g1((short) 16384)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class519) Class107.method18116(Class519.method30309(1668594609), arg0.gSmart1or2((byte) -116), -1915563430);
			}
			this.aClass519ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass519ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class166_Sub38.method16323(arg0, local38, -2042939894);
			}
		}
	}

	@OriginalMember(owner = "client!adb", name = "p", descriptor = "(Lclient!alw;I)V", line = 26)
	void method1296(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.g1((short) 16384);
		if (this.aClass519ArrayArray2 == null) {
			this.aClass519ArrayArray2 = new Class519[local6][];
		}
		for (@Pc(18) int local18 = arg0.g1((short) 16384); local18 != 255; local18 = arg0.g1((short) 16384)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class519[] local38 = new Class519[arg0.g1((short) 16384)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class519) Class107.method18116(Class519.method30309(1460103674), arg0.gSmart1or2((byte) -71), -1915563430);
			}
			this.aClass519ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass519ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class166_Sub38.method16323(arg0, local38, -1659135670);
			}
		}
	}

	@OriginalMember(owner = "client!adb", name = "d", descriptor = "(Lclient!alw;I)V", line = 26)
	void method1297(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.g1((short) 16384);
		if (this.aClass519ArrayArray2 == null) {
			this.aClass519ArrayArray2 = new Class519[local6][];
		}
		for (@Pc(18) int local18 = arg0.g1((short) 16384); local18 != 255; local18 = arg0.g1((short) 16384)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class519[] local38 = new Class519[arg0.g1((short) 16384)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class519) Class107.method18116(Class519.method30309(2049948201), arg0.gSmart1or2((byte) -109), -1915563430);
			}
			this.aClass519ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass519ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class166_Sub38.method16323(arg0, local38, 1288295709);
			}
		}
	}

	@OriginalMember(owner = "client!adb", name = "c", descriptor = "(Lclient!alw;I)V", line = 26)
	void method1298(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.g1((short) 16384);
		if (this.aClass519ArrayArray2 == null) {
			this.aClass519ArrayArray2 = new Class519[local6][];
		}
		for (@Pc(18) int local18 = arg0.g1((short) 16384); local18 != 255; local18 = arg0.g1((short) 16384)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class519[] local38 = new Class519[arg0.g1((short) 16384)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class519) Class107.method18116(Class519.method30309(1679068317), arg0.gSmart1or2((byte) -122), -1915563430);
			}
			this.aClass519ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass519ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class166_Sub38.method16323(arg0, local38, 2116645453);
			}
		}
	}

	@OriginalMember(owner = "client!adb", name = "o", descriptor = "(Lclient!alw;I)V", line = 26)
	void method1299(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.g1((short) 16384);
		if (this.aClass519ArrayArray2 == null) {
			this.aClass519ArrayArray2 = new Class519[local6][];
		}
		for (@Pc(18) int local18 = arg0.g1((short) 16384); local18 != 255; local18 = arg0.g1((short) 16384)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class519[] local38 = new Class519[arg0.g1((short) 16384)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class519) Class107.method18116(Class519.method30309(1837731987), arg0.gSmart1or2((byte) -3), -1915563430);
			}
			this.aClass519ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass519ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class166_Sub38.method16323(arg0, local38, 111677415);
			}
		}
	}

	@OriginalMember(owner = "client!adb", name = "n", descriptor = "(I)V", line = 48)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adb", name = "l", descriptor = "()V", line = 48)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!adb", name = "z", descriptor = "(IB)V", line = 49)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!adb", name = "r", descriptor = "(I)V", line = 49)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adb", name = "v", descriptor = "(I)V", line = 49)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adb", name = "ib", descriptor = "(Lclient!alh;IZZI)V", line = 6267)
	static final void method1300(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(37) int local37;
		@Pc(46) int local46;
		if (arg0 instanceof Class132_Sub1_Sub1 && arg0 instanceof Interface61) {
			@Pc(8) Class132_Sub1_Sub1 local8 = (Class132_Sub1_Sub1) arg0;
			@Pc(18) int local18 = local8.aShort130 - local8.aShort129 + 1 << 9;
			@Pc(28) int local28 = local8.aShort127 - local8.aShort128 + 1 << 9;
			local37 = local18 / 2 + (local8.aShort129 << 9);
			local46 = (local8.aShort128 << 9) + local28 / 2;
		} else {
			@Pc(51) Class472 local51 = arg0.method24220().aClass472_61;
			local37 = (int) local51.aFloat317;
			local46 = (int) local51.aFloat319;
		}
		Class166_Sub11.method15594(arg0.aByte100, local37, local46, 0, arg1, arg2, arg3, 1420444056);
	}

	@OriginalMember(owner = "client!adb", name = "lt", descriptor = "(I)V", line = 12319)
	static void method1301(@OriginalArg(0) int arg0) {
		@Pc(2) Class175 local2 = Class330.method27371(-1535095443);
		@Pc(8) ClientMessage local8 = Class102.createGameMessage(ClientProt.aClientProt_87, local2.clientIsaac, (byte) 102);
		local8.packet.p4(client.verifyId * 1598735607, (byte) 31);
		local2.send(local8, -2067585322);
	}
}
