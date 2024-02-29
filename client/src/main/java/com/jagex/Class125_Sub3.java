package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahs")
public class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!ahs", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ahs", name = "dv", descriptor = "Lclient!aly;")
	public static Class93_Sub42 aClass93_Sub42_1;

	@OriginalMember(owner = "client!ahs", name = "p", descriptor = "I")
	public final int anInt1127;

	@OriginalMember(owner = "client!ahs", name = "d", descriptor = "I")
	public final int anInt1126;

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIII)V", line = 10)
	Class125_Sub3(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1127 = arg9 * -1162526699;
		this.anInt1126 = arg10 * 166300301;
	}

	@OriginalMember(owner = "client!ahs", name = "e", descriptor = "(I)V", line = 13)
	static void method10060(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ahs", name = "f", descriptor = "(Lclient!alw;)Lclient!kp;", line = 16)
	public static Class125 method10061(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16727(arg0, -423624971);
		@Pc(7) int local7 = arg0.method22483(-118643075);
		@Pc(11) int local11 = arg0.method22483(-118643075);
		return new Class125_Sub3(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11);
	}

	@OriginalMember(owner = "client!ahs", name = "n", descriptor = "(S)Lclient!kt;", line = 23)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_2;
	}

	@OriginalMember(owner = "client!ahs", name = "l", descriptor = "()Lclient!kt;", line = 23)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_2;
	}

	@OriginalMember(owner = "client!ahs", name = "iv", descriptor = "(IIIIIII)V", line = 5613)
	static final void method10062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(4) Class149_Sub6 local4 = (Class149_Sub6) client.aClass21_6.method390((short) 8345); local4 != null; local4 = (Class149_Sub6) client.aClass21_6.method392(-1915563430)) {
			if (client.anInt3485 >= local4.anInt1473 * -2062413229) {
				local4.method23766(-719770481);
			} else {
				Class166_Sub11.method15594(local4.anInt1476 * -280800109, (local4.anInt1472 * -374049833 << 9) + 256, (local4.anInt1474 * -965608087 << 9) + 256, 0, local4.anInt1475 * 1432638006, false, false, -1885279070);
				Class118_Sub1.aClass106_3.method7530(local4.aString43, (int) ((float) arg0 + client.aFloatArray93[0]), (int) (client.aFloatArray93[1] + (float) arg1), local4.anInt1477 * -1204675145 | 0xFF000000, 0, 1357185837);
			}
		}
	}

	@OriginalMember(owner = "client!ahs", name = "ack", descriptor = "(Lclient!yf;I)V", line = 9956)
	static final void method10063(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26645((byte) 16).method36920();
	}
}
