package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abi")
public final class Class35 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!abi", name = "e", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!abi", name = "f", descriptor = "[[Lclient!qy;")
	Class521[][] aClass521ArrayArray1;

	@OriginalMember(owner = "client!abi", name = "t", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!abi", name = "t", descriptor = "(Lclient!pf;Lclient!dx;Lclient!ew;B)V")
	public static void method759(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Interface23 arg2, @OriginalArg(3) byte arg3) {
		Class391.aClass480_111 = arg0;
		Class549.aClass235_7 = arg1;
		Class628.anInterface23_10 = arg2;
	}

	@OriginalMember(owner = "client!abi", name = "<init>", descriptor = "()V")
	Class35() {
	}

	@OriginalMember(owner = "client!abi", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abi", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method755(arg0, local3, -469644083);
		}
	}

	@OriginalMember(owner = "client!abi", name = "x", descriptor = "(Lclient!ald;I)V")
	void method754(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1();
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass521ArrayArray1 = new Class521[local6][];
			}
			for (@Pc(21) int local21 = arg0.g1(); local21 != 255; local21 = arg0.g1()) {
				@Pc(28) int local28 = arg0.g1();
				@Pc(31) Class521[] local31 = new Class521[local28];
				for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
					local31[local33] = (Class521) Class80_Sub39.method15030(Class521.method30628(1524872295), arg0.gSmart1or2(), -728003824);
				}
				this.anObjectArrayArray1[local21] = Class328.method27723(arg0, local31, -2141547566);
				this.aClass521ArrayArray1[local21] = local31;
			}
		} else if (arg1 == 4) {
			this.anInt108 = arg0.gVarInt2() * -1938750589;
		}
	}

	@OriginalMember(owner = "client!abi", name = "i", descriptor = "(Lclient!ald;II)V")
	void method755(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1();
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass521ArrayArray1 = new Class521[local6][];
			}
			for (@Pc(21) int local21 = arg0.g1(); local21 != 255; local21 = arg0.g1()) {
				@Pc(28) int local28 = arg0.g1();
				@Pc(31) Class521[] local31 = new Class521[local28];
				for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
					local31[local33] = (Class521) Class80_Sub39.method15030(Class521.method30628(1725565231), arg0.gSmart1or2(), -1644113342);
				}
				this.anObjectArrayArray1[local21] = Class328.method27723(arg0, local31, -2017951792);
				this.aClass521ArrayArray1[local21] = local31;
			}
		} else if (arg1 == 4) {
			this.anInt108 = arg0.gVarInt2() * -1938750589;
		}
	}

	@OriginalMember(owner = "client!abi", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!abi", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!abi", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abi", name = "l", descriptor = "(IB)[Ljava/lang/Object;")
	public Object[] method756(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abi", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!abi", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abi", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abi", name = "m", descriptor = "(Lclient!ald;I)V")
	void method757(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1();
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass521ArrayArray1 = new Class521[local6][];
			}
			for (@Pc(21) int local21 = arg0.g1(); local21 != 255; local21 = arg0.g1()) {
				@Pc(28) int local28 = arg0.g1();
				@Pc(31) Class521[] local31 = new Class521[local28];
				for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
					local31[local33] = (Class521) Class80_Sub39.method15030(Class521.method30628(1610523638), arg0.gSmart1or2(), -964646307);
				}
				this.anObjectArrayArray1[local21] = Class328.method27723(arg0, local31, -2127431683);
				this.aClass521ArrayArray1[local21] = local31;
			}
		} else if (arg1 == 4) {
			this.anInt108 = arg0.gVarInt2() * -1938750589;
		}
	}

	@OriginalMember(owner = "client!abi", name = "k", descriptor = "(Lclient!ald;I)V")
	void method758(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1();
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass521ArrayArray1 = new Class521[local6][];
			}
			for (@Pc(21) int local21 = arg0.g1(); local21 != 255; local21 = arg0.g1()) {
				@Pc(28) int local28 = arg0.g1();
				@Pc(31) Class521[] local31 = new Class521[local28];
				for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
					local31[local33] = (Class521) Class80_Sub39.method15030(Class521.method30628(1379119889), arg0.gSmart1or2(), -1555402573);
				}
				this.anObjectArrayArray1[local21] = Class328.method27723(arg0, local31, -2081894845);
				this.aClass521ArrayArray1[local21] = local31;
			}
		} else if (arg1 == 4) {
			this.anInt108 = arg0.gVarInt2() * -1938750589;
		}
	}

	@OriginalMember(owner = "client!abi", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method755(arg0, local3, 503871356);
		}
	}
}
