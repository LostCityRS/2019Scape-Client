package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asu")
public final class Class80_Sub1_Sub19 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asu", name = "o", descriptor = "[I")
	int[] anIntArray280;

	@OriginalMember(owner = "client!asu", name = "i", descriptor = "Lclient!aca;")
	Class52 aClass52_1;

	@OriginalMember(owner = "client!asu", name = "j", descriptor = "[[I")
	int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!asu", name = "a", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!asu", name = "m", descriptor = "[Ljava/lang/String;")
	String[] aStringArray21;

	@OriginalMember(owner = "client!asu", name = "s", descriptor = "Z")
	public boolean aBoolean614 = true;

	@OriginalMember(owner = "client!asu", name = "aek", descriptor = "(Lclient!yp;I)V")
	static void method23073(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(51) int local51 = Class210.method25806(local43 - local33 + 1, -1757040827);
		if (local23 > local51) {
			local23 = local51;
		}
		local13 = Class637.method32871(local13, local33, local43, (byte) -40);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 | local23 << local33;
	}

	@OriginalMember(owner = "client!asu", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub19() {
	}

	@OriginalMember(owner = "client!asu", name = "p", descriptor = "(Lclient!ald;I)V")
	void method23047(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray21 = Class313.method27482(arg0.method23376((short) 11209), '<', 2036747717);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method23362(-1673061436);
			this.anIntArray281 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray281[local24] = arg0.method23178((byte) -81);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method23362(-1384583410);
			this.anIntArray280 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method23178((byte) -58);
				@Pc(65) Class666 local65 = Class284.method26884(local61, 1167082338);
				if (local65 != null) {
					this.anIntArray280[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5698 * -723646837];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5698 * -723646837; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method23178((byte) -55);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!asu", name = "t", descriptor = "(Lclient!ald;B)V")
	void method23048(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1078436566);
			if (local3 == 0) {
				return;
			}
			this.method23055(arg0, local3, -2072708385);
		}
	}

	@OriginalMember(owner = "client!asu", name = "z", descriptor = "(Lclient!ald;I)V")
	void method23049(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray21 = Class313.method27482(arg0.method23376((short) 14725), '<', 2036747717);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method23362(-1042321111);
			this.anIntArray281 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray281[local24] = arg0.method23178((byte) -11);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method23362(-1054257225);
			this.anIntArray280 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method23178((byte) -3);
				@Pc(65) Class666 local65 = Class284.method26884(local61, -187009838);
				if (local65 != null) {
					this.anIntArray280[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5698 * -723646837];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5698 * -723646837; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method23178((byte) -47);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!asu", name = "e", descriptor = "(Lclient!ald;[IB)V")
	public void method23050(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte arg2) {
		if (this.anIntArray280 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray280.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method23052(local5, 968988270).anInt5700 * -2091171911;
			if (local22 > 0) {
				arg0.method23163((long) arg1[local5], local22, (byte) 39);
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "u", descriptor = "(Lclient!ald;I)Ljava/lang/String;")
	public String method23051(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray280 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray280.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass52_1.method1071(this.method23052(local10, 628539718), this.anIntArrayArray46[local10], arg0.method23187(Class284.method26884(this.anIntArray280[local10], 1490251232).anInt5699 * -1425373873, (byte) -77)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "i", descriptor = "(II)Lclient!xn;")
	public Class666 method23052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray280 == null || arg0 < 0 || arg0 > this.anIntArray280.length ? null : Class284.method26884(this.anIntArray280[arg0], -213414294);
	}

	@OriginalMember(owner = "client!asu", name = "j", descriptor = "(Lclient!ald;)V")
	void method23053(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-501790160);
			if (local3 == 0) {
				return;
			}
			this.method23055(arg0, local3, -1446800173);
		}
	}

	@OriginalMember(owner = "client!asu", name = "m", descriptor = "(IIB)I")
	public int method23054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anIntArray280 == null || arg0 < 0 || arg0 > this.anIntArray280.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray46[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!asu", name = "f", descriptor = "(Lclient!ald;II)V")
	void method23055(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.aStringArray21 = Class313.method27482(arg0.method23376((short) 23650), '<', 2036747717);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method23362(-1713253764);
			this.anIntArray281 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray281[local24] = arg0.method23178((byte) -47);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method23362(-748014814);
			this.anIntArray280 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method23178((byte) -120);
				@Pc(65) Class666 local65 = Class284.method26884(local61, -137873442);
				if (local65 != null) {
					this.anIntArray280[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5698 * -723646837];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5698 * -723646837; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method23178((byte) -114);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!asu", name = "ay", descriptor = "(Lclient!ald;)Ljava/lang/String;")
	public String method23056(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray280 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray280.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass52_1.method1071(this.method23052(local10, 1120557029), this.anIntArrayArray46[local10], arg0.method23187(Class284.method26884(this.anIntArray280[local10], 1682685103).anInt5699 * -1425373873, (byte) -78)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "a", descriptor = "(Lclient!ald;)V")
	void method23057(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(916551307);
			if (local3 == 0) {
				return;
			}
			this.method23055(arg0, local3, -1606197494);
		}
	}

	@OriginalMember(owner = "client!asu", name = "s", descriptor = "(Lclient!ald;)V")
	void method23058(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-2036296922);
			if (local3 == 0) {
				return;
			}
			this.method23055(arg0, local3, -1899538828);
		}
	}

	@OriginalMember(owner = "client!asu", name = "x", descriptor = "(Lclient!ald;)V")
	void method23059(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-179304759);
			if (local3 == 0) {
				return;
			}
			this.method23055(arg0, local3, -1212002500);
		}
	}

	@OriginalMember(owner = "client!asu", name = "o", descriptor = "(B)V")
	void method23060(@OriginalArg(0) byte arg0) {
		if (this.anIntArray281 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray281.length; local5++) {
				this.anIntArray281[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "ax", descriptor = "(Lclient!ald;)Ljava/lang/String;")
	public String method23061(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray280 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray280.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass52_1.method1071(this.method23052(local10, -692899575), this.anIntArrayArray46[local10], arg0.method23187(Class284.method26884(this.anIntArray280[local10], -201738949).anInt5699 * -1425373873, (byte) -8)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "v", descriptor = "(Lclient!ald;[I)V")
	public void method23062(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray280 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray280.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method23052(local5, 573182198).anInt5700 * -2091171911;
			if (local22 > 0) {
				arg0.method23163((long) arg1[local5], local22, (byte) 97);
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "y", descriptor = "(Lclient!ald;[I)V")
	public void method23063(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray280 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray280.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method23052(local5, 386075318).anInt5700 * -2091171911;
			if (local22 > 0) {
				arg0.method23163((long) arg1[local5], local22, (byte) 40);
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "n", descriptor = "(Lclient!ald;)Ljava/lang/String;")
	public String method23064(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray280 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray280.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass52_1.method1071(this.method23052(local10, -293249778), this.anIntArrayArray46[local10], arg0.method23187(Class284.method26884(this.anIntArray280[local10], 2098446113).anInt5699 * -1425373873, (byte) -71)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "g", descriptor = "(B)I")
	public int method23065(@OriginalArg(0) byte arg0) {
		return this.anIntArray280 == null ? 0 : this.anIntArray280.length;
	}

	@OriginalMember(owner = "client!asu", name = "aj", descriptor = "()V")
	void method23066() {
		if (this.anIntArray281 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray281.length; local5++) {
				this.anIntArray281[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "ai", descriptor = "()Ljava/lang/String;")
	public String method23067() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray21 == null) {
			return "";
		}
		local4.append(this.aStringArray21[0]);
		for (@Pc(19) int local19 = 1; local19 < this.aStringArray21.length; local19++) {
			for (@Pc(26) int local26 = 0; local26 < 3; local26++) {
				local4.append('.');
			}
			local4.append(this.aStringArray21[local19]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "aq", descriptor = "()I")
	public int method23068() {
		return this.anIntArray280 == null ? 0 : this.anIntArray280.length;
	}

	@OriginalMember(owner = "client!asu", name = "ao", descriptor = "(II)I")
	public int method23069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray280 == null || arg0 < 0 || arg0 > this.anIntArray280.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray46[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!asu", name = "ag", descriptor = "()V")
	void method23070() {
		if (this.anIntArray281 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray281.length; local5++) {
				this.anIntArray281[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asu", name = "l", descriptor = "(S)Ljava/lang/String;")
	public String method23071(@OriginalArg(0) short arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray21 == null) {
			return "";
		}
		local4.append(this.aStringArray21[0]);
		for (@Pc(19) int local19 = 1; local19 < this.aStringArray21.length; local19++) {
			for (@Pc(26) int local26 = 0; local26 < 3; local26++) {
				local4.append('.');
			}
			local4.append(this.aStringArray21[local19]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!asu", name = "ac", descriptor = "()V")
	void method23072() {
		if (this.anIntArray281 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray281.length; local5++) {
				this.anIntArray281[local5] |= 0x8000;
			}
		}
	}
}
