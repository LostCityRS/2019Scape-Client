package jagex3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yl")
public final class Class686 implements Interface20 {

	@OriginalMember(owner = "client!yl", name = "e", descriptor = "Lclient!kr;")
	Class386 aClass386_4;

	@OriginalMember(owner = "client!yl", name = "ds", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method33665(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091];
		if (arg0.anInt4064 * -1088634495 != local12) {
			if (local12 == -1) {
				arg0.aClass19_6 = null;
			} else {
				if (arg0.aClass19_6 == null) {
					arg0.aClass19_6 = new Class19_Sub2();
				}
				arg0.aClass19_6.method23580(local12, 1626977132);
			}
			arg0.anInt4064 = local12 * 600145537;
			Class354.method27789(arg0, -1174743804);
		}
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class682.method33459(arg0.anInt3994 * -1549590237, (byte) 119);
		}
	}

	@OriginalMember(owner = "client!yl", name = "ath", descriptor = "(Lclient!yf;I)V")
	static void method33666(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!yl", name = "k", descriptor = "(Lclient!alw;IB)V")
	public static void method33667(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class93_Sub37 local3 = new Class93_Sub37();
		local3.anInt1959 = arg0.method22425((short) 16384) * 1817313377;
		local3.anInt1958 = arg0.method22431(-118643075) * -1260131623;
		local3.anIntArray194 = new int[local3.anInt1959 * -1741642847];
		local3.anIntArray195 = new int[local3.anInt1959 * -1741642847];
		local3.aFieldArray1 = new Field[local3.anInt1959 * -1741642847];
		local3.anIntArray196 = new int[local3.anInt1959 * -1741642847];
		local3.aMethodArray1 = new Method[local3.anInt1959 * -1741642847];
		local3.aByteArrayArrayArray11 = new byte[local3.anInt1959 * -1741642847][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1959 * -1741642847; local61++) {
			try {
				@Pc(71) int local71 = arg0.method22425((short) 16384);
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local84 = arg0.method22439(-95152599);
					local88 = arg0.method22439(151347099);
					local90 = 0;
					if (local71 == 1) {
						local90 = arg0.method22431(-118643075);
					}
					local3.anIntArray194[local61] = local71;
					local3.anIntArray196[local61] = local90;
					if (Class39.method769(local84, -1263088362).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class39.method769(local84, -622366893).getDeclaredField(local88);
				} else if (local71 == 3 || local71 == 4) {
					local84 = arg0.method22439(1923778267);
					local88 = arg0.method22439(1959147366);
					local90 = arg0.method22425((short) 16384);
					@Pc(147) String[] local147 = new String[local90];
					for (@Pc(149) int local149 = 0; local149 < local90; local149++) {
						local147[local149] = arg0.method22439(1304990363);
					}
					@Pc(164) String local164 = arg0.method22439(-79688576);
					@Pc(167) byte[][] local167 = new byte[local90][];
					@Pc(179) int local179;
					if (local71 == 3) {
						for (@Pc(172) int local172 = 0; local172 < local90; local172++) {
							local179 = arg0.method22431(-118643075);
							local167[local172] = new byte[local179];
							arg0.method22442(local167[local172], 0, local179, (short) 27757);
						}
					}
					local3.anIntArray194[local61] = local71;
					@Pc(202) Class[] local202 = new Class[local90];
					for (local179 = 0; local179 < local90; local179++) {
						local202[local179] = Class39.method769(local147[local179], -715254699);
					}
					@Pc(221) Class local221 = Class39.method769(local164, -2054792383);
					if (Class39.method769(local84, -208682963).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(235) Method[] local235 = Class39.method769(local84, -1937460771).getDeclaredMethods();
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
		Class60.aClass22_2.method407(local3, -396270543);
	}

	@OriginalMember(owner = "client!yl", name = "hm", descriptor = "(Lclient!yf;B)V")
	static void method33668(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1296865465);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method188(local16, local22, false, 2, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!yl", name = "<init>", descriptor = "(Lclient!kr;)V")
	Class686(@OriginalArg(0) Class386 arg0) {
		this.aClass386_4 = arg0;
	}

	@OriginalMember(owner = "client!yl", name = "ai", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33640(@OriginalArg(0) Class108 arg0) {
		@Pc(15) Integer local15 = this.aClass386_4.method28408(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, 1899238502);
		return local15 == null ? (Integer) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "at", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33643(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -1488307348), 2063640239);
	}

	@OriginalMember(owner = "client!yl", name = "n", descriptor = "(Lclient!ec;I)J")
	@Override
	public long method33646(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Long local15 = this.aClass386_4.method28349(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -771674756);
		return local15 == null ? (Long) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "k", descriptor = "(Lclient!ec;B)Ljava/lang/Object;")
	@Override
	public Object method33648(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		if (ScriptVarType.STRING != arg0.aScriptVarType_6) {
			throw new IllegalArgumentException("");
		}
		return this.aClass386_4.method28350(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -1270432674);
	}

	@OriginalMember(owner = "client!yl", name = "u", descriptor = "(Lclient!ec;I)I")
	@Override
	public int method33636(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Integer local15 = this.aClass386_4.method28408(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, 1899238502);
		return local15 == null ? (Integer) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "e", descriptor = "(Lclient!ec;II)V")
	@Override
	public void method33645(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "b", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33662(@OriginalArg(0) Class108 arg0) {
		if (ScriptVarType.STRING != arg0.aScriptVarType_6) {
			throw new IllegalArgumentException("");
		}
		return this.aClass386_4.method28350(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -1019955817);
	}

	@OriginalMember(owner = "client!yl", name = "z", descriptor = "(Lclient!kh;I)I")
	@Override
	public int method33635(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 65798137), 1112565512);
	}

	@OriginalMember(owner = "client!yl", name = "w", descriptor = "(Lclient!kh;II)V")
	@Override
	public void method33650(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "ah", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33637(@OriginalArg(0) Class108 arg0) {
		@Pc(15) Integer local15 = this.aClass386_4.method28408(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, 1899238502);
		return local15 == null ? (Integer) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V")
	@Override
	public void method33649(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "ac", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33639(@OriginalArg(0) Class108 arg0) {
		@Pc(15) Integer local15 = this.aClass386_4.method28408(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, 1899238502);
		return local15 == null ? (Integer) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33659(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "aw", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33642(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 117559001), 436890401);
	}

	@OriginalMember(owner = "client!yl", name = "as", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33641(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -480987308), 641150009);
	}

	@OriginalMember(owner = "client!yl", name = "al", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33638(@OriginalArg(0) Class108 arg0) {
		@Pc(15) Integer local15 = this.aClass386_4.method28408(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, 1899238502);
		return local15 == null ? (Integer) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "l", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method33651(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "p", descriptor = "(Lclient!ec;)J")
	@Override
	public long method33654(@OriginalArg(0) Class108 arg0) {
		@Pc(15) Long local15 = this.aClass386_4.method28349(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -771674756);
		return local15 == null ? (Long) arg0.method7438((byte) 2) : local15;
	}

	@OriginalMember(owner = "client!yl", name = "d", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33655(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "c", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33656(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33657(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33658(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33664(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "m", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33647(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "y", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33660(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "g", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33652(@OriginalArg(0) Class108 arg0) {
		if (ScriptVarType.STRING != arg0.aScriptVarType_6) {
			throw new IllegalArgumentException("");
		}
		return this.aClass386_4.method28350(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -570202534);
	}

	@OriginalMember(owner = "client!yl", name = "x", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33653(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "q", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33644(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!yl", name = "h", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33663(@OriginalArg(0) Class108 arg0) {
		if (ScriptVarType.STRING != arg0.aScriptVarType_6) {
			throw new IllegalArgumentException("");
		}
		return this.aClass386_4.method28350(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -668984648);
	}

	@OriginalMember(owner = "client!yl", name = "a", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33661(@OriginalArg(0) Class108 arg0) {
		if (ScriptVarType.STRING != arg0.aScriptVarType_6) {
			throw new IllegalArgumentException("");
		}
		return this.aClass386_4.method28350(client.aClass702_4.anInt6114 * -1111983921 << 16 | arg0.anInt867 * -1284841473, -866978723);
	}
}
