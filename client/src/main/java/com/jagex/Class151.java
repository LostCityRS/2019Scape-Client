package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public abstract class Class151 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_22 = new Class243(20);

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_37;

	@OriginalMember(owner = "client!uo", name = "vo", descriptor = "(Lclient!yp;I)V")
	static void method14542(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2133816085);
		if (local16.aString184 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.aString184;
		}
	}

	@OriginalMember(owner = "client!uo", name = "ho", descriptor = "(IB)V")
	public static void method14543(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray21[local1] = false;
		}
		client.anInt3533 = 1672939165;
		client.anInt3491 = -1956883921;
		Class165_Sub13.anInt2172 = 0;
		Class147_Sub1.anInt1445 = 0;
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
		Class368.anInt4502 = arg0 * 1633189263;
		if (Class368.anInt4502 * -1583611537 != 3) {
			Class118.aLong34 = 0L;
		}
	}

	@OriginalMember(owner = "client!uo", name = "ud", descriptor = "(Lclient!yp;I)V")
	static void method14544(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2116794424);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4170 * -1707388971;
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class151(@OriginalArg(0) Class480 arg0) {
		this.aClass480_37 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "(I)V")
	final void method14534(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(II)V")
	final void method14535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26247(arg0, (byte) 72);
		}
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "()V")
	final void method14536() {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "(I)V")
	final void method14537(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26247(arg0, (byte) 24);
		}
	}

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "(I)V")
	final void method14538(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26247(arg0, (byte) 54);
		}
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	final void method14539(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "()V")
	final void method14540() {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
	final void method14541() {
		@Pc(3) Class243 local3 = this.aClass243_22;
		synchronized (this.aClass243_22) {
			this.aClass243_22.method26259((byte) 3);
		}
	}
}
