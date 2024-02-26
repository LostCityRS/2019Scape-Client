package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aft")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!aft", name = "pk", descriptor = "I")
	public static int anInt864;

	@OriginalMember(owner = "client!aft", name = "ro", descriptor = "I")
	static int anInt865;

	@OriginalMember(owner = "client!aft", name = "g", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!aft", name = "u", descriptor = "(Ljava/lang/String;B)V")
	static void method7197(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		System.out.println("Error: " + Class80_Sub40_Sub2.method22974(arg0, "%0a", "\n", (byte) -127));
	}

	@OriginalMember(owner = "client!aft", name = "<init>", descriptor = "(Lclient!qt;I)V")
	Class107_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aft", name = "m", descriptor = "(Lclient!ald;I)V")
	@Override
	void method7187(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class292 local6 = (Class292) Class80_Sub39.method15030(Class261.method26500(1193057497), arg1, -1170148496);
		if (Class292.aClass292_10 == local6) {
			this.anInt863 = arg0.g2() * 1383237743;
		}
	}

	@OriginalMember(owner = "client!aft", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!aft", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!aft", name = "o", descriptor = "(Lclient!ald;I)V")
	@Override
	void method7188(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class292 local6 = (Class292) Class80_Sub39.method15030(Class261.method26500(1193057497), arg1, -435001969);
		if (Class292.aClass292_10 == local6) {
			this.anInt863 = arg0.g2() * 1383237743;
		}
	}

	@OriginalMember(owner = "client!aft", name = "l", descriptor = "(Lclient!ald;IB)V")
	@Override
	void method7186(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(6) Class292 local6 = (Class292) Class80_Sub39.method15030(Class261.method26500(1193057497), arg1, -799877529);
		if (Class292.aClass292_10 == local6) {
			this.anInt863 = arg0.g2() * 1383237743;
		}
	}
}
