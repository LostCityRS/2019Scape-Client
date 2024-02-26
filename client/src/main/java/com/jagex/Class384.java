package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@OriginalClass("client!kp")
public final class Class384 implements Runnable {

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "Lclient!adw;")
	static Class90 aClass90_1;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Z")
	volatile boolean aBoolean852;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Ljava/lang/Thread;")
	Thread aThread8;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "[Lclient!kr;")
	Class386[] aClass386Array1;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "(IB)Lclient!jk;")
	public static Class362 method28588(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == Class362.aClass362_1.anInt4493 * -1928048299) {
			return Class362.aClass362_1;
		} else if (Class362.aClass362_2.anInt4493 * -1928048299 == arg0) {
			return Class362.aClass362_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)I")
	public static int method28589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kp", name = "vn", descriptor = "(Lclient!yp;I)V")
	static void method28590(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(37) String local37 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13 == 99) {
			Class294.method26961(local37, 1455295997);
		} else if (local13 == 98) {
			Class454.method29302(local37, -56836658);
		} else {
			Class255.method26406(local13, local23, "", "", "", local37, null, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!kp", name = "ady", descriptor = "(Lclient!yp;B)V")
	static void method28591(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class504.aClass110_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(J)Ljava/lang/String;")
	static String method28592(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) long local21 = arg0; local21 != 0L; local21 /= 37L) {
				local19++;
			}
			@Pc(36) StringBuilder local36 = new StringBuilder(local19);
			while (arg0 != 0L) {
				@Pc(42) long local42 = arg0;
				arg0 /= 37L;
				@Pc(55) char local55 = Class717.aCharArray9[(int) (local42 - arg0 * 37L)];
				if (local55 == '_') {
					@Pc(63) int local63 = local36.length() - 1;
					local36.setCharAt(local63, Character.toUpperCase(local36.charAt(local63)));
					local55 = ' ';
				}
				local36.append(local55);
			}
			local36.reverse();
			local36.setCharAt(0, Character.toUpperCase(local36.charAt(0)));
			return local36.toString();
		}
	}

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "(IILclient!hx;Lclient!cg;III)V")
	static void method28593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class120_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method19061(424288671) && !local16.aClass668_1.method33486((short) -8965) && local16 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local16.aByte99) {
				@Pc(40) Class463 local40 = local16.method24552().aClass463_61;
				@Pc(50) int local50 = (int) local40.aFloat297 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat296 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3573 * 975306769; local64++) {
					@Pc(73) Class676 local73 = client.aClass676Array1[local64];
					if (local16.aString73.equals(local73.aString236) && local73.anInt5740 * 922507867 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class274.anInt3924 * -912877411; local93++) {
					if (local16.aString73.equals(Class14.aClass164Array1[local93].aString64)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 != 0 && local16.anInt2708 * 1960918119 != 0 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == local16.anInt2708 * 1960918119) {
					local113 = true;
				}
				if (local16.aClass672_1 != null && local16.aClass672_1.anInt5712 * 1260077339 != -1 && ((Class335) Class460.aClass41_Sub2_1.method18054(local16.aClass672_1.anInt5712 * 1260077339, -329221453)).aBoolean829) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[1], 1460563788);
				} else if (Class289.aClass289_3 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[8], -1980471344);
				} else if (Class289.aClass289_4 == local16.aClass289_1) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[6], 515344995);
				} else if (local113) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[4], -174898543);
				} else if (local62) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[3], -1621304886);
				} else if (local16.aBoolean457) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[7], 1162779672);
				} else if (local91) {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[5], -2030515843);
				} else {
					Class174.method24632(arg2, arg3, arg4, arg5, local50, local60, Class697.aClass99Array9[2], 456295728);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "([BILjava/lang/CharSequence;I)I")
	public static int method28594(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= '\u007f') {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= '\u07ff') {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	Class384() {
	}

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "()V")
	public void method28580() {
		try {
			@Pc(8) int local8 = Class579.method31806(Class566.aClass697_1, Class720.aClass720_3, Class47.aClass28_4.anInt89 * 307612145, -1360958136);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class47.aClass28_4.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass722_4.anInt5829 * 1531299647)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass386Array1 = new Class386[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass386Array1[local83 / 3] = new Class386(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean852 = true;
	}

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "()V")
	public void method28581() {
		try {
			@Pc(8) int local8 = Class579.method31806(Class566.aClass697_1, Class720.aClass720_3, Class47.aClass28_4.anInt89 * 307612145, 805939681);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class47.aClass28_4.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass722_4.anInt5829 * 1531299647)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass386Array1 = new Class386[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass386Array1[local83 / 3] = new Class386(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean852 = true;
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(B)Z")
	boolean method28582(@OriginalArg(0) byte arg0) {
		if (this.aBoolean852) {
			return true;
		}
		if (this.aThread8 == null) {
			this.aThread8 = new Thread(this);
			this.aThread8.start();
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(8) int local8 = Class579.method31806(Class566.aClass697_1, Class720.aClass720_3, Class47.aClass28_4.anInt89 * 307612145, 1417209806);
			@Pc(42) BufferedReader local42 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class47.aClass28_4.aString4 + ":" + local8 + "/news.ws?game=" + client.aClass722_4.anInt5829 * 1531299647)).openStream())));
			@Pc(45) String local45 = local42.readLine();
			@Pc(49) ArrayList local49 = new ArrayList();
			while (local45 != null) {
				local49.add(local45);
				local45 = local42.readLine();
			}
			@Pc(64) String[] local64 = new String[local49.size()];
			local49.toArray(local64);
			if (local64.length % 3 != 0) {
				return;
			}
			this.aClass386Array1 = new Class386[local64.length / 3];
			for (@Pc(83) int local83 = 0; local83 < local64.length; local83 += 3) {
				this.aClass386Array1[local83 / 3] = new Class386(local64[local83], local64[local83 + 1], local64[local83 + 2]);
			}
		} catch (@Pc(113) IOException local113) {
		}
		this.aBoolean852 = true;
	}

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "()Z")
	boolean method28583() {
		if (this.aBoolean852) {
			return true;
		}
		if (this.aThread8 == null) {
			this.aThread8 = new Thread(this);
			this.aThread8.start();
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "(IB)Lclient!kr;")
	Class386 method28584(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass386Array1 == null || arg0 < 0 || arg0 >= this.aClass386Array1.length ? null : this.aClass386Array1[arg0];
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Lclient!kr;")
	Class386 method28585(@OriginalArg(0) int arg0) {
		return this.aClass386Array1 == null || arg0 < 0 || arg0 >= this.aClass386Array1.length ? null : this.aClass386Array1[arg0];
	}

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "()Z")
	boolean method28586() {
		if (this.aBoolean852) {
			return true;
		}
		if (this.aThread8 == null) {
			this.aThread8 = new Thread(this);
			this.aThread8.start();
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "()Z")
	boolean method28587() {
		if (this.aBoolean852) {
			return true;
		}
		if (this.aThread8 == null) {
			this.aThread8 = new Thread(this);
			this.aThread8.start();
		}
		return this.aBoolean852;
	}
}
