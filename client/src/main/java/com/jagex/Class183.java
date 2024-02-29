package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public class Class183 implements Interface18 {

	@OriginalMember(owner = "client!bf", name = "al", descriptor = "[I")
	static int[] anIntArray293;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "[I")
	final int[] anIntArray292;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	final int anInt3331;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	final int anInt3332;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V", line = 11)
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, new int[arg1 * arg0]);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II[I)V", line = 14)
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt3332 = arg0 * -1415554075;
		this.anInt3331 = arg1 * -4857121;
		this.anIntArray292 = arg2;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()I", line = 21)
	@Override
	public int method30889() {
		return this.anInt3332 * -774739475;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()I", line = 21)
	@Override
	public int method30886() {
		return this.anInt3332 * -774739475;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()I", line = 21)
	@Override
	public int method30890() {
		return this.anInt3332 * -774739475;
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "()I", line = 25)
	@Override
	public int method30888() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "()I", line = 25)
	@Override
	public int method30887() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method30891() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "()V", line = 28)
	@Override
	public void method30884() {
	}

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "()V", line = 28)
	@Override
	public void method30885() {
	}

	@OriginalMember(owner = "client!bf", name = "fn", descriptor = "(I)V", line = 2395)
	static void method24573(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = client.anInt3408 * -1378711501;
		@Pc(7) int local7 = client.anInt3416 * 2091353777;
		if (client.anInt3413 * -108363597 < local3) {
			local3 = client.anInt3413 * -108363597;
		}
		if (Class504.anInt5201 * 2090134413 < local7) {
			local7 = Class504.anInt5201 * 2090134413;
		}
		try {
			if (Class51.aClass93_Sub36_1 != null) {
				Class447.aClass447_4.method28910(new Object[] { local3, local7, Class255.method26008(1796947708), Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15870(-509783612) }, -1473067086);
			}
		} catch (@Pc(59) Throwable local59) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "iq", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6472)
	static final void method24574(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aString167 = null;
		arg0.aClass310_7 = null;
	}

	@OriginalMember(owner = "client!bf", name = "pk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7735)
	static final void method24575(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30149(local13, arg2, 1706007643);
	}

	@OriginalMember(owner = "client!bf", name = "ani", descriptor = "(Lclient!yf;B)V", line = 12400)
	static final void method24576(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class295.method26602(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3, 1744525210);
	}

	@OriginalMember(owner = "client!bf", name = "aup", descriptor = "(Lclient!yf;I)V", line = 13381)
	static final void method24577(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16536(396043493) == 1 ? 1 : 0;
	}
}
