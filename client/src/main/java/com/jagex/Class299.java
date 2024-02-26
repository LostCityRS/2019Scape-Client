package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class299 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gt", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_13;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
	final int anInt3962;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	final int anInt3961;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "(Lclient!ve;Lclient!akg;B)Z")
	static boolean method27022(@OriginalArg(0) Interface67 arg0, @OriginalArg(1) Class80_Sub17 arg1, @OriginalArg(2) byte arg2) {
		return arg0 != null && arg0.method32275(arg1, client.anInterface63Array1, client.anInt3446 * -881615229, Class544.aClass155_1, (short) 4730);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(III)I")
	static int method27023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) int local35 = Class661.method33319(arg0 - 1, arg1 - 1, -2126244043) + Class661.method33319(arg0 + 1, arg1 - 1, -2038334466) + Class661.method33319(arg0 - 1, arg1 + 1, -2064499733) + Class661.method33319(arg0 + 1, arg1 + 1, -2004513498);
		@Pc(63) int local63 = Class661.method33319(arg0 - 1, arg1, -2010462949) + Class661.method33319(arg0 + 1, arg1, -2028194599) + Class661.method33319(arg0, arg1 - 1, -1983620145) + Class661.method33319(arg0, arg1 + 1, -2124581237);
		@Pc(68) int local68 = Class661.method33319(arg0, arg1, -2051631800);
		return local68 / 4 + local63 / 8 + local35 / 16;
	}

	@OriginalMember(owner = "client!gt", name = "ct", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method27024(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(17) boolean local17 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		if (local17 != arg0.aBoolean800) {
			arg0.aBoolean800 = local17;
			Class296.method26998(arg0, 630724970);
		}
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class507.method30516(arg0.anInt4087 * -2053489901, 870930365);
		}
	}

	@OriginalMember(owner = "client!gt", name = "nt", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method27025(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1724791469) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray10 = Class431.method29089(local13, arg2, 1475832177);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!gt", name = "abg", descriptor = "(Lclient!yp;I)V")
	static void method27026(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, -1556067335).method27047(799689045);
	}

	@OriginalMember(owner = "client!gt", name = "ay", descriptor = "(II)V")
	public static void method27027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(22, (long) arg0);
		local4.method22078(-243505941);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class299(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_13 = arg0;
		this.anInt3962 = arg1.g2() * 926518499;
		this.anInt3961 = arg1.g1() * 1481246163;
	}

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27151(this.anInt3962 * -810018613, this.anInt3961 * 682990171, 1500149312);
		arg0.method27140(this.anInt3962 * -810018613, -118201018).method27103((byte) -110);
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27151(this.anInt3962 * -810018613, this.anInt3961 * 682990171, -112453166);
		arg0.method27140(this.anInt3962 * -810018613, 186005234).method27103((byte) -37);
	}
}
