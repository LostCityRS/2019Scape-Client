package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

@OriginalClass("client!tx")
public final class Class586 implements Interface58 {

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable11 = new Hashtable();

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable10 = new Hashtable();

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_126;

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "Ljava/lang/String;")
	final String aString226;

	@OriginalMember(owner = "client!tx", name = "w", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method31864(@OriginalArg(0) String arg0) {
		if (Class531.aString220.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class531.aString220.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class531.aString220.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tx", name = "k", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method31868(@OriginalArg(0) String arg0) {
		if (Class531.aString220.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class531.aString220.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class531.aString220.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tx", name = "x", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	static String method31872(@OriginalArg(0) String arg0) {
		if (Class531.aString220.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class531.aString220.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class531.aString220.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tx", name = "ag", descriptor = "(III)I")
	public static int method31878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class622.aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < Class622.aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StartWebcamDevice(Class622.aTwitchWebcamDeviceArray1[arg0].u * 1469731503, arg1) : -1;
	}

	@OriginalMember(owner = "client!tx", name = "aic", descriptor = "(Lclient!yp;I)V")
	static void method31879(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class71.aClass510_2.method30536(local13, -1086862241).aCharArray3[local23];
	}

	@OriginalMember(owner = "client!tx", name = "ann", descriptor = "(Lclient!yp;I)V")
	static void method31880(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) int local18 = local12 >> 14 & 0x3FFF;
		@Pc(22) int local22 = local12 & 0x3FFF;
		@Pc(26) Class626 local26 = client.aClass539_1.method30893((byte) -63);
		local18 -= local26.anInt5540 * -390642507;
		if (local18 < 0) {
			local18 = 0;
		} else if (local18 >= client.aClass539_1.method30921(1965536180)) {
			local18 = client.aClass539_1.method30921(1959799654);
		}
		local22 -= local26.anInt5537 * -894305615;
		if (local22 < 0) {
			local22 = 0;
		} else if (local22 >= client.aClass539_1.method31011(-462946413)) {
			local22 = client.aClass539_1.method31011(-579690320);
		}
		client.anInt3479 = ((local18 << 9) + 256) * 2124722137;
		client.anInt3480 = ((local22 << 9) + 256) * -277248447;
		Class368.anInt4502 = -2057177540;
		Class130_Sub1.anInt1175 = -1464167667;
		Class588.anInt5304 = -503779167;
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!tx", name = "bdp", descriptor = "(Lclient!yp;B)V")
	static void method31881(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!tx", name = "mc", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method31882(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3573 * 975306769; local5++) {
			if (arg0.equalsIgnoreCase(client.aClass676Array1[local5].aString236)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tx", name = "lp", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	static String[] method31883(@OriginalArg(0) String[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) String[] local2 = new String[5];
		for (@Pc(4) int local4 = 0; local4 < 5; local4++) {
			local2[local4] = local4 + " ";
			if (arg0 != null && arg0[local4] != null) {
				local2[local4] = local2[local4] + arg0[local4];
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!tx", name = "ji", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31884(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aString184 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
	}

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(Lclient!di;IIIIII)Lclient!dn;")
	public static Class105 method31885(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class105 local7 = (Class105) Class101.aClass243_7.method26282(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class232 local16 = Class232.method26043(Class626.aClass480_129, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3781 < 13) {
				local16.method26085(2);
			}
			local7 = arg0.method20753(local16, local9, Class264.anInt3914 * 763913535, 64, 768);
			Class101.aClass243_7.method26253(local7, local2);
		}
		local7 = local7.method7324((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method7328(arg1);
		}
		if (arg2 != 0) {
			local7.method7330(arg2);
		}
		if (arg3 != 0) {
			local7.method7318(arg3);
		}
		if (arg4 != 0) {
			local7.method7332(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!tx", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class586(@OriginalArg(0) Class480 arg0) {
		this.aClass480_126 = arg0;
		@Pc(16) String local16 = "";
		if (Class531.aString220.startsWith("win") || Class531.aString220.startsWith("windows 7")) {
			local16 = local16 + "windows/";
		} else if (Class531.aString220.startsWith("linux")) {
			local16 = local16 + "linux/";
		} else if (Class531.aString220.startsWith("mac")) {
			local16 = local16 + "macos/";
		}
		if (Class531.aString218.startsWith("amd64") || Class531.aString218.startsWith("x86_64")) {
			local16 = local16 + "x86_64/";
		} else if (Class531.aString218.startsWith("i386") || Class531.aString218.startsWith("i486") || Class531.aString218.startsWith("i586") || Class531.aString218.startsWith("x86")) {
			local16 = local16 + "x86/";
		} else if (Class531.aString218.startsWith("ppc")) {
			local16 = local16 + "ppc/";
		} else {
			local16 = local16 + "universal/";
		}
		this.aString226 = local16;
	}

	@OriginalMember(owner = "client!tx", name = "j", descriptor = "(Ljava/lang/String;ZB)I")
	public int method31865(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) throws Exception_Sub1 {
		if (this.aHashtable11.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class328.method27721(arg0, -1577110267);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString226 + local10;
				if (this.aClass480_126 == null || !this.aClass480_126.method29937(local8, "", (byte) -13)) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass480_126.method29987(local8, -1152370484)) {
			return this.aClass480_126.method29942(local8, 1592360697);
		}
		@Pc(78) byte[] local78 = this.aClass480_126.method29938(local8, "", -2084781587);
		if (local78 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(89) File local89 = null;
		try {
			local89 = Class292.method26945(local10, (byte) 16);
		} catch (@Pc(95) RuntimeException local95) {
			throw new Exception_Sub1(4, arg0, local95);
		}
		if (local89 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(113) boolean local113 = true;
		@Pc(117) byte[] local117 = Class480.method30006(local89, -724304847);
		if (local117 != null && local117.length == local78.length) {
			for (@Pc(127) int local127 = 0; local127 < local117.length; local127++) {
				if (local78[local127] != local117[local127]) {
					local113 = false;
					break;
				}
			}
		} else {
			local113 = false;
		}
		if (!local113) {
			try {
				@Pc(153) FileOutputStream local153 = new FileOutputStream(local89);
				local153.write(local78, 0, local78.length);
				local153.close();
			} catch (@Pc(163) Throwable local163) {
				throw new Exception_Sub1(6, arg0, local163);
			}
		}
		this.method31871(arg0, local89, (byte) -31);
		return 100;
	}

	@OriginalMember(owner = "client!tx", name = "h", descriptor = "(Ljava/lang/String;Z)I")
	public int method31866(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable11.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class328.method27721(arg0, 344529523);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString226 + local10;
				if (this.aClass480_126 == null || !this.aClass480_126.method29937(local8, "", (byte) -90)) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass480_126.method29987(local8, 1241509894)) {
			return this.aClass480_126.method29942(local8, 1033991419);
		}
		@Pc(78) byte[] local78 = this.aClass480_126.method29938(local8, "", -1560917924);
		if (local78 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(89) File local89 = null;
		try {
			local89 = Class292.method26945(local10, (byte) 16);
		} catch (@Pc(95) RuntimeException local95) {
			throw new Exception_Sub1(4, arg0, local95);
		}
		if (local89 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(113) boolean local113 = true;
		@Pc(117) byte[] local117 = Class480.method30006(local89, 731492171);
		if (local117 != null && local117.length == local78.length) {
			for (@Pc(127) int local127 = 0; local127 < local117.length; local127++) {
				if (local78[local127] != local117[local127]) {
					local113 = false;
					break;
				}
			}
		} else {
			local113 = false;
		}
		if (!local113) {
			try {
				@Pc(153) FileOutputStream local153 = new FileOutputStream(local89);
				local153.write(local78, 0, local78.length);
				local153.close();
			} catch (@Pc(163) Throwable local163) {
				throw new Exception_Sub1(6, arg0, local163);
			}
		}
		this.method31871(arg0, local89, (byte) -18);
		return 100;
	}

	@OriginalMember(owner = "client!tx", name = "z", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31867(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable11.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tx", name = "s", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)V")
	void method31869(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		@Pc(5) Class local5 = (Class) this.aHashtable10.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub7(1, arg0);
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) this.aHashtable11.get(arg0);
		}
		if (local21 == null) {
			throw new Exception_Sub7(4, arg0);
		}
		try {
			local21 = new File(local21.getCanonicalPath());
			@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
			@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local55.invoke(local71, Boolean.TRUE);
			local71.invoke(Runtime.getRuntime(), arg1, local21.getPath());
			local55.invoke(local71, Boolean.FALSE);
			this.aHashtable10.put(arg0, arg1);
		} catch (@Pc(114) NoSuchMethodException local114) {
			System.load(local21.getPath());
			this.aHashtable10.put(arg0, Class584.class);
		} catch (@Pc(125) Throwable local125) {
			throw new Exception_Sub7(3, arg0, local125);
		}
	}

	@OriginalMember(owner = "client!tx", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method31856(@OriginalArg(0) int arg0) {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable10.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable10.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable10.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable11.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable10.get(local64);
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
		this.aHashtable10 = local3;
		return this.aHashtable10.isEmpty();
	}

	@OriginalMember(owner = "client!tx", name = "u", descriptor = "(Ljava/lang/String;)V")
	@Override
	public void method31858(@OriginalArg(0) String arg0) throws Exception_Sub7 {
		this.method31869(arg0, Class584.class, 270034976);
	}

	@OriginalMember(owner = "client!tx", name = "l", descriptor = "(Ljava/lang/String;)V")
	@Override
	public void method31860(@OriginalArg(0) String arg0) throws Exception_Sub7 {
		this.method31869(arg0, Class584.class, 270034976);
	}

	@OriginalMember(owner = "client!tx", name = "y", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31870(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable11.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tx", name = "i", descriptor = "()Z")
	@Override
	public boolean method31857() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable10.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable10.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable10.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable11.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable10.get(local64);
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
		this.aHashtable10 = local3;
		return this.aHashtable10.isEmpty();
	}

	@OriginalMember(owner = "client!tx", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;B)V")
	void method31871(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) byte arg2) {
		this.aHashtable11.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tx", name = "p", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31873(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable11.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tx", name = "r", descriptor = "(Ljava/lang/String;Z)I")
	public int method31874(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable11.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class328.method27721(arg0, -756426919);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString226 + local10;
				if (this.aClass480_126 == null || !this.aClass480_126.method29937(local8, "", (byte) -47)) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass480_126.method29987(local8, 164362042)) {
			return this.aClass480_126.method29942(local8, 1691898521);
		}
		@Pc(78) byte[] local78 = this.aClass480_126.method29938(local8, "", -1890125294);
		if (local78 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(89) File local89 = null;
		try {
			local89 = Class292.method26945(local10, (byte) 16);
		} catch (@Pc(95) RuntimeException local95) {
			throw new Exception_Sub1(4, arg0, local95);
		}
		if (local89 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(113) boolean local113 = true;
		@Pc(117) byte[] local117 = Class480.method30006(local89, -2014950863);
		if (local117 != null && local117.length == local78.length) {
			for (@Pc(127) int local127 = 0; local127 < local117.length; local127++) {
				if (local78[local127] != local117[local127]) {
					local113 = false;
					break;
				}
			}
		} else {
			local113 = false;
		}
		if (!local113) {
			try {
				@Pc(153) FileOutputStream local153 = new FileOutputStream(local89);
				local153.write(local78, 0, local78.length);
				local153.close();
			} catch (@Pc(163) Throwable local163) {
				throw new Exception_Sub1(6, arg0, local163);
			}
		}
		this.method31871(arg0, local89, (byte) -38);
		return 100;
	}

	@OriginalMember(owner = "client!tx", name = "q", descriptor = "(Ljava/lang/String;Z)I")
	public int method31875(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable11.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class328.method27721(arg0, -2019753440);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString226 + local10;
				if (this.aClass480_126 == null || !this.aClass480_126.method29937(local8, "", (byte) -1)) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass480_126.method29987(local8, 279647059)) {
			return this.aClass480_126.method29942(local8, 640189002);
		}
		@Pc(78) byte[] local78 = this.aClass480_126.method29938(local8, "", -1658978989);
		if (local78 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(89) File local89 = null;
		try {
			local89 = Class292.method26945(local10, (byte) 16);
		} catch (@Pc(95) RuntimeException local95) {
			throw new Exception_Sub1(4, arg0, local95);
		}
		if (local89 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(113) boolean local113 = true;
		@Pc(117) byte[] local117 = Class480.method30006(local89, -1162479741);
		if (local117 != null && local117.length == local78.length) {
			for (@Pc(127) int local127 = 0; local127 < local117.length; local127++) {
				if (local78[local127] != local117[local127]) {
					local113 = false;
					break;
				}
			}
		} else {
			local113 = false;
		}
		if (!local113) {
			try {
				@Pc(153) FileOutputStream local153 = new FileOutputStream(local89);
				local153.write(local78, 0, local78.length);
				local153.close();
			} catch (@Pc(163) Throwable local163) {
				throw new Exception_Sub1(6, arg0, local163);
			}
		}
		this.method31871(arg0, local89, (byte) 22);
		return 100;
	}

	@OriginalMember(owner = "client!tx", name = "d", descriptor = "(Ljava/lang/String;Z)I")
	public int method31876(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub1 {
		if (this.aHashtable11.containsKey(arg0)) {
			return 100;
		}
		@Pc(8) String local8 = null;
		@Pc(10) String local10 = null;
		if (arg1) {
			local8 = arg0;
			local10 = arg0;
		} else {
			local10 = Class328.method27721(arg0, -1220851240);
			if (local10 == null) {
				throw new Exception_Sub1(1, arg0);
			}
			if (local8 == null) {
				local8 = this.aString226 + local10;
				if (this.aClass480_126 == null || !this.aClass480_126.method29937(local8, "", (byte) 12)) {
					throw new Exception_Sub1(2, arg0);
				}
			}
		}
		if (!this.aClass480_126.method29987(local8, 2010653257)) {
			return this.aClass480_126.method29942(local8, 1829243959);
		}
		@Pc(78) byte[] local78 = this.aClass480_126.method29938(local8, "", -1717692793);
		if (local78 == null) {
			throw new Exception_Sub1(3, arg0);
		}
		@Pc(89) File local89 = null;
		try {
			local89 = Class292.method26945(local10, (byte) 16);
		} catch (@Pc(95) RuntimeException local95) {
			throw new Exception_Sub1(4, arg0, local95);
		}
		if (local89 == null) {
			throw new Exception_Sub1(5, arg0);
		}
		@Pc(113) boolean local113 = true;
		@Pc(117) byte[] local117 = Class480.method30006(local89, 553106871);
		if (local117 != null && local117.length == local78.length) {
			for (@Pc(127) int local127 = 0; local127 < local117.length; local127++) {
				if (local78[local127] != local117[local127]) {
					local113 = false;
					break;
				}
			}
		} else {
			local113 = false;
		}
		if (!local113) {
			try {
				@Pc(153) FileOutputStream local153 = new FileOutputStream(local89);
				local153.write(local78, 0, local78.length);
				local153.close();
			} catch (@Pc(163) Throwable local163) {
				throw new Exception_Sub1(6, arg0, local163);
			}
		}
		this.method31871(arg0, local89, (byte) 19);
		return 100;
	}

	@OriginalMember(owner = "client!tx", name = "g", descriptor = "()Z")
	@Override
	public boolean method31861() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable10.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable10.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable10.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable11.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable10.get(local64);
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
		this.aHashtable10 = local3;
		return this.aHashtable10.isEmpty();
	}

	@OriginalMember(owner = "client!tx", name = "f", descriptor = "(Ljava/lang/String;I)Z")
	@Override
	public boolean method31862(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!tx", name = "v", descriptor = "(Ljava/lang/String;Ljava/io/File;)V")
	void method31877(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable11.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tx", name = "t", descriptor = "(Ljava/lang/String;I)V")
	@Override
	public void method31859(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method31869(arg0, Class584.class, 270034976);
	}

	@OriginalMember(owner = "client!tx", name = "m", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method31863(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}
}
