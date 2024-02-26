package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class378 {

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	static final int anInt4530 = 6;

	@OriginalMember(owner = "client!kf", name = "ax", descriptor = "B")
	static final byte aByte141 = 127;

	@OriginalMember(owner = "client!kf", name = "ay", descriptor = "B")
	static final byte aByte142 = 126;

	@OriginalMember(owner = "client!kf", name = "ai", descriptor = "B")
	static final byte aByte143 = 125;

	@OriginalMember(owner = "client!kf", name = "aq", descriptor = "B")
	static final byte aByte144 = 0;

	@OriginalMember(owner = "client!kf", name = "ao", descriptor = "B")
	public static final byte aByte145 = -1;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
	boolean aBoolean848;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
	boolean aBoolean849;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
	long aLong374;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
	public boolean aBoolean850;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "B")
	public byte aByte137;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "B")
	public byte aByte138;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "B")
	public byte aByte139;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray28;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
	int[] anIntArray439;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "B")
	public byte aByte140;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[J")
	long[] aLongArray24;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[Z")
	public boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "[J")
	long[] aLongArray25;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
	int[] anIntArray440;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray29;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!aax;")
	Class24 aClass24_33;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	int anInt4529 = 0;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/lang/String;")
	public String aString203 = null;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	int anInt4531 = 0;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public int anInt4533 = 2009167065;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int anInt4534 = 1388030397;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(II)Lclient!mb;")
	public static Class413 method28536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class659.aClass138_6 == null ? null : Class659.aClass138_6.method11516(15439498).method29045(arg0, 358118899);
	}

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "(J)V")
	static void method28537(@OriginalArg(0) long arg0) {
		Class62.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "(I)V")
	public static void method28538(@OriginalArg(0) int arg0) {
		if (Class150.aBoolean386) {
			return;
		}
		Class374.method28439(client.aClass539_1.method30932(-1638462787).aClass568ArrayArrayArray3, 1733707791);
		if (client.aClass539_1.method30932(-1638462787).aClass568ArrayArrayArray2 != null) {
			Class374.method28439(client.aClass539_1.method30932(-1638462787).aClass568ArrayArrayArray2, -127310493);
		}
		Class150.aBoolean386 = true;
	}

	@OriginalMember(owner = "client!kf", name = "bcw", descriptor = "(Lclient!yp;B)V")
	static void method28539(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class378(@OriginalArg(0) Packet arg0) {
		this.method28498(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "(IB)Ljava/lang/String;")
	public String method28477(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(10) Class80 local10 = this.aClass24_33.method560((long) arg0);
			return local10 != null && local10 instanceof Class80_Sub19 ? (String) ((Class80_Sub19) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	void method28478(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4535 * -1144582289);
			}
		}
		if (!this.aBoolean849) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4535 * -1144582289);
		}
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(II)V")
	void method28479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean848) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4535 * -1144582289);
			}
		}
		if (!this.aBoolean849) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4535 * -1144582289);
		}
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(Ljava/lang/String;B)I")
	public int method28480(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4532 * 1957870303; local9++) {
			if (this.aStringArray28[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "(IIII)I")
	public int method28481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray440[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(II)Ljava/lang/Long;")
	public Long method28482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub25 ? Long.valueOf(((Class80_Sub25) local11).aLong111 * -3870080695537343021L) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ao", descriptor = "(III)I")
	public int method28483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray440[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "(IZB)I")
	int method28484(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (this.aBooleanArray30[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray30[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "(I)[I")
	public int[] method28485(@OriginalArg(0) int arg0) {
		if (this.anIntArray439 == null) {
			@Pc(8) String[] local8 = new String[this.anInt4532 * 1957870303];
			this.anIntArray439 = new int[this.anInt4532 * 1957870303];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt4532 * 1957870303) {
				local8[local17] = this.aStringArray28[local17];
				if (local8[local17] != null) {
					local8[local17] = local8[local17].toLowerCase();
				}
				this.anIntArray439[local17] = local17++;
			}
			Class602.method32125(local8, this.anIntArray439, -420059808);
		}
		return this.anIntArray439;
	}

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "(I)Ljava/lang/Integer;")
	public Integer method28486(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "(II)V")
	void method28487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anInt4532 * 1957870303) {
			throw new RuntimeException("");
		}
		this.anInt4532 -= -1460698849;
		this.anIntArray439 = null;
		if (this.anInt4532 * 1957870303 == 0) {
			this.aLongArray24 = null;
			this.aStringArray28 = null;
			this.aByteArray89 = null;
			this.anIntArray440 = null;
			this.anIntArray438 = null;
			this.aBooleanArray30 = null;
			this.anInt4533 = 2009167065;
			this.anInt4534 = 1388030397;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray440, arg0 + 1, this.anIntArray440, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray438, arg0 + 1, this.anIntArray438, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4532 * 1957870303 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		if (this.aStringArray28 != null) {
			System.arraycopy(this.aStringArray28, arg0 + 1, this.aStringArray28, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		this.method28488((byte) 91);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	void method28488(@OriginalArg(0) byte arg0) {
		if (this.anInt4532 * 1957870303 == 0) {
			this.anInt4533 = 2009167065;
			this.anInt4534 = 1388030397;
			return;
		}
		this.anInt4533 = 2009167065;
		this.anInt4534 = 1388030397;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray89[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4532 * 1957870303; local26++) {
			if (this.aByteArray89[local26] > local24) {
				if (local24 == 125) {
					this.anInt4534 = local19 * -1388030397;
				}
				local19 = local26;
				local24 = this.aByteArray89[local26];
			} else if (-1263131029 * this.anInt4534 == -1 && this.aByteArray89[local26] == 125) {
				this.anInt4534 = local26 * -1388030397;
			}
		}
		this.anInt4533 = local19 * -2009167065;
		if (this.anInt4533 * -1050135401 != -1) {
			this.aByteArray89[this.anInt4533 * -1050135401] = 126;
		}
	}

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "(JLjava/lang/String;I)V")
	void method28489(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean848 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.aBoolean849 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4535 * -1144582289 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray29 == null || this.anInt4535 * -1144582289 >= this.aStringArray29.length)) {
				this.method28479(this.anInt4535 * -1144582289 + 5, 675571253);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4535 * -1144582289] = arg0;
			}
			if (this.aStringArray29 != null) {
				this.aStringArray29[this.anInt4535 * -1144582289] = arg1;
			}
			this.anInt4535 += 588722063;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "(II)V")
	void method28490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4535 -= 588722063;
		if (this.anInt4535 * -1144582289 == 0) {
			this.aLongArray25 = null;
			this.aStringArray29 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4535 * -1144582289 - arg0);
		}
		if (this.aStringArray29 != null) {
			System.arraycopy(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4535 * -1144582289 - arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "(IBB)I")
	int method28491(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4533 * -1050135401 == arg0 && (this.anInt4534 * -1263131029 == -1 || this.aByteArray89[this.anInt4534 * -1263131029] < 125)) {
			return -1;
		} else if (this.aByteArray89[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28488((byte) 119);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "(ILjava/lang/String;I)Z")
	boolean method28492(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(23) Class80 local23 = this.aClass24_33.method560((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class80_Sub19) {
					@Pc(32) Class80_Sub19 local32 = (Class80_Sub19) local23;
					if (local32.anObject5 instanceof String) {
						if (arg1.equals(local32.anObject5)) {
							return false;
						}
						local32.method24395((byte) 6);
						this.aClass24_33.method563(new Class80_Sub19(arg1), local32.aLong338 * 3209506792906532031L);
						return true;
					}
				}
				local23.method24395((byte) 52);
			}
		}
		this.aClass24_33.method563(new Class80_Sub19(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "ai", descriptor = "(Ljava/lang/String;)I")
	public int method28493(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4532 * 1957870303; local9++) {
			if (this.aStringArray28[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "(III)Z")
	boolean method28494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(9) Class80 local9 = this.aClass24_33.method560((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class80_Sub20) {
					@Pc(17) Class80_Sub20 local17 = (Class80_Sub20) local9;
					if (arg1 == local17.anInt1588 * 701000167) {
						return false;
					}
					local17.anInt1588 = arg1 * -822306345;
					return true;
				}
				local9.method24395((byte) 122);
			}
		}
		this.aClass24_33.method563(new Class80_Sub20(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "(IIIII)Z")
	boolean method28495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(40) Class80 local40 = this.aClass24_33.method560((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class80_Sub20) {
					@Pc(49) Class80_Sub20 local49 = (Class80_Sub20) local40;
					if ((local49.anInt1588 * 701000167 & local22) == local30) {
						return false;
					}
					local49.anInt1588 = (local49.anInt1588 * 701000167 & ~local22) * -822306345;
					local49.anInt1588 = (local49.anInt1588 * 701000167 | local30) * -822306345;
					return true;
				}
				local40.method24395((byte) 105);
			}
		}
		this.aClass24_33.method563(new Class80_Sub20(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "aw", descriptor = "(IIII)Z")
	boolean method28496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(40) Class80 local40 = this.aClass24_33.method560((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class80_Sub20) {
					@Pc(49) Class80_Sub20 local49 = (Class80_Sub20) local40;
					if ((local49.anInt1588 * 701000167 & local22) == local30) {
						return false;
					}
					local49.anInt1588 = (local49.anInt1588 * 701000167 & ~local22) * -822306345;
					local49.anInt1588 = (local49.anInt1588 * 701000167 | local30) * -822306345;
					return true;
				}
				local40.method24395((byte) 53);
			}
		}
		this.aClass24_33.method563(new Class80_Sub20(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "bs", descriptor = "(Lclient!ald;)V")
	void method28497(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.g1();
		if ((local25 & 0x1) != 0) {
			this.aBoolean848 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean849 = true;
		}
		if (!this.aBoolean848) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean849) {
			this.aStringArray28 = null;
			this.aStringArray29 = null;
		}
		this.anInt4529 = arg0.g4() * 1064908177;
		this.anInt4531 = arg0.g4() * 412709923;
		if (local3 <= 3 && this.anInt4531 * 329046923 != 0) {
			this.anInt4531 += -1679496992;
		}
		this.anInt4532 = arg0.g2() * -1460698849;
		this.anInt4535 = arg0.g1() * 588722063;
		this.aString203 = arg0.gjstr();
		if (local3 >= 4) {
			arg0.g4();
		}
		this.aBoolean850 = arg0.g1() == 1;
		this.aByte137 = arg0.g1b();
		this.aByte140 = arg0.g1b();
		this.aByte139 = arg0.g1b();
		this.aByte138 = arg0.g1b();
		@Pc(266) int local266;
		if (this.anInt4532 * 1957870303 > 0) {
			if (this.aBoolean848 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4532 * 1957870303)) {
				this.aLongArray24 = new long[this.anInt4532 * 1957870303];
			}
			if (this.aBoolean849 && (this.aStringArray28 == null || this.aStringArray28.length < this.anInt4532 * 1957870303)) {
				this.aStringArray28 = new String[this.anInt4532 * 1957870303];
			}
			if (this.aByteArray89 == null || this.aByteArray89.length < this.anInt4532 * 1957870303) {
				this.aByteArray89 = new byte[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray440 == null || this.anIntArray440.length < this.anInt4532 * 1957870303) {
				this.anIntArray440 = new int[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray438 == null || this.anIntArray438.length < this.anInt4532 * 1957870303) {
				this.anIntArray438 = new int[this.anInt4532 * 1957870303];
			}
			if (this.aBooleanArray30 == null || this.aBooleanArray30.length < this.anInt4532 * 1957870303) {
				this.aBooleanArray30 = new boolean[this.anInt4532 * 1957870303];
			}
			for (local266 = 0; local266 < this.anInt4532 * 1957870303; local266++) {
				if (this.aBoolean848) {
					this.aLongArray24[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray28[local266] = arg0.fastgstr();
				}
				this.aByteArray89[local266] = arg0.g1b();
				if (local3 >= 2) {
					this.anIntArray440[local266] = arg0.g4();
				}
				if (local3 >= 5) {
					this.anIntArray438[local266] = arg0.g2();
				} else {
					this.anIntArray438[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray30[local266] = arg0.g1() == 1;
				} else {
					this.aBooleanArray30[local266] = false;
				}
			}
			this.method28488((byte) 88);
		}
		if (this.anInt4535 * -1144582289 > 0) {
			if (this.aBoolean848 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4535 * -1144582289)) {
				this.aLongArray25 = new long[this.anInt4535 * -1144582289];
			}
			if (this.aBoolean849 && (this.aStringArray29 == null || this.aStringArray29.length < this.anInt4535 * -1144582289)) {
				this.aStringArray29 = new String[this.anInt4535 * -1144582289];
			}
			for (local266 = 0; local266 < this.anInt4535 * -1144582289; local266++) {
				if (this.aBoolean848) {
					this.aLongArray25[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray29[local266] = arg0.fastgstr();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.g2();
		if (local266 <= 0) {
			return;
		}
		this.aClass24_33 = new Class24(local266 < 16 ? Class700.method37081(local266, (byte) 9) : 16);
		while (local266-- > 0) {
			@Pc(458) int local458 = arg0.g4();
			@Pc(462) int local462 = local458 & 0x3FFFFFFF;
			@Pc(466) int local466 = local458 >>> 30;
			if (local466 == 0) {
				@Pc(472) int local472 = arg0.g4();
				this.aClass24_33.method563(new Class80_Sub20(local472), (long) local462);
			} else if (local466 == 1) {
				@Pc(489) long local489 = arg0.g8();
				this.aClass24_33.method563(new Class80_Sub25(local489), (long) local462);
			} else if (local466 == 2) {
				@Pc(506) String local506 = arg0.gjstr();
				this.aClass24_33.method563(new Class80_Sub19(local506), (long) local462);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "(Lclient!ald;B)V")
	void method28498(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.g1();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.g1();
		if ((local25 & 0x1) != 0) {
			this.aBoolean848 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean849 = true;
		}
		if (!this.aBoolean848) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean849) {
			this.aStringArray28 = null;
			this.aStringArray29 = null;
		}
		this.anInt4529 = arg0.g4() * 1064908177;
		this.anInt4531 = arg0.g4() * 412709923;
		if (local3 <= 3 && this.anInt4531 * 329046923 != 0) {
			this.anInt4531 += -1679496992;
		}
		this.anInt4532 = arg0.g2() * -1460698849;
		this.anInt4535 = arg0.g1() * 588722063;
		this.aString203 = arg0.gjstr();
		if (local3 >= 4) {
			arg0.g4();
		}
		this.aBoolean850 = arg0.g1() == 1;
		this.aByte137 = arg0.g1b();
		this.aByte140 = arg0.g1b();
		this.aByte139 = arg0.g1b();
		this.aByte138 = arg0.g1b();
		@Pc(266) int local266;
		if (this.anInt4532 * 1957870303 > 0) {
			if (this.aBoolean848 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4532 * 1957870303)) {
				this.aLongArray24 = new long[this.anInt4532 * 1957870303];
			}
			if (this.aBoolean849 && (this.aStringArray28 == null || this.aStringArray28.length < this.anInt4532 * 1957870303)) {
				this.aStringArray28 = new String[this.anInt4532 * 1957870303];
			}
			if (this.aByteArray89 == null || this.aByteArray89.length < this.anInt4532 * 1957870303) {
				this.aByteArray89 = new byte[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray440 == null || this.anIntArray440.length < this.anInt4532 * 1957870303) {
				this.anIntArray440 = new int[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray438 == null || this.anIntArray438.length < this.anInt4532 * 1957870303) {
				this.anIntArray438 = new int[this.anInt4532 * 1957870303];
			}
			if (this.aBooleanArray30 == null || this.aBooleanArray30.length < this.anInt4532 * 1957870303) {
				this.aBooleanArray30 = new boolean[this.anInt4532 * 1957870303];
			}
			for (local266 = 0; local266 < this.anInt4532 * 1957870303; local266++) {
				if (this.aBoolean848) {
					this.aLongArray24[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray28[local266] = arg0.fastgstr();
				}
				this.aByteArray89[local266] = arg0.g1b();
				if (local3 >= 2) {
					this.anIntArray440[local266] = arg0.g4();
				}
				if (local3 >= 5) {
					this.anIntArray438[local266] = arg0.g2();
				} else {
					this.anIntArray438[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray30[local266] = arg0.g1() == 1;
				} else {
					this.aBooleanArray30[local266] = false;
				}
			}
			this.method28488((byte) 70);
		}
		if (this.anInt4535 * -1144582289 > 0) {
			if (this.aBoolean848 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4535 * -1144582289)) {
				this.aLongArray25 = new long[this.anInt4535 * -1144582289];
			}
			if (this.aBoolean849 && (this.aStringArray29 == null || this.aStringArray29.length < this.anInt4535 * -1144582289)) {
				this.aStringArray29 = new String[this.anInt4535 * -1144582289];
			}
			for (local266 = 0; local266 < this.anInt4535 * -1144582289; local266++) {
				if (this.aBoolean848) {
					this.aLongArray25[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray29[local266] = arg0.fastgstr();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.g2();
		if (local266 <= 0) {
			return;
		}
		this.aClass24_33 = new Class24(local266 < 16 ? Class700.method37081(local266, (byte) 9) : 16);
		while (local266-- > 0) {
			@Pc(458) int local458 = arg0.g4();
			@Pc(462) int local462 = local458 & 0x3FFFFFFF;
			@Pc(466) int local466 = local458 >>> 30;
			if (local466 == 0) {
				@Pc(472) int local472 = arg0.g4();
				this.aClass24_33.method563(new Class80_Sub20(local472), (long) local462);
			} else if (local466 == 1) {
				@Pc(489) long local489 = arg0.g8();
				this.aClass24_33.method563(new Class80_Sub25(local489), (long) local462);
			} else if (local466 == 2) {
				@Pc(506) String local506 = arg0.gjstr();
				this.aClass24_33.method563(new Class80_Sub19(local506), (long) local462);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "(I)V")
	void method28499(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aBoolean849) {
			if (this.aStringArray28 == null) {
				this.aStringArray28 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray28, 0, this.aStringArray28 = new String[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray440 == null) {
			this.anIntArray440 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray440, 0, this.anIntArray440 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray438 == null) {
			this.anIntArray438 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray438, 0, this.anIntArray438 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4532 * 1957870303);
		}
	}

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "(IIIII)I")
	int method28500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray440[arg0];
		if ((local35 & local22) == local30) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray440[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "(I)V")
	void method28501(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aBoolean849) {
			if (this.aStringArray28 == null) {
				this.aStringArray28 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray28, 0, this.aStringArray28 = new String[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray440 == null) {
			this.anIntArray440 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray440, 0, this.anIntArray440 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray438 == null) {
			this.anIntArray438 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray438, 0, this.anIntArray438 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4532 * 1957870303);
		}
	}

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method28502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ac", descriptor = "(I)Ljava/lang/Integer;")
	public Integer method28503(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ax", descriptor = "(I)V")
	void method28504(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4535 * -1144582289);
			}
		}
		if (!this.aBoolean849) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4535 * -1144582289);
		}
	}

	@OriginalMember(owner = "client!kf", name = "ay", descriptor = "(Ljava/lang/String;)I")
	public int method28505(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4532 * 1957870303; local9++) {
			if (this.aStringArray28[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(IJ)Z")
	boolean method28506(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(8) Class80 local8 = this.aClass24_33.method560((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class80_Sub25) {
					@Pc(16) Class80_Sub25 local16 = (Class80_Sub25) local8;
					if (local16.aLong111 * -3870080695537343021L == arg1) {
						return false;
					}
					local16.aLong111 = arg1 * -6811134150962562469L;
					return true;
				}
				local8.method24395((byte) 78);
			}
		}
		this.aClass24_33.method563(new Class80_Sub25(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "aq", descriptor = "(III)I")
	public int method28507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray440[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "(JLjava/lang/String;IB)V")
	void method28508(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean848 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean849) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4532 * 1957870303 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray28 == null || this.anInt4532 * 1957870303 >= this.aStringArray28.length)) {
				this.method28512(this.anInt4532 * 1957870303 + 5, -253781952);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4532 * 1957870303] = arg0;
			}
			if (this.aStringArray28 != null) {
				this.aStringArray28[this.anInt4532 * 1957870303] = arg1;
			}
			if (this.anInt4533 * -1050135401 == -1) {
				this.anInt4533 = this.anInt4532 * -1934390023;
				this.aByteArray89[this.anInt4532 * 1957870303] = 126;
			} else {
				this.aByteArray89[this.anInt4532 * 1957870303] = 0;
			}
			this.anIntArray440[this.anInt4532 * 1957870303] = 0;
			this.anIntArray438[this.anInt4532 * 1957870303] = arg2;
			this.aBooleanArray30[this.anInt4532 * 1957870303] = false;
			this.anInt4532 += -1460698849;
			this.anIntArray439 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kf", name = "aj", descriptor = "(I)Ljava/lang/Integer;")
	public Integer method28509(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ad", descriptor = "(I)Ljava/lang/String;")
	public String method28510(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(10) Class80 local10 = this.aClass24_33.method560((long) arg0);
			return local10 != null && local10 instanceof Class80_Sub19 ? (String) ((Class80_Sub19) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ag", descriptor = "(I)Ljava/lang/Integer;")
	public Integer method28511(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "(II)V")
	void method28512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean848) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aBoolean849) {
			if (this.aStringArray28 == null) {
				this.aStringArray28 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray28, 0, this.aStringArray28 = new String[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray440 == null) {
			this.anIntArray440 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray440, 0, this.anIntArray440 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray438 == null) {
			this.anIntArray438 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray438, 0, this.anIntArray438 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4532 * 1957870303);
		}
	}

	@OriginalMember(owner = "client!kf", name = "al", descriptor = "(I)Ljava/lang/Integer;")
	public Integer method28513(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub20 ? Integer.valueOf(((Class80_Sub20) local11).anInt1588 * 701000167) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ah", descriptor = "(I)Ljava/lang/Long;")
	public Long method28514(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub25 ? Long.valueOf(((Class80_Sub25) local11).aLong111 * -3870080695537343021L) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "bg", descriptor = "(IIII)Z")
	boolean method28515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(40) Class80 local40 = this.aClass24_33.method560((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class80_Sub20) {
					@Pc(49) Class80_Sub20 local49 = (Class80_Sub20) local40;
					if ((local49.anInt1588 * 701000167 & local22) == local30) {
						return false;
					}
					local49.anInt1588 = (local49.anInt1588 * 701000167 & ~local22) * -822306345;
					local49.anInt1588 = (local49.anInt1588 * 701000167 | local30) * -822306345;
					return true;
				}
				local40.method24395((byte) 64);
			}
		}
		this.aClass24_33.method563(new Class80_Sub20(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	void method28516(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4535 * -1144582289);
			}
		}
		if (!this.aBoolean849) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4535 * -1144582289);
		}
	}

	@OriginalMember(owner = "client!kf", name = "am", descriptor = "(I)Ljava/lang/Long;")
	public Long method28517(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub25 ? Long.valueOf(((Class80_Sub25) local11).aLong111 * -3870080695537343021L) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ak", descriptor = "(I)Ljava/lang/String;")
	public String method28518(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(10) Class80 local10 = this.aClass24_33.method560((long) arg0);
			return local10 != null && local10 instanceof Class80_Sub19 ? (String) ((Class80_Sub19) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "av", descriptor = "()[I")
	public int[] method28519() {
		if (this.anIntArray439 == null) {
			@Pc(8) String[] local8 = new String[this.anInt4532 * 1957870303];
			this.anIntArray439 = new int[this.anInt4532 * 1957870303];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt4532 * 1957870303) {
				local8[local17] = this.aStringArray28[local17];
				if (local8[local17] != null) {
					local8[local17] = local8[local17].toLowerCase();
				}
				this.anIntArray439[local17] = local17++;
			}
			Class602.method32125(local8, this.anIntArray439, -670637866);
		}
		return this.anIntArray439;
	}

	@OriginalMember(owner = "client!kf", name = "an", descriptor = "(JLjava/lang/String;I)V")
	void method28520(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean848 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean849) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4532 * 1957870303 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray28 == null || this.anInt4532 * 1957870303 >= this.aStringArray28.length)) {
				this.method28512(this.anInt4532 * 1957870303 + 5, -1296319020);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4532 * 1957870303] = arg0;
			}
			if (this.aStringArray28 != null) {
				this.aStringArray28[this.anInt4532 * 1957870303] = arg1;
			}
			if (this.anInt4533 * -1050135401 == -1) {
				this.anInt4533 = this.anInt4532 * -1934390023;
				this.aByteArray89[this.anInt4532 * 1957870303] = 126;
			} else {
				this.aByteArray89[this.anInt4532 * 1957870303] = 0;
			}
			this.anIntArray440[this.anInt4532 * 1957870303] = 0;
			this.anIntArray438[this.anInt4532 * 1957870303] = arg2;
			this.aBooleanArray30[this.anInt4532 * 1957870303] = false;
			this.anInt4532 += -1460698849;
			this.anIntArray439 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kf", name = "aa", descriptor = "(I)V")
	void method28521(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4532 * 1957870303) {
			throw new RuntimeException("");
		}
		this.anInt4532 -= -1460698849;
		this.anIntArray439 = null;
		if (this.anInt4532 * 1957870303 == 0) {
			this.aLongArray24 = null;
			this.aStringArray28 = null;
			this.aByteArray89 = null;
			this.anIntArray440 = null;
			this.anIntArray438 = null;
			this.aBooleanArray30 = null;
			this.anInt4533 = 2009167065;
			this.anInt4534 = 1388030397;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray440, arg0 + 1, this.anIntArray440, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray438, arg0 + 1, this.anIntArray438, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4532 * 1957870303 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		if (this.aStringArray28 != null) {
			System.arraycopy(this.aStringArray28, arg0 + 1, this.aStringArray28, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		this.method28488((byte) 36);
	}

	@OriginalMember(owner = "client!kf", name = "ae", descriptor = "(I)V")
	void method28522(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4532 * 1957870303) {
			throw new RuntimeException("");
		}
		this.anInt4532 -= -1460698849;
		this.anIntArray439 = null;
		if (this.anInt4532 * 1957870303 == 0) {
			this.aLongArray24 = null;
			this.aStringArray28 = null;
			this.aByteArray89 = null;
			this.anIntArray440 = null;
			this.anIntArray438 = null;
			this.aBooleanArray30 = null;
			this.anInt4533 = 2009167065;
			this.anInt4534 = 1388030397;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray440, arg0 + 1, this.anIntArray440, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.anIntArray438, arg0 + 1, this.anIntArray438, arg0, this.anInt4532 * 1957870303 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4532 * 1957870303 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		if (this.aStringArray28 != null) {
			System.arraycopy(this.aStringArray28, arg0 + 1, this.aStringArray28, arg0, this.anInt4532 * 1957870303 - arg0);
		}
		this.method28488((byte) 124);
	}

	@OriginalMember(owner = "client!kf", name = "ap", descriptor = "()V")
	void method28523() {
		if (this.anInt4532 * 1957870303 == 0) {
			this.anInt4533 = 2009167065;
			this.anInt4534 = 1388030397;
			return;
		}
		this.anInt4533 = 2009167065;
		this.anInt4534 = 1388030397;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray89[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4532 * 1957870303; local26++) {
			if (this.aByteArray89[local26] > local24) {
				if (local24 == 125) {
					this.anInt4534 = local19 * -1388030397;
				}
				local19 = local26;
				local24 = this.aByteArray89[local26];
			} else if (-1263131029 * this.anInt4534 == -1 && this.aByteArray89[local26] == 125) {
				this.anInt4534 = local26 * -1388030397;
			}
		}
		this.anInt4533 = local19 * -2009167065;
		if (this.anInt4533 * -1050135401 != -1) {
			this.aByteArray89[this.anInt4533 * -1050135401] = 126;
		}
	}

	@OriginalMember(owner = "client!kf", name = "ar", descriptor = "(JLjava/lang/String;)V")
	void method28524(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean848 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.aBoolean849 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4535 * -1144582289 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray29 == null || this.anInt4535 * -1144582289 >= this.aStringArray29.length)) {
				this.method28479(this.anInt4535 * -1144582289 + 5, 1878834604);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4535 * -1144582289] = arg0;
			}
			if (this.aStringArray29 != null) {
				this.aStringArray29[this.anInt4535 * -1144582289] = arg1;
			}
			this.anInt4535 += 588722063;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kf", name = "af", descriptor = "(I)Ljava/lang/Long;")
	public Long method28525(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(11) Class80 local11 = this.aClass24_33.method560((long) arg0);
			return local11 != null && local11 instanceof Class80_Sub25 ? Long.valueOf(((Class80_Sub25) local11).aLong111 * -3870080695537343021L) : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "au", descriptor = "(I)V")
	void method28526(@OriginalArg(0) int arg0) {
		this.anInt4535 -= 588722063;
		if (this.anInt4535 * -1144582289 == 0) {
			this.aLongArray25 = null;
			this.aStringArray29 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4535 * -1144582289 - arg0);
		}
		if (this.aStringArray29 != null) {
			System.arraycopy(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4535 * -1144582289 - arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "as", descriptor = "(IZ)I")
	int method28527(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray30[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray30[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "az", descriptor = "(IB)I")
	int method28528(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4533 * -1050135401 == arg0 && (this.anInt4534 * -1263131029 == -1 || this.aByteArray89[this.anInt4534 * -1263131029] < 125)) {
			return -1;
		} else if (this.aByteArray89[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28488((byte) 20);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "at", descriptor = "(I)Ljava/lang/String;")
	public String method28529(@OriginalArg(0) int arg0) {
		if (this.aClass24_33 == null) {
			return null;
		} else {
			@Pc(10) Class80 local10 = this.aClass24_33.method560((long) arg0);
			return local10 != null && local10 instanceof Class80_Sub19 ? (String) ((Class80_Sub19) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "bl", descriptor = "(IIII)Z")
	boolean method28530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(40) Class80 local40 = this.aClass24_33.method560((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class80_Sub20) {
					@Pc(49) Class80_Sub20 local49 = (Class80_Sub20) local40;
					if ((local49.anInt1588 * 701000167 & local22) == local30) {
						return false;
					}
					local49.anInt1588 = (local49.anInt1588 * 701000167 & ~local22) * -822306345;
					local49.anInt1588 = (local49.anInt1588 * 701000167 | local30) * -822306345;
					return true;
				}
				local40.method24395((byte) 91);
			}
		}
		this.aClass24_33.method563(new Class80_Sub20(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "br", descriptor = "(IJ)Z")
	boolean method28531(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(8) Class80 local8 = this.aClass24_33.method560((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class80_Sub25) {
					@Pc(16) Class80_Sub25 local16 = (Class80_Sub25) local8;
					if (local16.aLong111 * -3870080695537343021L == arg1) {
						return false;
					}
					local16.aLong111 = arg1 * -6811134150962562469L;
					return true;
				}
				local8.method24395((byte) 4);
			}
		}
		this.aClass24_33.method563(new Class80_Sub25(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "bn", descriptor = "(ILjava/lang/String;)Z")
	boolean method28532(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(23) Class80 local23 = this.aClass24_33.method560((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class80_Sub19) {
					@Pc(32) Class80_Sub19 local32 = (Class80_Sub19) local23;
					if (local32.anObject5 instanceof String) {
						if (arg1.equals(local32.anObject5)) {
							return false;
						}
						local32.method24395((byte) 50);
						this.aClass24_33.method563(new Class80_Sub19(arg1), local32.aLong338 * 3209506792906532031L);
						return true;
					}
				}
				local23.method24395((byte) 101);
			}
		}
		this.aClass24_33.method563(new Class80_Sub19(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "ba", descriptor = "(ILjava/lang/String;)Z")
	boolean method28533(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass24_33 == null) {
			this.aClass24_33 = new Class24(4);
		} else {
			@Pc(23) Class80 local23 = this.aClass24_33.method560((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class80_Sub19) {
					@Pc(32) Class80_Sub19 local32 = (Class80_Sub19) local23;
					if (local32.anObject5 instanceof String) {
						if (arg1.equals(local32.anObject5)) {
							return false;
						}
						local32.method24395((byte) 42);
						this.aClass24_33.method563(new Class80_Sub19(arg1), local32.aLong338 * 3209506792906532031L);
						return true;
					}
				}
				local23.method24395((byte) 21);
			}
		}
		this.aClass24_33.method563(new Class80_Sub19(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "bt", descriptor = "(Lclient!ald;)V")
	void method28534(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.g1();
		if ((local25 & 0x1) != 0) {
			this.aBoolean848 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean849 = true;
		}
		if (!this.aBoolean848) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean849) {
			this.aStringArray28 = null;
			this.aStringArray29 = null;
		}
		this.anInt4529 = arg0.g4() * 1064908177;
		this.anInt4531 = arg0.g4() * 412709923;
		if (local3 <= 3 && this.anInt4531 * 329046923 != 0) {
			this.anInt4531 += -1679496992;
		}
		this.anInt4532 = arg0.g2() * -1460698849;
		this.anInt4535 = arg0.g1() * 588722063;
		this.aString203 = arg0.gjstr();
		if (local3 >= 4) {
			arg0.g4();
		}
		this.aBoolean850 = arg0.g1() == 1;
		this.aByte137 = arg0.g1b();
		this.aByte140 = arg0.g1b();
		this.aByte139 = arg0.g1b();
		this.aByte138 = arg0.g1b();
		@Pc(266) int local266;
		if (this.anInt4532 * 1957870303 > 0) {
			if (this.aBoolean848 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4532 * 1957870303)) {
				this.aLongArray24 = new long[this.anInt4532 * 1957870303];
			}
			if (this.aBoolean849 && (this.aStringArray28 == null || this.aStringArray28.length < this.anInt4532 * 1957870303)) {
				this.aStringArray28 = new String[this.anInt4532 * 1957870303];
			}
			if (this.aByteArray89 == null || this.aByteArray89.length < this.anInt4532 * 1957870303) {
				this.aByteArray89 = new byte[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray440 == null || this.anIntArray440.length < this.anInt4532 * 1957870303) {
				this.anIntArray440 = new int[this.anInt4532 * 1957870303];
			}
			if (this.anIntArray438 == null || this.anIntArray438.length < this.anInt4532 * 1957870303) {
				this.anIntArray438 = new int[this.anInt4532 * 1957870303];
			}
			if (this.aBooleanArray30 == null || this.aBooleanArray30.length < this.anInt4532 * 1957870303) {
				this.aBooleanArray30 = new boolean[this.anInt4532 * 1957870303];
			}
			for (local266 = 0; local266 < this.anInt4532 * 1957870303; local266++) {
				if (this.aBoolean848) {
					this.aLongArray24[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray28[local266] = arg0.fastgstr();
				}
				this.aByteArray89[local266] = arg0.g1b();
				if (local3 >= 2) {
					this.anIntArray440[local266] = arg0.g4();
				}
				if (local3 >= 5) {
					this.anIntArray438[local266] = arg0.g2();
				} else {
					this.anIntArray438[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray30[local266] = arg0.g1() == 1;
				} else {
					this.aBooleanArray30[local266] = false;
				}
			}
			this.method28488((byte) 67);
		}
		if (this.anInt4535 * -1144582289 > 0) {
			if (this.aBoolean848 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4535 * -1144582289)) {
				this.aLongArray25 = new long[this.anInt4535 * -1144582289];
			}
			if (this.aBoolean849 && (this.aStringArray29 == null || this.aStringArray29.length < this.anInt4535 * -1144582289)) {
				this.aStringArray29 = new String[this.anInt4535 * -1144582289];
			}
			for (local266 = 0; local266 < this.anInt4535 * -1144582289; local266++) {
				if (this.aBoolean848) {
					this.aLongArray25[local266] = arg0.g8();
				}
				if (this.aBoolean849) {
					this.aStringArray29[local266] = arg0.fastgstr();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.g2();
		if (local266 <= 0) {
			return;
		}
		this.aClass24_33 = new Class24(local266 < 16 ? Class700.method37081(local266, (byte) 9) : 16);
		while (local266-- > 0) {
			@Pc(458) int local458 = arg0.g4();
			@Pc(462) int local462 = local458 & 0x3FFFFFFF;
			@Pc(466) int local466 = local458 >>> 30;
			if (local466 == 0) {
				@Pc(472) int local472 = arg0.g4();
				this.aClass24_33.method563(new Class80_Sub20(local472), (long) local462);
			} else if (local466 == 1) {
				@Pc(489) long local489 = arg0.g8();
				this.aClass24_33.method563(new Class80_Sub25(local489), (long) local462);
			} else if (local466 == 2) {
				@Pc(506) String local506 = arg0.gjstr();
				this.aClass24_33.method563(new Class80_Sub19(local506), (long) local462);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "(I)V")
	void method28535(@OriginalArg(0) int arg0) {
		if (this.aBoolean848) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aBoolean849) {
			if (this.aStringArray28 == null) {
				this.aStringArray28 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray28, 0, this.aStringArray28 = new String[arg0], 0, this.anInt4532 * 1957870303);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray440 == null) {
			this.anIntArray440 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray440, 0, this.anIntArray440 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.anIntArray438 == null) {
			this.anIntArray438 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray438, 0, this.anIntArray438 = new int[arg0], 0, this.anInt4532 * 1957870303);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4532 * 1957870303);
		}
	}
}
