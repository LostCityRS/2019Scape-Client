package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashMap;

@OriginalClass("client!afx")
public final class Class103_Sub4 extends Class103 {

	@OriginalMember(owner = "client!afx", name = "f", descriptor = "I")
	final int anInt900;

	@OriginalMember(owner = "client!afx", name = "e", descriptor = "I")
	final int anInt898;

	@OriginalMember(owner = "client!afx", name = "u", descriptor = "I")
	final int anInt897;

	@OriginalMember(owner = "client!afx", name = "l", descriptor = "I")
	final int anInt901;

	@OriginalMember(owner = "client!afx", name = "g", descriptor = "I")
	final int anInt899;

	@OriginalMember(owner = "client!afx", name = "fy", descriptor = "(Lclient!abf;ZIZZI)Lclient!pf;")
	public static Class480 method7625(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Class626.aClass141_Sub1Array2 == null) {
			Class626.aClass141_Sub1Array2 = new Class141_Sub1[Class79.method1432(606764323)];
			Class673.aMap22 = new HashMap();
		}
		@Pc(11) Class592 local11 = null;
		@Pc(15) int local15 = arg0.method683(2093159744);
		if (client.aClass36_6 != null && !Class638.aBoolean964) {
			local11 = new Class592(local15, client.aClass36_6, Class203.aClass36Array1[local15], local15 == Class32.aClass32_39.method683(-468480685) ? 8000000 : 2500000);
		}
		Class626.aClass141_Sub1Array2[local15] = Class279.aClass491_1.method30245(local15, local11, Class644.aClass592_4, arg0.method686(-2121595563), -604582785);
		if (arg4) {
			Class626.aClass141_Sub1Array2[local15].method10917((byte) 14);
		}
		@Pc(65) Class480 local65 = new Class480(Class626.aClass141_Sub1Array2[local15], arg1, arg2);
		Class673.aMap22.put(arg0, local65);
		return local65;
	}

	@OriginalMember(owner = "client!afx", name = "az", descriptor = "(IIIII)V")
	static void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class80_Sub1_Sub9 local9 = Class22.method545(17, (long) arg1 << 32 | (long) arg0);
		local9.method22135(-457826299);
		local9.anInt3064 = arg2 * -1221031713;
		local9.anInt3047 = arg3 * 673180539;
	}

	@OriginalMember(owner = "client!afx", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub4(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt900 = arg0.g2() * 852427461;
		this.anInt898 = arg0.g2() * 1850198037;
		this.anInt897 = arg0.g2() * -2036824353;
		this.anInt901 = arg0.g2() * -1925203285;
		this.anInt899 = arg0.g2() * 154804975;
	}

	@OriginalMember(owner = "client!afx", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class106.method18207(this.anInt900 * 1864838157, this.anInt897 * -984304353, this.anInt898 * -1658206403, 100, 100, false, (byte) 2);
		Class420.method29012(this.anInt901 * 63074307, this.anInt899 * -329823217, 0, 996553802);
		client.aBoolean722 = true;
	}

	@OriginalMember(owner = "client!afx", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class106.method18207(this.anInt900 * 1864838157, this.anInt897 * -984304353, this.anInt898 * -1658206403, 100, 100, false, (byte) 2);
		Class420.method29012(this.anInt901 * 63074307, this.anInt899 * -329823217, 0, 1364205092);
		client.aBoolean722 = true;
	}

	@OriginalMember(owner = "client!afx", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class106.method18207(this.anInt900 * 1864838157, this.anInt897 * -984304353, this.anInt898 * -1658206403, 100, 100, false, (byte) 2);
		Class420.method29012(this.anInt901 * 63074307, this.anInt899 * -329823217, 0, 1295031159);
		client.aBoolean722 = true;
	}
}
