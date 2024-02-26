package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.io.OutputStream;

@OriginalClass("client!rd")
public final class Class527 {

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
	int anInt5062;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[B")
	byte[] aByteArray96;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	int anInt5064;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream1;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	int anInt5063 = 0;

	@OriginalMember(owner = "client!rd", name = "bam", descriptor = "(Lclient!yp;B)V")
	static void method30712(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub6_1.method16950(local12, (byte) -102);
	}

	@OriginalMember(owner = "client!rd", name = "bbg", descriptor = "(Lclient!yp;I)V")
	static void method30713(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class120_Sub1_Sub1_Sub1_Sub1 local3 = (Class120_Sub1_Sub1_Sub1_Sub1) arg0.aClass120_Sub1_Sub1_Sub1_4;
		@Pc(5) boolean local5 = false;
		@Pc(8) Class335 local8 = local3.aClass335_1;
		if (local8.anIntArray416 != null) {
			local8 = local8.method27836(Class672.aClass134_1, Class672.aClass134_1, -225038199);
		}
		if (local8 != null) {
			local5 = local8.aBoolean821;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rd", name = "tr", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method30714(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		arg1.anInt5778 -= -1107359310;
		@Pc(15) int local15 = arg1.anIntArray525[arg1.anInt5778 * 1896589581] - 1;
		@Pc(25) int local25 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 1];
		@Pc(35) int local35 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 2];
		@Pc(47) int local47 = Math.max(1, arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 3]);
		@Pc(53) float local53 = (float) local35 / (float) local47;
		@Pc(63) int local63 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 4];
		@Pc(73) int local73 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 5];
		@Pc(83) int local83 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 6];
		@Pc(93) int local93 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 7];
		@Pc(103) int local103 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 8];
		@Pc(113) int local113 = arg1.anIntArray525[arg1.anInt5778 * 1896589581 + 9];
		if (arg0.anInt4136 * -1322281851 != 6) {
			throw new RuntimeException("");
		} else if (local15 >= 0 && local15 < 12) {
			Class308.method27443(arg0, local15, local25, local53, local63, local73, local83, local93, local103, local113, (byte) -127);
			Class296.method26998(arg0, -1783988722);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "(II)V")
	public void method30689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aByteArray96 == null || this.anInt5063 * -189335837 != arg0) {
			this.aByteArray96 = new byte[arg0];
		}
		this.anInt5063 = arg0 * 457703115;
		this.anInt5064 = 0;
		this.anInt5062 = 0;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(Ljava/io/OutputStream;I)V")
	public void method30690(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		this.method30705(1758319366);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "(Z)V")
	public void method30691(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5062 = 0;
			this.anInt5064 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "(ZI)V")
	public void method30692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.anInt5062 = 0;
			this.anInt5064 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(BI)V")
	public void method30693(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = arg0;
		if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
			this.method30704(8607184);
		}
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(III)V")
	public void method30694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5063 * -189335837) {
				local8 = 0;
			}
			this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = this.aByteArray96[local8++];
			if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
				this.method30704(8607184);
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "(Ljava/io/OutputStream;)V")
	public void method30695(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30705(1758319366);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "(II)B")
	public byte method30696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		return this.aByteArray96[local8];
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "()V")
	public void method30697() throws IOException {
		this.method30704(8607184);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)V")
	public void method30698(@OriginalArg(0) int arg0) {
		if (this.aByteArray96 == null || this.anInt5063 * -189335837 != arg0) {
			this.aByteArray96 = new byte[arg0];
		}
		this.anInt5063 = arg0 * 457703115;
		this.anInt5064 = 0;
		this.anInt5062 = 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/io/OutputStream;)V")
	public void method30699(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30705(1758319366);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "(I)V")
	public void method30700(@OriginalArg(0) int arg0) {
		if (this.aByteArray96 == null || this.anInt5063 * -189335837 != arg0) {
			this.aByteArray96 = new byte[arg0];
		}
		this.anInt5063 = arg0 * 457703115;
		this.anInt5064 = 0;
		this.anInt5062 = 0;
	}

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "(II)V")
	public void method30701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5063 * -189335837) {
				local8 = 0;
			}
			this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = this.aByteArray96[local8++];
			if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
				this.method30704(8607184);
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "(Z)V")
	public void method30702(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5062 = 0;
			this.anInt5064 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "(Z)V")
	public void method30703(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5062 = 0;
			this.anInt5064 = 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)V")
	public void method30704(@OriginalArg(0) int arg0) throws IOException {
		@Pc(9) int local9 = this.anInt5064 * 1878473591 - this.anInt5062 * 2113551169;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray96, this.anInt5062 * 2113551169, local9);
		if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
			this.anInt5064 = 0;
		}
		this.anInt5062 = this.anInt5064 * 1958666423;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public void method30705(@OriginalArg(0) int arg0) throws IOException {
		this.method30704(8607184);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(II)V")
	public void method30706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5063 * -189335837) {
				local8 = 0;
			}
			this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = this.aByteArray96[local8++];
			if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
				this.method30704(8607184);
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	public void method30707(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = arg0;
		if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
			this.method30704(8607184);
		}
	}

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "(B)V")
	public void method30708(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = arg0;
		if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
			this.method30704(8607184);
		}
	}

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "(B)V")
	public void method30709(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray96[(this.anInt5064 += -876474809) * 1878473591 - 1] = arg0;
		if (this.anInt5064 * 1878473591 >= this.anInt5063 * -189335837) {
			this.method30704(8607184);
		}
	}

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "(I)B")
	public byte method30710(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		return this.aByteArray96[local8];
	}

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "(I)B")
	public byte method30711(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5064 * 1878473591 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5063 * -189335837;
		}
		return this.aByteArray96[local8];
	}
}
