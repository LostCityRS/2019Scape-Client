package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akn")
public final class Class80_Sub24 extends Class80 {

	@OriginalMember(owner = "client!akn", name = "w", descriptor = "J")
	long aLong108;

	@OriginalMember(owner = "client!akn", name = "o", descriptor = "Lclient!lx;")
	Interface38 anInterface38_11;

	@OriginalMember(owner = "client!akn", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!akn", name = "j", descriptor = "I")
	int anInt1624 = 0;

	@OriginalMember(owner = "client!akn", name = "s", descriptor = "I")
	int anInt1625 = 0;

	@OriginalMember(owner = "client!akn", name = "k", descriptor = "I")
	int anInt1622 = 0;

	@OriginalMember(owner = "client!akn", name = "x", descriptor = "I")
	int anInt1626 = 0;

	@OriginalMember(owner = "client!akn", name = "l", descriptor = "Lclient!aes;")
	final Class100_Sub2 aClass100_Sub2_2;

	@OriginalMember(owner = "client!akn", name = "u", descriptor = "Lclient!afa;")
	final Class102_Sub1 aClass102_Sub1_27;

	@OriginalMember(owner = "client!akn", name = "g", descriptor = "I")
	final int anInt1623;

	@OriginalMember(owner = "client!akn", name = "i", descriptor = "F")
	final float aFloat143;

	@OriginalMember(owner = "client!akn", name = "m", descriptor = "Lclient!dp;")
	Class229 aClass229_3;

	@OriginalMember(owner = "client!akn", name = "a", descriptor = "[I")
	int[] anIntArray190;

	@OriginalMember(owner = "client!akn", name = "<init>", descriptor = "(Lclient!aes;IILclient!dp;)V")
	Class80_Sub24(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass100_Sub2_2 = arg0;
		this.aClass102_Sub1_27 = this.aClass100_Sub2_2.aClass102_Sub1_3;
		this.anInt1623 = arg1;
		this.aFloat143 = arg2;
		this.aClass229_3 = arg3;
		this.anIntArray190 = new int[this.aClass100_Sub2_2.anInt448 * -1548585779 * this.aClass100_Sub2_2.anInt446 * -1356799781];
	}

	@OriginalMember(owner = "client!akn", name = "s", descriptor = "(III)V")
	void method14255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray190[arg1 * this.aClass100_Sub2_2.anInt448 * -1548585779 + arg0] |= 0x1 << arg2;
		this.anInt1624++;
	}

