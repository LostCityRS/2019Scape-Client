package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wx")
public final class Class651 {

	@OriginalMember(owner = "client!wx", name = "e", descriptor = "I")
	static final int anInt5657 = 2;

	@OriginalMember(owner = "client!wx", name = "f", descriptor = "I")
	public static final int anInt5658 = 1;

	@OriginalMember(owner = "client!wx", name = "t", descriptor = "I")
	public static final int anInt5659 = 0;

	@OriginalMember(owner = "client!wx", name = "i", descriptor = "[I")
	public int[] anIntArray511;

	@OriginalMember(owner = "client!wx", name = "u", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!wx", name = "m", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!wx", name = "l", descriptor = "I")
	public int anInt5660 = 1854390057;

	@OriginalMember(owner = "client!wx", name = "g", descriptor = "I")
	public int anInt5661 = 1577563899;

	@OriginalMember(owner = "client!wx", name = "qn", descriptor = "(Lclient!yp;I)V")
	static void method33128(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class200.method24931(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!wx", name = "s", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method33129(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (1994758437 * client.anInt3433 == 13 && (!Class353.method28071(1598942104) && !Class684.method36790((byte) 92))) {
			Class238.aString153 = arg0;
			Class238.aBoolean770 = arg1;
			Class604.method32148(15, 1908197899);
		}
	}

	@OriginalMember(owner = "client!wx", name = "j", descriptor = "(II)I")
	public static int method33130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return (local153 >> 1) + (local148 >> 5 << 7) + ((local143 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!wx", name = "af", descriptor = "(I)Lclient!sa;")
	public static Class544 method33131(@OriginalArg(0) int arg0) {
		return Class554.aClass544_2;
	}

	@OriginalMember(owner = "client!wx", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class651(@OriginalArg(0) Class480 arg0) {
		@Pc(15) byte[] local15 = arg0.method29926(Class639.aClass639_6.anInt5637 * 1101033235, 1472047355);
		this.method33125(new Class80_Sub36(local15), (byte) 115);
	}

	@OriginalMember(owner = "client!wx", name = "t", descriptor = "(Lclient!ald;B)V")
	void method33125(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(877692707);
			if (local3 == 0) {
				if (this.anIntArray512 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method23362(-1729962445);
				this.anIntArray512 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray512.length; local19++) {
					this.anIntArray512[local19] = arg0.method23362(-364717927);
					if (this.anIntArray512[local19] != 0 && this.anIntArray512[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5660 = arg0.method23362(-554346905) * -1854390057;
			} else if (local3 == 4) {
				this.anInt5661 = arg0.method23362(-207793250) * -1577563899;
			} else if (local3 == 5) {
				this.anIntArray511 = new int[arg0.method23362(685069062)];
				for (local13 = 0; local13 < this.anIntArray511.length; local13++) {
					this.anIntArray511[local13] = arg0.method23362(-19625202);
				}
			} else if (local3 == 6) {
				this.anIntArray513 = new int[arg0.method23362(416342734)];
				for (local13 = 0; local13 < this.anIntArray513.length; local13++) {
					this.anIntArray513[local13] = arg0.method23362(-595431478);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "f", descriptor = "(Lclient!ald;)V")
	void method33126(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1176775229);
			if (local3 == 0) {
				if (this.anIntArray512 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method23362(968692185);
				this.anIntArray512 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray512.length; local19++) {
					this.anIntArray512[local19] = arg0.method23362(1111992133);
					if (this.anIntArray512[local19] != 0 && this.anIntArray512[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5660 = arg0.method23362(-1090170379) * -1854390057;
			} else if (local3 == 4) {
				this.anInt5661 = arg0.method23362(-1594282006) * -1577563899;
			} else if (local3 == 5) {
				this.anIntArray511 = new int[arg0.method23362(1046856824)];
				for (local13 = 0; local13 < this.anIntArray511.length; local13++) {
					this.anIntArray511[local13] = arg0.method23362(973931049);
				}
			} else if (local3 == 6) {
				this.anIntArray513 = new int[arg0.method23362(-257305692)];
				for (local13 = 0; local13 < this.anIntArray513.length; local13++) {
					this.anIntArray513[local13] = arg0.method23362(308906762);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wx", name = "e", descriptor = "(Lclient!ald;)V")
	void method33127(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-188793264);
			if (local3 == 0) {
				if (this.anIntArray512 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method23362(-2119344204);
				this.anIntArray512 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray512.length; local19++) {
					this.anIntArray512[local19] = arg0.method23362(-271275419);
					if (this.anIntArray512[local19] != 0 && this.anIntArray512[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5660 = arg0.method23362(-1597690684) * -1854390057;
			} else if (local3 == 4) {
				this.anInt5661 = arg0.method23362(-192129246) * -1577563899;
			} else if (local3 == 5) {
				this.anIntArray511 = new int[arg0.method23362(-180124691)];
				for (local13 = 0; local13 < this.anIntArray511.length; local13++) {
					this.anIntArray511[local13] = arg0.method23362(-814225665);
				}
			} else if (local3 == 6) {
				this.anIntArray513 = new int[arg0.method23362(-939694618)];
				for (local13 = 0; local13 < this.anIntArray513.length; local13++) {
					this.anIntArray513[local13] = arg0.method23362(658815643);
				}
			}
		}
	}
}
