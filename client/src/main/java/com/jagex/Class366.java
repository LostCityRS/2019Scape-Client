package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class366 implements Interface11 {

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
	public static final int[] anIntArray435 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[I")
	int[] anIntArray434;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[S")
	short[] aShortArray123;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[S")
	short[] aShortArray124;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "[S")
	short[] aShortArray125;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[B")
	byte[] aByteArray87;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[B")
	byte[] aByteArray88;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "[S")
	short[] aShortArray126;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "[I")
	int[] anIntArray436 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_100;

	@OriginalMember(owner = "client!jq", name = "agr", descriptor = "(Lclient!yp;S)V")
	static void method28271(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class546.method31208((long) arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] * 60000L, Class512.aClass719_3.method37268(), true, -197060662) + " UTC";
	}

	@OriginalMember(owner = "client!jq", name = "agx", descriptor = "(Lclient!yp;I)V")
	static void method28272(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class43 local18 = (Class43) Class25.aClass41_Sub9_1.method18054(local12, -1450738869);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt163 * 1605396457;
	}

	@OriginalMember(owner = "client!jq", name = "bbj", descriptor = "(Lclient!yp;I)V")
	static void method28273(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!jq", name = "agq", descriptor = "(Lclient!yp;I)V")
	static void method28274(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(25) int local25 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] - 1;
		@Pc(31) Class43 local31 = (Class43) Class25.aClass41_Sub9_1.method18054(local13, 53593434);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local31.method893(local25, (byte) -1);
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILclient!pf;)V")
	Class366(@OriginalArg(0) int arg0, @OriginalArg(1) Class480 arg1) {
		this.aClass480_100 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(570973842);
			if (local3 == 0) {
				return;
			}
			this.method28259(arg0, local3, 184442089);
		}
	}

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1760646614);
			if (local3 == 0) {
				return;
			}
			this.method28259(arg0, local3, -244886584);
		}
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)Lclient!dt;")
	public Class232 method28254(@OriginalArg(0) int arg0) {
		if (this.anIntArray434 == null) {
			return null;
		}
		@Pc(9) Class232[] local9 = new Class232[this.anIntArray434.length];
		@Pc(13) Class480 local13 = this.aClass480_100;
		@Pc(16) int local16;
		synchronized (this.aClass480_100) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray434.length) {
					break;
				}
				local9[local16] = Class232.method26043(this.aClass480_100, this.anIntArray434[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray434.length; local44++) {
			if (local9[local44].anInt3781 < 13) {
				local9[local44].method26085(2);
			}
		}
		@Pc(70) Class232 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class232(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method26049(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local16 = 0; local16 < this.aShortArray126.length; local16++) {
				local70.method26050(this.aShortArray126[local16], this.aShortArray125[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)Z")
	public boolean method28255(@OriginalArg(0) int arg0) {
		if (this.anIntArray434 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class480 local11 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray434.length; local14++) {
				if (!this.aClass480_100.method29925(this.anIntArray434[local14], 0, 243651098)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "()Z")
	public boolean method28256() {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class480 local5 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray436[local8] != -1 && !this.aClass480_100.method29925(this.anIntArray436[local8], 0, 340437089)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "(S)Z")
	public boolean method28257(@OriginalArg(0) short arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class480 local5 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray436[local8] != -1 && !this.aClass480_100.method29925(this.anIntArray436[local8], 0, 824756411)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "(I)Lclient!dt;")
	public Class232 method28258(@OriginalArg(0) int arg0) {
		@Pc(2) Class232[] local2 = new Class232[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class480 local8 = this.aClass480_100;
		@Pc(11) int local11;
		synchronized (this.aClass480_100) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray436[local11] != -1) {
					local2[local4++] = Class232.method26043(this.aClass480_100, this.anIntArray436[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3781 < 13) {
				local2[local44].method26085(2);
			}
		}
		@Pc(71) Class232 local71 = new Class232(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method26049(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method26050(this.aShortArray126[local11], this.aShortArray125[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "(Lclient!ald;II)V")
	void method28259(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			arg0.method23362(851106757);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method23362(-654566179);
			this.anIntArray434 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray434[local20] = arg0.method23210((byte) 116);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method23362(-1760784083);
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method23178((byte) -112);
					this.aShortArray124[local20] = (short) arg0.method23178((byte) -56);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method23362(183268629);
				this.aShortArray126 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method23178((byte) -60);
					this.aShortArray125[local20] = (short) arg0.method23178((byte) -41);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method23178((byte) -80);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method23178((byte) -113);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray436[arg1 - 60] = arg0.method23210((byte) 116);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "(Lclient!ald;I)V")
	void method28260(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23362(538501286);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method23362(37006395);
			this.anIntArray434 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray434[local20] = arg0.method23210((byte) 22);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method23362(-1990299879);
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method23178((byte) -36);
					this.aShortArray124[local20] = (short) arg0.method23178((byte) -75);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method23362(292826274);
				this.aShortArray126 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method23178((byte) -24);
					this.aShortArray125[local20] = (short) arg0.method23178((byte) -73);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method23178((byte) -94);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method23178((byte) -58);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray436[arg1 - 60] = arg0.method23210((byte) 60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ald;I)V")
	void method28261(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23362(1032750948);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method23362(486619655);
			this.anIntArray434 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray434[local20] = arg0.method23210((byte) 97);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method23362(-380934673);
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method23178((byte) -128);
					this.aShortArray124[local20] = (short) arg0.method23178((byte) -40);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method23362(-1067823676);
				this.aShortArray126 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method23178((byte) -106);
					this.aShortArray125[local20] = (short) arg0.method23178((byte) -119);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method23178((byte) -33);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method23178((byte) -124);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray436[arg1 - 60] = arg0.method23210((byte) 73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "(Lclient!ald;I)V")
	void method28262(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23362(-26824682);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method23362(-1050684479);
			this.anIntArray434 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray434[local20] = arg0.method23210((byte) 71);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method23362(399731278);
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method23178((byte) -37);
					this.aShortArray124[local20] = (short) arg0.method23178((byte) -6);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method23362(-151966399);
				this.aShortArray126 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method23178((byte) -13);
					this.aShortArray125[local20] = (short) arg0.method23178((byte) -27);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method23178((byte) -40);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method23178((byte) -47);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray436[arg1 - 60] = arg0.method23210((byte) 72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "(Lclient!ald;I)V")
	void method28263(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23362(-906896621);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method23362(-956278108);
			this.anIntArray434 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray434[local20] = arg0.method23210((byte) 42);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method23362(-430373523);
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method23178((byte) -7);
					this.aShortArray124[local20] = (short) arg0.method23178((byte) -71);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method23362(-171705281);
				this.aShortArray126 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method23178((byte) -81);
					this.aShortArray125[local20] = (short) arg0.method23178((byte) -96);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method23178((byte) -120);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method23178((byte) -89);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray436[arg1 - 60] = arg0.method23210((byte) 70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "()Z")
	public boolean method28264() {
		if (this.anIntArray434 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class480 local11 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray434.length; local14++) {
				if (!this.aClass480_100.method29925(this.anIntArray434[local14], 0, -700593408)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "()Lclient!dt;")
	public Class232 method28265() {
		@Pc(2) Class232[] local2 = new Class232[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class480 local8 = this.aClass480_100;
		@Pc(11) int local11;
		synchronized (this.aClass480_100) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray436[local11] != -1) {
					local2[local4++] = Class232.method26043(this.aClass480_100, this.anIntArray436[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3781 < 13) {
				local2[local44].method26085(2);
			}
		}
		@Pc(71) Class232 local71 = new Class232(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method26049(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method26050(this.aShortArray126[local11], this.aShortArray125[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "()Z")
	public boolean method28266() {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class480 local5 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray436[local8] != -1 && !this.aClass480_100.method29925(this.anIntArray436[local8], 0, -1395822413)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "()Lclient!dt;")
	public Class232 method28267() {
		if (this.anIntArray434 == null) {
			return null;
		}
		@Pc(9) Class232[] local9 = new Class232[this.anIntArray434.length];
		@Pc(13) Class480 local13 = this.aClass480_100;
		@Pc(16) int local16;
		synchronized (this.aClass480_100) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray434.length) {
					break;
				}
				local9[local16] = Class232.method26043(this.aClass480_100, this.anIntArray434[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray434.length; local44++) {
			if (local9[local44].anInt3781 < 13) {
				local9[local44].method26085(2);
			}
		}
		@Pc(70) Class232 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class232(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method26049(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local16 = 0; local16 < this.aShortArray126.length; local16++) {
				local70.method26050(this.aShortArray126[local16], this.aShortArray125[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "()Z")
	public boolean method28268() {
		if (this.anIntArray434 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class480 local11 = this.aClass480_100;
		synchronized (this.aClass480_100) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray434.length; local14++) {
				if (!this.aClass480_100.method29925(this.anIntArray434[local14], 0, -202988619)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "()Lclient!dt;")
	public Class232 method28269() {
		@Pc(2) Class232[] local2 = new Class232[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class480 local8 = this.aClass480_100;
		@Pc(11) int local11;
		synchronized (this.aClass480_100) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray436[local11] != -1) {
					local2[local4++] = Class232.method26043(this.aClass480_100, this.anIntArray436[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3781 < 13) {
				local2[local44].method26085(2);
			}
		}
		@Pc(71) Class232 local71 = new Class232(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method26049(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method26050(this.aShortArray126[local11], this.aShortArray125[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "()Lclient!dt;")
	public Class232 method28270() {
		@Pc(2) Class232[] local2 = new Class232[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class480 local8 = this.aClass480_100;
		@Pc(11) int local11;
		synchronized (this.aClass480_100) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray436[local11] != -1) {
					local2[local4++] = Class232.method26043(this.aClass480_100, this.anIntArray436[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3781 < 13) {
				local2[local44].method26085(2);
			}
		}
		@Pc(71) Class232 local71 = new Class232(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method26049(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method26050(this.aShortArray126[local11], this.aShortArray125[local11]);
			}
		}
		return local71;
	}
}
