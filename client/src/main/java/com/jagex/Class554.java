package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public abstract class Class554 implements Interface61, Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	static int anInt3416;

	@OriginalMember(owner = "client!sm", name = "an", descriptor = "Ljava/lang/String;")
	static final String aString135 = "random.dat";

	@OriginalMember(owner = "client!sm", name = "ab", descriptor = "J")
	static final long aLong348 = 3221225472L;

	@OriginalMember(owner = "client!sm", name = "al", descriptor = "I")
	static final int anInt3419 = 1048576;

	@OriginalMember(owner = "client!sm", name = "ah", descriptor = "Ljava/lang/String;")
	static final String aString136 = "rw";

	@OriginalMember(owner = "client!sm", name = "am", descriptor = "Ljava/io/File;")
	static File aFile3;

	@OriginalMember(owner = "client!sm", name = "at", descriptor = "Ljava/lang/String;")
	static final String aString137 = "main_file_cache.dat2";

	@OriginalMember(owner = "client!sm", name = "ad", descriptor = "Ljava/lang/String;")
	static final String aString138 = "main_file_cache.idx";

	@OriginalMember(owner = "client!sm", name = "av", descriptor = "Ljava/lang/String;")
	static final String aString139 = "main_file_cache.idx255";

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!sr;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!sm", name = "aw", descriptor = "I")
	static final int anInt3420 = 0;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
	static int anInt3421;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	static final int anInt3422 = 32;

	@OriginalMember(owner = "client!sm", name = "bg", descriptor = "I")
	static final int anInt3424 = 1;

	@OriginalMember(owner = "client!sm", name = "be", descriptor = "Ljava/lang/String;")
	static String aString140;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "J")
	static long aLong346 = 4368688067202063104L;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static int anInt3413 = 0;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	public static int anInt3414 = 0;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[J")
	static long[] aLongArray22 = new long[32];

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "[J")
	static long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt3417 = 0;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "Ljava/lang/String;")
	protected static String aString134 = null;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Z")
	protected static volatile boolean aBoolean700 = true;

	@OriginalMember(owner = "client!sm", name = "ax", descriptor = "I")
	static int anInt3418 = 303710524;

	@OriginalMember(owner = "client!sm", name = "ay", descriptor = "Z")
	protected static volatile boolean aBoolean701 = false;

	@OriginalMember(owner = "client!sm", name = "ai", descriptor = "J")
	static volatile long aLong347 = 0L;

	@OriginalMember(owner = "client!sm", name = "ao", descriptor = "Z")
	protected static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!sm", name = "aj", descriptor = "Z")
	static volatile boolean aBoolean698 = true;

	@OriginalMember(owner = "client!sm", name = "aa", descriptor = "Lclient!abj;")
	static Class36 aClass36_4 = null;

	@OriginalMember(owner = "client!sm", name = "ae", descriptor = "Lclient!abj;")
	protected static Class36 aClass36_6 = null;

	@OriginalMember(owner = "client!sm", name = "ap", descriptor = "Lclient!abj;")
	protected static Class36 aClass36_5 = null;

	@OriginalMember(owner = "client!sm", name = "bl", descriptor = "Lclient!sa;")
	static Class544 aClass544_2 = null;

	@OriginalMember(owner = "client!sm", name = "br", descriptor = "J")
	static long aLong349 = 0L;

	@OriginalMember(owner = "client!sm", name = "bn", descriptor = "Z")
	static boolean aBoolean699 = false;

	@OriginalMember(owner = "client!sm", name = "bt", descriptor = "I")
	public static int anInt3423 = -1697078989;

	@OriginalMember(owner = "client!sm", name = "bs", descriptor = "I")
	public static int anInt3412 = -1356892559;

	@OriginalMember(owner = "client!sm", name = "ba", descriptor = "Z")
	boolean aBoolean703 = false;

	@OriginalMember(owner = "client!sm", name = "bj", descriptor = "Z")
	boolean aBoolean704 = false;

	@OriginalMember(owner = "client!sm", name = "eg", descriptor = "()Lclient!sa;")
	public static Class544 method25187() {
		return aClass544_2;
	}

	@OriginalMember(owner = "client!sm", name = "ef", descriptor = "()V")
	public static void method25198() {
		Class407.anImage4 = null;
		Class540.aFont2 = null;
	}

	@OriginalMember(owner = "client!sm", name = "cx", descriptor = "()J")
	static long method25199() {
		return aClass146_2.method13858((byte) 1);
	}

	@OriginalMember(owner = "client!sm", name = "cd", descriptor = "()Ljava/awt/Container;")
	public static Container method25203() {
		if (Class411.aFrame2 == null) {
			return Class244.aFrame1 == null ? Class306.anApplet1 : Class244.aFrame1;
		} else {
			return Class411.aFrame2;
		}
	}

	@OriginalMember(owner = "client!sm", name = "cu", descriptor = "(Ljava/lang/Object;)V")
	static void method25215(@OriginalArg(0) Object arg0) {
		if (Class166.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class166.anEventQueue1.peekEvent() != null; local4++) {
			Class217.method25866(1L);
		}
		try {
			if (arg0 != null) {
				Class166.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bb", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abp;")
	public static Class40 method25237(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(aFile3, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class40(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class93.anInt329 * 1095457647 == 33) {
			local29 = "_rc";
		} else if (Class93.anInt329 * 1095457647 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class588.aString227, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class40(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class40(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "bo", descriptor = "()V")
	static void method25238() {
		try {
			@Pc(5) File local5 = new File(Class588.aString227, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class112.aStringArray13.length; local23++) {
					for (local29 = 0; local29 < Class501.aStringArray31.length; local29++) {
						@Pc(53) File local53 = new File(Class501.aStringArray31[local29] + Class112.aStringArray13[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass36_4 = new Class36(new Class40(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass36_4 == null) {
				@Pc(81) RandomAccessFile local81 = new RandomAccessFile(local5, "rw");
				local29 = local81.read();
				local81.seek(0L);
				local81.write(local29);
				local81.seek(0L);
				local81.close();
				aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(109) IOException local109) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bc", descriptor = "()V")
	static void method25239() {
		try {
			@Pc(5) File local5 = new File(Class588.aString227, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class112.aStringArray13.length; local23++) {
					for (local29 = 0; local29 < Class501.aStringArray31.length; local29++) {
						@Pc(53) File local53 = new File(Class501.aStringArray31[local29] + Class112.aStringArray13[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass36_4 = new Class36(new Class40(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass36_4 == null) {
				@Pc(81) RandomAccessFile local81 = new RandomAccessFile(local5, "rw");
				local29 = local81.read();
				local81.seek(0L);
				local81.write(local29);
				local81.seek(0L);
				local81.close();
				aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(109) IOException local109) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bf", descriptor = "(Lclient!ald;)V")
	public static void method25240(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass36_4.method762(0L);
			aClass36_4.method764(local2, (byte) 39);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method23168(local2, 0, 24, (byte) 98);
	}

	@OriginalMember(owner = "client!sm", name = "bw", descriptor = "(Lclient!ald;)V")
	public static void method25241(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass36_4.method762(0L);
			aClass36_4.method764(local2, (byte) -91);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method23168(local2, 0, 24, (byte) 16);
	}

	@OriginalMember(owner = "client!sm", name = "bi", descriptor = "(Lclient!ald;I)V")
	static void method25243(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (aClass36_4 == null) {
			return;
		}
		try {
			aClass36_4.method762(0L);
			aClass36_4.method767(arg0.aByteArray61, arg1, 24, (byte) 33);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bu", descriptor = "(Lclient!ald;I)V")
	static void method25244(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (aClass36_4 == null) {
			return;
		}
		try {
			aClass36_4.method762(0L);
			aClass36_4.method767(arg0.aByteArray61, arg1, 24, (byte) 111);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bm", descriptor = "(Lclient!ald;I)V")
	static void method25245(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (aClass36_4 == null) {
			return;
		}
		try {
			aClass36_4.method762(0L);
			aClass36_4.method767(arg0.aByteArray61, arg1, 24, (byte) 63);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "bp", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abp;")
	public static Class40 method25254(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(aFile3, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class40(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class93.anInt329 * 1095457647 == 33) {
			local29 = "_rc";
		} else if (Class93.anInt329 * 1095457647 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class588.aString227, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class40(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class40(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "cm", descriptor = "()I")
	public static int method25255() {
		return (int) (1000000000L / (aLong346 * -4113900210149837993L));
	}

	@OriginalMember(owner = "client!sm", name = "cg", descriptor = "()I")
	public static int method25263() {
		return (int) (1000000000L / (aLong346 * -4113900210149837993L));
	}

	@OriginalMember(owner = "client!sm", name = "cb", descriptor = "()V")
	public static void method25264() {
		aClass146_2.method13855((byte) -78);
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray22[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray21[local4] = 0L;
		}
		anInt3421 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "cw", descriptor = "()V")
	public static void method25265() {
		aClass146_2.method13855((byte) 0);
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray22[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray21[local4] = 0L;
		}
		anInt3421 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "cl", descriptor = "()J")
	static long method25266() {
		return aClass146_2.method13858((byte) 1);
	}

	@OriginalMember(owner = "client!sm", name = "cf", descriptor = "()J")
	static long method25268() {
		return aClass146_2.method13858((byte) 1);
	}

	@OriginalMember(owner = "client!sm", name = "bv", descriptor = "()Ljava/io/File;")
	public static File method25269() {
		return aFile3;
	}

	@OriginalMember(owner = "client!sm", name = "ez", descriptor = "()V")
	public static void method25272() {
		Class407.anImage4 = null;
		Class540.aFont2 = null;
	}

	@OriginalMember(owner = "client!sm", name = "cp", descriptor = "()I")
	public static int method25273() {
		return (int) (1000000000L / (aLong346 * -4113900210149837993L));
	}

	@OriginalMember(owner = "client!sm", name = "bx", descriptor = "(Lclient!ald;)V")
	public static void method25282(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass36_4.method762(0L);
			aClass36_4.method764(local2, (byte) 62);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method23168(local2, 0, 24, (byte) 118);
	}

	@OriginalMember(owner = "client!sm", name = "eb", descriptor = "()Lclient!sa;")
	public static Class544 method25308() {
		return aClass544_2;
	}

	@OriginalMember(owner = "client!sm", name = "ama", descriptor = "(Lclient!yp;I)V")
	static void method25309(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class151.method14543(Class676.method33586(1765637813), (byte) -122);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	public static void method25310(@OriginalArg(0) int arg0) {
		aClass146_2.method13855((byte) -3);
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray22[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray21[local4] = 0L;
		}
		anInt3421 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	Class554() {
	}

	@OriginalMember(owner = "client!sm", name = "eh", descriptor = "()V")
	public final void method25182() throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", -49580921);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V")
	@Override
	public final void supplyApplet(@OriginalArg(0) Applet arg0) {
		Class306.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "ey", descriptor = "(Ljava/lang/String;)V")
	final void method25183(@OriginalArg(0) String arg0) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	final void method25184(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) throws Exception {
		Class331.anInt4192 = arg3 * 253402697;
		Class93.anInt329 = arg2 * 808739727;
		RuntimeException_Sub4.anInt3268 = arg4 * -1825691279;
		Class349.anInt4254 = arg5 * -1969717623;
		Class342.aString190 = "Unknown";
		Class601.aString231 = "1.1";
		try {
			Class342.aString190 = System.getProperty("java.vendor");
			Class601.aString231 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			aString140 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			aString140 = "Unknown";
		}
		Class450.aString209 = aString140.toLowerCase();
		try {
			Class103_Sub22.aString44 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class103_Sub22.aString44 = "";
		}
		try {
			Class505.aString216 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class505.aString216 = "";
		}
		try {
			Class588.aString227 = System.getProperty("user.home");
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class450.aString209.startsWith("win")) {
				if (Class588.aString227 == null) {
					Class588.aString227 = System.getenv("USERPROFILE");
				}
			} else if (Class588.aString227 == null) {
				Class588.aString227 = System.getenv("HOME");
			}
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(98) Exception local98) {
		}
		if (Class588.aString227 == null) {
			Class588.aString227 = "~/";
		}
		try {
			Class166.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(107) Throwable local107) {
		}
		Class501.aStringArray31 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class588.aString227, "/tmp/", "" };
		Class112.aStringArray13 = new String[] { ".jagex_cache_" + Class93.anInt329 * 1095457647, ".file_store_" + Class93.anInt329 * 1095457647 };
		@Pc(173) int local173 = 0;
		@Pc(198) int local198;
		label131: while (local173 < 4) {
			aFile3 = this.method25185(arg0, arg1, local173, -795925575);
			if (!aFile3.exists()) {
				aFile3.mkdirs();
			}
			@Pc(192) File[] local192 = aFile3.listFiles();
			if (local192 == null) {
				break;
			}
			@Pc(196) File[] local196 = local192;
			local198 = 0;
			while (true) {
				if (local198 >= local196.length) {
					break label131;
				}
				@Pc(206) File local206 = local196[local198];
				if (!this.method25262(local206, false, -329285794)) {
					local173++;
					break;
				}
				local198++;
			}
		}
		Class289.method26921(aFile3, 1863470923);
		Class647.method33052(944974903);
		aClass36_6 = new Class36(new Class40(Class292.method26945("main_file_cache.dat2", (byte) 16), "rw", 3221225472L), 5200, 0);
		aClass36_5 = new Class36(new Class40(Class292.method26945("main_file_cache.idx255", (byte) 16), "rw", 1048576L), 6000, 0);
		Class203.aClass36Array1 = new Class36[Class331.anInt4192 * 720876537];
		for (local173 = 0; local173 < Class331.anInt4192 * 720876537; local173++) {
			Class203.aClass36Array1[local173] = new Class36(new Class40(Class292.method26945("main_file_cache.idx" + local173, (byte) 16), "rw", 1048576L), 6000, 0);
		}
		try {
			Class518.aClass14_1 = new Class14();
		} catch (@Pc(294) Exception local294) {
			Class13.aBoolean5 = false;
		}
		Class365.aClass555_1 = new Class555();
		@Pc(303) ThreadGroup local303 = Thread.currentThread().getThreadGroup();
		for (@Pc(306) ThreadGroup local306 = local303.getParent(); local306 != null; local306 = local306.getParent()) {
			local303 = local306;
		}
		@Pc(317) Thread[] local317 = new Thread[1000];
		local303.enumerate(local317);
		for (local198 = 0; local198 < local317.length; local198++) {
			if (local317[local198] != null && local317[local198].getName().startsWith("AWT")) {
				local317[local198].setPriority(1);
			}
		}
		@Pc(350) Thread local350 = new Thread(this);
		local350.setDaemon(true);
		local350.start();
		local350.setPriority(1);
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	final File method25185(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		Class86.aFile1 = new File(Class588.aString227, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (Class86.aFile1.exists()) {
			try {
				@Pc(50) Class40 local50 = new Class40(Class86.aFile1, "rw", 10000L);
				@Pc(58) Class80_Sub36 local58 = new Class80_Sub36((int) local50.method839((byte) 0));
				@Pc(84) int local84;
				while (local58.anInt3152 * -1380987821 < local58.aByteArray61.length) {
					local84 = local50.method832(local58.aByteArray61, local58.anInt3152 * -1380987821, local58.aByteArray61.length - local58.anInt3152 * -1380987821, (byte) -116);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.anInt3152 += local84 * 1034180571;
				}
				local58.anInt3152 = 0;
				local84 = local58.method23362(-92473409);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.method23362(509338329);
				}
				if (local84 <= 2) {
					local36 = local58.method23186((byte) 12);
					if (local127 == 1) {
						local38 = local58.method23186((byte) 12);
					}
				} else {
					local36 = local58.method23192((byte) 0);
					if (local127 == 1) {
						local38 = local58.method23192((byte) 0);
					}
				}
				local50.method838(-805438164);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method25262(local174, true, -1654652034)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(202) int local202 = 0; local202 < Class112.aStringArray13.length; local202++) {
				for (@Pc(208) int local208 = 0; local208 < Class501.aStringArray31.length; local208++) {
					@Pc(234) File local234 = new File(Class501.aStringArray31[local208] + Class112.aStringArray13[local202] + File.separatorChar + arg0 + File.separatorChar);
					if (local234.exists() && this.method25262(new File(local234, "test.dat"), true, 777821758)) {
						local36 = local234.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class588.aString227 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(293) File local293 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(301) File[] local301 = local293.listFiles();
				@Pc(303) File[] local303 = local301;
				for (@Pc(305) int local305 = 0; local305 < local303.length; local305++) {
					@Pc(313) File local313 = local303[local305];
					@Pc(320) File local320 = new File(local174, local313.getName());
					@Pc(324) boolean local324 = local313.renameTo(local320);
					if (!local324) {
						throw new IOException();
					}
				}
			} catch (@Pc(334) Exception local334) {
				local334.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method25291(new File(local36), null, (short) -5330);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sm", name = "ec", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25186(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	final synchronized void method25188(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class244.aFrame1 = new Frame();
		Class244.aFrame1.setTitle(arg0);
		Class244.aFrame1.setResizable(true);
		Class244.aFrame1.addWindowListener(this);
		Class244.aFrame1.setBackground(Color.black);
		Class244.aFrame1.setVisible(true);
		Class244.aFrame1.toFront();
		@Pc(23) Insets local23 = Class244.aFrame1.getInsets();
		Class244.aFrame1.setSize(local23.left + Class334.anInt4196 * -455826321 + local23.right, Class286.anInt3942 * -1411780839 + local23.top + local23.bottom);
	}

	@OriginalMember(owner = "client!sm", name = "ek", descriptor = "(Ljava/lang/String;)V")
	final void method25189(@OriginalArg(0) String arg0) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		aBoolean702 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "(B)V")
	final void method25190(@OriginalArg(0) byte arg0) {
		if (Class454.aCanvas6 != null) {
			Class454.aCanvas6.removeFocusListener(this);
			Class454.aCanvas6.getParent().setBackground(Color.black);
			Class454.aCanvas6.getParent().remove(Class454.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "(I)Z")
	final boolean method25191(@OriginalArg(0) int arg0) {
		if (ClientConfig.SKIP_HOST_CHECK) {
			return true;
		}

		@Pc(4) String local4 = Class306.anApplet1.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.equals("stellardawn.com") || local4.endsWith(".stellardawn.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method25206("invalidhost", 591439521);
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method25192((short) 22618);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class603.method32133(this.method25297(-591161260), local11, 839300151);
				this.method25206("crash", 1615320121);
				var6 = false;
			} finally {
				if (var6) {
					this.method25252(true, -1417065289);
				}
			}
			this.method25252(true, -1550537814);
			return;
		}
		this.method25252(true, -1301184171);
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(S)V")
	final void method25192(@OriginalArg(0) short arg0) {
		if (Class342.aString190 != null) {
			@Pc(4) String local4 = Class342.aString190.toLowerCase();
			if (local4.indexOf("sun") != -1 || local4.indexOf("apple") != -1) {
				@Pc(16) String local16 = Class601.aString231;
				if (local16.equals("1.1") || local16.startsWith("1.1.") || local16.equals("1.2") || local16.startsWith("1.2.") || local16.equals("1.3") || local16.startsWith("1.3.") || local16.equals("1.4") || local16.startsWith("1.4.") || local16.equals("1.5") || local16.startsWith("1.5.") || local16.equals("1.6.0")) {
					this.method25206("wrongjava", -1126685893);
					return;
				}
				if (local16.startsWith("1.6.0_")) {
					@Pc(71) int local71;
					for (local71 = 6; local71 < local16.length() && Class650.method33124(local16.charAt(local71), -2093655909); local71++) {
					}
					@Pc(88) String local88 = local16.substring(6, local71);
					if (Class698.method37062(local88, (short) 9079) && Class679.method33621(local88, -1545419238) < 10) {
						this.method25206("wrongjava", 705743067);
						return;
					}
				}
			}
		}
		Class60.method1187(-578866000).setFocusCycleRoot(true);
		anInt3423 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 1697078989;
		anInt3412 = Runtime.getRuntime().availableProcessors() * -1356892559;
		this.method25304(2079773863);
		this.method25202((byte) -12);
		aClass146_2 = Class257.method26425((short) -4136);
		while (aLong349 * 6145620734226936405L == 0L || Class303.method27111((byte) 64) < aLong349 * 6145620734226936405L) {
			anInt3421 = aClass146_2.method13854(aLong346 * -4113900210149837993L) * -1350095131;
			for (@Pc(153) int local153 = 0; local153 < anInt3421 * -830218515; local153++) {
				this.method25193((byte) -43);
			}
			this.method25200(1437751048);
			Class643.method33030(Class454.aCanvas6, -1123999026);
		}
	}

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "(B)V")
	final void method25193(@OriginalArg(0) byte arg0) {
		@Pc(2) long local2 = Class303.method27111((byte) 5);
		@Pc(8) long local8 = aLongArray21[Class598.anInt5364 * 1176676047];
		aLongArray21[Class598.anInt5364 * 1176676047] = local2;
		Class598.anInt5364 = (Class598.anInt5364 * 1176676047 + 1 & 0x1F) * 721330223;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class597.aBoolean926 = aBoolean698;
		}
		this.method25231((byte) 57);
	}

	@OriginalMember(owner = "client!sm", name = "am", descriptor = "()V")
	abstract void method25194();

	@OriginalMember(owner = "client!sm", name = "ch", descriptor = "()V")
	final void method25195() {
		if (Class342.aString190 != null) {
			@Pc(4) String local4 = Class342.aString190.toLowerCase();
			if (local4.indexOf("sun") != -1 || local4.indexOf("apple") != -1) {
				@Pc(16) String local16 = Class601.aString231;
				if (local16.equals("1.1") || local16.startsWith("1.1.") || local16.equals("1.2") || local16.startsWith("1.2.") || local16.equals("1.3") || local16.startsWith("1.3.") || local16.equals("1.4") || local16.startsWith("1.4.") || local16.equals("1.5") || local16.startsWith("1.5.") || local16.equals("1.6.0")) {
					this.method25206("wrongjava", 1960041362);
					return;
				}
				if (local16.startsWith("1.6.0_")) {
					@Pc(71) int local71;
					for (local71 = 6; local71 < local16.length() && Class650.method33124(local16.charAt(local71), -1795180559); local71++) {
					}
					@Pc(88) String local88 = local16.substring(6, local71);
					if (Class698.method37062(local88, (short) -11607) && Class679.method33621(local88, 1361954512) < 10) {
						this.method25206("wrongjava", 1890592221);
						return;
					}
				}
			}
		}
		Class60.method1187(-1188415251).setFocusCycleRoot(true);
		anInt3423 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 1697078989;
		anInt3412 = Runtime.getRuntime().availableProcessors() * -1356892559;
		this.method25304(2020692400);
		this.method25202((byte) -100);
		aClass146_2 = Class257.method26425((short) -23082);
		while (aLong349 * 6145620734226936405L == 0L || Class303.method27111((byte) 33) < aLong349 * 6145620734226936405L) {
			anInt3421 = aClass146_2.method13854(aLong346 * -4113900210149837993L) * -1350095131;
			for (@Pc(153) int local153 = 0; local153 < anInt3421 * -830218515; local153++) {
				this.method25193((byte) -52);
			}
			this.method25200(1601390014);
			Class643.method33030(Class454.aCanvas6, -1941337545);
		}
	}

	@OriginalMember(owner = "client!sm", name = "av", descriptor = "()V")
	abstract void method25196();

	@OriginalMember(owner = "client!sm", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (!aBoolean699) {
			aLong349 = 0L;
		}
	}

	@OriginalMember(owner = "client!sm", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (!aBoolean699) {
			aLong349 = (Class303.method27111((byte) 27) + 4000L) * 8365306696112028413L;
		}
	}

	@OriginalMember(owner = "client!sm", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (!aBoolean699) {
			aLong349 = Class303.method27111((byte) 119) * 8365306696112028413L;
			Class217.method25866(5000L);
			this.method25252(false, -1707006117);
		}
	}

	@OriginalMember(owner = "client!sm", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (aBoolean699) {
			return;
		}
		aBoolean700 = true;
		if (Class303.method27111((byte) 123) - aLong347 * -7402167867988945451L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class334.anInt4196 * -455826321 && local16.height >= Class286.anInt3942 * -1411780839) {
				aBoolean701 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = true;
		aBoolean700 = true;
	}

	@OriginalMember(owner = "client!sm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = false;
	}

	@OriginalMember(owner = "client!sm", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ce", descriptor = "()V")
	final void method25197() {
		@Pc(2) long local2 = Class303.method27111((byte) 60);
		@Pc(8) long local8 = aLongArray21[Class598.anInt5364 * 1176676047];
		aLongArray21[Class598.anInt5364 * 1176676047] = local2;
		Class598.anInt5364 = (Class598.anInt5364 * 1176676047 + 1 & 0x1F) * 721330223;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class597.aBoolean926 = aBoolean698;
		}
		this.method25231((byte) 81);
	}

	@OriginalMember(owner = "client!sm", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "(I)V")
	final void method25200(@OriginalArg(0) int arg0) {
		@Pc(2) long local2 = Class303.method27111((byte) 64);
		@Pc(12) long local12 = aLongArray22[anInt3416 * 1292481899 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray22[anInt3416 * 1292481899];
		aLongArray22[anInt3416 * 1292481899] = local2;
		anInt3416 = (anInt3416 * 1292481899 + 1 & 0x1F) * -1555247293;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3414 = (int) (local2 - local12) * 1011081901;
			anInt3413 = ((local47 >> 1) + 32000) / local47 * -251533151;
		}
		if ((anInt3418 += -377349701) * 219136883 - 1 > 50) {
			anInt3418 -= -1687615866;
			aBoolean700 = true;
			Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			Class454.aCanvas6.setVisible(true);
			if (Class244.aFrame1 != null && Class411.aFrame2 == null) {
				@Pc(100) Insets local100 = Class244.aFrame1.getInsets();
				Class454.aCanvas6.setLocation(anInt3415 * 317681859 + local100.left, local100.top + anInt3417 * -1044003729);
			} else {
				Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
			}
		}
		this.method25204((byte) 0);
	}

	@OriginalMember(owner = "client!sm", name = "ck", descriptor = "()V")
	final void method25201() {
		@Pc(2) long local2 = Class303.method27111((byte) 33);
		@Pc(12) long local12 = aLongArray22[anInt3416 * 1292481899 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray22[anInt3416 * 1292481899];
		aLongArray22[anInt3416 * 1292481899] = local2;
		anInt3416 = (anInt3416 * 1292481899 + 1 & 0x1F) * -1555247293;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3414 = (int) (local2 - local12) * 1011081901;
			anInt3413 = ((local47 >> 1) + 32000) / local47 * -251533151;
		}
		if ((anInt3418 += -377349701) * 219136883 - 1 > 50) {
			anInt3418 -= -1687615866;
			aBoolean700 = true;
			Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			Class454.aCanvas6.setVisible(true);
			if (Class244.aFrame1 != null && Class411.aFrame2 == null) {
				@Pc(100) Insets local100 = Class244.aFrame1.getInsets();
				Class454.aCanvas6.setLocation(anInt3415 * 317681859 + local100.left, local100.top + anInt3417 * -1044003729);
			} else {
				Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
			}
		}
		this.method25204((byte) 0);
	}

	@OriginalMember(owner = "client!sm", name = "ay", descriptor = "(B)V")
	abstract void method25202(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sm", name = "aq", descriptor = "(B)V")
	abstract void method25204(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sm", name = "ao", descriptor = "(B)V")
	abstract void method25205(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sm", name = "ag", descriptor = "(Ljava/lang/String;I)V")
	final void method25206(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "ab", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	final void method25207(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "al", descriptor = "(I)V")
	public final void method25208(@OriginalArg(0) int arg0) throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", 1880786412);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "ah", descriptor = "(Lclient!sa;ZI)V")
	final void method25209(@OriginalArg(0) Class544 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class544.aClass544_4 == arg0 || Class544.aClass544_3 == arg0) {
			aClass544_2 = arg0;
			if (aClass544_2 != Class544.aClass544_3 && arg1) {
				aClass544_2 = Class544.aClass544_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "()V")
	public final void method25210() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method25192((short) 10471);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class603.method32133(this.method25297(-591161260), local11, 839300151);
				this.method25206("crash", -1058465794);
				var6 = false;
			} finally {
				if (var6) {
					this.method25252(true, -1757132914);
				}
			}
			this.method25252(true, -1539674546);
			return;
		}
		this.method25252(true, -1814094559);
	}

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "()V")
	public final void method25211() {
		boolean var6 = false;
		label50: {
			try {
				var6 = true;
				this.method25192((short) 4697);
				var6 = false;
				break label50;
			} catch (@Pc(8) ThreadDeath local8) {
				throw local8;
			} catch (@Pc(11) Throwable local11) {
				Class603.method32133(this.method25297(-591161260), local11, 839300151);
				this.method25206("crash", 441294158);
				var6 = false;
			} finally {
				if (var6) {
					this.method25252(true, -2070841371);
				}
			}
			this.method25252(true, -1854351782);
			return;
		}
		this.method25252(true, -1403332805);
	}

	@OriginalMember(owner = "client!sm", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!sm", name = "ak", descriptor = "()V")
	abstract void method25212();

	@OriginalMember(owner = "client!sm", name = "at", descriptor = "()V")
	abstract void method25213();

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "(Lclient!sb;Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
	final void method25214(@OriginalArg(0) Class545 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8) {
		try {
			this.method25209(Class544.aClass544_4, arg7, 1020080106);
			Class334.anInt4196 = (Class80_Sub1_Sub1.anInt254 = arg0.method31186(-428706562) * -2011361969) * -1695404351;
			Class286.anInt3942 = (Class80_Sub25.anInt1627 = arg0.method31187((byte) 92) * -1341178817) * 240749719;
			anInt3415 = 0;
			anInt3417 = 0;
			if (Class651.method33131(-444131397) == Class544.aClass544_5) {
				Class334.anInt4196 += arg0.method31188(1535240099) * -504204002;
				Class286.anInt3942 += arg0.method31189((short) 255) * 598473298;
				this.method25188(arg0.method31200((byte) -103), -1973015928);
			}
			Class476.anApplet2 = Class306.anApplet1;
			this.method25184(arg1, arg2, arg3, arg4, arg5, arg6, 2036747717);
		} catch (@Pc(67) Throwable local67) {
			Class603.method32133(null, local67, 839300151);
			this.method25206("crash", -463671607);
		}
	}

	@OriginalMember(owner = "client!sm", name = "bd", descriptor = "()V")
	final synchronized void method25216() {
		this.method25190((byte) 7);
		@Pc(5) Container local5 = Class60.method1187(-1917816395);
		Class454.aCanvas6 = new Canvas_Sub1(local5);
		this.method25227(local5, (byte) -31);
	}

	@OriginalMember(owner = "client!sm", name = "aa", descriptor = "()V")
	abstract void method25217();

	@OriginalMember(owner = "client!sm", name = "ae", descriptor = "()V")
	abstract void method25218();

	@OriginalMember(owner = "client!sm", name = "ap", descriptor = "()V")
	abstract void method25219();

	@OriginalMember(owner = "client!sm", name = "ar", descriptor = "()V")
	abstract void method25220();

	@OriginalMember(owner = "client!sm", name = "au", descriptor = "()Ljava/lang/String;")
	String method25221() {
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "az", descriptor = "()Ljava/lang/String;")
	String method25222() {
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "as", descriptor = "()Ljava/lang/String;")
	String method25223() {
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "an", descriptor = "()V")
	abstract void method25224();

	@OriginalMember(owner = "client!sm", name = "bg", descriptor = "(Ljava/applet/Applet;)V")
	@Override
	public final void method25172(@OriginalArg(0) Applet arg0) {
		Class306.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "bl", descriptor = "(Ljava/applet/Applet;)V")
	@Override
	public final void method25171(@OriginalArg(0) Applet arg0) {
		Class306.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "br", descriptor = "(Lclient!sb;Ljava/lang/String;Ljava/lang/String;IIIIZ)V")
	final void method25225(@OriginalArg(0) Class545 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method25209(Class544.aClass544_4, arg7, 1536538431);
			Class334.anInt4196 = (Class80_Sub1_Sub1.anInt254 = arg0.method31186(1036559599) * -2011361969) * -1695404351;
			Class286.anInt3942 = (Class80_Sub25.anInt1627 = arg0.method31187((byte) 97) * -1341178817) * 240749719;
			anInt3415 = 0;
			anInt3417 = 0;
			if (Class651.method33131(-1627110855) == Class544.aClass544_5) {
				Class334.anInt4196 += arg0.method31188(2117891738) * -504204002;
				Class286.anInt3942 += arg0.method31189((short) 255) * 598473298;
				this.method25188(arg0.method31200((byte) -81), 51992556);
			}
			Class476.anApplet2 = Class306.anApplet1;
			this.method25184(arg1, arg2, arg3, arg4, arg5, arg6, 2036747717);
		} catch (@Pc(67) Throwable local67) {
			Class603.method32133(null, local67, 839300151);
			this.method25206("crash", 698256466);
		}
	}

	@OriginalMember(owner = "client!sm", name = "bn", descriptor = "(Lclient!sb;Ljava/lang/String;Ljava/lang/String;IIIIZ)V")
	final void method25226(@OriginalArg(0) Class545 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method25209(Class544.aClass544_4, arg7, 2023720736);
			Class334.anInt4196 = (Class80_Sub1_Sub1.anInt254 = arg0.method31186(-1662914919) * -2011361969) * -1695404351;
			Class286.anInt3942 = (Class80_Sub25.anInt1627 = arg0.method31187((byte) 79) * -1341178817) * 240749719;
			anInt3415 = 0;
			anInt3417 = 0;
			if (Class651.method33131(-1754832228) == Class544.aClass544_5) {
				Class334.anInt4196 += arg0.method31188(1585776415) * -504204002;
				Class286.anInt3942 += arg0.method31189((short) 255) * 598473298;
				this.method25188(arg0.method31200((byte) -80), -360389343);
			}
			Class476.anApplet2 = Class306.anApplet1;
			this.method25184(arg1, arg2, arg3, arg4, arg5, arg6, 2036747717);
		} catch (@Pc(67) Throwable local67) {
			Class603.method32133(null, local67, 839300151);
			this.method25206("crash", 1376705037);
		}
	}

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "(Ljava/awt/Container;B)V")
	final void method25227(@OriginalArg(0) Container arg0, @OriginalArg(1) byte arg1) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class454.aCanvas6);
		Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
		Class454.aCanvas6.setVisible(true);
		if (arg0 == Class244.aFrame1) {
			@Pc(26) Insets local26 = Class244.aFrame1.getInsets();
			Class454.aCanvas6.setLocation(local26.left + anInt3415 * 317681859, anInt3417 * -1044003729 + local26.top);
		} else {
			Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
		}
		Class454.aCanvas6.addFocusListener(this);
		Class454.aCanvas6.requestFocus();
		Class597.aBoolean926 = true;
		aBoolean698 = true;
		Class454.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean700 = true;
		aBoolean701 = false;
		aLong347 = Class303.method27111((byte) 47) * 7467997290225548157L;
	}

	@OriginalMember(owner = "client!sm", name = "bt", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V")
	final void method25228(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class331.anInt4192 = arg3 * 253402697;
		Class93.anInt329 = arg2 * 808739727;
		RuntimeException_Sub4.anInt3268 = arg4 * -1825691279;
		Class349.anInt4254 = arg5 * -1969717623;
		Class342.aString190 = "Unknown";
		Class601.aString231 = "1.1";
		try {
			Class342.aString190 = System.getProperty("java.vendor");
			Class601.aString231 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			aString140 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			aString140 = "Unknown";
		}
		Class450.aString209 = aString140.toLowerCase();
		try {
			Class103_Sub22.aString44 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class103_Sub22.aString44 = "";
		}
		try {
			Class505.aString216 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class505.aString216 = "";
		}
		try {
			Class588.aString227 = System.getProperty("user.home");
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class450.aString209.startsWith("win")) {
				if (Class588.aString227 == null) {
					Class588.aString227 = System.getenv("USERPROFILE");
				}
			} else if (Class588.aString227 == null) {
				Class588.aString227 = System.getenv("HOME");
			}
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(98) Exception local98) {
		}
		if (Class588.aString227 == null) {
			Class588.aString227 = "~/";
		}
		try {
			Class166.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(107) Throwable local107) {
		}
		Class501.aStringArray31 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class588.aString227, "/tmp/", "" };
		Class112.aStringArray13 = new String[] { ".jagex_cache_" + Class93.anInt329 * 1095457647, ".file_store_" + Class93.anInt329 * 1095457647 };
		@Pc(173) int local173 = 0;
		@Pc(198) int local198;
		label131: while (local173 < 4) {
			aFile3 = this.method25185(arg0, arg1, local173, 1741703264);
			if (!aFile3.exists()) {
				aFile3.mkdirs();
			}
			@Pc(192) File[] local192 = aFile3.listFiles();
			if (local192 == null) {
				break;
			}
			@Pc(196) File[] local196 = local192;
			local198 = 0;
			while (true) {
				if (local198 >= local196.length) {
					break label131;
				}
				@Pc(206) File local206 = local196[local198];
				if (!this.method25262(local206, false, 1249610280)) {
					local173++;
					break;
				}
				local198++;
			}
		}
		Class289.method26921(aFile3, 1871171583);
		Class647.method33052(-427404592);
		aClass36_6 = new Class36(new Class40(Class292.method26945("main_file_cache.dat2", (byte) 16), "rw", 3221225472L), 5200, 0);
		aClass36_5 = new Class36(new Class40(Class292.method26945("main_file_cache.idx255", (byte) 16), "rw", 1048576L), 6000, 0);
		Class203.aClass36Array1 = new Class36[Class331.anInt4192 * 720876537];
		for (local173 = 0; local173 < Class331.anInt4192 * 720876537; local173++) {
			Class203.aClass36Array1[local173] = new Class36(new Class40(Class292.method26945("main_file_cache.idx" + local173, (byte) 16), "rw", 1048576L), 6000, 0);
		}
		try {
			Class518.aClass14_1 = new Class14();
		} catch (@Pc(294) Exception local294) {
			Class13.aBoolean5 = false;
		}
		Class365.aClass555_1 = new Class555();
		@Pc(303) ThreadGroup local303 = Thread.currentThread().getThreadGroup();
		for (@Pc(306) ThreadGroup local306 = local303.getParent(); local306 != null; local306 = local306.getParent()) {
			local303 = local306;
		}
		@Pc(317) Thread[] local317 = new Thread[1000];
		local303.enumerate(local317);
		for (local198 = 0; local198 < local317.length; local198++) {
			if (local317[local198] != null && local317[local198].getName().startsWith("AWT")) {
				local317[local198].setPriority(1);
			}
		}
		@Pc(350) Thread local350 = new Thread(this);
		local350.setDaemon(true);
		local350.start();
		local350.setPriority(1);
	}

	@OriginalMember(owner = "client!sm", name = "bs", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V")
	final void method25229(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class331.anInt4192 = arg3 * 253402697;
		Class93.anInt329 = arg2 * 808739727;
		RuntimeException_Sub4.anInt3268 = arg4 * -1825691279;
		Class349.anInt4254 = arg5 * -1969717623;
		Class342.aString190 = "Unknown";
		Class601.aString231 = "1.1";
		try {
			Class342.aString190 = System.getProperty("java.vendor");
			Class601.aString231 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			aString140 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			aString140 = "Unknown";
		}
		Class450.aString209 = aString140.toLowerCase();
		try {
			Class103_Sub22.aString44 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class103_Sub22.aString44 = "";
		}
		try {
			Class505.aString216 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class505.aString216 = "";
		}
		try {
			Class588.aString227 = System.getProperty("user.home");
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class450.aString209.startsWith("win")) {
				if (Class588.aString227 == null) {
					Class588.aString227 = System.getenv("USERPROFILE");
				}
			} else if (Class588.aString227 == null) {
				Class588.aString227 = System.getenv("HOME");
			}
			if (Class588.aString227 != null) {
				Class588.aString227 = Class588.aString227 + "/";
			}
		} catch (@Pc(98) Exception local98) {
		}
		if (Class588.aString227 == null) {
			Class588.aString227 = "~/";
		}
		try {
			Class166.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(107) Throwable local107) {
		}
		Class501.aStringArray31 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class588.aString227, "/tmp/", "" };
		Class112.aStringArray13 = new String[] { ".jagex_cache_" + Class93.anInt329 * 1095457647, ".file_store_" + Class93.anInt329 * 1095457647 };
		@Pc(173) int local173 = 0;
		@Pc(198) int local198;
		label131: while (local173 < 4) {
			aFile3 = this.method25185(arg0, arg1, local173, -669957871);
			if (!aFile3.exists()) {
				aFile3.mkdirs();
			}
			@Pc(192) File[] local192 = aFile3.listFiles();
			if (local192 == null) {
				break;
			}
			@Pc(196) File[] local196 = local192;
			local198 = 0;
			while (true) {
				if (local198 >= local196.length) {
					break label131;
				}
				@Pc(206) File local206 = local196[local198];
				if (!this.method25262(local206, false, 1052693976)) {
					local173++;
					break;
				}
				local198++;
			}
		}
		Class289.method26921(aFile3, 1825852703);
		Class647.method33052(1512666516);
		aClass36_6 = new Class36(new Class40(Class292.method26945("main_file_cache.dat2", (byte) 16), "rw", 3221225472L), 5200, 0);
		aClass36_5 = new Class36(new Class40(Class292.method26945("main_file_cache.idx255", (byte) 16), "rw", 1048576L), 6000, 0);
		Class203.aClass36Array1 = new Class36[Class331.anInt4192 * 720876537];
		for (local173 = 0; local173 < Class331.anInt4192 * 720876537; local173++) {
			Class203.aClass36Array1[local173] = new Class36(new Class40(Class292.method26945("main_file_cache.idx" + local173, (byte) 16), "rw", 1048576L), 6000, 0);
		}
		try {
			Class518.aClass14_1 = new Class14();
		} catch (@Pc(294) Exception local294) {
			Class13.aBoolean5 = false;
		}
		Class365.aClass555_1 = new Class555();
		@Pc(303) ThreadGroup local303 = Thread.currentThread().getThreadGroup();
		for (@Pc(306) ThreadGroup local306 = local303.getParent(); local306 != null; local306 = local306.getParent()) {
			local303 = local306;
		}
		@Pc(317) Thread[] local317 = new Thread[1000];
		local303.enumerate(local317);
		for (local198 = 0; local198 < local317.length; local198++) {
			if (local317[local198] != null && local317[local198].getName().startsWith("AWT")) {
				local317[local198].setPriority(1);
			}
		}
		@Pc(350) Thread local350 = new Thread(this);
		local350.setDaemon(true);
		local350.start();
		local350.setPriority(1);
	}

	@OriginalMember(owner = "client!sm", name = "bj", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	final File method25230(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		Class86.aFile1 = new File(Class588.aString227, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(174) File local174;
		if (Class86.aFile1.exists()) {
			try {
				@Pc(50) Class40 local50 = new Class40(Class86.aFile1, "rw", 10000L);
				@Pc(58) Class80_Sub36 local58 = new Class80_Sub36((int) local50.method839((byte) 0));
				@Pc(84) int local84;
				while (local58.anInt3152 * -1380987821 < local58.aByteArray61.length) {
					local84 = local50.method832(local58.aByteArray61, local58.anInt3152 * -1380987821, local58.aByteArray61.length - local58.anInt3152 * -1380987821, (byte) -44);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.anInt3152 += local84 * 1034180571;
				}
				local58.anInt3152 = 0;
				local84 = local58.method23362(-36403430);
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.method23362(380492539);
				}
				if (local84 <= 2) {
					local36 = local58.method23186((byte) 12);
					if (local127 == 1) {
						local38 = local58.method23186((byte) 12);
					}
				} else {
					local36 = local58.method23192((byte) 0);
					if (local127 == 1) {
						local38 = local58.method23192((byte) 0);
					}
				}
				local50.method838(427589311);
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local174 = new File(local36);
				if (!local174.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local174 = new File(local36, "test.dat");
				if (!this.method25262(local174, true, 561600349)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(202) int local202 = 0; local202 < Class112.aStringArray13.length; local202++) {
				for (@Pc(208) int local208 = 0; local208 < Class501.aStringArray31.length; local208++) {
					@Pc(234) File local234 = new File(Class501.aStringArray31[local208] + Class112.aStringArray13[local202] + File.separatorChar + arg0 + File.separatorChar);
					if (local234.exists() && this.method25262(new File(local234, "test.dat"), true, -1325906989)) {
						local36 = local234.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class588.aString227 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(293) File local293 = new File(local38);
			local174 = new File(local36);
			try {
				@Pc(301) File[] local301 = local293.listFiles();
				@Pc(303) File[] local303 = local301;
				for (@Pc(305) int local305 = 0; local305 < local303.length; local305++) {
					@Pc(313) File local313 = local303[local305];
					@Pc(320) File local320 = new File(local174, local313.getName());
					@Pc(324) boolean local324 = local313.renameTo(local320);
					if (!local324) {
						throw new IOException();
					}
				}
			} catch (@Pc(334) Exception local334) {
				local334.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method25291(new File(local36), null, (short) -12952);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!sm", name = "ai", descriptor = "(B)V")
	abstract void method25231(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!sm", name = "bk", descriptor = "(Ljava/io/File;Ljava/io/File;)V")
	final void method25232(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class40 local6 = new Class40(Class86.aFile1, "rw", 10000L);
			@Pc(11) Class80_Sub36 local11 = new Class80_Sub36(500);
			local11.method23154(3, 1275868335);
			local11.method23154(arg1 == null ? 0 : 1, 1275868335);
			local11.method23167(arg0.getPath(), -387028605);
			if (arg1 != null) {
				local11.method23167(arg1.getPath(), -609578765);
			}
			local6.method834(local11.aByteArray61, 0, local11.anInt3152 * -1380987821, (byte) 1);
			local6.method838(-677152846);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sm", name = "bz", descriptor = "(Ljava/io/File;Z)Z")
	final boolean method25233(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "be", descriptor = "(Ljava/io/File;Z)Z")
	final boolean method25234(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "bh", descriptor = "(Ljava/io/File;Z)Z")
	final boolean method25235(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "co", descriptor = "()V")
	@Override
	public final void method25174() {
		if (!aBoolean699) {
			aLong349 = 0L;
		}
	}

	@OriginalMember(owner = "client!sm", name = "ba", descriptor = "(Lclient!sb;Ljava/lang/String;Ljava/lang/String;IIIIZ)V")
	final void method25236(@OriginalArg(0) Class545 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method25209(Class544.aClass544_4, arg7, 565874154);
			Class334.anInt4196 = (Class80_Sub1_Sub1.anInt254 = arg0.method31186(926833068) * -2011361969) * -1695404351;
			Class286.anInt3942 = (Class80_Sub25.anInt1627 = arg0.method31187((byte) 47) * -1341178817) * 240749719;
			anInt3415 = 0;
			anInt3417 = 0;
			if (Class651.method33131(-2049149400) == Class544.aClass544_5) {
				Class334.anInt4196 += arg0.method31188(1213327963) * -504204002;
				Class286.anInt3942 += arg0.method31189((short) 255) * 598473298;
				this.method25188(arg0.method31200((byte) -38), -1621505486);
			}
			Class476.anApplet2 = Class306.anApplet1;
			this.method25184(arg1, arg2, arg3, arg4, arg5, arg6, 2036747717);
		} catch (@Pc(67) Throwable local67) {
			Class603.method32133(null, local67, 839300151);
			this.method25206("crash", 1640829273);
		}
	}

	@OriginalMember(owner = "client!sm", name = "ci", descriptor = "(Z)V")
	final void method25242(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (aBoolean699) {
				return;
			}
			aBoolean699 = true;
		}
		try {
			this.method25205((byte) -117);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass36_6.method772((byte) 32);
			for (@Pc(28) int local28 = 0; local28 < Class331.anInt4192 * 720876537; local28++) {
				Class203.aClass36Array1[local28].method772((byte) 57);
			}
			aClass36_5.method772((byte) 12);
			aClass36_4.method772((byte) 99);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean704) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class568.method31528(-1557850606)) {
			Class588.method31902(350319923).method31856(-1957352985);
		}
		if (Class454.aCanvas6 != null) {
			try {
				Class454.aCanvas6.removeFocusListener(this);
				Class454.aCanvas6.getParent().remove(Class454.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class244.aFrame1 != null) {
			Class244.aFrame1.setVisible(false);
			Class244.aFrame1.dispose();
			Class244.aFrame1 = null;
		}
	}

	@OriginalMember(owner = "client!sm", name = "bq", descriptor = "(Ljava/lang/String;)V")
	final synchronized void method25246(@OriginalArg(0) String arg0) {
		Class244.aFrame1 = new Frame();
		Class244.aFrame1.setTitle(arg0);
		Class244.aFrame1.setResizable(true);
		Class244.aFrame1.addWindowListener(this);
		Class244.aFrame1.setBackground(Color.black);
		Class244.aFrame1.setVisible(true);
		Class244.aFrame1.toFront();
		@Pc(23) Insets local23 = Class244.aFrame1.getInsets();
		Class244.aFrame1.setSize(local23.left + Class334.anInt4196 * -455826321 + local23.right, Class286.anInt3942 * -1411780839 + local23.top + local23.bottom);
	}

	@OriginalMember(owner = "client!sm", name = "da", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25247(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "by", descriptor = "(Ljava/io/File;Ljava/io/File;)V")
	final void method25248(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class40 local6 = new Class40(Class86.aFile1, "rw", 10000L);
			@Pc(11) Class80_Sub36 local11 = new Class80_Sub36(500);
			local11.method23154(3, 1275868335);
			local11.method23154(arg1 == null ? 0 : 1, 1275868335);
			local11.method23167(arg0.getPath(), 1594855427);
			if (arg1 != null) {
				local11.method23167(arg1.getPath(), -715242733);
			}
			local6.method834(local11.aByteArray61, 0, local11.anInt3152 * -1380987821, (byte) 1);
			local6.method838(-1292443529);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sm", name = "cv", descriptor = "(Ljava/awt/Container;)V")
	final void method25249(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class454.aCanvas6);
		Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
		Class454.aCanvas6.setVisible(true);
		if (arg0 == Class244.aFrame1) {
			@Pc(26) Insets local26 = Class244.aFrame1.getInsets();
			Class454.aCanvas6.setLocation(local26.left + anInt3415 * 317681859, anInt3417 * -1044003729 + local26.top);
		} else {
			Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
		}
		Class454.aCanvas6.addFocusListener(this);
		Class454.aCanvas6.requestFocus();
		Class597.aBoolean926 = true;
		aBoolean698 = true;
		Class454.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean700 = true;
		aBoolean701 = false;
		aLong347 = Class303.method27111((byte) 88) * 7467997290225548157L;
	}

	@OriginalMember(owner = "client!sm", name = "aw", descriptor = "(Ljava/applet/Applet;)V")
	@Override
	public final void method25177(@OriginalArg(0) Applet arg0) {
		Class306.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "do", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25250(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "cy", descriptor = "()Z")
	final boolean method25251() {
		if (ClientConfig.SKIP_HOST_CHECK) {
			return true;
		}

		@Pc(4) String local4 = Class306.anApplet1.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.equals("stellardawn.com") || local4.endsWith(".stellardawn.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method25206("invalidhost", -242876040);
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "(ZI)V")
	final void method25252(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		synchronized (this) {
			if (aBoolean699) {
				return;
			}
			aBoolean699 = true;
		}
		try {
			this.method25205((byte) -47);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass36_6.method772((byte) 58);
			for (@Pc(28) int local28 = 0; local28 < Class331.anInt4192 * 720876537; local28++) {
				Class203.aClass36Array1[local28].method772((byte) 124);
			}
			aClass36_5.method772((byte) 8);
			aClass36_4.method772((byte) 50);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean704) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class568.method31528(1177563659)) {
			Class588.method31902(350319923).method31856(-1752943221);
		}
		if (Class454.aCanvas6 != null) {
			try {
				Class454.aCanvas6.removeFocusListener(this);
				Class454.aCanvas6.getParent().remove(Class454.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class244.aFrame1 != null) {
			Class244.aFrame1.setVisible(false);
			Class244.aFrame1.dispose();
			Class244.aFrame1 = null;
		}
	}

	@OriginalMember(owner = "client!sm", name = "cc", descriptor = "()V")
	final void method25253() {
		if (Class342.aString190 != null) {
			@Pc(4) String local4 = Class342.aString190.toLowerCase();
			if (local4.indexOf("sun") != -1 || local4.indexOf("apple") != -1) {
				@Pc(16) String local16 = Class601.aString231;
				if (local16.equals("1.1") || local16.startsWith("1.1.") || local16.equals("1.2") || local16.startsWith("1.2.") || local16.equals("1.3") || local16.startsWith("1.3.") || local16.equals("1.4") || local16.startsWith("1.4.") || local16.equals("1.5") || local16.startsWith("1.5.") || local16.equals("1.6.0")) {
					this.method25206("wrongjava", -798123447);
					return;
				}
				if (local16.startsWith("1.6.0_")) {
					@Pc(71) int local71;
					for (local71 = 6; local71 < local16.length() && Class650.method33124(local16.charAt(local71), -1992260872); local71++) {
					}
					@Pc(88) String local88 = local16.substring(6, local71);
					if (Class698.method37062(local88, (short) -19267) && Class679.method33621(local88, 1849961235) < 10) {
						this.method25206("wrongjava", 329509230);
						return;
					}
				}
			}
		}
		Class60.method1187(-1819201663).setFocusCycleRoot(true);
		anInt3423 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 1697078989;
		anInt3412 = Runtime.getRuntime().availableProcessors() * -1356892559;
		this.method25304(2146657891);
		this.method25202((byte) 86);
		aClass146_2 = Class257.method26425((short) -18441);
		while (aLong349 * 6145620734226936405L == 0L || Class303.method27111((byte) 84) < aLong349 * 6145620734226936405L) {
			anInt3421 = aClass146_2.method13854(aLong346 * -4113900210149837993L) * -1350095131;
			for (@Pc(153) int local153 = 0; local153 < anInt3421 * -830218515; local153++) {
				this.method25193((byte) 10);
			}
			this.method25200(2060903041);
			Class643.method33030(Class454.aCanvas6, 386071135);
		}
	}

	@OriginalMember(owner = "client!sm", name = "cs", descriptor = "()V")
	final void method25256() {
		@Pc(2) long local2 = Class303.method27111((byte) 107);
		@Pc(8) long local8 = aLongArray21[Class598.anInt5364 * 1176676047];
		aLongArray21[Class598.anInt5364 * 1176676047] = local2;
		Class598.anInt5364 = (Class598.anInt5364 * 1176676047 + 1 & 0x1F) * 721330223;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class597.aBoolean926 = aBoolean698;
		}
		this.method25231((byte) 115);
	}

	@OriginalMember(owner = "client!sm", name = "cj", descriptor = "()V")
	final void method25257() {
		@Pc(2) long local2 = Class303.method27111((byte) 18);
		@Pc(12) long local12 = aLongArray22[anInt3416 * 1292481899 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray22[anInt3416 * 1292481899];
		aLongArray22[anInt3416 * 1292481899] = local2;
		anInt3416 = (anInt3416 * 1292481899 + 1 & 0x1F) * -1555247293;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3414 = (int) (local2 - local12) * 1011081901;
			anInt3413 = ((local47 >> 1) + 32000) / local47 * -251533151;
		}
		if ((anInt3418 += -377349701) * 219136883 - 1 > 50) {
			anInt3418 -= -1687615866;
			aBoolean700 = true;
			Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			Class454.aCanvas6.setVisible(true);
			if (Class244.aFrame1 != null && Class411.aFrame2 == null) {
				@Pc(100) Insets local100 = Class244.aFrame1.getInsets();
				Class454.aCanvas6.setLocation(anInt3415 * 317681859 + local100.left, local100.top + anInt3417 * -1044003729);
			} else {
				Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
			}
		}
		this.method25204((byte) 0);
	}

	@OriginalMember(owner = "client!sm", name = "dm", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25258(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ca", descriptor = "()V")
	final void method25259() {
		@Pc(2) long local2 = Class303.method27111((byte) 120);
		@Pc(12) long local12 = aLongArray22[anInt3416 * 1292481899 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray22[anInt3416 * 1292481899];
		aLongArray22[anInt3416 * 1292481899] = local2;
		anInt3416 = (anInt3416 * 1292481899 + 1 & 0x1F) * -1555247293;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3414 = (int) (local2 - local12) * 1011081901;
			anInt3413 = ((local47 >> 1) + 32000) / local47 * -251533151;
		}
		if ((anInt3418 += -377349701) * 219136883 - 1 > 50) {
			anInt3418 -= -1687615866;
			aBoolean700 = true;
			Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			Class454.aCanvas6.setVisible(true);
			if (Class244.aFrame1 != null && Class411.aFrame2 == null) {
				@Pc(100) Insets local100 = Class244.aFrame1.getInsets();
				Class454.aCanvas6.setLocation(anInt3415 * 317681859 + local100.left, local100.top + anInt3417 * -1044003729);
			} else {
				Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
			}
		}
		this.method25204((byte) 0);
	}

	@OriginalMember(owner = "client!sm", name = "cr", descriptor = "(Z)V")
	final void method25260(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (aBoolean699) {
				return;
			}
			aBoolean699 = true;
		}
		try {
			this.method25205((byte) -41);
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass36_6.method772((byte) 95);
			for (@Pc(28) int local28 = 0; local28 < Class331.anInt4192 * 720876537; local28++) {
				Class203.aClass36Array1[local28].method772((byte) 103);
			}
			aClass36_5.method772((byte) 42);
			aClass36_4.method772((byte) 66);
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean704) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class568.method31528(-699669486)) {
			Class588.method31902(350319923).method31856(-1018503692);
		}
		if (Class454.aCanvas6 != null) {
			try {
				Class454.aCanvas6.removeFocusListener(this);
				Class454.aCanvas6.getParent().remove(Class454.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class244.aFrame1 != null) {
			Class244.aFrame1.setVisible(false);
			Class244.aFrame1.dispose();
			Class244.aFrame1 = null;
		}
	}

	@OriginalMember(owner = "client!sm", name = "cz", descriptor = "()V")
	@Override
	public final void method25169() {
		if (!aBoolean699) {
			aLong349 = 0L;
		}
	}

	@OriginalMember(owner = "client!sm", name = "dt", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25261(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = false;
	}

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "(Ljava/io/File;ZI)Z")
	final boolean method25262(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "es", descriptor = "(Lclient!sa;Z)V")
	final void method25267(@OriginalArg(0) Class544 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class544.aClass544_4 == arg0 || Class544.aClass544_3 == arg0) {
			aClass544_2 = arg0;
			if (aClass544_2 != Class544.aClass544_3 && arg1) {
				aClass544_2 = Class544.aClass544_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "dw", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25270(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = false;
	}

	@OriginalMember(owner = "client!sm", name = "df", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25271(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = true;
		aBoolean700 = true;
	}

	@OriginalMember(owner = "client!sm", name = "dg", descriptor = "()V")
	@Override
	public final void method25173() {
		if (!aBoolean699) {
			aLong349 = Class303.method27111((byte) 46) * 8365306696112028413L;
			Class217.method25866(5000L);
			this.method25252(false, -1341874033);
		}
	}

	@OriginalMember(owner = "client!sm", name = "dd", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void method25180(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "dc", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void method25178(@OriginalArg(0) Graphics arg0) {
		if (aBoolean699) {
			return;
		}
		aBoolean700 = true;
		if (Class303.method27111((byte) 97) - aLong347 * -7402167867988945451L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class334.anInt4196 * -455826321 && local16.height >= Class286.anInt3942 * -1411780839) {
				aBoolean701 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "dn", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void method25179(@OriginalArg(0) Graphics arg0) {
		if (aBoolean699) {
			return;
		}
		aBoolean700 = true;
		if (Class303.method27111((byte) 34) - aLong347 * -7402167867988945451L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class334.anInt4196 * -455826321 && local16.height >= Class286.anInt3942 * -1411780839) {
				aBoolean701 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "db", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25274(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = true;
		aBoolean700 = true;
	}

	@OriginalMember(owner = "client!sm", name = "cq", descriptor = "()V")
	@Override
	public final void method25176() {
		if (!aBoolean699) {
			aLong349 = (Class303.method27111((byte) 126) + 4000L) * 8365306696112028413L;
		}
	}

	@OriginalMember(owner = "client!sm", name = "du", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25275(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = false;
	}

	@OriginalMember(owner = "client!sm", name = "ds", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25276(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = false;
	}

	@OriginalMember(owner = "client!sm", name = "cn", descriptor = "()V")
	final void method25277() {
		if (Class454.aCanvas6 != null) {
			Class454.aCanvas6.removeFocusListener(this);
			Class454.aCanvas6.getParent().setBackground(Color.black);
			Class454.aCanvas6.getParent().remove(Class454.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!sm", name = "dr", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25278(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "dx", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25279(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "de", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25280(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ct", descriptor = "(Ljava/awt/Container;)V")
	final void method25281(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class454.aCanvas6);
		Class454.aCanvas6.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
		Class454.aCanvas6.setVisible(true);
		if (arg0 == Class244.aFrame1) {
			@Pc(26) Insets local26 = Class244.aFrame1.getInsets();
			Class454.aCanvas6.setLocation(local26.left + anInt3415 * 317681859, anInt3417 * -1044003729 + local26.top);
		} else {
			Class454.aCanvas6.setLocation(anInt3415 * 317681859, anInt3417 * -1044003729);
		}
		Class454.aCanvas6.addFocusListener(this);
		Class454.aCanvas6.requestFocus();
		Class597.aBoolean926 = true;
		aBoolean698 = true;
		Class454.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean700 = true;
		aBoolean701 = false;
		aLong347 = Class303.method27111((byte) 86) * 7467997290225548157L;
	}

	@OriginalMember(owner = "client!sm", name = "dq", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25283(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "dp", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25284(@OriginalArg(0) WindowEvent arg0) {
		aBoolean702 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!sm", name = "dj", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25285(@OriginalArg(0) WindowEvent arg0) {
		aBoolean702 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!sm", name = "di", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25286(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "dz", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25287(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "dy", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25288(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "er", descriptor = "(Lclient!sa;Z)V")
	final void method25289(@OriginalArg(0) Class544 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class544.aClass544_4 == arg0 || Class544.aClass544_3 == arg0) {
			aClass544_2 = arg0;
			if (aClass544_2 != Class544.aClass544_3 && arg1) {
				aClass544_2 = Class544.aClass544_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "dk", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25290(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "(Ljava/io/File;Ljava/io/File;S)V")
	final void method25291(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1, @OriginalArg(2) short arg2) {
		try {
			@Pc(6) Class40 local6 = new Class40(Class86.aFile1, "rw", 10000L);
			@Pc(11) Class80_Sub36 local11 = new Class80_Sub36(500);
			local11.method23154(3, 1275868335);
			local11.method23154(arg1 == null ? 0 : 1, 1275868335);
			local11.method23167(arg0.getPath(), 430601841);
			if (arg1 != null) {
				local11.method23167(arg1.getPath(), 1249630742);
			}
			local6.method834(local11.aByteArray61, 0, local11.anInt3152 * -1380987821, (byte) 1);
			local6.method838(-1718462911);
		} catch (@Pc(52) IOException local52) {
			local52.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sm", name = "ev", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25292(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25293(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "eo", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25294(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ep", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25295(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "ew", descriptor = "()V")
	public abstract void method25170();

	@OriginalMember(owner = "client!sm", name = "ee", descriptor = "()V")
	public abstract void method25181();

	@OriginalMember(owner = "client!sm", name = "dl", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public final void method25296(@OriginalArg(0) FocusEvent arg0) {
		aBoolean698 = true;
		aBoolean700 = true;
	}

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "(I)Ljava/lang/String;")
	String method25297(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "et", descriptor = "()V")
	public final void method25298() throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", -131060958);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "dh", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void method25175(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "ea", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	final void method25299(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class64.method1221(Class306.anApplet1, "loggedout", 20937170);
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!sm", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "el", descriptor = "()V")
	public final void method25300() throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", -1101999262);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "dv", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void method25301(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "eu", descriptor = "()V")
	public final void method25302() throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", 61756834);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "em", descriptor = "()V")
	public final void method25303() throws Exception_Sub7 {
		if (this.aBoolean704) {
			return;
		}
		Class588.method31902(350319923).method31859("jaclib", 1452565618);
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class450.aString209.startsWith("win")) {
				throw new Exception_Sub7(128, "jaclib");
			}
		}
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "(I)V")
	final synchronized void method25304(@OriginalArg(0) int arg0) {
		this.method25190((byte) 39);
		@Pc(5) Container local5 = Class60.method1187(-2018745327);
		Class454.aCanvas6 = new Canvas_Sub1(local5);
		this.method25227(local5, (byte) -69);
	}

	@OriginalMember(owner = "client!sm", name = "en", descriptor = "(Lclient!sa;Z)V")
	final void method25305(@OriginalArg(0) Class544 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class544.aClass544_4 == arg0 || Class544.aClass544_3 == arg0) {
			aClass544_2 = arg0;
			if (aClass544_2 != Class544.aClass544_3 && arg1) {
				aClass544_2 = Class544.aClass544_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "ex", descriptor = "(Lclient!sa;Z)V")
	final void method25306(@OriginalArg(0) Class544 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class544.aClass544_4 == arg0 || Class544.aClass544_3 == arg0) {
			aClass544_2 = arg0;
			if (aClass544_2 != Class544.aClass544_3 && arg1) {
				aClass544_2 = Class544.aClass544_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "ad", descriptor = "()V")
	abstract void method25307();
}
