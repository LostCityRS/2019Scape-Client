package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atc")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!atc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString116;

	@OriginalMember(owner = "client!atc", name = "m", descriptor = "I")
	public static int anInt3188;

	@OriginalMember(owner = "client!atc", name = "k", descriptor = "I")
	public static int anInt3189;

	@OriginalMember(owner = "client!atc", name = "e", descriptor = "J")
	static long aLong210;

	@OriginalMember(owner = "client!atc", name = "w", descriptor = "Lclient!rr;")
	static Interface59 anInterface59_1 = null;

	@OriginalMember(owner = "client!atc", name = "l", descriptor = "Ljava/lang/String;")
	String aString115;

	@OriginalMember(owner = "client!atc", name = "u", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "client!atc", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	static String method23325(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!atc", name = "w", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method23326(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class166_Sub35.method16241(arg1, Integer.MIN_VALUE);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class273.method26422(local1, (short) 1698);
			local1 = Class25_Sub2.method16033(local1, (byte) 73);
			@Pc(41) URL local41 = null;
			if (Class69.anApplet1 != null) {
				local41 = Class69.anApplet1.getCodeBase();
			} else if (anInterface59_1 != null) {
				local41 = anInterface59_1.method30938((byte) 35);
			}
			if (local41 == null) {
				return;
			}
			@Pc(60) String local60 = "Unknown";
			@Pc(62) String local62 = "1.1";
			try {
				local60 = System.getProperty("java.vendor");
				local62 = System.getProperty("java.version");
			} catch (@Pc(70) Exception local70) {
			}
			@Pc(126) URL local126 = new URL(local41, "clienterror.ws?c=" + anInt3188 * 978703369 + "&cs=" + anInt3189 * -1468759271 + "&u=" + (aString116 == null ? "" + aLong210 * -7577937061430114655L : Class25_Sub2.method16033(aString116, (byte) 73)) + "&v1=" + Class25_Sub2.method16033(local60, (byte) 73) + "&v2=" + Class25_Sub2.method16033(local62, (byte) 73) + "&e=" + local1);
			@Pc(132) DataInputStream local132 = new DataInputStream(local126.openStream());
			local132.read();
			local132.close();
		} catch (@Pc(139) Exception local139) {
			local139.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!atc", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method23327(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class166_Sub35.method16241(arg1, Integer.MIN_VALUE);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class273.method26422(local1, (short) 10559);
			local1 = Class25_Sub2.method16033(local1, (byte) 73);
			@Pc(41) URL local41 = null;
			if (Class69.anApplet1 != null) {
				local41 = Class69.anApplet1.getCodeBase();
			} else if (anInterface59_1 != null) {
				local41 = anInterface59_1.method30938((byte) -38);
			}
			if (local41 == null) {
				return;
			}
			@Pc(60) String local60 = "Unknown";
			@Pc(62) String local62 = "1.1";
			try {
				local60 = System.getProperty("java.vendor");
				local62 = System.getProperty("java.version");
			} catch (@Pc(70) Exception local70) {
			}
			@Pc(126) URL local126 = new URL(local41, "clienterror.ws?c=" + anInt3188 * 978703369 + "&cs=" + anInt3189 * -1468759271 + "&u=" + (aString116 == null ? "" + aLong210 * -7577937061430114655L : Class25_Sub2.method16033(aString116, (byte) 73)) + "&v1=" + Class25_Sub2.method16033(local60, (byte) 73) + "&v2=" + Class25_Sub2.method16033(local62, (byte) 73) + "&e=" + local1);
			@Pc(132) DataInputStream local132 = new DataInputStream(local126.openStream());
			local132.read();
			local132.close();
		} catch (@Pc(139) Exception local139) {
			local139.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!atc", name = "u", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;")
	static String method23328(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString115 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(59) int local59 = local52.indexOf(40);
			@Pc(66) int local66 = local52.indexOf(41, local59 + 1);
			@Pc(74) String local74;
			if (local59 == -1) {
				local74 = local52;
			} else {
				local74 = local52.substring(0, local59);
			}
			local74 = local74.trim();
			local74 = local74.substring(local74.lastIndexOf(32) + 1);
			local74 = local74.substring(local74.lastIndexOf(9) + 1);
			local15 = local15 + local74;
			if (local59 != -1 && local66 != -1) {
				@Pc(116) int local116 = local52.indexOf(".java:", local59);
				if (local116 >= 0) {
					local15 = local15 + local52.substring(local116 + 5, local66);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!atc", name = "z", descriptor = "(Ljava/lang/String;)V")
	static void method23329(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class618.method32285(arg0, "%0a", "\n", 1982197956));
	}

	@OriginalMember(owner = "client!atc", name = "p", descriptor = "(Ljava/lang/String;)V")
	static void method23330(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class618.method32285(arg0, "%0a", "\n", 2001549993));
	}

	@OriginalMember(owner = "client!atc", name = "c", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	static String method23331(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!atc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString115 = arg1;
		this.aThrowable1 = arg0;
		this.initCause(arg0);
	}
}
