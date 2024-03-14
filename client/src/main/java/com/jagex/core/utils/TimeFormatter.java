package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("acs")
public class TimeFormatter {

	@ObfuscatedName("acs.e")
	public static final String[][] field9162 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@ObfuscatedName("acs.n")
	public static Calendar field9161 = Calendar.getInstance();

	@ObfuscatedName("acs.m")
	public static Calendar field9163 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	public TimeFormatter() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aal.e(JII)Ljava/lang/String;")
	public static String method14482(long arg0, int arg1) {
		method4389(arg0);
		int var3 = field9161.get(5);
		int var4 = field9161.get(2);
		int var5 = field9161.get(1);
		return arg1 == 3 ? method290(arg0, arg1) : Integer.toString(var3 / 10) + var3 % 10 + "-" + field9162[arg1][var4] + "-" + var5;
	}

	@ObfuscatedName("nk.n(JIZB)Ljava/lang/String;")
	public static String method6058(long arg0, int arg1, boolean arg2) {
		Calendar var4;
		if (arg2) {
			method485(arg0);
			var4 = field9163;
		} else {
			method4389(arg0);
			var4 = field9161;
		}
		int var5 = var4.get(5);
		int var6 = var4.get(2);
		int var7 = var4.get(1);
		int var8 = var4.get(11);
		int var9 = var4.get(12);
		return arg1 == 3 ? method4984(arg0, arg1, arg2) : Integer.toString(var5 / 10) + var5 % 10 + "-" + field9162[arg1][var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
	}

	@ObfuscatedName("ji.m(JIZB)Ljava/lang/String;")
	public static String method4984(long arg0, int arg1, boolean arg2) {
		Calendar var4;
		if (arg2) {
			method485(arg0);
			var4 = field9163;
		} else {
			method4389(arg0);
			var4 = field9161;
		}
		int var5 = var4.get(5);
		int var6 = var4.get(2) + 1;
		int var7 = var4.get(1);
		int var8 = var4.get(11);
		int var9 = var4.get(12);
		return Integer.toString(var5 / 10) + var5 % 10 + "/" + var6 / 10 + var6 % 10 + "/" + var7 % 100 / 10 + var7 % 10 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
	}

	@ObfuscatedName("p.k(JIB)Ljava/lang/String;")
	public static String method290(long arg0, int arg1) {
		method4389(arg0);
		int var3 = field9161.get(5);
		int var4 = field9161.get(2) + 1;
		int var5 = field9161.get(1);
		return Integer.toString(var3 / 10) + var3 % 10 + "/" + var4 / 10 + var4 % 10 + "/" + var5 % 100 / 10 + var5 % 10;
	}

	@ObfuscatedName("ahc.f(JII)Ljava/lang/String;")
	public static String method16609(long arg0, int arg1) {
		method4389(arg0);
		int var3 = field9161.get(11);
		int var4 = field9161.get(12);
		int var5 = field9161.get(13);
		return Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
	}

	@ObfuscatedName("zi.w(J)I")
	public static int method13899(long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@ObfuscatedName("s.l(J)V")
	public static void method485(long arg0) {
		field9163.setTime(new Date(arg0));
	}

	@ObfuscatedName("ig.u(J)V")
	public static void method4389(long arg0) {
		field9161.setTime(new Date(arg0));
	}

	@ObfuscatedName("tg.z(IIIIIII)J")
	public static long method8691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		field9163.clear();
		field9163.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return field9163.getTime().getTime();
	}

	@ObfuscatedName("abo.p(II)J")
	public static long method14612(int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@ObfuscatedName("afd.d(J)I")
	public static int method16390(long arg0) {
		method4389(arg0);
		return field9161.get(1);
	}
}
