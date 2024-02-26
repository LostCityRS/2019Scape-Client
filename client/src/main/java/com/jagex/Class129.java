package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public abstract class Class129 implements Interface32 {

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Lclient!ed;")
	Class104 aClass104_18;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "J")
	long aLong161;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	int anInt2854;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_78;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_79;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "Lclient!kn;")
	final Class125 aClass125_5;

	@OriginalMember(owner = "client!kv", name = "avw", descriptor = "(Lclient!yp;I)V")
	static void method20281(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!kv", name = "bff", descriptor = "(Lclient!yp;I)V")
	static void method20282(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!kv", name = "bfz", descriptor = "(Lclient!yp;I)V")
	static void method20283(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Ljava/lang/String;I)V")
	static void method20284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class138.aClass710_3 = Class710.aClass710_8;
		Class2_Sub1.aString13 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "(II)V")
	public static void method20285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(10, (long) arg0);
		local4.method22078(2100260055);
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;Lclient!kn;)V")
	Class129(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class125 arg2) {
		this.aClass480_78 = arg0;
		this.aClass480_79 = arg1;
		this.aClass125_5 = arg2;
	}

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "()I")
	final int method20271() {
		@Pc(3) int local3 = Class365.aClass369_1.method28332(-1042657365);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2854 * 2018536179 && local3 != 0) {
			@Pc(19) int local19 = Class365.aClass369_1.method28302((byte) -104);
			if (local19 > local3) {
				@Pc(31) long local31 = this.aLong161 * -8978064761541613925L - Class365.aClass369_1.method28306(1023004530);
				if (local31 > 0L) {
					@Pc(47) long local47 = (long) (local19 - local3) * (local31 * 10000L / (long) local3);
					@Pc(57) long local57 = (Class303.method27111((byte) 116) - this.aLong161 * -8978064761541613925L) * 10000L;
					if (local57 < local47) {
						local7 = (int) (local57 * 100L * (long) (local19 - local3) / local47 + (long) (local3 * 100));
					} else {
						local7 = local19 * 100;
					}
				}
			}
		} else {
			this.anInt2854 = local3 * -1454522821;
			this.aLong161 = Class303.method27111((byte) 73) * -615229443635130477L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(ZB)V")
	@Override
	public final void method28662(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		@Pc(19) int local19 = this.aClass125_5.aClass391_8.method28669(this.aClass125_5.anInt2900 * 199320851, client.anInt3510 * 1528239985, (byte) -100) + this.aClass125_5.anInt2899 * 808275465;
		@Pc(39) int local39 = this.aClass125_5.aClass383_8.method28573(this.aClass125_5.anInt2903 * 1087492339, client.anInt3511 * 1764386615, (byte) 64) + this.aClass125_5.anInt2901 * 1789354437;
		this.method20274(arg0, local19, local39, (byte) 90);
		this.method20273(arg0, local19, local39, -903003123);
		@Pc(55) String local55 = Class365.aClass369_1.method28304(2024787963);
		if (Class303.method27111((byte) 66) - this.aLong161 * -8978064761541613925L > 10000L) {
			local55 = local55 + " (" + Class365.aClass369_1.method28307((byte) 21).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_18.method7642(local55, local19 + this.aClass125_5.anInt2900 * 199320851 / 2, local39 + this.aClass125_5.anInt2903 * 1087492339 / 2 + 4 + this.aClass125_5.anInt2902 * -173381277, this.aClass125_5.anInt2905 * -1330014629, -1, 1095872157);
	}

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "(I)V")
	@Override
	public void method28658(@OriginalArg(0) int arg0) {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_79, this.aClass125_5.anInt2904 * -176628393, Class317.aClass464_1, 1812510105);
		this.aClass104_18 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_78, this.aClass125_5.anInt2904 * -176628393), true);
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "(Z)V")
	@Override
	public final void method28660(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass391_8.method28669(this.aClass125_5.anInt2900 * 199320851, client.anInt3510 * 1528239985, (byte) -91) + this.aClass125_5.anInt2899 * 808275465;
		@Pc(39) int local39 = this.aClass125_5.aClass383_8.method28573(this.aClass125_5.anInt2903 * 1087492339, client.anInt3511 * 1764386615, (byte) 21) + this.aClass125_5.anInt2901 * 1789354437;
		this.method20274(arg0, local19, local39, (byte) 32);
		this.method20273(arg0, local19, local39, 1191237258);
		@Pc(55) String local55 = Class365.aClass369_1.method28304(1942246055);
		if (Class303.method27111((byte) 48) - this.aLong161 * -8978064761541613925L > 10000L) {
			local55 = local55 + " (" + Class365.aClass369_1.method28307((byte) 89).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_18.method7642(local55, local19 + this.aClass125_5.anInt2900 * 199320851 / 2, local39 + this.aClass125_5.anInt2903 * 1087492339 / 2 + 4 + this.aClass125_5.anInt2902 * -173381277, this.aClass125_5.anInt2905 * -1330014629, -1, 1725566424);
	}

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "(ZII)V")
	abstract void method20272(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "(ZIII)V")
	abstract void method20273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIIB)V")
	abstract void method20274(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "(Z)V")
	@Override
	public final void method28656(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass391_8.method28669(this.aClass125_5.anInt2900 * 199320851, client.anInt3510 * 1528239985, (byte) -95) + this.aClass125_5.anInt2899 * 808275465;
		@Pc(39) int local39 = this.aClass125_5.aClass383_8.method28573(this.aClass125_5.anInt2903 * 1087492339, client.anInt3511 * 1764386615, (byte) 8) + this.aClass125_5.anInt2901 * 1789354437;
		this.method20274(arg0, local19, local39, (byte) 127);
		this.method20273(arg0, local19, local39, -1725355);
		@Pc(55) String local55 = Class365.aClass369_1.method28304(-690349989);
		if (Class303.method27111((byte) 87) - this.aLong161 * -8978064761541613925L > 10000L) {
			local55 = local55 + " (" + Class365.aClass369_1.method28307((byte) 31).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_18.method7642(local55, local19 + this.aClass125_5.anInt2900 * 199320851 / 2, local39 + this.aClass125_5.anInt2903 * 1087492339 / 2 + 4 + this.aClass125_5.anInt2902 * -173381277, this.aClass125_5.anInt2905 * -1330014629, -1, 1891091546);
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(Z)V")
	@Override
	public final void method28659(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass391_8.method28669(this.aClass125_5.anInt2900 * 199320851, client.anInt3510 * 1528239985, (byte) -43) + this.aClass125_5.anInt2899 * 808275465;
		@Pc(39) int local39 = this.aClass125_5.aClass383_8.method28573(this.aClass125_5.anInt2903 * 1087492339, client.anInt3511 * 1764386615, (byte) 52) + this.aClass125_5.anInt2901 * 1789354437;
		this.method20274(arg0, local19, local39, (byte) 56);
		this.method20273(arg0, local19, local39, -926968630);
		@Pc(55) String local55 = Class365.aClass369_1.method28304(1271560948);
		if (Class303.method27111((byte) 14) - this.aLong161 * -8978064761541613925L > 10000L) {
			local55 = local55 + " (" + Class365.aClass369_1.method28307((byte) 4).anInt4490 * 1975723063 + ")";
		}
		this.aClass104_18.method7642(local55, local19 + this.aClass125_5.anInt2900 * 199320851 / 2, local39 + this.aClass125_5.anInt2903 * 1087492339 / 2 + 4 + this.aClass125_5.anInt2902 * -173381277, this.aClass125_5.anInt2905 * -1330014629, -1, 1549265743);
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method28657(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_78.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_79.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "()V")
	@Override
	public void method28661() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_79, this.aClass125_5.anInt2904 * -176628393, Class317.aClass464_1, 1401674479);
		this.aClass104_18 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_78, this.aClass125_5.anInt2904 * -176628393), true);
	}

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "()V")
	@Override
	public void method28663() {
		@Pc(10) Class15 local10 = Class218.method25878(this.aClass480_79, this.aClass125_5.anInt2904 * -176628393, Class317.aClass464_1, 1693415386);
		this.aClass104_18 = Class279.aClass102_9.method20749(local10, Class212.method25823(this.aClass480_78, this.aClass125_5.anInt2904 * -176628393), true);
	}

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "()Z")
	@Override
	public boolean method28664() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_78.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_79.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "()Z")
	@Override
	public boolean method28665() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass480_78.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		if (!this.aClass480_79.method29945(this.aClass125_5.anInt2904 * -176628393, (byte) 1)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "(ZII)V")
	abstract void method20275(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "(ZII)V")
	abstract void method20276(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "(ZII)V")
	abstract void method20277(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "(ZII)V")
	abstract void method20278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()I")
	final int method20279() {
		@Pc(3) int local3 = Class365.aClass369_1.method28332(-2001462135);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2854 * 2018536179 && local3 != 0) {
			@Pc(19) int local19 = Class365.aClass369_1.method28302((byte) -125);
			if (local19 > local3) {
				@Pc(31) long local31 = this.aLong161 * -8978064761541613925L - Class365.aClass369_1.method28306(-2002916672);
				if (local31 > 0L) {
					@Pc(47) long local47 = (long) (local19 - local3) * (local31 * 10000L / (long) local3);
					@Pc(57) long local57 = (Class303.method27111((byte) 18) - this.aLong161 * -8978064761541613925L) * 10000L;
					if (local57 < local47) {
						local7 = (int) (local57 * 100L * (long) (local19 - local3) / local47 + (long) (local3 * 100));
					} else {
						local7 = local19 * 100;
					}
				}
			}
		} else {
			this.anInt2854 = local3 * -1454522821;
			this.aLong161 = Class303.method27111((byte) 18) * -615229443635130477L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "(I)I")
	final int method20280(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class365.aClass369_1.method28332(-1170429593);
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2854 * 2018536179 && local3 != 0) {
			@Pc(19) int local19 = Class365.aClass369_1.method28302((byte) -88);
			if (local19 > local3) {
				@Pc(31) long local31 = this.aLong161 * -8978064761541613925L - Class365.aClass369_1.method28306(1578580009);
				if (local31 > 0L) {
					@Pc(47) long local47 = (long) (local19 - local3) * (local31 * 10000L / (long) local3);
					@Pc(57) long local57 = (Class303.method27111((byte) 43) - this.aLong161 * -8978064761541613925L) * 10000L;
					if (local57 < local47) {
						local7 = (int) (local57 * 100L * (long) (local19 - local3) / local47 + (long) (local3 * 100));
					} else {
						local7 = local19 * 100;
					}
				}
			}
		} else {
			this.anInt2854 = local3 * -1454522821;
			this.aLong161 = Class303.method27111((byte) 36) * -615229443635130477L;
		}
		return local7;
	}
}
