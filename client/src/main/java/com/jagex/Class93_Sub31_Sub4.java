package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arv")
public class Class93_Sub31_Sub4 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arv", name = "l", descriptor = "Ljava/lang/String;")
	String aString104;

	@OriginalMember(owner = "client!arv", name = "f", descriptor = "B")
	byte aByte86;

	@OriginalMember(owner = "client!arv", name = "w", descriptor = "I")
	int anInt3043;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arv", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 this$0;

	@OriginalMember(owner = "client!arv", name = "k", descriptor = "I")
	int anInt3044;

	@OriginalMember(owner = "client!arv", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V", line = 94)
	public static void method21950(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (client.anInt3435 * -849002901 != 0) {
			return;
		}
		@Pc(11) Class93_Sub22 local11 = Class102.method2588(Class446.aClass446_22, client.aClass175_1.aClass24_2, (byte) 16);
		local11.aClass93_Sub41_Sub2_1.method22395(0, 2127138865);
		@Pc(22) int local22 = local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local11.aClass93_Sub41_Sub2_1.method22431(arg0, -1779450730);
		local11.aClass93_Sub41_Sub2_1.method22431(arg1, 119662850);
		local11.aClass93_Sub41_Sub2_1.method22394(arg2, (byte) -95);
		local11.aClass93_Sub41_Sub2_1.method22394(arg3 ? 1 : 0, (byte) -72);
		local11.aClass93_Sub41_Sub2_1.method22431(arg4, 947002394);
		local11.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
		local11.aClass93_Sub41_Sub2_1.method22555(Class676.anIntArray516, local22, local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -51);
		local11.aClass93_Sub41_Sub2_1.method22445(local11.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local22, -1971347959);
		client.aClass175_1.method24356(local11, -1906063728);
		if (arg2 < 13) {
			client.aBoolean608 = true;
			Class277.method26359((byte) 0);
		}
		Class490.aClass700_1 = Class700.aClass700_18;
	}

	@OriginalMember(owner = "client!arv", name = "<init>", descriptor = "(Lclient!kc;)V", line = 129)
	Class93_Sub31_Sub4(@OriginalArg(0) Class374 arg0) {
		this.this$0 = arg0;
		this.anInt3044 = -630853483;
	}

	@OriginalMember(owner = "client!arv", name = "e", descriptor = "(Lclient!alw;I)V", line = 132)
	@Override
	void method22014(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		arg0.method22465((short) 16384);
		this.anInt3044 = arg0.method22472(-1434290800) * 630853483;
		this.aByte86 = arg0.method22468(467007568);
		this.anInt3043 = arg0.method22472(-1434290800) * -838446601;
		arg0.method22495(-1283499375);
		this.aString104 = arg0.method22509(-6221050);
		arg0.method22465((short) 16384);
	}

	@OriginalMember(owner = "client!arv", name = "m", descriptor = "(Lclient!alw;)V", line = 132)
	@Override
	void method22009(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.method22465((short) 16384);
		this.anInt3044 = arg0.method22472(-1434290800) * 630853483;
		this.aByte86 = arg0.method22468(1345582618);
		this.anInt3043 = arg0.method22472(-1434290800) * -838446601;
		arg0.method22495(-86909010);
		this.aString104 = arg0.method22509(-228056302);
		arg0.method22465((short) 16384);
	}

	@OriginalMember(owner = "client!arv", name = "n", descriptor = "(Lclient!akr;S)V", line = 142)
	@Override
	void method22010(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3044 * 1002087747];
		local7.aByte150 = this.aByte86;
		local7.anInt4597 = this.anInt3043 * -591613777;
		local7.aString191 = this.aString104;
	}

	@OriginalMember(owner = "client!arv", name = "k", descriptor = "(Lclient!akr;)V", line = 142)
	@Override
	void method22012(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3044 * 1002087747];
		local7.aByte150 = this.aByte86;
		local7.anInt4597 = this.anInt3043 * -591613777;
		local7.aString191 = this.aString104;
	}

	@OriginalMember(owner = "client!arv", name = "f", descriptor = "(Lclient!akr;)V", line = 142)
	@Override
	void method22011(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3044 * 1002087747];
		local7.aByte150 = this.aByte86;
		local7.anInt4597 = this.anInt3043 * -591613777;
		local7.aString191 = this.aString104;
	}

	@OriginalMember(owner = "client!arv", name = "w", descriptor = "(Lclient!akr;)V", line = 142)
	@Override
	void method22013(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3044 * 1002087747];
		local7.aByte150 = this.aByte86;
		local7.anInt4597 = this.anInt3043 * -591613777;
		local7.aString191 = this.aString104;
	}
}
