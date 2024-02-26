package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class490 {

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	static final int anInt5018 = 2;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	static final int anInt5019 = 10000;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	static final int anInt5020 = 10000;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	static final int anInt5021 = 60000;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	static final int anInt5022 = 10;

	@OriginalMember(owner = "client!pq", name = "wn", descriptor = "Lclient!fg;")
	public static Class263 aClass263_13;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "J")
	long aLong387;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	volatile int anInt5017 = 0;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Ljava/util/concurrent/ExecutorService;")
	ExecutorService anExecutorService2 = Executors.newFixedThreadPool(2);

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Z")
	boolean aBoolean881 = false;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Ljava/lang/String;")
	String aString212;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	int anInt5015;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	final int anInt5016;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(Lclient!asa;B)V")
	static void method30234(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) int local1 = 0;
		arg0.method22560(1668075746);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (local6 = 0; local6 < Class51.anInt191 * 44967471; local6++) {
			local15 = Class51.anIntArray20[local6];
			if ((Class51.aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1281948940);
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(-67767038);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < Class51.anInt191 * 44967471; local6++) {
			local15 = Class51.anIntArray20[local6];
			if ((Class51.aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 2131392142);
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(1328033466);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < Class51.anInt192 * -2044546579; local6++) {
			local15 = Class51.anIntArray21[local6];
			if ((Class51.aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1746631363);
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(-101530631);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < Class51.anInt192 * -2044546579; local6++) {
			local15 = Class51.anIntArray21[local6];
			if ((Class51.aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1533342882);
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						Class51.aByteArray18[local15] = (byte) (Class51.aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(-568355961);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		Class51.anInt191 = 0;
		Class51.anInt192 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			Class51.aByteArray18[local6] = (byte) (Class51.aByteArray18[local6] >> 1);
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local312 == null) {
				Class51.anIntArray21[(Class51.anInt192 += -1283238939) * -2044546579 - 1] = local6;
			} else {
				Class51.anIntArray20[(Class51.anInt191 += -585441073) * 44967471 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	public static int method30235(@OriginalArg(0) byte arg0) {
		@Pc(2) Class243 local2 = Class672.aClass243_95;
		synchronized (Class672.aClass243_95) {
			return Class672.aClass243_95.method26258(567566268);
		}
	}

	@OriginalMember(owner = "client!pq", name = "dx", descriptor = "(Lclient!yp;I)V")
	static void method30236(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2070707818);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class103_Sub8.method7863(local16, local22, arg0, 921113960);
	}

	@OriginalMember(owner = "client!pq", name = "ni", descriptor = "(Lclient!yp;I)V")
	static void method30237(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2144020710);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class565.method31480(local16, local22, arg0, -1799665356);
	}

	@OriginalMember(owner = "client!pq", name = "aoq", descriptor = "(Lclient!yp;B)V")
	static void method30238(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(37) Class337 local37 = Class643.method33028(local13, (byte) -91);
		@Pc(40) float local40 = (float) local23;
		if (local37 == Class337.aClass337_7 || local37 == Class337.aClass337_6 || local37 == Class337.aClass337_3) {
			local40 = Class467.method29716(local23);
		}
		@Pc(65) Class80_Sub1_Sub13_Sub2 local65 = new Class80_Sub1_Sub13_Sub2(Class160.aClass121_Sub1_2.method9722(1381388953), local37, local40, (float) local33 / 1000.0F);
		Class160.aClass121_Sub1_2.method9596(local65, (byte) 1);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local65.anInt3226 * 393755111;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(FFB)F")
	public static float method30239(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!pq", name = "agw", descriptor = "(Lclient!yp;I)V")
	static void method30240(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, 281655349)).anInt134 * -575331907;
	}

	@OriginalMember(owner = "client!pq", name = "ase", descriptor = "(Lclient!yp;I)V")
	static void method30241(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 > 255 || local12 < 0) {
			local12 = 0;
		}
		if (local12 != Class703.aClass80_Sub37_49.aClass165_Sub28_1.method16420(-752628338)) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub28_1, local12, (byte) 46);
			Class719.method37291(-254101150);
			client.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "(Lclient!als;I)V")
	public static void method30242(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(1) int arg1) {
		Class130_Sub1.method10205(arg0, (byte) -83);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/lang/String;II)V")
	public Class490(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString212 = arg0;
		this.anInt5015 = arg1 * -1444583055;
		this.anInt5016 = arg2 * 523542811;
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "()Z")
	boolean method30220() {
		return this.anInt5017 * 1396995563 >= 10;
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "(I)Z")
	boolean method30221(@OriginalArg(0) int arg0) {
		return this.anInt5017 * 1396995563 >= 10;
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(B)Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30222(@OriginalArg(0) byte arg0) {
		return this.method30226(255, 255, (byte) 0, true, 0, 0, 1129957830);
	}

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "(I)V")
	void method30223(@OriginalArg(0) int arg0) {
		this.anInt5017 -= -671282493;
	}

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "()Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30224() {
		return this.method30226(255, 255, (byte) 0, true, 0, 0, 1803463286);
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(ZI)V")
	void method30225(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean881 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(IIBZIII)Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30221(1392262948)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean881 && !local33) {
				return null;
			} else if (this.aLong387 * -217093783324200375L + 10000L >= Class303.method27111((byte) 73)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class303.method27111((byte) 54);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString212, this.anInt5015 * 1038628753, "/ms?m=" + this.anInt5016 * 12833043 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class80_Sub1_Sub15_Sub1 local121 = new Class80_Sub1_Sub15_Sub1(arg2);
				local121.aBoolean663 = arg3;
				this.anInt5017 += -671282493;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class475(this, local54, local121));
				local121.method23823(local140, 1653469246);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "(I)V")
	public void method30227(@OriginalArg(0) int arg0) {
		this.anExecutorService2.shutdown();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIBZII)Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30221(1392262948)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean881 && !local33) {
				return null;
			} else if (this.aLong387 * -217093783324200375L + 10000L >= Class303.method27111((byte) 48)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class303.method27111((byte) 122);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString212, this.anInt5015 * 1038628753, "/ms?m=" + this.anInt5016 * 12833043 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class80_Sub1_Sub15_Sub1 local121 = new Class80_Sub1_Sub15_Sub1(arg2);
				local121.aBoolean663 = arg3;
				this.anInt5017 += -671282493;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class475(this, local54, local121));
				local121.method23823(local140, 1842456792);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(IIBZII)Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg1 < 0) {
			throw new RuntimeException(arg0 + "," + arg1);
		} else if (this.method30221(1392262948)) {
			return null;
		} else {
			@Pc(33) boolean local33 = arg0 == 255 && arg1 == 255;
			if (!this.aBoolean881 && !local33) {
				return null;
			} else if (this.aLong387 * -217093783324200375L + 10000L >= Class303.method27111((byte) 103)) {
				return null;
			} else {
				@Pc(54) URL local54 = null;
				@Pc(66) String local66;
				if (local33) {
					local66 = "&cb=" + Class303.method27111((byte) 121);
				} else {
					local66 = "&c=" + arg4 + "&v=" + arg5;
				}
				try {
					local54 = new URL("http", this.aString212, this.anInt5015 * 1038628753, "/ms?m=" + this.anInt5016 * 12833043 + "&a=" + arg0 + "&g=" + arg1 + local66);
				} catch (@Pc(114) MalformedURLException local114) {
					return null;
				}
				@Pc(121) Class80_Sub1_Sub15_Sub1 local121 = new Class80_Sub1_Sub15_Sub1(arg2);
				local121.aBoolean663 = arg3;
				this.anInt5017 += -671282493;
				@Pc(140) Future local140 = this.anExecutorService2.submit(new Class475(this, local54, local121));
				local121.method23823(local140, 1783248190);
				return local121;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "()Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 method30230() {
		return this.method30226(255, 255, (byte) 0, true, 0, 0, -31810008);
	}

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "()V")
	void method30231() {
		this.anInt5017 -= -671282493;
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(Z)V")
	void method30232(@OriginalArg(0) boolean arg0) {
		this.aBoolean881 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "(Z)V")
	void method30233(@OriginalArg(0) boolean arg0) {
		this.aBoolean881 = arg0;
	}
}
