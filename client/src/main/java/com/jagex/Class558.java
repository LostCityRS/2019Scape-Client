package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Stack;

@OriginalClass("client!sq")
public final class Class558 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	int anInt5180;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	int anInt5181;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	int anInt5182;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	int anInt5183;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Ljava/lang/String;")
	String aString223;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(Lclient!tj;B)V")
	static void method31398(@OriginalArg(0) Class573 arg0, @OriginalArg(1) byte arg1) {
		arg0.aClass120_Sub1_25 = null;
		@Pc(5) Stack local5 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			if (Class573.aStack1.size() < 200) {
				Class573.aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "(Lclient!akg;B)V")
	public static void method31399(@OriginalArg(0) Class80_Sub17 arg0, @OriginalArg(1) byte arg1) {
		if (Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732)) {
			Class662.aClass162_Sub2_1.method15789(arg0, 701683923);
		} else {
			arg0.method23453(-454396966);
		}
	}

	@OriginalMember(owner = "client!sq", name = "ki", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method31400(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aStringArray24 = null;
	}

	@OriginalMember(owner = "client!sq", name = "lh", descriptor = "(Lclient!yp;B)V")
	static void method31401(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2123625077);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class644.method33031(local16, local22, arg0, 1178895247);
	}

	@OriginalMember(owner = "client!sq", name = "ahk", descriptor = "(Lclient!yp;I)V")
	static void method31402(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class12.method346(-1251150451);
	}

	@OriginalMember(owner = "client!sq", name = "abj", descriptor = "(Lclient!yp;I)V")
	static void method31403(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class134.aClass305_1.method27140(local12, -1478207462).method27075(1560315805);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	Class558() {
	}

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "()I")
	public int method31382() {
		return this.anInt5182 * 663954587;
	}

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "()I")
	public int method31383() {
		return this.anInt5182 * 663954587;
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)I")
	public int method31384(@OriginalArg(0) byte arg0) {
		return this.anInt5181 * -99944931;
	}

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "(I)I")
	public int method31385(@OriginalArg(0) int arg0) {
		return this.anInt5183 * -1571284837;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)I")
	public int method31386(@OriginalArg(0) int arg0) {
		return this.anInt5182 * 663954587;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "()Ljava/lang/String;")
	public String method31387() {
		return this.aString223;
	}

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "(I)Ljava/lang/String;")
	public String method31388(@OriginalArg(0) int arg0) {
		return this.aString223;
	}

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "()Ljava/lang/String;")
	public String method31389() {
		return this.aString223;
	}

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "()Ljava/lang/String;")
	public String method31390() {
		return this.aString223;
	}

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "()I")
	public int method31391() {
		return this.anInt5181 * -99944931;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()I")
	public int method31392() {
		return this.anInt5180 * -2103260895;
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "()I")
	public int method31393() {
		return this.anInt5180 * -2103260895;
	}

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "()I")
	public int method31394() {
		return this.anInt5183 * -1571284837;
	}

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "()I")
	public int method31395() {
		return this.anInt5182 * 663954587;
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "()Ljava/lang/String;")
	public String method31396() {
		return this.aString223;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)I")
	public int method31397(@OriginalArg(0) int arg0) {
		return this.anInt5180 * -2103260895;
	}
}
