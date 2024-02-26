package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aau")
public final class Class21 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!aau", name = "o", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!aau", name = "i", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!aau", name = "g", descriptor = "I")
	public int anInt64;

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "I")
	public int anInt67;

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "I")
	int anInt65 = 0;

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "I")
	public int anInt68 = -967429703;

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "I")
	public int anInt66 = 1291320832;

	@OriginalMember(owner = "client!aau", name = "u", descriptor = "Z")
	public boolean aBoolean9 = true;

	@OriginalMember(owner = "client!aau", name = "l", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!aau", name = "apz", descriptor = "(Lclient!yp;I)V")
	static void method530(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -664415586;
		@Pc(19) Class80_Sub33 local19 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (Class160.aClass121_Sub1_2.method9702(1230226828) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) Class160.aClass121_Sub1_2.method9693(1764789025)).method16637(local19.method14467(873333789), arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 5], 1707432626);
	}

	@OriginalMember(owner = "client!aau", name = "wg", descriptor = "(Lclient!yp;I)V")
	static void method531(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(45) short local45 = 256;
		Class490.aClass263_13.method26532(Class280.aClass280_9, local13, local23, local43, Class278.aClass278_5.method26831(1145126777), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local45, local33, 1839570184);
	}

	@OriginalMember(owner = "client!aau", name = "ab", descriptor = "(II)I")
	public static int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class622.aTwitchWebcamFrameData1 = null;
		Class622.aClass99_38 = null;
		return arg0 >= 0 && arg0 < Class622.aTwitchWebcamDeviceArray1.length ? Class669.aTwitchTV1.StopWebcamDevice(Class622.aTwitchWebcamDeviceArray1[arg0].u * 1469731503) : -1;
	}

	@OriginalMember(owner = "client!aau", name = "ws", descriptor = "(Lclient!yp;B)V")
	static void method533(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		Class490.aClass263_13.method26522(local13, -895344851);
	}

	@OriginalMember(owner = "client!aau", name = "<init>", descriptor = "()V")
	Class21() {
	}

	@OriginalMember(owner = "client!aau", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-913430609);
			if (local3 == 0) {
				return;
			}
			this.method526(arg0, local3, (byte) -32);
		}
	}

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1907684230);
			if (local3 == 0) {
				return;
			}
			this.method526(arg0, local3, (byte) -26);
		}
	}

	@OriginalMember(owner = "client!aau", name = "l", descriptor = "(Lclient!ald;IB)V")
	void method526(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.anInt65 = arg0.method23180(1710327153) * -958920001;
			this.method527(this.anInt65 * 1231578431, -1816592727);
		} else if (arg1 == 2) {
			this.anInt68 = arg0.method23178((byte) -75) * 967429703;
			if (this.anInt68 * 904100727 == 65535) {
				this.anInt68 = -967429703;
			}
		} else if (arg1 == 3) {
			this.anInt66 = (arg0.method23178((byte) -100) << 2) * 1495694335;
		} else if (arg1 == 4) {
			this.aBoolean9 = false;
		} else if (arg1 == 5) {
			this.aBoolean10 = false;
		}
	}

	@OriginalMember(owner = "client!aau", name = "i", descriptor = "(II)V")
	void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt63 = (int) (local56 * 256.0D) * 607969601;
		this.anInt67 = (int) (local62 * 256.0D) * 372497719;
		if (this.anInt63 * 218148545 < 0) {
			this.anInt63 = 0;
		} else if (this.anInt63 * 218148545 > 255) {
			this.anInt63 = 413425599;
		}
		if (this.anInt67 * 829974663 < 0) {
			this.anInt67 = 0;
		} else if (this.anInt67 * 829974663 > 255) {
			this.anInt67 = 497637833;
		}
		if (local62 > 0.5D) {
			this.anInt62 = (int) (local56 * (1.0D - local62) * 512.0D) * -1917200623;
		} else {
			this.anInt62 = (int) (local62 * 512.0D * local56) * -1917200623;
		}
		if (this.anInt62 * -2045904399 < 1) {
			this.anInt62 = -1917200623;
		}
		this.anInt64 = (int) ((double) (this.anInt62 * -2045904399) * local54) * -1103838643;
	}

	@OriginalMember(owner = "client!aau", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!aau", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!aau", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aau", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aau", name = "k", descriptor = "(I)V")
	void method528(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt63 = (int) (local56 * 256.0D) * 607969601;
		this.anInt67 = (int) (local62 * 256.0D) * 372497719;
		if (this.anInt63 * 218148545 < 0) {
			this.anInt63 = 0;
		} else if (this.anInt63 * 218148545 > 255) {
			this.anInt63 = 413425599;
		}
		if (this.anInt67 * 829974663 < 0) {
			this.anInt67 = 0;
		} else if (this.anInt67 * 829974663 > 255) {
			this.anInt67 = 497637833;
		}
		if (local62 > 0.5D) {
			this.anInt62 = (int) (local56 * (1.0D - local62) * 512.0D) * -1917200623;
		} else {
			this.anInt62 = (int) (local62 * 512.0D * local56) * -1917200623;
		}
		if (this.anInt62 * -2045904399 < 1) {
			this.anInt62 = -1917200623;
		}
		this.anInt64 = (int) ((double) (this.anInt62 * -2045904399) * local54) * -1103838643;
	}

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "(I)V")
	void method529(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt63 = (int) (local56 * 256.0D) * 607969601;
		this.anInt67 = (int) (local62 * 256.0D) * 372497719;
		if (this.anInt63 * 218148545 < 0) {
			this.anInt63 = 0;
		} else if (this.anInt63 * 218148545 > 255) {
			this.anInt63 = 413425599;
		}
		if (this.anInt67 * 829974663 < 0) {
			this.anInt67 = 0;
		} else if (this.anInt67 * 829974663 > 255) {
			this.anInt67 = 497637833;
		}
		if (local62 > 0.5D) {
			this.anInt62 = (int) (local56 * (1.0D - local62) * 512.0D) * -1917200623;
		} else {
			this.anInt62 = (int) (local62 * 512.0D * local56) * -1917200623;
		}
		if (this.anInt62 * -2045904399 < 1) {
			this.anInt62 = -1917200623;
		}
		this.anInt64 = (int) ((double) (this.anInt62 * -2045904399) * local54) * -1103838643;
	}

	@OriginalMember(owner = "client!aau", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}
}
