package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class634 implements Iterable {

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[Lclient!wv;")
	Class649[] aClass649Array2;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[Lclient!wy;")
	Class652[] aClass652Array1;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "(B)[Lclient!zi;")
	public static Class707[] method32805(@OriginalArg(0) byte arg0) {
		return new Class707[] { Class707.aClass707_19, Class707.aClass707_11, Class707.aClass707_9, Class707.aClass707_17, Class707.aClass707_5, Class707.aClass707_12, Class707.aClass707_6, Class707.aClass707_15, Class707.aClass707_18, Class707.aClass707_13, Class707.aClass707_20, Class707.aClass707_4, Class707.aClass707_8, Class707.aClass707_7, Class707.aClass707_16, Class707.aClass707_14, Class707.aClass707_3, Class707.aClass707_2, Class707.aClass707_10 };
	}

	@OriginalMember(owner = "client!we", name = "t", descriptor = "(JIB)Ljava/lang/String;")
	public static String method32806(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = Class62.aCalendar1.get(5);
		@Pc(9) int local9 = Class62.aCalendar1.get(2);
		@Pc(13) int local13 = Class62.aCalendar1.get(1);
		return arg1 == 3 ? Class80_Sub7.method13453(arg0, arg1, 1632852328) : Integer.toString(local5 / 10) + local5 % 10 + "-" + Class62.aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!we", name = "fg", descriptor = "(Lclient!yp;I)V")
	static void method32807(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class476.method29895(local11, local14, arg0, 1896589581);
	}

	@OriginalMember(owner = "client!we", name = "ss", descriptor = "(Lclient!yp;S)V")
	static void method32808(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2067543870);
		Class116_Sub1.method8761(local16, arg0, 1628270099);
	}

	@OriginalMember(owner = "client!we", name = "am", descriptor = "(III)V")
	static void method32809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(6, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class634(@OriginalArg(0) Class480 arg0) {
		this.method32787(arg0.method29926(Class639.aClass639_2.anInt5637 * 1101033235, 1472047355), (byte) 121);
	}

	@OriginalMember(owner = "client!we", name = "z", descriptor = "(I)Lclient!wv;")
	public Class649 method32785(@OriginalArg(0) int arg0) {
		return this.aClass649Array2[arg0];
	}

	@OriginalMember(owner = "client!we", name = "t", descriptor = "(S)V")
	void method32786(@OriginalArg(0) short arg0) {
		this.aClass649Array2 = null;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "([BB)V")
	void method32787(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		this.method32786((short) -5125);
		if (arg0 == null) {
			this.aClass649Array2 = new Class649[0];
		} else {
			this.method32788(new Packet(arg0), 1938189789);
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(Lclient!ald;I)V")
	void method32788(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.g1();
					@Pc(32) int local32 = arg0.g2();
					@Pc(36) int local36 = arg0.g1();
					@Pc(38) int local38 = 0;
					@Pc(40) Class652 local40 = Class652.aClass652_2;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.g1();
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass652Array1[arg0.g1()];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.g1b();
					}
					@Pc(88) boolean local88 = arg0.g1() == 1;
					local19.add(new Class649(local28, local32, local51, local88, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass649Array2 = new Class649[local15 + 1];
				@Pc(117) Iterator local117 = local19.iterator();
				while (local117.hasNext()) {
					@Pc(124) Class649 local124 = (Class649) local117.next();
					this.aClass649Array2[local124.method33081(-719879050)] = local124;
				}
			} else if (local3 == 2) {
				this.aClass652Array1 = new Class652[arg0.g1()];
				for (local13 = arg0.g1(); local13 != 255; local13 = arg0.g1()) {
					@Pc(154) int[] local154 = new int[arg0.g2()];
					for (@Pc(156) int local156 = 0; local156 < local154.length; local156++) {
						local154[local156] = arg0.g4();
					}
					this.aClass652Array1[local13] = new Class652(local154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "l", descriptor = "(II)Lclient!wv;")
	public Class649 method32789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass649Array2[arg0];
	}

	@OriginalMember(owner = "client!we", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class633(this.aClass649Array2);
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "()V")
	void method32790() {
		this.aClass649Array2 = null;
	}

	@OriginalMember(owner = "client!we", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32791() {
		return new Class633(this.aClass649Array2);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32792() {
		return new Class633(this.aClass649Array2);
	}

	@OriginalMember(owner = "client!we", name = "w", descriptor = "(Lclient!ald;)V")
	void method32793(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.g1();
					@Pc(32) int local32 = arg0.g2();
					@Pc(36) int local36 = arg0.g1();
					@Pc(38) int local38 = 0;
					@Pc(40) Class652 local40 = Class652.aClass652_2;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.g1();
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass652Array1[arg0.g1()];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.g1b();
					}
					@Pc(88) boolean local88 = arg0.g1() == 1;
					local19.add(new Class649(local28, local32, local51, local88, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass649Array2 = new Class649[local15 + 1];
				@Pc(117) Iterator local117 = local19.iterator();
				while (local117.hasNext()) {
					@Pc(124) Class649 local124 = (Class649) local117.next();
					this.aClass649Array2[local124.method33081(-642353620)] = local124;
				}
			} else if (local3 == 2) {
				this.aClass652Array1 = new Class652[arg0.g1()];
				for (local13 = arg0.g1(); local13 != 255; local13 = arg0.g1()) {
					@Pc(154) int[] local154 = new int[arg0.g2()];
					for (@Pc(156) int local156 = 0; local156 < local154.length; local156++) {
						local154[local156] = arg0.g4();
					}
					this.aClass652Array1[local13] = new Class652(local154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "()V")
	void method32794() {
		this.aClass649Array2 = null;
	}

	@OriginalMember(owner = "client!we", name = "m", descriptor = "()V")
	void method32795() {
		this.aClass649Array2 = null;
	}

	@OriginalMember(owner = "client!we", name = "s", descriptor = "([B)V")
	void method32796(@OriginalArg(0) byte[] arg0) {
		this.method32786((short) -10062);
		if (arg0 == null) {
			this.aClass649Array2 = new Class649[0];
		} else {
			this.method32788(new Packet(arg0), 1957215960);
		}
	}

	@OriginalMember(owner = "client!we", name = "k", descriptor = "([B)V")
	void method32797(@OriginalArg(0) byte[] arg0) {
		this.method32786((short) -3200);
		if (arg0 == null) {
			this.aClass649Array2 = new Class649[0];
		} else {
			this.method32788(new Packet(arg0), 2123890793);
		}
	}

	@OriginalMember(owner = "client!we", name = "x", descriptor = "(Lclient!ald;)V")
	void method32798(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.g1();
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.g1();
					@Pc(32) int local32 = arg0.g2();
					@Pc(36) int local36 = arg0.g1();
					@Pc(38) int local38 = 0;
					@Pc(40) Class652 local40 = Class652.aClass652_2;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.g1();
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass652Array1[arg0.g1()];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.g1b();
					}
					@Pc(88) boolean local88 = arg0.g1() == 1;
					local19.add(new Class649(local28, local32, local51, local88, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass649Array2 = new Class649[local15 + 1];
				@Pc(117) Iterator local117 = local19.iterator();
				while (local117.hasNext()) {
					@Pc(124) Class649 local124 = (Class649) local117.next();
					this.aClass649Array2[local124.method33081(1221233441)] = local124;
				}
			} else if (local3 == 2) {
				this.aClass652Array1 = new Class652[arg0.g1()];
				for (local13 = arg0.g1(); local13 != 255; local13 = arg0.g1()) {
					@Pc(154) int[] local154 = new int[arg0.g2()];
					for (@Pc(156) int local156 = 0; local156 < local154.length; local156++) {
						local154[local156] = arg0.g4();
					}
					this.aClass652Array1[local13] = new Class652(local154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "u", descriptor = "(I)I")
	public int method32799(@OriginalArg(0) int arg0) {
		return this.aClass649Array2.length;
	}

	@OriginalMember(owner = "client!we", name = "r", descriptor = "()I")
	public int method32800() {
		return this.aClass649Array2.length;
	}

	@OriginalMember(owner = "client!we", name = "q", descriptor = "()I")
	public int method32801() {
		return this.aClass649Array2.length;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)Lclient!wv;")
	public Class649 method32802(@OriginalArg(0) int arg0) {
		return this.aClass649Array2[arg0];
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Lclient!wv;")
	public Class649 method32803(@OriginalArg(0) int arg0) {
		return this.aClass649Array2[arg0];
	}

	@OriginalMember(owner = "client!we", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32804() {
		return new Class633(this.aClass649Array2);
	}
}
