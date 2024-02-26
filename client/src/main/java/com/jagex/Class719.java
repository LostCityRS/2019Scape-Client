package com.jagex;

import java.util.Locale;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zv")
public final class Class719 implements Interface75 {

	@OriginalMember(owner = "client!zv", name = "o", descriptor = "I")
	public static final int anInt5828 = 7;

	@OriginalMember(owner = "client!zv", name = "t", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_4 = new Class719("EN", "en", "English", Class697.aClass697_4, 0, "GB");

	@OriginalMember(owner = "client!zv", name = "f", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_10 = new Class719("DE", "de", "German", Class697.aClass697_4, 1, "DE");

	@OriginalMember(owner = "client!zv", name = "e", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_9 = new Class719("FR", "fr", "French", Class697.aClass697_4, 2, "FR");

	@OriginalMember(owner = "client!zv", name = "u", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_5 = new Class719("PT", "pt", "Portuguese", Class697.aClass697_4, 3, "BR");

	@OriginalMember(owner = "client!zv", name = "l", descriptor = "Lclient!zv;")
	static final Class719 aClass719_6 = new Class719("NL", "nl", "Dutch", Class697.aClass697_5, 4, "NL");

	@OriginalMember(owner = "client!zv", name = "g", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_7 = new Class719("ES", "es", "Spanish", Class697.aClass697_5, 5, "ES");

	@OriginalMember(owner = "client!zv", name = "i", descriptor = "Lclient!zv;")
	public static final Class719 aClass719_8 = new Class719("ES_MX", "es-mx", "Spanish (Latin American)", Class697.aClass697_4, 6, "MX");

	@OriginalMember(owner = "client!zv", name = "k", descriptor = "[Lclient!zv;")
	static final Class719[] aClass719Array1;

	@OriginalMember(owner = "client!zv", name = "m", descriptor = "Ljava/lang/String;")
	final String aString245;

	@OriginalMember(owner = "client!zv", name = "j", descriptor = "Ljava/lang/String;")
	final String aString246;

	@OriginalMember(owner = "client!zv", name = "a", descriptor = "I")
	public final int anInt5827;

	@OriginalMember(owner = "client!zv", name = "s", descriptor = "Ljava/util/Locale;")
	final Locale aLocale1;

	static {
		@Pc(72) Class719[] local72 = method37282((byte) 14);
		aClass719Array1 = new Class719[local72.length];
		@Pc(78) Class719[] local78 = local72;
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			@Pc(88) Class719 local88 = local78[local80];
			if (aClass719Array1[local88.anInt5827 * 379080821] != null) {
				throw new IllegalStateException();
			}
			aClass719Array1[local88.anInt5827 * 379080821] = local88;
		}
	}

	@OriginalMember(owner = "client!zv", name = "w", descriptor = "(I)Lclient!zv;")
	public static Class719 method37270(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass719Array1.length ? aClass719Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!zv", name = "l", descriptor = "(IB)Lclient!zv;")
	public static Class719 method37272(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= 0 && arg0 < aClass719Array1.length ? aClass719Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!zv", name = "p", descriptor = "(I)I")
	public static int method37274(@OriginalArg(0) int arg0) {
		return Class669.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!zv", name = "m", descriptor = "()[Lclient!zv;")
	public static Class719[] method37275() {
		return new Class719[] { aClass719_10, aClass719_8, aClass719_4, aClass719_7, aClass719_6, aClass719_9, aClass719_5 };
	}

	@OriginalMember(owner = "client!zv", name = "o", descriptor = "()[Lclient!zv;")
	public static Class719[] method37278() {
		return new Class719[] { aClass719_10, aClass719_8, aClass719_4, aClass719_7, aClass719_6, aClass719_9, aClass719_5 };
	}

	@OriginalMember(owner = "client!zv", name = "j", descriptor = "()[Lclient!zv;")
	public static Class719[] method37279() {
		return new Class719[] { aClass719_10, aClass719_8, aClass719_4, aClass719_7, aClass719_6, aClass719_9, aClass719_5 };
	}

	@OriginalMember(owner = "client!zv", name = "a", descriptor = "()[Lclient!zv;")
	public static Class719[] method37280() {
		return new Class719[] { aClass719_10, aClass719_8, aClass719_4, aClass719_7, aClass719_6, aClass719_9, aClass719_5 };
	}

	@OriginalMember(owner = "client!zv", name = "t", descriptor = "(B)[Lclient!zv;")
	public static Class719[] method37282(@OriginalArg(0) byte arg0) {
		return new Class719[] { aClass719_10, aClass719_8, aClass719_4, aClass719_7, aClass719_6, aClass719_9, aClass719_5 };
	}

	@OriginalMember(owner = "client!zv", name = "r", descriptor = "(I)Lclient!zv;")
	public static Class719 method37284(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass719Array1.length ? aClass719Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!zv", name = "q", descriptor = "(I)Lclient!zv;")
	public static Class719 method37285(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass719Array1.length ? aClass719Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!zv", name = "js", descriptor = "(Lclient!yp;B)V")
	static void method37287(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!zv", name = "lo", descriptor = "(Lclient!yp;B)V")
	static void method37288(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class441.method29189(local11, arg0, 32768);
	}

	@OriginalMember(owner = "client!zv", name = "apy", descriptor = "(Lclient!yp;I)V")
	static void method37289(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class155.method15059(-1197685477);
	}

	@OriginalMember(owner = "client!zv", name = "bfr", descriptor = "(Lclient!yp;I)V")
	static void method37290(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= 1819398433;
		arg0.anInt5778 -= 1815275855;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!zv", name = "f", descriptor = "(I)V")
	public static void method37291(@OriginalArg(0) int arg0) {
		@Pc(1) Class40 local1 = null;
		try {
			local1 = Class3.method70("", client.aClass722_4.aString247, true, -1361589576);
			@Pc(12) Class80_Sub36 local12 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local1.method834(local12.aByteArray61, 0, local12.anInt3152 * -1380987821, (byte) 1);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method838(-155941895);
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!zv", name = "wf", descriptor = "(Lclient!yp;S)V")
	static void method37292(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= 1593803993;
	}

	@OriginalMember(owner = "client!zv", name = "axh", descriptor = "(Lclient!yp;I)V")
	static void method37293(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class315.method27502((byte) 24);
	}

	@OriginalMember(owner = "client!zv", name = "lg", descriptor = "(Lclient!yp;I)V")
	static void method37294(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class709.method37152(local11, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!zv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!yy;ILjava/lang/String;)V")
	Class719(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class697 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		this.aString245 = arg0;
		this.aString246 = arg1;
		this.anInt5827 = arg4 * -517537827;
		if (arg5 == null) {
			this.aLocale1 = new Locale(arg1.substring(0, 2));
		} else {
			this.aLocale1 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@OriginalMember(owner = "client!zv", name = "e", descriptor = "(I)Ljava/lang/String;")
	String method37271(@OriginalArg(0) int arg0) {
		return this.aString246;
	}

	@OriginalMember(owner = "client!zv", name = "u", descriptor = "(I)Ljava/util/Locale;")
	public Locale method37273(@OriginalArg(0) int arg0) {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!zv", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5827 * 379080821;
	}

	@OriginalMember(owner = "client!zv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.method37271(923593410).toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!zv", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5827 * 379080821;
	}

	@OriginalMember(owner = "client!zv", name = "x", descriptor = "()Ljava/util/Locale;")
	public Locale method37276() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!zv", name = "s", descriptor = "()Ljava/lang/String;")
	String method37277() {
		return this.aString246;
	}

	@OriginalMember(owner = "client!zv", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method37281() {
		return this.method37271(-1176511580).toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!zv", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5827 * 379080821;
	}

	@OriginalMember(owner = "client!zv", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method37283() {
		return this.method37271(-279858323).toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!zv", name = "k", descriptor = "()Ljava/lang/String;")
	String method37286() {
		return this.aString246;
	}
}
