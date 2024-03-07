package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqy")
public class Class125_Sub2_Sub1 extends Class125_Sub2 {

	@OriginalMember(owner = "client!aqy", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!aqy", name = "s", descriptor = "I")
	public final int anInt2993;

	@OriginalMember(owner = "client!aqy", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIIIIIIII)V", line = 9)
	Class125_Sub2_Sub1(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt2993 = arg15 * 1168436305;
	}

	@OriginalMember(owner = "client!aqy", name = "w", descriptor = "(Lclient!alw;)Lclient!kp;", line = 14)
	public static Class125 method21467(@OriginalArg(0) Packet arg0) {
		@Pc(4) Class125_Sub2 local4 = (Class125_Sub2) Class661.method32833(arg0, (byte) 98);
		@Pc(8) int local8 = arg0.g2s((byte) -67);
		return new Class125_Sub2_Sub1(local4.aClass390_7, local4.aClass392_7, local4.anInt2981 * 483768335, local4.anInt2982 * 2099407685, local4.anInt2983 * 1135283731, local4.anInt2980 * -1017655207, local4.anInt2985 * -1946839755, local4.anInt2986 * -1726029297, local4.anInt2984 * 291173831, local4.anInt2987 * -312428519, local4.anInt2988 * 813929059, local4.anInt2990 * -2031575365, local4.anInt2991 * 79921115, local4.anInt2989 * -143127169, local4.anInt2992 * 247837873, local8);
	}

	@OriginalMember(owner = "client!aqy", name = "n", descriptor = "(S)Lclient!kt;", line = 20)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_10;
	}

	@OriginalMember(owner = "client!aqy", name = "l", descriptor = "()Lclient!kt;", line = 20)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_10;
	}

	@OriginalMember(owner = "client!aqy", name = "z", descriptor = "(IIFI)I", line = 180)
	public static int method21468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		return Class260.method26154(arg0, arg1, (int) arg2, 445606420);
	}

	@OriginalMember(owner = "client!aqy", name = "aof", descriptor = "(Lclient!yf;B)V", line = 12531)
	static final void method21469(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_3 || Class65.aClass123_Sub1_2.method9020((byte) -67) != Class338.aClass338_4) {
			throw new RuntimeException();
		}
		@Pc(31) Class124_Sub1 local31 = (Class124_Sub1) Class65.aClass123_Sub1_2.method9011((byte) -26);
		@Pc(36) Class25_Sub5 local36 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9017(2027186504);
		@Pc(40) Class472 local40 = local31.method9181(1395049383);
		@Pc(43) Class472 local43 = Class472.method29537(local40);
		local43.aFloat318 += local12;
		@Pc(56) Class472 local56 = Class472.method29579(local36.method23124(-1978084374), local43);
		local56.method29564();
		@Pc(63) float local63 = local31.method9184(-899460710).method29593();
		Class492.method29982(local36.method23124(-2128573944), local56, local40, local63, Class687.aClass472Array3);
		@Pc(73) Class472 local73 = null;
		if (Class687.aClass472Array3[0] == null) {
			throw new RuntimeException("");
		}
		if (Class687.aClass472Array3[1] == null) {
			local73 = Class687.aClass472Array3[0];
		} else if (Class472.method29579(local36.method23124(-1846279988), Class687.aClass472Array3[0]).method29593() < Class472.method29579(local36.method23124(1810058240), Class687.aClass472Array3[1]).method29593()) {
			local73 = Class687.aClass472Array3[1];
		} else {
			local73 = Class687.aClass472Array3[0];
		}
		@Pc(133) float local133 = Class608.method31937(local40.aFloat317 - local73.aFloat317, local40.aFloat319 - local73.aFloat319, -2006917831);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) ((double) local133 * 2607.5945876176133D) & 0x3FFF;
	}
}
