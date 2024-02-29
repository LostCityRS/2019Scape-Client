package jagex3;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ty")
public final class Class586 implements Interface57 {

	@OriginalMember(owner = "client!ty", name = "m", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable10 = new Hashtable();

	@OriginalMember(owner = "client!ty", name = "k", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable11 = new Hashtable();

	@OriginalMember(owner = "client!ty", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_131;

	@OriginalMember(owner = "client!ty", name = "n", descriptor = "Ljava/lang/String;")
	final String aString238;

	@OriginalMember(owner = "client!ty", name = "s", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method31811(@OriginalArg(0) String arg0) {
		if (Class527.aString231.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class527.aString231.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class527.aString231.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ty", name = "he", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method31816(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4042 = -2003331097;
		arg0.anInt4078 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 971360853;
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class124_Sub3_Sub1.method19778(arg0.anInt3994 * -1549590237, 256284111);
		}
	}

	@OriginalMember(owner = "client!ty", name = "no", descriptor = "(Lclient!yf;I)V")
	static void method31817(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1085021496);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class370.method28180(local16, local22, arg0, (byte) -12);
	}

	@OriginalMember(owner = "client!ty", name = "bci", descriptor = "(Lclient!yf;B)V")
	static void method31818(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class5.method78(arg0.aClass132_Sub1_Sub5_Sub1_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], true, 1808448679);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[0];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[2];
	}

	@OriginalMember(owner = "client!ty", name = "my", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method31819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class149_Sub6 local3 = new Class149_Sub6();
		local3.anInt1476 = arg0 * 938928539;
		local3.anInt1472 = arg1 * -1653526553;
		local3.anInt1474 = arg2 * -2119277863;
		local3.anInt1473 = (arg4 + client.anInt3485) * -1951923749;
		local3.anInt1475 = arg3 * 1179584787;
		local3.aString43 = arg6;
		local3.anInt1477 = arg5 * -1654108153;
		client.aClass21_6.method379(local3, (byte) 4);
	}

	@OriginalMember(owner = "client!ty", name = "avp", descriptor = "(Lclient!yf;I)V")
	static void method31820(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16120((short) 23967);
	}

	@OriginalMember(owner = "client!ty", name = "jo", descriptor = "(Lclient!yf;I)V")
	static void method31821(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!ty", name = "u", descriptor = "(B)V")
	public static void method31822(@OriginalArg(0) byte arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2, (byte) 86);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2, (byte) 91);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 72);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 126);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1, (byte) 73);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1, (byte) 67);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1, (byte) 17);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1, (byte) 120);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1, (byte) 35);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1, (byte) 81);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 4);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1, (byte) 75);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 76);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 127);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1, (byte) 93);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4188 * 595334117, (byte) 71);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 125);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20577() && Class694.aClass104_14.method20553()) {
			Class694.aClass104_14.method20584();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1, (byte) 82);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1, (byte) 62);
		Class386.method28416((byte) -54);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1, (byte) 51);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3, (byte) 88);
		Class610.method32202(-584004913);
		client.aClass532_1.method30713((byte) -12).method33184(467828911);
		client.aBoolean611 = true;
	}

	@OriginalMember(owner = "client!ty", name = "e", descriptor = "(B)I")
	static int method31823(@OriginalArg(0) byte arg0) {
		return (Class329.anInt4186 += 975062165) * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!ty", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class586(@OriginalArg(0) Class497 arg0) {
		this.aClass497_131 = arg0;
		@Pc(16) String local16 = "";
		if (Class527.aString231.startsWith("win") || Class527.aString231.startsWith("windows 7")) {
			local16 = local16 + "windows/";
		} else if (Class527.aString231.startsWith("linux")) {
			local16 = local16 + "linux/";
		} else if (Class527.aString231.startsWith("mac")) {
			local16 = local16 + "macos/";
		}
		if (Class527.aString233.startsWith("amd64") || Class527.aString233.startsWith("x86_64")) {
			local16 = local16 + "x86_64/";
		} else if (Class527.aString233.startsWith("i386") || Class527.aString233.startsWith("i486") || Class527.aString233.startsWith("i586") || Class527.aString233.startsWith("x86")) {
			local16 = local16 + "x86/";
		} else if (Class527.aString233.startsWith("ppc")) {
			local16 = local16 + "ppc/";
		} else {
			local16 = local16 + "universal/";
		}
		this.aString238 = local16;
	}

	@OriginalMember(owner = "client!ty", name = "y", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31806(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!ty", name = "r", descriptor = "(Ljava/lang/String;ZI)I")
	public int method31807(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception_Sub5 {
		if (this.aHashtable10.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class443.method29052(arg0, 2116595808);
			if (local10 == null) {
				throw new Exception_Sub5(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString238 + local10;
				if (this.aClass497_131 == null || !this.aClass497_131.method30251(local8, "", -1005399904)) {
					throw new Exception_Sub5(2, arg0);
				}
			}
		}
		if (!this.aClass497_131.method30232(local8, -691329216)) {
			return this.aClass497_131.method30226(local8, 810509320);
		}
		@Pc(77) byte[] local77 = this.aClass497_131.method30252(local8, "", 1200487767);
		if (local77 == null) {
			throw new Exception_Sub5(3, arg0);
		}
		@Pc(88) File local88 = null;
		try {
			local88 = Class19_Sub2.method17383(local10, -541642454);
		} catch (@Pc(94) RuntimeException local94) {
			throw new Exception_Sub5(4, arg0, local94);
		}
		if (local88 == null) {
			throw new Exception_Sub5(5, arg0);
		}
		@Pc(111) boolean local111 = true;
		@Pc(115) byte[] local115 = Class300.method26813(local88, 1302919758);
		if (local115 != null && local115.length == local77.length) {
			for (@Pc(125) int local125 = 0; local125 < local115.length; local125++) {
				if (local77[local125] != local115[local125]) {
					local111 = false;
					break;
				}
			}
		} else {
			local111 = false;
		}
		if (!local111) {
			try {
				@Pc(151) FileOutputStream local151 = new FileOutputStream(local88);
				local151.write(local77, 0, local77.length);
				local151.close();
			} catch (@Pc(161) Throwable local161) {
				throw new Exception_Sub5(6, arg0, local161);
			}
		}
		this.method31808(arg0, local88, 220456577);
		return 100;
	}

	@OriginalMember(owner = "client!ty", name = "v", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V")
	void method31808(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!ty", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V")
	void method31809(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub1 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub1(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub1(4, arg0);
		}
		try {
			/*local20 = new File(local20.getCanonicalPath());
			@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
			@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local52.invoke(local68, Boolean.TRUE);
			local68.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local52.invoke(local68, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(111) NoSuchMethodException local111) {*/
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class574.class);
		} catch (@Pc(122) Throwable local122) {
			throw new Exception_Sub1(3, arg0, local122);
		}
	}

	@OriginalMember(owner = "client!ty", name = "e", descriptor = "(Ljava/lang/String;B)V")
	@Override
	public void method31798(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) throws Exception_Sub1 {
		this.method31810(arg0, Class574.class, 1288516954);
	}

	@OriginalMember(owner = "client!ty", name = "o", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)V")
	void method31810(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) throws Exception_Sub1 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub1(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub1(4, arg0);
		}
		try {
			/*local20 = new File(local20.getCanonicalPath());
			@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
			@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local52.invoke(local68, Boolean.TRUE);
			local68.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local52.invoke(local68, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(111) NoSuchMethodException local111) {*/
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class574.class);
		} catch (@Pc(122) Throwable local122) {
			throw new Exception_Sub1(3, arg0, local122);
		}
	}

	@OriginalMember(owner = "client!ty", name = "k", descriptor = "(Ljava/lang/String;)V")
	@Override
	public void method31802(@OriginalArg(0) String arg0) throws Exception_Sub1 {
		this.method31810(arg0, Class574.class, 100645638);
	}

	@OriginalMember(owner = "client!ty", name = "w", descriptor = "(Ljava/lang/String;)V")
	@Override
	public void method31800(@OriginalArg(0) String arg0) throws Exception_Sub1 {
		this.method31810(arg0, Class574.class, -1322671205);
	}

	@OriginalMember(owner = "client!ty", name = "l", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method31795(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "u", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method31801(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method31805(@OriginalArg(0) int arg0) {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local124, Boolean.TRUE);
										local43.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(170) Throwable local170) {
										}
										local43.invoke(local131, Boolean.FALSE);
										local43.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(208) Throwable local208) {
					}
				}
			} catch (@Pc(211) Throwable local211) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(223) Throwable local223) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!ty", name = "p", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method31804(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "d", descriptor = "()Z")
	@Override
	public boolean method31797() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local124, Boolean.TRUE);
										local43.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(170) Throwable local170) {
										}
										local43.invoke(local131, Boolean.FALSE);
										local43.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(208) Throwable local208) {
					}
				}
			} catch (@Pc(211) Throwable local211) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(223) Throwable local223) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!ty", name = "z", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method31803(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "n", descriptor = "(Ljava/lang/String;I)Z")
	@Override
	public boolean method31796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ty", name = "q", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31812(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!ty", name = "x", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V")
	void method31813(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub1 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub1(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub1(4, arg0);
		}
		try {
			/*local20 = new File(local20.getCanonicalPath());
			@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
			@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local52.invoke(local68, Boolean.TRUE);
			local68.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local52.invoke(local68, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(111) NoSuchMethodException local111) {*/
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class574.class);
		} catch (@Pc(122) Throwable local122) {
			throw new Exception_Sub1(3, arg0, local122);
		}
	}

	@OriginalMember(owner = "client!ty", name = "f", descriptor = "(Ljava/lang/String;)V")
	@Override
	public void method31799(@OriginalArg(0) String arg0) throws Exception_Sub1 {
		this.method31810(arg0, Class574.class, -1215009295);
	}

	@OriginalMember(owner = "client!ty", name = "h", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V")
	void method31814(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub1 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub1(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub1(4, arg0);
		}
		try {
			/*local20 = new File(local20.getCanonicalPath());
			@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
			@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local52.invoke(local68, Boolean.TRUE);
			local68.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local52.invoke(local68, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(111) NoSuchMethodException local111) {*/
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class574.class);
		} catch (@Pc(122) Throwable local122) {
			throw new Exception_Sub1(3, arg0, local122);
		}
	}

	@OriginalMember(owner = "client!ty", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V")
	void method31815(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub1 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub1(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub1(4, arg0);
		}
		try {
			/*local20 = new File(local20.getCanonicalPath());
			@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
			@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local52.invoke(local68, Boolean.TRUE);
			local68.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local52.invoke(local68, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(111) NoSuchMethodException local111) {*/
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class574.class);
		} catch (@Pc(122) Throwable local122) {
			throw new Exception_Sub1(3, arg0, local122);
		}
	}
}
