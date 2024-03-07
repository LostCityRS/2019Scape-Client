package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abr")
public abstract class Class44 implements Interface4 {

	@OriginalMember(owner = "client!abr", name = "u", descriptor = "I")
	int anInt2426;

	@OriginalMember(owner = "client!abr", name = "k", descriptor = "Lclient!eb;")
	final Class240 aClass240_59 = new Class240(50);

	@OriginalMember(owner = "client!abr", name = "f", descriptor = "Lclient!wz;")
	final Class652 aClass652_2 = new Class652(250);

	@OriginalMember(owner = "client!abr", name = "w", descriptor = "Lclient!abo;")
	final Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!abr", name = "e", descriptor = "Lclient!zt;")
	final Class717 aClass717_9;

	@OriginalMember(owner = "client!abr", name = "n", descriptor = "Z")
	boolean aBoolean375;

	@OriginalMember(owner = "client!abr", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_80;

	@OriginalMember(owner = "client!abr", name = "l", descriptor = "Lclient!ao;")
	final Interface11 anInterface11_9;

	@OriginalMember(owner = "client!abr", name = "z", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray20;

	@OriginalMember(owner = "client!abr", name = "p", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray19;

	@OriginalMember(owner = "client!abr", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;ZLclient!py;Lclient!ao;)V", line = 846)
	Class44(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Interface11 arg4) {
		this.aClass717_9 = arg1;
		this.aBoolean375 = arg2;
		this.aClass497_80 = arg3;
		this.anInterface11_9 = arg4;
		if (arg0 == Class702.aClass702_6) {
			this.aStringArray20 = new String[] { null, null, Class74.aClass74_14.method1259(this.aClass717_9, (byte) -4), null, null, Class74.aClass74_129.method1259(this.aClass717_9, (byte) 31) };
		} else {
			this.aStringArray20 = new String[] { null, null, Class74.aClass74_14.method1259(this.aClass717_9, (byte) 45), null, null, null };
		}
		this.aStringArray19 = new String[] { null, null, null, null, Class74.aClass74_15.method1259(this.aClass717_9, (byte) 42) };
	}

	@OriginalMember(owner = "client!abr", name = "e", descriptor = "(Lclient!dh;IIIIILclient!xg;I)Lclient!cm;", line = 857)
	Class100 method17411(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class658 arg6, @OriginalArg(7) int arg7) {
		this.aClass41_2.anInt130 = arg0.anInt2888 * 987860339;
		this.aClass41_2.anInt125 = arg1 * -461580137;
		this.aClass41_2.anInt127 = arg2 * 1331579519;
		this.aClass41_2.anInt128 = arg3 * -1858680487;
		this.aClass41_2.anInt129 = arg4 * -1228643511;
		this.aClass41_2.anInt126 = arg5 * -1561162571;
		this.aClass41_2.aBoolean17 = arg6 != null;
		return (Class100) this.aClass652_2.method32675(this.aClass41_2);
	}

	@OriginalMember(owner = "client!abr", name = "z", descriptor = "(Lclient!dh;IIIIILclient!xg;)Lclient!cm;", line = 857)
	Class100 method17412(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class658 arg6) {
		this.aClass41_2.anInt130 = arg0.anInt2888 * 987860339;
		this.aClass41_2.anInt125 = arg1 * -461580137;
		this.aClass41_2.anInt127 = arg2 * 1331579519;
		this.aClass41_2.anInt128 = arg3 * -1858680487;
		this.aClass41_2.anInt129 = arg4 * -1228643511;
		this.aClass41_2.anInt126 = arg5 * -1561162571;
		this.aClass41_2.aBoolean17 = arg6 != null;
		return (Class100) this.aClass652_2.method32675(this.aClass41_2);
	}

	@OriginalMember(owner = "client!abr", name = "n", descriptor = "(Lclient!dh;Lclient!dh;IIIIZZILclient!eu;Lclient!xg;Lclient!ws;Lclient!ao;I)Lclient!cm;", line = 868)
	Class100 method17413(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class106 arg9, @OriginalArg(10) Class658 arg10, @OriginalArg(11) Class645 arg11, @OriginalArg(12) Interface11 arg12, @OriginalArg(13) int arg13) {
		if (!arg7) {
			@Pc(12) Class100 local12 = this.method17411(arg1, arg2, arg3, arg4, arg5, arg8, arg10, -1870789004);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(23) Class47 local23 = (Class47) arg12.get(arg2, -1066152931);
		if (arg3 > 1 && local23.anIntArray8 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (arg3 >= local23.anIntArray10[local33] && local23.anIntArray10[local33] != 0) {
					local31 = local23.anIntArray8[local33];
				}
			}
			if (local31 != -1) {
				local23 = (Class47) arg12.get(local31, -883362020);
			}
		}
		@Pc(77) int[] local77 = local23.method928(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, (byte) 14);
		if (local77 == null) {
			return null;
		}
		@Pc(93) Class100 local93;
		if (arg7) {
			local93 = arg0.method20487(local77, 0, 36, 36, 32, 438797212);
		} else {
			local93 = arg1.method20487(local77, 0, 36, 36, 32, 438797212);
		}
		if (!arg7) {
			@Pc(109) Class41 local109 = new Class41();
			local109.anInt130 = arg1.anInt2888 * 987860339;
			local109.anInt125 = arg2 * -461580137;
			local109.anInt127 = arg3 * 1331579519;
			local109.anInt128 = arg4 * -1858680487;
			local109.anInt129 = arg5 * -1228643511;
			local109.anInt126 = arg8 * -1561162571;
			local109.aBoolean17 = arg10 != null;
			this.aClass652_2.method32683(local93, local109);
		}
		return local93;
	}

	@OriginalMember(owner = "client!abr", name = "p", descriptor = "(Lclient!dh;Lclient!dh;IIIIZZILclient!eu;Lclient!xg;Lclient!ws;Lclient!ao;)Lclient!cm;", line = 868)
	Class100 method17414(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class106 arg9, @OriginalArg(10) Class658 arg10, @OriginalArg(11) Class645 arg11, @OriginalArg(12) Interface11 arg12) {
		if (!arg7) {
			@Pc(12) Class100 local12 = this.method17411(arg1, arg2, arg3, arg4, arg5, arg8, arg10, -1844638167);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(23) Class47 local23 = (Class47) arg12.get(arg2, 149837038);
		if (arg3 > 1 && local23.anIntArray8 != null) {
			@Pc(31) int local31 = -1;
			for (@Pc(33) int local33 = 0; local33 < 10; local33++) {
				if (arg3 >= local23.anIntArray10[local33] && local23.anIntArray10[local33] != 0) {
					local31 = local23.anIntArray8[local33];
				}
			}
			if (local31 != -1) {
				local23 = (Class47) arg12.get(local31, -249849204);
			}
		}
		@Pc(77) int[] local77 = local23.method928(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, (byte) -57);
		if (local77 == null) {
			return null;
		}
		@Pc(93) Class100 local93;
		if (arg7) {
			local93 = arg0.method20487(local77, 0, 36, 36, 32, 438797212);
		} else {
			local93 = arg1.method20487(local77, 0, 36, 36, 32, 438797212);
		}
		if (!arg7) {
			@Pc(109) Class41 local109 = new Class41();
			local109.anInt130 = arg1.anInt2888 * 987860339;
			local109.anInt125 = arg2 * -461580137;
			local109.anInt127 = arg3 * 1331579519;
			local109.anInt128 = arg4 * -1858680487;
			local109.anInt129 = arg5 * -1228643511;
			local109.anInt126 = arg8 * -1561162571;
			local109.aBoolean17 = arg10 != null;
			this.aClass652_2.method32683(local93, local109);
		}
		return local93;
	}

	@OriginalMember(owner = "client!abr", name = "m", descriptor = "(ZB)V", line = 900)
	void method17415(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (arg0 != this.aBoolean375) {
			this.aBoolean375 = arg0;
			this.method17419(-959553902);
		}
	}

	@OriginalMember(owner = "client!abr", name = "d", descriptor = "(Z)V", line = 900)
	void method17416(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean375) {
			this.aBoolean375 = arg0;
			this.method17419(-595082258);
		}
	}

	@OriginalMember(owner = "client!abr", name = "k", descriptor = "(II)V", line = 906)
	void method17417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2426 = arg0 * -307559039;
		@Pc(8) Class240 local8 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25847((byte) -55);
		}
	}

	@OriginalMember(owner = "client!abr", name = "c", descriptor = "(I)V", line = 906)
	void method17418(@OriginalArg(0) int arg0) {
		this.anInt2426 = arg0 * -307559039;
		@Pc(8) Class240 local8 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25847((byte) -51);
		}
	}

