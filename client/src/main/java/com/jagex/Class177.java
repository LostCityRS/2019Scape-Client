package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!b")
public final class Class177 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()V")
	static void method24666() {
	}

	@OriginalMember(owner = "client!b", name = "u", descriptor = "()I")
	public static int method24667() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class102 local19 = Class620.method32309(0, local3, null, null, null, null, null, null, 0, (byte) -115);
		@Pc(22) long local22 = Class303.method27111((byte) 84);
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20724(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class303.method27111((byte) 118) - local22);
		local19.method20716(0, 0, 100, 100, -16777216, (byte) 59);
		local19.method20660(-816476425);
		return local24;
	}

	@OriginalMember(owner = "client!b", name = "t", descriptor = "(I)[Lclient!zy;")
	static Class722[] method24668(@OriginalArg(0) int arg0) {
		return new Class722[] { Class722.aClass722_6, Class722.aClass722_9, Class722.aClass722_8, Class722.aClass722_5, Class722.aClass722_10, Class722.aClass722_7 };
	}

	@OriginalMember(owner = "client!b", name = "zv", descriptor = "(Lclient!yp;B)V")
	static void method24669(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3558 * 188678613;
	}

	@OriginalMember(owner = "client!b", name = "abd", descriptor = "(Lclient!yp;I)V")
	static void method24670(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class286.anInt3941 * 626272167;
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	Class177() throws Throwable {
		throw new Error();
	}
}
