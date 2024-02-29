package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public class Class462 implements Interface1 {

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
	final int[] anIntArray450;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!eb;")
	Class240 aClass240_88;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!dh;Lclient!py;Lclient!py;[I)V", line = 25)
	public Class462(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_10 = arg0;
		this.aClass497_119 = arg1;
		this.aClass497_120 = arg2;
		this.anIntArray450 = arg3;
		this.aClass240_88 = new Class240(20);
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(Lclient!oq;I)V", line = 34)
	public void method29235(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		this.aMap23 = new HashMap(this.anIntArray450.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray450.length; local9++) {
			@Pc(19) int local19 = this.anIntArray450[local9];
			@Pc(26) Class5 local26 = Class691.method36548(this.aClass497_120, local19, this, 209627663);
			@Pc(32) byte[] local32 = this.aClass497_119.method30079(local19, (byte) 111);
			@Pc(39) Object local39 = arg0.method28015(local32, local26, true, -790300827);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "(Lclient!oq;)V", line = 34)
	public void method29236(@OriginalArg(0) Interface50 arg0) {
		this.aMap23 = new HashMap(this.anIntArray450.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray450.length; local9++) {
			@Pc(19) int local19 = this.anIntArray450[local9];
			@Pc(26) Class5 local26 = Class691.method36548(this.aClass497_120, local19, this, 343282216);
			@Pc(32) byte[] local32 = this.aClass497_119.method30079(local19, (byte) 55);
			@Pc(39) Object local39 = arg0.method28015(local32, local26, true, 668300629);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "(Lclient!oq;)V", line = 34)
	public void method29237(@OriginalArg(0) Interface50 arg0) {
		this.aMap23 = new HashMap(this.anIntArray450.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray450.length; local9++) {
			@Pc(19) int local19 = this.anIntArray450[local9];
			@Pc(26) Class5 local26 = Class691.method36548(this.aClass497_120, local19, this, 411128337);
			@Pc(32) byte[] local32 = this.aClass497_119.method30079(local19, (byte) 112);
			@Pc(39) Object local39 = arg0.method28015(local32, local26, true, -2037465029);
			this.aMap23.put(local9, new Class34(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "(S)V", line = 45)
	public void method29238(@OriginalArg(0) short arg0) {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "()V", line = 45)
	public void method29239() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "()V", line = 45)
	public void method29240() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "()V", line = 45)
	public void method29241() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "()V", line = 45)
	public void method29242() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 45)
	public void method29243() {
		this.aMap23 = null;
	}

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "()I", line = 49)
	public int method29244() {
		return this.method29251(false, -2141688061);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()I", line = 49)
	public int method29245() {
		return this.method29251(false, -2101593486);
	}

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "(I)I", line = 49)
	public int method29246(@OriginalArg(0) int arg0) {
		return this.method29251(false, -2061195266);
	}

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "(Z)I", line = 53)
	public int method29247(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray450 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray450.length; local20++) {
				@Pc(30) int local30 = this.anIntArray450[local20];
				if (this.aClass497_119.method30071(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30071(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray450.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "(Z)I", line = 53)
	public int method29248(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray450 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray450.length; local20++) {
				@Pc(30) int local30 = this.anIntArray450[local20];
				if (this.aClass497_119.method30071(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30071(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray450.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "(Z)I", line = 53)
	public int method29249(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray450 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray450.length; local20++) {
				@Pc(30) int local30 = this.anIntArray450[local20];
				if (this.aClass497_119.method30071(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30071(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray450.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(Z)I", line = 53)
	public int method29250(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray450 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray450.length; local20++) {
				@Pc(30) int local30 = this.anIntArray450[local20];
				if (this.aClass497_119.method30071(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30071(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray450.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "(ZI)I", line = 53)
	public int method29251(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray450 == null) {
			return 0;
		} else if (arg0 || this.aMap23 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray450.length; local20++) {
				@Pc(30) int local30 = this.anIntArray450[local20];
				if (this.aClass497_119.method30071(local30, -512225963)) {
					local18++;
				}
				if (this.aClass497_120.method30071(local30, -512225963)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray450.length * 2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(B)I", line = 65)
	public int method29252(@OriginalArg(0) byte arg0) {
		return this.anIntArray450 == null ? 0 : this.anIntArray450.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "ag", descriptor = "()I", line = 65)
	public int method29253() {
		return this.anIntArray450 == null ? 0 : this.anIntArray450.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "al", descriptor = "()I", line = 65)
	public int method29254() {
		return this.anIntArray450 == null ? 0 : this.anIntArray450.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "ae", descriptor = "()I", line = 65)
	public int method29255() {
		return this.anIntArray450 == null ? 0 : this.anIntArray450.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "ah", descriptor = "()I", line = 65)
	public int method29256() {
		return this.anIntArray450 == null ? 0 : this.anIntArray450.length * 2;
	}

	@OriginalMember(owner = "client!oi", name = "ac", descriptor = "(Lclient!oq;IZZ)Ljava/lang/Object;", line = 70)
	public Object method29257(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray450 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray450.length; local10++) {
				if (this.anIntArray450[local10] == arg1) {
					return ((Class34) this.aMap23.get(local10)).anObject1;
				}
			}
		}
		@Pc(45) Object local45 = this.aClass240_86.method25829((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local45 != null) {
			return local45;
		}
		@Pc(55) byte[] local55 = this.aClass497_119.method30079(arg1, (byte) 19);
		if (local55 == null) {
			return null;
		}
		@Pc(67) Class5 local67 = this.method29264(arg0, arg1, arg2, false, (byte) -21);
		if (local67 == null) {
			return null;
		} else {
			local45 = arg0.method28015(local55, local67, arg3, -1092890316);
			this.aClass240_86.method25838(local45, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local45;
		}
	}

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "(Lclient!oq;IZZI)Ljava/lang/Object;", line = 70)
	public Object method29258(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray450 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray450.length; local10++) {
				if (this.anIntArray450[local10] == arg1) {
					return ((Class34) this.aMap23.get(local10)).anObject1;
				}
			}
		}
		@Pc(45) Object local45 = this.aClass240_86.method25829((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local45 != null) {
			return local45;
		}
		@Pc(55) byte[] local55 = this.aClass497_119.method30079(arg1, (byte) 58);
		if (local55 == null) {
			return null;
		}
		@Pc(67) Class5 local67 = this.method29264(arg0, arg1, arg2, false, (byte) -85);
		if (local67 == null) {
			return null;
		} else {
			local45 = arg0.method28015(local55, local67, arg3, 569261468);
			this.aClass240_86.method25838(local45, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local45;
		}
	}

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "(Lclient!oq;II)Lclient!aac;", line = 88)
	public Class5 method29259(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method29264(arg0, arg1, true, true, (byte) 4);
	}

	@OriginalMember(owner = "client!oi", name = "aw", descriptor = "(Lclient!oq;I)Lclient!aac;", line = 88)
	public Class5 method29260(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29264(arg0, arg1, true, true, (byte) -97);
	}

	@OriginalMember(owner = "client!oi", name = "ai", descriptor = "(Lclient!oq;I)Lclient!aac;", line = 88)
	public Class5 method29261(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29264(arg0, arg1, true, true, (byte) 18);
	}

	@OriginalMember(owner = "client!oi", name = "as", descriptor = "(Lclient!oq;I)Lclient!aac;", line = 88)
	public Class5 method29262(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1) {
		return this.method29264(arg0, arg1, true, true, (byte) -54);
	}

	@OriginalMember(owner = "client!oi", name = "at", descriptor = "(Lclient!oq;IZZ)Lclient!aac;", line = 92)
	Class5 method29263(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray450 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray450.length; local10++) {
				if (arg1 == this.anIntArray450[local10]) {
					return (Class5) ((Class34) this.aMap23.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass497_119.method30071(arg1, -512225963);
		}
		@Pc(47) Class5 local47 = (Class5) this.aClass240_87.method25829((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class691.method36548(this.aClass497_120, arg1, this, -416109031);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass240_87.method25838(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "(Lclient!oq;IZZB)Lclient!aac;", line = 92)
	Class5 method29264(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray450 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray450.length; local10++) {
				if (arg1 == this.anIntArray450[local10]) {
					return (Class5) ((Class34) this.aMap23.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass497_119.method30071(arg1, -512225963);
		}
		@Pc(47) Class5 local47 = (Class5) this.aClass240_87.method25829((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class691.method36548(this.aClass497_120, arg1, this, -104063542);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass240_87.method25838(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "(B)V", line = 110)
	public void method29265(@OriginalArg(0) byte arg0) {
		this.aClass240_87.method25847((byte) -20);
		this.aClass240_86.method25847((byte) -125);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25847((byte) -21);
		}
	}

	@OriginalMember(owner = "client!oi", name = "au", descriptor = "()V", line = 110)
	public void method29266() {
		this.aClass240_87.method25847((byte) -41);
		this.aClass240_86.method25847((byte) -9);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25847((byte) -104);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ad", descriptor = "()V", line = 110)
	public void method29267() {
		this.aClass240_87.method25847((byte) -83);
		this.aClass240_86.method25847((byte) -92);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25847((byte) -66);
		}
	}

	@OriginalMember(owner = "client!oi", name = "am", descriptor = "()V", line = 110)
	public void method29268() {
		this.aClass240_87.method25847((byte) -112);
		this.aClass240_86.method25847((byte) -77);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25847((byte) -6);
		}
	}

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "(II)V", line = 116)
	public void method29269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass240_87.method25843(arg0, (byte) -40);
		this.aClass240_86.method25843(arg0, (byte) -91);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25843(arg0, (byte) -113);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ar", descriptor = "(I)V", line = 116)
	public void method29270(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25843(arg0, (byte) -75);
		this.aClass240_86.method25843(arg0, (byte) 64);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25843(arg0, (byte) -3);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ap", descriptor = "(I)V", line = 116)
	public void method29271(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25843(arg0, (byte) -113);
		this.aClass240_86.method25843(arg0, (byte) 1);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25843(arg0, (byte) 21);
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 122)
	public void method29272(@OriginalArg(0) int arg0) {
		this.aClass240_87.method25860(1161602830);
		this.aClass240_86.method25860(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "aq", descriptor = "()V", line = 122)
	public void method29273() {
		this.aClass240_87.method25860(1161602830);
		this.aClass240_86.method25860(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ax", descriptor = "()V", line = 122)
	public void method29274() {
		this.aClass240_87.method25860(1161602830);
		this.aClass240_86.method25860(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "av", descriptor = "()V", line = 122)
	public void method29275() {
		this.aClass240_87.method25860(1161602830);
		this.aClass240_86.method25860(1161602830);
		if (this.aClass240_88 != null) {
			this.aClass240_88.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "(Lclient!dh;I)[Lclient!cm;", line = 128)
	@Override
	public Class100[] method29228(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25847((byte) -59);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25829((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24657(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20589(local43[local55], true);
				}
				this.aClass240_88.method25838(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(Lclient!dh;II)[Lclient!cm;", line = 128)
	@Override
	public Class100[] method29229(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25847((byte) -22);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25829((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24657(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20589(local43[local55], true);
				}
				this.aClass240_88.method25838(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "ay", descriptor = "(Lclient!dh;I)[Lclient!cm;", line = 128)
	@Override
	public Class100[] method29231(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25847((byte) -42);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25829((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24657(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20589(local43[local55], true);
				}
				this.aClass240_88.method25838(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "az", descriptor = "(Lclient!dh;I)[Lclient!cm;", line = 128)
	@Override
	public Class100[] method29227(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25847((byte) -7);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25829((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24657(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20589(local43[local55], true);
				}
				this.aClass240_88.method25838(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "aa", descriptor = "(Lclient!dh;I)[Lclient!cm;", line = 128)
	@Override
	public Class100[] method29234(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_88 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass104_10;
		} else {
			if (this.aClass104_10 != arg0) {
				this.aClass240_88.method25847((byte) -104);
			}
			this.aClass104_10 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(34) Class100[] local34 = (Class100[]) this.aClass240_88.method25829((long) arg1);
		if (local34 == null) {
			@Pc(43) Class105[] local43 = Class203.method24657(this.aClass497_119, arg1, 0);
			if (local43 != null && local43.length > 0) {
				local34 = new Class100[local43.length];
				for (@Pc(55) int local55 = 0; local55 < local43.length; local55++) {
					local34[local55] = arg0.method20589(local43[local55], true);
				}
				this.aClass240_88.method25838(local34, (long) arg1);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "(II)I", line = 156)
	@Override
	public int method29232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class100[] local6 = this.method29229(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18160();
	}

	@OriginalMember(owner = "client!oi", name = "ao", descriptor = "(I)I", line = 156)
	@Override
	public int method29233(@OriginalArg(0) int arg0) {
		@Pc(6) Class100[] local6 = this.method29229(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18160();
	}

	@OriginalMember(owner = "client!oi", name = "aj", descriptor = "(I)I", line = 156)
	@Override
	public int method29230(@OriginalArg(0) int arg0) {
		@Pc(6) Class100[] local6 = this.method29229(this.aClass104_10, arg0, -1941826264);
		return local6 == null ? 0 : local6[0].method18160();
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(IIILclient!vd;B)V", line = 240)
	public static void method29276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) byte arg4) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method428((byte) 111); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method442(214003930)) {
			if (local4.anInt1506 * 1124978351 == arg0 && local4.anInt1513 * 792297037 == arg1 << 9 && arg2 << 9 == local4.anInt1507 * -1881471885 && arg3.anInt5587 * 365009633 == local4.aClass610_1.anInt5587 * 365009633) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -97);
					Class274.aClass258_1.method26088(local4.aClass539_3, 1930326226);
					local4.aClass539_3 = null;
				}
				local4.method23969(-970646504);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "(ILclient!aan;I)V", line = 257)
	static final void method29277(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		if (-1 != arg0 && arg1.method214((long) arg0) == null) {
			arg1.method220(new Class93(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "ayb", descriptor = "(Lclient!yf;I)V", line = 14089)
	static final void method29278(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub40_1.method16364(1912416434);
	}
}
