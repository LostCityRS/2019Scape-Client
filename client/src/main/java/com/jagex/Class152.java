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

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)[Lclient!xs;", line = 26)
	static Class669[] method13995(@OriginalArg(0) int arg0) {
		return new Class669[] { Class669.aClass669_13, Class669.aClass669_4, Class669.aClass669_2, Class669.aClass669_1, Class669.aClass669_14, Class669.aClass669_7, Class669.aClass669_15, Class669.aClass669_11, Class669.aClass669_3, Class669.aClass669_8, Class669.aClass669_6, Class669.aClass669_9, Class669.aClass669_10, Class669.aClass669_5, Class669.aClass669_12 };
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!py;)V", line = 214)
	Class152(@OriginalArg(0) Class497 arg0) {
		this.aClass497_45 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "()V", line = 219)
	void method13996() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25847((byte) -59);
		}
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 219)
	void method13997(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25847((byte) -50);
		}
	}

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "()V", line = 219)
	void method13998() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25847((byte) -70);
		}
	}

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "()V", line = 219)
	void method13999() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25847((byte) -86);
		}
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "()V", line = 219)
	void method14000() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25847((byte) -85);
		}
	}

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "(II)V", line = 225)
	void method14001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25843(arg0, (byte) 67);
		}
	}

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "(I)V", line = 231)
	void method14002(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "()V", line = 231)
	void method14003() {
		@Pc(3) Class240 local3 = this.aClass240_21;
		synchronized (this.aClass240_21) {
			this.aClass240_21.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!vl", name = "az", descriptor = "(IIIIIIILclient!arm;Lclient!eu;Lclient!aac;IIS)V", line = 1172)
	static void method14004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class93_Sub1_Sub7 arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) short arg12) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt6 * -8978697 - 1 && arg1 < arg9.anInt10 * -1093354073 + arg6 && arg7.aBoolean505) {
			arg10 = arg11;
		}
		@Pc(34) int[] local34 = Class477.method29703(arg7, 1909722664);
		@Pc(38) String local38 = Class110_Sub21.method8544(arg7, -1497248091);
		if (local34 != null) {
			local38 = local38 + Class7.method122(local34, 2085815044);
		}
		arg8.method7546(local38, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class106.anInt891, Class110_Sub14.aClass100Array4, null, (byte) 1);
		if (arg7.aBoolean503) {
			Class284.aClass100_42.method18161(arg2 + 5 + arg9.method55(local38, Class110_Sub14.aClass100Array4, (byte) -77), arg6 - arg9.anInt6 * -8978697);
		}
	}

	@OriginalMember(owner = "client!vl", name = "eg", descriptor = "(ZI)V", line = 1972)
	static void method14005(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			if (-703563959 * client.topLevelInterface != -1) {
				Class535.method30697(client.topLevelInterface * -703563959, 1770633861);
			}
			for (@Pc(16) SubInterface local16 = (SubInterface) client.aClass16_22.method227((byte) -19); local16 != null; local16 = (SubInterface) client.aClass16_22.method229(2146561672)) {
				if (!local16.method23970(1540367973)) {
					local16 = (SubInterface) client.aClass16_22.method227((byte) 22);
					if (local16 == null) {
						break;
					}
				}
				Class372.method28019(local16, true, false, -10455895);
			}
			client.topLevelInterface = -823798521;
			client.aClass16_22 = new Class16(8);
			Class361.method27805((byte) -79);
			client.topLevelInterface = Class93_Sub26.aClass645_15.anInt5768 * 914533045;
			if (client.topLevelInterface * -703563959 != -1) {
				Class618.computeTopLevelInterfaceLayout(false, -1213042793);
				Class635.method32440((short) 255);
				Class56.runOnLoad(client.topLevelInterface * -703563959, null, 683653350);
			}
		}
		Class411.aBoolean752 = true;
	}

	@OriginalMember(owner = "client!vl", name = "aks", descriptor = "(Lclient!yf;I)V", line = 11718)
	static final void method14006(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159_Sub1.aBoolean351 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vl", name = "bee", descriptor = "(Lclient!yf;I)V", line = 15050)
	static final void method14007(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
