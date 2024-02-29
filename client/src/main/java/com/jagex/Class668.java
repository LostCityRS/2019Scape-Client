package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xr")
final class Class668 implements Interface73 {

	@OriginalMember(owner = "client!xr", name = "hf", descriptor = "Lclient!aoq;")
	public static Class32_Sub15 aClass32_Sub15_1;

	@OriginalMember(owner = "client!xr", name = "m", descriptor = "(Z)V", line = 42)
	@Override
	public void method32926(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xr", name = "e", descriptor = "(ZI)V", line = 42)
	@Override
	public void method32927(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!xr", name = "k", descriptor = "(Z)V", line = 42)
	@Override
	public void method32929(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xr", name = "f", descriptor = "(Z)V", line = 42)
	@Override
	public void method32930(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xr", name = "n", descriptor = "(IIII)V", line = 45)
	@Override
	public void method32928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class655.aQueue3;
		synchronized (Class655.aQueue3) {
			Class655.aQueue3.add(Class149_Sub5.method12720(local3, local7, arg1, arg2, (byte) 87));
		}
	}

	@OriginalMember(owner = "client!xr", name = "w", descriptor = "(III)V", line = 45)
	@Override
	public void method32931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class655.aQueue3;
		synchronized (Class655.aQueue3) {
			Class655.aQueue3.add(Class149_Sub5.method12720(local3, local7, arg1, arg2, (byte) 58));
		}
	}

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "(III)V", line = 45)
	@Override
	public void method32932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class655.aQueue3;
		synchronized (Class655.aQueue3) {
			Class655.aQueue3.add(Class149_Sub5.method12720(local3, local7, arg1, arg2, (byte) 75));
		}
	}

	@OriginalMember(owner = "client!xr", name = "xw", descriptor = "(Lclient!yf;S)V", line = 9122)
	static final void method32933(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20024(1927066028).method32027((short) 448);
	}

	@OriginalMember(owner = "client!xr", name = "aic", descriptor = "(Lclient!yf;I)V", line = 11330)
	static final void method32934(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30267(local13, (byte) 30).aCharArray4[local23];
	}
}
