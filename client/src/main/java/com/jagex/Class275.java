package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!fu")
public final class Class275 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fu", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_3;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	final int anInt3925;

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "Z")
	final boolean aBoolean782;

	@OriginalMember(owner = "client!fu", name = "fr", descriptor = "(Lclient!yp;I)V")
	static void method26802(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2055944660);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class245.method26314(local16, local22, arg0, -2033805582);
	}

	@OriginalMember(owner = "client!fu", name = "uv", descriptor = "(Lclient!yp;B)V")
	static void method26803(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2113546591);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4115 * -337000325;
	}

	@OriginalMember(owner = "client!fu", name = "ago", descriptor = "(Lclient!yp;I)V")
	static void method26804(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class518.anIntArray466 == null || Class679.anInt5743 * 410636669 >= Class518.anIntArray466.length) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class518.anIntArray466[(Class679.anInt5743 += -182063147) * 410636669 - 1] & 0xFFFF;
		}
	}

	@OriginalMember(owner = "client!fu", name = "avq", descriptor = "(Lclient!yp;I)V")
	static void method26805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(II)Lclient!he;")
	public static Class310 method26806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class709.aClass310Array1[arg0 >> 16];
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(Ljava/lang/Iterable;Lclient!ald;S)V")
	public static void method26807(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) short arg2) {
		@Pc(3) int local3 = Class437.method29138(arg0, (short) 11086);
		arg1.pSmart1or2(local3);
		if (local3 == 0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
			arg1.data[arg1.pos * -1380987821 + local13] = 0;
		}
		@Pc(31) Iterator local31 = arg0.iterator();
		while (local31.hasNext()) {
			@Pc(38) Interface75 local38 = (Interface75) local31.next();
			@Pc(41) int local41 = local38.method37268();
			@Pc(45) int local45 = local41 / 8;
			arg1.data[local45 + arg1.pos * -1380987821] = (byte) (arg1.data[local45 + arg1.pos * -1380987821] | 0x1 << (local41 & 0x7));
		}
		arg1.pos += local3 * 1034180571;
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class275(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Packet arg1) {
		this.aClass284_3 = arg0;
		this.anInt3925 = arg1.g2() * -789858333;
		this.aBoolean782 = arg1.g1() == 1;
	}

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		arg0.method27150(this.anInt3925 * 108479947, this.aBoolean782, -554140552);
		arg0.method27140(this.anInt3925 * 108479947, -824646075).method27103((byte) -46);
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		arg0.method27150(this.anInt3925 * 108479947, this.aBoolean782, -362845705);
		arg0.method27140(this.anInt3925 * 108479947, 139328843).method27103((byte) -117);
	}
}
