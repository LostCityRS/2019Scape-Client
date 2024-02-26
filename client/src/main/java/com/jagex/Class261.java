package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class261 implements Interface11 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Z")
	public static boolean aBoolean777 = false;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!fv;")
	public Class276 aClass276_1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!aax;")
	Class24 aClass24_26;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public int anInt3899 = 0;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public int anInt3891 = -9240723;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	int anInt3889 = 1450085253;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public int anInt3895 = 1803544807;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public int anInt3888 = -27635221;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	public int anInt3893 = -156040361;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	public int anInt3894 = 797684405;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public int anInt3898 = -1397120039;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public int anInt3890 = 1071744479;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public int anInt3896 = 104043127;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public int anInt3897 = -146419914;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Z")
	public boolean aBoolean776 = false;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Z")
	public boolean aBoolean778 = false;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt3900 = -1963712079;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public int anInt3892;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!fm;")
	Class117 aClass117_1;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(II)V")
	public static void method26496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class574.anInt5284 = arg0 * 463720165;
	}

	@OriginalMember(owner = "client!fe", name = "gp", descriptor = "(Lclient!yp;S)V")
	static void method26497(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class102.method21130(local11, local14, arg0, -1972001560);
	}

	@OriginalMember(owner = "client!fe", name = "nw", descriptor = "(Lclient!yp;S)V")
	static void method26498(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class299.method27025(local11, local14, arg0, (byte) 20);
	}

	@OriginalMember(owner = "client!fe", name = "ayl", descriptor = "(Lclient!yp;I)V")
	static void method26499(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) String local1 = null;
		if (Class134.aClass306_1 != null) {
			local1 = Class134.aClass306_1.method27208(1710104482);
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local1;
	}

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "(I)[Lclient!gm;")
	static Class292[] method26500(@OriginalArg(0) int arg0) {
		return new Class292[] { Class292.aClass292_4, Class292.aClass292_1, Class292.aClass292_14, Class292.aClass292_9, Class292.aClass292_13, Class292.aClass292_11, Class292.aClass292_12, Class292.aClass292_16, Class292.aClass292_7, Class292.aClass292_2, Class292.aClass292_6, Class292.aClass292_8, Class292.aClass292_17, Class292.aClass292_15, Class292.aClass292_18, Class292.aClass292_5, Class292.aClass292_3, Class292.aClass292_10 };
	}

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "(Lclient!ea;B)V")
	public static void method26501(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class80_Sub1_Sub9 local7 = Class22.method545(1, (long) (arg0.anInt862 * -1873516487));
		local7.method22078(-1934549656);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILclient!fm;)V")
	Class261(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		this.anInt3892 = arg0 * 912759985;
		this.aClass117_1 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "()Z")
	public boolean method26477() {
		if (this.anIntArray368 == null && this.anInt3891 * -768598629 == -1) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		if (this.anIntArray368 != null) {
			@Pc(19) int[] local19 = this.anIntArray368;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8801(local29 >>> 16, (byte) 34) == null) {
					local12 = false;
				}
			}
		} else if (this.aClass117_1.method8807(this.anInt3891 * -768598629, 1949742671) == null) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "()Z")
	public boolean method26478() {
		return this.anInt3891 * -768598629 != -1;
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(Lclient!ald;II)V")
	void method26479(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.g2();
			this.anIntArray370 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray370[local12] = arg0.g2();
			}
			this.anIntArray368 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3895 = arg0.g2() * -1803544807;
		} else if (arg1 == 5) {
			this.anInt3888 = arg0.g1() * 853466415;
		} else if (arg1 == 6) {
			this.anInt3893 = arg0.g2() * 156040361;
		} else if (arg1 == 7) {
			this.anInt3894 = arg0.g2() * -797684405;
		} else if (arg1 == 8) {
			this.anInt3898 = arg0.g1() * -1489151597;
		} else if (arg1 == 9) {
			this.anInt3890 = arg0.g1() * -1071744479;
		} else if (arg1 == 10) {
			this.anInt3896 = arg0.g1() * -104043127;
		} else if (arg1 == 11) {
			this.anInt3897 = arg0.g1() * 2074273691;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.g1();
			} else {
				local6 = arg0.g2();
			}
			this.anIntArray369 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] += arg0.g2() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.g2();
				this.anIntArrayArray47 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.g1();
					if (local230 > 0) {
						this.anIntArrayArray47[local12] = new int[local230];
						this.anIntArrayArray47[local12][0] = arg0.g3();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray47[local12][local249] = arg0.g2();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean776 = true;
			} else if (arg1 == 15) {
				this.aBoolean778 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray373 == null) {
						this.anIntArray373 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray373[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray373[local6] = arg0.g1();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray372 == null || this.anIntArray371 == null) {
						this.anIntArray372 = new int[this.anIntArrayArray47.length];
						this.anIntArray371 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray372[local6] = 256;
							this.anIntArray371[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray372[local6] = arg0.g2();
					this.anIntArray371[local6] = arg0.g2();
				} else if (arg1 == 22) {
					this.anInt3900 = arg0.g1() * 1963712079;
				} else if (arg1 == 23) {
					arg0.g2();
				} else if (arg1 == 24) {
					this.anInt3889 = arg0.g2() * -1450085253;
					if (this.aClass117_1 != null) {
						this.aClass276_1 = (Class276) this.aClass117_1.anInterface12_4.method18054(this.anInt3889 * -387953997, -1923411103);
					}
				} else if (arg1 == 25) {
					this.anInt3891 = arg0.g2() * 9240723;
				} else if (arg1 == 249) {
					local6 = arg0.g1();
					if (this.aClass24_26 == null) {
						local12 = Class700.method37081(local6, (byte) 9);
						this.aClass24_26 = new Class24(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(499) boolean local499 = arg0.g1() == 1;
						local249 = arg0.g3();
						@Pc(512) Class80 local512;
						if (local499) {
							local512 = new Class80_Sub19(arg0.gjstr());
						} else {
							local512 = new Class80_Sub20(arg0.g4());
						}
						this.aClass24_26.method563(local512, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
		if (this.anInt3890 * 679184865 == -1) {
			if (this.aClass276_1 == null || this.aClass276_1.aBooleanArray22 == null) {
				this.anInt3890 = 0;
			} else {
				this.anInt3890 = -2143488958;
			}
		}
		if (this.anInt3896 * -1996482375 == -1) {
			if (this.aClass276_1 == null || this.aClass276_1.aBooleanArray22 == null) {
				this.anInt3896 = 0;
			} else {
				this.anInt3896 = -208086254;
			}
		}
		if (this.anIntArray370 != null) {
			this.anInt3899 = 0;
			for (@Pc(50) int local50 = 0; local50 < this.anIntArray370.length; local50++) {
				this.anInt3899 += this.anIntArray370[local50] * 1907159505;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)Z")
	public boolean method26480(@OriginalArg(0) int arg0) {
		if (this.anIntArray368 == null && this.anInt3891 * -768598629 == -1) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		if (this.anIntArray368 != null) {
			@Pc(19) int[] local19 = this.anIntArray368;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8801(local29 >>> 16, (byte) 94) == null) {
					local12 = false;
				}
			}
		} else if (this.aClass117_1.method8807(this.anInt3891 * -768598629, -670186254) == null) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method26481(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub19 local11 = (Class80_Sub19) this.aClass24_26.method560((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method26482(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub19 local11 = (Class80_Sub19) this.aClass24_26.method560((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)Z")
	public boolean method26483(@OriginalArg(0) int arg0) {
		return this.anInt3891 * -768598629 != -1;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
		if (this.anInt3890 * 679184865 == -1) {
			if (this.aClass276_1 == null || this.aClass276_1.aBooleanArray22 == null) {
				this.anInt3890 = 0;
			} else {
				this.anInt3890 = -2143488958;
			}
		}
		if (this.anInt3896 * -1996482375 == -1) {
			if (this.aClass276_1 == null || this.aClass276_1.aBooleanArray22 == null) {
				this.anInt3896 = 0;
			} else {
				this.anInt3896 = -208086254;
			}
		}
		if (this.anIntArray370 != null) {
			this.anInt3899 = 0;
			for (@Pc(50) int local50 = 0; local50 < this.anIntArray370.length; local50++) {
				this.anInt3899 += this.anIntArray370[local50] * 1907159505;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method26479(arg0, local3, -1546914253);
		}
	}

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "()Z")
	public boolean method26484() {
		if (this.anIntArray368 == null && this.anInt3891 * -768598629 == -1) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		if (this.anIntArray368 != null) {
			@Pc(19) int[] local19 = this.anIntArray368;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8801(local29 >>> 16, (byte) 73) == null) {
					local12 = false;
				}
			}
		} else if (this.aClass117_1.method8807(this.anInt3891 * -768598629, -813267700) == null) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ald;I)V")
	void method26485(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.g2();
			this.anIntArray370 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray370[local12] = arg0.g2();
			}
			this.anIntArray368 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3895 = arg0.g2() * -1803544807;
		} else if (arg1 == 5) {
			this.anInt3888 = arg0.g1() * 853466415;
		} else if (arg1 == 6) {
			this.anInt3893 = arg0.g2() * 156040361;
		} else if (arg1 == 7) {
			this.anInt3894 = arg0.g2() * -797684405;
		} else if (arg1 == 8) {
			this.anInt3898 = arg0.g1() * -1489151597;
		} else if (arg1 == 9) {
			this.anInt3890 = arg0.g1() * -1071744479;
		} else if (arg1 == 10) {
			this.anInt3896 = arg0.g1() * -104043127;
		} else if (arg1 == 11) {
			this.anInt3897 = arg0.g1() * 2074273691;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.g1();
			} else {
				local6 = arg0.g2();
			}
			this.anIntArray369 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] += arg0.g2() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.g2();
				this.anIntArrayArray47 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.g1();
					if (local230 > 0) {
						this.anIntArrayArray47[local12] = new int[local230];
						this.anIntArrayArray47[local12][0] = arg0.g3();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray47[local12][local249] = arg0.g2();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean776 = true;
			} else if (arg1 == 15) {
				this.aBoolean778 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray373 == null) {
						this.anIntArray373 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray373[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray373[local6] = arg0.g1();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray372 == null || this.anIntArray371 == null) {
						this.anIntArray372 = new int[this.anIntArrayArray47.length];
						this.anIntArray371 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray372[local6] = 256;
							this.anIntArray371[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray372[local6] = arg0.g2();
					this.anIntArray371[local6] = arg0.g2();
				} else if (arg1 == 22) {
					this.anInt3900 = arg0.g1() * 1963712079;
				} else if (arg1 == 23) {
					arg0.g2();
				} else if (arg1 == 24) {
					this.anInt3889 = arg0.g2() * -1450085253;
					if (this.aClass117_1 != null) {
						this.aClass276_1 = (Class276) this.aClass117_1.anInterface12_4.method18054(this.anInt3889 * -387953997, 393865905);
					}
				} else if (arg1 == 25) {
					this.anInt3891 = arg0.g2() * 9240723;
				} else if (arg1 == 249) {
					local6 = arg0.g1();
					if (this.aClass24_26 == null) {
						local12 = Class700.method37081(local6, (byte) 9);
						this.aClass24_26 = new Class24(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(499) boolean local499 = arg0.g1() == 1;
						local249 = arg0.g3();
						@Pc(512) Class80 local512;
						if (local499) {
							local512 = new Class80_Sub19(arg0.gjstr());
						} else {
							local512 = new Class80_Sub20(arg0.g4());
						}
						this.aClass24_26.method563(local512, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(III)I")
	public int method26486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub20 local12 = (Class80_Sub20) this.aClass24_26.method560((long) arg0);
			return local12 == null ? arg1 : local12.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method26487(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub19 local11 = (Class80_Sub19) this.aClass24_26.method560((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "()Z")
	public boolean method26488() {
		if (this.anIntArray368 == null && this.anInt3891 * -768598629 == -1) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		if (this.anIntArray368 != null) {
			@Pc(19) int[] local19 = this.anIntArray368;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8801(local29 >>> 16, (byte) 125) == null) {
					local12 = false;
				}
			}
		} else if (this.aClass117_1.method8807(this.anInt3891 * -768598629, 491476336) == null) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "(II)I")
	public int method26489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub20 local12 = (Class80_Sub20) this.aClass24_26.method560((long) arg0);
			return local12 == null ? arg1 : local12.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "(II)I")
	public int method26490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub20 local12 = (Class80_Sub20) this.aClass24_26.method560((long) arg0);
			return local12 == null ? arg1 : local12.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "()Z")
	public boolean method26491() {
		if (this.anIntArray368 == null && this.anInt3891 * -768598629 == -1) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		if (this.anIntArray368 != null) {
			@Pc(19) int[] local19 = this.anIntArray368;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8801(local29 >>> 16, (byte) 64) == null) {
					local12 = false;
				}
			}
		} else if (this.aClass117_1.method8807(this.anInt3891 * -768598629, 387933076) == null) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method26479(arg0, local3, 751302596);
		}
	}

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "()Z")
	public boolean method26492() {
		return this.anInt3891 * -768598629 != -1;
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "()Z")
	public boolean method26493() {
		return this.anInt3891 * -768598629 != -1;
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(Lclient!ald;I)V")
	void method26494(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.g2();
			this.anIntArray370 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray370[local12] = arg0.g2();
			}
			this.anIntArray368 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray368[local12] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3895 = arg0.g2() * -1803544807;
		} else if (arg1 == 5) {
			this.anInt3888 = arg0.g1() * 853466415;
		} else if (arg1 == 6) {
			this.anInt3893 = arg0.g2() * 156040361;
		} else if (arg1 == 7) {
			this.anInt3894 = arg0.g2() * -797684405;
		} else if (arg1 == 8) {
			this.anInt3898 = arg0.g1() * -1489151597;
		} else if (arg1 == 9) {
			this.anInt3890 = arg0.g1() * -1071744479;
		} else if (arg1 == 10) {
			this.anInt3896 = arg0.g1() * -104043127;
		} else if (arg1 == 11) {
			this.anInt3897 = arg0.g1() * 2074273691;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.g1();
			} else {
				local6 = arg0.g2();
			}
			this.anIntArray369 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] = arg0.g2();
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] += arg0.g2() << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.g2();
				this.anIntArrayArray47 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.g1();
					if (local230 > 0) {
						this.anIntArrayArray47[local12] = new int[local230];
						this.anIntArrayArray47[local12][0] = arg0.g3();
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray47[local12][local249] = arg0.g2();
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean776 = true;
			} else if (arg1 == 15) {
				this.aBoolean778 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray373 == null) {
						this.anIntArray373 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray373[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray373[local6] = arg0.g1();
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray372 == null || this.anIntArray371 == null) {
						this.anIntArray372 = new int[this.anIntArrayArray47.length];
						this.anIntArray371 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray372[local6] = 256;
							this.anIntArray371[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.g1();
					} else {
						local6 = arg0.g2();
					}
					this.anIntArray372[local6] = arg0.g2();
					this.anIntArray371[local6] = arg0.g2();
				} else if (arg1 == 22) {
					this.anInt3900 = arg0.g1() * 1963712079;
				} else if (arg1 == 23) {
					arg0.g2();
				} else if (arg1 == 24) {
					this.anInt3889 = arg0.g2() * -1450085253;
					if (this.aClass117_1 != null) {
						this.aClass276_1 = (Class276) this.aClass117_1.anInterface12_4.method18054(this.anInt3889 * -387953997, 1162632755);
					}
				} else if (arg1 == 25) {
					this.anInt3891 = arg0.g2() * 9240723;
				} else if (arg1 == 249) {
					local6 = arg0.g1();
					if (this.aClass24_26 == null) {
						local12 = Class700.method37081(local6, (byte) 9);
						this.aClass24_26 = new Class24(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(499) boolean local499 = arg0.g1() == 1;
						local249 = arg0.g3();
						@Pc(512) Class80 local512;
						if (local499) {
							local512 = new Class80_Sub19(arg0.gjstr());
						} else {
							local512 = new Class80_Sub20(arg0.g4());
						}
						this.aClass24_26.method563(local512, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "()Z")
	public boolean method26495() {
		return this.anInt3891 * -768598629 != -1;
	}
}
