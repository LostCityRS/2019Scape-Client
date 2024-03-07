package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alw")
public class Packet extends Class93 {

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "J")
	static final long CRC64_POLYNOMIAL = 0xc96c5795d7870f42L;

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "I")
	public static final int anInt3069 = 5000;

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "I")
	public static final int anInt3071 = 100;

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "I")
	static final int CRC32_POLYNOMIAL = 0xedb88320;

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "[I")
	static int[] crctable = new int[256];

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "[J")
	public static long[] crc64table = new long[256];

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "I")
	public int pos;

	static {
		@Pc(11) int local11;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(9) int local9 = local4;
			for (local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			crctable[local4] = local9;
		}

		for (local11 = 0; local11 < 256; local11++) {
			@Pc(49) long local49 = (long) local11;
			for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
				if ((local49 & 0x1L) == 1L) {
					local49 = local49 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local49 >>>= 0x1;
				}
			}
			crc64table[local11] = local49;
		}
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "([BIIB)I", line = 45)
	static int getcrc(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ crctable[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "([BII)I", line = 54)
	public static int getcrc(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return getcrc(arg0, 0, arg1, (byte) 16);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(I)V", line = 57)
	public Packet(@OriginalArg(0) int arg0) {
		this.data = Class723.method36937(arg0, 1818285080);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(IZ)V", line = 62)
	public Packet(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.data = Class723.method36936(arg0, arg1, 495930698);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "([B)V", line = 66)
	public Packet(@OriginalArg(0) byte[] arg0) {
		this.data = arg0;
		this.pos = 0;
	}

	@OriginalMember(owner = "client!alw", name = "m", descriptor = "(B)V", line = 72)
	public void release(@OriginalArg(0) byte arg0) {
		if (this.data != null) {
			Class723.method36940(this.data, (byte) 19);
		}
		this.data = null;
	}

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "(IB)V", line = 77)
	public void p1(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "(II)V", line = 81)
	public void p2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "(II)V", line = 86)
	public void ip2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "(IB)V", line = 91)
	public void p3(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "(IB)V", line = 97)
	public void p4(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "(II)V", line = 104)
	public void ip4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "(J)V", line = 111)
	public void p5(@OriginalArg(0) long arg0) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "(J)V", line = 119)
	public void p6(@OriginalArg(0) long arg0) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "c", descriptor = "(J)V", line = 128)
	public void p8(@OriginalArg(0) long arg0) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "r", descriptor = "(JII)V", line = 139)
	public void pVarLong(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "v", descriptor = "(ZI)V", line = 151)
	public void pbool(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.p1(arg0 ? 1 : 0, (byte) -24);
	}

	@OriginalMember(owner = "client!abu", name = "y", descriptor = "(Ljava/lang/String;I)I", line = 155)
	public static int pjstrlen(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!alw", name = "x", descriptor = "(Ljava/lang/String;I)V", line = 159)
	public void pjstr(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.pos += Class444.method28881(arg0, 0, arg0.length(), this.data, this.pos * 212851357, -1245289712) * -1445626955;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(Ljava/lang/String;I)I", line = 166)
	public static int pjstr2len(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!alw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 170)
	public void pjstr2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.data[(this.pos += -1445626955) * 212851357 - 1] = 0;
		this.pos += Class444.method28881(arg0, 0, arg0.length(), this.data, this.pos * 212851357, -950731040) * -1445626955;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "g", descriptor = "(Ljava/lang/CharSequence;I)V", line = 178)
	public void pUTF8(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Class587.method31643(arg0, -74374927);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = 0;
		this.pVarInt(local3, 534011993);
		this.pos += Class54_Sub1.method14868(this.data, this.pos * 212851357, arg0, (byte) 8) * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "i", descriptor = "([BIII)V", line = 185)
	public void pdata(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.data[(this.pos += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "j", descriptor = "(Lclient!alw;B)V", line = 189)
	public void pdata(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.pdata(arg0.data, 0, arg0.pos * 212851357, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "(II)V", line = 193)
	public void psize2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.data[this.pos * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.data[this.pos * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ae", descriptor = "(IB)V", line = 201)
	public void psize1(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.data[this.pos * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ag", descriptor = "(II)V", line = 208)
	public void pSmart1or2s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 64 && arg0 >= -64) {
			this.p1(arg0 + 64, (byte) 0);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.p2(arg0 + 49152, 2125389251);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ah", descriptor = "(IB)V", line = 220)
	public void pSmart1or2(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0, (byte) -8);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.p2(arg0 + 32768, 2130864696);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "al", descriptor = "(II)V", line = 232)
	public void pSmart2or4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.p2(32767, 2134029885);
		} else if (arg0 < 32767) {
			this.p2(arg0, 2138745190);
		} else {
			this.p4(arg0, (byte) -53);
			this.data[this.pos * 212851357 - 4] = (byte) (this.data[this.pos * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ac", descriptor = "(II)V", line = 251)
	void pVarInt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.p1(arg0 >>> 28 | 0x80, (byte) -26);
					}
					this.p1(arg0 >>> 21 | 0x80, (byte) -76);
				}
				this.p1(arg0 >>> 14 | 0x80, (byte) -11);
			}
			this.p1(arg0 >>> 7 | 0x80, (byte) -69);
		}
		this.p1(arg0 & 0x7F, (byte) -74);
	}

	@OriginalMember(owner = "client!alw", name = "ai", descriptor = "(S)I", line = 265)
	public int g1(@OriginalArg(0) short arg0) {
		return this.data[(this.pos += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "aw", descriptor = "(I)B", line = 269)
	public byte g1b(@OriginalArg(0) int arg0) {
		return this.data[(this.pos += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "as", descriptor = "(I)I", line = 273)
	public int g2(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		return (this.data[this.pos * 212851357 - 1] & 0xFF) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "at", descriptor = "(B)I", line = 278)
	public int g2s(@OriginalArg(0) byte arg0) {
		this.pos += 1403713386;
		@Pc(31) int local31 = ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ad", descriptor = "(S)I", line = 285)
	public int g3(@OriginalArg(0) short arg0) {
		this.pos += -41913569;
		return ((this.data[this.pos * 212851357 - 3] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "am", descriptor = "(I)I", line = 290)
	public int g3s(@OriginalArg(0) int arg0) {
		this.pos += -41913569;
		@Pc(45) int local45 = (this.data[this.pos * 212851357 - 1] & 0xFF) + ((this.data[this.pos * 212851357 - 3] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!alw", name = "au", descriptor = "(I)I", line = 297)
	public int g4(@OriginalArg(0) int arg0) {
		this.pos += -1487540524;
		return ((this.data[this.pos * 212851357 - 3] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 4] & 0xFF) << 24) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ar", descriptor = "(B)I", line = 302)
	public int ig4(@OriginalArg(0) byte arg0) {
		this.pos += -1487540524;
		return (this.data[this.pos * 212851357 - 4] & 0xFF) + ((this.data[this.pos * 212851357 - 3] & 0xFF) << 8) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ap", descriptor = "(I)J", line = 307)
	public long g5(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.g1((short) 16384) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.g4(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "aq", descriptor = "(I)J", line = 313)
	public long g6(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.g2(-1434290800) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.g4(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ax", descriptor = "(I)J", line = 319)
	public long g8(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = (long) this.g4(-118643075) & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.g4(-118643075) & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "av", descriptor = "(II)J", line = 325)
	public long pVarLong(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.data[(this.pos += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "ao", descriptor = "(I)F", line = 339)
	public float gFloat(@OriginalArg(0) int arg0) {
		return Float.intBitsToFloat(this.g4(-118643075));
	}

	@OriginalMember(owner = "client!alw", name = "aj", descriptor = "(B)Ljava/lang/String;", line = 343)
	public String fastgstr(@OriginalArg(0) byte arg0) {
		if (this.data[this.pos * 212851357] == 0) {
			this.pos += -1445626955;
			return null;
		} else {
			return this.gjstr(985856348);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ay", descriptor = "(I)Ljava/lang/String;", line = 351)
	public String gjstr(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.pos * 212851357;
		while (this.data[(this.pos += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.pos * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15306(this.data, local4, local29, (byte) -32);
	}

	@OriginalMember(owner = "client!alw", name = "ab", descriptor = "(I)Ljava/lang/String;", line = 359)
	public String gjstr2(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.data[(this.pos += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.pos * 212851357;
		while (this.data[(this.pos += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.pos * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15306(this.data, local26, local51, (byte) -47);
	}

	@OriginalMember(owner = "client!alw", name = "az", descriptor = "(I)Ljava/lang/String;", line = 369)
	public String gUTF8(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.data[(this.pos += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.gVarInt(1110966645);
		if (local26 + this.pos * 212851357 > this.data.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32754(this.data, this.pos * 212851357, local26, (byte) 27);
		this.pos += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "aa", descriptor = "([BIIS)V", line = 379)
	public void gdata(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.data[(this.pos += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "af", descriptor = "(I)I", line = 383)
	public int gSmart1or2s(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.data[this.pos * 212851357] & 0xFF;
		return local9 < 128 ? this.g1((short) 16384) - 64 : this.g2(-1434290800) - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "ak", descriptor = "(B)I", line = 389)
	public int gSmart1or2(@OriginalArg(0) byte arg0) {
		@Pc(9) int local9 = this.data[this.pos * 212851357] & 0xFF;
		return local9 < 128 ? this.g1((short) 16384) : this.g2(-1434290800) - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "an", descriptor = "(B)I", line = 395)
	public int gSmart1or2null(@OriginalArg(0) byte arg0) {
		@Pc(9) int local9 = this.data[this.pos * 212851357] & 0xFF;
		return local9 < 128 ? this.g1((short) 16384) - 1 : this.g2(-1434290800) - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "bf", descriptor = "(I)I", line = 401)
	public int gExtended1or2(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.gSmart1or2((byte) -66); local5 == 32767; local5 = this.gSmart1or2((byte) -120)) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "bl", descriptor = "(I)I", line = 412)
	public int gSmart2or4(@OriginalArg(0) int arg0) {
		return this.data[this.pos * 212851357] < 0 ? this.g4(-118643075) & Integer.MAX_VALUE : this.g2(-1434290800);
	}

	@OriginalMember(owner = "client!alw", name = "bk", descriptor = "(I)I", line = 417)
	public int gSmart2or4null(@OriginalArg(0) int arg0) {
		if (this.data[this.pos * 212851357] < 0) {
			return this.g4(-118643075) & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.g2(-1434290800);
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "bh", descriptor = "(I)I", line = 424)
	int gVarInt(@OriginalArg(0) int arg0) {
		@Pc(14) byte local14 = this.data[(this.pos += -1445626955) * 212851357 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.data[(this.pos += -1445626955) * 212851357 - 1];
		}
		return local16 | local14;
	}

	// todo: name
	@OriginalMember(owner = "client!alw", name = "bx", descriptor = "(S)I", line = 435)
	public int gVarInt2(@OriginalArg(0) short arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.g1((short) 16384);
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "bd", descriptor = "([II)V", line = 446)
	public void tinyenc(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.pos * 212851357 / 8;
		this.pos = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.g4(-118643075);
			@Pc(22) int local22 = this.g4(-118643075);
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.pos -= 1319886248;
			this.p4(local18, (byte) -24);
			this.p4(local22, (byte) 31);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bc", descriptor = "([II)V", line = 466)
	public void tinydec(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.pos * 212851357 / 8;
		this.pos = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.g4(-118643075);
			@Pc(22) int local22 = this.g4(-118643075);
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.pos -= 1319886248;
			this.p4(local18, (byte) 14);
			this.p4(local22, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bi", descriptor = "([IIIB)V", line = 486)
	public void tinyenc(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = this.pos * 212851357;
		this.pos = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.g4(-118643075);
			@Pc(28) int local28 = this.g4(-118643075);
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local30 + arg0[local30 >>> 11 & 0x3];
			}
			this.pos -= 1319886248;
			this.p4(local24, (byte) -31);
			this.p4(local28, (byte) -53);
		}
		this.pos = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bn", descriptor = "([IIII)V", line = 508)
	public void tinydec(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.pos * 212851357;
		this.pos = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.g4(-118643075);
			@Pc(28) int local28 = this.g4(-118643075);
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.pos -= 1319886248;
			this.p4(local24, (byte) -33);
			this.p4(local28, (byte) -14);
		}
		this.pos = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bt", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V", line = 530)
	public void rsaenc(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) byte arg2) {
        if (!client.ENABLE_RSA) {
            return;
        }

		@Pc(4) int local4 = this.pos * 212851357;
		this.pos = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.gdata(local10, 0, local4, (short) 18161);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.pos = 0;
		this.p2(local29.length, 2129263681);
		this.pdata(local29, 0, local29.length, 2026842986);
	}

	@OriginalMember(owner = "client!alw", name = "bq", descriptor = "(II)I", line = 543)
	public int addcrc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = getcrc(this.data, arg0, this.pos * 212851357, (byte) 16);
		this.p4(local9, (byte) -33);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "bm", descriptor = "(I)Z", line = 549)
	public boolean checkcrc(@OriginalArg(0) int arg0) {
		this.pos -= -1487540524;
		@Pc(15) int local15 = getcrc(this.data, 0, this.pos * 212851357, (byte) 16);
		@Pc(19) int local19 = this.g4(-118643075);
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "bb", descriptor = "(II)V", line = 557)
	public void p1_alt1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "be", descriptor = "(II)V", line = 561)
	public void p1_alt2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!alw", name = "by", descriptor = "(IB)V", line = 565)
	public void p1_alt3(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "bu", descriptor = "(I)I", line = 569)
	public int g1_alt1(@OriginalArg(0) int arg0) {
		return this.data[(this.pos += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "bw", descriptor = "(I)I", line = 573)
	public int g1_alt2(@OriginalArg(0) int arg0) {
		return -this.data[(this.pos += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "bo", descriptor = "(I)I", line = 577)
	public int g1_alt3(@OriginalArg(0) int arg0) {
		return 128 - this.data[(this.pos += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "bz", descriptor = "(B)B", line = 581)
	public byte g1b_alt1(@OriginalArg(0) byte arg0) {
		return (byte) (this.data[(this.pos += -1445626955) * 212851357 - 1] - 128);
	}

	@OriginalMember(owner = "client!alw", name = "bv", descriptor = "(I)B", line = 585)
	public byte g1b_alt2(@OriginalArg(0) int arg0) {
		return (byte) -this.data[(this.pos += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "br", descriptor = "(I)B", line = 589)
	public byte g1b_alt3(@OriginalArg(0) int arg0) {
		return (byte) (128 - this.data[(this.pos += -1445626955) * 212851357 - 1]);
	}

	@OriginalMember(owner = "client!alw", name = "bg", descriptor = "(IB)V", line = 593)
	public void p2_alt1(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ba", descriptor = "(II)V", line = 598)
	public void p2_alt2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "bp", descriptor = "(IS)V", line = 603)
	public void p2_alt3(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "bj", descriptor = "(I)I", line = 608)
	public int g2_alt1(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		return (this.data[this.pos * 212851357 - 2] & 0xFF) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "bs", descriptor = "(I)I", line = 613)
	public int g2_alt2(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		return ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "cl", descriptor = "(I)I", line = 618)
	public int g2_alt3(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		return (this.data[this.pos * 212851357 - 2] - 128 & 0xFF) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cg", descriptor = "(I)I", line = 623)
	public int g2s_alt(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		@Pc(31) int local31 = ((this.data[this.pos * 212851357 - 1] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ce", descriptor = "(I)I", line = 630)
	public int g2s_alt2(@OriginalArg(0) int arg0) {
		this.pos += 1403713386;
		@Pc(33) int local33 = ((this.data[this.pos * 212851357 - 2] & 0xFF) << 8) + (this.data[this.pos * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "cu", descriptor = "(II)V", line = 637)
	public void p3_alt2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ci", descriptor = "(IB)V", line = 643)
	public void p3_alt3(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "cn", descriptor = "(S)I", line = 649)
	public int g3_alt3(@OriginalArg(0) short arg0) {
		this.pos += -41913569;
		return (this.data[this.pos * 212851357 - 1] & 0xFF) + ((this.data[this.pos * 212851357 - 3] & 0xFF) << 8) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!alw", name = "cv", descriptor = "(II)V", line = 654)
	public void p4_alt1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "cp", descriptor = "(II)V", line = 661)
	public void p4_alt2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "ca", descriptor = "(IB)V", line = 668)
	public void p4_alt3(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.data[(this.pos += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "cx", descriptor = "(I)I", line = 675)
	public int g4_alt1(@OriginalArg(0) int arg0) {
		this.pos += -1487540524;
		return (this.data[this.pos * 212851357 - 4] & 0xFF) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 24) + ((this.data[this.pos * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cw", descriptor = "(I)I", line = 680)
	public int g4_alt2(@OriginalArg(0) int arg0) {
		this.pos += -1487540524;
		return (this.data[this.pos * 212851357 - 3] & 0xFF) + ((this.data[this.pos * 212851357 - 4] & 0xFF) << 8) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ct", descriptor = "(I)I", line = 685)
	public int g4_alt3(@OriginalArg(0) int arg0) {
		this.pos += -1487540524;
		return (this.data[this.pos * 212851357 - 2] & 0xFF) + ((this.data[this.pos * 212851357 - 1] & 0xFF) << 8) + ((this.data[this.pos * 212851357 - 4] & 0xFF) << 16) + ((this.data[this.pos * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "cf", descriptor = "([BIIB)V", line = 690)
	public void gdata_alt1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.data[(this.pos += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "co", descriptor = "([BIII)V", line = 694)
	public void gdata_alt2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = (byte) (this.data[(this.pos += -1445626955) * 212851357 - 1] - 128);
		}
	}

}
