package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public class Class212 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!cs;")
	Class212 aClass212_1;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	final int anInt3600;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[Lclient!pq;")
	final Class489[] aClass489Array8;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array9;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array7;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[[F")
	float[][] aFloatArrayArray23;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(J)V", line = 9)
	public static final void method25431(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(ILclient!alw;Z)V", line = 14)
	Class212(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) boolean arg2) {
		this.anInt3600 = arg1.g2s((byte) -47) * 1682249735;
		this.aClass489Array8 = new Class489[arg0];
		this.aClass489Array9 = new Class489[this.aClass489Array8.length];
		this.aClass489Array7 = new Class489[this.aClass489Array8.length];
		this.aFloatArrayArray23 = new float[this.aClass489Array8.length][3];
		for (@Pc(33) int local33 = 0; local33 < this.aClass489Array8.length; local33++) {
			this.aClass489Array8[local33] = new Class489(arg1, arg2);
			this.aFloatArrayArray23[local33][0] = arg1.gFloat(-780630327);
			this.aFloatArrayArray23[local33][1] = arg1.gFloat(-231931985);
			this.aFloatArrayArray23[local33][2] = arg1.gFloat(1890265217);
		}
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(IB)Lclient!pq;", line = 29)
	Class489 method25432(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass489Array8[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "(IB)Lclient!pq;", line = 33)
	Class489 method25433(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass489Array9[arg0] == null) {
			this.aClass489Array9[arg0] = new Class489(this.method25432(arg0, (byte) 51));
			this.aClass489Array9[arg0].method29871();
		}
		return this.aClass489Array9[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)Lclient!pq;", line = 33)
	Class489 method25434(@OriginalArg(0) int arg0) {
		if (this.aClass489Array9[arg0] == null) {
			this.aClass489Array9[arg0] = new Class489(this.method25432(arg0, (byte) 106));
			this.aClass489Array9[arg0].method29871();
		}
		return this.aClass489Array9[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "(I)Lclient!pq;", line = 41)
	Class489 method25435(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25432(arg0, (byte) 34));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method29862(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method29862(this.aClass212_1.method25436(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "(II)Lclient!pq;", line = 41)
	Class489 method25436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25432(arg0, (byte) 2));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method29862(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method29862(this.aClass212_1.method25436(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)Lclient!pq;", line = 41)
	Class489 method25437(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25432(arg0, (byte) 116));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method29862(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method29862(this.aClass212_1.method25436(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "(I)Lclient!pq;", line = 41)
	Class489 method25438(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25432(arg0, (byte) 38));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method29862(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method29862(this.aClass212_1.method25436(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)Lclient!pq;", line = 41)
	Class489 method25439(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25432(arg0, (byte) 59));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method29862(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method29862(this.aClass212_1.method25436(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "bz", descriptor = "(III)I", line = 85)
	static int method25440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class615.aClass615_10.anInt5628 * 948246811 || Class615.aClass615_5.anInt5628 * 948246811 == arg0 ? Class132_Sub1_Sub2_Sub1.anIntArray168[arg1 & 0x3] : Class132_Sub1_Sub2_Sub1.anIntArray169[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)V", line = 160)
	public static void method25441(@OriginalArg(0) int arg0) {
		Class122_Sub3.aShort76 = client.aShort150;
		Class249.aShort163 = client.aShort151;
		Class152_Sub1.aShort99 = client.aShort155;
		Class249.aShort164 = client.aShort156;
		Class249.aBoolean664 = true;
		Class249.anInt3842 = Class274.aClass258_1.method26105(-1470662916) * -1512963435;
		if (Class249.anInt3839 * 279147767 != 0 && Class249.anInt3841 * 2018616941 != 0) {
			client.aShort155 = 334;
			client.aShort156 = 334;
			client.aShort151 = client.aShort150 = (short) (Class249.anInt3839 * 1189735936 / (Class249.anInt3841 * 2018616941));
		}
	}

	@OriginalMember(owner = "client!cs", name = "nz", descriptor = "(Lclient!yf;B)V", line = 7473)
	static final void method25442(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class170.method21482(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!cs", name = "ami", descriptor = "(Lclient!yf;B)V", line = 12165)
	static final void method25443(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class429.anInt4781 * -1453926679 == 3) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -7) * 2607.5945876176133D) >> 3;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloat253 >> 3;
		}
	}

	@OriginalMember(owner = "client!cs", name = "lu", descriptor = "(Ljava/lang/String;B)V", line = 12236)
	public static final void method25444(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) String local7 = Class82.method1384(arg0, client.aClass83_10, (byte) 1);
		if (local7 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3573 * 1882800101; local13++) {
			@Pc(22) Class177 local22 = client.aClass177Array1[local13];
			@Pc(25) String local25 = local22.aString125;
			@Pc(30) String local30 = Class82.method1384(local25, client.aClass83_10, (byte) 1);
			if (Class32_Sub10.method17005(arg0, local7, local25, local30, -1188265285)) {
				client.anInt3573 -= 335078893;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3573 * 1882800101; local43++) {
					client.aClass177Array1[local43] = client.aClass177Array1[local43 + 1];
				}
				client.anInt3547 = client.anInt3565 * -541355657;
				@Pc(65) Class175 local65 = Class330.method27371(-2042869964);
				@Pc(71) Class93_Sub22 local71 = Class102.method2588(Class446.aClass446_44, local65.aClass24_2, (byte) 107);
				local71.aPacketBit_1.p1(Packet.pjstrlen(arg0, -1995313720), (byte) -49);
				local71.aPacketBit_1.pjstr(arg0, 1019703631);
				local65.method24356(local71, -2116172389);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "bds", descriptor = "(Lclient!yf;B)V", line = 14717)
	static final void method25445(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class584.method31427(Class159_Sub1.anInt1949 * 1211831979, (byte) 7);
	}
}
