package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashMap;
import java.util.Map;

@OriginalClass("client!hz")
public final class Class329 {

	@OriginalMember(owner = "client!hz", name = "i", descriptor = "I")
	static int anInt4184;

	@OriginalMember(owner = "client!hz", name = "gi", descriptor = "Lclient!pf;")
	public static Class480 aClass480_95;

	@OriginalMember(owner = "client!hz", name = "t", descriptor = "Ljava/util/Map;")
	static final Map aMap18 = new HashMap();

	@OriginalMember(owner = "client!hz", name = "f", descriptor = "Lclient!aax;")
	static final Class24 aClass24_29 = new Class24(1024);

	@OriginalMember(owner = "client!hz", name = "e", descriptor = "Lclient!aaa;")
	static final Class3 aClass3_15 = new Class3();

	@OriginalMember(owner = "client!hz", name = "u", descriptor = "I")
	static int anInt4183 = 0;

	@OriginalMember(owner = "client!hz", name = "ah", descriptor = "(I)I")
	public static int method27725(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_67) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_67).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "aq", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;)V")
	public static void method27726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		if (local5 == null) {
			local5 = new Class331();
			aMap18.put(arg0, local5);
		}
		@Pc(31) Class80_Sub1_Sub14 local31 = local5.method27773(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 588951009);
		aClass24_29.method563(local31, (long) (local31.anInt3100 * 102067333));
		aClass3_15.method42(local31, 1599142138);
		client.anInt3552 = client.anInt3569 * 1273462915;
	}

	@OriginalMember(owner = "client!hz", name = "x", descriptor = "()I")
	static int method27727() {
		return (anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "r", descriptor = "()I")
	static int method27728() {
		return (anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "q", descriptor = "()I")
	static int method27729() {
		return (anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "h", descriptor = "()I")
	public static int method27730() {
		return anInt4183 * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "d", descriptor = "(Ljava/lang/String;)V")
	public static void method27731(@OriginalArg(0) String arg0) {
		Class255.method26406(0, 0, "", "", "", arg0, null, (byte) 3);
	}

	@OriginalMember(owner = "client!hz", name = "z", descriptor = "(Ljava/lang/String;)V")
	public static void method27732(@OriginalArg(0) String arg0) {
		Class255.method26406(0, 0, "", "", "", arg0, null, (byte) 3);
	}

	@OriginalMember(owner = "client!hz", name = "p", descriptor = "(ILjava/lang/String;)V")
	public static void method27733(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class255.method26406(arg0, 0, "", "", "", arg1, null, (byte) 3);
	}

	@OriginalMember(owner = "client!hz", name = "ai", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ny;)V")
	public static void method27734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class452 arg8) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		if (local5 == null) {
			local5 = new Class331();
			aMap18.put(arg0, local5);
		}
		@Pc(31) Class80_Sub1_Sub14 local31 = local5.method27773(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 588951009);
		aClass24_29.method563(local31, (long) (local31.anInt3100 * 102067333));
		aClass3_15.method42(local31, 1599142138);
		client.anInt3552 = client.anInt3569 * 1273462915;
	}

	@OriginalMember(owner = "client!hz", name = "y", descriptor = "(ILjava/lang/String;)V")
	public static void method27735(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class255.method26406(arg0, 0, "", "", "", arg1, null, (byte) 3);
	}

	@OriginalMember(owner = "client!hz", name = "k", descriptor = "()I")
	static int method27736() {
		return (anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "c", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;)V")
	public static void method27737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 216511773);
	}

	@OriginalMember(owner = "client!hz", name = "aj", descriptor = "(I)I")
	public static int method27738(@OriginalArg(0) int arg0) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		return local5 == null ? 0 : local5.method27774(-742435763);
	}

	@OriginalMember(owner = "client!hz", name = "ax", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;)V")
	public static void method27739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 459146909);
	}

	@OriginalMember(owner = "client!hz", name = "ag", descriptor = "(I)I")
	public static int method27740(@OriginalArg(0) int arg0) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		return local5 == null ? 0 : local5.method27774(-742435763);
	}

	@OriginalMember(owner = "client!hz", name = "ay", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;)V")
	public static void method27741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 1945709587);
	}

	@OriginalMember(owner = "client!hz", name = "n", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;)V")
	public static void method27742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 1275948643);
	}

	@OriginalMember(owner = "client!hz", name = "ao", descriptor = "(II)Lclient!asf;")
	public static Class80_Sub1_Sub14 method27743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		return local5.method27780(arg1, (byte) 7);
	}

	@OriginalMember(owner = "client!hz", name = "w", descriptor = "()I")
	static int method27744() {
		return (anInt4183 += -1221804427) * -1388797475 - 1;
	}

	@OriginalMember(owner = "client!hz", name = "ac", descriptor = "(I)I")
	public static int method27745(@OriginalArg(0) int arg0) {
		@Pc(5) Class331 local5 = (Class331) aMap18.get(arg0);
		return local5 == null ? 0 : local5.method27774(-742435763);
	}

	@OriginalMember(owner = "client!hz", name = "at", descriptor = "(I)I")
	public static int method27746(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_68) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_68).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "ab", descriptor = "()V")
	public static void method27747() {
		aMap18.clear();
		aClass24_29.method564(-1646302826);
		aClass3_15.method41(-252802305);
		anInt4183 = 0;
	}

	@OriginalMember(owner = "client!hz", name = "al", descriptor = "(I)I")
	public static int method27748(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_67) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_67).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "b", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!ny;)V")
	public static void method27749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) Class452 arg6) {
		Class20_Sub4_Sub2.method23018(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6, 1017868858);
	}

	@OriginalMember(owner = "client!hz", name = "af", descriptor = "(I)I")
	public static int method27750(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_67) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_67).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "am", descriptor = "(I)I")
	public static int method27751(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_68) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_68).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "ak", descriptor = "(I)I")
	public static int method27752(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub14 local5 = (Class80_Sub1_Sub14) aClass24_29.method560((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (aClass3_15.aClass80_Sub1_2 == local5.aClass80_Sub1_68) {
			return -1;
		} else {
			return ((Class80_Sub1_Sub14) local5.aClass80_Sub1_68).anInt3100 * 102067333;
		}
	}

	@OriginalMember(owner = "client!hz", name = "v", descriptor = "(ILjava/lang/String;)V")
	public static void method27753(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class255.method26406(arg0, 0, "", "", "", arg1, null, (byte) 3);
	}

	@OriginalMember(owner = "client!hz", name = "aj", descriptor = "(I)V")
	static void method27754(@OriginalArg(0) int arg0) {
		if (Class622.aClass99_38 != null && Class622.aClass99_38.method18218() == Class622.aTwitchWebcamFrameData1.width && Class622.aClass99_38.method18219() == Class622.aTwitchWebcamFrameData1.height) {
			Class622.aClass99_38.method18221(0, 0, Class622.aTwitchWebcamFrameData1.width, Class622.aTwitchWebcamFrameData1.height, Class622.aTwitchWebcamFrameData1.buffer, 0, Class622.aTwitchWebcamFrameData1.width);
		} else {
			Class622.aClass99_38 = Class279.aClass102_9.method20740(Class622.aTwitchWebcamFrameData1.buffer, 0, Class622.aTwitchWebcamFrameData1.width, Class622.aTwitchWebcamFrameData1.width, Class622.aTwitchWebcamFrameData1.height, false);
		}
	}

	@OriginalMember(owner = "client!hz", name = "oq", descriptor = "(Lclient!yp;I)V")
	static void method27755(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class315.method27497(local11, local14, arg0, (byte) 61);
	}

	@OriginalMember(owner = "client!hz", name = "amd", descriptor = "(Lclient!yp;B)V")
	static void method27756(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class1.method21(713196731);
		Class630.aBoolean957 = false;
	}

	@OriginalMember(owner = "client!hz", name = "<init>", descriptor = "()V")
	Class329() throws Throwable {
		throw new Error();
	}
}
