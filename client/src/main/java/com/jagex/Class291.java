package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;

@OriginalClass("client!gl")
final class Class291 implements Iterator {

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!pf;")
	static Class480 aClass480_91;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	int anInt3948;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gl", name = "this$0", descriptor = "Lclient!adh;")
	final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!gl", name = "anr", descriptor = "(Lclient!yp;B)V")
	static void method26938(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(31) Class463 local31 = Class463.method29541((float) local13, (float) local13, (float) local13);
		if (local31.aFloat297 == -1.0F) {
			local31.aFloat297 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat295 == -1.0F) {
			local31.aFloat295 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat296 == -1.0F) {
			local31.aFloat296 = Float.POSITIVE_INFINITY;
		}
		Class160.aClass121_Sub1_2.method9583(local31, -351030388);
		Class160.aClass121_Sub1_2.method9610((float) local23 / 1000.0F, 1892578942);
		local31.method29557();
	}

	@OriginalMember(owner = "client!gl", name = "ch", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26939(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		arg0.anInt4105 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 1467789459;
		arg0.anInt4106 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * 1596627121;
		Class296.method26998(arg0, -1260837934);
		Class122_Sub2.method10326(arg1, arg0, -865178180);
		if (arg0.anInt4135 * 710314345 == 0) {
			Class388.method28636(arg1, arg0, false, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "(III)V")
	static void method26940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Class698.aClass638_1.aBoolean960) {
			if (Class630.anInt5553 * 721317679 == 1) {
				return;
			}
			if (Class630.aBoolean958 && Class630.anInt5553 * 721317679 == 2 && Class57.aClass80_Sub1_Sub11_1.aString106.equals(Class60.aClass60_133.method1180(Class512.aClass719_3, -1301160343))) {
				return;
			}
		}
		@Pc(27) Class15 local27 = Class445.method29244(2076922206);
		@Pc(35) int local35 = local27.method373(Class60.aClass60_132.method1180(Class512.aClass719_3, 740503755), -72579314);
		@Pc(71) int local71;
		@Pc(49) int local49;
		if (Class630.aBoolean956) {
			for (@Pc(93) Class80_Sub1_Sub4 local93 = (Class80_Sub1_Sub4) Class630.aClass3_17.method50((byte) -65); local93 != null; local93 = (Class80_Sub1_Sub4) Class630.aClass3_17.method46((byte) -102)) {
				if (local93.anInt3022 * 855388281 == 1) {
					local49 = Class413.method28991((Class80_Sub1_Sub11) local93.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68, local27, (byte) -101);
				} else {
					local49 = Class141.method10904(local93, local27, 1610685666);
				}
				if (local49 > local35) {
					local35 = local49;
				}
			}
			local35 += 8;
			local71 = Class630.anInt5554 * 876474189 * Class630.anInt5547 * 1378633515 + 21;
			Class106.anInt2551 = (Class630.anInt5554 * 876474189 * Class630.anInt5547 * 1378633515 + (Class630.aBoolean957 ? 26 : 22)) * 743868825;
		} else {
			for (@Pc(42) Class80_Sub1_Sub11 local42 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local42 != null; local42 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(-1027782412)) {
				local49 = Class413.method28991(local42, local27, (byte) 42);
				if (local49 > local35) {
					local35 = local49;
				}
			}
			local35 += 8;
			local71 = Class630.anInt5553 * 721317679 * Class630.anInt5547 * 1378633515 + 21;
			Class106.anInt2551 = (Class630.anInt5553 * 721317679 * Class630.anInt5547 * 1378633515 + (Class630.aBoolean957 ? 26 : 22)) * 743868825;
		}
		local35 += 10;
		@Pc(161) int local161 = arg0 - local35 / 2;
		if (local35 + local161 > Class80_Sub1_Sub1.anInt254 * -255202897) {
			local161 = Class80_Sub1_Sub1.anInt254 * -255202897 - local35;
		}
		if (local161 < 0) {
			local161 = 0;
		}
		local49 = arg1;
		if (local71 + arg1 > Class80_Sub25.anInt1627 * 167687103) {
			local49 = Class80_Sub25.anInt1627 * 167687103 - local71;
		}
		if (local49 < 0) {
			local49 = 0;
		}
		Class594.anInt5325 = local161 * -730613585;
		Class103_Sub15.anInt970 = local49 * 324474339;
		Class427.anInt4636 = local35 * 2087606289;
		Class630.anInt5564 = (int) (Math.random() * 24.0D) * -1266557645;
		Class630.aBoolean955 = true;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!adh;)V")
	Class291(@OriginalArg(0) Class2_Sub1_Sub1 arg0) {
		this.aClass2_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "()V")
	public void method26934() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gl", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt3948 += -1648685013) * 1184706179 - 1;
		@Pc(19) Class107_Sub2 local19 = (Class107_Sub2) this.aClass2_Sub1_Sub1_2.aClass243_5.method26282((long) local11);
		return local19 == null ? this.aClass2_Sub1_Sub1_2.method1526(local11, (byte) 95) : local19;
	}

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "()Z")
	public boolean method26935() {
		return this.anInt3948 * 1184706179 < this.aClass2_Sub1_Sub1_2.method18051(173689220);
	}

	@OriginalMember(owner = "client!gl", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt3948 * 1184706179 < this.aClass2_Sub1_Sub1_2.method18051(-75002506);
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method26936() {
		@Pc(11) int local11 = (this.anInt3948 += -1648685013) * 1184706179 - 1;
		@Pc(19) Class107_Sub2 local19 = (Class107_Sub2) this.aClass2_Sub1_Sub1_2.aClass243_5.method26282((long) local11);
		return local19 == null ? this.aClass2_Sub1_Sub1_2.method1526(local11, (byte) 7) : local19;
	}

	@OriginalMember(owner = "client!gl", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "()V")
	public void method26937() {
		throw new UnsupportedOperationException();
	}
}
