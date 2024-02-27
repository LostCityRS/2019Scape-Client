package com.jagex;

import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aij")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!aij", name = "r", descriptor = "B")
	static final byte aByte18 = 1;

	@OriginalMember(owner = "client!aij", name = "ae", descriptor = "I")
	static final int anInt1310 = 250;

	@OriginalMember(owner = "client!aij", name = "c", descriptor = "B")
	static final byte aByte19 = 0;

	@OriginalMember(owner = "client!aij", name = "v", descriptor = "B")
	static final byte aByte20 = -1;

	@OriginalMember(owner = "client!aij", name = "al", descriptor = "I")
	static final int anInt1313 = 1;

	@OriginalMember(owner = "client!aij", name = "t", descriptor = "I")
	static final int anInt1316 = 1000;

	@OriginalMember(owner = "client!aij", name = "ah", descriptor = "I")
	static final int anInt1317 = 0;

	@OriginalMember(owner = "client!aij", name = "ac", descriptor = "I")
	static final int anInt1318 = 2;

	@OriginalMember(owner = "client!aij", name = "vn", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!aij", name = "ag", descriptor = "Ljava/util/zip/CRC32;")
	static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aij", name = "q", descriptor = "Z")
	boolean aBoolean245;

	@OriginalMember(owner = "client!aij", name = "d", descriptor = "Lclient!pl;")
	Class486 aClass486_1;

	@OriginalMember(owner = "client!aij", name = "x", descriptor = "Z")
	boolean aBoolean246;

	@OriginalMember(owner = "client!aij", name = "o", descriptor = "[B")
	byte[] aByteArray32;

	@OriginalMember(owner = "client!aij", name = "s", descriptor = "I")
	int anInt1315 = 0;

	@OriginalMember(owner = "client!aij", name = "y", descriptor = "Lclient!aan;")
	Class16 aClass16_8 = new Class16(16);

	@OriginalMember(owner = "client!aij", name = "h", descriptor = "I")
	int anInt1314 = 0;

	@OriginalMember(owner = "client!aij", name = "g", descriptor = "Lclient!aat;")
	Class22 aClass22_16 = new Class22();

	@OriginalMember(owner = "client!aij", name = "j", descriptor = "J")
	long aLong43 = 0L;

	@OriginalMember(owner = "client!aij", name = "e", descriptor = "I")
	int anInt1312;

	@OriginalMember(owner = "client!aij", name = "f", descriptor = "Lclient!uf;")
	Class593 aClass593_1;

	@OriginalMember(owner = "client!aij", name = "b", descriptor = "Z")
	boolean aBoolean247;

	@OriginalMember(owner = "client!aij", name = "a", descriptor = "Lclient!aat;")
	Class22 aClass22_15;

	@OriginalMember(owner = "client!aij", name = "w", descriptor = "Lclient!uf;")
	Class593 aClass593_2;

	@OriginalMember(owner = "client!aij", name = "n", descriptor = "Lclient!pp;")
	Class144 aClass144_1;

	@OriginalMember(owner = "client!aij", name = "m", descriptor = "Lclient!pu;")
	Class493 aClass493_1;

	@OriginalMember(owner = "client!aij", name = "k", descriptor = "Lclient!pf;")
	Class480 aClass480_1;

	@OriginalMember(owner = "client!aij", name = "u", descriptor = "I")
	int anInt1309;

	@OriginalMember(owner = "client!aij", name = "z", descriptor = "[B")
	byte[] aByteArray31;

	@OriginalMember(owner = "client!aij", name = "p", descriptor = "I")
	int anInt1311;

	@OriginalMember(owner = "client!aij", name = "i", descriptor = "Z")
	boolean aBoolean248;

	@OriginalMember(owner = "client!aij", name = "l", descriptor = "Lclient!ask;")
	Class93_Sub1_Sub16 aClass93_Sub1_Sub16_1;

	@OriginalMember(owner = "client!aij", name = "o", descriptor = "(B)V")
	static void method11106(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!aij", name = "<init>", descriptor = "(ILclient!uf;Lclient!uf;Lclient!pp;Lclient!pu;Lclient!pf;I[BIZI)V")
	Class143_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) Class144 arg3, @OriginalArg(4) Class493 arg4, @OriginalArg(5) Class480 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt1312 = arg0 * -1231449163;
		this.aClass593_1 = arg1;
		if (this.aClass593_1 == null) {
			this.aBoolean247 = false;
		} else {
			this.aBoolean247 = true;
			this.aClass22_15 = new Class22();
		}
		this.aClass593_2 = arg2;
		this.aClass144_1 = arg3;
		this.aClass493_1 = arg4;
		this.aClass480_1 = arg5;
		this.anInt1309 = arg6 * -1825906863;
		this.aByteArray31 = arg7;
		this.anInt1311 = arg8 * 1963174561;
		this.aBoolean248 = arg9;
		if (this.aClass593_2 != null) {
			this.aClass93_Sub1_Sub16_1 = this.aClass480_1.method29921(this.anInt1312 * 1235550877, this.aClass593_2, (short) -4389);
		}
	}

	@OriginalMember(owner = "client!aij", name = "as", descriptor = "()I")
	public int method11068() {
		if (this.method11050((byte) 82) == null) {
			return this.aClass93_Sub1_Sub16_1 == null ? 0 : this.aClass93_Sub1_Sub16_1.method23995(-1032462931);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aij", name = "o", descriptor = "(I[BIII)V")
	void method11069(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.method11070(arg0, arg1, arg2, arg3, 945946910)) {
			return;
		}
		this.anInt1309 = arg0 * -1825906863;
		this.aByteArray31 = arg1;
		this.anInt1311 = arg2 * 1963174561;
		this.aClass486_1 = null;
		this.aClass93_Sub1_Sub16_1 = null;
		if (!this.aClass144_1.method11146(-1373576463)) {
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
	}

	@OriginalMember(owner = "client!aij", name = "s", descriptor = "(I[BIII)Z")
	boolean method11070(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == this.anInt1309 * -1502230095 && arg2 == this.anInt1311 * -1634813599) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray31.length; local15++) {
				if (this.aByteArray31[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aij", name = "y", descriptor = "(I)I")
	public int method11071(@OriginalArg(0) int arg0) {
		if (this.method11050((byte) 70) == null) {
			return this.aClass93_Sub1_Sub16_1 == null ? 0 : this.aClass93_Sub1_Sub16_1.method23995(-303324333);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aij", name = "e", descriptor = "(B)Lclient!pl;")
	@Override
	Class486 method11050(@OriginalArg(0) byte arg0) {
		if (this.aClass486_1 != null) {
			return this.aClass486_1;
		}
		if (this.aClass93_Sub1_Sub16_1 == null) {
			if (this.aClass144_1.method11146(-1878776934)) {
				return null;
			}
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
		if (this.aClass93_Sub1_Sub16_1.aBoolean547) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass93_Sub1_Sub16_1.method23993(1918537828);
		if (this.aClass93_Sub1_Sub16_1 instanceof Class93_Sub1_Sub16_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
				if (this.anInt1311 * -1634813599 != this.aClass486_1.anInt5310 * 1689809385) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-1271400102)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass144_1.method11149(255, this.anInt1312 * 1235550877, (byte) -20);
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-733647972)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
			if (this.aClass593_2 != null) {
				this.aClass480_1.method29912(this.anInt1312 * 1235550877, local40, this.aClass593_2, -516125166);
			}
		}
		this.aClass93_Sub1_Sub16_1 = null;
		if (this.aClass593_1 != null) {
			this.aByteArray32 = new byte[this.aClass486_1.anInt5309 * 1408935145];
			this.anInt1315 = 0;
		}
		return this.aClass486_1;
	}

	@OriginalMember(owner = "client!aij", name = "n", descriptor = "(II)[B")
	@Override
	byte[] method11051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1_Sub16 local5 = this.method11096(arg0, 0, (byte) -28);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.method23993(466364920);
			local5.method23981(-1014745659);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aij", name = "z", descriptor = "(I)V")
	@Override
	void method11058(@OriginalArg(0) int arg0) {
		if (this.aClass593_1 == null) {
			return;
		}
		@Pc(8) Class93 local8;
		for (local8 = this.aClass22_16.method445((byte) 62); local8 != null; local8 = this.aClass22_16.method415(2112728214)) {
			if (local8.aLong232 * -3750704643647536275L == (long) arg0) {
				return;
			}
		}
		local8 = new Class93();
		local8.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_16.method407(local8, -17053297);
	}

	@OriginalMember(owner = "client!aij", name = "ar", descriptor = "()I")
	public int method11072() {
		return this.aClass486_1 == null ? 0 : this.aClass486_1.anInt5307 * -1801657203;
	}

	@OriginalMember(owner = "client!aij", name = "b", descriptor = "(B)V")
	void method11073(@OriginalArg(0) byte arg0) {
		if (this.aClass22_15 != null) {
			if (this.method11050((byte) 111) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class93 local17;
			@Pc(25) int local25;
			if (this.aBoolean247) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 99); local17 != null; local17 = this.aClass22_15.method415(1565471227)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] == 0) {
						this.method11096(local25, 1, (byte) -31);
					}
					if (this.aByteArray32[local25] == 0) {
						local12 = false;
					} else {
						local17.method23981(-1619506942);
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass480_1.anInt5295 * -283161317 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							this.method11096(this.anInt1314 * -257432311, 1, (byte) -75);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, -1246883777);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean247 = false;
					this.anInt1314 = 0;
				}
			} else if (this.aBoolean245) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 63); local17 != null; local17 = this.aClass22_15.method415(706752731)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] != 1) {
						this.method11096(local25, 2, (byte) -122);
					}
					if (this.aByteArray32[local25] == 1) {
						local17.method23981(95790989);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass144_1.method11162(-771229500)) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							this.method11096(this.anInt1314 * -257432311, 2, (byte) -8);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, 333653421);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean245 = false;
					this.anInt1314 = 0;
				}
			} else {
				this.aClass22_15 = null;
			}
		}
		if (!this.aBoolean248 || Class305.method26889(353670921) < this.aLong43 * -8435366074243400701L) {
			return;
		}
		for (@Pc(314) Class93_Sub1_Sub16 local314 = (Class93_Sub1_Sub16) this.aClass16_8.method220((byte) 35); local314 != null; local314 = (Class93_Sub1_Sub16) this.aClass16_8.method222(1943427181)) {
			if (!local314.aBoolean547) {
				if (local314.aBoolean546) {
					if (!local314.aBoolean545) {
						throw new RuntimeException();
					}
					local314.method23981(-862081714);
				} else {
					local314.aBoolean546 = true;
				}
			}
		}
		this.aLong43 = (Class305.method26889(574012312) + 1000L) * 735918347814063787L;
	}

	@OriginalMember(owner = "client!aij", name = "h", descriptor = "(B)I")
	public int method11074(@OriginalArg(0) byte arg0) {
		return this.aClass486_1 == null ? 0 : this.aClass486_1.anInt5307 * -1801657203;
	}

	@OriginalMember(owner = "client!aij", name = "a", descriptor = "(B)I")
	public int method11075(@OriginalArg(0) byte arg0) {
		return this.anInt1315 * -1256399305;
	}

	@OriginalMember(owner = "client!aij", name = "g", descriptor = "(I)I")
	public int method11076(@OriginalArg(0) int arg0) {
		if (this.aClass486_1 == null) {
			return 0;
		} else if (this.aBoolean247) {
			@Pc(19) Class93 local19 = this.aClass22_15.method445((byte) 46);
			return local19 == null ? 0 : (int) (local19.aLong232 * -3750704643647536275L);
		} else {
			return this.aClass486_1.anInt5307 * -1801657203;
		}
	}

	@OriginalMember(owner = "client!aij", name = "i", descriptor = "(I)V")
	public void method11077(@OriginalArg(0) int arg0) {
		if (this.aClass493_1 != null || this.aClass593_1 == null) {
			return;
		}
		this.aBoolean245 = true;
		this.aBoolean246 = true;
		if (this.aClass22_15 == null) {
			this.aClass22_15 = new Class22();
		}
	}

	@OriginalMember(owner = "client!aij", name = "m", descriptor = "(IB)V")
	@Override
	void method11053(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass593_1 == null) {
			return;
		}
		@Pc(8) Class93 local8;
		for (local8 = this.aClass22_16.method445((byte) 105); local8 != null; local8 = this.aClass22_16.method415(353908817)) {
			if (local8.aLong232 * -3750704643647536275L == (long) arg0) {
				return;
			}
		}
		local8 = new Class93();
		local8.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_16.method407(local8, -726939052);
	}

	@OriginalMember(owner = "client!aij", name = "k", descriptor = "(II)I")
	@Override
	int method11052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class93_Sub1_Sub16 local6 = (Class93_Sub1_Sub16) this.aClass16_8.method215((long) arg0);
		return local6 == null ? 0 : local6.method23995(-212637632);
	}

	@OriginalMember(owner = "client!aij", name = "d", descriptor = "(I)V")
	@Override
	void method11060(@OriginalArg(0) int arg0) {
		if (this.aClass593_1 == null) {
			return;
		}
		@Pc(8) Class93 local8;
		for (local8 = this.aClass22_16.method445((byte) 41); local8 != null; local8 = this.aClass22_16.method415(199547374)) {
			if (local8.aLong232 * -3750704643647536275L == (long) arg0) {
				return;
			}
		}
		local8 = new Class93();
		local8.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_16.method407(local8, -1509912529);
	}

	@OriginalMember(owner = "client!aij", name = "v", descriptor = "(I)I")
	@Override
	int method11062(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub16 local6 = (Class93_Sub1_Sub16) this.aClass16_8.method215((long) arg0);
		return local6 == null ? 0 : local6.method23995(-1236852294);
	}

	@OriginalMember(owner = "client!aij", name = "ae", descriptor = "(I)Z")
	boolean method11078(@OriginalArg(0) int arg0) {
		return this.aClass493_1 != null;
	}

	@OriginalMember(owner = "client!aij", name = "aw", descriptor = "(I[BII)Z")
	boolean method11079(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1309 * -1502230095 && arg2 == this.anInt1311 * -1634813599) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray31.length; local15++) {
				if (this.aByteArray31[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aij", name = "w", descriptor = "()Lclient!pl;")
	@Override
	Class486 method11057() {
		if (this.aClass486_1 != null) {
			return this.aClass486_1;
		}
		if (this.aClass93_Sub1_Sub16_1 == null) {
			if (this.aClass144_1.method11146(-1634508828)) {
				return null;
			}
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
		if (this.aClass93_Sub1_Sub16_1.aBoolean547) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass93_Sub1_Sub16_1.method23993(717440841);
		if (this.aClass93_Sub1_Sub16_1 instanceof Class93_Sub1_Sub16_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
				if (this.anInt1311 * -1634813599 != this.aClass486_1.anInt5310 * 1689809385) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-1751194861)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass144_1.method11149(255, this.anInt1312 * 1235550877, (byte) -38);
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-977789278)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
			if (this.aClass593_2 != null) {
				this.aClass480_1.method29912(this.anInt1312 * 1235550877, local40, this.aClass593_2, 327657689);
			}
		}
		this.aClass93_Sub1_Sub16_1 = null;
		if (this.aClass593_1 != null) {
			this.aByteArray32 = new byte[this.aClass486_1.anInt5309 * 1408935145];
			this.anInt1315 = 0;
		}
		return this.aClass486_1;
	}

	@OriginalMember(owner = "client!aij", name = "l", descriptor = "(I)[B")
	@Override
	byte[] method11056(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub16 local5 = this.method11096(arg0, 0, (byte) 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.method23993(-419499853);
			local5.method23981(-995089327);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aij", name = "u", descriptor = "(I)[B")
	@Override
	byte[] method11049(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub16 local5 = this.method11096(arg0, 0, (byte) 1);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.method23993(-1976124095);
			local5.method23981(401475814);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aij", name = "t", descriptor = "(ZS)V")
	void method11080(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		this.aClass493_1.method30171(arg0, (byte) -29);
	}

	@OriginalMember(owner = "client!aij", name = "x", descriptor = "(I)V")
	void method11081(@OriginalArg(0) int arg0) {
		if (this.aClass22_15 == null || this.method11050((byte) 116) == null) {
			return;
		}
		for (@Pc(13) Class93 local13 = this.aClass22_16.method445((byte) 41); local13 != null; local13 = this.aClass22_16.method415(2126823096)) {
			@Pc(22) int local22 = (int) (local13.aLong232 * -3750704643647536275L);
			if (local22 < 0 || local22 >= this.aClass486_1.anInt5309 * 1408935145 || this.aClass486_1.anIntArray461[local22] == 0) {
				local13.method23981(-1423197976);
			} else {
				if (this.aByteArray32[local22] == 0) {
					this.method11096(local22, 1, (byte) -127);
				}
				if (this.aByteArray32[local22] == -1) {
					this.method11096(local22, 2, (byte) -43);
				}
				if (this.aByteArray32[local22] == 1) {
					local13.method23981(1471022643);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aij", name = "ac", descriptor = "(I[BII)V")
	void method11082(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11070(arg0, arg1, arg2, arg3, 829697262)) {
			return;
		}
		this.anInt1309 = arg0 * -1825906863;
		this.aByteArray31 = arg1;
		this.anInt1311 = arg2 * 1963174561;
		this.aClass486_1 = null;
		this.aClass93_Sub1_Sub16_1 = null;
		if (!this.aClass144_1.method11146(-1059645684)) {
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
	}

	@OriginalMember(owner = "client!aij", name = "c", descriptor = "(I)V")
	@Override
	void method11061(@OriginalArg(0) int arg0) {
		if (this.aClass593_1 == null) {
			return;
		}
		@Pc(8) Class93 local8;
		for (local8 = this.aClass22_16.method445((byte) 99); local8 != null; local8 = this.aClass22_16.method415(500242410)) {
			if (local8.aLong232 * -3750704643647536275L == (long) arg0) {
				return;
			}
		}
		local8 = new Class93();
		local8.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_16.method407(local8, -1902703147);
	}

	@OriginalMember(owner = "client!aij", name = "r", descriptor = "(I)I")
	@Override
	int method11055(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub16 local6 = (Class93_Sub1_Sub16) this.aClass16_8.method215((long) arg0);
		return local6 == null ? 0 : local6.method23995(-223460991);
	}

	@OriginalMember(owner = "client!aij", name = "am", descriptor = "()V")
	void method11083() {
		if (this.aClass22_15 != null) {
			if (this.method11050((byte) 25) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class93 local17;
			@Pc(25) int local25;
			if (this.aBoolean247) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 35); local17 != null; local17 = this.aClass22_15.method415(140769992)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] == 0) {
						this.method11096(local25, 1, (byte) -18);
					}
					if (this.aByteArray32[local25] == 0) {
						local12 = false;
					} else {
						local17.method23981(156649471);
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass480_1.anInt5295 * -283161317 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							this.method11096(this.anInt1314 * -257432311, 1, (byte) -108);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, -672560628);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean247 = false;
					this.anInt1314 = 0;
				}
			} else if (this.aBoolean245) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 107); local17 != null; local17 = this.aClass22_15.method415(33679268)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] != 1) {
						this.method11096(local25, 2, (byte) -53);
					}
					if (this.aByteArray32[local25] == 1) {
						local17.method23981(-874615251);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass144_1.method11162(-771229500)) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							this.method11096(this.anInt1314 * -257432311, 2, (byte) -116);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, 554879568);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean245 = false;
					this.anInt1314 = 0;
				}
			} else {
				this.aClass22_15 = null;
			}
		}
		if (!this.aBoolean248 || Class305.method26889(-219291731) < this.aLong43 * -8435366074243400701L) {
			return;
		}
		for (@Pc(314) Class93_Sub1_Sub16 local314 = (Class93_Sub1_Sub16) this.aClass16_8.method220((byte) 99); local314 != null; local314 = (Class93_Sub1_Sub16) this.aClass16_8.method222(2124656698)) {
			if (!local314.aBoolean547) {
				if (local314.aBoolean546) {
					if (!local314.aBoolean545) {
						throw new RuntimeException();
					}
					local314.method23981(-303764322);
				} else {
					local314.aBoolean546 = true;
				}
			}
		}
		this.aLong43 = (Class305.method26889(1694323987) + 1000L) * 735918347814063787L;
	}

	@OriginalMember(owner = "client!aij", name = "ag", descriptor = "(I[BII)V")
	void method11084(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11070(arg0, arg1, arg2, arg3, 744018745)) {
			return;
		}
		this.anInt1309 = arg0 * -1825906863;
		this.aByteArray31 = arg1;
		this.anInt1311 = arg2 * 1963174561;
		this.aClass486_1 = null;
		this.aClass93_Sub1_Sub16_1 = null;
		if (!this.aClass144_1.method11146(-1842480739)) {
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
	}

	@OriginalMember(owner = "client!aij", name = "j", descriptor = "(I)Z")
	public boolean method11085(@OriginalArg(0) int arg0) {
		return this.aBoolean246;
	}

	@OriginalMember(owner = "client!aij", name = "al", descriptor = "(I[BII)V")
	void method11086(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11070(arg0, arg1, arg2, arg3, 340495006)) {
			return;
		}
		this.anInt1309 = arg0 * -1825906863;
		this.aByteArray31 = arg1;
		this.anInt1311 = arg2 * 1963174561;
		this.aClass486_1 = null;
		this.aClass93_Sub1_Sub16_1 = null;
		if (!this.aClass144_1.method11146(-1246653731)) {
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
	}

	@OriginalMember(owner = "client!aij", name = "f", descriptor = "()Lclient!pl;")
	@Override
	Class486 method11054() {
		if (this.aClass486_1 != null) {
			return this.aClass486_1;
		}
		if (this.aClass93_Sub1_Sub16_1 == null) {
			if (this.aClass144_1.method11146(-1756253094)) {
				return null;
			}
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
		if (this.aClass93_Sub1_Sub16_1.aBoolean547) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass93_Sub1_Sub16_1.method23993(1471173407);
		if (this.aClass93_Sub1_Sub16_1 instanceof Class93_Sub1_Sub16_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
				if (this.anInt1311 * -1634813599 != this.aClass486_1.anInt5310 * 1689809385) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-1054964318)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass486_1 = new Class486(local40, this.anInt1309 * -1502230095, this.aByteArray31);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass144_1.method11149(255, this.anInt1312 * 1235550877, (byte) -40);
				this.aClass486_1 = null;
				if (this.aClass144_1.method11146(-1189843350)) {
					this.aClass93_Sub1_Sub16_1 = null;
				} else {
					this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
				}
				return null;
			}
			if (this.aClass593_2 != null) {
				this.aClass480_1.method29912(this.anInt1312 * 1235550877, local40, this.aClass593_2, -2017075143);
			}
		}
		this.aClass93_Sub1_Sub16_1 = null;
		if (this.aClass593_1 != null) {
			this.aByteArray32 = new byte[this.aClass486_1.anInt5309 * 1408935145];
			this.anInt1315 = 0;
		}
		return this.aClass486_1;
	}

	@OriginalMember(owner = "client!aij", name = "ai", descriptor = "(I[BII)Z")
	boolean method11087(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1309 * -1502230095 && arg2 == this.anInt1311 * -1634813599) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray31.length; local15++) {
				if (this.aByteArray31[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aij", name = "ax", descriptor = "()I")
	public int method11088() {
		if (this.aClass486_1 == null) {
			return 0;
		} else if (this.aBoolean247) {
			@Pc(19) Class93 local19 = this.aClass22_15.method445((byte) 80);
			return local19 == null ? 0 : (int) (local19.aLong232 * -3750704643647536275L);
		} else {
			return this.aClass486_1.anInt5307 * -1801657203;
		}
	}

	@OriginalMember(owner = "client!aij", name = "at", descriptor = "()I")
	public int method11089() {
		if (this.method11050((byte) 28) == null) {
			return this.aClass93_Sub1_Sub16_1 == null ? 0 : this.aClass93_Sub1_Sub16_1.method23995(-1174592184);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aij", name = "ad", descriptor = "(II)Lclient!ask;")
	Class93_Sub1_Sub16 method11090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class93_Sub1_Sub16 local6 = (Class93_Sub1_Sub16) this.aClass16_8.method215((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean545 && local6.aBoolean547) {
			local6.method23981(-831856898);
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass593_1 != null && this.aByteArray32[arg0] != -1) {
					local6 = this.aClass480_1.method29921(arg0, this.aClass593_1, (short) 24278);
				} else if (this.aClass493_1 == null) {
					if (this.aClass144_1.method11146(-1535456480)) {
						return null;
					}
					local6 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
				} else {
					local6 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], 25458017);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass593_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass480_1.method29920(arg0, this.aClass593_1, (byte) 6);
			} else if (arg1 == 2) {
				if (this.aClass593_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray32[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass493_1 != null) {
					return null;
				}
				if (this.aClass144_1.method11162(-771229500)) {
					return null;
				}
				local6 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, false, -1197137783);
			} else {
				throw new RuntimeException();
			}
			this.aClass16_8.method221(local6, (long) arg0);
		}
		if (local6.aBoolean547) {
			return null;
		}
		@Pc(180) byte[] local180 = local6.method23993(1300854653);
		@Pc(208) int local208;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(369) Class93_Sub1_Sub16_Sub1 local369;
		@Pc(396) Class93_Sub1_Sub16_Sub3 local396;
		if (!(local6 instanceof Class93_Sub1_Sub16_Sub2)) {
			try {
				if (local180 == null || local180.length <= 2) {
					if (this.aClass493_1 != null) {
						local6.method23981(-1109860091);
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local180, 0, local180.length - 2);
				local208 = (int) aCRC32_1.getValue();
				if (this.aClass486_1.anIntArray457[arg0] != local208) {
					throw new RuntimeException();
				}
				if (this.aClass486_1.aByteArrayArray16 != null && this.aClass486_1.aByteArrayArray16[arg0] != null) {
					local237 = this.aClass486_1.aByteArrayArray16[arg0];
					local246 = Class53_Sub1.method14965(local180, 0, local180.length - 2, 573616195);
					for (local248 = 0; local248 < 64; local248++) {
						if (local246[local248] != local237[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass493_1 != null) {
					this.aClass144_1.anInt1338 = 0;
					this.aClass144_1.anInt1337 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass144_1.method11149(this.anInt1312 * 1235550877, arg0, (byte) -44);
				local6.method23981(-279915149);
				if (local6.aBoolean545) {
					if (this.aClass493_1 == null) {
						if (!this.aClass144_1.method11146(-1831416486)) {
							local396 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
							this.aClass16_8.method221(local396, (long) arg0);
						}
					} else if (!this.aClass493_1.method30166(1487378033)) {
						local369 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], -1186695760);
						if (local369 != null) {
							this.aClass16_8.method221(local369, (long) arg0);
						}
					}
				}
				return null;
			}
			local180[local180.length - 2] = (byte) (this.aClass486_1.anIntArray460[arg0] >>> 8);
			local180[local180.length - 1] = (byte) this.aClass486_1.anIntArray460[arg0];
			if (this.aClass593_1 != null) {
				this.aClass480_1.method29912(arg0, local180, this.aClass593_1, -947457198);
				if (this.aByteArray32[arg0] != 1) {
					this.anInt1315 += -104908921;
					this.aByteArray32[arg0] = 1;
				}
			}
			if (!local6.aBoolean545) {
				local6.method23981(-1888094888);
			}
			return local6;
		}
		try {
			if (local180 == null || local180.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local180, 0, local180.length - 2);
			local208 = (int) aCRC32_1.getValue();
			if (this.aClass486_1.anIntArray457[arg0] != local208) {
				throw new RuntimeException();
			}
			if (this.aClass486_1.aByteArrayArray16 != null && this.aClass486_1.aByteArrayArray16[arg0] != null) {
				local237 = this.aClass486_1.aByteArrayArray16[arg0];
				local246 = Class53_Sub1.method14965(local180, 0, local180.length - 2, 573616195);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = (local180[local180.length - 1] & 0xFF) + ((local180[local180.length - 2] & 0xFF) << 8);
			if ((this.aClass486_1.anIntArray460[arg0] & 0xFFFF) != local284) {
				throw new RuntimeException();
			}
			if (this.aByteArray32[arg0] != 1) {
				if (this.aByteArray32[arg0] == 0) {
				}
				this.anInt1315 += -104908921;
				this.aByteArray32[arg0] = 1;
			}
			if (!local6.aBoolean545) {
				local6.method23981(1936577832);
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray32[arg0] = -1;
			local6.method23981(1729580647);
			if (local6.aBoolean545) {
				if (this.aClass493_1 == null) {
					if (!this.aClass144_1.method11146(-1845454248)) {
						local396 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
						this.aClass16_8.method221(local396, (long) arg0);
					}
				} else if (!this.aClass493_1.method30166(1357639635)) {
					local369 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], -1935873616);
					if (local369 != null) {
						this.aClass16_8.method221(local369, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aij", name = "af", descriptor = "()Z")
	boolean method11091() {
		return this.aClass493_1 != null;
	}

	@OriginalMember(owner = "client!aij", name = "au", descriptor = "()V")
	void method11092() {
		if (this.aClass22_15 != null) {
			if (this.method11050((byte) 119) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class93 local17;
			@Pc(25) int local25;
			if (this.aBoolean247) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 54); local17 != null; local17 = this.aClass22_15.method415(1888370090)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] == 0) {
						this.method11096(local25, 1, (byte) -50);
					}
					if (this.aByteArray32[local25] == 0) {
						local12 = false;
					} else {
						local17.method23981(-337372903);
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass480_1.anInt5295 * -283161317 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							this.method11096(this.anInt1314 * -257432311, 1, (byte) -14);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] == 0) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, 237950267);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean247 = false;
					this.anInt1314 = 0;
				}
			} else if (this.aBoolean245) {
				local12 = true;
				for (local17 = this.aClass22_15.method445((byte) 121); local17 != null; local17 = this.aClass22_15.method415(1034680858)) {
					local25 = (int) (local17.aLong232 * -3750704643647536275L);
					if (this.aByteArray32[local25] != 1) {
						this.method11096(local25, 2, (byte) -41);
					}
					if (this.aByteArray32[local25] == 1) {
						local17.method23981(1412418420);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1314 * -257432311 < this.aClass486_1.anIntArray461.length) {
					if (this.aClass486_1.anIntArray461[this.anInt1314 * -257432311] == 0) {
						this.anInt1314 += 1382496569;
					} else {
						if (this.aClass144_1.method11162(-771229500)) {
							local12 = false;
							break;
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							this.method11096(this.anInt1314 * -257432311, 2, (byte) -108);
						}
						if (this.aByteArray32[this.anInt1314 * -257432311] != 1) {
							local17 = new Class93();
							local17.aLong232 = (long) this.anInt1314 * 6929230668733860493L;
							this.aClass22_15.method407(local17, 580688525);
							local12 = false;
						}
						this.anInt1314 += 1382496569;
					}
				}
				if (local12) {
					this.aBoolean245 = false;
					this.anInt1314 = 0;
				}
			} else {
				this.aClass22_15 = null;
			}
		}
		if (!this.aBoolean248 || Class305.method26889(998693599) < this.aLong43 * -8435366074243400701L) {
			return;
		}
		for (@Pc(314) Class93_Sub1_Sub16 local314 = (Class93_Sub1_Sub16) this.aClass16_8.method220((byte) 15); local314 != null; local314 = (Class93_Sub1_Sub16) this.aClass16_8.method222(1709879439)) {
			if (!local314.aBoolean547) {
				if (local314.aBoolean546) {
					if (!local314.aBoolean545) {
						throw new RuntimeException();
					}
					local314.method23981(-1726699393);
				} else {
					local314.aBoolean546 = true;
				}
			}
		}
		this.aLong43 = (Class305.method26889(-63509706) + 1000L) * 735918347814063787L;
	}

	@OriginalMember(owner = "client!aij", name = "ak", descriptor = "()Z")
	boolean method11093() {
		return this.aClass493_1 != null;
	}

	@OriginalMember(owner = "client!aij", name = "ap", descriptor = "()I")
	public int method11094() {
		return this.anInt1315 * -1256399305;
	}

	@OriginalMember(owner = "client!aij", name = "aq", descriptor = "()I")
	public int method11095() {
		if (this.aClass486_1 == null) {
			return 0;
		} else if (this.aBoolean247) {
			@Pc(19) Class93 local19 = this.aClass22_15.method445((byte) 76);
			return local19 == null ? 0 : (int) (local19.aLong232 * -3750704643647536275L);
		} else {
			return this.aClass486_1.anInt5307 * -1801657203;
		}
	}

	@OriginalMember(owner = "client!aij", name = "q", descriptor = "(IIB)Lclient!ask;")
	Class93_Sub1_Sub16 method11096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(6) Class93_Sub1_Sub16 local6 = (Class93_Sub1_Sub16) this.aClass16_8.method215((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean545 && local6.aBoolean547) {
			local6.method23981(-1992586430);
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass593_1 != null && this.aByteArray32[arg0] != -1) {
					local6 = this.aClass480_1.method29921(arg0, this.aClass593_1, (short) 5292);
				} else if (this.aClass493_1 == null) {
					if (this.aClass144_1.method11146(-1013193058)) {
						return null;
					}
					local6 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
				} else {
					local6 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], -971958172);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass593_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass480_1.method29920(arg0, this.aClass593_1, (byte) 6);
			} else if (arg1 == 2) {
				if (this.aClass593_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray32[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass493_1 != null) {
					return null;
				}
				if (this.aClass144_1.method11162(-771229500)) {
					return null;
				}
				local6 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, false, -1197137783);
			} else {
				throw new RuntimeException();
			}
			this.aClass16_8.method221(local6, (long) arg0);
		}
		if (local6.aBoolean547) {
			return null;
		}
		@Pc(180) byte[] local180 = local6.method23993(-1498790994);
		@Pc(208) int local208;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(369) Class93_Sub1_Sub16_Sub1 local369;
		@Pc(396) Class93_Sub1_Sub16_Sub3 local396;
		if (!(local6 instanceof Class93_Sub1_Sub16_Sub2)) {
			try {
				if (local180 == null || local180.length <= 2) {
					if (this.aClass493_1 != null) {
						local6.method23981(2053332306);
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local180, 0, local180.length - 2);
				local208 = (int) aCRC32_1.getValue();
				if (this.aClass486_1.anIntArray457[arg0] != local208) {
					throw new RuntimeException();
				}
				if (this.aClass486_1.aByteArrayArray16 != null && this.aClass486_1.aByteArrayArray16[arg0] != null) {
					local237 = this.aClass486_1.aByteArrayArray16[arg0];
					local246 = Class53_Sub1.method14965(local180, 0, local180.length - 2, 573616195);
					for (local248 = 0; local248 < 64; local248++) {
						if (local246[local248] != local237[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass493_1 != null) {
					this.aClass144_1.anInt1338 = 0;
					this.aClass144_1.anInt1337 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass144_1.method11149(this.anInt1312 * 1235550877, arg0, (byte) -35);
				local6.method23981(-260995621);
				if (local6.aBoolean545) {
					if (this.aClass493_1 == null) {
						if (!this.aClass144_1.method11146(-838940287)) {
							local396 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
							this.aClass16_8.method221(local396, (long) arg0);
						}
					} else if (!this.aClass493_1.method30166(1320679553)) {
						local369 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], -251037052);
						if (local369 != null) {
							this.aClass16_8.method221(local369, (long) arg0);
						}
					}
				}
				return null;
			}
			local180[local180.length - 2] = (byte) (this.aClass486_1.anIntArray460[arg0] >>> 8);
			local180[local180.length - 1] = (byte) this.aClass486_1.anIntArray460[arg0];
			if (this.aClass593_1 != null) {
				this.aClass480_1.method29912(arg0, local180, this.aClass593_1, -1931572930);
				if (this.aByteArray32[arg0] != 1) {
					this.anInt1315 += -104908921;
					this.aByteArray32[arg0] = 1;
				}
			}
			if (!local6.aBoolean545) {
				local6.method23981(271382333);
			}
			return local6;
		}
		try {
			if (local180 == null || local180.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local180, 0, local180.length - 2);
			local208 = (int) aCRC32_1.getValue();
			if (this.aClass486_1.anIntArray457[arg0] != local208) {
				throw new RuntimeException();
			}
			if (this.aClass486_1.aByteArrayArray16 != null && this.aClass486_1.aByteArrayArray16[arg0] != null) {
				local237 = this.aClass486_1.aByteArrayArray16[arg0];
				local246 = Class53_Sub1.method14965(local180, 0, local180.length - 2, 573616195);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = (local180[local180.length - 1] & 0xFF) + ((local180[local180.length - 2] & 0xFF) << 8);
			if ((this.aClass486_1.anIntArray460[arg0] & 0xFFFF) != local284) {
				throw new RuntimeException();
			}
			if (this.aByteArray32[arg0] != 1) {
				if (this.aByteArray32[arg0] == 0) {
				}
				this.anInt1315 += -104908921;
				this.aByteArray32[arg0] = 1;
			}
			if (!local6.aBoolean545) {
				local6.method23981(1383306746);
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray32[arg0] = -1;
			local6.method23981(-1464123555);
			if (local6.aBoolean545) {
				if (this.aClass493_1 == null) {
					if (!this.aClass144_1.method11146(-1753104292)) {
						local396 = this.aClass144_1.method11145(this.anInt1312 * 1235550877, arg0, (byte) 2, true, -1197137783);
						this.aClass16_8.method221(local396, (long) arg0);
					}
				} else if (!this.aClass493_1.method30166(1957188001)) {
					local369 = this.aClass493_1.method30186(this.anInt1312 * 1235550877, arg0, (byte) 2, true, this.aClass486_1.anIntArray457[arg0], this.aClass486_1.anIntArray460[arg0], 1226422043);
					if (local369 != null) {
						this.aClass16_8.method221(local369, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aij", name = "p", descriptor = "(I)V")
	@Override
	void method11059(@OriginalArg(0) int arg0) {
		if (this.aClass593_1 == null) {
			return;
		}
		@Pc(8) Class93 local8;
		for (local8 = this.aClass22_16.method445((byte) 59); local8 != null; local8 = this.aClass22_16.method415(1628966523)) {
			if (local8.aLong232 * -3750704643647536275L == (long) arg0) {
				return;
			}
		}
		local8 = new Class93();
		local8.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_16.method407(local8, -1929830842);
	}

	@OriginalMember(owner = "client!aij", name = "ao", descriptor = "()V")
	public void method11097() {
		if (this.aClass493_1 != null || this.aClass593_1 == null) {
			return;
		}
		this.aBoolean245 = true;
		this.aBoolean246 = true;
		if (this.aClass22_15 == null) {
			this.aClass22_15 = new Class22();
		}
	}

	@OriginalMember(owner = "client!aij", name = "aj", descriptor = "()Z")
	public boolean method11098() {
		return this.aBoolean246;
	}

	@OriginalMember(owner = "client!aij", name = "ay", descriptor = "()Z")
	public boolean method11099() {
		return this.aBoolean246;
	}

	@OriginalMember(owner = "client!aij", name = "ab", descriptor = "(Z)V")
	void method11100(@OriginalArg(0) boolean arg0) {
		this.aClass493_1.method30171(arg0, (byte) -13);
	}

	@OriginalMember(owner = "client!aij", name = "az", descriptor = "(Z)V")
	void method11101(@OriginalArg(0) boolean arg0) {
		this.aClass493_1.method30171(arg0, (byte) 24);
	}

	@OriginalMember(owner = "client!aij", name = "aa", descriptor = "(Z)V")
	void method11102(@OriginalArg(0) boolean arg0) {
		this.aClass493_1.method30171(arg0, (byte) -6);
	}

	@OriginalMember(owner = "client!aij", name = "av", descriptor = "()V")
	public void method11103() {
		if (this.aClass493_1 != null || this.aClass593_1 == null) {
			return;
		}
		this.aBoolean245 = true;
		this.aBoolean246 = true;
		if (this.aClass22_15 == null) {
			this.aClass22_15 = new Class22();
		}
	}

	@OriginalMember(owner = "client!aij", name = "ah", descriptor = "(I[BII)V")
	void method11104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11070(arg0, arg1, arg2, arg3, 900480837)) {
			return;
		}
		this.anInt1309 = arg0 * -1825906863;
		this.aByteArray31 = arg1;
		this.anInt1311 = arg2 * 1963174561;
		this.aClass486_1 = null;
		this.aClass93_Sub1_Sub16_1 = null;
		if (!this.aClass144_1.method11146(-1186293798)) {
			this.aClass93_Sub1_Sub16_1 = this.aClass144_1.method11145(255, this.anInt1312 * 1235550877, (byte) 0, true, -1197137783);
		}
	}

	@OriginalMember(owner = "client!aij", name = "an", descriptor = "()Z")
	boolean method11105() {
		return this.aClass493_1 != null;
	}
}
