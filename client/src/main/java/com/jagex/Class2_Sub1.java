package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!add")
public abstract class Class2_Sub1 extends Class2 implements Interface53 {

	@OriginalMember(owner = "client!add", name = "a", descriptor = "Ljava/lang/String;")
	static String aString13;

	@OriginalMember(owner = "client!add", name = "f", descriptor = "Lclient!qt;")
	protected final Class143 aClass143_3;

	@OriginalMember(owner = "client!add", name = "ax", descriptor = "([Lclient!add;)Ljava/util/Map;")
	public static Map method1825(@OriginalArg(0) Class2_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class2_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class2_Sub1 local23 = local13[local15];
			local11.put(local23.aClass143_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "ay", descriptor = "([Lclient!add;)Ljava/util/Map;")
	public static Map method1826(@OriginalArg(0) Class2_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class2_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class2_Sub1 local23 = local13[local15];
			local11.put(local23.aClass143_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "ai", descriptor = "([Lclient!add;)Ljava/util/Map;")
	public static Map method1827(@OriginalArg(0) Class2_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class2_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class2_Sub1 local23 = local13[local15];
			local11.put(local23.aClass143_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "b", descriptor = "([Lclient!add;)Ljava/util/Map;")
	public static Map method1833(@OriginalArg(0) Class2_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class2_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class2_Sub1 local23 = local13[local15];
			local11.put(local23.aClass143_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!add", name = "g", descriptor = "(I)V")
	public static void method1836(@OriginalArg(0) int arg0) {
		if (client.anInt3433 * 1994758437 == 0) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_9, client.aClass75_2.aClass22_1, -191270971);
			client.aClass75_2.method1325(local11, (byte) -17);
			Class138.aClass710_3 = Class710.aClass710_4;
			aString13 = null;
		}
	}

	@OriginalMember(owner = "client!add", name = "dk", descriptor = "(Lclient!yp;I)V")
	static void method1837(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2122649795);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class579.method31812(local16, local22, arg0, -884256657);
	}

	@OriginalMember(owner = "client!add", name = "gz", descriptor = "(Lclient!yp;I)V")
	static void method1838(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2145313208);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class698.method37063(local16, local22, arg0, (short) 18267);
	}

	@OriginalMember(owner = "client!add", name = "ze", descriptor = "(Lclient!yp;B)V")
	static void method1839(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean728 ? 1 : 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aString146 == null ? "" : client.aString146;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aString149 == null ? "" : client.aString149;
	}

	@OriginalMember(owner = "client!add", name = "<init>", descriptor = "(Lclient!zy;Lclient!qt;Lclient!zv;I)V")
	Class2_Sub1(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass143_3 = arg1;
	}

	@OriginalMember(owner = "client!add", name = "af", descriptor = "(Lclient!ald;Lclient!qv;)Lclient!og;")
	public final Class460 method1819(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -88);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(1250616231);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) 5);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -5);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, 1317134980);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "n", descriptor = "(Lclient!ald;I)Lclient!og;")
	public final Class460 method1820(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -9);
		@Pc(9) Class107 local9 = (Class107) this.method18054(local3, -309234792);
		if (!local9.method7185(-64307015)) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class460 local23 = new Class460(local3);
		@Pc(29) Class local29 = local9.aClass521_6.method30623(-666678663).aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method23182(137788236);
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method23273((byte) 75);
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14462(arg0, (byte) -60);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return this.anInt320 * -443108375;
	}

	@OriginalMember(owner = "client!add", name = "g", descriptor = "(II)Ljava/lang/Object;")
	@Override
	public final Object method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class107 local5 = (Class107) this.method18054(arg0, 1773028773);
		return local5 != null && local5.method7185(-64307015) ? local5.method7184((byte) 14) : null;
	}

	@OriginalMember(owner = "client!add", name = "v", descriptor = "(Lclient!og;B)I")
	public final int method1821(@OriginalArg(0) Class460 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject19 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject19 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject19 instanceof String) {
			local6 = local1 + Class55.method1114((String) arg0.anObject19, (byte) 16);
		} else if (arg0.anObject19 instanceof Interface7) {
			local6 = local1 + ((Interface7) arg0.anObject19).method14463(-608646231);
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!add", name = "y", descriptor = "(Lclient!ald;Lclient!og;I)V")
	public final void method1822(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class460 arg1, @OriginalArg(2) int arg2) {
		arg0.method23155(arg1.anInt4907 * -38979583, (byte) -26);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method23345((Integer) arg1.anObject19, (byte) 74);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method23162((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method23166((String) arg1.anObject19, 1283974551);
		} else if (arg1.anObject19 instanceof Interface7) {
			((Interface7) arg1.anObject19).method14459(arg0, (byte) -57);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "ah", descriptor = "(Lclient!ald;Lclient!qv;)Lclient!og;")
	public final Class460 method1823(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -123);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(-1234814216);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) 13);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -33);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, 1573730163);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "m", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public final Object method1816(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = (Class107) this.method18054(arg0, -509416787);
		return local5 != null && local5.method7185(-64307015) ? local5.method7184((byte) 14) : null;
	}

	@OriginalMember(owner = "client!add", name = "e", descriptor = "(I)Lclient!ae;")
	public abstract Interface11 method18053(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "u", descriptor = "(I)Lclient!ae;")
	public abstract Interface11 method18055(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!add", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return this.anInt320 * -443108375;
	}

	@OriginalMember(owner = "client!add", name = "aj", descriptor = "(Lclient!ald;)Lclient!og;")
	public final Class460 method1824(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23178((byte) -32);
		@Pc(9) Class107 local9 = (Class107) this.method18054(local3, 1029676181);
		if (!local9.method7185(-64307015)) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class460 local23 = new Class460(local3);
		@Pc(29) Class local29 = local9.aClass521_6.method30623(-666678663).aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method23182(-567467765);
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method23273((byte) 26);
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14462(arg0, (byte) -35);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public final Object method1818(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = (Class107) this.method18054(arg0, -386606415);
		return local5 != null && local5.method7185(-64307015) ? local5.method7184((byte) 14) : null;
	}

	@OriginalMember(owner = "client!add", name = "c", descriptor = "(Lclient!ald;Lclient!qv;I)Lclient!og;")
	public final Class460 method1828(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method23178((byte) -58);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(1437018460);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) -23);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -50);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, 1338985136);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "aq", descriptor = "(Lclient!ald;Lclient!og;)V")
	public final void method1829(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class460 arg1) {
		arg0.method23155(arg1.anInt4907 * -38979583, (byte) -32);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method23345((Integer) arg1.anObject19, (byte) 122);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method23162((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method23166((String) arg1.anObject19, -844322405);
		} else if (arg1.anObject19 instanceof Interface7) {
			((Interface7) arg1.anObject19).method14459(arg0, (byte) -115);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "t", descriptor = "(II)Lclient!ae;")
	public abstract Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!add", name = "ao", descriptor = "(Lclient!ald;Lclient!og;)V")
	public final void method1830(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class460 arg1) {
		arg0.method23155(arg1.anInt4907 * -38979583, (byte) -87);
		if (arg1.anObject19 instanceof Integer) {
			arg0.method23345((Integer) arg1.anObject19, (byte) 39);
		} else if (arg1.anObject19 instanceof Long) {
			arg0.method23162((Long) arg1.anObject19);
		} else if (arg1.anObject19 instanceof String) {
			arg0.method23166((String) arg1.anObject19, -1734232239);
		} else if (arg1.anObject19 instanceof Interface7) {
			((Interface7) arg1.anObject19).method14459(arg0, (byte) -23);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!add", name = "ac", descriptor = "(Lclient!ald;)Lclient!og;")
	public final Class460 method1831(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23178((byte) -12);
		@Pc(9) Class107 local9 = (Class107) this.method18054(local3, 40244144);
		if (!local9.method7185(-64307015)) {
			throw new IllegalStateException("");
		}
		@Pc(23) Class460 local23 = new Class460(local3);
		@Pc(29) Class local29 = local9.aClass521_6.method30623(-666678663).aClass2;
		if (Integer.class == local29) {
			local23.anObject19 = arg0.method23182(267027596);
		} else if (local29 == Long.class) {
			local23.anObject19 = arg0.method23273((byte) -7);
		} else if (String.class == local29) {
			local23.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local29)) {
			try {
				@Pc(66) Interface7 local66 = (Interface7) local29.getDeclaredConstructor().newInstance();
				local66.method14462(arg0, (byte) -85);
				local23.anObject19 = local66;
			} catch (@Pc(75) InstantiationException local75) {
			} catch (@Pc(77) IllegalAccessException local77) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!add", name = "ag", descriptor = "(Lclient!ald;Lclient!qv;)Lclient!og;")
	public final Class460 method1832(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -14);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(-2092827257);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) 8);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -105);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, -1757269367);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "al", descriptor = "(Lclient!ald;Lclient!qv;)Lclient!og;")
	public final Class460 method1834(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -64);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(-242014286);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) -9);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -79);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, -1767801738);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!add", name = "ab", descriptor = "(Lclient!ald;Lclient!qv;)Lclient!og;")
	public final Class460 method1835(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class519 arg1) {
		@Pc(3) int local3 = arg0.method23178((byte) -83);
		@Pc(8) Class460 local8 = new Class460(local3);
		@Pc(11) Class local11 = arg1.aClass2;
		if (Integer.class == local11) {
			local8.anObject19 = arg0.method23182(-2029609578);
		} else if (local11 == Long.class) {
			local8.anObject19 = arg0.method23273((byte) -64);
		} else if (local11 == String.class) {
			local8.anObject19 = arg0.method23186((byte) 12);
		} else if (Interface7.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface7 local48 = (Interface7) local11.getDeclaredConstructor().newInstance();
				local48.method14462(arg0, (byte) -89);
				local8.anObject19 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			} catch (java.lang.NoSuchMethodException ignored) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(70) Class107 local70 = (Class107) this.method18054(local3, -879942128);
		return local70.method7185(-64307015) && local70.aClass521_6.method30623(-666678663) == arg1 ? local8 : null;
	}
}
