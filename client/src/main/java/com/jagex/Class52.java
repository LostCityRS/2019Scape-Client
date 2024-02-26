package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class52 {

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
	static final int anInt195 = 1;

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
	static final int anInt198 = 32768;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
	public int anInt196 = 0;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
	public int anInt197 = 0;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Lclient!ej;")
	final Class243 aClass243_3 = new Class243(64);

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "Lclient!xf;")
	Interface71 anInterface71_1 = null;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_6;

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_5;

	@OriginalMember(owner = "client!aca", name = "fb", descriptor = "(I)Lclient!ad;")
	public static Class75 method1074(@OriginalArg(0) int arg0) {
		return Class301.method27043(client.anInt3433 * 1994758437, (byte) 2) || client.anInt3433 * 1994758437 == 0 ? client.aClass75_2 : client.aClass75_1;
	}

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!zv;Lclient!pf;Lclient!pf;Lclient!xf;)V")
	public Class52(@OriginalArg(0) Class719 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Interface71 arg3) {
		this.aClass480_6 = arg1;
		this.aClass480_5 = arg2;
		this.anInterface71_1 = arg3;
		if (this.aClass480_6 != null) {
			this.anInt196 = this.aClass480_6.method29929(1, -561697017) * 992536697;
		}
		if (this.aClass480_5 != null) {
			this.anInt197 = this.aClass480_5.method29929(1, -561697017) * -21508637;
		}
	}

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	String method1069(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method29162(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	String method1070(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method29162(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	String method1071(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method29162(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)Lclient!asu;")
	public Class80_Sub1_Sub19 method1072(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub19 local6 = (Class80_Sub1_Sub19) this.aClass243_3.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass480_5.method29918(1, arg0 & 0x7FFF, 1896589581);
		} else {
			local23 = this.aClass480_6.method29918(1, arg0, 1896589581);
		}
		local6 = new Class80_Sub1_Sub19();
		local6.aClass52_1 = this;
		if (local23 != null) {
			local6.method23048(new Class80_Sub36(local23), (byte) 16);
		}
		if (arg0 >= 32768) {
			local6.method23060((byte) -39);
		}
		this.aClass243_3.method26253(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "(II)Lclient!asu;")
	public Class80_Sub1_Sub19 method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class80_Sub1_Sub19 local6 = (Class80_Sub1_Sub19) this.aClass243_3.method26282((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 >= 32768) {
			local23 = this.aClass480_5.method29918(1, arg0 & 0x7FFF, 1896589581);
		} else {
			local23 = this.aClass480_6.method29918(1, arg0, 1896589581);
		}
		local6 = new Class80_Sub1_Sub19();
		local6.aClass52_1 = this;
		if (local23 != null) {
			local6.method23048(new Class80_Sub36(local23), (byte) 16);
		}
		if (arg0 >= 32768) {
			local6.method23060((byte) -53);
		}
		this.aClass243_3.method26253(local6, (long) arg0);
		return local6;
	}
}
