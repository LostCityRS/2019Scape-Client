package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class Class110 implements Interface22 {

	@OriginalMember(owner = "client!eh", name = "in", descriptor = "Lclient!adv;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!abn;")
	public final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!eh", name = "ami", descriptor = "(Lclient!yp;I)V")
	static void method7295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class442.aClass442_3.method29194(-940463104);
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!add;Lclient!abg;)V")
	Class110(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class33 arg1) {
		this(arg0.aClass143_3, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!add;)V")
	public Class110(@OriginalArg(0) Class2_Sub1 arg0) {
		this(arg0, new Class33(arg0));
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!qt;Lclient!abg;)V")
	public Class110(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class33 arg1) {
		this.anInterface4_2 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public final int method36977(@OriginalArg(0) Class107 arg0) {
		return this.anInterface4_2.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36994(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.anInterface4_2.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(Lclient!ea;I)J")
	@Override
	public final long method36984(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface4_2.method716(arg0.anInt862 * -1873516487, (byte) 90);
	}

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method36983(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInterface4_2.method730(arg0.anInt862 * -1873516487, arg1, 1851640014);
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36985(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.anInterface4_2.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ea;)J")
	@Override
	public final long method36991(@OriginalArg(0) Class107 arg0) {
		return this.anInterface4_2.method716(arg0.anInt862 * -1873516487, (byte) 60);
	}

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	public final Object method36995(@OriginalArg(0) Class107 arg0) {
		return this.anInterface4_2.method718(arg0.anInt862 * -1873516487, (byte) 78);
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(Lclient!ea;Ljava/lang/Object;I)V")
	@Override
	public void method37001(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.anInterface4_2.method719(arg0.anInt862 * -1873516487, arg1, -1798181691);
	}

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public final int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, 329642125), -983981985);
	}

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "(Lclient!kb;IB)V")
	@Override
	public final void method36987(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, -700927381), arg1, 1312031663), -382887093);
	}

	@OriginalMember(owner = "client!eh", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public final int method36979(@OriginalArg(0) Class107 arg0) {
		return this.anInterface4_2.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!eh", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public final int method36981(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -1003425061), -1368312619);
	}

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public final int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface4_2.method722(arg0.anInt862 * -1873516487, (byte) 2);
	}

	@OriginalMember(owner = "client!eh", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public final int method36982(@OriginalArg(0) Class374 arg0) {
		return arg0.method28421(this.method36980(arg0.aClass107_1, -146190705), -1626664082);
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36989(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anInterface4_2.method730(arg0.anInt862 * -1873516487, arg1, 1638670178);
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method36990(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.anInterface4_2.method730(arg0.anInt862 * -1873516487, arg1, 1211458829);
	}

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "(Lclient!ea;I)Ljava/lang/Object;")
	@Override
	public final Object method36988(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface4_2.method718(arg0.anInt862 * -1873516487, (byte) 72);
	}

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36992(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.anInterface4_2.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "(Lclient!ea;J)V")
	@Override
	public void method36999(@OriginalArg(0) Class107 arg0, @OriginalArg(1) long arg1) {
		this.anInterface4_2.method717(arg0.anInt862 * -1873516487, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36996(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface4_2.method719(arg0.anInt862 * -1873516487, arg1, -1716581796);
	}

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36997(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface4_2.method719(arg0.anInt862 * -1873516487, arg1, -2111460799);
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36998(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface4_2.method719(arg0.anInt862 * -1873516487, arg1, -1841222177);
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(Lclient!ea;Ljava/lang/Object;)V")
	@Override
	public void method36986(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface4_2.method719(arg0.anInt862 * -1873516487, arg1, -1911151877);
	}

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "(Lclient!kb;I)V")
	@Override
	public final void method37000(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, -572679766), arg1, 1844678206), -1759118974);
	}

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "(Lclient!kb;I)V")
	@Override
	public final void method36993(@OriginalArg(0) Class374 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method36983(arg0.aClass107_1, arg0.method28422(this.method36980(arg0.aClass107_1, -1777019702), arg1, 1073529806), 201430851);
	}
}
