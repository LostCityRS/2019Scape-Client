package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public class Class451 implements Interface48 {

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_84 = new Class240(64);

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "Lclient!py;")
	Class497 aClass497_118;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!py;)V", line = 11)
	public Class451(@OriginalArg(0) Class497 arg0) {
		this.aClass497_118 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "(I)Lclient!nm;", line = 16)
	@Override
	public Class442 method28947(@OriginalArg(0) int arg0) {
		@Pc(6) Class442 local6 = (Class442) this.aClass240_84.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_118.method30064(0, arg0, (byte) 0);
		local6 = new Class442();
		if (local18 != null) {
			local6.method28857(new Packet(local18), arg0, (byte) -1);
		}
		this.aClass240_84.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "(I)Lclient!nm;", line = 16)
	@Override
	public Class442 method28946(@OriginalArg(0) int arg0) {
		@Pc(6) Class442 local6 = (Class442) this.aClass240_84.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_118.method30064(0, arg0, (byte) 0);
		local6 = new Class442();
		if (local18 != null) {
			local6.method28857(new Packet(local18), arg0, (byte) -1);
		}
		this.aClass240_84.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(II)Lclient!nm;", line = 16)
	@Override
	public Class442 method28945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class442 local6 = (Class442) this.aClass240_84.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass497_118.method30064(0, arg0, (byte) 0);
		local6 = new Class442();
		if (local18 != null) {
			local6.method28857(new Packet(local18), arg0, (byte) -1);
		}
		this.aClass240_84.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)[Lclient!zr;", line = 20)
	public static Class715[] method28948(@OriginalArg(0) int arg0) {
		return new Class715[] { Class715.aClass715_6, Class715.aClass715_5, Class715.aClass715_2, Class715.aClass715_3, Class715.aClass715_7, Class715.aClass715_10, Class715.aClass715_4, Class715.aClass715_9, Class715.aClass715_8 };
	}

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "(Ljava/awt/Canvas;I)V", line = 141)
	public static void method28949(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!nw", name = "ae", descriptor = "(B)I", line = 645)
	public static final int method28950(@OriginalArg(0) byte arg0) {
		return (int) (1000000000L / (Class553.aLong238 * 3394915126462843437L));
	}

	@OriginalMember(owner = "client!nw", name = "ar", descriptor = "(Lclient!arm;B)Ljava/lang/String;", line = 1079)
	public static String method28951(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) byte arg1) {
		if (Class454.aBoolean773 || arg0 == null) {
			return "";
		} else if ((arg0.aString100 == null || arg0.aString100.length() == 0) && arg0.aString98 != null && arg0.aString98.length() > 0) {
			return arg0.aString98;
		} else {
			return arg0.aString100;
		}
	}

	@OriginalMember(owner = "client!nw", name = "adu", descriptor = "(Lclient!yf;I)V", line = 10204)
	static final void method28952(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) int local31 = client.aClass531ArrayArray1[local23][local13].method30429(-980370360);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!nw", name = "ats", descriptor = "(Lclient!yf;B)V", line = 13285)
	static final void method28953(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
