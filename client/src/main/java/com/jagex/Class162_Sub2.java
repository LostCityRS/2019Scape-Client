package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!alz")
public final class Class162_Sub2 extends Class162 {

	@OriginalMember(owner = "client!alz", name = "f", descriptor = "(S)I")
	public static int method15802(@OriginalArg(0) short arg0) {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class102 local19 = Class620.method32309(0, local3, null, null, null, null, null, null, 0, (byte) -85);
		@Pc(22) long local22 = Class303.currentTimeMillis((byte) 123);
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20724(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class303.currentTimeMillis((byte) 27) - local22);
		local19.method20716(0, 0, 100, 100, -16777216, (byte) 120);
		local19.method20660(-1697952403);
		return local24;
	}

	@OriginalMember(owner = "client!alz", name = "<init>", descriptor = "()V")
	Class162_Sub2() {
	}

	@OriginalMember(owner = "client!alz", name = "o", descriptor = "(I)Lclient!aku;")
	@Override
	Class80_Sub31 method15782(@OriginalArg(0) int arg0) {
		return Class623.method32440(Class443.aClass443_36, client.aClass75_1.aClass22_1, -191270971);
	}

	@OriginalMember(owner = "client!alz", name = "r", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15784(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class80_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "m", descriptor = "(I)Z")
	@Override
	boolean method15781(@OriginalArg(0) int arg0) {
		return this.method15799((byte) 26) != null || this.aLong153 * 4888655562420521213L < Class303.currentTimeMillis((byte) 54) - 2000L;
	}

	@OriginalMember(owner = "client!alz", name = "n", descriptor = "(B)Lclient!akg;")
	Class80_Sub17 method15799(@OriginalArg(0) byte arg0) {
		return (Class80_Sub17) client.aClass8_45.method247(129206984);
	}

	@OriginalMember(owner = "client!alz", name = "c", descriptor = "()Lclient!akg;")
	Class80_Sub17 method15800() {
		return (Class80_Sub17) client.aClass8_45.method247(129206984);
	}

	@OriginalMember(owner = "client!alz", name = "l", descriptor = "(I)I")
	@Override
	int method15778(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "g", descriptor = "(Lclient!ald;Lclient!akg;B)V")
	@Override
	void method15779(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class80_Sub17 arg1, @OriginalArg(2) byte arg2) {
	}

	@OriginalMember(owner = "client!alz", name = "a", descriptor = "()Z")
	@Override
	boolean method15776() {
		return this.method15799((byte) 118) != null || this.aLong153 * 4888655562420521213L < Class303.currentTimeMillis((byte) 14) - 2000L;
	}

	@OriginalMember(owner = "client!alz", name = "s", descriptor = "()Lclient!aku;")
	@Override
	Class80_Sub31 method15794() {
		return Class623.method32440(Class443.aClass443_36, client.aClass75_1.aClass22_1, -191270971);
	}

	@OriginalMember(owner = "client!alz", name = "k", descriptor = "()I")
	@Override
	int method15774() {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "x", descriptor = "()I")
	@Override
	int method15786() {
		return 0;
	}

	@OriginalMember(owner = "client!alz", name = "w", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15787(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class80_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "j", descriptor = "()V")
	@Override
	void method15780() {
		@Pc(3) Class80_Sub17 local3 = this.method15799((byte) 44);
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15777(local3, 32767, 1530367823);
		@Pc(16) int local16 = local3.method23454(-1812433345);
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method23451(529955065);
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method23452((byte) 3) == 2) {
			local42 = 1;
		}
		@Pc(55) Class80_Sub31 local55 = Class623.method32440(Class443.aClass443_50, client.aClass75_1.aClass22_1, -191270971);
		local55.aPacketBit_2.p4(local30 | local16 << 16);
		local55.aPacketBit_2.p2_alt3(local12 | local42 << 15);
		client.aClass75_1.method1325(local55, (byte) -89);
	}

	@OriginalMember(owner = "client!alz", name = "i", descriptor = "(I)V")
	@Override
	void method15785(@OriginalArg(0) int arg0) {
		@Pc(3) Class80_Sub17 local3 = this.method15799((byte) 71);
		if (local3 == null) {
			return;
		}
		@Pc(12) int local12 = this.method15777(local3, 32767, 1530367823);
		@Pc(16) int local16 = local3.method23454(130105770);
		if (local16 < 0) {
			local16 = 0;
		} else if (local16 > 65535) {
			local16 = 65535;
		}
		@Pc(30) int local30 = local3.method23451(559574767);
		if (local30 < 0) {
			local30 = 0;
		} else if (local30 > 65535) {
			local30 = 65535;
		}
		@Pc(42) byte local42 = 0;
		if (local3.method23452((byte) 3) == 2) {
			local42 = 1;
		}
		@Pc(55) Class80_Sub31 local55 = Class623.method32440(Class443.aClass443_50, client.aClass75_1.aClass22_1, -191270971);
		local55.aPacketBit_2.p4(local30 | local16 << 16);
		local55.aPacketBit_2.p2_alt3(local12 | local42 << 15);
		client.aClass75_1.method1325(local55, (byte) -22);
	}

	@OriginalMember(owner = "client!alz", name = "q", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15783(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class80_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!alz", name = "b", descriptor = "()Lclient!akg;")
	Class80_Sub17 method15801() {
		return (Class80_Sub17) client.aClass8_45.method247(129206984);
	}
}
