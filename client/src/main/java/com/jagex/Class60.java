package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acj")
public class Class60 {

	@OriginalMember(owner = "client!acj", name = "a", descriptor = "[Lclient!cm;")
	static Class100[] aClass100Array1;

	@OriginalMember(owner = "client!acj", name = "e", descriptor = "Lclient!aat;")
	static Class22 aClass22_2 = new Class22();

	@OriginalMember(owner = "client!acj", name = "<init>", descriptor = "()V", line = 11)
	Class60() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acj", name = "l", descriptor = "()V", line = 16)
	public static void method1110() {
		aClass22_2 = new Class22();
	}

	@OriginalMember(owner = "client!acj", name = "w", descriptor = "()V", line = 16)
	public static void method1111() {
		aClass22_2 = new Class22();
	}

	@OriginalMember(owner = "client!acj", name = "p", descriptor = "()Z", line = 20)
	public static boolean method1112() {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 85);
		return local4 != null;
	}

	@OriginalMember(owner = "client!acj", name = "z", descriptor = "()Z", line = 20)
	public static boolean method1113() {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 68);
		return local4 != null;
	}

	@OriginalMember(owner = "client!acj", name = "u", descriptor = "()Z", line = 20)
	public static boolean method1114() {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 22);
		return local4 != null;
	}

	@OriginalMember(owner = "client!acj", name = "r", descriptor = "(Lclient!ase;)V", line = 27)
	public static void method1115(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 21);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3070 * 212851357;
		arg0.method22406(local4.anInt1958 * 1291580777, (byte) 50);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1959 * -1741642847; local21++) {
			if (local4.anIntArray195[local21] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray194[local21];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getInt(null);
						arg0.method22394(0, (byte) -102);
						arg0.method22406(local58, (byte) 78);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local21];
						local54.setInt(null, local4.anIntArray196[local21]);
						arg0.method22394(0, (byte) -73);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getModifiers();
						arg0.method22394(0, (byte) 0);
						arg0.method22406(local58, (byte) 0);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local21];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray11[local21];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method22394(0, (byte) 3);
						} else if (local151 instanceof Number) {
							arg0.method22394(1, (byte) -67);
							arg0.method22420(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method22394(2, (byte) -66);
							arg0.method22431((String) local151, -219457501);
						} else {
							arg0.method22394(4, (byte) -67);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local21];
						local58 = local114.getModifiers();
						arg0.method22394(0, (byte) -21);
						arg0.method22406(local58, (byte) 63);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method22394(-10, (byte) -40);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method22394(-11, (byte) -11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method22394(-12, (byte) -119);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method22394(-13, (byte) -17);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method22394(-14, (byte) -70);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method22394(-15, (byte) -117);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method22394(-16, (byte) -115);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method22394(-17, (byte) -7);
				} catch (@Pc(258) IOException local258) {
					arg0.method22394(-18, (byte) -117);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method22394(-19, (byte) -98);
				} catch (@Pc(270) Exception local270) {
					arg0.method22394(-20, (byte) -81);
				} catch (@Pc(276) Throwable local276) {
					arg0.method22394(-21, (byte) 4);
				}
			} else {
				arg0.method22394(local4.anIntArray195[local21], (byte) -8);
			}
		}
		arg0.method22565(local12, 240257092);
		local4.method23969(219847270);
	}

	@OriginalMember(owner = "client!acj", name = "c", descriptor = "(Lclient!ase;)V", line = 27)
	public static void method1116(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 21);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3070 * 212851357;
		arg0.method22406(local4.anInt1958 * 1291580777, (byte) 97);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1959 * -1741642847; local21++) {
			if (local4.anIntArray195[local21] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray194[local21];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getInt(null);
						arg0.method22394(0, (byte) -124);
						arg0.method22406(local58, (byte) -44);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local21];
						local54.setInt(null, local4.anIntArray196[local21]);
						arg0.method22394(0, (byte) -54);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getModifiers();
						arg0.method22394(0, (byte) -71);
						arg0.method22406(local58, (byte) -19);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local21];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray11[local21];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method22394(0, (byte) -58);
						} else if (local151 instanceof Number) {
							arg0.method22394(1, (byte) -63);
							arg0.method22420(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method22394(2, (byte) -57);
							arg0.method22431((String) local151, 676720866);
						} else {
							arg0.method22394(4, (byte) -35);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local21];
						local58 = local114.getModifiers();
						arg0.method22394(0, (byte) -111);
						arg0.method22406(local58, (byte) -28);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method22394(-10, (byte) -112);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method22394(-11, (byte) -120);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method22394(-12, (byte) -25);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method22394(-13, (byte) -88);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method22394(-14, (byte) -55);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method22394(-15, (byte) -79);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method22394(-16, (byte) -75);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method22394(-17, (byte) -72);
				} catch (@Pc(258) IOException local258) {
					arg0.method22394(-18, (byte) -105);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method22394(-19, (byte) -14);
				} catch (@Pc(270) Exception local270) {
					arg0.method22394(-20, (byte) -21);
				} catch (@Pc(276) Throwable local276) {
					arg0.method22394(-21, (byte) -111);
				}
			} else {
				arg0.method22394(local4.anIntArray195[local21], (byte) -2);
			}
		}
		arg0.method22565(local12, 2012436616);
		local4.method23969(1026843011);
	}

	@OriginalMember(owner = "client!acj", name = "d", descriptor = "(Lclient!ase;)V", line = 27)
	public static void method1117(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) aClass22_2.method428((byte) 44);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3070 * 212851357;
		arg0.method22406(local4.anInt1958 * 1291580777, (byte) -76);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1959 * -1741642847; local21++) {
			if (local4.anIntArray195[local21] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray194[local21];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getInt(null);
						arg0.method22394(0, (byte) -97);
						arg0.method22406(local58, (byte) 24);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local21];
						local54.setInt(null, local4.anIntArray196[local21]);
						arg0.method22394(0, (byte) -109);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getModifiers();
						arg0.method22394(0, (byte) -87);
						arg0.method22406(local58, (byte) 39);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local21];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray11[local21];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method22394(0, (byte) -94);
						} else if (local151 instanceof Number) {
							arg0.method22394(1, (byte) -104);
							arg0.method22420(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method22394(2, (byte) -111);
							arg0.method22431((String) local151, 1931706283);
						} else {
							arg0.method22394(4, (byte) -68);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local21];
						local58 = local114.getModifiers();
						arg0.method22394(0, (byte) -5);
						arg0.method22406(local58, (byte) -25);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method22394(-10, (byte) -1);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method22394(-11, (byte) -15);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method22394(-12, (byte) -103);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method22394(-13, (byte) -2);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method22394(-14, (byte) -51);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method22394(-15, (byte) -50);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method22394(-16, (byte) -1);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method22394(-17, (byte) -36);
				} catch (@Pc(258) IOException local258) {
					arg0.method22394(-18, (byte) -9);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method22394(-19, (byte) -66);
				} catch (@Pc(270) Exception local270) {
					arg0.method22394(-20, (byte) -86);
				} catch (@Pc(276) Throwable local276) {
					arg0.method22394(-21, (byte) -50);
				}
			} else {
				arg0.method22394(local4.anIntArray195[local21], (byte) -15);
			}
		}
		arg0.method22565(local12, 878575948);
		local4.method23969(991539800);
	}

	@OriginalMember(owner = "client!acj", name = "w", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!nn;I)V", line = 42)
	public static void method1118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class443 arg8, @OriginalArg(9) int arg9) {
		@Pc(5) Class339 local5 = (Class339) Class329.aMap21.get(arg0);
		if (local5 == null) {
			local5 = new Class339();
			Class329.aMap21.put(arg0, local5);
		}
		@Pc(31) Class93_Sub1_Sub15 local31 = local5.method27474(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, -1288651725);
		Class329.aClass16_29.method220(local31, (long) (local31.anInt3090 * -565994431));
		Class329.aClass18_15.method250(local31, 1972872203);
		client.anInt3546 = client.anInt3565 * 165796023;
	}

	@OriginalMember(owner = "client!acj", name = "v", descriptor = "(Lclient!alw;I)V", line = 125)
	public static void method1119(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class93_Sub37 local3 = new Class93_Sub37();
		local3.anInt1959 = arg0.method22465((short) 16384) * 1817313377;
		local3.anInt1958 = arg0.method22483(-118643075) * -1260131623;
		local3.anIntArray194 = new int[local3.anInt1959 * -1741642847];
		local3.anIntArray195 = new int[local3.anInt1959 * -1741642847];
		local3.aFieldArray1 = new Field[local3.anInt1959 * -1741642847];
		local3.anIntArray196 = new int[local3.anInt1959 * -1741642847];
		local3.aMethodArray1 = new Method[local3.anInt1959 * -1741642847];
		local3.aByteArrayArrayArray11 = new byte[local3.anInt1959 * -1741642847][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1959 * -1741642847; local61++) {
			try {
				@Pc(71) int local71 = arg0.method22465((short) 16384);
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local84 = arg0.method22509(385003114);
					local88 = arg0.method22509(-102553614);
					local90 = 0;
					if (local71 == 1) {
						local90 = arg0.method22483(-118643075);
					}
					local3.anIntArray194[local61] = local71;
					local3.anIntArray196[local61] = local90;
					if (Class39.method770(local84, -272644555).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class39.method770(local84, -625021198).getDeclaredField(local88);
				} else if (local71 == 3 || local71 == 4) {
					local84 = arg0.method22509(342906002);
					local88 = arg0.method22509(-174010480);
					local90 = arg0.method22465((short) 16384);
					@Pc(147) String[] local147 = new String[local90];
					for (@Pc(149) int local149 = 0; local149 < local90; local149++) {
						local147[local149] = arg0.method22509(1556814046);
					}
					@Pc(164) String local164 = arg0.method22509(-105621759);
					@Pc(167) byte[][] local167 = new byte[local90][];
					@Pc(179) int local179;
					if (local71 == 3) {
						for (@Pc(172) int local172 = 0; local172 < local90; local172++) {
							local179 = arg0.method22483(-118643075);
							local167[local172] = new byte[local179];
							arg0.method22518(local167[local172], 0, local179, (short) 18016);
						}
					}
					local3.anIntArray194[local61] = local71;
					@Pc(202) Class[] local202 = new Class[local90];
					for (local179 = 0; local179 < local90; local179++) {
						local202[local179] = Class39.method770(local147[local179], -2098266307);
					}
					@Pc(221) Class local221 = Class39.method770(local164, -1615353923);
					if (Class39.method770(local84, -1323504757).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(235) Method[] local235 = Class39.method770(local84, -510691440).getDeclaredMethods();
					@Pc(237) Method[] local237 = local235;
					for (@Pc(239) int local239 = 0; local239 < local237.length; local239++) {
						@Pc(247) Method local247 = local237[local239];
						if (local247.getName().equals(local88)) {
							@Pc(255) Class[] local255 = local247.getParameterTypes();
							if (local255.length == local202.length) {
								@Pc(262) boolean local262 = true;
								for (@Pc(264) int local264 = 0; local264 < local202.length; local264++) {
									if (local255[local264] != local202[local264]) {
										local262 = false;
										break;
									}
								}
								if (local262 && local221 == local247.getReturnType()) {
									local3.aMethodArray1[local61] = local247;
								}
							}
						}
					}
					local3.aByteArrayArrayArray11[local61] = local167;
				}
			} catch (@Pc(300) ClassNotFoundException local300) {
				local3.anIntArray195[local61] = -1;
			} catch (@Pc(307) SecurityException local307) {
				local3.anIntArray195[local61] = -2;
			} catch (@Pc(314) NullPointerException local314) {
				local3.anIntArray195[local61] = -3;
			} catch (@Pc(321) Exception local321) {
				local3.anIntArray195[local61] = -4;
			} catch (@Pc(328) Throwable local328) {
				local3.anIntArray195[local61] = -5;
			}
		}
		aClass22_2.method408(local3, 269476450);
	}

	@OriginalMember(owner = "client!acj", name = "o", descriptor = "(Lclient!alw;I)V", line = 125)
	public static void method1120(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class93_Sub37 local3 = new Class93_Sub37();
		local3.anInt1959 = arg0.method22465((short) 16384) * 1817313377;
		local3.anInt1958 = arg0.method22483(-118643075) * -1260131623;
		local3.anIntArray194 = new int[local3.anInt1959 * -1741642847];
		local3.anIntArray195 = new int[local3.anInt1959 * -1741642847];
		local3.aFieldArray1 = new Field[local3.anInt1959 * -1741642847];
		local3.anIntArray196 = new int[local3.anInt1959 * -1741642847];
		local3.aMethodArray1 = new Method[local3.anInt1959 * -1741642847];
		local3.aByteArrayArrayArray11 = new byte[local3.anInt1959 * -1741642847][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1959 * -1741642847; local61++) {
			try {
				@Pc(71) int local71 = arg0.method22465((short) 16384);
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local84 = arg0.method22509(1763160615);
					local88 = arg0.method22509(1351251985);
					local90 = 0;
					if (local71 == 1) {
						local90 = arg0.method22483(-118643075);
					}
					local3.anIntArray194[local61] = local71;
					local3.anIntArray196[local61] = local90;
					if (Class39.method770(local84, -509301537).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class39.method770(local84, -30356915).getDeclaredField(local88);
				} else if (local71 == 3 || local71 == 4) {
					local84 = arg0.method22509(1230672838);
					local88 = arg0.method22509(333682473);
					local90 = arg0.method22465((short) 16384);
					@Pc(147) String[] local147 = new String[local90];
					for (@Pc(149) int local149 = 0; local149 < local90; local149++) {
						local147[local149] = arg0.method22509(131094082);
					}
					@Pc(164) String local164 = arg0.method22509(2014756664);
					@Pc(167) byte[][] local167 = new byte[local90][];
					@Pc(179) int local179;
					if (local71 == 3) {
						for (@Pc(172) int local172 = 0; local172 < local90; local172++) {
							local179 = arg0.method22483(-118643075);
							local167[local172] = new byte[local179];
							arg0.method22518(local167[local172], 0, local179, (short) 1665);
						}
					}
					local3.anIntArray194[local61] = local71;
					@Pc(202) Class[] local202 = new Class[local90];
					for (local179 = 0; local179 < local90; local179++) {
						local202[local179] = Class39.method770(local147[local179], -1000839326);
					}
					@Pc(221) Class local221 = Class39.method770(local164, -1163848747);
					if (Class39.method770(local84, -693263329).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(235) Method[] local235 = Class39.method770(local84, -2031957121).getDeclaredMethods();
					@Pc(237) Method[] local237 = local235;
					for (@Pc(239) int local239 = 0; local239 < local237.length; local239++) {
						@Pc(247) Method local247 = local237[local239];
						if (local247.getName().equals(local88)) {
							@Pc(255) Class[] local255 = local247.getParameterTypes();
							if (local255.length == local202.length) {
								@Pc(262) boolean local262 = true;
								for (@Pc(264) int local264 = 0; local264 < local202.length; local264++) {
									if (local255[local264] != local202[local264]) {
										local262 = false;
										break;
									}
								}
								if (local262 && local221 == local247.getReturnType()) {
									local3.aMethodArray1[local61] = local247;
								}
							}
						}
					}
					local3.aByteArrayArrayArray11[local61] = local167;
				}
			} catch (@Pc(300) ClassNotFoundException local300) {
				local3.anIntArray195[local61] = -1;
			} catch (@Pc(307) SecurityException local307) {
				local3.anIntArray195[local61] = -2;
			} catch (@Pc(314) NullPointerException local314) {
				local3.anIntArray195[local61] = -3;
			} catch (@Pc(321) Exception local321) {
				local3.anIntArray195[local61] = -4;
			} catch (@Pc(328) Throwable local328) {
				local3.anIntArray195[local61] = -5;
			}
		}
		aClass22_2.method408(local3, 526607400);
	}

	@OriginalMember(owner = "client!acj", name = "s", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method1121(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "y", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method1122(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!acj", name = "q", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method1123(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
