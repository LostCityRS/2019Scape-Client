package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xg")
public class Class658 {

	@OriginalMember(owner = "client!xg", name = "f", descriptor = "I")
	public static final int anInt5812 = 10;

	@OriginalMember(owner = "client!xg", name = "k", descriptor = "I")
	public static final int anInt5813 = 10;

	@OriginalMember(owner = "client!xg", name = "n", descriptor = "I")
	public static final int anInt5814 = 1073741824;

	@OriginalMember(owner = "client!xg", name = "w", descriptor = "I")
	public static final int anInt5815 = 4;

	@OriginalMember(owner = "client!xg", name = "l", descriptor = "I")
	public static final int anInt5818 = 4;

	@OriginalMember(owner = "client!xg", name = "e", descriptor = "I")
	public static final int anInt5819 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!xg", name = "m", descriptor = "I")
	static final int anInt5820 = 1073741823;

	@OriginalMember(owner = "client!xg", name = "h", descriptor = "[I")
	static final int[] anIntArray513 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!xg", name = "a", descriptor = "Lclient!eb;")
	static Class240 aClass240_91 = new Class240(260);

	@OriginalMember(owner = "client!xg", name = "g", descriptor = "Lclient!eb;")
	static Class240 aClass240_92 = new Class240(5);

	@OriginalMember(owner = "client!xg", name = "p", descriptor = "[Lclient!abw;")
	Class48[] aClass48Array1;

	@OriginalMember(owner = "client!xg", name = "o", descriptor = "J")
	long aLong300;

	@OriginalMember(owner = "client!xg", name = "z", descriptor = "[I")
	int[] anIntArray510;

	@OriginalMember(owner = "client!xg", name = "u", descriptor = "I")
	int anInt5816;

	@OriginalMember(owner = "client!xg", name = "d", descriptor = "[I")
	public int[] anIntArray511;

	@OriginalMember(owner = "client!xg", name = "c", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!xg", name = "r", descriptor = "Z")
	public boolean aBoolean862;

	@OriginalMember(owner = "client!xg", name = "s", descriptor = "J")
	long aLong301;

	@OriginalMember(owner = "client!xg", name = "v", descriptor = "I")
	public int anInt5817 = 832491171;

	@OriginalMember(owner = "client!xg", name = "k", descriptor = "(Lclient!aky;Lclient!aky;I)V", line = 38)
	public static void method32758(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -2266);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!xg", name = "e", descriptor = "(I[I[Lclient!abw;[I[IZII)V", line = 50)
	public void method32759(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class48[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 != this.anInt5816 * -1790369147) {
			this.anInt5816 = arg0 * -236747187;
		}
		this.anIntArray510 = arg1;
		this.aClass48Array1 = arg2;
		this.anIntArray511 = arg3;
		this.anIntArray512 = arg4;
		this.aBoolean862 = arg5;
		this.anInt5817 = arg6 * -832491171;
		this.method32772(-1660331487);
	}

	@OriginalMember(owner = "client!xg", name = "s", descriptor = "(I[I[Lclient!abw;[I[IZI)V", line = 50)
	public void method32760(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class48[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (arg0 != this.anInt5816 * -1790369147) {
			this.anInt5816 = arg0 * -236747187;
		}
		this.anIntArray510 = arg1;
		this.aClass48Array1 = arg2;
		this.anIntArray511 = arg3;
		this.anIntArray512 = arg4;
		this.aBoolean862 = arg5;
		this.anInt5817 = arg6 * -832491171;
		this.method32772(-2099466254);
	}

	@OriginalMember(owner = "client!xg", name = "n", descriptor = "(IILclient!aov;I)V", line = 63)
	public void method32761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = anIntArray513[arg0];
		if (arg2.method18261(arg1, -2057102422) != null) {
			this.anIntArray510[local3] = arg1 | Integer.MIN_VALUE;
			this.method32772(-438814159);
		}
	}

	@OriginalMember(owner = "client!xg", name = "y", descriptor = "(IILclient!aov;)V", line = 63)
	public void method32762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2) {
		@Pc(3) int local3 = anIntArray513[arg0];
		if (arg2.method18261(arg1, 1443277048) != null) {
			this.anIntArray510[local3] = arg1 | Integer.MIN_VALUE;
			this.method32772(-450129235);
		}
	}

	@OriginalMember(owner = "client!xg", name = "m", descriptor = "(III)V", line = 70)
	public void method32763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray511[arg0] = arg1;
		this.method32772(-1047309808);
	}

	@OriginalMember(owner = "client!xg", name = "q", descriptor = "(II)V", line = 70)
	public void method32764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray511[arg0] = arg1;
		this.method32772(-609464634);
	}

	@OriginalMember(owner = "client!xg", name = "k", descriptor = "(IIB)V", line = 75)
	public void method32765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anIntArray512[arg0] = arg1;
		this.method32772(-418851774);
	}

	@OriginalMember(owner = "client!xg", name = "x", descriptor = "(Z)V", line = 80)
	public void method32766(@OriginalArg(0) boolean arg0) {
		this.aBoolean862 = arg0;
		this.method32772(-585657661);
	}

	@OriginalMember(owner = "client!xg", name = "b", descriptor = "(Z)V", line = 80)
	public void method32767(@OriginalArg(0) boolean arg0) {
		this.aBoolean862 = arg0;
		this.method32772(-650848689);
	}

	@OriginalMember(owner = "client!xg", name = "f", descriptor = "(ZB)V", line = 80)
	public void method32768(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean862 = arg0;
		this.method32772(-1784509035);
	}

	@OriginalMember(owner = "client!xg", name = "w", descriptor = "(IILclient!aon;B)V", line = 85)
	public void method32769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub12 arg2, @OriginalArg(3) byte arg3) {
		if (arg1 == -1) {
			this.anIntArray510[arg0] = 0;
		} else if (arg2.method18261(arg1, 496573574) == null) {
			return;
		} else {
			this.anIntArray510[arg0] = arg1 | 0x40000000;
			this.method32772(-2142413905);
		}
	}

