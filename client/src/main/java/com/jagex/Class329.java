package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hz")
public class Class329 {

	@OriginalMember(owner = "client!hz", name = "e", descriptor = "Ljava/util/Map;")
	static final Map aMap21 = new HashMap();

	@OriginalMember(owner = "client!hz", name = "n", descriptor = "Lclient!aan;")
	static final Class16 aClass16_29 = new Class16(1024);

	@OriginalMember(owner = "client!hz", name = "m", descriptor = "Lclient!aap;")
	static final Class18 aClass18_15 = new Class18();

	@OriginalMember(owner = "client!hz", name = "k", descriptor = "I")
	static int anInt4145 = 0;

	@OriginalMember(owner = "client!hz", name = "<init>", descriptor = "()V", line = 17)
	Class329() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!hz", name = "v", descriptor = "()I", line = 22)
	static int method27328() {
		return (anInt4145 += 975062165) * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "o", descriptor = "()I", line = 22)
	static int method27329() {
		return (anInt4145 += 975062165) * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "r", descriptor = "()I", line = 22)
	static int method27330() {
		return (anInt4145 += 975062165) * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "q", descriptor = "(ILjava/lang/String;)V", line = 34)
	public static void method27331(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class227.method25612(arg0, 0, "", "", "", arg1, null, -1890944498);
	}

	@OriginalMember(owner = "client!hz", name = "y", descriptor = "(ILjava/lang/String;)V", line = 34)
	public static void method27332(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class227.method25612(arg0, 0, "", "", "", arg1, null, -1949370923);
	}

	@OriginalMember(owner = "client!hz", name = "s", descriptor = "(ILjava/lang/String;)V", line = 34)
	public static void method27333(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class227.method25612(arg0, 0, "", "", "", arg1, null, -1890460263);
	}

