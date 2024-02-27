package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class375 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	static final int anInt4764 = 10;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	static final int anInt4766 = 9;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	static final int anInt4767 = 12;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	static final int anInt4768 = 2;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	static final int anInt4769 = 3;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	static final int anInt4770 = 4;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	static final int anInt4771 = 7;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	static final int anInt4772 = 6;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	static final int anInt4773 = 1;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	static final int anInt4774 = 8;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	static final int anInt4775 = 14;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	static final int anInt4776 = 11;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	static final int anInt4777 = 13;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	static final int anInt4778 = 5;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "J")
	long aLong268;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	int anInt4765 = -251461975;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!aat;")
	Class22 aClass22_53 = new Class22();

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(Lclient!yf;S)V")
	static void method28221(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], 1744384565)).anInt4238 * -1174086497;
	}

	@OriginalMember(owner = "client!kd", name = "ra", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method28222(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray38 = Class499.method30329(local13, arg2, -232453085);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(Lclient!yf;I)V")
	static void method28223(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], -1110912110)).aBoolean729 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!alw;)V")
	public Class375(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method28213(arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(Lclient!alw;B)V")
	void method28213(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aLong268 = arg0.method22435(759431973) * 4093702548507819299L;
		this.anInt4765 = arg0.method22431(-118643075) * 251461975;
		for (@Pc(17) int local17 = arg0.method22425((short) 16384); local17 != 0; local17 = arg0.method22425((short) 16384)) {
			@Pc(28) Class93_Sub26 local28;
			if (local17 == 3) {
				local28 = new Class93_Sub26_Sub4(this);
			} else if (local17 == 1) {
				local28 = new Class93_Sub26_Sub1(this);
			} else if (local17 == 13) {
				local28 = new Class93_Sub26_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub26_Sub7(this);
			} else if (local17 == 6) {
				local28 = new Class93_Sub26_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub26_Sub6(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub26_Sub10(this);
			} else if (local17 == 7) {
				local28 = new Class93_Sub26_Sub14(this);
			} else if (local17 == 14) {
				local28 = new Class93_Sub26_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class93_Sub26_Sub11(this);
			} else if (local17 == 9) {
				local28 = new Class93_Sub26_Sub5(this);
			} else if (local17 == 10) {
				local28 = new Class93_Sub26_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class93_Sub26_Sub12(this);
			} else if (local17 == 12) {
				local28 = new Class93_Sub26_Sub8(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22003(arg0, (byte) 16);
			this.aClass22_53.method407(local28, -1094094167);
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(Lclient!kr;)V")
	public void method28214(@OriginalArg(0) Class386 arg0) {
		if (this.aLong268 * 4639426699186182795L != arg0.aLong270 * -6565241591864258875L || this.anInt4765 * -145261977 != arg0.anInt4802 * -452494705) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class93_Sub26 local29 = (Class93_Sub26) this.aClass22_53.method445((byte) 126); local29 != null; local29 = (Class93_Sub26) this.aClass22_53.method415(248844741)) {
			local29.method22004(arg0, -1338095556);
		}
		arg0.anInt4802 += 352216175;
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(Lclient!kr;I)V")
	public void method28215(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		if (this.aLong268 * 4639426699186182795L != arg0.aLong270 * -6565241591864258875L || this.anInt4765 * -145261977 != arg0.anInt4802 * -452494705) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class93_Sub26 local29 = (Class93_Sub26) this.aClass22_53.method445((byte) 89); local29 != null; local29 = (Class93_Sub26) this.aClass22_53.method415(81349378)) {
			local29.method22004(arg0, -2054576589);
		}
		arg0.anInt4802 += 352216175;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(Lclient!alw;)V")
	void method28216(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLong268 = arg0.method22435(1032137359) * 4093702548507819299L;
		this.anInt4765 = arg0.method22431(-118643075) * 251461975;
		for (@Pc(17) int local17 = arg0.method22425((short) 16384); local17 != 0; local17 = arg0.method22425((short) 16384)) {
			@Pc(28) Class93_Sub26 local28;
			if (local17 == 3) {
				local28 = new Class93_Sub26_Sub4(this);
			} else if (local17 == 1) {
				local28 = new Class93_Sub26_Sub1(this);
			} else if (local17 == 13) {
				local28 = new Class93_Sub26_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub26_Sub7(this);
			} else if (local17 == 6) {
				local28 = new Class93_Sub26_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub26_Sub6(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub26_Sub10(this);
			} else if (local17 == 7) {
				local28 = new Class93_Sub26_Sub14(this);
			} else if (local17 == 14) {
				local28 = new Class93_Sub26_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class93_Sub26_Sub11(this);
			} else if (local17 == 9) {
				local28 = new Class93_Sub26_Sub5(this);
			} else if (local17 == 10) {
				local28 = new Class93_Sub26_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class93_Sub26_Sub12(this);
			} else if (local17 == 12) {
				local28 = new Class93_Sub26_Sub8(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22003(arg0, (byte) -1);
			this.aClass22_53.method407(local28, -953790893);
		}
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(Lclient!alw;)V")
	void method28217(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLong268 = arg0.method22435(-1938686165) * 4093702548507819299L;
		this.anInt4765 = arg0.method22431(-118643075) * 251461975;
		for (@Pc(17) int local17 = arg0.method22425((short) 16384); local17 != 0; local17 = arg0.method22425((short) 16384)) {
			@Pc(28) Class93_Sub26 local28;
			if (local17 == 3) {
				local28 = new Class93_Sub26_Sub4(this);
			} else if (local17 == 1) {
				local28 = new Class93_Sub26_Sub1(this);
			} else if (local17 == 13) {
				local28 = new Class93_Sub26_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub26_Sub7(this);
			} else if (local17 == 6) {
				local28 = new Class93_Sub26_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub26_Sub6(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub26_Sub10(this);
			} else if (local17 == 7) {
				local28 = new Class93_Sub26_Sub14(this);
			} else if (local17 == 14) {
				local28 = new Class93_Sub26_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class93_Sub26_Sub11(this);
			} else if (local17 == 9) {
				local28 = new Class93_Sub26_Sub5(this);
			} else if (local17 == 10) {
				local28 = new Class93_Sub26_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class93_Sub26_Sub12(this);
			} else if (local17 == 12) {
				local28 = new Class93_Sub26_Sub8(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22003(arg0, (byte) -5);
			this.aClass22_53.method407(local28, -67436034);
		}
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(Lclient!kr;)V")
	public void method28218(@OriginalArg(0) Class386 arg0) {
		if (this.aLong268 * 4639426699186182795L != arg0.aLong270 * -6565241591864258875L || this.anInt4765 * -145261977 != arg0.anInt4802 * -452494705) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class93_Sub26 local29 = (Class93_Sub26) this.aClass22_53.method445((byte) 125); local29 != null; local29 = (Class93_Sub26) this.aClass22_53.method415(1703059243)) {
			local29.method22004(arg0, -1723349948);
		}
		arg0.anInt4802 += 352216175;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(Lclient!kr;)V")
	public void method28219(@OriginalArg(0) Class386 arg0) {
		if (this.aLong268 * 4639426699186182795L != arg0.aLong270 * -6565241591864258875L || this.anInt4765 * -145261977 != arg0.anInt4802 * -452494705) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class93_Sub26 local29 = (Class93_Sub26) this.aClass22_53.method445((byte) 108); local29 != null; local29 = (Class93_Sub26) this.aClass22_53.method415(965525185)) {
			local29.method22004(arg0, -1248628242);
		}
		arg0.anInt4802 += 352216175;
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(Lclient!kr;)V")
	public void method28220(@OriginalArg(0) Class386 arg0) {
		if (this.aLong268 * 4639426699186182795L != arg0.aLong270 * -6565241591864258875L || this.anInt4765 * -145261977 != arg0.anInt4802 * -452494705) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class93_Sub26 local29 = (Class93_Sub26) this.aClass22_53.method445((byte) 34); local29 != null; local29 = (Class93_Sub26) this.aClass22_53.method415(1860419930)) {
			local29.method22004(arg0, -1013176424);
		}
		arg0.anInt4802 += 352216175;
	}
}
