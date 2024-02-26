package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@OriginalClass("client!fm")
public abstract class Class117 implements Interface3 {

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!ej;")
	final Class243 aClass243_19 = new Class243(100);

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_18 = new Class243(100);

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Lclient!an;")
	final Interface12 anInterface12_4;

	@OriginalMember(owner = "client!fm", name = "auj", descriptor = "(Lclient!yp;I)V")
	static void method8815(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub32_1.method16523(1530427545);
	}

	@OriginalMember(owner = "client!fm", name = "bcx", descriptor = "(Lclient!yp;B)V")
	static void method8816(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(Lclient!asa;B)V")
	public static void method8817(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) Class56.aClass8_3.method247(129206984);
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
		local4.method24395((byte) 27);
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(Lclient!ub;IILclient!ahb;II)V")
	public static void method8818(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120_Sub1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class690 local2 = Class677.method33596(-1343208060);
		local2.aClass120_Sub1_Sub1_Sub1_4 = arg3;
		local2.anInt5779 = arg4 * 958255171;
		Class388.method28635(arg0, arg1, arg2, local2, (short) 2903);
		local2.aClass120_Sub1_Sub1_Sub1_4 = null;
		local2.anInt5779 = -958255171;
	}

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "(B)Z")
	public static boolean method8819(@OriginalArg(0) byte arg0) {
		return Class365.aBoolean839;
	}

	@OriginalMember(owner = "client!fm", name = "iu", descriptor = "(S)V")
	static void method8820(@OriginalArg(0) short arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) Class570 local5 = client.aClass539_1.method30932(-1638462787);
		for (@Pc(7) int local7 = 0; local7 < client.aClass539_1.method30921(2027960517); local7++) {
			for (@Pc(14) int local14 = 0; local14 < client.aClass539_1.method31011(690560719); local14++) {
				if (Class49.method1003(local5.aClass568ArrayArrayArray1, local1, local7, local14, true, -637027705)) {
					local1++;
				}
				if (local1 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!an;Lclient!pf;Lclient!pf;Lclient!pf;)V")
	Class117(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class480 arg3) {
		this.anInterface12_4 = arg0;
		Class138_Sub2.method11541(arg1, arg3, 2, (byte) 14);
		Class502.method30446(arg2, arg3, (byte) 51);
	}

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "(IB)V")
	final void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26247(arg0, (byte) 39);
		}
	}

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "(IB)Lclient!arn;")
	final Class80_Sub1_Sub7 method8801(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			@Pc(11) Class80_Sub1_Sub7 local11 = (Class80_Sub1_Sub7) this.aClass243_19.method26282((long) arg0);
			if (local11 == null) {
				local11 = new Class80_Sub1_Sub7(arg0);
				this.aClass243_19.method26253(local11, (long) arg0);
			}
			return local11.method21969((byte) -110) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)Lclient!are;")
	final Class80_Sub1_Sub5 method8802(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_18;
		synchronized (this.aClass243_18) {
			@Pc(11) Class80_Sub1_Sub5 local11 = (Class80_Sub1_Sub5) this.aClass243_18.method26282((long) arg0);
			if (local11 == null) {
				local11 = new Class80_Sub1_Sub5(arg0);
				this.aClass243_18.method26253(local11, (long) arg0);
			}
			return local11.method21782(2078442655) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "()V")
	final void method8803() {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "()V")
	final void method8804() {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "()V")
	final void method8805() {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Lclient!are;")
	final Class80_Sub1_Sub5 method8806(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_18;
		synchronized (this.aClass243_18) {
			@Pc(11) Class80_Sub1_Sub5 local11 = (Class80_Sub1_Sub5) this.aClass243_18.method26282((long) arg0);
			if (local11 == null) {
				local11 = new Class80_Sub1_Sub5(arg0);
				this.aClass243_18.method26253(local11, (long) arg0);
			}
			return local11.method21782(2120174817) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "(II)Lclient!are;")
	final Class80_Sub1_Sub5 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_18;
		synchronized (this.aClass243_18) {
			@Pc(11) Class80_Sub1_Sub5 local11 = (Class80_Sub1_Sub5) this.aClass243_18.method26282((long) arg0);
			if (local11 == null) {
				local11 = new Class80_Sub1_Sub5(arg0);
				this.aClass243_18.method26253(local11, (long) arg0);
			}
			return local11.method21782(2139375679) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
	final void method8808(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "(I)V")
	final void method8809(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26247(arg0, (byte) 117);
		}
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
	final void method8810(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26247(arg0, (byte) 38);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	final void method8811(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26247(arg0, (byte) 7);
		}
	}

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "(B)V")
	final void method8812(@OriginalArg(0) byte arg0) {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "()V")
	final void method8813() {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "()V")
	final void method8814() {
		@Pc(3) Class243 local3 = this.aClass243_19;
		synchronized (this.aClass243_19) {
			this.aClass243_19.method26259((byte) 3);
		}
	}
}
