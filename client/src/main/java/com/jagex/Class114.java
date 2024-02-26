package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public abstract class Class114 implements Interface35 {

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
	protected String aString41;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Ljava/lang/String;")
	protected String aString42;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "Ljava/lang/String;")
	protected String aString40 = null;

	@OriginalMember(owner = "client!ht", name = "pu", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method8626(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1848398769) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 1680867301);
	}

	@OriginalMember(owner = "client!ht", name = "ph", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method8627(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2140807484) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray34 = Class431.method29089(local13, arg2, 1948681905);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "([SI)[S")
	public static short[] method8628(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!ht", name = "hk", descriptor = "(I)V")
	public static void method8629(@OriginalArg(0) int arg0) {
		if (!client.aBoolean725) {
			client.aFloat256 += (-12.0F - client.aFloat256) / 2.0F;
			client.aBoolean726 = true;
			client.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	Class114() {
	}

	@OriginalMember(owner = "client!ht", name = "at", descriptor = "(ILclient!pm;)V")
	abstract void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "(B)Ljava/lang/String;")
	final String method8576(@OriginalArg(0) byte arg0) {
		return this.aString40;
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "()Z")
	public abstract boolean method8577();

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "(Lclient!aqv;F)V")
	abstract void method8578(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ht", name = "ab", descriptor = "(IFFFF)V")
	abstract void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(Lclient!aqv;FFF)V")
	abstract void method8580(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	abstract void method8581(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	abstract void method8582(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	abstract void method8583(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "(Lclient!aqv;F)V")
	abstract void method8584(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "(IFFF)V")
	abstract void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "(IFFFF)V")
	abstract void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "(I[FI)V")
	abstract void method8587(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "bl", descriptor = "(IFFF)V")
	abstract void method8588(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(ILclient!pm;)V")
	abstract void method8589(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "()Ljava/lang/String;")
	final String method8590() {
		return this.aString40;
	}

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "(IILclient!mf;)V")
	abstract void method8591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "(Lclient!aqv;FF)V")
	abstract void method8592(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "()Z")
	public abstract boolean method8593();

	@OriginalMember(owner = "client!ht", name = "ar", descriptor = "(Lclient!aqv;FF)V")
	abstract void method8594(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Lclient!aqv;F)V")
	abstract void method8595(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Lclient!aqv;F)V")
	abstract void method8596(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ht", name = "ax", descriptor = "(Lclient!aqv;FFF)V")
	abstract void method8597(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "ay", descriptor = "(Lclient!aqv;FFFF)V")
	abstract void method8598(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "ai", descriptor = "(Lclient!aqv;FFFF)V")
	abstract void method8599(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "aq", descriptor = "(Lclient!aqv;FFFF)V")
	abstract void method8600(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "ao", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	abstract void method8601(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "aj", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	abstract void method8602(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "ac", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	abstract void method8603(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!aqv;[FI)V")
	abstract void method8604(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "ae", descriptor = "(Lclient!aqv;FF)V")
	abstract void method8605(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ht", name = "al", descriptor = "(I[FI)V")
	abstract void method8606(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "ah", descriptor = "(ILclient!pm;)V")
	abstract void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "(ILclient!pm;)V")
	abstract void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "am", descriptor = "(ILclient!pm;)V")
	abstract void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "ak", descriptor = "(ILclient!pm;)V")
	abstract void method8610(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(Lclient!aqv;FFFF)V")
	abstract void method8611(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "ad", descriptor = "(ILclient!pm;)V")
	abstract void method8612(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "ap", descriptor = "(Lclient!aqv;FF)V")
	abstract void method8613(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ht", name = "an", descriptor = "(IILclient!mf;)V")
	abstract void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);

	@OriginalMember(owner = "client!ht", name = "aa", descriptor = "(IILclient!mf;)V")
	abstract void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);

	@OriginalMember(owner = "client!ht", name = "au", descriptor = "(Lclient!aqv;[FI)V")
	abstract void method8616(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "br", descriptor = "(IFFF)V")
	abstract void method8617(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "(ILclient!pm;)V")
	abstract void method8618(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "bg", descriptor = "(IFFF)V")
	abstract void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ht", name = "az", descriptor = "(Lclient!aqv;[FI)V")
	abstract void method8620(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "as", descriptor = "(Lclient!aqv;[FI)V")
	abstract void method8621(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "aw", descriptor = "(Lclient!aqv;[FI)V")
	abstract void method8622(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "af", descriptor = "(ILclient!pm;)V")
	abstract void method8623(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1);

	@OriginalMember(owner = "client!ht", name = "ag", descriptor = "(IFFFF)V")
	abstract void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!ht", name = "av", descriptor = "(IILclient!mf;)V")
	abstract void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2);
}
