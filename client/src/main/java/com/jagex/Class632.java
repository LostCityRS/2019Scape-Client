package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class632 {

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static final int anInt5576 = 1;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static final int anInt5577 = 3;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public static final int anInt5578 = 3;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public static final int anInt5579 = 0;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static final int anInt5580 = 1;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static final int anInt5582 = 2;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static final int anInt5583 = 4;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static final int anInt5584 = 5;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	static final int anInt5585 = 3;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	static final int anInt5586 = 100;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static final int anInt5589 = 2;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public static final int anInt5593 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public int anInt5575;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public int anInt5587;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt5588;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public int anInt5590;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public int anInt5591;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt5592;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray66 = new int[3][5];

	@OriginalMember(owner = "client!wb", name = "ld", descriptor = "(Lclient!yp;B)V")
	static void method32726(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class101.method2981(local11, arg0, 766994176);
	}

	@OriginalMember(owner = "client!wb", name = "aoa", descriptor = "(Lclient!yp;S)V")
	static void method32727(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		if (Class160.aClass121_Sub1_2.method9607(-2104910463) != Class340.aClass340_7) {
			throw new RuntimeException();
		}
		@Pc(13) Class123_Sub3 local13 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-2049889335);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((double) local13.method10007(118811021) * 2607.5945876176133D) & 0x3FFF;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((double) local13.method10008(-2052827079) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!wb", name = "bbk", descriptor = "(Lclient!yp;I)V")
	static void method32728(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class558 local4 = arg0.aClass120_Sub1_Sub1_Sub1_4.method18974(-105223426);
		if (local4 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local4.method31388(-2102147507);
		}
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class632(@OriginalArg(0) Class480 arg0) {
		@Pc(14) byte[] local14 = arg0.method29926(Class639.aClass639_9.anInt5637 * 1101033235, 1472047355);
		if (local14 == null) {
		}
		this.method32723(new Class80_Sub36(local14), (byte) 40);
	}

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "(Lclient!ald;B)V")
	void method32723(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(947287291);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5575 = arg0.method23182(1092701661) * 1475524511;
			} else if (local3 == 2) {
				this.anInt5588 = arg0.method23182(-1709861185) * 691220909;
			} else if (local3 == 3) {
				this.anInt5592 = arg0.method23182(1082583965) * 1956709739;
			} else if (local3 == 4) {
				this.anInt5590 = arg0.method23362(610160309) * 549144547;
			} else if (local3 == 5) {
				this.anInt5591 = arg0.method23362(822283694) * 185933211;
			} else if (local3 == 6) {
				this.anInt5587 = arg0.method23182(1976187806) * 510820589;
			} else if (local3 == 7) {
				this.anInt5581 = arg0.method23182(-1613500030) * -2071941203;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method23178((byte) -115);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(Lclient!ald;)V")
	void method32724(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1191490516);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5575 = arg0.method23182(-1189872285) * 1475524511;
			} else if (local3 == 2) {
				this.anInt5588 = arg0.method23182(1866968312) * 691220909;
			} else if (local3 == 3) {
				this.anInt5592 = arg0.method23182(-1699890848) * 1956709739;
			} else if (local3 == 4) {
				this.anInt5590 = arg0.method23362(850791976) * 549144547;
			} else if (local3 == 5) {
				this.anInt5591 = arg0.method23362(-532429009) * 185933211;
			} else if (local3 == 6) {
				this.anInt5587 = arg0.method23182(-216394068) * 510820589;
			} else if (local3 == 7) {
				this.anInt5581 = arg0.method23182(383860276) * -2071941203;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method23178((byte) -40);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(Lclient!ald;)V")
	void method32725(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(206782503);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5575 = arg0.method23182(-1385094686) * 1475524511;
			} else if (local3 == 2) {
				this.anInt5588 = arg0.method23182(-1740770407) * 691220909;
			} else if (local3 == 3) {
				this.anInt5592 = arg0.method23182(-505827133) * 1956709739;
			} else if (local3 == 4) {
				this.anInt5590 = arg0.method23362(-208735560) * 549144547;
			} else if (local3 == 5) {
				this.anInt5591 = arg0.method23362(739503649) * 185933211;
			} else if (local3 == 6) {
				this.anInt5587 = arg0.method23182(2076192570) * 510820589;
			} else if (local3 == 7) {
				this.anInt5581 = arg0.method23182(1622769066) * -2071941203;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method23178((byte) -121);
			}
		}
	}
}
