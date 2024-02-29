package jagex3;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class462 implements Interface1 {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_86 = new Class240(20);

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!eb;")
	final Class240 aClass240_87 = new Class240(20);

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!dh;")
	Class104 aClass104_10 = null;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Ljava/util/Map;")
	Map aMap23 = null;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_119;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_120;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
	final int[] anIntArray452;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!eb;")
	Class240 aClass240_88;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "(ILclient!aan;I)V")
	static void method29457(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		if (-1 != arg0 && arg1.method215((long) arg0) == null) {
			arg1.method221(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(IIILclient!vd;B)V")
	public static void method29458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) byte arg4) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method445((byte) 111); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method415(214003930)) {
			if (local4.anInt1506 * 1124978351 == arg0 && local4.anInt1513 * 792297037 == arg1 << 9 && arg2 << 9 == local4.anInt1507 * -1881471885 && arg3.anInt5748 * 365009633 == local4.aClass610_1.anInt5748 * 365009633) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30972(100, (byte) -97);
					Class274.aClass258_11.method26161(local4.aClass539_3, 1930326226);
					local4.aClass539_3 = null;
				}
				local4.method23981(-970646504);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "ayb", descriptor = "(Lclient!yf;I)V")
	static void method29459(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub40_1.method16374(1912416434);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!dh;Lclient!py;Lclient!py;[I)V")
	public Class462(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_10 = arg0;
		this.aClass497_119 = arg1;
		this.aClass497_120 = arg2;
		this.anIntArray452 = arg3;
		this.aClass240_88 = new Class240(20);
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "()I")
	public int method29416() {
		return this.method29448(false, -2141688061);
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(Lclient!oq;I)V")
	public void method29417(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		this.aMap23 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class5 local26 = Class691.method36775(this.aClass497_120, local19, this, 209627663);
			@Pc(32) byte[] local32 = this.aClass497_119.method30240(local19, (byte) 111);
			@Pc(39) Object local39 = arg0.method28196(local32, local26, true, -790300827);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "(S)V")
	public void method29418(@OriginalArg(0) short arg0) {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "at", descriptor = "(Lclient!oq;IZZ)Lclient!aac;")
	Class5 method29419(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (arg1 == this.anIntArray452[local10]) {
					return (Class5) ((Class34) this.aMap23.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass497_119.method30235(arg1, -512225963);
		}
		@Pc(47) Class5 local47 = (Class5) this.aClass240_87.method25932((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class691.method36775(this.aClass497_120, arg1, this, -416109031);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass240_87.method25923(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "(II)I")
	@Override
	public int method29413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class100[] local6 = this.method29410(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18172();
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(B)I")
	public int method29420(@OriginalArg(0) byte arg0) {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "()V")
	public void method29421() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "(Lclient!oq;II)Lclient!aac;")
	public Class5 method29422(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method29423(arg0, arg1, true, true, (byte) 4);
	}

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "(Lclient!oq;IZZB)Lclient!aac;")
	Class5 method29423(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (arg1 == this.anIntArray452[local10]) {
					return (Class5) ((Class34) this.aMap23.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass497_119.method30235(arg1, -512225963);
		}
		@Pc(47) Class5 local47 = (Class5) this.aClass240_87.method25932((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class691.method36775(this.aClass497_120, arg1, this, -104063542);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass240_87.method25923(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "(B)V")
	public void method29424(@OriginalArg(0) byte arg0) {
		this.aClass240_87.method25926((byte) -20);
		this.aClass240_86.method25926((byte) -125);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25926((byte) -21);
		}
	}

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "(II)V")
	public void method29425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass240_87.method25925(arg0, (byte) -40);
		this.aClass240_86.method25925(arg0, (byte) -91);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25925(arg0, (byte) -113);
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	public void method29426(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25930(1161602830);
		this.aClass240_86.method25930(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "au", descriptor = "()V")
	public void method29427() {
		this.aClass240_87.method25926((byte) -41);
		this.aClass240_86.method25926((byte) -9);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25926((byte) -104);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "(Lclient!dh;I)[Lclient!cm;")
	@Override
	public Class100[] method29409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25926((byte) -59);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25932((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24663(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20511(local43[local55], true);
				}
				this.aClass240_88.method25923(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "(Lclient!oq;)V")
	public void method29428(@OriginalArg(0) Interface50 arg0) {
		this.aMap23 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class5 local26 = Class691.method36775(this.aClass497_120, local19, this, 343282216);
			@Pc(32) byte[] local32 = this.aClass497_119.method30240(local19, (byte) 55);
			@Pc(39) Object local39 = arg0.method28196(local32, local26, true, 668300629);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "(Lclient!oq;)V")
	public void method29429(@OriginalArg(0) Interface50 arg0) {
		this.aMap23 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class5 local26 = Class691.method36775(this.aClass497_120, local19, this, 411128337);
			@Pc(32) byte[] local32 = this.aClass497_119.method30240(local19, (byte) 112);
			@Pc(39) Object local39 = arg0.method28196(local32, local26, true, -2037465029);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "(Z)I")
	public int method29430(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass497_119.method30235(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30235(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "()V")
	public void method29431() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "()V")
	public void method29432() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "()V")
	public void method29433() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()V")
	public void method29434() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "aw", descriptor = "(Lclient!oq;I)Lclient!aac;")
	public Class5 method29435(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29423(arg0, arg1, true, true, (byte) -97);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()I")
	public int method29436() {
		return this.method29448(false, -2101593486);
	}

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "(I)I")
	public int method29437(@OriginalArg(0) int arg0) {
		return this.method29448(false, -2061195266);
	}

	@OriginalMember(owner = "client!oi", name = "ai", descriptor = "(Lclient!oq;I)Lclient!aac;")
	public Class5 method29438(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29423(arg0, arg1, true, true, (byte) 18);
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "(Z)I")
	public int method29439(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass497_119.method30235(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30235(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "(Z)I")
	public int method29440(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass497_119.method30235(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30235(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(Z)I")
	public int method29441(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass497_119.method30235(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30235(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "ag", descriptor = "()I")
	public int method29442() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(Lclient!dh;II)[Lclient!cm;")
	@Override
	public Class100[] method29410(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25926((byte) -22);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25932((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24663(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20511(local43[local55], true);
				}
				this.aClass240_88.method25923(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "al", descriptor = "()I")
	public int method29443() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "ac", descriptor = "(Lclient!oq;IZZ)Ljava/lang/Object;")
	public Object method29444(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (this.anIntArray452[local10] == arg1) {
					return ((Class34) this.aMap23.get(local10)).anObject1;
				}
			}
		}
		@Pc(45) Object local45 = this.aClass240_86.method25932((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local45 != null) {
			return local45;
		}
		@Pc(55) byte[] local55 = this.aClass497_119.method30240(arg1, (byte) 19);
		if (local55 == null) {
			return null;
		}
		@Pc(67) Class5 local67 = this.method29423(arg0, arg1, arg2, false, (byte) -21);
		if (local67 == null) {
			return null;
		} else {
			local45 = arg0.method28196(local55, local67, arg3, -1092890316);
			this.aClass240_86.method25923(local45, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local45;
		}
	}

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "(Lclient!oq;IZZI)Ljava/lang/Object;")
	public Object method29445(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (this.anIntArray452[local10] == arg1) {
					return ((Class34) this.aMap23.get(local10)).anObject1;
				}
			}
		}
		@Pc(45) Object local45 = this.aClass240_86.method25932((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local45 != null) {
			return local45;
		}
		@Pc(55) byte[] local55 = this.aClass497_119.method30240(arg1, (byte) 58);
		if (local55 == null) {
			return null;
		}
		@Pc(67) Class5 local67 = this.method29423(arg0, arg1, arg2, false, (byte) -85);
		if (local67 == null) {
			return null;
		} else {
			local45 = arg0.method28196(local55, local67, arg3, 569261468);
			this.aClass240_86.method25923(local45, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local45;
		}
	}

	@OriginalMember(owner = "client!oi", name = "ad", descriptor = "()V")
	public void method29446() {
		this.aClass240_87.method25926((byte) -83);
		this.aClass240_86.method25926((byte) -92);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25926((byte) -66);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ae", descriptor = "()I")
	public int method29447() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "(ZI)I")
	public int method29448(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass497_119.method30235(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30235(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "as", descriptor = "(Lclient!oq;I)Lclient!aac;")
	public Class5 method29449(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29423(arg0, arg1, true, true, (byte) -54);
	}

	@OriginalMember(owner = "client!oi", name = "am", descriptor = "()V")
	public void method29450() {
		this.aClass240_87.method25926((byte) -112);
		this.aClass240_86.method25926((byte) -77);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25926((byte) -6);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ao", descriptor = "(I)I")
	@Override
	public int method29414(@OriginalArg(0) int arg0) {
		@Pc(6) Class100[] local6 = this.method29410(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18172();
	}

	@OriginalMember(owner = "client!oi", name = "ar", descriptor = "(I)V")
	public void method29451(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25925(arg0, (byte) -75);
		this.aClass240_86.method25925(arg0, (byte) 64);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25925(arg0, (byte) -3);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ap", descriptor = "(I)V")
	public void method29452(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25925(arg0, (byte) -113);
		this.aClass240_86.method25925(arg0, (byte) 1);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25925(arg0, (byte) 21);
		}
	}

	@OriginalMember(owner = "client!oi", name = "aq", descriptor = "()V")
	public void method29453() {
		this.aClass240_87.method25930(1161602830);
		this.aClass240_86.method25930(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ax", descriptor = "()V")
	public void method29454() {
		this.aClass240_87.method25930(1161602830);
		this.aClass240_86.method25930(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "av", descriptor = "()V")
	public void method29455() {
		this.aClass240_87.method25930(1161602830);
		this.aClass240_86.method25930(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ah", descriptor = "()I")
	public int method29456() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "aj", descriptor = "(I)I")
	@Override
	public int method29411(@OriginalArg(0) int arg0) {
		@Pc(6) Class100[] local6 = this.method29410(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18172();
	}

	@OriginalMember(owner = "client!oi", name = "ay", descriptor = "(Lclient!dh;I)[Lclient!cm;")
	@Override
	public Class100[] method29412(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25926((byte) -42);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25932((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24663(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20511(local43[local55], true);
				}
				this.aClass240_88.method25923(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "az", descriptor = "(Lclient!dh;I)[Lclient!cm;")
	@Override
	public Class100[] method29408(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25926((byte) -7);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25932((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24663(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20511(local43[local55], true);
				}
				this.aClass240_88.method25923(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "aa", descriptor = "(Lclient!dh;I)[Lclient!cm;")
	@Override
	public Class100[] method29415(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25926((byte) -104);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25932((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24663(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20511(local43[local55], true);
				}
				this.aClass240_88.method25923(local34, (long) arg1);
			}
		}
		return local34;
	}
}
