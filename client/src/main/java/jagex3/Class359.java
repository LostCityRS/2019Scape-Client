package jagex3;

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

@OriginalClass("client!jf")
public final class Class359 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!jf;")
	static final Class359 aClass359_3 = new Class359(0);

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!jf;")
	static final Class359 aClass359_5 = new Class359(1);

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!jf;")
	static final Class359 aClass359_4 = new Class359(2);

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	int anInt4729;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "(I)Lclient!jf;")
	static Class359 method27964(@OriginalArg(0) int arg0) {
		if (arg0 == aClass359_3.anInt4729 * 106242889) {
			return aClass359_3;
		} else if (arg0 == aClass359_5.anInt4729 * 106242889) {
			return aClass359_5;
		} else if (arg0 == aClass359_4.anInt4729 * 106242889) {
			return aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "(I)Lclient!jf;")
	static Class359 method27965(@OriginalArg(0) int arg0) {
		if (arg0 == aClass359_3.anInt4729 * 106242889) {
			return aClass359_3;
		} else if (arg0 == aClass359_5.anInt4729 * 106242889) {
			return aClass359_5;
		} else if (arg0 == aClass359_4.anInt4729 * 106242889) {
			return aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "(I)Lclient!jf;")
	static Class359 method27966(@OriginalArg(0) int arg0) {
		if (arg0 == aClass359_3.anInt4729 * 106242889) {
			return aClass359_3;
		} else if (arg0 == aClass359_5.anInt4729 * 106242889) {
			return aClass359_5;
		} else if (arg0 == aClass359_4.anInt4729 * 106242889) {
			return aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)Lclient!jf;")
	static Class359 method27967(@OriginalArg(0) int arg0) {
		if (arg0 == aClass359_3.anInt4729 * 106242889) {
			return aClass359_3;
		} else if (arg0 == aClass359_5.anInt4729 * 106242889) {
			return aClass359_5;
		} else if (arg0 == aClass359_4.anInt4729 * 106242889) {
			return aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "azj", descriptor = "(Lclient!yf;B)V")
	static void method27968(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15786((byte) -94) ? 1 : 0;
	}

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "(Lclient!ase;I)V")
	public static void method27969(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub37 local4 = (Class93_Sub37) Class60.aClass22_2.method445((byte) 37);
		if (local4 == null) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3070 * 212851357;
		arg0.method22407(local4.anInt1958 * 1291580777, (byte) 15);
		for (@Pc(21) int local21 = 0; local21 < local4.anInt1959 * -1741642847; local21++) {
			if (local4.anIntArray195[local21] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray194[local21];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getInt(null);
						arg0.method22522(0, (byte) -5);
						arg0.method22407(local58, (byte) 53);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local21];
						local54.setInt(null, local4.anIntArray196[local21]);
						arg0.method22522(0, (byte) -86);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local21];
						local58 = local54.getModifiers();
						arg0.method22522(0, (byte) -65);
						arg0.method22407(local58, (byte) 7);
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
							arg0.method22522(0, (byte) -57);
						} else if (local151 instanceof Number) {
							arg0.method22522(1, (byte) -15);
							arg0.method22411(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method22522(2, (byte) -95);
							arg0.method22414((String) local151, 1647525420);
						} else {
							arg0.method22522(4, (byte) -115);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local21];
						local58 = local114.getModifiers();
						arg0.method22522(0, (byte) -7);
						arg0.method22407(local58, (byte) 55);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method22522(-10, (byte) -14);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method22522(-11, (byte) -39);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method22522(-12, (byte) -41);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method22522(-13, (byte) -36);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method22522(-14, (byte) -46);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method22522(-15, (byte) -59);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method22522(-16, (byte) -128);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method22522(-17, (byte) -25);
				} catch (@Pc(258) IOException local258) {
					arg0.method22522(-18, (byte) -68);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method22522(-19, (byte) -53);
				} catch (@Pc(270) Exception local270) {
					arg0.method22522(-20, (byte) -64);
				} catch (@Pc(276) Throwable local276) {
					arg0.method22522(-21, (byte) -57);
				}
			} else {
				arg0.method22522(local4.anIntArray195[local21], (byte) -62);
			}
		}
		arg0.method22518(local12, 1327030711);
		local4.method23981(-1774062480);
	}

	@OriginalMember(owner = "client!jf", name = "vk", descriptor = "(Lclient!yf;I)V")
	static void method27970(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class274.aClass258_11.method26150(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -650860313);
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(IIIIIIILclient!oe;B)V")
	public static void method27971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) byte arg8) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445((byte) 43); local6 != null; local6 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415(846551407)) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && arg2 == local6.anInt1464 * 275343381 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass532_1.method30625(510184718) && arg2 < client.aClass532_1.method30655((short) 128)) {
				Class593.method31901(local1, (byte) 70);
			}
			Class93_Sub8.aClass22_18.method407(local1, -262984256);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.anInt1469 = arg6 * -2025107705;
		if (arg7 != null) {
			local1.aClass458_48 = new Class458(arg7);
		}
		local1.aBoolean309 = true;
		local1.aBoolean310 = false;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(ILjava/lang/String;II)V")
	public static void method27972(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class93_Sub1_Sub13 local5 = Class623.method32331(Class155.aClass155_68, arg0, -1, (short) -23624);
		if (local5 == null) {
			return;
		}
		@Pc(11) Class681 local11 = Class96.method2324(-1210807258);
		local11.anIntArray519 = new int[local5.anInt3065 * 341680345];
		local11.anObjectArray44 = new String[local5.anInt3064 * -1520226159];
		local11.anObjectArray44[0] = arg1;
		local11.anIntArray519[0] = arg2;
		Class91.method1706(local5, 500000, local11, 634588949);
	}

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "(ILclient!zt;Lclient!ws;I)Ljava/lang/String;")
	static String method27973(@OriginalArg(0) int arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class645 arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 100000) {
			return Class389.method28453(arg2.anInt5938 * 1305571991, (byte) 64) + arg0 + Class47.aString8;
		} else if (arg0 < 10000000) {
			return Class389.method28453(arg2.anInt5939 * -1668431833, (byte) 74) + arg0 / 1000 + Class74.aClass74_75.method1259(arg1, (byte) 35) + Class47.aString8;
		} else {
			return Class389.method28453(arg2.anInt5940 * -1266008869, (byte) 12) + arg0 / 1000000 + Class74.aClass74_68.method1259(arg1, (byte) -16) + Class47.aString8;
		}
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	Class359(@OriginalArg(0) int arg0) {
		this.anInt4729 = arg0 * 243089145;
	}
}