	@OriginalMember(owner = "client!xg", name = "a", descriptor = "(IILclient!aon;)V", line = 85)
	public void method32770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub12 arg2) {
		if (arg1 == -1) {
			this.anIntArray510[arg0] = 0;
		} else if (arg2.method18261(arg1, -494405897) == null) {
			return;
		} else {
			this.anIntArray510[arg0] = arg1 | 0x40000000;
			this.method32772(-1324447820);
		}
	}

	@OriginalMember(owner = "client!xg", name = "h", descriptor = "(IILclient!aon;)V", line = 85)
	public void method32771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub12 arg2) {
		if (arg1 == -1) {
			this.anIntArray510[arg0] = 0;
		} else if (arg2.method18261(arg1, 2130028694) == null) {
			return;
		} else {
			this.anIntArray510[arg0] = arg1 | 0x40000000;
			this.method32772(-484714751);
		}
	}

	@OriginalMember(owner = "client!xg", name = "l", descriptor = "(I)V", line = 94)
	void method32772(@OriginalArg(0) int arg0) {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		this.aLong300 = 7902130402649862347L;
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anInt5816 * -1790369147 >> 8)) & 0xFFL)]) * -7902130402649862347L;
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anInt5816 * -1790369147)) & 0xFFL)]) * -7902130402649862347L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray510.length; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 24)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 16)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 8)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray510[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		if (this.aClass48Array1 != null) {
			for (local60 = 0; local60 < this.aClass48Array1.length; local60++) {
				if (this.aClass48Array1[local60] != null) {
					@Pc(202) int[] local202;
					@Pc(208) int[] local208;
					if (this.aBoolean862) {
						local202 = this.aClass48Array1[local60].anIntArray12;
						local208 = this.aClass48Array1[local60].anIntArray15;
					} else {
						local202 = this.aClass48Array1[local60].anIntArray14;
						local208 = this.aClass48Array1[local60].anIntArray13;
					}
					@Pc(225) int local225;
					if (local202 != null) {
						for (local225 = 0; local225 < local202.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (local202[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) local202[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (local208 != null) {
						for (local225 = 0; local225 < local208.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (local208[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) local208[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (this.aClass48Array1[local60].aShortArray6 != null) {
						for (local225 = 0; local225 < this.aClass48Array1[local60].aShortArray6.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aClass48Array1[local60].aShortArray6[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.aClass48Array1[local60].aShortArray6[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (this.aClass48Array1[local60].aShortArray7 != null) {
						for (local225 = 0; local225 < this.aClass48Array1[local60].aShortArray7.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aClass48Array1[local60].aShortArray7[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.aClass48Array1[local60].aShortArray7[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray511[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray512[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aBoolean862 ? 1 : 0)) & 0xFFL)]) * -7902130402649862347L;
	}

	@OriginalMember(owner = "client!xg", name = "g", descriptor = "()V", line = 94)
	void method32773() {
		@Pc(1) long[] local1 = Class93_Sub41.aLongArray18;
		this.aLong300 = 7902130402649862347L;
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anInt5816 * -1790369147 >> 8)) & 0xFFL)]) * -7902130402649862347L;
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anInt5816 * -1790369147)) & 0xFFL)]) * -7902130402649862347L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray510.length; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 24)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 16)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.anIntArray510[local60] >> 8)) & 0xFFL)]) * -7902130402649862347L;
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray510[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		if (this.aClass48Array1 != null) {
			for (local60 = 0; local60 < this.aClass48Array1.length; local60++) {
				if (this.aClass48Array1[local60] != null) {
					@Pc(202) int[] local202;
					@Pc(208) int[] local208;
					if (this.aBoolean862) {
						local202 = this.aClass48Array1[local60].anIntArray12;
						local208 = this.aClass48Array1[local60].anIntArray15;
					} else {
						local202 = this.aClass48Array1[local60].anIntArray14;
						local208 = this.aClass48Array1[local60].anIntArray13;
					}
					@Pc(225) int local225;
					if (local202 != null) {
						for (local225 = 0; local225 < local202.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (local202[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) local202[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (local208 != null) {
						for (local225 = 0; local225 < local208.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (local208[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) local208[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (this.aClass48Array1[local60].aShortArray6 != null) {
						for (local225 = 0; local225 < this.aClass48Array1[local60].aShortArray6.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aClass48Array1[local60].aShortArray6[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.aClass48Array1[local60].aShortArray6[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
					if (this.aClass48Array1[local60].aShortArray7 != null) {
						for (local225 = 0; local225 < this.aClass48Array1[local60].aShortArray7.length; local225++) {
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aClass48Array1[local60].aShortArray7[local225] >> 8)) & 0xFFL)]) * -7902130402649862347L;
							this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.aClass48Array1[local60].aShortArray7[local225]) & 0xFFL)]) * -7902130402649862347L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray511[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) this.anIntArray512[local60]) & 0xFFL)]) * -7902130402649862347L;
		}
		this.aLong300 = (this.aLong300 * 3247757972139510557L >>> 8 ^ local1[(int) ((this.aLong300 * 3247757972139510557L ^ (long) (this.aBoolean862 ? 1 : 0)) & 0xFFL)]) * -7902130402649862347L;
	}

	@OriginalMember(owner = "client!xg", name = "u", descriptor = "(Lclient!dh;ILclient!aof;Lclient!aov;Lclient!aod;Lclient!aon;Lclient!em;Lclient!ep;Lclient!aaq;Lclient!aaq;[Lclient!aaq;[IIZLclient!wy;B)Lclient!do;", line = 154)
	public Class109 method32774(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub5 arg2, @OriginalArg(3) Class32_Sub19 arg3, @OriginalArg(4) Class32_Sub3 arg4, @OriginalArg(5) Class32_Sub12 arg5, @OriginalArg(6) Interface21 arg6, @OriginalArg(7) Interface23 arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) Class19 arg9, @OriginalArg(10) Class19[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class651 arg14, @OriginalArg(15) byte arg15) {
		if (this.anInt5817 * 1405397749 != -1) {
			return ((Class336) arg4.method18261(this.anInt5817 * 1405397749, 315365327)).method27421(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null, -1872411274);
		}
		@Pc(29) int local29 = arg1;
		@Pc(34) long local34 = this.aLong300 * 3247757972139510557L;
		@Pc(37) int[] local37 = this.anIntArray510;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(67) int local67;
		if (arg8 != null) {
			@Pc(48) Class263 local48 = arg8.method23560(-1035050127);
			if (local48 != null && (local48.anInt3874 * -1166222689 >= 0 || local48.anInt3875 * 1278483855 >= 0)) {
				local37 = new int[this.anIntArray510.length];
				for (local67 = 0; local67 < local37.length; local67++) {
					local37[local67] = this.anIntArray510[local67];
				}
				if (local48.anInt3874 * -1166222689 >= 0 && arg14.anInt5798 * 544531153 != -1) {
					local39 = true;
					if (local48.anInt3874 * -1166222689 == 65535) {
						local37[arg14.anInt5798 * 544531153] = 0;
						for (local67 = 0; local67 < arg14.anIntArray508.length; local67++) {
							local37[arg14.anIntArray508[local67]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg14.anInt5798 * 544531153] = local48.anInt3874 * -1166222689 | 0x40000000;
						for (local67 = 0; local67 < arg14.anIntArray508.length; local67++) {
							local37[arg14.anIntArray508[local67]] = 0;
						}
						local34 ^= (long) local37[arg14.anInt5798 * 544531153] << 32;
					}
				}
				if (local48.anInt3875 * 1278483855 >= 0 && arg14.anInt5802 * 1420019143 != -1) {
					local41 = true;
					if (local48.anInt3875 * 1278483855 == 65535) {
						local37[arg14.anInt5802 * 1420019143] = 0;
						for (local67 = 0; local67 < arg14.anIntArray507.length; local67++) {
							local37[arg14.anIntArray507[local67]] = 0;
						}
						local34 ^= 0xFFFFFFFFL;
					} else {
						local37[arg14.anInt5802 * 1420019143] = local48.anInt3875 * 1278483855 | 0x40000000;
						for (local67 = 0; local67 < arg14.anIntArray507.length; local67++) {
							local37[arg14.anIntArray507[local67]] = 0;
						}
						local34 ^= local37[arg14.anInt5802 * 1420019143];
					}
				}
			}
		}
		@Pc(254) boolean local254 = false;
		local67 = arg10 == null ? 0 : arg10.length;
		for (@Pc(264) int local264 = 0; local264 < local67; local264++) {
			if (arg10[local264] != null) {
				local29 |= arg10[local264].method23585(-1734336429);
				local254 = true;
			}
		}
		if (arg8 != null) {
			local29 |= arg8.method23585(-1780234928);
			local254 = true;
		}
		if (arg9 != null) {
			local29 |= arg9.method23585(-1722279235);
			local254 = true;
		}
		@Pc(308) boolean local308 = false;
		if (arg11 != null) {
			for (@Pc(312) int local312 = 0; local312 < arg11.length; local312++) {
				if (arg11[local312] != -1) {
					local29 |= 0x20;
					local308 = true;
				}
			}
		}
		@Pc(332) Class240 local332 = aClass240_91;
		@Pc(338) Class109 local338;
		synchronized (aClass240_91) {
			local338 = (Class109) aClass240_91.method25829(local34);
		}
		@Pc(348) Class622 local348 = null;
		if (-1790369147 * this.anInt5816 != -1) {
			local348 = (Class622) arg2.method18261(this.anInt5816 * -1790369147, 1332928259);
		}
		@Pc(385) int local385;
		@Pc(393) int local393;
		if (local338 == null || arg0.method20759(local338.method6875(), local29) != 0) {
			if (local338 != null) {
				local29 = arg0.method20599(local29, local338.method6875());
			}
			@Pc(383) boolean local383 = false;
			local385 = 0;
			while (true) {
				@Pc(410) int local410;
				if (local385 >= local37.length) {
					if (local383) {
						if (this.aLong301 * 6689010804640134493L != -1L) {
							@Pc(523) Class240 local523 = aClass240_91;
							synchronized (aClass240_91) {
								local338 = (Class109) aClass240_91.method25829(this.aLong301 * 6689010804640134493L);
							}
						}
						if (local338 == null || arg0.method20759(local338.method6875(), local29) != 0) {
							return null;
						}
					} else {
						@Pc(555) Class231[] local555 = new Class231[local37.length];
						@Pc(565) int local565;
						for (local393 = 0; local393 < local37.length; local393++) {
							local565 = local37[local393];
							@Pc(567) Class48 local567 = null;
							@Pc(581) boolean local581 = local393 == 5 && local39 || local393 == 3 && local41;
							@Pc(614) Class231 local614;
							if ((local565 & 0x40000000) != 0) {
								if (!local581 && this.aClass48Array1 != null && this.aClass48Array1[local393] != null) {
									local567 = this.aClass48Array1[local393];
								}
								local614 = ((Class47) arg5.method18261(local565 & 0x3FFFFFFF, -554368952)).method939(this.aBoolean862, local567, -1032805468);
								if (local614 != null) {
									local555[local393] = local614;
								}
							} else if ((local565 & Integer.MIN_VALUE) != 0) {
								local614 = ((Class369) arg3.method18261(local565 & 0x3FFFFFFF, 479189538)).method27982(109093879);
								if (local614 != null) {
									local555[local393] = local614;
								}
							}
						}
						@Pc(667) int local667;
						if (local348 != null && local348.anIntArrayArray65 != null) {
							for (local393 = 0; local393 < local348.anIntArrayArray65.length; local393++) {
								if (local555[local393] != null) {
									local565 = 0;
									local667 = 0;
									local410 = 0;
									@Pc(671) int local671 = 0;
									@Pc(673) int local673 = 0;
									@Pc(675) int local675 = 0;
									if (local348.anIntArrayArray65[local393] != null) {
										local565 = local348.anIntArrayArray65[local393][0];
										local667 = local348.anIntArrayArray65[local393][1];
										local410 = local348.anIntArrayArray65[local393][2];
										local671 = local348.anIntArrayArray65[local393][3] << 3;
										local673 = local348.anIntArrayArray65[local393][4] << 3;
										local675 = local348.anIntArrayArray65[local393][5] << 3;
									}
									if (local671 != 0 || local673 != 0 || local675 != 0) {
										local555[local393].method25689(local671, local673, local675);
									}
									if (local565 != 0 || local667 != 0 || local410 != 0) {
										local555[local393].method25687(local565, local667, local410);
									}
								}
							}
						}
						@Pc(768) Class231 local768 = new Class231(local555, local555.length);
						@Pc(772) int local772 = local29 | 0x4000;
						local338 = arg0.method20597(local768, local772, Class447.anInt4954 * 1809675335, 64, 850);
						for (local565 = 0; local565 < 10; local565++) {
							for (local667 = 0; local667 < Class618.aShortArrayArray6[local565].length; local667++) {
								if (this.anIntArray511[local565] < Class111.aShortArrayArrayArray3[local565][local667].length) {
									local338.method7017(Class618.aShortArrayArray6[local565][local667], Class111.aShortArrayArrayArray3[local565][local667][this.anIntArray511[local565]]);
								}
							}
						}
						for (local565 = 0; local565 < 10; local565++) {
							for (local667 = 0; local667 < Class138_Sub3.aShortArrayArray4[local565].length; local667++) {
								if (this.anIntArray512[local565] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local565][local667].length) {
									local338.method6913(Class138_Sub3.aShortArrayArray4[local565][local667], Class79_Sub1_Sub2.aShortArrayArrayArray1[local565][local667][this.anIntArray512[local565]]);
								}
							}
						}
						local338.method6908();
						if (arg13) {
							local338.method6874(local29);
							@Pc(882) Class240 local882 = aClass240_91;
							synchronized (aClass240_91) {
								aClass240_91.method25838(local338, local34);
							}
							this.aLong301 = local34 * 6817638593204897525L;
						}
					}
					break;
				}
				local393 = local37[local385];
				@Pc(395) Class48 local395 = null;
				@Pc(397) boolean local397 = false;
				if (local39) {
					if (arg14.anInt5798 * 544531153 == local385) {
						local397 = true;
					} else {
						for (local410 = 0; local410 < arg14.anIntArray508.length; local410++) {
							if (local385 == arg14.anIntArray508[local410]) {
								local397 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (arg14.anInt5802 * 1420019143 == local385) {
						local397 = true;
					} else {
						for (local410 = 0; local410 < arg14.anIntArray507.length; local410++) {
							if (local385 == arg14.anIntArray507[local410]) {
								local397 = true;
								break;
							}
						}
					}
				}
				if ((local393 & 0x40000000) != 0) {
					if (!local397 && this.aClass48Array1 != null && this.aClass48Array1[local385] != null) {
						local395 = this.aClass48Array1[local385];
					}
					if (!((Class47) arg5.method18261(local393 & 0x3FFFFFFF, -2122313286)).method938(this.aBoolean862, local395, 488278399)) {
						local383 = true;
					}
				} else if ((local393 & Integer.MIN_VALUE) != 0 && !((Class369) arg3.method18261(local393 & 0x3FFFFFFF, 1130418803)).method27980((byte) 3)) {
					local383 = true;
				}
				local385++;
			}
		}
		@Pc(906) Class109 local906 = local338.method6938((byte) 4, local29, true);
		if (!local254 && !local308) {
			return local906;
		}
		@Pc(914) Class470[] local914 = null;
		if (local348 != null) {
			local914 = local348.method32135((byte) -60);
		}
		if (local308 && local914 != null) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (local914[local385] != null) {
					local906.method6936(local914[local385], 0x1 << local385, true);
				}
			}
		}
		local385 = 0;
		local393 = 1;
		while (local385 < local67) {
			if (arg10[local385] != null) {
				arg10[local385].method23590(local906, 0, local393, (byte) -99);
			}
			local385++;
			local393 <<= 0x1;
		}
		if (local308) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (arg11[local385] != -1) {
					local393 = arg11[local385] - arg12;
					local393 &= 0x3FFF;
					@Pc(1000) Class470 local1000 = new Class470();
					local1000.method29385(0.0F, 1.0F, 0.0F, Class464.method29281(local393));
					local906.method6936(local1000, 0x1 << local385, false);
				}
			}
		}
		if (local308 && local914 != null) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (local914[local385] != null) {
					local906.method6936(local914[local385], 0x1 << local385, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class237.method25771(local906, arg8, arg9, -754947276);
		} else if (arg8 != null) {
			arg8.method23587(local906, 0, 124206633);
		} else if (arg9 != null) {
			arg9.method23587(local906, 0, -871858340);
		}
		return local906;
	}

	@OriginalMember(owner = "client!xg", name = "i", descriptor = "(Lclient!dh;ILclient!aof;Lclient!aov;Lclient!aod;Lclient!aon;Lclient!em;Lclient!ep;Lclient!aaq;Lclient!aaq;[Lclient!aaq;[IIZLclient!wy;)Lclient!do;", line = 154)
	public Class109 method32775(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub5 arg2, @OriginalArg(3) Class32_Sub19 arg3, @OriginalArg(4) Class32_Sub3 arg4, @OriginalArg(5) Class32_Sub12 arg5, @OriginalArg(6) Interface21 arg6, @OriginalArg(7) Interface23 arg7, @OriginalArg(8) Class19 arg8, @OriginalArg(9) Class19 arg9, @OriginalArg(10) Class19[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class651 arg14) {
		if (this.anInt5817 * 1405397749 != -1) {
			return ((Class336) arg4.method18261(this.anInt5817 * 1405397749, 1601653993)).method27421(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null, -1872411274);
		}
		@Pc(29) int local29 = arg1;
		@Pc(34) long local34 = this.aLong300 * 3247757972139510557L;
		@Pc(37) int[] local37 = this.anIntArray510;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(67) int local67;
		if (arg8 != null) {
			@Pc(48) Class263 local48 = arg8.method23560(-1312239055);
			if (local48 != null && (local48.anInt3874 * -1166222689 >= 0 || local48.anInt3875 * 1278483855 >= 0)) {
				local37 = new int[this.anIntArray510.length];
				for (local67 = 0; local67 < local37.length; local67++) {
					local37[local67] = this.anIntArray510[local67];
				}
				if (local48.anInt3874 * -1166222689 >= 0 && arg14.anInt5798 * 544531153 != -1) {
					local39 = true;
					if (local48.anInt3874 * -1166222689 == 65535) {
						local37[arg14.anInt5798 * 544531153] = 0;
						for (local67 = 0; local67 < arg14.anIntArray508.length; local67++) {
							local37[arg14.anIntArray508[local67]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg14.anInt5798 * 544531153] = local48.anInt3874 * -1166222689 | 0x40000000;
						for (local67 = 0; local67 < arg14.anIntArray508.length; local67++) {
							local37[arg14.anIntArray508[local67]] = 0;
						}
						local34 ^= (long) local37[arg14.anInt5798 * 544531153] << 32;
					}
				}
				if (local48.anInt3875 * 1278483855 >= 0 && arg14.anInt5802 * 1420019143 != -1) {
					local41 = true;
					if (local48.anInt3875 * 1278483855 == 65535) {
						local37[arg14.anInt5802 * 1420019143] = 0;
						for (local67 = 0; local67 < arg14.anIntArray507.length; local67++) {
							local37[arg14.anIntArray507[local67]] = 0;
						}
						local34 ^= 0xFFFFFFFFL;
					} else {
						local37[arg14.anInt5802 * 1420019143] = local48.anInt3875 * 1278483855 | 0x40000000;
						for (local67 = 0; local67 < arg14.anIntArray507.length; local67++) {
							local37[arg14.anIntArray507[local67]] = 0;
						}
						local34 ^= local37[arg14.anInt5802 * 1420019143];
					}
				}
			}
		}
		@Pc(254) boolean local254 = false;
		local67 = arg10 == null ? 0 : arg10.length;
		for (@Pc(264) int local264 = 0; local264 < local67; local264++) {
			if (arg10[local264] != null) {
				local29 |= arg10[local264].method23585(-2137861585);
				local254 = true;
			}
		}
		if (arg8 != null) {
			local29 |= arg8.method23585(-1866683273);
			local254 = true;
		}
		if (arg9 != null) {
			local29 |= arg9.method23585(-1937612943);
			local254 = true;
		}
		@Pc(308) boolean local308 = false;
		if (arg11 != null) {
			for (@Pc(312) int local312 = 0; local312 < arg11.length; local312++) {
				if (arg11[local312] != -1) {
					local29 |= 0x20;
					local308 = true;
				}
			}
		}
		@Pc(332) Class240 local332 = aClass240_91;
		@Pc(338) Class109 local338;
		synchronized (aClass240_91) {
			local338 = (Class109) aClass240_91.method25829(local34);
		}
		@Pc(348) Class622 local348 = null;
		if (-1790369147 * this.anInt5816 != -1) {
			local348 = (Class622) arg2.method18261(this.anInt5816 * -1790369147, 902973076);
		}
		@Pc(385) int local385;
		@Pc(393) int local393;
		if (local338 == null || arg0.method20759(local338.method6875(), local29) != 0) {
			if (local338 != null) {
				local29 = arg0.method20599(local29, local338.method6875());
			}
			@Pc(383) boolean local383 = false;
			local385 = 0;
			while (true) {
				@Pc(410) int local410;
				if (local385 >= local37.length) {
					if (local383) {
						if (this.aLong301 * 6689010804640134493L != -1L) {
							@Pc(523) Class240 local523 = aClass240_91;
							synchronized (aClass240_91) {
								local338 = (Class109) aClass240_91.method25829(this.aLong301 * 6689010804640134493L);
							}
						}
						if (local338 == null || arg0.method20759(local338.method6875(), local29) != 0) {
							return null;
						}
					} else {
						@Pc(555) Class231[] local555 = new Class231[local37.length];
						@Pc(565) int local565;
						for (local393 = 0; local393 < local37.length; local393++) {
							local565 = local37[local393];
							@Pc(567) Class48 local567 = null;
							@Pc(581) boolean local581 = local393 == 5 && local39 || local393 == 3 && local41;
							@Pc(614) Class231 local614;
							if ((local565 & 0x40000000) != 0) {
								if (!local581 && this.aClass48Array1 != null && this.aClass48Array1[local393] != null) {
									local567 = this.aClass48Array1[local393];
								}
								local614 = ((Class47) arg5.method18261(local565 & 0x3FFFFFFF, 1565132104)).method939(this.aBoolean862, local567, -854931958);
								if (local614 != null) {
									local555[local393] = local614;
								}
							} else if ((local565 & Integer.MIN_VALUE) != 0) {
								local614 = ((Class369) arg3.method18261(local565 & 0x3FFFFFFF, 1074529241)).method27982(976353450);
								if (local614 != null) {
									local555[local393] = local614;
								}
							}
						}
						@Pc(667) int local667;
						if (local348 != null && local348.anIntArrayArray65 != null) {
							for (local393 = 0; local393 < local348.anIntArrayArray65.length; local393++) {
								if (local555[local393] != null) {
									local565 = 0;
									local667 = 0;
									local410 = 0;
									@Pc(671) int local671 = 0;
									@Pc(673) int local673 = 0;
									@Pc(675) int local675 = 0;
									if (local348.anIntArrayArray65[local393] != null) {
										local565 = local348.anIntArrayArray65[local393][0];
										local667 = local348.anIntArrayArray65[local393][1];
										local410 = local348.anIntArrayArray65[local393][2];
										local671 = local348.anIntArrayArray65[local393][3] << 3;
										local673 = local348.anIntArrayArray65[local393][4] << 3;
										local675 = local348.anIntArrayArray65[local393][5] << 3;
									}
									if (local671 != 0 || local673 != 0 || local675 != 0) {
										local555[local393].method25689(local671, local673, local675);
									}
									if (local565 != 0 || local667 != 0 || local410 != 0) {
										local555[local393].method25687(local565, local667, local410);
									}
								}
							}
						}
						@Pc(768) Class231 local768 = new Class231(local555, local555.length);
						@Pc(772) int local772 = local29 | 0x4000;
						local338 = arg0.method20597(local768, local772, Class447.anInt4954 * 1809675335, 64, 850);
						for (local565 = 0; local565 < 10; local565++) {
							for (local667 = 0; local667 < Class618.aShortArrayArray6[local565].length; local667++) {
								if (this.anIntArray511[local565] < Class111.aShortArrayArrayArray3[local565][local667].length) {
									local338.method7017(Class618.aShortArrayArray6[local565][local667], Class111.aShortArrayArrayArray3[local565][local667][this.anIntArray511[local565]]);
								}
							}
						}
						for (local565 = 0; local565 < 10; local565++) {
							for (local667 = 0; local667 < Class138_Sub3.aShortArrayArray4[local565].length; local667++) {
								if (this.anIntArray512[local565] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local565][local667].length) {
									local338.method6913(Class138_Sub3.aShortArrayArray4[local565][local667], Class79_Sub1_Sub2.aShortArrayArrayArray1[local565][local667][this.anIntArray512[local565]]);
								}
							}
						}
						local338.method6908();
						if (arg13) {
							local338.method6874(local29);
							@Pc(882) Class240 local882 = aClass240_91;
							synchronized (aClass240_91) {
								aClass240_91.method25838(local338, local34);
							}
							this.aLong301 = local34 * 6817638593204897525L;
						}
					}
					break;
				}
				local393 = local37[local385];
				@Pc(395) Class48 local395 = null;
				@Pc(397) boolean local397 = false;
				if (local39) {
					if (arg14.anInt5798 * 544531153 == local385) {
						local397 = true;
					} else {
						for (local410 = 0; local410 < arg14.anIntArray508.length; local410++) {
							if (local385 == arg14.anIntArray508[local410]) {
								local397 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (arg14.anInt5802 * 1420019143 == local385) {
						local397 = true;
					} else {
						for (local410 = 0; local410 < arg14.anIntArray507.length; local410++) {
							if (local385 == arg14.anIntArray507[local410]) {
								local397 = true;
								break;
							}
						}
					}
				}
				if ((local393 & 0x40000000) != 0) {
					if (!local397 && this.aClass48Array1 != null && this.aClass48Array1[local385] != null) {
						local395 = this.aClass48Array1[local385];
					}
					if (!((Class47) arg5.method18261(local393 & 0x3FFFFFFF, 1758475538)).method938(this.aBoolean862, local395, 1914995837)) {
						local383 = true;
					}
				} else if ((local393 & Integer.MIN_VALUE) != 0 && !((Class369) arg3.method18261(local393 & 0x3FFFFFFF, 1624383438)).method27980((byte) 3)) {
					local383 = true;
				}
				local385++;
			}
		}
		@Pc(906) Class109 local906 = local338.method6938((byte) 4, local29, true);
		if (!local254 && !local308) {
			return local906;
		}
		@Pc(914) Class470[] local914 = null;
		if (local348 != null) {
			local914 = local348.method32135((byte) -69);
		}
		if (local308 && local914 != null) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (local914[local385] != null) {
					local906.method6936(local914[local385], 0x1 << local385, true);
				}
			}
		}
		local385 = 0;
		local393 = 1;
		while (local385 < local67) {
			if (arg10[local385] != null) {
				arg10[local385].method23590(local906, 0, local393, (byte) -107);
			}
			local385++;
			local393 <<= 0x1;
		}
		if (local308) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (arg11[local385] != -1) {
					local393 = arg11[local385] - arg12;
					local393 &= 0x3FFF;
					@Pc(1000) Class470 local1000 = new Class470();
					local1000.method29385(0.0F, 1.0F, 0.0F, Class464.method29281(local393));
					local906.method6936(local1000, 0x1 << local385, false);
				}
			}
		}
		if (local308 && local914 != null) {
			for (local385 = 0; local385 < arg11.length; local385++) {
				if (local914[local385] != null) {
					local906.method6936(local914[local385], 0x1 << local385, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class237.method25771(local906, arg8, arg9, -1236696267);
		} else if (arg8 != null) {
			arg8.method23587(local906, 0, 545007655);
		} else if (arg9 != null) {
			arg9.method23587(local906, 0, 1649143651);
		}
		return local906;
	}

	@OriginalMember(owner = "client!xg", name = "z", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aod;Lclient!aon;Lclient!em;Lclient!ep;Lclient!aaq;B)Lclient!do;", line = 372)
	public Class109 method32776(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub3 arg3, @OriginalArg(4) Class32_Sub12 arg4, @OriginalArg(5) Interface21 arg5, @OriginalArg(6) Interface23 arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) byte arg8) {
		if (this.anInt5817 * 1405397749 != -1) {
			return ((Class336) arg3.method18261(this.anInt5817 * 1405397749, -1224011498)).method27426(arg0, arg1, arg5, arg6, arg7, null, (short) 19018);
		}
		@Pc(32) int local32 = arg7 == null ? arg1 : arg1 | arg7.method23585(-1891973119);
		@Pc(35) Class240 local35 = aClass240_92;
		@Pc(44) Class109 local44;
		synchronized (aClass240_92) {
			local44 = (Class109) aClass240_92.method25829(this.aLong300 * 3247757972139510557L);
		}
		if (local44 == null || arg0.method20759(local44.method6875(), local32) != 0) {
			if (local44 != null) {
				local32 = arg0.method20599(local32, local44.method6875());
			}
			@Pc(72) boolean local72 = false;
			@Pc(84) int local84;
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray510.length; local74++) {
				local84 = this.anIntArray510[local74];
				@Pc(86) Class48 local86 = null;
				if ((local84 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local74] != null) {
						local86 = this.aClass48Array1[local74];
					}
					if (!((Class47) arg4.method18261(local84 & 0x3FFFFFFF, 977328260)).method940(this.aBoolean862, local86, 873246423)) {
						local72 = true;
					}
				} else if ((local84 & Integer.MIN_VALUE) != 0 && !((Class369) arg2.method18261(local84 & 0x3FFFFFFF, -2060602475)).method27985(-717643915)) {
					local72 = true;
				}
			}
			if (local72) {
				return null;
			}
			@Pc(148) Class231[] local148 = new Class231[this.anIntArray510.length];
			local84 = 0;
			@Pc(162) int local162;
			for (@Pc(152) int local152 = 0; local152 < this.anIntArray510.length; local152++) {
				local162 = this.anIntArray510[local152];
				@Pc(164) Class48 local164 = null;
				@Pc(195) Class231 local195;
				if ((local162 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local152] != null) {
						local164 = this.aClass48Array1[local152];
					}
					local195 = ((Class47) arg4.method18261(local162 & 0x3FFFFFFF, 1321523399)).method941(this.aBoolean862, local164, (byte) -44);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				} else if ((local162 & Integer.MIN_VALUE) != 0) {
					local195 = ((Class369) arg2.method18261(local162 & 0x3FFFFFFF, -782220012)).method27987(-265979979);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				}
			}
			@Pc(232) Class231 local232 = new Class231(local148, local84);
			@Pc(236) int local236 = local32 | 0x4000;
			local44 = arg0.method20597(local232, local236, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(253) int local253;
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class618.aShortArrayArray6[local162].length; local253++) {
					if (this.anIntArray511[local162] < Class111.aShortArrayArrayArray3[local162][local253].length) {
						local44.method7017(Class618.aShortArrayArray6[local162][local253], Class111.aShortArrayArrayArray3[local162][local253][this.anIntArray511[local162]]);
					}
				}
			}
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class138_Sub3.aShortArrayArray4[local162].length; local253++) {
					if (this.anIntArray512[local162] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253].length) {
						local44.method6913(Class138_Sub3.aShortArrayArray4[local162][local253], Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253][this.anIntArray512[local162]]);
					}
				}
			}
			local44.method6874(local32);
			@Pc(342) Class240 local342 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local44, this.aLong300 * 3247757972139510557L);
			}
		}
		if (arg7 == null) {
			return local44;
		} else {
			@Pc(369) Class109 local369 = local44.method6938((byte) 4, local32, true);
			arg7.method23587(local369, 0, 1121616331);
			return local369;
		}
	}

	@OriginalMember(owner = "client!xg", name = "j", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aod;Lclient!aon;Lclient!em;Lclient!ep;Lclient!aaq;)Lclient!do;", line = 372)
	public Class109 method32777(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub3 arg3, @OriginalArg(4) Class32_Sub12 arg4, @OriginalArg(5) Interface21 arg5, @OriginalArg(6) Interface23 arg6, @OriginalArg(7) Class19 arg7) {
		if (this.anInt5817 * 1405397749 != -1) {
			return ((Class336) arg3.method18261(this.anInt5817 * 1405397749, -106965983)).method27426(arg0, arg1, arg5, arg6, arg7, null, (short) -13900);
		}
		@Pc(32) int local32 = arg7 == null ? arg1 : arg1 | arg7.method23585(-1985328760);
		@Pc(35) Class240 local35 = aClass240_92;
		@Pc(44) Class109 local44;
		synchronized (aClass240_92) {
			local44 = (Class109) aClass240_92.method25829(this.aLong300 * 3247757972139510557L);
		}
		if (local44 == null || arg0.method20759(local44.method6875(), local32) != 0) {
			if (local44 != null) {
				local32 = arg0.method20599(local32, local44.method6875());
			}
			@Pc(72) boolean local72 = false;
			@Pc(84) int local84;
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray510.length; local74++) {
				local84 = this.anIntArray510[local74];
				@Pc(86) Class48 local86 = null;
				if ((local84 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local74] != null) {
						local86 = this.aClass48Array1[local74];
					}
					if (!((Class47) arg4.method18261(local84 & 0x3FFFFFFF, -278648908)).method940(this.aBoolean862, local86, 1464972472)) {
						local72 = true;
					}
				} else if ((local84 & Integer.MIN_VALUE) != 0 && !((Class369) arg2.method18261(local84 & 0x3FFFFFFF, 1966297002)).method27985(-717643915)) {
					local72 = true;
				}
			}
			if (local72) {
				return null;
			}
			@Pc(148) Class231[] local148 = new Class231[this.anIntArray510.length];
			local84 = 0;
			@Pc(162) int local162;
			for (@Pc(152) int local152 = 0; local152 < this.anIntArray510.length; local152++) {
				local162 = this.anIntArray510[local152];
				@Pc(164) Class48 local164 = null;
				@Pc(195) Class231 local195;
				if ((local162 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local152] != null) {
						local164 = this.aClass48Array1[local152];
					}
					local195 = ((Class47) arg4.method18261(local162 & 0x3FFFFFFF, -1721940041)).method941(this.aBoolean862, local164, (byte) -54);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				} else if ((local162 & Integer.MIN_VALUE) != 0) {
					local195 = ((Class369) arg2.method18261(local162 & 0x3FFFFFFF, -1927994518)).method27987(295356555);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				}
			}
			@Pc(232) Class231 local232 = new Class231(local148, local84);
			@Pc(236) int local236 = local32 | 0x4000;
			local44 = arg0.method20597(local232, local236, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(253) int local253;
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class618.aShortArrayArray6[local162].length; local253++) {
					if (this.anIntArray511[local162] < Class111.aShortArrayArrayArray3[local162][local253].length) {
						local44.method7017(Class618.aShortArrayArray6[local162][local253], Class111.aShortArrayArrayArray3[local162][local253][this.anIntArray511[local162]]);
					}
				}
			}
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class138_Sub3.aShortArrayArray4[local162].length; local253++) {
					if (this.anIntArray512[local162] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253].length) {
						local44.method6913(Class138_Sub3.aShortArrayArray4[local162][local253], Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253][this.anIntArray512[local162]]);
					}
				}
			}
			local44.method6874(local32);
			@Pc(342) Class240 local342 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local44, this.aLong300 * 3247757972139510557L);
			}
		}
		if (arg7 == null) {
			return local44;
		} else {
			@Pc(369) Class109 local369 = local44.method6938((byte) 4, local32, true);
			arg7.method23587(local369, 0, -846905758);
			return local369;
		}
	}

	@OriginalMember(owner = "client!xg", name = "t", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aod;Lclient!aon;Lclient!em;Lclient!ep;Lclient!aaq;)Lclient!do;", line = 372)
	public Class109 method32778(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub3 arg3, @OriginalArg(4) Class32_Sub12 arg4, @OriginalArg(5) Interface21 arg5, @OriginalArg(6) Interface23 arg6, @OriginalArg(7) Class19 arg7) {
		if (this.anInt5817 * 1405397749 != -1) {
			return ((Class336) arg3.method18261(this.anInt5817 * 1405397749, -679009246)).method27426(arg0, arg1, arg5, arg6, arg7, null, (short) -17607);
		}
		@Pc(32) int local32 = arg7 == null ? arg1 : arg1 | arg7.method23585(-1968224571);
		@Pc(35) Class240 local35 = aClass240_92;
		@Pc(44) Class109 local44;
		synchronized (aClass240_92) {
			local44 = (Class109) aClass240_92.method25829(this.aLong300 * 3247757972139510557L);
		}
		if (local44 == null || arg0.method20759(local44.method6875(), local32) != 0) {
			if (local44 != null) {
				local32 = arg0.method20599(local32, local44.method6875());
			}
			@Pc(72) boolean local72 = false;
			@Pc(84) int local84;
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray510.length; local74++) {
				local84 = this.anIntArray510[local74];
				@Pc(86) Class48 local86 = null;
				if ((local84 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local74] != null) {
						local86 = this.aClass48Array1[local74];
					}
					if (!((Class47) arg4.method18261(local84 & 0x3FFFFFFF, 1479782268)).method940(this.aBoolean862, local86, 278777939)) {
						local72 = true;
					}
				} else if ((local84 & Integer.MIN_VALUE) != 0 && !((Class369) arg2.method18261(local84 & 0x3FFFFFFF, 1926117039)).method27985(-717643915)) {
					local72 = true;
				}
			}
			if (local72) {
				return null;
			}
			@Pc(148) Class231[] local148 = new Class231[this.anIntArray510.length];
			local84 = 0;
			@Pc(162) int local162;
			for (@Pc(152) int local152 = 0; local152 < this.anIntArray510.length; local152++) {
				local162 = this.anIntArray510[local152];
				@Pc(164) Class48 local164 = null;
				@Pc(195) Class231 local195;
				if ((local162 & 0x40000000) != 0) {
					if (this.aClass48Array1 != null && this.aClass48Array1[local152] != null) {
						local164 = this.aClass48Array1[local152];
					}
					local195 = ((Class47) arg4.method18261(local162 & 0x3FFFFFFF, -1692131171)).method941(this.aBoolean862, local164, (byte) -41);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				} else if ((local162 & Integer.MIN_VALUE) != 0) {
					local195 = ((Class369) arg2.method18261(local162 & 0x3FFFFFFF, -504942304)).method27987(4397118);
					if (local195 != null) {
						local148[local84++] = local195;
					}
				}
			}
			@Pc(232) Class231 local232 = new Class231(local148, local84);
			@Pc(236) int local236 = local32 | 0x4000;
			local44 = arg0.method20597(local232, local236, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(253) int local253;
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class618.aShortArrayArray6[local162].length; local253++) {
					if (this.anIntArray511[local162] < Class111.aShortArrayArrayArray3[local162][local253].length) {
						local44.method7017(Class618.aShortArrayArray6[local162][local253], Class111.aShortArrayArrayArray3[local162][local253][this.anIntArray511[local162]]);
					}
				}
			}
			for (local162 = 0; local162 < 10; local162++) {
				for (local253 = 0; local253 < Class138_Sub3.aShortArrayArray4[local162].length; local253++) {
					if (this.anIntArray512[local162] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253].length) {
						local44.method6913(Class138_Sub3.aShortArrayArray4[local162][local253], Class79_Sub1_Sub2.aShortArrayArrayArray1[local162][local253][this.anIntArray512[local162]]);
					}
				}
			}
			local44.method6874(local32);
			@Pc(342) Class240 local342 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local44, this.aLong300 * 3247757972139510557L);
			}
		}
		if (arg7 == null) {
			return local44;
		} else {
			@Pc(369) Class109 local369 = local44.method6938((byte) 4, local32, true);
			arg7.method23587(local369, 0, 910236402);
			return local369;
		}
	}

	@OriginalMember(owner = "client!xg", name = "ae", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aos;Lclient!aaq;III)Lclient!do;", line = 436)
	public Class109 method32779(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub17 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method23585(-1993827731);
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class240 local26 = aClass240_92;
		@Pc(32) Class109 local32;
		synchronized (aClass240_92) {
			local32 = (Class109) aClass240_92.method25829(local23);
		}
		if (local32 == null || arg0.method20759(local32.method6875(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method20599(local10, local32.method6875());
			}
			@Pc(63) Class231[] local63 = new Class231[3];
			@Pc(65) int local65 = 0;
			if (!((Class369) arg2.method18261(arg5, -1960117957)).method27985(-717643915) || !((Class369) arg2.method18261(arg6, 1126814929)).method27985(-717643915) || !((Class369) arg2.method18261(arg7, -345367678)).method27985(-717643915)) {
				return null;
			}
			@Pc(97) Class231 local97 = ((Class369) arg2.method18261(arg5, 651670343)).method27987(600863545);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg6, 1030448243)).method27987(-187612889);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg7, 1208248253)).method27987(1418256729);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = new Class231(local63, local65);
			@Pc(146) int local146 = local10 | 0x4000;
			local32 = arg0.method20597(local97, local146, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(158) int local158;
			@Pc(163) int local163;
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class618.aShortArrayArray6[local158].length; local163++) {
					if (this.anIntArray511[local158] < Class111.aShortArrayArrayArray3[local158][local163].length) {
						local32.method7017(Class618.aShortArrayArray6[local158][local163], Class111.aShortArrayArrayArray3[local158][local163][this.anIntArray511[local158]]);
					}
				}
			}
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class138_Sub3.aShortArrayArray4[local158].length; local163++) {
					if (this.anIntArray512[local158] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163].length) {
						local32.method6913(Class138_Sub3.aShortArrayArray4[local158][local163], Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163][this.anIntArray512[local158]]);
					}
				}
			}
			local32.method6874(local10);
			@Pc(252) Class240 local252 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method6938((byte) 4, local10, true);
			arg4.method23587(local32, 0, -342445943);
			return local32;
		}
	}

	@OriginalMember(owner = "client!xg", name = "p", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aos;Lclient!aaq;IIIB)Lclient!do;", line = 436)
	public Class109 method32780(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub17 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method23585(-2051545812);
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class240 local26 = aClass240_92;
		@Pc(32) Class109 local32;
		synchronized (aClass240_92) {
			local32 = (Class109) aClass240_92.method25829(local23);
		}
		if (local32 == null || arg0.method20759(local32.method6875(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method20599(local10, local32.method6875());
			}
			@Pc(63) Class231[] local63 = new Class231[3];
			@Pc(65) int local65 = 0;
			if (!((Class369) arg2.method18261(arg5, -1905770142)).method27985(-717643915) || !((Class369) arg2.method18261(arg6, -726700587)).method27985(-717643915) || !((Class369) arg2.method18261(arg7, -1248551005)).method27985(-717643915)) {
				return null;
			}
			@Pc(97) Class231 local97 = ((Class369) arg2.method18261(arg5, -452903144)).method27987(424519211);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg6, -396780475)).method27987(-501312008);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg7, 1942954545)).method27987(1350823627);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = new Class231(local63, local65);
			@Pc(146) int local146 = local10 | 0x4000;
			local32 = arg0.method20597(local97, local146, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(158) int local158;
			@Pc(163) int local163;
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class618.aShortArrayArray6[local158].length; local163++) {
					if (this.anIntArray511[local158] < Class111.aShortArrayArrayArray3[local158][local163].length) {
						local32.method7017(Class618.aShortArrayArray6[local158][local163], Class111.aShortArrayArrayArray3[local158][local163][this.anIntArray511[local158]]);
					}
				}
			}
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class138_Sub3.aShortArrayArray4[local158].length; local163++) {
					if (this.anIntArray512[local158] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163].length) {
						local32.method6913(Class138_Sub3.aShortArrayArray4[local158][local163], Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163][this.anIntArray512[local158]]);
					}
				}
			}
			local32.method6874(local10);
			@Pc(252) Class240 local252 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method6938((byte) 4, local10, true);
			arg4.method23587(local32, 0, 727523532);
			return local32;
		}
	}

	@OriginalMember(owner = "client!xg", name = "ag", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aos;Lclient!aaq;III)Lclient!do;", line = 436)
	public Class109 method32781(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub17 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method23585(-2097850990);
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class240 local26 = aClass240_92;
		@Pc(32) Class109 local32;
		synchronized (aClass240_92) {
			local32 = (Class109) aClass240_92.method25829(local23);
		}
		if (local32 == null || arg0.method20759(local32.method6875(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method20599(local10, local32.method6875());
			}
			@Pc(63) Class231[] local63 = new Class231[3];
			@Pc(65) int local65 = 0;
			if (!((Class369) arg2.method18261(arg5, -2137004052)).method27985(-717643915) || !((Class369) arg2.method18261(arg6, -702686787)).method27985(-717643915) || !((Class369) arg2.method18261(arg7, -472064577)).method27985(-717643915)) {
				return null;
			}
			@Pc(97) Class231 local97 = ((Class369) arg2.method18261(arg5, 1215043749)).method27987(2089358961);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg6, 425742272)).method27987(2081716358);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg7, -2000068547)).method27987(1300804541);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = new Class231(local63, local65);
			@Pc(146) int local146 = local10 | 0x4000;
			local32 = arg0.method20597(local97, local146, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(158) int local158;
			@Pc(163) int local163;
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class618.aShortArrayArray6[local158].length; local163++) {
					if (this.anIntArray511[local158] < Class111.aShortArrayArrayArray3[local158][local163].length) {
						local32.method7017(Class618.aShortArrayArray6[local158][local163], Class111.aShortArrayArrayArray3[local158][local163][this.anIntArray511[local158]]);
					}
				}
			}
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class138_Sub3.aShortArrayArray4[local158].length; local163++) {
					if (this.anIntArray512[local158] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163].length) {
						local32.method6913(Class138_Sub3.aShortArrayArray4[local158][local163], Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163][this.anIntArray512[local158]]);
					}
				}
			}
			local32.method6874(local10);
			@Pc(252) Class240 local252 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method6938((byte) 4, local10, true);
			arg4.method23587(local32, 0, 2032397126);
			return local32;
		}
	}

	@OriginalMember(owner = "client!xg", name = "ah", descriptor = "(Lclient!dh;ILclient!aov;Lclient!aos;Lclient!aaq;III)Lclient!do;", line = 436)
	public Class109 method32782(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub19 arg2, @OriginalArg(3) Class32_Sub17 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method23585(-2064342969);
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class240 local26 = aClass240_92;
		@Pc(32) Class109 local32;
		synchronized (aClass240_92) {
			local32 = (Class109) aClass240_92.method25829(local23);
		}
		if (local32 == null || arg0.method20759(local32.method6875(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method20599(local10, local32.method6875());
			}
			@Pc(63) Class231[] local63 = new Class231[3];
			@Pc(65) int local65 = 0;
			if (!((Class369) arg2.method18261(arg5, 41457871)).method27985(-717643915) || !((Class369) arg2.method18261(arg6, -867445175)).method27985(-717643915) || !((Class369) arg2.method18261(arg7, -2071280398)).method27985(-717643915)) {
				return null;
			}
			@Pc(97) Class231 local97 = ((Class369) arg2.method18261(arg5, 2023985425)).method27987(1011800592);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg6, -18554275)).method27987(279869800);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = ((Class369) arg2.method18261(arg7, 1418229496)).method27987(-563476725);
			if (local97 != null) {
				local63[local65++] = local97;
			}
			local97 = new Class231(local63, local65);
			@Pc(146) int local146 = local10 | 0x4000;
			local32 = arg0.method20597(local97, local146, Class447.anInt4954 * 1809675335, 64, 768);
			@Pc(158) int local158;
			@Pc(163) int local163;
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class618.aShortArrayArray6[local158].length; local163++) {
					if (this.anIntArray511[local158] < Class111.aShortArrayArrayArray3[local158][local163].length) {
						local32.method7017(Class618.aShortArrayArray6[local158][local163], Class111.aShortArrayArrayArray3[local158][local163][this.anIntArray511[local158]]);
					}
				}
			}
			for (local158 = 0; local158 < 10; local158++) {
				for (local163 = 0; local163 < Class138_Sub3.aShortArrayArray4[local158].length; local163++) {
					if (this.anIntArray512[local158] < Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163].length) {
						local32.method6913(Class138_Sub3.aShortArrayArray4[local158][local163], Class79_Sub1_Sub2.aShortArrayArrayArray1[local158][local163][this.anIntArray512[local158]]);
					}
				}
			}
			local32.method6874(local10);
			@Pc(252) Class240 local252 = aClass240_92;
			synchronized (aClass240_92) {
				aClass240_92.method25838(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method6938((byte) 4, local10, true);
			arg4.method23587(local32, 0, 315079914);
			return local32;
		}
	}

	@OriginalMember(owner = "client!xg", name = "al", descriptor = "(I)V", line = 487)
	public static void method32783(@OriginalArg(0) int arg0) {
		Class447.anInt4954 = arg0 * 209843575;
		@Pc(6) Class240 local6 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -114);
		}
		local6 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -105);
		}
	}

	@OriginalMember(owner = "client!xg", name = "ac", descriptor = "(I)V", line = 487)
	public static void method32784(@OriginalArg(0) int arg0) {
		Class447.anInt4954 = arg0 * 209843575;
		@Pc(6) Class240 local6 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -73);
		}
		local6 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -37);
		}
	}

	@OriginalMember(owner = "client!xg", name = "ai", descriptor = "(I)V", line = 487)
	public static void method32785(@OriginalArg(0) int arg0) {
		Class447.anInt4954 = arg0 * 209843575;
		@Pc(6) Class240 local6 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -74);
		}
		local6 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -101);
		}
	}

	@OriginalMember(owner = "client!xg", name = "aw", descriptor = "(I)V", line = 487)
	public static void method32786(@OriginalArg(0) int arg0) {
		Class447.anInt4954 = arg0 * 209843575;
		@Pc(6) Class240 local6 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -126);
		}
		local6 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -31);
		}
	}

	@OriginalMember(owner = "client!xg", name = "at", descriptor = "()V", line = 497)
	public static void method32787() {
		@Pc(2) Class240 local2 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -29);
		}
		local2 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -6);
		}
	}

	@OriginalMember(owner = "client!xg", name = "as", descriptor = "()V", line = 497)
	public static void method32788() {
		@Pc(2) Class240 local2 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25847((byte) -59);
		}
		local2 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25847((byte) -86);
		}
	}

	@OriginalMember(owner = "client!xg", name = "ad", descriptor = "()V", line = 515)
	public static void method32789() {
		@Pc(2) Class240 local2 = aClass240_91;
		synchronized (aClass240_91) {
			aClass240_91.method25860(1161602830);
		}
		local2 = aClass240_92;
		synchronized (aClass240_92) {
			aClass240_92.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!xg", name = "mz", descriptor = "(Lclient!yf;B)V", line = 7265)
	static final void method32790(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class694.method36627(local11, local14, arg0, 1157242405);
	}

	@OriginalMember(owner = "client!xg", name = "bek", descriptor = "(Lclient!yf;I)V", line = 15060)
	static final void method32791(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
	}
}
