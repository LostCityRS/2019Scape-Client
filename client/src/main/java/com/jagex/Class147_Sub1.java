package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aji")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!aji", name = "ug", descriptor = "I")
	static int anInt1445;

	@OriginalMember(owner = "client!aji", name = "u", descriptor = "Lclient!aac;")
	Class5 aClass5_2 = new Class5();

	@OriginalMember(owner = "client!aji", name = "e", descriptor = "Lclient!uv;")
	public Class602 aClass602_1;

	@OriginalMember(owner = "client!aji", name = "xg", descriptor = "(Lclient!yp;B)V")
	static void method13119(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class47.aClass28_6.anInt89 * 307612145;
	}

	@OriginalMember(owner = "client!aji", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class147_Sub1(@OriginalArg(0) Class602 arg0) {
		this.aClass602_1 = arg0;
	}

	@OriginalMember(owner = "client!aji", name = "x", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13108(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) -1);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(1775973591); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(1383462388)) {
			local5.method23926(1446913314);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(2003331686);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "l", descriptor = "(IIIIB)V")
	public void method13109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(1) Class147_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class147_Sub2 local9 = (Class147_Sub2) this.aClass5_2.method93((byte) 117); local9 != null; local9 = (Class147_Sub2) this.aClass5_2.method110(-1773164740)) {
			local3++;
			if (local9.anInt1484 * -1345244181 == arg0) {
				local9.method13500(arg0, arg1, arg2, arg3, (short) 353);
				return;
			}
			if (local9.anInt1484 * -1345244181 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class226.method25968(new Class147_Sub2(arg0, arg1, arg2, arg3), local1, (byte) -77);
			if (local3 >= Class698.aClass638_1.anInt5636 * 1628495567) {
				this.aClass5_2.method93((byte) -29).method23926(311712785);
			}
		} else if (local3 < Class698.aClass638_1.anInt5636 * 1628495567) {
			this.aClass5_2.method91(new Class147_Sub2(arg0, arg1, arg2, arg3), 1782920978);
		}
	}

	@OriginalMember(owner = "client!aji", name = "i", descriptor = "(I)Z")
	public boolean method13110(@OriginalArg(0) int arg0) {
		return this.aClass5_2.method95(1755082089);
	}

	@OriginalMember(owner = "client!aji", name = "m", descriptor = "(IIII)V")
	public void method13111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class147_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class147_Sub2 local9 = (Class147_Sub2) this.aClass5_2.method93((byte) 47); local9 != null; local9 = (Class147_Sub2) this.aClass5_2.method110(952950295)) {
			local3++;
			if (local9.anInt1484 * -1345244181 == arg0) {
				local9.method13500(arg0, arg1, arg2, arg3, (short) 353);
				return;
			}
			if (local9.anInt1484 * -1345244181 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class226.method25968(new Class147_Sub2(arg0, arg1, arg2, arg3), local1, (byte) -86);
			if (local3 >= Class698.aClass638_1.anInt5636 * 1628495567) {
				this.aClass5_2.method93((byte) -71).method23926(1127745404);
			}
		} else if (local3 < Class698.aClass638_1.anInt5636 * 1628495567) {
			this.aClass5_2.method91(new Class147_Sub2(arg0, arg1, arg2, arg3), 1782920978);
		}
	}

	@OriginalMember(owner = "client!aji", name = "o", descriptor = "(IIII)V")
	public void method13112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class147_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class147_Sub2 local9 = (Class147_Sub2) this.aClass5_2.method93((byte) 65); local9 != null; local9 = (Class147_Sub2) this.aClass5_2.method110(1288315109)) {
			local3++;
			if (local9.anInt1484 * -1345244181 == arg0) {
				local9.method13500(arg0, arg1, arg2, arg3, (short) 353);
				return;
			}
			if (local9.anInt1484 * -1345244181 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class226.method25968(new Class147_Sub2(arg0, arg1, arg2, arg3), local1, (byte) -125);
			if (local3 >= Class698.aClass638_1.anInt5636 * 1628495567) {
				this.aClass5_2.method93((byte) 10).method23926(1603530747);
			}
		} else if (local3 < Class698.aClass638_1.anInt5636 * 1628495567) {
			this.aClass5_2.method91(new Class147_Sub2(arg0, arg1, arg2, arg3), 1782920978);
		}
	}

	@OriginalMember(owner = "client!aji", name = "s", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13113(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) -79);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(-851350648); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(-1726375422)) {
			local5.method23926(942813290);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(1320537818);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "a", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13114(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) 62);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(-1071261675); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(165745947)) {
			local5.method23926(1893789931);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(1766586042);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "g", descriptor = "(II)Lclient!ajq;")
	public Class147_Sub2 method13115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) -65);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(-1771938145); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(674708038)) {
			local5.method23926(785928817);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(1375074301);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "k", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13116(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) 19);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(-1526912170); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(-287653706)) {
			local5.method23926(443847329);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(1124248233);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "j", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13117(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) -43);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(-565297036); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(814606173)) {
			local5.method23926(387531209);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(900199257);
			return null;
		}
	}

	@OriginalMember(owner = "client!aji", name = "w", descriptor = "(I)Lclient!ajq;")
	public Class147_Sub2 method13118(@OriginalArg(0) int arg0) {
		@Pc(5) Class147_Sub2 local5 = (Class147_Sub2) this.aClass5_2.method93((byte) -49);
		if (local5 == null || local5.anInt1484 * -1345244181 > arg0) {
			return null;
		}
		for (@Pc(22) Class147_Sub2 local22 = (Class147_Sub2) this.aClass5_2.method110(83784188); local22 != null && local22.anInt1484 * -1345244181 <= arg0; local22 = (Class147_Sub2) this.aClass5_2.method110(-368134949)) {
			local5.method23926(866934675);
			local5 = local22;
		}
		if (this.aClass602_1.anInt5390 * 1602309387 + local5.anInt1484 * -1345244181 + local5.anInt1482 * -1891247153 > arg0) {
			return local5;
		} else {
			local5.method23926(258398190);
			return null;
		}
	}
}
