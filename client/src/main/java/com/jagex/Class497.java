package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!py")
public final class Class497 {

	@OriginalMember(owner = "client!py", name = "w", descriptor = "I")
	static final int anInt5332 = 0;

	@OriginalMember(owner = "client!py", name = "u", descriptor = "I")
	static final int anInt5333 = 2;

	@OriginalMember(owner = "client!py", name = "l", descriptor = "I")
	public static final int anInt5334 = 1;

	@OriginalMember(owner = "client!py", name = "k", descriptor = "Lclient!adv;")
	static Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!py", name = "d", descriptor = "Z")
	static boolean aBoolean792 = false;

	@OriginalMember(owner = "client!py", name = "c", descriptor = "I")
	static int anInt5336 = 0;

	@OriginalMember(owner = "client!py", name = "m", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "client!py", name = "n", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray43;

	@OriginalMember(owner = "client!py", name = "e", descriptor = "Lclient!pl;")
	Class486 aClass486_2 = null;

	@OriginalMember(owner = "client!py", name = "p", descriptor = "Lclient!po;")
	Class143 aClass143_1;

	@OriginalMember(owner = "client!py", name = "f", descriptor = "Z")
	boolean aBoolean793;

	@OriginalMember(owner = "client!py", name = "z", descriptor = "I")
	int anInt5335;

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(Lclient!st;III)J")
	static long method30310(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) long local1 = 4194304L;
		@Pc(3) long local3 = Long.MIN_VALUE;
		@Pc(13) Class610 local13 = (Class610) client.aClass532_1.method30647(1877474569).method18273(arg0.method13423(-1037211373), 1104549899);
		@Pc(34) long local34 = (long) (arg1 | arg2 << 7 | arg0.method13420(1402096015) << 14 | arg0.method13404(2090297000) << 20 | 0x40000000);
		if (local13.anInt5753 * 1067969079 == 0) {
			local34 |= local3;
		}
		if (local13.anInt5771 * -927091685 == 1) {
			local34 |= local1;
		}
		return local34 | (long) arg0.method13423(-1037211373) << 32;
	}

	@OriginalMember(owner = "client!py", name = "asz", descriptor = "(Lclient!yf;I)V")
	static void method30311(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub41_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 0 ? 0 : 1, (byte) 65);
		Class106_Sub1.method5148(452662493);
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method30312(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class166_Sub13.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!py", name = "ai", descriptor = "(IIB)V")
	static void method30313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		Class454.anInt5214 = arg0 * -2045298401;
		Class454.anInt5211 = arg1 * 1178355593;
	}

	@OriginalMember(owner = "client!py", name = "adt", descriptor = "(Lclient!yf;B)V")
	static void method30314(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 + local23;
	}

	@OriginalMember(owner = "client!py", name = "<init>", descriptor = "(Lclient!po;ZI)V")
	public Class497(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass143_1 = arg0;
		this.aBoolean793 = arg1;
		this.anInt5335 = arg2 * 114349921;
	}

