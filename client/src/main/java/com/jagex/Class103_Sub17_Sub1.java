package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqa")
public final class Class103_Sub17_Sub1 extends Class103_Sub17 {

	@OriginalMember(owner = "client!aqa", name = "l", descriptor = "I")
	final int anInt2620;

	@OriginalMember(owner = "client!aqa", name = "g", descriptor = "I")
	final int anInt2619;

	@OriginalMember(owner = "client!aqa", name = "i", descriptor = "I")
	final int anInt2618;

	@OriginalMember(owner = "client!aqa", name = "av", descriptor = "(Lclient!pm;B)V")
	static void method18565(@OriginalArg(0) Class487 arg0, @OriginalArg(1) byte arg1) {
		Class630.aClass487_98.method30075(arg0);
	}

	@OriginalMember(owner = "client!aqa", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub17_Sub1(@OriginalArg(0) Packet arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.g4();
		this.anInt2620 = (local6 >>> 16) * 1029508745;
		this.anInt2619 = (local6 & 0xFFFF) * 526265061;
		this.anInt2618 = arg0.g1() * -1844766941;
	}

	@OriginalMember(owner = "client!aqa", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(6) int local6 = this.anInt2620 * -1450216960 + 256;
		@Pc(13) int local13 = this.anInt2619 * -2063214080 + 256;
		@Pc(18) int local18 = this.anInt2618 * -1812279157;
		if (local18 < 3 && client.aClass539_1.method30903(-463929735).method30429(this.anInt2620 * 148162489, this.anInt2619 * 1900184301, 1091424718)) {
			local18++;
		}
		@Pc(90) Class120_Sub1_Sub1_Sub5 local90 = new Class120_Sub1_Sub1_Sub5(client.aClass539_1.method30932(-1638462787), this.anInt2750 * -1969476479, 0, this.anInt2618 * -1812279157, local18, local6, Class439.method29150(local6, local13, this.anInt2618 * -1812279157, 1037753497) - this.anInt2751 * -1677889011, local13, this.anInt2620 * 148162489, this.anInt2620 * 148162489, this.anInt2619 * 1900184301, this.anInt2619 * 1900184301, this.anInt2749 * -1154802479, false, 0);
		client.aClass24_19.method563(new Class80_Sub1_Sub8(local90), (long) (this.anInt2620 * 148162489 << 16 | this.anInt2619 * 1900184301));
	}

	@OriginalMember(owner = "client!aqa", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2620 * -1450216960 + 256;
		@Pc(13) int local13 = this.anInt2619 * -2063214080 + 256;
		@Pc(18) int local18 = this.anInt2618 * -1812279157;
		if (local18 < 3 && client.aClass539_1.method30903(-463929735).method30429(this.anInt2620 * 148162489, this.anInt2619 * 1900184301, 1300885188)) {
			local18++;
		}
		@Pc(90) Class120_Sub1_Sub1_Sub5 local90 = new Class120_Sub1_Sub1_Sub5(client.aClass539_1.method30932(-1638462787), this.anInt2750 * -1969476479, 0, this.anInt2618 * -1812279157, local18, local6, Class439.method29150(local6, local13, this.anInt2618 * -1812279157, 1037753497) - this.anInt2751 * -1677889011, local13, this.anInt2620 * 148162489, this.anInt2620 * 148162489, this.anInt2619 * 1900184301, this.anInt2619 * 1900184301, this.anInt2749 * -1154802479, false, 0);
		client.aClass24_19.method563(new Class80_Sub1_Sub8(local90), (long) (this.anInt2620 * 148162489 << 16 | this.anInt2619 * 1900184301));
	}

	@OriginalMember(owner = "client!aqa", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(6) int local6 = this.anInt2620 * -1450216960 + 256;
		@Pc(13) int local13 = this.anInt2619 * -2063214080 + 256;
		@Pc(18) int local18 = this.anInt2618 * -1812279157;
		if (local18 < 3 && client.aClass539_1.method30903(-463929735).method30429(this.anInt2620 * 148162489, this.anInt2619 * 1900184301, 1458043526)) {
			local18++;
		}
		@Pc(90) Class120_Sub1_Sub1_Sub5 local90 = new Class120_Sub1_Sub1_Sub5(client.aClass539_1.method30932(-1638462787), this.anInt2750 * -1969476479, 0, this.anInt2618 * -1812279157, local18, local6, Class439.method29150(local6, local13, this.anInt2618 * -1812279157, 1037753497) - this.anInt2751 * -1677889011, local13, this.anInt2620 * 148162489, this.anInt2620 * 148162489, this.anInt2619 * 1900184301, this.anInt2619 * 1900184301, this.anInt2749 * -1154802479, false, 0);
		client.aClass24_19.method563(new Class80_Sub1_Sub8(local90), (long) (this.anInt2620 * 148162489 << 16 | this.anInt2619 * 1900184301));
	}
}
