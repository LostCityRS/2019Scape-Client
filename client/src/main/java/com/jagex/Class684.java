package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yj")
public class Class684 {

	@OriginalMember(owner = "client!yj", name = "iq", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_6;

	@OriginalMember(owner = "client!yj", name = "k", descriptor = "F")
	float aFloat355;

	@OriginalMember(owner = "client!yj", name = "m", descriptor = "F")
	float aFloat356;

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "I")
	int anInt5895;

	@OriginalMember(owner = "client!yj", name = "f", descriptor = "Lclient!ox;")
	Class472 aClass472_66;

	@OriginalMember(owner = "client!yj", name = "w", descriptor = "I")
	int anInt5896;

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "I")
	int anInt5897;

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "F")
	float aFloat357;

	@OriginalMember(owner = "client!yj", name = "n", descriptor = "F")
	float aFloat358;

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "F")
	float aFloat359;

	@OriginalMember(owner = "client!yj", name = "d", descriptor = "I")
	int anInt5898;

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "I")
	int anInt5899;

	@OriginalMember(owner = "client!yj", name = "r", descriptor = "I")
	int anInt5900;

	@OriginalMember(owner = "client!yj", name = "v", descriptor = "I")
	int anInt5901;

	@OriginalMember(owner = "client!yj", name = "o", descriptor = "I")
	int anInt5902;

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "I")
	int anInt5903;

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "I")
	int anInt5904;

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "F")
	float aFloat360;

	@OriginalMember(owner = "client!yj", name = "y", descriptor = "[I")
	int[] anIntArray521 = new int[3];

	@OriginalMember(owner = "client!yj", name = "q", descriptor = "[F")
	float[] aFloatArray122 = new float[3];

	@OriginalMember(owner = "client!yj", name = "<init>", descriptor = "()V", line = 28)
	public Class684() {
		this.method33357((short) 5805);
	}

	@OriginalMember(owner = "client!yj", name = "a", descriptor = "()V", line = 33)
	void method33356() {
		this.anInt5904 = 14325749;
		this.aFloat358 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aClass472_66 = null;
		this.anInt5896 = 1757047085;
		this.anInt5895 = -268363761;
		this.aFloat357 = -1.0F;
		this.aFloat359 = -1.0F;
		this.aFloat360 = -1.0F;
		this.anInt5898 = -304329139;
		this.anInt5899 = -972166225;
		this.anInt5900 = 535776559;
		this.anInt5901 = 1145348855;
		this.anInt5902 = -1206173817;
		this.anInt5903 = -1258086185;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray521.length; local49++) {
			this.anIntArray521[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5897 = -1299616328;
	}

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "(S)V", line = 33)
	void method33357(@OriginalArg(0) short arg0) {
		this.anInt5904 = 14325749;
		this.aFloat358 = -1.0F;
		this.aFloat356 = -1.0F;
		this.aFloat355 = -1.0F;
		this.aClass472_66 = null;
		this.anInt5896 = 1757047085;
		this.anInt5895 = -268363761;
		this.aFloat357 = -1.0F;
		this.aFloat359 = -1.0F;
		this.aFloat360 = -1.0F;
		this.anInt5898 = -304329139;
		this.anInt5899 = -972166225;
		this.anInt5900 = 535776559;
		this.anInt5901 = 1145348855;
		this.anInt5902 = -1206173817;
		this.anInt5903 = -1258086185;
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray521.length; local49++) {
			this.anIntArray521[local49] = -1;
			this.aFloatArray122[local49] = 0.0F;
		}
		this.anInt5897 = -1299616328;
	}

	@OriginalMember(owner = "client!yj", name = "n", descriptor = "(Lclient!alw;I)Z", line = 57)
	public boolean method33358(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) long local3 = arg0.g8(1762565155);
		if (local3 == 0L) {
			this.anInt5897 = arg0.g2(-1434290800) * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.g4(-118643075) * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.gFloat(471391583);
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.gFloat(-64354544);
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.gFloat(-1965021142);
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29542(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1605293267);
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.g4(-118643075) * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.g2(-1434290800) * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1542518423);
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1989677016);
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-946274703);
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1342700002);
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.gFloat(-32617529);
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.gFloat(2063645248);
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.gFloat(-1279287504);
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.g2(-1434290800) * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.g2(-1434290800) * 972166225;
			this.anInt5900 = arg0.g2s((byte) -65) * -535776559;
			this.anInt5901 = arg0.g2s((byte) -18) * -1145348855;
			this.anInt5902 = arg0.g2s((byte) -38) * 1206173817;
			this.anInt5903 = arg0.g2(-1434290800) * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.g2(-1434290800);
			this.aFloatArray122[0] = arg0.gFloat(-337047699);
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.g2(-1434290800);
			this.aFloatArray122[1] = arg0.gFloat(-1442856252);
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.g2(-1434290800);
			this.aFloatArray122[2] = arg0.gFloat(-1989095495);
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1800179463);
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1677141764);
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-749708869);
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(306599555);
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1418893197);
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-545451687);
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(823614235);
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1235685919);
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(2134751824);
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1373669002);
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-105037216);
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1844479388);
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(198036823);
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1510814453);
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1105907221);
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-830843492);
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-558994342);
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		this.anInt5897 = arg0.g2(-1434290800) * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "g", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33359(@OriginalArg(0) Packet arg0) {
		@Pc(3) long local3 = arg0.g8(336671967);
		if (local3 == 0L) {
			this.anInt5897 = arg0.g2(-1434290800) * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.g4(-118643075) * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.gFloat(356891643);
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.gFloat(1334333912);
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.gFloat(-1887245744);
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29542(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1908029504);
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.g4(-118643075) * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.g2(-1434290800) * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1684930371);
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1164621739);
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1313755511);
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1888770555);
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.gFloat(1388008981);
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.gFloat(-1499454135);
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.gFloat(561995874);
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.g2(-1434290800) * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.g2(-1434290800) * 972166225;
			this.anInt5900 = arg0.g2s((byte) -38) * -535776559;
			this.anInt5901 = arg0.g2s((byte) -37) * -1145348855;
			this.anInt5902 = arg0.g2s((byte) -47) * 1206173817;
			this.anInt5903 = arg0.g2(-1434290800) * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.g2(-1434290800);
			this.aFloatArray122[0] = arg0.gFloat(411792530);
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.g2(-1434290800);
			this.aFloatArray122[1] = arg0.gFloat(1669122634);
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.g2(-1434290800);
			this.aFloatArray122[2] = arg0.gFloat(-257529985);
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-357362190);
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-2094475496);
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(2127206473);
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-568005931);
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-2023342953);
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1823731378);
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1071902988);
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1423934921);
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(674057298);
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-386795373);
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1422064667);
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1173266850);
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-297366350);
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(2036986882);
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(124721549);
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1735999455);
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-393316646);
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		this.anInt5897 = arg0.g2(-1434290800) * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "i", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33360(@OriginalArg(0) Packet arg0) {
		@Pc(3) long local3 = arg0.g8(-1453861062);
		if (local3 == 0L) {
			this.anInt5897 = arg0.g2(-1434290800) * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.g4(-118643075) * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.gFloat(427086929);
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.gFloat(-1835703283);
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.gFloat(-266118701);
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29542(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1579264135);
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.g4(-118643075) * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.g2(-1434290800) * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(358740711);
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1947241773);
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1694214625);
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1411567409);
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.gFloat(-487079625);
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.gFloat(2013289382);
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.gFloat(-1797426037);
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.g2(-1434290800) * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.g2(-1434290800) * 972166225;
			this.anInt5900 = arg0.g2s((byte) -44) * -535776559;
			this.anInt5901 = arg0.g2s((byte) -44) * -1145348855;
			this.anInt5902 = arg0.g2s((byte) -28) * 1206173817;
			this.anInt5903 = arg0.g2(-1434290800) * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.g2(-1434290800);
			this.aFloatArray122[0] = arg0.gFloat(-364192595);
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.g2(-1434290800);
			this.aFloatArray122[1] = arg0.gFloat(-1298613563);
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.g2(-1434290800);
			this.aFloatArray122[2] = arg0.gFloat(-2085620513);
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1804658405);
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-607293836);
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(290756391);
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1766610792);
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1411259408);
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1236740844);
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1255293952);
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1350983496);
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1155309684);
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-439829234);
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1843064582);
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1181223720);
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1617324837);
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1443148402);
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(894257149);
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1977106336);
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-57031794);
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		this.anInt5897 = arg0.g2(-1434290800) * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "j", descriptor = "(Lclient!alw;)Z", line = 57)
	public boolean method33361(@OriginalArg(0) Packet arg0) {
		@Pc(3) long local3 = arg0.g8(-1082134073);
		if (local3 == 0L) {
			this.anInt5897 = arg0.g2(-1434290800) * -521668953;
			return false;
		}
		if ((local3 & Class680.aClass680_9.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5904 = arg0.g4(-118643075) * -14325749;
		}
		if ((local3 & Class680.aClass680_1.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat358 = arg0.gFloat(-410615072);
		}
		if ((local3 & Class680.aClass680_22.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat356 = arg0.gFloat(2084725433);
		}
		if ((local3 & Class680.aClass680_4.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat355 = arg0.gFloat(-1598801287);
		}
		if ((local3 & Class680.aClass680_5.aLong307 * 7134854499111106275L) != 0L) {
			this.aClass472_66 = Class472.method29542(arg0);
		}
		if ((local3 & Class680.aClass680_13.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(48750158);
		}
		if ((local3 & Class680.aClass680_10.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5896 = arg0.g4(-118643075) * -1757047085;
		}
		if ((local3 & Class680.aClass680_8.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5895 = arg0.g2(-1434290800) * 268363761;
		}
		if ((local3 & Class680.aClass680_39.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1971658871);
		}
		if ((local3 & Class680.aClass680_40.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(271241502);
		}
		if ((local3 & Class680.aClass680_43.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(97265371);
		}
		if ((local3 & Class680.aClass680_2.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1464584433);
		}
		if ((local3 & Class680.aClass680_7.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat357 = arg0.gFloat(-1305198801);
		}
		if ((local3 & Class680.aClass680_14.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat359 = arg0.gFloat(1487719715);
		}
		if ((local3 & Class680.aClass680_15.aLong307 * 7134854499111106275L) != 0L) {
			this.aFloat360 = arg0.gFloat(1620105168);
		}
		if ((local3 & Class680.aClass680_16.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5898 = arg0.g2(-1434290800) * 304329139;
		}
		if ((local3 & Class680.aClass680_17.aLong307 * 7134854499111106275L) != 0L) {
			this.anInt5899 = arg0.g2(-1434290800) * 972166225;
			this.anInt5900 = arg0.g2s((byte) -110) * -535776559;
			this.anInt5901 = arg0.g2s((byte) -31) * -1145348855;
			this.anInt5902 = arg0.g2s((byte) -90) * 1206173817;
			this.anInt5903 = arg0.g2(-1434290800) * 1258086185;
		}
		if ((local3 & Class680.aClass680_18.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[0] = arg0.g2(-1434290800);
			this.aFloatArray122[0] = arg0.gFloat(-1659870577);
		}
		if ((local3 & Class680.aClass680_19.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[1] = arg0.g2(-1434290800);
			this.aFloatArray122[1] = arg0.gFloat(761790497);
		}
		if ((local3 & Class680.aClass680_20.aLong307 * 7134854499111106275L) != 0L) {
			this.anIntArray521[2] = arg0.g2(-1434290800);
			this.aFloatArray122[2] = arg0.gFloat(738929353);
		}
		if ((local3 & Class680.aClass680_21.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_31.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_36.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-631017425);
		}
		if ((local3 & Class680.aClass680_24.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-278912871);
		}
		if ((local3 & Class680.aClass680_25.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-399652290);
		}
		if ((local3 & Class680.aClass680_26.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(448301607);
		}
		if ((local3 & Class680.aClass680_27.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1640471200);
		}
		if ((local3 & Class680.aClass680_28.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_29.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1269673484);
		}
		if ((local3 & Class680.aClass680_30.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-1245105926);
		}
		if ((local3 & Class680.aClass680_12.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-748762783);
		}
		if ((local3 & Class680.aClass680_32.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-367443619);
		}
		if ((local3 & Class680.aClass680_33.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_34.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_35.aLong307 * 7134854499111106275L) != 0L) {
			new Class472(arg0);
		}
		if ((local3 & Class680.aClass680_37.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-92907822);
		}
		if ((local3 & Class680.aClass680_3.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-112880301);
		}
		if ((local3 & Class680.aClass680_38.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(564311723);
		}
		if ((local3 & Class680.aClass680_23.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-228809554);
		}
		if ((local3 & Class680.aClass680_45.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(45565929);
		}
		if ((local3 & Class680.aClass680_41.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(-588494887);
		}
		if ((local3 & Class680.aClass680_42.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(183239242);
		}
		if ((local3 & Class680.aClass680_6.aLong307 * 7134854499111106275L) != 0L) {
			arg0.gFloat(1058834539);
		}
		if ((local3 & Class680.aClass680_44.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		if ((local3 & Class680.aClass680_11.aLong307 * 7134854499111106275L) != 0L) {
			arg0.g4(-118643075);
		}
		this.anInt5897 = arg0.g2(-1434290800) * -521668953;
		return true;
	}

	@OriginalMember(owner = "client!yj", name = "m", descriptor = "(I)I", line = 209)
	public int method33362(@OriginalArg(0) int arg0) {
		return this.anInt5904 * 988275619;
	}

	@OriginalMember(owner = "client!yj", name = "k", descriptor = "(I)F", line = 213)
	public float method33363(@OriginalArg(0) int arg0) {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "t", descriptor = "()F", line = 213)
	public float method33364() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "ag", descriptor = "()F", line = 213)
	public float method33365() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "ae", descriptor = "()F", line = 213)
	public float method33366() {
		return this.aFloat358;
	}

	@OriginalMember(owner = "client!yj", name = "f", descriptor = "(I)F", line = 217)
	public float method33367(@OriginalArg(0) int arg0) {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yj", name = "ah", descriptor = "()F", line = 217)
	public float method33368() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!yj", name = "w", descriptor = "(I)F", line = 221)
	public float method33369(@OriginalArg(0) int arg0) {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "ac", descriptor = "()F", line = 221)
	public float method33370() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "ai", descriptor = "()F", line = 221)
	public float method33371() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "al", descriptor = "()F", line = 221)
	public float method33372() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "(I)Lclient!ox;", line = 225)
	public Class472 method33373(@OriginalArg(0) int arg0) {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "as", descriptor = "()Lclient!ox;", line = 225)
	public Class472 method33374() {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "aw", descriptor = "()Lclient!ox;", line = 225)
	public Class472 method33375() {
		return this.aClass472_66;
	}

	@OriginalMember(owner = "client!yj", name = "at", descriptor = "()I", line = 229)
	public int method33376() {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "ad", descriptor = "()I", line = 229)
	public int method33377() {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "(I)I", line = 229)
	public int method33378(@OriginalArg(0) int arg0) {
		return this.anInt5896 * -253284005;
	}

	@OriginalMember(owner = "client!yj", name = "ar", descriptor = "()I", line = 233)
	public int method33379() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "(I)I", line = 233)
	public int method33380(@OriginalArg(0) int arg0) {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "am", descriptor = "()I", line = 233)
	public int method33381() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "au", descriptor = "()I", line = 233)
	public int method33382() {
		return this.anInt5895 * -524474095;
	}

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "(I)F", line = 237)
	public float method33383(@OriginalArg(0) int arg0) {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "ap", descriptor = "()F", line = 237)
	public float method33384() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "aq", descriptor = "()F", line = 237)
	public float method33385() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "ax", descriptor = "()F", line = 237)
	public float method33386() {
		return this.aFloat357;
	}

	@OriginalMember(owner = "client!yj", name = "d", descriptor = "(I)F", line = 241)
	public float method33387(@OriginalArg(0) int arg0) {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "ao", descriptor = "()F", line = 241)
	public float method33388() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "av", descriptor = "()F", line = 241)
	public float method33389() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "aj", descriptor = "()F", line = 241)
	public float method33390() {
		return this.aFloat359;
	}

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "(I)F", line = 245)
	public float method33391(@OriginalArg(0) int arg0) {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "ay", descriptor = "()F", line = 245)
	public float method33392() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "ab", descriptor = "()F", line = 245)
	public float method33393() {
		return this.aFloat360;
	}

	@OriginalMember(owner = "client!yj", name = "af", descriptor = "()I", line = 249)
	public int method33394() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "r", descriptor = "(B)I", line = 249)
	public int method33395(@OriginalArg(0) byte arg0) {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "az", descriptor = "()I", line = 249)
	public int method33396() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "aa", descriptor = "()I", line = 249)
	public int method33397() {
		return this.anInt5898 * -766876293;
	}

	@OriginalMember(owner = "client!yj", name = "v", descriptor = "(B)I", line = 253)
	public int method33398(@OriginalArg(0) byte arg0) {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "bf", descriptor = "()I", line = 253)
	public int method33399() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "ak", descriptor = "()I", line = 253)
	public int method33400() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "an", descriptor = "()I", line = 253)
	public int method33401() {
		return this.anInt5899 * 1361556657;
	}

	@OriginalMember(owner = "client!yj", name = "bl", descriptor = "()I", line = 257)
	public int method33402() {
		return this.anInt5900 * -2025396687;
	}

	@OriginalMember(owner = "client!yj", name = "o", descriptor = "(I)I", line = 257)
	public int method33403(@OriginalArg(0) int arg0) {
		return this.anInt5900 * -2025396687;
	}

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "(I)I", line = 261)
	public int method33404(@OriginalArg(0) int arg0) {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "bk", descriptor = "()I", line = 261)
	public int method33405() {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "bh", descriptor = "()I", line = 261)
	public int method33406() {
		return this.anInt5901 * -1365163719;
	}

	@OriginalMember(owner = "client!yj", name = "y", descriptor = "(I)I", line = 265)
	public int method33407(@OriginalArg(0) int arg0) {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bd", descriptor = "()I", line = 265)
	public int method33408() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bx", descriptor = "()I", line = 265)
	public int method33409() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "bc", descriptor = "()I", line = 265)
	public int method33410() {
		return this.anInt5902 * -1178752567;
	}

	@OriginalMember(owner = "client!yj", name = "q", descriptor = "(I)I", line = 269)
	public int method33411(@OriginalArg(0) int arg0) {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bn", descriptor = "()I", line = 269)
	public int method33412() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bi", descriptor = "()I", line = 269)
	public int method33413() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "bt", descriptor = "()I", line = 269)
	public int method33414() {
		return this.anInt5903 * 804531481;
	}

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "(II)I", line = 273)
	public int method33415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray521[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bq", descriptor = "(I)I", line = 273)
	public int method33416(@OriginalArg(0) int arg0) {
		return this.anIntArray521[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "b", descriptor = "(II)F", line = 277)
	public float method33417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bm", descriptor = "(I)F", line = 277)
	public float method33418(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "bb", descriptor = "(I)F", line = 277)
	public float method33419(@OriginalArg(0) int arg0) {
		return this.aFloatArray122[arg0];
	}

	@OriginalMember(owner = "client!yj", name = "h", descriptor = "(I)I", line = 281)
	public int method33420(@OriginalArg(0) int arg0) {
		return this.anInt5897 * -1431154409;
	}

	@OriginalMember(owner = "client!yj", name = "ff", descriptor = "(B)V", line = 2634)
	static final void method33421(@OriginalArg(0) byte arg0) {
		Class682.aClass32_Sub1_3.method17822(1701372950);
		Class692.aClass32_Sub4_3.method17822(681435632);
		Class343.aClass32_Sub19_1.method17822(-928707022);
		client.world.method30496(1073538312).method17822(-2055115919);
		Class162.aClass32_Sub3_2.method17822(1409459113);
		Class277.aClass32_Sub12_1.method17822(-899090766);
		Class32.aClass32_Sub17_23.method17822(652399493);
		Class501.aClass32_Sub18_1.method17822(1249715159);
		Class30.aClass32_Sub16_1.method17822(-1483298106);
		Class21.aClass79_Sub1_Sub1_1.method1425((byte) -39);
		aClass79_Sub1_Sub2_6.method1483(2022880669);
		Class39.aClass79_Sub1_Sub2_1.method1483(1132937742);
		Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3.method1483(-207543288);
		Class429.aClass79_Sub1_Sub2_5.method1483(1224868682);
		Class265.aClass79_Sub1_Sub2_4.method1483(429184644);
		Class166_Sub6.aClass32_Sub5_1.method17822(559175715);
		Class466.aClass32_Sub20_3.method17822(-611820807);
		Class542.aClass32_Sub2_3.method17822(-1365094645);
		Class124.aClass32_Sub21_7.method17822(-1545053759);
		Class123.aClass32_Sub11_2.method17822(1383443525);
		Class51.aClass32_Sub9_1.method17822(1621289321);
		Class668.aClass32_Sub15_1.method17822(1363320538);
		Class311.aClass32_Sub6_1.method17822(1226545783);
		Class366.aClass32_Sub8_1.method17822(1641719089);
		Class534.aClass32_Sub10_1.method17822(443897402);
		Class546.method30971((short) -27376);
		Class379.method28100(1013448115);
		Class157.aClass462_2.method29272(-1476787182);
		Class124_Sub1.method9166((byte) 0);
		Class379.method28099((byte) -3);
		client.aClass240_66.method25860(1161602830);
		client.aClass240_69.method25860(1161602830);
		Class687.aClass240_96.method25860(1161602830);
		client.aClass240_70.method25860(1161602830);
		Class74.aClass32_1.method17822(794984993);
		Class276.aClass32_2.method17822(654738010);
		client.aClass240_67.method25860(1161602830);
	}

	@OriginalMember(owner = "client!yj", name = "gu", descriptor = "(IIIB)V", line = 3345)
	static final void method33422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(32) String local32 = "tele " + arg0 + Class430.aString204 + (arg1 >> 6) + Class430.aString204 + (arg2 >> 6) + Class430.aString204 + (arg1 & 0x3F) + Class430.aString204 + (arg2 & 0x3F);
		System.out.println(local32);
		Class32_Sub7.method16823(local32, true, false, (byte) 3);
	}

	@OriginalMember(owner = "client!yj", name = "vi", descriptor = "(Lclient!yf;I)V", line = 8797)
	static final void method33423(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(19) ClientMessage local19 = Class102.createGameMessage(ClientProt.aClientProt_103, client.aClass175_2.clientIsaac, (byte) 34);
		local19.packet.p1(local13.length() + 1, (byte) -107);
		local19.packet.pjstr(local13, -1780120468);
		client.aClass175_2.send(local19, -1984927484);
	}

	@OriginalMember(owner = "client!yj", name = "ame", descriptor = "(Lclient!yf;I)V", line = 12026)
	static final void method33424(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class389.method28267((byte) 121);
		Class454.aBoolean774 = false;
	}

	@OriginalMember(owner = "client!yj", name = "ayz", descriptor = "(Lclient!yf;I)V", line = 14039)
	static final void method33425(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
