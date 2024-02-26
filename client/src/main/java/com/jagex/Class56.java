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

@OriginalClass("client!acf")
public final class Class56 {

	@OriginalMember(owner = "client!acf", name = "ff", descriptor = "Lclient!pf;")
	public static Class480 aClass480_7;

	@OriginalMember(owner = "client!acf", name = "t", descriptor = "Lclient!aag;")
	static Class8 aClass8_3 = new Class8();

	@OriginalMember(owner = "client!acf", name = "k", descriptor = "(Lclient!asa;)V")
	public static void method1123(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.pos * -1380987821;
		arg0.p4(local4.anInt1944 * 1541484113);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1945 * -743322597; local21++) {
			if (local4.anIntArray197[local21] == 0) {
				try {
					@Pc(45) int local45 = local4.anIntArray198[local21];
					@Pc(53) Field local53;
					@Pc(57) int local57;
					if (local45 == 0) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getInt(null);
						arg0.p1(0);
						arg0.p4(local57);
					} else if (local45 == 1) {
						local53 = local4.aFieldArray1[local21];
						local53.setInt(null, local4.anIntArray199[local21]);
						arg0.p1(0);
					} else if (local45 == 2) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
					@Pc(113) Method local113;
					if (local45 == 3) {
						local113 = local4.aMethodArray1[local21];
						@Pc(118) byte[][] local118 = local4.aByteArrayArrayArray9[local21];
						@Pc(122) Object[] local122 = new Object[local118.length];
						for (@Pc(124) int local124 = 0; local124 < local118.length; local124++) {
							@Pc(138) ObjectInputStream local138 = new ObjectInputStream(new ByteArrayInputStream(local118[local124]));
							local122[local124] = local138.readObject();
						}
						@Pc(150) Object local150 = local113.invoke(null, local122);
						if (local150 == null) {
							arg0.p1(0);
						} else if (local150 instanceof Number) {
							arg0.p1(1);
							arg0.p8(((Number) local150).longValue());
						} else if (local150 instanceof String) {
							arg0.p1(2);
							arg0.pjstr((String) local150);
						} else {
							arg0.p1(4);
						}
					} else if (local45 == 4) {
						local113 = local4.aMethodArray1[local21];
						local57 = local113.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.p1(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.p1(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.p1(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.p1(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.p1(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.p1(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.p1(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.p1(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.p1(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.p1(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.p1(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.p1(-21);
				}
			} else {
				arg0.p1(local4.anIntArray197[local21]);
			}
		}
		arg0.addcrc(local12);
		local4.method24395((byte) 90);
	}

	@OriginalMember(owner = "client!acf", name = "g", descriptor = "()V")
	public static void method1124() {
		aClass8_3 = new Class8();
	}

	@OriginalMember(owner = "client!acf", name = "i", descriptor = "()V")
	public static void method1125() {
		aClass8_3 = new Class8();
	}

	@OriginalMember(owner = "client!acf", name = "o", descriptor = "()Z")
	public static boolean method1126() {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		return local4 != null;
	}

	@OriginalMember(owner = "client!acf", name = "p", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	static Class method1127(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!acf", name = "x", descriptor = "(Lclient!ald;I)V")
	public static void method1128(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.g1() * 1702047251;
		local3.anInt1944 = arg0.g4() * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.g1();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.g4();
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = arg0.g1();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.gjstr();
					}
					@Pc(163) String local163 = arg0.gjstr();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.g4();
							local166[local171] = new byte[local178];
							arg0.gdata(local166[local171], 0, local178);
						}
					}
					local3.anIntArray198[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class269.method26686(local146[local178], -1291585275);
					}
					@Pc(220) Class local220 = Class269.method26686(local163, -1291585275);
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class269.method26686(local83, -1291585275).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local254.length == local201.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray197[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray197[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray197[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray197[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray197[local61] = -5;
			}
		}
		aClass8_3.method232(local3, -109122668);
	}

	@OriginalMember(owner = "client!acf", name = "s", descriptor = "(Lclient!asa;)V")
	public static void method1129(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.pos * -1380987821;
		arg0.p4(local4.anInt1944 * 1541484113);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1945 * -743322597; local21++) {
			if (local4.anIntArray197[local21] == 0) {
				try {
					@Pc(45) int local45 = local4.anIntArray198[local21];
					@Pc(53) Field local53;
					@Pc(57) int local57;
					if (local45 == 0) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getInt(null);
						arg0.p1(0);
						arg0.p4(local57);
					} else if (local45 == 1) {
						local53 = local4.aFieldArray1[local21];
						local53.setInt(null, local4.anIntArray199[local21]);
						arg0.p1(0);
					} else if (local45 == 2) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
					@Pc(113) Method local113;
					if (local45 == 3) {
						local113 = local4.aMethodArray1[local21];
						@Pc(118) byte[][] local118 = local4.aByteArrayArrayArray9[local21];
						@Pc(122) Object[] local122 = new Object[local118.length];
						for (@Pc(124) int local124 = 0; local124 < local118.length; local124++) {
							@Pc(138) ObjectInputStream local138 = new ObjectInputStream(new ByteArrayInputStream(local118[local124]));
							local122[local124] = local138.readObject();
						}
						@Pc(150) Object local150 = local113.invoke(null, local122);
						if (local150 == null) {
							arg0.p1(0);
						} else if (local150 instanceof Number) {
							arg0.p1(1);
							arg0.p8(((Number) local150).longValue());
						} else if (local150 instanceof String) {
							arg0.p1(2);
							arg0.pjstr((String) local150);
						} else {
							arg0.p1(4);
						}
					} else if (local45 == 4) {
						local113 = local4.aMethodArray1[local21];
						local57 = local113.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.p1(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.p1(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.p1(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.p1(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.p1(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.p1(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.p1(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.p1(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.p1(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.p1(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.p1(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.p1(-21);
				}
			} else {
				arg0.p1(local4.anIntArray197[local21]);
			}
		}
		arg0.addcrc(local12);
		local4.method24395((byte) 110);
	}

	@OriginalMember(owner = "client!acf", name = "q", descriptor = "(Lclient!ald;I)V")
	public static void method1130(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.g1() * 1702047251;
		local3.anInt1944 = arg0.g4() * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.g1();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.g4();
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = arg0.g1();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.gjstr();
					}
					@Pc(163) String local163 = arg0.gjstr();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.g4();
							local166[local171] = new byte[local178];
							arg0.gdata(local166[local171], 0, local178);
						}
					}
					local3.anIntArray198[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class269.method26686(local146[local178], -1291585275);
					}
					@Pc(220) Class local220 = Class269.method26686(local163, -1291585275);
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class269.method26686(local83, -1291585275).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local254.length == local201.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray197[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray197[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray197[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray197[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray197[local61] = -5;
			}
		}
		aClass8_3.method232(local3, 1675064598);
	}

	@OriginalMember(owner = "client!acf", name = "a", descriptor = "(Lclient!asa;)V")
	public static void method1131(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.pos * -1380987821;
		arg0.p4(local4.anInt1944 * 1541484113);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1945 * -743322597; local21++) {
			if (local4.anIntArray197[local21] == 0) {
				try {
					@Pc(45) int local45 = local4.anIntArray198[local21];
					@Pc(53) Field local53;
					@Pc(57) int local57;
					if (local45 == 0) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getInt(null);
						arg0.p1(0);
						arg0.p4(local57);
					} else if (local45 == 1) {
						local53 = local4.aFieldArray1[local21];
						local53.setInt(null, local4.anIntArray199[local21]);
						arg0.p1(0);
					} else if (local45 == 2) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
					@Pc(113) Method local113;
					if (local45 == 3) {
						local113 = local4.aMethodArray1[local21];
						@Pc(118) byte[][] local118 = local4.aByteArrayArrayArray9[local21];
						@Pc(122) Object[] local122 = new Object[local118.length];
						for (@Pc(124) int local124 = 0; local124 < local118.length; local124++) {
							@Pc(138) ObjectInputStream local138 = new ObjectInputStream(new ByteArrayInputStream(local118[local124]));
							local122[local124] = local138.readObject();
						}
						@Pc(150) Object local150 = local113.invoke(null, local122);
						if (local150 == null) {
							arg0.p1(0);
						} else if (local150 instanceof Number) {
							arg0.p1(1);
							arg0.p8(((Number) local150).longValue());
						} else if (local150 instanceof String) {
							arg0.p1(2);
							arg0.pjstr((String) local150);
						} else {
							arg0.p1(4);
						}
					} else if (local45 == 4) {
						local113 = local4.aMethodArray1[local21];
						local57 = local113.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.p1(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.p1(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.p1(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.p1(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.p1(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.p1(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.p1(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.p1(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.p1(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.p1(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.p1(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.p1(-21);
				}
			} else {
				arg0.p1(local4.anIntArray197[local21]);
			}
		}
		arg0.addcrc(local12);
		local4.method24395((byte) 31);
	}

	@OriginalMember(owner = "client!acf", name = "w", descriptor = "(Lclient!ald;I)V")
	public static void method1132(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.g1() * 1702047251;
		local3.anInt1944 = arg0.g4() * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.g1();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.g4();
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = arg0.g1();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.gjstr();
					}
					@Pc(163) String local163 = arg0.gjstr();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.g4();
							local166[local171] = new byte[local178];
							arg0.gdata(local166[local171], 0, local178);
						}
					}
					local3.anIntArray198[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class269.method26686(local146[local178], -1291585275);
					}
					@Pc(220) Class local220 = Class269.method26686(local163, -1291585275);
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class269.method26686(local83, -1291585275).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local254.length == local201.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray197[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray197[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray197[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray197[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray197[local61] = -5;
			}
		}
		aClass8_3.method232(local3, 1847803740);
	}

	@OriginalMember(owner = "client!acf", name = "r", descriptor = "(Lclient!ald;I)V")
	public static void method1133(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.g1() * 1702047251;
		local3.anInt1944 = arg0.g4() * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.g1();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.g4();
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = arg0.g1();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.gjstr();
					}
					@Pc(163) String local163 = arg0.gjstr();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.g4();
							local166[local171] = new byte[local178];
							arg0.gdata(local166[local171], 0, local178);
						}
					}
					local3.anIntArray198[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class269.method26686(local146[local178], -1291585275);
					}
					@Pc(220) Class local220 = Class269.method26686(local163, -1291585275);
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class269.method26686(local83, -1291585275).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local254.length == local201.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray197[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray197[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray197[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray197[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray197[local61] = -5;
			}
		}
		aClass8_3.method232(local3, 352727367);
	}

	@OriginalMember(owner = "client!acf", name = "j", descriptor = "(Lclient!asa;)V")
	public static void method1134(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.pos * -1380987821;
		arg0.p4(local4.anInt1944 * 1541484113);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1945 * -743322597; local21++) {
			if (local4.anIntArray197[local21] == 0) {
				try {
					@Pc(45) int local45 = local4.anIntArray198[local21];
					@Pc(53) Field local53;
					@Pc(57) int local57;
					if (local45 == 0) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getInt(null);
						arg0.p1(0);
						arg0.p4(local57);
					} else if (local45 == 1) {
						local53 = local4.aFieldArray1[local21];
						local53.setInt(null, local4.anIntArray199[local21]);
						arg0.p1(0);
					} else if (local45 == 2) {
						local53 = local4.aFieldArray1[local21];
						local57 = local53.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
					@Pc(113) Method local113;
					if (local45 == 3) {
						local113 = local4.aMethodArray1[local21];
						@Pc(118) byte[][] local118 = local4.aByteArrayArrayArray9[local21];
						@Pc(122) Object[] local122 = new Object[local118.length];
						for (@Pc(124) int local124 = 0; local124 < local118.length; local124++) {
							@Pc(138) ObjectInputStream local138 = new ObjectInputStream(new ByteArrayInputStream(local118[local124]));
							local122[local124] = local138.readObject();
						}
						@Pc(150) Object local150 = local113.invoke(null, local122);
						if (local150 == null) {
							arg0.p1(0);
						} else if (local150 instanceof Number) {
							arg0.p1(1);
							arg0.p8(((Number) local150).longValue());
						} else if (local150 instanceof String) {
							arg0.p1(2);
							arg0.pjstr((String) local150);
						} else {
							arg0.p1(4);
						}
					} else if (local45 == 4) {
						local113 = local4.aMethodArray1[local21];
						local57 = local113.getModifiers();
						arg0.p1(0);
						arg0.p4(local57);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.p1(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.p1(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.p1(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.p1(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.p1(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.p1(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.p1(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.p1(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.p1(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.p1(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.p1(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.p1(-21);
				}
			} else {
				arg0.p1(local4.anIntArray197[local21]);
			}
		}
		arg0.addcrc(local12);
		local4.method24395((byte) 23);
	}

	@OriginalMember(owner = "client!acf", name = "h", descriptor = "(Lclient!ald;I)V")
	public static void method1135(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.g1() * 1702047251;
		local3.anInt1944 = arg0.g4() * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.g1();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.g4();
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.gjstr();
					local87 = arg0.gjstr();
					local89 = arg0.g1();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.gjstr();
					}
					@Pc(163) String local163 = arg0.gjstr();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.g4();
							local166[local171] = new byte[local178];
							arg0.gdata(local166[local171], 0, local178);
						}
					}
					local3.anIntArray198[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class269.method26686(local146[local178], -1291585275);
					}
					@Pc(220) Class local220 = Class269.method26686(local163, -1291585275);
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class269.method26686(local83, -1291585275).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local254.length == local201.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray197[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray197[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray197[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray197[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray197[local61] = -5;
			}
		}
		aClass8_3.method232(local3, 144206956);
	}

	@OriginalMember(owner = "client!acf", name = "d", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	static Class method1136(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!acf", name = "m", descriptor = "()Z")
	public static boolean method1137() {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) aClass8_3.method247(129206984);
		return local4 != null;
	}

	@OriginalMember(owner = "client!acf", name = "z", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	static Class method1138(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!acf", name = "ata", descriptor = "(Lclient!yp;I)V")
	static void method1139(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!acf", name = "jr", descriptor = "(IIIIIIB)V")
	static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		client.anInt3563 = 0;
		@Pc(15) int local15;
		if (client.anInt3541 * -1330995431 == 0) {
			local15 = Class251.aClass254Array1.length;
		} else {
			local15 = client.anInt3453 * -1702559601 + local3;
		}
		@Pc(24) int local24;
		@Pc(345) int local345;
		@Pc(354) int local354;
		@Pc(229) int local229;
		@Pc(582) int local582;
		@Pc(791) int local791;
		@Pc(600) int local600;
		@Pc(605) int local605;
		@Pc(1030) int local1030;
		@Pc(412) int local412;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(29) Class335 local29 = null;
			@Pc(46) Class120_Sub1_Sub1_Sub1 local46;
			if (client.anInt3541 * -1330995431 == 0) {
				@Pc(38) Class254 local38 = Class251.aClass254Array1[local24];
				if (!local38.aBoolean775) {
					continue;
				}
				local46 = local38.method26399((byte) 34);
				if (local46.anInt2693 * -1605634793 != client.anInt3496 * 939223631) {
					continue;
				}
				if (local38.anInt3883 * -1541676249 >= 0) {
					local29 = ((Class120_Sub1_Sub1_Sub1_Sub1) local46).aClass335_1;
					if (local29.anIntArray416 != null) {
						local29 = local29.method27836(Class672.aClass134_1, Class672.aClass134_1, -990723940);
						if (local29 == null) {
							continue;
						}
					}
				}
			} else {
				if (local24 < local3) {
					local46 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
				} else {
					local46 = (Class120_Sub1_Sub1_Sub1) ((Class80_Sub19) client.aClass24_18.method560((long) client.anIntArray304[local24 - local3])).anObject5;
					local29 = ((Class120_Sub1_Sub1_Sub1_Sub1) local46).aClass335_1;
					if (local29.anIntArray416 != null) {
						local29 = local29.method27836(Class672.aClass134_1, Class672.aClass134_1, -815330513);
						if (local29 == null) {
							continue;
						}
					}
				}
				if (local46.anInt2673 * -1338204261 < 0 || local46.anInt2693 * -1605634793 != client.anInt3496 * 939223631 && local46.aByte99 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99) {
					continue;
				}
			}
			Class143.method11837(local46, local46.method24601(-172104563), false, (byte) 46);
			if (!(client.aFloatArray95[0] < 0.0F)) {
				if (local46.method18973((byte) 45)) {
					@Pc(159) Class558 local159 = local46.method18974(-417528672);
					if (local159 != null && client.anInt3563 * 769489387 < client.anInt3564 * -2127638713) {
						@Pc(173) String local173 = local159.method31388(-2115160097);
						if (Class448.aClass341_1.method27910((byte) -111)) {
							local173 = Class448.aClass341_1.method27917(local173, -1753640275);
						}
						client.anIntArray322[client.anInt3563 * 769489387] = Class375.aClass15_9.method373(local173, -599404910) / 2;
						client.anIntArray326[client.anInt3563 * 769489387] = (int) client.aFloatArray95[0];
						client.anIntArray334[client.anInt3563 * 769489387] = (int) client.aFloatArray95[1];
						client.aClass558Array1[client.anInt3563 * 769489387] = local159;
						client.anInt3563 += 42591939;
					}
				}
				local229 = (int) ((float) arg1 + client.aFloatArray95[1]);
				local229 -= Class375.aClass15_9.anInt45 * 1190692343;
				@Pc(238) boolean local238 = false;
				@Pc(265) Class602 local265;
				@Pc(300) Class99 local300;
				@Pc(490) int local490;
				if (!local46.aBoolean452 && !local46.aClass5_5.method95(1969605666)) {
					for (@Pc(252) Class147_Sub1 local252 = (Class147_Sub1) local46.aClass5_5.method93((byte) -29); local252 != null; local252 = (Class147_Sub1) local46.aClass5_5.method110(-1883109513)) {
						@Pc(259) Class147_Sub2 local259 = local252.method13115(client.anInt3436, -1939784488);
						if (local259 != null) {
							local265 = local252.aClass602_1;
							@Pc(271) Class120_Sub1_Sub1_Sub1_Sub2 local271 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
							@Pc(291) Class99 local291;
							if (local271 == null || local271.aClass289_1 == Class289.aClass289_2) {
								local291 = local265.method32112(Class279.aClass102_9, local265.anInt5387 * 204279387, 1947908373);
								local300 = local265.method32112(Class279.aClass102_9, local265.anInt5386 * -832929669, 2098549534);
							} else if (local271.aClass289_1 == Class289.aClass289_3) {
								local291 = local265.method32112(Class279.aClass102_9, local265.anInt5380 * -1013144005, 2065441797);
								local300 = local265.method32112(Class279.aClass102_9, local265.anInt5388 * -912707133, 2088365679);
							} else {
								local291 = local265.method32112(Class279.aClass102_9, local265.anInt5391 * 690227773, 1798224362);
								local300 = local265.method32112(Class279.aClass102_9, local265.anInt5389 * -1444857769, 2029715419);
							}
							if (local291 != null && local300 != null) {
								local345 = 255;
								@Pc(347) boolean local347 = true;
								local354 = client.anInt3436 - local259.anInt1484 * -1345244181;
								@Pc(364) int local364 = local300.method18218() * -1551384441 * local259.anInt1483 / 255;
								@Pc(389) int local389;
								@Pc(399) int local399;
								if (local259.anInt1482 * -1891247153 > local354) {
									local389 = local265.anInt5385 * 134212557 == 0 ? 0 : local265.anInt5385 * 134212557 * (local354 / (local265.anInt5385 * 134212557));
									local399 = local300.method18218() * 856364969 * local259.anInt1481 / 255;
									local412 = local399 + local389 * (local364 - local399) / (local259.anInt1482 * -1891247153);
								} else {
									local412 = local364;
									local389 = local259.anInt1482 * -1891247153 + local265.anInt5390 * 1602309387 - local354;
									if (local265.anInt5384 * 1352559261 >= 0) {
										local345 = (local389 << 8) / (local265.anInt5390 * 1602309387 - local265.anInt5384 * 1352559261);
									}
								}
								if (local259.anInt1483 * -1551384441 > 0 && local412 < 2) {
									local412 = 2;
								}
								local389 = local291.method18219();
								local399 = (int) ((float) arg0 + client.aFloatArray95[0] - (float) (local291.method18218() >> 1));
								local229 -= local389;
								if (local345 >= 0 && local345 < 255) {
									@Pc(486) int local486 = local345 << 24;
									local490 = local486 | 0xFFFFFF;
									local291.method18226(local399, local229, 0, local490, 1);
									Class279.aClass102_9.method20972(local399, local229, local412 + local399, local389 + local229);
									local300.method18226(local399, local229, 0, local490, 1);
								} else {
									local291.method18225(local399, local229);
									Class279.aClass102_9.method20972(local399, local229, local399 + local412, local389 + local229);
									local300.method18225(local399, local229);
								}
								Class279.aClass102_9.method20986(arg0, arg1, arg0 + arg2, arg1 + arg3);
								local229 -= 2;
								local238 = true;
							}
						} else if (local252.method13110(2043313030)) {
							local252.method23926(1007154419);
						}
					}
				}
				if (!local238) {
					local229 -= Class698.aClass638_1.anInt5619 * -1815014775 + 2;
				}
				if (!local46.aBoolean452) {
					@Pc(612) long local612;
					@Pc(625) Class109[] local625;
					if (local29 == null) {
						@Pc(580) Class120_Sub1_Sub1_Sub1_Sub2 local580 = (Class120_Sub1_Sub1_Sub1_Sub2) local46;
						for (local582 = 0; local582 < local580.anIntArray244.length; local582++) {
							if (local580.anIntArray244[local582] >= 0) {
								local265 = null;
								local600 = local580.anIntArray244[local582];
								local605 = local580.anIntArray245[local582];
								local612 = local605 << 8 | local600;
								@Pc(617) Class99 local617 = (Class99) client.aClass243_67.method26282(local612);
								if (local617 == null) {
									local625 = Class212.method25824(Class708.aClass480_136, local605, 0);
									if (local625 == null) {
										continue;
									}
									local617 = Class279.aClass102_9.method20906(local625[local600], true);
									client.aClass243_67.method26253(local617, local612);
								}
								if (local617 != null) {
									local229 -= local617.method18219();
									local617.method18225((int) ((float) arg0 + client.aFloatArray95[0] - 12.0F), local229);
									local229 -= 2;
								}
							}
						}
					} else {
						@Pc(666) Class120_Sub1_Sub1_Sub1_Sub1 local666 = (Class120_Sub1_Sub1_Sub1_Sub1) local46;
						@Pc(678) int[] local678 = local666.aClass351_1 == null ? local666.aClass335_1.anIntArray415 : local666.aClass351_1.anIntArray423;
						@Pc(689) short[] local689 = local666.aClass351_1 == null ? local666.aClass335_1.aShortArray118 : local666.aClass351_1.aShortArray121;
						if (local689 != null && local678 != null) {
							for (local600 = 0; local600 < local689.length; local600++) {
								if (local689[local600] >= 0 && local678[local600] >= 0) {
									local300 = null;
									local612 = local678[local600] << 8 | local689[local600];
									local300 = (Class99) client.aClass243_67.method26282(local612);
									if (local300 == null) {
										local625 = Class212.method25824(Class708.aClass480_136, local678[local600], 0);
										if (local625 == null) {
											continue;
										}
										local300 = Class279.aClass102_9.method20906(local625[local689[local600]], true);
										client.aClass243_67.method26253(local300, local612);
									}
									if (local300 != null) {
										local229 -= local300.method18219();
										local300.method18225((int) ((float) arg0 + client.aFloatArray95[0] - (float) (local300.method18218() >> 1)), local229);
										local229 -= 2;
									}
								}
							}
						}
					}
				}
				@Pc(853) int local853;
				@Pc(787) int local787;
				@Pc(789) Class101[] local789;
				@Pc(799) Class101 local799;
				if (!(local46 instanceof Class120_Sub1_Sub1_Sub1_Sub2)) {
					local787 = 0;
					local789 = client.aClass101Array1;
					for (local791 = 0; local791 < local789.length; local791++) {
						local799 = local789[local791];
						if (local799 != null && local799.anInt467 * 1614016575 == 1 && client.anIntArray304[local24 - local3] == local799.anInt464 * 1096614689) {
							local300 = Class668.aClass99Array8[local799.anInt461 * -168952975];
							if (local300.method18219() > local787) {
								local787 = local300.method18219();
							}
							@Pc(908) boolean local908;
							if (local799.anInt469 * -293042121 == 0) {
								local908 = true;
							} else {
								local345 = Class165_Sub11.method16047((byte) -49) * 1000 / (local799.anInt469 * -293042121) / 2;
								local908 = client.anInt3436 % (local345 * 2) < local345;
							}
							if (local908) {
								local300.method18225((int) (client.aFloatArray95[0] + (float) arg0 - 12.0F), local229 - local300.method18219());
							}
						}
					}
					if (local787 > 0) {
						local853 = local229 - (local787 + 2);
					}
				} else if (local24 >= 0) {
					local787 = 0;
					local789 = client.aClass101Array1;
					for (local791 = 0; local791 < local789.length; local791++) {
						local799 = local789[local791];
						if (local799 != null && local799.anInt467 * 1614016575 == 10 && local799.anInt464 * 1096614689 == local5[local24]) {
							local300 = Class668.aClass99Array8[local799.anInt461 * -168952975];
							if (local300.method18219() > local787) {
								local787 = local300.method18219();
							}
							local300.method18225((int) ((float) arg0 + client.aFloatArray95[0] - 12.0F), local229 - local300.method18219());
						}
					}
					if (local787 > 0) {
						local853 = local229 - (local787 + 2);
					}
				}
				for (local787 = 0; local787 < Class698.aClass638_1.anInt5604 * -1859327601; local787++) {
					local582 = local46.anIntArray237[local787];
					local791 = local46.anIntArray236[local787];
					@Pc(979) Class613 local979 = null;
					local605 = 0;
					if (local791 >= 0) {
						if (local582 <= client.anInt3436) {
							continue;
						}
						local979 = (Class613) Class510.aClass41_Sub15_1.method18054(local46.anIntArray236[local787], 969390332);
						local605 = local979.anInt5405 * 1965465901;
						if (local979 != null && local979.anIntArray494 != null) {
							local979 = local979.method32237(Class672.aClass134_1, Class672.aClass134_1, 1071006179);
							if (local979 == null) {
								local46.anIntArray237[local787] = -1;
								continue;
							}
						}
					} else if (local582 < 0) {
						continue;
					}
					local1030 = local46.anIntArray238[local787];
					@Pc(1032) Class613 local1032 = null;
					if (local1030 >= 0) {
						local1032 = (Class613) Class510.aClass41_Sub15_1.method18054(local1030, -705568725);
						if (local1032 != null && local1032.anIntArray494 != null) {
							local1032 = local1032.method32237(Class672.aClass134_1, Class672.aClass134_1, 1071006179);
						}
					}
					if (local582 - local605 <= client.anInt3436) {
						if (local979 == null) {
							local46.anIntArray237[local787] = -1;
						} else {
							local412 = local46.method24601(1688879535) / 2;
							Class143.method11837(local46, local412, false, (byte) -31);
							if (client.aFloatArray95[0] > -1.0F) {
								client.aFloatArray95[0] += Class698.aClass638_1.anIntArray509[local787];
								client.aFloatArray95[1] += Class698.aClass638_1.anIntArray510[local787];
								@Pc(1108) Object local1108 = null;
								@Pc(1110) Class99 local1110 = null;
								@Pc(1112) Class99 local1112 = null;
								@Pc(1114) Class99 local1114 = null;
								local490 = 0;
								@Pc(1118) int local1118 = 0;
								@Pc(1120) int local1120 = 0;
								@Pc(1122) int local1122 = 0;
								@Pc(1124) int local1124 = 0;
								@Pc(1126) int local1126 = 0;
								@Pc(1128) int local1128 = 0;
								@Pc(1130) int local1130 = 0;
								@Pc(1132) Class99 local1132 = null;
								@Pc(1134) Class99 local1134 = null;
								@Pc(1136) Class99 local1136 = null;
								@Pc(1138) Class99 local1138 = null;
								@Pc(1140) int local1140 = 0;
								@Pc(1142) int local1142 = 0;
								@Pc(1144) int local1144 = 0;
								@Pc(1146) int local1146 = 0;
								@Pc(1148) int local1148 = 0;
								@Pc(1150) int local1150 = 0;
								@Pc(1152) int local1152 = 0;
								@Pc(1154) int local1154 = 0;
								@Pc(1159) Class99 local1159 = local979.method32238(Class279.aClass102_9, -1337324690);
								if (local1159 != null) {
									local490 = local1159.method18218();
									local1159.method18217(client.anIntArray335);
									local1124 = client.anIntArray335[0];
								}
								local1110 = local979.method32245(Class279.aClass102_9, (short) 256);
								if (local1110 != null) {
									local1118 = local1110.method18218();
									local1110.method18217(client.anIntArray335);
									local1126 = client.anIntArray335[0];
								}
								local1112 = local979.method32248(Class279.aClass102_9, -1938946646);
								if (local1112 != null) {
									local1120 = local1112.method18218();
									local1112.method18217(client.anIntArray335);
									local1128 = client.anIntArray335[0];
								}
								local1114 = local979.method32240(Class279.aClass102_9, -2008289463);
								if (local1114 != null) {
									local1122 = local1114.method18218();
									local1114.method18217(client.anIntArray335);
									local1130 = client.anIntArray335[0];
								}
								if (local1032 != null) {
									local1132 = local1032.method32238(Class279.aClass102_9, -2063603646);
									if (local1132 != null) {
										local1140 = local1132.method18218();
										local1132.method18217(client.anIntArray335);
										local1148 = client.anIntArray335[0];
									}
									local1134 = local1032.method32245(Class279.aClass102_9, (short) 256);
									if (local1134 != null) {
										local1142 = local1134.method18218();
										local1134.method18217(client.anIntArray335);
										local1150 = client.anIntArray335[0];
									}
									local1136 = local1032.method32248(Class279.aClass102_9, -1938946646);
									if (local1136 != null) {
										local1144 = local1136.method18218();
										local1136.method18217(client.anIntArray335);
										local1152 = client.anIntArray335[0];
									}
									local1138 = local1032.method32240(Class279.aClass102_9, 1905221335);
									if (local1138 != null) {
										local1146 = local1138.method18218();
										local1138.method18217(client.anIntArray335);
										local1154 = client.anIntArray335[0];
									}
								}
								@Pc(1300) Class104 local1300 = Class108.aClass104_22;
								@Pc(1302) Class104 local1302 = Class108.aClass104_22;
								@Pc(1304) Class15 local1304 = Class619.aClass15_12;
								@Pc(1306) Class15 local1306 = Class619.aClass15_12;
								@Pc(1311) int local1311 = local979.anInt5410 * -997195197;
								@Pc(1323) Class104 local1323;
								@Pc(1329) Class15 local1329;
								if (local1311 >= 0) {
									local1323 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, local1311, true, local979.aBoolean932, -356816780);
									local1329 = Class317.aClass464_1.method29594(client.anInterface49_1, local1311, (byte) 1);
									if (local1323 != null && local1329 != null) {
										local1300 = local1323;
										local1304 = local1329;
									}
								}
								if (local1032 != null) {
									local1311 = local1032.anInt5410 * -997195197;
									if (local1311 >= 0) {
										local1323 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, local1311, true, local1032.aBoolean932, -31840617);
										local1329 = Class317.aClass464_1.method29594(client.anInterface49_1, local1311, (byte) 1);
										if (local1323 != null && local1329 != null) {
											local1302 = local1323;
											local1306 = local1329;
										}
									}
								}
								local1323 = null;
								@Pc(1376) String local1376 = null;
								@Pc(1378) boolean local1378 = false;
								@Pc(1380) int local1380 = 0;
								@Pc(1388) String local1388 = local979.method32243(local46.anIntArray241[local787], 1417382308);
								@Pc(1393) int local1393 = local1304.method373(local1388, -679401213);
								if (local1032 != null) {
									local1376 = local1032.method32243(local46.anIntArray243[local787], 1417382308);
									local1380 = local1306.method373(local1376, -156274299);
								}
								@Pc(1410) int local1410 = 0;
								@Pc(1412) int local1412 = 0;
								if (local1118 > 0) {
									local1410 = local1393 / local1118 + 1;
								}
								if (local1032 != null && local1142 > 0) {
									local1412 = local1380 / local1142 + 1;
								}
								@Pc(1432) int local1432 = 0;
								@Pc(1434) int local1434 = local1432;
								if (local490 > 0) {
									local1432 += local490;
								}
								local1432 += 2;
								@Pc(1443) int local1443 = local1432;
								if (local1120 > 0) {
									local1432 += local1120;
								}
								@Pc(1451) int local1451 = local1432;
								@Pc(1453) int local1453 = local1432;
								@Pc(1459) int local1459;
								if (local1118 > 0) {
									local1459 = local1118 * local1410;
									local1432 += local1459;
									local1453 += (local1459 - local1393) / 2;
								} else {
									local1432 += local1393;
								}
								local1459 = local1432;
								if (local1122 > 0) {
									local1432 += local1122;
								}
								@Pc(1486) int local1486 = 0;
								@Pc(1488) int local1488 = 0;
								@Pc(1490) int local1490 = 0;
								@Pc(1492) int local1492 = 0;
								@Pc(1494) int local1494 = 0;
								@Pc(1524) int local1524;
								if (local1032 != null) {
									local1432 += 2;
									local1486 = local1432;
									if (local1140 > 0) {
										local1432 += local1140;
									}
									local1432 += 2;
									local1488 = local1432;
									if (local1144 > 0) {
										local1432 += local1144;
									}
									local1490 = local1432;
									local1494 = local1432;
									if (local1142 > 0) {
										local1524 = local1412 * local1142;
										local1432 += local1524;
										local1494 += (local1524 - local1380) / 2;
									} else {
										local1432 += local1380;
									}
									local1492 = local1432;
									if (local1146 > 0) {
										local1432 += local1146;
									}
								}
								local1524 = local46.anIntArray237[local787] - client.anInt3436;
								@Pc(1573) int local1573 = local979.anInt5418 * -1687037707 - local979.anInt5418 * -1687037707 * local1524 / (local979.anInt5405 * 1965465901);
								@Pc(1591) int local1591 = local979.anInt5411 * 1186942245 * local1524 / (local979.anInt5405 * 1965465901) + -(local979.anInt5411 * 1186942245);
								@Pc(1607) int local1607 = (int) (client.aFloatArray95[0] + (float) arg0 - (float) (local1432 >> 1) + (float) local1573);
								@Pc(1620) int local1620 = (int) ((float) local1591 + ((float) arg1 + client.aFloatArray95[1] - 12.0F));
								@Pc(1629) int local1629 = local979.anInt5422 * -715619377 + 15 + local1620;
								@Pc(1631) int local1631 = 0;
								if (local1032 != null) {
									local1631 = local1032.anInt5422 * -715619377 + local1620 + 15;
								}
								@Pc(1645) int local1645 = 255;
								if (local979.anInt5415 * 1109841267 >= 0) {
									local1645 = (local1524 << 8) / (local979.anInt5405 * 1965465901 - local979.anInt5415 * 1109841267);
								}
								@Pc(1673) int local1673;
								if (local1645 >= 0 && local1645 < 255) {
									local1673 = local1645 << 24;
									@Pc(1677) int local1677 = local1673 | 0xFFFFFF;
									if (local1159 != null) {
										local1159.method18226(local1607 + local1434 - local1124, local1620, 0, local1677, 1);
									}
									if (local1112 != null) {
										local1112.method18226(local1443 + local1607 - local1128 + local979.anInt5423 * -1831133217, local1620 + local979.anInt5424 * 1768143387, 0, local1677, 1);
									}
									@Pc(1717) int local1717;
									if (local1110 != null) {
										for (local1717 = 0; local1717 < local1410; local1717++) {
											local1110.method18226(local1451 + local1607 - local1126 + local1118 * local1717 + local979.anInt5423 * -1831133217, local1620 + local979.anInt5424 * 1768143387, 0, local1677, 1);
										}
									}
									if (local1114 != null) {
										local1114.method18226(local1607 + local1459 - local1130 + local979.anInt5423 * -1831133217, local979.anInt5424 * 1768143387 + local1620, 0, local1677, 1);
									}
									local1300.method7655(local1388, local1453 + local1607, local1629, local979.anInt5412 * 1938750709 | local1673, 0, -1793298396);
									if (local1032 != null) {
										if (local1132 != null) {
											local1132.method18226(local1486 + local1607 - local1148, local1620, 0, local1677, 1);
										}
										if (local1136 != null) {
											local1136.method18226(local1488 + local1607 - local1152 + local1032.anInt5423 * -1831133217, local1032.anInt5424 * 1768143387 + local1620, 0, local1677, 1);
										}
										if (local1134 != null) {
											for (local1717 = 0; local1717 < local1412; local1717++) {
												local1134.method18226(local1490 + local1607 - local1150 + local1142 * local1717 + local1032.anInt5423 * -1831133217, local1620 + local1032.anInt5424 * 1768143387, 0, local1677, 1);
											}
										}
										if (local1138 != null) {
											local1138.method18226(local1032.anInt5423 * -1831133217 + (local1492 + local1607 - local1154), local1620 + local1032.anInt5424 * 1768143387, 0, local1677, 1);
										}
										local1302.method7655(local1376, local1607 + local1494, local1631, local1032.anInt5412 * 1938750709 | local1673, 0, -1636919701);
									}
								} else {
									if (local1159 != null) {
										local1159.method18225(local1434 + local1607 - local1124, local1620);
									}
									if (local1112 != null) {
										local1112.method18225(local1607 + local1443 - local1128 + local979.anInt5423 * -1831133217, local1620 + local979.anInt5424 * 1768143387);
									}
									if (local1110 != null) {
										for (local1673 = 0; local1673 < local1410; local1673++) {
											local1110.method18225(local979.anInt5423 * -1831133217 + local1118 * local1673 + (local1607 + local1451 - local1126), local1620 + local979.anInt5424 * 1768143387);
										}
									}
									if (local1114 != null) {
										local1114.method18225(local979.anInt5423 * -1831133217 + (local1607 + local1459 - local1130), local979.anInt5424 * 1768143387 + local1620);
									}
									local1300.method7655(local1388, local1607 + local1453, local1629, local979.anInt5412 * 1938750709 | 0xFF000000, 0, -2038668449);
									if (local1032 != null) {
										if (local1132 != null) {
											local1132.method18225(local1486 + local1607 - local1148, local1620);
										}
										if (local1136 != null) {
											local1136.method18225(local1488 + local1607 - local1152 + local1032.anInt5423 * -1831133217, local1620 + local1032.anInt5424 * 1768143387);
										}
										if (local1134 != null) {
											for (local1673 = 0; local1673 < local1412; local1673++) {
												local1134.method18225(local1032.anInt5423 * -1831133217 + local1142 * local1673 + (local1490 + local1607 - local1150), local1620 + local1032.anInt5424 * 1768143387);
											}
										}
										if (local1138 != null) {
											local1138.method18225(local1032.anInt5423 * -1831133217 + (local1607 + local1492 - local1154), local1620 + local1032.anInt5424 * 1768143387);
										}
										local1302.method7655(local1376, local1607 + local1494, local1631, local1032.anInt5412 * 1938750709 | 0xFF000000, 0, -1532422345);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(2111) int local2111;
		for (local24 = 0; local24 < client.anInt3497 * -780497429; local24++) {
			local2111 = client.anIntArray312[local24];
			@Pc(2118) Class120_Sub1_Sub1_Sub1 local2118;
			if (local2111 < 2048) {
				local2118 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local2111];
			} else {
				local2118 = (Class120_Sub1_Sub1_Sub1) ((Class80_Sub19) client.aClass24_18.method560((long) (local2111 - 2048))).anObject5;
			}
			local229 = client.anIntArray313[local24];
			@Pc(2140) Class120_Sub1_Sub1_Sub1 local2140;
			if (local229 < 2048) {
				local2140 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local229];
			} else {
				local2140 = (Class120_Sub1_Sub1_Sub1) ((Class80_Sub19) client.aClass24_18.method560((long) (local229 - 2048))).anObject5;
			}
			Class125_Sub2.method20592(local2118, local2140, (local2118.anInt2695 -= -332130869) * -1985714205, arg0, arg1, arg2, arg3, arg4, arg5, -1664243893);
		}
		local24 = Class375.aClass15_9.anInt45 * 1190692343 + Class375.aClass15_9.anInt46 * -191270971 + 2;
		for (local2111 = 0; local2111 < client.anInt3563 * 769489387; local2111++) {
			@Pc(2195) int local2195 = client.anIntArray326[local2111];
			local229 = client.anIntArray334[local2111];
			@Pc(2203) int local2203 = client.anIntArray322[local2111];
			@Pc(2205) boolean local2205 = true;
			while (local2205) {
				local2205 = false;
				for (local582 = 0; local582 < local2111; local582++) {
					if (local229 + 2 > client.anIntArray334[local582] - local24 && local229 - local24 < client.anIntArray334[local582] + 2 && local2195 - local2203 < client.anIntArray326[local582] + client.anIntArray322[local582] && local2195 + local2203 > client.anIntArray326[local582] - client.anIntArray322[local582] && client.anIntArray334[local582] - local24 < local229) {
						local229 = client.anIntArray334[local582] - local24;
						local2205 = true;
					}
				}
			}
			client.anIntArray334[local2111] = local229;
			@Pc(2282) String local2282 = client.aClass558Array1[local2111].method31388(-2061500291);
			if (Class448.aClass341_1.method27910((byte) -90)) {
				local2282 = Class448.aClass341_1.method27917(local2282, -1347850928);
			}
			if (client.anInt3529 * 2049323373 == 0) {
				local791 = 16776960;
				local600 = client.aClass558Array1[local2111].method31384((byte) 61);
				if (local600 < 6) {
					local791 = client.anIntArray327[local600];
				}
				if (local600 == 6) {
					local791 = client.anInt3496 * 939223631 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local600 == 7) {
					local791 = client.anInt3496 * 939223631 % 20 < 10 ? 255 : 65535;
				}
				if (local600 == 8) {
					local791 = client.anInt3496 * 939223631 % 20 < 10 ? 45056 : 8454016;
				}
				if (local600 == 9) {
					local605 = 150 - client.aClass558Array1[local2111].method31386(-949860155) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					if (local605 < 50) {
						local791 = local605 * 1280 + 16711680;
					} else if (local605 < 100) {
						local791 = 16776960 - (local605 - 50) * 327680;
					} else if (local605 < 150) {
						local791 = (local605 - 100) * 5 + 65280;
					}
				}
				if (local600 == 10) {
					local605 = 150 - client.aClass558Array1[local2111].method31386(148445574) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					if (local605 < 50) {
						local791 = local605 * 5 + 16711680;
					} else if (local605 < 100) {
						local791 = 16711935 - (local605 - 50) * 327680;
					} else if (local605 < 150) {
						local791 = (local605 - 100) * 327680 + 255 - (local605 - 100) * 5;
					}
				}
				if (local600 == 11) {
					local605 = 150 - client.aClass558Array1[local2111].method31386(-1845796406) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					if (local605 < 50) {
						local791 = 16777215 - local605 * 327685;
					} else if (local605 < 100) {
						local791 = (local605 - 50) * 327685 + 65280;
					} else if (local605 < 150) {
						local791 = 16777215 - (local605 - 100) * 327680;
					}
				}
				local605 = local791 | 0xFF000000;
				local1030 = client.aClass558Array1[local2111].method31397(1961520359);
				if (local1030 == 0) {
					Class8.aClass104_1.method7642(local2282, local2195 + arg0, local229 + arg1, local605, -16777216, 1845961238);
				}
				if (local1030 == 1) {
					Class8.aClass104_1.method7633(local2282, local2195 + arg0, local229 + arg1, local605, -16777216, client.anInt3496 * 939223631, 1657599443);
				}
				if (local1030 == 2) {
					Class8.aClass104_1.method7662(local2282, arg0 + local2195, local229 + arg1, local605, -16777216, client.anInt3496 * 939223631, 2130203665);
				}
				if (local1030 == 3) {
					local345 = 150 - client.aClass558Array1[local2111].method31386(-604542088) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					Class8.aClass104_1.method7635(local2282, local2195 + arg0, arg1 + local229, local605, -16777216, client.anInt3496 * 939223631, local345, (short) 31033);
				}
				if (local1030 == 4) {
					local345 = 150 - client.aClass558Array1[local2111].method31386(-1939195433) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					local412 = local345 * (Class375.aClass15_9.method373(local2282, -676052128) + 100) / 150;
					Class279.aClass102_9.method20972(arg0 + local2195 - 50, arg1, local2195 + arg0 + 50, arg1 + arg3);
					Class8.aClass104_1.method7655(local2282, arg0 + 50 + local2195 - local412, local229 + arg1, local605, -16777216, -1990114221);
					Class279.aClass102_9.method20986(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (local1030 == 5) {
					local345 = 150 - client.aClass558Array1[local2111].method31386(1546567079) * 150 / client.aClass558Array1[local2111].method31385(-1297845700);
					local412 = 0;
					if (local345 < 25) {
						local412 = local345 - 25;
					} else if (local345 > 125) {
						local412 = local345 - 125;
					}
					local354 = Class375.aClass15_9.anInt45 * 1190692343 + Class375.aClass15_9.anInt46 * -191270971;
					Class279.aClass102_9.method20972(arg0, arg1 + local229 - local354 - 1, arg0 + arg2, arg1 + 5 + local229);
					Class8.aClass104_1.method7642(local2282, local2195 + arg0, arg1 + local229 + local412, local605, -16777216, 914908394);
					Class279.aClass102_9.method20986(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Class8.aClass104_1.method7642(local2282, local2195 + arg0, local229 + arg1, -256, -16777216, 960236677);
			}
		}
	}

	@OriginalMember(owner = "client!acf", name = "apa", descriptor = "(Lclient!yp;I)V")
	static void method1141(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		Class160.aClass121_Sub1_2.method9586(-854037568);
	}

	@OriginalMember(owner = "client!acf", name = "<init>", descriptor = "()V")
	Class56() throws Throwable {
		throw new Error();
	}
}
