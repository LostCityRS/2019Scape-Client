package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class141 {

	@OriginalMember(owner = "client!pn", name = "bn", descriptor = "(Lclient!ara;Lclient!aan;I)I")
	static int method10904(@OriginalArg(0) Class80_Sub1_Sub4 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) String local3 = Class569.method31536(arg0, -1101981990);
		return arg1.method374(local3, Class344.aClass99Array6, -1917922275);
	}

	@OriginalMember(owner = "client!pn", name = "df", descriptor = "(Lclient!yp;I)V")
	static void method10905(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class505.method30469(local11, local14, arg0, 215712992);
	}

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "(ILjava/lang/String;B)V")
	public static void method10906(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		Class255.method26406(arg0, 0, "", "", "", arg1, null, (byte) 3);
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	Class141() {
	}

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "()Lclient!ps;")
	abstract Js5ArchiveIndex method10890();

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(IB)[B")
	abstract byte[] method10891(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "(I)[B")
	abstract byte[] method10892(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "(IB)I")
	abstract int method10893(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "(I)Lclient!ps;")
	abstract Js5ArchiveIndex getIndex(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "()Lclient!ps;")
	abstract Js5ArchiveIndex method10895();

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "(I)I")
	abstract int method10896(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "(I)I")
	abstract int method10897(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "(I)[B")
	abstract byte[] method10898(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "(I)[B")
	abstract byte[] method10899(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)[B")
	abstract byte[] method10900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "(I)V")
	abstract void method10901(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(IB)V")
	abstract void method10902(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "()Lclient!ps;")
	abstract Js5ArchiveIndex method10903();
}
