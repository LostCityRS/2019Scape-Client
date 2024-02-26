package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akt")
public final class Class80_Sub30 extends Class80 {

	@OriginalMember(owner = "client!akt", name = "u", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!akt", name = "l", descriptor = "I")
	public final int anInt1641;

	@OriginalMember(owner = "client!akt", name = "g", descriptor = "I")
	public final int anInt1639;

	@OriginalMember(owner = "client!akt", name = "j", descriptor = "I")
	public final int anInt1644;

	@OriginalMember(owner = "client!akt", name = "a", descriptor = "I")
	public final int anInt1645;

	@OriginalMember(owner = "client!akt", name = "i", descriptor = "I")
	public final int anInt1638;

	@OriginalMember(owner = "client!akt", name = "m", descriptor = "I")
	public final int anInt1642;

	@OriginalMember(owner = "client!akt", name = "o", descriptor = "I")
	public final int anInt1643;

	@OriginalMember(owner = "client!akt", name = "s", descriptor = "I")
	public final int anInt1646;

	@OriginalMember(owner = "client!akt", name = "gk", descriptor = "(Lclient!yp;I)V")
	static void method14391(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class698.method37063(local11, local14, arg0, (short) 16770);
	}

	@OriginalMember(owner = "client!akt", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class80_Sub30(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(5) int local5 = arg0.method23182(-2145454204);
		this.anInt1640 = (local5 >>> 28) * 675776743;
		this.anInt1641 = (local5 >>> 14 & 0x3FFF) * -1854322835;
		this.anInt1639 = (local5 & 0x3FFF) * 1838645049;
		this.anInt1644 = arg0.method23362(-99519241) * -1323891247;
		this.anInt1645 = arg0.method23362(-357789699) * -1455384553;
		this.anInt1638 = arg0.method23362(280592132) * -1878440187;
		this.anInt1642 = arg0.method23362(595657395) * -1638242875;
		this.anInt1643 = arg0.method23362(754769574) * 1861795829;
		this.anInt1646 = arg0.method23362(-348161463) * -1449285633;
	}
}
