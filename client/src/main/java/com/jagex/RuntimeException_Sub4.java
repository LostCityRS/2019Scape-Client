package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aty")
public final class RuntimeException_Sub4 extends RuntimeException {

	@OriginalMember(owner = "client!aty", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString124;

	@OriginalMember(owner = "client!aty", name = "u", descriptor = "I")
	public static int anInt3268;

	@OriginalMember(owner = "client!aty", name = "f", descriptor = "J")
	static long aLong331;

	@OriginalMember(owner = "client!aty", name = "i", descriptor = "Lclient!rv;")
	static Interface59 anInterface59_1 = null;

	@OriginalMember(owner = "client!aty", name = "m", descriptor = "Ljava/lang/String;")
	String aString123;

	@OriginalMember(owner = "client!aty", name = "o", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "client!aty", name = "m", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;")
	static String method24085(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub4) {
			@Pc(5) RuntimeException_Sub4 local5 = (RuntimeException_Sub4) arg0;
			local15 = local5.aString123 + " | ";
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

	@OriginalMember(owner = "client!aty", name = "i", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;")
	static String method24086(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub4) {
			@Pc(5) RuntimeException_Sub4 local5 = (RuntimeException_Sub4) arg0;
			local15 = local5.aString123 + " | ";
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

	@OriginalMember(owner = "client!aty", name = "g", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!aty;")
	public static RuntimeException_Sub4 method24087(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub4 local5;
		if (arg0 instanceof RuntimeException_Sub4) {
			local5 = (RuntimeException_Sub4) arg0;
			local5.aString123 = local5.aString123 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub4(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!aty", name = "o", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;")
	static String method24088(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub4) {
			@Pc(5) RuntimeException_Sub4 local5 = (RuntimeException_Sub4) arg0;
			local15 = local5.aString123 + " | ";
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

	@OriginalMember(owner = "client!aty", name = "j", descriptor = "(Ljava/lang/Throwable;)Ljava/lang/String;")
	static String method24089(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub4) {
			@Pc(5) RuntimeException_Sub4 local5 = (RuntimeException_Sub4) arg0;
			local15 = local5.aString123 + " | ";
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

	@OriginalMember(owner = "client!aty", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	static String method24090(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aty", name = "s", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	static String method24091(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aty", name = "k", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	static String method24092(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aty", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	RuntimeException_Sub4(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString123 = arg1;
		this.aThrowable1 = arg0;
		this.initCause(arg0);
	}
}