	@OriginalMember(owner = "client!akn", name = "g", descriptor = "([II)V")
	void method14256(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1625 = 0;
		this.anInt1622 = 32767;
		this.anInt1626 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass102_Sub1_27.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass100_Sub2_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray190[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1626) {
									this.anInt1626 = local63;
								}
								if (local63 < this.anInt1622) {
									this.anInt1622 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1625 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akn", name = "f", descriptor = "(I)V")
	void method14257(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akn", name = "e", descriptor = "(III)V")
	void method14258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray190[arg1 * this.aClass100_Sub2_2.anInt448 * -1548585779 + arg0] |= 0x1 << arg2;
		this.anInt1624++;
	}

	@OriginalMember(owner = "client!akn", name = "j", descriptor = "(I)V")
	void method14259(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akn", name = "l", descriptor = "(I)V")
	void method14260(@OriginalArg(0) int arg0) {
		this.anInterface38_11 = this.aClass102_Sub1_27.method21239(false);
		this.anInterface38_11.method29327(arg0 * 4, 4);
		this.anInterface38_11.method29383(0, arg0 * 4, this.aLong108);
		this.aByteBuffer5.clear();
		this.aByteBuffer5 = null;
		this.aLong108 = 0L;
	}

	@OriginalMember(owner = "client!akn", name = "n", descriptor = "([II)V")
	void method14261(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1625 = 0;
		this.anInt1622 = 32767;
		this.anInt1626 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass102_Sub1_27.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass100_Sub2_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray190[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1626) {
									this.anInt1626 = local63;
								}
								if (local63 < this.anInt1622) {
									this.anInt1622 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1625 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akn", name = "i", descriptor = "(I)V")
	void method14262(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = this.aClass102_Sub1_27.method21359(arg0 * 4);
		this.aLong108 = this.aClass102_Sub1_27.method21141(this.aByteBuffer5);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akn", name = "m", descriptor = "(I)V")
	void method14263(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = this.aClass102_Sub1_27.method21359(arg0 * 4);
		this.aLong108 = this.aClass102_Sub1_27.method21141(this.aByteBuffer5);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akn", name = "o", descriptor = "(I)V")
	void method14264(@OriginalArg(0) int arg0) {
		this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akn", name = "a", descriptor = "(III)V")
	void method14265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray190[arg1 * this.aClass100_Sub2_2.anInt448 * -1548585779 + arg0] |= 0x1 << arg2;
		this.anInt1624++;
	}

	@OriginalMember(owner = "client!akn", name = "v", descriptor = "([II)V")
	void method14266(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1625 = 0;
		this.anInt1622 = 32767;
		this.anInt1626 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass102_Sub1_27.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass100_Sub2_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray190[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1626) {
									this.anInt1626 = local63;
								}
								if (local63 < this.anInt1622) {
									this.anInt1622 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1625 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akn", name = "x", descriptor = "(I)V")
	void method14267(@OriginalArg(0) int arg0) {
		this.anInterface38_11 = this.aClass102_Sub1_27.method21239(false);
		this.anInterface38_11.method29327(arg0 * 4, 4);
		this.anInterface38_11.method29383(0, arg0 * 4, this.aLong108);
		this.aByteBuffer5.clear();
		this.aByteBuffer5 = null;
		this.aLong108 = 0L;
	}

	@OriginalMember(owner = "client!akn", name = "z", descriptor = "(I)V")
	void method14268(@OriginalArg(0) int arg0) {
		this.anInterface38_11 = this.aClass102_Sub1_27.method21239(false);
		this.anInterface38_11.method29327(arg0 * 4, 4);
		this.anInterface38_11.method29383(0, arg0 * 4, this.aLong108);
		this.aByteBuffer5.clear();
		this.aByteBuffer5 = null;
		this.aLong108 = 0L;
	}

	@OriginalMember(owner = "client!akn", name = "p", descriptor = "(I)V")
	void method14269(@OriginalArg(0) int arg0) {
		this.anInterface38_11 = this.aClass102_Sub1_27.method21239(false);
		this.anInterface38_11.method29327(arg0 * 4, 4);
		this.anInterface38_11.method29383(0, arg0 * 4, this.aLong108);
		this.aByteBuffer5.clear();
		this.aByteBuffer5 = null;
		this.aLong108 = 0L;
	}

	@OriginalMember(owner = "client!akn", name = "t", descriptor = "(I)V")
	void method14270(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = this.aClass102_Sub1_27.method21359(arg0 * 4);
		this.aLong108 = this.aClass102_Sub1_27.method21141(this.aByteBuffer5);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass102_Sub1_27.anUnsafe4.putByte(this.aLong108 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akn", name = "y", descriptor = "([II)V")
	void method14271(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1625 = 0;
		this.anInt1622 = 32767;
		this.anInt1626 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass102_Sub1_27.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass100_Sub2_2.aShortArrayArray2[local21];
			@Pc(32) int local32 = this.anIntArray190[local21];
			if (local32 != 0 && local27 != null) {
				@Pc(38) int local38 = 0;
				@Pc(40) int local40 = 0;
				while (true) {
					while (true) {
						if (local40 >= local27.length) {
							continue label49;
						}
						if ((local32 & 0x1 << local38++) == 0) {
							local40 += 3;
						} else {
							for (@Pc(53) int local53 = 0; local53 < 3; local53++) {
								@Pc(63) int local63 = local27[local40++] & 0xFFFF;
								if (local63 > this.anInt1626) {
									this.anInt1626 = local63;
								}
								if (local63 < this.anInt1622) {
									this.anInt1622 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1625 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akn", name = "u", descriptor = "(IIIF)V")
	void method14272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1623 != -1) {
			@Pc(11) Class227 local11 = this.aClass102_Sub1_27.aClass235_6.method26120(this.anInt1623, 73831368);
			local16 = local11.aByte120 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte110 != 4) {
				if (arg2 < 0) {
					local26 = 0;
				} else if (arg2 > 127) {
					local26 = 16777215;
				} else {
					local26 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg1 = local26;
				} else {
					local49 = 256 - local16;
					arg1 = ((local26 & 0xFF00FF) * local16 + (arg1 & 0xFF00FF) * local49 & 0xFF00FF00) + ((local26 & 0xFF00) * local16 + (arg1 & 0xFF00) * local49 & 0xFF0000) >> 8;
				}
			}
			local26 = local11.aByte111 & 0xFF;
			if (local26 != 0) {
				local26 += 256;
				@Pc(95) int local95 = (arg1 >> 16 & 0xFF) * local26;
				if (local95 > 65535) {
					local95 = 65535;
				}
				local49 = (arg1 >> 8 & 0xFF) * local26;
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(119) int local119 = (arg1 & 0xFF) * local26;
				if (local119 > 65535) {
					local119 = 65535;
				}
				arg1 = ((local95 & 0xFF00) << 8) + (local49 & 0xFF00) + (local119 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(148) int local148 = arg1 >> 16 & 0xFF;
			local16 = arg1 >> 8 & 0xFF;
			local26 = arg1 & 0xFF;
			local148 = (int) ((float) local148 * arg3);
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 255) {
				local148 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local26 = (int) ((float) local26 * arg3);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			arg1 = local148 << 16 | local16 << 8 | local26;
		}
		if (this.aClass102_Sub1_27.anInt2973 == 0) {
			this.aByteBuffer5.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer5.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer5.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer5.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer5.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer5.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}
}
