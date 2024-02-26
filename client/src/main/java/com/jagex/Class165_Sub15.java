package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amo")
public final class Class165_Sub15 extends Class165 {

	@OriginalMember(owner = "client!amo", name = "g", descriptor = "I")
	static final int anInt2186 = 0;

	@OriginalMember(owner = "client!amo", name = "i", descriptor = "I")
	static final int anInt2187 = 1;

	@OriginalMember(owner = "client!amo", name = "m", descriptor = "I")
	static final int anInt2188 = 4;

	@OriginalMember(owner = "client!amo", name = "akm", descriptor = "(Lclient!yp;I)V")
	static void method16123(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class159.method15423(local12);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3094 * -828099429 - local15.anInt3093 * 1171189611;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3096 * 1673061885 - local15.anInt3095 * -893056067;
		}
	}

	@OriginalMember(owner = "client!amo", name = "qr", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method16124(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1925986699) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray25 = Class431.method29089(local13, arg2, 1533044958);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!amo", name = "u", descriptor = "(Lclient!ald;II)V")
	public static void method16125(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub41 local3 = new Class80_Sub41();
		local3.anInt1945 = arg0.method23362(-1564657481) * 1702047251;
		local3.anInt1944 = arg0.method23182(-135172198) * 746511025;
		local3.anIntArray198 = new int[local3.anInt1945 * -743322597];
		local3.anIntArray197 = new int[local3.anInt1945 * -743322597];
		local3.aFieldArray1 = new Field[local3.anInt1945 * -743322597];
		local3.anIntArray199 = new int[local3.anInt1945 * -743322597];
		local3.aMethodArray1 = new Method[local3.anInt1945 * -743322597];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1945 * -743322597][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1945 * -743322597; local61++) {
			try {
				@Pc(71) int local71 = arg0.method23362(-693403562);
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.method23376((short) 10305);
					local87 = arg0.method23376((short) 26427);
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.method23182(-1491520025);
					}
					local3.anIntArray198[local61] = local71;
					local3.anIntArray199[local61] = local89;
					if (Class269.method26686(local83, -1291585275).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class269.method26686(local83, -1291585275).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.method23376((short) 25112);
					local87 = arg0.method23376((short) 12315);
					local89 = arg0.method23362(-1204356993);
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.method23376((short) 23310);
					}
					@Pc(163) String local163 = arg0.method23376((short) 16918);
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.method23182(-1173836103);
							local166[local171] = new byte[local178];
							arg0.method23399(local166[local171], 0, local178, -1660211281);
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
		Class56.aClass8_3.method232(local3, 1105688689);
	}

	@OriginalMember(owner = "client!amo", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub15(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amo", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amo", name = "a", descriptor = "(S)V")
	public void method16119(@OriginalArg(0) short arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) -14) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amo", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "x", descriptor = "()V")
	public void method16120() {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 4) {
			this.anInt2398 = this.method16949((byte) 1) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amo", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amo", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amo", name = "k", descriptor = "(I)I")
	public int method16121(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amo", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amo", name = "s", descriptor = "(B)Z")
	public boolean method16122(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amo", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 1;
	}
}
