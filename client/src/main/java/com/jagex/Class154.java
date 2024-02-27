package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xq")
public abstract class Class154 {

	@OriginalMember(owner = "client!xq", name = "f", descriptor = "Lclient!ej;")
	final Class243 aClass243_24 = new Class243(2);

	@OriginalMember(owner = "client!xq", name = "t", descriptor = "Lclient!pf;")
	Class480 aClass480_39;

	@OriginalMember(owner = "client!xq", name = "gl", descriptor = "(Lclient!yp;S)V")
	static void method14985(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2092382056);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class251.method26366(local16, local22, arg0, -743322597);
	}

	@OriginalMember(owner = "client!xq", name = "cn", descriptor = "(Lclient!yp;I)V")
	static void method14986(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 1994600274);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class299.method27024(local16, local22, arg0, 2133824118);
	}

	@OriginalMember(owner = "client!xq", name = "e", descriptor = "(B)V")
	static void method14987(@OriginalArg(0) byte arg0) {
		if (Class175.aClass102_8 != null) {
			Class175.aClass102_8.method20660(-622147877);
			Class175.aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!xq", name = "hq", descriptor = "(Lclient!yp;I)V")
	static void method14988(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, true, 0, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!xq", name = "aow", descriptor = "(Lclient!yp;B)V")
	static void method14989(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (BufferedSocket.aClass121_Sub1_2.method9607(-236604108) != Class340.aClass340_7 || BufferedSocket.aClass121_Sub1_2.method9702(1049874251) != Class347.aClass347_3) {
			throw new RuntimeException();
		}
		@Pc(20) Class463 local20 = ((Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-1562466019)).method10019(301301268);
		@Pc(27) Class463 local27 = ((Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(1616961231)).method16940(-1132458519);
		@Pc(30) Class463 local30 = Class463.method29472(local20);
		local30.method29486(local27);
		@Pc(40) float local40 = Class490.method30239(local30.aFloat297, local30.aFloat296, (byte) 52);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((double) local40 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!xq", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class154(@OriginalArg(0) Class480 arg0) {
		this.aClass480_39 = arg0;
	}

	@OriginalMember(owner = "client!xq", name = "e", descriptor = "(I)V")
	final void method14977(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!xq", name = "m", descriptor = "()V")
	final void method14978() {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!xq", name = "t", descriptor = "(S)V")
	final void method14979(@OriginalArg(0) short arg0) {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!xq", name = "u", descriptor = "()V")
	final void method14980() {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!xq", name = "l", descriptor = "()V")
	final void method14981() {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!xq", name = "g", descriptor = "()V")
	final void method14982() {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!xq", name = "i", descriptor = "(I)V")
	final void method14983(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26247(arg0, (byte) 93);
		}
	}

	@OriginalMember(owner = "client!xq", name = "f", descriptor = "(II)V")
	final void method14984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_24;
		synchronized (this.aClass243_24) {
			this.aClass243_24.method26247(arg0, (byte) 57);
		}
	}
}
