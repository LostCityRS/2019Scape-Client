package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class493 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	static final int anInt5324 = 2;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	static final int anInt5325 = 60000;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	static final int anInt5327 = 10;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
	static final int anInt5329 = 10000;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	static final int anInt5330 = 10000;

	@OriginalMember(owner = "client!pu", name = "fe", descriptor = "Lclient!py;")
	public static Class497 aClass497_124;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "J")
	long aLong285;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	volatile int anInt5328 = 0;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService2 = Executors.newFixedThreadPool(2);

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Z")
	boolean aBoolean790 = false;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Ljava/lang/String;")
	String aString227;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	int anInt5326;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	final int anInt5331;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(Lclient!yf;B)V")
	static void method30188(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class108 local9 = (Class108) arg0.aClass93_Sub1_Sub13_1.anObjectArray5[arg0.anInt6050 * -709694321];
		@Pc(31) Interface20 local31 = (Interface20) (arg0.anIntArray522[arg0.anInt6050 * -709694321] == 0 ? arg0.aMap26.get(local9.aClass138_6) : arg0.aMap25.get(local9.aClass138_6));
		@Pc(36) Class500 local36 = local9.aClass519_6.method30492((byte) 36);
		if (local36 == Class500.aClass500_6) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local31.method33636(local9, 989683427);
		} else if (local36 == Class500.aClass500_3) {
			arg0.aLongArray27[(arg0.anInt6055 += -1364417339) * -2000995827 - 1] = local31.method33646(local9, 1462276921);
		} else if (local36 == Class500.aClass500_2) {
			try {
				@Pc(89) String local89 = (String) local31.method33648(local9, (byte) 120);
				if (local89 == null) {
					local89 = "null";
				}
				arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local89;
			} catch (@Pc(110) Exception local110) {
				throw new RuntimeException(local110);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pu", name = "sg", descriptor = "(Lclient!hf;Lclient!yf;I)V")
	static void method30189(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5 local5 = arg0.method26944(Class157.aClass462_2, client.anInterface50_1, -1288620069);
		@Pc(18) int local18 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(31) int local31 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(48) int local48 = local5.method46(arg0.aString170, arg0.anInt4022 * 1215292027, arg0.anInt4046 * -889720761, local31, local18, Class110_Sub14.aClass100Array4, 1460375930);
		arg1.anIntArray521[(arg1.anInt6052 += 1189701933) * -1497248091 - 1] = local48;
	}

	@OriginalMember(owner = "client!pu", name = "adc", descriptor = "(Lclient!yf;I)V")
	static void method30190(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = arg0.aClass93_Sub28_4.aString44;
	}

	@OriginalMember(owner = "client!pu", name = "asn", descriptor = "(Lclient!yf;I)V")
	static void method30191(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local12 < 0 || local12 > 5 || local12 == 2) {
			local12 = 3;
		}
		Class543.method31129(local12, false, 1945646779);
	}

	@OriginalMember(owner = "client!pu", name = "axu", descriptor = "(Lclient!yf;B)V")
	static void method30192(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18273(local23, -1836958365);
		if (local29.method1508(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class322) Class542.aClass32_Sub2_3.method18273(local13, -1665928163)).method27350(local23, local29.aString11, 838634018);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class322) Class542.aClass32_Sub2_3.method18273(local13, -1456178808)).method27349(local23, local29.anInt265 * 951920133, 1022196745);
		}
	}

	@OriginalMember(owner = "client!pu", name = "arq", descriptor = "(Lclient!yf;I)V")
	static void method30193(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub7_1, local12, (byte) 88);
		client.aClass532_1.method30650((byte) 0);
		Class106_Sub1.method5148(14271387);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!pu", name = "ji", descriptor = "(Lclient!ax;Lclient!hf;IIII)V")
	static void method30194(@OriginalArg(0) Class175 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class93_Sub22 local8;
		if (arg2 == 1) {
			local8 = Class102.method2592(Class446.aClass446_113, arg0.aClass24_2, (byte) 101);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -2029461381);
		}
		if (arg2 == 2) {
			local8 = Class102.method2592(Class446.aClass446_49, arg0.aClass24_2, (byte) 100);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1450275775);
		}
		if (arg2 == 3) {
			local8 = Class102.method2592(Class446.aClass446_88, arg0.aClass24_2, (byte) 20);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1680844145);
		}
		if (arg2 == 4) {
			local8 = Class102.method2592(Class446.aClass446_33, arg0.aClass24_2, (byte) 106);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -2017482437);
		}
		if (arg2 == 5) {
			local8 = Class102.method2592(Class446.aClass446_72, arg0.aClass24_2, (byte) 74);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1709604427);
		}
		if (arg2 == 6) {
			local8 = Class102.method2592(Class446.aClass446_85, arg0.aClass24_2, (byte) 88);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1855017957);
		}
		if (arg2 == 7) {
			local8 = Class102.method2592(Class446.aClass446_65, arg0.aClass24_2, (byte) 33);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1745831216);
		}
		if (arg2 == 8) {
			local8 = Class102.method2592(Class446.aClass446_52, arg0.aClass24_2, (byte) 89);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1504112130);
		}
		if (arg2 == 9) {
			local8 = Class102.method2592(Class446.aClass446_68, arg0.aClass24_2, (byte) 77);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1439293808);
		}
		if (arg2 == 10) {
			local8 = Class102.method2592(Class446.aClass446_69, arg0.aClass24_2, (byte) 111);
			Class484.method29972(local8, arg3, arg4, arg1.anInt4086 * 307668159, 1067969079);
			arg0.method24363(local8, -1730602101);
		}
	}

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "(IIZZI)I")
	public static int method30195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31246(arg0, arg3, (short) 255);
		if (local4 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4.anIntArray173.length; local12++) {
			if (local4.anIntArray173[local12] >= 0 && local4.anIntArray173[local12] < Class277.aClass32_Sub12_1.anInt2487 * -152478627) {
				@Pc(40) Class47 local40 = (Class47) Class277.aClass32_Sub12_1.method18273(local4.anIntArray173[local12], 1182285571);
				@Pc(53) int local53 = local40.method945(arg1, ((Class87) Class124.aClass32_Sub21_7.method18273(arg1, -811281460)).anInt265 * 951920133, 1100080431);
				if (arg2) {
					local10 += local53 * local4.anIntArray174[local12];
				} else if (local4.anIntArray174[local12] > 0) {
					local10 += local53;
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "(Lclient!akt;I)Lclient!akt;")
	public static Class93_Sub30 method30196(@OriginalArg(0) Class93_Sub30 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub30[] local2 = Class93_Sub30.aClass93_Sub30Array1;
		synchronized (Class93_Sub30.aClass93_Sub30Array1) {
			if (Class509.anInt5367 * 672498035 == 0) {
				return new Class93_Sub30(arg0);
			} else {
				Class93_Sub30.aClass93_Sub30Array1[(Class509.anInt5367 -= -1799648325) * 672498035].method13885(arg0, -17532584);
				return Class93_Sub30.aClass93_Sub30Array1[Class509.anInt5367 * 672498035];
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/lang/String;II)V")
	public Class493(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString227 = arg0;
		this.anInt5326 = arg1 * 1397175519;
		this.anInt5331 = arg2 * -776423417;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
	void method30165(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z")
	boolean method30166(@OriginalArg(0) int arg0) {
		return this.anInt5328 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "(I)Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30167(@OriginalArg(0) int arg0) {
		return this.method30186(255, 255, (byte) 0, true, 0, 0, -1468262263);
	}

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "()V")
	public void method30168() {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "(I)V")
	void method30169(@OriginalArg(0) int arg0) {
		this.anInt5328 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "()V")
	void method30170() {
		this.anInt5328 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "(ZB)V")
	void method30171(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean790 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "()Z")
	boolean method30172() {
		return this.anInt5328 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "()Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30173() {
		return this.method30186(255, 255, (byte) 0, true, 0, 0, -2032913404);
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(IIBZII)Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30166(1068331614)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean790 && !local33) {
				return null;
			} else if (this.aLong285 * 5663573980390976855L + 10000L >= Class305.method26889(1203305809)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26889(786716826);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString227, this.anInt5326 * 1264682783, "/ms?m=" + this.anInt5331 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean545 = arg3;
				this.anInt5328 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local54, local121));
				local121.method23323(local140, (byte) 112);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "()Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30175() {
		return this.method30186(255, 255, (byte) 0, true, 0, 0, 87403681);
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(IIBZII)Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30166(1507183385)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean790 && !local33) {
				return null;
			} else if (this.aLong285 * 5663573980390976855L + 10000L >= Class305.method26889(1062012316)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26889(854659925);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString227, this.anInt5326 * 1264682783, "/ms?m=" + this.anInt5331 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean545 = arg3;
				this.anInt5328 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local54, local121));
				local121.method23323(local140, (byte) 24);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "()V")
	public void method30177() {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "(IIBZII)Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30166(1715203666)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean790 && !local33) {
				return null;
			} else if (this.aLong285 * 5663573980390976855L + 10000L >= Class305.method26889(719279151)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26889(-107660977);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString227, this.anInt5326 * 1264682783, "/ms?m=" + this.anInt5331 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean545 = arg3;
				this.anInt5328 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local54, local121));
				local121.method23323(local140, (byte) 104);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "()V")
	void method30179() {
		this.anInt5328 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "()V")
	void method30180() {
		this.anInt5328 -= -430343167;
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
	public void method30181(@OriginalArg(0) int arg0) {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "()Z")
	boolean method30182() {
		return this.anInt5328 * -843676671 >= 10;
	}

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "(Z)V")
	void method30183(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)V")
	void method30184(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "(Z)V")
	void method30185(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "(IIBZIII)Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 method30186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30166(1815701475)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean790 && !local33) {
				return null;
			} else if (this.aLong285 * 5663573980390976855L + 10000L >= Class305.method26889(1673511386)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class305.method26889(1889312857);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString227, this.anInt5326 * 1264682783, "/ms?m=" + this.anInt5331 * -309512777 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class93_Sub1_Sub16_Sub1 local121 = new Class93_Sub1_Sub16_Sub1(arg2);
				local121.aBoolean545 = arg3;
				this.anInt5328 += -430343167;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class494(this, local54, local121));
				local121.method23323(local140, (byte) 67);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(Z)V")
	void method30187(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
	}
}
