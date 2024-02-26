package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

@OriginalClass("client!pr")
public final class Class491 {

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray30;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!qu;")
	Class518 aClass518_1;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!qu;")
	Class518 aClass518_2;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[Lclient!aih;")
	Class141_Sub1[] aClass141_Sub1Array1;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Z")
	boolean aBoolean882 = false;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!pz;")
	Class139 aClass139_9;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!pq;")
	Class490 aClass490_5;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!pv;")
	Class495 aClass495_2;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger7;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger8;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!aun;")
	Class80_Sub1_Sub15_Sub3 aClass80_Sub1_Sub15_Sub3_3;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 aClass80_Sub1_Sub15_Sub1_2;

	@OriginalMember(owner = "client!pr", name = "kz", descriptor = "(Lclient!hx;I[B[BLclient!yp;I)V")
	static void method30253(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class690 arg4, @OriginalArg(5) int arg5) {
		if (arg0.aByteArrayArray15 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.anIntArray410 = new int[11];
			arg0.anIntArray401 = new int[11];
			arg0.anIntArray403 = new int[11];
		}
		arg0.aByteArrayArray15[arg1] = arg2;
		if (arg2 == null) {
			arg0.aBoolean813 = false;
			for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray15.length; local43++) {
				if (arg0.aByteArrayArray15[local43] != null || arg0.anIntArray403[local43] > 0) {
					arg0.aBoolean813 = true;
					break;
				}
			}
		} else {
			arg0.aBoolean813 = true;
		}
		arg0.aByteArrayArray14[arg1] = arg3;
	}

	@OriginalMember(owner = "client!pr", name = "rq", descriptor = "(Lclient!yp;I)V")
	static void method30254(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4111 * 458112843;
	}

	@OriginalMember(owner = "client!pr", name = "ys", descriptor = "(Lclient!yp;I)V")
	static void method30255(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!pr", name = "bfv", descriptor = "(Lclient!yp;I)V")
	static void method30256(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!pr", name = "ng", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30257(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1749597957) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 923736358);
	}

	@OriginalMember(owner = "client!pr", name = "al", descriptor = "(I)Lclient!arz;")
	public static Class80_Sub1_Sub11 method30258(@OriginalArg(0) int arg0) {
		return Class630.aClass80_Sub1_Sub11_4;
	}

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "(Lclient!yp;I)V")
	static void method30259(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class436.method29130((byte) 1);
	}

