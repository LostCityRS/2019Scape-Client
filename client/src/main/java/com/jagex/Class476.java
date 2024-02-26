package com.jagex;

import java.applet.Applet;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class476 implements Interface6 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_118;

	@OriginalMember(owner = "client!pb", name = "fc", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method29895(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		arg0.anInt4128 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * -2096113369;
		arg0.anInt4129 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * -2132986315;
		Class296.method26998(arg0, 916653581);
	}

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "(I)Lclient!ale;")
	static Class80_Sub37 method29896(@OriginalArg(0) int arg0) {
		@Pc(1) Class40 local1 = null;
		@Pc(7) Class80_Sub37 local7 = new Class80_Sub37(client.aClass722_4, 0);
		try {
			local1 = Class3.method70("", client.aClass722_4.aString247, false, -2066644810);
			@Pc(20) byte[] local20 = new byte[(int) local1.method839((byte) 0)];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method832(local20, local22, local20.length - local22, (byte) -102);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class80_Sub37(new Class80_Sub36(local20), client.aClass722_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method838(-2066724115);
			}
		} catch (@Pc(68) Exception local68) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "aax", descriptor = "(Lclient!yp;I)V")
	static void method29897(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13.startsWith(Class6_Sub1.method23670(0, -1923210046)) || local13.startsWith(Class6_Sub1.method23670(1, -349427559))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class123_Sub1.method9820(local13, 1689232687) ? 1 : 0;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class476(@OriginalArg(0) Class480 arg0) {
		this.aClass480_118 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "()I")
	@Override
	public int method30353() {
		return this.aClass480_118.method29956(2096129652) ? 100 : this.aClass480_118.method29936(1327847273);
	}

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "(B)I")
	@Override
	public int method30349(@OriginalArg(0) byte arg0) {
		return this.aClass480_118.method29956(2043126559) ? 100 : this.aClass480_118.method29936(-81278857);
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)Lclient!acr;")
	@Override
	public Class67 method30347(@OriginalArg(0) int arg0) {
		return Class67.aClass67_3;
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "()I")
	@Override
	public int method30348() {
		return this.aClass480_118.method29956(2087016350) ? 100 : this.aClass480_118.method29936(166585457);
	}

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "()I")
	@Override
	public int method30350() {
		return this.aClass480_118.method29956(2140588452) ? 100 : this.aClass480_118.method29936(-1414562150);
	}

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "()I")
	@Override
	public int method30352() {
		return this.aClass480_118.method29956(2101268241) ? 100 : this.aClass480_118.method29936(464382350);
	}

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30346() {
		return Class67.aClass67_3;
	}

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "()Lclient!acr;")
	@Override
	public Class67 method30351() {
		return Class67.aClass67_3;
	}
}
