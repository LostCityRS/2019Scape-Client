package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zb")
public final class ByteArrayPool {

	@OriginalMember(owner = "client!zb", name = "m", descriptor = "[I")
	static int[] anIntArray529;

	@OriginalMember(owner = "client!zb", name = "i", descriptor = "[I")
	static int[] anIntArray530;

	@OriginalMember(owner = "client!zb", name = "o", descriptor = "[[[B")
	static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!zb", name = "t", descriptor = "I")
	static int anInt5814 = 0;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "I")
	static int anInt5815 = 0;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "I")
	static int anInt5816 = 0;

	@OriginalMember(owner = "client!zb", name = "u", descriptor = "[[B")
	static byte[][] aByteArrayArray28 = new byte[1000][];

	@OriginalMember(owner = "client!zb", name = "l", descriptor = "[[B")
	static byte[][] aByteArrayArray27 = new byte[250][];

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "[[B")
	static byte[][] aByteArrayArray26 = new byte[50][];

	@OriginalMember(owner = "client!zb", name = "k", descriptor = "([B)V")
	public static synchronized void method37083(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5814 * 441721855 < 1000) {
			aByteArrayArray28[(anInt5814 += 10214399) * 441721855 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5815 * -1433369011 < 250) {
			aByteArrayArray27[(anInt5815 += 660873861) * -1433369011 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5816 * 468671237 < 50) {
			aByteArrayArray26[(anInt5816 += 2060466637) * 468671237 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(70) int local70 = 0; local70 < anIntArray530.length; local70++) {
				if (anIntArray530[local70] == arg0.length && anIntArray529[local70] < aByteArrayArrayArray14[local70].length) {
					aByteArrayArrayArray14[local70][anIntArray529[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zb", name = "j", descriptor = "(I)[B")
	public static synchronized byte[] method37084(@OriginalArg(0) int arg0) {
		return create(arg0, false);
	}

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "(II)[B")
	public static synchronized byte[] create(@OriginalArg(0) int arg0) {
		return create(arg0, false);
	}

	@OriginalMember(owner = "client!zb", name = "u", descriptor = "([BI)V")
	public static synchronized void release(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0.length == 100 && anInt5814 * 441721855 < 1000) {
			aByteArrayArray28[(anInt5814 += 10214399) * 441721855 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5815 * -1433369011 < 250) {
			aByteArrayArray27[(anInt5815 += 660873861) * -1433369011 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5816 * 468671237 < 50) {
			aByteArrayArray26[(anInt5816 += 2060466637) * 468671237 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(70) int local70 = 0; local70 < anIntArray530.length; local70++) {
				if (anIntArray530[local70] == arg0.length && anIntArray529[local70] < aByteArrayArrayArray14[local70].length) {
					aByteArrayArrayArray14[local70][anIntArray529[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zb", name = "l", descriptor = "([I[I)V")
	public static void method37087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			anIntArray530 = null;
			anIntArray529 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		anIntArray530 = arg0;
		anIntArray529 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < anIntArray530.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "(IZB)[B")
	public static synchronized byte[] create(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5814 * 441721855 > 0) {
			local21 = aByteArrayArray28[(anInt5814 -= 10214399) * 441721855];
			aByteArrayArray28[anInt5814 * 441721855] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5815 * -1433369011 > 0) {
			local21 = aByteArrayArray27[(anInt5815 -= 660873861) * -1433369011];
			aByteArrayArray27[anInt5815 * -1433369011] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5816 * 468671237 > 0) {
			local21 = aByteArrayArray26[(anInt5816 -= 2060466637) * 468671237];
			aByteArrayArray26[anInt5816 * 468671237] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (aByteArrayArrayArray14 != null) {
				for (local93 = 0; local93 < anIntArray530.length; local93++) {
					if ((arg0 == anIntArray530[local93] || arg0 < anIntArray530[local93] && arg1) && anIntArray529[local93] > 0) {
						@Pc(126) byte[] local126 = aByteArrayArrayArray14[local93][--anIntArray529[local93]];
						aByteArrayArrayArray14[local93][anIntArray529[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && anIntArray530 != null) {
				for (local93 = 0; local93 < anIntArray530.length; local93++) {
					if (arg0 <= anIntArray530[local93] && anIntArray529[local93] < aByteArrayArrayArray14[local93].length) {
						return new byte[anIntArray530[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zb", name = "i", descriptor = "(IZ)[B")
	public static synchronized byte[] method37089(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5814 * 441721855 > 0) {
			local21 = aByteArrayArray28[(anInt5814 -= 10214399) * 441721855];
			aByteArrayArray28[anInt5814 * 441721855] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5815 * -1433369011 > 0) {
			local21 = aByteArrayArray27[(anInt5815 -= 660873861) * -1433369011];
			aByteArrayArray27[anInt5815 * -1433369011] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5816 * 468671237 > 0) {
			local21 = aByteArrayArray26[(anInt5816 -= 2060466637) * 468671237];
			aByteArrayArray26[anInt5816 * 468671237] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (aByteArrayArrayArray14 != null) {
				for (local93 = 0; local93 < anIntArray530.length; local93++) {
					if ((arg0 == anIntArray530[local93] || arg0 < anIntArray530[local93] && arg1) && anIntArray529[local93] > 0) {
						@Pc(126) byte[] local126 = aByteArrayArrayArray14[local93][--anIntArray529[local93]];
						aByteArrayArrayArray14[local93][anIntArray529[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && anIntArray530 != null) {
				for (local93 = 0; local93 < anIntArray530.length; local93++) {
					if (arg0 <= anIntArray530[local93] && anIntArray529[local93] < aByteArrayArrayArray14[local93].length) {
						return new byte[anIntArray530[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zb", name = "m", descriptor = "(I)[B")
	public static synchronized byte[] method37090(@OriginalArg(0) int arg0) {
		return create(arg0, false);
	}

	@OriginalMember(owner = "client!zb", name = "o", descriptor = "(I)[B")
	public static synchronized byte[] method37091(@OriginalArg(0) int arg0) {
		return create(arg0, false);
	}

	@OriginalMember(owner = "client!zb", name = "s", descriptor = "([B)V")
	public static synchronized void method37092(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5814 * 441721855 < 1000) {
			aByteArrayArray28[(anInt5814 += 10214399) * 441721855 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5815 * -1433369011 < 250) {
			aByteArrayArray27[(anInt5815 += 660873861) * -1433369011 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5816 * 468671237 < 50) {
			aByteArrayArray26[(anInt5816 += 2060466637) * 468671237 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(70) int local70 = 0; local70 < anIntArray530.length; local70++) {
				if (anIntArray530[local70] == arg0.length && anIntArray529[local70] < aByteArrayArrayArray14[local70].length) {
					aByteArrayArrayArray14[local70][anIntArray529[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "([B)V")
	public static synchronized void method37093(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5814 * 441721855 < 1000) {
			aByteArrayArray28[(anInt5814 += 10214399) * 441721855 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5815 * -1433369011 < 250) {
			aByteArrayArray27[(anInt5815 += 660873861) * -1433369011 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5816 * 468671237 < 50) {
			aByteArrayArray26[(anInt5816 += 2060466637) * 468671237 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(70) int local70 = 0; local70 < anIntArray530.length; local70++) {
				if (anIntArray530[local70] == arg0.length && anIntArray529[local70] < aByteArrayArrayArray14[local70].length) {
					aByteArrayArrayArray14[local70][anIntArray529[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "([I[I)V")
	public static void method37094(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			anIntArray530 = null;
			anIntArray529 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		anIntArray530 = arg0;
		anIntArray529 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < anIntArray530.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zb", name = "ano", descriptor = "(Lclient!yp;B)V")
	static void method37095(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class238.method26206(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3, (short) -23122);
	}

	@OriginalMember(owner = "client!zb", name = "w", descriptor = "(ILclient!aax;B)V")
	static void method37096(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) byte arg2) {
		if (-1 != arg0 && arg1.method560((long) arg0) == null) {
			arg1.method563(new Class80(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!zb", name = "ane", descriptor = "(Lclient!yp;I)V")
	static void method37097(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class160.aClass121_Sub1_2.method9592((float) local13, (float) local23, 345620555);
	}

	@OriginalMember(owner = "client!zb", name = "af", descriptor = "(Lclient!arz;I)Ljava/lang/String;")
	public static String method37098(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		return Class630.aBoolean955 || arg0 == null ? "" : arg0.aString106;
	}

	@OriginalMember(owner = "client!zb", name = "<init>", descriptor = "()V")
	ByteArrayPool() throws Throwable {
		throw new Error();
	}
}
