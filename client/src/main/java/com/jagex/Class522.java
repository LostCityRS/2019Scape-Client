package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qz")
final class Class522 implements Interface9 {

	@OriginalMember(owner = "client!qz", name = "l", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!qz", name = "bbq", descriptor = "(Lclient!yp;B)V")
	static void method30639(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class120_Sub1_Sub1_Sub1_Sub1 local3 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0.aClass120_Sub1_Sub1_Sub1_4;
		@Pc(6) Class335 local6 = local3.aClass335_1;
		if (local6.anIntArray416 != null) {
			local6 = local6.method27836(Class672.aClass134_1, Class672.aClass134_1, 850810464);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local6 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!qz", name = "ga", descriptor = "(I)V")
	public static void method30640(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(2071428410) == 1) {
			local1 |= 0x1;
			local1 |= 0x10;
			local1 |= 0x20;
			local1 |= 0x2;
			local1 |= 0x4;
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 0) {
			local1 |= 0x40;
		}
		Class608.method32188(local1, 612349967);
		client.aClass539_1.method30905(913615880).method17155(local1, (byte) 99);
		Class39.aClass540_1.method31056(1574758747).method30905(242725797).method17155(local1, (byte) 73);
		Class25.aClass41_Sub9_1.method17331(local1, (byte) 102);
		Class460.aClass41_Sub2_1.method17128(local1, -1941132132);
		Class104_Sub2.aClass41_Sub16_1.method17744(local1, 1801845287);
		Class9.method315(local1, (byte) 0);
		Class261.method26496(local1, -1009072799);
		Class351.method28020(local1, 2055078427);
		Class284.method26883(local1, -695557915);
		Class613.method32264(local1, (byte) 0);
		client.aClass539_1.method30938(1760723337);
	}

	@OriginalMember(owner = "client!qz", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30635(@OriginalArg(0) Packet arg0) {
		return Class601.method32103(arg0, (byte) 7);
	}

	@OriginalMember(owner = "client!qz", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	@Override
	public Object method30638(@OriginalArg(0) Packet arg0, @OriginalArg(1) short arg1) {
		return Class601.method32103(arg0, (byte) -67);
	}

	@OriginalMember(owner = "client!qz", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30636(@OriginalArg(0) Packet arg0) {
		return Class601.method32103(arg0, (byte) 89);
	}

	@OriginalMember(owner = "client!qz", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30637(@OriginalArg(0) Packet arg0) {
		return Class601.method32103(arg0, (byte) -11);
	}
}