	@OriginalMember(owner = "client!py", name = "l", descriptor = "(IIB)[B")
	public byte[] method30225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.method30260(arg0, arg1, null, (byte) -105);
	}

	@OriginalMember(owner = "client!py", name = "ac", descriptor = "(Ljava/lang/String;I)I")
	public int method30226(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -10840);
			return this.method30238(local17, -1926038478);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "n", descriptor = "(S)I")
	public int method30227(@OriginalArg(0) short arg0) {
		if (!this.method30292((byte) -1)) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5306 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "m", descriptor = "(IB)Z")
	synchronized boolean method30228(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && this.aClass486_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "k", descriptor = "(IIB)Z")
	public synchronized boolean method30229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && arg1 < this.aClass486_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "bu", descriptor = "(II[I)Z")
	synchronized boolean method30230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray461[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray463[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27479(this.anObjectArray43[arg0], false, 1069378239);
			} else {
				local104 = Class331.method27479(this.anObjectArray43[arg0], true, 1158267595);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22425((short) 16384);
				local117 = local109.method22431(-118643075);
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method37101() ? 5 : 9) + local117;
				local109.method22454(arg2, 5, local127, -1984067408);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30403(local104, (byte) -100);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23542(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length, -275987287) + " " + Class154.method14146(local104, local104.length - 2, -206037027) + " " + this.aClass486_2.anIntArray457[arg0] + " " + this.aClass486_2.anInt5306 * 391791439);
			}
			if (this.aBoolean793) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5335 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22431(-118643075);
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22431(-118643075);
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22431(-118643075);
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22431(-118643075);
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5335 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false, 1215292027);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5335 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false, 1215292027);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "w", descriptor = "(II)V")
	public void method30231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass143_1.method11053(arg0, (byte) 79);
	}

	@OriginalMember(owner = "client!py", name = "al", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method30232(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 977);
			return this.method30273(local17, 432156995);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "aj", descriptor = "(I)V")
	public void method30233(@OriginalArg(0) int arg0) {
		this.aClass143_1.method11053(arg0, (byte) 41);
	}

	@OriginalMember(owner = "client!py", name = "z", descriptor = "(III)Z")
	public synchronized boolean method30234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method30229(arg0, arg1, (byte) 55)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30303(arg0, -1199031414);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(II)Z")
	public synchronized boolean method30235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463.length == 1) {
			return this.method30234(0, arg0, 1341243327);
		} else if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463[arg0] == 1) {
			return this.method30234(arg0, 0, -860819669);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "ak", descriptor = "(I)Z")
	public synchronized boolean method30236(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463.length == 1) {
			return this.method30234(0, arg0, -2022086031);
		} else if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463[arg0] == 1) {
			return this.method30234(arg0, 0, 290447685);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "bv", descriptor = "(Ljava/lang/String;)I")
	public int method30237(@OriginalArg(0) String arg0) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 3967);
			return this.method30228(local17, (byte) 1) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "r", descriptor = "(II)I")
	public synchronized int method30238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.method30228(arg0, (byte) 1)) {
			return this.anObjectArray43[arg0] == null ? this.aClass143_1.method11052(arg0, 793440206) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "v", descriptor = "(I)I")
	public synchronized int method30239(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass486_2.anIntArray461[local11] > 0) {
				local7 += 100;
				local9 += this.method30238(local11, -1194790573);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!py", name = "o", descriptor = "(IB)[B")
	public synchronized byte[] method30240(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method30292((byte) -1)) {
			return null;
		} else if (this.aClass486_2.anIntArray463.length == 1) {
			return this.method30225(0, arg0, (byte) 0);
		} else if (!this.method30228(arg0, (byte) 1)) {
			return null;
		} else if (this.aClass486_2.anIntArray463[arg0] == 1) {
			return this.method30225(arg0, 0, (byte) 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "s", descriptor = "(IB)[I")
	public synchronized int[] method30241(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method30228(arg0, (byte) 1)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass486_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass486_2.anIntArray461[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!py", name = "c", descriptor = "(I)Z")
	public synchronized boolean method30242(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass486_2.anIntArray458.length; local9++) {
			@Pc(21) int local21 = this.aClass486_2.anIntArray458[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method30303(local21, -1199031414);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!py", name = "q", descriptor = "(II)I")
	public int method30243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "x", descriptor = "(B)I")
	public int method30244(@OriginalArg(0) byte arg0) {
		return this.method30292((byte) -1) ? this.aClass486_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!py", name = "b", descriptor = "(II)V")
	public synchronized void method30245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.method30228(arg0, (byte) 1) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "h", descriptor = "(ZZB)V")
	public void method30246(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (!this.method30292((byte) -1)) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray456 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(II[IB)Z")
	synchronized boolean method30247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray461[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray463[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27479(this.anObjectArray43[arg0], false, 2090245629);
			} else {
				local104 = Class331.method27479(this.anObjectArray43[arg0], true, -1275986446);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22425((short) 16384);
				local117 = local109.method22431(-118643075);
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method37101() ? 5 : 9) + local117;
				local109.method22454(arg2, 5, local127, -2092552953);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30403(local104, (byte) -25);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23542(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length, -1503200612) + " " + Class154.method14146(local104, local104.length - 2, 539963248) + " " + this.aClass486_2.anIntArray457[arg0] + " " + this.aClass486_2.anInt5306 * 391791439);
			}
			if (this.aBoolean793) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5335 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22431(-118643075);
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22431(-118643075);
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22431(-118643075);
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22431(-118643075);
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5335 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false, 1215292027);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5335 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false, 1215292027);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "g", descriptor = "(Ljava/lang/String;I)I")
	public int method30248(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -13268);
			return this.method30228(local17, (byte) 1) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "i", descriptor = "(IS)I")
	public int method30249(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		if (this.method30292((byte) -1)) {
			@Pc(12) int local12 = this.aClass486_2.aClass348_1.method27712(arg0, (short) 11239);
			return this.method30228(local12, (byte) 1) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "j", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method30250(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -7029);
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method30251(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 20222);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) -5856);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "ae", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] method30252(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!this.method30292((byte) -1)) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -23586);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) -2947);
			return this.method30225(local20, local38, (byte) 0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "av", descriptor = "(II)Z")
	public synchronized boolean method30253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && arg1 < this.aClass486_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ah", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method30254(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.method30248("", -1497248091);
		return local4 == -1 ? this.method30284(arg0, "", 936770656) : this.method30284("", arg0, 936770656);
	}

	@OriginalMember(owner = "client!py", name = "az", descriptor = "(II)[B")
	public byte[] method30255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30260(arg0, arg1, null, (byte) -7);
	}

	@OriginalMember(owner = "client!py", name = "bf", descriptor = "()I")
	public synchronized int method30256() {
		if (!this.method30292((byte) -1)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass486_2.anIntArray461[local11] > 0) {
				local7 += 100;
				local9 += this.method30238(local11, -168945733);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!py", name = "am", descriptor = "()I")
	public int method30257() {
		if (!this.method30292((byte) -1)) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5306 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "bi", descriptor = "(I)I")
	public int method30258(@OriginalArg(0) int arg0) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "ad", descriptor = "()I")
	public int method30259() {
		if (!this.method30292((byte) -1)) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5306 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "u", descriptor = "(II[IB)[B")
	public synchronized byte[] method30260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3) {
		if (!this.method30229(arg0, arg1, (byte) 23)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method30247(arg0, arg1, arg2, (byte) 0);
			if (!local30) {
				this.method30303(arg0, -1199031414);
				local30 = this.method30247(arg0, arg1, arg2, (byte) 0);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class331.method27479(this.anObjectArrayArray3[arg0][arg1], false, 1811130136);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt5335 * -2037379935 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass486_2.anIntArray463[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt5335 * -2037379935 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!py", name = "bn", descriptor = "()I")
	public int method30261() {
		return this.method30292((byte) -1) ? this.aClass486_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!py", name = "ar", descriptor = "(I)Z")
	synchronized boolean method30262(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && this.aClass486_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ap", descriptor = "(I)Z")
	synchronized boolean method30263(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && this.aClass486_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "aq", descriptor = "(II)Z")
	public synchronized boolean method30264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && arg1 < this.aClass486_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ax", descriptor = "(II)Z")
	public synchronized boolean method30265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && arg1 < this.aClass486_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "cl", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	public synchronized byte[] method30266(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -16460);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 10258);
			return this.method30225(local20, local38, (byte) 0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "cg", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	boolean method30267(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 16202);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 22640);
			return this.method30234(local20, local38, 1893428520);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "bc", descriptor = "(I)I")
	public int method30268(@OriginalArg(0) int arg0) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "ay", descriptor = "(I)V")
	public void method30269(@OriginalArg(0) int arg0) {
		this.aClass143_1.method11053(arg0, (byte) 126);
	}

	@OriginalMember(owner = "client!py", name = "ab", descriptor = "(II)[B")
	public byte[] method30270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30260(arg0, arg1, null, (byte) -36);
	}

	@OriginalMember(owner = "client!py", name = "au", descriptor = "(I)Z")
	synchronized boolean method30271(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray463.length && this.aClass486_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean792) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "aa", descriptor = "(II[I)[B")
	public synchronized byte[] method30272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30229(arg0, arg1, (byte) -16)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method30247(arg0, arg1, arg2, (byte) 0);
			if (!local30) {
				this.method30303(arg0, -1199031414);
				local30 = this.method30247(arg0, arg1, arg2, (byte) 0);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class331.method27479(this.anObjectArrayArray3[arg0][arg1], false, 1598481614);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt5335 * -2037379935 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass486_2.anIntArray463[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt5335 * -2037379935 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!py", name = "d", descriptor = "(II)Z")
	public synchronized boolean method30273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30303(arg0, -1199031414);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "at", descriptor = "()Z")
	synchronized boolean method30274() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050((byte) 111);
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5309 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5309 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "y", descriptor = "(II)Z")
	public boolean method30275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463.length == 1) {
			return this.method30229(0, arg0, (byte) -94);
		} else if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463[arg0] == 1) {
			return this.method30229(arg0, 0, (byte) -30);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "ao", descriptor = "(I)V")
	synchronized void method30276(@OriginalArg(0) int arg0) {
		if (this.aBoolean793) {
			this.anObjectArray43[arg0] = this.aClass143_1.method11051(arg0, -644651081);
		} else {
			this.anObjectArray43[arg0] = Class113.method7411(this.aClass143_1.method11051(arg0, -644651081), false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!py", name = "bl", descriptor = "(I)[I")
	public synchronized int[] method30277(@OriginalArg(0) int arg0) {
		if (!this.method30228(arg0, (byte) 1)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass486_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass486_2.anIntArray461[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!py", name = "bk", descriptor = "(I)Z")
	public boolean method30278(@OriginalArg(0) int arg0) {
		if (!this.method30292((byte) -1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463.length == 1) {
			return this.method30229(0, arg0, (byte) -40);
		} else if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.aClass486_2.anIntArray463[arg0] == 1) {
			return this.method30229(arg0, 0, (byte) 43);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "bh", descriptor = "(I)I")
	public int method30279(@OriginalArg(0) int arg0) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bx", descriptor = "(I)I")
	public int method30280(@OriginalArg(0) int arg0) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bd", descriptor = "(I)I")
	public int method30281(@OriginalArg(0) int arg0) {
		return this.method30228(arg0, (byte) 1) ? this.aClass486_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "an", descriptor = "(I)I")
	public synchronized int method30282(@OriginalArg(0) int arg0) {
		if (this.method30228(arg0, (byte) 1)) {
			return this.anObjectArray43[arg0] == null ? this.aClass143_1.method11052(arg0, -1830504481) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "by", descriptor = "(II[I)Z")
	synchronized boolean method30283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray461[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray463[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27479(this.anObjectArray43[arg0], false, -1250177665);
			} else {
				local104 = Class331.method27479(this.anObjectArray43[arg0], true, -274475759);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22425((short) 16384);
				local117 = local109.method22431(-118643075);
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method37101() ? 5 : 9) + local117;
				local109.method22454(arg2, 5, local127, -2044400234);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30403(local104, (byte) -25);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23542(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length, 492838196) + " " + Class154.method14146(local104, local104.length - 2, -768794211) + " " + this.aClass486_2.anIntArray457[arg0] + " " + this.aClass486_2.anInt5306 * 391791439);
			}
			if (this.aBoolean793) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5335 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22431(-118643075);
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22431(-118643075);
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22431(-118643075);
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22431(-118643075);
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5335 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false, 1215292027);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5335 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false, 1215292027);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "ag", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	boolean method30284(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -18017);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) -8187);
			return this.method30234(local20, local38, 1679883659);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "bt", descriptor = "(I)V")
	public synchronized void method30285(@OriginalArg(0) int arg0) {
		if (this.method30228(arg0, (byte) 1) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bq", descriptor = "(ZZ)V")
	public void method30286(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30292((byte) -1)) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray456 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bm", descriptor = "(ZZ)V")
	public void method30287(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30292((byte) -1)) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray456 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bb", descriptor = "(ZZ)V")
	public void method30288(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30292((byte) -1)) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray456 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "be", descriptor = "(II[I)Z")
	synchronized boolean method30289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray461[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray463[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27479(this.anObjectArray43[arg0], false, 1976260878);
			} else {
				local104 = Class331.method27479(this.anObjectArray43[arg0], true, -1072843845);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22425((short) 16384);
				local117 = local109.method22431(-118643075);
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method37101() ? 5 : 9) + local117;
				local109.method22454(arg2, 5, local127, -2083254910);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30403(local104, (byte) -38);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23542(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length, -540062567) + " " + Class154.method14146(local104, local104.length - 2, 493735020) + " " + this.aClass486_2.anIntArray457[arg0] + " " + this.aClass486_2.anInt5306 * 391791439);
			}
			if (this.aBoolean793) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5335 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22431(-118643075);
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22431(-118643075);
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22431(-118643075);
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22431(-118643075);
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5335 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false, 1215292027);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5335 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false, 1215292027);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "aw", descriptor = "()Z")
	synchronized boolean method30290() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050((byte) 83);
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5309 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5309 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "bg", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method30291(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -2119);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) -3548);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "e", descriptor = "(B)Z")
	synchronized boolean method30292(@OriginalArg(0) byte arg0) {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050((byte) 81);
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5309 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5309 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "bo", descriptor = "(Ljava/lang/String;)I")
	public int method30293(@OriginalArg(0) String arg0) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 311);
			return this.method30228(local17, (byte) 1) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "bz", descriptor = "(Ljava/lang/String;)I")
	public int method30294(@OriginalArg(0) String arg0) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 21475);
			return this.method30228(local17, (byte) 1) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "ce", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	boolean method30295(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 12984);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 817);
			return this.method30234(local20, local38, -1657674875);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "br", descriptor = "(Ljava/lang/String;)Z")
	public boolean method30296(@OriginalArg(0) String arg0) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -22057);
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "af", descriptor = "(II)Z")
	public synchronized boolean method30297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30229(arg0, arg1, (byte) 25)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30303(arg0, -1199031414);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "ba", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method30298(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 20494);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 21344);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bp", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method30299(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 3745);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 24345);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bj", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method30300(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) -19201);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) 13273);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bs", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	public synchronized byte[] method30301(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30292((byte) -1)) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 16314);
		if (this.method30228(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27712(Class295.method26695(local11, (byte) 35), (short) -16555);
			return this.method30225(local20, local38, (byte) 0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bw", descriptor = "(II[I)Z")
	synchronized boolean method30302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30228(arg0, (byte) 1)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray461[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray463[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27479(this.anObjectArray43[arg0], false, -1154106022);
			} else {
				local104 = Class331.method27479(this.anObjectArray43[arg0], true, 1964402896);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22425((short) 16384);
				local117 = local109.method22431(-118643075);
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method37101() ? 5 : 9) + local117;
				local109.method22454(arg2, 5, local127, -2089227421);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30403(local104, (byte) -22);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23542(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length, -203750692) + " " + Class154.method14146(local104, local104.length - 2, -1952842100) + " " + this.aClass486_2.anIntArray457[arg0] + " " + this.aClass486_2.anInt5306 * 391791439);
			}
			if (this.aBoolean793) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5335 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22431(-118643075);
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22431(-118643075);
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22431(-118643075);
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22431(-118643075);
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5335 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false, 1215292027);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5335 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false, 1215292027);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "f", descriptor = "(II)V")
	synchronized void method30303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean793) {
			this.anObjectArray43[arg0] = this.aClass143_1.method11051(arg0, -644651081);
		} else {
			this.anObjectArray43[arg0] = Class113.method7411(this.aClass143_1.method11051(arg0, -644651081), false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!py", name = "as", descriptor = "()Z")
	synchronized boolean method30304() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050((byte) 117);
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5309 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5309 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "cu", descriptor = "(Ljava/lang/String;)Z")
	public boolean method30305(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30248("", -1497248091);
		return local4 == -1 ? this.method30284(arg0, "", 936770656) : this.method30284("", arg0, 936770656);
	}

	@OriginalMember(owner = "client!py", name = "ci", descriptor = "(Ljava/lang/String;)Z")
	public boolean method30306(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30248("", -1497248091);
		return local4 == -1 ? this.method30284(arg0, "", 936770656) : this.method30284("", arg0, 936770656);
	}

	@OriginalMember(owner = "client!py", name = "cn", descriptor = "(Ljava/lang/String;)Z")
	public boolean method30307(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30248("", -1497248091);
		return local4 == -1 ? this.method30284(arg0, "", 936770656) : this.method30284("", arg0, 936770656);
	}

	@OriginalMember(owner = "client!py", name = "cv", descriptor = "(Ljava/lang/String;)Z")
	public boolean method30308(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30248("", -1497248091);
		return local4 == -1 ? this.method30284(arg0, "", 936770656) : this.method30284("", arg0, 936770656);
	}

	@OriginalMember(owner = "client!py", name = "cp", descriptor = "(Ljava/lang/String;)I")
	public int method30309(@OriginalArg(0) String arg0) {
		if (this.method30292((byte) -1)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27712(Class295.method26695(local8, (byte) 35), (short) 23428);
			return this.method30238(local17, -527415343);
		} else {
			return 0;
		}
	}
}
