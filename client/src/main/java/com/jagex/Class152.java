package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public abstract class Class152 {

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[Lclient!ef;")
	static Class243[] aClass243Array2;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_21 = new Class240(20);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_45;

	@OriginalMember(owner = "client!vl", name = "az", descriptor = "(IIIIIIILclient!arm;Lclient!eu;Lclient!aac;IIS)V")
	static void method14003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class93_Sub1_Sub7 arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) short arg12) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt6 * -8978697 - 1 && arg1 < arg9.anInt10 * -1093354073 + arg6 && arg7.aBoolean506) {
			arg10 = arg11;
		}
		@Pc(34) int[] local34 = Class477.method29887(arg7, 1909722664);
		@Pc(38) String local38 = Class110_Sub21.method8544(arg7, -1497248091);
		if (local34 != null) {
			local38 = local38 + Class7.method122(local34, 2085815044);
		}
		arg8.method7532(local38, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class106.anInt891, Class110_Sub14.aClass100Array4, null, (byte) 1);
		if (arg7.aBoolean504) {
			Class284.aClass100_42.method18181(arg2 + 5 + arg9.method37(local38, Class110_Sub14.aClass100Array4, (byte) -77), arg6 - arg9.anInt6 * -8978697);
		}
	}

	@OriginalMember(owner = "client!vl", name = "aks", descriptor = "(Lclient!yf;I)V")
	static void method14004(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class159_Sub1.aBoolean352 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vl", name = "bee", descriptor = "(Lclient!yf;I)V")
	static void method14005(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!vl", name = "eg", descriptor = "(ZI)V")
	static void method14006(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			if (-703563959 * client.anInt3526 != -1) {
				Class535.method30934(client.anInt3526 * -703563959, 1770633861);
			}
			for (@Pc(16) Class93_Sub40 local16 = (Class93_Sub40) client.aClass16_22.method220((byte) -19); local16 != null; local16 = (Class93_Sub40) client.aClass16_22.method222(2146561672)) {
				if (!local16.method23982(1540367973)) {
					local16 = (Class93_Sub40) client.aClass16_22.method220((byte) 22);
					if (local16 == null) {
						break;
					}
				}
				Class372.method28200(local16, true, false, -10455895);
			}
			client.anInt3526 = -823798521;
			client.aClass16_22 = new Class16(8);
			Class361.method27983((byte) -79);
			client.anInt3526 = Class93_Sub26.aClass645_15.anInt5929 * 914533045;
			if (client.anInt3526 * -703563959 != -1) {
				Class618.method32282(false, -1213042793);
				Class635.method32622((short) 255);
				Class56.method18048(client.anInt3526 * -703563959, null, 683653350);
			}
		}
		Class411.aBoolean761 = true;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)[Lclient!xs;")
	static Class669[] method14007(@OriginalArg(0) int arg0) {
		return new Class669[] { Class669.aClass669_13, Class669.aClass669_4, Class669.aClass669_2, Class669.aClass669_1, Class669.aClass669_14, Class669.aClass669_7, Class669.aClass669_15, Class669.aClass669_11, Class669.aClass669_3, Class669.aClass669_8, Class669.aClass669_6, Class669.aClass669_9, Class669.aClass669_10, Class669.aClass669_5, Class669.aClass669_12 };
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!py;)V")
	Class152(@OriginalArg(0) Class497 arg0) {
		this.aClass497_45 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "()V")
	final void method13995() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25926((byte) -59);
		}
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	final void method13996(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25926((byte) -50);
		}
	}

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "()V")
	final void method13997() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25926((byte) -70);
		}
	}

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "(I)V")
	final void method13998(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "()V")
	final void method13999() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25926((byte) -86);
		}
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "()V")
	final void method14000() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25926((byte) -85);
		}
	}

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "(II)V")
	final void method14001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25925(arg0, (byte) 67);
		}
	}

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "()V")
	final void method14002() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25930(1161602830);
		}
	}
}
