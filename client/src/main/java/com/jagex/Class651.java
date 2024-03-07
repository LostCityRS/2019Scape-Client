package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wy")
public class Class651 {

	@OriginalMember(owner = "client!wy", name = "n", descriptor = "I")
	public static final int anInt5799 = 1;

	@OriginalMember(owner = "client!wy", name = "m", descriptor = "I")
	static final int anInt5800 = 2;

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "I")
	public static final int anInt5801 = 0;

	@OriginalMember(owner = "client!wy", name = "k", descriptor = "[I")
	public int[] anIntArray506;

	@OriginalMember(owner = "client!wy", name = "u", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!wy", name = "l", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!wy", name = "f", descriptor = "I")
	public int anInt5798 = -39892529;

	@OriginalMember(owner = "client!wy", name = "w", descriptor = "I")
	public int anInt5802 = 1558287369;

	@OriginalMember(owner = "client!wy", name = "<init>", descriptor = "(Lclient!py;)V", line = 16)
	public Class651(@OriginalArg(0) Class497 arg0) {
		@Pc(15) byte[] local15 = arg0.method30079(Class649.aClass649_11.anInt5795 * -51136173, (byte) 97);
		this.method32670(new Packet(local15), (byte) 19);
	}

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "(Lclient!alw;B)V", line = 23)
	void method32670(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray506 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1((short) 16384);
				this.anIntArray506 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray506.length; local19++) {
					this.anIntArray506[local19] = arg0.g1((short) 16384);
					if (this.anIntArray506[local19] != 0 && this.anIntArray506[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5798 = arg0.g1((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5802 = arg0.g1((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray508 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray508.length; local13++) {
					this.anIntArray508[local13] = arg0.g1((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray507 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray507.length; local13++) {
					this.anIntArray507[local13] = arg0.g1((short) 16384);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "n", descriptor = "(Lclient!alw;)V", line = 23)
	void method32671(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray506 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1((short) 16384);
				this.anIntArray506 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray506.length; local19++) {
					this.anIntArray506[local19] = arg0.g1((short) 16384);
					if (this.anIntArray506[local19] != 0 && this.anIntArray506[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5798 = arg0.g1((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5802 = arg0.g1((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray508 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray508.length; local13++) {
					this.anIntArray508[local13] = arg0.g1((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray507 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray507.length; local13++) {
					this.anIntArray507[local13] = arg0.g1((short) 16384);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "m", descriptor = "(Lclient!alw;)V", line = 23)
	void method32672(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				if (this.anIntArray506 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1((short) 16384);
				this.anIntArray506 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray506.length; local19++) {
					this.anIntArray506[local19] = arg0.g1((short) 16384);
					if (this.anIntArray506[local19] != 0 && this.anIntArray506[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5798 = arg0.g1((short) 16384) * 39892529;
			} else if (local3 == 4) {
				this.anInt5802 = arg0.g1((short) 16384) * -1558287369;
			} else if (local3 == 5) {
				this.anIntArray508 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray508.length; local13++) {
					this.anIntArray508[local13] = arg0.g1((short) 16384);
				}
			} else if (local3 == 6) {
				this.anIntArray507 = new int[arg0.g1((short) 16384)];
				for (local13 = 0; local13 < this.anIntArray507.length; local13++) {
					this.anIntArray507[local13] = arg0.g1((short) 16384);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wy", name = "qe", descriptor = "(Lclient!yf;I)V", line = 7902)
	static final void method32673(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class665.method32893(local11, local14, arg0, 168030255);
	}

	@OriginalMember(owner = "client!wy", name = "alj", descriptor = "(Lclient!yf;I)V", line = 11845)
	static final void method32674(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class4.aBoolean2 && Class125_Sub2_Sub1.aFrame1 != null) {
			Class717.method36895(Class51.options.aClass166_Sub23_1.method15844(453071792), -1, -1, false, (byte) 42);
		}
	}
}
