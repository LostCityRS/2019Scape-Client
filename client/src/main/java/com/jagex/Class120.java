package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public class Class120 implements Interface23, Interface21, Interface71 {

	@OriginalMember(owner = "client!ah", name = "dh", descriptor = "Lclient!q;")
	public static Class499 userLastLoginHost;

	@OriginalMember(owner = "client!ah", name = "us", descriptor = "J")
	static long aLong32;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lclient!xz;")
	final Class675[] aClass675Array1;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!wu;")
	public final Class647 vars;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!adj;")
	final Class79_Sub1_Sub1 aClass79_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!aor;")
	final Class32_Sub16 aClass32_Sub16_2;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!adj;Lclient!aor;I)V", line = 21)
	public Class120(@OriginalArg(0) Class79_Sub1_Sub1 arg0, @OriginalArg(1) Class32_Sub16 arg1, @OriginalArg(2) int arg2) {
		this.aClass675Array1 = new Class675[arg2];
		this.vars = new Class647();
		this.aClass79_Sub1_Sub1_2 = arg0;
		this.aClass32_Sub16_2 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(IB)I", line = 29)
	public int method8655(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass675Array1[arg0].method33138(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) 11);
	}

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "(I)I", line = 29)
	public int method8656(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33138(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) -15);
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)I", line = 29)
	public int method8657(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33138(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) 14);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)I", line = 29)
	public int method8658(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33138(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) -47);
	}

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "(I)I", line = 33)
	public int method8659(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33155((byte) 17);
	}

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "(I)I", line = 33)
	public int method8660(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33155((byte) 22);
	}

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "(I)I", line = 33)
	public int method8661(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33155((byte) 121);
	}

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "(II)I", line = 33)
	public int method8662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass675Array1[arg0].method33155((byte) 125);
	}

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "(II)I", line = 37)
	@Override
	public int method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass675Array1[arg0].method33151(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) 72);
	}

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "(I)I", line = 37)
	@Override
	public int method8652(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33151(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) 12);
	}

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "(I)I", line = 37)
	@Override
	public int method8653(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33151(client.mapMember ? Class718.aClass718_1 : Class718.aClass718_2, (byte) 57);
	}

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "(II)I", line = 41)
	public int method8663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass675Array1[arg0].method33137(-303190539);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)I", line = 41)
	public int method8664(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33137(-77060111);
	}

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "(I)I", line = 41)
	public int method8665(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33137(-737983163);
	}

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "(I)I", line = 41)
	public int method8666(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33137(-688939384);
	}

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(IB)I", line = 45)
	public int method8667(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass675Array1[arg0].method33145(1140995892);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I", line = 45)
	public int method8668(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33145(-115349822);
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)I", line = 45)
	public int method8669(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33145(1429391622);
	}

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)I", line = 45)
	public int method8670(@OriginalArg(0) int arg0) {
		return this.aClass675Array1[arg0].method33145(780545188);
	}

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "(Lclient!nb;Lclient!np;I)V", line = 46)
	public static void method8671(@OriginalArg(0) Interface46 arg0, @OriginalArg(1) Interface47 arg1, @OriginalArg(2) int arg2) {
		Class663.anInt5830 = 0;
		Class663.anInt5834 = 0;
		Class701.aList26 = new LinkedList();
		Class663.aClass149_Sub4_Sub1_Sub1Array1 = new Class149_Sub4_Sub1_Sub1[1024];
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[Class663.anInt5837 * 763077233] + 1];
		Class663.anInt5832 = 0;
		Class663.anInt5831 = 0;
		Class110_Sub15_Sub2.anInterface47_1 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 49)
	@Override
	public Class108 method27955(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return Class138.aClass138_65 == arg0 ? (Class108) this.aClass79_Sub1_Sub1_2.get(arg1, 1568859277) : null;
	}

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 49)
	@Override
	public Class108 method27952(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return Class138.aClass138_65 == arg0 ? (Class108) this.aClass79_Sub1_Sub1_2.get(arg1, -937357950) : null;
	}

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "(Lclient!qe;II)Lclient!ec;", line = 49)
	@Override
	public Class108 method27954(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class138.aClass138_65 == arg0 ? (Class108) this.aClass79_Sub1_Sub1_2.get(arg1, -1007474932) : null;
	}

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "(Lclient!qe;I)Lclient!ec;", line = 49)
	@Override
	public Class108 method27956(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return Class138.aClass138_65 == arg0 ? (Class108) this.aClass79_Sub1_Sub1_2.get(arg1, 1374713298) : null;
	}

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "(IB)Lclient!kh;", line = 54)
	@Override
	public Class379 method27953(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class379 local6 = (Class379) this.aClass32_Sub16_2.get(arg0, -1929021210);
		return Class138.aClass138_65 == local6.aClass108_1.aClass138_6 ? local6 : null;
	}

	@OriginalMember(owner = "client!ah", name = "ae", descriptor = "(I)Lclient!kh;", line = 54)
	@Override
	public Class379 method27957(@OriginalArg(0) int arg0) {
		@Pc(6) Class379 local6 = (Class379) this.aClass32_Sub16_2.get(arg0, 266305644);
		return Class138.aClass138_65 == local6.aClass108_1.aClass138_6 ? local6 : null;
	}

	@OriginalMember(owner = "client!ah", name = "ag", descriptor = "(I)Lclient!kh;", line = 54)
	@Override
	public Class379 method27958(@OriginalArg(0) int arg0) {
		@Pc(6) Class379 local6 = (Class379) this.aClass32_Sub16_2.get(arg0, -44947171);
		return Class138.aClass138_65 == local6.aClass108_1.aClass138_6 ? local6 : null;
	}

	@OriginalMember(owner = "client!ah", name = "ac", descriptor = "(Lclient!ec;)I", line = 60)
	@Override
	public int method33458(@OriginalArg(0) Class108 arg0) {
		return this.vars.method33455(arg0, 924022621);
	}

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "(Lclient!ec;I)I", line = 60)
	@Override
	public int method33455(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.vars.method33455(arg0, -1665549357);
	}

	@OriginalMember(owner = "client!ah", name = "al", descriptor = "(Lclient!ec;)I", line = 60)
	@Override
	public int method33457(@OriginalArg(0) Class108 arg0) {
		return this.vars.method33455(arg0, -1176593209);
	}

	@OriginalMember(owner = "client!ah", name = "ah", descriptor = "(Lclient!ec;)I", line = 60)
	@Override
	public int method33456(@OriginalArg(0) Class108 arg0) {
		return this.vars.method33455(arg0, -1170362389);
	}

	@OriginalMember(owner = "client!ah", name = "ai", descriptor = "(Lclient!ec;)I", line = 60)
	@Override
	public int method33459(@OriginalArg(0) Class108 arg0) {
		return this.vars.method33455(arg0, -1894837578);
	}

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "(Lclient!kh;I)I", line = 64)
	@Override
	public int method33454(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return this.vars.method33454(arg0, 1588220606);
	}

	@OriginalMember(owner = "client!ah", name = "aw", descriptor = "(Lclient!kh;)I", line = 64)
	@Override
	public int method33461(@OriginalArg(0) Class379 arg0) {
		return this.vars.method33454(arg0, -1965711294);
	}

	@OriginalMember(owner = "client!ah", name = "as", descriptor = "(Lclient!kh;)I", line = 64)
	@Override
	public int method33460(@OriginalArg(0) Class379 arg0) {
		return this.vars.method33454(arg0, -2131373946);
	}

	@OriginalMember(owner = "client!ah", name = "at", descriptor = "(Lclient!kh;)I", line = 64)
	@Override
	public int method33462(@OriginalArg(0) Class379 arg0) {
		return this.vars.method33454(arg0, 1454930453);
	}

	@OriginalMember(owner = "client!ah", name = "vz", descriptor = "(Lclient!yf;I)V", line = 8869)
	static final void method8672(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(37) String local37 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local13 == 99) {
			Class314.method26939(local37, -1869879429);
		} else if (local13 == 98) {
			Class136.method10214(local37, 729171094);
		} else {
			Class227.method25612(local13, local23, "", "", "", local37, null, -1862603888);
		}
	}

	@OriginalMember(owner = "client!ah", name = "amb", descriptor = "(Lclient!yf;I)V", line = 12052)
	static final void method8673(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class447.aClass447_1.method28913(-2137156690);
	}
}
