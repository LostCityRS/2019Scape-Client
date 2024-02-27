package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class474 {

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/lang/Process;")
	static Process aProcess1;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString221 = Class264.method26299((short) -16622) + "\\RuneScape-Setup.exe";

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!ai;")
	static Class136 aClass136_5 = Class136.aClass136_1;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "()V")
	public static void method29832() throws RuntimeException {
		if (!Class527.aString231.startsWith("win")) {
			return;
		}
		Class53_Sub1.method14967(-1593140386);
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = aString221;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class136.aClass136_2 == aClass136_5) {
			throw new RuntimeException();
		}
		try {
			aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			aClass136_5 = Class136.aClass136_2;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "()V")
	public static void method29833() throws RuntimeException {
		if (!Class527.aString231.startsWith("win")) {
			return;
		}
		Class53_Sub1.method14967(-1593140386);
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = aString221;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class136.aClass136_2 == aClass136_5) {
			throw new RuntimeException();
		}
		try {
			aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			aClass136_5 = Class136.aClass136_2;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "()V")
	static void method29834() {
		if (Class656.method32927(288007918)) {
			aClass136_5 = aProcess1.exitValue() == 0 ? Class136.aClass136_3 : Class136.aClass136_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "z", descriptor = "()V")
	static void method29835() {
		if (Class656.method32927(1735732145)) {
			aClass136_5 = aProcess1.exitValue() == 0 ? Class136.aClass136_3 : Class136.aClass136_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "l", descriptor = "()I")
	public static int method29836() {
		Class53_Sub1.method14967(-1593140386);
		return aClass136_5.anInt1187 * 859877839;
	}

	@OriginalMember(owner = "client!p", name = "o", descriptor = "()Z")
	static boolean method29837() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()Z")
	static boolean method29838() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()Z")
	static boolean method29839() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "()V")
	static void method29840() {
		if (Class656.method32927(-408017189)) {
			aClass136_5 = aProcess1.exitValue() == 0 ? Class136.aClass136_3 : Class136.aClass136_4;
			aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "v", descriptor = "()Z")
	static boolean method29841() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "r", descriptor = "()Z")
	static boolean method29842() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "s", descriptor = "()Z")
	static boolean method29843() {
		if (aProcess1 == null) {
			return false;
		}
		try {
			aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(Lclient!yf;B)V")
	static void method29844(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class572.method31514(Class694.aClass104_14, -2107522527);
	}

	@OriginalMember(owner = "client!p", name = "fy", descriptor = "(Lclient!yf;I)V")
	static void method29845(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 878516324);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class220.method25640(local16, local22, arg0, (byte) -17);
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(Lclient!yf;B)V")
	static void method29846(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(17) boolean local17 = arg0.anIntArray521[arg0.anInt6052 * -1497248091] != 0;
		@Pc(31) boolean local31 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] != 0;
		Class111.method6798(local17, local31, -475963205);
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(JIB)Ljava/lang/String;")
	static String method29847(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		Class337.method27552(arg0);
		@Pc(5) int local5 = Class69.aCalendar1.get(5);
		@Pc(11) int local11 = Class69.aCalendar1.get(2) + 1;
		@Pc(15) int local15 = Class69.aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	Class474() throws Throwable {
		throw new Error();
	}
}
