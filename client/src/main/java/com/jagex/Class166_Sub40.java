package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anr")
public class Class166_Sub40 extends Class166 {

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "I")
	public static final int anInt2333 = 1;

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "I")
	public static final int anInt2334 = 4;

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "I")
	public static final int anInt2335 = 2;

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "I")
	public static final int anInt2336 = 3;

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "I")
	public static final int anInt2337 = 0;

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(Lclient!ali;)V", line = 14)
	public Class166_Sub40(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anr", name = "<init>", descriptor = "(ILclient!ali;)V", line = 18)
	public Class166_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anr", name = "o", descriptor = "(I)V", line = 22)
	public void method16361(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) 14) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "y", descriptor = "()V", line = 22)
	public void method16362() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -127) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "q", descriptor = "()V", line = 22)
	public void method16363() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 4) {
			this.anInt2379 = this.method16545((byte) -105) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anr", name = "e", descriptor = "(B)I", line = 26)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "u", descriptor = "()I", line = 26)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "l", descriptor = "()I", line = 26)
	@Override
	int method16549() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16552() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "f", descriptor = "()I", line = 26)
	@Override
	int method16544() {
		return 0;
	}

	@OriginalMember(owner = "client!anr", name = "n", descriptor = "(II)I", line = 30)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "p", descriptor = "(I)I", line = 30)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anr", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "c", descriptor = "(I)V", line = 34)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "k", descriptor = "(II)V", line = 34)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anr", name = "s", descriptor = "(I)I", line = 38)
	public int method16364(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anr", name = "x", descriptor = "()I", line = 38)
	public int method16365() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anr", name = "z", descriptor = "(Lclient!yf;I)V", line = 47)
	static void method16366(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2], 2107005754)).method27605(Class624.aClass120_1, arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], (byte) 121) ? 1 : 0;
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!anr", name = "ahg", descriptor = "(Lclient!yf;I)V", line = 10921)
	static final void method16367(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5888 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		arg0.anInt5891 -= -1915563430;
		@Pc(39) int local39 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(49) int local49 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local25 == null) {
			local25 = "";
		}
		if (local25.length() > 80) {
			local25 = local25.substring(0, 80);
		}
		@Pc(66) Class175 local66 = Class330.method27371(-1643987676);
		@Pc(72) ClientMessage local72 = Class102.createGameMessage(ClientProt.aClientProt_77, local66.clientIsaac, (byte) 102);
		local72.packet.p1(Packet.pjstrlen(local14, -1905129874) + 2 + Packet.pjstrlen(local25, -1698593716), (byte) -60);
		local72.packet.pjstr(local14, 964893669);
		local72.packet.p1(local39 - 1, (byte) -121);
		local72.packet.p1(local49, (byte) -66);
		local72.packet.pjstr(local25, -1781436268);
		local66.send(local72, -1553810752);
	}

	@OriginalMember(owner = "client!anr", name = "kr", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 11824)
	static final String[] method16368(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String[] local2 = new String[5];
		for (@Pc(4) int local4 = 0; local4 < 5; local4++) {
			local2[local4] = local4 + " ";
			if (arg0 != null && arg0[local4] != null) {
				local2[local4] = local2[local4] + arg0[local4];
			}
		}
		return local2;
	}
}
