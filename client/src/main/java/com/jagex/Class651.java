package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wy")
public final class Class651 {

	@OriginalMember(owner = "client!wy", name = "n", descriptor = "I")
	public static final int anInt5960 = 1;

	@OriginalMember(owner = "client!wy", name = "m", descriptor = "I")
	static final int anInt5961 = 2;

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "I")
	public static final int anInt5962 = 0;

	@OriginalMember(owner = "client!wy", name = "k", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!wy", name = "u", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!wy", name = "l", descriptor = "[I")
	public int[] anIntArray510;

	@OriginalMember(owner = "client!wy", name = "f", descriptor = "I")
	public int anInt5959 = -39892529;

	@OriginalMember(owner = "client!wy", name = "w", descriptor = "I")
	public int anInt5963 = 1558287369;

	@OriginalMember(owner = "client!wy", name = "qe", descriptor = "(Lclient!yf;I)V")
	static void method32854(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class665.method33073(local11, local14, arg0, 168030255);
	}

	@OriginalMember(owner = "client!wy", name = "alj", descriptor = "(Lclient!yf;I)V")
	static void method32855(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			Class717.method37076(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15856(453071792), -1, -1, false, (byte) 42);
		}
	}

	@OriginalMember(owner = "client!wy", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class651(@OriginalArg(0) Class497 arg0) {
		@Pc(15) byte[] local15 = arg0.method30240(Class649.aClass649_11.anInt5956 * -51136173, (byte) 97);
		this.method32851(new Class93_Sub41(local15), (byte) 19);
	}

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "(Lclient!alw;B)V")
	void method32851(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray508 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				this.anIntArray508 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray508.length; local19++) {
					this.anIntArray508[local19] = arg0.method22425((short) 16384);
					if (this.anIntArray508[local19] != 0 && this.anIntArray508[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5959 = arg0.method22425((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5963 = arg0.method22425((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray510 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray510.length; local13++) {
					this.anIntArray510[local13] = arg0.method22425((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray509 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray509.length; local13++) {
					this.anIntArray509[local13] = arg0.method22425((short) 16384);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "n", descriptor = "(Lclient!alw;)V")
	void method32852(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray508 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				this.anIntArray508 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray508.length; local19++) {
					this.anIntArray508[local19] = arg0.method22425((short) 16384);
					if (this.anIntArray508[local19] != 0 && this.anIntArray508[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5959 = arg0.method22425((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5963 = arg0.method22425((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray510 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray510.length; local13++) {
					this.anIntArray510[local13] = arg0.method22425((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray509 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray509.length; local13++) {
					this.anIntArray509[local13] = arg0.method22425((short) 16384);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "m", descriptor = "(Lclient!alw;)V")
	void method32853(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray508 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				this.anIntArray508 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray508.length; local19++) {
					this.anIntArray508[local19] = arg0.method22425((short) 16384);
					if (this.anIntArray508[local19] != 0 && this.anIntArray508[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5959 = arg0.method22425((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5963 = arg0.method22425((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray510 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray510.length; local13++) {
					this.anIntArray510[local13] = arg0.method22425((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray509 = new int[arg0.method22425((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray509.length; local13++) {
					this.anIntArray509[local13] = arg0.method22425((short) 16384);
				}
			}
		}
	}
}
