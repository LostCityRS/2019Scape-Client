package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public abstract class Class117 implements Interface4 {

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_11 = new Class240(100);

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_12 = new Class240(100);

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!ao;")
	final Interface11 anInterface11_4;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "(Ljava/net/Socket;III)Lclient!uz;", line = 14)
	static Class160 method8366(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		return new Class160_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "(II)V", line = 162)
	public static void method8367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(22, (long) arg0);
		local4.method21885(2145428061);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!ao;Lclient!py;Lclient!py;Lclient!py;)V", line = 212)
	Class117(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		this.anInterface11_4 = arg0;
		Class626.method32243(arg1, arg3, 2, -1246432472);
		Class629.method32259(arg2, arg3, (byte) -26);
	}

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "(I)Lclient!arr;", line = 220)
	Class93_Sub1_Sub10 method8368(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			@Pc(11) Class93_Sub1_Sub10 local11 = (Class93_Sub1_Sub10) this.aClass240_11.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub10(arg0);
				this.aClass240_11.method25838(local11, (long) arg0);
			}
			return local11.method21777(-1289947964) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(IB)Lclient!arr;", line = 220)
	Class93_Sub1_Sub10 method8369(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			@Pc(11) Class93_Sub1_Sub10 local11 = (Class93_Sub1_Sub10) this.aClass240_11.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub10(arg0);
				this.aClass240_11.method25838(local11, (long) arg0);
			}
			return local11.method21777(-1126248190) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "(I)Lclient!ard;", line = 233)
	Class93_Sub1_Sub5 method8370(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25838(local11, (long) arg0);
			}
			return local11.method21543(1109357338) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "(IB)Lclient!ard;", line = 233)
	Class93_Sub1_Sub5 method8371(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25838(local11, (long) arg0);
			}
			return local11.method21543(1629026729) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "(I)Lclient!ard;", line = 233)
	Class93_Sub1_Sub5 method8372(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25838(local11, (long) arg0);
			}
			return local11.method21543(1953167056) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "(I)Lclient!ard;", line = 233)
	Class93_Sub1_Sub5 method8373(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25829((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25838(local11, (long) arg0);
			}
			return local11.method21543(1812626461) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "(I)V", line = 245)
	void method8374(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25847((byte) -19);
		}
	}

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "()V", line = 245)
	void method8375() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25847((byte) -32);
		}
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V", line = 251)
	void method8376(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25843(arg0, (byte) 7);
		}
	}

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "(II)V", line = 251)
	void method8377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25843(arg0, (byte) 40);
		}
	}

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "()V", line = 257)
	void method8378() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "()V", line = 257)
	void method8379() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V", line = 257)
	void method8380(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "rt", descriptor = "(Lclient!yf;I)V", line = 8120)
	static final void method8381(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3982 * -1490598249;
	}

	@OriginalMember(owner = "client!fu", name = "anv", descriptor = "(Lclient!yf;B)V", line = 12248)
	static final void method8382(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5888 -= -1422374923;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class114.method7635(local14, local25, local36, local54, (byte) 51);
	}

	@OriginalMember(owner = "client!fu", name = "ben", descriptor = "(Lclient!yf;I)V", line = 14886)
	static final void method8383(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class146.aClass344_3.method27529(-1829778453) > 0) {
			@Pc(17) String local17 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
			@Pc(22) String local22 = Class146.aClass344_3.method27545(local17, -1422298918);
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local22;
		}
	}

	@OriginalMember(owner = "client!fu", name = "beo", descriptor = "(Lclient!yf;I)V", line = 14978)
	static final void method8384(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = local23 >>> 8;
		@Pc(33) int local33 = local23 & 0xFF;
		@Pc(39) Class30 local39 = (Class30) Class74.aClass32_1.get(local13, -2074756598);
		@Pc(45) Class77 local45 = (Class77) Class276.aClass32_2.get(local29, -675571426);
		@Pc(50) Class519[] local50 = local45.aClass519ArrayArray2[local33];
		@Pc(55) Object[] local55 = local39.method617(local33, 1113569772);
		if (local55 == null && local45.anObjectArrayArray2 != null) {
			local55 = local45.anObjectArrayArray2[local33];
		}
		if (local55 != null) {
			local25 = local55.length / local50.length;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local25;
	}
}
