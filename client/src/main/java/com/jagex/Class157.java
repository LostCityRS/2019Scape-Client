package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public abstract class Class157 {

	@OriginalMember(owner = "client!vh", name = "fr", descriptor = "Lclient!py;")
	public static Class497 aClass497_49;

	@OriginalMember(owner = "client!vh", name = "gj", descriptor = "Lclient!oi;")
	public static Class462 aClass462_2;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	int anInt1666;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_27 = new Class240(500);

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_29 = new Class240(30);

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!eb;")
	final Class240 aClass240_28 = new Class240(50);

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[Lclient!dq;")
	Class231[] aClass231Array2 = new Class231[4];

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!abg;")
	Class34 aClass34_2 = new Class34(null, null);

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
	boolean aBoolean345;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray18;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(II)I")
	static int method14263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub14 local5 = (Class93_Sub14) Class663.aClass16_38.method215((long) arg0);
		if (local5 == null) {
			@Pc(13) Class431 local13 = Class110_Sub15_Sub2.anInterface47_1.method29056(arg0, -657045947);
			if (local13 == null || local13.anInt4953 * -1789015339 != 2) {
				return -1;
			}
			local5 = new Class93_Sub14(Class663.anInt5996 * -754661267);
			Class663.aClass16_38.method221(local5, (long) arg0);
			Class663.aClass431Array1[(Class663.anInt5996 += 399933797) * -754661267 - 1] = local13;
		}
		return local5.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!vh", name = "jf", descriptor = "(Lclient!yf;B)V")
	static void method14264(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!vh", name = "ng", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method14265(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray6 = Class499.method30329(local13, arg2, 1887385644);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!vh", name = "akl", descriptor = "(Lclient!yf;B)V")
	static void method14266(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class93_Sub1_Sub20 local2 = Class93_Sub12.method13454((byte) 1);
		if (local2 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(20) boolean local20 = local2.method23192(Class93_Sub14.anInt1527 * -1951188017 + Class159.anInt1915, Class159_Sub1.anInt1952 * -1606693775 + Class159.anInt1921, Class687.anIntArray527, 1965402495);
		if (local20) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[1];
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[2];
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "it", descriptor = "(IIIIIIII)V")
	static void method14267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (client.anInt3463 * 1819062465 != 3) {
			return;
		}
		@Pc(9) int local9 = Class174.anInt3293 * -1081967415;
		@Pc(11) int[] local11 = Class174.anIntArray278;
		@Pc(13) int local13;
		for (local13 = 0; local13 < local9; local13++) {
			@Pc(22) Class132_Sub1_Sub1_Sub1_Sub2 local22 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local11[local13]];
			if (local22 != null) {
				local22.method19987(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1749488960);
			}
		}
		for (local13 = 0; local13 < client.anInt3540 * 568731113; local13++) {
			@Pc(47) int local47 = client.anIntArray323[local13];
			@Pc(53) Class93_Sub15 local53 = (Class93_Sub15) client.aClass16_18.method215((long) local47);
			if (local53 != null) {
				((Class132_Sub1_Sub1_Sub1) local53.anObject5).method19987(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 884517015);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "ev", descriptor = "(IB)V")
	static void method14268(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class159_Sub1.anInt1952 = arg0 * 1415476369;
		Class159_Sub1.anInt1951 = -919990023;
		Class159_Sub1.anInt1951 = -919990023;
		Class358.method27961(-2054254286);
	}

	@OriginalMember(owner = "client!vh", name = "jn", descriptor = "(Lclient!yf;B)V")
	static void method14269(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!vh", name = "ov", descriptor = "(Lclient!yf;I)V")
	static void method14270(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1871787898);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class144.method11180(local16, local22, arg0, -1636166998);
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ZLclient!zt;Lclient!zd;)V")
	Class157(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class702 arg2) {
		this.aBoolean345 = arg0;
		if (arg2 == Class702.aClass702_6) {
			this.aStringArray18 = new String[] { null, null, null, null, null, Class74.aClass74_129.method1259(arg1, (byte) 16) };
		} else {
			this.aStringArray18 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "(Z)V")
	final void method14238(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean345) {
			this.aBoolean345 = arg0;
			this.method14241(-2018397473);
		}
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(ZI)V")
	final void method14239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.aBoolean345) {
			this.aBoolean345 = arg0;
			this.method14241(-2089743655);
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	final void method14240(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25930(1161602830);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25930(1161602830);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "(I)V")
	final void method14241(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -86);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) -93);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -56);
		}
		this.aClass231Array2 = new Class231[4];
		this.aClass34_2 = new Class34(null, null);
	}

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "(IB)V")
	final void method14242(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25925(arg0, (byte) 21);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25925(arg0, (byte) -8);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25925(arg0, (byte) 47);
		}
	}

	@OriginalMember(owner = "client!vh", name = "ac", descriptor = "()V")
	final void method14243() {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25930(1161602830);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25930(1161602830);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "(I)[B")
	abstract byte[] method14244(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "(IS)Z")
	abstract boolean method14245(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "(I)[B")
	abstract byte[] method14246(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "ae", descriptor = "(I)V")
	final void method14247(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25925(arg0, (byte) 59);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25925(arg0, (byte) 17);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25925(arg0, (byte) 22);
		}
	}

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "(I)Z")
	abstract boolean method14248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Z")
	abstract boolean method14249(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "(II)[B")
	abstract byte[] method14250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "(Z)V")
	final void method14251(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean345) {
			this.aBoolean345 = arg0;
			this.method14241(-2113632511);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
	final void method14252(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean345) {
			this.aBoolean345 = arg0;
			this.method14241(-2107407948);
		}
	}

	@OriginalMember(owner = "client!vh", name = "al", descriptor = "()V")
	final void method14253() {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25930(1161602830);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25930(1161602830);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	final void method14254(@OriginalArg(0) int arg0) {
		this.anInt1666 = arg0 * 1924988561;
		@Pc(8) Class240 local8 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -37);
		}
		local8 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) -25);
		}
		local8 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -98);
		}
	}

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V")
	final void method14255(@OriginalArg(0) int arg0) {
		this.anInt1666 = arg0 * 1924988561;
		@Pc(8) Class240 local8 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -33);
		}
		local8 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) -45);
		}
		local8 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -65);
		}
	}

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)V")
	final void method14256(@OriginalArg(0) int arg0) {
		this.anInt1666 = arg0 * 1924988561;
		@Pc(8) Class240 local8 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -56);
		}
		local8 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) -81);
		}
		local8 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -108);
		}
	}

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "(I)V")
	final void method14257(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25925(arg0, (byte) -15);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25925(arg0, (byte) -75);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25925(arg0, (byte) 19);
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z")
	abstract boolean method14258(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "ag", descriptor = "(I)V")
	final void method14259(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25925(arg0, (byte) -63);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25925(arg0, (byte) 78);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25925(arg0, (byte) 31);
		}
	}

	@OriginalMember(owner = "client!vh", name = "ah", descriptor = "(I)V")
	final void method14260(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25925(arg0, (byte) -51);
		}
		local3 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25925(arg0, (byte) 79);
		}
		local3 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25925(arg0, (byte) -19);
		}
	}

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "(IB)V")
	final void method14261(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt1666 = arg0 * 1924988561;
		@Pc(8) Class240 local8 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -85);
		}
		local8 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) 0);
		}
		local8 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -64);
		}
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	final void method14262(@OriginalArg(0) int arg0) {
		this.anInt1666 = arg0 * 1924988561;
		@Pc(8) Class240 local8 = this.aClass240_27;
		synchronized (this.aClass240_27) {
			this.aClass240_27.method25926((byte) -127);
		}
		local8 = this.aClass240_29;
		synchronized (this.aClass240_29) {
			this.aClass240_29.method25926((byte) -4);
		}
		local8 = this.aClass240_28;
		synchronized (this.aClass240_28) {
			this.aClass240_28.method25926((byte) -112);
		}
	}
}
