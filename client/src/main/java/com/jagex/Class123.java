package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public abstract class Class123 {

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[[Z")
	static boolean[][] aBooleanArrayArray17;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "Lclient!jw;")
	final Class121 aClass121_13;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(Lclient!yp;I)V")
	static void method20524(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], 918818335)).anIntArray425[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]];
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!kl", name = "ju", descriptor = "(Lclient!yp;I)V")
	static void method20525(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!kl", name = "nr", descriptor = "(Lclient!yp;I)V")
	static void method20526(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2046475158);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class491.method30257(local16, local22, arg0, 1318103104);
	}

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(IB)V")
	public static void method20527(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class285.aBooleanArray23[arg0] = false;
		Class97.method2117(arg0, (byte) 26);
	}

	@OriginalMember(owner = "client!kl", name = "av", descriptor = "(IIIII)V")
	static void method20528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!jw;)V")
	Class123(@OriginalArg(0) Class121 arg0) {
		this.aClass121_13 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "(F[[[ILclient!qc;II)V")
	public abstract void method20498(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "(F[[[ILclient!qc;IIS)V")
	public abstract void method20499(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5);

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
	public abstract boolean method20500(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "()F")
	public abstract float method20501();

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "(I)[D")
	public abstract double[] method20502(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "()[D")
	public abstract double[] method20503();

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(B)F")
	public abstract float method20504(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "()Lclient!on;")
	public abstract Class463 method20505();

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(Lclient!ald;I)V")
	public abstract void method20506(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "()Lclient!akx;")
	public abstract Class80_Sub33 method20507();

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "(F[[[ILclient!qc;II)V")
	public abstract void method20508(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[[[ILclient!qc;II)V")
	public abstract void method20509(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class502 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "()Z")
	public abstract boolean method20510();

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "()Z")
	public abstract boolean method20511();

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "()Lclient!on;")
	public abstract Class463 method20512();

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "()Lclient!on;")
	public abstract Class463 method20513();

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()[D")
	public abstract double[] method20514();

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "()[D")
	public abstract double[] method20515();

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Lclient!on;")
	public abstract Class463 method20516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "(Lclient!ald;)V")
	public abstract void method20517(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "(Lclient!jl;IIB)V")
	public abstract void method20518(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "(B)Lclient!akx;")
	public abstract Class80_Sub33 method20519(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "()[D")
	public abstract double[] method20520();

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "(Lclient!ald;)V")
	public abstract void method20521(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(Lclient!ald;)V")
	public abstract void method20522(@OriginalArg(0) Packet arg0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!jl;II)V")
	public abstract void method20523(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
