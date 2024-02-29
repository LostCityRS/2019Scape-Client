package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ash")
public abstract class Class132_Sub1_Sub1 extends Class132_Sub1 {

	@OriginalMember(owner = "client!ash", name = "j", descriptor = "I")
	int anInt3291;

	@OriginalMember(owner = "client!ash", name = "a", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!ash", name = "h", descriptor = "S")
	public short aShort128;

	@OriginalMember(owner = "client!ash", name = "i", descriptor = "B")
	byte aByte101;

	@OriginalMember(owner = "client!ash", name = "g", descriptor = "Z")
	public boolean aBoolean562;

	@OriginalMember(owner = "client!ash", name = "x", descriptor = "S")
	public short aShort129;

	@OriginalMember(owner = "client!ash", name = "b", descriptor = "S")
	public short aShort130;

	@OriginalMember(owner = "client!ash", name = "t", descriptor = "[Lclient!akf;")
	Class93_Sub16[] aClass93_Sub16Array22;

	@OriginalMember(owner = "client!ash", name = "<init>", descriptor = "(Lclient!tx;IIIIIIIIIZB)V", line = 17)
	Class132_Sub1_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11) {
		this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, (Class458) null);
	}

	@OriginalMember(owner = "client!ash", name = "<init>", descriptor = "(Lclient!tx;IIIIIIIIIZBLclient!oe;)V", line = 21)
	Class132_Sub1_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) Class458 arg12) {
		super(arg0, arg12);
		this.anInt3291 = 0;
		this.aClass93_Sub16Array22 = new Class93_Sub16[4];
		this.aByte100 = (byte) arg1;
		this.aByte99 = (byte) arg2;
		if (arg12 != null) {
			this.method24231(arg12);
		}
		this.method24242((float) arg3, (float) arg4, (float) arg5);
		this.aShort129 = (short) arg6;
		this.aShort130 = (short) arg7;
		this.aShort128 = (short) arg8;
		this.aShort127 = (short) arg9;
		this.aBoolean562 = arg10;
		this.aByte101 = arg11;
		for (@Pc(55) int local55 = 0; local55 < 4; local55++) {
			this.aClass93_Sub16Array22[local55] = null;
		}
	}

	@OriginalMember(owner = "client!ash", name = "dh", descriptor = "()V", line = 37)
	void method24317() {
	}

	@OriginalMember(owner = "client!ash", name = "dx", descriptor = "()V", line = 37)
	void method24318() {
	}

	@OriginalMember(owner = "client!ash", name = "dp", descriptor = "()V", line = 37)
	void method24319() {
	}

	@OriginalMember(owner = "client!ash", name = "dy", descriptor = "()V", line = 37)
	void method24320() {
	}

	@OriginalMember(owner = "client!ash", name = "db", descriptor = "()V", line = 37)
	void method24321() {
	}

	@OriginalMember(owner = "client!ash", name = "bv", descriptor = "(I)V", line = 37)
	void method24322(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ash", name = "gy", descriptor = "([Lclient!akf;S)I", line = 40)
	@Override
	int method24316(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		@Pc(10) int local10;
		if (this.aBoolean560) {
			this.anInt3291 = 0;
			local10 = Math.max(0, this.aShort129);
			@Pc(23) int local23 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100].length - 1, this.aShort130);
			@Pc(28) int local28 = Math.max(0, this.aShort128);
			@Pc(43) int local43 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10].length - 1, this.aShort127);
			@Pc(45) int local45 = local28;
			@Pc(78) int local78;
			@Pc(90) int local90;
			label129: while (local10 <= local23) {
				label126: for (local28 = local45; local28 <= local43; local28++) {
					@Pc(64) long local64 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10][local28];
					@Pc(66) long local66 = 0L;
					while (true) {
						label121: while (true) {
							if (local66 > 48L) {
								continue label126;
							}
							local78 = (int) (local64 >>> (int) local66 & 0xFFFFL);
							if (local78 <= 0) {
								continue label126;
							}
							@Pc(88) Class597 local88 = this.aClass585_23.aClass597Array1[local78 - 1];
							for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
								if (this.aClass93_Sub16Array22[local90] == local88.aClass93_Sub16_3) {
									local66 += 16L;
									continue label121;
								}
							}
							this.aClass93_Sub16Array22[(this.anInt3291 += 925924921) * -1029173239 - 1] = local88.aClass93_Sub16_3;
							if (this.anInt3291 * -1029173239 == 4) {
								break label129;
							}
							local66 += 16L;
						}
					}
				}
				local10++;
			}
			for (@Pc(147) int local147 = this.anInt3291 * -1029173239; local147 < 4; local147++) {
				this.aClass93_Sub16Array22[local147] = null;
			}
			if (this.aByte101 != 0) {
				local78 = this.aShort129 - this.aClass585_23.anInt5440 * 1602382659;
				@Pc(179) int local179 = this.aShort128 - this.aClass585_23.anInt5459 * 1547517939;
				@Pc(194) int local194;
				@Pc(202) short local202;
				@Pc(189) short local189;
				@Pc(199) int local199;
				if (this.aByte101 == 1) {
					if (local179 > local78) {
						local189 = this.aShort129;
						local194 = this.aShort128 - 1;
						local199 = this.aShort129 + 1;
						local202 = this.aShort128;
					} else {
						local189 = this.aShort129;
						local194 = this.aShort128 + 1;
						local199 = this.aShort129 - 1;
						local202 = this.aShort128;
					}
				} else if (local179 > -local78) {
					local189 = this.aShort129;
					local194 = this.aShort128 - 1;
					local199 = this.aShort129 - 1;
					local202 = this.aShort128;
				} else {
					local189 = this.aShort129;
					local194 = this.aShort128 + 1;
					local199 = this.aShort129 + 1;
					local202 = this.aShort128;
				}
				label92: for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
					@Pc(276) long local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local189][local194];
					@Pc(291) Class597 local291;
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (this.aClass93_Sub16Array22[local90] == local291.aClass93_Sub16_3) {
							continue label92;
						}
					}
					local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local199][local202];
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (local291.aClass93_Sub16_3 == this.aClass93_Sub16Array22[local90]) {
							continue label92;
						}
					}
					for (@Pc(345) int local345 = local90; local345 < this.anInt3291 * -1029173239 - 1; local345++) {
						this.aClass93_Sub16Array22[local345] = this.aClass93_Sub16Array22[local345 + 1];
					}
					this.anInt3291 -= 925924921;
				}
			}
			this.aBoolean560 = false;
		}
		for (local10 = 0; local10 < this.anInt3291 * -1029173239; local10++) {
			arg0[local10] = this.aClass93_Sub16Array22[local10];
		}
		return this.anInt3291 * -1029173239;
	}

	@OriginalMember(owner = "client!ash", name = "gm", descriptor = "([Lclient!akf;)I", line = 40)
	@Override
	int method24313(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean560) {
			this.anInt3291 = 0;
			local10 = Math.max(0, this.aShort129);
			@Pc(23) int local23 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100].length - 1, this.aShort130);
			@Pc(28) int local28 = Math.max(0, this.aShort128);
			@Pc(43) int local43 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10].length - 1, this.aShort127);
			@Pc(45) int local45 = local28;
			@Pc(78) int local78;
			@Pc(90) int local90;
			label129: while (local10 <= local23) {
				label126: for (local28 = local45; local28 <= local43; local28++) {
					@Pc(64) long local64 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10][local28];
					@Pc(66) long local66 = 0L;
					while (true) {
						label121: while (true) {
							if (local66 > 48L) {
								continue label126;
							}
							local78 = (int) (local64 >>> (int) local66 & 0xFFFFL);
							if (local78 <= 0) {
								continue label126;
							}
							@Pc(88) Class597 local88 = this.aClass585_23.aClass597Array1[local78 - 1];
							for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
								if (this.aClass93_Sub16Array22[local90] == local88.aClass93_Sub16_3) {
									local66 += 16L;
									continue label121;
								}
							}
							this.aClass93_Sub16Array22[(this.anInt3291 += 925924921) * -1029173239 - 1] = local88.aClass93_Sub16_3;
							if (this.anInt3291 * -1029173239 == 4) {
								break label129;
							}
							local66 += 16L;
						}
					}
				}
				local10++;
			}
			for (@Pc(147) int local147 = this.anInt3291 * -1029173239; local147 < 4; local147++) {
				this.aClass93_Sub16Array22[local147] = null;
			}
			if (this.aByte101 != 0) {
				local78 = this.aShort129 - this.aClass585_23.anInt5440 * 1602382659;
				@Pc(179) int local179 = this.aShort128 - this.aClass585_23.anInt5459 * 1547517939;
				@Pc(194) int local194;
				@Pc(202) short local202;
				@Pc(189) short local189;
				@Pc(199) int local199;
				if (this.aByte101 == 1) {
					if (local179 > local78) {
						local189 = this.aShort129;
						local194 = this.aShort128 - 1;
						local199 = this.aShort129 + 1;
						local202 = this.aShort128;
					} else {
						local189 = this.aShort129;
						local194 = this.aShort128 + 1;
						local199 = this.aShort129 - 1;
						local202 = this.aShort128;
					}
				} else if (local179 > -local78) {
					local189 = this.aShort129;
					local194 = this.aShort128 - 1;
					local199 = this.aShort129 - 1;
					local202 = this.aShort128;
				} else {
					local189 = this.aShort129;
					local194 = this.aShort128 + 1;
					local199 = this.aShort129 + 1;
					local202 = this.aShort128;
				}
				label92: for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
					@Pc(276) long local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local189][local194];
					@Pc(291) Class597 local291;
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (this.aClass93_Sub16Array22[local90] == local291.aClass93_Sub16_3) {
							continue label92;
						}
					}
					local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local199][local202];
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (local291.aClass93_Sub16_3 == this.aClass93_Sub16Array22[local90]) {
							continue label92;
						}
					}
					for (@Pc(345) int local345 = local90; local345 < this.anInt3291 * -1029173239 - 1; local345++) {
						this.aClass93_Sub16Array22[local345] = this.aClass93_Sub16Array22[local345 + 1];
					}
					this.anInt3291 -= 925924921;
				}
			}
			this.aBoolean560 = false;
		}
		for (local10 = 0; local10 < this.anInt3291 * -1029173239; local10++) {
			arg0[local10] = this.aClass93_Sub16Array22[local10];
		}
		return this.anInt3291 * -1029173239;
	}

	@OriginalMember(owner = "client!ash", name = "gv", descriptor = "([Lclient!akf;)I", line = 40)
	@Override
	int method24287(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean560) {
			this.anInt3291 = 0;
			local10 = Math.max(0, this.aShort129);
			@Pc(23) int local23 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100].length - 1, this.aShort130);
			@Pc(28) int local28 = Math.max(0, this.aShort128);
			@Pc(43) int local43 = Math.min(this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10].length - 1, this.aShort127);
			@Pc(45) int local45 = local28;
			@Pc(78) int local78;
			@Pc(90) int local90;
			label129: while (local10 <= local23) {
				label126: for (local28 = local45; local28 <= local43; local28++) {
					@Pc(64) long local64 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local10][local28];
					@Pc(66) long local66 = 0L;
					while (true) {
						label121: while (true) {
							if (local66 > 48L) {
								continue label126;
							}
							local78 = (int) (local64 >>> (int) local66 & 0xFFFFL);
							if (local78 <= 0) {
								continue label126;
							}
							@Pc(88) Class597 local88 = this.aClass585_23.aClass597Array1[local78 - 1];
							for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
								if (this.aClass93_Sub16Array22[local90] == local88.aClass93_Sub16_3) {
									local66 += 16L;
									continue label121;
								}
							}
							this.aClass93_Sub16Array22[(this.anInt3291 += 925924921) * -1029173239 - 1] = local88.aClass93_Sub16_3;
							if (this.anInt3291 * -1029173239 == 4) {
								break label129;
							}
							local66 += 16L;
						}
					}
				}
				local10++;
			}
			for (@Pc(147) int local147 = this.anInt3291 * -1029173239; local147 < 4; local147++) {
				this.aClass93_Sub16Array22[local147] = null;
			}
			if (this.aByte101 != 0) {
				local78 = this.aShort129 - this.aClass585_23.anInt5440 * 1602382659;
				@Pc(179) int local179 = this.aShort128 - this.aClass585_23.anInt5459 * 1547517939;
				@Pc(194) int local194;
				@Pc(202) short local202;
				@Pc(189) short local189;
				@Pc(199) int local199;
				if (this.aByte101 == 1) {
					if (local179 > local78) {
						local189 = this.aShort129;
						local194 = this.aShort128 - 1;
						local199 = this.aShort129 + 1;
						local202 = this.aShort128;
					} else {
						local189 = this.aShort129;
						local194 = this.aShort128 + 1;
						local199 = this.aShort129 - 1;
						local202 = this.aShort128;
					}
				} else if (local179 > -local78) {
					local189 = this.aShort129;
					local194 = this.aShort128 - 1;
					local199 = this.aShort129 - 1;
					local202 = this.aShort128;
				} else {
					local189 = this.aShort129;
					local194 = this.aShort128 + 1;
					local199 = this.aShort129 + 1;
					local202 = this.aShort128;
				}
				label92: for (local90 = 0; local90 < this.anInt3291 * -1029173239; local90++) {
					@Pc(276) long local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local189][local194];
					@Pc(291) Class597 local291;
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (this.aClass93_Sub16Array22[local90] == local291.aClass93_Sub16_3) {
							continue label92;
						}
					}
					local276 = this.aClass585_23.aLongArrayArrayArray1[this.aByte100][local199][local202];
					while (local276 != 0L) {
						local291 = this.aClass585_23.aClass597Array1[(int) ((local276 & 0xFFFFL) - 1L)];
						local276 >>>= 0x10;
						if (local291.aClass93_Sub16_3 == this.aClass93_Sub16Array22[local90]) {
							continue label92;
						}
					}
					for (@Pc(345) int local345 = local90; local345 < this.anInt3291 * -1029173239 - 1; local345++) {
						this.aClass93_Sub16Array22[local345] = this.aClass93_Sub16Array22[local345 + 1];
					}
					this.anInt3291 -= 925924921;
				}
			}
			this.aBoolean560 = false;
		}
		for (local10 = 0; local10 < this.anInt3291 * -1029173239; local10++) {
			arg0[local10] = this.aClass93_Sub16Array22[local10];
		}
		return this.anInt3291 * -1029173239;
	}

	@OriginalMember(owner = "client!ash", name = "ga", descriptor = "(Lclient!dh;S)Z", line = 131)
	@Override
	boolean method24292(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		return this.aClass585_23.aClass598_2.method31818(this.aByte99, this.aShort129, this.aShort130, this.aShort128, this.aShort127, this.method24311(arg0, (byte) -74));
	}

	@OriginalMember(owner = "client!ash", name = "gj", descriptor = "(Lclient!dh;)Z", line = 131)
	@Override
	boolean method24315(@OriginalArg(0) Class104 arg0) {
		return this.aClass585_23.aClass598_2.method31818(this.aByte99, this.aShort129, this.aShort130, this.aShort128, this.aShort127, this.method24311(arg0, (byte) -53));
	}

	@OriginalMember(owner = "client!ash", name = "gn", descriptor = "(I)Z", line = 135)
	@Override
	boolean method24295(@OriginalArg(0) int arg0) {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort130; local2++) {
			for (@Pc(9) int local9 = this.aShort128; local9 <= this.aShort127; local9++) {
				@Pc(27) int local27 = this.aClass585_23.anInt5455 * -93916925 + (local2 - this.aClass585_23.anInt5440 * 1602382659);
				if (local27 >= 0 && local27 < this.aClass585_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925;
					if (local50 >= 0 && local50 < this.aClass585_23.aBooleanArrayArray14.length && this.aClass585_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ash", name = "gw", descriptor = "()Z", line = 135)
	@Override
	boolean method24282() {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort130; local2++) {
			for (@Pc(9) int local9 = this.aShort128; local9 <= this.aShort127; local9++) {
				@Pc(27) int local27 = this.aClass585_23.anInt5455 * -93916925 + (local2 - this.aClass585_23.anInt5440 * 1602382659);
				if (local27 >= 0 && local27 < this.aClass585_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925;
					if (local50 >= 0 && local50 < this.aClass585_23.aBooleanArrayArray14.length && this.aClass585_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
