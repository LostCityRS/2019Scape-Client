package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ach")
public class Class58 {

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "I")
	static final int anInt225 = 32768;

	@OriginalMember(owner = "client!ach", name = "w", descriptor = "I")
	static final int anInt228 = 1;

	@OriginalMember(owner = "client!ach", name = "m", descriptor = "I")
	public int anInt226 = 0;

	@OriginalMember(owner = "client!ach", name = "k", descriptor = "I")
	public int anInt227 = 0;

	@OriginalMember(owner = "client!ach", name = "f", descriptor = "Lclient!eb;")
	final Class240 aClass240_4 = new Class240(64);

	@OriginalMember(owner = "client!ach", name = "u", descriptor = "Lclient!xx;")
	Interface72 anInterface72_1 = null;

	@OriginalMember(owner = "client!ach", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_10;

	@OriginalMember(owner = "client!ach", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_9;

	@OriginalMember(owner = "client!ach", name = "<init>", descriptor = "(Lclient!zt;Lclient!py;Lclient!py;Lclient!xx;)V", line = 19)
	public Class58(@OriginalArg(0) Class717 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Interface72 arg3) {
		this.aClass497_10 = arg1;
		this.aClass497_9 = arg2;
		this.anInterface72_1 = arg3;
		if (this.aClass497_10 != null) {
			this.anInt226 = this.aClass497_10.method30084(1, 604609588) * -44765849;
		}
		if (this.aClass497_9 != null) {
			this.anInt227 = this.aClass497_9.method30084(1, 716796422) * -1847166895;
		}
	}

	@OriginalMember(owner = "client!ach", name = "m", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1091(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30064(1, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_10.method30064(1, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22919(new Packet(local22), 1189701933);
		}
		if (arg0 >= 32768) {
			local6.method22944((byte) 46);
		}
		this.aClass240_4.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "k", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1092(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30064(1, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_10.method30064(1, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22919(new Packet(local22), 1189701933);
		}
		if (arg0 >= 32768) {
			local6.method22944((byte) 12);
		}
		this.aClass240_4.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "f", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1093(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30064(1, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_10.method30064(1, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22919(new Packet(local22), 1189701933);
		}
		if (arg0 >= 32768) {
			local6.method22944((byte) -82);
		}
		this.aClass240_4.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "e", descriptor = "(II)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30064(1, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_10.method30064(1, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22919(new Packet(local22), 1189701933);
		}
		if (arg0 >= 32768) {
			local6.method22944((byte) 9);
		}
		this.aClass240_4.method25838(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1095(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "n", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1096(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "w", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1097(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "u", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1098(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "z", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1099(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "d", descriptor = "(Ljava/util/Random;II)I", line = 114)
	public static int method1100(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			arg0 = Class62.aRandom1;
			if (arg0 == null) {
				@Pc(10) Object local10 = Class62.anObject3;
				synchronized (Class62.anObject3) {
					if (Class62.aRandom1 == null) {
						Class62.aRandom1 = new Random();
					}
					arg0 = Class62.aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class364.method27889(arg1, -2049762220)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class580.method31374(local60, arg1, (byte) -51);
		}
	}

	@OriginalMember(owner = "client!ach", name = "hk", descriptor = "(Lclient!ahm;I)V", line = 4262)
	static final void method1101(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class19_Sub3 local2 = arg0.aClass19_Sub3_3;
		if (local2.method23557(-1698628681) && local2.method23618(1, 1931530995) && local2.method23598(-1228609165)) {
			if (local2.aBoolean379) {
				local2.method23569(arg0.method19997(690430450).method32131(1558609568), false, true, (byte) 104);
				local2.aBoolean379 = local2.method23557(1084107836);
			}
			local2.method23608(2047917235);
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.aClass554Array3.length; local38++) {
			if (arg0.aClass554Array3[local38].anInt5319 * 601549465 != -1) {
				@Pc(58) Class19 local58 = arg0.aClass554Array3[local38].aClass19_7;
				if (local58.method23578((byte) 0)) {
					@Pc(74) Class697 local74 = (Class697) Class501.aClass32_Sub18_1.method18261(arg0.aClass554Array3[local38].anInt5319 * 601549465, 1862784475);
					@Pc(78) Class263 local78 = local58.method23560(34907548);
					if (local74.aBoolean881) {
						if (local78.anInt3867 * -2017474589 == 3) {
							if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
								local58.method23566(-1, 341782871);
								arg0.aClass554Array3[local38].anInt5319 = 1020147287;
								continue;
							}
						} else if (local78.anInt3867 * -2017474589 == 1 && arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
							continue;
						}
					}
				}
				if (local58.method23618(1, 1828525999) && local58.method23598(-1228609165)) {
					local58.method23566(-1, -43548635);
					arg0.aClass554Array3[local38].anInt5319 = 1020147287;
				}
			}
		}
		@Pc(163) Class19 local163 = arg0.aClass19_3;
		if (local163.method23557(1805634571)) {
			label84: {
				@Pc(171) Class263 local171 = local163.method23560(1749416823);
				if (local171.anInt3867 * -2017474589 == 3) {
					if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
						arg0.anIntArray236 = null;
						local163.method23566(-1, 667180543);
						break label84;
					}
				} else if (local171.anInt3867 * -2017474589 == 1) {
					if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
						local163.method23583(1, (byte) 2);
						break label84;
					}
					local163.method23583(0, (byte) 2);
				}
				if (local163.method23618(1, 1589306671) && local163.method23598(-1228609165)) {
					arg0.anIntArray236 = null;
					local163.method23566(-1, 1460087915);
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < arg0.aClass19_Sub1_Sub1Array3.length; local252++) {
			@Pc(262) Class19_Sub1_Sub1 local262 = arg0.aClass19_Sub1_Sub1Array3[local252];
			if (local262 != null) {
				if (local262.anInt3224 * -1095445777 > 0) {
					local262.anInt3224 -= -754803697;
				} else if (local262.method23618(1, -864576594) && local262.method23598(-1228609165)) {
					arg0.aClass19_Sub1_Sub1Array3[local252] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ach", name = "ym", descriptor = "(Lclient!yf;B)V", line = 9335)
	static final void method1102(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean594 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ach", name = "auh", descriptor = "(Lclient!yf;B)V", line = 13413)
	static final void method1103(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub35_5.method16226(288048339);
	}
}
