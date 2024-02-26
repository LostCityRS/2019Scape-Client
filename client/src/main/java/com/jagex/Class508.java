package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Comparator;

@OriginalClass("client!qj")
final class Class508 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qj", name = "this$0", descriptor = "Lclient!qh;")
	final Class506 aClass506_2;

	@OriginalMember(owner = "client!qj", name = "cj", descriptor = "(Lclient!yp;I)V")
	static void method30525(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class318.method27523(local11, local14, arg0, (byte) -48);
	}

	@OriginalMember(owner = "client!qj", name = "es", descriptor = "(Lclient!yp;I)V")
	static void method30526(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2048220719);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class664.method33364(local16, local22, arg0, (byte) -26);
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(Ljava/lang/CharSequence;IZB)I")
	static int method30527(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local23 * arg1 + local57;
			if (local96 / arg1 != local23) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "(ILclient!zv;Lclient!wi;I)Ljava/lang/String;")
	static String method30528(@OriginalArg(0) int arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class638 arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 100000) {
			return Class339.method27899(arg2.anInt5606 * -1221200149, 1127622592) + arg0 + Class43.aString7;
		} else if (arg0 < 10000000) {
			return Class339.method27899(arg2.anInt5617 * 550658955, 1296697375) + arg0 / 1000 + Class60.aClass60_145.method1180(arg1, 635230958) + Class43.aString7;
		} else {
			return Class339.method27899(arg2.anInt5621 * -146354743, 946265557) + arg0 / 1000000 + Class60.aClass60_143.method1180(arg1, 1123695924) + Class43.aString7;
		}
	}

	@OriginalMember(owner = "client!qj", name = "ars", descriptor = "(Lclient!yp;B)V")
	static void method30529(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub19_1, local12, (byte) 115);
		client.aClass539_1.method30938(443696829);
		Class719.method37291(-27268630);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!qj", name = "dr", descriptor = "(Lclient!ho;I)Z")
	static boolean method30530(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray389 != null) {
			arg0 = arg0.method27550(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface24_2, 77198649);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean795) {
			return false;
		} else if (!arg0.method27544(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface24_2, -2138402358)) {
			return false;
		} else if (Class159_Sub1.aClass24_15.method560((long) (arg0.anInt4055 * 445805997)) != null) {
			return false;
		} else if (Class159_Sub1.aClass24_16.method560((long) (arg0.anInt4061 * -1976811059)) == null) {
			if (arg0.aString178 != null) {
				if (arg0.anInt4031 * -618572023 == 0 && Class159_Sub1.aBoolean401) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 1 && Class159_Sub1.aBoolean407) {
					return false;
				}
				if (arg0.anInt4031 * -618572023 == 2 && Class159_Sub1.aBoolean408) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!qh;)V")
	Class508(@OriginalArg(0) Class506 arg0) {
		this.aClass506_2 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "(Lclient!qm;Lclient!qm;I)I")
	int method30517(@OriginalArg(0) Class511 arg0, @OriginalArg(1) Class511 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aLong390 * 3975490113888425939L > arg1.aLong390 * 3975490113888425939L) {
			return 1;
		} else if (arg0.aLong390 * 3975490113888425939L < arg1.aLong390 * 3975490113888425939L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(Lclient!qm;Lclient!qm;)I")
	int method30518(@OriginalArg(0) Class511 arg0, @OriginalArg(1) Class511 arg1) {
		if (arg0.aLong390 * 3975490113888425939L > arg1.aLong390 * 3975490113888425939L) {
			return 1;
		} else if (arg0.aLong390 * 3975490113888425939L < arg1.aLong390 * 3975490113888425939L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int method30519(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30517((Class511) arg0, (Class511) arg1, -578462880);
	}

	@OriginalMember(owner = "client!qj", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method30517((Class511) arg0, (Class511) arg1, -578462880);
	}

	@OriginalMember(owner = "client!qj", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30520(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method30521(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(Lclient!qm;Lclient!qm;)I")
	int method30522(@OriginalArg(0) Class511 arg0, @OriginalArg(1) Class511 arg1) {
		if (arg0.aLong390 * 3975490113888425939L > arg1.aLong390 * 3975490113888425939L) {
			return 1;
		} else if (arg0.aLong390 * 3975490113888425939L < arg1.aLong390 * 3975490113888425939L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "(Lclient!qm;Lclient!qm;)I")
	int method30523(@OriginalArg(0) Class511 arg0, @OriginalArg(1) Class511 arg1) {
		if (arg0.aLong390 * 3975490113888425939L > arg1.aLong390 * 3975490113888425939L) {
			return 1;
		} else if (arg0.aLong390 * 3975490113888425939L < arg1.aLong390 * 3975490113888425939L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(Lclient!qm;Lclient!qm;)I")
	int method30524(@OriginalArg(0) Class511 arg0, @OriginalArg(1) Class511 arg1) {
		if (arg0.aLong390 * 3975490113888425939L > arg1.aLong390 * 3975490113888425939L) {
			return 1;
		} else if (arg0.aLong390 * 3975490113888425939L < arg1.aLong390 * 3975490113888425939L) {
			return -1;
		} else {
			return 0;
		}
	}
}
