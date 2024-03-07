package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public class Class386 {

	@OriginalMember(owner = "client!kr", name = "ac", descriptor = "B")
	public static final byte aByte153 = -1;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	static final int anInt4645 = 6;

	@OriginalMember(owner = "client!kr", name = "ah", descriptor = "B")
	static final byte aByte155 = 125;

	@OriginalMember(owner = "client!kr", name = "ae", descriptor = "B")
	static final byte aByte156 = 127;

	@OriginalMember(owner = "client!kr", name = "ag", descriptor = "B")
	static final byte aByte157 = 126;

	@OriginalMember(owner = "client!kr", name = "al", descriptor = "B")
	static final byte aByte159 = 0;

	@OriginalMember(owner = "client!kr", name = "ce", descriptor = "I")
	public static int anInt4648;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "B")
	public byte aByte151;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Z")
	boolean aBoolean741;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Z")
	boolean aBoolean742;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
	public int anInt4642;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Z")
	public boolean aBoolean743;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "B")
	public byte aByte152;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "B")
	public byte aByte154;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "[J")
	long[] aLongArray24;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "[I")
	int[] anIntArray434;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	public int[] anIntArray435;

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public int anInt4647;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[J")
	long[] aLongArray25;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "J")
	long aLong267;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray29;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Lclient!aan;")
	Class16 aClass16_33;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "B")
	public byte aByte158;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "[I")
	int[] anIntArray436;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray30;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	int anInt4641 = 0;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/String;")
	public String aString196 = null;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	int anInt4643 = 0;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public int anInt4644 = -1375360501;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public int anInt4646 = -1191219821;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!alw;)V", line = 42)
	public Class386(@OriginalArg(0) Packet arg0) {
		this.method28233(arg0, (byte) 109);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 47)
	void method28162(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aBoolean742) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray434 == null) {
			this.anIntArray434 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray434, 0, this.anIntArray434 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray435 == null) {
			this.anIntArray435 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray435, 0, this.anIntArray435 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4642 * 849728367);
		}
	}

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "(I)V", line = 47)
	void method28163(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aBoolean742) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray434 == null) {
			this.anIntArray434 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray434, 0, this.anIntArray434 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray435 == null) {
			this.anIntArray435 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray435, 0, this.anIntArray435 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4642 * 849728367);
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)V", line = 47)
	void method28164(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aBoolean742) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray434 == null) {
			this.anIntArray434 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray434, 0, this.anIntArray434 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray435 == null) {
			this.anIntArray435 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray435, 0, this.anIntArray435 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4642 * 849728367);
		}
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(II)V", line = 47)
	void method28165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean741) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aBoolean742) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4642 * 849728367);
			}
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray89, 0, this.aByteArray89 = new byte[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray434 == null) {
			this.anIntArray434 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray434, 0, this.anIntArray434 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.anIntArray435 == null) {
			this.anIntArray435 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray435, 0, this.anIntArray435 = new int[arg0], 0, this.anInt4642 * 849728367);
		}
		if (this.aBooleanArray30 == null) {
			this.aBooleanArray30 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray30, 0, this.aBooleanArray30 = new boolean[arg0], 0, this.anInt4642 * 849728367);
		}
	}

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "(II)V", line = 66)
	void method28166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean741) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4647 * 1113751329);
			}
		}
		if (!this.aBoolean742) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4647 * 1113751329);
		}
	}

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "(I)V", line = 66)
	void method28167(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4647 * 1113751329);
			}
		}
		if (!this.aBoolean742) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4647 * 1113751329);
		}
	}

	@OriginalMember(owner = "client!kr", name = "ag", descriptor = "(I)V", line = 66)
	void method28168(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4647 * 1113751329);
			}
		}
		if (!this.aBoolean742) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4647 * 1113751329);
		}
	}

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "(I)V", line = 66)
	void method28169(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4647 * 1113751329);
			}
		}
		if (!this.aBoolean742) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4647 * 1113751329);
		}
	}

	@OriginalMember(owner = "client!kr", name = "ae", descriptor = "(I)V", line = 66)
	void method28170(@OriginalArg(0) int arg0) {
		if (this.aBoolean741) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4647 * 1113751329);
			}
		}
		if (!this.aBoolean742) {
			return;
		}
		if (this.aStringArray29 == null) {
			this.aStringArray29 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray29, 0, this.aStringArray29 = new String[arg0], 0, this.anInt4647 * 1113751329);
		}
	}

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "(Ljava/lang/String;B)I", line = 77)
	public int method28171(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anInt4642 * 849728367; local8++) {
			if (this.aStringArray30[local8].equals(arg0)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kr", name = "al", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28172(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anInt4642 * 849728367; local8++) {
			if (this.aStringArray30[local8].equals(arg0)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kr", name = "ac", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28173(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anInt4642 * 849728367; local8++) {
			if (this.aStringArray30[local8].equals(arg0)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kr", name = "ah", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28174(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anInt4642 * 849728367; local8++) {
			if (this.aStringArray30[local8].equals(arg0)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "(IIII)I", line = 85)
	public int method28175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray434[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kr", name = "ai", descriptor = "(III)I", line = 85)
	public int method28176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray434[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kr", name = "aw", descriptor = "(I)Ljava/lang/Integer;", line = 90)
	public Integer method28177(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub14 ? Integer.valueOf(((Class93_Sub14) local10).anInt1526 * 1279598251) : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "(II)Ljava/lang/Integer;", line = 90)
	public Integer method28178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub14 ? Integer.valueOf(((Class93_Sub14) local10).anInt1526 * 1279598251) : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "(II)Ljava/lang/Long;", line = 97)
	public Long method28179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub11 ? Long.valueOf(((Class93_Sub11) local10).aLong67 * 80339347373272757L) : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "as", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method28180(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub11 ? Long.valueOf(((Class93_Sub11) local10).aLong67 * 80339347373272757L) : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "at", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method28181(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub11 ? Long.valueOf(((Class93_Sub11) local10).aLong67 * 80339347373272757L) : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "(II)Ljava/lang/String;", line = 104)
	public String method28182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub15 ? (String) ((Class93_Sub15) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "ad", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method28183(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub15 ? (String) ((Class93_Sub15) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "au", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method28184(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub15 ? (String) ((Class93_Sub15) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "am", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method28185(@OriginalArg(0) int arg0) {
		if (this.aClass16_33 == null) {
			return null;
		} else {
			@Pc(10) Class93 local10 = this.aClass16_33.method214((long) arg0);
			return local10 != null && local10 instanceof Class93_Sub15 ? (String) ((Class93_Sub15) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "(B)[I", line = 111)
	public int[] method28186(@OriginalArg(0) byte arg0) {
		if (this.anIntArray436 == null) {
			@Pc(9) String[] local9 = new String[this.anInt4642 * 849728367];
			this.anIntArray436 = new int[this.anInt4642 * 849728367];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt4642 * 849728367) {
				local9[local18] = this.aStringArray30[local18];
				if (local9[local18] != null) {
					local9[local18] = local9[local18].toLowerCase();
				}
				this.anIntArray436[local18] = local18++;
			}
			Class118.method8407(local9, this.anIntArray436, 1303118663);
		}
		return this.anIntArray436;
	}

	@OriginalMember(owner = "client!kr", name = "ar", descriptor = "()[I", line = 111)
	public int[] method28187() {
		if (this.anIntArray436 == null) {
			@Pc(9) String[] local9 = new String[this.anInt4642 * 849728367];
			this.anIntArray436 = new int[this.anInt4642 * 849728367];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt4642 * 849728367) {
				local9[local18] = this.aStringArray30[local18];
				if (local9[local18] != null) {
					local9[local18] = local9[local18].toLowerCase();
				}
				this.anIntArray436[local18] = local18++;
			}
			Class118.method8407(local9, this.anIntArray436, 1124094290);
		}
		return this.anIntArray436;
	}

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "(JLjava/lang/String;IB)V", line = 125)
	void method28188(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean741 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean742) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4642 * 849728367 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4642 * 849728367 >= this.aStringArray30.length)) {
				this.method28165(this.anInt4642 * 849728367 + 5, 1089814854);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4642 * 849728367] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4642 * 849728367] = arg1;
			}
			if (this.anInt4644 * 2138173021 == -1) {
				this.anInt4644 = this.anInt4642 * 558707771;
				this.aByteArray89[this.anInt4642 * 849728367] = 126;
			} else {
				this.aByteArray89[this.anInt4642 * 849728367] = 0;
			}
			this.anIntArray434[this.anInt4642 * 849728367] = 0;
			this.anIntArray435[this.anInt4642 * 849728367] = arg2;
			this.aBooleanArray30[this.anInt4642 * 849728367] = false;
			this.anInt4642 += -2076644465;
			this.anIntArray436 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "ap", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method28189(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean741 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean742) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4642 * 849728367 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4642 * 849728367 >= this.aStringArray30.length)) {
				this.method28165(this.anInt4642 * 849728367 + 5, 1273563213);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4642 * 849728367] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4642 * 849728367] = arg1;
			}
			if (this.anInt4644 * 2138173021 == -1) {
				this.anInt4644 = this.anInt4642 * 558707771;
				this.aByteArray89[this.anInt4642 * 849728367] = 126;
			} else {
				this.aByteArray89[this.anInt4642 * 849728367] = 0;
			}
			this.anIntArray434[this.anInt4642 * 849728367] = 0;
			this.anIntArray435[this.anInt4642 * 849728367] = arg2;
			this.aBooleanArray30[this.anInt4642 * 849728367] = false;
			this.anInt4642 += -2076644465;
			this.anIntArray436 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "ax", descriptor = "(I)V", line = 146)
	void method28190(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4642 * 849728367) {
			throw new RuntimeException("");
		}
		this.anInt4642 -= -2076644465;
		this.anIntArray436 = null;
		if (this.anInt4642 * 849728367 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray89 = null;
			this.anIntArray434 = null;
			this.anIntArray435 = null;
			this.aBooleanArray30 = null;
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray434, arg0 + 1, this.anIntArray434, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray435, arg0 + 1, this.anIntArray435, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4642 * 849728367 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4642 * 849728367 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4642 * 849728367 - arg0);
		}
		this.method28197(1494104843);
	}

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "(II)V", line = 146)
	void method28191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anInt4642 * 849728367) {
			throw new RuntimeException("");
		}
		this.anInt4642 -= -2076644465;
		this.anIntArray436 = null;
		if (this.anInt4642 * 849728367 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray89 = null;
			this.anIntArray434 = null;
			this.anIntArray435 = null;
			this.aBooleanArray30 = null;
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray434, arg0 + 1, this.anIntArray434, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray435, arg0 + 1, this.anIntArray435, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4642 * 849728367 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4642 * 849728367 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4642 * 849728367 - arg0);
		}
		this.method28197(1623948161);
	}

	@OriginalMember(owner = "client!kr", name = "aq", descriptor = "(I)V", line = 146)
	void method28192(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4642 * 849728367) {
			throw new RuntimeException("");
		}
		this.anInt4642 -= -2076644465;
		this.anIntArray436 = null;
		if (this.anInt4642 * 849728367 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray89 = null;
			this.anIntArray434 = null;
			this.anIntArray435 = null;
			this.aBooleanArray30 = null;
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray434, arg0 + 1, this.anIntArray434, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray435, arg0 + 1, this.anIntArray435, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4642 * 849728367 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4642 * 849728367 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4642 * 849728367 - arg0);
		}
		this.method28197(1374774161);
	}

	@OriginalMember(owner = "client!kr", name = "av", descriptor = "(I)V", line = 146)
	void method28193(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4642 * 849728367) {
			throw new RuntimeException("");
		}
		this.anInt4642 -= -2076644465;
		this.anIntArray436 = null;
		if (this.anInt4642 * 849728367 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray89 = null;
			this.anIntArray434 = null;
			this.anIntArray435 = null;
			this.aBooleanArray30 = null;
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray434, arg0 + 1, this.anIntArray434, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray435, arg0 + 1, this.anIntArray435, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4642 * 849728367 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4642 * 849728367 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4642 * 849728367 - arg0);
		}
		this.method28197(1719345193);
	}

	@OriginalMember(owner = "client!kr", name = "ao", descriptor = "(I)V", line = 146)
	void method28194(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4642 * 849728367) {
			throw new RuntimeException("");
		}
		this.anInt4642 -= -2076644465;
		this.anIntArray436 = null;
		if (this.anInt4642 * 849728367 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray89 = null;
			this.anIntArray434 = null;
			this.anIntArray435 = null;
			this.aBooleanArray30 = null;
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		System.arraycopy(this.aByteArray89, arg0 + 1, this.aByteArray89, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray434, arg0 + 1, this.anIntArray434, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.anIntArray435, arg0 + 1, this.anIntArray435, arg0, this.anInt4642 * 849728367 - arg0);
		System.arraycopy(this.aBooleanArray30, arg0 + 1, this.aBooleanArray30, arg0, this.anInt4642 * 849728367 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4642 * 849728367 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4642 * 849728367 - arg0);
		}
		this.method28197(1395428358);
	}

	@OriginalMember(owner = "client!kr", name = "ay", descriptor = "()V", line = 171)
	void method28195() {
		if (this.anInt4642 * 849728367 == 0) {
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		this.anInt4644 = -1375360501;
		this.anInt4646 = -1191219821;
		@Pc(20) int local20 = 0;
		@Pc(25) byte local25 = this.aByteArray89[0];
		for (@Pc(27) int local27 = 1; local27 < this.anInt4642 * 849728367; local27++) {
			if (this.aByteArray89[local27] > local25) {
				if (local25 == 125) {
					this.anInt4646 = local20 * 1191219821;
				}
				local20 = local27;
				local25 = this.aByteArray89[local27];
			} else if (this.anInt4646 * 1519535973 == -1 && this.aByteArray89[local27] == 125) {
				this.anInt4646 = local27 * 1191219821;
			}
		}
		this.anInt4644 = local20 * 1375360501;
		if (this.anInt4644 * 2138173021 != -1) {
			this.aByteArray89[this.anInt4644 * 2138173021] = 126;
		}
	}

	@OriginalMember(owner = "client!kr", name = "aj", descriptor = "()V", line = 171)
	void method28196() {
		if (this.anInt4642 * 849728367 == 0) {
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		this.anInt4644 = -1375360501;
		this.anInt4646 = -1191219821;
		@Pc(20) int local20 = 0;
		@Pc(25) byte local25 = this.aByteArray89[0];
		for (@Pc(27) int local27 = 1; local27 < this.anInt4642 * 849728367; local27++) {
			if (this.aByteArray89[local27] > local25) {
				if (local25 == 125) {
					this.anInt4646 = local20 * 1191219821;
				}
				local20 = local27;
				local25 = this.aByteArray89[local27];
			} else if (this.anInt4646 * 1519535973 == -1 && this.aByteArray89[local27] == 125) {
				this.anInt4646 = local27 * 1191219821;
			}
		}
		this.anInt4644 = local20 * 1375360501;
		if (this.anInt4644 * 2138173021 != -1) {
			this.aByteArray89[this.anInt4644 * 2138173021] = 126;
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V", line = 171)
	void method28197(@OriginalArg(0) int arg0) {
		if (this.anInt4642 * 849728367 == 0) {
			this.anInt4644 = -1375360501;
			this.anInt4646 = -1191219821;
			return;
		}
		this.anInt4644 = -1375360501;
		this.anInt4646 = -1191219821;
		@Pc(20) int local20 = 0;
		@Pc(25) byte local25 = this.aByteArray89[0];
		for (@Pc(27) int local27 = 1; local27 < this.anInt4642 * 849728367; local27++) {
			if (this.aByteArray89[local27] > local25) {
				if (local25 == 125) {
					this.anInt4646 = local20 * 1191219821;
				}
				local20 = local27;
				local25 = this.aByteArray89[local27];
			} else if (this.anInt4646 * 1519535973 == -1 && this.aByteArray89[local27] == 125) {
				this.anInt4646 = local27 * 1191219821;
			}
		}
		this.anInt4644 = local20 * 1375360501;
		if (this.anInt4644 * 2138173021 != -1) {
			this.aByteArray89[this.anInt4644 * 2138173021] = 126;
		}
	}

	@OriginalMember(owner = "client!kr", name = "ab", descriptor = "(JLjava/lang/String;)V", line = 195)
	void method28198(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean741 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean742) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4647 * 1113751329 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray29 == null || this.anInt4647 * 1113751329 >= this.aStringArray29.length)) {
				this.method28166(this.anInt4647 * 1113751329 + 5, 2113698400);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4647 * 1113751329] = arg0;
			}
			if (this.aStringArray29 != null) {
				this.aStringArray29[this.anInt4647 * 1113751329] = arg1;
			}
			this.anInt4647 += -1208367903;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(JLjava/lang/String;I)V", line = 195)
	void method28199(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean741 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean742) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4647 * 1113751329 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray29 == null || this.anInt4647 * 1113751329 >= this.aStringArray29.length)) {
				this.method28166(this.anInt4647 * 1113751329 + 5, 2145114076);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4647 * 1113751329] = arg0;
			}
			if (this.aStringArray29 != null) {
				this.aStringArray29[this.anInt4647 * 1113751329] = arg1;
			}
			this.anInt4647 += -1208367903;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "(II)V", line = 205)
	void method28200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4647 -= -1208367903;
		if (this.anInt4647 * 1113751329 == 0) {
			this.aLongArray25 = null;
			this.aStringArray29 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4647 * 1113751329 - arg0);
		}
		if (this.aStringArray29 != null) {
			System.arraycopy(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4647 * 1113751329 - arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "aa", descriptor = "(I)V", line = 205)
	void method28201(@OriginalArg(0) int arg0) {
		this.anInt4647 -= -1208367903;
		if (this.anInt4647 * 1113751329 == 0) {
			this.aLongArray25 = null;
			this.aStringArray29 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4647 * 1113751329 - arg0);
		}
		if (this.aStringArray29 != null) {
			System.arraycopy(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4647 * 1113751329 - arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "az", descriptor = "(I)V", line = 205)
	void method28202(@OriginalArg(0) int arg0) {
		this.anInt4647 -= -1208367903;
		if (this.anInt4647 * 1113751329 == 0) {
			this.aLongArray25 = null;
			this.aStringArray29 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4647 * 1113751329 - arg0);
		}
		if (this.aStringArray29 != null) {
			System.arraycopy(this.aStringArray29, arg0 + 1, this.aStringArray29, arg0, this.anInt4647 * 1113751329 - arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "(IBB)I", line = 217)
	int method28203(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1713486029);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "ak", descriptor = "(IB)I", line = 217)
	int method28204(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1419421035);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "an", descriptor = "(IB)I", line = 217)
	int method28205(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1597416244);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "bl", descriptor = "(IB)I", line = 217)
	int method28206(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1921831455);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "bf", descriptor = "(IB)I", line = 217)
	int method28207(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1586180487);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "af", descriptor = "(IB)I", line = 217)
	int method28208(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (this.anInt4644 * 2138173021 == arg0 && (this.anInt4646 * 1519535973 == -1 || this.aByteArray89[this.anInt4646 * 1519535973] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray89[arg0]) {
			return -1;
		} else {
			this.aByteArray89[arg0] = arg1;
			this.method28197(1941256259);
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "(IZB)I", line = 226)
	int method28209(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (this.aBooleanArray30[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray30[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "(IIIIB)I", line = 232)
	int method28210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray434[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray434[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "bh", descriptor = "(IIII)I", line = 232)
	int method28211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray434[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray434[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "bk", descriptor = "(IIII)I", line = 232)
	int method28212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray434[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray434[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "bx", descriptor = "(IIII)I", line = 232)
	int method28213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray434[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray434[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "(III)Z", line = 245)
	boolean method28214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(9) Class93 local9 = this.aClass16_33.method214((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class93_Sub14) {
					@Pc(18) Class93_Sub14 local18 = (Class93_Sub14) local9;
					if (arg1 == local18.anInt1526 * 1279598251) {
						return false;
					}
					local18.anInt1526 = arg1 * -859706365;
					return true;
				}
				local9.method23969(1568044097);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bd", descriptor = "(II)Z", line = 245)
	boolean method28215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(9) Class93 local9 = this.aClass16_33.method214((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class93_Sub14) {
					@Pc(18) Class93_Sub14 local18 = (Class93_Sub14) local9;
					if (arg1 == local18.anInt1526 * 1279598251) {
						return false;
					}
					local18.anInt1526 = arg1 * -859706365;
					return true;
				}
				local9.method23969(-1912870030);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bi", descriptor = "(II)Z", line = 245)
	boolean method28216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(9) Class93 local9 = this.aClass16_33.method214((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class93_Sub14) {
					@Pc(18) Class93_Sub14 local18 = (Class93_Sub14) local9;
					if (arg1 == local18.anInt1526 * 1279598251) {
						return false;
					}
					local18.anInt1526 = arg1 * -859706365;
					return true;
				}
				local9.method23969(765039972);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bn", descriptor = "(II)Z", line = 245)
	boolean method28217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(9) Class93 local9 = this.aClass16_33.method214((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class93_Sub14) {
					@Pc(18) Class93_Sub14 local18 = (Class93_Sub14) local9;
					if (arg1 == local18.anInt1526 * 1279598251) {
						return false;
					}
					local18.anInt1526 = arg1 * -859706365;
					return true;
				}
				local9.method23969(1530317553);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bc", descriptor = "(II)Z", line = 245)
	boolean method28218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(9) Class93 local9 = this.aClass16_33.method214((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class93_Sub14) {
					@Pc(18) Class93_Sub14 local18 = (Class93_Sub14) local9;
					if (arg1 == local18.anInt1526 * 1279598251) {
						return false;
					}
					local18.anInt1526 = arg1 * -859706365;
					return true;
				}
				local9.method23969(-486733655);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "(IIIII)Z", line = 263)
	boolean method28219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(40) Class93 local40 = this.aClass16_33.method214((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class93_Sub14) {
					@Pc(49) Class93_Sub14 local49 = (Class93_Sub14) local40;
					if ((local49.anInt1526 * 1279598251 & local22) == local30) {
						return false;
					}
					local49.anInt1526 = (local49.anInt1526 * 1279598251 & ~local22) * -859706365;
					local49.anInt1526 = (local49.anInt1526 * 1279598251 | local30) * -859706365;
					return true;
				}
				local40.method23969(123240627);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bq", descriptor = "(IIII)Z", line = 263)
	boolean method28220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(40) Class93 local40 = this.aClass16_33.method214((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class93_Sub14) {
					@Pc(49) Class93_Sub14 local49 = (Class93_Sub14) local40;
					if ((local49.anInt1526 * 1279598251 & local22) == local30) {
						return false;
					}
					local49.anInt1526 = (local49.anInt1526 * 1279598251 & ~local22) * -859706365;
					local49.anInt1526 = (local49.anInt1526 * 1279598251 | local30) * -859706365;
					return true;
				}
				local40.method23969(1502022154);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bt", descriptor = "(IIII)Z", line = 263)
	boolean method28221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(40) Class93 local40 = this.aClass16_33.method214((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class93_Sub14) {
					@Pc(49) Class93_Sub14 local49 = (Class93_Sub14) local40;
					if ((local49.anInt1526 * 1279598251 & local22) == local30) {
						return false;
					}
					local49.anInt1526 = (local49.anInt1526 * 1279598251 & ~local22) * -859706365;
					local49.anInt1526 = (local49.anInt1526 * 1279598251 | local30) * -859706365;
					return true;
				}
				local40.method23969(-1028592145);
			}
		}
		this.aClass16_33.method220(new Class93_Sub14(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "by", descriptor = "(IJ)Z", line = 289)
	boolean method28222(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(8) Class93 local8 = this.aClass16_33.method214((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class93_Sub11) {
					@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) local8;
					if (local17.aLong67 * 80339347373272757L == arg1) {
						return false;
					}
					local17.aLong67 = arg1 * -3331835497204133987L;
					return true;
				}
				local8.method23969(717820734);
			}
		}
		this.aClass16_33.method220(new Class93_Sub11(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "(IJ)Z", line = 289)
	boolean method28223(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(8) Class93 local8 = this.aClass16_33.method214((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class93_Sub11) {
					@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) local8;
					if (local17.aLong67 * 80339347373272757L == arg1) {
						return false;
					}
					local17.aLong67 = arg1 * -3331835497204133987L;
					return true;
				}
				local8.method23969(-1896926972);
			}
		}
		this.aClass16_33.method220(new Class93_Sub11(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bb", descriptor = "(IJ)Z", line = 289)
	boolean method28224(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(8) Class93 local8 = this.aClass16_33.method214((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class93_Sub11) {
					@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) local8;
					if (local17.aLong67 * 80339347373272757L == arg1) {
						return false;
					}
					local17.aLong67 = arg1 * -3331835497204133987L;
					return true;
				}
				local8.method23969(1743178168);
			}
		}
		this.aClass16_33.method220(new Class93_Sub11(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "be", descriptor = "(IJ)Z", line = 289)
	boolean method28225(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(8) Class93 local8 = this.aClass16_33.method214((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class93_Sub11) {
					@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) local8;
					if (local17.aLong67 * 80339347373272757L == arg1) {
						return false;
					}
					local17.aLong67 = arg1 * -3331835497204133987L;
					return true;
				}
				local8.method23969(-238128552);
			}
		}
		this.aClass16_33.method220(new Class93_Sub11(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bm", descriptor = "(IJ)Z", line = 289)
	boolean method28226(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(8) Class93 local8 = this.aClass16_33.method214((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class93_Sub11) {
					@Pc(17) Class93_Sub11 local17 = (Class93_Sub11) local8;
					if (local17.aLong67 * 80339347373272757L == arg1) {
						return false;
					}
					local17.aLong67 = arg1 * -3331835497204133987L;
					return true;
				}
				local8.method23969(-95389448);
			}
		}
		this.aClass16_33.method220(new Class93_Sub11(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bz", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28227(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(-2099673029);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(993762927);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(ILjava/lang/String;I)Z", line = 307)
	boolean method28228(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(1129627355);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(-14674153);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bu", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28229(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(1503934510);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(1564520488);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bw", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28230(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(-1472984531);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(1536475684);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bo", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28231(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(-324440596);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(1127548873);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "bv", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28232(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass16_33 == null) {
			this.aClass16_33 = new Class16(4);
		} else {
			@Pc(22) Class93 local22 = this.aClass16_33.method214((long) arg0);
			if (local22 != null) {
				if (local22 instanceof Class93_Sub15) {
					@Pc(31) Class93_Sub15 local31 = (Class93_Sub15) local22;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method23969(-804406423);
						this.aClass16_33.method220(new Class93_Sub15(arg1), local31.aLong232 * -3750704643647536275L);
						return true;
					}
				}
				local22.method23969(1807159544);
			}
		}
		this.aClass16_33.method220(new Class93_Sub15(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "(Lclient!alw;B)V", line = 330)
	void method28233(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.g1((short) 16384);
		if ((local25 & 0x1) != 0) {
			this.aBoolean741 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean742 = true;
		}
		if (!this.aBoolean741) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean742) {
			this.aStringArray30 = null;
			this.aStringArray29 = null;
		}
		this.anInt4641 = arg0.g4(-118643075) * 352216175;
		this.anInt4643 = arg0.g4(-118643075) * -1492565541;
		if (local3 <= 3 && this.anInt4643 * -770780589 != 0) {
			this.anInt4643 += 1641984992;
		}
		this.anInt4642 = arg0.g2(-1434290800) * -2076644465;
		this.anInt4647 = arg0.g1((short) 16384) * -1208367903;
		this.aString196 = arg0.gjstr(2067629806);
		if (local3 >= 4) {
			arg0.g4(-118643075);
		}
		this.aBoolean743 = arg0.g1((short) 16384) == 1;
		this.aByte152 = arg0.g1b(1264150025);
		this.aByte151 = arg0.g1b(468472349);
		this.aByte154 = arg0.g1b(1590344084);
		this.aByte158 = arg0.g1b(1847212710);
		@Pc(266) int local266;
		if (this.anInt4642 * 849728367 > 0) {
			if (this.aBoolean741 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4642 * 849728367)) {
				this.aLongArray24 = new long[this.anInt4642 * 849728367];
			}
			if (this.aBoolean742 && (this.aStringArray30 == null || this.aStringArray30.length < this.anInt4642 * 849728367)) {
				this.aStringArray30 = new String[this.anInt4642 * 849728367];
			}
			if (this.aByteArray89 == null || this.aByteArray89.length < this.anInt4642 * 849728367) {
				this.aByteArray89 = new byte[this.anInt4642 * 849728367];
			}
			if (this.anIntArray434 == null || this.anIntArray434.length < this.anInt4642 * 849728367) {
				this.anIntArray434 = new int[this.anInt4642 * 849728367];
			}
			if (this.anIntArray435 == null || this.anIntArray435.length < this.anInt4642 * 849728367) {
				this.anIntArray435 = new int[this.anInt4642 * 849728367];
			}
			if (this.aBooleanArray30 == null || this.aBooleanArray30.length < this.anInt4642 * 849728367) {
				this.aBooleanArray30 = new boolean[this.anInt4642 * 849728367];
			}
			for (local266 = 0; local266 < this.anInt4642 * 849728367; local266++) {
				if (this.aBoolean741) {
					this.aLongArray24[local266] = arg0.g8(-1621101286);
				}
				if (this.aBoolean742) {
					this.aStringArray30[local266] = arg0.fastgstr((byte) 124);
				}
				this.aByteArray89[local266] = arg0.g1b(1141867113);
				if (local3 >= 2) {
					this.anIntArray434[local266] = arg0.g4(-118643075);
				}
				if (local3 >= 5) {
					this.anIntArray435[local266] = arg0.g2(-1434290800);
				} else {
					this.anIntArray435[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray30[local266] = arg0.g1((short) 16384) == 1;
				} else {
					this.aBooleanArray30[local266] = false;
				}
			}
			this.method28197(1939784602);
		}
		if (this.anInt4647 * 1113751329 > 0) {
			if (this.aBoolean741 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4647 * 1113751329)) {
				this.aLongArray25 = new long[this.anInt4647 * 1113751329];
			}
			if (this.aBoolean742 && (this.aStringArray29 == null || this.aStringArray29.length < this.anInt4647 * 1113751329)) {
				this.aStringArray29 = new String[this.anInt4647 * 1113751329];
			}
			for (local266 = 0; local266 < this.anInt4647 * 1113751329; local266++) {
				if (this.aBoolean741) {
					this.aLongArray25[local266] = arg0.g8(-944039061);
				}
				if (this.aBoolean742) {
					this.aStringArray29[local266] = arg0.fastgstr((byte) 29);
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.g2(-1434290800);
		if (local266 <= 0) {
			return;
		}
		this.aClass16_33 = new Class16(local266 < 16 ? Class134_Sub2.method10207(local266, (byte) 64) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.g4(-118643075);
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.g4(-118643075);
				this.aClass16_33.method220(new Class93_Sub14(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.g8(1282018690);
				this.aClass16_33.method220(new Class93_Sub11(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.gjstr(1501708011);
				this.aClass16_33.method220(new Class93_Sub15(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "br", descriptor = "(Lclient!alw;)V", line = 330)
	void method28234(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.g1((short) 16384);
		if ((local25 & 0x1) != 0) {
			this.aBoolean741 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean742 = true;
		}
		if (!this.aBoolean741) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean742) {
			this.aStringArray30 = null;
			this.aStringArray29 = null;
		}
		this.anInt4641 = arg0.g4(-118643075) * 352216175;
		this.anInt4643 = arg0.g4(-118643075) * -1492565541;
		if (local3 <= 3 && this.anInt4643 * -770780589 != 0) {
			this.anInt4643 += 1641984992;
		}
		this.anInt4642 = arg0.g2(-1434290800) * -2076644465;
		this.anInt4647 = arg0.g1((short) 16384) * -1208367903;
		this.aString196 = arg0.gjstr(220022173);
		if (local3 >= 4) {
			arg0.g4(-118643075);
		}
		this.aBoolean743 = arg0.g1((short) 16384) == 1;
		this.aByte152 = arg0.g1b(1706285512);
		this.aByte151 = arg0.g1b(1674253805);
		this.aByte154 = arg0.g1b(861559558);
		this.aByte158 = arg0.g1b(728122446);
		@Pc(266) int local266;
		if (this.anInt4642 * 849728367 > 0) {
			if (this.aBoolean741 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4642 * 849728367)) {
				this.aLongArray24 = new long[this.anInt4642 * 849728367];
			}
			if (this.aBoolean742 && (this.aStringArray30 == null || this.aStringArray30.length < this.anInt4642 * 849728367)) {
				this.aStringArray30 = new String[this.anInt4642 * 849728367];
			}
			if (this.aByteArray89 == null || this.aByteArray89.length < this.anInt4642 * 849728367) {
				this.aByteArray89 = new byte[this.anInt4642 * 849728367];
			}
			if (this.anIntArray434 == null || this.anIntArray434.length < this.anInt4642 * 849728367) {
				this.anIntArray434 = new int[this.anInt4642 * 849728367];
			}
			if (this.anIntArray435 == null || this.anIntArray435.length < this.anInt4642 * 849728367) {
				this.anIntArray435 = new int[this.anInt4642 * 849728367];
			}
			if (this.aBooleanArray30 == null || this.aBooleanArray30.length < this.anInt4642 * 849728367) {
				this.aBooleanArray30 = new boolean[this.anInt4642 * 849728367];
			}
			for (local266 = 0; local266 < this.anInt4642 * 849728367; local266++) {
				if (this.aBoolean741) {
					this.aLongArray24[local266] = arg0.g8(-1553052440);
				}
				if (this.aBoolean742) {
					this.aStringArray30[local266] = arg0.fastgstr((byte) 81);
				}
				this.aByteArray89[local266] = arg0.g1b(549803572);
				if (local3 >= 2) {
					this.anIntArray434[local266] = arg0.g4(-118643075);
				}
				if (local3 >= 5) {
					this.anIntArray435[local266] = arg0.g2(-1434290800);
				} else {
					this.anIntArray435[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray30[local266] = arg0.g1((short) 16384) == 1;
				} else {
					this.aBooleanArray30[local266] = false;
				}
			}
			this.method28197(1975638763);
		}
		if (this.anInt4647 * 1113751329 > 0) {
			if (this.aBoolean741 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4647 * 1113751329)) {
				this.aLongArray25 = new long[this.anInt4647 * 1113751329];
			}
			if (this.aBoolean742 && (this.aStringArray29 == null || this.aStringArray29.length < this.anInt4647 * 1113751329)) {
				this.aStringArray29 = new String[this.anInt4647 * 1113751329];
			}
			for (local266 = 0; local266 < this.anInt4647 * 1113751329; local266++) {
				if (this.aBoolean741) {
					this.aLongArray25[local266] = arg0.g8(387340036);
				}
				if (this.aBoolean742) {
					this.aStringArray29[local266] = arg0.fastgstr((byte) 13);
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.g2(-1434290800);
		if (local266 <= 0) {
			return;
		}
		this.aClass16_33 = new Class16(local266 < 16 ? Class134_Sub2.method10207(local266, (byte) 21) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.g4(-118643075);
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.g4(-118643075);
				this.aClass16_33.method220(new Class93_Sub14(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.g8(1654970508);
				this.aClass16_33.method220(new Class93_Sub11(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.gjstr(493379777);
				this.aClass16_33.method220(new Class93_Sub15(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)V", line = 370)
	static void method28235(@OriginalArg(0) byte arg0) {
		if (Class553.anInt3422 * 861911493 > 1) {
			Class51.options.method14363(Class51.options.aClass166_Sub34_1, 4, (byte) 68);
		} else {
			Class51.options.method14363(Class51.options.aClass166_Sub34_1, 2, (byte) 124);
		}
	}

	@OriginalMember(owner = "client!kr", name = "pi", descriptor = "(Lclient!yf;I)V", line = 7693)
	static final void method28236(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1483858371);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class183.method24575(local16, local22, arg0, -1324104243);
	}

	@OriginalMember(owner = "client!kr", name = "agr", descriptor = "(Lclient!yf;I)V", line = 10757)
	static final void method28237(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.get(local12, 1438513484)).anInt154 * -2120788109;
	}

	@OriginalMember(owner = "client!kr", name = "arv", descriptor = "(Lclient!yf;I)V", line = 12982)
	static final void method28238(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(16) long local16 = Class49.method16603(177889820);
		if (local16 == 0L) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 5;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class40.method795(local16, local13, (byte) 41);
		}
	}

	@OriginalMember(owner = "client!kr", name = "bfy", descriptor = "(Lclient!yf;I)V", line = 15133)
	static final void method28239(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
