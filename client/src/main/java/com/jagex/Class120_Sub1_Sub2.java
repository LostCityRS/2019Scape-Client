package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asi")
public abstract class Class120_Sub1_Sub2 extends Class120_Sub1 {

	@OriginalMember(owner = "client!asi", name = "n", descriptor = "I")
	public static final int anInt1501 = 32;

	@OriginalMember(owner = "client!asi", name = "d", descriptor = "I")
	public static final int anInt1502 = 1;

	@OriginalMember(owner = "client!asi", name = "p", descriptor = "I")
	public static final int anInt1503 = 4;

	@OriginalMember(owner = "client!asi", name = "y", descriptor = "I")
	public static final int anInt1504 = 16;

	@OriginalMember(owner = "client!asi", name = "v", descriptor = "I")
	public static final int anInt1505 = 8;

	@OriginalMember(owner = "client!asi", name = "c", descriptor = "I")
	public static final int anInt1506 = 64;

	@OriginalMember(owner = "client!asi", name = "b", descriptor = "I")
	public static final int anInt1507 = 128;

	@OriginalMember(owner = "client!asi", name = "z", descriptor = "I")
	public static final int anInt1509 = 2;

	@OriginalMember(owner = "client!asi", name = "ax", descriptor = "[I")
	static final int[] anIntArray182 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!asi", name = "ai", descriptor = "I")
	int anInt1508 = 0;

	@OriginalMember(owner = "client!asi", name = "aq", descriptor = "[Lclient!akb;")
	Class80_Sub12[] aClass80_Sub12Array14 = new Class80_Sub12[4];

	@OriginalMember(owner = "client!asi", name = "ay", descriptor = "S")
	public short aShort50;

	@OriginalMember(owner = "client!asi", name = "<init>", descriptor = "(Lclient!te;IIIIIILclient!oc;)V")
	Class120_Sub1_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class457 arg7) {
		super(arg0, arg7);
		this.aByte99 = (byte) arg4;
		this.aByte100 = (byte) arg5;
		this.aShort50 = (short) arg6;
		if (arg7 != null) {
			this.method24527(arg7);
		}
		this.method24530((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass80_Sub12Array14[local38] = null;
		}
	}

	@OriginalMember(owner = "client!asi", name = "hp", descriptor = "(Lclient!di;)Z")
	@Override
	final boolean method24617(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32093(this, this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}

	@OriginalMember(owner = "client!asi", name = "gc", descriptor = "(Lclient!di;I)Z")
	@Override
	final boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aClass600_1.method32093(this, this.aByte100, (int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119, (int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119);
	}

	@OriginalMember(owner = "client!asi", name = "gj", descriptor = "(S)Z")
	@Override
	final boolean method24576(@OriginalArg(0) short arg0) {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asi", name = "gs", descriptor = "([Lclient!akb;)I")
	@Override
	final int method24623(@OriginalArg(0) Class80_Sub12[] arg0) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			@Pc(16) int local16 = (int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119;
			@Pc(26) int local26 = (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119;
			@Pc(28) int local28 = 0;
			if (this.aClass570_23.anInt5241 * 1611671173 == local16) {
				local28++;
			} else if (this.aClass570_23.anInt5241 * 1611671173 < local16) {
				local28 += 2;
			}
			if (this.aClass570_23.anInt5253 * 1105662773 == local26) {
				local28 += 3;
			} else if (this.aClass570_23.anInt5253 * 1105662773 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray182[local28];
			if ((this.aShort50 & local66) == 0) {
				if (this.aShort50 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort50 == 4 && local16 <= this.aClass570_23.anInt5245 * 1487025827) {
					local16++;
				} else if (this.aShort50 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort50 == 2 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local26++;
				} else if (this.aShort50 == 16 && local16 > 0 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local16--;
					local26++;
				} else if (this.aShort50 == 32 && local16 <= this.aClass570_23.anInt5245 * 1487025827 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local16++;
					local26++;
				} else if (this.aShort50 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort50 == 64 && local16 <= this.aClass570_23.anInt5245 * 1487025827 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1508 = this.method24579(local16, local26, this.aClass80_Sub12Array14, (byte) 9) * -1935321835;
			this.aBoolean672 = false;
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt1508 * 343036477; local199++) {
			arg0[local199] = this.aClass80_Sub12Array14[local199];
		}
		return this.anInt1508 * 343036477;
	}

	@OriginalMember(owner = "client!asi", name = "hf", descriptor = "()Z")
	@Override
	final boolean method24618() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asi", name = "hn", descriptor = "()Z")
	@Override
	final boolean method24586() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asi", name = "ha", descriptor = "()Z")
	@Override
	final boolean method24620() {
		@Pc(3) Class463 local3 = this.method24552().aClass463_61;
		return this.aClass570_23.aBooleanArrayArray20[this.aClass570_23.anInt5244 * 1989483179 + (((int) local3.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5241 * 1611671173)][((int) local3.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119) - this.aClass570_23.anInt5253 * 1105662773 + this.aClass570_23.anInt5244 * 1989483179];
	}

	@OriginalMember(owner = "client!asi", name = "gd", descriptor = "([Lclient!akb;I)I")
	@Override
	final int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean672) {
			@Pc(6) Class463 local6 = this.method24552().aClass463_61;
			@Pc(16) int local16 = (int) local6.aFloat297 >> this.aClass570_23.anInt5258 * 1479624119;
			@Pc(26) int local26 = (int) local6.aFloat296 >> this.aClass570_23.anInt5258 * 1479624119;
			@Pc(28) int local28 = 0;
			if (this.aClass570_23.anInt5241 * 1611671173 == local16) {
				local28++;
			} else if (this.aClass570_23.anInt5241 * 1611671173 < local16) {
				local28 += 2;
			}
			if (this.aClass570_23.anInt5253 * 1105662773 == local26) {
				local28 += 3;
			} else if (this.aClass570_23.anInt5253 * 1105662773 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray182[local28];
			if ((this.aShort50 & local66) == 0) {
				if (this.aShort50 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort50 == 4 && local16 <= this.aClass570_23.anInt5245 * 1487025827) {
					local16++;
				} else if (this.aShort50 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort50 == 2 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local26++;
				} else if (this.aShort50 == 16 && local16 > 0 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local16--;
					local26++;
				} else if (this.aShort50 == 32 && local16 <= this.aClass570_23.anInt5245 * 1487025827 && local26 <= this.aClass570_23.anInt5246 * -1561777241) {
					local16++;
					local26++;
				} else if (this.aShort50 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort50 == 64 && local16 <= this.aClass570_23.anInt5245 * 1487025827 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1508 = this.method24579(local16, local26, this.aClass80_Sub12Array14, (byte) -61) * -1935321835;
			this.aBoolean672 = false;
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt1508 * 343036477; local199++) {
			arg0[local199] = this.aClass80_Sub12Array14[local199];
		}
		return this.anInt1508 * 343036477;
	}
}