	@OriginalMember(owner = "client!hz", name = "x", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!nn;)V", line = 38)
	public static void method27334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class443 arg6) {
		Class60.method1118(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 1346198176);
	}

	@OriginalMember(owner = "client!hz", name = "b", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;)V", line = 42)
	public static void method27335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8) {
		@Pc(5) Class339 local5 = (Class339) aMap21.get(arg0);
		if (local5 == null) {
			local5 = new Class339();
			aMap21.put(arg0, local5);
		}
		@Pc(31) Class93_Sub1_Sub15 local31 = local5.method27474(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, -1308535510);
		aClass16_29.method220(local31, (long) (local31.anInt3090 * -565994431));
		aClass18_15.method250(local31, 723118299);
		client.anInt3546 = client.anInt3565 * 165796023;
	}

	@OriginalMember(owner = "client!hz", name = "h", descriptor = "(II)Lclient!asg;", line = 54)
	public static Class93_Sub1_Sub15 method27336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class339 local5 = (Class339) aMap21.get(arg0);
		return local5.method27479(arg1, -611780419);
	}

	@OriginalMember(owner = "client!hz", name = "a", descriptor = "(II)Lclient!asg;", line = 54)
	public static Class93_Sub1_Sub15 method27337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class339 local5 = (Class339) aMap21.get(arg0);
		return local5.method27479(arg1, -611780419);
	}

	@OriginalMember(owner = "client!hz", name = "i", descriptor = "(I)Lclient!asg;", line = 59)
	public static Class93_Sub1_Sub15 method27338(@OriginalArg(0) int arg0) {
		return (Class93_Sub1_Sub15) aClass16_29.method214((long) arg0);
	}

	@OriginalMember(owner = "client!hz", name = "g", descriptor = "(I)Lclient!asg;", line = 59)
	public static Class93_Sub1_Sub15 method27339(@OriginalArg(0) int arg0) {
		return (Class93_Sub1_Sub15) aClass16_29.method214((long) arg0);
	}

	@OriginalMember(owner = "client!hz", name = "j", descriptor = "(I)I", line = 63)
	public static int method27340(@OriginalArg(0) int arg0) {
		@Pc(5) Class339 local5 = (Class339) aMap21.get(arg0);
		return local5 == null ? 0 : local5.method27483((byte) 7);
	}

	@OriginalMember(owner = "client!hz", name = "t", descriptor = "(I)I", line = 63)
	public static int method27341(@OriginalArg(0) int arg0) {
		@Pc(5) Class339 local5 = (Class339) aMap21.get(arg0);
		return local5 == null ? 0 : local5.method27483((byte) 7);
	}

	@OriginalMember(owner = "client!hz", name = "ae", descriptor = "()V", line = 69)
	public static void method27342() {
		aMap21.clear();
		aClass16_29.method225((byte) 119);
		aClass18_15.method244(-1739466164);
		anInt4145 = 0;
	}

	@OriginalMember(owner = "client!hz", name = "ag", descriptor = "()V", line = 69)
	public static void method27343() {
		aMap21.clear();
		aClass16_29.method225((byte) 80);
		aClass18_15.method244(1401453092);
		anInt4145 = 0;
	}

	@OriginalMember(owner = "client!hz", name = "ah", descriptor = "(I)I", line = 76)
	public static int method27344(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub15 local5 = (Class93_Sub1_Sub15) aClass16_29.method214((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass93_Sub1_67 == aClass18_15.aClass93_Sub1_4) {
			return -1;
		} else {
			return -565994431 * ((Class93_Sub1_Sub15) local5.aClass93_Sub1_67).anInt3090;
		}
	}

	@OriginalMember(owner = "client!hz", name = "w", descriptor = "(Ljava/lang/CharSequence;II)I", line = 80)
	public static int method27345(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class618.method32098(arg0, arg1, true, 1956687461);
	}

	@OriginalMember(owner = "client!hz", name = "ac", descriptor = "(I)I", line = 83)
	public static int method27346(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub15 local5 = (Class93_Sub1_Sub15) aClass16_29.method214((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass93_Sub1_68 == aClass18_15.aClass93_Sub1_4) {
			return -1;
		} else {
			return -565994431 * ((Class93_Sub1_Sub15) local5.aClass93_Sub1_68).anInt3090;
		}
	}

	@OriginalMember(owner = "client!hz", name = "al", descriptor = "(I)I", line = 83)
	public static int method27347(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub15 local5 = (Class93_Sub1_Sub15) aClass16_29.method214((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass93_Sub1_68 == aClass18_15.aClass93_Sub1_4) {
			return -1;
		} else {
			return -565994431 * ((Class93_Sub1_Sub15) local5.aClass93_Sub1_68).anInt3090;
		}
	}

	@OriginalMember(owner = "client!hz", name = "al", descriptor = "(I)V", line = 1050)
	static void method27348(@OriginalArg(0) int arg0) {
		if (client.state * -849002901 == 19) {
			Class634.method32319(813052467);
		}
		client.aClass175_1.close((byte) 126);
		Class63.method1162((byte) 15);
		Class20.aBoolean10 = true;
		Class118.method8409(-1359375999);
		@Pc(17) int local17;
		for (local17 = 0; local17 < client.aClass173Array1.length; local17++) {
			client.aClass173Array1[local17] = null;
		}
		client.aBoolean625 = false;
		client.anInt3469 = ((int) (Math.random() * 100.0D) - 50) * -387671051;
		client.anInt3474 = ((int) (Math.random() * 110.0D) - 55) * 840469749;
		client.anInt3461 = ((int) (Math.random() * 80.0D) - 40) * -656769221;
		client.anInt3477 = ((int) (Math.random() * 120.0D) - 60) * -1165565815;
		client.anInt3478 = ((int) (Math.random() * 30.0D) - 20) * -1759455247;
		client.aFloat253 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Class599.method31835((byte) -84);
		for (local17 = 0; local17 < 2048; local17++) {
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local17] = null;
		}
		Class520.selfPlayer = null;
		client.anInt3540 = 0;
		client.anInt3488 = 0;
		client.aClass16_18.method225((byte) 116);
		client.aClass22_46.method405(-2037259486);
		client.aClass16_21.method225((byte) 95);
		client.aClass21_6.method377(-1851366355);
		client.aClass16_20.method225((byte) 95);
		Class93_Sub8.aClass22_18 = new Class22();
		Class93_Sub8.aClass22_19 = new Class22();
		Class26.anInt90 = 0;
		Class20.anInt70 = 0;
		Class165.anInt2068 = 0;
		Class366.anInt4585 = 0;
		Class256.anInt3853 = 0;
		Class545.anInt5289 = 0;
		Class349.anInt4201 = 0;
		Class290.anInt3911 = 0;
		Class5.anInt14 = 0;
		Class174.anInt3297 = 0;
		if (client.anInt3526 * -703563959 != -1) {
			Class535.method30697(client.anInt3526 * -703563959, 1574420063);
		}
		for (@Pc(161) Class93_Sub40 local161 = (Class93_Sub40) client.aClass16_22.method227((byte) 39); local161 != null; local161 = (Class93_Sub40) client.aClass16_22.method229(1733245813)) {
			if (!local161.method23970(1587931417)) {
				local161 = (Class93_Sub40) client.aClass16_22.method227((byte) -90);
				if (local161 == null) {
					break;
				}
			}
			Class372.method28019(local161, true, false, 522605025);
		}
		client.anInt3526 = -823798521;
		client.aClass16_22 = new Class16(8);
		Class361.method27805((byte) -14);
		client.aClass312_7 = null;
		for (local17 = 0; local17 < 8; local17++) {
			client.aStringArray22[local17] = null;
			client.aBooleanArray20[local17] = false;
			client.anIntArray304[local17] = -1;
		}
		Class245.method25899((byte) -27);
		client.aBoolean630 = true;
		for (local17 = 0; local17 < 114; local17++) {
			client.aBooleanArray22[local17] = true;
		}
		for (local17 = 0; local17 < 3; local17++) {
			for (@Pc(240) int local240 = 0; local240 < 8; local240++) {
				client.aClass531ArrayArray1[local17][local240] = new Class531();
			}
		}
		client.world.method30494((byte) -54).method33015(-1404774556);
		client.aBoolean619 = true;
		Class610.aShortArray147 = Class336.aShortArray116 = Class47.aShortArray4 = new short[256];
		Class511.aString220 = Class74.aClass74_133.method1259(Class106.lang, (byte) 56);
		Class51.options.method14363(Class51.options.aClass166_Sub15_2, Class51.options.aClass166_Sub15_1.method15673(1772258488), (byte) 103);
		client.verifyId = 0;
		Class380.method28117((byte) 114);
		Class653.aClass678_2 = null;
		Class442.aLong276 = 0L;
	}

	@OriginalMember(owner = "client!hz", name = "jg", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6709)
	static final void method27349(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aString165 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!hz", name = "aen", descriptor = "(Lclient!yf;I)V", line = 10260)
	static final void method27350(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(14) long local14 = (long) arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) long local25 = (long) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (local25 * local14 / 100L + local14);
	}
}
