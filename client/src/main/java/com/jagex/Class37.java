package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abk")
public abstract class Class37 implements Interface3 {

	@OriginalMember(owner = "client!abk", name = "m", descriptor = "I")
	int anInt2425;

	@OriginalMember(owner = "client!abk", name = "u", descriptor = "Lclient!ej;")
	final Class243 aClass243_50 = new Class243(50);

	@OriginalMember(owner = "client!abk", name = "l", descriptor = "Lclient!wu;")
	final Class648 aClass648_2 = new Class648(250);

	@OriginalMember(owner = "client!abk", name = "g", descriptor = "Lclient!abd;")
	final Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!abk", name = "t", descriptor = "Lclient!zv;")
	final Class719 aClass719_2;

	@OriginalMember(owner = "client!abk", name = "f", descriptor = "Z")
	boolean aBoolean422;

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_60;

	@OriginalMember(owner = "client!abk", name = "i", descriptor = "Lclient!an;")
	final Interface12 anInterface12_9;

	@OriginalMember(owner = "client!abk", name = "o", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray19;

	@OriginalMember(owner = "client!abk", name = "j", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray20;

	@OriginalMember(owner = "client!abk", name = "o", descriptor = "(FFFF[FB)V")
	static void method17380(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) byte arg5) {
		@Pc(3) float local3 = arg1 - arg0;
		@Pc(7) float local7 = arg2 - arg1;
		@Pc(11) float local11 = arg3 - arg2;
		@Pc(15) float local15 = local7 - local3;
		arg4[3] = local11 - local7 - local15;
		arg4[2] = local15 + local15 + local15;
		arg4[1] = local3 + local3 + local3;
		arg4[0] = arg0;
	}

	@OriginalMember(owner = "client!abk", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;ZLclient!pf;Lclient!an;)V")
	Class37(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class480 arg3, @OriginalArg(4) Interface12 arg4) {
		this.aClass719_2 = arg1;
		this.aBoolean422 = arg2;
		this.aClass480_60 = arg3;
		this.anInterface12_9 = arg4;
		if (Class722.aClass722_10 == arg0) {
			this.aStringArray19 = new String[] { null, null, Class60.aClass60_82.method1180(this.aClass719_2, -463218767), null, null, Class60.aClass60_9.method1180(this.aClass719_2, 1970229862) };
		} else {
			this.aStringArray19 = new String[] { null, null, Class60.aClass60_82.method1180(this.aClass719_2, 86080867), null, null, null };
		}
		this.aStringArray20 = new String[] { null, null, null, null, Class60.aClass60_15.method1180(this.aClass719_2, 1206516675) };
	}

	@OriginalMember(owner = "client!abk", name = "o", descriptor = "(Lclient!di;IIIIILclient!xw;)Lclient!cm;")
	final Class99 method17355(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class672 arg6) {
		this.aClass30_2.anInt100 = arg0.anInt2931 * 566856597;
		this.aClass30_2.anInt98 = arg1 * -406660133;
		this.aClass30_2.anInt99 = arg2 * 1719877809;
		this.aClass30_2.anInt97 = arg3 * -174761735;
		this.aClass30_2.anInt101 = arg4 * 694050919;
		this.aClass30_2.anInt102 = arg5 * -347239179;
		this.aClass30_2.aBoolean18 = arg6 != null;
		return (Class99) this.aClass648_2.method33056(this.aClass30_2);
	}

	@OriginalMember(owner = "client!abk", name = "t", descriptor = "(Lclient!di;IIIIILclient!xw;I)Lclient!cm;")
	final Class99 method17356(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class672 arg6, @OriginalArg(7) int arg7) {
		this.aClass30_2.anInt100 = arg0.anInt2931 * 566856597;
		this.aClass30_2.anInt98 = arg1 * -406660133;
		this.aClass30_2.anInt99 = arg2 * 1719877809;
		this.aClass30_2.anInt97 = arg3 * -174761735;
		this.aClass30_2.anInt101 = arg4 * 694050919;
		this.aClass30_2.anInt102 = arg5 * -347239179;
		this.aClass30_2.aBoolean18 = arg6 != null;
		return (Class99) this.aClass648_2.method33056(this.aClass30_2);
	}

	@OriginalMember(owner = "client!abk", name = "s", descriptor = "(Z)V")
	final void method17357(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean422) {
			this.aBoolean422 = arg0;
			this.method17362(-1704842830);
		}
	}

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "(ZI)V")
	final void method17358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.aBoolean422) {
			this.aBoolean422 = arg0;
			this.method17362(-1613755509);
		}
	}

	@OriginalMember(owner = "client!abk", name = "w", descriptor = "(I)V")
	final void method17359(@OriginalArg(0) int arg0) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "g", descriptor = "(B)V")
	final void method17360(@OriginalArg(0) byte arg0) {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "i", descriptor = "(II)V")
	final void method17361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26247(arg0, (byte) 80);
		}
		@Pc(21) Class648 local21 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33061(arg0);
		}
	}

	@OriginalMember(owner = "client!abk", name = "l", descriptor = "(I)V")
	final void method17362(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
		@Pc(20) Class648 local20 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "k", descriptor = "(Z)V")
	final void method17363(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean422) {
			this.aBoolean422 = arg0;
			this.method17362(-1632313784);
		}
	}

	@OriginalMember(owner = "client!abk", name = "j", descriptor = "(Lclient!di;Lclient!di;IIIIZZILclient!ed;Lclient!xw;Lclient!wi;Lclient!an;)Lclient!cm;")
	final Class99 method17364(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class104 arg9, @OriginalArg(10) Class672 arg10, @OriginalArg(11) Class638 arg11, @OriginalArg(12) Interface12 arg12) {
		if (!arg7) {
			@Pc(12) Class99 local12 = this.method17356(arg1, arg2, arg3, arg4, arg5, arg8, arg10, -2032795410);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(22) Class43 local22 = (Class43) arg12.method18054(arg2, 935850958);
		if (arg3 > 1 && local22.anIntArray13 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (arg3 >= local22.anIntArray11[local33] && local22.anIntArray11[local33] != 0) {
					local31 = local22.anIntArray13[local33];
				}
			}
			if (local31 != -1) {
				local22 = (Class43) arg12.method18054(local31, -1694830842);
			}
		}
		@Pc(77) int[] local77 = local22.method883(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, (byte) -17);
		if (local77 == null) {
			return null;
		}
		@Pc(92) Class99 local92;
		if (arg7) {
			local92 = arg0.method20741(local77, 0, 36, 36, 32, -1657536790);
		} else {
			local92 = arg1.method20741(local77, 0, 36, 36, 32, -1657536790);
		}
		if (!arg7) {
			@Pc(108) Class30 local108 = new Class30();
			local108.anInt100 = arg1.anInt2931 * 566856597;
			local108.anInt98 = arg2 * -406660133;
			local108.anInt99 = arg3 * 1719877809;
			local108.anInt97 = arg4 * -174761735;
			local108.anInt101 = arg5 * 694050919;
			local108.anInt102 = arg8 * -347239179;
			local108.aBoolean18 = arg10 != null;
			this.aClass648_2.method33059(local92, local108);
		}
		return local92;
	}

	@OriginalMember(owner = "client!abk", name = "a", descriptor = "(Lclient!di;Lclient!di;IIIIZZILclient!ed;Lclient!xw;Lclient!wi;Lclient!an;)Lclient!cm;")
	final Class99 method17365(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class104 arg9, @OriginalArg(10) Class672 arg10, @OriginalArg(11) Class638 arg11, @OriginalArg(12) Interface12 arg12) {
		if (!arg7) {
			@Pc(12) Class99 local12 = this.method17356(arg1, arg2, arg3, arg4, arg5, arg8, arg10, -2032795410);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(22) Class43 local22 = (Class43) arg12.method18054(arg2, -581761971);
		if (arg3 > 1 && local22.anIntArray13 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (arg3 >= local22.anIntArray11[local33] && local22.anIntArray11[local33] != 0) {
					local31 = local22.anIntArray13[local33];
				}
			}
			if (local31 != -1) {
				local22 = (Class43) arg12.method18054(local31, 1305783865);
			}
		}
		@Pc(77) int[] local77 = local22.method883(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, (byte) 43);
		if (local77 == null) {
			return null;
		}
		@Pc(92) Class99 local92;
		if (arg7) {
			local92 = arg0.method20741(local77, 0, 36, 36, 32, -1657536790);
		} else {
			local92 = arg1.method20741(local77, 0, 36, 36, 32, -1657536790);
		}
		if (!arg7) {
			@Pc(108) Class30 local108 = new Class30();
			local108.anInt100 = arg1.anInt2931 * 566856597;
			local108.anInt98 = arg2 * -406660133;
			local108.anInt99 = arg3 * 1719877809;
			local108.anInt97 = arg4 * -174761735;
			local108.anInt101 = arg5 * 694050919;
			local108.anInt102 = arg8 * -347239179;
			local108.aBoolean18 = arg10 != null;
			this.aClass648_2.method33059(local92, local108);
		}
		return local92;
	}

	@OriginalMember(owner = "client!abk", name = "x", descriptor = "(Z)V")
	final void method17366(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean422) {
			this.aBoolean422 = arg0;
			this.method17362(-1603731797);
		}
	}

	@OriginalMember(owner = "client!abk", name = "ai", descriptor = "()V")
	final void method17367() {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "f", descriptor = "(Lclient!di;Lclient!di;IIIIZZILclient!ed;Lclient!xw;Lclient!wi;Lclient!an;I)Lclient!cm;")
	final Class99 method17368(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class104 arg9, @OriginalArg(10) Class672 arg10, @OriginalArg(11) Class638 arg11, @OriginalArg(12) Interface12 arg12, @OriginalArg(13) int arg13) {
		if (!arg7) {
			@Pc(12) Class99 local12 = this.method17356(arg1, arg2, arg3, arg4, arg5, arg8, arg10, -2032795410);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(22) Class43 local22 = (Class43) arg12.method18054(arg2, -964104509);
		if (arg3 > 1 && local22.anIntArray13 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (arg3 >= local22.anIntArray11[local33] && local22.anIntArray11[local33] != 0) {
					local31 = local22.anIntArray13[local33];
				}
			}
			if (local31 != -1) {
				local22 = (Class43) arg12.method18054(local31, -171391682);
			}
		}
		@Pc(77) int[] local77 = local22.method883(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, (byte) 27);
		if (local77 == null) {
			return null;
		}
		@Pc(92) Class99 local92;
		if (arg7) {
			local92 = arg0.method20741(local77, 0, 36, 36, 32, -1657536790);
		} else {
			local92 = arg1.method20741(local77, 0, 36, 36, 32, -1657536790);
		}
		if (!arg7) {
			@Pc(108) Class30 local108 = new Class30();
			local108.anInt100 = arg1.anInt2931 * 566856597;
			local108.anInt98 = arg2 * -406660133;
			local108.anInt99 = arg3 * 1719877809;
			local108.anInt97 = arg4 * -174761735;
			local108.anInt101 = arg5 * 694050919;
			local108.anInt102 = arg8 * -347239179;
			local108.aBoolean18 = arg10 != null;
			this.aClass648_2.method33059(local92, local108);
		}
		return local92;
	}

	@OriginalMember(owner = "client!abk", name = "m", descriptor = "(B)V")
	final void method17369(@OriginalArg(0) byte arg0) {
		@Pc(3) Class243 local3 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26259((byte) 3);
		}
		@Pc(20) Class648 local20 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33079();
		}
	}

	@OriginalMember(owner = "client!abk", name = "n", descriptor = "(I)V")
	final void method17370(@OriginalArg(0) int arg0) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "c", descriptor = "(I)V")
	final void method17371(@OriginalArg(0) int arg0) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "b", descriptor = "(I)V")
	final void method17372(@OriginalArg(0) int arg0) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "ax", descriptor = "(I)V")
	final void method17373(@OriginalArg(0) int arg0) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "ay", descriptor = "()V")
	final void method17374() {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "u", descriptor = "(II)V")
	final void method17375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2425 = arg0 * 1472047355;
		@Pc(8) Class243 local8 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abk", name = "aq", descriptor = "()V")
	final void method17376() {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "ao", descriptor = "()V")
	final void method17377() {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "aj", descriptor = "()V")
	final void method17378() {
		@Pc(3) Class648 local3 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33076();
		}
	}

	@OriginalMember(owner = "client!abk", name = "ac", descriptor = "()V")
	final void method17379() {
		@Pc(3) Class243 local3 = this.aClass243_50;
		synchronized (this.aClass243_50) {
			this.aClass243_50.method26259((byte) 3);
		}
		@Pc(20) Class648 local20 = this.aClass648_2;
		synchronized (this.aClass648_2) {
			this.aClass648_2.method33079();
		}
	}
}
