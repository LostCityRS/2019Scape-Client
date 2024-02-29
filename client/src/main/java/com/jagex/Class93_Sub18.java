package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akh")
public class Class93_Sub18 extends Class93 {

	@OriginalMember(owner = "client!akh", name = "z", descriptor = "Lclient!lr;")
	Interface37 anInterface37_10;

	@OriginalMember(owner = "client!akh", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!akh", name = "o", descriptor = "J")
	long aLong77;

	@OriginalMember(owner = "client!akh", name = "p", descriptor = "I")
	int anInt1539 = 0;

	@OriginalMember(owner = "client!akh", name = "c", descriptor = "I")
	int anInt1541 = 0;

	@OriginalMember(owner = "client!akh", name = "r", descriptor = "I")
	int anInt1537 = 0;

	@OriginalMember(owner = "client!akh", name = "v", descriptor = "I")
	int anInt1540 = 0;

	@OriginalMember(owner = "client!akh", name = "f", descriptor = "Lclient!aem;")
	final Class99_Sub3 aClass99_Sub3_1;

	@OriginalMember(owner = "client!akh", name = "k", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_26;

	@OriginalMember(owner = "client!akh", name = "w", descriptor = "I")
	final int anInt1538;

	@OriginalMember(owner = "client!akh", name = "l", descriptor = "F")
	final float aFloat148;

	@OriginalMember(owner = "client!akh", name = "u", descriptor = "Lclient!dy;")
	Class237 aClass237_3;

	@OriginalMember(owner = "client!akh", name = "d", descriptor = "[I")
	int[] anIntArray177;

	@OriginalMember(owner = "client!akh", name = "<init>", descriptor = "(Lclient!aem;IILclient!dy;)V", line = 23)
	Class93_Sub18(@OriginalArg(0) Class99_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass99_Sub3_1 = arg0;
		this.aClass104_Sub2_26 = this.aClass99_Sub3_1.aClass104_Sub2_2;
		this.anInt1538 = arg1;
		this.aFloat148 = arg2;
		this.aClass237_3 = arg3;
		this.anIntArray177 = new int[this.aClass99_Sub3_1.anInt414 * -1667858293 * this.aClass99_Sub3_1.anInt413 * -143202029];
	}

	@OriginalMember(owner = "client!akh", name = "e", descriptor = "(I)V", line = 33)
	void method13590(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = this.aClass104_Sub2_26.method20895(arg0 * 4);
		this.aLong77 = this.aClass104_Sub2_26.method20896(this.aByteBuffer4);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass104_Sub2_26.anUnsafe4.putByte(this.aLong77 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akh", name = "l", descriptor = "(I)V", line = 33)
	void method13591(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = this.aClass104_Sub2_26.method20895(arg0 * 4);
		this.aLong77 = this.aClass104_Sub2_26.method20896(this.aByteBuffer4);
		for (@Pc(16) int local16 = 3; local16 < arg0 * 4; local16 += 4) {
			this.aClass104_Sub2_26.anUnsafe4.putByte(this.aLong77 + (long) local16, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!akh", name = "n", descriptor = "(I)V", line = 39)
	void method13592(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_26.anUnsafe4.putByte(this.aLong77 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akh", name = "u", descriptor = "(I)V", line = 39)
	void method13593(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_26.anUnsafe4.putByte(this.aLong77 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akh", name = "z", descriptor = "(I)V", line = 39)
	void method13594(@OriginalArg(0) int arg0) {
		this.aClass104_Sub2_26.anUnsafe4.putByte(this.aLong77 + (long) (arg0 * 4) + 3L, (byte) -1);
	}

	@OriginalMember(owner = "client!akh", name = "m", descriptor = "(III)V", line = 43)
	void method13595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray177[arg1 * this.aClass99_Sub3_1.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
		this.anInt1539++;
	}

	@OriginalMember(owner = "client!akh", name = "p", descriptor = "(III)V", line = 43)
	void method13596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray177[arg1 * this.aClass99_Sub3_1.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
		this.anInt1539++;
	}

	@OriginalMember(owner = "client!akh", name = "d", descriptor = "(III)V", line = 43)
	void method13597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray177[arg1 * this.aClass99_Sub3_1.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
		this.anInt1539++;
	}

	@OriginalMember(owner = "client!akh", name = "r", descriptor = "(III)V", line = 43)
	void method13598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray177[arg1 * this.aClass99_Sub3_1.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
		this.anInt1539++;
	}

	@OriginalMember(owner = "client!akh", name = "c", descriptor = "(III)V", line = 43)
	void method13599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray177[arg1 * this.aClass99_Sub3_1.anInt414 * -1667858293 + arg0] |= 0x1 << arg2;
		this.anInt1539++;
	}

	@OriginalMember(owner = "client!akh", name = "k", descriptor = "(IIIF)V", line = 48)
	void method13600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1538 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub2_26.aClass225_6.method25597(this.anInt1538, -972045759);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
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
			local26 = local11.aByte122 & 0xFF;
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
		if (this.aClass104_Sub2_26.anInt2953 == 0) {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!akh", name = "v", descriptor = "(IIIF)V", line = 48)
	void method13601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1538 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub2_26.aClass225_6.method25597(this.anInt1538, -594209001);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
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
			local26 = local11.aByte122 & 0xFF;
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
		if (this.aClass104_Sub2_26.anInt2953 == 0) {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!akh", name = "y", descriptor = "(IIIF)V", line = 48)
	void method13602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(16) int local16;
		@Pc(26) int local26;
		if (this.anInt1538 != -1) {
			@Pc(11) Class235 local11 = this.aClass104_Sub2_26.aClass225_6.method25597(this.anInt1538, 139313815);
			local16 = local11.aByte123 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte114 != 4) {
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
			local26 = local11.aByte122 & 0xFF;
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
		if (this.aClass104_Sub2_26.anInt2953 == 0) {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 16));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 0));
		} else {
			this.aByteBuffer4.put(arg0 * 4, (byte) (arg1 >> 0));
			this.aByteBuffer4.put(arg0 * 4 + 1, (byte) (arg1 >> 8));
			this.aByteBuffer4.put(arg0 * 4 + 2, (byte) (arg1 >> 16));
		}
	}

	@OriginalMember(owner = "client!akh", name = "f", descriptor = "(I)V", line = 103)
	void method13603(@OriginalArg(0) int arg0) {
		this.anInterface37_10 = this.aClass104_Sub2_26.method21174(false);
		this.anInterface37_10.method29315(arg0 * 4, 4);
		this.anInterface37_10.method29333(0, arg0 * 4, this.aLong77);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong77 = 0L;
	}

	@OriginalMember(owner = "client!akh", name = "x", descriptor = "(I)V", line = 103)
	void method13604(@OriginalArg(0) int arg0) {
		this.anInterface37_10 = this.aClass104_Sub2_26.method21174(false);
		this.anInterface37_10.method29315(arg0 * 4, 4);
		this.anInterface37_10.method29333(0, arg0 * 4, this.aLong77);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong77 = 0L;
	}

	@OriginalMember(owner = "client!akh", name = "h", descriptor = "(I)V", line = 103)
	void method13605(@OriginalArg(0) int arg0) {
		this.anInterface37_10 = this.aClass104_Sub2_26.method21174(false);
		this.anInterface37_10.method29315(arg0 * 4, 4);
		this.anInterface37_10.method29333(0, arg0 * 4, this.aLong77);
		this.aByteBuffer4.clear();
		this.aByteBuffer4 = null;
		this.aLong77 = 0L;
	}

	@OriginalMember(owner = "client!akh", name = "w", descriptor = "([II)V", line = 112)
	void method13606(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1541 = 0;
		this.anInt1537 = 32767;
		this.anInt1540 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass104_Sub2_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass99_Sub3_1.aShortArrayArray3[local21];
			@Pc(32) int local32 = this.anIntArray177[local21];
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
								if (local63 > this.anInt1540) {
									this.anInt1540 = local63;
								}
								if (local63 < this.anInt1537) {
									this.anInt1537 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1541 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akh", name = "a", descriptor = "([II)V", line = 112)
	void method13607(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1541 = 0;
		this.anInt1537 = 32767;
		this.anInt1540 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass104_Sub2_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass99_Sub3_1.aShortArrayArray3[local21];
			@Pc(32) int local32 = this.anIntArray177[local21];
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
								if (local63 > this.anInt1540) {
									this.anInt1540 = local63;
								}
								if (local63 < this.anInt1537) {
									this.anInt1537 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1541 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!akh", name = "g", descriptor = "([II)V", line = 112)
	void method13608(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1541 = 0;
		this.anInt1537 = 32767;
		this.anInt1540 = -32768;
		@Pc(12) ByteBuffer local12 = this.aClass104_Sub2_26.aByteBuffer7;
		label49: for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			@Pc(21) int local21 = arg0[local14];
			@Pc(27) short[] local27 = this.aClass99_Sub3_1.aShortArrayArray3[local21];
			@Pc(32) int local32 = this.anIntArray177[local21];
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
								if (local63 > this.anInt1540) {
									this.anInt1540 = local63;
								}
								if (local63 < this.anInt1537) {
									this.anInt1537 = local63;
								}
								local12.putShort((short) local63);
							}
							this.anInt1541 += 3;
						}
					}
				}
			}
		}
	}
}
