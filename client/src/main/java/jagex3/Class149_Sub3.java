package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aji")
public final class Class149_Sub3 extends Class149 {

	@OriginalMember(owner = "client!aji", name = "k", descriptor = "Lclient!aas;")
	Class21 aClass21_2 = new Class21();

	@OriginalMember(owner = "client!aji", name = "m", descriptor = "Lclient!uk;")
	public Class596 aClass596_1;

	@OriginalMember(owner = "client!aji", name = "em", descriptor = "(S)I")
	public static int method12318(@OriginalArg(0) short arg0) {
		if ((double) Class159_Sub1.aFloat153 == 2.0D) {
			return 25;
		} else if ((double) Class159_Sub1.aFloat153 == 3.0D) {
			return 37;
		} else if ((double) Class159_Sub1.aFloat153 == 4.0D) {
			return 50;
		} else if ((double) Class159_Sub1.aFloat153 == 6.0D) {
			return 75;
		} else if ((double) Class159_Sub1.aFloat153 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aji", name = "d", descriptor = "(ILjava/lang/String;ZS)V")
	public static void method12319(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) short arg3) {
		if (!Class146_Sub2.method11709(67624926)) {
			return;
		}
		if (arg0 != Class411.anInt4907 * 276097583) {
			Class411.aLong274 = -7033311592096984251L;
		}
		Class411.anInt4907 = arg0 * 48143567;
		Class411.aString208 = arg1;
		Class411.aBoolean760 = arg2;
		client.aClass175_1.method24367((byte) 45);
		Class481.method29937(17, 1823202236);
	}

	@OriginalMember(owner = "client!aji", name = "<init>", descriptor = "(Lclient!uk;)V")
	public Class149_Sub3(@OriginalArg(0) Class596 arg0) {
		this.aClass596_1 = arg0;
	}

	@OriginalMember(owner = "client!aji", name = "w", descriptor = "(IIII)V")
	public void method12311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class149_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class149_Sub1 local9 = (Class149_Sub1) this.aClass21_2.method390((short) 16066); local9 != null; local9 = (Class149_Sub1) this.aClass21_2.method377(-1915563430)) {
			local3++;
			if (local9.anInt1399 * 356694381 == arg0) {
				local9.method11773(arg0, arg1, arg2, arg3, -781903685);
				return;
			}
			if (local9.anInt1399 * 356694381 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class94.method1799(new Class149_Sub1(arg0, arg1, arg2, arg3), local1, (byte) 2);
			if (local3 >= Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
				this.aClass21_2.method390((short) 19492).method23778(-719770481);
			}
		} else if (local3 < Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
			this.aClass21_2.method380(new Class149_Sub1(arg0, arg1, arg2, arg3), -305869964);
		}
	}

	@OriginalMember(owner = "client!aji", name = "n", descriptor = "(IIIIB)V")
	public void method12312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(1) Class149_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class149_Sub1 local9 = (Class149_Sub1) this.aClass21_2.method390((short) 507); local9 != null; local9 = (Class149_Sub1) this.aClass21_2.method377(-1915563430)) {
			local3++;
			if (local9.anInt1399 * 356694381 == arg0) {
				local9.method11773(arg0, arg1, arg2, arg3, 707512500);
				return;
			}
			if (local9.anInt1399 * 356694381 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class94.method1799(new Class149_Sub1(arg0, arg1, arg2, arg3), local1, (byte) 2);
			if (local3 >= Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
				this.aClass21_2.method390((short) 24846).method23778(-719770481);
			}
		} else if (local3 < Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
			this.aClass21_2.method380(new Class149_Sub1(arg0, arg1, arg2, arg3), -305869964);
		}
	}

	@OriginalMember(owner = "client!aji", name = "m", descriptor = "(II)Lclient!ajc;")
	public Class149_Sub1 method12313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class149_Sub1 local5 = (Class149_Sub1) this.aClass21_2.method390((short) 17963);
		if (local5 == null || local5.anInt1399 * 356694381 > arg0) {
			return null;
		}
		for (@Pc(21) Class149_Sub1 local21 = (Class149_Sub1) this.aClass21_2.method377(-1915563430); local21 != null && local21.anInt1399 * 356694381 <= arg0; local21 = (Class149_Sub1) this.aClass21_2.method377(-1915563430)) {
			local5.method23778(-719770481);
			local5 = local21;
		}
		if (local5.anInt1397 * -840385723 + local5.anInt1399 * 356694381 + this.aClass596_1.anInt5659 * -926072261 > arg0) {
			return local5;
		} else {
			local5.method23778(-719770481);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "u", descriptor = "()Z")
	public boolean method12314() {
		return this.aClass21_2.method384((byte) 46);
	}

	@OriginalMember(owner = "client!aji", name = "f", descriptor = "(IIII)V")
	public void method12315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class149_Sub1 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class149_Sub1 local9 = (Class149_Sub1) this.aClass21_2.method390((short) 7344); local9 != null; local9 = (Class149_Sub1) this.aClass21_2.method377(-1915563430)) {
			local3++;
			if (local9.anInt1399 * 356694381 == arg0) {
				local9.method11773(arg0, arg1, arg2, arg3, -1235386956);
				return;
			}
			if (local9.anInt1399 * 356694381 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class94.method1799(new Class149_Sub1(arg0, arg1, arg2, arg3), local1, (byte) 2);
			if (local3 >= Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
				this.aClass21_2.method390((short) 13481).method23778(-719770481);
			}
		} else if (local3 < Class93_Sub26.aClass645_15.anInt5922 * 129922025) {
			this.aClass21_2.method380(new Class149_Sub1(arg0, arg1, arg2, arg3), -305869964);
		}
	}

	@OriginalMember(owner = "client!aji", name = "l", descriptor = "()Z")
	public boolean method12316() {
		return this.aClass21_2.method384((byte) 61);
	}

	@OriginalMember(owner = "client!aji", name = "k", descriptor = "(I)Z")
	public boolean method12317(@OriginalArg(0) int arg0) {
		return this.aClass21_2.method384((byte) 123);
	}
}
