package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acw")
public abstract class Class71 implements Interface3 {

	@OriginalMember(owner = "client!acw", name = "ix", descriptor = "Lclient!ql;")
	public static Class510 aClass510_2;

	@OriginalMember(owner = "client!acw", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_76;

	@OriginalMember(owner = "client!acw", name = "f", descriptor = "Lclient!ej;")
	Class243 aClass243_64;

	@OriginalMember(owner = "client!acw", name = "lk", descriptor = "(Lclient!alk;IIIIIIIIII)V")
	static void method18184(@OriginalArg(0) Class80_Sub40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (!method18185(arg1, null, (byte) 100)) {
			return;
		}
		if (arg0 == null || arg0.method23437((short) -7300)) {
			@Pc(21) Class310 local21 = Class709.aClass310Array1[arg1];
			client.method25325(local21, local21.method27455((byte) -78), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			Class80_Sub42.method15605(arg0, true, false, (byte) -60);
		}
	}

	@OriginalMember(owner = "client!acw", name = "l", descriptor = "(I[IB)Z")
	public static boolean method18185(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		if (Class285.aBooleanArray23[arg0]) {
			return true;
		}
		Class709.aClass310Array1[arg0] = Class411.method28963(arg0, arg1, Class709.aClass310Array1[arg0], false, 1096754142);
		if (Class709.aClass310Array1[arg0] == null) {
			return false;
		} else {
			Class285.aBooleanArray23[arg0] = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!acw", name = "<init>", descriptor = "(Lclient!pf;I)V")
	Class71(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		this.aClass480_76 = arg0;
		this.aClass243_64 = new Class243(arg1);
	}

	@OriginalMember(owner = "client!acw", name = "e", descriptor = "(IS)V")
	final void method18176(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26247(arg0, (byte) 69);
		}
	}

	@OriginalMember(owner = "client!acw", name = "t", descriptor = "(IB)V")
	final void method18177(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass243_64 = new Class243(arg0);
	}

	@OriginalMember(owner = "client!acw", name = "f", descriptor = "(I)V")
	final void method18178(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!acw", name = "m", descriptor = "()V")
	final void method18179() {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!acw", name = "u", descriptor = "(I)V")
	final void method18180(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!acw", name = "l", descriptor = "(I)V")
	final void method18181(@OriginalArg(0) int arg0) {
		this.aClass243_64 = new Class243(arg0);
	}

	@OriginalMember(owner = "client!acw", name = "g", descriptor = "()V")
	final void method18182() {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!acw", name = "i", descriptor = "(I)V")
	final void method18183(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_64;
		synchronized (this.aClass243_64) {
			this.aClass243_64.method26247(arg0, (byte) 124);
		}
	}
}
