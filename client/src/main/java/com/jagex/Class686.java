package com.jagex;

import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yk")
public final class Class686 {

	@OriginalMember(owner = "client!yk", name = "q", descriptor = "Lclient!arz;")
	static Class80_Sub1_Sub11 aClass80_Sub1_Sub11_5;

	@OriginalMember(owner = "client!yk", name = "t", descriptor = "Lclient!eq;")
	static Class248 aClass248_1 = new Class248(128);

	@OriginalMember(owner = "client!yk", name = "i", descriptor = "()V")
	public static void method36793() {
		aClass248_1.method26332(1552803031);
	}

	@OriginalMember(owner = "client!yk", name = "l", descriptor = "()V")
	public static void method36794() {
		aClass248_1.method26332(1419813880);
	}

	@OriginalMember(owner = "client!yk", name = "j", descriptor = "(Lclient!ub;II)Lclient!asw;")
	static Class80_Sub1_Sub20 method36795(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt2028 * 2015367115 | arg1 << 10;
		@Pc(16) Class80_Sub1_Sub20 local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, -1259691132), 1472047355);
		if (local29 == null) {
			local8 = arg0.anInt2028 * 2015367115 | arg2 + 65536 << 10;
			local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, 272756500), 1472047355);
			if (local29 == null) {
				local8 = arg0.anInt2028 * 2015367115 | 0x3FFFC00;
				local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, -1655692610), 1472047355);
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class228.method25994(local29, 1041690981);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass158_70 = arg0;
					aClass248_1.method26330(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class228.method25994(local29, -796706780);
				} catch (@Pc(116) Exception local116) {
					throw new RuntimeException(local116.getMessage() + " " + local8);
				}
				local16.aClass158_70 = arg0;
				aClass248_1.method26330(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class228.method25994(local29, 697851684);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass158_70 = arg0;
			aClass248_1.method26330(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!yk", name = "m", descriptor = "()V")
	public static void method36796() {
		aClass248_1.method26332(-1930393091);
	}

	@OriginalMember(owner = "client!yk", name = "o", descriptor = "(I)Lclient!asw;")
	static Class80_Sub1_Sub20 method36797(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub20 local5 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class438.aClass480_112.method29918(arg0, 0, 1896589581);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class228.method25994(local16, 732690210);
		} catch (@Pc(30) Exception local30) {
			throw new RuntimeException(local30.getMessage() + " " + arg0);
		}
		aClass248_1.method26330(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!yk", name = "s", descriptor = "([B)Lclient!asw;")
	static Class80_Sub1_Sub20 method36798(@OriginalArg(0) byte[] arg0) {
		return new Class80_Sub1_Sub20(new Packet(arg0), Class297.anInterface21_4);
	}

	@OriginalMember(owner = "client!yk", name = "g", descriptor = "()V")
	public static void method36799() {
		aClass248_1.method26332(1727760485);
	}

	@OriginalMember(owner = "client!yk", name = "a", descriptor = "(Lclient!ub;II)Lclient!asw;")
	static Class80_Sub1_Sub20 method36800(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt2028 * 2015367115 | arg1 << 10;
		@Pc(16) Class80_Sub1_Sub20 local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, 383159967), 1472047355);
		if (local29 == null) {
			local8 = arg0.anInt2028 * 2015367115 | arg2 + 65536 << 10;
			local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, 325806540), 1472047355);
			if (local29 == null) {
				local8 = arg0.anInt2028 * 2015367115 | 0x3FFFC00;
				local16 = (Class80_Sub1_Sub20) aClass248_1.method26331((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class438.aClass480_112.method29926(Class438.aClass480_112.method29935(local8, -2128097746), 1472047355);
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class228.method25994(local29, 9828077);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass158_70 = arg0;
					aClass248_1.method26330(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class228.method25994(local29, 1980914479);
				} catch (@Pc(116) Exception local116) {
					throw new RuntimeException(local116.getMessage() + " " + local8);
				}
				local16.aClass158_70 = arg0;
				aClass248_1.method26330(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class228.method25994(local29, -2087612992);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass158_70 = arg0;
			aClass248_1.method26330(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!yk", name = "b", descriptor = "(Lclient!yp;I)V")
	static void method36801(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
	}

	@OriginalMember(owner = "client!yk", name = "amw", descriptor = "(Lclient!yp;B)V")
	static void method36802(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class114.method8629(446800888);
	}

	@OriginalMember(owner = "client!yk", name = "fu", descriptor = "(B)V")
	static void method36803(@OriginalArg(0) byte arg0) {
		if (Class279.aClass102_9.method20858()) {
			Class279.aClass102_9.method20681(Class454.aCanvas6, 2001622185);
			Class78.method1375(-1247188279);
			@Pc(11) Dimension local11 = Class454.aCanvas6.getSize();
			Class279.aClass102_9.method20679(Class454.aCanvas6, local11.width, local11.height, 884311003);
			Class279.aClass102_9.method20682(Class454.aCanvas6, -1585422623);
		} else {
			Class528.method30719(Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-457928533), false, -1055845935);
		}
		Class138_Sub1.method10718((byte) 6);
	}

	@OriginalMember(owner = "client!yk", name = "<init>", descriptor = "()V")
	Class686() throws Throwable {
		throw new Error();
	}
}