	@OriginalMember(owner = "client!abr", name = "f", descriptor = "(I)V", line = 913)
	void method17419(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25847((byte) -5);
		}
		@Pc(20) Class652 local20 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32692();
		}
	}

	@OriginalMember(owner = "client!abr", name = "r", descriptor = "()V", line = 913)
	void method17420() {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25847((byte) -86);
		}
		@Pc(20) Class652 local20 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32692();
		}
	}

	@OriginalMember(owner = "client!abr", name = "b", descriptor = "()V", line = 922)
	void method17421() {
		@Pc(3) Class652 local3 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32692();
		}
	}

	@OriginalMember(owner = "client!abr", name = "w", descriptor = "(I)V", line = 922)
	void method17422(@OriginalArg(0) int arg0) {
		@Pc(3) Class652 local3 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32692();
		}
	}

	@OriginalMember(owner = "client!abr", name = "a", descriptor = "(I)V", line = 928)
	void method17423(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25843(arg0, (byte) -81);
		}
		@Pc(21) Class652 local21 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32691(arg0);
		}
	}

	@OriginalMember(owner = "client!abr", name = "l", descriptor = "(IB)V", line = 928)
	void method17424(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25843(arg0, (byte) -29);
		}
		@Pc(21) Class652 local21 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32691(arg0);
		}
	}

	@OriginalMember(owner = "client!abr", name = "h", descriptor = "(I)V", line = 928)
	void method17425(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25843(arg0, (byte) 5);
		}
		@Pc(21) Class652 local21 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32691(arg0);
		}
	}

	@OriginalMember(owner = "client!abr", name = "u", descriptor = "(I)V", line = 937)
	void method17426(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25860(1161602830);
		}
		@Pc(20) Class652 local20 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32697();
		}
	}

	@OriginalMember(owner = "client!abr", name = "i", descriptor = "()V", line = 937)
	void method17427() {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25860(1161602830);
		}
		@Pc(20) Class652 local20 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32697();
		}
	}

	@OriginalMember(owner = "client!abr", name = "g", descriptor = "()V", line = 937)
	void method17428() {
		@Pc(3) Class240 local3 = this.aClass240_59;
		synchronized (this.aClass240_59) {
			this.aClass240_59.method25860(1161602830);
		}
		@Pc(20) Class652 local20 = this.aClass652_2;
		synchronized (this.aClass652_2) {
			this.aClass652_2.method32697();
		}
	}

	@OriginalMember(owner = "client!abr", name = "ix", descriptor = "(Lclient!yf;I)V", line = 6528)
	static final void method17429(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class430.method28762(local11, local14, arg0, 862007149);
	}

	@OriginalMember(owner = "client!abr", name = "jk", descriptor = "(Lclient!yf;I)V", line = 6731)
	static final void method17430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1885375190);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class124_Sub1.method9191(local16, local22, arg0, -605546091);
	}

	@OriginalMember(owner = "client!abr", name = "ave", descriptor = "(Lclient!yf;I)V", line = 13481)
	static final void method17431(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
