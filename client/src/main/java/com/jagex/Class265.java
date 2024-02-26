package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class265 implements Interface26 {

	@OriginalMember(owner = "client!fi", name = "hu", descriptor = "Lclient!aop;")
	public static Class41_Sub12 aClass41_Sub12_3;

	@OriginalMember(owner = "client!fi", name = "ht", descriptor = "Lclient!aoo;")
	public static Class41_Sub11 aClass41_Sub11_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fi", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_2;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
	final int anInt3915;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	public static void method26647(@OriginalArg(0) int arg0) {
		@Pc(2) Queue local2 = Class662.aQueue3;
		synchronized (Class662.aQueue3) {
			while (true) {
				@Pc(7) Class80_Sub17_Sub2 local7 = (Class80_Sub17_Sub2) Class662.aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method23453(-454396966);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "nk", descriptor = "(Lclient!yp;I)V")
	static void method26648(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class656.method33222(local11, local14, arg0, -1502155304);
	}

	@OriginalMember(owner = "client!fi", name = "akb", descriptor = "(Lclient!yp;I)V")
	static void method26649(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class80_Sub18 local2 = Class174.method24636(1740536094);
		if (local2 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2.anInt1587 * 1945594581;
			@Pc(76) int local76 = local2.anInt1583 * 2119674109 << 28 | local2.anInt1582 * 652783051 + Class159.anInt1991 << 14 | Class159.anInt1996 + local2.anInt1584 * -1163867765;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local76;
		}
	}

	@OriginalMember(owner = "client!fi", name = "acj", descriptor = "(Lclient!yp;B)V")
	static void method26650(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.aClass378_3.aString203;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class265(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_2 = arg0;
		this.anInt3915 = arg1.method23178((byte) -84) * -1557270405;
	}

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class288 local9 = (Class288) arg0.method27131((byte) -22).get(this.anInt3915 * 887385779);
		arg0.method27173(this.anInt3915 * 887385779, -1012686345);
		local9.method26908((byte) -19);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		@Pc(9) Class288 local9 = (Class288) arg0.method27131((byte) -125).get(this.anInt3915 * 887385779);
		arg0.method27173(this.anInt3915 * 887385779, -1012686345);
		local9.method26908((byte) 10);
	}
}
