package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public abstract class Class108 implements Interface12 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!py;")
	static Class497 aClass497_21;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!qw;")
	public Class519 aClass519_6;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!qj;")
	public Class507 aClass507_3 = Class507.aClass507_5;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!qe;")
	public final Class138 aClass138_6;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qe;I)V", line = 16)
	Class108(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		this.aClass138_6 = arg0;
		this.anInt867 = arg1 * 143990783;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(Lclient!alw;B)V", line = 23)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18116(Class112_Sub2.method23754(-1497248091), local3, -1915563430);
			if (local14 == null) {
				this.method7448(arg0, local3, (short) 12101);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.g1((short) 16384);
						this.aClass519_6 = (Class519) Class107.method18116(Class519.method30309(2041400837), local50, -1915563430);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2(67383654);
						break;
					case 3:
						Class107.method18116(Class420.method28716(804770315), arg0.g1((short) 16384), -1915563430);
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18116(Class174.method24325((byte) 84), arg0.g1((short) 16384), -1915563430);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18116(Class112_Sub2.method23754(-1497248091), local3, -1915563430);
			if (local14 == null) {
				this.method7448(arg0, local3, (short) 5814);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.g1((short) 16384);
						this.aClass519_6 = (Class519) Class107.method18116(Class519.method30309(1623296093), local50, -1915563430);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2(1136815077);
						break;
					case 3:
						Class107.method18116(Class420.method28716(2022493064), arg0.g1((short) 16384), -1915563430);
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18116(Class174.method24325((byte) 49), arg0.g1((short) 16384), -1915563430);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18116(Class112_Sub2.method23754(-1497248091), local3, -1915563430);
			if (local14 == null) {
				this.method7448(arg0, local3, (short) -15764);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.g1((short) 16384);
						this.aClass519_6 = (Class519) Class107.method18116(Class519.method30309(1533022602), local50, -1915563430);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2(887597660);
						break;
					case 3:
						Class107.method18116(Class420.method28716(241420107), arg0.g1((short) 16384), -1915563430);
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18116(Class174.method24325((byte) 66), arg0.g1((short) 16384), -1915563430);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18116(Class112_Sub2.method23754(-1497248091), local3, -1915563430);
			if (local14 == null) {
				this.method7448(arg0, local3, (short) 20818);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.g1((short) 16384);
						this.aClass519_6 = (Class519) Class107.method18116(Class519.method30309(1403388839), local50, -1915563430);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2(-1074649851);
						break;
					case 3:
						Class107.method18116(Class420.method28716(1244045918), arg0.g1((short) 16384), -1915563430);
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18116(Class174.method24325((byte) 10), arg0.g1((short) 16384), -1915563430);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18116(Class112_Sub2.method23754(-1497248091), local3, -1915563430);
			if (local14 == null) {
				this.method7448(arg0, local3, (short) 14486);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.g1((short) 16384);
						this.aClass519_6 = (Class519) Class107.method18116(Class519.method30309(1223585481), local50, -1915563430);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.gjstr2(-771464017);
						break;
					case 3:
						Class107.method18116(Class420.method28716(1624563297), arg0.g1((short) 16384), -1915563430);
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18116(Class174.method24325((byte) 79), arg0.g1((short) 16384), -1915563430);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "(B)Z", line = 58)
	boolean method7435(@OriginalArg(0) byte arg0) {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "()Z", line = 58)
	boolean method7436() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "()Z", line = 58)
	boolean method7437() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "()Z", line = 58)
	boolean method7438() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7439() {
		return this.aClass138_6.method11528(this, (byte) 94);
	}

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "(B)Ljava/lang/Object;", line = 63)
	public Object method7440(@OriginalArg(0) byte arg0) {
		return this.aClass138_6.method11528(this, (byte) 73);
	}

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7441() {
		return this.aClass138_6.method11528(this, (byte) 17);
	}

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7442() {
		return this.aClass138_6.method11528(this, (byte) 44);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7443() {
		return this.aClass138_6.method11528(this, (byte) 59);
	}

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "(Lclient!yf;I)V", line = 65)
	static void method7444(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2], -405999438)).anIntArrayArray57[arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1]][0];
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!ec", name = "ark", descriptor = "(Lclient!yf;B)V", line = 13018)
	static final void method7445(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.options.method14363(Class51.options.aClass166_Sub36_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 69);
		Class106_Sub1.method5135(-2005793118);
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!ec", name = "auy", descriptor = "(Lclient!yf;I)V", line = 13429)
	static final void method7446(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class125_Sub3.platformStats.anInt2055 * 714183489 < 512 || client.aBoolean595 || client.aBoolean600 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ec", name = "avw", descriptor = "(Lclient!yf;I)V", line = 13505)
	static final void method7447(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "(Lclient!alw;IS)V")
	abstract void method7448(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(Lclient!alw;I)V")
	abstract void method7449(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "(Lclient!alw;I)V")
	abstract void method7450(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lclient!alw;I)V")
	abstract void method7451(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);
}
