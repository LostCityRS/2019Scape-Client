package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahq")
public class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!ahq", name = "j", descriptor = "Lclient!cm;")
	Class99 aClass99_21;

	@OriginalMember(owner = "client!ahq", name = "m", descriptor = "Lclient!cm;")
	Class99 aClass99_22;

	@OriginalMember(owner = "client!ahq", name = "i", descriptor = "Lclient!cm;")
	Class99 aClass99_23;

	@OriginalMember(owner = "client!ahq", name = "o", descriptor = "Lclient!cm;")
	Class99 aClass99_24;

	@OriginalMember(owner = "client!ahq", name = "a", descriptor = "Lclient!cm;")
	Class99 aClass99_25;

	@OriginalMember(owner = "client!ahq", name = "s", descriptor = "Lclient!cm;")
	Class99 aClass99_26;

	@OriginalMember(owner = "client!ahq", name = "aox", descriptor = "(Lclient!yp;I)V")
	static void method20290(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(41) Class463 local41 = Class463.method29541((float) local13, (float) local23, (float) local33);
		Class160.aClass121_Sub1_2.method9704(local41, (byte) -7);
		local41.method29557();
	}

	@OriginalMember(owner = "client!ahq", name = "l", descriptor = "(ZI)V")
	public static void method20291(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (Class365.aClass369_1 == null) {
			Class699.method37064(-1676820284);
		}
		if (arg0) {
			Class365.aClass369_1.method28298(-1113419366);
		}
	}

	@OriginalMember(owner = "client!ahq", name = "ed", descriptor = "(Lclient!yp;I)V")
	static void method20292(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2031187008);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class691.method36970(local16, local22, arg0, 1298975588);
	}

	@OriginalMember(owner = "client!ahq", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!ahl;)V")
	Class129_Sub2(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class125_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahq", name = "m", descriptor = "()V")
	@Override
	public final void method28663() {
		super.method28658(1965005490);
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass99_23 = Class568.method31530(this.aClass480_78, local6.anInt2907 * 80302769, -1960609277);
		this.aClass99_22 = Class568.method31530(this.aClass480_78, local6.anInt2909 * 1969707833, -1311706889);
		this.aClass99_24 = Class568.method31530(this.aClass480_78, local6.anInt2906 * -1908989391, 1393595674);
		this.aClass99_21 = Class568.method31530(this.aClass480_78, local6.anInt2908 * -1284217071, 308192790);
		this.aClass99_25 = Class568.method31530(this.aClass480_78, local6.anInt2910 * 1921101589, 672644386);
		this.aClass99_26 = Class568.method31530(this.aClass480_78, local6.anInt2911 * 1339695313, 949125654);
	}

	@OriginalMember(owner = "client!ahq", name = "t", descriptor = "(I)V")
	@Override
	public final void method28658(@OriginalArg(0) int arg0) {
		super.method28658(1143285112);
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass99_23 = Class568.method31530(this.aClass480_78, local6.anInt2907 * 80302769, -167532053);
		this.aClass99_22 = Class568.method31530(this.aClass480_78, local6.anInt2909 * 1969707833, -1069793255);
		this.aClass99_24 = Class568.method31530(this.aClass480_78, local6.anInt2906 * -1908989391, -1998891166);
		this.aClass99_21 = Class568.method31530(this.aClass480_78, local6.anInt2908 * -1284217071, 1613074577);
		this.aClass99_25 = Class568.method31530(this.aClass480_78, local6.anInt2910 * 1921101589, 940209135);
		this.aClass99_26 = Class568.method31530(this.aClass480_78, local6.anInt2911 * 1339695313, -590112780);
	}

	@OriginalMember(owner = "client!ahq", name = "s", descriptor = "(ZIII)V")
	@Override
	final void method20273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = arg1 + this.aClass99_24.method18214();
		@Pc(17) int local17 = arg1 + this.aClass125_5.anInt2900 * 199320851 - this.aClass99_21.method18214();
		@Pc(23) int local23 = arg2 + this.aClass99_25.method18288();
		@Pc(35) int local35 = arg2 + this.aClass125_5.anInt2903 * 1087492339 - this.aClass99_26.method18288();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20280(561056884) * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class279.aClass102_9.method20713(local54);
		Class279.aClass102_9.method20986(local5, local23, local5 + local51, local35);
		this.method20286(local5, local23, local39, local43, (byte) 85);
		Class279.aClass102_9.method20986(local51 + local5, local23, local17, local35);
		this.aClass99_22.method18244(local5, local23, local39, local43);
		Class279.aClass102_9.method20986(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "p", descriptor = "(IIIIB)V")
	void method20286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aClass99_23.method18244(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahq", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method28657(@OriginalArg(0) int arg0) {
		if (!super.method28657(1045087850)) {
			return false;
		}
		@Pc(9) Class125_Sub2 local9 = (Class125_Sub2) this.aClass125_5;
		if (!this.aClass480_78.method29945(local9.anInt2907 * 80302769, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2909 * 1969707833, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2906 * -1908989391, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2908 * -1284217071, (byte) 1)) {
			return false;
		} else if (this.aClass480_78.method29945(local9.anInt2910 * 1921101589, (byte) 1)) {
			return this.aClass480_78.method29945(local9.anInt2911 * 1339695313, (byte) 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahq", name = "i", descriptor = "()V")
	@Override
	public final void method28661() {
		super.method28658(-92266746);
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass99_23 = Class568.method31530(this.aClass480_78, local6.anInt2907 * 80302769, 778970678);
		this.aClass99_22 = Class568.method31530(this.aClass480_78, local6.anInt2909 * 1969707833, 171160116);
		this.aClass99_24 = Class568.method31530(this.aClass480_78, local6.anInt2906 * -1908989391, -1751216457);
		this.aClass99_21 = Class568.method31530(this.aClass480_78, local6.anInt2908 * -1284217071, -1677316285);
		this.aClass99_25 = Class568.method31530(this.aClass480_78, local6.anInt2910 * 1921101589, -559813541);
		this.aClass99_26 = Class568.method31530(this.aClass480_78, local6.anInt2911 * 1339695313, -758779357);
	}

	@OriginalMember(owner = "client!ahq", name = "o", descriptor = "()Z")
	@Override
	public final boolean method28664() {
		if (!super.method28657(1395301257)) {
			return false;
		}
		@Pc(9) Class125_Sub2 local9 = (Class125_Sub2) this.aClass125_5;
		if (!this.aClass480_78.method29945(local9.anInt2907 * 80302769, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2909 * 1969707833, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2906 * -1908989391, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2908 * -1284217071, (byte) 1)) {
			return false;
		} else if (this.aClass480_78.method29945(local9.anInt2910 * 1921101589, (byte) 1)) {
			return this.aClass480_78.method29945(local9.anInt2911 * 1339695313, (byte) 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahq", name = "j", descriptor = "()Z")
	@Override
	public final boolean method28665() {
		if (!super.method28657(426050991)) {
			return false;
		}
		@Pc(9) Class125_Sub2 local9 = (Class125_Sub2) this.aClass125_5;
		if (!this.aClass480_78.method29945(local9.anInt2907 * 80302769, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2909 * 1969707833, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2906 * -1908989391, (byte) 1)) {
			return false;
		} else if (!this.aClass480_78.method29945(local9.anInt2908 * -1284217071, (byte) 1)) {
			return false;
		} else if (this.aClass480_78.method29945(local9.anInt2910 * 1921101589, (byte) 1)) {
			return this.aClass480_78.method29945(local9.anInt2911 * 1339695313, (byte) 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahq", name = "a", descriptor = "(ZIIB)V")
	@Override
	final void method20274(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class279.aClass102_9.method20713(local4);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass125_5.anInt2903 * 1087492339);
		@Pc(29) int local29 = this.aClass99_24.method18214();
		@Pc(33) int local33 = this.aClass99_24.method18288();
		@Pc(37) int local37 = this.aClass99_21.method18214();
		@Pc(41) int local41 = this.aClass99_21.method18288();
		this.aClass99_24.method18225(arg1, (this.aClass125_5.anInt2903 * 1087492339 - local33) / 2 + arg2);
		this.aClass99_21.method18225(this.aClass125_5.anInt2900 * 199320851 + arg1 - local37, (this.aClass125_5.anInt2903 * 1087492339 - local41) / 2 + arg2);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass99_25.method18288());
		this.aClass99_25.method18244(arg1 + local29, arg2, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		@Pc(120) int local120 = this.aClass99_26.method18288();
		Class279.aClass102_9.method20986(arg1, this.aClass125_5.anInt2903 * 1087492339 + arg2 - local120, arg1 + this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_26.method18244(local29 + arg1, arg2 + this.aClass125_5.anInt2903 * 1087492339 - local120, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "x", descriptor = "(ZII)V")
	@Override
	final void method20272(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 + this.aClass99_24.method18214();
		@Pc(17) int local17 = arg1 + this.aClass125_5.anInt2900 * 199320851 - this.aClass99_21.method18214();
		@Pc(23) int local23 = arg2 + this.aClass99_25.method18288();
		@Pc(35) int local35 = arg2 + this.aClass125_5.anInt2903 * 1087492339 - this.aClass99_26.method18288();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20280(330192237) * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class279.aClass102_9.method20713(local54);
		Class279.aClass102_9.method20986(local5, local23, local5 + local51, local35);
		this.method20286(local5, local23, local39, local43, (byte) 107);
		Class279.aClass102_9.method20986(local51 + local5, local23, local17, local35);
		this.aClass99_22.method18244(local5, local23, local39, local43);
		Class279.aClass102_9.method20986(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "w", descriptor = "(ZII)V")
	@Override
	final void method20275(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class279.aClass102_9.method20713(local4);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass125_5.anInt2903 * 1087492339);
		@Pc(29) int local29 = this.aClass99_24.method18214();
		@Pc(33) int local33 = this.aClass99_24.method18288();
		@Pc(37) int local37 = this.aClass99_21.method18214();
		@Pc(41) int local41 = this.aClass99_21.method18288();
		this.aClass99_24.method18225(arg1, (this.aClass125_5.anInt2903 * 1087492339 - local33) / 2 + arg2);
		this.aClass99_21.method18225(this.aClass125_5.anInt2900 * 199320851 + arg1 - local37, (this.aClass125_5.anInt2903 * 1087492339 - local41) / 2 + arg2);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass99_25.method18288());
		this.aClass99_25.method18244(arg1 + local29, arg2, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		@Pc(120) int local120 = this.aClass99_26.method18288();
		Class279.aClass102_9.method20986(arg1, this.aClass125_5.anInt2903 * 1087492339 + arg2 - local120, arg1 + this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_26.method18244(local29 + arg1, arg2 + this.aClass125_5.anInt2903 * 1087492339 - local120, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "n", descriptor = "(IIII)V")
	void method20287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass99_23.method18244(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahq", name = "q", descriptor = "(ZII)V")
	@Override
	final void method20277(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class279.aClass102_9.method20713(local4);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass125_5.anInt2903 * 1087492339);
		@Pc(29) int local29 = this.aClass99_24.method18214();
		@Pc(33) int local33 = this.aClass99_24.method18288();
		@Pc(37) int local37 = this.aClass99_21.method18214();
		@Pc(41) int local41 = this.aClass99_21.method18288();
		this.aClass99_24.method18225(arg1, (this.aClass125_5.anInt2903 * 1087492339 - local33) / 2 + arg2);
		this.aClass99_21.method18225(this.aClass125_5.anInt2900 * 199320851 + arg1 - local37, (this.aClass125_5.anInt2903 * 1087492339 - local41) / 2 + arg2);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass99_25.method18288());
		this.aClass99_25.method18244(arg1 + local29, arg2, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		@Pc(120) int local120 = this.aClass99_26.method18288();
		Class279.aClass102_9.method20986(arg1, this.aClass125_5.anInt2903 * 1087492339 + arg2 - local120, arg1 + this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_26.method18244(local29 + arg1, arg2 + this.aClass125_5.anInt2903 * 1087492339 - local120, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "h", descriptor = "(ZII)V")
	@Override
	final void method20278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class279.aClass102_9.method20713(local4);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass125_5.anInt2903 * 1087492339);
		@Pc(29) int local29 = this.aClass99_24.method18214();
		@Pc(33) int local33 = this.aClass99_24.method18288();
		@Pc(37) int local37 = this.aClass99_21.method18214();
		@Pc(41) int local41 = this.aClass99_21.method18288();
		this.aClass99_24.method18225(arg1, (this.aClass125_5.anInt2903 * 1087492339 - local33) / 2 + arg2);
		this.aClass99_21.method18225(this.aClass125_5.anInt2900 * 199320851 + arg1 - local37, (this.aClass125_5.anInt2903 * 1087492339 - local41) / 2 + arg2);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass99_25.method18288());
		this.aClass99_25.method18244(arg1 + local29, arg2, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		@Pc(120) int local120 = this.aClass99_26.method18288();
		Class279.aClass102_9.method20986(arg1, this.aClass125_5.anInt2903 * 1087492339 + arg2 - local120, arg1 + this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_26.method18244(local29 + arg1, arg2 + this.aClass125_5.anInt2903 * 1087492339 - local120, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "v", descriptor = "(IIII)V")
	void method20288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass99_23.method18244(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahq", name = "r", descriptor = "(ZII)V")
	@Override
	final void method20276(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class279.aClass102_9.method20713(local4);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass125_5.anInt2903 * 1087492339);
		@Pc(29) int local29 = this.aClass99_24.method18214();
		@Pc(33) int local33 = this.aClass99_24.method18288();
		@Pc(37) int local37 = this.aClass99_21.method18214();
		@Pc(41) int local41 = this.aClass99_21.method18288();
		this.aClass99_24.method18225(arg1, (this.aClass125_5.anInt2903 * 1087492339 - local33) / 2 + arg2);
		this.aClass99_21.method18225(this.aClass125_5.anInt2900 * 199320851 + arg1 - local37, (this.aClass125_5.anInt2903 * 1087492339 - local41) / 2 + arg2);
		Class279.aClass102_9.method20986(arg1, arg2, arg1 + this.aClass125_5.anInt2900 * 199320851, arg2 + this.aClass99_25.method18288());
		this.aClass99_25.method18244(arg1 + local29, arg2, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		@Pc(120) int local120 = this.aClass99_26.method18288();
		Class279.aClass102_9.method20986(arg1, this.aClass125_5.anInt2903 * 1087492339 + arg2 - local120, arg1 + this.aClass125_5.anInt2900 * 199320851, this.aClass125_5.anInt2903 * 1087492339 + arg2);
		this.aClass99_26.method18244(local29 + arg1, arg2 + this.aClass125_5.anInt2903 * 1087492339 - local120, this.aClass125_5.anInt2900 * 199320851 - local29 - local37, this.aClass125_5.anInt2903 * 1087492339);
		Class279.aClass102_9.method20986(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahq", name = "y", descriptor = "(IIII)V")
	void method20289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass99_23.method18244(arg0, arg1, arg2, arg3);
	}
}
