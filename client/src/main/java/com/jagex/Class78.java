package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!adc")
public final class Class78 {

	@OriginalMember(owner = "client!adc", name = "t", descriptor = "[Lclient!ko;")
	public Interface33[] anInterface33Array1;

	@OriginalMember(owner = "client!adc", name = "ayj", descriptor = "(Lclient!yp;I)V")
	static void method1373(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 0, (byte) 84);
		Class719.method37291(937731716);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!adc", name = "are", descriptor = "(Lclient!yp;I)V")
	static void method1374(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub15_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 32);
		client.aClass539_1.method30938(162205176);
		Class719.method37291(1142868086);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!adc", name = "fs", descriptor = "(I)V")
	static void method1375(@OriginalArg(0) int arg0) {
		Class544.aClass155_1.method15052(1558603228);
		Class363.aClass152_1.method14600(1524217695);
		Class564.aClient1.method25304(1991529297);
		Class454.aCanvas6.setBackground(Color.black);
		client.anInt3525 = 724759145;
		Class544.aClass155_1 = Class57.method1165(Class454.aCanvas6, -736632711);
		Class363.aClass152_1 = Class413.method28988(Class454.aCanvas6, true, 1957587824);
	}

	@OriginalMember(owner = "client!adc", name = "aqa", descriptor = "(Lclient!yp;I)V")
	static void method1376(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3853 * -128179925;
	}

	@OriginalMember(owner = "client!adc", name = "<init>", descriptor = "()V")
	Class78() {
	}

	@OriginalMember(owner = "client!adc", name = "e", descriptor = "(Lclient!ald;)V")
	void method1369(@OriginalArg(0) Packet arg0) {
		this.anInterface33Array1 = new Interface33[arg0.g1()];
		@Pc(8) Class392[] local8 = Class348.method27985(194076605);
		for (@Pc(10) int local10 = 0; local10 < this.anInterface33Array1.length; local10++) {
			this.anInterface33Array1[local10] = this.method1370(arg0, local8[arg0.g1()], 2136494004);
		}
	}

	@OriginalMember(owner = "client!adc", name = "f", descriptor = "(Lclient!ald;Lclient!kz;I)Lclient!ko;")
	Interface33 method1370(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == Class392.aClass392_11) {
			return Class262.method26511(arg0, 716146938);
		} else if (arg1 == Class392.aClass392_2) {
			return Class643.method33026(arg0, (byte) 83);
		} else if (arg1 == Class392.aClass392_5) {
			return Class117_Sub1.method8821(arg0, 1925243777);
		} else if (arg1 == Class392.aClass392_1) {
			return Class661.method33320(arg0, -1209055069);
		} else if (Class392.aClass392_6 == arg1) {
			return Class364.method28214(arg0, (byte) 0);
		} else if (Class392.aClass392_3 == arg1) {
			return Class642.method32966(arg0, (byte) -7);
		} else if (Class392.aClass392_4 == arg1) {
			return Class312.method27467(arg0, (byte) -28);
		} else if (arg1 == Class392.aClass392_8) {
			return Class236.method26128(arg0, (byte) -20);
		} else if (Class392.aClass392_7 == arg1) {
			return Class22.method542(arg0, 2125363809);
		} else if (arg1 == Class392.aClass392_10) {
			return Class223.method25944(arg0, 99763591);
		} else if (Class392.aClass392_9 == arg1) {
			return Class80_Sub3.method12782(arg0, (byte) 103);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!adc", name = "t", descriptor = "(Lclient!ald;I)V")
	void method1371(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInterface33Array1 = new Interface33[arg0.g1()];
		@Pc(8) Class392[] local8 = Class348.method27985(194076605);
		for (@Pc(10) int local10 = 0; local10 < this.anInterface33Array1.length; local10++) {
			this.anInterface33Array1[local10] = this.method1370(arg0, local8[arg0.g1()], 2101724591);
		}
	}

	@OriginalMember(owner = "client!adc", name = "u", descriptor = "(Lclient!ald;)V")
	void method1372(@OriginalArg(0) Packet arg0) {
		this.anInterface33Array1 = new Interface33[arg0.g1()];
		@Pc(8) Class392[] local8 = Class348.method27985(194076605);
		for (@Pc(10) int local10 = 0; local10 < this.anInterface33Array1.length; local10++) {
			this.anInterface33Array1[local10] = this.method1370(arg0, local8[arg0.g1()], 2073664975);
		}
	}
}
