package com.jagex;

import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public class Class314 {

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	static final int anInt4060 = 4;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	static final int anInt4061 = 256;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	static final int anInt4062 = 2;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "J")
	static long aLong258;

	@OriginalMember(owner = "client!hj", name = "ae", descriptor = "I")
	static int anInt4063;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/lang/String;")
	String aString169;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "[Lclient!hv;")
	Class325[] aClass325Array1;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lclient!hv;")
	Class325[] aClass325Array2;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "[Lclient!hn;")
	Class318[] aClass318Array1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V", line = 13)
	public Class314(@OriginalArg(0) byte[] arg0) throws Exception_Sub6 {
		this.method26934(arg0, (byte) 42);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)[Lclient!zx;", line = 17)
	public static Class721[] method26933(@OriginalArg(0) int arg0) {
		return new Class721[] { Class721.aClass721_2, Class721.aClass721_7, Class721.aClass721_6, Class721.aClass721_5, Class721.aClass721_4, Class721.aClass721_3 };
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "([BB)V", line = 18)
	void method26934(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) throws Exception_Sub6 {
		@Pc(4) Class326 local4 = new Class326(arg0);
		@Pc(8) int local8 = local4.method27305(746793277);
		if (local8 != 4) {
			throw new Exception_Sub6(this, local8, 4);
		}
		this.aString169 = local4.method27309(-105563396);
		this.aClass325Array1 = new Class325[local4.method27305(2096003037)];
		this.aClass325Array2 = new Class325[local4.method27305(331468520)];
		this.aClass318Array1 = new Class318[local4.method27305(865351252)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass325Array1.length; local43++) {
			this.aClass325Array1[local43] = new Class325();
			this.aClass325Array1[local43].method27296(local4, -797357180);
		}
		for (local43 = 0; local43 < this.aClass325Array2.length; local43++) {
			this.aClass325Array2[local43] = new Class325();
			this.aClass325Array2[local43].method27296(local4, -44914593);
		}
		for (local43 = 0; local43 < this.aClass318Array1.length; local43++) {
			this.aClass318Array1[local43] = new Class318();
			this.aClass318Array1[local43].method27210(local4, -1902086529);
		}
	}

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "([B)V", line = 18)
	void method26935(@OriginalArg(0) byte[] arg0) throws Exception_Sub6 {
		@Pc(4) Class326 local4 = new Class326(arg0);
		@Pc(8) int local8 = local4.method27305(615827035);
		if (local8 != 4) {
			throw new Exception_Sub6(this, local8, 4);
		}
		this.aString169 = local4.method27309(-734875769);
		this.aClass325Array1 = new Class325[local4.method27305(832338755)];
		this.aClass325Array2 = new Class325[local4.method27305(376802913)];
		this.aClass318Array1 = new Class318[local4.method27305(1480841173)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass325Array1.length; local43++) {
			this.aClass325Array1[local43] = new Class325();
			this.aClass325Array1[local43].method27296(local4, 278618761);
		}
		for (local43 = 0; local43 < this.aClass325Array2.length; local43++) {
			this.aClass325Array2[local43] = new Class325();
			this.aClass325Array2[local43].method27296(local4, -1915647531);
		}
		for (local43 = 0; local43 < this.aClass318Array1.length; local43++) {
			this.aClass318Array1[local43] = new Class318();
			this.aClass318Array1[local43].method27210(local4, -1340494005);
		}
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "([B)V", line = 18)
	void method26936(@OriginalArg(0) byte[] arg0) throws Exception_Sub6 {
		@Pc(4) Class326 local4 = new Class326(arg0);
		@Pc(8) int local8 = local4.method27305(820835501);
		if (local8 != 4) {
			throw new Exception_Sub6(this, local8, 4);
		}
		this.aString169 = local4.method27309(-2099154606);
		this.aClass325Array1 = new Class325[local4.method27305(1632339282)];
		this.aClass325Array2 = new Class325[local4.method27305(1565850658)];
		this.aClass318Array1 = new Class318[local4.method27305(742247751)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass325Array1.length; local43++) {
			this.aClass325Array1[local43] = new Class325();
			this.aClass325Array1[local43].method27296(local4, -1565838935);
		}
		for (local43 = 0; local43 < this.aClass325Array2.length; local43++) {
			this.aClass325Array2[local43] = new Class325();
			this.aClass325Array2[local43].method27296(local4, -1898520314);
		}
		for (local43 = 0; local43 < this.aClass318Array1.length; local43++) {
			this.aClass318Array1[local43] = new Class318();
			this.aClass318Array1[local43].method27210(local4, -1812328312);
		}
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "([B)V", line = 18)
	void method26937(@OriginalArg(0) byte[] arg0) throws Exception_Sub6 {
		@Pc(4) Class326 local4 = new Class326(arg0);
		@Pc(8) int local8 = local4.method27305(713327371);
		if (local8 != 4) {
			throw new Exception_Sub6(this, local8, 4);
		}
		this.aString169 = local4.method27309(1509989241);
		this.aClass325Array1 = new Class325[local4.method27305(351632704)];
		this.aClass325Array2 = new Class325[local4.method27305(1316698116)];
		this.aClass318Array1 = new Class318[local4.method27305(1797268857)];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass325Array1.length; local43++) {
			this.aClass325Array1[local43] = new Class325();
			this.aClass325Array1[local43].method27296(local4, -185708465);
		}
		for (local43 = 0; local43 < this.aClass325Array2.length; local43++) {
			this.aClass325Array2[local43] = new Class325();
			this.aClass325Array2[local43].method27296(local4, -73379804);
		}
		for (local43 = 0; local43 < this.aClass318Array1.length; local43++) {
			this.aClass318Array1[local43] = new Class318();
			this.aClass318Array1[local43].method27210(local4, -1918774982);
		}
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)I", line = 74)
	public static int method26938(@OriginalArg(0) int arg0) {
		@Pc(2) Class54_Sub1 local2 = Class319.method27218((byte) -34);
		Class129.method21470(local2, (byte) -4);
		return local2.method14854(2032075540);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 260)
	public static void method26939(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class518.aStringArray31 == null) {
			Class555.method31053((short) -21040);
		}
		client.aCalendar3.setTime(new Date(Class305.method26797(187582194)));
		@Pc(14) int local14 = client.aCalendar3.get(11);
		@Pc(18) int local18 = client.aCalendar3.get(12);
		@Pc(22) int local22 = client.aCalendar3.get(13);
		@Pc(56) String local56 = Integer.toString(local14 / 10) + local14 % 10 + ":" + local18 / 10 + local18 % 10 + ":" + local22 / 10 + local22 % 10;
		@Pc(61) String[] local61 = client.method24953(arg0, '\n', 2117367530);
		for (@Pc(63) int local63 = 0; local63 < local61.length; local63++) {
			for (@Pc(71) int local71 = Class168.anInt2442 * -227471249; local71 > 0; local71--) {
				Class518.aStringArray31[local71] = Class518.aStringArray31[local71 - 1];
			}
			Class518.aStringArray31[0] = local56 + ": " + local61[local63];
			if (Class168.aFileOutputStream1 != null) {
				try {
					Class168.aFileOutputStream1.write(Class269.method26271(Class518.aStringArray31[0] + "\n", (byte) -126));
				} catch (@Pc(117) IOException local117) {
				}
			}
			if (Class168.anInt2442 * -227471249 < Class518.aStringArray31.length - 1) {
				Class168.anInt2442 += -58044785;
				if (Class168.anInt2446 * 1637474717 > 0) {
					Class168.anInt2446 += 2042014901;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "(Lclient!alw;I)V", line = 411)
	public static void getUid192(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			Class553.aClass42_4.method819(0L);
			Class553.aClass42_4.method825(local2, -1632071155);
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
		arg0.pdata(local2, 0, 24, 2026842986);
	}

	@OriginalMember(owner = "client!hj", name = "ey", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;IIIII)V", line = 654)
	static void method26941(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4108 * -664150941 != 0) {
			arg0.method20469(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4108 * -664150941, (byte) 48);
		}
		if (arg2.anInt4109 * 989664399 != 0) {
			arg0.method20465(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4109 * 989664399, 1176708304);
		}
		@Pc(61) int local61 = arg2.anInt4099 * 2016508123;
		if (arg1.aBoolean340 && arg2.anInt4103 * -283861829 != -1) {
			local61 = arg2.anInt4103 * -283861829;
		}
		Class171.aClass106_9.method7534(arg2.aString174, arg3, arg4, arg6, arg5, local61 | 0xFF000000, Class159_Sub1.aClass637_2.anInt5738 * 2079115473, 1, 0, 0, null, null, null, 0, 0, (short) 657);
	}

	@OriginalMember(owner = "client!hj", name = "lu", descriptor = "(Lclient!hf;Lclient!yf;I)V", line = 7068)
	static final void method26942(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) byte local1 = 10;
		Class348.method27622(arg0, local1, arg1, 542183118);
	}

	@OriginalMember(owner = "client!hj", name = "ban", descriptor = "(Lclient!yf;B)V", line = 14344)
	static final void method26943(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
