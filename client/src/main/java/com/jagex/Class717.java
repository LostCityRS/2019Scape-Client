package com.jagex;

import java.util.Locale;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zt")
public class Class717 implements Interface75 {

	@OriginalMember(owner = "client!zt", name = "z", descriptor = "I")
	public static final int anInt5962 = 7;

	@OriginalMember(owner = "client!zt", name = "dg", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!zt", name = "e", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_15 = new Class717("EN", "en", "English", Class693.aClass693_8, 0, "GB");

	@OriginalMember(owner = "client!zt", name = "n", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_16 = new Class717("DE", "de", "German", Class693.aClass693_8, 1, "DE");

	@OriginalMember(owner = "client!zt", name = "m", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_11 = new Class717("FR", "fr", "French", Class693.aClass693_8, 2, "FR");

	@OriginalMember(owner = "client!zt", name = "k", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_13 = new Class717("PT", "pt", "Portuguese", Class693.aClass693_8, 3, "BR");

	@OriginalMember(owner = "client!zt", name = "f", descriptor = "Lclient!zt;")
	static final Class717 aClass717_14 = new Class717("NL", "nl", "Dutch", Class693.aClass693_3, 4, "NL");

	@OriginalMember(owner = "client!zt", name = "w", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_12 = new Class717("ES", "es", "Spanish", Class693.aClass693_3, 5, "ES");

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "Lclient!zt;")
	public static final Class717 aClass717_10 = new Class717("ES_MX", "es-mx", "Spanish (Latin American)", Class693.aClass693_8, 6, "MX");

	@OriginalMember(owner = "client!zt", name = "r", descriptor = "[Lclient!zt;")
	static final Class717[] aClass717Array1;

	@OriginalMember(owner = "client!zt", name = "u", descriptor = "Ljava/lang/String;")
	final String aString245;

	@OriginalMember(owner = "client!zt", name = "p", descriptor = "Ljava/lang/String;")
	final String aString244;

	@OriginalMember(owner = "client!zt", name = "d", descriptor = "I")
	public final int anInt5963;

	@OriginalMember(owner = "client!zt", name = "c", descriptor = "Ljava/util/Locale;")
	final Locale aLocale1;

	static {
		@Pc(72) Class717[] local72 = method36881(65534);
		aClass717Array1 = new Class717[local72.length];
		@Pc(78) Class717[] local78 = local72;
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			@Pc(88) Class717 local88 = local78[local80];
			if (aClass717Array1[local88.anInt5963 * -1156137245] != null) {
				throw new IllegalStateException();
			}
			aClass717Array1[local88.anInt5963 * -1156137245] = local88;
		}
	}

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "()[Lclient!zt;", line = 42)
	public static Class717[] method36880() {
		return new Class717[] { aClass717_13, aClass717_14, aClass717_15, aClass717_16, aClass717_12, aClass717_10, aClass717_11 };
	}

	@OriginalMember(owner = "client!zt", name = "e", descriptor = "(I)[Lclient!zt;", line = 42)
	public static Class717[] method36881(@OriginalArg(0) int arg0) {
		return new Class717[] { aClass717_13, aClass717_14, aClass717_15, aClass717_16, aClass717_12, aClass717_10, aClass717_11 };
	}

	@OriginalMember(owner = "client!zt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!yu;ILjava/lang/String;)V", line = 45)
	Class717(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class693 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		this.aString245 = arg0;
		this.aString244 = arg1;
		this.anInt5963 = arg4 * -1170311477;
		if (arg5 == null) {
			this.aLocale1 = new Locale(arg1.substring(0, 2));
		} else {
			this.aLocale1 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@OriginalMember(owner = "client!zt", name = "c", descriptor = "()Ljava/lang/String;", line = 58)
	String method36882() {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "u", descriptor = "()Ljava/lang/String;", line = 58)
	String method36883() {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "d", descriptor = "()Ljava/lang/String;", line = 58)
	String method36884() {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "m", descriptor = "(B)Ljava/lang/String;", line = 58)
	String method36885(@OriginalArg(0) byte arg0) {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "z", descriptor = "()Ljava/lang/String;", line = 58)
	String method36886() {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "p", descriptor = "()Ljava/lang/String;", line = 58)
	String method36887() {
		return this.aString244;
	}

	@OriginalMember(owner = "client!zt", name = "n", descriptor = "()I", line = 62)
	@Override
	public int method36920() {
		return this.anInt5963 * -1156137245;
	}

	@OriginalMember(owner = "client!zt", name = "k", descriptor = "()I", line = 62)
	@Override
	public int method36919() {
		return this.anInt5963 * -1156137245;
	}

	@OriginalMember(owner = "client!zt", name = "f", descriptor = "(I)Ljava/util/Locale;", line = 66)
	public Locale method36888(@OriginalArg(0) int arg0) {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!zt", name = "r", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method36889() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!zt", name = "v", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method36890() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!zt", name = "w", descriptor = "(II)Lclient!zt;", line = 70)
	public static Class717 method36891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0 && arg0 < aClass717Array1.length ? aClass717Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!zt", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
	@Override
	public String toString() {
		return this.method36885((byte) -74).toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!zt", name = "rj", descriptor = "()Ljava/lang/String;", line = 75)
	public String method36892() {
		return this.method36885((byte) -15).toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!zt", name = "n", descriptor = "(Lclient!dn;FI)F", line = 91)
	static float method36893(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return 0.0F;
		}
		@Pc(10) float local10;
		if (arg1 == arg0.aFloat275) {
			local10 = 0.0F;
		} else if (arg1 == arg0.aFloat276) {
			local10 = 1.0F;
		} else {
			local10 = (arg1 - arg0.aFloat275) / (arg0.aFloat276 - arg0.aFloat275);
		}
		@Pc(35) float local35;
		if (arg0.aBoolean648) {
			local35 = local10;
		} else {
			@Pc(39) float[] local39 = new float[] { arg0.aFloatArray99[0] - local10, arg0.aFloatArray99[1], arg0.aFloatArray99[2], arg0.aFloatArray99[3] };
			@Pc(72) float[] local72 = new float[5];
			@Pc(82) int local82 = Class614.method32068(local39, 3, 0.0F, true, 1.0F, true, local72, (byte) -2);
			if (local82 == 1) {
				local35 = local72[0];
			} else {
				local35 = 0.0F;
			}
		}
		return arg0.aFloatArray97[0] + local35 * (arg0.aFloatArray97[1] + (local35 * arg0.aFloatArray97[3] + arg0.aFloatArray97[2]) * local35);
	}

	@OriginalMember(owner = "client!zt", name = "er", descriptor = "(I)Lclient!aks;", line = 947)
	public static Class93_Sub29 method36894(@OriginalArg(0) int arg0) {
		if (Class159_Sub1.aClass22_28 == null || Class159_Sub1.aClass20_1 == null) {
			return null;
		}
		for (@Pc(11) Class93_Sub29 local11 = (Class93_Sub29) Class159_Sub1.aClass20_1.next(); local11 != null; local11 = (Class93_Sub29) Class159_Sub1.aClass20_1.next()) {
			@Pc(22) Class322 local22 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local11.anInt1603 * 1208139441, 1622909317);
			if (local22 != null && local22.aBoolean711 && local22.method27252(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface23_2, -1868745929)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zt", name = "fu", descriptor = "(IIIZB)V", line = 2253)
	public static void method36895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		client.aLong244 = 0L;
		@Pc(4) int local4 = Class255.method26008(1589990040);
		if (arg0 == 3 || local4 == 3) {
			arg3 = true;
		}
		if (!Class694.aClass104_14.method20534()) {
			arg3 = true;
		}
		Class687.method33536(local4, arg0, arg1, arg2, arg3, (byte) -126);
	}

	@OriginalMember(owner = "client!zt", name = "uj", descriptor = "(Lclient!yf;S)V", line = 8619)
	static final void method36896(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1716955397);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4028 * -822913903;
	}

	@OriginalMember(owner = "client!zt", name = "uv", descriptor = "(Lclient!yf;I)V", line = 8643)
	static final void method36897(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 196555249);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3994 * -552008165;
	}
}