	@OriginalMember(owner = "client!pr", name = "axf", descriptor = "(Lclient!yp;B)V")
	static void method30260(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(6, local13, local23, "", 2070121721);
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pz;Lclient!pq;Lclient!pv;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class491(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class490 arg1, @OriginalArg(2) Class495 arg2, @OriginalArg(3) BigInteger arg3, @OriginalArg(4) BigInteger arg4) {
		this.aClass139_9 = arg0;
		this.aClass490_5 = arg1;
		this.aClass495_2 = arg2;
		this.aBigInteger7 = arg3;
		this.aBigInteger8 = arg4;
		if (!this.aClass139_9.method10788((short) 23951)) {
			this.aClass80_Sub1_Sub15_Sub3_3 = this.aClass139_9.method10799(255, 255, (byte) 0, true, 1922892898);
		}
		if (this.aClass490_5 != null) {
			this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.method30222((byte) 4);
		}
	}

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "(ILclient!uf;Lclient!uf;ZZ)Lclient!aih;")
	Class141_Sub1 method30243(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass518_2 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass141_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass141_Sub1Array1[arg0] == null) {
			@Pc(35) Class493 local35 = this.aClass518_2.aClass493Array1[arg0];
			@Pc(67) Class141_Sub1 local67 = new Class141_Sub1(arg0, arg1, arg2, this.aClass139_9, arg4 ? this.aClass490_5 : null, this.aClass495_2, local35.anInt5030 * -537553445, local35.aByteArray95, local35.anInt5029 * 12510669, arg3, local35.anInt5028 * -759106401);
			this.aClass141_Sub1Array1[arg0] = local67;
			if (this.aClass518_1 != null && arg4) {
				@Pc(83) Class493 local83 = this.aClass518_1.aClass493Array1[arg0];
				this.aClass141_Sub1Array1[arg0].method10919(this.aClass141_Sub1Array1[arg0].method10909(local83.anInt5030 * -537553445, local83.aByteArray95, local83.anInt5029 * 12510669, local83.anInt5028 * -759106401, (byte) 8), -221271920);
			}
			return local67;
		} else {
			return this.aClass141_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "(I)Z")
	public boolean method30244(@OriginalArg(0) int arg0) {
		if (this.aClass518_2 != null) {
			return true;
		}
		if (this.aClass80_Sub1_Sub15_Sub3_3 == null) {
			if (this.aClass139_9.method10788((short) -16469)) {
				return false;
			}
			this.aClass80_Sub1_Sub15_Sub3_3 = this.aClass139_9.method10799(255, 255, (byte) 0, true, 1916919868);
		}
		if (this.aClass80_Sub1_Sub15_Sub3_3.aBoolean661) {
			return false;
		}
		@Pc(39) Packet local39 = new Packet(this.aClass80_Sub1_Sub15_Sub3_3.method24390(-2133825886));
		this.aClass518_2 = new Class518(local39, this.aBigInteger7, this.aBigInteger8);
		if (this.aClass141_Sub1Array1 == null) {
			this.aClass141_Sub1Array1 = new Class141_Sub1[this.aClass518_2.aClass493Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass141_Sub1Array1.length; local62++) {
				if (this.aClass141_Sub1Array1[local62] != null) {
					@Pc(80) Class493 local80 = this.aClass518_2.aClass493Array1[local62];
					this.aClass141_Sub1Array1[local62].method10908(local80.anInt5030 * -537553445, local80.aByteArray95, local80.anInt5029 * 12510669, local80.anInt5028 * -759106401, 1916946974);
					if (this.aClass141_Sub1Array1[local62].method10920((byte) -111)) {
						this.aClass141_Sub1Array1[local62].method10919(false, -2121091106);
					}
				}
			}
		}
		this.aBoolean882 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(ILclient!uf;Lclient!uf;ZI)Lclient!aih;")
	public Class141_Sub1 method30245(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -35);
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(ILclient!uf;Lclient!uf;ZZB)Lclient!aih;")
	Class141_Sub1 method30246(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		if (this.aClass518_2 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass141_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass141_Sub1Array1[arg0] == null) {
			@Pc(35) Class493 local35 = this.aClass518_2.aClass493Array1[arg0];
			@Pc(67) Class141_Sub1 local67 = new Class141_Sub1(arg0, arg1, arg2, this.aClass139_9, arg4 ? this.aClass490_5 : null, this.aClass495_2, local35.anInt5030 * -537553445, local35.aByteArray95, local35.anInt5029 * 12510669, arg3, local35.anInt5028 * -759106401);
			this.aClass141_Sub1Array1[arg0] = local67;
			if (this.aClass518_1 != null && arg4) {
				@Pc(83) Class493 local83 = this.aClass518_1.aClass493Array1[arg0];
				this.aClass141_Sub1Array1[arg0].method10919(this.aClass141_Sub1Array1[arg0].method10909(local83.anInt5030 * -537553445, local83.aByteArray95, local83.anInt5029 * 12510669, local83.anInt5028 * -759106401, (byte) 8), -391562653);
			}
			return local67;
		} else {
			return this.aClass141_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "()Z")
	public boolean method30247() {
		if (this.aClass518_2 != null) {
			return true;
		}
		if (this.aClass80_Sub1_Sub15_Sub3_3 == null) {
			if (this.aClass139_9.method10788((short) 15245)) {
				return false;
			}
			this.aClass80_Sub1_Sub15_Sub3_3 = this.aClass139_9.method10799(255, 255, (byte) 0, true, 1507877235);
		}
		if (this.aClass80_Sub1_Sub15_Sub3_3.aBoolean661) {
			return false;
		}
		@Pc(39) Packet local39 = new Packet(this.aClass80_Sub1_Sub15_Sub3_3.method24390(-2133825886));
		this.aClass518_2 = new Class518(local39, this.aBigInteger7, this.aBigInteger8);
		if (this.aClass141_Sub1Array1 == null) {
			this.aClass141_Sub1Array1 = new Class141_Sub1[this.aClass518_2.aClass493Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass141_Sub1Array1.length; local62++) {
				if (this.aClass141_Sub1Array1[local62] != null) {
					@Pc(80) Class493 local80 = this.aClass518_2.aClass493Array1[local62];
					this.aClass141_Sub1Array1[local62].method10908(local80.anInt5030 * -537553445, local80.aByteArray95, local80.anInt5029 * 12510669, local80.anInt5028 * -759106401, 1552140105);
					if (this.aClass141_Sub1Array1[local62].method10920((byte) 36)) {
						this.aClass141_Sub1Array1[local62].method10919(false, 103561520);
					}
				}
			}
		}
		this.aBoolean882 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "(B)V")
	public void method30248(@OriginalArg(0) byte arg0) {
		if (this.aClass141_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass141_Sub1Array1.length; local5++) {
			if (this.aClass141_Sub1Array1[local5] != null) {
				this.aClass141_Sub1Array1[local5].method10911(-1258714269);
			}
		}
		for (local5 = 0; local5 < this.aClass141_Sub1Array1.length; local5++) {
			if (this.aClass141_Sub1Array1[local5] != null) {
				this.aClass141_Sub1Array1[local5].method10912((byte) 0);
			}
		}
		if (this.aClass518_2 == null) {
			this.method30244(-1752282390);
		} else if (this.aClass490_5 != null && !this.aBoolean882) {
			if (this.aClass80_Sub1_Sub15_Sub1_2 == null) {
				this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.method30222((byte) 4);
			} else if (!this.aClass80_Sub1_Sub15_Sub1_2.aBoolean661) {
				@Pc(77) byte[] local77 = this.aClass80_Sub1_Sub15_Sub1_2.method24390(-2133825886);
				try {
					this.aClass518_1 = new Class518(new Packet(local77), this.aBigInteger7, this.aBigInteger8);
					for (@Pc(92) int local92 = 0; local92 < this.aClass141_Sub1Array1.length; local92++) {
						if (this.aClass141_Sub1Array1[local92] != null && this.aClass141_Sub1Array1[local92].method10920((byte) 9)) {
							@Pc(116) Class493 local116 = this.aClass518_1.aClass493Array1[local92];
							this.aClass141_Sub1Array1[local92].method10919(this.aClass141_Sub1Array1[local92].method10909(local116.anInt5030 * -537553445, local116.aByteArray95, local116.anInt5029 * 12510669, local116.anInt5028 * -759106401, (byte) 8), -1737671525);
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.aClass141_Sub1Array1.length; local148++) {
						if (this.aClass141_Sub1Array1[local148] != null && this.aClass141_Sub1Array1[local148].method10920((byte) -22)) {
							this.aClass141_Sub1Array1[local148].method10919(false, 1951560295);
						}
					}
				}
				this.aClass80_Sub1_Sub15_Sub1_2 = null;
				this.aBoolean882 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30249(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -42);
	}

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30250(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) 95);
	}

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30251(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -79);
	}

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "()V")
	public void method30252() {
		if (this.aClass141_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass141_Sub1Array1.length; local5++) {
			if (this.aClass141_Sub1Array1[local5] != null) {
				this.aClass141_Sub1Array1[local5].method10911(-1234145457);
			}
		}
		for (local5 = 0; local5 < this.aClass141_Sub1Array1.length; local5++) {
			if (this.aClass141_Sub1Array1[local5] != null) {
				this.aClass141_Sub1Array1[local5].method10912((byte) 0);
			}
		}
		if (this.aClass518_2 == null) {
			this.method30244(1240865512);
		} else if (this.aClass490_5 != null && !this.aBoolean882) {
			if (this.aClass80_Sub1_Sub15_Sub1_2 == null) {
				this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.method30222((byte) 4);
			} else if (!this.aClass80_Sub1_Sub15_Sub1_2.aBoolean661) {
				@Pc(77) byte[] local77 = this.aClass80_Sub1_Sub15_Sub1_2.method24390(-2133825886);
				try {
					this.aClass518_1 = new Class518(new Packet(local77), this.aBigInteger7, this.aBigInteger8);
					for (@Pc(92) int local92 = 0; local92 < this.aClass141_Sub1Array1.length; local92++) {
						if (this.aClass141_Sub1Array1[local92] != null && this.aClass141_Sub1Array1[local92].method10920((byte) -3)) {
							@Pc(116) Class493 local116 = this.aClass518_1.aClass493Array1[local92];
							this.aClass141_Sub1Array1[local92].method10919(this.aClass141_Sub1Array1[local92].method10909(local116.anInt5030 * -537553445, local116.aByteArray95, local116.anInt5029 * 12510669, local116.anInt5028 * -759106401, (byte) 8), 413350632);
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.aClass141_Sub1Array1.length; local148++) {
						if (this.aClass141_Sub1Array1[local148] != null && this.aClass141_Sub1Array1[local148].method10920((byte) 16)) {
							this.aClass141_Sub1Array1[local148].method10919(false, -300897676);
						}
					}
				}
				this.aClass80_Sub1_Sub15_Sub1_2 = null;
				this.aBoolean882 = true;
			}
		}
	}
}
