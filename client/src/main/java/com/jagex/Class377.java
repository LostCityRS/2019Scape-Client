package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class377 implements Interface32 {

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!ed;")
	Class104 aClass104_24;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	int anInt4528;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "J")
	long aLong373 = -7240852760952086281L;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_103;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!pf;")
	final Class480 aClass480_104;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "Lclient!kc;")
	final Class375 aClass375_1;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "(ZB)V")
	public static void method28474(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ke", name = "agn", descriptor = "(Lclient!yp;I)V")
	static void method28475(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054(local13, -407259835);
		if (local23 < 1 || local23 > 5 || local29.aStringArray4[local23 - 1] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local29.aStringArray4[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!ke", name = "ec", descriptor = "(Lclient!yp;I)V")
	static void method28476(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class579.method31812(local11, local14, arg0, -1686656207);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!kc;)V")
	Class377(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class375 arg2) {
		this.aClass480_103 = arg0;
		this.aClass480_104 = arg1;
		this.aClass375_1 = arg2;
	}

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "(Z)V")
	@Override
	public void method28660(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass375_1.aClass391_9.method28669(0, client.anInt3510 * 1528239985, (byte) -12) + this.aClass375_1.anInt4516 * -702791817;
		@Pc(31) int local31 = this.aClass375_1.aClass383_9.method28573(0, client.anInt3511 * 1764386615, (byte) 114) + this.aClass375_1.anInt4512 * -1552725369;
		@Pc(39) String local39;
		switch(this.aClass375_1.anInt4519 * -1889789311) {
			case 0:
				local39 = Class365.aClass369_1.method28303((byte) 61);
				break;
			case 1:
				local39 = "" + Class365.aClass369_1.method28332(-1329420431) + "%";
				break;
			case 2:
				local39 = Class365.aClass369_1.method28304(1751097478);
				break;
			default:
				local39 = "";
		}
		@Pc(67) int local67 = Class365.aClass369_1.method28332(-224021344);
		if (this.aLong373 * 1124598000462765881L < 0L || local67 == 0 || this.anInt4528 * -376011947 != local67) {
			this.aLong373 = Class303.method27111((byte) 121) * 7240852760952086281L;
			this.anInt4528 = local67 * 2122932733;
		}
		if (this.aClass375_1.anInt4519 * -1889789311 != 1 && Class303.method27111((byte) 25) - this.aLong373 * 1124598000462765881L > 10000L) {
			local39 = local39 + " (" + Class365.aClass369_1.method28307((byte) -97).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_24.method7642(local39, local15, local31, this.aClass375_1.anInt4518 * 1968072543, -1, 886799486);
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(ZB)V")
	@Override
	public void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(15) int local15 = this.aClass375_1.aClass391_9.method28669(0, client.anInt3510 * 1528239985, (byte) -118) + this.aClass375_1.anInt4516 * -702791817;
		@Pc(31) int local31 = this.aClass375_1.aClass383_9.method28573(0, client.anInt3511 * 1764386615, (byte) 46) + this.aClass375_1.anInt4512 * -1552725369;
		@Pc(39) String local39;
		switch(this.aClass375_1.anInt4519 * -1889789311) {
			case 0:
				local39 = Class365.aClass369_1.method28303((byte) 126);
				break;
			case 1:
				local39 = "" + Class365.aClass369_1.method28332(783516331) + "%";
				break;
			case 2:
				local39 = Class365.aClass369_1.method28304(524011942);
				break;
			default:
				local39 = "";
		}
		@Pc(67) int local67 = Class365.aClass369_1.method28332(-1698902773);
		if (this.aLong373 * 1124598000462765881L < 0L || local67 == 0 || this.anInt4528 * -376011947 != local67) {
			this.aLong373 = Class303.method27111((byte) 45) * 7240852760952086281L;
			this.anInt4528 = local67 * 2122932733;
		}
		if (this.aClass375_1.anInt4519 * -1889789311 != 1 && Class303.method27111((byte) 64) - this.aLong373 * 1124598000462765881L > 10000L) {
			local39 = local39 + " (" + Class365.aClass369_1.method28307((byte) 24).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_24.method7642(local39, local15, local31, this.aClass375_1.anInt4518 * 1968072543, -1, 1158459925);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_103.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_104.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_104, this.aClass375_1.anInt4515 * -1686068985, Class317.aClass464_1, 1473614122);
		this.aClass104_24 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_103, this.aClass375_1.anInt4515 * -1686068985), true);
	}

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "(Z)V")
	@Override
	public void method28656(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass375_1.aClass391_9.method28669(0, client.anInt3510 * 1528239985, (byte) -5) + this.aClass375_1.anInt4516 * -702791817;
		@Pc(31) int local31 = this.aClass375_1.aClass383_9.method28573(0, client.anInt3511 * 1764386615, (byte) 98) + this.aClass375_1.anInt4512 * -1552725369;
		@Pc(39) String local39;
		switch(this.aClass375_1.anInt4519 * -1889789311) {
			case 0:
				local39 = Class365.aClass369_1.method28303((byte) 76);
				break;
			case 1:
				local39 = "" + Class365.aClass369_1.method28332(-533011241) + "%";
				break;
			case 2:
				local39 = Class365.aClass369_1.method28304(-485356774);
				break;
			default:
				local39 = "";
		}
		@Pc(67) int local67 = Class365.aClass369_1.method28332(-1792093508);
		if (this.aLong373 * 1124598000462765881L < 0L || local67 == 0 || this.anInt4528 * -376011947 != local67) {
			this.aLong373 = Class303.method27111((byte) 81) * 7240852760952086281L;
			this.anInt4528 = local67 * 2122932733;
		}
		if (this.aClass375_1.anInt4519 * -1889789311 != 1 && Class303.method27111((byte) 7) - this.aLong373 * 1124598000462765881L > 10000L) {
			local39 = local39 + " (" + Class365.aClass369_1.method28307((byte) -2).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_24.method7642(local39, local15, local31, this.aClass375_1.anInt4518 * 1968072543, -1, 1952406464);
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_104, this.aClass375_1.anInt4515 * -1686068985, Class317.aClass464_1, 2090817822);
		this.aClass104_24 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_103, this.aClass375_1.anInt4515 * -1686068985), true);
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(Z)V")
	@Override
	public void method28659(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass375_1.aClass391_9.method28669(0, client.anInt3510 * 1528239985, (byte) -76) + this.aClass375_1.anInt4516 * -702791817;
		@Pc(31) int local31 = this.aClass375_1.aClass383_9.method28573(0, client.anInt3511 * 1764386615, (byte) 42) + this.aClass375_1.anInt4512 * -1552725369;
		@Pc(39) String local39;
		switch(this.aClass375_1.anInt4519 * -1889789311) {
			case 0:
				local39 = Class365.aClass369_1.method28303((byte) 73);
				break;
			case 1:
				local39 = "" + Class365.aClass369_1.method28332(585351555) + "%";
				break;
			case 2:
				local39 = Class365.aClass369_1.method28304(-524794911);
				break;
			default:
				local39 = "";
		}
		@Pc(67) int local67 = Class365.aClass369_1.method28332(-723838579);
		if (this.aLong373 * 1124598000462765881L < 0L || local67 == 0 || this.anInt4528 * -376011947 != local67) {
			this.aLong373 = Class303.method27111((byte) 86) * 7240852760952086281L;
			this.anInt4528 = local67 * 2122932733;
		}
		if (this.aClass375_1.anInt4519 * -1889789311 != 1 && Class303.method27111((byte) 70) - this.aLong373 * 1124598000462765881L > 10000L) {
			local39 = local39 + " (" + Class365.aClass369_1.method28307((byte) -51).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_24.method7642(local39, local15, local31, this.aClass375_1.anInt4518 * 1968072543, -1, 1425697096);
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_103.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_104.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_103.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_104.method29945(this.aClass375_1.anInt4515 * -1686068985, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_104, this.aClass375_1.anInt4515 * -1686068985, Class317.aClass464_1, 705194141);
		this.aClass104_24 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_103, this.aClass375_1.anInt4515 * -1686068985), true);
	}
}
