package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class212 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!cs;")
	Class212 aClass212_1;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	final int anInt3641;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[Lclient!pq;")
	final Class489[] aClass489Array8;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array9;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array7;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[[F")
	float[][] aFloatArrayArray23;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(J)V")
	public static void method25532(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23262(arg0 - 1L);
			Class172.method23262(1L);
		} else {
			Class172.method23262(arg0);
		}
	}

	@OriginalMember(owner = "client!cs", name = "nz", descriptor = "(Lclient!yf;B)V")
	static void method25533(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class170.method21496(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!cs", name = "bds", descriptor = "(Lclient!yf;B)V")
	static void method25534(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class584.method31609(Class159_Sub1.anInt1949 * 1211831979, (byte) 7);
	}

	@OriginalMember(owner = "client!cs", name = "lu", descriptor = "(Ljava/lang/String;B)V")
	public static void method25535(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(7) String local7 = Class82.method1385(arg0, client.aClass83_10, (byte) 1);
		if (local7 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3573 * 1882800101; local13++) {
			@Pc(22) Class177 local22 = client.aClass177Array1[local13];
			@Pc(25) String local25 = local22.aString125;
			@Pc(30) String local30 = Class82.method1385(local25, client.aClass83_10, (byte) 1);
			if (Class32_Sub10.method17017(arg0, local7, local25, local30, -1188265285)) {
				client.anInt3573 -= 335078893;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3573 * 1882800101; local43++) {
					client.aClass177Array1[local43] = client.aClass177Array1[local43 + 1];
				}
				client.anInt3547 = client.anInt3565 * -541355657;
				@Pc(65) Class175 local65 = Class330.method27465(-2042869964);
				@Pc(71) Class93_Sub22 local71 = Class102.method2592(Class446.aClass446_44, local65.aClass24_2, (byte) 107);
				local71.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -1995313720), (byte) -49);
				local71.aClass93_Sub41_Sub2_1.method22414(arg0, 1019703631);
				local65.method24363(local71, -2116172389);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "bz", descriptor = "(III)I")
	static int method25536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class615.aClass615_10.anInt5789 * 948246811 || Class615.aClass615_5.anInt5789 * 948246811 == arg0 ? Class132_Sub1_Sub2_Sub1.anIntArray168[arg1 & 0x3] : Class132_Sub1_Sub2_Sub1.anIntArray169[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)V")
	public static void method25537(@OriginalArg(0) int arg0) {
		Class122_Sub3.aShort76 = client.aShort150;
		Class249.aShort163 = client.aShort151;
		Class152_Sub1.aShort99 = client.aShort155;
		Class249.aShort164 = client.aShort156;
		Class249.aBoolean668 = true;
		Class249.anInt3883 = Class274.aClass258_11.method26146(-1470662916) * -1512963435;
		if (Class249.anInt3880 * 279147767 != 0 && Class249.anInt3882 * 2018616941 != 0) {
			client.aShort155 = 334;
			client.aShort156 = 334;
			client.aShort151 = client.aShort150 = (short) (Class249.anInt3880 * 1189735936 / (Class249.anInt3882 * 2018616941));
		}
	}

	@OriginalMember(owner = "client!cs", name = "ami", descriptor = "(Lclient!yf;B)V")
	static void method25538(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class429.anInt4942 * -1453926679 == 3) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) ((double) Class65.aClass123_Sub1_2.method8962((byte) -7) * 2607.5945876176133D) >> 3;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloat253 >> 3;
		}
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(ILclient!alw;Z)V")
	Class212(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) boolean arg2) {
		this.anInt3641 = arg1.method22494((byte) -47) * 1682249735;
		this.aClass489Array8 = new Class489[arg0];
		this.aClass489Array9 = new Class489[this.aClass489Array8.length];
		this.aClass489Array7 = new Class489[this.aClass489Array8.length];
		this.aFloatArrayArray23 = new float[this.aClass489Array8.length][3];
		for (@Pc(33) int local33 = 0; local33 < this.aClass489Array8.length; local33++) {
			this.aClass489Array8[local33] = new Class489(arg1, arg2);
			this.aFloatArrayArray23[local33][0] = arg1.method22437(-780630327);
			this.aFloatArrayArray23[local33][1] = arg1.method22437(-231931985);
			this.aFloatArrayArray23[local33][2] = arg1.method22437(1890265217);
		}
	}

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "(I)Lclient!pq;")
	Class489 method25524(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25531(arg0, (byte) 34));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method30134(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method30134(this.aClass212_1.method25526(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "(IB)Lclient!pq;")
	Class489 method25525(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass489Array9[arg0] == null) {
			this.aClass489Array9[arg0] = new Class489(this.method25531(arg0, (byte) 51));
			this.aClass489Array9[arg0].method30025();
		}
		return this.aClass489Array9[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "(II)Lclient!pq;")
	Class489 method25526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25531(arg0, (byte) 2));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method30134(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method30134(this.aClass212_1.method25526(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)Lclient!pq;")
	Class489 method25527(@OriginalArg(0) int arg0) {
		if (this.aClass489Array9[arg0] == null) {
			this.aClass489Array9[arg0] = new Class489(this.method25531(arg0, (byte) 106));
			this.aClass489Array9[arg0].method30025();
		}
		return this.aClass489Array9[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)Lclient!pq;")
	Class489 method25528(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25531(arg0, (byte) 116));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method30134(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method30134(this.aClass212_1.method25526(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "(I)Lclient!pq;")
	Class489 method25529(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25531(arg0, (byte) 38));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method30134(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method30134(this.aClass212_1.method25526(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)Lclient!pq;")
	Class489 method25530(@OriginalArg(0) int arg0) {
		if (this.aClass489Array7[arg0] == null) {
			this.aClass489Array7[arg0] = new Class489(this.method25531(arg0, (byte) 59));
			if (this.aClass212_1 == null) {
				this.aClass489Array7[arg0].method30134(Class489.aClass489_99);
			} else {
				this.aClass489Array7[arg0].method30134(this.aClass212_1.method25526(arg0, 1017288555));
			}
		}
		return this.aClass489Array7[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(IB)Lclient!pq;")
	Class489 method25531(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass489Array8[arg0];
	}
}
