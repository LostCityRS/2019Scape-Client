package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.LinkedList;

@OriginalClass("client!uy")
public final class Class604 {

	@OriginalMember(owner = "client!uy", name = "t", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList5 = new LinkedList();

	@OriginalMember(owner = "client!uy", name = "a", descriptor = "(I)V")
	public static void method32134(@OriginalArg(0) int arg0) {
		Class130_Sub1.method10205(new Class591(arg0), (byte) -60);
	}

	@OriginalMember(owner = "client!uy", name = "o", descriptor = "(I)V")
	public static void method32135(@OriginalArg(0) int arg0) {
		Class130_Sub1.method10205(new Class591(arg0), (byte) -101);
	}

	@OriginalMember(owner = "client!uy", name = "j", descriptor = "(I)V")
	public static void method32136(@OriginalArg(0) int arg0) {
		Class130_Sub1.method10205(new Class591(arg0), (byte) -88);
	}

	@OriginalMember(owner = "client!uy", name = "q", descriptor = "(Lclient!ux;)V")
	static void method32137(@OriginalArg(0) Interface66 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uy", name = "s", descriptor = "(Lclient!act;)V")
	public static void method32138(@OriginalArg(0) Class68 arg0) {
		Class130_Sub1.method10205(new Class603(arg0), (byte) -126);
	}

	@OriginalMember(owner = "client!uy", name = "k", descriptor = "(III)V")
	public static void method32139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class130_Sub1.method10205(new Class58_Sub1(arg0, arg1, arg2, client.anInt3583 * 292509161, Class108_Sub2.aClass139_8.anInt1250 * -1981136693, Class108_Sub2.aClass139_8.anInt1251 * 861114341, Class108_Sub2.aClass139_8.method10788((short) -105), Class108_Sub2.aClass139_8.method10764((byte) 48), Class504.aClass495_3.method30298(-648329341)), (byte) -70);
	}

	@OriginalMember(owner = "client!uy", name = "x", descriptor = "(III)V")
	public static void method32140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class130_Sub1.method10205(new Class58_Sub1(arg0, arg1, arg2, client.anInt3583 * 292509161, Class108_Sub2.aClass139_8.anInt1250 * -1981136693, Class108_Sub2.aClass139_8.anInt1251 * 861114341, Class108_Sub2.aClass139_8.method10788((short) 3099), Class108_Sub2.aClass139_8.method10764((byte) 100), Class504.aClass495_3.method30298(553891216)), (byte) -58);
	}

	@OriginalMember(owner = "client!uy", name = "w", descriptor = "(Lclient!acv;Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method32141(@OriginalArg(0) Class70 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class130_Sub1.method10205(new Class598(arg0, arg1, arg2, arg3), (byte) -123);
	}

	@OriginalMember(owner = "client!uy", name = "r", descriptor = "(Lclient!ux;)V")
	static void method32142(@OriginalArg(0) Interface66 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uy", name = "d", descriptor = "()V")
	public static void method32143() {
		if (client.anInt3433 * 1994758437 != 18 && client.anInt3433 * 1994758437 != 3 || client.aClass75_1 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface66 local16 = (Interface66) aLinkedList5.poll();
			if (local16 == null) {
				return;
			}
			local16.method32127(-1025961657);
		}
	}

	@OriginalMember(owner = "client!uy", name = "m", descriptor = "(Lclient!als;)V")
	public static void method32144(@OriginalArg(0) Class72_Sub1 arg0) {
		Class130_Sub1.method10205(arg0, (byte) -29);
	}

	@OriginalMember(owner = "client!uy", name = "h", descriptor = "(Lclient!ux;)V")
	static void method32145(@OriginalArg(0) Interface66 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uy", name = "f", descriptor = "(IB)Lclient!asw;")
	static Class80_Sub1_Sub20 method32146(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class80_Sub1_Sub20 local5 = (Class80_Sub1_Sub20) Class686.aClass248_1.method26331((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class438.aClass480_112.method29918(arg0, 0, 1896589581);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class228.method25994(local16, -2145224133);
		} catch (@Pc(30) Exception local30) {
			throw new RuntimeException(local30.getMessage() + " " + arg0);
		}
		Class686.aClass248_1.method26330(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!uy", name = "e", descriptor = "(Lclient!ald;I)Ljava/lang/String;")
	public static String method32147(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		return Class445.method29238(arg0, 32767, (byte) -5);
	}

	@OriginalMember(owner = "client!uy", name = "fa", descriptor = "(II)V")
	public static void method32148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3433 * 1994758437 == arg0) {
			return;
		}
		client.anInt3440 = 0;
		if (client.anInt3433 * 1994758437 == 18 && arg0 != 3) {
			Class557.method31375((byte) -32);
		}
		if (arg0 == 14 || arg0 == 19) {
			Class34.method742(494080144);
		}
		if (arg0 != 14 && OutputStream_Sub1.aClass160_3 != null) {
			OutputStream_Sub1.aClass160_3.method15549((short) 25614);
			OutputStream_Sub1.aClass160_3 = null;
		}
		if (arg0 == 4) {
			Class559.method31408(client.anInt3433 * 1994758437 == 0 || client.anInt3433 * 1994758437 == 12 || client.anInt3460 * 1849344509 != Class698.aClass638_1.anInt5615 * -812846045, -5301585);
			Class12.method346(54796859);
		}
		@Pc(88) boolean local88;
		if (arg0 == 13) {
			if (Class698.aClass638_1.anInt5635 * -1308891275 == -1) {
				local88 = client.anInt3433 * 1994758437 == 17 || client.anInt3433 * 1994758437 == 9;
			} else {
				local88 = client.anInt3460 * 1849344509 != Class698.aClass638_1.anInt5635 * -1308891275;
			}
			Class119_Sub1.method8899(local88, (byte) 74);
		}
		if (arg0 == 17 || arg0 == 9) {
			if (!Class116.method8758(-893469730)) {
				return;
			}
		} else if (arg0 == 7 || arg0 == 15 && client.anInt3433 * 1994758437 != 16) {
			if (!Class34.method742(1280851122)) {
				return;
			}
		} else if (arg0 == 12) {
			Class288.method26915(1896589581);
		}
		if (Class281.method26864(arg0, 1539605184)) {
			client.aClass539_1.method30914((byte) 110);
			client.aClass539_1.aLong393 = -1390528405935974947L;
		}
		if (arg0 == 3 || arg0 == 4) {
			Class711.method37169((byte) -59);
		}
		local88 = arg0 == 1 || Class392.method28683(arg0, -1435533628) || Class301.method27043(arg0, (byte) 10);
		@Pc(188) boolean local188 = client.anInt3433 * 1994758437 == 1 || Class392.method28683(client.anInt3433 * 1994758437, -1852916369) || Class301.method27043(client.anInt3433 * 1994758437, (byte) -37);
		if (local188 != local88) {
			Class108_Sub2.aClass139_8.method10771(!local88, (byte) 78);
		}
		if (Class281.method26864(arg0, 1968874093) || arg0 == 14 || arg0 == 19) {
			Class279.aClass102_9.method20894();
		}
		client.anInt3433 = arg0 * -262743379;
	}

	@OriginalMember(owner = "client!uy", name = "t", descriptor = "(I)[Lclient!vy;")
	static Class628[] method32149(@OriginalArg(0) int arg0) {
		return new Class628[] { Class628.aClass628_3, Class628.aClass628_2, Class628.aClass628_4 };
	}

	@OriginalMember(owner = "client!uy", name = "<init>", descriptor = "()V")
	Class604() throws Throwable {
		throw new Error();
	}
}
