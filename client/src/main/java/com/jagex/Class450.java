package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!nw")
public final class Class450 implements Interface47 {

	@OriginalMember(owner = "client!nw", name = "bz", descriptor = "Ljava/lang/String;")
	public static String aString209;

	@OriginalMember(owner = "client!nw", name = "iu", descriptor = "Lclient!we;")
	public static Class634 aClass634_1;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_84 = new Class243(64);

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "Lclient!pf;")
	Class480 aClass480_115;

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "(IIII)I")
	public static int method29276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nw", name = "px", descriptor = "(Lclient!yp;I)V")
	static void method29277(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2063390115);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class114.method8626(local16, local22, arg0, -794660520);
	}

	@OriginalMember(owner = "client!nw", name = "ja", descriptor = "(IB)V")
	static void method29278(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		client.anInt3457 = 0;
		client.anInt3438 = 0;
		client.anInt3456 += -1610843457;
		Class125_Sub3.method10220(660204220);
		Class438.method29146(arg0, 727262167);
		Class125.method20591(580519923);
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < client.anInt3457 * 381176219; local18++) {
			local27 = client.anIntArray311[local18];
			@Pc(33) Class80_Sub19 local33 = (Class80_Sub19) client.aClass24_18.method560((long) local27);
			@Pc(37) Class120_Sub1_Sub1_Sub1_Sub1 local37 = (Class120_Sub1_Sub1_Sub1_Sub1) local33.anObject5;
			if (local37.anInt2694 * -305631289 != client.anInt3456 * -2099514049) {
				if (Class630.aBoolean955 && Class249.method26353(local27, 2044910164)) {
					Class392.method28680(1305557302);
				}
				if (local37.aClass335_1.method27835((byte) 45)) {
					Class599.method32051(local37, (short) 30336);
				}
				local37.method18794(null, 349389412);
				local33.method24395((byte) 91);
				local16 = true;
			}
		}
		if (local16) {
			local18 = client.anInt3452 * -340916049;
			client.anInt3452 = client.aClass24_18.method572(-1644373850) * -382054833;
			local27 = 0;
			@Pc(89) Iterator local89 = client.aClass24_18.iterator();
			while (local89.hasNext()) {
				@Pc(96) Class80_Sub19 local96 = (Class80_Sub19) local89.next();
				client.aClass80_Sub19Array1[local27++] = local96;
			}
			for (@Pc(106) int local106 = client.anInt3452 * -340916049; local106 < local18; local106++) {
				client.aClass80_Sub19Array1[local106] = null;
			}
			@Pc(119) Class340 local119 = BufferedSocket.aClass121_Sub1_2.method9607(-1618822953);
			if (Class340.aClass340_7 == local119) {
				@Pc(127) Class123_Sub3 local127 = (Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-2130710922);
				local127.method10000((byte) 105);
			}
			@Pc(134) Class347 local134 = BufferedSocket.aClass121_Sub1_2.method9702(1200302453);
			if (Class347.aClass347_3 == local134) {
				@Pc(142) Class20_Sub5 local142 = (Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(1738323543);
				local142.method16939(120598405);
			}
		}
		if (client.aClass75_1.aPacketBit_1.pos * -1380987821 != client.aClass75_1.anInt248 * 460106407) {
			throw new RuntimeException(client.aClass75_1.aPacketBit_1.pos * -1380987821 + " " + client.aClass75_1.anInt248 * 460106407);
		}
		for (local18 = 0; local18 < client.anInt3453 * -1702559601; local18++) {
			if (client.aClass24_18.method560((long) client.anIntArray304[local18]) == null) {
				throw new RuntimeException(local18 + " " + client.anInt3453 * -1702559601);
			}
		}
		if (client.anInt3452 * -340916049 - client.anInt3453 * -1702559601 != 0) {
			throw new RuntimeException("" + (client.anInt3452 * -340916049 - client.anInt3453 * -1702559601));
		}
		for (local18 = 0; local18 < client.anInt3452 * -340916049; local18++) {
			if (((Class120_Sub1_Sub1_Sub1) client.aClass80_Sub19Array1[local18].anObject5).anInt2694 * -305631289 != client.anInt3456 * -2099514049) {
				throw new RuntimeException("" + ((Class120_Sub1_Sub1_Sub1) client.aClass80_Sub19Array1[local18].anObject5).anInt2671 * 1078276675);
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "kh", descriptor = "(B)V")
	public static void method29279(@OriginalArg(0) byte arg0) {
		if (!client.aBoolean728) {
			return;
		}
		@Pc(11) Class327 local11 = Class369.method28340(Class86.anInt284 * 531357219, client.anInt3526 * 1831183447, -1263424433);
		if (local11 != null && local11.anObjectArray21 != null) {
			@Pc(22) Class80_Sub42 local22 = new Class80_Sub42();
			local22.aClass327_3 = local11;
			local22.anObjectArray4 = local11.anObjectArray21;
			Class279.method26847(local22, 373632152);
		}
		client.anInt3502 = -847777085;
		client.anInt3527 = -64361481;
		client.aBoolean728 = false;
		if (local11 != null) {
			Class296.method26998(local11, -828972754);
		}
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class450(@OriginalArg(0) Class480 arg0) {
		this.aClass480_115 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "(I)V")
	public void method29272(@OriginalArg(0) int arg0) {
		this.aClass243_84.method26256(1693912082);
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)Lclient!nl;")
	@Override
	public synchronized Class441 method29271(@OriginalArg(0) int arg0) {
		@Pc(6) Class441 local6 = (Class441) this.aClass243_84.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_115.method29918(0, arg0, 1896589581);
		local6 = new Class441();
		if (local18 != null) {
			local6.method29173(new Packet(local18), -671688375);
		}
		local6.method29182((byte) 110);
		this.aClass243_84.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "()V")
	public void method29273() {
		this.aClass243_84.method26256(1693912082);
	}

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "(II)Lclient!nl;")
	@Override
	public synchronized Class441 method29270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class441 local6 = (Class441) this.aClass243_84.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass480_115.method29918(0, arg0, 1896589581);
		local6 = new Class441();
		if (local18 != null) {
			local6.method29173(new Packet(local18), -1687761399);
		}
		local6.method29182((byte) 108);
		this.aClass243_84.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "()V")
	public void method29274() {
		this.aClass243_84.method26256(1693912082);
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "()V")
	public void method29275() {
		this.aClass243_84.method26256(1693912082);
	}
}
