package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public class Class384 implements Interface33 {

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!kj;")
	final Class381 aClass381_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!kj;)V", line = 11)
	Class384(@OriginalArg(0) Class381 arg0) {
		this.aClass381_1 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "(ZI)V", line = 16)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			Class694.aClass104_14.method20721(0, 0, Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, this.aClass381_1.anInt4624 * -25521439, 0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "(Z)V", line = 16)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class694.aClass104_14.method20721(0, 0, Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, this.aClass381_1.anInt4624 * -25521439, 0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(Z)V", line = 16)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class694.aClass104_14.method20721(0, 0, Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, this.aClass381_1.anInt4624 * -25521439, 0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V", line = 19)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "()V", line = 19)
	@Override
	public void method28284() {
	}

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "()V", line = 19)
	@Override
	public void method28283() {
	}

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "()Z", line = 22)
	@Override
	public boolean method28278() {
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "(I)Z", line = 22)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "(Ljava/lang/Iterable;I)I", line = 62)
	static int method28154(@OriginalArg(0) Iterable arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method36920() > local1) {
				local1 = local11.method36920();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)I", line = 83)
	public static int method28155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1_Sub15 local5 = (Class93_Sub1_Sub15) Class329.aClass16_29.method214((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass93_Sub1_68 == Class329.aClass18_15.aClass93_Sub1_4) {
			return -1;
		} else {
			return -565994431 * ((Class93_Sub1_Sub15) local5.aClass93_Sub1_68).anInt3090;
		}
	}

	@OriginalMember(owner = "client!ko", name = "ez", descriptor = "(Lclient!abd;ZIZZI)Lclient!py;", line = 1995)
	public static Class497 method28156(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Class569.aClass143_Sub1Array2 == null) {
			Class569.aClass143_Sub1Array2 = new Class143_Sub1[Class121.method8704(1191218098)];
			Class14.aMap1 = new HashMap();
		}
		@Pc(12) Class593 local12 = null;
		@Pc(16) int local16 = arg0.method631(1046065260);
		if (client.aClass42_5 != null && !Class672.aBoolean869) {
			local12 = new Class593(local16, client.aClass42_5, Class623.aClass42Array1[local16], local16 == Class31.aClass31_4.method631(2121481338) ? 8000000 : 2500000);
		}
		Class569.aClass143_Sub1Array2[local16] = Class275.aClass496_1.method30034(local16, local12, Class239.aClass593_4, arg0.method633(16777215), (byte) 45);
		if (arg4) {
			Class569.aClass143_Sub1Array2[local16].method11093(1295519385);
		}
		@Pc(65) Class497 local65 = new Class497(Class569.aClass143_Sub1Array2[local16], arg1, arg2);
		Class14.aMap1.put(arg0, local65);
		return local65;
	}

	@OriginalMember(owner = "client!ko", name = "awp", descriptor = "(Lclient!yf;I)V", line = 13589)
	static final void method28157(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(14) boolean local14 = true;
		if (local12 < 0) {
			local14 = (local12 + 1) % 4 == 0;
		} else if (local12 < 1582) {
			local14 = local12 % 4 == 0;
		} else if (local12 % 4 != 0) {
			local14 = false;
		} else if (local12 % 100 != 0) {
			local14 = true;
		} else if (local12 % 400 != 0) {
			local14 = false;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local14 ? 1 : 0;
	}
}
