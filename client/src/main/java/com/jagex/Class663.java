package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Queue;

@OriginalClass("client!xk")
final class Class663 implements Interface73 {

	@OriginalMember(owner = "client!xk", name = "alf", descriptor = "(Lclient!yp;I)V")
	static void method33347(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(31) boolean local31 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class654.method33171(local13, local31, client.aBoolean734, -789526949);
	}

	@OriginalMember(owner = "client!xk", name = "atg", descriptor = "(Lclient!yp;B)V")
	static void method33348(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub4_1.method15896(2137729944) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!xk", name = "bcr", descriptor = "(Lclient!yp;B)V")
	static void method33349(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 100;
	}

	@OriginalMember(owner = "client!xk", name = "s", descriptor = "(Ljava/lang/CharSequence;I)J")
	public static long method33350(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!xk", name = "atx", descriptor = "(Lclient!yp;I)V")
	static void method33351(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16266(782904058);
	}

	@OriginalMember(owner = "client!xk", name = "f", descriptor = "(IIII)V")
	@Override
	public void method33341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class662.aQueue3;
		synchronized (Class662.aQueue3) {
			Class662.aQueue3.add(Class330.method27771(local3, local7, arg1, arg2, 1292421326));
		}
	}

	@OriginalMember(owner = "client!xk", name = "g", descriptor = "(III)V")
	@Override
	public void method33342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class662.aQueue3;
		synchronized (Class662.aQueue3) {
			Class662.aQueue3.add(Class330.method27771(local3, local7, arg1, arg2, 1121445478));
		}
	}

	@OriginalMember(owner = "client!xk", name = "t", descriptor = "(ZB)V")
	@Override
	public void method33346(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!xk", name = "e", descriptor = "(Z)V")
	@Override
	public void method33343(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xk", name = "u", descriptor = "(Z)V")
	@Override
	public void method33344(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xk", name = "l", descriptor = "(III)V")
	@Override
	public void method33345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class662.aQueue3;
		synchronized (Class662.aQueue3) {
			Class662.aQueue3.add(Class330.method27771(local3, local7, arg1, arg2, 1340866830));
		}
	}
}
